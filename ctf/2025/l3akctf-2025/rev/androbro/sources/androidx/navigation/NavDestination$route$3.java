package androidx.navigation;

import androidx.navigation.NavDeepLink;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/navigation/NavDeepLink;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavDestination.kt */
final class NavDestination$route$3 extends Lambda implements Function0<NavDeepLink> {
    final /* synthetic */ String $tempRoute;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavDestination$route$3(String str) {
        super(0);
        this.$tempRoute = str;
    }

    public final NavDeepLink invoke() {
        return new NavDeepLink.Builder().setUriPattern(this.$tempRoute).build();
    }
}
