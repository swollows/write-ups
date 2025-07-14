package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableCollection;
import kotlin.jvm.internal.markers.KMutableSet;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001f\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010)\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003:\u0001?B\u0019\b\u0016\u0012\u0010\u0010\u0004\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\u0000¢\u0006\u0002\u0010\u0005B\u0017\b\u0016\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B\u0019\b\u0016\u0012\u0010\u0010\b\u001a\f\u0012\u0006\b\u0001\u0012\u00028\u0000\u0018\u00010\t¢\u0006\u0002\u0010\nB\u0011\b\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\f¢\u0006\u0002\u0010\rJ\u0015\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\"J\u0016\u0010#\u001a\u00020$2\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000J\u0016\u0010#\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\b\u0010&\u001a\u00020$H\u0016J\u0016\u0010'\u001a\u00020 2\u0006\u0010!\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\"J\u0016\u0010(\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\u000e\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020\fJ\u0013\u0010+\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010\u0012H\u0002J\b\u0010-\u001a\u00020\fH\u0016J\u0010\u0010.\u001a\u00020\f2\b\u0010/\u001a\u0004\u0018\u00010\u0012J\b\u00100\u001a\u00020 H\u0016J\u000f\u00101\u001a\b\u0012\u0004\u0012\u00028\u000002H\u0002J\u0015\u00103\u001a\u00020 2\u0006\u0010!\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\"J\u0016\u00104\u001a\u00020 2\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0000J\u0016\u00104\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\u0013\u00105\u001a\u00028\u00002\u0006\u00106\u001a\u00020\f¢\u0006\u0002\u00107J\u0016\u00108\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016J\u0013\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\t¢\u0006\u0002\u0010\u0014J%\u00109\u001a\b\u0012\u0004\u0012\u0002H:0\t\"\u0004\b\u0001\u0010:2\f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H:0\t¢\u0006\u0002\u0010;J\b\u0010<\u001a\u00020=H\u0016J\u0013\u0010>\u001a\u00028\u00002\u0006\u00106\u001a\u00020\f¢\u0006\u0002\u00107R\u001a\u0010\u000e\u001a\u00020\fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\rR$\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\tX\u000e¢\u0006\u0010\n\u0002\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\nR\u001a\u0010\u0017\u001a\u00020\u0018X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\f8VX\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u0010¨\u0006@"}, d2 = {"Landroidx/collection/ArraySet;", "E", "", "", "set", "(Landroidx/collection/ArraySet;)V", "", "(Ljava/util/Collection;)V", "array", "", "([Ljava/lang/Object;)V", "capacity", "", "(I)V", "_size", "get_size$collection", "()I", "set_size$collection", "", "getArray$collection", "()[Ljava/lang/Object;", "setArray$collection", "[Ljava/lang/Object;", "hashes", "", "getHashes$collection", "()[I", "setHashes$collection", "([I)V", "size", "getSize", "add", "", "element", "(Ljava/lang/Object;)Z", "addAll", "", "elements", "clear", "contains", "containsAll", "ensureCapacity", "minimumCapacity", "equals", "other", "hashCode", "indexOf", "key", "isEmpty", "iterator", "", "remove", "removeAll", "removeAt", "index", "(I)Ljava/lang/Object;", "retainAll", "toArray", "T", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toString", "", "valueAt", "ElementIterator", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ArraySet.jvm.kt */
public final class ArraySet<E> implements Collection<E>, Set<E>, KMutableCollection, KMutableSet {
    private int _size;
    private Object[] array;
    private int[] hashes;

    public ArraySet() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public ArraySet(int capacity) {
        this.hashes = ContainerHelpersKt.EMPTY_INTS;
        this.array = ContainerHelpersKt.EMPTY_OBJECTS;
        if (capacity > 0) {
            ArraySetKt.allocArrays(this, capacity);
        }
    }

    public final /* bridge */ int size() {
        return getSize();
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ArraySet(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i);
    }

    public final int[] getHashes$collection() {
        return this.hashes;
    }

    public final void setHashes$collection(int[] iArr) {
        Intrinsics.checkNotNullParameter(iArr, "<set-?>");
        this.hashes = iArr;
    }

    public final Object[] getArray$collection() {
        return this.array;
    }

    public final void setArray$collection(Object[] objArr) {
        Intrinsics.checkNotNullParameter(objArr, "<set-?>");
        this.array = objArr;
    }

    public final int get_size$collection() {
        return this._size;
    }

    public final void set_size$collection(int i) {
        this._size = i;
    }

    public int getSize() {
        return this._size;
    }

    public ArraySet(ArraySet<? extends E> set) {
        this(0);
        if (set != null) {
            addAll(set);
        }
    }

    public ArraySet(Collection<? extends E> set) {
        this(0);
        if (set != null) {
            addAll(set);
        }
    }

    public ArraySet(E[] array2) {
        this(0);
        if (array2 != null) {
            Iterator it = ArrayIteratorKt.iterator(array2);
            while (it.hasNext()) {
                add(it.next());
            }
        }
    }

    public void clear() {
        if (get_size$collection() != 0) {
            setHashes$collection(ContainerHelpersKt.EMPTY_INTS);
            setArray$collection(ContainerHelpersKt.EMPTY_OBJECTS);
            set_size$collection(0);
        }
        if (get_size$collection() != 0) {
            throw new ConcurrentModificationException();
        }
    }

    public final void ensureCapacity(int minimumCapacity) {
        int oSize$iv = get_size$collection();
        if (getHashes$collection().length < minimumCapacity) {
            int[] ohashes$iv = getHashes$collection();
            Object[] oarray$iv = getArray$collection();
            ArraySetKt.allocArrays(this, minimumCapacity);
            if (get_size$collection() > 0) {
                ArraysKt.copyInto$default(ohashes$iv, getHashes$collection(), 0, 0, get_size$collection(), 6, (Object) null);
                ArraysKt.copyInto$default(oarray$iv, getArray$collection(), 0, 0, get_size$collection(), 6, (Object) null);
            }
        }
        if (get_size$collection() != oSize$iv) {
            throw new ConcurrentModificationException();
        }
    }

    public boolean contains(Object element) {
        return indexOf(element) >= 0;
    }

    public final int indexOf(Object key) {
        return key == null ? ArraySetKt.indexOfNull(this) : ArraySetKt.indexOf(this, key, key.hashCode());
    }

    public final E valueAt(int index) {
        return getArray$collection()[index];
    }

    public boolean isEmpty() {
        return get_size$collection() <= 0;
    }

    public boolean add(E element) {
        int index$iv;
        int hash$iv;
        E e = element;
        int oSize$iv = get_size$collection();
        if (e == null) {
            hash$iv = 0;
            index$iv = ArraySetKt.indexOfNull(this);
        } else {
            hash$iv = element.hashCode();
            index$iv = ArraySetKt.indexOf(this, e, hash$iv);
        }
        boolean z = false;
        if (index$iv >= 0) {
            return false;
        }
        int index$iv2 = ~index$iv;
        if (oSize$iv >= getHashes$collection().length) {
            int n$iv = 8;
            if (oSize$iv >= 8) {
                n$iv = (oSize$iv >> 1) + oSize$iv;
            } else if (oSize$iv < 4) {
                n$iv = 4;
            }
            int[] ohashes$iv = getHashes$collection();
            Object[] oarray$iv = getArray$collection();
            ArraySetKt.allocArrays(this, n$iv);
            if (oSize$iv == get_size$collection()) {
                if (getHashes$collection().length == 0) {
                    z = true;
                }
                if (!z) {
                    Object[] oarray$iv2 = oarray$iv;
                    int[] iArr = ohashes$iv;
                    ArraysKt.copyInto$default(ohashes$iv, getHashes$collection(), 0, 0, ohashes$iv.length, 6, (Object) null);
                    ArraysKt.copyInto$default(oarray$iv2, getArray$collection(), 0, 0, oarray$iv2.length, 6, (Object) null);
                } else {
                    int[] iArr2 = ohashes$iv;
                }
            } else {
                throw new ConcurrentModificationException();
            }
        }
        if (index$iv2 < oSize$iv) {
            ArraysKt.copyInto(getHashes$collection(), getHashes$collection(), index$iv2 + 1, index$iv2, oSize$iv);
            ArraysKt.copyInto((T[]) getArray$collection(), (T[]) getArray$collection(), index$iv2 + 1, index$iv2, oSize$iv);
        }
        if (oSize$iv != get_size$collection() || index$iv2 >= getHashes$collection().length) {
            throw new ConcurrentModificationException();
        }
        getHashes$collection()[index$iv2] = hash$iv;
        getArray$collection()[index$iv2] = e;
        set_size$collection(get_size$collection() + 1);
        return true;
    }

    public final void addAll(ArraySet<? extends E> array2) {
        Intrinsics.checkNotNullParameter(array2, "array");
        int n$iv = array2.get_size$collection();
        ensureCapacity(get_size$collection() + n$iv);
        if (get_size$collection() != 0) {
            for (int i$iv = 0; i$iv < n$iv; i$iv++) {
                add(array2.valueAt(i$iv));
            }
        } else if (n$iv > 0) {
            int i = n$iv;
            ArraysKt.copyInto$default(array2.getHashes$collection(), getHashes$collection(), 0, 0, i, 6, (Object) null);
            ArraysKt.copyInto$default(array2.getArray$collection(), getArray$collection(), 0, 0, i, 6, (Object) null);
            if (get_size$collection() == 0) {
                set_size$collection(n$iv);
                return;
            }
            throw new ConcurrentModificationException();
        }
    }

    public boolean remove(Object element) {
        int index$iv = indexOf(element);
        if (index$iv < 0) {
            return false;
        }
        removeAt(index$iv);
        return true;
    }

    public final E removeAt(int index) {
        int i = index;
        int oSize$iv = get_size$collection();
        Object old$iv = getArray$collection()[i];
        if (oSize$iv <= 1) {
            clear();
        } else {
            int nSize$iv = oSize$iv - 1;
            int n$iv = 8;
            if (getHashes$collection().length <= 8 || get_size$collection() >= getHashes$collection().length / 3) {
                if (i < nSize$iv) {
                    ArraysKt.copyInto(getHashes$collection(), getHashes$collection(), i, i + 1, nSize$iv + 1);
                    ArraysKt.copyInto((T[]) getArray$collection(), (T[]) getArray$collection(), i, i + 1, nSize$iv + 1);
                }
                getArray$collection()[nSize$iv] = null;
            } else {
                if (get_size$collection() > 8) {
                    n$iv = get_size$collection() + (get_size$collection() >> 1);
                }
                int[] ohashes$iv = getHashes$collection();
                Object[] oarray$iv = getArray$collection();
                ArraySetKt.allocArrays(this, n$iv);
                if (i > 0) {
                    int i2 = index;
                    ArraysKt.copyInto$default(ohashes$iv, getHashes$collection(), 0, 0, i2, 6, (Object) null);
                    ArraysKt.copyInto$default(oarray$iv, getArray$collection(), 0, 0, i2, 6, (Object) null);
                }
                if (i < nSize$iv) {
                    ArraysKt.copyInto(ohashes$iv, getHashes$collection(), i, i + 1, nSize$iv + 1);
                    ArraysKt.copyInto((T[]) oarray$iv, (T[]) getArray$collection(), i, i + 1, nSize$iv + 1);
                }
            }
            if (oSize$iv == get_size$collection()) {
                set_size$collection(nSize$iv);
            } else {
                throw new ConcurrentModificationException();
            }
        }
        return old$iv;
    }

    public final boolean removeAll(ArraySet<? extends E> array2) {
        Intrinsics.checkNotNullParameter(array2, "array");
        int n$iv = array2.get_size$collection();
        int originalSize$iv = get_size$collection();
        for (int i$iv = 0; i$iv < n$iv; i$iv++) {
            remove(array2.valueAt(i$iv));
        }
        return originalSize$iv != get_size$collection();
    }

    public final Object[] toArray() {
        return ArraysKt.copyOfRange((T[]) this.array, 0, this._size);
    }

    public final <T> T[] toArray(T[] array2) {
        Intrinsics.checkNotNullParameter(array2, "array");
        Object[] result = ArraySetJvmUtil.resizeForToArray(array2, this._size);
        ArraysKt.copyInto((T[]) this.array, (T[]) result, 0, 0, this._size);
        Intrinsics.checkNotNullExpressionValue(result, "result");
        return result;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Set)) {
            return false;
        }
        if (size() != ((Set) other).size()) {
            return false;
        }
        try {
            int i = get_size$collection();
            for (int i$iv = 0; i$iv < i; i$iv++) {
                if (!((Set) other).contains(valueAt(i$iv))) {
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

    public int hashCode() {
        int[] hashes$iv = getHashes$collection();
        int s$iv = get_size$collection();
        int result$iv = 0;
        for (int i$iv = 0; i$iv < s$iv; i$iv++) {
            result$iv += hashes$iv[i$iv];
        }
        return result$iv;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(get_size$collection() * 14);
        StringBuilder $this$toStringInternal_u24lambda_u240$iv = sb;
        $this$toStringInternal_u24lambda_u240$iv.append('{');
        int i = get_size$collection();
        for (int i$iv = 0; i$iv < i; i$iv++) {
            if (i$iv > 0) {
                $this$toStringInternal_u24lambda_u240$iv.append(", ");
            }
            Object value$iv = valueAt(i$iv);
            if (value$iv != this) {
                $this$toStringInternal_u24lambda_u240$iv.append(value$iv);
            } else {
                $this$toStringInternal_u24lambda_u240$iv.append("(this Set)");
            }
        }
        $this$toStringInternal_u24lambda_u240$iv.append('}');
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder(capacity).…builderAction).toString()");
        return sb2;
    }

    public Iterator<E> iterator() {
        return new ElementIterator();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¢\u0006\u0002\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0014¨\u0006\t"}, d2 = {"Landroidx/collection/ArraySet$ElementIterator;", "Landroidx/collection/IndexBasedArrayIterator;", "(Landroidx/collection/ArraySet;)V", "elementAt", "index", "", "(I)Ljava/lang/Object;", "removeAt", "", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: ArraySet.jvm.kt */
    private final class ElementIterator extends IndexBasedArrayIterator<E> {
        public ElementIterator() {
            super(ArraySet.this.get_size$collection());
        }

        /* access modifiers changed from: protected */
        public E elementAt(int index) {
            return ArraySet.this.valueAt(index);
        }

        /* access modifiers changed from: protected */
        public void removeAt(int index) {
            ArraySet.this.removeAt(index);
        }
    }

    public boolean containsAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (Object item$iv : elements) {
            if (!contains(item$iv)) {
                return false;
            }
        }
        return true;
    }

    public boolean addAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        ensureCapacity(get_size$collection() + elements.size());
        boolean added$iv = false;
        for (Object value$iv : elements) {
            added$iv |= add(value$iv);
        }
        return added$iv;
    }

    public boolean removeAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean removed$iv = false;
        for (Object value$iv : elements) {
            removed$iv |= remove(value$iv);
        }
        return removed$iv;
    }

    public boolean retainAll(Collection<? extends Object> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean removed$iv = false;
        int i$iv = get_size$collection();
        while (true) {
            i$iv--;
            if (-1 >= i$iv) {
                return removed$iv;
            }
            if (!CollectionsKt.contains(elements, getArray$collection()[i$iv])) {
                removeAt(i$iv);
                removed$iv = true;
            }
        }
    }
}
