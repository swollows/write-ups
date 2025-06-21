/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.bpf;

import me.bechberger.ebpf.bpf.Util;

public class BPFError
extends RuntimeException {
    public BPFError(String message) {
        super(message);
    }

    public BPFError(String message, Throwable cause) {
        super(message, cause);
    }

    public BPFError(String message, int errorCode) {
        this(message + ": " + Util.errnoString(errorCode) + " (" + errorCode + ")");
    }
}

