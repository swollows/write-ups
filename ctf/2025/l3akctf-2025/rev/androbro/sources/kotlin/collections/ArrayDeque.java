package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u001b\b\u0007\u0018\u0000 P*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0001PB\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005B\u0007\b\u0016¢\u0006\u0002\u0010\u0006B\u0015\b\u0016\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0002\u0010\tJ\u0015\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u001d\u0010\u0013\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0018\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0016\u0010\u001a\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0013\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\u0013\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cJ\b\u0010\u001e\u001a\u00020\u0017H\u0016J\u0016\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u0016J\u001e\u0010 \u001a\u00020\u00172\u0006\u0010!\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0002J\u0010\u0010\"\u001a\u00020\u00172\u0006\u0010#\u001a\u00020\u0004H\u0002J\u0010\u0010$\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0010\u0010%\u001a\u00020\u00172\u0006\u0010&\u001a\u00020\u0004H\u0002J\u001d\u0010'\u001a\u00020\u00142\u0012\u0010(\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00140)H\bJ\u000b\u0010*\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010,\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0016\u0010-\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0002¢\u0006\u0002\u0010.J\u0010\u0010/\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0015\u00100\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\u0016\u00102\u001a\u00028\u00002\u0006\u0010!\u001a\u00020\u0004H\b¢\u0006\u0002\u0010.J\u0011\u0010!\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\bJM\u00103\u001a\u00020\u00172>\u00104\u001a:\u0012\u0013\u0012\u00110\u0004¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(\u000e\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000b¢\u0006\f\b6\u0012\b\b7\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\u001705H\u0000¢\u0006\u0002\b8J\b\u00109\u001a\u00020\u0014H\u0016J\u000b\u0010:\u001a\u00028\u0000¢\u0006\u0002\u0010+J\u0015\u0010;\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00101J\r\u0010<\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0010\u0010=\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0010\u0010>\u001a\u00020\u00042\u0006\u0010\u0018\u001a\u00020\u0004H\u0002J\u0015\u0010?\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0016J\u0016\u0010@\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u0015\u0010A\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u0004H\u0016¢\u0006\u0002\u0010.J\u000b\u0010B\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010C\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u000b\u0010D\u001a\u00028\u0000¢\u0006\u0002\u0010+J\r\u0010E\u001a\u0004\u0018\u00018\u0000¢\u0006\u0002\u0010+J\u0016\u0010F\u001a\u00020\u00142\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH\u0016J\u001e\u0010G\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\u0015\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010HJ\u0017\u0010I\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0000¢\u0006\u0004\bJ\u0010KJ)\u0010I\u001a\b\u0012\u0004\u0012\u0002HL0\u000b\"\u0004\b\u0001\u0010L2\f\u0010M\u001a\b\u0012\u0004\u0012\u0002HL0\u000bH\u0000¢\u0006\u0004\bJ\u0010NJ\u0015\u0010O\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bH\u0016¢\u0006\u0002\u0010KJ'\u0010O\u001a\b\u0012\u0004\u0012\u0002HL0\u000b\"\u0004\b\u0001\u0010L2\f\u0010M\u001a\b\u0012\u0004\u0012\u0002HL0\u000bH\u0016¢\u0006\u0002\u0010NR\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\f0\u000bX\u000e¢\u0006\u0004\n\u0002\u0010\rR\u000e\u0010\u000e\u001a\u00020\u0004X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u0004@RX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006Q"}, d2 = {"Lkotlin/collections/ArrayDeque;", "E", "Lkotlin/collections/AbstractMutableList;", "initialCapacity", "", "(I)V", "()V", "elements", "", "(Ljava/util/Collection;)V", "elementData", "", "", "[Ljava/lang/Object;", "head", "<set-?>", "size", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "addFirst", "(Ljava/lang/Object;)V", "addLast", "clear", "contains", "copyCollectionElements", "internalIndex", "copyElements", "newCapacity", "decremented", "ensureCapacity", "minCapacity", "filterInPlace", "predicate", "Lkotlin/Function1;", "first", "()Ljava/lang/Object;", "firstOrNull", "get", "(I)Ljava/lang/Object;", "incremented", "indexOf", "(Ljava/lang/Object;)I", "internalGet", "internalStructure", "structure", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "internalStructure$kotlin_stdlib", "isEmpty", "last", "lastIndexOf", "lastOrNull", "negativeMod", "positiveMod", "remove", "removeAll", "removeAt", "removeFirst", "removeFirstOrNull", "removeLast", "removeLastOrNull", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "testToArray", "testToArray$kotlin_stdlib", "()[Ljava/lang/Object;", "T", "array", "([Ljava/lang/Object;)[Ljava/lang/Object;", "toArray", "Companion", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: ArrayDeque.kt */
public final class ArrayDeque<E> extends AbstractMutableList<E> {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final int defaultMinCapacity = 10;
    private static final Object[] emptyElementData = new Object[0];
    private Object[] elementData;
    private int head;
    private int size;

    public int getSize() {
        return this.size;
    }

    public ArrayDeque(int initialCapacity) {
        Object[] objArr;
        if (initialCapacity == 0) {
            objArr = emptyElementData;
        } else if (initialCapacity > 0) {
            objArr = new Object[initialCapacity];
        } else {
            throw new IllegalArgumentException("Illegal Capacity: " + initialCapacity);
        }
        this.elementData = objArr;
    }

    public ArrayDeque() {
        this.elementData = emptyElementData;
    }

    public ArrayDeque(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean z = false;
        this.elementData = elements.toArray(new Object[0]);
        this.size = this.elementData.length;
        if (this.elementData.length == 0 ? true : z) {
            this.elementData = emptyElementData;
        }
    }

    private final void ensureCapacity(int minCapacity) {
        if (minCapacity < 0) {
            throw new IllegalStateException("Deque is too big.");
        } else if (minCapacity > this.elementData.length) {
            if (this.elementData == emptyElementData) {
                this.elementData = new Object[RangesKt.coerceAtLeast(minCapacity, 10)];
            } else {
                copyElements(AbstractList.Companion.newCapacity$kotlin_stdlib(this.elementData.length, minCapacity));
            }
        }
    }

    private final void copyElements(int newCapacity) {
        Object[] newElements = new Object[newCapacity];
        ArraysKt.copyInto((T[]) this.elementData, (T[]) newElements, 0, this.head, this.elementData.length);
        ArraysKt.copyInto((T[]) this.elementData, (T[]) newElements, this.elementData.length - this.head, 0, this.head);
        this.head = 0;
        this.elementData = newElements;
    }

    private final E internalGet(int internalIndex) {
        return this.elementData[internalIndex];
    }

    private final int positiveMod(int index) {
        return index >= this.elementData.length ? index - this.elementData.length : index;
    }

    private final int negativeMod(int index) {
        return index < 0 ? this.elementData.length + index : index;
    }

    private final int internalIndex(int index) {
        return positiveMod(this.head + index);
    }

    private final int incremented(int index) {
        if (index == ArraysKt.getLastIndex((T[]) this.elementData)) {
            return 0;
        }
        return index + 1;
    }

    private final int decremented(int index) {
        return index == 0 ? ArraysKt.getLastIndex((T[]) this.elementData) : index - 1;
    }

    public boolean isEmpty() {
        return size() == 0;
    }

    public final E first() {
        if (!isEmpty()) {
            return this.elementData[this.head];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E firstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return this.elementData[this.head];
    }

    public final E last() {
        if (!isEmpty()) {
            return this.elementData[positiveMod(this.head + CollectionsKt.getLastIndex(this))];
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E lastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return this.elementData[positiveMod(this.head + CollectionsKt.getLastIndex(this))];
    }

    public final void addFirst(E element) {
        ensureCapacity(size() + 1);
        this.head = decremented(this.head);
        this.elementData[this.head] = element;
        this.size = size() + 1;
    }

    public final void addLast(E element) {
        ensureCapacity(size() + 1);
        this.elementData[positiveMod(this.head + size())] = element;
        this.size = size() + 1;
    }

    public final E removeFirst() {
        if (!isEmpty()) {
            Object element = this.elementData[this.head];
            this.elementData[this.head] = null;
            this.head = incremented(this.head);
            this.size = size() - 1;
            return element;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeFirstOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeFirst();
    }

    public final E removeLast() {
        if (!isEmpty()) {
            int internalLastIndex = positiveMod(this.head + CollectionsKt.getLastIndex(this));
            Object element = this.elementData[internalLastIndex];
            this.elementData[internalLastIndex] = null;
            this.size = size() - 1;
            return element;
        }
        throw new NoSuchElementException("ArrayDeque is empty.");
    }

    public final E removeLastOrNull() {
        if (isEmpty()) {
            return null;
        }
        return removeLast();
    }

    public boolean add(E element) {
        addLast(element);
        return true;
    }

    public void add(int index, E element) {
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, size());
        if (index == size()) {
            addLast(element);
        } else if (index == 0) {
            addFirst(element);
        } else {
            ensureCapacity(size() + 1);
            int internalIndex = positiveMod(this.head + index);
            if (index < ((size() + 1) >> 1)) {
                int decrementedInternalIndex = decremented(internalIndex);
                int decrementedHead = decremented(this.head);
                if (decrementedInternalIndex >= this.head) {
                    this.elementData[decrementedHead] = this.elementData[this.head];
                    ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, this.head, this.head + 1, decrementedInternalIndex + 1);
                } else {
                    ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, this.head - 1, this.head, this.elementData.length);
                    this.elementData[this.elementData.length - 1] = this.elementData[0];
                    ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, 0, 1, decrementedInternalIndex + 1);
                }
                this.elementData[decrementedInternalIndex] = element;
                this.head = decrementedHead;
            } else {
                int tail = positiveMod(this.head + size());
                if (internalIndex < tail) {
                    ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, internalIndex + 1, internalIndex, tail);
                } else {
                    ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, 1, 0, tail);
                    this.elementData[0] = this.elementData[this.elementData.length - 1];
                    ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, internalIndex + 1, internalIndex, this.elementData.length - 1);
                }
                this.elementData[internalIndex] = element;
            }
            this.size = size() + 1;
        }
    }

    private final void copyCollectionElements(int internalIndex, Collection<? extends E> elements) {
        Iterator iterator = elements.iterator();
        int length = this.elementData.length;
        for (int index = internalIndex; index < length && iterator.hasNext(); index++) {
            this.elementData[index] = iterator.next();
        }
        int i = this.head;
        for (int index2 = 0; index2 < i && iterator.hasNext(); index2++) {
            this.elementData[index2] = iterator.next();
        }
        this.size = size() + elements.size();
    }

    public boolean addAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (elements.isEmpty()) {
            return false;
        }
        ensureCapacity(size() + elements.size());
        copyCollectionElements(positiveMod(this.head + size()), elements);
        return true;
    }

    public boolean addAll(int index, Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        AbstractList.Companion.checkPositionIndex$kotlin_stdlib(index, size());
        if (elements.isEmpty()) {
            return false;
        }
        if (index == size()) {
            return addAll(elements);
        }
        ensureCapacity(size() + elements.size());
        int tail = positiveMod(this.head + size());
        int internalIndex = positiveMod(this.head + index);
        int elementsSize = elements.size();
        if (index < ((size() + 1) >> 1)) {
            int shiftedHead = this.head - elementsSize;
            if (internalIndex < this.head) {
                ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, shiftedHead, this.head, this.elementData.length);
                if (elementsSize >= internalIndex) {
                    ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, this.elementData.length - elementsSize, 0, internalIndex);
                } else {
                    ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, this.elementData.length - elementsSize, 0, elementsSize);
                    ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, 0, elementsSize, internalIndex);
                }
            } else if (shiftedHead >= 0) {
                ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, shiftedHead, this.head, internalIndex);
            } else {
                shiftedHead += this.elementData.length;
                int elementsToShift = internalIndex - this.head;
                int shiftToBack = this.elementData.length - shiftedHead;
                if (shiftToBack >= elementsToShift) {
                    ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, shiftedHead, this.head, internalIndex);
                } else {
                    ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, shiftedHead, this.head, this.head + shiftToBack);
                    ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, 0, this.head + shiftToBack, internalIndex);
                }
            }
            this.head = shiftedHead;
            copyCollectionElements(negativeMod(internalIndex - elementsSize), elements);
        } else {
            int shiftedInternalIndex = internalIndex + elementsSize;
            if (internalIndex >= tail) {
                ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, elementsSize, 0, tail);
                if (shiftedInternalIndex >= this.elementData.length) {
                    ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, shiftedInternalIndex - this.elementData.length, internalIndex, this.elementData.length);
                } else {
                    ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, 0, this.elementData.length - elementsSize, this.elementData.length);
                    ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, shiftedInternalIndex, internalIndex, this.elementData.length - elementsSize);
                }
            } else if (tail + elementsSize <= this.elementData.length) {
                ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, shiftedInternalIndex, internalIndex, tail);
            } else if (shiftedInternalIndex >= this.elementData.length) {
                ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, shiftedInternalIndex - this.elementData.length, internalIndex, tail);
            } else {
                int shiftToFront = (tail + elementsSize) - this.elementData.length;
                ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, 0, tail - shiftToFront, tail);
                ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, shiftedInternalIndex, internalIndex, tail - shiftToFront);
            }
            copyCollectionElements(internalIndex, elements);
        }
        return true;
    }

    public E get(int index) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, size());
        return this.elementData[positiveMod(this.head + index)];
    }

    public E set(int index, E element) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, size());
        int internalIndex = positiveMod(this.head + index);
        Object oldElement = this.elementData[internalIndex];
        this.elementData[internalIndex] = element;
        return oldElement;
    }

    public boolean contains(Object element) {
        return indexOf(element) != -1;
    }

    public int indexOf(Object element) {
        int tail = positiveMod(this.head + size());
        if (this.head < tail) {
            for (int index = this.head; index < tail; index++) {
                if (Intrinsics.areEqual(element, this.elementData[index])) {
                    return index - this.head;
                }
            }
            return -1;
        } else if (this.head < tail) {
            return -1;
        } else {
            int length = this.elementData.length;
            for (int index2 = this.head; index2 < length; index2++) {
                if (Intrinsics.areEqual(element, this.elementData[index2])) {
                    return index2 - this.head;
                }
            }
            for (int index3 = 0; index3 < tail; index3++) {
                if (Intrinsics.areEqual(element, this.elementData[index3])) {
                    return (this.elementData.length + index3) - this.head;
                }
            }
            return -1;
        }
    }

    public int lastIndexOf(Object element) {
        int tail = positiveMod(this.head + size());
        if (this.head < tail) {
            int index = tail - 1;
            int i = this.head;
            if (i <= index) {
                while (!Intrinsics.areEqual(element, this.elementData[index])) {
                    if (index != i) {
                        index--;
                    }
                }
                return index - this.head;
            }
        } else if (this.head > tail) {
            for (int index2 = tail - 1; -1 < index2; index2--) {
                if (Intrinsics.areEqual(element, this.elementData[index2])) {
                    return (this.elementData.length + index2) - this.head;
                }
            }
            int index3 = ArraysKt.getLastIndex((T[]) this.elementData);
            int i2 = this.head;
            if (i2 <= index3) {
                while (!Intrinsics.areEqual(element, this.elementData[index3])) {
                    if (index3 != i2) {
                        index3--;
                    }
                }
                return index3 - this.head;
            }
        }
        return -1;
    }

    public boolean remove(Object element) {
        int index = indexOf(element);
        if (index == -1) {
            return false;
        }
        remove(index);
        return true;
    }

    public E removeAt(int index) {
        AbstractList.Companion.checkElementIndex$kotlin_stdlib(index, size());
        if (index == CollectionsKt.getLastIndex(this)) {
            return removeLast();
        }
        if (index == 0) {
            return removeFirst();
        }
        int internalIndex = positiveMod(this.head + index);
        Object element = this.elementData[internalIndex];
        if (index < (size() >> 1)) {
            if (internalIndex >= this.head) {
                ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, this.head + 1, this.head, internalIndex);
            } else {
                ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, 1, 0, internalIndex);
                this.elementData[0] = this.elementData[this.elementData.length - 1];
                ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, this.head + 1, this.head, this.elementData.length - 1);
            }
            this.elementData[this.head] = null;
            this.head = incremented(this.head);
        } else {
            int internalLastIndex = positiveMod(this.head + CollectionsKt.getLastIndex(this));
            if (internalIndex <= internalLastIndex) {
                ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, internalIndex, internalIndex + 1, internalLastIndex + 1);
            } else {
                ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, internalIndex, internalIndex + 1, this.elementData.length);
                this.elementData[this.elementData.length - 1] = this.elementData[0];
                ArraysKt.copyInto((T[]) this.elementData, (T[]) this.elementData, 0, 1, internalLastIndex + 1);
            }
            this.elementData[internalLastIndex] = null;
        }
        this.size = size() - 1;
        return element;
    }

    public boolean removeAll(Collection<? extends Object> elements) {
        int newTail$iv;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean modified$iv = false;
        if (!isEmpty()) {
            if (!(this.elementData.length == 0)) {
                int tail$iv = positiveMod(this.head + size());
                int newTail$iv2 = this.head;
                boolean modified$iv2 = false;
                if (this.head < tail$iv) {
                    for (int index$iv = this.head; index$iv < tail$iv; index$iv++) {
                        Object element$iv = this.elementData[index$iv];
                        if (!elements.contains(element$iv)) {
                            this.elementData[newTail$iv2] = element$iv;
                            newTail$iv2++;
                        } else {
                            modified$iv2 = true;
                        }
                    }
                    ArraysKt.fill((T[]) this.elementData, null, newTail$iv2, tail$iv);
                    boolean z = modified$iv2;
                    newTail$iv = newTail$iv2;
                    modified$iv = z;
                } else {
                    int length = this.elementData.length;
                    for (int index$iv2 = this.head; index$iv2 < length; index$iv2++) {
                        Object element$iv2 = this.elementData[index$iv2];
                        this.elementData[index$iv2] = null;
                        if (!elements.contains(element$iv2)) {
                            this.elementData[newTail$iv2] = element$iv2;
                            newTail$iv2++;
                        } else {
                            modified$iv2 = true;
                        }
                    }
                    int newTail$iv3 = positiveMod(newTail$iv2);
                    for (int index$iv3 = 0; index$iv3 < tail$iv; index$iv3++) {
                        Object element$iv3 = this.elementData[index$iv3];
                        this.elementData[index$iv3] = null;
                        if (!elements.contains(element$iv3)) {
                            this.elementData[newTail$iv3] = element$iv3;
                            newTail$iv3 = incremented(newTail$iv3);
                        } else {
                            modified$iv2 = true;
                        }
                    }
                    boolean z2 = modified$iv2;
                    newTail$iv = newTail$iv3;
                    modified$iv = z2;
                }
                if (modified$iv) {
                    this.size = negativeMod(newTail$iv - this.head);
                }
            }
        }
        return modified$iv;
    }

    public boolean retainAll(Collection<? extends Object> elements) {
        int newTail$iv;
        Intrinsics.checkNotNullParameter(elements, "elements");
        boolean modified$iv = false;
        if (!isEmpty()) {
            if (!(this.elementData.length == 0)) {
                int tail$iv = positiveMod(this.head + size());
                int newTail$iv2 = this.head;
                boolean modified$iv2 = false;
                if (this.head < tail$iv) {
                    for (int index$iv = this.head; index$iv < tail$iv; index$iv++) {
                        Object element$iv = this.elementData[index$iv];
                        if (elements.contains(element$iv)) {
                            this.elementData[newTail$iv2] = element$iv;
                            newTail$iv2++;
                        } else {
                            modified$iv2 = true;
                        }
                    }
                    ArraysKt.fill((T[]) this.elementData, null, newTail$iv2, tail$iv);
                    boolean z = modified$iv2;
                    newTail$iv = newTail$iv2;
                    modified$iv = z;
                } else {
                    int length = this.elementData.length;
                    for (int index$iv2 = this.head; index$iv2 < length; index$iv2++) {
                        Object element$iv2 = this.elementData[index$iv2];
                        this.elementData[index$iv2] = null;
                        if (elements.contains(element$iv2)) {
                            this.elementData[newTail$iv2] = element$iv2;
                            newTail$iv2++;
                        } else {
                            modified$iv2 = true;
                        }
                    }
                    int newTail$iv3 = positiveMod(newTail$iv2);
                    for (int index$iv3 = 0; index$iv3 < tail$iv; index$iv3++) {
                        Object element$iv3 = this.elementData[index$iv3];
                        this.elementData[index$iv3] = null;
                        if (elements.contains(element$iv3)) {
                            this.elementData[newTail$iv3] = element$iv3;
                            newTail$iv3 = incremented(newTail$iv3);
                        } else {
                            modified$iv2 = true;
                        }
                    }
                    boolean z2 = modified$iv2;
                    newTail$iv = newTail$iv3;
                    modified$iv = z2;
                }
                if (modified$iv) {
                    this.size = negativeMod(newTail$iv - this.head);
                }
            }
        }
        return modified$iv;
    }

    private final boolean filterInPlace(Function1<? super E, Boolean> predicate) {
        if (!isEmpty()) {
            if (!(this.elementData.length == 0)) {
                int tail = positiveMod(this.head + size());
                int newTail = this.head;
                boolean modified = false;
                if (this.head < tail) {
                    for (int index = this.head; index < tail; index++) {
                        Object element = this.elementData[index];
                        if (predicate.invoke(element).booleanValue()) {
                            this.elementData[newTail] = element;
                            newTail++;
                        } else {
                            modified = true;
                        }
                    }
                    ArraysKt.fill((T[]) this.elementData, null, newTail, tail);
                } else {
                    int length = this.elementData.length;
                    for (int index2 = this.head; index2 < length; index2++) {
                        Object element2 = this.elementData[index2];
                        this.elementData[index2] = null;
                        if (predicate.invoke(element2).booleanValue()) {
                            this.elementData[newTail] = element2;
                            newTail++;
                        } else {
                            modified = true;
                        }
                    }
                    newTail = positiveMod(newTail);
                    for (int index3 = 0; index3 < tail; index3++) {
                        Object element3 = this.elementData[index3];
                        this.elementData[index3] = null;
                        if (predicate.invoke(element3).booleanValue()) {
                            this.elementData[newTail] = element3;
                            newTail = incremented(newTail);
                        } else {
                            modified = true;
                        }
                    }
                }
                if (modified) {
                    this.size = negativeMod(newTail - this.head);
                }
                return modified;
            }
        }
        return false;
    }

    public void clear() {
        int tail = positiveMod(this.head + size());
        if (this.head < tail) {
            ArraysKt.fill((T[]) this.elementData, null, this.head, tail);
        } else if (!isEmpty()) {
            ArraysKt.fill((T[]) this.elementData, null, this.head, this.elementData.length);
            ArraysKt.fill((T[]) this.elementData, null, 0, tail);
        }
        this.head = 0;
        this.size = 0;
    }

    public <T> T[] toArray(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        T[] arrayOfNulls = array.length >= size() ? array : ArraysKt.arrayOfNulls(array, size());
        int tail = positiveMod(this.head + size());
        if (this.head < tail) {
            ArraysKt.copyInto$default(this.elementData, (Object[]) arrayOfNulls, 0, this.head, tail, 2, (Object) null);
        } else if (!isEmpty()) {
            ArraysKt.copyInto((T[]) this.elementData, arrayOfNulls, 0, this.head, this.elementData.length);
            ArraysKt.copyInto((T[]) this.elementData, arrayOfNulls, this.elementData.length - this.head, 0, tail);
        }
        return CollectionsKt.terminateCollectionToArray(size(), arrayOfNulls);
    }

    public Object[] toArray() {
        return toArray(new Object[size()]);
    }

    public final <T> T[] testToArray$kotlin_stdlib(T[] array) {
        Intrinsics.checkNotNullParameter(array, "array");
        return toArray(array);
    }

    public final Object[] testToArray$kotlin_stdlib() {
        return toArray();
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006X\u0004¢\u0006\u0004\n\u0002\u0010\u0007¨\u0006\b"}, d2 = {"Lkotlin/collections/ArrayDeque$Companion;", "", "()V", "defaultMinCapacity", "", "emptyElementData", "", "[Ljava/lang/Object;", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* compiled from: ArrayDeque.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void internalStructure$kotlin_stdlib(Function2<? super Integer, ? super Object[], Unit> structure) {
        Intrinsics.checkNotNullParameter(structure, "structure");
        structure.invoke(Integer.valueOf((isEmpty() || this.head < positiveMod(this.head + size())) ? this.head : this.head - this.elementData.length), toArray());
    }
}
