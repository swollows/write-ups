package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\u000e\n\u0002\b\u0005\u001a.\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0004H\b¢\u0006\u0002\u0010\t\u001a\u0019\u0010\n\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\b\u001a!\u0010\u000b\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\b\u001a&\u0010\r\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\b\u001a\u0002H\u0004H\b¢\u0006\u0002\u0010\u000e\u001a'\u0010\u000f\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000¢\u0006\u0002\u0010\u0010\u001a-\u0010\u000f\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u0002H\u0004H\u0000¢\u0006\u0002\u0010\u0012\u001a!\u0010\u0013\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\b\u001a&\u0010\u0014\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\b\u001a\u0002H\u0004H\b¢\u0006\u0002\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\b\u001a!\u0010\u0017\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0018\u001a\u00020\u0007H\b\u001a.\u0010\u0019\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0004H\b¢\u0006\u0002\u0010\t\u001a)\u0010\u001a\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u000e\u0010\u001b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00040\u0005H\b\u001a0\u0010\u001c\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0004H\b¢\u0006\u0002\u0010\u0012\u001a \u0010\u001d\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0000\u001a+\u0010\u001d\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\b\u001a!\u0010\u001e\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0018\u001a\u00020\u0007H\b\u001a)\u0010\u001f\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\b\u001a0\u0010!\u001a\u0004\u0018\u0001H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0004H\b¢\u0006\u0002\u0010\u0012\u001a6\u0010!\u001a\u00020\f\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\"\u001a\u0002H\u00042\u0006\u0010#\u001a\u0002H\u0004H\b¢\u0006\u0002\u0010$\u001a.\u0010%\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\b\u001a\u0002H\u0004H\b¢\u0006\u0002\u0010\t\u001a\u0019\u0010&\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\b\u001a\u0019\u0010'\u001a\u00020(\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\b\u001a&\u0010)\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0018\u001a\u00020\u0007H\b¢\u0006\u0002\u0010\u0010\u001a\u0018\u0010*\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0002\u001a:\u0010+\u001a\u0002H,\"\u0004\b\u0000\u0010\u0004\"\n\b\u0001\u0010,*\u0004\u0018\u0001H\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u0002H,H\b¢\u0006\u0002\u0010\u0012\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"DELETED", "", "commonAppend", "", "E", "Landroidx/collection/SparseArrayCompat;", "key", "", "value", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)V", "commonClear", "commonContainsKey", "", "commonContainsValue", "(Landroidx/collection/SparseArrayCompat;Ljava/lang/Object;)Z", "commonGet", "(Landroidx/collection/SparseArrayCompat;I)Ljava/lang/Object;", "defaultValue", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;)Ljava/lang/Object;", "commonIndexOfKey", "commonIndexOfValue", "(Landroidx/collection/SparseArrayCompat;Ljava/lang/Object;)I", "commonIsEmpty", "commonKeyAt", "index", "commonPut", "commonPutAll", "other", "commonPutIfAbsent", "commonRemove", "commonRemoveAt", "commonRemoveAtRange", "size", "commonReplace", "oldValue", "newValue", "(Landroidx/collection/SparseArrayCompat;ILjava/lang/Object;Ljava/lang/Object;)Z", "commonSetValueAt", "commonSize", "commonToString", "", "commonValueAt", "gc", "internalGet", "T", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SparseArrayCompat.kt */
public final class SparseArrayCompatKt {
    /* access modifiers changed from: private */
    public static final Object DELETED = new Object();

    private static final <E, T extends E> T internalGet(SparseArrayCompat<E> $this$internalGet, int key, T defaultValue) {
        int i = ContainerHelpersKt.binarySearch($this$internalGet.keys, $this$internalGet.size, key);
        if (i < 0 || $this$internalGet.values[i] == DELETED) {
            return defaultValue;
        }
        return $this$internalGet.values[i];
    }

    public static final <E> E commonGet(SparseArrayCompat<E> $this$commonGet, int key) {
        Intrinsics.checkNotNullParameter($this$commonGet, "<this>");
        SparseArrayCompat $this$internalGet$iv = $this$commonGet;
        int i$iv = ContainerHelpersKt.binarySearch($this$internalGet$iv.keys, $this$internalGet$iv.size, key);
        if (i$iv < 0 || $this$internalGet$iv.values[i$iv] == DELETED) {
            return null;
        }
        return $this$internalGet$iv.values[i$iv];
    }

    public static final <E> E commonGet(SparseArrayCompat<E> $this$commonGet, int key, E defaultValue) {
        Intrinsics.checkNotNullParameter($this$commonGet, "<this>");
        SparseArrayCompat $this$internalGet$iv = $this$commonGet;
        int i$iv = ContainerHelpersKt.binarySearch($this$internalGet$iv.keys, $this$internalGet$iv.size, key);
        if (i$iv < 0 || $this$internalGet$iv.values[i$iv] == DELETED) {
            return defaultValue;
        }
        return $this$internalGet$iv.values[i$iv];
    }

    public static final <E> void commonRemove(SparseArrayCompat<E> $this$commonRemove, int key) {
        Intrinsics.checkNotNullParameter($this$commonRemove, "<this>");
        int i = ContainerHelpersKt.binarySearch($this$commonRemove.keys, $this$commonRemove.size, key);
        if (i >= 0 && $this$commonRemove.values[i] != DELETED) {
            $this$commonRemove.values[i] = DELETED;
            $this$commonRemove.garbage = true;
        }
    }

    public static final <E> boolean commonRemove(SparseArrayCompat<E> $this$commonRemove, int key, Object value) {
        Intrinsics.checkNotNullParameter($this$commonRemove, "<this>");
        int index = $this$commonRemove.indexOfKey(key);
        if (index < 0 || !Intrinsics.areEqual(value, $this$commonRemove.valueAt(index))) {
            return false;
        }
        $this$commonRemove.removeAt(index);
        return true;
    }

    public static final <E> void commonRemoveAt(SparseArrayCompat<E> $this$commonRemoveAt, int index) {
        Intrinsics.checkNotNullParameter($this$commonRemoveAt, "<this>");
        if ($this$commonRemoveAt.values[index] != DELETED) {
            $this$commonRemoveAt.values[index] = DELETED;
            $this$commonRemoveAt.garbage = true;
        }
    }

    public static final <E> void commonRemoveAtRange(SparseArrayCompat<E> $this$commonRemoveAtRange, int index, int size) {
        Intrinsics.checkNotNullParameter($this$commonRemoveAtRange, "<this>");
        int end = Math.min(size, index + size);
        for (int i = index; i < end; i++) {
            $this$commonRemoveAtRange.removeAt(i);
        }
    }

    public static final <E> E commonReplace(SparseArrayCompat<E> $this$commonReplace, int key, E value) {
        Intrinsics.checkNotNullParameter($this$commonReplace, "<this>");
        int index = $this$commonReplace.indexOfKey(key);
        if (index < 0) {
            return null;
        }
        Object oldValue = $this$commonReplace.values[index];
        $this$commonReplace.values[index] = value;
        return oldValue;
    }

    public static final <E> boolean commonReplace(SparseArrayCompat<E> $this$commonReplace, int key, E oldValue, E newValue) {
        Intrinsics.checkNotNullParameter($this$commonReplace, "<this>");
        int index = $this$commonReplace.indexOfKey(key);
        if (index < 0 || !Intrinsics.areEqual($this$commonReplace.values[index], (Object) oldValue)) {
            return false;
        }
        $this$commonReplace.values[index] = newValue;
        return true;
    }

    /* access modifiers changed from: private */
    public static final <E> void gc(SparseArrayCompat<E> $this$gc) {
        int n = $this$gc.size;
        int o = 0;
        int[] keys = $this$gc.keys;
        Object[] values = $this$gc.values;
        for (int i = 0; i < n; i++) {
            Object value = values[i];
            if (value != DELETED) {
                if (i != o) {
                    keys[o] = keys[i];
                    values[o] = value;
                    values[i] = null;
                }
                o++;
            }
        }
        $this$gc.garbage = false;
        $this$gc.size = o;
    }

    public static final <E> void commonPut(SparseArrayCompat<E> $this$commonPut, int key, E value) {
        Intrinsics.checkNotNullParameter($this$commonPut, "<this>");
        int i = ContainerHelpersKt.binarySearch($this$commonPut.keys, $this$commonPut.size, key);
        if (i >= 0) {
            $this$commonPut.values[i] = value;
            return;
        }
        int i2 = ~i;
        if (i2 >= $this$commonPut.size || $this$commonPut.values[i2] != DELETED) {
            if ($this$commonPut.garbage && $this$commonPut.size >= $this$commonPut.keys.length) {
                gc($this$commonPut);
                i2 = ~ContainerHelpersKt.binarySearch($this$commonPut.keys, $this$commonPut.size, key);
            }
            if ($this$commonPut.size >= $this$commonPut.keys.length) {
                int n = ContainerHelpersKt.idealIntArraySize($this$commonPut.size + 1);
                int[] copyOf = Arrays.copyOf($this$commonPut.keys, n);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                $this$commonPut.keys = copyOf;
                Object[] copyOf2 = Arrays.copyOf($this$commonPut.values, n);
                Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
                $this$commonPut.values = copyOf2;
            }
            if ($this$commonPut.size - i2 != 0) {
                ArraysKt.copyInto($this$commonPut.keys, $this$commonPut.keys, i2 + 1, i2, $this$commonPut.size);
                ArraysKt.copyInto((T[]) $this$commonPut.values, (T[]) $this$commonPut.values, i2 + 1, i2, $this$commonPut.size);
            }
            $this$commonPut.keys[i2] = key;
            $this$commonPut.values[i2] = value;
            $this$commonPut.size++;
            return;
        }
        $this$commonPut.keys[i2] = key;
        $this$commonPut.values[i2] = value;
    }

    public static final <E> void commonPutAll(SparseArrayCompat<E> $this$commonPutAll, SparseArrayCompat<? extends E> other) {
        Intrinsics.checkNotNullParameter($this$commonPutAll, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int size = other.size();
        for (int i = 0; i < size; i++) {
            int key$iv = other.keyAt(i);
            Object value$iv = other.valueAt(i);
            SparseArrayCompat $this$commonPut$iv = $this$commonPutAll;
            int i$iv = ContainerHelpersKt.binarySearch($this$commonPut$iv.keys, $this$commonPut$iv.size, key$iv);
            if (i$iv >= 0) {
                $this$commonPut$iv.values[i$iv] = value$iv;
            } else {
                int i$iv2 = ~i$iv;
                if (i$iv2 >= $this$commonPut$iv.size || $this$commonPut$iv.values[i$iv2] != DELETED) {
                    if ($this$commonPut$iv.garbage && $this$commonPut$iv.size >= $this$commonPut$iv.keys.length) {
                        gc($this$commonPut$iv);
                        i$iv2 = ~ContainerHelpersKt.binarySearch($this$commonPut$iv.keys, $this$commonPut$iv.size, key$iv);
                    }
                    if ($this$commonPut$iv.size >= $this$commonPut$iv.keys.length) {
                        int n$iv = ContainerHelpersKt.idealIntArraySize($this$commonPut$iv.size + 1);
                        int[] copyOf = Arrays.copyOf($this$commonPut$iv.keys, n$iv);
                        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                        $this$commonPut$iv.keys = copyOf;
                        Object[] copyOf2 = Arrays.copyOf($this$commonPut$iv.values, n$iv);
                        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
                        $this$commonPut$iv.values = copyOf2;
                    }
                    if ($this$commonPut$iv.size - i$iv2 != 0) {
                        ArraysKt.copyInto($this$commonPut$iv.keys, $this$commonPut$iv.keys, i$iv2 + 1, i$iv2, $this$commonPut$iv.size);
                        ArraysKt.copyInto((T[]) $this$commonPut$iv.values, (T[]) $this$commonPut$iv.values, i$iv2 + 1, i$iv2, $this$commonPut$iv.size);
                    }
                    $this$commonPut$iv.keys[i$iv2] = key$iv;
                    $this$commonPut$iv.values[i$iv2] = value$iv;
                    $this$commonPut$iv.size++;
                } else {
                    $this$commonPut$iv.keys[i$iv2] = key$iv;
                    $this$commonPut$iv.values[i$iv2] = value$iv;
                }
            }
        }
    }

    public static final <E> E commonPutIfAbsent(SparseArrayCompat<E> $this$commonPutIfAbsent, int key, E value) {
        Intrinsics.checkNotNullParameter($this$commonPutIfAbsent, "<this>");
        Object mapValue = commonGet($this$commonPutIfAbsent, key);
        if (mapValue == null) {
            SparseArrayCompat $this$commonPut$iv = $this$commonPutIfAbsent;
            int i$iv = ContainerHelpersKt.binarySearch($this$commonPut$iv.keys, $this$commonPut$iv.size, key);
            if (i$iv >= 0) {
                $this$commonPut$iv.values[i$iv] = value;
            } else {
                int i$iv2 = ~i$iv;
                if (i$iv2 >= $this$commonPut$iv.size || $this$commonPut$iv.values[i$iv2] != DELETED) {
                    if ($this$commonPut$iv.garbage && $this$commonPut$iv.size >= $this$commonPut$iv.keys.length) {
                        gc($this$commonPut$iv);
                        i$iv2 = ~ContainerHelpersKt.binarySearch($this$commonPut$iv.keys, $this$commonPut$iv.size, key);
                    }
                    if ($this$commonPut$iv.size >= $this$commonPut$iv.keys.length) {
                        int n$iv = ContainerHelpersKt.idealIntArraySize($this$commonPut$iv.size + 1);
                        int[] copyOf = Arrays.copyOf($this$commonPut$iv.keys, n$iv);
                        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                        $this$commonPut$iv.keys = copyOf;
                        Object[] copyOf2 = Arrays.copyOf($this$commonPut$iv.values, n$iv);
                        Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
                        $this$commonPut$iv.values = copyOf2;
                    }
                    if ($this$commonPut$iv.size - i$iv2 != 0) {
                        ArraysKt.copyInto($this$commonPut$iv.keys, $this$commonPut$iv.keys, i$iv2 + 1, i$iv2, $this$commonPut$iv.size);
                        ArraysKt.copyInto((T[]) $this$commonPut$iv.values, (T[]) $this$commonPut$iv.values, i$iv2 + 1, i$iv2, $this$commonPut$iv.size);
                    }
                    $this$commonPut$iv.keys[i$iv2] = key;
                    $this$commonPut$iv.values[i$iv2] = value;
                    $this$commonPut$iv.size++;
                } else {
                    $this$commonPut$iv.keys[i$iv2] = key;
                    $this$commonPut$iv.values[i$iv2] = value;
                }
            }
        }
        return mapValue;
    }

    public static final <E> int commonSize(SparseArrayCompat<E> $this$commonSize) {
        Intrinsics.checkNotNullParameter($this$commonSize, "<this>");
        if ($this$commonSize.garbage) {
            gc($this$commonSize);
        }
        return $this$commonSize.size;
    }

    public static final <E> boolean commonIsEmpty(SparseArrayCompat<E> $this$commonIsEmpty) {
        Intrinsics.checkNotNullParameter($this$commonIsEmpty, "<this>");
        return $this$commonIsEmpty.size() == 0;
    }

    public static final <E> int commonKeyAt(SparseArrayCompat<E> $this$commonKeyAt, int index) {
        Intrinsics.checkNotNullParameter($this$commonKeyAt, "<this>");
        if ($this$commonKeyAt.garbage) {
            gc($this$commonKeyAt);
        }
        return $this$commonKeyAt.keys[index];
    }

    public static final <E> E commonValueAt(SparseArrayCompat<E> $this$commonValueAt, int index) {
        Intrinsics.checkNotNullParameter($this$commonValueAt, "<this>");
        if ($this$commonValueAt.garbage) {
            gc($this$commonValueAt);
        }
        return $this$commonValueAt.values[index];
    }

    public static final <E> void commonSetValueAt(SparseArrayCompat<E> $this$commonSetValueAt, int index, E value) {
        Intrinsics.checkNotNullParameter($this$commonSetValueAt, "<this>");
        if ($this$commonSetValueAt.garbage) {
            gc($this$commonSetValueAt);
        }
        $this$commonSetValueAt.values[index] = value;
    }

    public static final <E> int commonIndexOfKey(SparseArrayCompat<E> $this$commonIndexOfKey, int key) {
        Intrinsics.checkNotNullParameter($this$commonIndexOfKey, "<this>");
        if ($this$commonIndexOfKey.garbage) {
            gc($this$commonIndexOfKey);
        }
        return ContainerHelpersKt.binarySearch($this$commonIndexOfKey.keys, $this$commonIndexOfKey.size, key);
    }

    public static final <E> int commonIndexOfValue(SparseArrayCompat<E> $this$commonIndexOfValue, E value) {
        Intrinsics.checkNotNullParameter($this$commonIndexOfValue, "<this>");
        if ($this$commonIndexOfValue.garbage) {
            gc($this$commonIndexOfValue);
        }
        int i = $this$commonIndexOfValue.size;
        for (int i2 = 0; i2 < i; i2++) {
            if ($this$commonIndexOfValue.values[i2] == value) {
                return i2;
            }
        }
        return -1;
    }

    public static final <E> boolean commonContainsKey(SparseArrayCompat<E> $this$commonContainsKey, int key) {
        Intrinsics.checkNotNullParameter($this$commonContainsKey, "<this>");
        return $this$commonContainsKey.indexOfKey(key) >= 0;
    }

    public static final <E> boolean commonContainsValue(SparseArrayCompat<E> $this$commonContainsValue, E value) {
        Intrinsics.checkNotNullParameter($this$commonContainsValue, "<this>");
        SparseArrayCompat $this$commonIndexOfValue$iv = $this$commonContainsValue;
        if ($this$commonIndexOfValue$iv.garbage) {
            gc($this$commonIndexOfValue$iv);
        }
        int i$iv = 0;
        int i = $this$commonIndexOfValue$iv.size;
        while (true) {
            if (i$iv >= i) {
                i$iv = -1;
                break;
            } else if ($this$commonIndexOfValue$iv.values[i$iv] == value) {
                break;
            } else {
                i$iv++;
            }
        }
        return i$iv >= 0;
    }

    public static final <E> void commonClear(SparseArrayCompat<E> $this$commonClear) {
        Intrinsics.checkNotNullParameter($this$commonClear, "<this>");
        int n = $this$commonClear.size;
        Object[] values = $this$commonClear.values;
        for (int i = 0; i < n; i++) {
            values[i] = null;
        }
        $this$commonClear.size = 0;
        $this$commonClear.garbage = false;
    }

    public static final <E> void commonAppend(SparseArrayCompat<E> $this$commonAppend, int key, E value) {
        Intrinsics.checkNotNullParameter($this$commonAppend, "<this>");
        if ($this$commonAppend.size == 0 || key > $this$commonAppend.keys[$this$commonAppend.size - 1]) {
            if ($this$commonAppend.garbage && $this$commonAppend.size >= $this$commonAppend.keys.length) {
                gc($this$commonAppend);
            }
            int pos = $this$commonAppend.size;
            if (pos >= $this$commonAppend.keys.length) {
                int n = ContainerHelpersKt.idealIntArraySize(pos + 1);
                int[] copyOf = Arrays.copyOf($this$commonAppend.keys, n);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                $this$commonAppend.keys = copyOf;
                Object[] copyOf2 = Arrays.copyOf($this$commonAppend.values, n);
                Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
                $this$commonAppend.values = copyOf2;
            }
            $this$commonAppend.keys[pos] = key;
            $this$commonAppend.values[pos] = value;
            $this$commonAppend.size = pos + 1;
            return;
        }
        $this$commonAppend.put(key, value);
    }

    public static final <E> String commonToString(SparseArrayCompat<E> $this$commonToString) {
        Intrinsics.checkNotNullParameter($this$commonToString, "<this>");
        if ($this$commonToString.size() <= 0) {
            return "{}";
        }
        StringBuilder buffer = new StringBuilder($this$commonToString.size * 28);
        buffer.append('{');
        int i = $this$commonToString.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                buffer.append(", ");
            }
            buffer.append($this$commonToString.keyAt(i2));
            buffer.append('=');
            Object value = $this$commonToString.valueAt(i2);
            if (value != $this$commonToString) {
                buffer.append(value);
            } else {
                buffer.append("(this Map)");
            }
        }
        buffer.append('}');
        String sb = buffer.toString();
        Intrinsics.checkNotNullExpressionValue(sb, "buffer.toString()");
        return sb;
    }
}
