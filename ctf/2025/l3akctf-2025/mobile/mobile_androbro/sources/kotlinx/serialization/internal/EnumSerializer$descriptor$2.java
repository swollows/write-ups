package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "T", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* compiled from: Enums.kt */
final class EnumSerializer$descriptor$2 extends Lambda implements Function0<SerialDescriptor> {
    final /* synthetic */ String $serialName;
    final /* synthetic */ EnumSerializer<T> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    EnumSerializer$descriptor$2(EnumSerializer<T> enumSerializer, String str) {
        super(0);
        this.this$0 = enumSerializer;
        this.$serialName = str;
    }

    public final SerialDescriptor invoke() {
        SerialDescriptor access$getOverriddenDescriptor$p = this.this$0.overriddenDescriptor;
        return access$getOverriddenDescriptor$p == null ? this.this$0.createUnmarkedDescriptor(this.$serialName) : access$getOverriddenDescriptor$p;
    }
}
