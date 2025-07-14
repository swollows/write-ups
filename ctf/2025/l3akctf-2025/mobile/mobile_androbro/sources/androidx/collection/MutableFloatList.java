package androidx.collection;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0014\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u0018\u0010\b\u001a\u00020\f2\b\b\u0001\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0001J\u000e\u0010\u000e\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010J\u0018\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0001J\u0018\u0010\u000e\u001a\u00020\t2\b\b\u0001\u0010\r\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\fJ\u000e\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0005\u001a\u00020\u0003J\u0011\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001H\u0002J\u0011\u0010\u0013\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u000bH\nJ\u0011\u0010\u0013\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u0011\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0001H\u0002J\u0011\u0010\u0014\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\u000bH\nJ\u0011\u0010\u0014\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0002J\u000e\u0010\u0015\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0001J\u000e\u0010\u0016\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010J\u0010\u0010\u0017\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u0003J\u001a\u0010\u0018\u001a\u00020\f2\b\b\u0001\u0010\u0019\u001a\u00020\u00032\b\b\u0001\u0010\u001a\u001a\u00020\u0003J\u000e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0001J\u000e\u0010\u001b\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010J\u001b\u0010\u001c\u001a\u00020\u000b2\b\b\u0001\u0010\r\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u000bH\u0002J\u0006\u0010\u001d\u001a\u00020\fJ\u0006\u0010\u001e\u001a\u00020\fJ\u0010\u0010\u001f\u001a\u00020\f2\b\b\u0002\u0010 \u001a\u00020\u0003R\u0012\u0010\u0005\u001a\u00020\u00038Æ\u0002¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007¨\u0006!"}, d2 = {"Landroidx/collection/MutableFloatList;", "Landroidx/collection/FloatList;", "initialCapacity", "", "(I)V", "capacity", "getCapacity", "()I", "add", "", "element", "", "", "index", "addAll", "elements", "", "clear", "ensureCapacity", "minusAssign", "plusAssign", "remove", "removeAll", "removeAt", "removeRange", "start", "end", "retainAll", "set", "sort", "sortDescending", "trim", "minCapacity", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: FloatList.kt */
public final class MutableFloatList extends FloatList {
    public MutableFloatList() {
        this(0, 1, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MutableFloatList(int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 16 : i);
    }

    public MutableFloatList(int initialCapacity) {
        super(initialCapacity, (DefaultConstructorMarker) null);
    }

    public final int getCapacity() {
        return this.content.length;
    }

    public final boolean add(float element) {
        ensureCapacity(this._size + 1);
        this.content[this._size] = element;
        this._size++;
        return true;
    }

    public final void add(int index, float element) {
        boolean z = false;
        if (index >= 0 && index <= this._size) {
            z = true;
        }
        if (z) {
            ensureCapacity(this._size + 1);
            float[] content = this.content;
            if (index != this._size) {
                ArraysKt.copyInto(content, content, index + 1, index, this._size);
            }
            content[index] = element;
            this._size++;
            return;
        }
        throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
    }

    public final boolean addAll(int index, float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (index >= 0 && index <= this._size) {
            if (elements.length == 0) {
                return false;
            }
            ensureCapacity(this._size + elements.length);
            float[] content = this.content;
            if (index != this._size) {
                ArraysKt.copyInto(content, content, elements.length + index, index, this._size);
            }
            ArraysKt.copyInto$default(elements, content, index, 0, 0, 12, (Object) null);
            this._size += elements.length;
            return true;
        }
        throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
    }

    public final boolean addAll(int index, FloatList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        if (!(index >= 0 && index <= this._size)) {
            throw new IndexOutOfBoundsException("Index " + index + " must be in 0.." + this._size);
        } else if (elements.isEmpty()) {
            return false;
        } else {
            ensureCapacity(this._size + elements._size);
            float[] content = this.content;
            if (index != this._size) {
                ArraysKt.copyInto(content, content, elements._size + index, index, this._size);
            }
            ArraysKt.copyInto(elements.content, content, index, 0, elements._size);
            this._size += elements._size;
            return true;
        }
    }

    public final boolean addAll(FloatList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(this._size, elements);
    }

    public final boolean addAll(float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        return addAll(this._size, elements);
    }

    public final void plusAssign(FloatList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        addAll(this._size, elements);
    }

    public final void plusAssign(float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        addAll(this._size, elements);
    }

    public final void clear() {
        this._size = 0;
    }

    public static /* synthetic */ void trim$default(MutableFloatList mutableFloatList, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = mutableFloatList._size;
        }
        mutableFloatList.trim(i);
    }

    public final void trim(int minCapacity) {
        int minSize = Math.max(minCapacity, this._size);
        if (this.content.length > minSize) {
            float[] copyOf = Arrays.copyOf(this.content, minSize);
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public final void ensureCapacity(int capacity) {
        float[] oldContent = this.content;
        if (oldContent.length < capacity) {
            float[] copyOf = Arrays.copyOf(oldContent, Math.max(capacity, (oldContent.length * 3) / 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(this, newSize)");
            this.content = copyOf;
        }
    }

    public final void plusAssign(float element) {
        add(element);
    }

    public final void minusAssign(float element) {
        remove(element);
    }

    public final boolean remove(float element) {
        int index = indexOf(element);
        if (index < 0) {
            return false;
        }
        removeAt(index);
        return true;
    }

    public final boolean removeAll(float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int initialSize = this._size;
        for (float remove : elements) {
            remove(remove);
        }
        return initialSize != this._size;
    }

    public final boolean removeAll(FloatList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int initialSize = this._size;
        int i = 0;
        int i2 = elements._size - 1;
        if (0 <= i2) {
            while (true) {
                remove(elements.get(i));
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        if (initialSize != this._size) {
            return true;
        }
        return false;
    }

    public final void minusAssign(float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        for (float element$iv : elements) {
            remove(element$iv);
        }
    }

    public final void minusAssign(FloatList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        FloatList this_$iv = elements;
        float[] content$iv = this_$iv.content;
        int i = this_$iv._size;
        for (int i$iv = 0; i$iv < i; i$iv++) {
            remove(content$iv[i$iv]);
        }
    }

    public final float removeAt(int index) {
        boolean z = false;
        if (index >= 0 && index < this._size) {
            z = true;
        }
        if (z) {
            float[] content = this.content;
            float item = content[index];
            if (index != this._size - 1) {
                ArraysKt.copyInto(content, content, index, index + 1, this._size);
            }
            this._size--;
            return item;
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
                        ArraysKt.copyInto(this.content, this.content, start, end, this._size);
                    }
                    this._size -= end - start;
                    return;
                } else {
                    return;
                }
            }
        }
        throw new IndexOutOfBoundsException("Start (" + start + ") and end (" + end + ") must be in 0.." + this._size);
    }

    public final boolean retainAll(float[] elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int initialSize = this._size;
        float[] content = this.content;
        int i = this._size - 1;
        while (true) {
            int i2 = -1;
            if (-1 >= i) {
                break;
            }
            float item = content[i];
            float[] $this$indexOfFirst$iv = elements;
            int index$iv = 0;
            int length = $this$indexOfFirst$iv.length;
            while (true) {
                if (index$iv >= length) {
                    break;
                }
                if ($this$indexOfFirst$iv[index$iv] == item) {
                    i2 = index$iv;
                    break;
                }
                index$iv++;
            }
            if (i2 < 0) {
                removeAt(i);
            }
            i--;
        }
        if (initialSize != this._size) {
            return true;
        }
        return false;
    }

    public final boolean retainAll(FloatList elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        int initialSize = this._size;
        float[] content = this.content;
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

    public final float set(int index, float element) {
        boolean z = false;
        if (index >= 0 && index < this._size) {
            z = true;
        }
        if (z) {
            float[] content = this.content;
            float old = content[index];
            content[index] = element;
            return old;
        }
        throw new IndexOutOfBoundsException("set index " + index + " must be between 0 .. " + (this._size - 1));
    }

    public final void sort() {
        ArraysKt.sort(this.content, 0, this._size);
    }

    public final void sortDescending() {
        ArraysKt.sortDescending(this.content, 0, this._size);
    }
}
