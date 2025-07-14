package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.Navigator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016J0\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\u0010\b\u001a\u0004\u0018\u00010\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\f\u001a\u00020\rH\u0016¨\u0006\u000e"}, d2 = {"androidx/navigation/NavDeepLinkBuilder$PermissiveNavigatorProvider$mDestNavigator$1", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavDestination;", "createDestination", "navigate", "destination", "args", "Landroid/os/Bundle;", "navOptions", "Landroidx/navigation/NavOptions;", "navigatorExtras", "Landroidx/navigation/Navigator$Extras;", "popBackStack", "", "navigation-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavDeepLinkBuilder.kt */
public final class NavDeepLinkBuilder$PermissiveNavigatorProvider$mDestNavigator$1 extends Navigator<NavDestination> {
    NavDeepLinkBuilder$PermissiveNavigatorProvider$mDestNavigator$1() {
    }

    public NavDestination createDestination() {
        return new NavDestination("permissive");
    }

    public NavDestination navigate(NavDestination destination, Bundle args, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        throw new IllegalStateException("navigate is not supported");
    }

    public boolean popBackStack() {
        throw new IllegalStateException("popBackStack is not supported");
    }
}
