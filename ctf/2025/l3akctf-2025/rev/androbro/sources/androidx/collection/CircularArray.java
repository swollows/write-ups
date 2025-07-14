package androidx.collection;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002B\u0011\b\u0007\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0002\u0010\u0014J\u0013\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00028\u0000¢\u0006\u0002\u0010\u0014J\u0006\u0010\u0016\u001a\u00020\u0012J\b\u0010\u0017\u001a\u00020\u0012H\u0002J\u0016\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0019\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010\u001aJ\u0006\u0010\u001b\u001a\u00020\u001cJ\u000b\u0010\u001d\u001a\u00028\u0000¢\u0006\u0002\u0010\fJ\u000b\u0010\u001e\u001a\u00028\u0000¢\u0006\u0002\u0010\fJ\u000e\u0010\u001f\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0004J\u000e\u0010!\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u0004J\u0006\u0010\"\u001a\u00020\u0004R\u000e\u0010\u0006\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0018\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\bX\u000e¢\u0006\u0004\n\u0002\u0010\tR\u0011\u0010\n\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000e\u001a\u00028\u00008F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\fR\u000e\u0010\u0010\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Landroidx/collection/CircularArray;", "E", "", "minCapacity", "", "(I)V", "capacityBitmask", "elements", "", "[Ljava/lang/Object;", "first", "getFirst", "()Ljava/lang/Object;", "head", "last", "getLast", "tail", "addFirst", "", "element", "(Ljava/lang/Object;)V", "addLast", "clear", "doubleCapacity", "get", "index", "(I)Ljava/lang/Object;", "isEmpty", "", "popFirst", "popLast", "removeFromEnd", "count", "removeFromStart", "size", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: CircularArray.kt */
public final class CircularArray<E> {
    private int capacityBitmask;
    private E[] elements;
    private int head;
    private int tail;

    public CircularArray() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    public CircularArray(int minCapacity) {
        int arrayCapacity;
        boolean z = false;
        if (minCapacity >= 1) {
            if (minCapacity <= 1073741824 ? true : z) {
                if (Integer.bitCount(minCapacity) != 1) {
                    arrayCapacity = Integer.highestOneBit(minCapacity - 1) << 1;
                } else {
                    arrayCapacity = minCapacity;
                }
                this.capacityBitmask = arrayCapacity - 1;
                this.elements = new Object[arrayCapacity];
                return;
            }
            throw new IllegalArgumentException("capacity must be <= 2^30".toString());
        }
        throw new IllegalArgumentException("capacity must be >= 1".toString());
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CircularArray(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 8 : i);
    }

    private final void doubleCapacity() {
        int n = this.elements.length;
        int r = n - this.head;
        int newCapacity = n << 1;
        if (newCapacity >= 0) {
            Object[] a = new Object[newCapacity];
            ArraysKt.copyInto((T[]) this.elements, (T[]) a, 0, this.head, n);
            ArraysKt.copyInto((T[]) this.elements, (T[]) a, r, 0, this.head);
            this.elements = a;
            this.head = 0;
            this.tail = n;
            this.capacityBitmask = newCapacity - 1;
            return;
        }
        throw new RuntimeException("Max array capacity exceeded");
    }

    public final void addFirst(E element) {
        this.head = (this.head - 1) & this.capacityBitmask;
        this.elements[this.head] = element;
        if (this.head == this.tail) {
            doubleCapacity();
        }
    }

    public final void addLast(E element) {
        this.elements[this.tail] = element;
        this.tail = (this.tail + 1) & this.capacityBitmask;
        if (this.tail == this.head) {
            doubleCapacity();
        }
    }

    public final E popFirst() {
        if (this.head != this.tail) {
            Object result = this.elements[this.head];
            this.elements[this.head] = null;
            this.head = (this.head + 1) & this.capacityBitmask;
            return result;
        }
        Object result2 = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final E popLast() {
        if (this.head != this.tail) {
            int t = (this.tail - 1) & this.capacityBitmask;
            Object result = this.elements[t];
            this.elements[t] = null;
            this.tail = t;
            return result;
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final void clear() {
        removeFromStart(size());
    }

    public final void removeFromStart(int count) {
        if (count > 0) {
            if (count <= size()) {
                int numOfElements = count;
                int end = this.elements.length;
                if (numOfElements < end - this.head) {
                    end = this.head + numOfElements;
                }
                for (int i = this.head; i < end; i++) {
                    this.elements[i] = null;
                }
                int removed = end - this.head;
                int numOfElements2 = numOfElements - removed;
                this.head = (this.head + removed) & this.capacityBitmask;
                if (numOfElements2 > 0) {
                    for (int i2 = 0; i2 < numOfElements2; i2++) {
                        this.elements[i2] = null;
                    }
                    this.head = numOfElements2;
                    return;
                }
                return;
            }
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public final void removeFromEnd(int count) {
        if (count > 0) {
            if (count <= size()) {
                int numOfElements = count;
                int start = 0;
                if (numOfElements < this.tail) {
                    start = this.tail - numOfElements;
                }
                int i = this.tail;
                for (int i2 = start; i2 < i; i2++) {
                    this.elements[i2] = null;
                }
                int removed = this.tail - start;
                int numOfElements2 = numOfElements - removed;
                this.tail -= removed;
                if (numOfElements2 > 0) {
                    this.tail = this.elements.length;
                    int newTail = this.tail - numOfElements2;
                    int i3 = this.tail;
                    for (int i4 = newTail; i4 < i3; i4++) {
                        this.elements[i4] = null;
                    }
                    this.tail = newTail;
                    return;
                }
                return;
            }
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    public final E getFirst() {
        if (this.head != this.tail) {
            E e = this.elements[this.head];
            Intrinsics.checkNotNull(e);
            return e;
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final E getLast() {
        if (this.head != this.tail) {
            E e = this.elements[(this.tail - 1) & this.capacityBitmask];
            Intrinsics.checkNotNull(e);
            return e;
        }
        CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
        throw new ArrayIndexOutOfBoundsException();
    }

    public final E get(int index) {
        if (index < 0 || index >= size()) {
            CollectionPlatformUtils collectionPlatformUtils = CollectionPlatformUtils.INSTANCE;
            throw new ArrayIndexOutOfBoundsException();
        }
        E e = this.elements[(this.head + index) & this.capacityBitmask];
        Intrinsics.checkNotNull(e);
        return e;
    }

    public final int size() {
        return (this.tail - this.head) & this.capacityBitmask;
    }

    public final boolean isEmpty() {
        return this.head == this.tail;
    }
}
