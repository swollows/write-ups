package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u000e\n\u0002\u0010\u0000\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0015\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u0004H\b\u001a+\u0010\u0002\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0003\"\u0004\b\u0000\u0010\u00042\u0012\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00040\u0006\"\u0002H\u0004¢\u0006\u0002\u0010\u0007\u001a)\u0010\b\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0003H\b\u001a'\u0010\b\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000eH\b\u001a&\u0010\u000f\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010\u0010\u001a\u0002H\nH\b¢\u0006\u0002\u0010\u0011\u001a \u0010\u0012\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010\u0013\u001a\u00020\u0001H\u0000\u001a \u0010\u0014\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010\u0015\u001a\u00020\u0001H\u0000\u001a\u0019\u0010\u0016\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u0003H\b\u001a'\u0010\u0017\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000eH\b\u001a&\u0010\u0018\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010\u0010\u001a\u0002H\nH\b¢\u0006\u0002\u0010\u0011\u001a!\u0010\u0019\u001a\u00020\t\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010\u001a\u001a\u00020\u0001H\b\u001a#\u0010\u001b\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\b\u001a\u0019\u0010\u001e\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u0003H\b\u001a*\u0010\u001f\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\b\u0010 \u001a\u0004\u0018\u00010\u001d2\u0006\u0010\u0015\u001a\u00020\u0001H\u0000\u001a#\u0010!\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\b\u0010 \u001a\u0004\u0018\u00010\u001dH\b\u001a\u0018\u0010\"\u001a\u00020\u0001\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u0003H\u0000\u001a\u0019\u0010#\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u0003H\b\u001a)\u0010$\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\n0\u0003H\b\u001a'\u0010$\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000eH\b\u001a&\u0010%\u001a\u0002H\n\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010&\u001a\u00020\u0001H\b¢\u0006\u0002\u0010'\u001a&\u0010(\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010\u0010\u001a\u0002H\nH\b¢\u0006\u0002\u0010\u0011\u001a'\u0010)\u001a\u00020\f\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\n0\u000eH\b\u001a\u0019\u0010*\u001a\u00020+\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u0003H\b\u001a&\u0010,\u001a\u0002H\n\"\u0004\b\u0000\u0010\n*\b\u0012\u0004\u0012\u0002H\n0\u00032\u0006\u0010&\u001a\u00020\u0001H\b¢\u0006\u0002\u0010'\"\u000e\u0010\u0000\u001a\u00020\u0001XT¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"ARRAY_SET_BASE_SIZE", "", "arraySetOf", "Landroidx/collection/ArraySet;", "T", "values", "", "([Ljava/lang/Object;)Landroidx/collection/ArraySet;", "addAllInternal", "", "E", "array", "", "elements", "", "addInternal", "element", "(Landroidx/collection/ArraySet;Ljava/lang/Object;)Z", "allocArrays", "size", "binarySearchInternal", "hash", "clearInternal", "containsAllInternal", "containsInternal", "ensureCapacityInternal", "minimumCapacity", "equalsInternal", "other", "", "hashCodeInternal", "indexOf", "key", "indexOfInternal", "indexOfNull", "isEmptyInternal", "removeAllInternal", "removeAtInternal", "index", "(Landroidx/collection/ArraySet;I)Ljava/lang/Object;", "removeInternal", "retainAllInternal", "toStringInternal", "", "valueAtInternal", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ArraySet.kt */
public final class ArraySetKt {
    public static final int ARRAY_SET_BASE_SIZE = 4;

    public static final <T> ArraySet<T> arraySetOf() {
        return new ArraySet<>(0, 1, (DefaultConstructorMarker) null);
    }

    public static final <T> ArraySet<T> arraySetOf(T... values) {
        Intrinsics.checkNotNullParameter(values, "values");
        ArraySet set = new ArraySet(values.length);
        for (Object value : values) {
            set.add(value);
        }
        return set;
    }

    public static final <E> int binarySearchInternal(ArraySet<E> $this$binarySearchInternal, int hash) {
        Intrinsics.checkNotNullParameter($this$binarySearchInternal, "<this>");
        try {
            return ContainerHelpersKt.binarySearch($this$binarySearchInternal.getHashes$collection(), $this$binarySearchInternal.get_size$collection(), hash);
        } catch (IndexOutOfBoundsException e) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> int indexOf(ArraySet<E> $this$indexOf, Object key, int hash) {
        Intrinsics.checkNotNullParameter($this$indexOf, "<this>");
        int n = $this$indexOf.get_size$collection();
        if (n == 0) {
            return -1;
        }
        int index = binarySearchInternal($this$indexOf, hash);
        if (index < 0 || Intrinsics.areEqual(key, $this$indexOf.getArray$collection()[index])) {
            return index;
        }
        int end = index + 1;
        while (end < n && $this$indexOf.getHashes$collection()[end] == hash) {
            if (Intrinsics.areEqual(key, $this$indexOf.getArray$collection()[end])) {
                return end;
            }
            end++;
        }
        int i = index - 1;
        while (i >= 0 && $this$indexOf.getHashes$collection()[i] == hash) {
            if (Intrinsics.areEqual(key, $this$indexOf.getArray$collection()[i])) {
                return i;
            }
            i--;
        }
        return ~end;
    }

    public static final <E> int indexOfNull(ArraySet<E> $this$indexOfNull) {
        Intrinsics.checkNotNullParameter($this$indexOfNull, "<this>");
        return indexOf($this$indexOfNull, (Object) null, 0);
    }

    public static final <E> void allocArrays(ArraySet<E> $this$allocArrays, int size) {
        Intrinsics.checkNotNullParameter($this$allocArrays, "<this>");
        $this$allocArrays.setHashes$collection(new int[size]);
        $this$allocArrays.setArray$collection(new Object[size]);
    }

    public static final <E> void clearInternal(ArraySet<E> $this$clearInternal) {
        Intrinsics.checkNotNullParameter($this$clearInternal, "<this>");
        if ($this$clearInternal.get_size$collection() != 0) {
            $this$clearInternal.setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
            $this$clearInternal.setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
            $this$clearInternal.set_size$collection(0);
        }
        if ($this$clearInternal.get_size$collection() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> void ensureCapacityInternal(ArraySet<E> $this$ensureCapacityInternal, int minimumCapacity) {
        Intrinsics.checkNotNullParameter($this$ensureCapacityInternal, "<this>");
        int oSize = $this$ensureCapacityInternal.get_size$collection();
        if ($this$ensureCapacityInternal.getHashes$collection().length < minimumCapacity) {
            int[] ohashes = $this$ensureCapacityInternal.getHashes$collection();
            Object[] oarray = $this$ensureCapacityInternal.getArray$collection();
            allocArrays($this$ensureCapacityInternal, minimumCapacity);
            if ($this$ensureCapacityInternal.get_size$collection() > 0) {
                ArraysKt.copyInto$default(ohashes, $this$ensureCapacityInternal.getHashes$collection(), 0, 0, $this$ensureCapacityInternal.get_size$collection(), 6, (Object) null);
                ArraysKt.copyInto$default(oarray, $this$ensureCapacityInternal.getArray$collection(), 0, 0, $this$ensureCapacityInternal.get_size$collection(), 6, (Object) null);
            }
        }
        if ($this$ensureCapacityInternal.get_size$collection() != oSize) {
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean containsInternal(ArraySet<E> $this$containsInternal, E element) {
        Intrinsics.checkNotNullParameter($this$containsInternal, "<this>");
        return $this$containsInternal.indexOf(element) >= 0;
    }

    public static final <E> int indexOfInternal(ArraySet<E> $this$indexOfInternal, Object key) {
        Intrinsics.checkNotNullParameter($this$indexOfInternal, "<this>");
        return key == null ? indexOfNull($this$indexOfInternal) : indexOf($this$indexOfInternal, key, key.hashCode());
    }

    public static final <E> E valueAtInternal(ArraySet<E> $this$valueAtInternal, int index) {
        Intrinsics.checkNotNullParameter($this$valueAtInternal, "<this>");
        return $this$valueAtInternal.getArray$collection()[index];
    }

    public static final <E> boolean isEmptyInternal(ArraySet<E> $this$isEmptyInternal) {
        Intrinsics.checkNotNullParameter($this$isEmptyInternal, "<this>");
        return $this$isEmptyInternal.get_size$collection() <= 0;
    }

    public static final <E> boolean addInternal(ArraySet<E> $this$addInternal, E element) {
        int index;
        int hash;
        ArraySet<E> arraySet = $this$addInternal;
        E e = element;
        Intrinsics.checkNotNullParameter(arraySet, "<this>");
        int oSize = $this$addInternal.get_size$collection();
        if (e == null) {
            hash = 0;
            index = indexOfNull($this$addInternal);
        } else {
            hash = element.hashCode();
            index = indexOf(arraySet, e, hash);
        }
        boolean z = false;
        if (index >= 0) {
            return false;
        }
        int index2 = ~index;
        if (oSize >= $this$addInternal.getHashes$collection().length) {
            int n = 8;
            if (oSize >= 8) {
                n = (oSize >> 1) + oSize;
            } else if (oSize < 4) {
                n = 4;
            }
            int[] ohashes = $this$addInternal.getHashes$collection();
            Object[] oarray = $this$addInternal.getArray$collection();
            allocArrays(arraySet, n);
            if (oSize == $this$addInternal.get_size$collection()) {
                if ($this$addInternal.getHashes$collection().length == 0) {
                    z = true;
                }
                if (!z) {
                    Object[] oarray2 = oarray;
                    int[] iArr = ohashes;
                    ArraysKt.copyInto$default(ohashes, $this$addInternal.getHashes$collection(), 0, 0, ohashes.length, 6, (Object) null);
                    ArraysKt.copyInto$default(oarray2, $this$addInternal.getArray$collection(), 0, 0, oarray2.length, 6, (Object) null);
                } else {
                    int[] iArr2 = ohashes;
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (index2 < oSize) {
            ArraysKt.copyInto($this$addInternal.getHashes$collection(), $this$addInternal.getHashes$collection(), index2 + 1, index2, oSize);
            ArraysKt.copyInto((T[]) $this$addInternal.getArray$collection(), (T[]) $this$addInternal.getArray$collection(), index2 + 1, index2, oSize);
        }
        if (oSize != $this$addInternal.get_size$collection() || index2 >= $this$addInternal.getHashes$collection().length) {
            throw new ConcurrentModificationException();
        }
        $this$addInternal.getHashes$collection()[index2] = hash;
        $this$addInternal.getArray$collection()[index2] = e;
        arraySet.set_size$collection($this$addInternal.get_size$collection() + 1);
        return true;
    }

    public static final <E> void addAllInternal(ArraySet<E> $this$addAllInternal, ArraySet<? extends E> array) {
        Intrinsics.checkNotNullParameter($this$addAllInternal, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        int n = array.get_size$collection();
        $this$addAllInternal.ensureCapacity($this$addAllInternal.get_size$collection() + n);
        if ($this$addAllInternal.get_size$collection() != 0) {
            for (int i = 0; i < n; i++) {
                $this$addAllInternal.add(array.valueAt(i));
            }
        } else if (n > 0) {
            int i2 = n;
            ArraysKt.copyInto$default(array.getHashes$collection(), $this$addAllInternal.getHashes$collection(), 0, 0, i2, 6, (Object) null);
            ArraysKt.copyInto$default(array.getArray$collection(), $this$addAllInternal.getArray$collection(), 0, 0, i2, 6, (Object) null);
            if ($this$addAllInternal.get_size$collection() == 0) {
                $this$addAllInternal.set_size$collection(n);
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    public static final <E> boolean removeInternal(ArraySet<E> $this$removeInternal, E element) {
        Intrinsics.checkNotNullParameter($this$removeInternal, "<this>");
        int index = $this$removeInternal.indexOf(element);
        if (index < 0) {
            return false;
        }
        $this$removeInternal.removeAt(index);
        return true;
    }

    public static final <E> E removeAtInternal(ArraySet<E> $this$removeAtInternal, int index) {
        Intrinsics.checkNotNullParameter($this$removeAtInternal, "<this>");
        int oSize = $this$removeAtInternal.get_size$collection();
        Object old = $this$removeAtInternal.getArray$collection()[index];
        if (oSize <= 1) {
            $this$removeAtInternal.clear();
        } else {
            int nSize = oSize - 1;
            int n = 8;
            if ($this$removeAtInternal.getHashes$collection().length <= 8 || $this$removeAtInternal.get_size$collection() >= $this$removeAtInternal.getHashes$collection().length / 3) {
                if (index < nSize) {
                    ArraysKt.copyInto($this$removeAtInternal.getHashes$collection(), $this$removeAtInternal.getHashes$collection(), index, index + 1, nSize + 1);
                    ArraysKt.copyInto((T[]) $this$removeAtInternal.getArray$collection(), (T[]) $this$removeAtInternal.getArray$collection(), index, index + 1, nSize + 1);
                }
                $this$removeAtInternal.getArray$collection()[nSize] = null;
            } else {
                if ($this$removeAtInternal.get_size$collection() > 8) {
                    n = $this$removeAtInternal.get_size$collection() + ($this$removeAtInternal.get_size$collection() >> 1);
                }
                int[] ohashes = $this$removeAtInternal.getHashes$collection();
                Object[] oarray = $this$removeAtInternal.getArray$collection();
                allocArrays($this$removeAtInternal, n);
                if (index > 0) {
                    int i = index;
                    ArraysKt.copyInto$default(ohashes, $this$removeAtInternal.getHashes$collection(), 0, 0, i, 6, (Object) null);
                    ArraysKt.copyInto$default(oarray, $this$removeAtInternal.getArray$collection(), 0, 0, i, 6, (Object) null);
                }
                if (index < nSize) {
                    ArraysKt.copyInto(ohashes, $this$removeAtInternal.getHashes$collection(), index, index + 1, nSize + 1);
                    ArraysKt.copyInto((T[]) oarray, (T[]) $this$removeAtInternal.getArray$collection(), index, index + 1, nSize + 1);
                }
            }
            if (oSize == $this$removeAtInternal.get_size$collection()) {
                $this$removeAtInternal.set_size$collection(nSize);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return old;
    }

    public static final <E> boolean removeAllInternal(ArraySet<E> $this$removeAllInternal, ArraySet<? extends E> array) {
        Intrinsics.checkNotNullParameter($this$removeAllInternal, "<this>");
        Intrinsics.checkNotNullParameter(array, "array");
        int n = array.get_size$collection();
        int originalSize = $this$removeAllInternal.get_size$collection();
        for (int i = 0; i < n; i++) {
            $this$removeAllInternal.remove(array.valueAt(i));
        }
        return originalSize != $this$removeAllInternal.get_size$collection();
    }

    public static final <E> boolean equalsInternal(ArraySet<E> $this$equalsInternal, Object other) {
        Intrinsics.checkNotNullParameter($this$equalsInternal, "<this>");
        if ($this$equalsInternal == other) {
            return true;
        }
        if (!(other instanceof Set) || $this$equalsInternal.size() != ((Set) other).size()) {
            return false;
        }
        try {
            int i = $this$equalsInternal.get_size$collection();
            for (int i2 = 0; i2 < i; i2++) {
                if (!((Set) other).contains($this$equalsInternal.valueAt(i2))) {
                    return false;
                }
            }
            return true;
        } catch (NullPointerException e) {
            return false;
        } catch (ClassCastException e2) {
            return false;
        }
    }

    public static final <E> int hashCodeInternal(ArraySet<E> $this$hashCodeInternal) {
        Intrinsics.checkNotNullParameter($this$hashCodeInternal, "<this>");
        int[] hashes = $this$hashCodeInternal.getHashes$collection();
        int s = $this$hashCodeInternal.get_size$collection();
        int result = 0;
        for (int i = 0; i < s; i++) {
            result += hashes[i];
        }
        return result;
    }

    public static final <E> String toStringInternal(ArraySet<E> $this$toStringInternal) {
        Intrinsics.checkNotNullParameter($this$toStringInternal, "<this>");
        if ($this$toStringInternal.isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder($this$toStringInternal.get_size$collection() * 14);
        StringBuilder $this$toStringInternal_u24lambda_u240 = sb;
        $this$toStringInternal_u24lambda_u240.append('{');
        int i = $this$toStringInternal.get_size$collection();
        for (int i2 = 0; i2 < i; i2++) {
            if (i2 > 0) {
                $this$toStringInternal_u24lambda_u240.append(", ");
            }
            Object value = $this$toStringInternal.valueAt(i2);
            if (value != $this$toStringInternal) {
                $this$toStringInternal_u24lambda_u240.append(value);
            } else {
                $this$toStringInternal_u24lambda_u240.append("(this Set)");
            }
        }
        $this$toStringInternal_u24lambda_u240.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public static final <E> boolean containsAllInternal(ArraySet<E> $this$containsAllInternal, Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter($this$containsAllInternal, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (Object item : elements) {
            if (!$this$containsAllInternal.contains(item)) {
                return false;
            }
        }
        return true;
    }

    public static final <E> boolean addAllInternal(ArraySet<E> $this$addAllInternal, Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter($this$addAllInternal, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        $this$addAllInternal.ensureCapacity($this$addAllInternal.get_size$collection() + elements.size());
        boolean added = false;
        for (Object value : elements) {
            added |= $this$addAllInternal.add(value);
        }
        return added;
    }

    public static final <E> boolean removeAllInternal(ArraySet<E> $this$removeAllInternal, Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter($this$removeAllInternal, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean removed = false;
        for (Object value : elements) {
            removed |= $this$removeAllInternal.remove(value);
        }
        return removed;
    }

    public static final <E> boolean retainAllInternal(ArraySet<E> $this$retainAllInternal, Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter($this$retainAllInternal, "<this>");
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean removed = false;
        int i = $this$retainAllInternal.get_size$collection();
        while (true) {
            i--;
            if (-1 >= i) {
                return removed;
            }
            if (!CollectionsKt.contains(elements, $this$retainAllInternal.getArray$collection()[i])) {
                $this$retainAllInternal.removeAt(i);
                removed = true;
            }
        }
    }
}
