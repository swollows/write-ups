/*
 * Decompiled with CFR 0.153-SNAPSHOT (d6f6758-dirty).
 * 
 * Could not load the following classes:
 *  java.lang.runtime.SwitchBootstraps
 */
package me.bechberger.ebpf.type;

import java.lang.reflect.Array;
import java.lang.runtime.SwitchBootstraps;
import java.util.Arrays;
import java.util.Objects;

public class BoxHelper {
    public static <T> T[] box(T[] array) {
        return array;
    }

    public static <T> T[] unbox(T[] array) {
        return array;
    }

    public static <T> T box(T value) {
        if (value == null) {
            return null;
        }
        if (!value.getClass().isArray()) {
            return value;
        }
        T t = value;
        Objects.requireNonNull(t);
        T t2 = t;
        int n = 0;
        return (T)(switch (SwitchBootstraps.typeSwitch("typeSwitch", new Object[]{int[].class, long[].class, double[].class, float[].class, short[].class, byte[].class, char[].class, boolean[].class}, t2, (int)n)) {
            case 0 -> {
                int[] ints = (int[])t2;
                yield BoxHelper.box(ints);
            }
            case 1 -> {
                long[] longs = (long[])t2;
                yield BoxHelper.box(longs);
            }
            case 2 -> {
                double[] doubles = (double[])t2;
                yield BoxHelper.box(doubles);
            }
            case 3 -> {
                float[] floats = (float[])t2;
                yield BoxHelper.box(floats);
            }
            case 4 -> {
                short[] shorts = (short[])t2;
                yield BoxHelper.box(shorts);
            }
            case 5 -> {
                byte[] bytes = (byte[])t2;
                yield BoxHelper.box(bytes);
            }
            case 6 -> {
                char[] chars = (char[])t2;
                yield BoxHelper.box(chars);
            }
            case 7 -> {
                boolean[] booleans = (boolean[])t2;
                yield BoxHelper.box(booleans);
            }
            default -> {
                Object[] array = new Object[Array.getLength(value)];
                for (int i = 0; i < Array.getLength(value); ++i) {
                    array[i] = BoxHelper.box(Array.get(value, i));
                }
                yield array;
            }
        });
    }

    public static <T, S> T unbox(S value, Class<?> clazz) {
        if (!value.getClass().isArray()) {
            return (T)value;
        }
        if (!clazz.isArray()) {
            return (T)value;
        }
        Class<?> subComp = value.getClass().getComponentType();
        while (subComp.isArray()) {
            subComp = subComp.getComponentType();
        }
        if (subComp.isPrimitive()) {
            return (T)value;
        }
        if (clazz == int[].class) {
            return (T)BoxHelper.unboxIntArray((Object[])value);
        }
        if (clazz == long[].class) {
            return (T)BoxHelper.unboxLongArray((Object[])value);
        }
        if (clazz == double[].class) {
            return (T)BoxHelper.unboxDoubleArray((Object[])value);
        }
        if (clazz == float[].class) {
            return (T)BoxHelper.unboxFloatArray((Object[])value);
        }
        if (clazz == short[].class) {
            return (T)BoxHelper.unboxShortArray((Object[])value);
        }
        if (clazz == byte[].class) {
            return (T)BoxHelper.unboxByteArray((Object[])value);
        }
        if (clazz == char[].class) {
            return (T)BoxHelper.unboxCharArray((Object[])value);
        }
        if (clazz == boolean[].class) {
            return (T)BoxHelper.unboxBooleanArray((Object[])value);
        }
        Object array = Array.newInstance(clazz.getComponentType(), Array.getLength(value));
        for (int i = 0; i < Array.getLength(value); ++i) {
            Array.set(array, i, BoxHelper.unbox(Array.get(value, i), clazz.getComponentType()));
        }
        return (T)array;
    }

    public static Integer[] box(int[] array) {
        return (Integer[])Arrays.stream(array).boxed().toArray(Integer[]::new);
    }

    public static int[] unbox(Integer[] array) {
        return Arrays.stream(array).mapToInt(Integer::intValue).toArray();
    }

    public static int[] unboxIntArray(Object[] array) {
        return Arrays.stream(array).mapToInt(o -> (Integer)o).toArray();
    }

    public static Long[] box(long[] array) {
        return (Long[])Arrays.stream(array).boxed().toArray(Long[]::new);
    }

    public static long[] unbox(Long[] array) {
        return Arrays.stream(array).mapToLong(Long::longValue).toArray();
    }

    public static long[] unboxLongArray(Object[] array) {
        return Arrays.stream(array).mapToLong(o -> (Long)o).toArray();
    }

    public static Double[] box(double[] array) {
        return (Double[])Arrays.stream(array).boxed().toArray(Double[]::new);
    }

    public static double[] unbox(Double[] array) {
        return Arrays.stream(array).mapToDouble(Double::doubleValue).toArray();
    }

    public static double[] unboxDoubleArray(Object[] array) {
        return Arrays.stream(array).mapToDouble(o -> (Double)o).toArray();
    }

    public static Float[] box(float[] array) {
        Float[] boxed = new Float[array.length];
        for (int i = 0; i < array.length; ++i) {
            boxed[i] = Float.valueOf(array[i]);
        }
        return boxed;
    }

    public static float[] unbox(Float[] array) {
        float[] unboxed = new float[array.length];
        for (int i = 0; i < array.length; ++i) {
            unboxed[i] = array[i].floatValue();
        }
        return unboxed;
    }

    public static float[] unboxFloatArray(Object[] array) {
        float[] unboxed = new float[array.length];
        for (int i = 0; i < array.length; ++i) {
            unboxed[i] = ((Float)array[i]).floatValue();
        }
        return unboxed;
    }

    public static Short[] box(short[] array) {
        Short[] boxed = new Short[array.length];
        for (int i = 0; i < array.length; ++i) {
            boxed[i] = array[i];
        }
        return boxed;
    }

    public static short[] unbox(Short[] array) {
        short[] unboxed = new short[array.length];
        for (int i = 0; i < array.length; ++i) {
            unboxed[i] = array[i];
        }
        return unboxed;
    }

    public static short[] unboxShortArray(Object[] array) {
        short[] unboxed = new short[array.length];
        for (int i = 0; i < array.length; ++i) {
            unboxed[i] = (Short)array[i];
        }
        return unboxed;
    }

    public static Byte[] box(byte[] array) {
        Byte[] boxed = new Byte[array.length];
        for (int i = 0; i < array.length; ++i) {
            boxed[i] = array[i];
        }
        return boxed;
    }

    public static byte[] unbox(Byte[] array) {
        byte[] unboxed = new byte[array.length];
        for (int i = 0; i < array.length; ++i) {
            unboxed[i] = array[i];
        }
        return unboxed;
    }

    public static byte[] unboxByteArray(Object[] array) {
        byte[] unboxed = new byte[array.length];
        for (int i = 0; i < array.length; ++i) {
            unboxed[i] = (Byte)array[i];
        }
        return unboxed;
    }

    public static Character[] box(char[] array) {
        Character[] boxed = new Character[array.length];
        for (int i = 0; i < array.length; ++i) {
            boxed[i] = Character.valueOf(array[i]);
        }
        return boxed;
    }

    public static char[] unbox(Character[] array) {
        char[] unboxed = new char[array.length];
        for (int i = 0; i < array.length; ++i) {
            unboxed[i] = array[i].charValue();
        }
        return unboxed;
    }

    public static char[] unboxCharArray(Object[] array) {
        char[] unboxed = new char[array.length];
        for (int i = 0; i < array.length; ++i) {
            unboxed[i] = ((Character)array[i]).charValue();
        }
        return unboxed;
    }

    public static Boolean[] box(boolean[] array) {
        Boolean[] boxed = new Boolean[array.length];
        for (int i = 0; i < array.length; ++i) {
            boxed[i] = array[i];
        }
        return boxed;
    }

    public static boolean[] unbox(Boolean[] array) {
        boolean[] unboxed = new boolean[array.length];
        for (int i = 0; i < array.length; ++i) {
            unboxed[i] = array[i];
        }
        return unboxed;
    }

    public static boolean[] unboxBooleanArray(Object[] array) {
        boolean[] unboxed = new boolean[array.length];
        for (int i = 0; i < array.length; ++i) {
            unboxed[i] = (Boolean)array[i];
        }
        return unboxed;
    }
}

