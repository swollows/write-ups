package kotlinx.coroutines.internal;

import java.lang.Comparable;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.InlineMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.DebugKt;
import kotlinx.coroutines.internal.ThreadSafeHeapNode;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0000\n\u0002\u0018\u0002\b\u0017\u0018\u0000*\u0012\b\u0000\u0010\u0003*\u00020\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u000605j\u0002`6B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000H\u0001¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\n\u0010\tJ.\u0010\u000e\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u00002\u0014\u0010\r\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0012\u0004\u0012\u00020\f0\u000bH\b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0005J2\u0010\u0015\u001a\u0004\u0018\u00018\u00002!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0011\u0012\b\b\u0012\u0012\u0004\b\b(\u0013\u0012\u0004\u0012\u00020\f0\u000b¢\u0006\u0004\b\u0015\u0010\u0016J\u0011\u0010\u0017\u001a\u0004\u0018\u00018\u0000H\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0019\u0010\u0018J\u0017\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u001aH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001d\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00028\u0000¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010!\u001a\u00028\u00002\u0006\u0010 \u001a\u00020\u001fH\u0001¢\u0006\u0004\b!\u0010\"J&\u0010#\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\f0\u000bH\b¢\u0006\u0004\b#\u0010\u0016J\u000f\u0010$\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b$\u0010\u0018J\u0018\u0010&\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u001fH\u0010¢\u0006\u0004\b&\u0010'J\u0018\u0010(\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u001fH\u0010¢\u0006\u0004\b(\u0010'J\u001f\u0010*\u001a\u00020\u00072\u0006\u0010%\u001a\u00020\u001f2\u0006\u0010)\u001a\u00020\u001fH\u0002¢\u0006\u0004\b*\u0010+R \u0010,\u001a\f\u0012\u0006\u0012\u0004\u0018\u00018\u0000\u0018\u00010\u001a8\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0011\u0010.\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b.\u0010/R$\u00103\u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u001f8F@BX\u000e¢\u0006\f\u001a\u0004\b0\u00101\"\u0004\b2\u0010'¨\u00064"}, d2 = {"Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "", "T", "<init>", "()V", "node", "", "addImpl", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)V", "addLast", "Lkotlin/Function1;", "", "cond", "addLastIf", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;Lkotlin/jvm/functions/Function1;)Z", "clear", "Lkotlin/ParameterName;", "name", "value", "predicate", "find", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "firstImpl", "()Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "peek", "", "realloc", "()[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "remove", "(Lkotlinx/coroutines/internal/ThreadSafeHeapNode;)Z", "", "index", "removeAtImpl", "(I)Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "removeFirstIf", "removeFirstOrNull", "i", "siftDownFrom", "(I)V", "siftUpFrom", "j", "swap", "(II)V", "a", "[Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "isEmpty", "()Z", "getSize", "()I", "setSize", "size", "kotlinx-coroutines-core", "", "Lkotlinx/coroutines/internal/SynchronizedObject;"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: ThreadSafeHeap.kt */
public class ThreadSafeHeap<T extends ThreadSafeHeapNode & Comparable<? super T>> {
    private volatile /* synthetic */ int _size = 0;
    private T[] a;

    public final int getSize() {
        return this._size;
    }

    private final void setSize(int value) {
        this._size = value;
    }

    public final boolean isEmpty() {
        return getSize() == 0;
    }

    public final void clear() {
        synchronized (this) {
            T[] tArr = this.a;
            if (tArr != null) {
                ArraysKt.fill$default((Object[]) tArr, (Object) null, 0, 0, 6, (Object) null);
            }
            this._size = 0;
            Unit unit = Unit.INSTANCE;
        }
    }

    public final T find(Function1<? super T, Boolean> predicate) {
        ThreadSafeHeapNode value;
        synchronized (this) {
            int i = 0;
            int size = getSize();
            while (true) {
                value = null;
                if (i >= size) {
                    break;
                }
                ThreadSafeHeapNode[] threadSafeHeapNodeArr = this.a;
                if (threadSafeHeapNodeArr != null) {
                    value = threadSafeHeapNodeArr[i];
                }
                Intrinsics.checkNotNull(value);
                if (predicate.invoke(value).booleanValue()) {
                    break;
                }
                i++;
            }
        }
        return value;
    }

    public final T peek() {
        T firstImpl;
        synchronized (this) {
            firstImpl = firstImpl();
        }
        return firstImpl;
    }

    public final T removeFirstOrNull() {
        T t;
        synchronized (this) {
            if (getSize() > 0) {
                t = removeAtImpl(0);
            } else {
                t = null;
                ThreadSafeHeapNode threadSafeHeapNode = null;
            }
        }
        return t;
    }

    public final T removeFirstIf(Function1<? super T, Boolean> predicate) {
        synchronized (this) {
            try {
                ThreadSafeHeapNode first = firstImpl();
                T t = null;
                if (first == null) {
                    InlineMarker.finallyStart(2);
                    InlineMarker.finallyEnd(2);
                    return null;
                }
                if (predicate.invoke(first).booleanValue()) {
                    t = removeAtImpl(0);
                } else {
                    ThreadSafeHeapNode threadSafeHeapNode = null;
                }
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                return t;
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
    }

    public final void addLast(T node) {
        synchronized (this) {
            addImpl(node);
            Unit unit = Unit.INSTANCE;
        }
    }

    public final boolean addLastIf(T node, Function1<? super T, Boolean> cond) {
        boolean z;
        synchronized (this) {
            try {
                if (cond.invoke(firstImpl()).booleanValue()) {
                    addImpl(node);
                    z = true;
                } else {
                    z = false;
                }
                InlineMarker.finallyStart(1);
            } catch (Throwable th) {
                InlineMarker.finallyStart(1);
                InlineMarker.finallyEnd(1);
                throw th;
            }
        }
        InlineMarker.finallyEnd(1);
        return z;
    }

    public final boolean remove(T node) {
        boolean z;
        synchronized (this) {
            z = false;
            if (node.getHeap() != null) {
                int index = node.getIndex();
                if (DebugKt.getASSERTIONS_ENABLED()) {
                    if (index >= 0) {
                        z = true;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
                removeAtImpl(index);
                z = true;
            }
        }
        return z;
    }

    public final T firstImpl() {
        T[] tArr = this.a;
        if (tArr != null) {
            return tArr[0];
        }
        return null;
    }

    public final T removeAtImpl(int index) {
        boolean z = false;
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if ((getSize() > 0 ? 1 : 0) == 0) {
                throw new AssertionError();
            }
        }
        ThreadSafeHeapNode[] a2 = this.a;
        Intrinsics.checkNotNull(a2);
        setSize(getSize() - 1);
        if (index < getSize()) {
            swap(index, getSize());
            int j = (index - 1) / 2;
            if (index > 0) {
                ThreadSafeHeapNode threadSafeHeapNode = a2[index];
                Intrinsics.checkNotNull(threadSafeHeapNode);
                ThreadSafeHeapNode threadSafeHeapNode2 = a2[j];
                Intrinsics.checkNotNull(threadSafeHeapNode2);
                if (((Comparable) threadSafeHeapNode).compareTo(threadSafeHeapNode2) < 0) {
                    swap(index, j);
                    siftUpFrom(j);
                }
            }
            siftDownFrom(index);
        }
        ThreadSafeHeapNode result = a2[getSize()];
        Intrinsics.checkNotNull(result);
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (result.getHeap() == this) {
                z = true;
            }
            if (!z) {
                throw new AssertionError();
            }
        }
        result.setHeap((ThreadSafeHeap<?>) null);
        result.setIndex(-1);
        a2[getSize()] = null;
        return result;
    }

    public final void addImpl(T node) {
        if (DebugKt.getASSERTIONS_ENABLED()) {
            if (!(node.getHeap() == null)) {
                throw new AssertionError();
            }
        }
        node.setHeap(this);
        ThreadSafeHeapNode[] a2 = realloc();
        int i = getSize();
        setSize(i + 1);
        a2[i] = node;
        node.setIndex(i);
        siftUpFrom(i);
    }

    private final void siftUpFrom(int i) {
        int i2 = i;
        while (i2 > 0) {
            ThreadSafeHeapNode[] a2 = this.a;
            Intrinsics.checkNotNull(a2);
            int j = (i2 - 1) / 2;
            ThreadSafeHeapNode threadSafeHeapNode = a2[j];
            Intrinsics.checkNotNull(threadSafeHeapNode);
            ThreadSafeHeapNode threadSafeHeapNode2 = a2[i2];
            Intrinsics.checkNotNull(threadSafeHeapNode2);
            if (((Comparable) threadSafeHeapNode).compareTo(threadSafeHeapNode2) > 0) {
                swap(i2, j);
                i2 = j;
            } else {
                return;
            }
        }
    }

    private final void siftDownFrom(int i) {
        int i2 = i;
        while (true) {
            int j = (i2 * 2) + 1;
            if (j < getSize()) {
                ThreadSafeHeapNode[] a2 = this.a;
                Intrinsics.checkNotNull(a2);
                if (j + 1 < getSize()) {
                    ThreadSafeHeapNode threadSafeHeapNode = a2[j + 1];
                    Intrinsics.checkNotNull(threadSafeHeapNode);
                    ThreadSafeHeapNode threadSafeHeapNode2 = a2[j];
                    Intrinsics.checkNotNull(threadSafeHeapNode2);
                    if (((Comparable) threadSafeHeapNode).compareTo(threadSafeHeapNode2) < 0) {
                        j++;
                    }
                }
                ThreadSafeHeapNode threadSafeHeapNode3 = a2[i2];
                Intrinsics.checkNotNull(threadSafeHeapNode3);
                ThreadSafeHeapNode threadSafeHeapNode4 = a2[j];
                Intrinsics.checkNotNull(threadSafeHeapNode4);
                if (((Comparable) threadSafeHeapNode3).compareTo(threadSafeHeapNode4) > 0) {
                    swap(i2, j);
                    i2 = j;
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    private final T[] realloc() {
        ThreadSafeHeapNode[] a2 = this.a;
        if (a2 == null) {
            ThreadSafeHeapNode[] it = new ThreadSafeHeapNode[4];
            this.a = it;
            return it;
        } else if (getSize() < a2.length) {
            return a2;
        } else {
            T[] it2 = Arrays.copyOf(a2, getSize() * 2);
            Intrinsics.checkNotNullExpressionValue(it2, "copyOf(this, newSize)");
            this.a = it2;
            return (ThreadSafeHeapNode[]) it2;
        }
    }

    private final void swap(int i, int j) {
        ThreadSafeHeapNode[] a2 = this.a;
        Intrinsics.checkNotNull(a2);
        ThreadSafeHeapNode ni = a2[j];
        Intrinsics.checkNotNull(ni);
        ThreadSafeHeapNode nj = a2[i];
        Intrinsics.checkNotNull(nj);
        a2[i] = ni;
        a2[j] = nj;
        ni.setIndex(i);
        nj.setIndex(j);
    }
}
