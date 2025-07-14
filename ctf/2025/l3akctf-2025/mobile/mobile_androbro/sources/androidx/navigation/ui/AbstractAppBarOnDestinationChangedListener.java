package androidx.navigation.ui;

import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import androidx.appcompat.graphics.drawable.DrawerArrowDrawable;
import androidx.customview.widget.Openable;
import androidx.navigation.FloatingWindow;
import androidx.navigation.NavController;
import androidx.navigation.NavDestination;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\b \u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\"\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\u0010\u0010\u0017\u001a\u00020\u00102\u0006\u0010\u0018\u001a\u00020\u0019H\u0003J\u001c\u0010\u001a\u001a\u00020\u00102\b\u0010\u001b\u001a\u0004\u0018\u00010\u001c2\b\b\u0001\u0010\u001d\u001a\u00020\u001eH$J\u0012\u0010\u001f\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010!H$R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000b\u001a\u0012\u0012\f\u0012\n \u000e*\u0004\u0018\u00010\r0\r\u0018\u00010\fX\u0004¢\u0006\u0002\n\u0000¨\u0006\""}, d2 = {"Landroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener;", "Landroidx/navigation/NavController$OnDestinationChangedListener;", "context", "Landroid/content/Context;", "configuration", "Landroidx/navigation/ui/AppBarConfiguration;", "(Landroid/content/Context;Landroidx/navigation/ui/AppBarConfiguration;)V", "animator", "Landroid/animation/ValueAnimator;", "arrowDrawable", "Landroidx/appcompat/graphics/drawable/DrawerArrowDrawable;", "openableLayoutWeakReference", "Ljava/lang/ref/WeakReference;", "Landroidx/customview/widget/Openable;", "kotlin.jvm.PlatformType", "onDestinationChanged", "", "controller", "Landroidx/navigation/NavController;", "destination", "Landroidx/navigation/NavDestination;", "arguments", "Landroid/os/Bundle;", "setActionBarUpIndicator", "showAsDrawerIndicator", "", "setNavigationIcon", "icon", "Landroid/graphics/drawable/Drawable;", "contentDescription", "", "setTitle", "title", "", "navigation-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: AbstractAppBarOnDestinationChangedListener.kt */
public abstract class AbstractAppBarOnDestinationChangedListener implements NavController.OnDestinationChangedListener {
    private ValueAnimator animator;
    private DrawerArrowDrawable arrowDrawable;
    private final AppBarConfiguration configuration;
    private final Context context;
    private final WeakReference<Openable> openableLayoutWeakReference;

    /* access modifiers changed from: protected */
    public abstract void setNavigationIcon(Drawable drawable, int i);

    /* access modifiers changed from: protected */
    public abstract void setTitle(CharSequence charSequence);

    public AbstractAppBarOnDestinationChangedListener(Context context2, AppBarConfiguration configuration2) {
        WeakReference<Openable> weakReference;
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(configuration2, "configuration");
        this.context = context2;
        this.configuration = configuration2;
        Openable $this$openableLayoutWeakReference_u24lambda_u240 = this.configuration.getOpenableLayout();
        if ($this$openableLayoutWeakReference_u24lambda_u240 != null) {
            weakReference = new WeakReference<>($this$openableLayoutWeakReference_u24lambda_u240);
        } else {
            weakReference = null;
        }
        this.openableLayoutWeakReference = weakReference;
    }

    public void onDestinationChanged(NavController controller, NavDestination destination, Bundle arguments) {
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(destination, "destination");
        if (!(destination instanceof FloatingWindow)) {
            WeakReference<Openable> weakReference = this.openableLayoutWeakReference;
            Openable openableLayout = weakReference != null ? (Openable) weakReference.get() : null;
            if (this.openableLayoutWeakReference == null || openableLayout != null) {
                String label = destination.fillInLabel(this.context, arguments);
                if (label != null) {
                    setTitle(label);
                }
                boolean isTopLevelDestination = this.configuration.isTopLevelDestination(destination);
                boolean z = false;
                if (openableLayout != null || !isTopLevelDestination) {
                    if (openableLayout != null && isTopLevelDestination) {
                        z = true;
                    }
                    setActionBarUpIndicator(z);
                    return;
                }
                setNavigationIcon((Drawable) null, 0);
                return;
            }
            controller.removeOnDestinationChangedListener(this);
        }
    }

    private final void setActionBarUpIndicator(boolean showAsDrawerIndicator) {
        Pair pair;
        int i;
        DrawerArrowDrawable $this$setActionBarUpIndicator_u24lambda_u241 = this.arrowDrawable;
        if ($this$setActionBarUpIndicator_u24lambda_u241 == null || (pair = TuplesKt.to($this$setActionBarUpIndicator_u24lambda_u241, true)) == null) {
            DrawerArrowDrawable it = new DrawerArrowDrawable(this.context);
            this.arrowDrawable = it;
            pair = TuplesKt.to(it, false);
        }
        DrawerArrowDrawable arrow = (DrawerArrowDrawable) pair.component1();
        boolean animate = ((Boolean) pair.component2()).booleanValue();
        Drawable drawable = arrow;
        if (showAsDrawerIndicator) {
            i = R.string.nav_app_bar_open_drawer_description;
        } else {
            i = R.string.nav_app_bar_navigate_up_description;
        }
        setNavigationIcon(drawable, i);
        float endValue = showAsDrawerIndicator ? 0.0f : 1.0f;
        if (animate) {
            float startValue = arrow.getProgress();
            ValueAnimator valueAnimator = this.animator;
            if (valueAnimator != null) {
                valueAnimator.cancel();
            }
            this.animator = ObjectAnimator.ofFloat(arrow, "progress", new float[]{startValue, endValue});
            ValueAnimator valueAnimator2 = this.animator;
            Intrinsics.checkNotNull(valueAnimator2, "null cannot be cast to non-null type android.animation.ObjectAnimator");
            ((ObjectAnimator) valueAnimator2).start();
            return;
        }
        arrow.setProgress(endValue);
    }
}
