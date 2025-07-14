package androidx.collection;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u001a\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0004\b\u0000\u0010\u0007\u001a\u0015\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t\"\u0004\b\u0000\u0010\u0007H\b\u001a\u001f\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t\"\u0004\b\u0000\u0010\u00072\u0006\u0010\n\u001a\u0002H\u0007¢\u0006\u0002\u0010\u000b\u001a'\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t\"\u0004\b\u0000\u0010\u00072\u0006\u0010\n\u001a\u0002H\u00072\u0006\u0010\f\u001a\u0002H\u0007¢\u0006\u0002\u0010\r\u001a/\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t\"\u0004\b\u0000\u0010\u00072\u0006\u0010\n\u001a\u0002H\u00072\u0006\u0010\f\u001a\u0002H\u00072\u0006\u0010\u000e\u001a\u0002H\u0007¢\u0006\u0002\u0010\u000f\u001a.\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00070\t\"\u0004\b\u0000\u0010\u00072\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0001\"\u0002H\u0007H\b¢\u0006\u0002\u0010\u0011\u001a\u0012\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0004\b\u0000\u0010\u0007\u001a\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0004\b\u0000\u0010\u00072\u0006\u0010\n\u001a\u0002H\u0007¢\u0006\u0002\u0010\u0013\u001a'\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0004\b\u0000\u0010\u00072\u0006\u0010\n\u001a\u0002H\u00072\u0006\u0010\f\u001a\u0002H\u0007¢\u0006\u0002\u0010\u0014\u001a/\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0004\b\u0000\u0010\u00072\u0006\u0010\n\u001a\u0002H\u00072\u0006\u0010\f\u001a\u0002H\u00072\u0006\u0010\u000e\u001a\u0002H\u0007¢\u0006\u0002\u0010\u0015\u001a+\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u00070\u0005\"\u0004\b\u0000\u0010\u00072\u0012\u0010\u0010\u001a\n\u0012\u0006\b\u0001\u0012\u0002H\u00070\u0001\"\u0002H\u0007¢\u0006\u0002\u0010\u0016\u001a\u0018\u0010\u0017\u001a\u00020\u0018*\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u001a\u001a\u00020\u001bH\u0002\u001a \u0010\u001c\u001a\u00020\u0018*\u0006\u0012\u0002\b\u00030\u00192\u0006\u0010\u001d\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001bH\u0002\"\u0018\u0010\u0000\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001X\u0004¢\u0006\u0004\n\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, d2 = {"EmptyArray", "", "", "[Ljava/lang/Object;", "EmptyObjectList", "Landroidx/collection/ObjectList;", "emptyObjectList", "E", "mutableObjectListOf", "Landroidx/collection/MutableObjectList;", "element1", "(Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "element2", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "element3", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "elements", "([Ljava/lang/Object;)Landroidx/collection/MutableObjectList;", "objectListOf", "(Ljava/lang/Object;)Landroidx/collection/ObjectList;", "(Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/ObjectList;", "(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Landroidx/collection/ObjectList;", "([Ljava/lang/Object;)Landroidx/collection/ObjectList;", "checkIndex", "", "", "index", "", "checkSubIndex", "fromIndex", "toIndex", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: ObjectList.kt */
public final class ObjectListKt {
    /* access modifiers changed from: private */
    public static final Object[] EmptyArray = new Object[0];
    private static final ObjectList<Object> EmptyObjectList = new MutableObjectList(0);

    /* access modifiers changed from: private */
    public static final void checkIndex(List<?> $this$checkIndex, int index) {
        int size = $this$checkIndex.size();
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds. The list has " + size + " elements.");
        }
    }

    /* access modifiers changed from: private */
    public static final void checkSubIndex(List<?> $this$checkSubIndex, int fromIndex, int toIndex) {
        int size = $this$checkSubIndex.size();
        if (fromIndex > toIndex) {
            throw new IllegalArgumentException("Indices are out of order. fromIndex (" + fromIndex + ") is greater than toIndex (" + toIndex + ").");
        } else if (fromIndex < 0) {
            throw new IndexOutOfBoundsException("fromIndex (" + fromIndex + ") is less than 0.");
        } else if (toIndex > size) {
            throw new IndexOutOfBoundsException("toIndex (" + toIndex + ") is more than than the list size (" + size + ')');
        }
    }

    public static final <E> ObjectList<E> emptyObjectList() {
        ObjectList<Object> objectList = EmptyObjectList;
        Intrinsics.checkNotNull(objectList, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.emptyObjectList>");
        return objectList;
    }

    public static final <E> ObjectList<E> objectListOf() {
        ObjectList<Object> objectList = EmptyObjectList;
        Intrinsics.checkNotNull(objectList, "null cannot be cast to non-null type androidx.collection.ObjectList<E of androidx.collection.ObjectListKt.objectListOf>");
        return objectList;
    }

    public static final <E> ObjectList<E> objectListOf(E element1) {
        return mutableObjectListOf(element1);
    }

    public static final <E> ObjectList<E> objectListOf(E element1, E element2) {
        return mutableObjectListOf(element1, element2);
    }

    public static final <E> ObjectList<E> objectListOf(E element1, E element2, E element3) {
        return mutableObjectListOf(element1, element2, element3);
    }

    public static final <E> ObjectList<E> objectListOf(E... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableObjectList $this$objectListOf_u24lambda_u240 = new MutableObjectList(elements.length);
        $this$objectListOf_u24lambda_u240.plusAssign(elements);
        return $this$objectListOf_u24lambda_u240;
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf() {
        return new MutableObjectList<>(0, 1, (DefaultConstructorMarker) null);
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf(E element1) {
        MutableObjectList this_$iv = new MutableObjectList(1);
        this_$iv.add(element1);
        return this_$iv;
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf(E element1, E element2) {
        MutableObjectList mutableObjectList = new MutableObjectList(2);
        MutableObjectList this_$iv = mutableObjectList;
        this_$iv.add(element1);
        this_$iv.add(element2);
        return mutableObjectList;
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf(E element1, E element2, E element3) {
        MutableObjectList mutableObjectList = new MutableObjectList(3);
        MutableObjectList this_$iv = mutableObjectList;
        this_$iv.add(element1);
        this_$iv.add(element2);
        this_$iv.add(element3);
        return mutableObjectList;
    }

    public static final <E> MutableObjectList<E> mutableObjectListOf(E... elements) {
        Intrinsics.checkNotNullParameter(elements, "elements");
        MutableObjectList $this$mutableObjectListOf_u24lambda_u241 = new MutableObjectList(elements.length);
        $this$mutableObjectListOf_u24lambda_u241.plusAssign(elements);
        return $this$mutableObjectListOf_u24lambda_u241;
    }
}
