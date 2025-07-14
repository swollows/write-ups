package kotlinx.serialization;

import java.lang.reflect.Type;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KClassifier;
import kotlin.reflect.KType;
import kotlinx.serialization.modules.SerializersModule;

@Metadata(d1 = {"kotlinx/serialization/SerializersKt__SerializersJvmKt", "kotlinx/serialization/SerializersKt__SerializersKt"}, k = 4, mv = {1, 9, 0}, xi = 48)
public final class SerializersKt {
    public static final KSerializer<?> noCompiledSerializer(String forClass) {
        return SerializersKt__SerializersKt.noCompiledSerializer(forClass);
    }

    public static final KSerializer<?> noCompiledSerializer(SerializersModule module, KClass<?> kClass) {
        return SerializersKt__SerializersKt.noCompiledSerializer(module, kClass);
    }

    public static final KSerializer<?> noCompiledSerializer(SerializersModule module, KClass<?> kClass, KSerializer<?>[] argSerializers) {
        return SerializersKt__SerializersKt.noCompiledSerializer(module, kClass, argSerializers);
    }

    public static final KSerializer<? extends Object> parametrizedSerializerOrNull(KClass<Object> $this$parametrizedSerializerOrNull, List<? extends KSerializer<Object>> serializers, Function0<? extends KClassifier> elementClassifierIfArray) {
        return SerializersKt__SerializersKt.parametrizedSerializerOrNull($this$parametrizedSerializerOrNull, serializers, elementClassifierIfArray);
    }

    public static final /* synthetic */ <T> KSerializer<T> serializer() {
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall((Object) "kotlinx.serialization.serializer.simple");
        return serializer((KType) null);
    }

    public static final KSerializer<Object> serializer(Type type) {
        return SerializersKt__SerializersJvmKt.serializer(type);
    }

    @InternalSerializationApi
    public static final <T> KSerializer<T> serializer(KClass<T> $this$serializer) {
        return SerializersKt__SerializersKt.serializer($this$serializer);
    }

    @ExperimentalSerializationApi
    public static final KSerializer<Object> serializer(KClass<?> kClass, List<? extends KSerializer<?>> typeArgumentsSerializers, boolean isNullable) {
        return SerializersKt__SerializersKt.serializer(kClass, typeArgumentsSerializers, isNullable);
    }

    public static final KSerializer<Object> serializer(KType type) {
        return SerializersKt__SerializersKt.serializer(type);
    }

    public static final /* synthetic */ <T> KSerializer<T> serializer(SerializersModule $this$serializer) {
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall((Object) "kotlinx.serialization.serializer.withModule");
        return serializer($this$serializer, (KType) null);
    }

    public static final KSerializer<Object> serializer(SerializersModule $this$serializer, Type type) {
        return SerializersKt__SerializersJvmKt.serializer($this$serializer, type);
    }

    @ExperimentalSerializationApi
    public static final KSerializer<Object> serializer(SerializersModule $this$serializer, KClass<?> kClass, List<? extends KSerializer<?>> typeArgumentsSerializers, boolean isNullable) {
        return SerializersKt__SerializersKt.serializer($this$serializer, kClass, typeArgumentsSerializers, isNullable);
    }

    public static final KSerializer<Object> serializer(SerializersModule $this$serializer, KType type) {
        return SerializersKt__SerializersKt.serializer($this$serializer, type);
    }

    public static final KSerializer<Object> serializerOrNull(Type type) {
        return SerializersKt__SerializersJvmKt.serializerOrNull(type);
    }

    @InternalSerializationApi
    public static final <T> KSerializer<T> serializerOrNull(KClass<T> $this$serializerOrNull) {
        return SerializersKt__SerializersKt.serializerOrNull($this$serializerOrNull);
    }

    public static final KSerializer<Object> serializerOrNull(KType type) {
        return SerializersKt__SerializersKt.serializerOrNull(type);
    }

    public static final KSerializer<Object> serializerOrNull(SerializersModule $this$serializerOrNull, Type type) {
        return SerializersKt__SerializersJvmKt.serializerOrNull($this$serializerOrNull, type);
    }

    public static final KSerializer<Object> serializerOrNull(SerializersModule $this$serializerOrNull, KType type) {
        return SerializersKt__SerializersKt.serializerOrNull($this$serializerOrNull, type);
    }

    public static final List<KSerializer<Object>> serializersForParameters(SerializersModule $this$serializersForParameters, List<? extends KType> typeArguments, boolean failOnMissingTypeArgSerializer) {
        return SerializersKt__SerializersKt.serializersForParameters($this$serializersForParameters, typeArguments, failOnMissingTypeArgSerializer);
    }
}
