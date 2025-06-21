/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.bpf.raw;

import java.io.IOException;
import java.nio.file.FileVisitOption;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Arrays;
import java.util.Optional;
import java.util.stream.Stream;

public class LibraryLoader {
    private static Optional<Path> findLibInFolder(Path folder, int depth) {
        Optional<Path> optional;
        block8: {
            Stream<Path> stream = Files.walk(folder, depth, FileVisitOption.FOLLOW_LINKS);
            try {
                optional = stream.filter(p -> p.getFileName().toString().startsWith("libbpf.so")).findFirst();
                if (stream == null) break block8;
            } catch (Throwable throwable) {
                try {
                    if (stream != null) {
                        try {
                            stream.close();
                        } catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                } catch (IOException e) {
                    return Optional.empty();
                }
            }
            stream.close();
        }
        return optional;
    }

    private static Optional<Path> findBPFLibrary() {
        String javaLibraryPath = System.getProperty("java.library.path");
        if (javaLibraryPath == null) {
            return Optional.empty();
        }
        return Arrays.stream(javaLibraryPath.split(":")).map(f -> LibraryLoader.findLibInFolder(Path.of((String)f, (String[])new String[0]), 1)).filter(Optional::isPresent).map(Optional::get).findFirst().or(() -> Stream.of("/lib", "/usr/lib", "/lib64", "/usr/lib64").map(x$0 -> Path.of((String)x$0, (String[])new String[0])).map(p -> LibraryLoader.findLibInFolder(p, 2)).filter(Optional::isPresent).map(Optional::get).findFirst());
    }

    public static boolean isInstalled() {
        return LibraryLoader.findBPFLibrary().isPresent();
    }

    public static void load() {
        try {
            System.loadLibrary("bpf");
        } catch (UnsatisfiedLinkError e) {
            Optional<Path> lib = LibraryLoader.findBPFLibrary();
            if (lib.isPresent()) {
                System.load(lib.get().toString());
                return;
            }
            System.err.println("Failed to load libbpf.so, pass the location of the lib folder via -Djava.library.path after you installed it");
            System.exit(1);
        }
    }

    public static void main(String[] args) {
        System.out.println(LibraryLoader.isInstalled());
    }
}

