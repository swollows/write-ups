package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\n\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b\u001a6\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b\u001aF\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b\u001aV\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b\u001a\u0006\u0010\u0011\u001a\u00020\u0001\u001a\u0016\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b\u001a&\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b\u001a6\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b\u001aF\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b\u001aV\u0010\u0011\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\b2\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"EmptyFloatLongMap", "Landroidx/collection/MutableFloatLongMap;", "emptyFloatLongMap", "Landroidx/collection/FloatLongMap;", "floatLongMapOf", "key1", "", "value1", "", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableFloatLongMapOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: FloatLongMap.kt */
public final class FloatLongMapKt {
    private static final MutableFloatLongMap EmptyFloatLongMap = new MutableFloatLongMap(0);

    public static final FloatLongMap emptyFloatLongMap() {
        return EmptyFloatLongMap;
    }

    public static final FloatLongMap floatLongMapOf() {
        return EmptyFloatLongMap;
    }

    public static final FloatLongMap floatLongMapOf(float key1, long value1) {
        MutableFloatLongMap map = new MutableFloatLongMap(0, 1, (DefaultConstructorMarker) null);
        map.set(key1, value1);
        return map;
    }

    public static final FloatLongMap floatLongMapOf(float key1, long value1, float key2, long value2) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, (DefaultConstructorMarker) null);
        MutableFloatLongMap map = mutableFloatLongMap;
        map.set(key1, value1);
        map.set(key2, value2);
        return mutableFloatLongMap;
    }

    public static final FloatLongMap floatLongMapOf(float key1, long value1, float key2, long value2, float key3, long value3) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, (DefaultConstructorMarker) null);
        MutableFloatLongMap map = mutableFloatLongMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        return mutableFloatLongMap;
    }

    public static final FloatLongMap floatLongMapOf(float key1, long value1, float key2, long value2, float key3, long value3, float key4, long value4) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, (DefaultConstructorMarker) null);
        MutableFloatLongMap map = mutableFloatLongMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        map.set(key4, value4);
        return mutableFloatLongMap;
    }

    public static final FloatLongMap floatLongMapOf(float key1, long value1, float key2, long value2, float key3, long value3, float key4, long value4, float key5, long value5) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, (DefaultConstructorMarker) null);
        MutableFloatLongMap map = mutableFloatLongMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        map.set(key4, value4);
        map.set(key5, value5);
        return mutableFloatLongMap;
    }

    public static final MutableFloatLongMap mutableFloatLongMapOf() {
        return new MutableFloatLongMap(0, 1, (DefaultConstructorMarker) null);
    }

    public static final MutableFloatLongMap mutableFloatLongMapOf(float key1, long value1) {
        MutableFloatLongMap map = new MutableFloatLongMap(0, 1, (DefaultConstructorMarker) null);
        map.set(key1, value1);
        return map;
    }

    public static final MutableFloatLongMap mutableFloatLongMapOf(float key1, long value1, float key2, long value2) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, (DefaultConstructorMarker) null);
        MutableFloatLongMap map = mutableFloatLongMap;
        map.set(key1, value1);
        map.set(key2, value2);
        return mutableFloatLongMap;
    }

    public static final MutableFloatLongMap mutableFloatLongMapOf(float key1, long value1, float key2, long value2, float key3, long value3) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, (DefaultConstructorMarker) null);
        MutableFloatLongMap map = mutableFloatLongMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        return mutableFloatLongMap;
    }

    public static final MutableFloatLongMap mutableFloatLongMapOf(float key1, long value1, float key2, long value2, float key3, long value3, float key4, long value4) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, (DefaultConstructorMarker) null);
        MutableFloatLongMap map = mutableFloatLongMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        map.set(key4, value4);
        return mutableFloatLongMap;
    }

    public static final MutableFloatLongMap mutableFloatLongMapOf(float key1, long value1, float key2, long value2, float key3, long value3, float key4, long value4, float key5, long value5) {
        MutableFloatLongMap mutableFloatLongMap = new MutableFloatLongMap(0, 1, (DefaultConstructorMarker) null);
        MutableFloatLongMap map = mutableFloatLongMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        map.set(key4, value4);
        map.set(key5, value5);
        return mutableFloatLongMap;
    }
}
