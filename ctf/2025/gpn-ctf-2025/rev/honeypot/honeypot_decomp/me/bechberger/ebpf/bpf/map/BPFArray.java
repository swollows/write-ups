/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 */
package me.bechberger.ebpf.bpf.map;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.StreamSupport;
import me.bechberger.ebpf.annotations.bpf.BPFMapClass;
import me.bechberger.ebpf.bpf.map.BPFBaseMap;
import me.bechberger.ebpf.bpf.map.FileDescriptor;
import me.bechberger.ebpf.bpf.map.MapTypeId;
import me.bechberger.ebpf.type.BPFType;

@BPFMapClass(cTemplate="struct {\n    __uint (type, BPF_MAP_TYPE_ARRAY);\n    __type (key, u32);\n    __type (value, $c1);\n    __uint (max_entries, $maxEntries);\n} $field SEC(\".maps\");\n", javaTemplate="new $class<>($fd, $b1, $maxEntries)\n")
public class BPFArray<V>
extends BPFBaseMap<Integer, V> {
    private final int size;

    public BPFArray(FileDescriptor fd2, BPFType<V> valueType, int size) {
        super(fd2, MapTypeId.ARRAY, BPFType.BPFIntType.UINT32, valueType.alignTo(8));
        this.size = size;
    }

    public int size() {
        return this.size;
    }

    @Override
    public V get(Integer i) {
        if (i < this.size) {
            return super.get(i);
        }
        throw new ArrayIndexOutOfBoundsException("Index " + i + " is out of bounds of array with size " + this.size);
    }

    public void set(int i, V value) {
        this.put(i, value);
    }

    public void copy(Iterable<V> values) {
        AtomicInteger index2 = new AtomicInteger(-1);
        StreamSupport.stream(values.spliterator(), false).limit(this.size).forEach((? super T v) -> this.put(index2.incrementAndGet(), v));
    }
}

