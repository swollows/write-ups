package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "it", "Landroidx/navigation/NavDestination;", "invoke", "(Landroidx/navigation/NavDestination;)Ljava/lang/Integer;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavController.kt */
final class NavController$launchSingleTopInternal$childHierarchyId$1 extends Lambda implements Function1<NavDestination, Integer> {
    public static final NavController$launchSingleTopInternal$childHierarchyId$1 INSTANCE = new NavController$launchSingleTopInternal$childHierarchyId$1();

    NavController$launchSingleTopInternal$childHierarchyId$1() {
        super(1);
    }

    public final Integer invoke(NavDestination it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Integer.valueOf(it.getId());
    }
}
