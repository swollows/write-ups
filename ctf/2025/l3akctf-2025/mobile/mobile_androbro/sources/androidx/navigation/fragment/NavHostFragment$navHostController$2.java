package androidx.navigation.fragment;

import android.content.Context;
import android.os.Bundle;
import androidx.core.os.BundleKt;
import androidx.lifecycle.ViewModelStore;
import androidx.navigation.NavHostController;
import kotlin.Metadata;
import kotlin.TuplesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroidx/navigation/NavHostController;", "invoke"}, k = 3, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavHostFragment.kt */
final class NavHostFragment$navHostController$2 extends Lambda implements Function0<NavHostController> {
    final /* synthetic */ NavHostFragment this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    NavHostFragment$navHostController$2(NavHostFragment navHostFragment) {
        super(0);
        this.this$0 = navHostFragment;
    }

    public final NavHostController invoke() {
        Context context = this.this$0.getContext();
        if (context != null) {
            Intrinsics.checkNotNullExpressionValue(context, "checkNotNull(context) {\n…s attached\"\n            }");
            NavHostController navHostController = new NavHostController(context);
            NavHostFragment navHostFragment = this.this$0;
            NavHostController $this$invoke_u24lambda_u245 = navHostController;
            $this$invoke_u24lambda_u245.setLifecycleOwner(navHostFragment);
            ViewModelStore viewModelStore = navHostFragment.getViewModelStore();
            Intrinsics.checkNotNullExpressionValue(viewModelStore, "viewModelStore");
            $this$invoke_u24lambda_u245.setViewModelStore(viewModelStore);
            navHostFragment.onCreateNavHostController($this$invoke_u24lambda_u245);
            Bundle it = navHostFragment.getSavedStateRegistry().consumeRestoredStateForKey("android-support-nav:fragment:navControllerState");
            if (it != null) {
                $this$invoke_u24lambda_u245.restoreState(it);
            }
            navHostFragment.getSavedStateRegistry().registerSavedStateProvider("android-support-nav:fragment:navControllerState", new NavHostFragment$navHostController$2$$ExternalSyntheticLambda0($this$invoke_u24lambda_u245));
            Bundle bundle = navHostFragment.getSavedStateRegistry().consumeRestoredStateForKey(NavHostFragment.KEY_GRAPH_ID);
            if (bundle != null) {
                navHostFragment.graphId = bundle.getInt(NavHostFragment.KEY_GRAPH_ID);
            }
            navHostFragment.getSavedStateRegistry().registerSavedStateProvider(NavHostFragment.KEY_GRAPH_ID, new NavHostFragment$navHostController$2$$ExternalSyntheticLambda1(navHostFragment));
            if (navHostFragment.graphId != 0) {
                $this$invoke_u24lambda_u245.setGraph(navHostFragment.graphId);
            } else {
                Bundle args = navHostFragment.getArguments();
                int graphId = args != null ? args.getInt(NavHostFragment.KEY_GRAPH_ID) : 0;
                Bundle startDestinationArgs = args != null ? args.getBundle(NavHostFragment.KEY_START_DESTINATION_ARGS) : null;
                if (graphId != 0) {
                    $this$invoke_u24lambda_u245.setGraph(graphId, startDestinationArgs);
                }
            }
            return navHostController;
        }
        throw new IllegalStateException("NavController cannot be created before the fragment is attached".toString());
    }

    /* access modifiers changed from: private */
    public static final Bundle invoke$lambda$5$lambda$2(NavHostController $this_apply) {
        Intrinsics.checkNotNullParameter($this_apply, "$this_apply");
        Bundle saveState = $this_apply.saveState();
        if (saveState != null) {
            return saveState;
        }
        Bundle bundle = Bundle.EMPTY;
        Intrinsics.checkNotNullExpressionValue(bundle, "EMPTY");
        return bundle;
    }

    /* access modifiers changed from: private */
    public static final Bundle invoke$lambda$5$lambda$4(NavHostFragment this$02) {
        Intrinsics.checkNotNullParameter(this$02, "this$0");
        if (this$02.graphId != 0) {
            return BundleKt.bundleOf(TuplesKt.to(NavHostFragment.KEY_GRAPH_ID, Integer.valueOf(this$02.graphId)));
        }
        Bundle bundle = Bundle.EMPTY;
        Intrinsics.checkNotNullExpressionValue(bundle, "{\n                    Bu…e.EMPTY\n                }");
        return bundle;
    }
}
