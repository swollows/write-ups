/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.shared;

import java.nio.file.Path;

public final class Constants {
    public static final Path DEBUGFS = Path.of((String)"/sys/kernel/debug", (String[])new String[0]);
    public static final Path TRACEFS = DEBUGFS.resolve("tracing").toFile().exists() ? DEBUGFS.resolve("tracing") : Path.of((String)"/sys/kernel/tracing", (String[])new String[0]);

    private Constants() {
    }
}

