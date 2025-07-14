package androidx.navigation;

import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "destination", "Landroidx/navigation/NavDestination;", "invoke", "(Landroidx/navigation/NavDestination;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavController.kt */
final class NavController$executePopOperations$6 extends Lambda implements Function1<NavDestination, Boolean> {
    final /* synthetic */ NavController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavController$executePopOperations$6(NavController navController) {
        super(1);
        this.this$0 = navController;
    }

    public final Boolean invoke(NavDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return Boolean.valueOf(!this.this$0.backStackMap.containsKey(Integer.valueOf(destination.getId())));
    }
}
