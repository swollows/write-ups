/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.bpf.map;

import me.bechberger.ebpf.annotations.bpf.BPFMapClass;
import me.bechberger.ebpf.bpf.map.BPFBaseMap;
import me.bechberger.ebpf.bpf.map.FileDescriptor;
import me.bechberger.ebpf.bpf.map.MapTypeId;
import me.bechberger.ebpf.type.BPFType;

@BPFMapClass(cTemplate="struct {\n    __uint (type, BPF_MAP_TYPE_HASH);\n    __uint (key_size, sizeof($c1));\n    __uint (value_size, sizeof($c2));\n    __uint (max_entries, $maxEntries);\n} $field SEC(\".maps\");\n", javaTemplate="new $class<>($fd, $b1, $b2)\n")
public class BPFHashMap<K, V>
extends BPFBaseMap<K, V> {
    public BPFHashMap(FileDescriptor fd2, boolean useLRU, BPFType<K> keyType, BPFType<V> valueType) {
        super(fd2, useLRU ? MapTypeId.LRU_HASH : MapTypeId.HASH, keyType, valueType);
    }

    public BPFHashMap(FileDescriptor fd2, BPFType<K> keyType, BPFType<V> valueType) {
        this(fd2, false, keyType, valueType);
    }

    public boolean usesLRU() {
        return this.typeId == MapTypeId.LRU_HASH;
    }
}

