package androidx.navigation.serialization;

import androidx.navigation.NavType;
import androidx.navigation.serialization.InternalNavType;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KType;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialKind;
import kotlinx.serialization.internal.CollectionDescriptorsKt;

@Metadata(d1 = {"\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001*\u00020\u0002H\u0002\u001a\u0010\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004*\u00020\u0002H\u0000\u001a\u0014\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\u0006\u0010\u0007\u001a\u00020\bH\u0000\u001a\f\u0010\t\u001a\u00020\n*\u00020\u0002H\u0002¨\u0006\u000b"}, d2 = {"getClass", "Ljava/lang/Class;", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getNavType", "Landroidx/navigation/NavType;", "matchKType", "", "kType", "Lkotlin/reflect/KType;", "toInternalType", "Landroidx/navigation/serialization/InternalType;", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavTypeConverter.kt */
public final class NavTypeConverterKt {

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: NavTypeConverter.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InternalType.values().length];
            try {
                iArr[InternalType.INT.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[InternalType.BOOL.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[InternalType.FLOAT.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[InternalType.LONG.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            try {
                iArr[InternalType.STRING.ordinal()] = 5;
            } catch (NoSuchFieldError e5) {
            }
            try {
                iArr[InternalType.INT_NULLABLE.ordinal()] = 6;
            } catch (NoSuchFieldError e6) {
            }
            try {
                iArr[InternalType.BOOL_NULLABLE.ordinal()] = 7;
            } catch (NoSuchFieldError e7) {
            }
            try {
                iArr[InternalType.DOUBLE.ordinal()] = 8;
            } catch (NoSuchFieldError e8) {
            }
            try {
                iArr[InternalType.DOUBLE_NULLABLE.ordinal()] = 9;
            } catch (NoSuchFieldError e9) {
            }
            try {
                iArr[InternalType.FLOAT_NULLABLE.ordinal()] = 10;
            } catch (NoSuchFieldError e10) {
            }
            try {
                iArr[InternalType.LONG_NULLABLE.ordinal()] = 11;
            } catch (NoSuchFieldError e11) {
            }
            try {
                iArr[InternalType.STRING_NULLABLE.ordinal()] = 12;
            } catch (NoSuchFieldError e12) {
            }
            try {
                iArr[InternalType.INT_ARRAY.ordinal()] = 13;
            } catch (NoSuchFieldError e13) {
            }
            try {
                iArr[InternalType.BOOL_ARRAY.ordinal()] = 14;
            } catch (NoSuchFieldError e14) {
            }
            try {
                iArr[InternalType.DOUBLE_ARRAY.ordinal()] = 15;
            } catch (NoSuchFieldError e15) {
            }
            try {
                iArr[InternalType.FLOAT_ARRAY.ordinal()] = 16;
            } catch (NoSuchFieldError e16) {
            }
            try {
                iArr[InternalType.LONG_ARRAY.ordinal()] = 17;
            } catch (NoSuchFieldError e17) {
            }
            try {
                iArr[InternalType.ARRAY.ordinal()] = 18;
            } catch (NoSuchFieldError e18) {
            }
            try {
                iArr[InternalType.LIST.ordinal()] = 19;
            } catch (NoSuchFieldError e19) {
            }
            try {
                iArr[InternalType.ENUM.ordinal()] = 20;
            } catch (NoSuchFieldError e20) {
            }
            try {
                iArr[InternalType.ENUM_NULLABLE.ordinal()] = 21;
            } catch (NoSuchFieldError e21) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final NavType<?> getNavType(SerialDescriptor $this$getNavType) {
        NavType type;
        Intrinsics.checkNotNullParameter($this$getNavType, "<this>");
        switch (WhenMappings.$EnumSwitchMapping$0[toInternalType($this$getNavType).ordinal()]) {
            case 1:
                type = NavType.IntType;
                break;
            case 2:
                type = NavType.BoolType;
                break;
            case 3:
                type = NavType.FloatType;
                break;
            case 4:
                type = NavType.LongType;
                break;
            case 5:
                type = InternalNavType.INSTANCE.getStringNonNullableType();
                break;
            case 6:
                type = InternalNavType.INSTANCE.getIntNullableType();
                break;
            case 7:
                type = InternalNavType.INSTANCE.getBoolNullableType();
                break;
            case 8:
                type = InternalNavType.INSTANCE.getDoubleType();
                break;
            case 9:
                type = InternalNavType.INSTANCE.getDoubleNullableType();
                break;
            case 10:
                type = InternalNavType.INSTANCE.getFloatNullableType();
                break;
            case 11:
                type = InternalNavType.INSTANCE.getLongNullableType();
                break;
            case 12:
                type = NavType.StringType;
                break;
            case 13:
                type = NavType.IntArrayType;
                break;
            case 14:
                type = NavType.BoolArrayType;
                break;
            case 15:
                type = InternalNavType.INSTANCE.getDoubleArrayType();
                break;
            case 16:
                type = NavType.FloatArrayType;
                break;
            case 17:
                type = NavType.LongArrayType;
                break;
            case 18:
                if (toInternalType($this$getNavType.getElementDescriptor(0)) != InternalType.STRING) {
                    type = UNKNOWN.INSTANCE;
                    break;
                } else {
                    type = NavType.StringArrayType;
                    break;
                }
            case 19:
                switch (WhenMappings.$EnumSwitchMapping$0[toInternalType($this$getNavType.getElementDescriptor(0)).ordinal()]) {
                    case 1:
                        type = NavType.IntListType;
                        break;
                    case 2:
                        type = NavType.BoolListType;
                        break;
                    case 3:
                        type = NavType.FloatListType;
                        break;
                    case 4:
                        type = NavType.LongListType;
                        break;
                    case 5:
                        type = NavType.StringListType;
                        break;
                    default:
                        type = UNKNOWN.INSTANCE;
                        break;
                }
            case 20:
                type = NavType.Companion.parseSerializableOrParcelableType$navigation_common_release(getClass($this$getNavType), false);
                if (type == null) {
                    type = UNKNOWN.INSTANCE;
                    break;
                }
                break;
            case 21:
                Class clazz = getClass($this$getNavType);
                if (!Enum.class.isAssignableFrom(clazz)) {
                    type = UNKNOWN.INSTANCE;
                    break;
                } else {
                    Intrinsics.checkNotNull(clazz, "null cannot be cast to non-null type java.lang.Class<kotlin.Enum<*>?>");
                    type = new InternalNavType.EnumNullableType(clazz);
                    break;
                }
            default:
                type = UNKNOWN.INSTANCE;
                break;
        }
        return type;
    }

    private static final InternalType toInternalType(SerialDescriptor $this$toInternalType) {
        String serialName = StringsKt.replace$default($this$toInternalType.getSerialName(), "?", "", false, 4, (Object) null);
        if (Intrinsics.areEqual((Object) $this$toInternalType.getKind(), (Object) SerialKind.ENUM.INSTANCE)) {
            return $this$toInternalType.isNullable() ? InternalType.ENUM_NULLABLE : InternalType.ENUM;
        }
        if (Intrinsics.areEqual((Object) serialName, (Object) "kotlin.Int")) {
            return $this$toInternalType.isNullable() ? InternalType.INT_NULLABLE : InternalType.INT;
        }
        if (Intrinsics.areEqual((Object) serialName, (Object) "kotlin.Boolean")) {
            return $this$toInternalType.isNullable() ? InternalType.BOOL_NULLABLE : InternalType.BOOL;
        }
        if (Intrinsics.areEqual((Object) serialName, (Object) "kotlin.Double")) {
            return $this$toInternalType.isNullable() ? InternalType.DOUBLE_NULLABLE : InternalType.DOUBLE;
        }
        if (Intrinsics.areEqual((Object) serialName, (Object) "kotlin.Double")) {
            return InternalType.DOUBLE;
        }
        if (Intrinsics.areEqual((Object) serialName, (Object) "kotlin.Float")) {
            return $this$toInternalType.isNullable() ? InternalType.FLOAT_NULLABLE : InternalType.FLOAT;
        }
        if (Intrinsics.areEqual((Object) serialName, (Object) "kotlin.Long")) {
            return $this$toInternalType.isNullable() ? InternalType.LONG_NULLABLE : InternalType.LONG;
        }
        if (Intrinsics.areEqual((Object) serialName, (Object) "kotlin.String")) {
            return $this$toInternalType.isNullable() ? InternalType.STRING_NULLABLE : InternalType.STRING;
        }
        if (Intrinsics.areEqual((Object) serialName, (Object) "kotlin.IntArray")) {
            return InternalType.INT_ARRAY;
        }
        if (Intrinsics.areEqual((Object) serialName, (Object) "kotlin.DoubleArray")) {
            return InternalType.DOUBLE_ARRAY;
        }
        if (Intrinsics.areEqual((Object) serialName, (Object) "kotlin.BooleanArray")) {
            return InternalType.BOOL_ARRAY;
        }
        if (Intrinsics.areEqual((Object) serialName, (Object) "kotlin.FloatArray")) {
            return InternalType.FLOAT_ARRAY;
        }
        if (Intrinsics.areEqual((Object) serialName, (Object) "kotlin.LongArray")) {
            return InternalType.LONG_ARRAY;
        }
        if (Intrinsics.areEqual((Object) serialName, (Object) CollectionDescriptorsKt.ARRAY_NAME)) {
            return InternalType.ARRAY;
        }
        if (StringsKt.startsWith$default(serialName, CollectionDescriptorsKt.ARRAY_LIST_NAME, false, 2, (Object) null)) {
            return InternalType.LIST;
        }
        return InternalType.UNKNOWN;
    }

    private static final Class<?> getClass(SerialDescriptor $this$getClass) {
        String className = StringsKt.replace$default($this$getClass.getSerialName(), "?", "", false, 4, (Object) null);
        try {
            Class<?> cls = Class.forName(className);
            Intrinsics.checkNotNullExpressionValue(cls, "forName(className)");
            return cls;
        } catch (ClassNotFoundException e) {
            while (StringsKt.contains$default((CharSequence) className, (CharSequence) ".", false, 2, (Object) null)) {
                className = new Regex("(\\.+)(?!.*\\.)").replace((CharSequence) className, "\\$");
                try {
                    Class<?> cls2 = Class.forName(className);
                    Intrinsics.checkNotNullExpressionValue(cls2, "forName(className)");
                    return cls2;
                } catch (ClassNotFoundException e2) {
                }
            }
            throw new IllegalArgumentException("Cannot find class with name \"" + $this$getClass.getSerialName() + "\". Ensure that the serialName for this argument is the default fully qualified name");
        }
    }

    public static final boolean matchKType(SerialDescriptor $this$matchKType, KType kType) {
        Intrinsics.checkNotNullParameter($this$matchKType, "<this>");
        Intrinsics.checkNotNullParameter(kType, "kType");
        if ($this$matchKType.isNullable() != kType.isMarkedNullable()) {
            return false;
        }
        KSerializer kTypeSerializer = SerializersKt.serializerOrNull(kType);
        if (kTypeSerializer != null) {
            return Intrinsics.areEqual((Object) $this$matchKType, (Object) kTypeSerializer.getDescriptor());
        }
        throw new IllegalStateException("Custom serializers declared directly on a class field via @Serializable(with = ...) is currently not supported by safe args for both custom types and third-party types. Please use @Serializable or @Serializable(with = ...) on the class or object declaration.".toString());
    }
}
