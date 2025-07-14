package kotlinx.serialization;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.Typography;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.ContextAwareKt;
import kotlinx.serialization.descriptors.PolymorphicKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.SerialKind;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "T", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* compiled from: PolymorphicSerializer.kt */
final class PolymorphicSerializer$descriptor$2 extends Lambda implements Function0<SerialDescriptor> {
    final /* synthetic */ PolymorphicSerializer<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    PolymorphicSerializer$descriptor$2(PolymorphicSerializer<T> polymorphicSerializer) {
        super(0);
        this.this$0 = polymorphicSerializer;
    }

    public final SerialDescriptor invoke() {
        final PolymorphicSerializer<T> polymorphicSerializer = this.this$0;
        return ContextAwareKt.withContext(SerialDescriptorsKt.buildSerialDescriptor("kotlinx.serialization.Polymorphic", PolymorphicKind.OPEN.INSTANCE, new SerialDescriptor[0], new Function1<ClassSerialDescriptorBuilder, Unit>() {
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                invoke((ClassSerialDescriptorBuilder) p1);
                return Unit.INSTANCE;
            }

            public final void invoke(ClassSerialDescriptorBuilder $this$buildSerialDescriptor) {
                Intrinsics.checkNotNullParameter($this$buildSerialDescriptor, "$this$buildSerialDescriptor");
                ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, "type", BuiltinSerializersKt.serializer(StringCompanionObject.INSTANCE).getDescriptor(), (List) null, false, 12, (Object) null);
                ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, "value", SerialDescriptorsKt.buildSerialDescriptor$default("kotlinx.serialization.Polymorphic<" + polymorphicSerializer.getBaseClass().getSimpleName() + Typography.greater, SerialKind.CONTEXTUAL.INSTANCE, new SerialDescriptor[0], (Function1) null, 8, (Object) null), (List) null, false, 12, (Object) null);
                $this$buildSerialDescriptor.setAnnotations(polymorphicSerializer._annotations);
            }
        }), this.this$0.getBaseClass());
    }
}
