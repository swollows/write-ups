/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.annotations.bpf;

public class MethodIsBPFRelatedFunction
extends RuntimeException {
    public MethodIsBPFRelatedFunction() {
        super("This method is a BPF related function and should not be executed by the JVM");
    }
}

