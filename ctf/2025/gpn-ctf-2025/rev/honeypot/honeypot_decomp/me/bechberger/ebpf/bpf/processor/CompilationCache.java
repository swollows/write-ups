/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.bpf.processor;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.LinkOption;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Base64;
import java.util.List;
import java.util.stream.Stream;
import org.jetbrains.annotations.Nullable;

public class CompilationCache {
    private static final String CACHE_FOLDER_NAME = ".bpf.compile.cache";
    private static final int MAX_DAYS_TO_KEEP_CACHE = 7;
    private static final int MAX_CACHE_SIZE_IN_BYTES = 10000000;
    private static boolean cleaned = false;
    private final Path cacheFolder;

    public CompilationCache(Path baseFolder) {
        this.cacheFolder = baseFolder.resolve(CACHE_FOLDER_NAME);
        if (!this.cacheFolder.toFile().exists()) {
            try {
                Files.createDirectories(this.cacheFolder, new FileAttribute[0]);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        if (!cleaned) {
            cleaned = true;
            this.cleanOldFiles();
        }
    }

    public byte @Nullable [] getCached(String cProgram) {
        Path file2 = this.fileName(cProgram);
        if (!file2.toFile().exists()) {
            return null;
        }
        try {
            return Files.readAllBytes(file2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void cleanOldFiles() {
        try (Stream<Path> list = Files.list(this.cacheFolder);){
            list.forEach(p -> {
                try {
                    if (Files.getLastModifiedTime(p, new LinkOption[0]).toMillis() < System.currentTimeMillis() - 604800000L) {
                        Files.delete(p);
                    }
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            });
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Path fileName(String cProgram) {
        MessageDigest digest = null;
        try {
            digest = MessageDigest.getInstance("SHA-512");
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
        byte[] hash2 = digest.digest(cProgram.getBytes());
        return this.cacheFolder.resolve(Base64.getEncoder().encodeToString(hash2).replaceAll("[^A-Za-z0-9_]", "") + ".o");
    }

    public void cache(String cProgram, byte[] objectFile) {
        Path file2 = this.fileName(cProgram);
        this.removeFilesTill(objectFile.length);
        try {
            Files.createFile(file2, new FileAttribute[0]);
            Files.write(file2, objectFile, new OpenOption[0]);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void removeFilesTill(int emptySpace) {
        int currentSize = this.size();
        long toRemove = currentSize + emptySpace - 10000000;
        if (toRemove <= 0L) {
            return;
        }
        List files = this.cachedFiles().stream().sorted((p1, p2) -> {
            try {
                return Long.compare(Files.getLastModifiedTime(p1, new LinkOption[0]).toMillis(), Files.getLastModifiedTime(p2, new LinkOption[0]).toMillis());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).toList();
        try {
            for (Path file2 : files) {
                Files.delete(file2);
                if ((toRemove -= Files.size(file2)) > 0L) continue;
                return;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private int size() {
        return this.cachedFiles().stream().mapToInt(p -> {
            try {
                return (int)Files.size(p);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }).sum();
    }

    private List<Path> cachedFiles() {
        List list;
        block8: {
            Stream<Path> list2 = Files.list(this.cacheFolder);
            try {
                list = list2.toList();
                if (list2 == null) break block8;
            } catch (Throwable throwable) {
                try {
                    if (list2 != null) {
                        try {
                            list2.close();
                        } catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            list2.close();
        }
        return list;
    }

    public Path getCacheFolder() {
        return this.cacheFolder;
    }
}

