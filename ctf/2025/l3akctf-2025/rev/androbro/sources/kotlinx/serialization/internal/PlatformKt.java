package kotlinx.serialization.internal;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Arrays;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Polymorphic;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.SerializationException;

@Metadata(d1 = {"\u0000X\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0004\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\u0000\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\"\u0010\u0005\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0006\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0002¢\u0006\u0002\u0010\u0007\u001aO\u0010\b\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\n\u0010\t\u001a\u0006\u0012\u0002\b\u00030\n2\"\u0010\u0005\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0006\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0002¢\u0006\u0002\u0010\u000b\u001a\u0016\u0010\f\u001a\u00020\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0000\u001a\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\n2\u0006\u0010\u0011\u001a\u00020\u0012H\u0002\u001a$\u0010\u0013\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u000fH\u0000\u001aM\u0010\u0014\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\n2\"\u0010\u0005\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0006\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0000¢\u0006\u0002\u0010\u000b\u001aM\u0010\u0014\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\"\u0010\u0005\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0006\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0000¢\u0006\u0002\u0010\u0015\u001a\"\u0010\u0016\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\nH\u0002\u001aM\u0010\u0017\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\n2\"\u0010\u0005\u001a\u0012\u0012\u000e\b\u0001\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00010\u0006\"\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0001H\u0002¢\u0006\u0002\u0010\u000b\u001a\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u0003\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\nH\u0002\u001a$\u0010\u0019\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\nH\u0002\u001a&\u0010\u001a\u001a\u0002H\u0002\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001cH\b¢\u0006\u0002\u0010\u001d\u001a\u0015\u0010\u001a\u001a\u00020\r*\u00020\u001e2\u0006\u0010\u001b\u001a\u00020\u001cH\b\u001a$\u0010\u001f\u001a\n\u0012\u0004\u0012\u0002H\u0002\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\nH\u0002\u001a\u001c\u0010 \u001a\u00020\r\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\nH\u0002\u001a\u001c\u0010!\u001a\u00020\r\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\nH\u0002\u001a\u0010\u0010\"\u001a\u00020#*\u0006\u0012\u0002\b\u00030\u000fH\u0000\u001a\u0010\u0010$\u001a\u00020#*\u0006\u0012\u0002\b\u00030\nH\u0000\u001aK\u0010%\u001a\b\u0012\u0004\u0012\u0002H&0\u0006\"\b\b\u0000\u0010\u0002*\u00020\u0003\"\n\b\u0001\u0010&*\u0004\u0018\u0001H\u0002*\u0012\u0012\u0004\u0012\u0002H&0'j\b\u0012\u0004\u0012\u0002H&`(2\f\u0010)\u001a\b\u0012\u0004\u0012\u0002H\u00020\u000fH\u0000¢\u0006\u0002\u0010*¨\u0006+"}, d2 = {"invokeSerializerOnCompanion", "Lkotlinx/serialization/KSerializer;", "T", "", "companion", "args", "", "(Ljava/lang/Object;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "invokeSerializerOnDefaultCompanion", "jClass", "Ljava/lang/Class;", "(Ljava/lang/Class;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "isReferenceArray", "", "rootClass", "Lkotlin/reflect/KClass;", "companionOrNull", "companionName", "", "compiledSerializerImpl", "constructSerializerForGivenTypeArgs", "(Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "createEnumSerializer", "findInNamedCompanion", "findNamedCompanionByAnnotation", "findObjectSerializer", "getChecked", "index", "", "([Ljava/lang/Object;I)Ljava/lang/Object;", "", "interfaceSerializer", "isNotAnnotated", "isPolymorphicSerializer", "platformSpecificSerializerNotRegistered", "", "serializerNotRegistered", "toNativeArrayImpl", "E", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "eClass", "(Ljava/util/ArrayList;Lkotlin/reflect/KClass;)[Ljava/lang/Object;", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* compiled from: Platform.kt */
public final class PlatformKt {
    public static final <T> T getChecked(T[] $this$getChecked, int index) {
        Intrinsics.checkNotNullParameter($this$getChecked, "<this>");
        return $this$getChecked[index];
    }

    public static final boolean getChecked(boolean[] $this$getChecked, int index) {
        Intrinsics.checkNotNullParameter($this$getChecked, "<this>");
        return $this$getChecked[index];
    }

    public static final <T> KSerializer<T> compiledSerializerImpl(KClass<T> $this$compiledSerializerImpl) {
        Intrinsics.checkNotNullParameter($this$compiledSerializerImpl, "<this>");
        return constructSerializerForGivenTypeArgs($this$compiledSerializerImpl, (KSerializer<Object>[]) new KSerializer[0]);
    }

    public static final <T, E extends T> E[] toNativeArrayImpl(ArrayList<E> $this$toNativeArrayImpl, KClass<T> eClass) {
        Intrinsics.checkNotNullParameter($this$toNativeArrayImpl, "<this>");
        Intrinsics.checkNotNullParameter(eClass, "eClass");
        Object newInstance = Array.newInstance(JvmClassMappingKt.getJavaClass(eClass), $this$toNativeArrayImpl.size());
        Intrinsics.checkNotNull(newInstance, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        E[] array = $this$toNativeArrayImpl.toArray((Object[]) newInstance);
        Intrinsics.checkNotNullExpressionValue(array, "toArray(...)");
        return array;
    }

    public static final Void platformSpecificSerializerNotRegistered(KClass<?> $this$platformSpecificSerializerNotRegistered) {
        Intrinsics.checkNotNullParameter($this$platformSpecificSerializerNotRegistered, "<this>");
        Platform_commonKt.serializerNotRegistered($this$platformSpecificSerializerNotRegistered);
        throw new KotlinNothingValueException();
    }

    public static final Void serializerNotRegistered(Class<?> $this$serializerNotRegistered) {
        Intrinsics.checkNotNullParameter($this$serializerNotRegistered, "<this>");
        throw new SerializationException(Platform_commonKt.notRegisteredMessage(JvmClassMappingKt.getKotlinClass($this$serializerNotRegistered)));
    }

    public static final <T> KSerializer<T> constructSerializerForGivenTypeArgs(KClass<T> $this$constructSerializerForGivenTypeArgs, KSerializer<Object>... args) {
        Intrinsics.checkNotNullParameter($this$constructSerializerForGivenTypeArgs, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        return constructSerializerForGivenTypeArgs(JvmClassMappingKt.getJavaClass($this$constructSerializerForGivenTypeArgs), (KSerializer<Object>[]) (KSerializer[]) Arrays.copyOf(args, args.length));
    }

    public static final <T> KSerializer<T> constructSerializerForGivenTypeArgs(Class<T> $this$constructSerializerForGivenTypeArgs, KSerializer<Object>... args) {
        KSerializer it;
        Intrinsics.checkNotNullParameter($this$constructSerializerForGivenTypeArgs, "<this>");
        Intrinsics.checkNotNullParameter(args, "args");
        if ($this$constructSerializerForGivenTypeArgs.isEnum() && isNotAnnotated($this$constructSerializerForGivenTypeArgs)) {
            return createEnumSerializer($this$constructSerializerForGivenTypeArgs);
        }
        if ($this$constructSerializerForGivenTypeArgs.isInterface() && (it = interfaceSerializer($this$constructSerializerForGivenTypeArgs)) != null) {
            return it;
        }
        KSerializer serializer = invokeSerializerOnDefaultCompanion($this$constructSerializerForGivenTypeArgs, (KSerializer[]) Arrays.copyOf(args, args.length));
        if (serializer != null) {
            return serializer;
        }
        KSerializer it2 = findObjectSerializer($this$constructSerializerForGivenTypeArgs);
        if (it2 != null) {
            return it2;
        }
        KSerializer fromNamedCompanion = findInNamedCompanion($this$constructSerializerForGivenTypeArgs, (KSerializer[]) Arrays.copyOf(args, args.length));
        if (fromNamedCompanion != null) {
            return fromNamedCompanion;
        }
        if (isPolymorphicSerializer($this$constructSerializerForGivenTypeArgs)) {
            return new PolymorphicSerializer<>(JvmClassMappingKt.getKotlinClass($this$constructSerializerForGivenTypeArgs));
        }
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x004e, code lost:
        r2 = r4.getField("INSTANCE");
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final <T> kotlinx.serialization.KSerializer<T> findInNamedCompanion(java.lang.Class<T> r13, kotlinx.serialization.KSerializer<java.lang.Object>... r14) {
        /*
            java.lang.Object r0 = findNamedCompanionByAnnotation(r13)
            if (r0 == 0) goto L_0x0015
            int r1 = r14.length
            java.lang.Object[] r1 = java.util.Arrays.copyOf(r14, r1)
            kotlinx.serialization.KSerializer[] r1 = (kotlinx.serialization.KSerializer[]) r1
            kotlinx.serialization.KSerializer r1 = invokeSerializerOnCompanion(r0, r1)
            if (r1 == 0) goto L_0x0015
            r2 = 0
            return r1
        L_0x0015:
            r1 = 0
            java.lang.Class[] r2 = r13.getDeclaredClasses()     // Catch:{ NoSuchFieldException -> 0x0065 }
            java.lang.String r3 = "getDeclaredClasses(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)     // Catch:{ NoSuchFieldException -> 0x0065 }
            java.lang.Object[] r2 = (java.lang.Object[]) r2     // Catch:{ NoSuchFieldException -> 0x0065 }
            r3 = 0
            r4 = 0
            r5 = 0
            int r6 = r2.length     // Catch:{ NoSuchFieldException -> 0x0065 }
            r7 = 0
        L_0x0028:
            if (r7 >= r6) goto L_0x0045
            r8 = r2[r7]     // Catch:{ NoSuchFieldException -> 0x0065 }
            r9 = r8
            java.lang.Class r9 = (java.lang.Class) r9     // Catch:{ NoSuchFieldException -> 0x0065 }
            r10 = 0
            java.lang.String r11 = r9.getSimpleName()     // Catch:{ NoSuchFieldException -> 0x0065 }
            java.lang.String r12 = "$serializer"
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r12)     // Catch:{ NoSuchFieldException -> 0x0065 }
            if (r11 == 0) goto L_0x0042
            if (r5 == 0) goto L_0x0040
            r4 = r1
            goto L_0x004a
        L_0x0040:
            r4 = r8
            r5 = 1
        L_0x0042:
            int r7 = r7 + 1
            goto L_0x0028
        L_0x0045:
            if (r5 != 0) goto L_0x0049
            r4 = r1
            goto L_0x004a
        L_0x0049:
        L_0x004a:
            java.lang.Class r4 = (java.lang.Class) r4     // Catch:{ NoSuchFieldException -> 0x0065 }
            if (r4 == 0) goto L_0x005c
            java.lang.String r2 = "INSTANCE"
            java.lang.reflect.Field r2 = r4.getField(r2)     // Catch:{ NoSuchFieldException -> 0x0065 }
            if (r2 == 0) goto L_0x005c
            java.lang.Object r2 = r2.get(r1)     // Catch:{ NoSuchFieldException -> 0x0065 }
            goto L_0x005d
        L_0x005c:
            r2 = r1
        L_0x005d:
            boolean r3 = r2 instanceof kotlinx.serialization.KSerializer     // Catch:{ NoSuchFieldException -> 0x0065 }
            if (r3 == 0) goto L_0x0067
            kotlinx.serialization.KSerializer r2 = (kotlinx.serialization.KSerializer) r2     // Catch:{ NoSuchFieldException -> 0x0065 }
            r1 = r2
            goto L_0x0067
        L_0x0065:
            r2 = move-exception
        L_0x0067:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.internal.PlatformKt.findInNamedCompanion(java.lang.Class, kotlinx.serialization.KSerializer[]):kotlinx.serialization.KSerializer");
    }

    private static final <T> Object findNamedCompanionByAnnotation(Class<T> $this$findNamedCompanionByAnnotation) {
        Class element$iv;
        Class[] declaredClasses = $this$findNamedCompanionByAnnotation.getDeclaredClasses();
        Intrinsics.checkNotNullExpressionValue(declaredClasses, "getDeclaredClasses(...)");
        Object[] $this$firstOrNull$iv = (Object[]) declaredClasses;
        int length = $this$firstOrNull$iv.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                element$iv = null;
                break;
            }
            element$iv = $this$firstOrNull$iv[i];
            if (((Class) element$iv).getAnnotation(NamedCompanion.class) != null) {
                break;
            }
            i++;
        }
        Class companionClass = element$iv;
        if (companionClass == null) {
            return null;
        }
        String simpleName = companionClass.getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return companionOrNull($this$findNamedCompanionByAnnotation, simpleName);
    }

    private static final <T> boolean isNotAnnotated(Class<T> $this$isNotAnnotated) {
        return $this$isNotAnnotated.getAnnotation(Serializable.class) == null && $this$isNotAnnotated.getAnnotation(Polymorphic.class) == null;
    }

    private static final <T> boolean isPolymorphicSerializer(Class<T> $this$isPolymorphicSerializer) {
        if ($this$isPolymorphicSerializer.getAnnotation(Polymorphic.class) != null) {
            return true;
        }
        Serializable serializable = (Serializable) $this$isPolymorphicSerializer.getAnnotation(Serializable.class);
        if (serializable == null || !Intrinsics.areEqual((Object) Reflection.getOrCreateKotlinClass(serializable.with()), (Object) Reflection.getOrCreateKotlinClass(PolymorphicSerializer.class))) {
            return false;
        }
        return true;
    }

    private static final <T> KSerializer<T> interfaceSerializer(Class<T> $this$interfaceSerializer) {
        Serializable serializable = (Serializable) $this$interfaceSerializer.getAnnotation(Serializable.class);
        if (serializable == null || Intrinsics.areEqual((Object) Reflection.getOrCreateKotlinClass(serializable.with()), (Object) Reflection.getOrCreateKotlinClass(PolymorphicSerializer.class))) {
            return new PolymorphicSerializer<>(JvmClassMappingKt.getKotlinClass($this$interfaceSerializer));
        }
        return null;
    }

    private static final <T> KSerializer<T> invokeSerializerOnDefaultCompanion(Class<?> jClass, KSerializer<Object>... args) {
        Object companion = companionOrNull(jClass, "Companion");
        if (companion == null) {
            return null;
        }
        return invokeSerializerOnCompanion(companion, (KSerializer[]) Arrays.copyOf(args, args.length));
    }

    private static final <T> KSerializer<T> invokeSerializerOnCompanion(Object companion, KSerializer<Object>... args) {
        Class[] clsArr;
        try {
            if (args.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = args.length;
                Class[] clsArr2 = new Class[length];
                for (int i = 0; i < length; i++) {
                    clsArr2[i] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Class[] types = clsArr;
            Object invoke = companion.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(types, types.length)).invoke(companion, Arrays.copyOf(args, args.length));
            if (invoke instanceof KSerializer) {
                return (KSerializer) invoke;
            }
            return null;
        } catch (NoSuchMethodException e) {
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause != null) {
                String message = cause.getMessage();
                if (message == null) {
                    message = e2.getMessage();
                }
                throw new InvocationTargetException(cause, message);
            }
            throw e2;
        }
    }

    private static final Object companionOrNull(Class<?> $this$companionOrNull, String companionName) {
        try {
            Field companion = $this$companionOrNull.getDeclaredField(companionName);
            companion.setAccessible(true);
            return companion.get((Object) null);
        } catch (Throwable th) {
            return null;
        }
    }

    private static final <T> KSerializer<T> createEnumSerializer(Class<T> $this$createEnumSerializer) {
        Object[] constants = $this$createEnumSerializer.getEnumConstants();
        String canonicalName = $this$createEnumSerializer.getCanonicalName();
        Intrinsics.checkNotNullExpressionValue(canonicalName, "getCanonicalName(...)");
        Intrinsics.checkNotNull(constants, "null cannot be cast to non-null type kotlin.Array<out kotlin.Enum<*>>");
        return new EnumSerializer<>(canonicalName, (Enum[]) constants);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0026  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0067  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x00c9  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x006d A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x00d1 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final <T> kotlinx.serialization.KSerializer<T> findObjectSerializer(java.lang.Class<T> r16) {
        /*
            java.lang.String r0 = r16.getCanonicalName()
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x0022
            r4 = 0
            java.lang.String r5 = "java."
            r6 = 2
            boolean r5 = kotlin.text.StringsKt.startsWith$default(r0, r5, r3, r6, r2)
            if (r5 != 0) goto L_0x001d
            java.lang.String r5 = "kotlin."
            boolean r5 = kotlin.text.StringsKt.startsWith$default(r0, r5, r3, r6, r2)
            if (r5 == 0) goto L_0x001b
            goto L_0x001d
        L_0x001b:
            r0 = r3
            goto L_0x001e
        L_0x001d:
            r0 = 1
        L_0x001e:
            if (r0 != 0) goto L_0x0022
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = r3
        L_0x0023:
            if (r0 != 0) goto L_0x0026
            return r2
        L_0x0026:
            java.lang.reflect.Field[] r0 = r16.getDeclaredFields()
            java.lang.String r4 = "getDeclaredFields(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r4)
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            r4 = 0
            r5 = 0
            r6 = 0
            int r7 = r0.length
            r8 = r3
        L_0x0036:
            if (r8 >= r7) goto L_0x0070
            r9 = r0[r8]
            r10 = r9
            java.lang.reflect.Field r10 = (java.lang.reflect.Field) r10
            r11 = 0
            java.lang.String r12 = r10.getName()
            java.lang.String r13 = "INSTANCE"
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r13)
            if (r12 == 0) goto L_0x0062
            java.lang.Class r12 = r10.getType()
            r13 = r16
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r12, (java.lang.Object) r13)
            if (r12 == 0) goto L_0x0064
            int r12 = r10.getModifiers()
            boolean r12 = java.lang.reflect.Modifier.isStatic(r12)
            if (r12 == 0) goto L_0x0064
            r10 = 1
            goto L_0x0065
        L_0x0062:
            r13 = r16
        L_0x0064:
            r10 = r3
        L_0x0065:
            if (r10 == 0) goto L_0x006d
            if (r6 == 0) goto L_0x006b
            r5 = r2
            goto L_0x0077
        L_0x006b:
            r5 = r9
            r6 = 1
        L_0x006d:
            int r8 = r8 + 1
            goto L_0x0036
        L_0x0070:
            r13 = r16
            if (r6 != 0) goto L_0x0076
            r5 = r2
            goto L_0x0077
        L_0x0076:
        L_0x0077:
            java.lang.reflect.Field r5 = (java.lang.reflect.Field) r5
            if (r5 != 0) goto L_0x007c
            return r2
        L_0x007c:
            r0 = r5
            java.lang.Object r4 = r0.get(r2)
            java.lang.reflect.Method[] r5 = r16.getMethods()
            java.lang.String r6 = "getMethods(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r5, r6)
            java.lang.Object[] r5 = (java.lang.Object[]) r5
            r6 = 0
            r7 = 0
            r8 = 0
            int r9 = r5.length
            r10 = r3
        L_0x0091:
            if (r10 >= r9) goto L_0x00d4
            r11 = r5[r10]
            r12 = r11
            java.lang.reflect.Method r12 = (java.lang.reflect.Method) r12
            r14 = 0
            java.lang.String r15 = r12.getName()
            java.lang.String r1 = "serializer"
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r15, (java.lang.Object) r1)
            if (r1 == 0) goto L_0x00c6
            java.lang.Class[] r1 = r12.getParameterTypes()
            java.lang.String r15 = "getParameterTypes(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r15)
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r1 = r1.length
            if (r1 != 0) goto L_0x00b5
            r1 = 1
            goto L_0x00b6
        L_0x00b5:
            r1 = r3
        L_0x00b6:
            if (r1 == 0) goto L_0x00c6
            java.lang.Class r1 = r12.getReturnType()
            java.lang.Class<kotlinx.serialization.KSerializer> r15 = kotlinx.serialization.KSerializer.class
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r15)
            if (r1 == 0) goto L_0x00c6
            r1 = 1
            goto L_0x00c7
        L_0x00c6:
            r1 = r3
        L_0x00c7:
            if (r1 == 0) goto L_0x00d1
            if (r8 == 0) goto L_0x00cd
            r7 = r2
            goto L_0x00d9
        L_0x00cd:
            r1 = r11
            r7 = 1
            r8 = r7
            r7 = r1
        L_0x00d1:
            int r10 = r10 + 1
            goto L_0x0091
        L_0x00d4:
            if (r8 != 0) goto L_0x00d8
            r7 = r2
            goto L_0x00d9
        L_0x00d8:
        L_0x00d9:
            java.lang.reflect.Method r7 = (java.lang.reflect.Method) r7
            if (r7 != 0) goto L_0x00de
            return r2
        L_0x00de:
            r1 = r7
            java.lang.Object[] r3 = new java.lang.Object[r3]
            java.lang.Object r3 = r1.invoke(r4, r3)
            boolean r5 = r3 instanceof kotlinx.serialization.KSerializer
            if (r5 == 0) goto L_0x00ec
            r2 = r3
            kotlinx.serialization.KSerializer r2 = (kotlinx.serialization.KSerializer) r2
        L_0x00ec:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.internal.PlatformKt.findObjectSerializer(java.lang.Class):kotlinx.serialization.KSerializer");
    }

    public static final boolean isReferenceArray(KClass<Object> rootClass) {
        Intrinsics.checkNotNullParameter(rootClass, "rootClass");
        return JvmClassMappingKt.getJavaClass(rootClass).isArray();
    }
}
