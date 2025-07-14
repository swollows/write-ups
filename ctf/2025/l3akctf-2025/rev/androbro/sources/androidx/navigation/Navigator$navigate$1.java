package androidx.navigation;

import androidx.navigation.Navigator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "Landroidx/navigation/NavBackStackEntry;", "D", "Landroidx/navigation/NavDestination;", "backStackEntry", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: Navigator.kt */
final class Navigator$navigate$1 extends Lambda implements Function1<NavBackStackEntry, NavBackStackEntry> {
    final /* synthetic */ NavOptions $navOptions;
    final /* synthetic */ Navigator.Extras $navigatorExtras;
    final /* synthetic */ Navigator<D> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    Navigator$navigate$1(Navigator<D> navigator, NavOptions navOptions, Navigator.Extras extras) {
        super(1);
        this.this$0 = navigator;
        this.$navOptions = navOptions;
        this.$navigatorExtras = extras;
    }

    public final NavBackStackEntry invoke(NavBackStackEntry backStackEntry) {
        NavDestination navigatedToDestination;
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        NavDestination destination = backStackEntry.getDestination();
        if (!(destination instanceof NavDestination)) {
            destination = null;
        }
        if (destination == null || (navigatedToDestination = this.this$0.navigate(destination, backStackEntry.getArguments(), this.$navOptions, this.$navigatorExtras)) == null) {
            return null;
        }
        if (Intrinsics.areEqual((Object) navigatedToDestination, (Object) destination)) {
            return backStackEntry;
        }
        return this.this$0.getState().createBackStackEntry(navigatedToDestination, navigatedToDestination.addInDefaultArgs(backStackEntry.getArguments()));
    }
}
