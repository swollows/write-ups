/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  java.lang.foreign.MemorySegment
 */
package me.bechberger.ebpf.bpf.map;

import java.lang.foreign.MemorySegment;

public record FileDescriptor(String name, MemorySegment map, int fd) {
}

