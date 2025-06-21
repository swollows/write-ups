/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.bpf.map;

import me.bechberger.ebpf.annotations.bpf.BPFMapClass;
import me.bechberger.ebpf.bpf.map.BPFQueueAndStack;
import me.bechberger.ebpf.bpf.map.FileDescriptor;
import me.bechberger.ebpf.bpf.map.MapTypeId;
import me.bechberger.ebpf.type.BPFType;

@BPFMapClass(cTemplate="struct {\n    __uint (type, BPF_MAP_TYPE_QUEUE);\n    __type (value, $c1);\n    __uint (max_entries, $maxEntries);\n} $field SEC(\".maps\");\n", javaTemplate="new $class<>($fd, $b1)\n")
public class BPFQueue<V>
extends BPFQueueAndStack<V> {
    public BPFQueue(FileDescriptor fd2, BPFType<V> valueType) {
        super(fd2, MapTypeId.QUEUE, valueType);
    }
}

