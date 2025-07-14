package androidx.navigation.fragment;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016¨\u0006\b"}, d2 = {"androidx/navigation/fragment/DialogFragmentNavigator$observer$1", "Landroidx/lifecycle/LifecycleEventObserver;", "onStateChanged", "", "source", "Landroidx/lifecycle/LifecycleOwner;", "event", "Landroidx/lifecycle/Lifecycle$Event;", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: DialogFragmentNavigator.kt */
public final class DialogFragmentNavigator$observer$1 implements LifecycleEventObserver {
    final /* synthetic */ DialogFragmentNavigator this$0;

    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* compiled from: DialogFragmentNavigator.kt */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 3;
            } catch (NoSuchFieldError e3) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 4;
            } catch (NoSuchFieldError e4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    DialogFragmentNavigator$observer$1(DialogFragmentNavigator $receiver) {
        this.this$0 = $receiver;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v2, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v3, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v3, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v4, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v5, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v8, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v9, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v15, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v17, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v13, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v14, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onStateChanged(androidx.lifecycle.LifecycleOwner r11, androidx.lifecycle.Lifecycle.Event r12) {
        /*
            r10 = this;
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            int[] r0 = androidx.navigation.fragment.DialogFragmentNavigator$observer$1.WhenMappings.$EnumSwitchMapping$0
            int r1 = r12.ordinal()
            r0 = r0[r1]
            r1 = 0
            switch(r0) {
                case 1: goto L_0x013e;
                case 2: goto L_0x00f3;
                case 3: goto L_0x006e;
                case 4: goto L_0x0019;
                default: goto L_0x0017;
            }
        L_0x0017:
            goto L_0x018a
        L_0x0019:
            r0 = r11
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            androidx.navigation.fragment.DialogFragmentNavigator r1 = r10.this$0
            androidx.navigation.NavigatorState r1 = r1.getState()
            kotlinx.coroutines.flow.StateFlow r1 = r1.getTransitionsInProgress()
            java.lang.Object r1 = r1.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 0
            r3 = 0
            java.util.Iterator r4 = r1.iterator()
        L_0x0032:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0050
            java.lang.Object r5 = r4.next()
            r6 = r5
            androidx.navigation.NavBackStackEntry r6 = (androidx.navigation.NavBackStackEntry) r6
            r7 = 0
            java.lang.String r8 = r6.getId()
            java.lang.String r9 = r0.getTag()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r6 == 0) goto L_0x0032
            r3 = r5
            goto L_0x0032
        L_0x0050:
            r1 = r3
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            if (r1 == 0) goto L_0x0062
            androidx.navigation.fragment.DialogFragmentNavigator r2 = r10.this$0
            r3 = r1
            r4 = 0
            androidx.navigation.NavigatorState r2 = r2.getState()
            r2.markTransitionComplete(r3)
        L_0x0062:
            androidx.lifecycle.Lifecycle r2 = r0.getLifecycle()
            r3 = r10
            androidx.lifecycle.LifecycleObserver r3 = (androidx.lifecycle.LifecycleObserver) r3
            r2.removeObserver(r3)
            goto L_0x018a
        L_0x006e:
            r0 = r11
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            android.app.Dialog r2 = r0.requireDialog()
            boolean r2 = r2.isShowing()
            if (r2 != 0) goto L_0x018a
            androidx.navigation.fragment.DialogFragmentNavigator r2 = r10.this$0
            androidx.navigation.NavigatorState r2 = r2.getState()
            kotlinx.coroutines.flow.StateFlow r2 = r2.getBackStack()
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            r3 = r2
            r4 = 0
            int r5 = r3.size()
            java.util.ListIterator r5 = r3.listIterator(r5)
        L_0x0095:
            boolean r6 = r5.hasPrevious()
            if (r6 == 0) goto L_0x00b5
            java.lang.Object r6 = r5.previous()
            androidx.navigation.NavBackStackEntry r6 = (androidx.navigation.NavBackStackEntry) r6
            r7 = 0
            java.lang.String r8 = r6.getId()
            java.lang.String r9 = r0.getTag()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r6 == 0) goto L_0x0095
            int r6 = r5.nextIndex()
            goto L_0x00b6
        L_0x00b5:
            r6 = -1
        L_0x00b6:
            r3 = r6
            java.lang.Object r4 = kotlin.collections.CollectionsKt.getOrNull(r2, r3)
            androidx.navigation.NavBackStackEntry r4 = (androidx.navigation.NavBackStackEntry) r4
            java.lang.Object r5 = kotlin.collections.CollectionsKt.lastOrNull(r2)
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r5, (java.lang.Object) r4)
            if (r5 != 0) goto L_0x00e6
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "Dialog "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r6 = " was dismissed while it was not the top of the back stack, popping all dialogs above this dismissed dialog"
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.String r6 = "DialogFragmentNavigator"
            android.util.Log.i(r6, r5)
        L_0x00e6:
            if (r4 == 0) goto L_0x00f1
            androidx.navigation.fragment.DialogFragmentNavigator r5 = r10.this$0
            r6 = r4
            r7 = 0
            r5.popWithTransition(r3, r6, r1)
            goto L_0x018a
        L_0x00f1:
            goto L_0x018a
        L_0x00f3:
            r0 = r11
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            androidx.navigation.fragment.DialogFragmentNavigator r1 = r10.this$0
            androidx.navigation.NavigatorState r1 = r1.getState()
            kotlinx.coroutines.flow.StateFlow r1 = r1.getTransitionsInProgress()
            java.lang.Object r1 = r1.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 0
            r3 = 0
            java.util.Iterator r4 = r1.iterator()
        L_0x010c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x012a
            java.lang.Object r5 = r4.next()
            r6 = r5
            androidx.navigation.NavBackStackEntry r6 = (androidx.navigation.NavBackStackEntry) r6
            r7 = 0
            java.lang.String r8 = r6.getId()
            java.lang.String r9 = r0.getTag()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r6 == 0) goto L_0x010c
            r3 = r5
            goto L_0x010c
        L_0x012a:
            r1 = r3
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            if (r1 == 0) goto L_0x013d
            androidx.navigation.fragment.DialogFragmentNavigator r2 = r10.this$0
            r3 = r1
            r4 = 0
            androidx.navigation.NavigatorState r2 = r2.getState()
            r2.markTransitionComplete(r3)
            goto L_0x018a
        L_0x013d:
            goto L_0x018a
        L_0x013e:
            r0 = r11
            androidx.fragment.app.DialogFragment r0 = (androidx.fragment.app.DialogFragment) r0
            androidx.navigation.fragment.DialogFragmentNavigator r2 = r10.this$0
            androidx.navigation.NavigatorState r2 = r2.getState()
            kotlinx.coroutines.flow.StateFlow r2 = r2.getBackStack()
            java.lang.Object r2 = r2.getValue()
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            boolean r4 = r2 instanceof java.util.Collection
            if (r4 == 0) goto L_0x0160
            r4 = r2
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x0160
            goto L_0x0183
        L_0x0160:
            java.util.Iterator r4 = r2.iterator()
        L_0x0164:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x0182
            java.lang.Object r5 = r4.next()
            r6 = r5
            androidx.navigation.NavBackStackEntry r6 = (androidx.navigation.NavBackStackEntry) r6
            r7 = 0
            java.lang.String r8 = r6.getId()
            java.lang.String r9 = r0.getTag()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r6 == 0) goto L_0x0164
            r1 = 1
            goto L_0x0183
        L_0x0182:
        L_0x0183:
            if (r1 != 0) goto L_0x018a
            r0.dismiss()
        L_0x018a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.DialogFragmentNavigator$observer$1.onStateChanged(androidx.lifecycle.LifecycleOwner, androidx.lifecycle.Lifecycle$Event):void");
    }
}
