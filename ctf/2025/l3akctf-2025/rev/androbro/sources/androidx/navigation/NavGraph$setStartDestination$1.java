package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", "T", "", "startDestination", "Landroidx/navigation/NavDestination;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
/* compiled from: NavGraph.kt */
public final class NavGraph$setStartDestination$1 extends Lambda implements Function1<NavDestination, String> {
    public static final NavGraph$setStartDestination$1 INSTANCE = new NavGraph$setStartDestination$1();

    public NavGraph$setStartDestination$1() {
        super(1);
    }

    public final String invoke(NavDestination startDestination) {
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        String route = startDestination.getRoute();
        Intrinsics.checkNotNull(route);
        return route;
    }
}
