package androidx.navigation.serialization;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ContextAwareKt;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "T", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: RouteSerializer.kt */
final class RouteSerializerKt$generateRoutePattern$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ KSerializer<T> $this_generateRoutePattern;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RouteSerializerKt$generateRoutePattern$1(KSerializer<T> kSerializer) {
        super(0);
        this.$this_generateRoutePattern = kSerializer;
    }

    public final void invoke() {
        StringBuilder append = new StringBuilder().append("Cannot generate route pattern from polymorphic class ");
        KClass<?> capturedKClass = ContextAwareKt.getCapturedKClass(this.$this_generateRoutePattern.getDescriptor());
        throw new IllegalArgumentException(append.append(capturedKClass != null ? capturedKClass.getSimpleName() : null).append(". Routes can only be generated from concrete classes or objects.").toString());
    }
}
