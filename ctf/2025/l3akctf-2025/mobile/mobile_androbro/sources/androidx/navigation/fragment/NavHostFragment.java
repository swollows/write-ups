package androidx.navigation.fragment;

import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavController;
import androidx.navigation.NavHost;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.R;
import androidx.navigation.fragment.FragmentNavigator;
import kotlin.Deprecated;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0016\u0018\u0000 02\u00020\u00012\u00020\u0002:\u00010B\u0005¢\u0006\u0002\u0010\u0003J\u0010\u0010\u0017\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00190\u0018H\u0015J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0017J\u0012\u0010\u001e\u001a\u00020\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0017J\u0010\u0010!\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\fH\u0015J\u0010\u0010\"\u001a\u00020\u001b2\u0006\u0010\u000f\u001a\u00020\u0010H\u0015J&\u0010#\u001a\u0004\u0018\u00010\u00162\u0006\u0010$\u001a\u00020%2\b\u0010&\u001a\u0004\u0018\u00010'2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016J\b\u0010(\u001a\u00020\u001bH\u0016J\"\u0010)\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010*\u001a\u00020+2\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0017J\u0010\u0010,\u001a\u00020\u001b2\u0006\u0010-\u001a\u00020 H\u0017J\u001a\u0010.\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\u00162\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058BX\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u000e\u0010\b\u001a\u00020\tX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u000b\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u000f\u001a\u00020\u00108@X\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0016X\u000e¢\u0006\u0002\n\u0000¨\u00061"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/Fragment;", "Landroidx/navigation/NavHost;", "()V", "containerId", "", "getContainerId", "()I", "defaultNavHost", "", "graphId", "navController", "Landroidx/navigation/NavController;", "getNavController", "()Landroidx/navigation/NavController;", "navHostController", "Landroidx/navigation/NavHostController;", "getNavHostController$navigation_fragment_release", "()Landroidx/navigation/NavHostController;", "navHostController$delegate", "Lkotlin/Lazy;", "viewParent", "Landroid/view/View;", "createFragmentNavigator", "Landroidx/navigation/Navigator;", "Landroidx/navigation/fragment/FragmentNavigator$Destination;", "onAttach", "", "context", "Landroid/content/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateNavController", "onCreateNavHostController", "onCreateView", "inflater", "Landroid/view/LayoutInflater;", "container", "Landroid/view/ViewGroup;", "onDestroyView", "onInflate", "attrs", "Landroid/util/AttributeSet;", "onSaveInstanceState", "outState", "onViewCreated", "view", "Companion", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavHostFragment.kt */
public class NavHostFragment extends Fragment implements NavHost {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String KEY_DEFAULT_NAV_HOST = "android-support-nav:fragment:defaultHost";
    public static final String KEY_GRAPH_ID = "android-support-nav:fragment:graphId";
    private static final String KEY_NAV_CONTROLLER_STATE = "android-support-nav:fragment:navControllerState";
    public static final String KEY_START_DESTINATION_ARGS = "android-support-nav:fragment:startDestinationArgs";
    private boolean defaultNavHost;
    /* access modifiers changed from: private */
    public int graphId;
    private final Lazy navHostController$delegate = LazyKt.lazy(new NavHostFragment$navHostController$2(this));
    private View viewParent;

    public final NavHostController getNavHostController$navigation_fragment_release() {
        return (NavHostController) this.navHostController$delegate.getValue();
    }

    public final NavController getNavController() {
        return getNavHostController$navigation_fragment_release();
    }

    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        if (this.defaultNavHost) {
            getParentFragmentManager().beginTransaction().setPrimaryNavigationFragment(this).commit();
        }
    }

    public void onCreate(Bundle savedInstanceState) {
        getNavHostController$navigation_fragment_release();
        if (savedInstanceState != null && savedInstanceState.getBoolean(KEY_DEFAULT_NAV_HOST, false)) {
            this.defaultNavHost = true;
            getParentFragmentManager().beginTransaction().setPrimaryNavigationFragment(this).commit();
        }
        super.onCreate(savedInstanceState);
    }

    /* access modifiers changed from: protected */
    public void onCreateNavHostController(NavHostController navHostController) {
        Intrinsics.checkNotNullParameter(navHostController, "navHostController");
        onCreateNavController(navHostController);
    }

    /* access modifiers changed from: protected */
    @Deprecated(message = "Override {@link #onCreateNavHostController(NavHostController)} to gain\n      access to the full {@link NavHostController} that is created by this NavHostFragment.")
    public void onCreateNavController(NavController navController) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        NavigatorProvider $this$plusAssign$iv = navController.getNavigatorProvider();
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        $this$plusAssign$iv.addNavigator(new DialogFragmentNavigator(requireContext, childFragmentManager));
        navController.getNavigatorProvider().addNavigator(createFragmentNavigator());
    }

    /* access modifiers changed from: protected */
    @Deprecated(message = "Use {@link #onCreateNavController(NavController)}")
    public Navigator<? extends FragmentNavigator.Destination> createFragmentNavigator() {
        Context requireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(requireContext, "requireContext()");
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "childFragmentManager");
        return new FragmentNavigator(requireContext, childFragmentManager, getContainerId());
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        Context context = inflater.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "inflater.context");
        FragmentContainerView containerView = new FragmentContainerView(context);
        containerView.setId(getContainerId());
        return containerView;
    }

    private final int getContainerId() {
        int id = getId();
        if (id == 0 || id == -1) {
            return R.id.nav_host_fragment_container;
        }
        return id;
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        if (view instanceof ViewGroup) {
            Navigation.setViewNavController(view, getNavHostController$navigation_fragment_release());
            if (view.getParent() != null) {
                ViewParent parent = view.getParent();
                Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.View");
                this.viewParent = (View) parent;
                View view2 = this.viewParent;
                Intrinsics.checkNotNull(view2);
                if (view2.getId() == getId()) {
                    View view3 = this.viewParent;
                    Intrinsics.checkNotNull(view3);
                    Navigation.setViewNavController(view3, getNavHostController$navigation_fragment_release());
                    return;
                }
                return;
            }
            return;
        }
        throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
    }

    public void onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(attrs, "attrs");
        super.onInflate(context, attrs, savedInstanceState);
        TypedArray $this$use$iv = context.obtainStyledAttributes(attrs, R.styleable.NavHost);
        Intrinsics.checkNotNullExpressionValue($this$use$iv, "context.obtainStyledAttr…tion.R.styleable.NavHost)");
        int graphId2 = $this$use$iv.getResourceId(R.styleable.NavHost_navGraph, 0);
        if (graphId2 != 0) {
            this.graphId = graphId2;
        }
        Unit unit = Unit.INSTANCE;
        $this$use$iv.recycle();
        TypedArray $this$use$iv2 = context.obtainStyledAttributes(attrs, R.styleable.NavHostFragment);
        Intrinsics.checkNotNullExpressionValue($this$use$iv2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if ($this$use$iv2.getBoolean(R.styleable.NavHostFragment_defaultNavHost, false)) {
            this.defaultNavHost = true;
        }
        Unit unit2 = Unit.INSTANCE;
        $this$use$iv2.recycle();
    }

    public void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        if (this.defaultNavHost) {
            outState.putBoolean(KEY_DEFAULT_NAV_HOST, true);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        View it = this.viewParent;
        if (it != null && Navigation.findNavController(it) == getNavHostController$navigation_fragment_release()) {
            Navigation.setViewNavController(it, (NavController) null);
        }
        this.viewParent = null;
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u001e\u0010\b\u001a\u00020\t2\b\b\u0001\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0007J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0005\u001a\u00020\u00048\u0006XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\u00048\u0006XT¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment$Companion;", "", "()V", "KEY_DEFAULT_NAV_HOST", "", "KEY_GRAPH_ID", "KEY_NAV_CONTROLLER_STATE", "KEY_START_DESTINATION_ARGS", "create", "Landroidx/navigation/fragment/NavHostFragment;", "graphResId", "", "startDestinationArgs", "Landroid/os/Bundle;", "findNavController", "Landroidx/navigation/NavController;", "fragment", "Landroidx/fragment/app/Fragment;", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: NavHostFragment.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @JvmStatic
        public final NavController findNavController(Fragment fragment) {
            Dialog dialog;
            Window window;
            Intrinsics.checkNotNullParameter(fragment, "fragment");
            for (Fragment findFragment = fragment; findFragment != null; findFragment = findFragment.getParentFragment()) {
                if (findFragment instanceof NavHostFragment) {
                    return ((NavHostFragment) findFragment).getNavHostController$navigation_fragment_release();
                }
                Fragment primaryNavFragment = findFragment.getParentFragmentManager().getPrimaryNavigationFragment();
                if (primaryNavFragment instanceof NavHostFragment) {
                    return ((NavHostFragment) primaryNavFragment).getNavHostController$navigation_fragment_release();
                }
            }
            View view = fragment.getView();
            if (view != null) {
                return Navigation.findNavController(view);
            }
            View view2 = null;
            DialogFragment dialogFragment = fragment instanceof DialogFragment ? (DialogFragment) fragment : null;
            if (!(dialogFragment == null || (dialog = dialogFragment.getDialog()) == null || (window = dialog.getWindow()) == null)) {
                view2 = window.getDecorView();
            }
            View dialogDecorView = view2;
            if (dialogDecorView != null) {
                return Navigation.findNavController(dialogDecorView);
            }
            throw new IllegalStateException("Fragment " + fragment + " does not have a NavController set");
        }

        public static /* synthetic */ NavHostFragment create$default(Companion companion, int i, Bundle bundle, int i2, Object obj) {
            if ((i2 & 2) != 0) {
                bundle = null;
            }
            return companion.create(i, bundle);
        }

        @JvmStatic
        public final NavHostFragment create(int graphResId, Bundle startDestinationArgs) {
            Bundle b = null;
            if (graphResId != 0) {
                b = new Bundle();
                b.putInt(NavHostFragment.KEY_GRAPH_ID, graphResId);
            }
            if (startDestinationArgs != null) {
                if (b == null) {
                    b = new Bundle();
                }
                b.putBundle(NavHostFragment.KEY_START_DESTINATION_ARGS, startDestinationArgs);
            }
            NavHostFragment result = new NavHostFragment();
            if (b != null) {
                result.setArguments(b);
            }
            return result;
        }

        @JvmStatic
        public final NavHostFragment create(int graphResId) {
            return create$default(this, graphResId, (Bundle) null, 2, (Object) null);
        }
    }

    @JvmStatic
    public static final NavController findNavController(Fragment fragment) {
        return Companion.findNavController(fragment);
    }

    @JvmStatic
    public static final NavHostFragment create(int graphResId) {
        return Companion.create(graphResId);
    }

    @JvmStatic
    public static final NavHostFragment create(int graphResId, Bundle startDestinationArgs) {
        return Companion.create(graphResId, startDestinationArgs);
    }
}
