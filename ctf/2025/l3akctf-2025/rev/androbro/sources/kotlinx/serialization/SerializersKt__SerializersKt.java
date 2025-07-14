package kotlinx.serialization;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Triple;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlin.reflect.KTypeProjection;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.internal.ArrayListSerializer;
import kotlinx.serialization.internal.HashMapSerializer;
import kotlinx.serialization.internal.HashSetSerializer;
import kotlinx.serialization.internal.LinkedHashMapSerializer;
import kotlinx.serialization.internal.LinkedHashSetSerializer;
import kotlinx.serialization.internal.PlatformKt;
import kotlinx.serialization.internal.Platform_commonKt;
import kotlinx.serialization.internal.PrimitivesKt;
import kotlinx.serialization.modules.SerializersModule;
import kotlinx.serialization.modules.SerializersModuleBuildersKt;

@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\u001a\u0014\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0001\u001a \u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u0007H\u0001\u001a7\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u00012\u0006\u0010\u0004\u001a\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0010\u0010\b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\tH\u0001¢\u0006\u0002\u0010\n\u001a\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\f0\u0001\"\u0006\b\u0000\u0010\f\u0018\u0001H\b\u001a6\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00012\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u001a\u0016\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00012\u0006\u0010\u0012\u001a\u00020\u0013\u001a\u0018\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u00012\u0006\u0010\u0012\u001a\u00020\u0013\u001aG\u0010\u0015\u001a\f\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\r0\u00072\u0014\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00010\u000f2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018H\u0002¢\u0006\u0002\b\u001a\u001a7\u0010\u001b\u001a\f\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\r0\u00072\u0014\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00010\u000fH\u0002¢\u0006\u0002\b\u001c\u001a1\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u0001H\f0\u0001\"\b\b\u0000\u0010\f*\u00020\r*\b\u0012\u0004\u0012\u0002H\f0\u00012\u0006\u0010\u001e\u001a\u00020\u0011H\u0002¢\u0006\u0002\b\u001f\u001aB\u0010 \u001a\f\u0012\u0006\b\u0001\u0012\u00020\r\u0018\u00010\u0001*\b\u0012\u0004\u0012\u00020\r0\u00072\u0014\u0010\u0016\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00010\u000f2\u000e\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0018H\u0000\u001a\"\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\f0\u0001\"\b\b\u0000\u0010\f*\u00020\r*\b\u0012\u0004\u0012\u0002H\f0\u0007H\u0007\u001a\u001b\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\f0\u0001\"\u0006\b\u0000\u0010\f\u0018\u0001*\u00020\u0005H\b\u001a:\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0001*\u00020\u00052\n\u0010\u0006\u001a\u0006\u0012\u0002\b\u00030\u00072\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007\u001a\u001a\u0010\u000b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0001*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013\u001aG\u0010!\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0001*\u00020\u00052\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020\r0\u00072\u0014\u0010\u000e\u001a\u0010\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0002¢\u0006\u0002\b#\u001a+\u0010$\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0001*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010%\u001a\u00020\u0011H\u0002¢\u0006\u0002\b&\u001a$\u0010\u0014\u001a\n\u0012\u0004\u0012\u0002H\f\u0018\u00010\u0001\"\b\b\u0000\u0010\f*\u00020\r*\b\u0012\u0004\u0012\u0002H\f0\u0007H\u0007\u001a\u001c\u0010\u0014\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\u0001*\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0013\u001a2\u0010'\u001a\u0012\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\r0\u0001\u0018\u00010\u000f*\u00020\u00052\f\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f2\u0006\u0010%\u001a\u00020\u0011H\u0000¨\u0006)"}, d2 = {"noCompiledSerializer", "Lkotlinx/serialization/KSerializer;", "forClass", "", "module", "Lkotlinx/serialization/modules/SerializersModule;", "kClass", "Lkotlin/reflect/KClass;", "argSerializers", "", "(Lkotlinx/serialization/modules/SerializersModule;Lkotlin/reflect/KClass;[Lkotlinx/serialization/KSerializer;)Lkotlinx/serialization/KSerializer;", "serializer", "T", "", "typeArgumentsSerializers", "", "isNullable", "", "type", "Lkotlin/reflect/KType;", "serializerOrNull", "builtinParametrizedSerializer", "serializers", "elementClassifierIfArray", "Lkotlin/Function0;", "Lkotlin/reflect/KClassifier;", "builtinParametrizedSerializer$SerializersKt__SerializersKt", "compiledParametrizedSerializer", "compiledParametrizedSerializer$SerializersKt__SerializersKt", "nullable", "shouldBeNullable", "nullable$SerializersKt__SerializersKt", "parametrizedSerializerOrNull", "serializerByKClassImpl", "rootClass", "serializerByKClassImpl$SerializersKt__SerializersKt", "serializerByKTypeImpl", "failOnMissingTypeArgSerializer", "serializerByKTypeImpl$SerializersKt__SerializersKt", "serializersForParameters", "typeArguments", "kotlinx-serialization-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/serialization/SerializersKt")
/* compiled from: Serializers.kt */
final /* synthetic */ class SerializersKt__SerializersKt {
    public static final /* synthetic */ <T> KSerializer<T> serializer() {
        Intrinsics.reifiedOperationMarker(6, "T");
        KSerializer $this$cast$iv = SerializersKt.serializer((KType) null);
        Intrinsics.checkNotNull($this$cast$iv, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return $this$cast$iv;
    }

    public static final /* synthetic */ <T> KSerializer<T> serializer(SerializersModule $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        Intrinsics.reifiedOperationMarker(6, "T");
        KSerializer $this$cast$iv = SerializersKt.serializer($this$serializer, (KType) null);
        Intrinsics.checkNotNull($this$cast$iv, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        return $this$cast$iv;
    }

    public static final KSerializer<Object> serializer(KType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    @ExperimentalSerializationApi
    public static final KSerializer<Object> serializer(KClass<?> kClass, List<? extends KSerializer<?>> typeArgumentsSerializers, boolean isNullable) {
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        return SerializersKt.serializer(SerializersModuleBuildersKt.EmptySerializersModule(), kClass, typeArgumentsSerializers, isNullable);
    }

    public static final KSerializer<Object> serializerOrNull(KType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        return SerializersKt.serializerOrNull(SerializersModuleBuildersKt.EmptySerializersModule(), type);
    }

    public static final KSerializer<Object> serializer(SerializersModule $this$serializer, KType type) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        KSerializer<Object> serializerByKTypeImpl$SerializersKt__SerializersKt = serializerByKTypeImpl$SerializersKt__SerializersKt($this$serializer, type, true);
        if (serializerByKTypeImpl$SerializersKt__SerializersKt != null) {
            return serializerByKTypeImpl$SerializersKt__SerializersKt;
        }
        PlatformKt.platformSpecificSerializerNotRegistered(Platform_commonKt.kclass(type));
        throw new KotlinNothingValueException();
    }

    @ExperimentalSerializationApi
    public static final KSerializer<Object> serializer(SerializersModule $this$serializer, KClass<?> kClass, List<? extends KSerializer<?>> typeArgumentsSerializers, boolean isNullable) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(typeArgumentsSerializers, "typeArgumentsSerializers");
        KSerializer<Object> serializerByKClassImpl$SerializersKt__SerializersKt = serializerByKClassImpl$SerializersKt__SerializersKt($this$serializer, kClass, typeArgumentsSerializers, isNullable);
        if (serializerByKClassImpl$SerializersKt__SerializersKt != null) {
            return serializerByKClassImpl$SerializersKt__SerializersKt;
        }
        PlatformKt.platformSpecificSerializerNotRegistered(kClass);
        throw new KotlinNothingValueException();
    }

    public static final KSerializer<Object> serializerOrNull(SerializersModule $this$serializerOrNull, KType type) {
        Intrinsics.checkNotNullParameter($this$serializerOrNull, "<this>");
        Intrinsics.checkNotNullParameter(type, "type");
        return serializerByKTypeImpl$SerializersKt__SerializersKt($this$serializerOrNull, type, false);
    }

    private static final KSerializer<Object> serializerByKTypeImpl$SerializersKt__SerializersKt(SerializersModule $this$serializerByKTypeImpl, KType type, boolean failOnMissingTypeArgSerializer) {
        KSerializer cachedSerializer;
        KSerializer contextualSerializer;
        KClass rootClass = Platform_commonKt.kclass(type);
        boolean isNullable = type.isMarkedNullable();
        Iterable<KTypeProjection> $this$map$iv = type.getArguments();
        Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
        for (KTypeProjection p0 : $this$map$iv) {
            destination$iv$iv.add(Platform_commonKt.typeOrThrow(p0));
        }
        List typeArguments = (List) destination$iv$iv;
        if (typeArguments.isEmpty()) {
            cachedSerializer = SerializersCacheKt.findCachedSerializer(rootClass, isNullable);
        } else {
            Object findParametrizedCachedSerializer = SerializersCacheKt.findParametrizedCachedSerializer(rootClass, typeArguments, isNullable);
            if (Result.m287isFailureimpl(findParametrizedCachedSerializer)) {
                findParametrizedCachedSerializer = null;
            }
            cachedSerializer = (KSerializer) findParametrizedCachedSerializer;
        }
        if (cachedSerializer != null) {
            return cachedSerializer;
        }
        if (typeArguments.isEmpty() != 0) {
            contextualSerializer = SerializersModule.getContextual$default($this$serializerByKTypeImpl, rootClass, (List) null, 2, (Object) null);
        } else {
            List serializers = SerializersKt.serializersForParameters($this$serializerByKTypeImpl, typeArguments, failOnMissingTypeArgSerializer);
            if (serializers == null) {
                return null;
            }
            KSerializer parametrizedSerializerOrNull = SerializersKt.parametrizedSerializerOrNull(rootClass, serializers, new SerializersKt__SerializersKt$serializerByKTypeImpl$contextualSerializer$1(typeArguments));
            if (parametrizedSerializerOrNull == null) {
                contextualSerializer = $this$serializerByKTypeImpl.getContextual(rootClass, serializers);
            } else {
                contextualSerializer = parametrizedSerializerOrNull;
            }
        }
        if (contextualSerializer != null) {
            return nullable$SerializersKt__SerializersKt(contextualSerializer, isNullable);
        }
        return null;
    }

    /* JADX WARNING: type inference failed for: r5v0, types: [kotlin.reflect.KClass, kotlin.reflect.KClass<java.lang.Object>] */
    /* JADX WARNING: type inference failed for: r6v0, types: [java.util.List, java.util.List<? extends kotlinx.serialization.KSerializer<java.lang.Object>>] */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static final kotlinx.serialization.KSerializer<java.lang.Object> serializerByKClassImpl$SerializersKt__SerializersKt(kotlinx.serialization.modules.SerializersModule r4, kotlin.reflect.KClass<java.lang.Object> r5, java.util.List<? extends kotlinx.serialization.KSerializer<java.lang.Object>> r6, boolean r7) {
        /*
            boolean r0 = r6.isEmpty()
            r1 = 0
            if (r0 == 0) goto L_0x0013
            kotlinx.serialization.KSerializer r0 = kotlinx.serialization.SerializersKt.serializerOrNull(r5)
            if (r0 != 0) goto L_0x0027
            r0 = 2
            kotlinx.serialization.KSerializer r0 = kotlinx.serialization.modules.SerializersModule.getContextual$default(r4, r5, r1, r0, r1)
            goto L_0x0027
        L_0x0013:
            kotlinx.serialization.SerializersKt__SerializersKt$serializerByKClassImpl$serializer$1 r0 = kotlinx.serialization.SerializersKt__SerializersKt$serializerByKClassImpl$serializer$1.INSTANCE     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
            kotlin.jvm.functions.Function0 r0 = (kotlin.jvm.functions.Function0) r0     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
            kotlinx.serialization.KSerializer r0 = kotlinx.serialization.SerializersKt.parametrizedSerializerOrNull(r5, r6, r0)     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
            if (r0 != 0) goto L_0x0025
            kotlinx.serialization.KSerializer r0 = r4.getContextual(r5, r6)     // Catch:{ IndexOutOfBoundsException -> 0x0032 }
        L_0x0025:
        L_0x0027:
            if (r0 == 0) goto L_0x0031
            r1 = r0
            r2 = 0
            kotlinx.serialization.KSerializer r1 = nullable$SerializersKt__SerializersKt(r1, r7)
        L_0x0031:
            return r1
        L_0x0032:
            r0 = move-exception
            kotlinx.serialization.SerializationException r1 = new kotlinx.serialization.SerializationException
            java.lang.String r2 = "Unable to retrieve a serializer, the number of passed type serializers differs from the actual number of generic parameters"
            r3 = r0
            java.lang.Throwable r3 = (java.lang.Throwable) r3
            r1.<init>(r2, r3)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.SerializersKt__SerializersKt.serializerByKClassImpl$SerializersKt__SerializersKt(kotlinx.serialization.modules.SerializersModule, kotlin.reflect.KClass, java.util.List, boolean):kotlinx.serialization.KSerializer");
    }

    public static final List<KSerializer<Object>> serializersForParameters(SerializersModule $this$serializersForParameters, List<? extends KType> typeArguments, boolean failOnMissingTypeArgSerializer) {
        Intrinsics.checkNotNullParameter($this$serializersForParameters, "<this>");
        Intrinsics.checkNotNullParameter(typeArguments, "typeArguments");
        if (failOnMissingTypeArgSerializer) {
            Iterable<KType> $this$map$iv = typeArguments;
            Collection destination$iv$iv = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv, 10));
            for (KType it : $this$map$iv) {
                destination$iv$iv.add(SerializersKt.serializer($this$serializersForParameters, it));
            }
            return (List) destination$iv$iv;
        }
        Iterable<KType> $this$map$iv2 = typeArguments;
        Collection destination$iv$iv2 = new ArrayList(CollectionsKt.collectionSizeOrDefault($this$map$iv2, 10));
        for (KType it2 : $this$map$iv2) {
            KSerializer<Object> serializerOrNull = SerializersKt.serializerOrNull($this$serializersForParameters, it2);
            if (serializerOrNull == null) {
                return null;
            }
            destination$iv$iv2.add(serializerOrNull);
        }
        return (List) destination$iv$iv2;
    }

    @InternalSerializationApi
    public static final <T> KSerializer<T> serializer(KClass<T> $this$serializer) {
        Intrinsics.checkNotNullParameter($this$serializer, "<this>");
        KSerializer<T> serializerOrNull = SerializersKt.serializerOrNull($this$serializer);
        if (serializerOrNull != null) {
            return serializerOrNull;
        }
        Platform_commonKt.serializerNotRegistered($this$serializer);
        throw new KotlinNothingValueException();
    }

    @InternalSerializationApi
    public static final <T> KSerializer<T> serializerOrNull(KClass<T> $this$serializerOrNull) {
        Intrinsics.checkNotNullParameter($this$serializerOrNull, "<this>");
        KSerializer<T> compiledSerializerImpl = PlatformKt.compiledSerializerImpl($this$serializerOrNull);
        return compiledSerializerImpl == null ? PrimitivesKt.builtinSerializerOrNull($this$serializerOrNull) : compiledSerializerImpl;
    }

    public static final KSerializer<? extends Object> parametrizedSerializerOrNull(KClass<Object> $this$parametrizedSerializerOrNull, List<? extends KSerializer<Object>> serializers, Function0<? extends KClassifier> elementClassifierIfArray) {
        Intrinsics.checkNotNullParameter($this$parametrizedSerializerOrNull, "<this>");
        Intrinsics.checkNotNullParameter(serializers, "serializers");
        Intrinsics.checkNotNullParameter(elementClassifierIfArray, "elementClassifierIfArray");
        KSerializer<? extends Object> builtinParametrizedSerializer$SerializersKt__SerializersKt = builtinParametrizedSerializer$SerializersKt__SerializersKt($this$parametrizedSerializerOrNull, serializers, elementClassifierIfArray);
        return builtinParametrizedSerializer$SerializersKt__SerializersKt == null ? compiledParametrizedSerializer$SerializersKt__SerializersKt($this$parametrizedSerializerOrNull, serializers) : builtinParametrizedSerializer$SerializersKt__SerializersKt;
    }

    private static final KSerializer<? extends Object> compiledParametrizedSerializer$SerializersKt__SerializersKt(KClass<Object> $this$compiledParametrizedSerializer, List<? extends KSerializer<Object>> serializers) {
        KSerializer[] kSerializerArr = (KSerializer[]) serializers.toArray(new KSerializer[0]);
        return PlatformKt.constructSerializerForGivenTypeArgs($this$compiledParametrizedSerializer, (KSerializer<Object>[]) (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length));
    }

    private static final KSerializer<? extends Object> builtinParametrizedSerializer$SerializersKt__SerializersKt(KClass<Object> $this$builtinParametrizedSerializer, List<? extends KSerializer<Object>> serializers, Function0<? extends KClassifier> elementClassifierIfArray) {
        if (Intrinsics.areEqual((Object) $this$builtinParametrizedSerializer, (Object) Reflection.getOrCreateKotlinClass(Collection.class)) ? true : Intrinsics.areEqual((Object) $this$builtinParametrizedSerializer, (Object) Reflection.getOrCreateKotlinClass(List.class)) ? true : Intrinsics.areEqual((Object) $this$builtinParametrizedSerializer, (Object) Reflection.getOrCreateKotlinClass(List.class)) ? true : Intrinsics.areEqual((Object) $this$builtinParametrizedSerializer, (Object) Reflection.getOrCreateKotlinClass(ArrayList.class))) {
            return new ArrayListSerializer<>((KSerializer) serializers.get(0));
        }
        if (Intrinsics.areEqual((Object) $this$builtinParametrizedSerializer, (Object) Reflection.getOrCreateKotlinClass(HashSet.class))) {
            return new HashSetSerializer<>((KSerializer) serializers.get(0));
        }
        if (Intrinsics.areEqual((Object) $this$builtinParametrizedSerializer, (Object) Reflection.getOrCreateKotlinClass(Set.class)) ? true : Intrinsics.areEqual((Object) $this$builtinParametrizedSerializer, (Object) Reflection.getOrCreateKotlinClass(Set.class)) ? true : Intrinsics.areEqual((Object) $this$builtinParametrizedSerializer, (Object) Reflection.getOrCreateKotlinClass(LinkedHashSet.class))) {
            return new LinkedHashSetSerializer<>((KSerializer) serializers.get(0));
        }
        if (Intrinsics.areEqual((Object) $this$builtinParametrizedSerializer, (Object) Reflection.getOrCreateKotlinClass(HashMap.class))) {
            return new HashMapSerializer<>((KSerializer) serializers.get(0), (KSerializer) serializers.get(1));
        }
        if (Intrinsics.areEqual((Object) $this$builtinParametrizedSerializer, (Object) Reflection.getOrCreateKotlinClass(Map.class)) ? true : Intrinsics.areEqual((Object) $this$builtinParametrizedSerializer, (Object) Reflection.getOrCreateKotlinClass(Map.class)) ? true : Intrinsics.areEqual((Object) $this$builtinParametrizedSerializer, (Object) Reflection.getOrCreateKotlinClass(LinkedHashMap.class))) {
            return new LinkedHashMapSerializer<>((KSerializer) serializers.get(0), (KSerializer) serializers.get(1));
        }
        if (Intrinsics.areEqual((Object) $this$builtinParametrizedSerializer, (Object) Reflection.getOrCreateKotlinClass(Map.Entry.class))) {
            return BuiltinSerializersKt.MapEntrySerializer((KSerializer) serializers.get(0), (KSerializer) serializers.get(1));
        }
        if (Intrinsics.areEqual((Object) $this$builtinParametrizedSerializer, (Object) Reflection.getOrCreateKotlinClass(Pair.class))) {
            return BuiltinSerializersKt.PairSerializer((KSerializer) serializers.get(0), (KSerializer) serializers.get(1));
        }
        if (Intrinsics.areEqual((Object) $this$builtinParametrizedSerializer, (Object) Reflection.getOrCreateKotlinClass(Triple.class))) {
            return BuiltinSerializersKt.TripleSerializer((KSerializer) serializers.get(0), (KSerializer) serializers.get(1), (KSerializer) serializers.get(2));
        }
        if (!PlatformKt.isReferenceArray($this$builtinParametrizedSerializer)) {
            return null;
        }
        Object invoke = elementClassifierIfArray.invoke();
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type kotlin.reflect.KClass<kotlin.Any>");
        return BuiltinSerializersKt.ArraySerializer((KClass) invoke, (KSerializer) serializers.get(0));
    }

    private static final <T> KSerializer<T> nullable$SerializersKt__SerializersKt(KSerializer<T> $this$nullable, boolean shouldBeNullable) {
        if (shouldBeNullable) {
            return BuiltinSerializersKt.getNullable($this$nullable);
        }
        Intrinsics.checkNotNull($this$nullable, "null cannot be cast to non-null type kotlinx.serialization.KSerializer<T of kotlinx.serialization.SerializersKt__SerializersKt.nullable?>");
        return $this$nullable;
    }

    public static final KSerializer<?> noCompiledSerializer(String forClass) {
        Intrinsics.checkNotNullParameter(forClass, "forClass");
        throw new SerializationException(Platform_commonKt.notRegisteredMessage(forClass));
    }

    public static final KSerializer<?> noCompiledSerializer(SerializersModule module, KClass<?> kClass) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        KSerializer<?> contextual$default = SerializersModule.getContextual$default(module, kClass, (List) null, 2, (Object) null);
        if (contextual$default != null) {
            return contextual$default;
        }
        Platform_commonKt.serializerNotRegistered(kClass);
        throw new KotlinNothingValueException();
    }

    public static final KSerializer<?> noCompiledSerializer(SerializersModule module, KClass<?> kClass, KSerializer<?>[] argSerializers) {
        Intrinsics.checkNotNullParameter(module, "module");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        Intrinsics.checkNotNullParameter(argSerializers, "argSerializers");
        KSerializer<?> contextual = module.getContextual(kClass, ArraysKt.asList((T[]) argSerializers));
        if (contextual != null) {
            return contextual;
        }
        Platform_commonKt.serializerNotRegistered(kClass);
        throw new KotlinNothingValueException();
    }
}
