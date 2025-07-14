package kotlinx.serialization;

import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.AbstractPolymorphicSerializer;
import kotlinx.serialization.internal.AbstractPolymorphicSerializerKt;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0007\u001a7\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\t\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u00042\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u0002H\u0002H\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"findPolymorphicSerializer", "Lkotlinx/serialization/DeserializationStrategy;", "T", "", "Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "decoder", "Lkotlinx/serialization/encoding/CompositeDecoder;", "klassName", "", "Lkotlinx/serialization/SerializationStrategy;", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "(Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* compiled from: PolymorphicSerializer.kt */
public final class PolymorphicSerializerKt {
    @InternalSerializationApi
    public static final <T> DeserializationStrategy<T> findPolymorphicSerializer(AbstractPolymorphicSerializer<T> $this$findPolymorphicSerializer, CompositeDecoder decoder, String klassName) {
        Intrinsics.checkNotNullParameter($this$findPolymorphicSerializer, "<this>");
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        DeserializationStrategy<T> findPolymorphicSerializerOrNull = $this$findPolymorphicSerializer.findPolymorphicSerializerOrNull(decoder, klassName);
        if (findPolymorphicSerializerOrNull != null) {
            return findPolymorphicSerializerOrNull;
        }
        AbstractPolymorphicSerializerKt.throwSubtypeNotRegistered(klassName, (KClass<?>) $this$findPolymorphicSerializer.getBaseClass());
        throw new KotlinNothingValueException();
    }

    @InternalSerializationApi
    public static final <T> SerializationStrategy<T> findPolymorphicSerializer(AbstractPolymorphicSerializer<T> $this$findPolymorphicSerializer, Encoder encoder, T value) {
        Intrinsics.checkNotNullParameter($this$findPolymorphicSerializer, "<this>");
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerializationStrategy<T> findPolymorphicSerializerOrNull = $this$findPolymorphicSerializer.findPolymorphicSerializerOrNull(encoder, value);
        if (findPolymorphicSerializerOrNull != null) {
            return findPolymorphicSerializerOrNull;
        }
        AbstractPolymorphicSerializerKt.throwSubtypeNotRegistered((KClass<?>) Reflection.getOrCreateKotlinClass(value.getClass()), (KClass<?>) $this$findPolymorphicSerializer.getBaseClass());
        throw new KotlinNothingValueException();
    }
}
