package androidx.navigation.ui;

import android.graphics.drawable.Drawable;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001c\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0001\u0010\u000b\u001a\u00020\fH\u0014J\u0012\u0010\r\u001a\u00020\b2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0014R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/navigation/ui/ActionBarOnDestinationChangedListener;", "Landroidx/navigation/ui/AbstractAppBarOnDestinationChangedListener;", "activity", "Landroidx/appcompat/app/AppCompatActivity;", "configuration", "Landroidx/navigation/ui/AppBarConfiguration;", "(Landroidx/appcompat/app/AppCompatActivity;Landroidx/navigation/ui/AppBarConfiguration;)V", "setNavigationIcon", "", "icon", "Landroid/graphics/drawable/Drawable;", "contentDescription", "", "setTitle", "title", "", "navigation-ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ActionBarOnDestinationChangedListener.kt */
public final class ActionBarOnDestinationChangedListener extends AbstractAppBarOnDestinationChangedListener {
    private final AppCompatActivity activity;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public ActionBarOnDestinationChangedListener(androidx.appcompat.app.AppCompatActivity r4, androidx.navigation.ui.AppBarConfiguration r5) {
        /*
            r3 = this;
            java.lang.String r0 = "activity"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "configuration"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.appcompat.app.ActionBarDrawerToggle$Delegate r0 = r4.getDrawerToggleDelegate()
            if (r0 == 0) goto L_0x0021
            android.content.Context r0 = r0.getActionBarThemedContext()
            java.lang.String r1 = "checkNotNull(activity.dr…  .actionBarThemedContext"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            r3.<init>(r0, r5)
            r3.activity = r4
            return
        L_0x0021:
            r0 = 0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = "Activity "
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.StringBuilder r1 = r1.append(r4)
            java.lang.String r2 = " does not have a DrawerToggleDelegate set"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r0 = r1.toString()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.ui.ActionBarOnDestinationChangedListener.<init>(androidx.appcompat.app.AppCompatActivity, androidx.navigation.ui.AppBarConfiguration):void");
    }

    /* access modifiers changed from: protected */
    public void setTitle(CharSequence title) {
        ActionBar actionBar = this.activity.getSupportActionBar();
        if (actionBar != null) {
            Intrinsics.checkNotNullExpressionValue(actionBar, "checkNotNull(activity.su…ctionBar()\"\n            }");
            actionBar.setTitle(title);
            return;
        }
        throw new IllegalStateException(("Activity " + this.activity + " does not have an ActionBar set via setSupportActionBar()").toString());
    }

    /* access modifiers changed from: protected */
    public void setNavigationIcon(Drawable icon, int contentDescription) {
        ActionBar actionBar = this.activity.getSupportActionBar();
        if (actionBar != null) {
            Intrinsics.checkNotNullExpressionValue(actionBar, "checkNotNull(activity.su…ctionBar()\"\n            }");
            actionBar.setDisplayHomeAsUpEnabled(icon != null);
            ActionBarDrawerToggle.Delegate delegate = this.activity.getDrawerToggleDelegate();
            if (delegate != null) {
                Intrinsics.checkNotNullExpressionValue(delegate, "checkNotNull(activity.dr…legate set\"\n            }");
                delegate.setActionBarUpIndicator(icon, contentDescription);
                return;
            }
            throw new IllegalStateException(("Activity " + this.activity + " does not have a DrawerToggleDelegate set").toString());
        }
        throw new IllegalStateException(("Activity " + this.activity + " does not have an ActionBar set via setSupportActionBar()").toString());
    }
}
