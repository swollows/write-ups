package androidx.navigation.serialization;

import androidx.navigation.NavType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u000e\u0010\u0007\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\t0\bH\n¢\u0006\u0002\b\n"}, d2 = {"<anonymous>", "", "T", "index", "", "argName", "", "navType", "Landroidx/navigation/NavType;", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: RouteSerializer.kt */
final class RouteSerializerKt$generateRoutePattern$2 extends Lambda implements Function3<Integer, String, NavType<Object>, Unit> {
    final /* synthetic */ RouteBuilder<T> $builder;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    RouteSerializerKt$generateRoutePattern$2(RouteBuilder<T> routeBuilder) {
        super(3);
        this.$builder = routeBuilder;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1, Object p2, Object p3) {
        invoke(((Number) p1).intValue(), (String) p2, (NavType<Object>) (NavType) p3);
        return Unit.INSTANCE;
    }

    public final void invoke(int index, String argName, NavType<Object> navType) {
        Intrinsics.checkNotNullParameter(argName, "argName");
        Intrinsics.checkNotNullParameter(navType, "navType");
        this.$builder.appendPattern(index, argName, navType);
    }
}
