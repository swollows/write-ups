package androidx.navigation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Landroidx/navigation/NavOptionsBuilder;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavController.kt */
final class NavController$clearBackStackInternal$restored$1 extends Lambda implements Function1<NavOptionsBuilder, Unit> {
    public static final NavController$clearBackStackInternal$restored$1 INSTANCE = new NavController$clearBackStackInternal$restored$1();

    NavController$clearBackStackInternal$restored$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        invoke((NavOptionsBuilder) p1);
        return Unit.INSTANCE;
    }

    public final void invoke(NavOptionsBuilder $this$navOptions) {
        Intrinsics.checkNotNullParameter($this$navOptions, "$this$navOptions");
        $this$navOptions.setRestoreState(true);
    }
}
