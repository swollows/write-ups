package androidx.navigation;

import androidx.navigation.serialization.RouteSerializerKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "", "startDestination", "Landroidx/navigation/NavDestination;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavGraph.kt */
final class NavGraph$setStartDestination$2 extends Lambda implements Function1<NavDestination, String> {
    final /* synthetic */ T $startDestRoute;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavGraph$setStartDestination$2(T t) {
        super(1);
        this.$startDestRoute = t;
    }

    public final String invoke(NavDestination startDestination) {
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Map $this$mapValuesTo$iv$iv = startDestination.getArguments();
        Map destination$iv$iv = new LinkedHashMap(MapsKt.mapCapacity($this$mapValuesTo$iv$iv.size()));
        for (Object element$iv$iv$iv : $this$mapValuesTo$iv$iv.entrySet()) {
            destination$iv$iv.put(((Map.Entry) element$iv$iv$iv).getKey(), ((NavArgument) ((Map.Entry) element$iv$iv$iv).getValue()).getType());
        }
        return RouteSerializerKt.generateRouteWithArgs(this.$startDestRoute, destination$iv$iv);
    }
}
