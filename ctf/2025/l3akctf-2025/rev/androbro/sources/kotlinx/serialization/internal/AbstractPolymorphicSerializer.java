package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.reflect.KClass;
import kotlinx.serialization.DeserializationStrategy;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializerKt;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.SerializationStrategy;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b'\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B\u0007\b\u0000¢\u0006\u0002\u0010\u0004J\u0015\u0010\t\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\u000bH\u0002¢\u0006\u0002\u0010\fJ\u0013\u0010\r\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0002\u0010\u0010J\"\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00122\u0006\u0010\u000e\u001a\u00020\u000b2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014H\u0017J%\u0010\u0011\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00152\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u0000H\u0017¢\u0006\u0002\u0010\u0019J\u001b\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00028\u0000¢\u0006\u0002\u0010\u001cR\u0018\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u001d"}, d2 = {"Lkotlinx/serialization/internal/AbstractPolymorphicSerializer;", "T", "", "Lkotlinx/serialization/KSerializer;", "()V", "baseClass", "Lkotlin/reflect/KClass;", "getBaseClass", "()Lkotlin/reflect/KClass;", "decodeSequentially", "compositeDecoder", "Lkotlinx/serialization/encoding/CompositeDecoder;", "(Lkotlinx/serialization/encoding/CompositeDecoder;)Ljava/lang/Object;", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Object;", "findPolymorphicSerializerOrNull", "Lkotlinx/serialization/DeserializationStrategy;", "klassName", "", "Lkotlinx/serialization/SerializationStrategy;", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)Lkotlinx/serialization/SerializationStrategy;", "serialize", "", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InternalSerializationApi
/* compiled from: AbstractPolymorphicSerializer.kt */
public abstract class AbstractPolymorphicSerializer<T> implements KSerializer<T> {
    public abstract KClass<T> getBaseClass();

    public final void serialize(Encoder encoder, T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        SerializationStrategy actualSerializer = PolymorphicSerializerKt.findPolymorphicSerializer(this, encoder, value);
        SerialDescriptor descriptor$iv = getDescriptor();
        CompositeEncoder composite$iv = encoder.beginStructure(descriptor$iv);
        CompositeEncoder $this$serialize_u24lambda_u240 = composite$iv;
        $this$serialize_u24lambda_u240.encodeStringElement(getDescriptor(), 0, actualSerializer.getDescriptor().getSerialName());
        SerialDescriptor descriptor = getDescriptor();
        SerializationStrategy $this$cast$iv = actualSerializer;
        Intrinsics.checkNotNull($this$cast$iv, "null cannot be cast to non-null type kotlinx.serialization.SerializationStrategy<T of kotlinx.serialization.internal.Platform_commonKt.cast>");
        $this$serialize_u24lambda_u240.encodeSerializableElement(descriptor, 1, $this$cast$iv, value);
        composite$iv.endStructure(descriptor$iv);
    }

    public final T deserialize(Decoder decoder) {
        Object obj;
        AbstractPolymorphicSerializer abstractPolymorphicSerializer = this;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor descriptor$iv = getDescriptor();
        CompositeDecoder composite$iv = decoder.beginStructure(descriptor$iv);
        CompositeDecoder $this$deserialize_u24lambda_u243 = composite$iv;
        Ref.ObjectRef klassName = new Ref.ObjectRef();
        if ($this$deserialize_u24lambda_u243.decodeSequentially()) {
            obj = abstractPolymorphicSerializer.decodeSequentially($this$deserialize_u24lambda_u243);
        } else {
            Object value = null;
            while (true) {
                int index = $this$deserialize_u24lambda_u243.decodeElementIndex(getDescriptor());
                switch (index) {
                    case -1:
                        Object value2 = value;
                        if (value2 != null) {
                            Intrinsics.checkNotNull(value2, "null cannot be cast to non-null type T of kotlinx.serialization.internal.AbstractPolymorphicSerializer.deserialize$lambda$3");
                            obj = value2;
                            break;
                        } else {
                            throw new IllegalArgumentException(("Polymorphic value has not been read for class " + ((String) klassName.element)).toString());
                        }
                    case 0:
                        Object obj2 = value;
                        klassName.element = $this$deserialize_u24lambda_u243.decodeStringElement(getDescriptor(), index);
                        abstractPolymorphicSerializer = this;
                        continue;
                    case 1:
                        T t = klassName.element;
                        if (t != null) {
                            klassName.element = t;
                            DeserializationStrategy serializer = PolymorphicSerializerKt.findPolymorphicSerializer(abstractPolymorphicSerializer, $this$deserialize_u24lambda_u243, (String) klassName.element);
                            int i = index;
                            Object obj3 = value;
                            value = CompositeDecoder.DefaultImpls.decodeSerializableElement$default($this$deserialize_u24lambda_u243, getDescriptor(), index, serializer, (Object) null, 8, (Object) null);
                            abstractPolymorphicSerializer = this;
                            continue;
                        } else {
                            throw new IllegalArgumentException("Cannot read polymorphic value before its type token".toString());
                        }
                    default:
                        int index2 = index;
                        Object obj4 = value;
                        StringBuilder append = new StringBuilder().append("Invalid index in polymorphic deserialization of ");
                        String str = (String) klassName.element;
                        if (str == null) {
                            str = "unknown class";
                        }
                        throw new SerializationException(append.append(str).append("\n Expected 0, 1 or DECODE_DONE(-1), but found ").append(index2).toString());
                }
            }
        }
        Object result$iv = obj;
        composite$iv.endStructure(descriptor$iv);
        return result$iv;
    }

    /* access modifiers changed from: private */
    public final T decodeSequentially(CompositeDecoder compositeDecoder) {
        return CompositeDecoder.DefaultImpls.decodeSerializableElement$default(compositeDecoder, getDescriptor(), 1, PolymorphicSerializerKt.findPolymorphicSerializer(this, compositeDecoder, compositeDecoder.decodeStringElement(getDescriptor(), 0)), (Object) null, 8, (Object) null);
    }

    @InternalSerializationApi
    public DeserializationStrategy<T> findPolymorphicSerializerOrNull(CompositeDecoder decoder, String klassName) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return decoder.getSerializersModule().getPolymorphic(getBaseClass(), klassName);
    }

    @InternalSerializationApi
    public SerializationStrategy<T> findPolymorphicSerializerOrNull(Encoder encoder, T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        return encoder.getSerializersModule().getPolymorphic(getBaseClass(), value);
    }
}
