package kotlinx.serialization.descriptors;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* compiled from: SerialDescriptors.kt */
final class SerialDescriptorImpl$toString$1 extends Lambda implements Function1<Integer, CharSequence> {
    final /* synthetic */ SerialDescriptorImpl this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SerialDescriptorImpl$toString$1(SerialDescriptorImpl serialDescriptorImpl) {
        super(1);
        this.this$0 = serialDescriptorImpl;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        return invoke(((Number) p1).intValue());
    }

    public final CharSequence invoke(int it) {
        return this.this$0.getElementName(it) + ": " + this.this$0.getElementDescriptor(it).getSerialName();
    }
}
