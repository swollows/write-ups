package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.NavDestination;
import java.lang.annotation.ElementType;
import java.lang.annotation.RetentionPolicy;
import java.util.List;
import kotlin.Metadata;
import kotlin.annotation.AnnotationRetention;
import kotlin.annotation.AnnotationTarget;
import kotlin.annotation.Retention;
import kotlin.annotation.Target;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\b&\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u00020\u0003:\u0002%&B\u0005¢\u0006\u0002\u0010\u0004J\r\u0010\u000e\u001a\u00028\u0000H&¢\u0006\u0002\u0010\u000fJ5\u0010\u0010\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0011\u001a\u00028\u00002\b\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0002\u0010\u0018J*\u0010\u0010\u001a\u00020\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u001c0\u001b2\b\u0010\u0014\u001a\u0004\u0018\u00010\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0010\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u000b\u001a\u00020\u0006H\u0017J\u0010\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001f\u001a\u00020\u001cH\u0016J\u0010\u0010 \u001a\u00020\u00192\u0006\u0010!\u001a\u00020\u0013H\u0016J\n\u0010\"\u001a\u0004\u0018\u00010\u0013H\u0016J\b\u0010#\u001a\u00020\bH\u0016J\u0018\u0010#\u001a\u00020\u00192\u0006\u0010$\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020\bH\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@BX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00068DX\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\r¨\u0006'"}, d2 = {"Landroidx/navigation/Navigator;", "D", "Landroidx/navigation/NavDestination;", "", "()V", "_state", "Landroidx/navigation/NavigatorState;", "<set-?>", "", "isAttached", "()Z", "state", "getState", "()Landroidx/navigation/NavigatorState;", "createDestination", "()Landroidx/navigation/NavDestination;", "navigate", "destination", "args", "Landroid/os/Bundle;", "navOptions", "Landroidx/navigation/NavOptions;", "navigatorExtras", "Landroidx/navigation/Navigator$Extras;", "(Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/navigation/NavOptions;Landroidx/navigation/Navigator$Extras;)Landroidx/navigation/NavDestination;", "", "entries", "", "Landroidx/navigation/NavBackStackEntry;", "onAttach", "onLaunchSingleTop", "backStackEntry", "onRestoreState", "savedState", "onSaveState", "popBackStack", "popUpTo", "Extras", "Name", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: Navigator.kt */
public abstract class Navigator<D extends NavDestination> {
    private NavigatorState _state;
    private boolean isAttached;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001ø\u0001\u0000\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0002À\u0006\u0001"}, d2 = {"Landroidx/navigation/Navigator$Extras;", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: Navigator.kt */
    public interface Extras {
    }

    @Target(allowedTargets = {AnnotationTarget.ANNOTATION_CLASS, AnnotationTarget.CLASS})
    @Retention(AnnotationRetention.RUNTIME)
    @java.lang.annotation.Target({ElementType.TYPE, ElementType.ANNOTATION_TYPE})
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\b\u0012\u0006\u0010\u0002\u001a\u00020\u0003R\u000f\u0010\u0002\u001a\u00020\u0003¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/Navigator$Name;", "", "value", "", "()Ljava/lang/String;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @java.lang.annotation.Retention(RetentionPolicy.RUNTIME)
    /* compiled from: Navigator.kt */
    public @interface Name {
        String value();
    }

    public abstract D createDestination();

    /* access modifiers changed from: protected */
    public final NavigatorState getState() {
        NavigatorState navigatorState = this._state;
        if (navigatorState != null) {
            return navigatorState;
        }
        throw new IllegalStateException("You cannot access the Navigator's state until the Navigator is attached".toString());
    }

    public final boolean isAttached() {
        return this.isAttached;
    }

    public void onAttach(NavigatorState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this._state = state;
        this.isAttached = true;
    }

    public void navigate(List<NavBackStackEntry> entries, NavOptions navOptions, Extras navigatorExtras) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        for (NavBackStackEntry backStackEntry : SequencesKt.filterNotNull(SequencesKt.map(CollectionsKt.asSequence(entries), new Navigator$navigate$1(this, navOptions, navigatorExtras)))) {
            getState().push(backStackEntry);
        }
    }

    public void onLaunchSingleTop(NavBackStackEntry backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        NavDestination destination = backStackEntry.getDestination();
        if (!(destination instanceof NavDestination)) {
            destination = null;
        }
        if (destination != null) {
            navigate(destination, (Bundle) null, NavOptionsBuilderKt.navOptions(Navigator$onLaunchSingleTop$1.INSTANCE), (Extras) null);
            getState().onLaunchSingleTop(backStackEntry);
        }
    }

    public NavDestination navigate(D destination, Bundle args, NavOptions navOptions, Extras navigatorExtras) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return destination;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v9, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void popBackStack(androidx.navigation.NavBackStackEntry r5, boolean r6) {
        /*
            r4 = this;
            java.lang.String r0 = "popUpTo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            androidx.navigation.NavigatorState r0 = r4.getState()
            kotlinx.coroutines.flow.StateFlow r0 = r0.getBackStack()
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            boolean r1 = r0.contains(r5)
            if (r1 == 0) goto L_0x0040
            int r1 = r0.size()
            java.util.ListIterator r1 = r0.listIterator(r1)
            r2 = 0
        L_0x0022:
            boolean r3 = r4.popBackStack()
            if (r3 != 0) goto L_0x0029
            goto L_0x0036
        L_0x0029:
            java.lang.Object r3 = r1.previous()
            r2 = r3
            androidx.navigation.NavBackStackEntry r2 = (androidx.navigation.NavBackStackEntry) r2
            boolean r3 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r5)
            if (r3 == 0) goto L_0x0022
        L_0x0036:
            if (r2 == 0) goto L_0x003f
            androidx.navigation.NavigatorState r3 = r4.getState()
            r3.pop(r2, r6)
        L_0x003f:
            return
        L_0x0040:
            r1 = 0
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "popBackStack was called with "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r3 = " which does not exist in back stack "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r0)
            java.lang.String r1 = r2.toString()
            java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
            java.lang.String r1 = r1.toString()
            r2.<init>(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.Navigator.popBackStack(androidx.navigation.NavBackStackEntry, boolean):void");
    }

    public boolean popBackStack() {
        return true;
    }

    public Bundle onSaveState() {
        return null;
    }

    public void onRestoreState(Bundle savedState) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
    }
}
