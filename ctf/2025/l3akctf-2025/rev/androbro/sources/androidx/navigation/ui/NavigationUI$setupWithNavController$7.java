package androidx.navigation.ui;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import com.google.android.material.navigation.NavigationView;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\"\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016¨\u0006\n"}, d2 = {"androidx/navigation/ui/NavigationUI$setupWithNavController$7", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "onDestinationChanged", "", "controller", "Landroidx/navigation/NavController;", "destination", "Landroidx/navigation/NavDestination;", "arguments", "Landroid/os/Bundle;", "navigation-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavigationUI.kt */
public final class NavigationUI$setupWithNavController$7 implements NavController.OnDestinationChangedListener {
    final /* synthetic */ NavController $navController;
    final /* synthetic */ WeakReference<NavigationView> $weakReference;

    NavigationUI$setupWithNavController$7(WeakReference<NavigationView> $weakReference2, NavController $navController2) {
        this.$weakReference = $weakReference2;
        this.$navController = $navController2;
    }

    public void onDestinationChanged(NavController controller, NavDestination destination, Bundle arguments) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(destination, "destination");
        NavigationView view = (NavigationView) this.$weakReference.get();
        if (view == null) {
            this.$navController.removeOnDestinationChangedListener(this);
        } else if (!(destination instanceof FloatingWindow)) {
            Menu $this$forEach$iv = view.getMenu();
            Intrinsics.checkNotNullExpressionValue($this$forEach$iv, "view.menu");
            int size = $this$forEach$iv.size();
            for (int index$iv = 0; index$iv < size; index$iv++) {
                MenuItem item = $this$forEach$iv.getItem(index$iv);
                Intrinsics.checkExpressionValueIsNotNull(item, "getItem(index)");
                item.setChecked(NavigationUI.matchDestination$navigation_ui_release(destination, item.getItemId()));
            }
        }
    }
}
