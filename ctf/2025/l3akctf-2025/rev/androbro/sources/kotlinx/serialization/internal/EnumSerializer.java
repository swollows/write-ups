package kotlinx.serialization.internal;

import java.lang.Enum;
import java.util.Arrays;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Typography;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\u000e\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B%\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB\u001b\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007¢\u0006\u0002\u0010\u000bJ\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0002J\u0015\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u0015H\u0016¢\u0006\u0002\u0010\u0016J\u001d\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u001cJ\b\u0010\u001d\u001a\u00020\u0005H\u0016R\u001b\u0010\b\u001a\u00020\t8VX\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u0007X\u0004¢\u0006\u0004\n\u0002\u0010\u0011¨\u0006\u001e"}, d2 = {"Lkotlinx/serialization/internal/EnumSerializer;", "T", "", "Lkotlinx/serialization/KSerializer;", "serialName", "", "values", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "(Ljava/lang/String;[Ljava/lang/Enum;Lkotlinx/serialization/descriptors/SerialDescriptor;)V", "(Ljava/lang/String;[Ljava/lang/Enum;)V", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor$delegate", "Lkotlin/Lazy;", "overriddenDescriptor", "[Ljava/lang/Enum;", "createUnmarkedDescriptor", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "(Lkotlinx/serialization/encoding/Decoder;)Ljava/lang/Enum;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Enum;)V", "toString", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: Enums.kt */
public final class EnumSerializer<T extends Enum<T>> implements KSerializer<T> {
    private final Lazy descriptor$delegate;
    /* access modifiers changed from: private */
    public SerialDescriptor overriddenDescriptor;
    private final T[] values;

    public EnumSerializer(String serialName, T[] values2) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values2, "values");
        this.values = values2;
        this.descriptor$delegate = LazyKt.lazy(new EnumSerializer$descriptor$2(this, serialName));
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public EnumSerializer(String serialName, T[] values2, SerialDescriptor descriptor) {
        this(serialName, values2);
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(values2, "values");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        this.overriddenDescriptor = descriptor;
    }

    public SerialDescriptor getDescriptor() {
        return (SerialDescriptor) this.descriptor$delegate.getValue();
    }

    /* access modifiers changed from: private */
    public final SerialDescriptor createUnmarkedDescriptor(String serialName) {
        EnumDescriptor d = new EnumDescriptor(serialName, this.values.length);
        for (T it : this.values) {
            PluginGeneratedSerialDescriptor.addElement$default(d, it.name(), false, 2, (Object) null);
        }
        return d;
    }

    public void serialize(Encoder encoder, T value) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(value, "value");
        int index = ArraysKt.indexOf(this.values, value);
        if (index != -1) {
            encoder.encodeEnum(getDescriptor(), index);
            return;
        }
        StringBuilder append = new StringBuilder().append(value).append(" is not a valid enum ").append(getDescriptor().getSerialName()).append(", must be one of ");
        String arrays = Arrays.toString(this.values);
        Intrinsics.checkNotNullExpressionValue(arrays, "toString(...)");
        throw new SerializationException(append.append(arrays).toString());
    }

    public T deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        int index = decoder.decodeEnum(getDescriptor());
        boolean z = false;
        if (index >= 0 && index < this.values.length) {
            z = true;
        }
        if (z) {
            return this.values[index];
        }
        throw new SerializationException(index + " is not among valid " + getDescriptor().getSerialName() + " enum values, values size is " + this.values.length);
    }

    public String toString() {
        return "kotlinx.serialization.internal.EnumSerializer<" + getDescriptor().getSerialName() + Typography.greater;
    }
}
