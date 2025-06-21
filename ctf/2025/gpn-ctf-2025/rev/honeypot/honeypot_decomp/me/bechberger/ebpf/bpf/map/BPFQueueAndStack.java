/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  java.lang.foreign.Arena
 *  java.lang.foreign.MemorySegment
 */
package me.bechberger.ebpf.bpf.map;

import java.lang.foreign.Arena;
import java.lang.foreign.MemorySegment;
import java.util.Objects;
import me.bechberger.ebpf.annotations.bpf.BPFFunctionAlternative;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.bpf.BPFError;
import me.bechberger.ebpf.bpf.map.BPFMap;
import me.bechberger.ebpf.bpf.map.FileDescriptor;
import me.bechberger.ebpf.bpf.map.MapTypeId;
import me.bechberger.ebpf.bpf.raw.Lib;
import me.bechberger.ebpf.bpf.raw.Lib_2;
import me.bechberger.ebpf.type.BPFType;
import org.jetbrains.annotations.Nullable;

public abstract class BPFQueueAndStack<V>
extends BPFMap {
    private final BPFType<V> valueType;

    BPFQueueAndStack(FileDescriptor fd2, MapTypeId mapType, BPFType<V> valueType) {
        super(mapType, fd2);
        if (mapType != MapTypeId.STACK && mapType != MapTypeId.QUEUE) {
            throw new BPFError("Map type must be either STACK or QUEUE, but got " + String.valueOf((Object)mapType));
        }
        this.valueType = valueType;
    }

    @BuiltinBPFFunction(value="!bpf_map_push_elem(&$this, $pointery$arg1, BPF_ANY)")
    public boolean push(V value) {
        try (Arena arena = Arena.ofConfined();){
            MemorySegment valueSegment = this.valueType.allocate(arena, Objects.requireNonNull(value));
            int ret = Lib.bpf_map_update_elem(this.fd.fd(), MemorySegment.NULL, valueSegment, Lib_2.BPF_ANY());
            boolean bl = ret == 0;
            return bl;
        }
    }

    @BPFFunctionAlternative(value="bpf_peek")
    @Nullable
    public V peek() {
        try (Arena arena = Arena.ofConfined();){
            MemorySegment valueSegment = this.valueType.allocate(arena);
            int ret = Lib.bpf_map_lookup_elem(this.fd.fd(), MemorySegment.NULL, valueSegment);
            if (ret != 0) {
                V v = null;
                return v;
            }
            V v = this.valueType.parseMemory(valueSegment);
            return v;
        }
    }

    @BuiltinBPFFunction(value="!bpf_map_peek_elem(&$this, $pointery$arg1)")
    public boolean bpf_peek(V value) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BPFFunctionAlternative(value="bpf_pop")
    @Nullable
    public V pop() {
        try (Arena arena = Arena.ofConfined();){
            MemorySegment valueSegment = this.valueType.allocate(arena);
            int ret = Lib.bpf_map_lookup_and_delete_elem(this.fd.fd(), MemorySegment.NULL, valueSegment);
            if (ret != 0) {
                V v = null;
                return v;
            }
            V v = this.valueType.parseMemory(valueSegment);
            return v;
        }
    }

    @BuiltinBPFFunction(value="!bpf_map_pop_elem(&$this, $pointery$arg1)")
    public boolean bpf_pop(V value) {
        throw new MethodIsBPFRelatedFunction();
    }
}

