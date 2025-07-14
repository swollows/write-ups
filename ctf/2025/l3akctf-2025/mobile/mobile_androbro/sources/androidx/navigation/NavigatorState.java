package androidx.navigation;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\f\b&\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001a\u0010\u0017\u001a\u00020\u00062\u0006\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bH&J\u0010\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0006H\u0016J\u0010\u0010\u001f\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0006H\u0017J\u0010\u0010!\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0006H\u0017J\u0018\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0010H\u0016J\u0018\u0010%\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u00062\u0006\u0010$\u001a\u00020\u0010H\u0016J\u0010\u0010&\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0006H\u0017J\u0010\u0010'\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0006H\u0016J\u0010\u0010(\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u0006H\u0016R\u001a\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0\u0004X\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\n¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u000e\u0010\r\u001a\u00020\u000eX\u0004¢\u0006\u0002\n\u0000R&\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00108G@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001d\u0010\u0015\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\b0\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\f¨\u0006)"}, d2 = {"Landroidx/navigation/NavigatorState;", "", "()V", "_backStack", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "Landroidx/navigation/NavBackStackEntry;", "_transitionsInProgress", "", "backStack", "Lkotlinx/coroutines/flow/StateFlow;", "getBackStack", "()Lkotlinx/coroutines/flow/StateFlow;", "backStackLock", "Ljava/util/concurrent/locks/ReentrantLock;", "<set-?>", "", "isNavigating", "()Z", "setNavigating", "(Z)V", "transitionsInProgress", "getTransitionsInProgress", "createBackStackEntry", "destination", "Landroidx/navigation/NavDestination;", "arguments", "Landroid/os/Bundle;", "markTransitionComplete", "", "entry", "onLaunchSingleTop", "backStackEntry", "onLaunchSingleTopWithTransition", "pop", "popUpTo", "saveState", "popWithTransition", "prepareForTransition", "push", "pushWithTransition", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavigatorState.kt */
public abstract class NavigatorState {
    private final MutableStateFlow<List<NavBackStackEntry>> _backStack = StateFlowKt.MutableStateFlow(CollectionsKt.emptyList());
    private final MutableStateFlow<Set<NavBackStackEntry>> _transitionsInProgress = StateFlowKt.MutableStateFlow(SetsKt.emptySet());
    private final StateFlow<List<NavBackStackEntry>> backStack = FlowKt.asStateFlow(this._backStack);
    private final ReentrantLock backStackLock = new ReentrantLock(true);
    private boolean isNavigating;
    private final StateFlow<Set<NavBackStackEntry>> transitionsInProgress = FlowKt.asStateFlow(this._transitionsInProgress);

    public abstract NavBackStackEntry createBackStackEntry(NavDestination navDestination, Bundle bundle);

    public final boolean isNavigating() {
        return this.isNavigating;
    }

    public final void setNavigating(boolean z) {
        this.isNavigating = z;
    }

    public final StateFlow<List<NavBackStackEntry>> getBackStack() {
        return this.backStack;
    }

    public final StateFlow<Set<NavBackStackEntry>> getTransitionsInProgress() {
        return this.transitionsInProgress;
    }

    public void push(NavBackStackEntry backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Lock lock = this.backStackLock;
        lock.lock();
        try {
            this._backStack.setValue(CollectionsKt.plus(this._backStack.getValue(), backStackEntry));
            Unit unit = Unit.INSTANCE;
        } finally {
            lock.unlock();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void pushWithTransition(androidx.navigation.NavBackStackEntry r9) {
        /*
            r8 = this;
            java.lang.String r0 = "backStackEntry"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r0)
            kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<androidx.navigation.NavBackStackEntry>> r0 = r8._transitionsInProgress
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            boolean r2 = r0 instanceof java.util.Collection
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0020
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0020
            r0 = r4
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r2 = r0.iterator()
        L_0x0024:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x003b
            java.lang.Object r5 = r2.next()
            r6 = r5
            androidx.navigation.NavBackStackEntry r6 = (androidx.navigation.NavBackStackEntry) r6
            r7 = 0
            if (r6 != r9) goto L_0x0036
            r6 = r3
            goto L_0x0037
        L_0x0036:
            r6 = r4
        L_0x0037:
            if (r6 == 0) goto L_0x0024
            r0 = r3
            goto L_0x003c
        L_0x003b:
            r0 = r4
        L_0x003c:
            if (r0 == 0) goto L_0x0074
            kotlinx.coroutines.flow.StateFlow<java.util.List<androidx.navigation.NavBackStackEntry>> r0 = r8.backStack
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0056
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0056
            r3 = r4
            goto L_0x0071
        L_0x0056:
            java.util.Iterator r2 = r0.iterator()
        L_0x005a:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0070
            java.lang.Object r5 = r2.next()
            r6 = r5
            androidx.navigation.NavBackStackEntry r6 = (androidx.navigation.NavBackStackEntry) r6
            r7 = 0
            if (r6 != r9) goto L_0x006c
            r6 = r3
            goto L_0x006d
        L_0x006c:
            r6 = r4
        L_0x006d:
            if (r6 == 0) goto L_0x005a
            goto L_0x0071
        L_0x0070:
            r3 = r4
        L_0x0071:
            if (r3 == 0) goto L_0x0074
            return
        L_0x0074:
            kotlinx.coroutines.flow.StateFlow<java.util.List<androidx.navigation.NavBackStackEntry>> r0 = r8.backStack
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = kotlin.collections.CollectionsKt.lastOrNull(r0)
            androidx.navigation.NavBackStackEntry r0 = (androidx.navigation.NavBackStackEntry) r0
            if (r0 == 0) goto L_0x0095
            kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<androidx.navigation.NavBackStackEntry>> r1 = r8._transitionsInProgress
            kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<androidx.navigation.NavBackStackEntry>> r2 = r8._transitionsInProgress
            java.lang.Object r2 = r2.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.util.Set r2 = kotlin.collections.SetsKt.plus(r2, r0)
            r1.setValue(r2)
        L_0x0095:
            kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<androidx.navigation.NavBackStackEntry>> r1 = r8._transitionsInProgress
            kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<androidx.navigation.NavBackStackEntry>> r2 = r8._transitionsInProgress
            java.lang.Object r2 = r2.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.util.Set r2 = kotlin.collections.SetsKt.plus(r2, r9)
            r1.setValue(r2)
            r8.push(r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavigatorState.pushWithTransition(androidx.navigation.NavBackStackEntry):void");
    }

    public void pop(NavBackStackEntry popUpTo, boolean saveState) {
        Intrinsics.checkNotNullParameter(popUpTo, "popUpTo");
        Lock lock = this.backStackLock;
        lock.lock();
        try {
            MutableStateFlow<List<NavBackStackEntry>> mutableStateFlow = this._backStack;
            ArrayList list$iv = new ArrayList();
            Iterator it = this._backStack.getValue().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Object item$iv = it.next();
                if (Intrinsics.areEqual((Object) (NavBackStackEntry) item$iv, (Object) popUpTo)) {
                    break;
                }
                list$iv.add(item$iv);
            }
            mutableStateFlow.setValue(list$iv);
            Unit unit = Unit.INSTANCE;
        } finally {
            lock.unlock();
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v5, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v8, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v10, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void popWithTransition(androidx.navigation.NavBackStackEntry r11, boolean r12) {
        /*
            r10 = this;
            java.lang.String r0 = "popUpTo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<androidx.navigation.NavBackStackEntry>> r0 = r10._transitionsInProgress
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            boolean r2 = r0 instanceof java.util.Collection
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0020
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0020
            r0 = r4
            goto L_0x003c
        L_0x0020:
            java.util.Iterator r2 = r0.iterator()
        L_0x0024:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x003b
            java.lang.Object r5 = r2.next()
            r6 = r5
            androidx.navigation.NavBackStackEntry r6 = (androidx.navigation.NavBackStackEntry) r6
            r7 = 0
            if (r6 != r11) goto L_0x0036
            r6 = r3
            goto L_0x0037
        L_0x0036:
            r6 = r4
        L_0x0037:
            if (r6 == 0) goto L_0x0024
            r0 = r3
            goto L_0x003c
        L_0x003b:
            r0 = r4
        L_0x003c:
            if (r0 == 0) goto L_0x0075
            kotlinx.coroutines.flow.StateFlow<java.util.List<androidx.navigation.NavBackStackEntry>> r0 = r10.backStack
            java.lang.Object r0 = r0.getValue()
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            r1 = 0
            boolean r2 = r0 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0056
            r2 = r0
            java.util.Collection r2 = (java.util.Collection) r2
            boolean r2 = r2.isEmpty()
            if (r2 == 0) goto L_0x0056
            r0 = r3
            goto L_0x0072
        L_0x0056:
            java.util.Iterator r2 = r0.iterator()
        L_0x005a:
            boolean r5 = r2.hasNext()
            if (r5 == 0) goto L_0x0071
            java.lang.Object r5 = r2.next()
            r6 = r5
            androidx.navigation.NavBackStackEntry r6 = (androidx.navigation.NavBackStackEntry) r6
            r7 = 0
            if (r6 != r11) goto L_0x006c
            r6 = r3
            goto L_0x006d
        L_0x006c:
            r6 = r4
        L_0x006d:
            if (r6 == 0) goto L_0x005a
            r0 = r4
            goto L_0x0072
        L_0x0071:
            r0 = r3
        L_0x0072:
            if (r0 == 0) goto L_0x0075
            return
        L_0x0075:
            kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<androidx.navigation.NavBackStackEntry>> r0 = r10._transitionsInProgress
            kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<androidx.navigation.NavBackStackEntry>> r1 = r10._transitionsInProgress
            java.lang.Object r1 = r1.getValue()
            java.util.Set r1 = (java.util.Set) r1
            java.util.Set r1 = kotlin.collections.SetsKt.plus(r1, r11)
            r0.setValue(r1)
            kotlinx.coroutines.flow.StateFlow<java.util.List<androidx.navigation.NavBackStackEntry>> r0 = r10.backStack
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            r1 = 0
            int r2 = r0.size()
            java.util.ListIterator r2 = r0.listIterator(r2)
        L_0x0097:
            boolean r5 = r2.hasPrevious()
            if (r5 == 0) goto L_0x00cb
            java.lang.Object r5 = r2.previous()
            r6 = r5
            androidx.navigation.NavBackStackEntry r6 = (androidx.navigation.NavBackStackEntry) r6
            r7 = 0
            boolean r8 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r11)
            if (r8 != 0) goto L_0x00c7
            kotlinx.coroutines.flow.StateFlow<java.util.List<androidx.navigation.NavBackStackEntry>> r8 = r10.backStack
            java.lang.Object r8 = r8.getValue()
            java.util.List r8 = (java.util.List) r8
            int r8 = r8.lastIndexOf(r6)
            kotlinx.coroutines.flow.StateFlow<java.util.List<androidx.navigation.NavBackStackEntry>> r9 = r10.backStack
            java.lang.Object r9 = r9.getValue()
            java.util.List r9 = (java.util.List) r9
            int r9 = r9.lastIndexOf(r11)
            if (r8 >= r9) goto L_0x00c7
            r6 = r3
            goto L_0x00c8
        L_0x00c7:
            r6 = r4
        L_0x00c8:
            if (r6 == 0) goto L_0x0097
            goto L_0x00cc
        L_0x00cb:
            r5 = 0
        L_0x00cc:
            androidx.navigation.NavBackStackEntry r5 = (androidx.navigation.NavBackStackEntry) r5
            r0 = r5
            if (r0 == 0) goto L_0x00e2
            kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<androidx.navigation.NavBackStackEntry>> r1 = r10._transitionsInProgress
            kotlinx.coroutines.flow.MutableStateFlow<java.util.Set<androidx.navigation.NavBackStackEntry>> r2 = r10._transitionsInProgress
            java.lang.Object r2 = r2.getValue()
            java.util.Set r2 = (java.util.Set) r2
            java.util.Set r2 = kotlin.collections.SetsKt.plus(r2, r0)
            r1.setValue(r2)
        L_0x00e2:
            r10.pop(r11, r12)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavigatorState.popWithTransition(androidx.navigation.NavBackStackEntry, boolean):void");
    }

    public void onLaunchSingleTop(NavBackStackEntry backStackEntry) {
        int idx;
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        Lock lock = this.backStackLock;
        lock.lock();
        try {
            List tempStack = CollectionsKt.toMutableList(this.backStack.getValue());
            List $this$indexOfLast$iv = tempStack;
            ListIterator iterator$iv = $this$indexOfLast$iv.listIterator($this$indexOfLast$iv.size());
            while (true) {
                if (iterator$iv.hasPrevious()) {
                    if (Intrinsics.areEqual((Object) ((NavBackStackEntry) iterator$iv.previous()).getId(), (Object) backStackEntry.getId())) {
                        idx = iterator$iv.nextIndex();
                        break;
                    }
                } else {
                    idx = -1;
                    break;
                }
            }
            tempStack.set(idx, backStackEntry);
            this._backStack.setValue(tempStack);
            Unit unit = Unit.INSTANCE;
        } finally {
            lock.unlock();
        }
    }

    public void onLaunchSingleTopWithTransition(NavBackStackEntry backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        List $this$last$iv = this.backStack.getValue();
        ListIterator iterator$iv = $this$last$iv.listIterator($this$last$iv.size());
        while (iterator$iv.hasPrevious()) {
            Object element$iv = iterator$iv.previous();
            if (Intrinsics.areEqual((Object) ((NavBackStackEntry) element$iv).getId(), (Object) backStackEntry.getId())) {
                this._transitionsInProgress.setValue(SetsKt.plus(SetsKt.plus(this._transitionsInProgress.getValue(), (NavBackStackEntry) element$iv), backStackEntry));
                onLaunchSingleTop(backStackEntry);
                return;
            }
        }
        throw new NoSuchElementException("List contains no element matching the predicate.");
    }

    public void markTransitionComplete(NavBackStackEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this._transitionsInProgress.setValue(SetsKt.minus(this._transitionsInProgress.getValue(), entry));
    }

    public void prepareForTransition(NavBackStackEntry entry) {
        Intrinsics.checkNotNullParameter(entry, "entry");
        this._transitionsInProgress.setValue(SetsKt.plus(this._transitionsInProgress.getValue(), entry));
    }
}
