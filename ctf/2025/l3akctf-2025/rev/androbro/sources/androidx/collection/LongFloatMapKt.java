package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0007\n\u0002\b\n\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b\u001a6\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b\u001aF\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b\u001aV\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b\u001a\u0006\u0010\u0011\u001a\u00020\u0001\u001a\u0016\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a&\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b\u001a6\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b\u001aF\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b\u001aV\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"EmptyLongFloatMap", "Landroidx/collection/MutableLongFloatMap;", "emptyLongFloatMap", "Landroidx/collection/LongFloatMap;", "longFloatMapOf", "key1", "", "value1", "", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableLongFloatMapOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LongFloatMap.kt */
public final class LongFloatMapKt {
    private static final MutableLongFloatMap EmptyLongFloatMap = new MutableLongFloatMap(0);

    public static final LongFloatMap emptyLongFloatMap() {
        return EmptyLongFloatMap;
    }

    public static final LongFloatMap longFloatMapOf() {
        return EmptyLongFloatMap;
    }

    public static final LongFloatMap longFloatMapOf(long key1, float value1) {
        MutableLongFloatMap map = new MutableLongFloatMap(0, 1, (DefaultConstructorMarker) null);
        map.set(key1, value1);
        return map;
    }

    public static final LongFloatMap longFloatMapOf(long key1, float value1, long key2, float value2) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, (DefaultConstructorMarker) null);
        MutableLongFloatMap map = mutableLongFloatMap;
        map.set(key1, value1);
        map.set(key2, value2);
        return mutableLongFloatMap;
    }

    public static final LongFloatMap longFloatMapOf(long key1, float value1, long key2, float value2, long key3, float value3) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, (DefaultConstructorMarker) null);
        MutableLongFloatMap map = mutableLongFloatMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        return mutableLongFloatMap;
    }

    public static final LongFloatMap longFloatMapOf(long key1, float value1, long key2, float value2, long key3, float value3, long key4, float value4) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, (DefaultConstructorMarker) null);
        MutableLongFloatMap map = mutableLongFloatMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        map.set(key4, value4);
        return mutableLongFloatMap;
    }

    public static final LongFloatMap longFloatMapOf(long key1, float value1, long key2, float value2, long key3, float value3, long key4, float value4, long key5, float value5) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, (DefaultConstructorMarker) null);
        MutableLongFloatMap map = mutableLongFloatMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        map.set(key4, value4);
        map.set(key5, value5);
        return mutableLongFloatMap;
    }

    public static final MutableLongFloatMap mutableLongFloatMapOf() {
        return new MutableLongFloatMap(0, 1, (DefaultConstructorMarker) null);
    }

    public static final MutableLongFloatMap mutableLongFloatMapOf(long key1, float value1) {
        MutableLongFloatMap map = new MutableLongFloatMap(0, 1, (DefaultConstructorMarker) null);
        map.set(key1, value1);
        return map;
    }

    public static final MutableLongFloatMap mutableLongFloatMapOf(long key1, float value1, long key2, float value2) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, (DefaultConstructorMarker) null);
        MutableLongFloatMap map = mutableLongFloatMap;
        map.set(key1, value1);
        map.set(key2, value2);
        return mutableLongFloatMap;
    }

    public static final MutableLongFloatMap mutableLongFloatMapOf(long key1, float value1, long key2, float value2, long key3, float value3) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, (DefaultConstructorMarker) null);
        MutableLongFloatMap map = mutableLongFloatMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        return mutableLongFloatMap;
    }

    public static final MutableLongFloatMap mutableLongFloatMapOf(long key1, float value1, long key2, float value2, long key3, float value3, long key4, float value4) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, (DefaultConstructorMarker) null);
        MutableLongFloatMap map = mutableLongFloatMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        map.set(key4, value4);
        return mutableLongFloatMap;
    }

    public static final MutableLongFloatMap mutableLongFloatMapOf(long key1, float value1, long key2, float value2, long key3, float value3, long key4, float value4, long key5, float value5) {
        MutableLongFloatMap mutableLongFloatMap = new MutableLongFloatMap(0, 1, (DefaultConstructorMarker) null);
        MutableLongFloatMap map = mutableLongFloatMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        map.set(key4, value4);
        map.set(key5, value5);
        return mutableLongFloatMap;
    }
}
