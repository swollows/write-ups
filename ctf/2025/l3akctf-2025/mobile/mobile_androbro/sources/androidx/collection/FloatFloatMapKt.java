package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u000b\u001a\u0006\u0010\u0002\u001a\u00020\u0003\u001a\u0006\u0010\u0004\u001a\u00020\u0003\u001a\u0016\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u001a&\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006\u001a6\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006\u001aF\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006\u001aV\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006\u001a\u0006\u0010\u0010\u001a\u00020\u0001\u001a\u0016\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006\u001a&\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u0006\u001a6\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u0006\u001aF\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006\u001aV\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0006\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, d2 = {"EmptyFloatFloatMap", "Landroidx/collection/MutableFloatFloatMap;", "emptyFloatFloatMap", "Landroidx/collection/FloatFloatMap;", "floatFloatMapOf", "key1", "", "value1", "key2", "value2", "key3", "value3", "key4", "value4", "key5", "value5", "mutableFloatFloatMapOf", "collection"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: FloatFloatMap.kt */
public final class FloatFloatMapKt {
    private static final MutableFloatFloatMap EmptyFloatFloatMap = new MutableFloatFloatMap(0);

    public static final FloatFloatMap emptyFloatFloatMap() {
        return EmptyFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf() {
        return EmptyFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf(float key1, float value1) {
        MutableFloatFloatMap map = new MutableFloatFloatMap(0, 1, (DefaultConstructorMarker) null);
        map.set(key1, value1);
        return map;
    }

    public static final FloatFloatMap floatFloatMapOf(float key1, float value1, float key2, float value2) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, (DefaultConstructorMarker) null);
        MutableFloatFloatMap map = mutableFloatFloatMap;
        map.set(key1, value1);
        map.set(key2, value2);
        return mutableFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf(float key1, float value1, float key2, float value2, float key3, float value3) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, (DefaultConstructorMarker) null);
        MutableFloatFloatMap map = mutableFloatFloatMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        return mutableFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf(float key1, float value1, float key2, float value2, float key3, float value3, float key4, float value4) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, (DefaultConstructorMarker) null);
        MutableFloatFloatMap map = mutableFloatFloatMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        map.set(key4, value4);
        return mutableFloatFloatMap;
    }

    public static final FloatFloatMap floatFloatMapOf(float key1, float value1, float key2, float value2, float key3, float value3, float key4, float value4, float key5, float value5) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, (DefaultConstructorMarker) null);
        MutableFloatFloatMap map = mutableFloatFloatMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        map.set(key4, value4);
        map.set(key5, value5);
        return mutableFloatFloatMap;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf() {
        return new MutableFloatFloatMap(0, 1, (DefaultConstructorMarker) null);
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float key1, float value1) {
        MutableFloatFloatMap map = new MutableFloatFloatMap(0, 1, (DefaultConstructorMarker) null);
        map.set(key1, value1);
        return map;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float key1, float value1, float key2, float value2) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, (DefaultConstructorMarker) null);
        MutableFloatFloatMap map = mutableFloatFloatMap;
        map.set(key1, value1);
        map.set(key2, value2);
        return mutableFloatFloatMap;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float key1, float value1, float key2, float value2, float key3, float value3) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, (DefaultConstructorMarker) null);
        MutableFloatFloatMap map = mutableFloatFloatMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        return mutableFloatFloatMap;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float key1, float value1, float key2, float value2, float key3, float value3, float key4, float value4) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, (DefaultConstructorMarker) null);
        MutableFloatFloatMap map = mutableFloatFloatMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        map.set(key4, value4);
        return mutableFloatFloatMap;
    }

    public static final MutableFloatFloatMap mutableFloatFloatMapOf(float key1, float value1, float key2, float value2, float key3, float value3, float key4, float value4, float key5, float value5) {
        MutableFloatFloatMap mutableFloatFloatMap = new MutableFloatFloatMap(0, 1, (DefaultConstructorMarker) null);
        MutableFloatFloatMap map = mutableFloatFloatMap;
        map.set(key1, value1);
        map.set(key2, value2);
        map.set(key3, value3);
        map.set(key4, value4);
        map.set(key5, value5);
        return mutableFloatFloatMap;
    }
}
