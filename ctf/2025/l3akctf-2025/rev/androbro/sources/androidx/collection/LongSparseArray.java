package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001a\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b \n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0016\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u001d\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0010H\u0016J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0000H\u0016J\u0010\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0015\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0017J\u0018\u0010\u001b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0002\u0010\u001cJ\u001d\u0010\u001b\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u001d\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0015\u0010 \u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010!J\b\u0010\"\u001a\u00020\u0007H\u0016J\u0010\u0010#\u001a\u00020\u00122\u0006\u0010$\u001a\u00020\u0004H\u0016J\u001d\u0010%\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0014J\u0018\u0010&\u001a\u00020\u00102\u000e\u0010'\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000H\u0016J\u001f\u0010(\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001eJ\u0010\u0010)\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u001d\u0010)\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010*J\u0010\u0010+\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u0004H\u0016J\u001f\u0010,\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001eJ%\u0010,\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010-\u001a\u00028\u00002\u0006\u0010.\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010/J\u001d\u00100\u001a\u00020\u00102\u0006\u0010$\u001a\u00020\u00042\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\b\u0010\n\u001a\u00020\u0004H\u0016J\b\u00102\u001a\u000203H\u0016J\u0015\u00104\u001a\u00028\u00002\u0006\u0010$\u001a\u00020\u0004H\u0016¢\u0006\u0002\u00105R\u0012\u0010\u0006\u001a\u00020\u00078\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u00020\t8\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u00020\u00048\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u001c\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\f8\u0000@\u0000X\u000e¢\u0006\u0004\n\u0002\u0010\u000e¨\u00066"}, d2 = {"Landroidx/collection/LongSparseArray;", "E", "", "initialCapacity", "", "(I)V", "garbage", "", "keys", "", "size", "values", "", "", "[Ljava/lang/Object;", "append", "", "key", "", "value", "(JLjava/lang/Object;)V", "clear", "clone", "containsKey", "containsValue", "(Ljava/lang/Object;)Z", "delete", "get", "(J)Ljava/lang/Object;", "defaultValue", "(JLjava/lang/Object;)Ljava/lang/Object;", "indexOfKey", "indexOfValue", "(Ljava/lang/Object;)I", "isEmpty", "keyAt", "index", "put", "putAll", "other", "putIfAbsent", "remove", "(JLjava/lang/Object;)Z", "removeAt", "replace", "oldValue", "newValue", "(JLjava/lang/Object;Ljava/lang/Object;)Z", "setValueAt", "(ILjava/lang/Object;)V", "toString", "", "valueAt", "(I)Ljava/lang/Object;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: LongSparseArray.jvm.kt */
public class LongSparseArray<E> implements Cloneable {
    public /* synthetic */ boolean garbage;
    public /* synthetic */ long[] keys;
    public /* synthetic */ int size;
    public /* synthetic */ Object[] values;

    public LongSparseArray() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public LongSparseArray(int initialCapacity) {
        if (initialCapacity == 0) {
            this.keys = ContainerHelpersKt.EMPTY_LONGS;
            this.values = ContainerHelpersKt.EMPTY_OBJECTS;
            return;
        }
        int idealCapacity = ContainerHelpersKt.idealLongArraySize(initialCapacity);
        this.keys = new long[idealCapacity];
        this.values = new Object[idealCapacity];
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LongSparseArray(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 10 : i);
    }

    public LongSparseArray<E> clone() {
        Object clone = super.clone();
        Intrinsics.checkNotNull(clone, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
        LongSparseArray clone2 = (LongSparseArray) clone;
        clone2.keys = (long[]) this.keys.clone();
        clone2.values = (Object[]) this.values.clone();
        return clone2;
    }

    public E get(long key) {
        int i$iv$iv = ContainerHelpersKt.binarySearch(this.keys, this.size, key);
        if (i$iv$iv < 0 || this.values[i$iv$iv] == LongSparseArrayKt.DELETED) {
            return null;
        }
        return this.values[i$iv$iv];
    }

    public E get(long key, E defaultValue) {
        int i$iv$iv = ContainerHelpersKt.binarySearch(this.keys, this.size, key);
        if (i$iv$iv < 0 || this.values[i$iv$iv] == LongSparseArrayKt.DELETED) {
            return defaultValue;
        }
        return this.values[i$iv$iv];
    }

    @Deprecated(message = "Alias for `remove(key)`.", replaceWith = @ReplaceWith(expression = "remove(key)", imports = {}))
    public void delete(long key) {
        int i$iv = ContainerHelpersKt.binarySearch(this.keys, this.size, key);
        if (i$iv >= 0 && this.values[i$iv] != LongSparseArrayKt.DELETED) {
            this.values[i$iv] = LongSparseArrayKt.DELETED;
            this.garbage = true;
        }
    }

    public void remove(long key) {
        int i$iv = ContainerHelpersKt.binarySearch(this.keys, this.size, key);
        if (i$iv >= 0 && this.values[i$iv] != LongSparseArrayKt.DELETED) {
            this.values[i$iv] = LongSparseArrayKt.DELETED;
            this.garbage = true;
        }
    }

    public boolean remove(long key, E value) {
        int index$iv = indexOfKey(key);
        if (index$iv < 0 || !Intrinsics.areEqual((Object) value, valueAt(index$iv))) {
            return false;
        }
        removeAt(index$iv);
        return true;
    }

    public void removeAt(int index) {
        if (this.values[index] != LongSparseArrayKt.DELETED) {
            this.values[index] = LongSparseArrayKt.DELETED;
            this.garbage = true;
        }
    }

    public E replace(long key, E value) {
        int index$iv = indexOfKey(key);
        if (index$iv < 0) {
            return null;
        }
        E e = this.values[index$iv];
        this.values[index$iv] = value;
        return e;
    }

    public boolean replace(long key, E oldValue, E newValue) {
        int index$iv = indexOfKey(key);
        if (index$iv < 0 || !Intrinsics.areEqual(this.values[index$iv], (Object) oldValue)) {
            return false;
        }
        this.values[index$iv] = newValue;
        return true;
    }

    public void put(long key, E value) {
        long j = key;
        int index$iv = ContainerHelpersKt.binarySearch(this.keys, this.size, j);
        if (index$iv >= 0) {
            this.values[index$iv] = value;
            return;
        }
        int index$iv2 = ~index$iv;
        if (index$iv2 >= this.size || this.values[index$iv2] != LongSparseArrayKt.DELETED) {
            if (this.garbage && this.size >= this.keys.length) {
                int n$iv$iv = this.size;
                int newSize$iv$iv = 0;
                long[] keys$iv$iv = this.keys;
                Object[] values$iv$iv = this.values;
                for (int i$iv$iv = 0; i$iv$iv < n$iv$iv; i$iv$iv++) {
                    Object value$iv$iv = values$iv$iv[i$iv$iv];
                    if (value$iv$iv != LongSparseArrayKt.DELETED) {
                        if (i$iv$iv != newSize$iv$iv) {
                            keys$iv$iv[newSize$iv$iv] = keys$iv$iv[i$iv$iv];
                            values$iv$iv[newSize$iv$iv] = value$iv$iv;
                            values$iv$iv[i$iv$iv] = null;
                        }
                        newSize$iv$iv++;
                    }
                }
                this.garbage = false;
                this.size = newSize$iv$iv;
                index$iv2 = ~ContainerHelpersKt.binarySearch(this.keys, this.size, j);
            }
            if (this.size >= this.keys.length) {
                int newSize$iv = ContainerHelpersKt.idealLongArraySize(this.size + 1);
                long[] copyOf = Arrays.copyOf(this.keys, newSize$iv);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                this.keys = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.values, newSize$iv);
                Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
                this.values = copyOf2;
            }
            if (this.size - index$iv2 != 0) {
                ArraysKt.copyInto(this.keys, this.keys, index$iv2 + 1, index$iv2, this.size);
                ArraysKt.copyInto((T[]) this.values, (T[]) this.values, index$iv2 + 1, index$iv2, this.size);
            }
            this.keys[index$iv2] = j;
            this.values[index$iv2] = value;
            this.size++;
            return;
        }
        this.keys[index$iv2] = j;
        this.values[index$iv2] = value;
    }

    public void putAll(LongSparseArray<? extends E> other) {
        Intrinsics.checkNotNullParameter(other, "other");
        int size$iv = other.size();
        for (int i = 0; i < size$iv; i++) {
            int i$iv = i;
            put(other.keyAt(i$iv), other.valueAt(i$iv));
        }
    }

    public E putIfAbsent(long key, E value) {
        Object mapValue$iv = get(key);
        if (mapValue$iv == null) {
            put(key, value);
        }
        return mapValue$iv;
    }

    public int size() {
        if (this.garbage) {
            int n$iv$iv = this.size;
            int newSize$iv$iv = 0;
            long[] keys$iv$iv = this.keys;
            Object[] values$iv$iv = this.values;
            for (int i$iv$iv = 0; i$iv$iv < n$iv$iv; i$iv$iv++) {
                Object value$iv$iv = values$iv$iv[i$iv$iv];
                if (value$iv$iv != LongSparseArrayKt.DELETED) {
                    if (i$iv$iv != newSize$iv$iv) {
                        keys$iv$iv[newSize$iv$iv] = keys$iv$iv[i$iv$iv];
                        values$iv$iv[newSize$iv$iv] = value$iv$iv;
                        values$iv$iv[i$iv$iv] = null;
                    }
                    newSize$iv$iv++;
                }
            }
            this.garbage = false;
            this.size = newSize$iv$iv;
        }
        return this.size;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public long keyAt(int index) {
        if (index >= 0 && index < this.size) {
            if (this.garbage) {
                int n$iv$iv = this.size;
                int newSize$iv$iv = 0;
                long[] keys$iv$iv = this.keys;
                Object[] values$iv$iv = this.values;
                for (int i$iv$iv = 0; i$iv$iv < n$iv$iv; i$iv$iv++) {
                    Object value$iv$iv = values$iv$iv[i$iv$iv];
                    if (value$iv$iv != LongSparseArrayKt.DELETED) {
                        if (i$iv$iv != newSize$iv$iv) {
                            keys$iv$iv[newSize$iv$iv] = keys$iv$iv[i$iv$iv];
                            values$iv$iv[newSize$iv$iv] = value$iv$iv;
                            values$iv$iv[i$iv$iv] = null;
                        }
                        newSize$iv$iv++;
                    }
                }
                this.garbage = false;
                this.size = newSize$iv$iv;
            }
            return this.keys[index];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + index).toString());
    }

    public E valueAt(int index) {
        if (index >= 0 && index < this.size) {
            if (this.garbage) {
                int n$iv$iv = this.size;
                int newSize$iv$iv = 0;
                long[] keys$iv$iv = this.keys;
                Object[] values$iv$iv = this.values;
                for (int i$iv$iv = 0; i$iv$iv < n$iv$iv; i$iv$iv++) {
                    Object value$iv$iv = values$iv$iv[i$iv$iv];
                    if (value$iv$iv != LongSparseArrayKt.DELETED) {
                        if (i$iv$iv != newSize$iv$iv) {
                            keys$iv$iv[newSize$iv$iv] = keys$iv$iv[i$iv$iv];
                            values$iv$iv[newSize$iv$iv] = value$iv$iv;
                            values$iv$iv[i$iv$iv] = null;
                        }
                        newSize$iv$iv++;
                    }
                }
                this.garbage = false;
                this.size = newSize$iv$iv;
            }
            return this.values[index];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + index).toString());
    }

    public void setValueAt(int index, E value) {
        if (index >= 0 && index < this.size) {
            if (this.garbage) {
                int n$iv$iv = this.size;
                int newSize$iv$iv = 0;
                long[] keys$iv$iv = this.keys;
                Object[] values$iv$iv = this.values;
                for (int i$iv$iv = 0; i$iv$iv < n$iv$iv; i$iv$iv++) {
                    Object value$iv$iv = values$iv$iv[i$iv$iv];
                    if (value$iv$iv != LongSparseArrayKt.DELETED) {
                        if (i$iv$iv != newSize$iv$iv) {
                            keys$iv$iv[newSize$iv$iv] = keys$iv$iv[i$iv$iv];
                            values$iv$iv[newSize$iv$iv] = value$iv$iv;
                            values$iv$iv[i$iv$iv] = null;
                        }
                        newSize$iv$iv++;
                    }
                }
                this.garbage = false;
                this.size = newSize$iv$iv;
            }
            this.values[index] = value;
            return;
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + index).toString());
    }

    public int indexOfKey(long key) {
        if (this.garbage) {
            int n$iv$iv = this.size;
            int newSize$iv$iv = 0;
            long[] keys$iv$iv = this.keys;
            Object[] values$iv$iv = this.values;
            for (int i$iv$iv = 0; i$iv$iv < n$iv$iv; i$iv$iv++) {
                Object value$iv$iv = values$iv$iv[i$iv$iv];
                if (value$iv$iv != LongSparseArrayKt.DELETED) {
                    if (i$iv$iv != newSize$iv$iv) {
                        keys$iv$iv[newSize$iv$iv] = keys$iv$iv[i$iv$iv];
                        values$iv$iv[newSize$iv$iv] = value$iv$iv;
                        values$iv$iv[i$iv$iv] = null;
                    }
                    newSize$iv$iv++;
                }
            }
            this.garbage = false;
            this.size = newSize$iv$iv;
        }
        return ContainerHelpersKt.binarySearch(this.keys, this.size, key);
    }

    public int indexOfValue(E value) {
        if (this.garbage) {
            int n$iv$iv = this.size;
            int newSize$iv$iv = 0;
            long[] keys$iv$iv = this.keys;
            Object[] values$iv$iv = this.values;
            for (int i$iv$iv = 0; i$iv$iv < n$iv$iv; i$iv$iv++) {
                Object value$iv$iv = values$iv$iv[i$iv$iv];
                if (value$iv$iv != LongSparseArrayKt.DELETED) {
                    if (i$iv$iv != newSize$iv$iv) {
                        keys$iv$iv[newSize$iv$iv] = keys$iv$iv[i$iv$iv];
                        values$iv$iv[newSize$iv$iv] = value$iv$iv;
                        values$iv$iv[i$iv$iv] = null;
                    }
                    newSize$iv$iv++;
                }
            }
            this.garbage = false;
            this.size = newSize$iv$iv;
        }
        int i = this.size;
        for (int i2 = 0; i2 < i; i2++) {
            int i$iv = i2;
            if (this.values[i$iv] == value) {
                return i$iv;
            }
        }
        return -1;
    }

    public boolean containsKey(long key) {
        return indexOfKey(key) >= 0;
    }

    public boolean containsValue(E value) {
        return indexOfValue(value) >= 0;
    }

    public void clear() {
        int n$iv = this.size;
        Object[] values$iv = this.values;
        for (int i$iv = 0; i$iv < n$iv; i$iv++) {
            values$iv[i$iv] = null;
        }
        this.size = 0;
        this.garbage = false;
    }

    public void append(long key, E value) {
        if (this.size == 0 || key > this.keys[this.size - 1]) {
            if (this.garbage && this.size >= this.keys.length) {
                int n$iv$iv = this.size;
                int newSize$iv$iv = 0;
                long[] keys$iv$iv = this.keys;
                Object[] values$iv$iv = this.values;
                for (int i$iv$iv = 0; i$iv$iv < n$iv$iv; i$iv$iv++) {
                    Object value$iv$iv = values$iv$iv[i$iv$iv];
                    if (value$iv$iv != LongSparseArrayKt.DELETED) {
                        if (i$iv$iv != newSize$iv$iv) {
                            keys$iv$iv[newSize$iv$iv] = keys$iv$iv[i$iv$iv];
                            values$iv$iv[newSize$iv$iv] = value$iv$iv;
                            values$iv$iv[i$iv$iv] = null;
                        }
                        newSize$iv$iv++;
                    }
                }
                this.garbage = false;
                this.size = newSize$iv$iv;
            }
            int pos$iv = this.size;
            if (pos$iv >= this.keys.length) {
                int newSize$iv = ContainerHelpersKt.idealLongArraySize(pos$iv + 1);
                long[] copyOf = Arrays.copyOf(this.keys, newSize$iv);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                this.keys = copyOf;
                Object[] copyOf2 = Arrays.copyOf(this.values, newSize$iv);
                Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
                this.values = copyOf2;
            }
            this.keys[pos$iv] = key;
            this.values[pos$iv] = value;
            this.size = pos$iv + 1;
            return;
        }
        put(key, value);
    }

    public String toString() {
        if (size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.size * 28);
        StringBuilder $this$commonToString_u24lambda_u245$iv = sb;
        $this$commonToString_u24lambda_u245$iv.append('{');
        int i = this.size;
        for (int i$iv = 0; i$iv < i; i$iv++) {
            if (i$iv > 0) {
                $this$commonToString_u24lambda_u245$iv.append(", ");
            }
            $this$commonToString_u24lambda_u245$iv.append(keyAt(i$iv));
            $this$commonToString_u24lambda_u245$iv.append('=');
            Object value$iv = valueAt(i$iv);
            if (value$iv != $this$commonToString_u24lambda_u245$iv) {
                $this$commonToString_u24lambda_u245$iv.append(value$iv);
            } else {
                $this$commonToString_u24lambda_u245$iv.append("(this Map)");
            }
        }
        $this$commonToString_u24lambda_u245$iv.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }
}
