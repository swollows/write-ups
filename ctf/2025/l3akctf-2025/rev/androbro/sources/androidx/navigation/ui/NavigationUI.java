package androidx.navigation.ui;

import android.os.Bundle;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.customview.widget.Openable;
import androidx.navigation.ActivityNavigator;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import androidx.navigation.NavGraph;
import androidx.navigation.NavOptions;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.profileinstaller.ProfileVerifier;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.navigation.NavigationBarView;
import com.google.android.material.navigation.NavigationView;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0016\u0010\u0005\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0007J\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\fH\u0007J \u0010\u0011\u001a\u00020\n2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\nH\u0007J\"\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\"\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007J\"\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J\"\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007J*\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0007J*\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\fH\u0007J \u0010\u0019\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\nH\u0007J\u0018\u0010\u0019\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\fH\u0007J \u0010\u0019\u001a\u00020\u00162\u0006\u0010 \u001a\u00020!2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\nH\u0007J\u001b\u0010\"\u001a\u00020\n*\u00020#2\b\b\u0001\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b&R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006'"}, d2 = {"Landroidx/navigation/ui/NavigationUI;", "", "()V", "TAG", "", "findBottomSheetBehavior", "Lcom/google/android/material/bottomsheet/BottomSheetBehavior;", "view", "Landroid/view/View;", "navigateUp", "", "navController", "Landroidx/navigation/NavController;", "openableLayout", "Landroidx/customview/widget/Openable;", "configuration", "Landroidx/navigation/ui/AppBarConfiguration;", "onNavDestinationSelected", "item", "Landroid/view/MenuItem;", "saveState", "setupActionBarWithNavController", "", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "setupWithNavController", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "collapsingToolbarLayout", "Lcom/google/android/material/appbar/CollapsingToolbarLayout;", "navigationBarView", "Lcom/google/android/material/navigation/NavigationBarView;", "navigationView", "Lcom/google/android/material/navigation/NavigationView;", "matchDestination", "Landroidx/navigation/NavDestination;", "destId", "", "matchDestination$navigation_ui_release", "navigation-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavigationUI.kt */
public final class NavigationUI {
    public static final NavigationUI INSTANCE = new NavigationUI();
    private static final String TAG = "NavigationUI";

    private NavigationUI() {
    }

    @JvmStatic
    public static final boolean onNavDestinationSelected(MenuItem item, NavController navController) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(navController, "navController");
        boolean z = true;
        NavOptions.Builder builder = new NavOptions.Builder().setLaunchSingleTop(true).setRestoreState(true);
        NavDestination currentDestination = navController.getCurrentDestination();
        Intrinsics.checkNotNull(currentDestination);
        NavGraph parent = currentDestination.getParent();
        Intrinsics.checkNotNull(parent);
        if (parent.findNode(item.getItemId()) instanceof ActivityNavigator.Destination) {
            builder.setEnterAnim(R.anim.nav_default_enter_anim).setExitAnim(R.anim.nav_default_exit_anim).setPopEnterAnim(R.anim.nav_default_pop_enter_anim).setPopExitAnim(R.anim.nav_default_pop_exit_anim);
        } else {
            builder.setEnterAnim(R.animator.nav_default_enter_anim).setExitAnim(R.animator.nav_default_exit_anim).setPopEnterAnim(R.animator.nav_default_pop_enter_anim).setPopExitAnim(R.animator.nav_default_pop_exit_anim);
        }
        if ((item.getOrder() & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
            builder.setPopUpTo(NavGraph.Companion.findStartDestination(navController.getGraph()).getId(), false, true);
        }
        try {
            navController.navigate(item.getItemId(), (Bundle) null, builder.build());
            NavDestination currentDestination2 = navController.getCurrentDestination();
            if (currentDestination2 == null || !matchDestination$navigation_ui_release(currentDestination2, item.getItemId())) {
                z = false;
            }
            return z;
        } catch (IllegalArgumentException e) {
            Log.i(TAG, "Ignoring onNavDestinationSelected for MenuItem " + NavDestination.Companion.getDisplayName(navController.getContext(), item.getItemId()) + " as it cannot be found from the current destination " + navController.getCurrentDestination(), e);
            return false;
        }
    }

    @JvmStatic
    public static final boolean onNavDestinationSelected(MenuItem item, NavController navController, boolean saveState) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(navController, "navController");
        if (!saveState) {
            boolean z = true;
            NavOptions.Builder builder = new NavOptions.Builder().setLaunchSingleTop(true);
            NavDestination currentDestination = navController.getCurrentDestination();
            Intrinsics.checkNotNull(currentDestination);
            NavGraph parent = currentDestination.getParent();
            Intrinsics.checkNotNull(parent);
            if (parent.findNode(item.getItemId()) instanceof ActivityNavigator.Destination) {
                builder.setEnterAnim(R.anim.nav_default_enter_anim).setExitAnim(R.anim.nav_default_exit_anim).setPopEnterAnim(R.anim.nav_default_pop_enter_anim).setPopExitAnim(R.anim.nav_default_pop_exit_anim);
            } else {
                builder.setEnterAnim(R.animator.nav_default_enter_anim).setExitAnim(R.animator.nav_default_exit_anim).setPopEnterAnim(R.animator.nav_default_pop_enter_anim).setPopExitAnim(R.animator.nav_default_pop_exit_anim);
            }
            if ((item.getOrder() & ProfileVerifier.CompilationStatus.RESULT_CODE_ERROR_CANT_WRITE_PROFILE_VERIFICATION_RESULT_CACHE_FILE) == 0) {
                NavOptions.Builder.setPopUpTo$default(builder, NavGraph.Companion.findStartDestination(navController.getGraph()).getId(), false, false, 4, (Object) null);
            }
            try {
                navController.navigate(item.getItemId(), (Bundle) null, builder.build());
                NavDestination currentDestination2 = navController.getCurrentDestination();
                if (currentDestination2 == null || !matchDestination$navigation_ui_release(currentDestination2, item.getItemId())) {
                    z = false;
                }
                return z;
            } catch (IllegalArgumentException e) {
                Log.i(TAG, "Ignoring onNavDestinationSelected for MenuItem " + NavDestination.Companion.getDisplayName(navController.getContext(), item.getItemId()) + " as it cannot be found from the current destination " + navController.getCurrentDestination(), e);
                return false;
            }
        } else {
            throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default".toString());
        }
    }

    @JvmStatic
    public static final boolean navigateUp(NavController navController, Openable openableLayout) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        return navigateUp(navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openableLayout).build());
    }

    @JvmStatic
    public static final boolean navigateUp(NavController navController, AppBarConfiguration configuration) {
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        Openable openableLayout = configuration.getOpenableLayout();
        NavDestination currentDestination = navController.getCurrentDestination();
        if (openableLayout != null && currentDestination != null && configuration.isTopLevelDestination(currentDestination)) {
            openableLayout.open();
            return true;
        } else if (navController.navigateUp()) {
            return true;
        } else {
            AppBarConfiguration.OnNavigateUpListener fallbackOnNavigateUpListener = configuration.getFallbackOnNavigateUpListener();
            if (fallbackOnNavigateUpListener != null) {
                return fallbackOnNavigateUpListener.onNavigateUp();
            }
            return false;
        }
    }

    @JvmStatic
    public static final void setupActionBarWithNavController(AppCompatActivity activity, NavController navController, Openable openableLayout) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(navController, "navController");
        setupActionBarWithNavController(activity, navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openableLayout).build());
    }

    public static /* synthetic */ void setupActionBarWithNavController$default(AppCompatActivity appCompatActivity, NavController navController, AppBarConfiguration appBarConfiguration, int i, Object obj) {
        if ((i & 4) != 0) {
            appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        }
        setupActionBarWithNavController(appCompatActivity, navController, appBarConfiguration);
    }

    @JvmStatic
    public static final void setupActionBarWithNavController(AppCompatActivity activity, NavController navController, AppBarConfiguration configuration) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        navController.addOnDestinationChangedListener(new ActionBarOnDestinationChangedListener(activity, configuration));
    }

    @JvmStatic
    public static final void setupActionBarWithNavController(AppCompatActivity activity, NavController navController) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(navController, "navController");
        setupActionBarWithNavController$default(activity, navController, (AppBarConfiguration) null, 4, (Object) null);
    }

    @JvmStatic
    public static final void setupWithNavController(Toolbar toolbar, NavController navController, Openable openableLayout) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        setupWithNavController(toolbar, navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openableLayout).build());
    }

    public static /* synthetic */ void setupWithNavController$default(Toolbar toolbar, NavController navController, AppBarConfiguration appBarConfiguration, int i, Object obj) {
        if ((i & 4) != 0) {
            appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        }
        setupWithNavController(toolbar, navController, appBarConfiguration);
    }

    @JvmStatic
    public static final void setupWithNavController(Toolbar toolbar, NavController navController, AppBarConfiguration configuration) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        navController.addOnDestinationChangedListener(new ToolbarOnDestinationChangedListener(toolbar, configuration));
        toolbar.setNavigationOnClickListener(new NavigationUI$$ExternalSyntheticLambda1(navController, configuration));
    }

    /* access modifiers changed from: private */
    public static final void setupWithNavController$lambda$1(NavController $navController, AppBarConfiguration $configuration, View it) {
        Intrinsics.checkNotNullParameter($navController, "$navController");
        Intrinsics.checkNotNullParameter($configuration, "$configuration");
        navigateUp($navController, $configuration);
    }

    @JvmStatic
    public static final void setupWithNavController(Toolbar toolbar, NavController navController) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        setupWithNavController$default(toolbar, navController, (AppBarConfiguration) null, 4, (Object) null);
    }

    @JvmStatic
    public static final void setupWithNavController(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController, Openable openableLayout) {
        Intrinsics.checkNotNullParameter(collapsingToolbarLayout, "collapsingToolbarLayout");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        setupWithNavController(collapsingToolbarLayout, toolbar, navController, new AppBarConfiguration.Builder(navController.getGraph()).setOpenableLayout(openableLayout).build());
    }

    public static /* synthetic */ void setupWithNavController$default(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController, AppBarConfiguration appBarConfiguration, int i, Object obj) {
        if ((i & 8) != 0) {
            appBarConfiguration = new AppBarConfiguration.Builder(navController.getGraph()).build();
        }
        setupWithNavController(collapsingToolbarLayout, toolbar, navController, appBarConfiguration);
    }

    @JvmStatic
    public static final void setupWithNavController(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController, AppBarConfiguration configuration) {
        Intrinsics.checkNotNullParameter(collapsingToolbarLayout, "collapsingToolbarLayout");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        navController.addOnDestinationChangedListener(new CollapsingToolbarOnDestinationChangedListener(collapsingToolbarLayout, toolbar, configuration));
        toolbar.setNavigationOnClickListener(new NavigationUI$$ExternalSyntheticLambda3(navController, configuration));
    }

    /* access modifiers changed from: private */
    public static final void setupWithNavController$lambda$2(NavController $navController, AppBarConfiguration $configuration, View it) {
        Intrinsics.checkNotNullParameter($navController, "$navController");
        Intrinsics.checkNotNullParameter($configuration, "$configuration");
        navigateUp($navController, $configuration);
    }

    @JvmStatic
    public static final void setupWithNavController(CollapsingToolbarLayout collapsingToolbarLayout, Toolbar toolbar, NavController navController) {
        Intrinsics.checkNotNullParameter(collapsingToolbarLayout, "collapsingToolbarLayout");
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        Intrinsics.checkNotNullParameter(navController, "navController");
        setupWithNavController$default(collapsingToolbarLayout, toolbar, navController, (AppBarConfiguration) null, 8, (Object) null);
    }

    @JvmStatic
    public static final void setupWithNavController(NavigationView navigationView, NavController navController) {
        Intrinsics.checkNotNullParameter(navigationView, "navigationView");
        Intrinsics.checkNotNullParameter(navController, "navController");
        navigationView.setNavigationItemSelectedListener(new NavigationUI$$ExternalSyntheticLambda5(navController, navigationView));
        navController.addOnDestinationChangedListener(new NavigationUI$setupWithNavController$4(new WeakReference(navigationView), navController));
    }

    /* access modifiers changed from: private */
    public static final boolean setupWithNavController$lambda$3(NavController $navController, NavigationView $navigationView, MenuItem item) {
        Intrinsics.checkNotNullParameter($navController, "$navController");
        Intrinsics.checkNotNullParameter($navigationView, "$navigationView");
        Intrinsics.checkNotNullParameter(item, "item");
        boolean handled = onNavDestinationSelected(item, $navController);
        if (handled) {
            ViewParent parent = $navigationView.getParent();
            if (parent instanceof Openable) {
                ((Openable) parent).close();
            } else {
                BottomSheetBehavior bottomSheetBehavior = findBottomSheetBehavior($navigationView);
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setState(5);
                }
            }
        }
        return handled;
    }

    @JvmStatic
    public static final void setupWithNavController(NavigationView navigationView, NavController navController, boolean saveState) {
        Intrinsics.checkNotNullParameter(navigationView, "navigationView");
        Intrinsics.checkNotNullParameter(navController, "navController");
        if (!saveState) {
            navigationView.setNavigationItemSelectedListener(new NavigationUI$$ExternalSyntheticLambda2(navController, saveState, navigationView));
            navController.addOnDestinationChangedListener(new NavigationUI$setupWithNavController$7(new WeakReference(navigationView), navController));
            return;
        }
        throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default".toString());
    }

    /* access modifiers changed from: private */
    public static final boolean setupWithNavController$lambda$5(NavController $navController, boolean $saveState, NavigationView $navigationView, MenuItem item) {
        Intrinsics.checkNotNullParameter($navController, "$navController");
        Intrinsics.checkNotNullParameter($navigationView, "$navigationView");
        Intrinsics.checkNotNullParameter(item, "item");
        boolean handled = onNavDestinationSelected(item, $navController, $saveState);
        if (handled) {
            ViewParent parent = $navigationView.getParent();
            if (parent instanceof Openable) {
                ((Openable) parent).close();
            } else {
                BottomSheetBehavior bottomSheetBehavior = findBottomSheetBehavior($navigationView);
                if (bottomSheetBehavior != null) {
                    bottomSheetBehavior.setState(5);
                }
            }
        }
        return handled;
    }

    @JvmStatic
    public static final BottomSheetBehavior<?> findBottomSheetBehavior(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        ViewGroup.LayoutParams params = view.getLayoutParams();
        if (!(params instanceof CoordinatorLayout.LayoutParams)) {
            ViewParent parent = view.getParent();
            if (parent instanceof View) {
                return findBottomSheetBehavior((View) parent);
            }
            return null;
        }
        CoordinatorLayout.Behavior behavior = ((CoordinatorLayout.LayoutParams) params).getBehavior();
        if (!(behavior instanceof BottomSheetBehavior)) {
            return null;
        }
        return (BottomSheetBehavior) behavior;
    }

    @JvmStatic
    public static final void setupWithNavController(NavigationBarView navigationBarView, NavController navController) {
        Intrinsics.checkNotNullParameter(navigationBarView, "navigationBarView");
        Intrinsics.checkNotNullParameter(navController, "navController");
        navigationBarView.setOnItemSelectedListener(new NavigationUI$$ExternalSyntheticLambda4(navController));
        navController.addOnDestinationChangedListener(new NavigationUI$setupWithNavController$9(new WeakReference(navigationBarView), navController));
    }

    /* access modifiers changed from: private */
    public static final boolean setupWithNavController$lambda$6(NavController $navController, MenuItem item) {
        Intrinsics.checkNotNullParameter($navController, "$navController");
        Intrinsics.checkNotNullParameter(item, "item");
        return onNavDestinationSelected(item, $navController);
    }

    @JvmStatic
    public static final void setupWithNavController(NavigationBarView navigationBarView, NavController navController, boolean saveState) {
        Intrinsics.checkNotNullParameter(navigationBarView, "navigationBarView");
        Intrinsics.checkNotNullParameter(navController, "navController");
        if (!saveState) {
            navigationBarView.setOnItemSelectedListener(new NavigationUI$$ExternalSyntheticLambda0(navController, saveState));
            navController.addOnDestinationChangedListener(new NavigationUI$setupWithNavController$12(new WeakReference(navigationBarView), navController));
            return;
        }
        throw new IllegalStateException("Leave the saveState parameter out entirely to use the non-experimental version of this API, which saves the state by default".toString());
    }

    /* access modifiers changed from: private */
    public static final boolean setupWithNavController$lambda$8(NavController $navController, boolean $saveState, MenuItem item) {
        Intrinsics.checkNotNullParameter($navController, "$navController");
        Intrinsics.checkNotNullParameter(item, "item");
        return onNavDestinationSelected(item, $navController, $saveState);
    }

    @JvmStatic
    public static final boolean matchDestination$navigation_ui_release(NavDestination $this$matchDestination, int destId) {
        boolean z;
        Intrinsics.checkNotNullParameter($this$matchDestination, "<this>");
        Iterator<NavDestination> it = NavDestination.Companion.getHierarchy($this$matchDestination).iterator();
        do {
            z = false;
            if (!it.hasNext()) {
                return false;
            }
            if (it.next().getId() == destId) {
                z = true;
                continue;
            }
        } while (!z);
        return true;
    }
}
