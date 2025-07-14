package androidx.collection;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableList;
import kotlin.jvm.internal.markers.KMutableListIterator;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u001c\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002:\u0003678B\u000f\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u000eJ\u001d\u0010\u000b\u001a\u00020\u000f2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u0011J\u0014\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014J\u0019\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0002\u0010\u0016J\u001e\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J#\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0002\u0010\u0017J\u001e\u0010\u0012\u001a\u00020\f2\b\b\u0001\u0010\u0010\u001a\u00020\u00042\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018J\u0014\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019J\u0014\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aJ\u0014\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bJ\u000e\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0016J\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\u001eJ\u0006\u0010\u001f\u001a\u00020\u000fJ\u000e\u0010 \u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0004J\u0016\u0010!\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00028\u0000H\n¢\u0006\u0002\u0010\"J\u0017\u0010!\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002J\u0017\u0010!\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\u001c\u0010!\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0002¢\u0006\u0002\u0010#J\u0017\u0010!\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0002J\u0017\u0010!\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0002J\u0017\u0010!\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0002J\u0016\u0010$\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00028\u0000H\n¢\u0006\u0002\u0010\"J\u0017\u0010$\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0002J\u0017\u0010$\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014H\u0002J\u001c\u0010$\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015H\u0002¢\u0006\u0002\u0010#J\u0017\u0010$\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019H\u0002J\u0017\u0010$\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aH\u0002J\u0017\u0010$\u001a\u00020\u000f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bH\u0002J\u0013\u0010%\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000¢\u0006\u0002\u0010\u000eJ\u0014\u0010&\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0014\u0010&\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0014J\u0019\u0010&\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0002\u0010\u0016J\u0014\u0010&\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019J\u0014\u0010&\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001aJ\u0014\u0010&\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bJ\u0015\u0010'\u001a\u00028\u00002\b\b\u0001\u0010\u0010\u001a\u00020\u0004¢\u0006\u0002\u0010(J/\u0010)\u001a\u00020\u000f2!\u0010*\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b,\u0012\b\b-\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\f0+H\bø\u0001\u0000J\u001a\u0010.\u001a\u00020\u000f2\b\b\u0001\u0010/\u001a\u00020\u00042\b\b\u0001\u00100\u001a\u00020\u0004J\u0014\u00101\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002J\u0019\u00101\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015¢\u0006\u0002\u0010\u0016J\u0014\u00101\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0018J\u0014\u00101\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0019J\u0014\u00101\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u001bJ \u00102\u001a\u00028\u00002\b\b\u0001\u0010\u0010\u001a\u00020\u00042\u0006\u0010\r\u001a\u00028\u0000H\u0002¢\u0006\u0002\u00103J\u0010\u00104\u001a\u00020\u000f2\b\b\u0002\u00105\u001a\u00020\u0004R\u0012\u0010\u0006\u001a\u00020\u00048Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\t\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000\u0002\u0007\n\u0005\b20\u0001¨\u00069"}, d2 = {"Landroidx/collection/MutableObjectList;", "E", "Landroidx/collection/ObjectList;", "initialCapacity", "", "(I)V", "capacity", "getCapacity", "()I", "list", "Landroidx/collection/MutableObjectList$ObjectListMutableList;", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "Landroidx/collection/ScatterSet;", "", "([Ljava/lang/Object;)Z", "(I[Ljava/lang/Object;)Z", "", "", "", "Lkotlin/sequences/Sequence;", "asList", "asMutableList", "", "clear", "ensureCapacity", "minusAssign", "(Ljava/lang/Object;)V", "([Ljava/lang/Object;)V", "plusAssign", "remove", "removeAll", "removeAt", "(I)Ljava/lang/Object;", "removeIf", "predicate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "removeRange", "start", "end", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "trim", "minCapacity", "MutableObjectListIterator", "ObjectListMutableList", "SubList", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ObjectList.kt */
public final class MutableObjectList<E> extends ObjectList<E> {
    private ObjectListMutableList<E> list;

    public MutableObjectList() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutableObjectList(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public MutableObjectList(int initialCapacity) {
        super(initialCapacity, (DefaultConstructorMarker) null);
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final boolean add(E element) {
        ensureCapacity(this._size + 1);
        this.content[this._size] = element;
        this._size++;
        return true;
    }

    public final void add(int index, E element) {
        boolean z = false;
        if (index >= 0 && index <= this._size) {
            z = true;
        }
        if (z) {
            ensureCapacity(this._size + 1);
            Object[] content = this.content;
            if (index != this._size) {
                ArraysKt.copyInto((T[]) content, (T[]) content, index + 1, index, this._size);
            }
            content[index] = element;
            this._size++;
            return;
        }
        throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
    }

    public final boolean addAll(int index, E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index >= 0 && index <= this._size) {
            if (elements.length == 0) {
                return false;
            }
            ensureCapacity(this._size + elements.length);
            Object[] content = this.content;
            if (index != this._size) {
                ArraysKt.copyInto((T[]) content, (T[]) content, elements.length + index, index, this._size);
            }
            ArraysKt.copyInto$default((Object[]) elements, content, index, 0, 0, 12, (Object) null);
            this._size += elements.length;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
    }

    public final boolean addAll(int index, Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!(index >= 0 && index <= this._size)) {
            throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
        } else if (elements.isEmpty()) {
            return false;
        } else {
            ensureCapacity(this._size + elements.size());
            Object[] content = this.content;
            if (index != this._size) {
                ArraysKt.copyInto((T[]) content, (T[]) content, elements.size() + index, index, this._size);
            }
            int i = 0;
            for (Object item$iv : elements) {
                int index$iv = i + 1;
                if (i < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                content[index + i] = item$iv;
                i = index$iv;
            }
            this._size += elements.size();
            return true;
        }
    }

    public final boolean addAll(int index, ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!(index >= 0 && index <= this._size)) {
            throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
        } else if (elements.isEmpty()) {
            return false;
        } else {
            ensureCapacity(this._size + elements._size);
            Object[] content = this.content;
            if (index != this._size) {
                ArraysKt.copyInto((T[]) content, (T[]) content, elements._size + index, index, this._size);
            }
            ArraysKt.copyInto((T[]) elements.content, (T[]) content, index, 0, elements._size);
            this._size += elements._size;
            return true;
        }
    }

    public final boolean addAll(ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int oldSize = this._size;
        plusAssign(elements);
        return oldSize != this._size;
    }

    public final boolean addAll(ScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int oldSize = this._size;
        plusAssign(elements);
        return oldSize != this._size;
    }

    public final boolean addAll(E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int oldSize = this._size;
        plusAssign(elements);
        return oldSize != this._size;
    }

    public final boolean addAll(List<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int oldSize = this._size;
        plusAssign(elements);
        return oldSize != this._size;
    }

    public final boolean addAll(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int oldSize = this._size;
        plusAssign(elements);
        return oldSize != this._size;
    }

    public final boolean addAll(Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int oldSize = this._size;
        plusAssign(elements);
        return oldSize != this._size;
    }

    public final void plusAssign(ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!elements.isEmpty()) {
            ensureCapacity(this._size + elements._size);
            ArraysKt.copyInto((T[]) elements.content, (T[]) this.content, this._size, 0, elements._size);
            this._size += elements._size;
        }
    }

    public final void plusAssign(ScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!elements.isEmpty()) {
            ensureCapacity(this._size + elements.getSize());
            ScatterSet this_$iv = elements;
            Object[] k$iv = this_$iv.elements;
            long[] m$iv$iv = this_$iv.metadata;
            int lastIndex$iv$iv = m$iv$iv.length - 2;
            int i$iv$iv = 0;
            if (0 <= lastIndex$iv$iv) {
                while (true) {
                    long slot$iv$iv = m$iv$iv[i$iv$iv];
                    long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                    ScatterSet this_$iv2 = this_$iv;
                    if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                        int i = 8;
                        int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                        int j$iv$iv = 0;
                        while (j$iv$iv < bitCount$iv$iv) {
                            if ((255 & slot$iv$iv) < 128) {
                                add(k$iv[(i$iv$iv << 3) + j$iv$iv]);
                            }
                            i = 8;
                            slot$iv$iv >>= 8;
                            j$iv$iv++;
                            ScatterSet<E> scatterSet = elements;
                        }
                        if (bitCount$iv$iv != i) {
                            return;
                        }
                    }
                    if (i$iv$iv != lastIndex$iv$iv) {
                        i$iv$iv++;
                        ScatterSet<E> scatterSet2 = elements;
                        this_$iv = this_$iv2;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public final void plusAssign(E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!(elements.length == 0)) {
            ensureCapacity(this._size + elements.length);
            ArraysKt.copyInto$default((Object[]) elements, this.content, this._size, 0, 0, 12, (Object) null);
            this._size += elements.length;
        }
    }

    public final void plusAssign(List<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!elements.isEmpty()) {
            int size = this._size;
            ensureCapacity(elements.size() + size);
            Object[] content = this.content;
            int size2 = elements.size();
            for (int i = 0; i < size2; i++) {
                content[i + size] = elements.get(i);
            }
            this._size += elements.size();
        }
    }

    public final void plusAssign(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (Object element : elements) {
            add(element);
        }
    }

    public final void plusAssign(Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (Object element : elements) {
            add(element);
        }
    }

    public final void clear() {
        ArraysKt.fill((T[]) this.content, null, 0, this._size);
        this._size = 0;
    }

    public static /* synthetic */ void trim$default(MutableObjectList mutableObjectList, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = mutableObjectList._size;
        }
        mutableObjectList.trim(i);
    }

    public final void trim(int minCapacity) {
        int minSize = Math.max(minCapacity, this._size);
        if (this.content.length > minSize) {
            Object[] copyOf = Arrays.copyOf(this.content, minSize);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public final void ensureCapacity(int capacity) {
        Object[] oldContent = this.content;
        if (oldContent.length < capacity) {
            Object[] copyOf = Arrays.copyOf(oldContent, Math.max(capacity, (oldContent.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public final void plusAssign(E element) {
        add(element);
    }

    public final void minusAssign(E element) {
        remove(element);
    }

    public final boolean remove(E element) {
        int index = indexOf(element);
        if (index < 0) {
            return false;
        }
        removeAt(index);
        return true;
    }

    public final void removeIf(Function1<? super E, Boolean> predicate) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        int gap = 0;
        int size = this._size;
        Object[] content = this.content;
        IntRange until = RangesKt.until(0, this._size);
        int i = until.getFirst();
        int last = until.getLast();
        if (i <= last) {
            while (true) {
                content[i - gap] = content[i];
                if (predicate.invoke(content[i]).booleanValue()) {
                    gap++;
                }
                if (i == last) {
                    break;
                }
                i++;
            }
        }
        ArraysKt.fill((T[]) content, null, size - gap, size);
        this._size -= gap;
    }

    public final boolean removeAll(E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int initialSize = this._size;
        for (E remove : elements) {
            remove(remove);
        }
        return initialSize != this._size;
    }

    public final boolean removeAll(ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int initialSize = this._size;
        minusAssign(elements);
        return initialSize != this._size;
    }

    public final boolean removeAll(ScatterSet<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int initialSize = this._size;
        minusAssign(elements);
        return initialSize != this._size;
    }

    public final boolean removeAll(List<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int initialSize = this._size;
        minusAssign(elements);
        return initialSize != this._size;
    }

    public final boolean removeAll(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int initialSize = this._size;
        minusAssign(elements);
        return initialSize != this._size;
    }

    public final boolean removeAll(Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int initialSize = this._size;
        minusAssign(elements);
        return initialSize != this._size;
    }

    public final void minusAssign(E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (E element : elements) {
            remove(element);
        }
    }

    public final void minusAssign(ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        ObjectList this_$iv = elements;
        Object[] content$iv = this_$iv.content;
        int i = this_$iv._size;
        for (int i$iv = 0; i$iv < i; i$iv++) {
            remove(content$iv[i$iv]);
        }
    }

    public final void minusAssign(ScatterSet<E> elements) {
        ScatterSet this_$iv;
        ScatterSet this_$iv2;
        Intrinsics.checkNotNullParameter(elements, "elements");
        ScatterSet this_$iv3 = elements;
        Object[] k$iv = this_$iv3.elements;
        long[] m$iv$iv = this_$iv3.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i = 8;
                    int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    int j$iv$iv = 0;
                    while (j$iv$iv < bitCount$iv$iv) {
                        if ((255 & slot$iv$iv) < 128) {
                            this_$iv2 = this_$iv3;
                            remove(k$iv[(i$iv$iv << 3) + j$iv$iv]);
                        } else {
                            this_$iv2 = this_$iv3;
                        }
                        slot$iv$iv >>= 8;
                        j$iv$iv++;
                        i = 8;
                        this_$iv3 = this_$iv2;
                    }
                    this_$iv = this_$iv3;
                    if (bitCount$iv$iv != i) {
                        return;
                    }
                } else {
                    this_$iv = this_$iv3;
                }
                if (i$iv$iv != lastIndex$iv$iv) {
                    i$iv$iv++;
                    this_$iv3 = this_$iv;
                } else {
                    return;
                }
            }
        }
    }

    public final void minusAssign(List<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int size = elements.size();
        for (int i = 0; i < size; i++) {
            remove(elements.get(i));
        }
    }

    public final void minusAssign(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (Object element : elements) {
            remove(element);
        }
    }

    public final void minusAssign(Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (Object element : elements) {
            remove(element);
        }
    }

    public final E removeAt(int index) {
        boolean z = false;
        if (index >= 0 && index < this._size) {
            z = true;
        }
        if (z) {
            Object[] content = this.content;
            Object element = content[index];
            if (index != this._size - 1) {
                ArraysKt.copyInto((T[]) content, (T[]) content, index, index + 1, this._size);
            }
            this._size--;
            content[this._size] = null;
            return element;
        }
        throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + (this._size - 1));
    }

    public final void removeRange(int start, int end) {
        boolean z = true;
        if (start >= 0 && start <= this._size) {
            if (end < 0 || end > this._size) {
                z = false;
            }
            if (z) {
                if (end < start) {
                    throw new IllegalArgumentException("Start (" + start + ") is more than end (" + end + ')');
                } else if (end != start) {
                    if (end < this._size) {
                        ArraysKt.copyInto((T[]) this.content, (T[]) this.content, start, end, this._size);
                    }
                    int newSize = this._size - (end - start);
                    ArraysKt.fill((T[]) this.content, null, newSize, this._size);
                    this._size = newSize;
                    return;
                } else {
                    return;
                }
            }
        }
        throw new IndexOutOfBoundsException("Start (" + start + ") and end (" + end + ") must be in 0.." + this._size);
    }

    public final boolean retainAll(E[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int initialSize = this._size;
        Object[] content = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            if (ArraysKt.indexOf((T[]) elements, content[i]) < 0) {
                removeAt(i);
            }
        }
        if (initialSize != this._size) {
            return true;
        }
        return false;
    }

    public final boolean retainAll(ObjectList<E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int initialSize = this._size;
        Object[] content = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            if (!elements.contains(content[i])) {
                removeAt(i);
            }
        }
        if (initialSize != this._size) {
            return true;
        }
        return false;
    }

    public final boolean retainAll(Collection<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int initialSize = this._size;
        Object[] content = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            if (!elements.contains(content[i])) {
                removeAt(i);
            }
        }
        if (initialSize != this._size) {
            return true;
        }
        return false;
    }

    public final boolean retainAll(Iterable<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int initialSize = this._size;
        Object[] content = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            if (!CollectionsKt.contains(elements, content[i])) {
                removeAt(i);
            }
        }
        if (initialSize != this._size) {
            return true;
        }
        return false;
    }

    public final boolean retainAll(Sequence<? extends E> elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int initialSize = this._size;
        Object[] content = this.content;
        for (int i = this._size - 1; -1 < i; i--) {
            if (!SequencesKt.contains(elements, content[i])) {
                removeAt(i);
            }
        }
        if (initialSize != this._size) {
            return true;
        }
        return false;
    }

    public final E set(int index, E element) {
        boolean z = false;
        if (index >= 0 && index < this._size) {
            z = true;
        }
        if (z) {
            Object[] content = this.content;
            Object old = content[index];
            content[index] = element;
            return old;
        }
        throw new IndexOutOfBoundsException("set index " + index + " must be between 0 .. " + (this._size - 1));
    }

    public List<E> asList() {
        return asMutableList();
    }

    public final List<E> asMutableList() {
        ObjectListMutableList it = this.list;
        if (it == null) {
            it = new ObjectListMutableList(this);
            this.list = it;
        }
        return it;
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010+\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0015\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fJ\t\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u000e\u0010\u0010\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010\u0011J\b\u0010\u0012\u001a\u00020\u0006H\u0016J\r\u0010\u0013\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0011J\b\u0010\u0014\u001a\u00020\u0006H\u0016J\b\u0010\u0015\u001a\u00020\nH\u0016J\u0015\u0010\u0016\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\fR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Landroidx/collection/MutableObjectList$MutableObjectListIterator;", "T", "", "list", "", "index", "", "(Ljava/util/List;I)V", "prevIndex", "add", "", "element", "(Ljava/lang/Object;)V", "hasNext", "", "hasPrevious", "next", "()Ljava/lang/Object;", "nextIndex", "previous", "previousIndex", "remove", "set", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: ObjectList.kt */
    private static final class MutableObjectListIterator<T> implements ListIterator<T>, KMutableListIterator {
        private final List<T> list;
        private int prevIndex;

        public MutableObjectListIterator(List<T> list2, int index) {
            Intrinsics.checkNotNullParameter(list2, "list");
            this.list = list2;
            this.prevIndex = index - 1;
        }

        public boolean hasNext() {
            return this.prevIndex < this.list.size() - 1;
        }

        public T next() {
            List<T> list2 = this.list;
            this.prevIndex++;
            return list2.get(this.prevIndex);
        }

        public void remove() {
            this.list.remove(this.prevIndex);
            this.prevIndex--;
        }

        public boolean hasPrevious() {
            return this.prevIndex >= 0;
        }

        public int nextIndex() {
            return this.prevIndex + 1;
        }

        public T previous() {
            List<T> list2 = this.list;
            int i = this.prevIndex;
            this.prevIndex = i - 1;
            return list2.get(i);
        }

        public int previousIndex() {
            return this.prevIndex;
        }

        public void add(T element) {
            List<T> list2 = this.list;
            this.prevIndex++;
            list2.add(this.prevIndex, element);
        }

        public void set(T element) {
            this.list.set(this.prevIndex, element);
        }
    }

    @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0015\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\rJ\u001d\u0010\n\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0010J\u001e\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00072\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0016\u0010\u0011\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\b\u0010\u0014\u001a\u00020\u000eH\u0016J\u0016\u0010\u0015\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010\rJ\u0016\u0010\u0016\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0016\u0010\u0017\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010\u0018J\u0015\u0010\u0019\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001aJ\b\u0010\u001b\u001a\u00020\u000bH\u0016J\u000f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00028\u00010\u001dH\u0002J\u0015\u0010\u001e\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001aJ\u000e\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010 H\u0016J\u0016\u0010\u001f\u001a\b\u0012\u0004\u0012\u00028\u00010 2\u0006\u0010\u000f\u001a\u00020\u0007H\u0016J\u0015\u0010!\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\rJ\u0016\u0010\"\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u0015\u0010#\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0018J\u0016\u0010$\u001a\u00020\u000b2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00010\u0013H\u0016J\u001e\u0010%\u001a\u00028\u00012\u0006\u0010\u000f\u001a\u00020\u00072\u0006\u0010\f\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010&J\u001e\u0010'\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010(\u001a\u00020\u00072\u0006\u0010)\u001a\u00020\u0007H\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006*"}, d2 = {"Landroidx/collection/MutableObjectList$ObjectListMutableList;", "T", "", "objectList", "Landroidx/collection/MutableObjectList;", "(Landroidx/collection/MutableObjectList;)V", "size", "", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: ObjectList.kt */
    private static final class ObjectListMutableList<T> implements List<T>, KMutableList {
        private final MutableObjectList<T> objectList;

        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        public <T> T[] toArray(T[] tArr) {
            Intrinsics.checkNotNullParameter(tArr, "array");
            return CollectionToArray.toArray(this, tArr);
        }

        public ObjectListMutableList(MutableObjectList<T> objectList2) {
            Intrinsics.checkNotNullParameter(objectList2, "objectList");
            this.objectList = objectList2;
        }

        public final /* bridge */ T remove(int index) {
            return removeAt(index);
        }

        public final /* bridge */ int size() {
            return getSize();
        }

        public int getSize() {
            return this.objectList.getSize();
        }

        public boolean contains(Object element) {
            return this.objectList.contains(element);
        }

        public boolean containsAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.objectList.containsAll(elements);
        }

        public T get(int index) {
            ObjectListKt.checkIndex(this, index);
            return this.objectList.get(index);
        }

        public int indexOf(Object element) {
            return this.objectList.indexOf(element);
        }

        public boolean isEmpty() {
            return this.objectList.isEmpty();
        }

        public Iterator<T> iterator() {
            return new MutableObjectListIterator<>(this, 0);
        }

        public int lastIndexOf(Object element) {
            return this.objectList.lastIndexOf(element);
        }

        public boolean add(T element) {
            return this.objectList.add(element);
        }

        public void add(int index, T element) {
            this.objectList.add(index, element);
        }

        public boolean addAll(int index, Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.objectList.addAll(index, elements);
        }

        public boolean addAll(Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.objectList.addAll(elements);
        }

        public void clear() {
            this.objectList.clear();
        }

        public ListIterator<T> listIterator() {
            return new MutableObjectListIterator<>(this, 0);
        }

        public ListIterator<T> listIterator(int index) {
            return new MutableObjectListIterator<>(this, index);
        }

        public boolean remove(Object element) {
            return this.objectList.remove(element);
        }

        public boolean removeAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.objectList.removeAll(elements);
        }

        public T removeAt(int index) {
            ObjectListKt.checkIndex(this, index);
            return this.objectList.removeAt(index);
        }

        public boolean retainAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            return this.objectList.retainAll(elements);
        }

        public T set(int index, T element) {
            ObjectListKt.checkIndex(this, index);
            return this.objectList.set(index, element);
        }

        public List<T> subList(int fromIndex, int toIndex) {
            ObjectListKt.checkSubIndex(this, fromIndex, toIndex);
            return new SubList<>(this, fromIndex, toIndex);
        }
    }

    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\t\n\u0002\u0010)\n\u0002\b\u0002\n\u0002\u0010+\n\u0002\b\n\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B#\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0002\u0010\u0007J\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000eJ\u001d\u0010\u000b\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u0011J\u001e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0016\u0010\u0012\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\b\u0010\u0015\u001a\u00020\u000fH\u0016J\u0016\u0010\u0016\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010\u000eJ\u0016\u0010\u0017\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0016\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\fH\u0016J\u000f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00010\u001eH\u0002J\u0015\u0010\u001f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001bJ\u000e\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010!H\u0016J\u0016\u0010 \u001a\b\u0012\u0004\u0012\u00028\u00010!2\u0006\u0010\u0010\u001a\u00020\u0005H\u0016J\u0015\u0010\"\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u000eJ\u0016\u0010#\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u0015\u0010$\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u0005H\u0016¢\u0006\u0002\u0010\u0019J\u0016\u0010%\u001a\u00020\f2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00010\u0014H\u0016J\u001e\u0010&\u001a\u00028\u00012\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\r\u001a\u00028\u0001H\u0002¢\u0006\u0002\u0010'J\u001e\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010)\u001a\u00020\u00052\u0006\u0010*\u001a\u00020\u0005H\u0016R\u000e\u0010\u0006\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0002X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\u00020\u00058VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006+"}, d2 = {"Landroidx/collection/MutableObjectList$SubList;", "T", "", "list", "start", "", "end", "(Ljava/util/List;II)V", "size", "getSize", "()I", "add", "", "element", "(Ljava/lang/Object;)Z", "", "index", "(ILjava/lang/Object;)V", "addAll", "elements", "", "clear", "contains", "containsAll", "get", "(I)Ljava/lang/Object;", "indexOf", "(Ljava/lang/Object;)I", "isEmpty", "iterator", "", "lastIndexOf", "listIterator", "", "remove", "removeAll", "removeAt", "retainAll", "set", "(ILjava/lang/Object;)Ljava/lang/Object;", "subList", "fromIndex", "toIndex", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: ObjectList.kt */
    private static final class SubList<T> implements List<T>, KMutableList {
        private int end;
        private final List<T> list;
        private final int start;

        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        public <T> T[] toArray(T[] tArr) {
            Intrinsics.checkNotNullParameter(tArr, "array");
            return CollectionToArray.toArray(this, tArr);
        }

        public SubList(List<T> list2, int start2, int end2) {
            Intrinsics.checkNotNullParameter(list2, "list");
            this.list = list2;
            this.start = start2;
            this.end = end2;
        }

        public final /* bridge */ T remove(int index) {
            return removeAt(index);
        }

        public final /* bridge */ int size() {
            return getSize();
        }

        public int getSize() {
            return this.end - this.start;
        }

        public boolean contains(Object element) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (Intrinsics.areEqual((Object) this.list.get(i2), element)) {
                    return true;
                }
            }
            return false;
        }

        public boolean containsAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            for (Object element$iv : elements) {
                if (!contains(element$iv)) {
                    return false;
                }
            }
            return true;
        }

        public T get(int index) {
            ObjectListKt.checkIndex(this, index);
            return this.list.get(this.start + index);
        }

        public int indexOf(Object element) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (Intrinsics.areEqual((Object) this.list.get(i2), element)) {
                    return i2 - this.start;
                }
            }
            return -1;
        }

        public boolean isEmpty() {
            return this.end == this.start;
        }

        public Iterator<T> iterator() {
            return new MutableObjectListIterator<>(this, 0);
        }

        public int lastIndexOf(Object element) {
            int i = this.end - 1;
            int i2 = this.start;
            if (i2 > i) {
                return -1;
            }
            while (!Intrinsics.areEqual((Object) this.list.get(i), element)) {
                if (i == i2) {
                    return -1;
                }
                i--;
            }
            return i - this.start;
        }

        public boolean add(T element) {
            List<T> list2 = this.list;
            int i = this.end;
            this.end = i + 1;
            list2.add(i, element);
            return true;
        }

        public void add(int index, T element) {
            this.list.add(this.start + index, element);
            this.end++;
        }

        public boolean addAll(int index, Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.list.addAll(this.start + index, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }

        public boolean addAll(Collection<? extends T> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            this.list.addAll(this.end, elements);
            this.end += elements.size();
            return elements.size() > 0;
        }

        public void clear() {
            int i = this.end - 1;
            int i2 = this.start;
            if (i2 <= i) {
                while (true) {
                    this.list.remove(i);
                    if (i == i2) {
                        break;
                    }
                    i--;
                }
            }
            this.end = this.start;
        }

        public ListIterator<T> listIterator() {
            return new MutableObjectListIterator<>(this, 0);
        }

        public ListIterator<T> listIterator(int index) {
            return new MutableObjectListIterator<>(this, index);
        }

        public boolean remove(Object element) {
            int i = this.end;
            for (int i2 = this.start; i2 < i; i2++) {
                if (Intrinsics.areEqual((Object) this.list.get(i2), element)) {
                    this.list.remove(i2);
                    this.end--;
                    return true;
                }
            }
            return false;
        }

        public boolean removeAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            int originalEnd = this.end;
            for (Object element$iv : elements) {
                remove(element$iv);
            }
            return originalEnd != this.end;
        }

        public T removeAt(int index) {
            ObjectListKt.checkIndex(this, index);
            this.end--;
            return this.list.remove(this.start + index);
        }

        public boolean retainAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            int originalEnd = this.end;
            int i = this.end - 1;
            int i2 = this.start;
            if (i2 <= i) {
                while (true) {
                    if (!elements.contains(this.list.get(i))) {
                        this.list.remove(i);
                        this.end--;
                    }
                    if (i == i2) {
                        break;
                    }
                    i--;
                }
            }
            if (originalEnd != this.end) {
                return true;
            }
            return false;
        }

        public T set(int index, T element) {
            ObjectListKt.checkIndex(this, index);
            return this.list.set(this.start + index, element);
        }

        public List<T> subList(int fromIndex, int toIndex) {
            ObjectListKt.checkSubIndex(this, fromIndex, toIndex);
            return new SubList<>(this, fromIndex, toIndex);
        }
    }
}
