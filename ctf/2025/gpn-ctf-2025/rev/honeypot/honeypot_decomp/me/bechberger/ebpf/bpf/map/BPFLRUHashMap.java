/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.bpf.map;

import me.bechberger.ebpf.annotations.bpf.BPFMapClass;
import me.bechberger.ebpf.bpf.map.BPFHashMap;
import me.bechberger.ebpf.bpf.map.FileDescriptor;
import me.bechberger.ebpf.type.BPFType;

@BPFMapClass(cTemplate="struct {\n    __uint (type, BPF_MAP_TYPE_LRU_HASH);\n    __uint (key_size, sizeof($c1));\n    __uint (value_size, sizeof($c2));\n    __uint (max_entries, $maxEntries);\n} $field SEC(\".maps\");\n", javaTemplate="new $class<>($fd, $b1, $b2)\n")
public class BPFLRUHashMap<K, V>
extends BPFHashMap<K, V> {
    public BPFLRUHashMap(FileDescriptor fd2, BPFType<K> keyType, BPFType<V> valueType) {
        super(fd2, true, keyType, valueType);
    }
}

