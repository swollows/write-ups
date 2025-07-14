package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0006\u0010\u0002\u001a\u00020\u0001\u001a\u0006\u0010\u0003\u001a\u00020\u0001\u001a\u000e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001e\u0010\u0003\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005\u001a\u0012\u0010\u0003\u001a\u00020\u00012\n\u0010\b\u001a\u00020\t\"\u00020\u0005\u001a\t\u0010\n\u001a\u00020\u000bH\b\u001a\u000e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005\u001a\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0005\u001a\u001e\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005\u001a\u0015\u0010\n\u001a\u00020\u000b2\n\u0010\b\u001a\u00020\t\"\u00020\u0005H\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"EmptyIntList", "Landroidx/collection/IntList;", "emptyIntList", "intListOf", "element1", "", "element2", "element3", "elements", "", "mutableIntListOf", "Landroidx/collection/MutableIntList;", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: IntList.kt */
public final class IntListKt {
    private static final IntList EmptyIntList = new MutableIntList(0);

    public static final IntList emptyIntList() {
        return EmptyIntList;
    }

    public static final IntList intListOf() {
        return EmptyIntList;
    }

    public static final IntList intListOf(int element1) {
        return mutableIntListOf(element1);
    }

    public static final IntList intListOf(int element1, int element2) {
        return mutableIntListOf(element1, element2);
    }

    public static final IntList intListOf(int element1, int element2, int element3) {
        return mutableIntListOf(element1, element2, element3);
    }

    public static final IntList intListOf(int... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableIntList $this$intListOf_u24lambda_u240 = new MutableIntList(elements.length);
        $this$intListOf_u24lambda_u240.plusAssign(elements);
        return $this$intListOf_u24lambda_u240;
    }

    public static final MutableIntList mutableIntListOf() {
        return new MutableIntList(0, 1, (DefaultConstructorMarker) null);
    }

    public static final MutableIntList mutableIntListOf(int element1) {
        MutableIntList list = new MutableIntList(1);
        list.add(element1);
        return list;
    }

    public static final MutableIntList mutableIntListOf(int element1, int element2) {
        MutableIntList list = new MutableIntList(2);
        MutableIntList this_$iv = list;
        this_$iv.add(element1);
        this_$iv.add(element2);
        return list;
    }

    public static final MutableIntList mutableIntListOf(int element1, int element2, int element3) {
        MutableIntList list = new MutableIntList(3);
        MutableIntList this_$iv = list;
        this_$iv.add(element1);
        this_$iv.add(element2);
        this_$iv.add(element3);
        return list;
    }

    public static final MutableIntList mutableIntListOf(int... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableIntList $this$mutableIntListOf_u24lambda_u241 = new MutableIntList(elements.length);
        $this$mutableIntListOf_u24lambda_u241.plusAssign(elements);
        return $this$mutableIntListOf_u24lambda_u241;
    }
}
