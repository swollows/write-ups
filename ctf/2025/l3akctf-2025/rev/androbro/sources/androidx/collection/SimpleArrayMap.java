package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import java.util.ConcurrentModificationException;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b)\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u00022\u00020\u0003B!\b\u0016\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u0001\u0018\u00010\u0000¢\u0006\u0002\u0010\u0005B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0015\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0014J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0007H\u0016J\u0013\u0010\u0019\u001a\u00020\u00122\b\u0010\u001a\u001a\u0004\u0018\u00010\u0003H\u0002J\u0018\u0010\u001b\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001cJ\u001f\u0010\u001d\u001a\u00028\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001e\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001fJ,\u0010 \u001a\u0002H!\"\n\b\u0002\u0010!*\u0004\u0018\u00018\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u001e\u001a\u0002H!H\b¢\u0006\u0002\u0010\u001fJ\b\u0010\"\u001a\u00020\u0007H\u0016J\u001d\u0010#\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010%J\u0015\u0010&\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010'J\b\u0010(\u001a\u00020\u0007H\u0002J\u0017\u0010)\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00028\u0001H\u0001¢\u0006\u0004\b*\u0010'J\b\u0010+\u001a\u00020\u0012H\u0016J\u0015\u0010,\u001a\u00028\u00002\u0006\u0010-\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010.J\u001f\u0010/\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001fJ \u00100\u001a\u00020\u00102\u0016\u0010\u0004\u001a\u0012\u0012\u0006\b\u0001\u0012\u00028\u0000\u0012\u0006\b\u0001\u0012\u00028\u00010\u0000H\u0016J\u001f\u00101\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001fJ\u0017\u00102\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ\u001d\u00102\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0002\u00103J\u0015\u00104\u001a\u00028\u00012\u0006\u0010-\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010.J\u001f\u00105\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001fJ%\u00105\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u00002\u0006\u00106\u001a\u00028\u00012\u0006\u00107\u001a\u00028\u0001H\u0016¢\u0006\u0002\u00108J\u001d\u00109\u001a\u00028\u00012\u0006\u0010-\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010:J\b\u0010\u000e\u001a\u00020\u0007H\u0016J\b\u0010;\u001a\u00020<H\u0016J\u0015\u0010=\u001a\u00028\u00012\u0006\u0010-\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010.R\u0018\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\nX\u000e¢\u0006\u0004\n\u0002\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u000e¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Landroidx/collection/SimpleArrayMap;", "K", "V", "", "map", "(Landroidx/collection/SimpleArrayMap;)V", "capacity", "", "(I)V", "array", "", "[Ljava/lang/Object;", "hashes", "", "size", "clear", "", "containsKey", "", "key", "(Ljava/lang/Object;)Z", "containsValue", "value", "ensureCapacity", "minimumCapacity", "equals", "other", "get", "(Ljava/lang/Object;)Ljava/lang/Object;", "getOrDefault", "defaultValue", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "getOrDefaultInternal", "T", "hashCode", "indexOf", "hash", "(Ljava/lang/Object;I)I", "indexOfKey", "(Ljava/lang/Object;)I", "indexOfNull", "indexOfValue", "__restricted$indexOfValue", "isEmpty", "keyAt", "index", "(I)Ljava/lang/Object;", "put", "putAll", "putIfAbsent", "remove", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "removeAt", "replace", "oldValue", "newValue", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "setValueAt", "(ILjava/lang/Object;)Ljava/lang/Object;", "toString", "", "valueAt", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: SimpleArrayMap.kt */
public class SimpleArrayMap<K, V> {
    private Object[] array;
    private int[] hashes;
    private int size;

    public SimpleArrayMap() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public SimpleArrayMap(int capacity) {
        int[] iArr;
        Object[] objArr;
        if (capacity == 0) {
            iArr = ContainerHelpersKt.EMPTY_INTS;
        } else {
            iArr = new int[capacity];
        }
        this.hashes = iArr;
        if (capacity == 0) {
            objArr = ContainerHelpersKt.EMPTY_OBJECTS;
        } else {
            objArr = new Object[(capacity << 1)];
        }
        this.array = objArr;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SimpleArrayMap(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public SimpleArrayMap(SimpleArrayMap<? extends K, ? extends V> map) {
        this(0, 1, (DefaultConstructorMarker) null);
        if (map != null) {
            putAll(map);
        }
    }

    private final int indexOf(K key, int hash) {
        int n = this.size;
        if (n == 0) {
            return -1;
        }
        int index = ContainerHelpersKt.binarySearch(this.hashes, n, hash);
        if (index < 0 || Intrinsics.areEqual((Object) key, this.array[index << 1])) {
            return index;
        }
        int end = index + 1;
        while (end < n && this.hashes[end] == hash) {
            if (Intrinsics.areEqual((Object) key, this.array[end << 1])) {
                return end;
            }
            end++;
        }
        int i = index - 1;
        while (i >= 0 && this.hashes[i] == hash) {
            if (Intrinsics.areEqual((Object) key, this.array[i << 1])) {
                return i;
            }
            i--;
        }
        return ~end;
    }

    private final int indexOfNull() {
        int n = this.size;
        if (n == 0) {
            return -1;
        }
        int index = ContainerHelpersKt.binarySearch(this.hashes, n, 0);
        if (index < 0 || this.array[index << 1] == null) {
            return index;
        }
        int end = index + 1;
        while (end < n && this.hashes[end] == 0) {
            if (this.array[end << 1] == null) {
                return end;
            }
            end++;
        }
        int i = index - 1;
        while (i >= 0 && this.hashes[i] == 0) {
            if (this.array[i << 1] == null) {
                return i;
            }
            i--;
        }
        return ~end;
    }

    public void clear() {
        if (this.size > 0) {
            this.hashes = ContainerHelpersKt.EMPTY_INTS;
            this.array = ContainerHelpersKt.EMPTY_OBJECTS;
            this.size = 0;
        }
        if (this.size > 0) {
            throw new ConcurrentModificationException();
        }
    }

    public void ensureCapacity(int minimumCapacity) {
        int osize = this.size;
        if (this.hashes.length < minimumCapacity) {
            int[] copyOf = Arrays.copyOf(this.hashes, minimumCapacity);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.array, minimumCapacity * 2);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.array = copyOf2;
        }
        if (this.size != osize) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean containsKey(K key) {
        return indexOfKey(key) >= 0;
    }

    public int indexOfKey(K key) {
        if (key == null) {
            return indexOfNull();
        }
        return indexOf(key, key.hashCode());
    }

    public final int __restricted$indexOfValue(V value) {
        int n = this.size * 2;
        Object[] array2 = this.array;
        if (value == null) {
            for (int i = 1; i < n; i += 2) {
                if (array2[i] == null) {
                    return i >> 1;
                }
            }
            return -1;
        }
        for (int i2 = 1; i2 < n; i2 += 2) {
            if (Intrinsics.areEqual((Object) value, array2[i2])) {
                return i2 >> 1;
            }
        }
        return -1;
    }

    public boolean containsValue(V value) {
        return __restricted$indexOfValue(value) >= 0;
    }

    public V get(K key) {
        int index$iv = indexOfKey(key);
        if (index$iv >= 0) {
            return this.array[(index$iv << 1) + 1];
        }
        return null;
    }

    public V getOrDefault(Object key, V defaultValue) {
        int index$iv = indexOfKey(key);
        if (index$iv >= 0) {
            return this.array[(index$iv << 1) + 1];
        }
        return defaultValue;
    }

    private final <T extends V> T getOrDefaultInternal(Object key, T defaultValue) {
        int index = indexOfKey(key);
        if (index >= 0) {
            return this.array[(index << 1) + 1];
        }
        return defaultValue;
    }

    public K keyAt(int index) {
        boolean z = false;
        if (index >= 0 && index < this.size) {
            z = true;
        }
        if (z) {
            return this.array[index << 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + index).toString());
    }

    public V valueAt(int index) {
        boolean z = false;
        if (index >= 0 && index < this.size) {
            z = true;
        }
        if (z) {
            return this.array[(index << 1) + 1];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + index).toString());
    }

    public V setValueAt(int index, V value) {
        boolean z = false;
        if (index >= 0 && index < this.size) {
            z = true;
        }
        if (z) {
            int indexInArray = (index << 1) + 1;
            Object old = this.array[indexInArray];
            this.array[indexInArray] = value;
            return old;
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + index).toString());
    }

    public boolean isEmpty() {
        return this.size <= 0;
    }

    public V put(K key, V value) {
        int osize = this.size;
        int hash = key != null ? key.hashCode() : 0;
        int index = key != null ? indexOf(key, hash) : indexOfNull();
        if (index >= 0) {
            int index2 = (index << 1) + 1;
            Object old = this.array[index2];
            this.array[index2] = value;
            return old;
        }
        int index3 = ~index;
        if (osize >= this.hashes.length) {
            int n = 8;
            if (osize >= 8) {
                n = (osize >> 1) + osize;
            } else if (osize < 4) {
                n = 4;
            }
            int[] copyOf = Arrays.copyOf(this.hashes, n);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.hashes = copyOf;
            Object[] copyOf2 = Arrays.copyOf(this.array, n << 1);
            Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
            this.array = copyOf2;
            if (osize != this.size) {
                throw new ConcurrentModificationException();
            }
        }
        if (index3 < osize) {
            ArraysKt.copyInto(this.hashes, this.hashes, index3 + 1, index3, osize);
            ArraysKt.copyInto((T[]) this.array, (T[]) this.array, (index3 + 1) << 1, index3 << 1, this.size << 1);
        }
        if (osize != this.size || index3 >= this.hashes.length) {
            throw new ConcurrentModificationException();
        }
        this.hashes[index3] = hash;
        this.array[index3 << 1] = key;
        this.array[(index3 << 1) + 1] = value;
        this.size++;
        return null;
    }

    public void putAll(SimpleArrayMap<? extends K, ? extends V> map) {
        Intrinsics.checkNotNullParameter(map, "map");
        int n = map.size;
        ensureCapacity(this.size + n);
        if (this.size != 0) {
            for (int i = 0; i < n; i++) {
                put(map.keyAt(i), map.valueAt(i));
            }
        } else if (n > 0) {
            ArraysKt.copyInto(map.hashes, this.hashes, 0, 0, n);
            ArraysKt.copyInto((T[]) map.array, (T[]) this.array, 0, 0, n << 1);
            this.size = n;
        }
    }

    public V putIfAbsent(K key, V value) {
        Object mapValue = get(key);
        if (mapValue == null) {
            return put(key, value);
        }
        return mapValue;
    }

    public V remove(K key) {
        int index = indexOfKey(key);
        if (index >= 0) {
            return removeAt(index);
        }
        return null;
    }

    public boolean remove(K key, V value) {
        int index = indexOfKey(key);
        if (index < 0 || !Intrinsics.areEqual((Object) value, valueAt(index))) {
            return false;
        }
        removeAt(index);
        return true;
    }

    public V removeAt(int index) {
        if (index >= 0 && index < this.size) {
            Object old = this.array[(index << 1) + 1];
            int osize = this.size;
            if (osize <= 1) {
                clear();
            } else {
                int nsize = osize - 1;
                int i = 8;
                if (this.hashes.length <= 8 || osize >= this.hashes.length / 3) {
                    if (index < nsize) {
                        ArraysKt.copyInto(this.hashes, this.hashes, index, index + 1, nsize + 1);
                        ArraysKt.copyInto((T[]) this.array, (T[]) this.array, index << 1, (index + 1) << 1, (nsize + 1) << 1);
                    }
                    this.array[nsize << 1] = null;
                    this.array[(nsize << 1) + 1] = null;
                } else {
                    if (osize > 8) {
                        i = osize + (osize >> 1);
                    }
                    int n = i;
                    int[] ohashes = this.hashes;
                    Object[] oarray = this.array;
                    int[] copyOf = Arrays.copyOf(this.hashes, n);
                    Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                    this.hashes = copyOf;
                    Object[] copyOf2 = Arrays.copyOf(this.array, n << 1);
                    Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
                    this.array = copyOf2;
                    if (osize == this.size) {
                        if (index > 0) {
                            ArraysKt.copyInto(ohashes, this.hashes, 0, 0, index);
                            ArraysKt.copyInto((T[]) oarray, (T[]) this.array, 0, 0, index << 1);
                        }
                        if (index < nsize) {
                            ArraysKt.copyInto(ohashes, this.hashes, index, index + 1, nsize + 1);
                            ArraysKt.copyInto((T[]) oarray, (T[]) this.array, index << 1, (index + 1) << 1, (nsize + 1) << 1);
                        }
                    } else {
                        throw new ConcurrentModificationException();
                    }
                }
                if (osize == this.size) {
                    this.size = nsize;
                } else {
                    throw new ConcurrentModificationException();
                }
            }
            return old;
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + index).toString());
    }

    public V replace(K key, V value) {
        int index = indexOfKey(key);
        if (index >= 0) {
            return setValueAt(index, value);
        }
        return null;
    }

    public boolean replace(K key, V oldValue, V newValue) {
        int index = indexOfKey(key);
        if (index < 0 || !Intrinsics.areEqual((Object) oldValue, valueAt(index))) {
            return false;
        }
        setValueAt(index, newValue);
        return true;
    }

    public int size() {
        return this.size;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        try {
            if (other instanceof SimpleArrayMap) {
                if (size() != ((SimpleArrayMap) other).size()) {
                    return false;
                }
                SimpleArrayMap otherSimpleArrayMap = (SimpleArrayMap) other;
                int i = this.size;
                for (int i2 = 0; i2 < i; i2++) {
                    Object key = keyAt(i2);
                    Object mine = valueAt(i2);
                    Object theirs = otherSimpleArrayMap.get(key);
                    if (mine == null) {
                        if (theirs != null || !otherSimpleArrayMap.containsKey(key)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(mine, theirs)) {
                        return false;
                    }
                }
                return true;
            } else if (!(other instanceof Map) || size() != ((Map) other).size()) {
                return false;
            } else {
                int i3 = this.size;
                for (int i4 = 0; i4 < i3; i4++) {
                    Object key2 = keyAt(i4);
                    Object mine2 = valueAt(i4);
                    Object theirs2 = ((Map) other).get(key2);
                    if (mine2 == null) {
                        if (theirs2 != null || !((Map) other).containsKey(key2)) {
                            return false;
                        }
                    } else if (!Intrinsics.areEqual(mine2, theirs2)) {
                        return false;
                    }
                }
                return true;
            }
        } catch (ClassCastException | NullPointerException e) {
        }
        return false;
    }

    public int hashCode() {
        int[] hashes2 = this.hashes;
        Object[] array2 = this.array;
        int result = 0;
        int i = 0;
        int v = 1;
        int s = this.size;
        while (i < s) {
            Object value = array2[v];
            result += hashes2[i] ^ (value != null ? value.hashCode() : 0);
            i++;
            v += 2;
        }
        return result;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        StringBuilder $this$toString_u24lambda_u245 = sb;
        $this$toString_u24lambda_u245.append('{');
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                $this$toString_u24lambda_u245.append(", ");
            }
            Object key = keyAt(i2);
            if (key != $this$toString_u24lambda_u245) {
                $this$toString_u24lambda_u245.append(key);
            } else {
                $this$toString_u24lambda_u245.append("(this Map)");
            }
            $this$toString_u24lambda_u245.append('=');
            Object value = valueAt(i2);
            if (value != $this$toString_u24lambda_u245) {
                $this$toString_u24lambda_u245.append(value);
            } else {
                $this$toString_u24lambda_u245.append("(this Map)");
            }
        }
        $this$toString_u24lambda_u245.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
