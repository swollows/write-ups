package androidx.navigation.fragment;

import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavigatorState;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0018\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\b\u0010\t\u001a\u00020\u0003H\u0016¨\u0006\n"}, d2 = {"androidx/navigation/fragment/FragmentNavigator$onAttach$2", "Landroidx/fragment/app/FragmentManager$OnBackStackChangedListener;", "onBackStackChangeCommitted", "", "fragment", "Landroidx/fragment/app/Fragment;", "pop", "", "onBackStackChangeStarted", "onBackStackChanged", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: FragmentNavigator.kt */
public final class FragmentNavigator$onAttach$2 implements FragmentManager.OnBackStackChangedListener {
    final /* synthetic */ NavigatorState $state;
    final /* synthetic */ FragmentNavigator this$0;

    FragmentNavigator$onAttach$2(NavigatorState $state2, FragmentNavigator $receiver) {
        this.$state = $state2;
        this.this$0 = $receiver;
    }

    public void onBackStackChanged() {
    }

    public void onBackStackChangeStarted(Fragment fragment, boolean pop) {
        Object element$iv;
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (pop) {
            List $this$lastOrNull$iv = this.$state.getBackStack().getValue();
            ListIterator iterator$iv = $this$lastOrNull$iv.listIterator($this$lastOrNull$iv.size());
            while (true) {
                if (!iterator$iv.hasPrevious()) {
                    element$iv = null;
                    break;
                }
                element$iv = iterator$iv.previous();
                if (Intrinsics.areEqual((Object) ((NavBackStackEntry) element$iv).getId(), (Object) fragment.getTag())) {
                    break;
                }
            }
            NavBackStackEntry entry = (NavBackStackEntry) element$iv;
            if (this.this$0.isLoggingEnabled(2)) {
                Log.v("FragmentNavigator", "OnBackStackChangedStarted for fragment " + fragment + " associated with entry " + entry);
            }
            if (entry != null) {
                this.$state.prepareForTransition(entry);
            }
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v0, resolved type: kotlin.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: kotlin.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: kotlin.Pair} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v3, resolved type: kotlin.Pair} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onBackStackChangeCommitted(androidx.fragment.app.Fragment r14, boolean r15) {
        /*
            r13 = this;
            java.lang.String r0 = "fragment"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            androidx.navigation.NavigatorState r0 = r13.$state
            kotlinx.coroutines.flow.StateFlow r0 = r0.getBackStack()
            java.lang.Object r0 = r0.getValue()
            java.util.Collection r0 = (java.util.Collection) r0
            androidx.navigation.NavigatorState r1 = r13.$state
            kotlinx.coroutines.flow.StateFlow r1 = r1.getTransitionsInProgress()
            java.lang.Object r1 = r1.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            java.util.List r0 = kotlin.collections.CollectionsKt.plus(r0, r1)
            r1 = 0
            int r2 = r0.size()
            java.util.ListIterator r2 = r0.listIterator(r2)
        L_0x002a:
            boolean r3 = r2.hasPrevious()
            r4 = 0
            if (r3 == 0) goto L_0x0048
            java.lang.Object r3 = r2.previous()
            r5 = r3
            androidx.navigation.NavBackStackEntry r5 = (androidx.navigation.NavBackStackEntry) r5
            r6 = 0
            java.lang.String r7 = r5.getId()
            java.lang.String r8 = r14.getTag()
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r7, (java.lang.Object) r8)
            if (r5 == 0) goto L_0x002a
            goto L_0x0049
        L_0x0048:
            r3 = r4
        L_0x0049:
            androidx.navigation.NavBackStackEntry r3 = (androidx.navigation.NavBackStackEntry) r3
            r0 = r3
            r1 = 1
            r2 = 0
            if (r15 == 0) goto L_0x0064
            androidx.navigation.fragment.FragmentNavigator r3 = r13.this$0
            java.util.List r3 = r3.getPendingOps$navigation_fragment_release()
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L_0x0064
            boolean r3 = r14.isRemoving()
            if (r3 == 0) goto L_0x0064
            r3 = r1
            goto L_0x0065
        L_0x0064:
            r3 = r2
        L_0x0065:
            androidx.navigation.fragment.FragmentNavigator r5 = r13.this$0
            java.util.List r5 = r5.getPendingOps$navigation_fragment_release()
            java.lang.Iterable r5 = (java.lang.Iterable) r5
            r6 = 0
            java.util.Iterator r7 = r5.iterator()
        L_0x0072:
            boolean r8 = r7.hasNext()
            if (r8 == 0) goto L_0x0090
            java.lang.Object r8 = r7.next()
            r9 = r8
            kotlin.Pair r9 = (kotlin.Pair) r9
            r10 = 0
            java.lang.Object r11 = r9.getFirst()
            java.lang.String r12 = r14.getTag()
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r11, (java.lang.Object) r12)
            if (r9 == 0) goto L_0x0072
            r4 = r8
            goto L_0x0091
        L_0x0090:
        L_0x0091:
            kotlin.Pair r4 = (kotlin.Pair) r4
            if (r4 == 0) goto L_0x00a0
            androidx.navigation.fragment.FragmentNavigator r5 = r13.this$0
            r6 = r4
            r7 = 0
            java.util.List r5 = r5.getPendingOps$navigation_fragment_release()
            r5.remove(r6)
        L_0x00a0:
            java.lang.String r5 = "OnBackStackChangedCommitted for fragment "
            java.lang.String r6 = "FragmentNavigator"
            r7 = 2
            if (r3 != 0) goto L_0x00d1
            androidx.navigation.fragment.FragmentNavigator r8 = r13.this$0
            boolean r8 = r8.isLoggingEnabled(r7)
            if (r8 == 0) goto L_0x00d1
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.StringBuilder r8 = r8.append(r5)
            java.lang.StringBuilder r8 = r8.append(r14)
            java.lang.String r9 = " associated with entry "
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r6, r8)
        L_0x00d1:
            if (r4 == 0) goto L_0x00e0
            java.lang.Object r8 = r4.getSecond()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != r1) goto L_0x00e0
            goto L_0x00e1
        L_0x00e0:
            r1 = r2
        L_0x00e1:
            if (r15 != 0) goto L_0x010f
            if (r1 != 0) goto L_0x010f
            if (r0 == 0) goto L_0x00e8
            goto L_0x010f
        L_0x00e8:
            r2 = 0
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            r5.<init>()
            java.lang.String r6 = "The fragment "
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.StringBuilder r5 = r5.append(r14)
            java.lang.String r6 = " is unknown to the FragmentNavigator. Please use the navigate() function to add fragments to the FragmentNavigator managed FragmentManager."
            java.lang.StringBuilder r5 = r5.append(r6)
            java.lang.String r5 = r5.toString()
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.String r5 = r5.toString()
            r2.<init>(r5)
            throw r2
        L_0x010f:
            if (r0 == 0) goto L_0x014e
            androidx.navigation.fragment.FragmentNavigator r8 = r13.this$0
            androidx.navigation.NavigatorState r9 = r13.$state
            r8.attachClearViewModel$navigation_fragment_release(r14, r0, r9)
            if (r3 == 0) goto L_0x014e
            androidx.navigation.fragment.FragmentNavigator r8 = r13.this$0
            boolean r7 = r8.isLoggingEnabled(r7)
            if (r7 == 0) goto L_0x0149
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r5 = r7.append(r5)
            java.lang.StringBuilder r5 = r5.append(r14)
            java.lang.String r7 = " popping associated entry "
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.StringBuilder r5 = r5.append(r0)
            java.lang.String r7 = " via system back"
            java.lang.StringBuilder r5 = r5.append(r7)
            java.lang.String r5 = r5.toString()
            android.util.Log.v(r6, r5)
        L_0x0149:
            androidx.navigation.NavigatorState r5 = r13.$state
            r5.popWithTransition(r0, r2)
        L_0x014e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.FragmentNavigator$onAttach$2.onBackStackChangeCommitted(androidx.fragment.app.Fragment, boolean):void");
    }
}
