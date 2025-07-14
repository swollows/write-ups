package androidx.collection;

import java.lang.reflect.Array;

class ArraySetJvmUtil {
    private ArraySetJvmUtil() {
    }

    static <T> T[] resizeForToArray(T[] destination, int size) {
        if (destination.length < size) {
            return (Object[]) Array.newInstance(destination.getClass().getComponentType(), size);
        }
        if (destination.length > size) {
            destination[size] = null;
        }
        return destination;
    }
}
