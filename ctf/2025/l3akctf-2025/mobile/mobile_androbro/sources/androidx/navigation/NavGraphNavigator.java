package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.NavDestination;
import androidx.navigation.Navigator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\f\u001a\u00020\u0002H\u0016J$\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\t2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0002J*\u0010\r\u001a\u00020\u000e2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0016R\u001d\u0010\u0006\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u00078F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Landroidx/navigation/NavGraphNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/NavGraph;", "navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "(Landroidx/navigation/NavigatorProvider;)V", "backStack", "Lkotlinx/coroutines/flow/StateFlow;", "", "Landroidx/navigation/NavBackStackEntry;", "getBackStack", "()Lkotlinx/coroutines/flow/StateFlow;", "createDestination", "navigate", "", "entry", "navOptions", "Landroidx/navigation/NavOptions;", "navigatorExtras", "Landroidx/navigation/Navigator$Extras;", "entries", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Navigator.Name("navigation")
/* compiled from: NavGraphNavigator.kt */
public class NavGraphNavigator extends Navigator<NavGraph> {
    private final NavigatorProvider navigatorProvider;

    public NavGraphNavigator(NavigatorProvider navigatorProvider2) {
        Intrinsics.checkNotNullParameter(navigatorProvider2, "navigatorProvider");
        this.navigatorProvider = navigatorProvider2;
    }

    public final StateFlow<List<NavBackStackEntry>> getBackStack() {
        return getState().getBackStack();
    }

    public NavGraph createDestination() {
        return new NavGraph(this);
    }

    public void navigate(List<NavBackStackEntry> entries, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        for (NavBackStackEntry entry : entries) {
            navigate(entry, navOptions, navigatorExtras);
        }
    }

    private final void navigate(NavBackStackEntry entry, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        NavDestination startDestination;
        NavDestination destination = entry.getDestination();
        Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.NavGraph");
        NavGraph destination2 = (NavGraph) destination;
        Ref.ObjectRef args = new Ref.ObjectRef();
        args.element = entry.getArguments();
        int startId = destination2.getStartDestinationId();
        String startRoute = destination2.getStartDestinationRoute();
        if ((startId == 0 && startRoute == null) ? false : true) {
            if (startRoute != null) {
                startDestination = destination2.findNode(startRoute, false);
            } else {
                startDestination = destination2.getNodes().get(startId);
            }
            if (startDestination != null) {
                if (startRoute != null) {
                    if (!Intrinsics.areEqual((Object) startRoute, (Object) startDestination.getRoute())) {
                        NavDestination.DeepLinkMatch matchRoute = startDestination.matchRoute(startRoute);
                        Bundle matchingArgs = matchRoute != null ? matchRoute.getMatchingArgs() : null;
                        if (matchingArgs != null && !matchingArgs.isEmpty()) {
                            Bundle bundle = new Bundle();
                            bundle.putAll(matchingArgs);
                            if (((Bundle) args.element) != null) {
                                bundle.putAll((Bundle) args.element);
                            }
                            args.element = bundle;
                        }
                    }
                    if (!startDestination.getArguments().isEmpty()) {
                        List missingRequiredArgs = NavArgumentKt.missingRequiredArguments(startDestination.getArguments(), new NavGraphNavigator$navigate$missingRequiredArgs$1(args));
                        if (!missingRequiredArgs.isEmpty()) {
                            throw new IllegalArgumentException(("Cannot navigate to startDestination " + startDestination + ". Missing required arguments [" + missingRequiredArgs + ']').toString());
                        }
                    }
                }
                this.navigatorProvider.getNavigator(startDestination.getNavigatorName()).navigate(CollectionsKt.listOf(getState().createBackStackEntry(startDestination, startDestination.addInDefaultArgs((Bundle) args.element))), navOptions, navigatorExtras);
                return;
            }
            throw new IllegalArgumentException("navigation destination " + destination2.getStartDestDisplayName() + " is not a direct child of this NavGraph");
        }
        throw new IllegalStateException(("no start destination defined via app:startDestination for " + destination2.getDisplayName()).toString());
    }
}
