package androidx.navigation;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractSavedStateViewModelFactory;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import java.util.Set;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000¨\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 V2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0003VWXB\u001b\b\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0000\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bBQ\b\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0013\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\u0015J\u0013\u0010I\u001a\u00020B2\b\u0010J\u001a\u0004\u0018\u00010KH\u0002J\u0010\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020OH\u0007J\b\u0010P\u001a\u00020QH\u0016J\u0010\u0010R\u001a\u00020M2\u0006\u0010S\u001a\u00020\u0007H\u0007J\b\u0010T\u001a\u00020\u0013H\u0016J\b\u0010U\u001a\u00020MH\u0007R\u000e\u0010\u0016\u001a\u00020\u0017X\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u00078F¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u001a\u001a\u00020\u001b8BX\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010 \u001a\u00020!8VX\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%X\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001c\u0010\u000b\u001a\u00020\f@\u0007X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u000e\u0010\u000e\u001a\u00020\u000fX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0012\u001a\u00020\u0013¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0010\u0010\r\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\u00020/8VX\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R&\u00103\u001a\u00020\u000f2\u0006\u00102\u001a\u00020\u000f8G@GX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u00105\"\u0004\b6\u00107R\u0010\u0010\u0014\u001a\u0004\u0018\u00010\u0007X\u0004¢\u0006\u0002\n\u0000R\u001b\u00108\u001a\u0002098GX\u0002¢\u0006\f\n\u0004\b<\u0010\u001f\u001a\u0004\b:\u0010;R\u0014\u0010=\u001a\u00020>8VX\u0004¢\u0006\u0006\u001a\u0004\b?\u0010@R\u000e\u0010A\u001a\u00020BX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020DX\u0004¢\u0006\u0002\n\u0000R\u0014\u0010E\u001a\u00020F8VX\u0004¢\u0006\u0006\u001a\u0004\bG\u0010HR\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u0004¢\u0006\u0002\n\u0000¨\u0006Y"}, d2 = {"Landroidx/navigation/NavBackStackEntry;", "Landroidx/lifecycle/LifecycleOwner;", "Landroidx/lifecycle/ViewModelStoreOwner;", "Landroidx/lifecycle/HasDefaultViewModelProviderFactory;", "Landroidx/savedstate/SavedStateRegistryOwner;", "entry", "arguments", "Landroid/os/Bundle;", "(Landroidx/navigation/NavBackStackEntry;Landroid/os/Bundle;)V", "context", "Landroid/content/Context;", "destination", "Landroidx/navigation/NavDestination;", "immutableArgs", "hostLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "viewModelStoreProvider", "Landroidx/navigation/NavViewModelStoreProvider;", "id", "", "savedState", "(Landroid/content/Context;Landroidx/navigation/NavDestination;Landroid/os/Bundle;Landroidx/lifecycle/Lifecycle$State;Landroidx/navigation/NavViewModelStoreProvider;Ljava/lang/String;Landroid/os/Bundle;)V", "_lifecycle", "Landroidx/lifecycle/LifecycleRegistry;", "getArguments", "()Landroid/os/Bundle;", "defaultFactory", "Landroidx/lifecycle/SavedStateViewModelFactory;", "getDefaultFactory", "()Landroidx/lifecycle/SavedStateViewModelFactory;", "defaultFactory$delegate", "Lkotlin/Lazy;", "defaultViewModelCreationExtras", "Landroidx/lifecycle/viewmodel/CreationExtras;", "getDefaultViewModelCreationExtras", "()Landroidx/lifecycle/viewmodel/CreationExtras;", "defaultViewModelProviderFactory", "Landroidx/lifecycle/ViewModelProvider$Factory;", "getDefaultViewModelProviderFactory", "()Landroidx/lifecycle/ViewModelProvider$Factory;", "getDestination", "()Landroidx/navigation/NavDestination;", "setDestination", "(Landroidx/navigation/NavDestination;)V", "getId", "()Ljava/lang/String;", "lifecycle", "Landroidx/lifecycle/Lifecycle;", "getLifecycle", "()Landroidx/lifecycle/Lifecycle;", "maxState", "maxLifecycle", "getMaxLifecycle", "()Landroidx/lifecycle/Lifecycle$State;", "setMaxLifecycle", "(Landroidx/lifecycle/Lifecycle$State;)V", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "savedStateHandle$delegate", "savedStateRegistry", "Landroidx/savedstate/SavedStateRegistry;", "getSavedStateRegistry", "()Landroidx/savedstate/SavedStateRegistry;", "savedStateRegistryAttached", "", "savedStateRegistryController", "Landroidx/savedstate/SavedStateRegistryController;", "viewModelStore", "Landroidx/lifecycle/ViewModelStore;", "getViewModelStore", "()Landroidx/lifecycle/ViewModelStore;", "equals", "other", "", "handleLifecycleEvent", "", "event", "Landroidx/lifecycle/Lifecycle$Event;", "hashCode", "", "saveState", "outBundle", "toString", "updateState", "Companion", "NavResultSavedStateFactory", "SavedStateViewModel", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavBackStackEntry.kt */
public final class NavBackStackEntry implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private LifecycleRegistry _lifecycle;
    /* access modifiers changed from: private */
    public final Context context;
    private final Lazy defaultFactory$delegate;
    private final ViewModelProvider.Factory defaultViewModelProviderFactory;
    private NavDestination destination;
    private Lifecycle.State hostLifecycleState;
    private final String id;
    private final Bundle immutableArgs;
    private Lifecycle.State maxLifecycle;
    private final Bundle savedState;
    private final Lazy savedStateHandle$delegate;
    /* access modifiers changed from: private */
    public boolean savedStateRegistryAttached;
    private final SavedStateRegistryController savedStateRegistryController;
    private final NavViewModelStoreProvider viewModelStoreProvider;

    public /* synthetic */ NavBackStackEntry(Context context2, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context2, navDestination, bundle, state, navViewModelStoreProvider, str, bundle2);
    }

    private NavBackStackEntry(Context context2, NavDestination destination2, Bundle immutableArgs2, Lifecycle.State hostLifecycleState2, NavViewModelStoreProvider viewModelStoreProvider2, String id2, Bundle savedState2) {
        this.context = context2;
        this.destination = destination2;
        this.immutableArgs = immutableArgs2;
        this.hostLifecycleState = hostLifecycleState2;
        this.viewModelStoreProvider = viewModelStoreProvider2;
        this.id = id2;
        this.savedState = savedState2;
        this._lifecycle = new LifecycleRegistry(this);
        this.savedStateRegistryController = SavedStateRegistryController.Companion.create(this);
        this.defaultFactory$delegate = LazyKt.lazy(new NavBackStackEntry$defaultFactory$2(this));
        this.savedStateHandle$delegate = LazyKt.lazy(new NavBackStackEntry$savedStateHandle$2(this));
        this.maxLifecycle = Lifecycle.State.INITIALIZED;
        this.defaultViewModelProviderFactory = getDefaultFactory();
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    /* synthetic */ NavBackStackEntry(android.content.Context r11, androidx.navigation.NavDestination r12, android.os.Bundle r13, androidx.lifecycle.Lifecycle.State r14, androidx.navigation.NavViewModelStoreProvider r15, java.lang.String r16, android.os.Bundle r17, int r18, kotlin.jvm.internal.DefaultConstructorMarker r19) {
        /*
            r10 = this;
            r0 = r18 & 4
            r1 = 0
            if (r0 == 0) goto L_0x0007
            r5 = r1
            goto L_0x0008
        L_0x0007:
            r5 = r13
        L_0x0008:
            r0 = r18 & 8
            if (r0 == 0) goto L_0x0010
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.CREATED
            r6 = r0
            goto L_0x0011
        L_0x0010:
            r6 = r14
        L_0x0011:
            r0 = r18 & 16
            if (r0 == 0) goto L_0x0017
            r7 = r1
            goto L_0x0018
        L_0x0017:
            r7 = r15
        L_0x0018:
            r0 = r18 & 32
            if (r0 == 0) goto L_0x002b
            java.util.UUID r0 = java.util.UUID.randomUUID()
            java.lang.String r0 = r0.toString()
            java.lang.String r2 = "randomUUID().toString()"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            r8 = r0
            goto L_0x002d
        L_0x002b:
            r8 = r16
        L_0x002d:
            r0 = r18 & 64
            if (r0 == 0) goto L_0x0033
            r9 = r1
            goto L_0x0035
        L_0x0033:
            r9 = r17
        L_0x0035:
            r2 = r10
            r3 = r11
            r4 = r12
            r2.<init>(r3, r4, r5, r6, r7, r8, r9)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavBackStackEntry.<init>(android.content.Context, androidx.navigation.NavDestination, android.os.Bundle, androidx.lifecycle.Lifecycle$State, androidx.navigation.NavViewModelStoreProvider, java.lang.String, android.os.Bundle, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final NavDestination getDestination() {
        return this.destination;
    }

    public final void setDestination(NavDestination navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, "<set-?>");
        this.destination = navDestination;
    }

    public final String getId() {
        return this.id;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public /* synthetic */ NavBackStackEntry(NavBackStackEntry navBackStackEntry, Bundle bundle, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(navBackStackEntry, (i & 2) != 0 ? navBackStackEntry.getArguments() : bundle);
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NavBackStackEntry(NavBackStackEntry entry, Bundle arguments) {
        this(entry.context, entry.destination, arguments, entry.hostLifecycleState, entry.viewModelStoreProvider, entry.id, entry.savedState);
        Intrinsics.checkNotNullParameter(entry, "entry");
        this.hostLifecycleState = entry.hostLifecycleState;
        setMaxLifecycle(entry.maxLifecycle);
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002JR\u0010\u0003\u001a\u00020\u00042\b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u0012"}, d2 = {"Landroidx/navigation/NavBackStackEntry$Companion;", "", "()V", "create", "Landroidx/navigation/NavBackStackEntry;", "context", "Landroid/content/Context;", "destination", "Landroidx/navigation/NavDestination;", "arguments", "Landroid/os/Bundle;", "hostLifecycleState", "Landroidx/lifecycle/Lifecycle$State;", "viewModelStoreProvider", "Landroidx/navigation/NavViewModelStoreProvider;", "id", "", "savedState", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: NavBackStackEntry.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public static /* synthetic */ NavBackStackEntry create$default(Companion companion, Context context, NavDestination navDestination, Bundle bundle, Lifecycle.State state, NavViewModelStoreProvider navViewModelStoreProvider, String str, Bundle bundle2, int i, Object obj) {
            Bundle bundle3;
            Lifecycle.State state2;
            NavViewModelStoreProvider navViewModelStoreProvider2;
            String str2;
            Bundle bundle4;
            if ((i & 4) != 0) {
                bundle3 = null;
            } else {
                bundle3 = bundle;
            }
            if ((i & 8) != 0) {
                state2 = Lifecycle.State.CREATED;
            } else {
                state2 = state;
            }
            if ((i & 16) != 0) {
                navViewModelStoreProvider2 = null;
            } else {
                navViewModelStoreProvider2 = navViewModelStoreProvider;
            }
            if ((i & 32) != 0) {
                String uuid = UUID.randomUUID().toString();
                Intrinsics.checkNotNullExpressionValue(uuid, "randomUUID().toString()");
                str2 = uuid;
            } else {
                str2 = str;
            }
            if ((i & 64) != 0) {
                bundle4 = null;
            } else {
                bundle4 = bundle2;
            }
            return companion.create(context, navDestination, bundle3, state2, navViewModelStoreProvider2, str2, bundle4);
        }

        public final NavBackStackEntry create(Context context, NavDestination destination, Bundle arguments, Lifecycle.State hostLifecycleState, NavViewModelStoreProvider viewModelStoreProvider, String id, Bundle savedState) {
            NavDestination navDestination = destination;
            Intrinsics.checkNotNullParameter(destination, "destination");
            Intrinsics.checkNotNullParameter(hostLifecycleState, "hostLifecycleState");
            Intrinsics.checkNotNullParameter(id, "id");
            return new NavBackStackEntry(context, destination, arguments, hostLifecycleState, viewModelStoreProvider, id, savedState, (DefaultConstructorMarker) null);
        }
    }

    private final SavedStateViewModelFactory getDefaultFactory() {
        return (SavedStateViewModelFactory) this.defaultFactory$delegate.getValue();
    }

    public final Bundle getArguments() {
        if (this.immutableArgs == null) {
            return null;
        }
        return new Bundle(this.immutableArgs);
    }

    public final SavedStateHandle getSavedStateHandle() {
        return (SavedStateHandle) this.savedStateHandle$delegate.getValue();
    }

    public Lifecycle getLifecycle() {
        return this._lifecycle;
    }

    public final Lifecycle.State getMaxLifecycle() {
        return this.maxLifecycle;
    }

    public final void setMaxLifecycle(Lifecycle.State maxState) {
        Intrinsics.checkNotNullParameter(maxState, "maxState");
        this.maxLifecycle = maxState;
        updateState();
    }

    public final void handleLifecycleEvent(Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(event, NotificationCompat.CATEGORY_EVENT);
        this.hostLifecycleState = event.getTargetState();
        updateState();
    }

    public final void updateState() {
        if (!this.savedStateRegistryAttached) {
            this.savedStateRegistryController.performAttach();
            this.savedStateRegistryAttached = true;
            if (this.viewModelStoreProvider != null) {
                SavedStateHandleSupport.enableSavedStateHandles(this);
            }
            this.savedStateRegistryController.performRestore(this.savedState);
        }
        if (this.hostLifecycleState.ordinal() < this.maxLifecycle.ordinal()) {
            this._lifecycle.setCurrentState(this.hostLifecycleState);
        } else {
            this._lifecycle.setCurrentState(this.maxLifecycle);
        }
    }

    public ViewModelStore getViewModelStore() {
        if (this.savedStateRegistryAttached) {
            if (!(getLifecycle().getCurrentState() != Lifecycle.State.DESTROYED)) {
                throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString());
            } else if (this.viewModelStoreProvider != null) {
                return this.viewModelStoreProvider.getViewModelStore(this.id);
            } else {
                throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString());
            }
        } else {
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString());
        }
    }

    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return this.defaultViewModelProviderFactory;
    }

    public CreationExtras getDefaultViewModelCreationExtras() {
        Application application = null;
        MutableCreationExtras extras = new MutableCreationExtras((CreationExtras) null, 1, (DefaultConstructorMarker) null);
        Context context2 = this.context;
        Context applicationContext = context2 != null ? context2.getApplicationContext() : null;
        if (applicationContext instanceof Application) {
            application = (Application) applicationContext;
        }
        if (application != null) {
            extras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, application);
        }
        extras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        extras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        Bundle args = getArguments();
        if (args != null) {
            extras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, args);
        }
        return extras;
    }

    public SavedStateRegistry getSavedStateRegistry() {
        return this.savedStateRegistryController.getSavedStateRegistry();
    }

    public final void saveState(Bundle outBundle) {
        Intrinsics.checkNotNullParameter(outBundle, "outBundle");
        this.savedStateRegistryController.performSave(outBundle);
    }

    /* JADX WARNING: Removed duplicated region for block: B:47:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean equals(java.lang.Object r11) {
        /*
            r10 = this;
            r0 = 0
            if (r11 == 0) goto L_0x00a9
            boolean r1 = r11 instanceof androidx.navigation.NavBackStackEntry
            if (r1 != 0) goto L_0x0009
            goto L_0x00a9
        L_0x0009:
            java.lang.String r1 = r10.id
            r2 = r11
            androidx.navigation.NavBackStackEntry r2 = (androidx.navigation.NavBackStackEntry) r2
            java.lang.String r2 = r2.id
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x00a7
            androidx.navigation.NavDestination r1 = r10.destination
            r2 = r11
            androidx.navigation.NavBackStackEntry r2 = (androidx.navigation.NavBackStackEntry) r2
            androidx.navigation.NavDestination r2 = r2.destination
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x00a7
            androidx.lifecycle.Lifecycle r1 = r10.getLifecycle()
            r2 = r11
            androidx.navigation.NavBackStackEntry r2 = (androidx.navigation.NavBackStackEntry) r2
            androidx.lifecycle.Lifecycle r2 = r2.getLifecycle()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x00a7
            androidx.savedstate.SavedStateRegistry r1 = r10.getSavedStateRegistry()
            r2 = r11
            androidx.navigation.NavBackStackEntry r2 = (androidx.navigation.NavBackStackEntry) r2
            androidx.savedstate.SavedStateRegistry r2 = r2.getSavedStateRegistry()
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            if (r1 == 0) goto L_0x00a7
            android.os.Bundle r1 = r10.immutableArgs
            r2 = r11
            androidx.navigation.NavBackStackEntry r2 = (androidx.navigation.NavBackStackEntry) r2
            android.os.Bundle r2 = r2.immutableArgs
            boolean r1 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r1, (java.lang.Object) r2)
            r2 = 1
            if (r1 != 0) goto L_0x00a5
            android.os.Bundle r1 = r10.immutableArgs
            if (r1 == 0) goto L_0x00a2
            java.util.Set r1 = r1.keySet()
            if (r1 == 0) goto L_0x00a2
            java.lang.Iterable r1 = (java.lang.Iterable) r1
            r3 = 0
            boolean r4 = r1 instanceof java.util.Collection
            if (r4 == 0) goto L_0x006f
            r4 = r1
            java.util.Collection r4 = (java.util.Collection) r4
            boolean r4 = r4.isEmpty()
            if (r4 == 0) goto L_0x006f
            r1 = r2
            goto L_0x009d
        L_0x006f:
            java.util.Iterator r4 = r1.iterator()
        L_0x0073:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x009c
            java.lang.Object r5 = r4.next()
            r6 = r5
            java.lang.String r6 = (java.lang.String) r6
            r7 = 0
            android.os.Bundle r8 = r10.immutableArgs
            java.lang.Object r8 = r8.get(r6)
            r9 = r11
            androidx.navigation.NavBackStackEntry r9 = (androidx.navigation.NavBackStackEntry) r9
            android.os.Bundle r9 = r9.immutableArgs
            if (r9 == 0) goto L_0x0093
            java.lang.Object r9 = r9.get(r6)
            goto L_0x0094
        L_0x0093:
            r9 = 0
        L_0x0094:
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)
            if (r6 != 0) goto L_0x0073
            r1 = r0
            goto L_0x009d
        L_0x009c:
            r1 = r2
        L_0x009d:
            if (r1 != r2) goto L_0x00a2
            r1 = r2
            goto L_0x00a3
        L_0x00a2:
            r1 = r0
        L_0x00a3:
            if (r1 == 0) goto L_0x00a7
        L_0x00a5:
            r0 = r2
            goto L_0x00a8
        L_0x00a7:
        L_0x00a8:
            return r0
        L_0x00a9:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavBackStackEntry.equals(java.lang.Object):boolean");
    }

    public int hashCode() {
        Set<String> $this$forEach$iv;
        int result = (this.id.hashCode() * 31) + this.destination.hashCode();
        Bundle bundle = this.immutableArgs;
        if (!(bundle == null || ($this$forEach$iv = bundle.keySet()) == null)) {
            for (String it : $this$forEach$iv) {
                int i = result * 31;
                Object obj = this.immutableArgs.get(it);
                result = i + (obj != null ? obj.hashCode() : 0);
            }
        }
        return (((result * 31) + getLifecycle().hashCode()) * 31) + getSavedStateRegistry().hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append('(' + this.id + ')');
        sb.append(" destination=");
        sb.append(this.destination);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "sb.toString()");
        return sb2;
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J5\u0010\u0005\u001a\u0002H\u0006\"\b\b\u0000\u0010\u0006*\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00060\u000b2\u0006\u0010\f\u001a\u00020\rH\u0014¢\u0006\u0002\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/navigation/NavBackStackEntry$NavResultSavedStateFactory;", "Landroidx/lifecycle/AbstractSavedStateViewModelFactory;", "owner", "Landroidx/savedstate/SavedStateRegistryOwner;", "(Landroidx/savedstate/SavedStateRegistryOwner;)V", "create", "T", "Landroidx/lifecycle/ViewModel;", "key", "", "modelClass", "Ljava/lang/Class;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Ljava/lang/String;Ljava/lang/Class;Landroidx/lifecycle/SavedStateHandle;)Landroidx/lifecycle/ViewModel;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: NavBackStackEntry.kt */
    private static final class NavResultSavedStateFactory extends AbstractSavedStateViewModelFactory {
        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public NavResultSavedStateFactory(SavedStateRegistryOwner owner) {
            super(owner, (Bundle) null);
            Intrinsics.checkNotNullParameter(owner, "owner");
        }

        /* access modifiers changed from: protected */
        public <T extends ViewModel> T create(String key, Class<T> modelClass, SavedStateHandle handle) {
            Intrinsics.checkNotNullParameter(key, "key");
            Intrinsics.checkNotNullParameter(modelClass, "modelClass");
            Intrinsics.checkNotNullParameter(handle, "handle");
            return (ViewModel) new SavedStateViewModel(handle);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Landroidx/navigation/NavBackStackEntry$SavedStateViewModel;", "Landroidx/lifecycle/ViewModel;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Landroidx/lifecycle/SavedStateHandle;)V", "getHandle", "()Landroidx/lifecycle/SavedStateHandle;", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* compiled from: NavBackStackEntry.kt */
    private static final class SavedStateViewModel extends ViewModel {
        private final SavedStateHandle handle;

        public SavedStateViewModel(SavedStateHandle handle2) {
            Intrinsics.checkNotNullParameter(handle2, "handle");
            this.handle = handle2;
        }

        public final SavedStateHandle getHandle() {
            return this.handle;
        }
    }
}
