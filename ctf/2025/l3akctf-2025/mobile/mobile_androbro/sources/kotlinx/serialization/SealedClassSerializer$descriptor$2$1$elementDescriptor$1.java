package kotlinx.serialization;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "", "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* compiled from: SealedSerializer.kt */
final class SealedClassSerializer$descriptor$2$1$elementDescriptor$1 extends Lambda implements Function1<ClassSerialDescriptorBuilder, Unit> {
    final /* synthetic */ SealedClassSerializer<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SealedClassSerializer$descriptor$2$1$elementDescriptor$1(SealedClassSerializer<T> sealedClassSerializer) {
        super(1);
        this.this$0 = sealedClassSerializer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        invoke((ClassSerialDescriptorBuilder) p1);
        return Unit.INSTANCE;
    }

    public final void invoke(ClassSerialDescriptorBuilder $this$buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter($this$buildSerialDescriptor, "$this$buildSerialDescriptor");
        for (Map.Entry element$iv : this.this$0.serialName2Serializer.entrySet()) {
            ClassSerialDescriptorBuilder.element$default($this$buildSerialDescriptor, (String) element$iv.getKey(), ((KSerializer) element$iv.getValue()).getDescriptor(), (List) null, false, 12, (Object) null);
        }
    }
}
