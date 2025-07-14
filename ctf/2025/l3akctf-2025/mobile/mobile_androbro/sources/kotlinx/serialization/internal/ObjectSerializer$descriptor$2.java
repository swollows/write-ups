package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorsKt;
import kotlinx.serialization.descriptors.StructureKind;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "T", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* compiled from: ObjectSerializer.kt */
final class ObjectSerializer$descriptor$2 extends Lambda implements Function0<SerialDescriptor> {
    final /* synthetic */ String $serialName;
    final /* synthetic */ ObjectSerializer<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ObjectSerializer$descriptor$2(String str, ObjectSerializer<T> objectSerializer) {
        super(0);
        this.$serialName = str;
        this.this$0 = objectSerializer;
    }

    public final SerialDescriptor invoke() {
        final ObjectSerializer<T> objectSerializer = this.this$0;
        return SerialDescriptorsKt.buildSerialDescriptor(this.$serialName, StructureKind.OBJECT.INSTANCE, new SerialDescriptor[0], new Function1<ClassSerialDescriptorBuilder, Unit>() {
            public /* bridge */ /* synthetic */ Object invoke(Object p1) {
                invoke((ClassSerialDescriptorBuilder) p1);
                return Unit.INSTANCE;
            }

            public final void invoke(ClassSerialDescriptorBuilder $this$buildSerialDescriptor) {
                Intrinsics.checkNotNullParameter($this$buildSerialDescriptor, "$this$buildSerialDescriptor");
                $this$buildSerialDescriptor.setAnnotations(objectSerializer._annotations);
            }
        });
    }
}
