package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u000b\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u001a&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006\u001a6\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006\u001aF\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006\u001aV\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006\u001a\u0006\u0010\u0010\u001a\u00020\u0001\u001a\u0016\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u001a&\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006\u001a6\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006\u001aF\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006\u001aV\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"EmptyLongLongMap", "Landroidx/collection/MutableLongLongMap;", "emptyLongLongMap", "Landroidx/collection/LongLongMap;", "longLongMapOf", "key1", "", "value1", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableLongLongMapOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: LongLongMap.kt */
public final class LongLongMapKt {
    private static final MutableLongLongMap EmptyLongLongMap = new MutableLongLongMap(0);

    public static final LongLongMap emptyLongLongMap() {
        return EmptyLongLongMap;
    }

    public static final LongLongMap longLongMapOf() {
        return EmptyLongLongMap;
    }

    public static final LongLongMap longLongMapOf(long key1, long value1) {
        MutableLongLongMap map = new MutableLongLongMap(0, 1, (DefaultConstructorMarker) null);
        map.set(key1, value1);
        return map;
    }

    public static final LongLongMap longLongMapOf(long key1, long value1, long key2, long value2) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, (DefaultConstructorMarker) null);
        MutableLongLongMap map = mutableLongLongMap;
        map.set(key1, value1);
        map.set(key2, value2);
        return mutableLongLongMap;
    }

    public static final LongLongMap longLongMapOf(long key1, long value1, long key2, long value2, long key3, long value3) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, (DefaultConstructorMarker) null);
        MutableLongLongMap map = mutableLongLongMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        return mutableLongLongMap;
    }

    public static final LongLongMap longLongMapOf(long key1, long value1, long key2, long value2, long key3, long value3, long key4, long value4) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, (DefaultConstructorMarker) null);
        MutableLongLongMap map = mutableLongLongMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        map.set(key4, value4);
        return mutableLongLongMap;
    }

    public static final LongLongMap longLongMapOf(long key1, long value1, long key2, long value2, long key3, long value3, long key4, long value4, long key5, long value5) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, (DefaultConstructorMarker) null);
        MutableLongLongMap map = mutableLongLongMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        map.set(key4, value4);
        map.set(key5, value5);
        return mutableLongLongMap;
    }

    public static final MutableLongLongMap mutableLongLongMapOf() {
        return new MutableLongLongMap(0, 1, (DefaultConstructorMarker) null);
    }

    public static final MutableLongLongMap mutableLongLongMapOf(long key1, long value1) {
        MutableLongLongMap map = new MutableLongLongMap(0, 1, (DefaultConstructorMarker) null);
        map.set(key1, value1);
        return map;
    }

    public static final MutableLongLongMap mutableLongLongMapOf(long key1, long value1, long key2, long value2) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, (DefaultConstructorMarker) null);
        MutableLongLongMap map = mutableLongLongMap;
        map.set(key1, value1);
        map.set(key2, value2);
        return mutableLongLongMap;
    }

    public static final MutableLongLongMap mutableLongLongMapOf(long key1, long value1, long key2, long value2, long key3, long value3) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, (DefaultConstructorMarker) null);
        MutableLongLongMap map = mutableLongLongMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        return mutableLongLongMap;
    }

    public static final MutableLongLongMap mutableLongLongMapOf(long key1, long value1, long key2, long value2, long key3, long value3, long key4, long value4) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, (DefaultConstructorMarker) null);
        MutableLongLongMap map = mutableLongLongMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        map.set(key4, value4);
        return mutableLongLongMap;
    }

    public static final MutableLongLongMap mutableLongLongMapOf(long key1, long value1, long key2, long value2, long key3, long value3, long key4, long value4, long key5, long value5) {
        MutableLongLongMap mutableLongLongMap = new MutableLongLongMap(0, 1, (DefaultConstructorMarker) null);
        MutableLongLongMap map = mutableLongLongMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        map.set(key4, value4);
        map.set(key5, value5);
        return mutableLongLongMap;
    }
}
