package kotlinx.serialization;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "T", "", "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* compiled from: ContextualSerializer.kt */
final class ContextualSerializer$descriptor$1 extends Lambda implements Function1<ClassSerialDescriptorBuilder, Unit> {
    final /* synthetic */ ContextualSerializer<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ContextualSerializer$descriptor$1(ContextualSerializer<T> contextualSerializer) {
        super(1);
        this.this$0 = contextualSerializer;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        invoke((ClassSerialDescriptorBuilder) p1);
        return Unit.INSTANCE;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000d, code lost:
        r0 = r0.getDescriptor();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void invoke(kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder r2) {
        /*
            r1 = this;
            java.lang.String r0 = "$this$buildSerialDescriptor"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            kotlinx.serialization.ContextualSerializer<T> r0 = r1.this$0
            kotlinx.serialization.KSerializer r0 = r0.fallbackSerializer
            if (r0 == 0) goto L_0x0018
            kotlinx.serialization.descriptors.SerialDescriptor r0 = r0.getDescriptor()
            if (r0 == 0) goto L_0x0018
            java.util.List r0 = r0.getAnnotations()
            goto L_0x0019
        L_0x0018:
            r0 = 0
        L_0x0019:
            if (r0 != 0) goto L_0x001f
            java.util.List r0 = kotlin.collections.CollectionsKt.emptyList()
        L_0x001f:
            r2.setAnnotations(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.serialization.ContextualSerializer$descriptor$1.invoke(kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder):void");
    }
}
