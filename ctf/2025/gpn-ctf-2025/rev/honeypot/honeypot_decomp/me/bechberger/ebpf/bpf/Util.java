/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.bpf;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;
import java.util.zip.GZIPInputStream;
import me.bechberger.ebpf.bpf.BPFProgram;
import me.bechberger.ebpf.bpf.raw.Lib;

public class Util {
    public static String errnoString(int error) {
        return Lib.strerror(error).getString(0L);
    }

    public static byte[] decodeGzippedBase64(String base64) {
        byte[] decodedBytes = Base64.getDecoder().decode(base64);
        try {
            GZIPInputStream gzipInputStream = new GZIPInputStream(new ByteArrayInputStream(decodedBytes));
            return gzipInputStream.readAllBytes();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static byte[] loadGzippedResource(Class<?> klass, String resourceName) {
        byte[] byArray;
        block9: {
            URL resource2 = klass.getClassLoader().getResource(resourceName);
            if (resource2 == null) {
                throw new BPFProgram.BPFLoadError("Resource not found: " + resourceName);
            }
            InputStream inputStream = resource2.openStream();
            try {
                GZIPInputStream gzipInputStream = new GZIPInputStream(inputStream);
                byArray = gzipInputStream.readAllBytes();
                if (inputStream == null) break block9;
            } catch (Throwable throwable) {
                try {
                    if (inputStream != null) {
                        try {
                            inputStream.close();
                        } catch (Throwable throwable2) {
                            throwable.addSuppressed(throwable2);
                        }
                    }
                    throw throwable;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            inputStream.close();
        }
        return byArray;
    }

    public static byte[] readByteCodeFromResource(String resourceName) {
        try {
            URL resource2 = BPFProgram.class.getResource(resourceName);
            if (resource2 == null) {
                throw new BPFProgram.BPFLoadError("Resource not found: " + resourceName);
            }
            return Files.readAllBytes(Path.of((URI)resource2.toURI()));
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

