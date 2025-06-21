/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.shared.util;

import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.nio.file.attribute.FileAttribute;

public class DiffUtil {
    public static String diff(String left, String right) {
        try {
            Path leftFile = Files.createTempFile("left", ".txt", new FileAttribute[0]);
            Path rightFile = Files.createTempFile("right", ".txt", new FileAttribute[0]);
            Files.writeString((Path)leftFile, (CharSequence)left, (OpenOption[])new OpenOption[0]);
            Files.writeString((Path)rightFile, (CharSequence)right, (OpenOption[])new OpenOption[0]);
            ProcessBuilder pb = new ProcessBuilder("diff", leftFile.toString(), rightFile.toString(), "--side-by-side");
            Process p = pb.start();
            p.waitFor();
            return new String(p.getInputStream().readAllBytes());
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

