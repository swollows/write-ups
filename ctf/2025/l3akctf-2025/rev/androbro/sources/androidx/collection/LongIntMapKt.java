package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\n\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b\u001a6\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b\u001aF\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b\u001aV\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b\u001a\u0006\u0010\u0011\u001a\u00020\u0001\u001a\u0016\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a&\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b\u001a6\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b\u001aF\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b\u001aV\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"EmptyLongIntMap", "Landroidx/collection/MutableLongIntMap;", "emptyLongIntMap", "Landroidx/collection/LongIntMap;", "longIntMapOf", "key1", "", "value1", "", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableLongIntMapOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LongIntMap.kt */
public final class LongIntMapKt {
    private static final MutableLongIntMap EmptyLongIntMap = new MutableLongIntMap(0);

    public static final LongIntMap emptyLongIntMap() {
        return EmptyLongIntMap;
    }

    public static final LongIntMap longIntMapOf() {
        return EmptyLongIntMap;
    }

    public static final LongIntMap longIntMapOf(long key1, int value1) {
        MutableLongIntMap map = new MutableLongIntMap(0, 1, (DefaultConstructorMarker) null);
        map.set(key1, value1);
        return map;
    }

    public static final LongIntMap longIntMapOf(long key1, int value1, long key2, int value2) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, (DefaultConstructorMarker) null);
        MutableLongIntMap map = mutableLongIntMap;
        map.set(key1, value1);
        map.set(key2, value2);
        return mutableLongIntMap;
    }

    public static final LongIntMap longIntMapOf(long key1, int value1, long key2, int value2, long key3, int value3) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, (DefaultConstructorMarker) null);
        MutableLongIntMap map = mutableLongIntMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        return mutableLongIntMap;
    }

    public static final LongIntMap longIntMapOf(long key1, int value1, long key2, int value2, long key3, int value3, long key4, int value4) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, (DefaultConstructorMarker) null);
        MutableLongIntMap map = mutableLongIntMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        map.set(key4, value4);
        return mutableLongIntMap;
    }

    public static final LongIntMap longIntMapOf(long key1, int value1, long key2, int value2, long key3, int value3, long key4, int value4, long key5, int value5) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, (DefaultConstructorMarker) null);
        MutableLongIntMap map = mutableLongIntMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        map.set(key4, value4);
        map.set(key5, value5);
        return mutableLongIntMap;
    }

    public static final MutableLongIntMap mutableLongIntMapOf() {
        return new MutableLongIntMap(0, 1, (DefaultConstructorMarker) null);
    }

    public static final MutableLongIntMap mutableLongIntMapOf(long key1, int value1) {
        MutableLongIntMap map = new MutableLongIntMap(0, 1, (DefaultConstructorMarker) null);
        map.set(key1, value1);
        return map;
    }

    public static final MutableLongIntMap mutableLongIntMapOf(long key1, int value1, long key2, int value2) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, (DefaultConstructorMarker) null);
        MutableLongIntMap map = mutableLongIntMap;
        map.set(key1, value1);
        map.set(key2, value2);
        return mutableLongIntMap;
    }

    public static final MutableLongIntMap mutableLongIntMapOf(long key1, int value1, long key2, int value2, long key3, int value3) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, (DefaultConstructorMarker) null);
        MutableLongIntMap map = mutableLongIntMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        return mutableLongIntMap;
    }

    public static final MutableLongIntMap mutableLongIntMapOf(long key1, int value1, long key2, int value2, long key3, int value3, long key4, int value4) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, (DefaultConstructorMarker) null);
        MutableLongIntMap map = mutableLongIntMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        map.set(key4, value4);
        return mutableLongIntMap;
    }

    public static final MutableLongIntMap mutableLongIntMapOf(long key1, int value1, long key2, int value2, long key3, int value3, long key4, int value4, long key5, int value5) {
        MutableLongIntMap mutableLongIntMap = new MutableLongIntMap(0, 1, (DefaultConstructorMarker) null);
        MutableLongIntMap map = mutableLongIntMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        map.set(key4, value4);
        map.set(key5, value5);
        return mutableLongIntMap;
    }
}
