/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.shared.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import org.jetbrains.annotations.Nullable;

public class LineReader {
    private final InputStream input;
    private final BufferedReader reader;

    public LineReader(Path path2) throws IOException {
        this.input = Files.newInputStream(path2, new OpenOption[0]);
        this.reader = new BufferedReader(new InputStreamReader(this.input));
    }

    public void close() {
        try {
            this.input.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Nullable
    public String readLine() {
        try {
            return this.reader.readLine();
        } catch (IOException e) {
            return null;
        }
    }

    @Nullable
    public String readLineIfPossible() {
        if (this.ready()) {
            return this.readLine();
        }
        return null;
    }

    public boolean ready() {
        try {
            return this.reader.ready();
        } catch (IOException e) {
            return false;
        }
    }
}

