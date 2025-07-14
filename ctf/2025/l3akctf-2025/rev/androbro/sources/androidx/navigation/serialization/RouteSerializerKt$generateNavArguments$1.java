package androidx.navigation.serialization;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: RouteSerializer.kt */
final class RouteSerializerKt$generateNavArguments$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ KSerializer<T> $this_generateNavArguments;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RouteSerializerKt$generateNavArguments$1(KSerializer<T> kSerializer) {
        super(0);
        this.$this_generateNavArguments = kSerializer;
    }

    public final void invoke() {
        throw new IllegalArgumentException("Cannot generate NavArguments for polymorphic serializer " + this.$this_generateNavArguments + ". Arguments can only be generated from concrete classes or objects.");
    }
}
