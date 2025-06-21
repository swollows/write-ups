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
import me.bechberger.ebpf.annotations.bpf.BPFMapClass;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.bpf.map.BPFMap;
import me.bechberger.ebpf.bpf.map.FileDescriptor;
import me.bechberger.ebpf.bpf.map.MapTypeId;
import me.bechberger.ebpf.bpf.raw.Lib;
import me.bechberger.ebpf.bpf.raw.Lib_2;
import me.bechberger.ebpf.type.BPFType;

@BPFMapClass(cTemplate="struct {\n    __uint (type, BPF_MAP_TYPE_BLOOM_FILTER);\n    __type (value, $c1);\n    __uint (max_entries, $maxEntries);\n} $field SEC(\".maps\");\n", javaTemplate="new $class<>($fd, $b1)\n")
public class BPFBloomFilter<V>
extends BPFMap {
    private final BPFType<V> valueType;

    public BPFBloomFilter(FileDescriptor fd2, BPFType<V> valueType) {
        super(MapTypeId.BLOOM_FILTER, fd2);
        this.valueType = valueType;
    }

    @BuiltinBPFFunction(value="!bpf_map_push_elem(&$this, $pointery$arg1, BPF_ANY)")
    public boolean put(V value) {
        try (Arena arena = Arena.ofConfined();){
            MemorySegment valueSegment = this.valueType.allocate(arena, Objects.requireNonNull(value));
            int ret = Lib.bpf_map_update_elem(this.fd.fd(), MemorySegment.NULL, valueSegment, Lib_2.BPF_ANY());
            boolean bl = ret == 0;
            return bl;
        }
    }

    @BuiltinBPFFunction(value="!bpf_map_peek_elem(&$this, $pointery$arg1)")
    public boolean peek(V value) {
        try (Arena arena = Arena.ofConfined();){
            MemorySegment valueSegment = this.valueType.allocate(arena, Objects.requireNonNull(value));
            int ret = Lib.bpf_map_lookup_elem(this.fd.fd(), MemorySegment.NULL, valueSegment);
            boolean bl = ret == 0;
            return bl;
        }
    }
}

