package androidx.navigation.fragment;

import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.navigation.NavBackStackEntry;
import java.util.Collection;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "owner", "Landroidx/lifecycle/LifecycleOwner;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: FragmentNavigator.kt */
final class FragmentNavigator$attachObservers$1 extends Lambda implements Function1<LifecycleOwner, Unit> {
    final /* synthetic */ NavBackStackEntry $entry;
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ FragmentNavigator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FragmentNavigator$attachObservers$1(FragmentNavigator fragmentNavigator, Fragment fragment, NavBackStackEntry navBackStackEntry) {
        super(1);
        this.this$0 = fragmentNavigator;
        this.$fragment = fragment;
        this.$entry = navBackStackEntry;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        invoke((LifecycleOwner) p1);
        return Unit.INSTANCE;
    }

    public final void invoke(LifecycleOwner owner) {
        Iterable $this$any$iv = this.this$0.getPendingOps$navigation_fragment_release();
        Fragment fragment = this.$fragment;
        boolean z = false;
        if (!($this$any$iv instanceof Collection) || !((Collection) $this$any$iv).isEmpty()) {
            Iterator it = $this$any$iv.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (Intrinsics.areEqual(((Pair) it.next()).getFirst(), (Object) fragment.getTag())) {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        boolean isPending = z;
        if (owner != null && !isPending) {
            Lifecycle viewLifecycle = this.$fragment.getViewLifecycleOwner().getLifecycle();
            if (viewLifecycle.getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                viewLifecycle.addObserver((LifecycleObserver) this.this$0.fragmentViewObserver.invoke(this.$entry));
            }
        }
    }
}
