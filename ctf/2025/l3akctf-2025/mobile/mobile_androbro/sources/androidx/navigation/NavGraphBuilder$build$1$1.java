package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroidx/navigation/NavDestination;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavGraphBuilder.kt */
final class NavGraphBuilder$build$1$1 extends Lambda implements Function1<NavDestination, String> {
    public static final NavGraphBuilder$build$1$1 INSTANCE = new NavGraphBuilder$build$1$1();

    NavGraphBuilder$build$1$1() {
        super(1);
    }

    public final String invoke(NavDestination it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String route = it.getRoute();
        Intrinsics.checkNotNull(route);
        return route;
    }
}
