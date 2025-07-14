package androidx.navigation;

import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.sequences.Sequence;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/navigation/NavOptionsBuilder;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavController.kt */
final class NavController$handleDeepLink$2 extends Lambda implements Function1<NavOptionsBuilder, Unit> {
    final /* synthetic */ NavDestination $node;
    final /* synthetic */ NavController this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavController$handleDeepLink$2(NavDestination navDestination, NavController navController) {
        super(1);
        this.$node = navDestination;
        this.this$0 = navController;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        invoke((NavOptionsBuilder) p1);
        return Unit.INSTANCE;
    }

    public final void invoke(NavOptionsBuilder $this$navOptions) {
        Sequence $this$none$iv;
        Intrinsics.checkNotNullParameter($this$navOptions, "$this$navOptions");
        $this$navOptions.anim(AnonymousClass1.INSTANCE);
        boolean changingGraphs = false;
        if (this.$node instanceof NavGraph) {
            Sequence $this$none$iv2 = NavDestination.Companion.getHierarchy(this.$node);
            NavController navController = this.this$0;
            Iterator<NavDestination> it = $this$none$iv2.iterator();
            while (true) {
                if (!it.hasNext()) {
                    $this$none$iv = 1;
                    break;
                }
                NavDestination it2 = it.next();
                NavDestination currentDestination = navController.getCurrentDestination();
                if (Intrinsics.areEqual((Object) it2, (Object) currentDestination != null ? currentDestination.getParent() : null)) {
                    $this$none$iv = null;
                    break;
                }
            }
            if ($this$none$iv != null) {
                changingGraphs = true;
            }
        }
        if (changingGraphs && NavController.deepLinkSaveState) {
            $this$navOptions.popUpTo(NavGraph.Companion.findStartDestination(this.this$0.getGraph()).getId(), (Function1<? super PopUpToBuilder, Unit>) AnonymousClass2.INSTANCE);
        }
    }
}
