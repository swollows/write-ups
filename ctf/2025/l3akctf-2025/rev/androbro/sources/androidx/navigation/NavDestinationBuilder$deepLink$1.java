package androidx.navigation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003\"\n\b\u0001\u0010\u0004 \u0001*\u00020\u0005*\u00020\u0006H\n¢\u0006\u0002\b\u0007"}, d2 = {"<anonymous>", "", "T", "", "D", "Landroidx/navigation/NavDestination;", "Landroidx/navigation/NavDeepLinkDslBuilder;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 176)
/* compiled from: NavDestinationBuilder.kt */
public final class NavDestinationBuilder$deepLink$1 extends Lambda implements Function1<NavDeepLinkDslBuilder, Unit> {
    public static final NavDestinationBuilder$deepLink$1 INSTANCE = new NavDestinationBuilder$deepLink$1();

    public NavDestinationBuilder$deepLink$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        invoke((NavDeepLinkDslBuilder) p1);
        return Unit.INSTANCE;
    }

    public final void invoke(NavDeepLinkDslBuilder $this$deepLink) {
        Intrinsics.checkNotNullParameter($this$deepLink, "$this$deepLink");
    }
}
