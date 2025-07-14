package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.core.os.BundleKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.InitializerViewModelFactoryBuilder;
import androidx.navigation.NavBackStackEntry;
import androidx.navigation.NavDestination;
import androidx.navigation.NavOptions;
import androidx.navigation.Navigator;
import androidx.navigation.NavigatorProvider;
import androidx.navigation.NavigatorState;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Set;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.flow.StateFlow;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010#\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0017\u0018\u0000 B2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0004ABCDB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ$\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020\u00172\b\b\u0002\u0010 \u001a\u00020\u00182\b\b\u0002\u0010!\u001a\u00020\u0018H\u0002J%\u0010\"\u001a\u00020\u001e2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\r2\u0006\u0010&\u001a\u00020'H\u0000¢\u0006\u0002\b(J\u0018\u0010)\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\r2\u0006\u0010#\u001a\u00020$H\u0002J\b\u0010*\u001a\u00020\u0002H\u0016J\u001a\u0010+\u001a\u00020,2\u0006\u0010%\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010.H\u0002J*\u0010/\u001a\u00020$2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u00100\u001a\u00020\u00172\b\u00101\u001a\u0004\u0018\u000102H\u0017J\u0010\u00103\u001a\u00020\u00182\u0006\u00104\u001a\u00020\bH\u0002J$\u00105\u001a\u00020\u001e2\u0006\u0010%\u001a\u00020\r2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u00106\u001a\u0004\u0018\u000107H\u0002J*\u00105\u001a\u00020\u001e2\f\u00108\u001a\b\u0012\u0004\u0012\u00020\r0\f2\b\u0010-\u001a\u0004\u0018\u00010.2\b\u00106\u001a\u0004\u0018\u000107H\u0016J\u0010\u00109\u001a\u00020\u001e2\u0006\u0010&\u001a\u00020'H\u0016J\u0010\u0010:\u001a\u00020\u001e2\u0006\u0010;\u001a\u00020\rH\u0016J\u0010\u0010<\u001a\u00020\u001e2\u0006\u0010=\u001a\u000202H\u0016J\n\u0010>\u001a\u0004\u0018\u000102H\u0016J\u0018\u0010?\u001a\u00020\u001e2\u0006\u0010@\u001a\u00020\r2\u0006\u0010=\u001a\u00020\u0018H\u0016R \u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\r0\f0\u000b8@X\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00110\u0013X\u0004¢\u0006\u0002\n\u0000R&\u0010\u0014\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00180\u00160\u0015X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00170\u001cX\u0004¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator;", "Landroidx/navigation/Navigator;", "Landroidx/navigation/fragment/FragmentNavigator$Destination;", "context", "Landroid/content/Context;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "containerId", "", "(Landroid/content/Context;Landroidx/fragment/app/FragmentManager;I)V", "backStack", "Lkotlinx/coroutines/flow/StateFlow;", "", "Landroidx/navigation/NavBackStackEntry;", "getBackStack$navigation_fragment_release", "()Lkotlinx/coroutines/flow/StateFlow;", "fragmentObserver", "Landroidx/lifecycle/LifecycleEventObserver;", "fragmentViewObserver", "Lkotlin/Function1;", "pendingOps", "", "Lkotlin/Pair;", "", "", "getPendingOps$navigation_fragment_release", "()Ljava/util/List;", "savedIds", "", "addPendingOps", "", "id", "isPop", "deduplicate", "attachClearViewModel", "fragment", "Landroidx/fragment/app/Fragment;", "entry", "state", "Landroidx/navigation/NavigatorState;", "attachClearViewModel$navigation_fragment_release", "attachObservers", "createDestination", "createFragmentTransaction", "Landroidx/fragment/app/FragmentTransaction;", "navOptions", "Landroidx/navigation/NavOptions;", "instantiateFragment", "className", "args", "Landroid/os/Bundle;", "isLoggingEnabled", "level", "navigate", "navigatorExtras", "Landroidx/navigation/Navigator$Extras;", "entries", "onAttach", "onLaunchSingleTop", "backStackEntry", "onRestoreState", "savedState", "onSaveState", "popBackStack", "popUpTo", "ClearEntryStateViewModel", "Companion", "Destination", "Extras", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@Navigator.Name("fragment")
/* compiled from: FragmentNavigator.kt */
public class FragmentNavigator extends Navigator<Destination> {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String KEY_SAVED_IDS = "androidx-nav-fragment:navigator:savedIds";
    private static final String TAG = "FragmentNavigator";
    private final int containerId;
    private final Context context;
    private final FragmentManager fragmentManager;
    private final LifecycleEventObserver fragmentObserver = new FragmentNavigator$$ExternalSyntheticLambda0(this);
    /* access modifiers changed from: private */
    public final Function1<NavBackStackEntry, LifecycleEventObserver> fragmentViewObserver = new FragmentNavigator$fragmentViewObserver$1(this);
    private final List<Pair<String, Boolean>> pendingOps = new ArrayList();
    private final Set<String> savedIds = new LinkedHashSet();

    public FragmentNavigator(Context context2, FragmentManager fragmentManager2, int containerId2) {
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(fragmentManager2, "fragmentManager");
        this.context = context2;
        this.fragmentManager = fragmentManager2;
        this.containerId = containerId2;
    }

    /* access modifiers changed from: private */
    public final boolean isLoggingEnabled(int level) {
        return Log.isLoggable(FragmentManager.TAG, level) || Log.isLoggable(TAG, level);
    }

    public final List<Pair<String, Boolean>> getPendingOps$navigation_fragment_release() {
        return this.pendingOps;
    }

    public final StateFlow<List<NavBackStackEntry>> getBackStack$navigation_fragment_release() {
        return getState().getBackStack();
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v1, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v1, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r6v0, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v6, resolved type: androidx.navigation.NavBackStackEntry} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: androidx.navigation.NavBackStackEntry} */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final void fragmentObserver$lambda$1(androidx.navigation.fragment.FragmentNavigator r10, androidx.lifecycle.LifecycleOwner r11, androidx.lifecycle.Lifecycle.Event r12) {
        /*
            java.lang.String r0 = "this$0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r10, r0)
            java.lang.String r0 = "source"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            java.lang.String r0 = "event"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            androidx.lifecycle.Lifecycle$Event r0 = androidx.lifecycle.Lifecycle.Event.ON_DESTROY
            if (r12 != r0) goto L_0x008a
            r0 = r11
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            androidx.navigation.NavigatorState r1 = r10.getState()
            kotlinx.coroutines.flow.StateFlow r1 = r1.getTransitionsInProgress()
            java.lang.Object r1 = r1.getValue()
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r2 = 0
            r3 = 0
            java.util.Iterator r4 = r1.iterator()
        L_0x002c:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x004a
            java.lang.Object r5 = r4.next()
            r6 = r5
            androidx.navigation.NavBackStackEntry r6 = (androidx.navigation.NavBackStackEntry) r6
            r7 = 0
            java.lang.String r8 = r6.getId()
            java.lang.String r9 = r0.getTag()
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r6 == 0) goto L_0x002c
            r3 = r5
            goto L_0x002c
        L_0x004a:
            r1 = r3
            androidx.navigation.NavBackStackEntry r1 = (androidx.navigation.NavBackStackEntry) r1
            if (r1 == 0) goto L_0x008a
            r2 = 2
            boolean r2 = r10.isLoggingEnabled(r2)
            if (r2 == 0) goto L_0x0083
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Marking transition complete for entry "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r3 = " due to fragment "
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r11)
            java.lang.String r3 = " lifecycle reaching DESTROYED"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            java.lang.String r3 = "FragmentNavigator"
            android.util.Log.v(r3, r2)
        L_0x0083:
            androidx.navigation.NavigatorState r2 = r10.getState()
            r2.markTransitionComplete(r1)
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.fragment.FragmentNavigator.fragmentObserver$lambda$1(androidx.navigation.fragment.FragmentNavigator, androidx.lifecycle.LifecycleOwner, androidx.lifecycle.Lifecycle$Event):void");
    }

    public void onAttach(NavigatorState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        super.onAttach(state);
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "onAttach");
        }
        this.fragmentManager.addFragmentOnAttachListener(new FragmentNavigator$$ExternalSyntheticLambda1(state, this));
        this.fragmentManager.addOnBackStackChangedListener(new FragmentNavigator$onAttach$2(state, this));
    }

    /* access modifiers changed from: private */
    public static final void onAttach$lambda$3(NavigatorState $state, FragmentNavigator this$0, FragmentManager fragmentManager2, Fragment fragment) {
        Object element$iv;
        Intrinsics.checkNotNullParameter($state, "$state");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(fragmentManager2, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        List $this$lastOrNull$iv = $state.getBackStack().getValue();
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
        if (this$0.isLoggingEnabled(2)) {
            Log.v(TAG, "Attaching fragment " + fragment + " associated with entry " + entry + " to FragmentManager " + this$0.fragmentManager);
        }
        if (entry != null) {
            this$0.attachObservers(entry, fragment);
            this$0.attachClearViewModel$navigation_fragment_release(fragment, entry, $state);
        }
    }

    private final void attachObservers(NavBackStackEntry entry, Fragment fragment) {
        fragment.getViewLifecycleOwnerLiveData().observe(fragment, new FragmentNavigator$sam$androidx_lifecycle_Observer$0(new FragmentNavigator$attachObservers$1(this, fragment, entry)));
        fragment.getLifecycle().addObserver(this.fragmentObserver);
    }

    public final void attachClearViewModel$navigation_fragment_release(Fragment fragment, NavBackStackEntry entry, NavigatorState state) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        Intrinsics.checkNotNullParameter(entry, "entry");
        Intrinsics.checkNotNullParameter(state, "state");
        ViewModelStore viewModelStore = fragment.getViewModelStore();
        Intrinsics.checkNotNullExpressionValue(viewModelStore, "fragment.viewModelStore");
        InitializerViewModelFactoryBuilder $this$attachClearViewModel_u24lambda_u244 = new InitializerViewModelFactoryBuilder();
        $this$attachClearViewModel_u24lambda_u244.addInitializer(Reflection.getOrCreateKotlinClass(ClearEntryStateViewModel.class), FragmentNavigator$attachClearViewModel$viewModel$1$1.INSTANCE);
        ((ClearEntryStateViewModel) new ViewModelProvider(viewModelStore, $this$attachClearViewModel_u24lambda_u244.build(), CreationExtras.Empty.INSTANCE).get(ClearEntryStateViewModel.class)).setCompleteTransition(new WeakReference(new FragmentNavigator$attachClearViewModel$1(entry, state, this, fragment)));
    }

    public void popBackStack(NavBackStackEntry popUpTo, boolean savedState) {
        NavBackStackEntry navBackStackEntry = popUpTo;
        boolean z = savedState;
        Intrinsics.checkNotNullParameter(navBackStackEntry, "popUpTo");
        if (this.fragmentManager.isStateSaved()) {
            Log.i(TAG, "Ignoring popBackStack() call: FragmentManager has already saved its state");
            return;
        }
        List beforePopList = getState().getBackStack().getValue();
        int popUpToIndex = beforePopList.indexOf(navBackStackEntry);
        List poppedList = beforePopList.subList(popUpToIndex, beforePopList.size());
        NavBackStackEntry initialEntry = (NavBackStackEntry) CollectionsKt.first(beforePopList);
        NavBackStackEntry incomingEntry = (NavBackStackEntry) CollectionsKt.getOrNull(beforePopList, popUpToIndex - 1);
        if (incomingEntry != null) {
            addPendingOps$default(this, incomingEntry.getId(), false, false, 6, (Object) null);
        }
        Iterable $this$filter$iv = poppedList;
        Collection destination$iv$iv = new ArrayList();
        int $i$f$filterTo = 0;
        Iterator it = $this$filter$iv.iterator();
        while (true) {
            int $i$f$filterTo2 = $i$f$filterTo;
            if (!it.hasNext()) {
                break;
            }
            Object element$iv$iv = it.next();
            NavBackStackEntry entry = (NavBackStackEntry) element$iv$iv;
            Iterable $this$filter$iv2 = $this$filter$iv;
            if (SequencesKt.contains(SequencesKt.map(CollectionsKt.asSequence(this.pendingOps), FragmentNavigator$popBackStack$1$1.INSTANCE), entry.getId()) || !Intrinsics.areEqual((Object) entry.getId(), (Object) initialEntry.getId())) {
                destination$iv$iv.add(element$iv$iv);
            }
            $i$f$filterTo = $i$f$filterTo2;
            $this$filter$iv = $this$filter$iv2;
        }
        for (NavBackStackEntry entry2 : (List) destination$iv$iv) {
            addPendingOps$default(this, entry2.getId(), true, false, 4, (Object) null);
        }
        if (z) {
            for (NavBackStackEntry entry3 : CollectionsKt.reversed(poppedList)) {
                if (Intrinsics.areEqual((Object) entry3, (Object) initialEntry)) {
                    Log.i(TAG, "FragmentManager cannot save the state of the initial destination " + entry3);
                } else {
                    this.fragmentManager.saveBackStack(entry3.getId());
                    this.savedIds.add(entry3.getId());
                }
            }
        } else {
            this.fragmentManager.popBackStack(popUpTo.getId(), 1);
        }
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "Calling popWithTransition via popBackStack() on entry " + navBackStackEntry + " with savedState " + z);
        }
        getState().popWithTransition(navBackStackEntry, z);
    }

    public Destination createDestination() {
        return new Destination((Navigator<? extends Destination>) this);
    }

    @Deprecated(message = "Set a custom {@link androidx.fragment.app.FragmentFactory} via\n      {@link FragmentManager#setFragmentFactory(FragmentFactory)} to control\n      instantiation of Fragments.")
    public Fragment instantiateFragment(Context context2, FragmentManager fragmentManager2, String className, Bundle args) {
        Intrinsics.checkNotNullParameter(context2, "context");
        Intrinsics.checkNotNullParameter(fragmentManager2, "fragmentManager");
        Intrinsics.checkNotNullParameter(className, "className");
        Fragment instantiate = fragmentManager2.getFragmentFactory().instantiate(context2.getClassLoader(), className);
        Intrinsics.checkNotNullExpressionValue(instantiate, "fragmentManager.fragment…t.classLoader, className)");
        return instantiate;
    }

    public void navigate(List<NavBackStackEntry> entries, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        Intrinsics.checkNotNullParameter(entries, "entries");
        if (this.fragmentManager.isStateSaved()) {
            Log.i(TAG, "Ignoring navigate() call: FragmentManager has already saved its state");
            return;
        }
        for (NavBackStackEntry entry : entries) {
            navigate(entry, navOptions, navigatorExtras);
        }
    }

    private final void navigate(NavBackStackEntry entry, NavOptions navOptions, Navigator.Extras navigatorExtras) {
        NavBackStackEntry navBackStackEntry = entry;
        Navigator.Extras extras = navigatorExtras;
        boolean initialNavigation = getState().getBackStack().getValue().isEmpty();
        if (navOptions != null && !initialNavigation && navOptions.shouldRestoreState() && this.savedIds.remove(entry.getId())) {
            this.fragmentManager.restoreBackStack(entry.getId());
            getState().pushWithTransition(entry);
            return;
        }
        FragmentTransaction ft = createFragmentTransaction(entry, navOptions);
        if (!initialNavigation) {
            NavBackStackEntry outgoingEntry = (NavBackStackEntry) CollectionsKt.lastOrNull(getState().getBackStack().getValue());
            if (outgoingEntry != null) {
                addPendingOps$default(this, outgoingEntry.getId(), false, false, 6, (Object) null);
            }
            addPendingOps$default(this, entry.getId(), false, false, 6, (Object) null);
            ft.addToBackStack(entry.getId());
        }
        if (extras instanceof Extras) {
            for (Map.Entry next : ((Extras) extras).getSharedElements().entrySet()) {
                ft.addSharedElement((View) next.getKey(), (String) next.getValue());
            }
        }
        ft.commit();
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "Calling pushWithTransition via navigate() on entry " + entry);
        }
        getState().pushWithTransition(entry);
    }

    public void onLaunchSingleTop(NavBackStackEntry backStackEntry) {
        Intrinsics.checkNotNullParameter(backStackEntry, "backStackEntry");
        if (this.fragmentManager.isStateSaved()) {
            Log.i(TAG, "Ignoring onLaunchSingleTop() call: FragmentManager has already saved its state");
            return;
        }
        FragmentTransaction ft = createFragmentTransaction(backStackEntry, (NavOptions) null);
        List backstack = getState().getBackStack().getValue();
        if (backstack.size() > 1) {
            NavBackStackEntry incomingEntry = (NavBackStackEntry) CollectionsKt.getOrNull(backstack, CollectionsKt.getLastIndex(backstack) - 1);
            if (incomingEntry != null) {
                addPendingOps$default(this, incomingEntry.getId(), false, false, 6, (Object) null);
            }
            addPendingOps$default(this, backStackEntry.getId(), true, false, 4, (Object) null);
            this.fragmentManager.popBackStack(backStackEntry.getId(), 1);
            addPendingOps$default(this, backStackEntry.getId(), false, false, 2, (Object) null);
            ft.addToBackStack(backStackEntry.getId());
        }
        ft.commit();
        getState().onLaunchSingleTop(backStackEntry);
    }

    private final FragmentTransaction createFragmentTransaction(NavBackStackEntry entry, NavOptions navOptions) {
        NavDestination destination = entry.getDestination();
        Intrinsics.checkNotNull(destination, "null cannot be cast to non-null type androidx.navigation.fragment.FragmentNavigator.Destination");
        Bundle args = entry.getArguments();
        String className = ((Destination) destination).getClassName();
        int popExitAnim = 0;
        if (className.charAt(0) == '.') {
            className = this.context.getPackageName() + className;
        }
        Fragment frag = this.fragmentManager.getFragmentFactory().instantiate(this.context.getClassLoader(), className);
        Intrinsics.checkNotNullExpressionValue(frag, "fragmentManager.fragment…t.classLoader, className)");
        frag.setArguments(args);
        FragmentTransaction ft = this.fragmentManager.beginTransaction();
        Intrinsics.checkNotNullExpressionValue(ft, "fragmentManager.beginTransaction()");
        int enterAnim = navOptions != null ? navOptions.getEnterAnim() : -1;
        int exitAnim = navOptions != null ? navOptions.getExitAnim() : -1;
        int popEnterAnim = navOptions != null ? navOptions.getPopEnterAnim() : -1;
        int popExitAnim2 = navOptions != null ? navOptions.getPopExitAnim() : -1;
        if (!(enterAnim == -1 && exitAnim == -1 && popEnterAnim == -1 && popExitAnim2 == -1)) {
            int enterAnim2 = enterAnim != -1 ? enterAnim : 0;
            int exitAnim2 = exitAnim != -1 ? exitAnim : 0;
            int popEnterAnim2 = popEnterAnim != -1 ? popEnterAnim : 0;
            if (popExitAnim2 != -1) {
                popExitAnim = popExitAnim2;
            }
            ft.setCustomAnimations(enterAnim2, exitAnim2, popEnterAnim2, popExitAnim);
        }
        ft.replace(this.containerId, frag, entry.getId());
        ft.setPrimaryNavigationFragment(frag);
        ft.setReorderingAllowed(true);
        return ft;
    }

    public Bundle onSaveState() {
        if (this.savedIds.isEmpty()) {
            return null;
        }
        return BundleKt.bundleOf(TuplesKt.to(KEY_SAVED_IDS, new ArrayList(this.savedIds)));
    }

    public void onRestoreState(Bundle savedState) {
        Intrinsics.checkNotNullParameter(savedState, "savedState");
        ArrayList savedIds2 = savedState.getStringArrayList(KEY_SAVED_IDS);
        if (savedIds2 != null) {
            this.savedIds.clear();
            CollectionsKt.addAll(this.savedIds, savedIds2);
        }
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0017\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0015\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0018\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0018H\u0017J\u000e\u0010\u0019\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\tJ\b\u0010\u001a\u001a\u00020\tH\u0016R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\n\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u001b"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Destination;", "Landroidx/navigation/NavDestination;", "navigatorProvider", "Landroidx/navigation/NavigatorProvider;", "(Landroidx/navigation/NavigatorProvider;)V", "fragmentNavigator", "Landroidx/navigation/Navigator;", "(Landroidx/navigation/Navigator;)V", "_className", "", "className", "getClassName", "()Ljava/lang/String;", "equals", "", "other", "", "hashCode", "", "onInflate", "", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "setClassName", "toString", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: FragmentNavigator.kt */
    public static class Destination extends NavDestination {
        private String _className;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public Destination(Navigator<? extends Destination> fragmentNavigator) {
            super((Navigator<? extends NavDestination>) fragmentNavigator);
            Intrinsics.checkNotNullParameter(fragmentNavigator, "fragmentNavigator");
        }

        /* JADX INFO: this call moved to the top of the method (can break code semantics) */
        public Destination(NavigatorProvider navigatorProvider) {
            this((Navigator<? extends Destination>) navigatorProvider.getNavigator(FragmentNavigator.class));
            Intrinsics.checkNotNullParameter(navigatorProvider, "navigatorProvider");
        }

        public void onInflate(Context context, AttributeSet attrs) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(attrs, "attrs");
            super.onInflate(context, attrs);
            TypedArray $this$use$iv = context.getResources().obtainAttributes(attrs, R.styleable.FragmentNavigator);
            Intrinsics.checkNotNullExpressionValue($this$use$iv, "context.resources.obtain…leable.FragmentNavigator)");
            String className = $this$use$iv.getString(R.styleable.FragmentNavigator_android_name);
            if (className != null) {
                setClassName(className);
            }
            Unit unit = Unit.INSTANCE;
            $this$use$iv.recycle();
        }

        public final Destination setClassName(String className) {
            Intrinsics.checkNotNullParameter(className, "className");
            this._className = className;
            return this;
        }

        public final String getClassName() {
            if (this._className != null) {
                String str = this._className;
                Intrinsics.checkNotNull(str, "null cannot be cast to non-null type kotlin.String");
                return str;
            }
            throw new IllegalStateException("Fragment class was not set".toString());
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(super.toString());
            sb.append(" class=");
            if (this._className == null) {
                sb.append("null");
            } else {
                sb.append(this._className);
            }
            String sb2 = sb.toString();
            Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
            return sb2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (other == null || !(other instanceof Destination)) {
                return false;
            }
            if (!super.equals(other) || !Intrinsics.areEqual((Object) this._className, (Object) ((Destination) other)._className)) {
                return false;
            }
            return true;
        }

        public int hashCode() {
            int hashCode = super.hashCode() * 31;
            String str = this._className;
            return hashCode + (str != null ? str.hashCode() : 0);
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\fB\u001b\b\u0000\u0012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\u0010\u0006R*\u0010\u0007\u001a\u001e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\bj\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005`\tX\u0004¢\u0006\u0002\n\u0000R\u001d\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Extras;", "Landroidx/navigation/Navigator$Extras;", "sharedElements", "", "Landroid/view/View;", "", "(Ljava/util/Map;)V", "_sharedElements", "Ljava/util/LinkedHashMap;", "Lkotlin/collections/LinkedHashMap;", "getSharedElements", "()Ljava/util/Map;", "Builder", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: FragmentNavigator.kt */
    public static final class Extras implements Navigator.Extras {
        private final LinkedHashMap<View, String> _sharedElements = new LinkedHashMap<>();

        public Extras(Map<View, String> sharedElements) {
            Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
            this._sharedElements.putAll(sharedElements);
        }

        public final Map<View, String> getSharedElements() {
            return MapsKt.toMap(this._sharedElements);
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0016\u0010\b\u001a\u00020\u00002\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u0006J\u001a\u0010\u000b\u001a\u00020\u00002\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\rJ\u0006\u0010\u000e\u001a\u00020\u000fR*\u0010\u0003\u001a\u001e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004j\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006`\u0007X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Extras$Builder;", "", "()V", "_sharedElements", "Ljava/util/LinkedHashMap;", "Landroid/view/View;", "", "Lkotlin/collections/LinkedHashMap;", "addSharedElement", "sharedElement", "name", "addSharedElements", "sharedElements", "", "build", "Landroidx/navigation/fragment/FragmentNavigator$Extras;", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* compiled from: FragmentNavigator.kt */
        public static final class Builder {
            private final LinkedHashMap<View, String> _sharedElements = new LinkedHashMap<>();

            public final Builder addSharedElements(Map<View, String> sharedElements) {
                Intrinsics.checkNotNullParameter(sharedElements, "sharedElements");
                for (Map.Entry next : sharedElements.entrySet()) {
                    addSharedElement((View) next.getKey(), (String) next.getValue());
                }
                return this;
            }

            public final Builder addSharedElement(View sharedElement, String name) {
                Intrinsics.checkNotNullParameter(sharedElement, "sharedElement");
                Intrinsics.checkNotNullParameter(name, "name");
                this._sharedElements.put(sharedElement, name);
                return this;
            }

            public final Extras build() {
                return new Extras(this._sharedElements);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$Companion;", "", "()V", "KEY_SAVED_IDS", "", "TAG", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: FragmentNavigator.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u00020\u0006H\u0014R&\u0010\u0003\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00060\u00050\u0004X.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Landroidx/navigation/fragment/FragmentNavigator$ClearEntryStateViewModel;", "Landroidx/lifecycle/ViewModel;", "()V", "completeTransition", "Ljava/lang/ref/WeakReference;", "Lkotlin/Function0;", "", "getCompleteTransition", "()Ljava/lang/ref/WeakReference;", "setCompleteTransition", "(Ljava/lang/ref/WeakReference;)V", "onCleared", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: FragmentNavigator.kt */
    public static final class ClearEntryStateViewModel extends ViewModel {
        public WeakReference<Function0<Unit>> completeTransition;

        public final WeakReference<Function0<Unit>> getCompleteTransition() {
            WeakReference<Function0<Unit>> weakReference = this.completeTransition;
            if (weakReference != null) {
                return weakReference;
            }
            Intrinsics.throwUninitializedPropertyAccessException("completeTransition");
            return null;
        }

        public final void setCompleteTransition(WeakReference<Function0<Unit>> weakReference) {
            Intrinsics.checkNotNullParameter(weakReference, "<set-?>");
            this.completeTransition = weakReference;
        }

        /* access modifiers changed from: protected */
        public void onCleared() {
            super.onCleared();
            Function0 function0 = (Function0) getCompleteTransition().get();
            if (function0 != null) {
                function0.invoke();
            }
        }
    }

    static /* synthetic */ void addPendingOps$default(FragmentNavigator fragmentNavigator, String str, boolean z, boolean z2, int i, Object obj) {
        if (obj == null) {
            if ((i & 2) != 0) {
                z = false;
            }
            if ((i & 4) != 0) {
                z2 = true;
            }
            fragmentNavigator.addPendingOps(str, z, z2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addPendingOps");
    }

    private final void addPendingOps(String id, boolean isPop, boolean deduplicate) {
        if (deduplicate) {
            CollectionsKt.removeAll(this.pendingOps, new FragmentNavigator$addPendingOps$1(id));
        }
        this.pendingOps.add(TuplesKt.to(id, Boolean.valueOf(isPop)));
    }
}
