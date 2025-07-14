package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b\u001a6\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b\u001aF\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b\u001aV\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b\u001a\u0006\u0010\u0011\u001a\u00020\u0001\u001a\u0016\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a&\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b\u001a6\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b\u001aF\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b\u001aV\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"EmptyIntLongMap", "Landroidx/collection/MutableIntLongMap;", "emptyIntLongMap", "Landroidx/collection/IntLongMap;", "intLongMapOf", "key1", "", "value1", "", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableIntLongMapOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: IntLongMap.kt */
public final class IntLongMapKt {
    private static final MutableIntLongMap EmptyIntLongMap = new MutableIntLongMap(0);

    public static final IntLongMap emptyIntLongMap() {
        return EmptyIntLongMap;
    }

    public static final IntLongMap intLongMapOf() {
        return EmptyIntLongMap;
    }

    public static final IntLongMap intLongMapOf(int key1, long value1) {
        MutableIntLongMap map = new MutableIntLongMap(0, 1, (DefaultConstructorMarker) null);
        map.set(key1, value1);
        return map;
    }

    public static final IntLongMap intLongMapOf(int key1, long value1, int key2, long value2) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, (DefaultConstructorMarker) null);
        MutableIntLongMap map = mutableIntLongMap;
        map.set(key1, value1);
        map.set(key2, value2);
        return mutableIntLongMap;
    }

    public static final IntLongMap intLongMapOf(int key1, long value1, int key2, long value2, int key3, long value3) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, (DefaultConstructorMarker) null);
        MutableIntLongMap map = mutableIntLongMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        return mutableIntLongMap;
    }

    public static final IntLongMap intLongMapOf(int key1, long value1, int key2, long value2, int key3, long value3, int key4, long value4) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, (DefaultConstructorMarker) null);
        MutableIntLongMap map = mutableIntLongMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        map.set(key4, value4);
        return mutableIntLongMap;
    }

    public static final IntLongMap intLongMapOf(int key1, long value1, int key2, long value2, int key3, long value3, int key4, long value4, int key5, long value5) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, (DefaultConstructorMarker) null);
        MutableIntLongMap map = mutableIntLongMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        map.set(key4, value4);
        map.set(key5, value5);
        return mutableIntLongMap;
    }

    public static final MutableIntLongMap mutableIntLongMapOf() {
        return new MutableIntLongMap(0, 1, (DefaultConstructorMarker) null);
    }

    public static final MutableIntLongMap mutableIntLongMapOf(int key1, long value1) {
        MutableIntLongMap map = new MutableIntLongMap(0, 1, (DefaultConstructorMarker) null);
        map.set(key1, value1);
        return map;
    }

    public static final MutableIntLongMap mutableIntLongMapOf(int key1, long value1, int key2, long value2) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, (DefaultConstructorMarker) null);
        MutableIntLongMap map = mutableIntLongMap;
        map.set(key1, value1);
        map.set(key2, value2);
        return mutableIntLongMap;
    }

    public static final MutableIntLongMap mutableIntLongMapOf(int key1, long value1, int key2, long value2, int key3, long value3) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, (DefaultConstructorMarker) null);
        MutableIntLongMap map = mutableIntLongMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        return mutableIntLongMap;
    }

    public static final MutableIntLongMap mutableIntLongMapOf(int key1, long value1, int key2, long value2, int key3, long value3, int key4, long value4) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, (DefaultConstructorMarker) null);
        MutableIntLongMap map = mutableIntLongMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        map.set(key4, value4);
        return mutableIntLongMap;
    }

    public static final MutableIntLongMap mutableIntLongMapOf(int key1, long value1, int key2, long value2, int key3, long value3, int key4, long value4, int key5, long value5) {
        MutableIntLongMap mutableIntLongMap = new MutableIntLongMap(0, 1, (DefaultConstructorMarker) null);
        MutableIntLongMap map = mutableIntLongMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        map.set(key4, value4);
        map.set(key5, value5);
        return mutableIntLongMap;
    }
}
