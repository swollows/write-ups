package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u001a\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\b\u001a\u0006\u0010\u000b\u001a\u00020\u0007\u001a\u000e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t\u001a\u0016\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t\u001a\u001e\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t\u001a\u0012\u0010\u000b\u001a\u00020\u00072\n\u0010\u000f\u001a\u00020\u0001\"\u00020\t\u001a\u0006\u0010\u0010\u001a\u00020\u0005\u001a\u000e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\t\u001a\u0016\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t\u001a\u001e\u0010\u0010\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\t\u001a\u0012\u0010\u0010\u001a\u00020\u00052\n\u0010\u000f\u001a\u00020\u0001\"\u00020\t\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"EmptyIntArray", "", "getEmptyIntArray", "()[I", "EmptyIntSet", "Landroidx/collection/MutableIntSet;", "emptyIntSet", "Landroidx/collection/IntSet;", "hash", "", "k", "intSetOf", "element1", "element2", "element3", "elements", "mutableIntSetOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: IntSet.kt */
public final class IntSetKt {
    private static final int[] EmptyIntArray = new int[0];
    private static final MutableIntSet EmptyIntSet = new MutableIntSet(0);

    public static final int[] getEmptyIntArray() {
        return EmptyIntArray;
    }

    public static final IntSet emptyIntSet() {
        return EmptyIntSet;
    }

    public static final IntSet intSetOf() {
        return EmptyIntSet;
    }

    public static final IntSet intSetOf(int element1) {
        return mutableIntSetOf(element1);
    }

    public static final IntSet intSetOf(int element1, int element2) {
        return mutableIntSetOf(element1, element2);
    }

    public static final IntSet intSetOf(int element1, int element2, int element3) {
        return mutableIntSetOf(element1, element2, element3);
    }

    public static final IntSet intSetOf(int... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableIntSet $this$intSetOf_u24lambda_u240 = new MutableIntSet(elements.length);
        $this$intSetOf_u24lambda_u240.plusAssign(elements);
        return $this$intSetOf_u24lambda_u240;
    }

    public static final MutableIntSet mutableIntSetOf() {
        return new MutableIntSet(0, 1, (DefaultConstructorMarker) null);
    }

    public static final MutableIntSet mutableIntSetOf(int element1) {
        MutableIntSet $this$mutableIntSetOf_u24lambda_u241 = new MutableIntSet(1);
        $this$mutableIntSetOf_u24lambda_u241.plusAssign(element1);
        return $this$mutableIntSetOf_u24lambda_u241;
    }

    public static final MutableIntSet mutableIntSetOf(int element1, int element2) {
        MutableIntSet mutableIntSet = new MutableIntSet(2);
        MutableIntSet $this$mutableIntSetOf_u24lambda_u242 = mutableIntSet;
        $this$mutableIntSetOf_u24lambda_u242.plusAssign(element1);
        $this$mutableIntSetOf_u24lambda_u242.plusAssign(element2);
        return mutableIntSet;
    }

    public static final MutableIntSet mutableIntSetOf(int element1, int element2, int element3) {
        MutableIntSet mutableIntSet = new MutableIntSet(3);
        MutableIntSet $this$mutableIntSetOf_u24lambda_u243 = mutableIntSet;
        $this$mutableIntSetOf_u24lambda_u243.plusAssign(element1);
        $this$mutableIntSetOf_u24lambda_u243.plusAssign(element2);
        $this$mutableIntSetOf_u24lambda_u243.plusAssign(element3);
        return mutableIntSet;
    }

    public static final MutableIntSet mutableIntSetOf(int... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableIntSet $this$mutableIntSetOf_u24lambda_u244 = new MutableIntSet(elements.length);
        $this$mutableIntSetOf_u24lambda_u244.plusAssign(elements);
        return $this$mutableIntSetOf_u24lambda_u244;
    }

    public static final int hash(int k) {
        int hash = Integer.hashCode(k) * ScatterMapKt.MurmurHashC1;
        return (hash << 16) ^ hash;
    }
}
