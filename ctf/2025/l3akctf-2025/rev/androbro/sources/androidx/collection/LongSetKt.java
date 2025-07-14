package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0016\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u001a\u0006\u0010\u0006\u001a\u00020\u0007\u001a\u0011\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\b\u001a\u0006\u0010\f\u001a\u00020\u0007\u001a\u000e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000b\u001a\u0016\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b\u001a\u001e\u0010\f\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b\u001a\u0012\u0010\f\u001a\u00020\u00072\n\u0010\u0010\u001a\u00020\u0001\"\u00020\u000b\u001a\u0006\u0010\u0011\u001a\u00020\u0005\u001a\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000b\u001a\u0016\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b\u001a\u001e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000b\u001a\u0012\u0010\u0011\u001a\u00020\u00052\n\u0010\u0010\u001a\u00020\u0001\"\u00020\u000b\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"EmptyLongArray", "", "getEmptyLongArray", "()[J", "EmptyLongSet", "Landroidx/collection/MutableLongSet;", "emptyLongSet", "Landroidx/collection/LongSet;", "hash", "", "k", "", "longSetOf", "element1", "element2", "element3", "elements", "mutableLongSetOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LongSet.kt */
public final class LongSetKt {
    private static final long[] EmptyLongArray = new long[0];
    private static final MutableLongSet EmptyLongSet = new MutableLongSet(0);

    public static final long[] getEmptyLongArray() {
        return EmptyLongArray;
    }

    public static final LongSet emptyLongSet() {
        return EmptyLongSet;
    }

    public static final LongSet longSetOf() {
        return EmptyLongSet;
    }

    public static final LongSet longSetOf(long element1) {
        return mutableLongSetOf(element1);
    }

    public static final LongSet longSetOf(long element1, long element2) {
        return mutableLongSetOf(element1, element2);
    }

    public static final LongSet longSetOf(long element1, long element2, long element3) {
        return mutableLongSetOf(element1, element2, element3);
    }

    public static final LongSet longSetOf(long... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableLongSet $this$longSetOf_u24lambda_u240 = new MutableLongSet(elements.length);
        $this$longSetOf_u24lambda_u240.plusAssign(elements);
        return $this$longSetOf_u24lambda_u240;
    }

    public static final MutableLongSet mutableLongSetOf() {
        return new MutableLongSet(0, 1, (DefaultConstructorMarker) null);
    }

    public static final MutableLongSet mutableLongSetOf(long element1) {
        MutableLongSet $this$mutableLongSetOf_u24lambda_u241 = new MutableLongSet(1);
        $this$mutableLongSetOf_u24lambda_u241.plusAssign(element1);
        return $this$mutableLongSetOf_u24lambda_u241;
    }

    public static final MutableLongSet mutableLongSetOf(long element1, long element2) {
        MutableLongSet mutableLongSet = new MutableLongSet(2);
        MutableLongSet $this$mutableLongSetOf_u24lambda_u242 = mutableLongSet;
        $this$mutableLongSetOf_u24lambda_u242.plusAssign(element1);
        $this$mutableLongSetOf_u24lambda_u242.plusAssign(element2);
        return mutableLongSet;
    }

    public static final MutableLongSet mutableLongSetOf(long element1, long element2, long element3) {
        MutableLongSet mutableLongSet = new MutableLongSet(3);
        MutableLongSet $this$mutableLongSetOf_u24lambda_u243 = mutableLongSet;
        $this$mutableLongSetOf_u24lambda_u243.plusAssign(element1);
        $this$mutableLongSetOf_u24lambda_u243.plusAssign(element2);
        $this$mutableLongSetOf_u24lambda_u243.plusAssign(element3);
        return mutableLongSet;
    }

    public static final MutableLongSet mutableLongSetOf(long... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableLongSet $this$mutableLongSetOf_u24lambda_u244 = new MutableLongSet(elements.length);
        $this$mutableLongSetOf_u24lambda_u244.plusAssign(elements);
        return $this$mutableLongSetOf_u24lambda_u244;
    }

    public static final int hash(long k) {
        int hash = Long.hashCode(k) * ScatterMapKt.MurmurHashC1;
        return (hash << 16) ^ hash;
    }
}
