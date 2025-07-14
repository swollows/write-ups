package androidx.collection;

import androidx.collection.internal.ContainerHelpersKt;
import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.CollectionToArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMappedMarker;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0016\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\b\r\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\b6\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001<B\u0007\b\u0004¢\u0006\u0002\u0010\u0003J:\u0010\u0013\u001a\u00020\u00142!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00140\u0016H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0006\u0010\u001a\u001a\u00020\u0014J:\u0010\u001a\u001a\u00020\u00142!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00140\u0016H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00028\u00000\u001cJ\u0016\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\u001eJ\b\u0010\u001f\u001a\u00020\u0005H\u0007J:\u0010\u001f\u001a\u00020\u00052!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00140\u0016H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\u0013\u0010 \u001a\u00020\u00142\b\u0010!\u001a\u0004\u0018\u00010\u0002H\u0002J\u0018\u0010\"\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00028\u0000H\b¢\u0006\u0004\b#\u0010$J\u000e\u0010%\u001a\u00028\u0000H\b¢\u0006\u0002\u0010&J?\u0010%\u001a\u00028\u00002!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00140\u0016H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010'JA\u0010(\u001a\u0004\u0018\u00018\u00002!\u0010\u0015\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020\u00140\u0016H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001¢\u0006\u0002\u0010'J:\u0010)\u001a\u00020*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00118\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0004\u0012\u00020*0\u0016H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J:\u0010,\u001a\u00020*2!\u0010+\u001a\u001d\u0012\u0013\u0012\u00110\u0005¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(-\u0012\u0004\u0012\u00020*0\u0016H\bø\u0001\u0000\u0002\b\n\u0006\b\u0001\u0012\u0002\u0010\u0001J\b\u0010.\u001a\u00020\u0005H\u0016J\u0006\u0010/\u001a\u00020\u0014J\u0006\u00100\u001a\u00020\u0014JR\u00101\u001a\u0002022\b\b\u0002\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u0002042\b\b\u0002\u00106\u001a\u0002042\b\b\u0002\u00107\u001a\u00020\u00052\b\b\u0002\u00108\u001a\u0002042\u0016\b\u0002\u00109\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u000204\u0018\u00010\u0016H\u0007J\u0006\u0010:\u001a\u00020\u0014J\b\u0010;\u001a\u000202H\u0016R\u0012\u0010\u0004\u001a\u00020\u00058\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u0006\u001a\u00020\u00058\u0000@\u0000X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0007\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\"\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u000b8\u0000@\u0000X\u000e¢\u0006\n\n\u0002\u0010\r\u0012\u0004\b\f\u0010\u0003R\u0018\u0010\u000e\u001a\u00020\u000f8\u0000@\u0000X\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0010\u0010\u0003R\u0011\u0010\u0011\u001a\u00020\u00058G¢\u0006\u0006\u001a\u0004\b\u0012\u0010\t\u0001\u0001=\u0002\u0007\n\u0005\b20\u0001¨\u0006>"}, d2 = {"Landroidx/collection/ScatterSet;", "E", "", "()V", "_capacity", "", "_size", "capacity", "getCapacity", "()I", "elements", "", "getElements$annotations", "[Ljava/lang/Object;", "metadata", "", "getMetadata$annotations", "size", "getSize", "all", "", "predicate", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "element", "any", "asSet", "", "contains", "(Ljava/lang/Object;)Z", "count", "equals", "other", "findElementIndex", "findElementIndex$collection", "(Ljava/lang/Object;)I", "first", "()Ljava/lang/Object;", "(Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "firstOrNull", "forEach", "", "block", "forEachIndex", "index", "hashCode", "isEmpty", "isNotEmpty", "joinToString", "", "separator", "", "prefix", "postfix", "limit", "truncated", "transform", "none", "toString", "SetWrapper", "Landroidx/collection/MutableScatterSet;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ScatterSet.kt */
public abstract class ScatterSet<E> {
    public int _capacity;
    public int _size;
    public Object[] elements;
    public long[] metadata;

    public /* synthetic */ ScatterSet(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void getElements$annotations() {
    }

    public static /* synthetic */ void getMetadata$annotations() {
    }

    public final String joinToString() {
        return joinToString$default(this, (CharSequence) null, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 63, (Object) null);
    }

    public final String joinToString(CharSequence charSequence) {
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        return joinToString$default(this, charSequence, (CharSequence) null, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 62, (Object) null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        return joinToString$default(this, charSequence, charSequence2, (CharSequence) null, 0, (CharSequence) null, (Function1) null, 60, (Object) null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3) {
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, 0, (CharSequence) null, (Function1) null, 56, (Object) null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i) {
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, (CharSequence) null, (Function1) null, 48, (Object) null);
    }

    public final String joinToString(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4) {
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(charSequence4, "truncated");
        return joinToString$default(this, charSequence, charSequence2, charSequence3, i, charSequence4, (Function1) null, 32, (Object) null);
    }

    private ScatterSet() {
        this.metadata = ScatterMapKt.EmptyGroup;
        this.elements = ContainerHelpersKt.EMPTY_OBJECTS;
    }

    public final int getCapacity() {
        return this._capacity;
    }

    public final int getSize() {
        return this._size;
    }

    public final boolean any() {
        return this._size != 0;
    }

    public final boolean none() {
        return this._size == 0;
    }

    public final boolean isEmpty() {
        return this._size == 0;
    }

    public final boolean isNotEmpty() {
        return this._size != 0;
    }

    public final E first() {
        Object[] k$iv = this.elements;
        long[] m$iv$iv = this.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv; j$iv$iv++) {
                        if ((255 & slot$iv$iv) < 128) {
                            return k$iv[(i$iv$iv << 3) + j$iv$iv];
                        }
                        slot$iv$iv >>= 8;
                    }
                    if (bitCount$iv$iv != 8) {
                        break;
                    }
                }
                if (i$iv$iv == lastIndex$iv$iv) {
                    break;
                }
                i$iv$iv++;
            }
        }
        throw new NoSuchElementException("The ScatterSet is empty");
    }

    public final E first(Function1<? super E, Boolean> predicate) {
        Function1<? super E, Boolean> function1 = predicate;
        Intrinsics.checkNotNullParameter(function1, "predicate");
        int $i$f$first = 0;
        ScatterSet this_$iv = this;
        Object[] k$iv = this_$iv.elements;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                int $i$f$first2 = $i$f$first;
                ScatterSet this_$iv2 = this_$iv;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i = 8;
                    int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv; j$iv$iv++) {
                        if ((255 & slot$iv$iv) < 128) {
                            Object it = k$iv[(i$iv$iv << 3) + j$iv$iv];
                            if (function1.invoke(it).booleanValue()) {
                                return it;
                            }
                        }
                        i = 8;
                        slot$iv$iv >>= 8;
                    }
                    if (bitCount$iv$iv != i) {
                        break;
                    }
                }
                if (i$iv$iv == lastIndex$iv$iv) {
                    break;
                }
                i$iv$iv++;
                $i$f$first = $i$f$first2;
                this_$iv = this_$iv2;
            }
        } else {
            ScatterSet scatterSet = this_$iv;
        }
        throw new NoSuchElementException("Could not find a match");
    }

    public final E firstOrNull(Function1<? super E, Boolean> predicate) {
        Function1<? super E, Boolean> function1 = predicate;
        Intrinsics.checkNotNullParameter(function1, "predicate");
        int $i$f$firstOrNull = 0;
        ScatterSet this_$iv = this;
        Object[] k$iv = this_$iv.elements;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                int $i$f$firstOrNull2 = $i$f$firstOrNull;
                ScatterSet this_$iv2 = this_$iv;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i = 8;
                    int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv; j$iv$iv++) {
                        if ((255 & slot$iv$iv) < 128) {
                            Object it = k$iv[(i$iv$iv << 3) + j$iv$iv];
                            if (function1.invoke(it).booleanValue()) {
                                return it;
                            }
                        }
                        i = 8;
                        slot$iv$iv >>= 8;
                    }
                    if (bitCount$iv$iv != i) {
                        return null;
                    }
                }
                if (i$iv$iv == lastIndex$iv$iv) {
                    return null;
                }
                i$iv$iv++;
                $i$f$firstOrNull = $i$f$firstOrNull2;
                this_$iv = this_$iv2;
            }
        } else {
            ScatterSet scatterSet = this_$iv;
            return null;
        }
    }

    public final void forEachIndex(Function1<? super Integer, Unit> block) {
        Intrinsics.checkNotNullParameter(block, "block");
        long[] m = this.metadata;
        int lastIndex = m.length - 2;
        int i = 0;
        if (0 <= lastIndex) {
            while (true) {
                long slot = m[i];
                long $this$maskEmptyOrDeleted$iv = slot;
                if ((((~$this$maskEmptyOrDeleted$iv) << 7) & $this$maskEmptyOrDeleted$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int bitCount = 8 - ((~(i - lastIndex)) >>> 31);
                    for (int j = 0; j < bitCount; j++) {
                        if ((255 & slot) < 128) {
                            block.invoke(Integer.valueOf((i << 3) + j));
                        }
                        slot >>= 8;
                    }
                    if (bitCount != 8) {
                        return;
                    }
                }
                if (i != lastIndex) {
                    i++;
                } else {
                    return;
                }
            }
        }
    }

    public final void forEach(Function1<? super E, Unit> block) {
        Function1<? super E, Unit> function1 = block;
        Intrinsics.checkNotNullParameter(function1, "block");
        Object[] k = this.elements;
        long[] m$iv = this.metadata;
        int lastIndex$iv = m$iv.length - 2;
        int i$iv = 0;
        if (0 <= lastIndex$iv) {
            while (true) {
                long slot$iv = m$iv[i$iv];
                long $this$maskEmptyOrDeleted$iv$iv = slot$iv;
                if ((((~$this$maskEmptyOrDeleted$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i = 8;
                    int bitCount$iv = 8 - ((~(i$iv - lastIndex$iv)) >>> 31);
                    for (int j$iv = 0; j$iv < bitCount$iv; j$iv++) {
                        if ((255 & slot$iv) < 128) {
                            function1.invoke(k[(i$iv << 3) + j$iv]);
                        }
                        i = 8;
                        slot$iv >>= 8;
                    }
                    if (bitCount$iv != i) {
                        return;
                    }
                }
                if (i$iv != lastIndex$iv) {
                    i$iv++;
                } else {
                    return;
                }
            }
        }
    }

    public final boolean all(Function1<? super E, Boolean> predicate) {
        Function1<? super E, Boolean> function1 = predicate;
        Intrinsics.checkNotNullParameter(function1, "predicate");
        Object[] k$iv = this.elements;
        long[] m$iv$iv = this.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) {
            return true;
        }
        while (true) {
            long slot$iv$iv = m$iv$iv[i$iv$iv];
            long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
            long slot$iv$iv2 = slot$iv$iv;
            if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                int i = 8;
                int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv; j$iv$iv++) {
                    if (((slot$iv$iv2 & 255) < 128) && !function1.invoke(k$iv[(i$iv$iv << 3) + j$iv$iv]).booleanValue()) {
                        return false;
                    }
                    i = 8;
                    slot$iv$iv2 >>= 8;
                }
                if (bitCount$iv$iv != i) {
                    return true;
                }
            }
            if (i$iv$iv == lastIndex$iv$iv) {
                return true;
            }
            i$iv$iv++;
        }
    }

    public final boolean any(Function1<? super E, Boolean> predicate) {
        Function1<? super E, Boolean> function1 = predicate;
        Intrinsics.checkNotNullParameter(function1, "predicate");
        Object[] k$iv = this.elements;
        long[] m$iv$iv = this.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 > lastIndex$iv$iv) {
            return false;
        }
        while (true) {
            long slot$iv$iv = m$iv$iv[i$iv$iv];
            long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
            long slot$iv$iv2 = slot$iv$iv;
            if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                int i = 8;
                int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv; j$iv$iv++) {
                    if (((slot$iv$iv2 & 255) < 128) && function1.invoke(k$iv[(i$iv$iv << 3) + j$iv$iv]).booleanValue()) {
                        return true;
                    }
                    i = 8;
                    slot$iv$iv2 >>= 8;
                }
                if (bitCount$iv$iv != i) {
                    return false;
                }
            }
            if (i$iv$iv == lastIndex$iv$iv) {
                return false;
            }
            i$iv$iv++;
        }
    }

    public final int count() {
        return getSize();
    }

    public final int count(Function1<? super E, Boolean> predicate) {
        Function1<? super E, Boolean> function1 = predicate;
        Intrinsics.checkNotNullParameter(function1, "predicate");
        int $i$f$count = 0;
        int count = 0;
        Object[] k$iv = this.elements;
        long[] m$iv$iv = this.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                int $i$f$count2 = $i$f$count;
                int count2 = count;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i = 8;
                    int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv; j$iv$iv++) {
                        if (((255 & slot$iv$iv) < 128) && function1.invoke(k$iv[(i$iv$iv << 3) + j$iv$iv]).booleanValue()) {
                            count2++;
                        }
                        i = 8;
                        slot$iv$iv >>= 8;
                    }
                    if (bitCount$iv$iv != i) {
                        return count2;
                    }
                    count = count2;
                } else {
                    count = count2;
                }
                if (i$iv$iv == lastIndex$iv$iv) {
                    break;
                }
                i$iv$iv++;
                $i$f$count = $i$f$count2;
            }
        }
        return count;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0091, code lost:
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x009f, code lost:
        if (((((~r9) << 6) & r9) & -9187201950435737472L) == 0) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x00a1, code lost:
        r9 = -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean contains(E r24) {
        /*
            r23 = this;
            r0 = r24
            r1 = r23
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x000d
            int r5 = r24.hashCode()
            goto L_0x000e
        L_0x000d:
            r5 = 0
        L_0x000e:
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r5 = r5 * r6
            int r6 = r5 << 16
            r3 = r5 ^ r6
            r5 = 0
            r5 = r3 & 127(0x7f, float:1.78E-43)
            int r6 = r1._capacity
            r7 = 0
            int r7 = r3 >>> 7
            r7 = r7 & r6
            r8 = 0
        L_0x0022:
            long[] r9 = r1.metadata
            r10 = 0
            int r11 = r7 >> 3
            r12 = r7 & 7
            int r12 = r12 << 3
            r13 = r9[r11]
            long r13 = r13 >>> r12
            int r15 = r11 + 1
            r15 = r9[r15]
            int r17 = 64 - r12
            long r15 = r15 << r17
            r18 = r5
            long r4 = (long) r12
            long r4 = -r4
            r19 = 63
            long r4 = r4 >> r19
            long r4 = r4 & r15
            long r4 = r4 | r13
            r9 = r4
            r11 = 0
            r12 = r18
            long r13 = (long) r12
            r15 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r13 = r13 * r15
            long r13 = r13 ^ r9
            long r15 = r13 - r15
            r18 = r2
            r19 = r3
            long r2 = ~r13
            long r2 = r2 & r15
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r15
        L_0x005d:
            r9 = r2
            r11 = 0
            r13 = 0
            int r20 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            r21 = 1
            if (r20 == 0) goto L_0x006a
            r9 = r21
            goto L_0x006b
        L_0x006a:
            r9 = 0
        L_0x006b:
            if (r9 == 0) goto L_0x0091
            r9 = r2
            r11 = 0
            r13 = r9
            r20 = 0
            int r22 = java.lang.Long.numberOfTrailingZeros(r13)
            int r13 = r22 >> 3
            int r13 = r13 + r7
            r9 = r13 & r6
            java.lang.Object[] r10 = r1.elements
            r10 = r10[r9]
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r0)
            if (r10 == 0) goto L_0x0087
            goto L_0x00a3
        L_0x0087:
            r10 = r2
            r13 = 0
            r20 = 1
            long r20 = r10 - r20
            long r10 = r10 & r20
            r2 = r10
            goto L_0x005d
        L_0x0091:
            r9 = r4
            r11 = 0
            long r13 = ~r9
            r20 = 6
            long r13 = r13 << r20
            long r13 = r13 & r9
            long r9 = r13 & r15
            r13 = 0
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x00aa
            r9 = -1
        L_0x00a3:
            if (r9 < 0) goto L_0x00a8
            r4 = r21
            goto L_0x00a9
        L_0x00a8:
            r4 = 0
        L_0x00a9:
            return r4
        L_0x00aa:
            int r8 = r8 + 8
            int r9 = r7 + r8
            r7 = r9 & r6
            r5 = r12
            r2 = r18
            r3 = r19
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterSet.contains(java.lang.Object):boolean");
    }

    public static /* synthetic */ String joinToString$default(ScatterSet scatterSet, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        int i3;
        CharSequence charSequence5;
        if (obj == null) {
            if ((i2 & 1) != 0) {
            }
            String str = (i2 & 2) != 0 ? "" : charSequence2;
            String str2 = (i2 & 4) != 0 ? "" : charSequence3;
            if ((i2 & 8) != 0) {
                i3 = -1;
            } else {
                i3 = i;
            }
            if ((i2 & 16) != 0) {
                charSequence5 = "...";
            } else {
                charSequence5 = charSequence4;
            }
            return scatterSet.joinToString(charSequence, str, str2, i3, charSequence5, (i2 & 32) != 0 ? null : function1);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: joinToString");
    }

    public final String joinToString(CharSequence separator, CharSequence prefix, CharSequence postfix, int limit, CharSequence truncated, Function1<? super E, ? extends CharSequence> transform) {
        Object[] k$iv;
        Object[] k$iv2;
        CharSequence charSequence = separator;
        CharSequence charSequence2 = prefix;
        CharSequence charSequence3 = postfix;
        CharSequence charSequence4 = truncated;
        Function1<? super E, ? extends CharSequence> function1 = transform;
        Intrinsics.checkNotNullParameter(charSequence, "separator");
        Intrinsics.checkNotNullParameter(charSequence2, "prefix");
        Intrinsics.checkNotNullParameter(charSequence3, "postfix");
        Intrinsics.checkNotNullParameter(charSequence4, "truncated");
        StringBuilder sb = new StringBuilder();
        StringBuilder $this$joinToString_u24lambda_u2415 = sb;
        int i = 0;
        $this$joinToString_u24lambda_u2415.append(charSequence2);
        int index = 0;
        ScatterSet this_$iv = this;
        int $i$f$forEach = 0;
        Object[] k$iv3 = this_$iv.elements;
        long[] m$iv$iv = this_$iv.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            loop0:
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                int i2 = i;
                int index2 = index;
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                ScatterSet this_$iv2 = this_$iv;
                int $i$f$forEach2 = $i$f$forEach;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int i3 = 8;
                    int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    int j$iv$iv = 0;
                    int index3 = index2;
                    while (j$iv$iv < bitCount$iv$iv) {
                        if ((slot$iv$iv & 255) < 128) {
                            Object element = k$iv3[(i$iv$iv << 3) + j$iv$iv];
                            k$iv2 = k$iv3;
                            if (index3 == limit) {
                                $this$joinToString_u24lambda_u2415.append(charSequence4);
                                break loop0;
                            }
                            if (index3 != 0) {
                                $this$joinToString_u24lambda_u2415.append(charSequence);
                            }
                            if (function1 == null) {
                                $this$joinToString_u24lambda_u2415.append(element);
                            } else {
                                $this$joinToString_u24lambda_u2415.append((CharSequence) function1.invoke(element));
                            }
                            index3++;
                        } else {
                            k$iv2 = k$iv3;
                            int i4 = limit;
                        }
                        slot$iv$iv >>= 8;
                        j$iv$iv++;
                        i3 = 8;
                        k$iv3 = k$iv2;
                        charSequence = separator;
                    }
                    k$iv = k$iv3;
                    int i5 = limit;
                    if (bitCount$iv$iv != i3) {
                        break;
                    }
                    index = index3;
                } else {
                    k$iv = k$iv3;
                    int i6 = limit;
                    index = index2;
                }
                if (i$iv$iv == lastIndex$iv$iv) {
                    break;
                }
                i$iv$iv++;
                charSequence = separator;
                this_$iv = this_$iv2;
                $i$f$forEach = $i$f$forEach2;
                i = i2;
                k$iv3 = k$iv;
            }
        } else {
            ScatterSet scatterSet = this_$iv;
            Object[] objArr = k$iv3;
            int i7 = limit;
        }
        int i8 = index;
        $this$joinToString_u24lambda_u2415.append(charSequence3);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "StringBuilder().apply(builderAction).toString()");
        return sb2;
    }

    public int hashCode() {
        int hash = 0;
        Object[] k$iv = this.elements;
        long[] m$iv$iv = this.metadata;
        int lastIndex$iv$iv = m$iv$iv.length - 2;
        int i$iv$iv = 0;
        if (0 <= lastIndex$iv$iv) {
            while (true) {
                long slot$iv$iv = m$iv$iv[i$iv$iv];
                long $this$maskEmptyOrDeleted$iv$iv$iv = slot$iv$iv;
                if ((((~$this$maskEmptyOrDeleted$iv$iv$iv) << 7) & $this$maskEmptyOrDeleted$iv$iv$iv & -9187201950435737472L) != -9187201950435737472L) {
                    int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv; j$iv$iv++) {
                        int i = 0;
                        if ((255 & slot$iv$iv) < 128) {
                            Object element = k$iv[(i$iv$iv << 3) + j$iv$iv];
                            if (element != null) {
                                i = element.hashCode();
                            }
                            hash += i;
                        }
                        slot$iv$iv >>= 8;
                    }
                    if (bitCount$iv$iv != 8) {
                        break;
                    }
                }
                if (i$iv$iv == lastIndex$iv$iv) {
                    break;
                }
                i$iv$iv++;
            }
        }
        return hash;
    }

    public boolean equals(Object other) {
        boolean z;
        Object obj = other;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof ScatterSet) || ((ScatterSet) obj).getSize() != getSize()) {
            return false;
        }
        ScatterSet o = (ScatterSet) obj;
        ScatterSet this_$iv = this;
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
                    int bitCount$iv$iv = 8 - ((~(i$iv$iv - lastIndex$iv$iv)) >>> 31);
                    for (int j$iv$iv = 0; j$iv$iv < bitCount$iv$iv; j$iv$iv++) {
                        if (((slot$iv$iv & 255) < 128 ? 1 : 0) != 0 && !o.contains(k$iv[(i$iv$iv << 3) + j$iv$iv])) {
                            return false;
                        }
                        slot$iv$iv >>= 8;
                    }
                    z = false;
                    if (bitCount$iv$iv != 8) {
                        return true;
                    }
                } else {
                    z = false;
                }
                if (i$iv$iv == lastIndex$iv$iv) {
                    return true;
                }
                i$iv$iv++;
                this_$iv = this_$iv2;
                boolean z2 = z;
            }
        } else {
            return true;
        }
    }

    public String toString() {
        return joinToString$default(this, (CharSequence) null, "[", "]", 0, (CharSequence) null, new ScatterSet$toString$1(this), 25, (Object) null);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0090, code lost:
        r9 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x009e, code lost:
        if (((((~r9) << 6) & r9) & -9187201950435737472L) == 0) goto L_0x00a3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a0, code lost:
        return -1;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int findElementIndex$collection(E r24) {
        /*
            r23 = this;
            r0 = r23
            r1 = r24
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L_0x000d
            int r5 = r24.hashCode()
            goto L_0x000e
        L_0x000d:
            r5 = 0
        L_0x000e:
            r6 = -862048943(0xffffffffcc9e2d51, float:-8.2930312E7)
            int r5 = r5 * r6
            int r6 = r5 << 16
            r3 = r5 ^ r6
            r5 = 0
            r5 = r3 & 127(0x7f, float:1.78E-43)
            int r6 = r0._capacity
            r7 = 0
            int r7 = r3 >>> 7
            r7 = r7 & r6
            r8 = 0
        L_0x0022:
            long[] r9 = r0.metadata
            r10 = 0
            int r11 = r7 >> 3
            r12 = r7 & 7
            int r12 = r12 << 3
            r13 = r9[r11]
            long r13 = r13 >>> r12
            int r15 = r11 + 1
            r15 = r9[r15]
            int r17 = 64 - r12
            long r15 = r15 << r17
            r18 = r5
            long r4 = (long) r12
            long r4 = -r4
            r19 = 63
            long r4 = r4 >> r19
            long r4 = r4 & r15
            long r4 = r4 | r13
            r9 = r4
            r11 = 0
            r12 = r18
            long r13 = (long) r12
            r15 = 72340172838076673(0x101010101010101, double:7.748604185489348E-304)
            long r13 = r13 * r15
            long r13 = r13 ^ r9
            long r15 = r13 - r15
            r18 = r2
            r19 = r3
            long r2 = ~r13
            long r2 = r2 & r15
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r2 = r2 & r15
        L_0x005d:
            r9 = r2
            r11 = 0
            r13 = 0
            int r20 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r20 == 0) goto L_0x0068
            r20 = 1
            goto L_0x006a
        L_0x0068:
            r20 = 0
        L_0x006a:
            if (r20 == 0) goto L_0x0090
            r9 = r2
            r11 = 0
            r13 = r9
            r20 = 0
            int r21 = java.lang.Long.numberOfTrailingZeros(r13)
            int r13 = r21 >> 3
            int r13 = r13 + r7
            r9 = r13 & r6
            java.lang.Object[] r10 = r0.elements
            r10 = r10[r9]
            boolean r10 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r1)
            if (r10 == 0) goto L_0x0086
            return r9
        L_0x0086:
            r10 = r2
            r13 = 0
            r20 = 1
            long r20 = r10 - r20
            long r10 = r10 & r20
            r2 = r10
            goto L_0x005d
        L_0x0090:
            r9 = r4
            r11 = 0
            long r13 = ~r9
            r22 = 6
            long r13 = r13 << r22
            long r13 = r13 & r9
            long r9 = r13 & r15
            r13 = 0
            int r9 = (r9 > r13 ? 1 : (r9 == r13 ? 0 : -1))
            if (r9 == 0) goto L_0x00a3
            r2 = -1
            return r2
        L_0x00a3:
            int r8 = r8 + 8
            int r9 = r7 + r8
            r7 = r9 & r6
            r5 = r12
            r2 = r18
            r3 = r19
            goto L_0x0022
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterSet.findElementIndex$collection(java.lang.Object):int");
    }

    public final Set<E> asSet() {
        return new SetWrapper();
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\"\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010(\n\u0000\b\u0004\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00028\u0000H\u0002¢\u0006\u0002\u0010\nJ\u0016\u0010\u000b\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\rH\u0016J\b\u0010\u000e\u001a\u00020\bH\u0016J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u0010H\u0002R\u0014\u0010\u0003\u001a\u00020\u00048VX\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Landroidx/collection/ScatterSet$SetWrapper;", "", "(Landroidx/collection/ScatterSet;)V", "size", "", "getSize", "()I", "contains", "", "element", "(Ljava/lang/Object;)Z", "containsAll", "elements", "", "isEmpty", "iterator", "", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: ScatterSet.kt */
    public class SetWrapper implements Set<E>, KMappedMarker {
        public boolean add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean addAll(Collection<? extends E> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public void clear() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean remove(Object obj) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean removeAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public boolean retainAll(Collection<? extends Object> collection) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public Object[] toArray() {
            return CollectionToArray.toArray(this);
        }

        public <T> T[] toArray(T[] tArr) {
            Intrinsics.checkNotNullParameter(tArr, "array");
            return CollectionToArray.toArray(this, tArr);
        }

        public SetWrapper() {
        }

        public final /* bridge */ int size() {
            return getSize();
        }

        public int getSize() {
            return ScatterSet.this._size;
        }

        public boolean containsAll(Collection<? extends Object> elements) {
            Intrinsics.checkNotNullParameter(elements, "elements");
            ScatterSet<E> scatterSet = ScatterSet.this;
            for (Object element$iv : elements) {
                if (!scatterSet.contains(element$iv)) {
                    return false;
                }
            }
            return true;
        }

        public boolean contains(Object element) {
            return ScatterSet.this.contains(element);
        }

        public boolean isEmpty() {
            return ScatterSet.this.isEmpty();
        }

        public Iterator<E> iterator() {
            return SequencesKt.iterator(new ScatterSet$SetWrapper$iterator$1(ScatterSet.this, (Continuation<? super ScatterSet$SetWrapper$iterator$1>) null));
        }
    }
}
