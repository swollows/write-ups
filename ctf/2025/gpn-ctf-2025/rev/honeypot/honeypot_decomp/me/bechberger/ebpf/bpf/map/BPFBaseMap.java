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
import java.util.AbstractMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;
import java.util.Set;
import java.util.function.BiConsumer;
import me.bechberger.ebpf.annotations.bpf.BPFFunctionAlternative;
import me.bechberger.ebpf.annotations.bpf.BuiltinBPFFunction;
import me.bechberger.ebpf.annotations.bpf.MethodIsBPFRelatedFunction;
import me.bechberger.ebpf.annotations.bpf.NotUsableInJava;
import me.bechberger.ebpf.bpf.BPFError;
import me.bechberger.ebpf.bpf.map.BPFMap;
import me.bechberger.ebpf.bpf.map.FileDescriptor;
import me.bechberger.ebpf.bpf.map.MapTypeId;
import me.bechberger.ebpf.bpf.raw.Lib;
import me.bechberger.ebpf.type.BPFType;
import me.bechberger.ebpf.type.Enum;
import me.bechberger.ebpf.type.Ptr;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class BPFBaseMap<K, V>
extends BPFMap
implements Iterable<Map.Entry<K, V>> {
    private final BPFType<K> keyType;
    private final BPFType<V> valueType;

    public BPFBaseMap(FileDescriptor fd2, MapTypeId mapType, BPFType<K> keyType, BPFType<V> valueType) {
        super(mapType, fd2);
        this.keyType = keyType;
        this.valueType = valueType;
    }

    public BPFType<K> getKeyType() {
        return this.keyType;
    }

    public BPFType<V> getValueType() {
        return this.valueType;
    }

    @BuiltinBPFFunction(value="!bpf_map_update_elem(&$this, $pointery$arg1, $pointery$arg2, $arg3)")
    public boolean put(K key2, V value, PutMode mode) {
        try (Arena arena = Arena.ofConfined();){
            MemorySegment keySegment = this.keyType.allocate(arena, Objects.requireNonNull(key2));
            MemorySegment valueSegment = this.valueType.allocate(arena, Objects.requireNonNull(value));
            int ret = Lib.bpf_map_update_elem(this.fd.fd(), keySegment, valueSegment, mode.mode);
            boolean bl = ret == 0;
            return bl;
        }
    }

    @BuiltinBPFFunction(value="!bpf_map_update_elem(&$this, $pointery$arg1, $pointery$arg2, BPF_ANY)")
    public boolean put(K key2, V value) {
        return this.put(key2, value, PutMode.BPF_ANY);
    }

    @BPFFunctionAlternative(value="bpf_get")
    public V get(K key2) {
        try (Arena arena = Arena.ofConfined();){
            MemorySegment keySegment = this.keyType.allocate(arena, Objects.requireNonNull(key2));
            MemorySegment valueSegment = this.valueType.allocate(arena);
            int ret = Lib.bpf_map_lookup_elem(this.fd.fd(), keySegment, valueSegment);
            if (ret != 0) {
                V v = null;
                return v;
            }
            V v = this.valueType.parseMemory(valueSegment);
            return v;
        }
    }

    public boolean containsKey(K key2) {
        return this.get(key2) != null;
    }

    public boolean delete(K key2) {
        try (Arena arena = Arena.ofConfined();){
            MemorySegment keySegment = this.keyType.allocate(arena, Objects.requireNonNull(key2));
            int ret = Lib.bpf_map_delete_elem(this.fd.fd(), keySegment);
            boolean bl = ret == 0;
            return bl;
        }
    }

    public Iterator<K> keyIterator() {
        return new Iterator<K>(){
            final Arena arena = Arena.ofConfined();
            @Nullable
            MemAndKey<K> next = this.obtainNext(null);
            MemorySegment nextKeyMem;
            boolean ended = false;

            @Override
            public boolean hasNext() {
                return !this.ended && this.next != null;
            }

            @Override
            public K next() {
                MemAndKey res = this.next;
                if (this.ended) {
                    if (res != null) {
                        return res.key;
                    }
                    throw new NoSuchElementException();
                }
                this.next = this.obtainNext(this.next);
                return res.key;
            }

            @Nullable
            MemAndKey<K> obtainNext(@Nullable MemAndKey<K> prev) {
                int res;
                if (this.ended) {
                    return null;
                }
                if (this.nextKeyMem == null) {
                    this.nextKeyMem = BPFBaseMap.this.keyType.allocate(this.arena);
                }
                if ((res = Lib.bpf_map_get_next_key(BPFBaseMap.this.fd.fd(), prev == null ? MemorySegment.NULL : prev.mem, this.nextKeyMem)) != 0) {
                    this.ended = true;
                    if (res == -2 || res == -9 || res == -22) {
                        return null;
                    }
                    throw new BPFHashMapError("Failed to get next key", res);
                }
                MemAndKey ret = new MemAndKey(this.nextKeyMem, BPFBaseMap.this.keyType.parseMemory(this.nextKeyMem));
                this.nextKeyMem = prev == null ? BPFBaseMap.this.keyType.allocate(this.arena) : prev.mem;
                return ret;
            }

            record MemAndKey<K>(MemorySegment mem, K key) {
            }
        };
    }

    public Set<K> keySet() {
        HashSet<K> keys = new HashSet<K>();
        Iterator<K> it = this.keyIterator();
        while (it.hasNext()) {
            K key2 = it.next();
            keys.add(key2);
        }
        return keys;
    }

    @Override
    @NotNull
    public Iterator<Map.Entry<K, V>> iterator() {
        return new Iterator<Map.Entry<K, V>>(){
            final Iterator<K> keyIterator;
            {
                this.keyIterator = BPFBaseMap.this.keyIterator();
            }

            @Override
            public boolean hasNext() {
                return this.keyIterator.hasNext();
            }

            @Override
            public Map.Entry<K, V> next() {
                Object key2 = this.keyIterator.next();
                return new AbstractMap.SimpleEntry(key2, BPFBaseMap.this.get(key2));
            }
        };
    }

    public Set<V> values() {
        HashSet<V> values = new HashSet<V>();
        for (K key2 : this.keySet()) {
            values.add(this.get(key2));
        }
        return values;
    }

    public Set<Map.Entry<K, V>> entrySet() {
        HashSet<Map.Entry<K, V>> entries = new HashSet<Map.Entry<K, V>>();
        for (K key2 : this.keySet()) {
            entries.add(new AbstractMap.SimpleEntry<K, V>(key2, this.get(key2)));
        }
        return entries;
    }

    public boolean isEmpty() {
        return !this.keyIterator().hasNext();
    }

    public int slowSize() {
        try (Arena arena = Arena.ofConfined();){
            MemorySegment keySegment = this.keyType.allocate(arena);
            int size = 0;
            while (Lib.bpf_map_get_next_key(this.fd.fd(), keySegment, keySegment) == 0) {
                ++size;
            }
            int n = size;
            return n;
        }
    }

    public void forEach(BiConsumer<? super K, ? super V> action) {
        for (Map.Entry<K, V> entry : this) {
            action.accept(entry.getKey(), entry.getValue());
        }
    }

    @BuiltinBPFFunction(value="bpf_map_lookup_elem(&$this, $pointery$arg1)")
    @NotUsableInJava
    public Ptr<V> bpf_get(K key2) {
        throw new MethodIsBPFRelatedFunction();
    }

    @BuiltinBPFFunction(value="bpf_map_delete_elem(&$this, $pointery$arg1)")
    public void bpf_delete(K key2) {
        this.delete(key2);
    }

    public void clear() {
        for (K key2 : this.keySet()) {
            this.delete(key2);
        }
    }

    public static enum PutMode implements Enum<PutMode>
    {
        BPF_ANY(Lib.BPF_ANY()),
        BPF_NOEXIST(Lib.BPF_NOEXIST()),
        BPF_EXIST(Lib.BPF_EXIST());

        private final int mode;

        private PutMode(int mode) {
            this.mode = mode;
        }
    }

    public static class BPFHashMapError
    extends BPFError {
        public BPFHashMapError(String message, int errorCode) {
            super(message, errorCode);
        }
    }
}

