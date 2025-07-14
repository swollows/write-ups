package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.LongIterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u001d\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0000\u001a.\u0010\n\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\fH\b¢\u0006\u0002\u0010\u0010\u001a\u0019\u0010\u0011\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u0005H\b\u001a!\u0010\u0012\u001a\u00020\u0013\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000eH\b\u001a&\u0010\u0014\u001a\u00020\u0013\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\u000f\u001a\u0002H\fH\b¢\u0006\u0002\u0010\u0015\u001a\u0019\u0010\u0016\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u0005H\b\u001a(\u0010\u0017\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000eH\b¢\u0006\u0002\u0010\u0018\u001a.\u0010\u0017\u001a\u0002H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u0002H\fH\b¢\u0006\u0002\u0010\u001a\u001a:\u0010\u001b\u001a\u0002H\u0004\"\n\b\u0000\u0010\u0004*\u0004\u0018\u0001H\f\"\u0004\b\u0001\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u0002H\u0004H\b¢\u0006\u0002\u0010\u001a\u001a!\u0010\u001c\u001a\u00020\u0003\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000eH\b\u001a&\u0010\u001d\u001a\u00020\u0003\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\u000f\u001a\u0002H\fH\b¢\u0006\u0002\u0010\u001e\u001a\u0019\u0010\u001f\u001a\u00020\u0013\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u0005H\b\u001a!\u0010 \u001a\u00020\u000e\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010!\u001a\u00020\u0003H\b\u001a.\u0010\"\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\fH\b¢\u0006\u0002\u0010\u0010\u001a)\u0010#\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u000e\u0010$\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\f0\u0005H\b\u001a0\u0010%\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\fH\b¢\u0006\u0002\u0010\u001a\u001a!\u0010&\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000eH\b\u001a.\u0010&\u001a\u00020\u0013\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\fH\b¢\u0006\u0002\u0010'\u001a!\u0010(\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010!\u001a\u00020\u0003H\b\u001a0\u0010)\u001a\u0004\u0018\u0001H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\fH\b¢\u0006\u0002\u0010\u001a\u001a6\u0010)\u001a\u00020\u0013\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010*\u001a\u0002H\f2\u0006\u0010+\u001a\u0002H\fH\b¢\u0006\u0002\u0010,\u001a.\u0010-\u001a\u00020\u000b\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010!\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u0002H\fH\b¢\u0006\u0002\u0010.\u001a\u0019\u0010/\u001a\u00020\u0003\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u0005H\b\u001a\u0019\u00100\u001a\u000201\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u0005H\b\u001a&\u00102\u001a\u0002H\f\"\u0004\b\u0000\u0010\f*\b\u0012\u0004\u0012\u0002H\f0\u00052\u0006\u0010!\u001a\u00020\u0003H\b¢\u0006\u0002\u00103\u001a!\u00104\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\r\u001a\u00020\u000eH\n\u001aT\u00105\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u000526\u00106\u001a2\u0012\u0013\u0012\u00110\u000e¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(\r\u0012\u0013\u0012\u0011H\u0004¢\u0006\f\b8\u0012\b\b9\u0012\u0004\b\b(\u000f\u0012\u0004\u0012\u00020\u000b07H\bø\u0001\u0000\u001a.\u0010:\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0019\u001a\u0002H\u0004H\b¢\u0006\u0002\u0010\u001a\u001a7\u0010;\u001a\u0002H\u0004\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\r\u001a\u00020\u000e2\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u0002H\u00040<H\bø\u0001\u0000¢\u0006\u0002\u0010=\u001a\u0019\u0010>\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005H\b\u001a\u0016\u0010?\u001a\u00020@\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005\u001a-\u0010A\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0005\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\f\u0010$\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0005H\u0002\u001a-\u0010B\u001a\u00020\u0013\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\u0004H\u0007¢\u0006\u0002\u0010'\u001a.\u0010C\u001a\u00020\u000b\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00052\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u0002H\u0004H\n¢\u0006\u0002\u0010\u0010\u001a\u001c\u0010D\u001a\b\u0012\u0004\u0012\u0002H\u00040E\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u0005\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000\"(\u0010\u0002\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00040\u00058Æ\u0002¢\u0006\f\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\u0002\u0007\n\u0005\b20\u0001¨\u0006F"}, d2 = {"DELETED", "", "size", "", "T", "Landroidx/collection/LongSparseArray;", "getSize$annotations", "(Landroidx/collection/LongSparseArray;)V", "getSize", "(Landroidx/collection/LongSparseArray;)I", "commonAppend", "", "E", "key", "", "value", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)V", "commonClear", "commonContainsKey", "", "commonContainsValue", "(Landroidx/collection/LongSparseArray;Ljava/lang/Object;)Z", "commonGc", "commonGet", "(Landroidx/collection/LongSparseArray;J)Ljava/lang/Object;", "defaultValue", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)Ljava/lang/Object;", "commonGetInternal", "commonIndexOfKey", "commonIndexOfValue", "(Landroidx/collection/LongSparseArray;Ljava/lang/Object;)I", "commonIsEmpty", "commonKeyAt", "index", "commonPut", "commonPutAll", "other", "commonPutIfAbsent", "commonRemove", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;)Z", "commonRemoveAt", "commonReplace", "oldValue", "newValue", "(Landroidx/collection/LongSparseArray;JLjava/lang/Object;Ljava/lang/Object;)Z", "commonSetValueAt", "(Landroidx/collection/LongSparseArray;ILjava/lang/Object;)V", "commonSize", "commonToString", "", "commonValueAt", "(Landroidx/collection/LongSparseArray;I)Ljava/lang/Object;", "contains", "forEach", "action", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "getOrDefault", "getOrElse", "Lkotlin/Function0;", "(Landroidx/collection/LongSparseArray;JLkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "isNotEmpty", "keyIterator", "Lkotlin/collections/LongIterator;", "plus", "remove", "set", "valueIterator", "", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LongSparseArray.kt */
public final class LongSparseArrayKt {
    /* access modifiers changed from: private */
    public static final Object DELETED = new Object();

    public static /* synthetic */ void getSize$annotations(LongSparseArray longSparseArray) {
    }

    public static final <E> E commonGet(LongSparseArray<E> $this$commonGet, long key) {
        Intrinsics.checkNotNullParameter($this$commonGet, "<this>");
        LongSparseArray $this$commonGetInternal$iv = $this$commonGet;
        int i$iv = ContainerHelpersKt.binarySearch($this$commonGetInternal$iv.keys, $this$commonGetInternal$iv.size, key);
        if (i$iv < 0 || $this$commonGetInternal$iv.values[i$iv] == DELETED) {
            return null;
        }
        return $this$commonGetInternal$iv.values[i$iv];
    }

    public static final <E> E commonGet(LongSparseArray<E> $this$commonGet, long key, E defaultValue) {
        Intrinsics.checkNotNullParameter($this$commonGet, "<this>");
        LongSparseArray $this$commonGetInternal$iv = $this$commonGet;
        int i$iv = ContainerHelpersKt.binarySearch($this$commonGetInternal$iv.keys, $this$commonGetInternal$iv.size, key);
        if (i$iv < 0 || $this$commonGetInternal$iv.values[i$iv] == DELETED) {
            return defaultValue;
        }
        return $this$commonGetInternal$iv.values[i$iv];
    }

    public static final <T extends E, E> T commonGetInternal(LongSparseArray<E> $this$commonGetInternal, long key, T defaultValue) {
        Intrinsics.checkNotNullParameter($this$commonGetInternal, "<this>");
        int i = ContainerHelpersKt.binarySearch($this$commonGetInternal.keys, $this$commonGetInternal.size, key);
        if (i < 0 || $this$commonGetInternal.values[i] == DELETED) {
            return defaultValue;
        }
        return $this$commonGetInternal.values[i];
    }

    public static final <E> void commonRemove(LongSparseArray<E> $this$commonRemove, long key) {
        Intrinsics.checkNotNullParameter($this$commonRemove, "<this>");
        int i = ContainerHelpersKt.binarySearch($this$commonRemove.keys, $this$commonRemove.size, key);
        if (i >= 0 && $this$commonRemove.values[i] != DELETED) {
            $this$commonRemove.values[i] = DELETED;
            $this$commonRemove.garbage = true;
        }
    }

    public static final <E> boolean commonRemove(LongSparseArray<E> $this$commonRemove, long key, E value) {
        Intrinsics.checkNotNullParameter($this$commonRemove, "<this>");
        int index = $this$commonRemove.indexOfKey(key);
        if (index < 0 || !Intrinsics.areEqual((Object) value, $this$commonRemove.valueAt(index))) {
            return false;
        }
        $this$commonRemove.removeAt(index);
        return true;
    }

    public static final <E> void commonRemoveAt(LongSparseArray<E> $this$commonRemoveAt, int index) {
        Intrinsics.checkNotNullParameter($this$commonRemoveAt, "<this>");
        if ($this$commonRemoveAt.values[index] != DELETED) {
            $this$commonRemoveAt.values[index] = DELETED;
            $this$commonRemoveAt.garbage = true;
        }
    }

    public static final <E> E commonReplace(LongSparseArray<E> $this$commonReplace, long key, E value) {
        Intrinsics.checkNotNullParameter($this$commonReplace, "<this>");
        int index = $this$commonReplace.indexOfKey(key);
        if (index < 0) {
            return null;
        }
        Object oldValue = $this$commonReplace.values[index];
        $this$commonReplace.values[index] = value;
        return oldValue;
    }

    public static final <E> boolean commonReplace(LongSparseArray<E> $this$commonReplace, long key, E oldValue, E newValue) {
        Intrinsics.checkNotNullParameter($this$commonReplace, "<this>");
        int index = $this$commonReplace.indexOfKey(key);
        if (index < 0 || !Intrinsics.areEqual($this$commonReplace.values[index], (Object) oldValue)) {
            return false;
        }
        $this$commonReplace.values[index] = newValue;
        return true;
    }

    public static final <E> void commonGc(LongSparseArray<E> $this$commonGc) {
        Intrinsics.checkNotNullParameter($this$commonGc, "<this>");
        int n = $this$commonGc.size;
        int newSize = 0;
        long[] keys = $this$commonGc.keys;
        Object[] values = $this$commonGc.values;
        for (int i = 0; i < n; i++) {
            Object value = values[i];
            if (value != DELETED) {
                if (i != newSize) {
                    keys[newSize] = keys[i];
                    values[newSize] = value;
                    values[i] = null;
                }
                newSize++;
            }
        }
        $this$commonGc.garbage = false;
        $this$commonGc.size = newSize;
    }

    public static final <E> void commonPut(LongSparseArray<E> $this$commonPut, long key, E value) {
        Intrinsics.checkNotNullParameter($this$commonPut, "<this>");
        int index = ContainerHelpersKt.binarySearch($this$commonPut.keys, $this$commonPut.size, key);
        if (index >= 0) {
            $this$commonPut.values[index] = value;
            return;
        }
        int index2 = ~index;
        if (index2 >= $this$commonPut.size || $this$commonPut.values[index2] != DELETED) {
            if ($this$commonPut.garbage && $this$commonPut.size >= $this$commonPut.keys.length) {
                LongSparseArray $this$commonGc$iv = $this$commonPut;
                int n$iv = $this$commonGc$iv.size;
                int newSize$iv = 0;
                long[] keys$iv = $this$commonGc$iv.keys;
                Object[] values$iv = $this$commonGc$iv.values;
                for (int i$iv = 0; i$iv < n$iv; i$iv++) {
                    Object value$iv = values$iv[i$iv];
                    if (value$iv != DELETED) {
                        if (i$iv != newSize$iv) {
                            keys$iv[newSize$iv] = keys$iv[i$iv];
                            values$iv[newSize$iv] = value$iv;
                            values$iv[i$iv] = null;
                        }
                        newSize$iv++;
                    }
                }
                $this$commonGc$iv.garbage = false;
                $this$commonGc$iv.size = newSize$iv;
                index2 = ~ContainerHelpersKt.binarySearch($this$commonPut.keys, $this$commonPut.size, key);
            }
            if ($this$commonPut.size >= $this$commonPut.keys.length) {
                int newSize = ContainerHelpersKt.idealLongArraySize($this$commonPut.size + 1);
                long[] copyOf = Arrays.copyOf($this$commonPut.keys, newSize);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                $this$commonPut.keys = copyOf;
                Object[] copyOf2 = Arrays.copyOf($this$commonPut.values, newSize);
                Intrinsics.checkNotNullExpressionValue(copyOf2, "copyOf(this, newSize)");
                $this$commonPut.values = copyOf2;
            }
            if ($this$commonPut.size - index2 != 0) {
                ArraysKt.copyInto($this$commonPut.keys, $this$commonPut.keys, index2 + 1, index2, $this$commonPut.size);
                ArraysKt.copyInto((T[]) $this$commonPut.values, (T[]) $this$commonPut.values, index2 + 1, index2, $this$commonPut.size);
            }
            $this$commonPut.keys[index2] = key;
            $this$commonPut.values[index2] = value;
            $this$commonPut.size++;
            return;
        }
        $this$commonPut.keys[index2] = key;
        $this$commonPut.values[index2] = value;
    }

    public static final <E> void commonPutAll(LongSparseArray<E> $this$commonPutAll, LongSparseArray<? extends E> other) {
        Intrinsics.checkNotNullParameter($this$commonPutAll, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        int size = other.size();
        for (int i = 0; i < size; i++) {
            int i2 = i;
            $this$commonPutAll.put(other.keyAt(i2), other.valueAt(i2));
        }
    }

    public static final <E> E commonPutIfAbsent(LongSparseArray<E> $this$commonPutIfAbsent, long key, E value) {
        Intrinsics.checkNotNullParameter($this$commonPutIfAbsent, "<this>");
        Object mapValue = $this$commonPutIfAbsent.get(key);
        if (mapValue == null) {
            $this$commonPutIfAbsent.put(key, value);
        }
        return mapValue;
    }

    public static final <E> int commonSize(LongSparseArray<E> $this$commonSize) {
        Intrinsics.checkNotNullParameter($this$commonSize, "<this>");
        if ($this$commonSize.garbage) {
            LongSparseArray $this$commonGc$iv = $this$commonSize;
            int n$iv = $this$commonGc$iv.size;
            int newSize$iv = 0;
            long[] keys$iv = $this$commonGc$iv.keys;
            Object[] values$iv = $this$commonGc$iv.values;
            for (int i$iv = 0; i$iv < n$iv; i$iv++) {
                Object value$iv = values$iv[i$iv];
                if (value$iv != DELETED) {
                    if (i$iv != newSize$iv) {
                        keys$iv[newSize$iv] = keys$iv[i$iv];
                        values$iv[newSize$iv] = value$iv;
                        values$iv[i$iv] = null;
                    }
                    newSize$iv++;
                }
            }
            $this$commonGc$iv.garbage = false;
            $this$commonGc$iv.size = newSize$iv;
        }
        return $this$commonSize.size;
    }

    public static final <E> boolean commonIsEmpty(LongSparseArray<E> $this$commonIsEmpty) {
        Intrinsics.checkNotNullParameter($this$commonIsEmpty, "<this>");
        return $this$commonIsEmpty.size() == 0;
    }

    public static final <E> long commonKeyAt(LongSparseArray<E> $this$commonKeyAt, int index) {
        Intrinsics.checkNotNullParameter($this$commonKeyAt, "<this>");
        if (index >= 0 && index < $this$commonKeyAt.size) {
            if ($this$commonKeyAt.garbage) {
                LongSparseArray $this$commonGc$iv = $this$commonKeyAt;
                int n$iv = $this$commonGc$iv.size;
                int newSize$iv = 0;
                long[] keys$iv = $this$commonGc$iv.keys;
                Object[] values$iv = $this$commonGc$iv.values;
                for (int i$iv = 0; i$iv < n$iv; i$iv++) {
                    Object value$iv = values$iv[i$iv];
                    if (value$iv != DELETED) {
                        if (i$iv != newSize$iv) {
                            keys$iv[newSize$iv] = keys$iv[i$iv];
                            values$iv[newSize$iv] = value$iv;
                            values$iv[i$iv] = null;
                        }
                        newSize$iv++;
                    }
                }
                $this$commonGc$iv.garbage = false;
                $this$commonGc$iv.size = newSize$iv;
            }
            return $this$commonKeyAt.keys[index];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + index).toString());
    }

    public static final <E> E commonValueAt(LongSparseArray<E> $this$commonValueAt, int index) {
        Intrinsics.checkNotNullParameter($this$commonValueAt, "<this>");
        if (index >= 0 && index < $this$commonValueAt.size) {
            if ($this$commonValueAt.garbage) {
                LongSparseArray $this$commonGc$iv = $this$commonValueAt;
                int n$iv = $this$commonGc$iv.size;
                int newSize$iv = 0;
                long[] keys$iv = $this$commonGc$iv.keys;
                Object[] values$iv = $this$commonGc$iv.values;
                for (int i$iv = 0; i$iv < n$iv; i$iv++) {
                    Object value$iv = values$iv[i$iv];
                    if (value$iv != DELETED) {
                        if (i$iv != newSize$iv) {
                            keys$iv[newSize$iv] = keys$iv[i$iv];
                            values$iv[newSize$iv] = value$iv;
                            values$iv[i$iv] = null;
                        }
                        newSize$iv++;
                    }
                }
                $this$commonGc$iv.garbage = false;
                $this$commonGc$iv.size = newSize$iv;
            }
            return $this$commonValueAt.values[index];
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + index).toString());
    }

    public static final <E> void commonSetValueAt(LongSparseArray<E> $this$commonSetValueAt, int index, E value) {
        Intrinsics.checkNotNullParameter($this$commonSetValueAt, "<this>");
        if (index >= 0 && index < $this$commonSetValueAt.size) {
            if ($this$commonSetValueAt.garbage) {
                LongSparseArray $this$commonGc$iv = $this$commonSetValueAt;
                int n$iv = $this$commonGc$iv.size;
                int newSize$iv = 0;
                long[] keys$iv = $this$commonGc$iv.keys;
                Object[] values$iv = $this$commonGc$iv.values;
                for (int i$iv = 0; i$iv < n$iv; i$iv++) {
                    Object value$iv = values$iv[i$iv];
                    if (value$iv != DELETED) {
                        if (i$iv != newSize$iv) {
                            keys$iv[newSize$iv] = keys$iv[i$iv];
                            values$iv[newSize$iv] = value$iv;
                            values$iv[i$iv] = null;
                        }
                        newSize$iv++;
                    }
                }
                $this$commonGc$iv.garbage = false;
                $this$commonGc$iv.size = newSize$iv;
            }
            $this$commonSetValueAt.values[index] = value;
            return;
        }
        throw new IllegalArgumentException(("Expected index to be within 0..size()-1, but was " + index).toString());
    }

    public static final <E> int commonIndexOfKey(LongSparseArray<E> $this$commonIndexOfKey, long key) {
        Intrinsics.checkNotNullParameter($this$commonIndexOfKey, "<this>");
        if ($this$commonIndexOfKey.garbage) {
            LongSparseArray $this$commonGc$iv = $this$commonIndexOfKey;
            int n$iv = $this$commonGc$iv.size;
            int newSize$iv = 0;
            long[] keys$iv = $this$commonGc$iv.keys;
            Object[] values$iv = $this$commonGc$iv.values;
            for (int i$iv = 0; i$iv < n$iv; i$iv++) {
                Object value$iv = values$iv[i$iv];
                if (value$iv != DELETED) {
                    if (i$iv != newSize$iv) {
                        keys$iv[newSize$iv] = keys$iv[i$iv];
                        values$iv[newSize$iv] = value$iv;
                        values$iv[i$iv] = null;
                    }
                    newSize$iv++;
                }
            }
            $this$commonGc$iv.garbage = false;
            $this$commonGc$iv.size = newSize$iv;
        }
        return ContainerHelpersKt.binarySearch($this$commonIndexOfKey.keys, $this$commonIndexOfKey.size, key);
    }

    public static final <E> int commonIndexOfValue(LongSparseArray<E> $this$commonIndexOfValue, E value) {
        Intrinsics.checkNotNullParameter($this$commonIndexOfValue, "<this>");
        if ($this$commonIndexOfValue.garbage) {
            LongSparseArray $this$commonGc$iv = $this$commonIndexOfValue;
            int n$iv = $this$commonGc$iv.size;
            int newSize$iv = 0;
            long[] keys$iv = $this$commonGc$iv.keys;
            Object[] values$iv = $this$commonGc$iv.values;
            for (int i$iv = 0; i$iv < n$iv; i$iv++) {
                Object value$iv = values$iv[i$iv];
                if (value$iv != DELETED) {
                    if (i$iv != newSize$iv) {
                        keys$iv[newSize$iv] = keys$iv[i$iv];
                        values$iv[newSize$iv] = value$iv;
                        values$iv[i$iv] = null;
                    }
                    newSize$iv++;
                }
            }
            $this$commonGc$iv.garbage = false;
            $this$commonGc$iv.size = newSize$iv;
        }
        int i = $this$commonIndexOfValue.size;
        for (int i2 = 0; i2 < i; i2++) {
            int i3 = i2;
            if ($this$commonIndexOfValue.values[i3] == value) {
                return i3;
            }
        }
        return -1;
    }

    public static final <E> boolean commonContainsKey(LongSparseArray<E> $this$commonContainsKey, long key) {
        Intrinsics.checkNotNullParameter($this$commonContainsKey, "<this>");
        return $this$commonContainsKey.indexOfKey(key) >= 0;
    }

    public static final <E> boolean commonContainsValue(LongSparseArray<E> $this$commonContainsValue, E value) {
        Intrinsics.checkNotNullParameter($this$commonContainsValue, "<this>");
        return $this$commonContainsValue.indexOfValue(value) >= 0;
    }

    public static final <E> void commonClear(LongSparseArray<E> $this$commonClear) {
        Intrinsics.checkNotNullParameter($this$commonClear, "<this>");
        int n = $this$commonClear.size;
        Object[] values = $this$commonClear.values;
        for (int i = 0; i < n; i++) {
            values[i] = null;
        }
        $this$commonClear.size = 0;
        $this$commonClear.garbage = false;
    }

    public static final <E> void commonAppend(LongSparseArray<E> $this$commonAppend, long key, E value) {
        Intrinsics.checkNotNullParameter($this$commonAppend, "<this>");
        if ($this$commonAppend.size == 0 || key > $this$commonAppend.keys[$this$commonAppend.size - 1]) {
            if ($this$commonAppend.garbage && $this$commonAppend.size >= $this$commonAppend.keys.length) {
                LongSparseArray $this$commonGc$iv = $this$commonAppend;
                int n$iv = $this$commonGc$iv.size;
                int newSize$iv = 0;
                long[] keys$iv = $this$commonGc$iv.keys;
                Object[] values$iv = $this$commonGc$iv.values;
                for (int i$iv = 0; i$iv < n$iv; i$iv++) {
                    Object value$iv = values$iv[i$iv];
                    if (value$iv != DELETED) {
                        if (i$iv != newSize$iv) {
                            keys$iv[newSize$iv] = keys$iv[i$iv];
                            values$iv[newSize$iv] = value$iv;
                            values$iv[i$iv] = null;
                        }
                        newSize$iv++;
                    }
                }
                $this$commonGc$iv.garbage = false;
                $this$commonGc$iv.size = newSize$iv;
            }
            int pos = $this$commonAppend.size;
            if (pos >= $this$commonAppend.keys.length) {
                int newSize = ContainerHelpersKt.idealLongArraySize(pos + 1);
                long[] copyOf = Arrays.copyOf($this$commonAppend.keys, newSize);
                Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
                $this$commonAppend.keys = copyOf;
                Object[] copyOf2 = Arrays.copyOf($this$commonAppend.values, newSize);
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

    public static final <E> String commonToString(LongSparseArray<E> $this$commonToString) {
        Intrinsics.checkNotNullParameter($this$commonToString, "<this>");
        if ($this$commonToString.size() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder($this$commonToString.size * 28);
        StringBuilder $this$commonToString_u24lambda_u245 = sb;
        $this$commonToString_u24lambda_u245.append('{');
        int i = $this$commonToString.size;
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                $this$commonToString_u24lambda_u245.append(", ");
            }
            $this$commonToString_u24lambda_u245.append($this$commonToString.keyAt(i2));
            $this$commonToString_u24lambda_u245.append('=');
            Object value = $this$commonToString.valueAt(i2);
            if (value != $this$commonToString_u24lambda_u245) {
                $this$commonToString_u24lambda_u245.append(value);
            } else {
                $this$commonToString_u24lambda_u245.append("(this Map)");
            }
        }
        $this$commonToString_u24lambda_u245.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public static final <T> int getSize(LongSparseArray<T> $this$size) {
        Intrinsics.checkNotNullParameter($this$size, "<this>");
        return $this$size.size();
    }

    public static final <T> boolean contains(LongSparseArray<T> $this$contains, long key) {
        Intrinsics.checkNotNullParameter($this$contains, "<this>");
        return $this$contains.containsKey(key);
    }

    public static final <T> void set(LongSparseArray<T> $this$set, long key, T value) {
        Intrinsics.checkNotNullParameter($this$set, "<this>");
        $this$set.put(key, value);
    }

    public static final <T> LongSparseArray<T> plus(LongSparseArray<T> $this$plus, LongSparseArray<T> other) {
        Intrinsics.checkNotNullParameter($this$plus, "<this>");
        Intrinsics.checkNotNullParameter(other, "other");
        LongSparseArray longSparseArray = new LongSparseArray($this$plus.size() + other.size());
        longSparseArray.putAll($this$plus);
        longSparseArray.putAll(other);
        return longSparseArray;
    }

    public static final <T> T getOrDefault(LongSparseArray<T> $this$getOrDefault, long key, T defaultValue) {
        Intrinsics.checkNotNullParameter($this$getOrDefault, "<this>");
        return $this$getOrDefault.get(key, defaultValue);
    }

    public static final <T> T getOrElse(LongSparseArray<T> $this$getOrElse, long key, Function0<? extends T> defaultValue) {
        Intrinsics.checkNotNullParameter($this$getOrElse, "<this>");
        Intrinsics.checkNotNullParameter(defaultValue, "defaultValue");
        T t = $this$getOrElse.get(key);
        return t == null ? defaultValue.invoke() : t;
    }

    public static final <T> boolean isNotEmpty(LongSparseArray<T> $this$isNotEmpty) {
        Intrinsics.checkNotNullParameter($this$isNotEmpty, "<this>");
        return !$this$isNotEmpty.isEmpty();
    }

    public static final <T> void forEach(LongSparseArray<T> $this$forEach, Function2<? super Long, ? super T, Unit> action) {
        Intrinsics.checkNotNullParameter($this$forEach, "<this>");
        Intrinsics.checkNotNullParameter(action, "action");
        int size = $this$forEach.size();
        for (int index = 0; index < size; index++) {
            action.invoke(Long.valueOf($this$forEach.keyAt(index)), $this$forEach.valueAt(index));
        }
    }

    public static final <T> LongIterator keyIterator(LongSparseArray<T> $this$keyIterator) {
        Intrinsics.checkNotNullParameter($this$keyIterator, "<this>");
        return new LongSparseArrayKt$keyIterator$1($this$keyIterator);
    }

    public static final <T> Iterator<T> valueIterator(LongSparseArray<T> $this$valueIterator) {
        Intrinsics.checkNotNullParameter($this$valueIterator, "<this>");
        return new LongSparseArrayKt$valueIterator$1($this$valueIterator);
    }
}
