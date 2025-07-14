package androidx.navigation.fragment;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavigatorState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: FragmentNavigator.kt */
final class FragmentNavigator$attachClearViewModel$1 extends Lambda implements Function0<Unit> {
    final /* synthetic */ NavBackStackEntry $entry;
    final /* synthetic */ Fragment $fragment;
    final /* synthetic */ NavigatorState $state;
    final /* synthetic */ FragmentNavigator this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    FragmentNavigator$attachClearViewModel$1(NavBackStackEntry navBackStackEntry, NavigatorState navigatorState, FragmentNavigator fragmentNavigator, Fragment fragment) {
        super(0);
        this.$entry = navBackStackEntry;
        this.$state = navigatorState;
        this.this$0 = fragmentNavigator;
        this.$fragment = fragment;
    }

    public final void invoke() {
        NavBackStackEntry navBackStackEntry = this.$entry;
        NavigatorState navigatorState = this.$state;
        FragmentNavigator fragmentNavigator = this.this$0;
        Fragment fragment = this.$fragment;
        for (NavBackStackEntry entry : navigatorState.getTransitionsInProgress().getValue()) {
            if (fragmentNavigator.isLoggingEnabled(2)) {
                Log.v("FragmentNavigator", "Marking transition complete for entry " + entry + " due to fragment " + fragment + " viewmodel being cleared");
            }
            navigatorState.markTransitionComplete(entry);
        }
    }
}
