package androidx.navigation;

import android.os.Bundle;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0002\b\u000e\b&\u0018\u0000 !*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0006!\"#$%&B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J \u0010\u000b\u001a\u0004\u0018\u00018\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\bH¦\u0002¢\u0006\u0002\u0010\u000fJ%\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0012J/\u0010\u0010\u001a\u00028\u00002\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\b\u0010\u0011\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0013\u001a\u00028\u0000H\u0007¢\u0006\u0002\u0010\u0014J\u0015\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\bH&¢\u0006\u0002\u0010\u0016J\u001d\u0010\u0015\u001a\u00028\u00002\u0006\u0010\u0011\u001a\u00020\b2\u0006\u0010\u0013\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0017J%\u0010\u0018\u001a\u00020\u00192\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u001aJ\u0015\u0010\u001b\u001a\u00020\b2\u0006\u0010\u0011\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\bH\u0016J\u001d\u0010\u001e\u001a\u00020\u00042\u0006\u0010\u0011\u001a\u00028\u00002\u0006\u0010\u001f\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010 R\u0014\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0003\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006'"}, d2 = {"Landroidx/navigation/NavType;", "T", "", "isNullableAllowed", "", "(Z)V", "()Z", "name", "", "getName", "()Ljava/lang/String;", "get", "bundle", "Landroid/os/Bundle;", "key", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "parseAndPut", "value", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;", "previousValue", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "parseValue", "(Ljava/lang/String;)Ljava/lang/Object;", "(Ljava/lang/String;Ljava/lang/Object;)Ljava/lang/Object;", "put", "", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "serializeAsValue", "(Ljava/lang/Object;)Ljava/lang/String;", "toString", "valueEquals", "other", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Companion", "EnumType", "ParcelableArrayType", "ParcelableType", "SerializableArrayType", "SerializableType", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavType.kt */
public abstract class NavType<T> {
    public static final NavType<boolean[]> BoolArrayType = new NavType$Companion$BoolArrayType$1();
    public static final NavType<List<Boolean>> BoolListType = new NavType$Companion$BoolListType$1();
    public static final NavType<Boolean> BoolType = new NavType$Companion$BoolType$1();
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    public static final NavType<float[]> FloatArrayType = new NavType$Companion$FloatArrayType$1();
    public static final NavType<List<Float>> FloatListType = new NavType$Companion$FloatListType$1();
    public static final NavType<Float> FloatType = new NavType$Companion$FloatType$1();
    public static final NavType<int[]> IntArrayType = new NavType$Companion$IntArrayType$1();
    public static final NavType<List<Integer>> IntListType = new NavType$Companion$IntListType$1();
    public static final NavType<Integer> IntType = new NavType$Companion$IntType$1();
    public static final NavType<long[]> LongArrayType = new NavType$Companion$LongArrayType$1();
    public static final NavType<List<Long>> LongListType = new NavType$Companion$LongListType$1();
    public static final NavType<Long> LongType = new NavType$Companion$LongType$1();
    public static final NavType<Integer> ReferenceType = new NavType$Companion$ReferenceType$1();
    public static final NavType<String[]> StringArrayType = new NavType$Companion$StringArrayType$1();
    public static final NavType<List<String>> StringListType = new NavType$Companion$StringListType$1();
    public static final NavType<String> StringType = new NavType$Companion$StringType$1();
    private final boolean isNullableAllowed;
    private final String name = "nav_type";

    public abstract T get(Bundle bundle, String str);

    public abstract T parseValue(String str);

    public abstract void put(Bundle bundle, String str, T t);

    public NavType(boolean isNullableAllowed2) {
        this.isNullableAllowed = isNullableAllowed2;
    }

    public boolean isNullableAllowed() {
        return this.isNullableAllowed;
    }

    public T parseValue(String value, T previousValue) {
        Intrinsics.checkNotNullParameter(value, "value");
        return parseValue(value);
    }

    public final T parseAndPut(Bundle bundle, String key, String value) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(value, "value");
        Object parsedValue = parseValue(value);
        put(bundle, key, parsedValue);
        return parsedValue;
    }

    public final T parseAndPut(Bundle bundle, String key, String value, T previousValue) {
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(key, "key");
        if (!bundle.containsKey(key)) {
            throw new IllegalArgumentException("There is no previous value in this bundle.");
        } else if (value == null) {
            return previousValue;
        } else {
            Object parsedCombinedValue = parseValue(value, previousValue);
            put(bundle, key, parsedCombinedValue);
            return parsedCombinedValue;
        }
    }

    public String serializeAsValue(T value) {
        return String.valueOf(value);
    }

    public String getName() {
        return this.name;
    }

    public boolean valueEquals(T value, T other) {
        return Intrinsics.areEqual((Object) value, (Object) other);
    }

    public String toString() {
        return getName();
    }

    @Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0014\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u001f\u001a\u0006\u0012\u0002\b\u00030\u00042\b\u0010 \u001a\u0004\u0018\u00010\u001c2\b\u0010!\u001a\u0004\u0018\u00010\u001cH\u0017J\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\u0006\u0010#\u001a\u00020\u001cH\u0007J\u0018\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\u00042\b\u0010#\u001a\u0004\u0018\u00010\u0001H\u0007J'\u0010%\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00042\n\u0010&\u001a\u0006\u0012\u0002\b\u00030'2\u0006\u0010(\u001a\u00020\bH\u0000¢\u0006\u0002\b)R\u0018\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0006\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00070\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\n\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\f\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00070\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0011\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00070\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0014\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00150\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00070\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00120\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001a\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u001b0\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u001d\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u00070\u00048\u0006X\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00048\u0006X\u0004¢\u0006\u0002\n\u0000¨\u0006*"}, d2 = {"Landroidx/navigation/NavType$Companion;", "", "()V", "BoolArrayType", "Landroidx/navigation/NavType;", "", "BoolListType", "", "", "BoolType", "FloatArrayType", "", "FloatListType", "", "FloatType", "IntArrayType", "", "IntListType", "", "IntType", "LongArrayType", "", "LongListType", "", "LongType", "ReferenceType", "StringArrayType", "", "", "StringListType", "StringType", "fromArgType", "type", "packageName", "inferFromValue", "value", "inferFromValueType", "parseSerializableOrParcelableType", "clazz", "Ljava/lang/Class;", "isArray", "parseSerializableOrParcelableType$navigation_common_release", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: NavType.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public NavType<?> fromArgType(String type, String packageName) {
            String str;
            if (Intrinsics.areEqual((Object) NavType.IntType.getName(), (Object) type)) {
                return NavType.IntType;
            }
            if (Intrinsics.areEqual((Object) NavType.IntArrayType.getName(), (Object) type)) {
                return NavType.IntArrayType;
            }
            if (Intrinsics.areEqual((Object) NavType.IntListType.getName(), (Object) type)) {
                return NavType.IntListType;
            }
            if (Intrinsics.areEqual((Object) NavType.LongType.getName(), (Object) type)) {
                return NavType.LongType;
            }
            if (Intrinsics.areEqual((Object) NavType.LongArrayType.getName(), (Object) type)) {
                return NavType.LongArrayType;
            }
            if (Intrinsics.areEqual((Object) NavType.LongListType.getName(), (Object) type)) {
                return NavType.LongListType;
            }
            if (Intrinsics.areEqual((Object) NavType.BoolType.getName(), (Object) type)) {
                return NavType.BoolType;
            }
            if (Intrinsics.areEqual((Object) NavType.BoolArrayType.getName(), (Object) type)) {
                return NavType.BoolArrayType;
            }
            if (Intrinsics.areEqual((Object) NavType.BoolListType.getName(), (Object) type)) {
                return NavType.BoolListType;
            }
            if (Intrinsics.areEqual((Object) NavType.StringType.getName(), (Object) type)) {
                return NavType.StringType;
            }
            if (Intrinsics.areEqual((Object) NavType.StringArrayType.getName(), (Object) type)) {
                return NavType.StringArrayType;
            }
            if (Intrinsics.areEqual((Object) NavType.StringListType.getName(), (Object) type)) {
                return NavType.StringListType;
            }
            if (Intrinsics.areEqual((Object) NavType.FloatType.getName(), (Object) type)) {
                return NavType.FloatType;
            }
            if (Intrinsics.areEqual((Object) NavType.FloatArrayType.getName(), (Object) type)) {
                return NavType.FloatArrayType;
            }
            if (Intrinsics.areEqual((Object) NavType.FloatListType.getName(), (Object) type)) {
                return NavType.FloatListType;
            }
            if (Intrinsics.areEqual((Object) NavType.ReferenceType.getName(), (Object) type)) {
                return NavType.ReferenceType;
            }
            CharSequence charSequence = type;
            if (charSequence == null || charSequence.length() == 0) {
                return NavType.StringType;
            }
            try {
                if (!StringsKt.startsWith$default(type, ".", false, 2, (Object) null) || packageName == null) {
                    str = type;
                } else {
                    str = packageName + type;
                }
                String str2 = str;
                boolean isArray = StringsKt.endsWith$default(type, "[]", false, 2, (Object) null);
                if (isArray) {
                    String substring = str2.substring(0, str2.length() - 2);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    str2 = substring;
                }
                Class clazz = Class.forName(str2);
                Intrinsics.checkNotNullExpressionValue(clazz, "clazz");
                NavType<?> parseSerializableOrParcelableType$navigation_common_release = parseSerializableOrParcelableType$navigation_common_release(clazz, isArray);
                if (parseSerializableOrParcelableType$navigation_common_release != null) {
                    return parseSerializableOrParcelableType$navigation_common_release;
                }
                throw new IllegalArgumentException((str2 + " is not Serializable or Parcelable.").toString());
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }

        public final NavType<?> parseSerializableOrParcelableType$navigation_common_release(Class<?> clazz, boolean isArray) {
            Intrinsics.checkNotNullParameter(clazz, "clazz");
            if (Parcelable.class.isAssignableFrom(clazz)) {
                if (isArray) {
                    return new ParcelableArrayType<>(clazz);
                }
                return new ParcelableType<>(clazz);
            } else if (Enum.class.isAssignableFrom(clazz) && !isArray) {
                return new EnumType<>(clazz);
            } else {
                if (!Serializable.class.isAssignableFrom(clazz)) {
                    return null;
                }
                if (isArray) {
                    return new SerializableArrayType<>(clazz);
                }
                return new SerializableType<>(clazz);
            }
        }

        @JvmStatic
        public final NavType<Object> inferFromValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            try {
                NavType.IntType.parseValue(value);
                NavType<Integer> navType = NavType.IntType;
                Intrinsics.checkNotNull(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType;
            } catch (IllegalArgumentException e) {
                try {
                    NavType.LongType.parseValue(value);
                    NavType<Long> navType2 = NavType.LongType;
                    Intrinsics.checkNotNull(navType2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                    return navType2;
                } catch (IllegalArgumentException e2) {
                    try {
                        NavType.FloatType.parseValue(value);
                        NavType<Float> navType3 = NavType.FloatType;
                        Intrinsics.checkNotNull(navType3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                        return navType3;
                    } catch (IllegalArgumentException e3) {
                        try {
                            NavType.BoolType.parseValue(value);
                            NavType<Boolean> navType4 = NavType.BoolType;
                            Intrinsics.checkNotNull(navType4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return navType4;
                        } catch (IllegalArgumentException e4) {
                            NavType<String> navType5 = NavType.StringType;
                            Intrinsics.checkNotNull(navType5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                            return navType5;
                        }
                    }
                }
            }
        }

        @JvmStatic
        public final NavType<Object> inferFromValueType(Object value) {
            if (value instanceof Integer) {
                NavType<Integer> navType = NavType.IntType;
                Intrinsics.checkNotNull(navType, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType;
            } else if (value instanceof int[]) {
                NavType<int[]> navType2 = NavType.IntArrayType;
                Intrinsics.checkNotNull(navType2, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType2;
            } else if (value instanceof Long) {
                NavType<Long> navType3 = NavType.LongType;
                Intrinsics.checkNotNull(navType3, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType3;
            } else if (value instanceof long[]) {
                NavType<long[]> navType4 = NavType.LongArrayType;
                Intrinsics.checkNotNull(navType4, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType4;
            } else if (value instanceof Float) {
                NavType<Float> navType5 = NavType.FloatType;
                Intrinsics.checkNotNull(navType5, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType5;
            } else if (value instanceof float[]) {
                NavType<float[]> navType6 = NavType.FloatArrayType;
                Intrinsics.checkNotNull(navType6, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType6;
            } else if (value instanceof Boolean) {
                NavType<Boolean> navType7 = NavType.BoolType;
                Intrinsics.checkNotNull(navType7, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType7;
            } else if (value instanceof boolean[]) {
                NavType<boolean[]> navType8 = NavType.BoolArrayType;
                Intrinsics.checkNotNull(navType8, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType8;
            } else if ((value instanceof String) || value == null) {
                NavType<String> navType9 = NavType.StringType;
                Intrinsics.checkNotNull(navType9, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType9;
            } else if (!(value instanceof Object[]) || !(((Object[]) value) instanceof String[])) {
                if (value.getClass().isArray()) {
                    Class<?> componentType = value.getClass().getComponentType();
                    Intrinsics.checkNotNull(componentType);
                    if (Parcelable.class.isAssignableFrom(componentType)) {
                        Class<?> componentType2 = value.getClass().getComponentType();
                        Intrinsics.checkNotNull(componentType2, "null cannot be cast to non-null type java.lang.Class<android.os.Parcelable>");
                        return new ParcelableArrayType<>(componentType2);
                    }
                }
                if (value.getClass().isArray()) {
                    Class<?> componentType3 = value.getClass().getComponentType();
                    Intrinsics.checkNotNull(componentType3);
                    if (Serializable.class.isAssignableFrom(componentType3)) {
                        Class<?> componentType4 = value.getClass().getComponentType();
                        Intrinsics.checkNotNull(componentType4, "null cannot be cast to non-null type java.lang.Class<java.io.Serializable>");
                        return new SerializableArrayType<>(componentType4);
                    }
                }
                if (value instanceof Parcelable) {
                    return new ParcelableType<>(value.getClass());
                }
                if (value instanceof Enum) {
                    return new EnumType<>(value.getClass());
                }
                if (value instanceof Serializable) {
                    return new SerializableType<>(value.getClass());
                }
                throw new IllegalArgumentException("Object of type " + value.getClass().getName() + " is not supported for navigation arguments.");
            } else {
                NavType<String[]> navType10 = NavType.StringArrayType;
                Intrinsics.checkNotNull(navType10, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any>");
                return navType10;
            }
        }
    }

    @JvmStatic
    public static NavType<?> fromArgType(String type, String packageName) {
        return Companion.fromArgType(type, packageName);
    }

    @JvmStatic
    public static final NavType<Object> inferFromValue(String value) {
        return Companion.inferFromValue(value);
    }

    @JvmStatic
    public static final NavType<Object> inferFromValueType(Object value) {
        return Companion.inferFromValueType(value);
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0001\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u0013\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004¢\u0006\u0002\u0010\u0005J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rH\u0002J \u0010\u000e\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0007H\u0002¢\u0006\u0002\u0010\u0012J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0015\u0010\u0015\u001a\u00028\u00012\u0006\u0010\u0016\u001a\u00020\u0007H\u0016¢\u0006\u0002\u0010\u0017J%\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00078VX\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00010\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Landroidx/navigation/NavType$ParcelableType;", "D", "Landroidx/navigation/NavType;", "type", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "name", "", "getName", "()Ljava/lang/String;", "equals", "", "other", "", "get", "bundle", "Landroid/os/Bundle;", "key", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/Object;", "hashCode", "", "parseValue", "value", "(Ljava/lang/String;)Ljava/lang/Object;", "put", "", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/lang/Object;)V", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: NavType.kt */
    public static final class ParcelableType<D> extends NavType<D> {
        private final Class<D> type;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ParcelableType(Class<D> type2) {
            super(true);
            Intrinsics.checkNotNullParameter(type2, "type");
            boolean z = true;
            if (!Parcelable.class.isAssignableFrom(type2) && !Serializable.class.isAssignableFrom(type2)) {
                z = false;
            }
            if (z) {
                this.type = type2;
                return;
            }
            throw new IllegalArgumentException((type2 + " does not implement Parcelable or Serializable.").toString());
        }

        public String getName() {
            String name = this.type.getName();
            Intrinsics.checkNotNullExpressionValue(name, "type.name");
            return name;
        }

        public void put(Bundle bundle, String key, D value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            this.type.cast(value);
            if (value == null || (value instanceof Parcelable)) {
                bundle.putParcelable(key, (Parcelable) value);
            } else if (value instanceof Serializable) {
                bundle.putSerializable(key, (Serializable) value);
            }
        }

        public D get(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return bundle.get(key);
        }

        public D parseValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Parcelables don't support default values.");
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !Intrinsics.areEqual((Object) getClass(), (Object) other.getClass())) {
                return false;
            }
            return Intrinsics.areEqual((Object) this.type, (Object) ((ParcelableType) other).type);
        }

        public int hashCode() {
            return this.type.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\u00040\u0003B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J&\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u001aJ-\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\n2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0002\u0010\u001dJ-\u0010\u001e\u001a\u00020\u000e2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0002\u0010\u001fR\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, d2 = {"Landroidx/navigation/NavType$ParcelableArrayType;", "D", "Landroid/os/Parcelable;", "Landroidx/navigation/NavType;", "", "type", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "arrayType", "name", "", "getName", "()Ljava/lang/String;", "equals", "", "other", "", "get", "bundle", "Landroid/os/Bundle;", "key", "(Landroid/os/Bundle;Ljava/lang/String;)[Landroid/os/Parcelable;", "hashCode", "", "parseValue", "value", "(Ljava/lang/String;)[Landroid/os/Parcelable;", "put", "", "(Landroid/os/Bundle;Ljava/lang/String;[Landroid/os/Parcelable;)V", "valueEquals", "([Landroid/os/Parcelable;[Landroid/os/Parcelable;)Z", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: NavType.kt */
    public static final class ParcelableArrayType<D extends Parcelable> extends NavType<D[]> {
        private final Class<D[]> arrayType;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public ParcelableArrayType(Class<D> type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            if (Parcelable.class.isAssignableFrom(type)) {
                try {
                    Class arrayType2 = Class.forName("[L" + type.getName() + ';');
                    Intrinsics.checkNotNull(arrayType2, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.ParcelableArrayType>>");
                    this.arrayType = arrayType2;
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new IllegalArgumentException((type + " does not implement Parcelable.").toString());
            }
        }

        public String getName() {
            String name = this.arrayType.getName();
            Intrinsics.checkNotNullExpressionValue(name, "arrayType.name");
            return name;
        }

        public void put(Bundle bundle, String key, D[] value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            this.arrayType.cast(value);
            bundle.putParcelableArray(key, value);
        }

        public D[] get(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (Parcelable[]) bundle.get(key);
        }

        public D[] parseValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !Intrinsics.areEqual((Object) getClass(), (Object) other.getClass())) {
                return false;
            }
            return Intrinsics.areEqual((Object) this.arrayType, (Object) ((ParcelableArrayType) other).arrayType);
        }

        public int hashCode() {
            return this.arrayType.hashCode();
        }

        public boolean valueEquals(D[] value, D[] other) {
            return ArraysKt.contentDeepEquals(value, other);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0016\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0015\b\u0016\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\u0010\u0006B\u001d\b\u0010\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\u0010\tJ\u0013\u0010\u000e\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J \u0010\u0011\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0015\u0010\u0018\u001a\u00028\u00012\u0006\u0010\u0019\u001a\u00020\u000bH\u0016¢\u0006\u0002\u0010\u001aJ%\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00028\u0001H\u0016¢\u0006\u0002\u0010\u001dR\u0014\u0010\n\u001a\u00020\u000b8VX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Landroidx/navigation/NavType$SerializableType;", "D", "Ljava/io/Serializable;", "Landroidx/navigation/NavType;", "type", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "nullableAllowed", "", "(ZLjava/lang/Class;)V", "name", "", "getName", "()Ljava/lang/String;", "equals", "other", "", "get", "bundle", "Landroid/os/Bundle;", "key", "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/io/Serializable;", "hashCode", "", "parseValue", "value", "(Ljava/lang/String;)Ljava/io/Serializable;", "put", "", "(Landroid/os/Bundle;Ljava/lang/String;Ljava/io/Serializable;)V", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: NavType.kt */
    public static class SerializableType<D extends Serializable> extends NavType<D> {
        private final Class<D> type;

        public String getName() {
            String name = this.type.getName();
            Intrinsics.checkNotNullExpressionValue(name, "type.name");
            return name;
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SerializableType(Class<D> type2) {
            super(true);
            Intrinsics.checkNotNullParameter(type2, "type");
            if (!Serializable.class.isAssignableFrom(type2)) {
                throw new IllegalArgumentException((type2 + " does not implement Serializable.").toString());
            } else if (!type2.isEnum()) {
                this.type = type2;
            } else {
                throw new IllegalArgumentException((type2 + " is an Enum. You should use EnumType instead.").toString());
            }
        }

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SerializableType(boolean nullableAllowed, Class<D> type2) {
            super(nullableAllowed);
            Intrinsics.checkNotNullParameter(type2, "type");
            if (Serializable.class.isAssignableFrom(type2)) {
                this.type = type2;
                return;
            }
            throw new IllegalArgumentException((type2 + " does not implement Serializable.").toString());
        }

        public void put(Bundle bundle, String key, D value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(value, "value");
            this.type.cast(value);
            bundle.putSerializable(key, value);
        }

        public D get(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (Serializable) bundle.get(key);
        }

        public D parseValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Serializables don't support default values.");
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SerializableType)) {
                return false;
            }
            return Intrinsics.areEqual((Object) this.type, (Object) ((SerializableType) other).type);
        }

        public int hashCode() {
            return this.type.hashCode();
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u0018\u0000*\f\b\u0001\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0013\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0015\u0010\u000b\u001a\u00028\u00012\u0006\u0010\f\u001a\u00020\bH\u0016¢\u0006\u0002\u0010\rR\u0014\u0010\u0007\u001a\u00020\b8VX\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/navigation/NavType$EnumType;", "D", "", "Landroidx/navigation/NavType$SerializableType;", "type", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "name", "", "getName", "()Ljava/lang/String;", "parseValue", "value", "(Ljava/lang/String;)Ljava/lang/Enum;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: NavType.kt */
    public static final class EnumType<D extends Enum<?>> extends SerializableType<D> {
        private final Class<D> type;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public EnumType(Class<D> type2) {
            super(false, type2);
            Intrinsics.checkNotNullParameter(type2, "type");
            if (type2.isEnum()) {
                this.type = type2;
                return;
            }
            throw new IllegalArgumentException((type2 + " is not an Enum type.").toString());
        }

        public String getName() {
            String name = this.type.getName();
            Intrinsics.checkNotNullExpressionValue(name, "type.name");
            return name;
        }

        public D parseValue(String value) {
            D d;
            Intrinsics.checkNotNullParameter(value, "value");
            D[] enumConstants = this.type.getEnumConstants();
            Intrinsics.checkNotNullExpressionValue(enumConstants, "type.enumConstants");
            int length = enumConstants.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    d = null;
                    break;
                }
                d = enumConstants[i];
                if (StringsKt.equals(((Enum) d).name(), value, true)) {
                    break;
                }
                i++;
            }
            D d2 = (Enum) d;
            if (d2 != null) {
                return d2;
            }
            throw new IllegalArgumentException("Enum value " + value + " not found for type " + this.type.getName() + '.');
        }
    }

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000*\b\b\u0001\u0010\u0001*\u00020\u00022\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u0002H\u0001\u0018\u00010\u00040\u0003B\u0013\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00010\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J&\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\nH\u0002¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u001b\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00010\u00042\u0006\u0010\u0019\u001a\u00020\nH\u0016¢\u0006\u0002\u0010\u001aJ-\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\n2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0002\u0010\u001dJ-\u0010\u001e\u001a\u00020\u000e2\u000e\u0010\u0019\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u00042\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00028\u0001\u0018\u00010\u0004H\u0016¢\u0006\u0002\u0010\u001fR\u001a\u0010\b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u0006X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\n8VX\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006 "}, d2 = {"Landroidx/navigation/NavType$SerializableArrayType;", "D", "Ljava/io/Serializable;", "Landroidx/navigation/NavType;", "", "type", "Ljava/lang/Class;", "(Ljava/lang/Class;)V", "arrayType", "name", "", "getName", "()Ljava/lang/String;", "equals", "", "other", "", "get", "bundle", "Landroid/os/Bundle;", "key", "(Landroid/os/Bundle;Ljava/lang/String;)[Ljava/io/Serializable;", "hashCode", "", "parseValue", "value", "(Ljava/lang/String;)[Ljava/io/Serializable;", "put", "", "(Landroid/os/Bundle;Ljava/lang/String;[Ljava/io/Serializable;)V", "valueEquals", "([Ljava/io/Serializable;[Ljava/io/Serializable;)Z", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: NavType.kt */
    public static final class SerializableArrayType<D extends Serializable> extends NavType<D[]> {
        private final Class<D[]> arrayType;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public SerializableArrayType(Class<D> type) {
            super(true);
            Intrinsics.checkNotNullParameter(type, "type");
            if (Serializable.class.isAssignableFrom(type)) {
                try {
                    Class arrayType2 = Class.forName("[L" + type.getName() + ';');
                    Intrinsics.checkNotNull(arrayType2, "null cannot be cast to non-null type java.lang.Class<kotlin.Array<D of androidx.navigation.NavType.SerializableArrayType>>");
                    this.arrayType = arrayType2;
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            } else {
                throw new IllegalArgumentException((type + " does not implement Serializable.").toString());
            }
        }

        public String getName() {
            String name = this.arrayType.getName();
            Intrinsics.checkNotNullExpressionValue(name, "arrayType.name");
            return name;
        }

        public void put(Bundle bundle, String key, D[] value) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            this.arrayType.cast(value);
            bundle.putSerializable(key, (Serializable) value);
        }

        public D[] get(Bundle bundle, String key) {
            Intrinsics.checkNotNullParameter(bundle, "bundle");
            Intrinsics.checkNotNullParameter(key, "key");
            return (Serializable[]) bundle.get(key);
        }

        public D[] parseValue(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            throw new UnsupportedOperationException("Arrays don't support default values.");
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !Intrinsics.areEqual((Object) getClass(), (Object) other.getClass())) {
                return false;
            }
            return Intrinsics.areEqual((Object) this.arrayType, (Object) ((SerializableArrayType) other).arrayType);
        }

        public int hashCode() {
            return this.arrayType.hashCode();
        }

        public boolean valueEquals(D[] value, D[] other) {
            return ArraysKt.contentDeepEquals(value, other);
        }
    }
}
