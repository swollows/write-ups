package kotlinx.serialization;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.Arrays;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0006\u001a\u0014\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a\u0016\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00012\u0006\u0010\u0003\u001a\u00020\u0004\u001a)\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0002\b\u000b\u001a\u0015\u0010\f\u001a\u0006\u0012\u0002\b\u00030\r*\u00020\u0004H\u0002¢\u0006\u0002\b\u000e\u001aG\u0010\u000f\u001a\n\u0012\u0004\u0012\u0002H\u0010\u0018\u00010\u0001\"\b\b\u0000\u0010\u0010*\u00020\u0002*\u00020\u00072\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u0002H\u00100\r2\u0014\u0010\u0012\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00010\u0013H\u0002¢\u0006\u0002\b\u0014\u001a\u0018\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004\u001a+\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0002\b\u0016\u001a\u001a\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0004\u001a-\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0001*\u00020\u00072\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\r2\u0006\u0010\t\u001a\u00020\nH\u0002¢\u0006\u0002\b\u0018¨\u0006\u0019"}, d2 = {"serializer", "Lkotlinx/serialization/KSerializer;", "", "type", "Ljava/lang/reflect/Type;", "serializerOrNull", "genericArraySerializer", "Lkotlinx/serialization/modules/SerializersModule;", "Ljava/lang/reflect/GenericArrayType;", "failOnMissingTypeArgSerializer", "", "genericArraySerializer$SerializersKt__SerializersJvmKt", "prettyClass", "Ljava/lang/Class;", "prettyClass$SerializersKt__SerializersJvmKt", "reflectiveOrContextual", "T", "jClass", "typeArgumentsSerializers", "", "reflectiveOrContextual$SerializersKt__SerializersJvmKt", "serializerByJavaTypeImpl", "serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt", "typeSerializer", "typeSerializer$SerializersKt__SerializersJvmKt", "kotlinx-serialization-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/serialization/SerializersKt")
/* compiled from: SerializersJvm.kt */
final /* synthetic */ class SerializersKt__SerializersJvmKt {
    public static final KSerializer<Object> serializer(Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    public static final KSerializer<Object> serializerOrNull(Type type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return SerializersKt.serializerOrNull(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    public static final KSerializer<Object> serializer(SerializersModule $this$serializer, Type type) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        KSerializer<Object> serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt = serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt($this$serializer, type, true);
        if (serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt != null) {
            return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt;
        }
        PlatformKt.serializerNotRegistered(prettyClass$SerializersKt__SerializersJvmKt(type));
        throw new KotlinNothingValueException();
    }

    public static final KSerializer<Object> serializerOrNull(SerializersModule $this$serializerOrNull, Type type) {
        Intrinsics.checkNotNullParameter($this$serializerOrNull, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt($this$serializerOrNull, type, false);
    }

    static /* synthetic */ KSerializer serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt$default(SerializersModule serializersModule, Type type, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(serializersModule, type, z);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.util.Collection} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v8, resolved type: java.util.List} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final kotlinx.serialization.KSerializer<java.lang.Object> serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(kotlinx.serialization.modules.SerializersModule r18, java.lang.reflect.Type r19, boolean r20) {
        /*
            r0 = r18
            r1 = r19
            r2 = r20
            boolean r3 = r1 instanceof java.lang.reflect.GenericArrayType
            if (r3 == 0) goto L_0x0013
            r3 = r1
            java.lang.reflect.GenericArrayType r3 = (java.lang.reflect.GenericArrayType) r3
            kotlinx.serialization.KSerializer r3 = genericArraySerializer$SerializersKt__SerializersJvmKt(r0, r3, r2)
            goto L_0x01b0
        L_0x0013:
            boolean r3 = r1 instanceof java.lang.Class
            if (r3 == 0) goto L_0x0020
            r3 = r1
            java.lang.Class r3 = (java.lang.Class) r3
            kotlinx.serialization.KSerializer r3 = typeSerializer$SerializersKt__SerializersJvmKt(r0, r3, r2)
            goto L_0x01b0
        L_0x0020:
            boolean r3 = r1 instanceof java.lang.reflect.ParameterizedType
            r4 = 0
            if (r3 == 0) goto L_0x018d
            r3 = r1
            java.lang.reflect.ParameterizedType r3 = (java.lang.reflect.ParameterizedType) r3
            java.lang.reflect.Type r3 = r3.getRawType()
            java.lang.String r7 = "null cannot be cast to non-null type java.lang.Class<*>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r3, r7)
            java.lang.Class r3 = (java.lang.Class) r3
            r7 = r1
            java.lang.reflect.ParameterizedType r7 = (java.lang.reflect.ParameterizedType) r7
            java.lang.reflect.Type[] r7 = r7.getActualTypeArguments()
            kotlin.jvm.internal.Intrinsics.checkNotNull(r7)
            if (r2 == 0) goto L_0x0066
            r4 = r7
            r8 = 0
            java.util.ArrayList r9 = new java.util.ArrayList
            int r10 = r4.length
            r9.<init>(r10)
            java.util.Collection r9 = (java.util.Collection) r9
            r10 = r4
            r11 = 0
            int r12 = r10.length
            r13 = 0
        L_0x004d:
            if (r13 >= r12) goto L_0x0061
            r14 = r10[r13]
            r15 = r14
            r16 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r15)
            kotlinx.serialization.KSerializer r15 = kotlinx.serialization.SerializersKt.serializer((kotlinx.serialization.modules.SerializersModule) r0, (java.lang.reflect.Type) r15)
            r9.add(r15)
            int r13 = r13 + 1
            goto L_0x004d
        L_0x0061:
            java.util.List r9 = (java.util.List) r9
            goto L_0x0093
        L_0x0066:
            r8 = r7
            r9 = 0
            java.util.ArrayList r10 = new java.util.ArrayList
            int r11 = r8.length
            r10.<init>(r11)
            java.util.Collection r10 = (java.util.Collection) r10
            r11 = r8
            r12 = 0
            int r13 = r11.length
            r14 = 0
        L_0x0074:
            if (r14 >= r13) goto L_0x008e
            r15 = r11[r14]
            r16 = r15
            r17 = 0
            kotlin.jvm.internal.Intrinsics.checkNotNull(r16)
            r5 = r16
            kotlinx.serialization.KSerializer r6 = kotlinx.serialization.SerializersKt.serializerOrNull((kotlinx.serialization.modules.SerializersModule) r0, (java.lang.reflect.Type) r5)
            if (r6 != 0) goto L_0x0088
            return r4
        L_0x0088:
            r10.add(r6)
            int r14 = r14 + 1
            goto L_0x0074
        L_0x008e:
            r4 = r10
            java.util.List r4 = (java.util.List) r4
            r9 = r4
        L_0x0093:
            r4 = r9
            java.lang.Class<java.util.Set> r5 = java.util.Set.class
            boolean r5 = r5.isAssignableFrom(r3)
            java.lang.String r6 = "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>"
            if (r5 == 0) goto L_0x00b0
            r5 = 0
            java.lang.Object r5 = r4.get(r5)
            kotlinx.serialization.KSerializer r5 = (kotlinx.serialization.KSerializer) r5
            kotlinx.serialization.KSerializer r5 = kotlinx.serialization.builtins.BuiltinSerializersKt.SetSerializer(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r6)
            r3 = r5
            goto L_0x01b0
        L_0x00b0:
            java.lang.Class<java.util.List> r5 = java.util.List.class
            boolean r5 = r5.isAssignableFrom(r3)
            if (r5 != 0) goto L_0x017d
            java.lang.Class<java.util.Collection> r5 = java.util.Collection.class
            boolean r5 = r5.isAssignableFrom(r3)
            if (r5 == 0) goto L_0x00c2
            goto L_0x017d
        L_0x00c2:
            java.lang.Class<java.util.Map> r5 = java.util.Map.class
            boolean r5 = r5.isAssignableFrom(r3)
            r8 = 1
            if (r5 == 0) goto L_0x00e2
            r5 = 0
            java.lang.Object r5 = r4.get(r5)
            kotlinx.serialization.KSerializer r5 = (kotlinx.serialization.KSerializer) r5
            java.lang.Object r8 = r4.get(r8)
            kotlinx.serialization.KSerializer r8 = (kotlinx.serialization.KSerializer) r8
            kotlinx.serialization.KSerializer r5 = kotlinx.serialization.builtins.BuiltinSerializersKt.MapSerializer(r5, r8)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r6)
            r3 = r5
            goto L_0x01b0
        L_0x00e2:
            java.lang.Class<java.util.Map$Entry> r5 = java.util.Map.Entry.class
            boolean r5 = r5.isAssignableFrom(r3)
            if (r5 == 0) goto L_0x0101
            r5 = 0
            java.lang.Object r5 = r4.get(r5)
            kotlinx.serialization.KSerializer r5 = (kotlinx.serialization.KSerializer) r5
            java.lang.Object r8 = r4.get(r8)
            kotlinx.serialization.KSerializer r8 = (kotlinx.serialization.KSerializer) r8
            kotlinx.serialization.KSerializer r5 = kotlinx.serialization.builtins.BuiltinSerializersKt.MapEntrySerializer(r5, r8)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r6)
            r3 = r5
            goto L_0x01b0
        L_0x0101:
            java.lang.Class<kotlin.Pair> r5 = kotlin.Pair.class
            boolean r5 = r5.isAssignableFrom(r3)
            if (r5 == 0) goto L_0x0120
            r5 = 0
            java.lang.Object r5 = r4.get(r5)
            kotlinx.serialization.KSerializer r5 = (kotlinx.serialization.KSerializer) r5
            java.lang.Object r8 = r4.get(r8)
            kotlinx.serialization.KSerializer r8 = (kotlinx.serialization.KSerializer) r8
            kotlinx.serialization.KSerializer r5 = kotlinx.serialization.builtins.BuiltinSerializersKt.PairSerializer(r5, r8)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r6)
            r3 = r5
            goto L_0x01b0
        L_0x0120:
            java.lang.Class<kotlin.Triple> r5 = kotlin.Triple.class
            boolean r5 = r5.isAssignableFrom(r3)
            if (r5 == 0) goto L_0x0145
            r5 = 0
            java.lang.Object r5 = r4.get(r5)
            kotlinx.serialization.KSerializer r5 = (kotlinx.serialization.KSerializer) r5
            java.lang.Object r8 = r4.get(r8)
            kotlinx.serialization.KSerializer r8 = (kotlinx.serialization.KSerializer) r8
            r9 = 2
            java.lang.Object r9 = r4.get(r9)
            kotlinx.serialization.KSerializer r9 = (kotlinx.serialization.KSerializer) r9
            kotlinx.serialization.KSerializer r5 = kotlinx.serialization.builtins.BuiltinSerializersKt.TripleSerializer(r5, r8, r9)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r6)
            r3 = r5
            goto L_0x01b0
        L_0x0145:
            r5 = r4
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r6 = 0
            java.util.ArrayList r8 = new java.util.ArrayList
            r9 = 10
            int r9 = kotlin.collections.CollectionsKt.collectionSizeOrDefault(r5, r9)
            r8.<init>(r9)
            java.util.Collection r8 = (java.util.Collection) r8
            r9 = r5
            r10 = 0
            java.util.Iterator r11 = r9.iterator()
        L_0x015c:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0173
            java.lang.Object r12 = r11.next()
            r13 = r12
            kotlinx.serialization.KSerializer r13 = (kotlinx.serialization.KSerializer) r13
            r14 = 0
            java.lang.String r15 = "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any?>"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r13, r15)
            r8.add(r13)
            goto L_0x015c
        L_0x0173:
            java.util.List r8 = (java.util.List) r8
            r5 = r8
            kotlinx.serialization.KSerializer r3 = reflectiveOrContextual$SerializersKt__SerializersJvmKt(r0, r3, r5)
            goto L_0x01b0
        L_0x017d:
            r5 = 0
            java.lang.Object r5 = r4.get(r5)
            kotlinx.serialization.KSerializer r5 = (kotlinx.serialization.KSerializer) r5
            kotlinx.serialization.KSerializer r5 = kotlinx.serialization.builtins.BuiltinSerializersKt.ListSerializer(r5)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5, r6)
            r3 = r5
            goto L_0x01b0
        L_0x018d:
            boolean r3 = r1 instanceof java.lang.reflect.WildcardType
            if (r3 == 0) goto L_0x01b1
            r3 = r1
            java.lang.reflect.WildcardType r3 = (java.lang.reflect.WildcardType) r3
            java.lang.reflect.Type[] r3 = r3.getUpperBounds()
            java.lang.String r5 = "getUpperBounds(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            java.lang.Object r3 = kotlin.collections.ArraysKt.first((T[]) r3)
            java.lang.String r5 = "first(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r3, r5)
            java.lang.reflect.Type r3 = (java.lang.reflect.Type) r3
            r5 = 2
            r6 = 0
            kotlinx.serialization.KSerializer r3 = serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt$default(r0, r3, r6, r5, r4)
        L_0x01b0:
            return r3
        L_0x01b1:
            java.lang.IllegalArgumentException r3 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = "type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.StringBuilder r4 = r4.append(r1)
            java.lang.String r5 = " has type "
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.Class r5 = r19.getClass()
            kotlin.reflect.KClass r5 = kotlin.jvm.internal.Reflection.getOrCreateKotlinClass(r5)
            java.lang.StringBuilder r4 = r4.append(r5)
            java.lang.String r4 = r4.toString()
            r3.<init>(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.SerializersKt__SerializersJvmKt.serializerByJavaTypeImpl$SerializersKt__SerializersJvmKt(kotlinx.serialization.modules.SerializersModule, java.lang.reflect.Type, boolean):kotlinx.serialization.KSerializer");
    }

    private static final KSerializer<Object> typeSerializer$SerializersKt__SerializersJvmKt(SerializersModule $this$typeSerializer, Class<?> type, boolean failOnMissingTypeArgSerializer) {
        KSerializer s;
        if (!type.isArray() || type.getComponentType().isPrimitive()) {
            Intrinsics.checkNotNull(type, "null cannot be cast to non-null type java.lang.Class<kotlin.Any>");
            return reflectiveOrContextual$SerializersKt__SerializersJvmKt($this$typeSerializer, type, CollectionsKt.emptyList());
        }
        Class<?> componentType = type.getComponentType();
        Intrinsics.checkNotNullExpressionValue(componentType, "getComponentType(...)");
        Type type2 = componentType;
        if (failOnMissingTypeArgSerializer) {
            s = SerializersKt.serializer($this$typeSerializer, type2);
        } else {
            s = SerializersKt.serializerOrNull($this$typeSerializer, type2);
            if (s == null) {
                return null;
            }
        }
        KClass<?> kotlinClass = JvmClassMappingKt.getKotlinClass(componentType);
        Intrinsics.checkNotNull(kotlinClass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        KSerializer arraySerializer = BuiltinSerializersKt.ArraySerializer(kotlinClass, s);
        Intrinsics.checkNotNull(arraySerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return arraySerializer;
    }

    private static final <T> KSerializer<T> reflectiveOrContextual$SerializersKt__SerializersJvmKt(SerializersModule $this$reflectiveOrContextual, Class<T> jClass, List<? extends KSerializer<Object>> typeArgumentsSerializers) {
        KSerializer[] kSerializerArr = (KSerializer[]) typeArgumentsSerializers.toArray(new KSerializer[0]);
        KSerializer it = PlatformKt.constructSerializerForGivenTypeArgs(jClass, (KSerializer<Object>[]) (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
        if (it != null) {
            return it;
        }
        KClass kClass = JvmClassMappingKt.getKotlinClass(jClass);
        KSerializer<T> builtinSerializerOrNull = PrimitivesKt.builtinSerializerOrNull(kClass);
        return builtinSerializerOrNull == null ? $this$reflectiveOrContextual.getContextual(kClass, typeArgumentsSerializers) : builtinSerializerOrNull;
    }

    private static final KSerializer<Object> genericArraySerializer$SerializersKt__SerializersJvmKt(SerializersModule $this$genericArraySerializer, GenericArrayType type, boolean failOnMissingTypeArgSerializer) {
        Type type2;
        KSerializer serializer;
        KClass kclass;
        Type it = type.getGenericComponentType();
        if (it instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) it).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            type2 = (Type) ArraysKt.first((T[]) (Object[]) upperBounds);
        } else {
            type2 = it;
        }
        Type eType = type2;
        Intrinsics.checkNotNull(eType);
        if (failOnMissingTypeArgSerializer) {
            serializer = SerializersKt.serializer($this$genericArraySerializer, eType);
        } else {
            serializer = SerializersKt.serializerOrNull($this$genericArraySerializer, eType);
            if (serializer == null) {
                return null;
            }
        }
        if (eType instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) eType).getRawType();
            Intrinsics.checkNotNull(rawType, "null cannot be cast to non-null type java.lang.Class<*>");
            kclass = JvmClassMappingKt.getKotlinClass((Class) rawType);
        } else if (eType instanceof KClass) {
            kclass = (KClass) eType;
        } else {
            throw new IllegalStateException("unsupported type in GenericArray: " + Reflection.getOrCreateKotlinClass(eType.getClass()));
        }
        Intrinsics.checkNotNull(kclass, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        KSerializer<E[]> ArraySerializer = BuiltinSerializersKt.ArraySerializer(kclass, serializer);
        Intrinsics.checkNotNull(ArraySerializer, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<kotlin.Any>");
        return ArraySerializer;
    }

    private static final Class<?> prettyClass$SerializersKt__SerializersJvmKt(Type $this$prettyClass) {
        Type it = $this$prettyClass;
        if (it instanceof Class) {
            return (Class) it;
        }
        if (it instanceof ParameterizedType) {
            Type rawType = ((ParameterizedType) it).getRawType();
            Intrinsics.checkNotNullExpressionValue(rawType, "getRawType(...)");
            return prettyClass$SerializersKt__SerializersJvmKt(rawType);
        } else if (it instanceof WildcardType) {
            Type[] upperBounds = ((WildcardType) it).getUpperBounds();
            Intrinsics.checkNotNullExpressionValue(upperBounds, "getUpperBounds(...)");
            Object first = ArraysKt.first((T[]) (Object[]) upperBounds);
            Intrinsics.checkNotNullExpressionValue(first, "first(...)");
            return prettyClass$SerializersKt__SerializersJvmKt((Type) first);
        } else if (it instanceof GenericArrayType) {
            Type genericComponentType = ((GenericArrayType) it).getGenericComponentType();
            Intrinsics.checkNotNullExpressionValue(genericComponentType, "getGenericComponentType(...)");
            return prettyClass$SerializersKt__SerializersJvmKt(genericComponentType);
        } else {
            throw new IllegalArgumentException("type should be an instance of Class<?>, GenericArrayType, ParametrizedType or WildcardType, but actual argument " + it + " has type " + Reflection.getOrCreateKotlinClass(it.getClass()));
        }
    }
}
