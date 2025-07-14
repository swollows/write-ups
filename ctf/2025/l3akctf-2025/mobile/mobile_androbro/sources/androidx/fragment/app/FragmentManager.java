package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import androidx.activity.OnBackPressedCallback;
import androidx.activity.OnBackPressedDispatcher;
import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.IntentSenderRequest;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.core.app.MultiWindowModeChangedInfo;
import androidx.core.app.OnMultiWindowModeChangedProvider;
import androidx.core.app.OnPictureInPictureModeChangedProvider;
import androidx.core.app.PictureInPictureModeChangedInfo;
import androidx.core.content.OnConfigurationChangedProvider;
import androidx.core.content.OnTrimMemoryProvider;
import androidx.core.util.Consumer;
import androidx.core.view.MenuHost;
import androidx.core.view.MenuProvider;
import androidx.fragment.R;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.savedstate.SavedStateRegistryOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class FragmentManager implements FragmentResultOwner {
    private static boolean DEBUG = false;
    private static final String EXTRA_CREATED_FILLIN_INTENT = "androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE";
    private static final String FRAGMENT_KEY_PREFIX = "fragment_";
    private static final String FRAGMENT_MANAGER_STATE_KEY = "state";
    public static final int POP_BACK_STACK_INCLUSIVE = 1;
    private static final String RESULT_KEY_PREFIX = "result_";
    private static final String SAVED_STATE_KEY = "android:support:fragments";
    public static final String TAG = "FragmentManager";
    ArrayList<BackStackRecord> mBackStack;
    private ArrayList<OnBackStackChangedListener> mBackStackChangeListeners;
    private final AtomicInteger mBackStackIndex = new AtomicInteger();
    private final Map<String, BackStackState> mBackStackStates = Collections.synchronizedMap(new HashMap());
    private FragmentContainer mContainer;
    private ArrayList<Fragment> mCreatedMenus;
    int mCurState = -1;
    private SpecialEffectsControllerFactory mDefaultSpecialEffectsControllerFactory = new SpecialEffectsControllerFactory() {
        public SpecialEffectsController createController(ViewGroup container) {
            return new DefaultSpecialEffectsController(container);
        }
    };
    private boolean mDestroyed;
    private Runnable mExecCommit = new Runnable() {
        public void run() {
            FragmentManager.this.execPendingActions(true);
        }
    };
    private boolean mExecutingActions;
    private FragmentFactory mFragmentFactory = null;
    /* access modifiers changed from: private */
    public final FragmentStore mFragmentStore = new FragmentStore();
    private boolean mHavePendingDeferredStart;
    private FragmentHostCallback<?> mHost;
    private FragmentFactory mHostFragmentFactory = new FragmentFactory() {
        public Fragment instantiate(ClassLoader classLoader, String className) {
            return FragmentManager.this.getHost().instantiate(FragmentManager.this.getHost().getContext(), className, (Bundle) null);
        }
    };
    ArrayDeque<LaunchedFragmentInfo> mLaunchedFragments = new ArrayDeque<>();
    private final FragmentLayoutInflaterFactory mLayoutInflaterFactory = new FragmentLayoutInflaterFactory(this);
    private final FragmentLifecycleCallbacksDispatcher mLifecycleCallbacksDispatcher = new FragmentLifecycleCallbacksDispatcher(this);
    private final MenuProvider mMenuProvider = new MenuProvider() {
        public void onPrepareMenu(Menu menu) {
            FragmentManager.this.dispatchPrepareOptionsMenu(menu);
        }

        public void onCreateMenu(Menu menu, MenuInflater menuInflater) {
            FragmentManager.this.dispatchCreateOptionsMenu(menu, menuInflater);
        }

        public boolean onMenuItemSelected(MenuItem menuItem) {
            return FragmentManager.this.dispatchOptionsItemSelected(menuItem);
        }

        public void onMenuClosed(Menu menu) {
            FragmentManager.this.dispatchOptionsMenuClosed(menu);
        }
    };
    private boolean mNeedMenuInvalidate;
    private FragmentManagerViewModel mNonConfig;
    private final CopyOnWriteArrayList<FragmentOnAttachListener> mOnAttachListeners = new CopyOnWriteArrayList<>();
    private final OnBackPressedCallback mOnBackPressedCallback = new OnBackPressedCallback(false) {
        public void handleOnBackPressed() {
            FragmentManager.this.handleOnBackPressed();
        }
    };
    private OnBackPressedDispatcher mOnBackPressedDispatcher;
    private final Consumer<Configuration> mOnConfigurationChangedListener = new FragmentManager$$ExternalSyntheticLambda0(this);
    private final Consumer<MultiWindowModeChangedInfo> mOnMultiWindowModeChangedListener = new FragmentManager$$ExternalSyntheticLambda2(this);
    private final Consumer<PictureInPictureModeChangedInfo> mOnPictureInPictureModeChangedListener = new FragmentManager$$ExternalSyntheticLambda3(this);
    private final Consumer<Integer> mOnTrimMemoryListener = new FragmentManager$$ExternalSyntheticLambda1(this);
    private Fragment mParent;
    private final ArrayList<OpGenerator> mPendingActions = new ArrayList<>();
    Fragment mPrimaryNav;
    private ActivityResultLauncher<String[]> mRequestPermissions;
    /* access modifiers changed from: private */
    public final Map<String, LifecycleAwareResultListener> mResultListeners = Collections.synchronizedMap(new HashMap());
    /* access modifiers changed from: private */
    public final Map<String, Bundle> mResults = Collections.synchronizedMap(new HashMap());
    private SpecialEffectsControllerFactory mSpecialEffectsControllerFactory = null;
    private ActivityResultLauncher<Intent> mStartActivityForResult;
    private ActivityResultLauncher<IntentSenderRequest> mStartIntentSenderForResult;
    private boolean mStateSaved;
    private boolean mStopped;
    private FragmentStrictMode.Policy mStrictModePolicy;
    private ArrayList<Fragment> mTmpAddedFragments;
    private ArrayList<Boolean> mTmpIsPop;
    private ArrayList<BackStackRecord> mTmpRecords;

    public interface BackStackEntry {
        @Deprecated
        CharSequence getBreadCrumbShortTitle();

        @Deprecated
        int getBreadCrumbShortTitleRes();

        @Deprecated
        CharSequence getBreadCrumbTitle();

        @Deprecated
        int getBreadCrumbTitleRes();

        int getId();

        String getName();
    }

    interface OpGenerator {
        boolean generateOps(ArrayList<BackStackRecord> arrayList, ArrayList<Boolean> arrayList2);
    }

    @Deprecated
    public static void enableDebugLogging(boolean enabled) {
        DEBUG = enabled;
    }

    public static boolean isLoggingEnabled(int level) {
        return DEBUG || Log.isLoggable(TAG, level);
    }

    public interface OnBackStackChangedListener {
        void onBackStackChanged();

        void onBackStackChangeStarted(Fragment fragment, boolean pop) {
        }

        void onBackStackChangeCommitted(Fragment fragment, boolean pop) {
        }
    }

    private static class LifecycleAwareResultListener implements FragmentResultListener {
        private final Lifecycle mLifecycle;
        private final FragmentResultListener mListener;
        private final LifecycleEventObserver mObserver;

        LifecycleAwareResultListener(Lifecycle lifecycle, FragmentResultListener listener, LifecycleEventObserver observer) {
            this.mLifecycle = lifecycle;
            this.mListener = listener;
            this.mObserver = observer;
        }

        public boolean isAtLeast(Lifecycle.State state) {
            return this.mLifecycle.getCurrentState().isAtLeast(state);
        }

        public void onFragmentResult(String requestKey, Bundle result) {
            this.mListener.onFragmentResult(requestKey, result);
        }

        public void removeObserver() {
            this.mLifecycle.removeObserver(this.mObserver);
        }
    }

    public static abstract class FragmentLifecycleCallbacks {
        public void onFragmentPreAttached(FragmentManager fm, Fragment f, Context context) {
        }

        public void onFragmentAttached(FragmentManager fm, Fragment f, Context context) {
        }

        public void onFragmentPreCreated(FragmentManager fm, Fragment f, Bundle savedInstanceState) {
        }

        public void onFragmentCreated(FragmentManager fm, Fragment f, Bundle savedInstanceState) {
        }

        @Deprecated
        public void onFragmentActivityCreated(FragmentManager fm, Fragment f, Bundle savedInstanceState) {
        }

        public void onFragmentViewCreated(FragmentManager fm, Fragment f, View v, Bundle savedInstanceState) {
        }

        public void onFragmentStarted(FragmentManager fm, Fragment f) {
        }

        public void onFragmentResumed(FragmentManager fm, Fragment f) {
        }

        public void onFragmentPaused(FragmentManager fm, Fragment f) {
        }

        public void onFragmentStopped(FragmentManager fm, Fragment f) {
        }

        public void onFragmentSaveInstanceState(FragmentManager fm, Fragment f, Bundle outState) {
        }

        public void onFragmentViewDestroyed(FragmentManager fm, Fragment f) {
        }

        public void onFragmentDestroyed(FragmentManager fm, Fragment f) {
        }

        public void onFragmentDetached(FragmentManager fm, Fragment f) {
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$new$0$androidx-fragment-app-FragmentManager  reason: not valid java name */
    public /* synthetic */ void m145lambda$new$0$androidxfragmentappFragmentManager(Configuration newConfig) {
        if (isParentAdded()) {
            dispatchConfigurationChanged(newConfig, false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$new$1$androidx-fragment-app-FragmentManager  reason: not valid java name */
    public /* synthetic */ void m146lambda$new$1$androidxfragmentappFragmentManager(Integer level) {
        if (isParentAdded() && level.intValue() == 80) {
            dispatchLowMemory(false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$new$2$androidx-fragment-app-FragmentManager  reason: not valid java name */
    public /* synthetic */ void m147lambda$new$2$androidxfragmentappFragmentManager(MultiWindowModeChangedInfo info) {
        if (isParentAdded()) {
            dispatchMultiWindowModeChanged(info.isInMultiWindowMode(), false);
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$new$3$androidx-fragment-app-FragmentManager  reason: not valid java name */
    public /* synthetic */ void m148lambda$new$3$androidxfragmentappFragmentManager(PictureInPictureModeChangedInfo info) {
        if (isParentAdded()) {
            dispatchPictureInPictureModeChanged(info.isInPictureInPictureMode(), false);
        }
    }

    private void throwException(RuntimeException ex) {
        Log.e(TAG, ex.getMessage());
        Log.e(TAG, "Activity state:");
        PrintWriter pw = new PrintWriter(new LogWriter(TAG));
        if (this.mHost != null) {
            try {
                this.mHost.onDump("  ", (FileDescriptor) null, pw, new String[0]);
            } catch (Exception e) {
                Log.e(TAG, "Failed dumping state", e);
            }
        } else {
            try {
                dump("  ", (FileDescriptor) null, pw, new String[0]);
            } catch (Exception e2) {
                Log.e(TAG, "Failed dumping state", e2);
            }
        }
        throw ex;
    }

    @Deprecated
    public FragmentTransaction openTransaction() {
        return beginTransaction();
    }

    public FragmentTransaction beginTransaction() {
        return new BackStackRecord(this);
    }

    public boolean executePendingTransactions() {
        boolean updates = execPendingActions(true);
        forcePostponedTransactions();
        return updates;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x001a, code lost:
        if (getBackStackEntryCount() <= 0) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0022, code lost:
        if (isPrimaryNavigation(r3.mParent) == false) goto L_0x0025;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0025, code lost:
        r2 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        r0.setEnabled(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0029, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0014, code lost:
        r0 = r3.mOnBackPressedCallback;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void updateOnBackPressedCallbackEnabled() {
        /*
            r3 = this;
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r0 = r3.mPendingActions
            monitor-enter(r0)
            java.util.ArrayList<androidx.fragment.app.FragmentManager$OpGenerator> r1 = r3.mPendingActions     // Catch:{ all -> 0x002a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x002a }
            r2 = 1
            if (r1 != 0) goto L_0x0013
            androidx.activity.OnBackPressedCallback r1 = r3.mOnBackPressedCallback     // Catch:{ all -> 0x002a }
            r1.setEnabled(r2)     // Catch:{ all -> 0x002a }
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            return
        L_0x0013:
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            androidx.activity.OnBackPressedCallback r0 = r3.mOnBackPressedCallback
            int r1 = r3.getBackStackEntryCount()
            if (r1 <= 0) goto L_0x0025
            androidx.fragment.app.Fragment r1 = r3.mParent
            boolean r1 = r3.isPrimaryNavigation(r1)
            if (r1 == 0) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            r0.setEnabled(r2)
            return
        L_0x002a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x002a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.updateOnBackPressedCallbackEnabled():void");
    }

    /* access modifiers changed from: package-private */
    public boolean isPrimaryNavigation(Fragment parent) {
        if (parent == null) {
            return true;
        }
        FragmentManager parentFragmentManager = parent.mFragmentManager;
        if (!parent.equals(parentFragmentManager.getPrimaryNavigationFragment()) || !isPrimaryNavigation(parentFragmentManager.mParent)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean isParentMenuVisible(Fragment parent) {
        if (parent == null) {
            return true;
        }
        return parent.isMenuVisible();
    }

    /* access modifiers changed from: package-private */
    public boolean isParentHidden(Fragment parent) {
        if (parent == null) {
            return false;
        }
        return parent.isHidden();
    }

    /* access modifiers changed from: package-private */
    public void handleOnBackPressed() {
        execPendingActions(true);
        if (this.mOnBackPressedCallback.isEnabled()) {
            popBackStackImmediate();
        } else {
            this.mOnBackPressedDispatcher.onBackPressed();
        }
    }

    public void restoreBackStack(String name) {
        enqueueAction(new RestoreBackStackState(name), false);
    }

    public void saveBackStack(String name) {
        enqueueAction(new SaveBackStackState(name), false);
    }

    public void clearBackStack(String name) {
        enqueueAction(new ClearBackStackState(name), false);
    }

    public void popBackStack() {
        enqueueAction(new PopBackStackState((String) null, -1, 0), false);
    }

    public boolean popBackStackImmediate() {
        return popBackStackImmediate((String) null, -1, 0);
    }

    public void popBackStack(String name, int flags) {
        enqueueAction(new PopBackStackState(name, -1, flags), false);
    }

    public boolean popBackStackImmediate(String name, int flags) {
        return popBackStackImmediate(name, -1, flags);
    }

    public void popBackStack(int id, int flags) {
        popBackStack(id, flags, false);
    }

    /* access modifiers changed from: package-private */
    public void popBackStack(int id, int flags, boolean allowStateLoss) {
        if (id >= 0) {
            enqueueAction(new PopBackStackState((String) null, id, flags), allowStateLoss);
            return;
        }
        throw new IllegalArgumentException("Bad id: " + id);
    }

    public boolean popBackStackImmediate(int id, int flags) {
        if (id >= 0) {
            return popBackStackImmediate((String) null, id, flags);
        }
        throw new IllegalArgumentException("Bad id: " + id);
    }

    private boolean popBackStackImmediate(String name, int id, int flags) {
        execPendingActions(false);
        ensureExecReady(true);
        if (this.mPrimaryNav != null && id < 0 && name == null && this.mPrimaryNav.getChildFragmentManager().popBackStackImmediate()) {
            return true;
        }
        boolean executePop = popBackStackState(this.mTmpRecords, this.mTmpIsPop, name, id, flags);
        if (executePop) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
            } finally {
                cleanupExec();
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        this.mFragmentStore.burpActive();
        return executePop;
    }

    public int getBackStackEntryCount() {
        if (this.mBackStack != null) {
            return this.mBackStack.size();
        }
        return 0;
    }

    public BackStackEntry getBackStackEntryAt(int index) {
        return this.mBackStack.get(index);
    }

    public void addOnBackStackChangedListener(OnBackStackChangedListener listener) {
        if (this.mBackStackChangeListeners == null) {
            this.mBackStackChangeListeners = new ArrayList<>();
        }
        this.mBackStackChangeListeners.add(listener);
    }

    public void removeOnBackStackChangedListener(OnBackStackChangedListener listener) {
        if (this.mBackStackChangeListeners != null) {
            this.mBackStackChangeListeners.remove(listener);
        }
    }

    public final void setFragmentResult(String requestKey, Bundle result) {
        LifecycleAwareResultListener resultListener = this.mResultListeners.get(requestKey);
        if (resultListener == null || !resultListener.isAtLeast(Lifecycle.State.STARTED)) {
            this.mResults.put(requestKey, result);
        } else {
            resultListener.onFragmentResult(requestKey, result);
        }
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "Setting fragment result with key " + requestKey + " and result " + result);
        }
    }

    public final void clearFragmentResult(String requestKey) {
        this.mResults.remove(requestKey);
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "Clearing fragment result with key " + requestKey);
        }
    }

    public final void setFragmentResultListener(final String requestKey, LifecycleOwner lifecycleOwner, final FragmentResultListener listener) {
        final Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState() != Lifecycle.State.DESTROYED) {
            LifecycleEventObserver observer = new LifecycleEventObserver() {
                public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                    Bundle storedResult;
                    if (event == Lifecycle.Event.ON_START && (storedResult = (Bundle) FragmentManager.this.mResults.get(requestKey)) != null) {
                        listener.onFragmentResult(requestKey, storedResult);
                        FragmentManager.this.clearFragmentResult(requestKey);
                    }
                    if (event == Lifecycle.Event.ON_DESTROY) {
                        lifecycle.removeObserver(this);
                        FragmentManager.this.mResultListeners.remove(requestKey);
                    }
                }
            };
            LifecycleAwareResultListener storedListener = this.mResultListeners.put(requestKey, new LifecycleAwareResultListener(lifecycle, listener, observer));
            if (storedListener != null) {
                storedListener.removeObserver();
            }
            if (isLoggingEnabled(2)) {
                Log.v(TAG, "Setting FragmentResultListener with key " + requestKey + " lifecycleOwner " + lifecycle + " and listener " + listener);
            }
            lifecycle.addObserver(observer);
        }
    }

    public final void clearFragmentResultListener(String requestKey) {
        LifecycleAwareResultListener listener = this.mResultListeners.remove(requestKey);
        if (listener != null) {
            listener.removeObserver();
        }
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "Clearing FragmentResultListener for key " + requestKey);
        }
    }

    public void putFragment(Bundle bundle, String key, Fragment fragment) {
        if (fragment.mFragmentManager != this) {
            throwException(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        bundle.putString(key, fragment.mWho);
    }

    public Fragment getFragment(Bundle bundle, String key) {
        String who = bundle.getString(key);
        if (who == null) {
            return null;
        }
        Fragment f = findActiveFragment(who);
        if (f == null) {
            throwException(new IllegalStateException("Fragment no longer exists for key " + key + ": unique id " + who));
        }
        return f;
    }

    public static <F extends Fragment> F findFragment(View view) {
        Fragment fragment = findViewFragment(view);
        if (fragment != null) {
            return fragment;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }

    /* JADX WARNING: type inference failed for: r2v0, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Unknown variable types count: 1 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static androidx.fragment.app.Fragment findViewFragment(android.view.View r4) {
        /*
        L_0x0001:
            r0 = 0
            if (r4 == 0) goto L_0x0018
            androidx.fragment.app.Fragment r1 = getViewFragment(r4)
            if (r1 == 0) goto L_0x000b
            return r1
        L_0x000b:
            android.view.ViewParent r2 = r4.getParent()
            boolean r3 = r2 instanceof android.view.View
            if (r3 == 0) goto L_0x0016
            r0 = r2
            android.view.View r0 = (android.view.View) r0
        L_0x0016:
            r4 = r0
            goto L_0x0001
        L_0x0018:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.findViewFragment(android.view.View):androidx.fragment.app.Fragment");
    }

    static Fragment getViewFragment(View view) {
        Object tag = view.getTag(R.id.fragment_container_view_tag);
        if (tag instanceof Fragment) {
            return (Fragment) tag;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void onContainerAvailable(FragmentContainerView container) {
        for (FragmentStateManager fragmentStateManager : this.mFragmentStore.getActiveFragmentStateManagers()) {
            Fragment fragment = fragmentStateManager.getFragment();
            if (fragment.mContainerId == container.getId() && fragment.mView != null && fragment.mView.getParent() == null) {
                fragment.mContainer = container;
                fragmentStateManager.addViewToContainer();
            }
        }
    }

    static FragmentManager findFragmentManager(View view) {
        Fragment fragment = findViewFragment(view);
        if (fragment == null) {
            Context context = view.getContext();
            FragmentActivity fragmentActivity = null;
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    break;
                } else if (context instanceof FragmentActivity) {
                    fragmentActivity = (FragmentActivity) context;
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            if (fragmentActivity != null) {
                return fragmentActivity.getSupportFragmentManager();
            }
            throw new IllegalStateException("View " + view + " is not within a subclass of FragmentActivity.");
        } else if (fragment.isAdded()) {
            return fragment.getChildFragmentManager();
        } else {
            throw new IllegalStateException("The Fragment " + fragment + " that owns View " + view + " has already been destroyed. Nested fragments should always use the child FragmentManager.");
        }
    }

    public List<Fragment> getFragments() {
        return this.mFragmentStore.getFragments();
    }

    /* access modifiers changed from: package-private */
    public ViewModelStore getViewModelStore(Fragment f) {
        return this.mNonConfig.getViewModelStore(f);
    }

    private FragmentManagerViewModel getChildNonConfig(Fragment f) {
        return this.mNonConfig.getChildNonConfig(f);
    }

    /* access modifiers changed from: package-private */
    public void addRetainedFragment(Fragment f) {
        this.mNonConfig.addRetainedFragment(f);
    }

    /* access modifiers changed from: package-private */
    public void removeRetainedFragment(Fragment f) {
        this.mNonConfig.removeRetainedFragment(f);
    }

    /* access modifiers changed from: package-private */
    public List<Fragment> getActiveFragments() {
        return this.mFragmentStore.getActiveFragments();
    }

    /* access modifiers changed from: package-private */
    public int getActiveFragmentCount() {
        return this.mFragmentStore.getActiveFragmentCount();
    }

    public Fragment.SavedState saveFragmentInstanceState(Fragment fragment) {
        FragmentStateManager fragmentStateManager = this.mFragmentStore.getFragmentStateManager(fragment.mWho);
        if (fragmentStateManager == null || !fragmentStateManager.getFragment().equals(fragment)) {
            throwException(new IllegalStateException("Fragment " + fragment + " is not currently in the FragmentManager"));
        }
        return fragmentStateManager.saveInstanceState();
    }

    private void clearBackStackStateViewModels() {
        boolean shouldClear;
        if (this.mHost instanceof ViewModelStoreOwner) {
            shouldClear = this.mFragmentStore.getNonConfig().isCleared();
        } else if (this.mHost.getContext() instanceof Activity) {
            shouldClear = !((Activity) this.mHost.getContext()).isChangingConfigurations();
        } else {
            shouldClear = true;
        }
        if (shouldClear) {
            for (BackStackState backStackState : this.mBackStackStates.values()) {
                for (String who : backStackState.mFragments) {
                    this.mFragmentStore.getNonConfig().clearNonConfigState(who, false);
                }
            }
        }
    }

    public boolean isDestroyed() {
        return this.mDestroyed;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append("FragmentManager{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append(" in ");
        if (this.mParent != null) {
            sb.append(this.mParent.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.mParent)));
            sb.append("}");
        } else if (this.mHost != null) {
            sb.append(this.mHost.getClass().getSimpleName());
            sb.append("{");
            sb.append(Integer.toHexString(System.identityHashCode(this.mHost)));
            sb.append("}");
        } else {
            sb.append("null");
        }
        sb.append("}}");
        return sb.toString();
    }

    public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        int count;
        int count2;
        String innerPrefix = prefix + "    ";
        this.mFragmentStore.dump(prefix, fd, writer, args);
        if (this.mCreatedMenus != null && (count2 = this.mCreatedMenus.size()) > 0) {
            writer.print(prefix);
            writer.println("Fragments Created Menus:");
            for (int i = 0; i < count2; i++) {
                writer.print(prefix);
                writer.print("  #");
                writer.print(i);
                writer.print(": ");
                writer.println(this.mCreatedMenus.get(i).toString());
            }
        }
        if (this.mBackStack != null && (count = this.mBackStack.size()) > 0) {
            writer.print(prefix);
            writer.println("Back Stack:");
            for (int i2 = 0; i2 < count; i2++) {
                BackStackRecord bs = this.mBackStack.get(i2);
                writer.print(prefix);
                writer.print("  #");
                writer.print(i2);
                writer.print(": ");
                writer.println(bs.toString());
                bs.dump(innerPrefix, writer);
            }
        }
        writer.print(prefix);
        writer.println("Back Stack Index: " + this.mBackStackIndex.get());
        synchronized (this.mPendingActions) {
            int count3 = this.mPendingActions.size();
            if (count3 > 0) {
                writer.print(prefix);
                writer.println("Pending Actions:");
                for (int i3 = 0; i3 < count3; i3++) {
                    writer.print(prefix);
                    writer.print("  #");
                    writer.print(i3);
                    writer.print(": ");
                    writer.println(this.mPendingActions.get(i3));
                }
            }
        }
        writer.print(prefix);
        writer.println("FragmentManager misc state:");
        writer.print(prefix);
        writer.print("  mHost=");
        writer.println(this.mHost);
        writer.print(prefix);
        writer.print("  mContainer=");
        writer.println(this.mContainer);
        if (this.mParent != null) {
            writer.print(prefix);
            writer.print("  mParent=");
            writer.println(this.mParent);
        }
        writer.print(prefix);
        writer.print("  mCurState=");
        writer.print(this.mCurState);
        writer.print(" mStateSaved=");
        writer.print(this.mStateSaved);
        writer.print(" mStopped=");
        writer.print(this.mStopped);
        writer.print(" mDestroyed=");
        writer.println(this.mDestroyed);
        if (this.mNeedMenuInvalidate) {
            writer.print(prefix);
            writer.print("  mNeedMenuInvalidate=");
            writer.println(this.mNeedMenuInvalidate);
        }
    }

    /* access modifiers changed from: package-private */
    public void performPendingDeferredStart(FragmentStateManager fragmentStateManager) {
        Fragment f = fragmentStateManager.getFragment();
        if (!f.mDeferStart) {
            return;
        }
        if (this.mExecutingActions) {
            this.mHavePendingDeferredStart = true;
            return;
        }
        f.mDeferStart = false;
        fragmentStateManager.moveToExpectedState();
    }

    /* access modifiers changed from: package-private */
    public boolean isStateAtLeast(int state) {
        return this.mCurState >= state;
    }

    /* access modifiers changed from: package-private */
    public void setExitAnimationOrder(Fragment f, boolean isPop) {
        ViewGroup container = getFragmentContainer(f);
        if (container != null && (container instanceof FragmentContainerView)) {
            ((FragmentContainerView) container).setDrawDisappearingViewsLast(!isPop);
        }
    }

    /* access modifiers changed from: package-private */
    public void moveToState(int newState, boolean always) {
        if (this.mHost == null && newState != -1) {
            throw new IllegalStateException("No activity");
        } else if (always || newState != this.mCurState) {
            this.mCurState = newState;
            this.mFragmentStore.moveToExpectedState();
            startPendingDeferredFragments();
            if (this.mNeedMenuInvalidate && this.mHost != null && this.mCurState == 7) {
                this.mHost.onSupportInvalidateOptionsMenu();
                this.mNeedMenuInvalidate = false;
            }
        }
    }

    private void startPendingDeferredFragments() {
        for (FragmentStateManager fragmentStateManager : this.mFragmentStore.getActiveFragmentStateManagers()) {
            performPendingDeferredStart(fragmentStateManager);
        }
    }

    /* access modifiers changed from: package-private */
    public FragmentStateManager createOrGetFragmentStateManager(Fragment f) {
        FragmentStateManager existing = this.mFragmentStore.getFragmentStateManager(f.mWho);
        if (existing != null) {
            return existing;
        }
        FragmentStateManager fragmentStateManager = new FragmentStateManager(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, f);
        fragmentStateManager.restoreState(this.mHost.getContext().getClassLoader());
        fragmentStateManager.setFragmentManagerState(this.mCurState);
        return fragmentStateManager;
    }

    /* access modifiers changed from: package-private */
    public FragmentStateManager addFragment(Fragment fragment) {
        if (fragment.mPreviousWho != null) {
            FragmentStrictMode.onFragmentReuse(fragment, fragment.mPreviousWho);
        }
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "add: " + fragment);
        }
        FragmentStateManager fragmentStateManager = createOrGetFragmentStateManager(fragment);
        fragment.mFragmentManager = this;
        this.mFragmentStore.makeActive(fragmentStateManager);
        if (!fragment.mDetached) {
            this.mFragmentStore.addFragment(fragment);
            fragment.mRemoving = false;
            if (fragment.mView == null) {
                fragment.mHiddenChanged = false;
            }
            if (isMenuAvailable(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
        }
        return fragmentStateManager;
    }

    /* access modifiers changed from: package-private */
    public void removeFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "remove: " + fragment + " nesting=" + fragment.mBackStackNesting);
        }
        boolean inactive = !fragment.isInBackStack();
        if (!fragment.mDetached || inactive) {
            this.mFragmentStore.removeFragment(fragment);
            if (isMenuAvailable(fragment)) {
                this.mNeedMenuInvalidate = true;
            }
            fragment.mRemoving = true;
            setVisibleRemovingFragment(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public void hideFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "hide: " + fragment);
        }
        if (!fragment.mHidden) {
            fragment.mHidden = true;
            fragment.mHiddenChanged = true ^ fragment.mHiddenChanged;
            setVisibleRemovingFragment(fragment);
        }
    }

    /* access modifiers changed from: package-private */
    public void showFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "show: " + fragment);
        }
        if (fragment.mHidden) {
            fragment.mHidden = false;
            fragment.mHiddenChanged = !fragment.mHiddenChanged;
        }
    }

    /* access modifiers changed from: package-private */
    public void detachFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "detach: " + fragment);
        }
        if (!fragment.mDetached) {
            fragment.mDetached = true;
            if (fragment.mAdded) {
                if (isLoggingEnabled(2)) {
                    Log.v(TAG, "remove from detach: " + fragment);
                }
                this.mFragmentStore.removeFragment(fragment);
                if (isMenuAvailable(fragment)) {
                    this.mNeedMenuInvalidate = true;
                }
                setVisibleRemovingFragment(fragment);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void attachFragment(Fragment fragment) {
        if (isLoggingEnabled(2)) {
            Log.v(TAG, "attach: " + fragment);
        }
        if (fragment.mDetached) {
            fragment.mDetached = false;
            if (!fragment.mAdded) {
                this.mFragmentStore.addFragment(fragment);
                if (isLoggingEnabled(2)) {
                    Log.v(TAG, "add from attach: " + fragment);
                }
                if (isMenuAvailable(fragment)) {
                    this.mNeedMenuInvalidate = true;
                }
            }
        }
    }

    public Fragment findFragmentById(int id) {
        return this.mFragmentStore.findFragmentById(id);
    }

    public Fragment findFragmentByTag(String tag) {
        return this.mFragmentStore.findFragmentByTag(tag);
    }

    /* access modifiers changed from: package-private */
    public Fragment findFragmentByWho(String who) {
        return this.mFragmentStore.findFragmentByWho(who);
    }

    /* access modifiers changed from: package-private */
    public Fragment findActiveFragment(String who) {
        return this.mFragmentStore.findActiveFragment(who);
    }

    private void checkStateLoss() {
        if (isStateSaved()) {
            throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
    }

    public boolean isStateSaved() {
        return this.mStateSaved || this.mStopped;
    }

    /* access modifiers changed from: package-private */
    public void enqueueAction(OpGenerator action, boolean allowStateLoss) {
        if (!allowStateLoss) {
            if (this.mHost != null) {
                checkStateLoss();
            } else if (this.mDestroyed) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            } else {
                throw new IllegalStateException("FragmentManager has not been attached to a host.");
            }
        }
        synchronized (this.mPendingActions) {
            if (this.mHost != null) {
                this.mPendingActions.add(action);
                scheduleCommit();
            } else if (!allowStateLoss) {
                throw new IllegalStateException("Activity has been destroyed");
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void scheduleCommit() {
        synchronized (this.mPendingActions) {
            boolean pendingReady = true;
            if (this.mPendingActions.size() != 1) {
                pendingReady = false;
            }
            if (pendingReady) {
                this.mHost.getHandler().removeCallbacks(this.mExecCommit);
                this.mHost.getHandler().post(this.mExecCommit);
                updateOnBackPressedCallbackEnabled();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public int allocBackStackIndex() {
        return this.mBackStackIndex.getAndIncrement();
    }

    private void ensureExecReady(boolean allowStateLoss) {
        if (this.mExecutingActions) {
            throw new IllegalStateException("FragmentManager is already executing transactions");
        } else if (this.mHost == null) {
            if (this.mDestroyed) {
                throw new IllegalStateException("FragmentManager has been destroyed");
            }
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
        } else if (Looper.myLooper() == this.mHost.getHandler().getLooper()) {
            if (!allowStateLoss) {
                checkStateLoss();
            }
            if (this.mTmpRecords == null) {
                this.mTmpRecords = new ArrayList<>();
                this.mTmpIsPop = new ArrayList<>();
            }
        } else {
            throw new IllegalStateException("Must be called from main thread of fragment host");
        }
    }

    /* access modifiers changed from: package-private */
    public void execSingleAction(OpGenerator action, boolean allowStateLoss) {
        if (!allowStateLoss || (this.mHost != null && !this.mDestroyed)) {
            ensureExecReady(allowStateLoss);
            if (action.generateOps(this.mTmpRecords, this.mTmpIsPop)) {
                this.mExecutingActions = true;
                try {
                    removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
                } finally {
                    cleanupExec();
                }
            }
            updateOnBackPressedCallbackEnabled();
            doPendingDeferredStart();
            this.mFragmentStore.burpActive();
        }
    }

    private void cleanupExec() {
        this.mExecutingActions = false;
        this.mTmpIsPop.clear();
        this.mTmpRecords.clear();
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public boolean execPendingActions(boolean allowStateLoss) {
        ensureExecReady(allowStateLoss);
        boolean didSomething = false;
        while (generateOpsForPendingActions(this.mTmpRecords, this.mTmpIsPop)) {
            this.mExecutingActions = true;
            try {
                removeRedundantOperationsAndExecute(this.mTmpRecords, this.mTmpIsPop);
                cleanupExec();
                didSomething = true;
            } catch (Throwable th) {
                cleanupExec();
                throw th;
            }
        }
        updateOnBackPressedCallbackEnabled();
        doPendingDeferredStart();
        this.mFragmentStore.burpActive();
        return didSomething;
    }

    private void removeRedundantOperationsAndExecute(ArrayList<BackStackRecord> records, ArrayList<Boolean> isRecordPop) {
        if (!records.isEmpty()) {
            if (records.size() == isRecordPop.size()) {
                int numRecords = records.size();
                int startIndex = 0;
                int recordNum = 0;
                while (recordNum < numRecords) {
                    if (!records.get(recordNum).mReorderingAllowed) {
                        if (startIndex != recordNum) {
                            executeOpsTogether(records, isRecordPop, startIndex, recordNum);
                        }
                        int reorderingEnd = recordNum + 1;
                        if (isRecordPop.get(recordNum).booleanValue()) {
                            while (reorderingEnd < numRecords && isRecordPop.get(reorderingEnd).booleanValue() && !records.get(reorderingEnd).mReorderingAllowed) {
                                reorderingEnd++;
                            }
                        }
                        executeOpsTogether(records, isRecordPop, recordNum, reorderingEnd);
                        startIndex = reorderingEnd;
                        recordNum = reorderingEnd - 1;
                    }
                    recordNum++;
                }
                if (startIndex != numRecords) {
                    executeOpsTogether(records, isRecordPop, startIndex, numRecords);
                    return;
                }
                return;
            }
            throw new IllegalStateException("Internal error with the back stack records");
        }
    }

    private void executeOpsTogether(ArrayList<BackStackRecord> records, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex) {
        boolean allowReordering = records.get(startIndex).mReorderingAllowed;
        boolean addToBackStack = false;
        if (this.mTmpAddedFragments == null) {
            this.mTmpAddedFragments = new ArrayList<>();
        } else {
            this.mTmpAddedFragments.clear();
        }
        this.mTmpAddedFragments.addAll(this.mFragmentStore.getFragments());
        Fragment oldPrimaryNav = getPrimaryNavigationFragment();
        int recordNum = startIndex;
        while (true) {
            boolean z = true;
            if (recordNum >= endIndex) {
                break;
            }
            BackStackRecord record = records.get(recordNum);
            if (!isRecordPop.get(recordNum).booleanValue()) {
                oldPrimaryNav = record.expandOps(this.mTmpAddedFragments, oldPrimaryNav);
            } else {
                oldPrimaryNav = record.trackAddedFragmentsInPop(this.mTmpAddedFragments, oldPrimaryNav);
            }
            if (!addToBackStack && !record.mAddToBackStack) {
                z = false;
            }
            addToBackStack = z;
            recordNum++;
        }
        this.mTmpAddedFragments.clear();
        if (!allowReordering && this.mCurState >= 1) {
            for (int index = startIndex; index < endIndex; index++) {
                Iterator it = records.get(index).mOps.iterator();
                while (it.hasNext()) {
                    Fragment fragment = ((FragmentTransaction.Op) it.next()).mFragment;
                    if (!(fragment == null || fragment.mFragmentManager == null)) {
                        this.mFragmentStore.makeActive(createOrGetFragmentStateManager(fragment));
                    }
                }
            }
        }
        executeOps(records, isRecordPop, startIndex, endIndex);
        boolean isPop = isRecordPop.get(endIndex - 1).booleanValue();
        if (addToBackStack && this.mBackStackChangeListeners != null && !this.mBackStackChangeListeners.isEmpty()) {
            Set<Fragment> fragments = new LinkedHashSet<>();
            Iterator<BackStackRecord> it2 = records.iterator();
            while (it2.hasNext()) {
                fragments.addAll(fragmentsFromRecord(it2.next()));
            }
            Iterator<OnBackStackChangedListener> it3 = this.mBackStackChangeListeners.iterator();
            while (it3.hasNext()) {
                OnBackStackChangedListener listener = it3.next();
                for (Fragment fragment2 : fragments) {
                    listener.onBackStackChangeStarted(fragment2, isPop);
                }
            }
            Iterator<OnBackStackChangedListener> it4 = this.mBackStackChangeListeners.iterator();
            while (it4.hasNext()) {
                OnBackStackChangedListener listener2 = it4.next();
                for (Fragment fragment3 : fragments) {
                    listener2.onBackStackChangeCommitted(fragment3, isPop);
                }
            }
        }
        for (int index2 = startIndex; index2 < endIndex; index2++) {
            BackStackRecord record2 = records.get(index2);
            if (isPop) {
                for (int opIndex = record2.mOps.size() - 1; opIndex >= 0; opIndex--) {
                    Fragment fragment4 = ((FragmentTransaction.Op) record2.mOps.get(opIndex)).mFragment;
                    if (fragment4 != null) {
                        createOrGetFragmentStateManager(fragment4).moveToExpectedState();
                    }
                }
            } else {
                Iterator it5 = record2.mOps.iterator();
                while (it5.hasNext()) {
                    Fragment fragment5 = ((FragmentTransaction.Op) it5.next()).mFragment;
                    if (fragment5 != null) {
                        createOrGetFragmentStateManager(fragment5).moveToExpectedState();
                    }
                }
            }
        }
        moveToState(this.mCurState, true);
        for (SpecialEffectsController controller : collectChangedControllers(records, startIndex, endIndex)) {
            controller.updateOperationDirection(isPop);
            controller.markPostponedState();
            controller.executePendingOperations();
        }
        for (int recordNum2 = startIndex; recordNum2 < endIndex; recordNum2++) {
            BackStackRecord record3 = records.get(recordNum2);
            if (isRecordPop.get(recordNum2).booleanValue() && record3.mIndex >= 0) {
                record3.mIndex = -1;
            }
            record3.runOnCommitRunnables();
        }
        if (addToBackStack) {
            reportBackStackChanged();
        }
    }

    private Set<SpecialEffectsController> collectChangedControllers(ArrayList<BackStackRecord> records, int startIndex, int endIndex) {
        ViewGroup container;
        Set<SpecialEffectsController> controllers = new HashSet<>();
        for (int index = startIndex; index < endIndex; index++) {
            Iterator it = records.get(index).mOps.iterator();
            while (it.hasNext()) {
                Fragment fragment = ((FragmentTransaction.Op) it.next()).mFragment;
                if (!(fragment == null || (container = fragment.mContainer) == null)) {
                    controllers.add(SpecialEffectsController.getOrCreateController(container, this));
                }
            }
        }
        return controllers;
    }

    private static void executeOps(ArrayList<BackStackRecord> records, ArrayList<Boolean> isRecordPop, int startIndex, int endIndex) {
        for (int i = startIndex; i < endIndex; i++) {
            BackStackRecord record = records.get(i);
            if (isRecordPop.get(i).booleanValue()) {
                record.bumpBackStackNesting(-1);
                record.executePopOps();
            } else {
                record.bumpBackStackNesting(1);
                record.executeOps();
            }
        }
    }

    private void setVisibleRemovingFragment(Fragment f) {
        ViewGroup container = getFragmentContainer(f);
        if (container != null && f.getEnterAnim() + f.getExitAnim() + f.getPopEnterAnim() + f.getPopExitAnim() > 0) {
            if (container.getTag(R.id.visible_removing_fragment_view_tag) == null) {
                container.setTag(R.id.visible_removing_fragment_view_tag, f);
            }
            ((Fragment) container.getTag(R.id.visible_removing_fragment_view_tag)).setPopDirection(f.getPopDirection());
        }
    }

    private ViewGroup getFragmentContainer(Fragment f) {
        if (f.mContainer != null) {
            return f.mContainer;
        }
        if (f.mContainerId > 0 && this.mContainer.onHasView()) {
            View view = this.mContainer.onFindViewById(f.mContainerId);
            if (view instanceof ViewGroup) {
                return (ViewGroup) view;
            }
        }
        return null;
    }

    private void forcePostponedTransactions() {
        for (SpecialEffectsController controller : collectAllSpecialEffectsController()) {
            controller.forcePostponedExecutePendingOperations();
        }
    }

    private void endAnimatingAwayFragments() {
        for (SpecialEffectsController controller : collectAllSpecialEffectsController()) {
            controller.forceCompleteAllOperations();
        }
    }

    private Set<SpecialEffectsController> collectAllSpecialEffectsController() {
        Set<SpecialEffectsController> controllers = new HashSet<>();
        for (FragmentStateManager fragmentStateManager : this.mFragmentStore.getActiveFragmentStateManagers()) {
            ViewGroup container = fragmentStateManager.getFragment().mContainer;
            if (container != null) {
                controllers.add(SpecialEffectsController.getOrCreateController(container, getSpecialEffectsControllerFactory()));
            }
        }
        return controllers;
    }

    private boolean generateOpsForPendingActions(ArrayList<BackStackRecord> records, ArrayList<Boolean> isPop) {
        boolean didSomething = false;
        synchronized (this.mPendingActions) {
            if (this.mPendingActions.isEmpty()) {
                return false;
            }
            try {
                int numActions = this.mPendingActions.size();
                for (int i = 0; i < numActions; i++) {
                    didSomething |= this.mPendingActions.get(i).generateOps(records, isPop);
                }
                return didSomething;
            } finally {
                this.mPendingActions.clear();
                this.mHost.getHandler().removeCallbacks(this.mExecCommit);
            }
        }
    }

    private void doPendingDeferredStart() {
        if (this.mHavePendingDeferredStart) {
            this.mHavePendingDeferredStart = false;
            startPendingDeferredFragments();
        }
    }

    private void reportBackStackChanged() {
        if (this.mBackStackChangeListeners != null) {
            for (int i = 0; i < this.mBackStackChangeListeners.size(); i++) {
                this.mBackStackChangeListeners.get(i).onBackStackChanged();
            }
        }
    }

    private Set<Fragment> fragmentsFromRecord(BackStackRecord record) {
        Set<Fragment> fragments = new HashSet<>();
        for (int i = 0; i < record.mOps.size(); i++) {
            Fragment f = ((FragmentTransaction.Op) record.mOps.get(i)).mFragment;
            if (f != null && record.mAddToBackStack) {
                fragments.add(f);
            }
        }
        return fragments;
    }

    /* access modifiers changed from: package-private */
    public void addBackStackState(BackStackRecord state) {
        if (this.mBackStack == null) {
            this.mBackStack = new ArrayList<>();
        }
        this.mBackStack.add(state);
    }

    /* access modifiers changed from: package-private */
    public boolean restoreBackStackState(ArrayList<BackStackRecord> records, ArrayList<Boolean> isRecordPop, String name) {
        BackStackState backStackState = this.mBackStackStates.remove(name);
        if (backStackState == null) {
            return false;
        }
        HashMap<String, Fragment> pendingSavedFragments = new HashMap<>();
        Iterator<BackStackRecord> it = records.iterator();
        while (it.hasNext()) {
            BackStackRecord record = it.next();
            if (record.mBeingSaved) {
                Iterator it2 = record.mOps.iterator();
                while (it2.hasNext()) {
                    FragmentTransaction.Op op = (FragmentTransaction.Op) it2.next();
                    if (op.mFragment != null) {
                        pendingSavedFragments.put(op.mFragment.mWho, op.mFragment);
                    }
                }
            }
        }
        boolean added = false;
        for (BackStackRecord record2 : backStackState.instantiate(this, pendingSavedFragments)) {
            added = record2.generateOps(records, isRecordPop) || added;
        }
        return added;
    }

    /* access modifiers changed from: package-private */
    public boolean saveBackStackState(ArrayList<BackStackRecord> records, ArrayList<Boolean> isRecordPop, String name) {
        String str;
        String str2;
        String str3 = name;
        int index = findBackStackIndex(str3, -1, true);
        if (index < 0) {
            return false;
        }
        for (int i = index; i < this.mBackStack.size(); i++) {
            BackStackRecord record = this.mBackStack.get(i);
            if (!record.mReorderingAllowed) {
                throwException(new IllegalArgumentException("saveBackStack(\"" + str3 + "\") included FragmentTransactions must use setReorderingAllowed(true) to ensure that the back stack can be restored as an atomic operation. Found " + record + " that did not use setReorderingAllowed(true)."));
            }
        }
        HashSet<Fragment> allFragments = new HashSet<>();
        for (int i2 = index; i2 < this.mBackStack.size(); i2++) {
            BackStackRecord record2 = this.mBackStack.get(i2);
            HashSet<Fragment> affectedFragments = new HashSet<>();
            HashSet<Fragment> addedFragments = new HashSet<>();
            Iterator it = record2.mOps.iterator();
            while (it.hasNext()) {
                FragmentTransaction.Op op = (FragmentTransaction.Op) it.next();
                Fragment f = op.mFragment;
                if (f != null) {
                    if (!op.mFromExpandedOp || op.mCmd == 1 || op.mCmd == 2 || op.mCmd == 8) {
                        allFragments.add(f);
                        affectedFragments.add(f);
                    }
                    if (op.mCmd == 1 || op.mCmd == 2) {
                        addedFragments.add(f);
                    }
                }
            }
            affectedFragments.removeAll(addedFragments);
            if (!affectedFragments.isEmpty()) {
                StringBuilder append = new StringBuilder().append("saveBackStack(\"").append(str3).append("\") must be self contained and not reference fragments from non-saved FragmentTransactions. Found reference to fragment");
                if (affectedFragments.size() == 1) {
                    str2 = " " + affectedFragments.iterator().next();
                } else {
                    str2 = "s " + affectedFragments;
                }
                throwException(new IllegalArgumentException(append.append(str2).append(" in ").append(record2).append(" that were previously added to the FragmentManager through a separate FragmentTransaction.").toString()));
            }
        }
        ArrayDeque<Fragment> fragmentsToSearch = new ArrayDeque<>(allFragments);
        while (!fragmentsToSearch.isEmpty()) {
            Fragment currentFragment = fragmentsToSearch.removeFirst();
            if (currentFragment.mRetainInstance) {
                StringBuilder append2 = new StringBuilder().append("saveBackStack(\"").append(str3).append("\") must not contain retained fragments. Found ");
                if (allFragments.contains(currentFragment)) {
                    str = "direct reference to retained ";
                } else {
                    str = "retained child ";
                }
                throwException(new IllegalArgumentException(append2.append(str).append("fragment ").append(currentFragment).toString()));
            }
            for (Fragment f2 : currentFragment.mChildFragmentManager.getActiveFragments()) {
                if (f2 != null) {
                    fragmentsToSearch.addLast(f2);
                }
            }
        }
        ArrayList<String> fragments = new ArrayList<>();
        Iterator<Fragment> it2 = allFragments.iterator();
        while (it2.hasNext()) {
            fragments.add(it2.next().mWho);
        }
        ArrayList<BackStackRecordState> backStackRecordStates = new ArrayList<>(this.mBackStack.size() - index);
        for (int i3 = index; i3 < this.mBackStack.size(); i3++) {
            backStackRecordStates.add((Object) null);
        }
        BackStackState backStackState = new BackStackState(fragments, backStackRecordStates);
        for (int i4 = this.mBackStack.size() - 1; i4 >= index; i4--) {
            BackStackRecord record3 = this.mBackStack.remove(i4);
            BackStackRecord copy = new BackStackRecord(record3);
            copy.collapseOps();
            backStackRecordStates.set(i4 - index, new BackStackRecordState(copy));
            record3.mBeingSaved = true;
            records.add(record3);
            isRecordPop.add(true);
        }
        ArrayList<BackStackRecord> arrayList = records;
        ArrayList<Boolean> arrayList2 = isRecordPop;
        this.mBackStackStates.put(str3, backStackState);
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean clearBackStackState(ArrayList<BackStackRecord> records, ArrayList<Boolean> isRecordPop, String name) {
        if (!restoreBackStackState(records, isRecordPop, name)) {
            return false;
        }
        return popBackStackState(records, isRecordPop, name, -1, 1);
    }

    /* access modifiers changed from: package-private */
    public boolean popBackStackState(ArrayList<BackStackRecord> records, ArrayList<Boolean> isRecordPop, String name, int id, int flags) {
        int index = findBackStackIndex(name, id, (flags & 1) != 0);
        if (index < 0) {
            return false;
        }
        for (int i = this.mBackStack.size() - 1; i >= index; i--) {
            records.add(this.mBackStack.remove(i));
            isRecordPop.add(true);
        }
        return true;
    }

    private int findBackStackIndex(String name, int id, boolean inclusive) {
        if (this.mBackStack == null || this.mBackStack.isEmpty()) {
            return -1;
        }
        if (name != null || id >= 0) {
            int index = this.mBackStack.size() - 1;
            while (index >= 0) {
                BackStackRecord bss = this.mBackStack.get(index);
                if ((name != null && name.equals(bss.getName())) || (id >= 0 && id == bss.mIndex)) {
                    break;
                }
                index--;
            }
            if (index < 0) {
                return index;
            }
            if (inclusive) {
                while (index > 0) {
                    BackStackRecord bss2 = this.mBackStack.get(index - 1);
                    if ((name == null || !name.equals(bss2.getName())) && (id < 0 || id != bss2.mIndex)) {
                        return index;
                    }
                    index--;
                }
                return index;
            } else if (index == this.mBackStack.size() - 1) {
                return -1;
            } else {
                return index + 1;
            }
        } else if (inclusive) {
            return 0;
        } else {
            return this.mBackStack.size() - 1;
        }
    }

    /* access modifiers changed from: package-private */
    @Deprecated
    public FragmentManagerNonConfig retainNonConfig() {
        if (this.mHost instanceof ViewModelStoreOwner) {
            throwException(new IllegalStateException("You cannot use retainNonConfig when your FragmentHostCallback implements ViewModelStoreOwner."));
        }
        return this.mNonConfig.getSnapshot();
    }

    /* access modifiers changed from: package-private */
    public Parcelable saveAllState() {
        if (this.mHost instanceof SavedStateRegistryOwner) {
            throwException(new IllegalStateException("You cannot use saveAllState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        Bundle savedState = m144lambda$attachController$4$androidxfragmentappFragmentManager();
        if (savedState.isEmpty()) {
            return null;
        }
        return savedState;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: saveAllStateInternal */
    public Bundle m144lambda$attachController$4$androidxfragmentappFragmentManager() {
        int size;
        Bundle bundle = new Bundle();
        forcePostponedTransactions();
        endAnimatingAwayFragments();
        execPendingActions(true);
        this.mStateSaved = true;
        this.mNonConfig.setIsStateSaved(true);
        ArrayList<String> active = this.mFragmentStore.saveActiveFragments();
        HashMap<String, Bundle> savedState = this.mFragmentStore.getAllSavedState();
        if (!savedState.isEmpty()) {
            ArrayList<String> added = this.mFragmentStore.saveAddedFragments();
            BackStackRecordState[] backStack = null;
            if (this.mBackStack != null && (size = this.mBackStack.size()) > 0) {
                backStack = new BackStackRecordState[size];
                for (int i = 0; i < size; i++) {
                    backStack[i] = new BackStackRecordState(this.mBackStack.get(i));
                    if (isLoggingEnabled(2)) {
                        Log.v(TAG, "saveAllState: adding back stack #" + i + ": " + this.mBackStack.get(i));
                    }
                }
            }
            FragmentManagerState fms = new FragmentManagerState();
            fms.mActive = active;
            fms.mAdded = added;
            fms.mBackStack = backStack;
            fms.mBackStackIndex = this.mBackStackIndex.get();
            if (this.mPrimaryNav != null) {
                fms.mPrimaryNavActiveWho = this.mPrimaryNav.mWho;
            }
            fms.mBackStackStateKeys.addAll(this.mBackStackStates.keySet());
            fms.mBackStackStates.addAll(this.mBackStackStates.values());
            fms.mLaunchedFragments = new ArrayList<>(this.mLaunchedFragments);
            bundle.putParcelable(FRAGMENT_MANAGER_STATE_KEY, fms);
            for (String resultName : this.mResults.keySet()) {
                bundle.putBundle(RESULT_KEY_PREFIX + resultName, this.mResults.get(resultName));
            }
            for (String fWho : savedState.keySet()) {
                bundle.putBundle(FRAGMENT_KEY_PREFIX + fWho, savedState.get(fWho));
            }
        } else if (isLoggingEnabled(2)) {
            Log.v(TAG, "saveAllState: no fragments!");
        }
        return bundle;
    }

    /* access modifiers changed from: package-private */
    public void restoreAllState(Parcelable state, FragmentManagerNonConfig nonConfig) {
        if (this.mHost instanceof ViewModelStoreOwner) {
            throwException(new IllegalStateException("You must use restoreSaveState when your FragmentHostCallback implements ViewModelStoreOwner"));
        }
        this.mNonConfig.restoreFromSnapshot(nonConfig);
        restoreSaveStateInternal(state);
    }

    /* access modifiers changed from: package-private */
    public void restoreSaveState(Parcelable state) {
        if (this.mHost instanceof SavedStateRegistryOwner) {
            throwException(new IllegalStateException("You cannot use restoreSaveState when your FragmentHostCallback implements SavedStateRegistryOwner."));
        }
        restoreSaveStateInternal(state);
    }

    /* access modifiers changed from: package-private */
    public void restoreSaveStateInternal(Parcelable state) {
        FragmentStateManager fragmentStateManager;
        Bundle savedFragmentBundle;
        Bundle savedResult;
        if (state != null) {
            Bundle bundle = (Bundle) state;
            for (String bundleKey : bundle.keySet()) {
                if (bundleKey.startsWith(RESULT_KEY_PREFIX) && (savedResult = bundle.getBundle(bundleKey)) != null) {
                    savedResult.setClassLoader(this.mHost.getContext().getClassLoader());
                    this.mResults.put(bundleKey.substring(RESULT_KEY_PREFIX.length()), savedResult);
                }
            }
            HashMap<String, Bundle> allStateBundles = new HashMap<>();
            for (String bundleKey2 : bundle.keySet()) {
                if (bundleKey2.startsWith(FRAGMENT_KEY_PREFIX) && (savedFragmentBundle = bundle.getBundle(bundleKey2)) != null) {
                    savedFragmentBundle.setClassLoader(this.mHost.getContext().getClassLoader());
                    allStateBundles.put(bundleKey2.substring(FRAGMENT_KEY_PREFIX.length()), savedFragmentBundle);
                }
            }
            this.mFragmentStore.restoreSaveState(allStateBundles);
            FragmentManagerState fms = (FragmentManagerState) bundle.getParcelable(FRAGMENT_MANAGER_STATE_KEY);
            if (fms != null) {
                this.mFragmentStore.resetActiveFragments();
                Iterator<String> it = fms.mActive.iterator();
                while (it.hasNext()) {
                    Bundle stateBundle = this.mFragmentStore.setSavedState(it.next(), (Bundle) null);
                    if (stateBundle != null) {
                        Fragment retainedFragment = this.mNonConfig.findRetainedFragmentByWho(((FragmentState) stateBundle.getParcelable(FRAGMENT_MANAGER_STATE_KEY)).mWho);
                        if (retainedFragment != null) {
                            if (isLoggingEnabled(2)) {
                                Log.v(TAG, "restoreSaveState: re-attaching retained " + retainedFragment);
                            }
                            fragmentStateManager = new FragmentStateManager(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, retainedFragment, stateBundle);
                            Fragment fragment = retainedFragment;
                        } else {
                            Fragment fragment2 = retainedFragment;
                            fragmentStateManager = new FragmentStateManager(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, this.mHost.getContext().getClassLoader(), getFragmentFactory(), stateBundle);
                        }
                        Fragment f = fragmentStateManager.getFragment();
                        f.mSavedFragmentState = stateBundle;
                        f.mFragmentManager = this;
                        if (isLoggingEnabled(2)) {
                            Log.v(TAG, "restoreSaveState: active (" + f.mWho + "): " + f);
                        }
                        fragmentStateManager.restoreState(this.mHost.getContext().getClassLoader());
                        this.mFragmentStore.makeActive(fragmentStateManager);
                        fragmentStateManager.setFragmentManagerState(this.mCurState);
                    }
                }
                for (Fragment f2 : this.mNonConfig.getRetainedFragments()) {
                    if (!this.mFragmentStore.containsActiveFragment(f2.mWho)) {
                        if (isLoggingEnabled(2)) {
                            Log.v(TAG, "Discarding retained Fragment " + f2 + " that was not found in the set of active Fragments " + fms.mActive);
                        }
                        this.mNonConfig.removeRetainedFragment(f2);
                        f2.mFragmentManager = this;
                        FragmentStateManager fragmentStateManager2 = new FragmentStateManager(this.mLifecycleCallbacksDispatcher, this.mFragmentStore, f2);
                        fragmentStateManager2.setFragmentManagerState(1);
                        fragmentStateManager2.moveToExpectedState();
                        f2.mRemoving = true;
                        fragmentStateManager2.moveToExpectedState();
                    }
                }
                this.mFragmentStore.restoreAddedFragments(fms.mAdded);
                if (fms.mBackStack != null) {
                    this.mBackStack = new ArrayList<>(fms.mBackStack.length);
                    for (int i = 0; i < fms.mBackStack.length; i++) {
                        BackStackRecord bse = fms.mBackStack[i].instantiate(this);
                        if (isLoggingEnabled(2)) {
                            Log.v(TAG, "restoreAllState: back stack #" + i + " (index " + bse.mIndex + "): " + bse);
                            PrintWriter pw = new PrintWriter(new LogWriter(TAG));
                            bse.dump("  ", pw, false);
                            pw.close();
                        }
                        this.mBackStack.add(bse);
                    }
                } else {
                    this.mBackStack = null;
                }
                this.mBackStackIndex.set(fms.mBackStackIndex);
                if (fms.mPrimaryNavActiveWho != null) {
                    this.mPrimaryNav = findActiveFragment(fms.mPrimaryNavActiveWho);
                    dispatchParentPrimaryNavigationFragmentChanged(this.mPrimaryNav);
                }
                ArrayList<String> savedBackStackStateKeys = fms.mBackStackStateKeys;
                if (savedBackStackStateKeys != null) {
                    for (int i2 = 0; i2 < savedBackStackStateKeys.size(); i2++) {
                        this.mBackStackStates.put(savedBackStackStateKeys.get(i2), fms.mBackStackStates.get(i2));
                    }
                }
                this.mLaunchedFragments = new ArrayDeque<>(fms.mLaunchedFragments);
            }
        }
    }

    public FragmentHostCallback<?> getHost() {
        return this.mHost;
    }

    /* access modifiers changed from: package-private */
    public Fragment getParent() {
        return this.mParent;
    }

    /* access modifiers changed from: package-private */
    public FragmentContainer getContainer() {
        return this.mContainer;
    }

    /* access modifiers changed from: package-private */
    public FragmentStore getFragmentStore() {
        return this.mFragmentStore;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v45, resolved type: androidx.activity.OnBackPressedDispatcherOwner} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v19, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v20, resolved type: androidx.fragment.app.Fragment} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r1v21, resolved type: androidx.fragment.app.Fragment} */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void attachController(androidx.fragment.app.FragmentHostCallback<?> r7, androidx.fragment.app.FragmentContainer r8, final androidx.fragment.app.Fragment r9) {
        /*
            r6 = this;
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            if (r0 != 0) goto L_0x018c
            r6.mHost = r7
            r6.mContainer = r8
            r6.mParent = r9
            androidx.fragment.app.Fragment r0 = r6.mParent
            if (r0 == 0) goto L_0x0017
            androidx.fragment.app.FragmentManager$7 r0 = new androidx.fragment.app.FragmentManager$7
            r0.<init>(r9)
            r6.addFragmentOnAttachListener(r0)
            goto L_0x0021
        L_0x0017:
            boolean r0 = r7 instanceof androidx.fragment.app.FragmentOnAttachListener
            if (r0 == 0) goto L_0x0021
            r0 = r7
            androidx.fragment.app.FragmentOnAttachListener r0 = (androidx.fragment.app.FragmentOnAttachListener) r0
            r6.addFragmentOnAttachListener(r0)
        L_0x0021:
            androidx.fragment.app.Fragment r0 = r6.mParent
            if (r0 == 0) goto L_0x0028
            r6.updateOnBackPressedCallbackEnabled()
        L_0x0028:
            boolean r0 = r7 instanceof androidx.activity.OnBackPressedDispatcherOwner
            if (r0 == 0) goto L_0x0041
            r0 = r7
            androidx.activity.OnBackPressedDispatcherOwner r0 = (androidx.activity.OnBackPressedDispatcherOwner) r0
            androidx.activity.OnBackPressedDispatcher r1 = r0.getOnBackPressedDispatcher()
            r6.mOnBackPressedDispatcher = r1
            if (r9 == 0) goto L_0x0039
            r1 = r9
            goto L_0x003a
        L_0x0039:
            r1 = r0
        L_0x003a:
            androidx.activity.OnBackPressedDispatcher r2 = r6.mOnBackPressedDispatcher
            androidx.activity.OnBackPressedCallback r3 = r6.mOnBackPressedCallback
            r2.addCallback(r1, r3)
        L_0x0041:
            if (r9 == 0) goto L_0x004c
            androidx.fragment.app.FragmentManager r0 = r9.mFragmentManager
            androidx.fragment.app.FragmentManagerViewModel r0 = r0.getChildNonConfig(r9)
            r6.mNonConfig = r0
            goto L_0x0066
        L_0x004c:
            boolean r0 = r7 instanceof androidx.lifecycle.ViewModelStoreOwner
            if (r0 == 0) goto L_0x005e
            r0 = r7
            androidx.lifecycle.ViewModelStoreOwner r0 = (androidx.lifecycle.ViewModelStoreOwner) r0
            androidx.lifecycle.ViewModelStore r0 = r0.getViewModelStore()
            androidx.fragment.app.FragmentManagerViewModel r1 = androidx.fragment.app.FragmentManagerViewModel.getInstance(r0)
            r6.mNonConfig = r1
            goto L_0x0066
        L_0x005e:
            androidx.fragment.app.FragmentManagerViewModel r0 = new androidx.fragment.app.FragmentManagerViewModel
            r1 = 0
            r0.<init>(r1)
            r6.mNonConfig = r0
        L_0x0066:
            androidx.fragment.app.FragmentManagerViewModel r0 = r6.mNonConfig
            boolean r1 = r6.isStateSaved()
            r0.setIsStateSaved(r1)
            androidx.fragment.app.FragmentStore r0 = r6.mFragmentStore
            androidx.fragment.app.FragmentManagerViewModel r1 = r6.mNonConfig
            r0.setNonConfig(r1)
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            boolean r0 = r0 instanceof androidx.savedstate.SavedStateRegistryOwner
            if (r0 == 0) goto L_0x009a
            if (r9 != 0) goto L_0x009a
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            androidx.savedstate.SavedStateRegistryOwner r0 = (androidx.savedstate.SavedStateRegistryOwner) r0
            androidx.savedstate.SavedStateRegistry r0 = r0.getSavedStateRegistry()
            androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda4 r1 = new androidx.fragment.app.FragmentManager$$ExternalSyntheticLambda4
            r1.<init>(r6)
            java.lang.String r2 = "android:support:fragments"
            r0.registerSavedStateProvider(r2, r1)
            android.os.Bundle r1 = r0.consumeRestoredStateForKey(r2)
            if (r1 == 0) goto L_0x009a
            r6.restoreSaveStateInternal(r1)
        L_0x009a:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            boolean r0 = r0 instanceof androidx.activity.result.ActivityResultRegistryOwner
            if (r0 == 0) goto L_0x013e
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            androidx.activity.result.ActivityResultRegistryOwner r0 = (androidx.activity.result.ActivityResultRegistryOwner) r0
            androidx.activity.result.ActivityResultRegistry r0 = r0.getActivityResultRegistry()
            if (r9 == 0) goto L_0x00c0
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = r9.mWho
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r2 = ":"
            java.lang.StringBuilder r1 = r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L_0x00c2
        L_0x00c0:
            java.lang.String r1 = ""
        L_0x00c2:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "FragmentManager:"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.String r2 = r2.toString()
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r4 = "StartActivityForResult"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult r4 = new androidx.activity.result.contract.ActivityResultContracts$StartActivityForResult
            r4.<init>()
            androidx.fragment.app.FragmentManager$8 r5 = new androidx.fragment.app.FragmentManager$8
            r5.<init>()
            androidx.activity.result.ActivityResultLauncher r3 = r0.register(r3, r4, r5)
            r6.mStartActivityForResult = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r4 = "StartIntentSenderForResult"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            androidx.fragment.app.FragmentManager$FragmentIntentSenderContract r4 = new androidx.fragment.app.FragmentManager$FragmentIntentSenderContract
            r4.<init>()
            androidx.fragment.app.FragmentManager$9 r5 = new androidx.fragment.app.FragmentManager$9
            r5.<init>()
            androidx.activity.result.ActivityResultLauncher r3 = r0.register(r3, r4, r5)
            r6.mStartIntentSenderForResult = r3
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.StringBuilder r3 = r3.append(r2)
            java.lang.String r4 = "RequestPermissions"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions r4 = new androidx.activity.result.contract.ActivityResultContracts$RequestMultiplePermissions
            r4.<init>()
            androidx.fragment.app.FragmentManager$10 r5 = new androidx.fragment.app.FragmentManager$10
            r5.<init>()
            androidx.activity.result.ActivityResultLauncher r3 = r0.register(r3, r4, r5)
            r6.mRequestPermissions = r3
        L_0x013e:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            boolean r0 = r0 instanceof androidx.core.content.OnConfigurationChangedProvider
            if (r0 == 0) goto L_0x014d
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            androidx.core.content.OnConfigurationChangedProvider r0 = (androidx.core.content.OnConfigurationChangedProvider) r0
            androidx.core.util.Consumer<android.content.res.Configuration> r1 = r6.mOnConfigurationChangedListener
            r0.addOnConfigurationChangedListener(r1)
        L_0x014d:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            boolean r0 = r0 instanceof androidx.core.content.OnTrimMemoryProvider
            if (r0 == 0) goto L_0x015c
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            androidx.core.content.OnTrimMemoryProvider r0 = (androidx.core.content.OnTrimMemoryProvider) r0
            androidx.core.util.Consumer<java.lang.Integer> r1 = r6.mOnTrimMemoryListener
            r0.addOnTrimMemoryListener(r1)
        L_0x015c:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            boolean r0 = r0 instanceof androidx.core.app.OnMultiWindowModeChangedProvider
            if (r0 == 0) goto L_0x016b
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            androidx.core.app.OnMultiWindowModeChangedProvider r0 = (androidx.core.app.OnMultiWindowModeChangedProvider) r0
            androidx.core.util.Consumer<androidx.core.app.MultiWindowModeChangedInfo> r1 = r6.mOnMultiWindowModeChangedListener
            r0.addOnMultiWindowModeChangedListener(r1)
        L_0x016b:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            boolean r0 = r0 instanceof androidx.core.app.OnPictureInPictureModeChangedProvider
            if (r0 == 0) goto L_0x017a
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            androidx.core.app.OnPictureInPictureModeChangedProvider r0 = (androidx.core.app.OnPictureInPictureModeChangedProvider) r0
            androidx.core.util.Consumer<androidx.core.app.PictureInPictureModeChangedInfo> r1 = r6.mOnPictureInPictureModeChangedListener
            r0.addOnPictureInPictureModeChangedListener(r1)
        L_0x017a:
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            boolean r0 = r0 instanceof androidx.core.view.MenuHost
            if (r0 == 0) goto L_0x018b
            if (r9 != 0) goto L_0x018b
            androidx.fragment.app.FragmentHostCallback<?> r0 = r6.mHost
            androidx.core.view.MenuHost r0 = (androidx.core.view.MenuHost) r0
            androidx.core.view.MenuProvider r1 = r6.mMenuProvider
            r0.addMenuProvider(r1)
        L_0x018b:
            return
        L_0x018c:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already attached"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentManager.attachController(androidx.fragment.app.FragmentHostCallback, androidx.fragment.app.FragmentContainer, androidx.fragment.app.Fragment):void");
    }

    /* access modifiers changed from: package-private */
    public void noteStateNotSaved() {
        if (this.mHost != null) {
            this.mStateSaved = false;
            this.mStopped = false;
            this.mNonConfig.setIsStateSaved(false);
            for (Fragment fragment : this.mFragmentStore.getFragments()) {
                if (fragment != null) {
                    fragment.noteStateNotSaved();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void launchStartActivityForResult(Fragment f, Intent intent, int requestCode, Bundle options) {
        if (this.mStartActivityForResult != null) {
            this.mLaunchedFragments.addLast(new LaunchedFragmentInfo(f.mWho, requestCode));
            if (options != null) {
                intent.putExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE, options);
            }
            this.mStartActivityForResult.launch(intent);
            return;
        }
        this.mHost.onStartActivityFromFragment(f, intent, requestCode, options);
    }

    /* access modifiers changed from: package-private */
    public void launchStartIntentSenderForResult(Fragment f, IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws IntentSender.SendIntentException {
        Intent fillInIntent2;
        Fragment fragment = f;
        Bundle bundle = options;
        if (this.mStartIntentSenderForResult != null) {
            if (bundle != null) {
                if (fillInIntent == null) {
                    fillInIntent2 = new Intent();
                    fillInIntent2.putExtra(EXTRA_CREATED_FILLIN_INTENT, true);
                } else {
                    fillInIntent2 = fillInIntent;
                }
                if (isLoggingEnabled(2)) {
                    Log.v(TAG, "ActivityOptions " + bundle + " were added to fillInIntent " + fillInIntent2 + " for fragment " + fragment);
                }
                fillInIntent2.putExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE, bundle);
            } else {
                fillInIntent2 = fillInIntent;
            }
            IntentSenderRequest request = new IntentSenderRequest.Builder(intent).setFillInIntent(fillInIntent2).setFlags(flagsValues, flagsMask).build();
            this.mLaunchedFragments.addLast(new LaunchedFragmentInfo(fragment.mWho, requestCode));
            if (isLoggingEnabled(2)) {
                Log.v(TAG, "Fragment " + fragment + "is launching an IntentSender for result ");
            }
            this.mStartIntentSenderForResult.launch(request);
            return;
        }
        IntentSender intentSender = intent;
        int i = requestCode;
        int i2 = flagsMask;
        int i3 = flagsValues;
        this.mHost.onStartIntentSenderFromFragment(f, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
        Intent intent2 = fillInIntent;
    }

    /* access modifiers changed from: package-private */
    public void launchRequestPermissions(Fragment f, String[] permissions, int requestCode) {
        if (this.mRequestPermissions != null) {
            this.mLaunchedFragments.addLast(new LaunchedFragmentInfo(f.mWho, requestCode));
            this.mRequestPermissions.launch(permissions);
            return;
        }
        this.mHost.onRequestPermissionsFromFragment(f, permissions, requestCode);
    }

    /* access modifiers changed from: package-private */
    public void dispatchAttach() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.setIsStateSaved(false);
        dispatchStateChange(0);
    }

    /* access modifiers changed from: package-private */
    public void dispatchCreate() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.setIsStateSaved(false);
        dispatchStateChange(1);
    }

    /* access modifiers changed from: package-private */
    public void dispatchViewCreated() {
        dispatchStateChange(2);
    }

    /* access modifiers changed from: package-private */
    public void dispatchActivityCreated() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.setIsStateSaved(false);
        dispatchStateChange(4);
    }

    /* access modifiers changed from: package-private */
    public void dispatchStart() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.setIsStateSaved(false);
        dispatchStateChange(5);
    }

    /* access modifiers changed from: package-private */
    public void dispatchResume() {
        this.mStateSaved = false;
        this.mStopped = false;
        this.mNonConfig.setIsStateSaved(false);
        dispatchStateChange(7);
    }

    /* access modifiers changed from: package-private */
    public void dispatchPause() {
        dispatchStateChange(5);
    }

    /* access modifiers changed from: package-private */
    public void dispatchStop() {
        this.mStopped = true;
        this.mNonConfig.setIsStateSaved(true);
        dispatchStateChange(4);
    }

    /* access modifiers changed from: package-private */
    public void dispatchDestroyView() {
        dispatchStateChange(1);
    }

    /* access modifiers changed from: package-private */
    public void dispatchDestroy() {
        this.mDestroyed = true;
        execPendingActions(true);
        endAnimatingAwayFragments();
        clearBackStackStateViewModels();
        dispatchStateChange(-1);
        if (this.mHost instanceof OnTrimMemoryProvider) {
            ((OnTrimMemoryProvider) this.mHost).removeOnTrimMemoryListener(this.mOnTrimMemoryListener);
        }
        if (this.mHost instanceof OnConfigurationChangedProvider) {
            ((OnConfigurationChangedProvider) this.mHost).removeOnConfigurationChangedListener(this.mOnConfigurationChangedListener);
        }
        if (this.mHost instanceof OnMultiWindowModeChangedProvider) {
            ((OnMultiWindowModeChangedProvider) this.mHost).removeOnMultiWindowModeChangedListener(this.mOnMultiWindowModeChangedListener);
        }
        if (this.mHost instanceof OnPictureInPictureModeChangedProvider) {
            ((OnPictureInPictureModeChangedProvider) this.mHost).removeOnPictureInPictureModeChangedListener(this.mOnPictureInPictureModeChangedListener);
        }
        if ((this.mHost instanceof MenuHost) && this.mParent == null) {
            ((MenuHost) this.mHost).removeMenuProvider(this.mMenuProvider);
        }
        this.mHost = null;
        this.mContainer = null;
        this.mParent = null;
        if (this.mOnBackPressedDispatcher != null) {
            this.mOnBackPressedCallback.remove();
            this.mOnBackPressedDispatcher = null;
        }
        if (this.mStartActivityForResult != null) {
            this.mStartActivityForResult.unregister();
            this.mStartIntentSenderForResult.unregister();
            this.mRequestPermissions.unregister();
        }
    }

    /* JADX INFO: finally extract failed */
    private void dispatchStateChange(int nextState) {
        try {
            this.mExecutingActions = true;
            this.mFragmentStore.dispatchStateChange(nextState);
            moveToState(nextState, false);
            for (SpecialEffectsController controller : collectAllSpecialEffectsController()) {
                controller.forceCompleteAllOperations();
            }
            this.mExecutingActions = false;
            execPendingActions(true);
        } catch (Throwable th) {
            this.mExecutingActions = false;
            throw th;
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchMultiWindowModeChanged(boolean isInMultiWindowMode, boolean recursive) {
        if (recursive && (this.mHost instanceof OnMultiWindowModeChangedProvider)) {
            throwException(new IllegalStateException("Do not call dispatchMultiWindowModeChanged() on host. Host implements OnMultiWindowModeChangedProvider and automatically dispatches multi-window mode changes to fragments."));
        }
        for (Fragment f : this.mFragmentStore.getFragments()) {
            if (f != null) {
                f.performMultiWindowModeChanged(isInMultiWindowMode);
                if (recursive) {
                    f.mChildFragmentManager.dispatchMultiWindowModeChanged(isInMultiWindowMode, true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchPictureInPictureModeChanged(boolean isInPictureInPictureMode, boolean recursive) {
        if (recursive && (this.mHost instanceof OnPictureInPictureModeChangedProvider)) {
            throwException(new IllegalStateException("Do not call dispatchPictureInPictureModeChanged() on host. Host implements OnPictureInPictureModeChangedProvider and automatically dispatches picture-in-picture mode changes to fragments."));
        }
        for (Fragment f : this.mFragmentStore.getFragments()) {
            if (f != null) {
                f.performPictureInPictureModeChanged(isInPictureInPictureMode);
                if (recursive) {
                    f.mChildFragmentManager.dispatchPictureInPictureModeChanged(isInPictureInPictureMode, true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchConfigurationChanged(Configuration newConfig, boolean recursive) {
        if (recursive && (this.mHost instanceof OnConfigurationChangedProvider)) {
            throwException(new IllegalStateException("Do not call dispatchConfigurationChanged() on host. Host implements OnConfigurationChangedProvider and automatically dispatches configuration changes to fragments."));
        }
        for (Fragment f : this.mFragmentStore.getFragments()) {
            if (f != null) {
                f.performConfigurationChanged(newConfig);
                if (recursive) {
                    f.mChildFragmentManager.dispatchConfigurationChanged(newConfig, true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchLowMemory(boolean recursive) {
        if (recursive && (this.mHost instanceof OnTrimMemoryProvider)) {
            throwException(new IllegalStateException("Do not call dispatchLowMemory() on host. Host implements OnTrimMemoryProvider and automatically dispatches low memory callbacks to fragments."));
        }
        for (Fragment f : this.mFragmentStore.getFragments()) {
            if (f != null) {
                f.performLowMemory();
                if (recursive) {
                    f.mChildFragmentManager.dispatchLowMemory(true);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean dispatchCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        if (this.mCurState < 1) {
            return false;
        }
        boolean show = false;
        ArrayList<Fragment> newMenus = null;
        for (Fragment f : this.mFragmentStore.getFragments()) {
            if (f != null && isParentMenuVisible(f) && f.performCreateOptionsMenu(menu, inflater)) {
                show = true;
                if (newMenus == null) {
                    newMenus = new ArrayList<>();
                }
                newMenus.add(f);
            }
        }
        if (this.mCreatedMenus != null) {
            for (int i = 0; i < this.mCreatedMenus.size(); i++) {
                Fragment f2 = this.mCreatedMenus.get(i);
                if (newMenus == null || !newMenus.contains(f2)) {
                    f2.onDestroyOptionsMenu();
                }
            }
        }
        this.mCreatedMenus = newMenus;
        return show;
    }

    /* access modifiers changed from: package-private */
    public boolean dispatchPrepareOptionsMenu(Menu menu) {
        if (this.mCurState < 1) {
            return false;
        }
        boolean show = false;
        for (Fragment f : this.mFragmentStore.getFragments()) {
            if (f != null && isParentMenuVisible(f) && f.performPrepareOptionsMenu(menu)) {
                show = true;
            }
        }
        return show;
    }

    /* access modifiers changed from: package-private */
    public boolean dispatchOptionsItemSelected(MenuItem item) {
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment f : this.mFragmentStore.getFragments()) {
            if (f != null && f.performOptionsItemSelected(item)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean dispatchContextItemSelected(MenuItem item) {
        if (this.mCurState < 1) {
            return false;
        }
        for (Fragment f : this.mFragmentStore.getFragments()) {
            if (f != null && f.performContextItemSelected(item)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void dispatchOptionsMenuClosed(Menu menu) {
        if (this.mCurState >= 1) {
            for (Fragment f : this.mFragmentStore.getFragments()) {
                if (f != null) {
                    f.performOptionsMenuClosed(menu);
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void setPrimaryNavigationFragment(Fragment f) {
        if (f == null || (f.equals(findActiveFragment(f.mWho)) && (f.mHost == null || f.mFragmentManager == this))) {
            Fragment previousPrimaryNav = this.mPrimaryNav;
            this.mPrimaryNav = f;
            dispatchParentPrimaryNavigationFragmentChanged(previousPrimaryNav);
            dispatchParentPrimaryNavigationFragmentChanged(this.mPrimaryNav);
            return;
        }
        throw new IllegalArgumentException("Fragment " + f + " is not an active fragment of FragmentManager " + this);
    }

    private void dispatchParentPrimaryNavigationFragmentChanged(Fragment f) {
        if (f != null && f.equals(findActiveFragment(f.mWho))) {
            f.performPrimaryNavigationFragmentChanged();
        }
    }

    /* access modifiers changed from: package-private */
    public void dispatchPrimaryNavigationFragmentChanged() {
        updateOnBackPressedCallbackEnabled();
        dispatchParentPrimaryNavigationFragmentChanged(this.mPrimaryNav);
    }

    public Fragment getPrimaryNavigationFragment() {
        return this.mPrimaryNav;
    }

    /* access modifiers changed from: package-private */
    public void setMaxLifecycle(Fragment f, Lifecycle.State state) {
        if (!f.equals(findActiveFragment(f.mWho)) || !(f.mHost == null || f.mFragmentManager == this)) {
            throw new IllegalArgumentException("Fragment " + f + " is not an active fragment of FragmentManager " + this);
        }
        f.mMaxState = state;
    }

    public void setFragmentFactory(FragmentFactory fragmentFactory) {
        this.mFragmentFactory = fragmentFactory;
    }

    public FragmentFactory getFragmentFactory() {
        if (this.mFragmentFactory != null) {
            return this.mFragmentFactory;
        }
        if (this.mParent != null) {
            return this.mParent.mFragmentManager.getFragmentFactory();
        }
        return this.mHostFragmentFactory;
    }

    /* access modifiers changed from: package-private */
    public void setSpecialEffectsControllerFactory(SpecialEffectsControllerFactory specialEffectsControllerFactory) {
        this.mSpecialEffectsControllerFactory = specialEffectsControllerFactory;
    }

    /* access modifiers changed from: package-private */
    public SpecialEffectsControllerFactory getSpecialEffectsControllerFactory() {
        if (this.mSpecialEffectsControllerFactory != null) {
            return this.mSpecialEffectsControllerFactory;
        }
        if (this.mParent != null) {
            return this.mParent.mFragmentManager.getSpecialEffectsControllerFactory();
        }
        return this.mDefaultSpecialEffectsControllerFactory;
    }

    /* access modifiers changed from: package-private */
    public FragmentLifecycleCallbacksDispatcher getLifecycleCallbacksDispatcher() {
        return this.mLifecycleCallbacksDispatcher;
    }

    public void registerFragmentLifecycleCallbacks(FragmentLifecycleCallbacks cb, boolean recursive) {
        this.mLifecycleCallbacksDispatcher.registerFragmentLifecycleCallbacks(cb, recursive);
    }

    public void unregisterFragmentLifecycleCallbacks(FragmentLifecycleCallbacks cb) {
        this.mLifecycleCallbacksDispatcher.unregisterFragmentLifecycleCallbacks(cb);
    }

    public void addFragmentOnAttachListener(FragmentOnAttachListener listener) {
        this.mOnAttachListeners.add(listener);
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnAttachFragment(Fragment fragment) {
        Iterator<FragmentOnAttachListener> it = this.mOnAttachListeners.iterator();
        while (it.hasNext()) {
            it.next().onAttachFragment(this, fragment);
        }
    }

    public void removeFragmentOnAttachListener(FragmentOnAttachListener listener) {
        this.mOnAttachListeners.remove(listener);
    }

    /* access modifiers changed from: package-private */
    public void dispatchOnHiddenChanged() {
        for (Fragment fragment : this.mFragmentStore.getActiveFragments()) {
            if (fragment != null) {
                fragment.onHiddenChanged(fragment.isHidden());
                fragment.mChildFragmentManager.dispatchOnHiddenChanged();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public boolean checkForMenus() {
        boolean hasMenu = false;
        for (Fragment fragment : this.mFragmentStore.getActiveFragments()) {
            if (fragment != null) {
                hasMenu = isMenuAvailable(fragment);
                continue;
            }
            if (hasMenu) {
                return true;
            }
        }
        return false;
    }

    private boolean isMenuAvailable(Fragment f) {
        return (f.mHasMenu && f.mMenuVisible) || f.mChildFragmentManager.checkForMenus();
    }

    /* access modifiers changed from: package-private */
    public void invalidateMenuForFragment(Fragment f) {
        if (f.mAdded && isMenuAvailable(f)) {
            this.mNeedMenuInvalidate = true;
        }
    }

    private boolean isParentAdded() {
        if (this.mParent == null) {
            return true;
        }
        if (!this.mParent.isAdded() || !this.mParent.getParentFragmentManager().isParentAdded()) {
            return false;
        }
        return true;
    }

    static int reverseTransit(int transit) {
        switch (transit) {
            case FragmentTransaction.TRANSIT_FRAGMENT_OPEN:
                return 8194;
            case FragmentTransaction.TRANSIT_FRAGMENT_FADE:
                return FragmentTransaction.TRANSIT_FRAGMENT_FADE;
            case FragmentTransaction.TRANSIT_FRAGMENT_MATCH_ACTIVITY_OPEN:
                return FragmentTransaction.TRANSIT_FRAGMENT_MATCH_ACTIVITY_CLOSE;
            case 8194:
                return FragmentTransaction.TRANSIT_FRAGMENT_OPEN;
            case FragmentTransaction.TRANSIT_FRAGMENT_MATCH_ACTIVITY_CLOSE:
                return FragmentTransaction.TRANSIT_FRAGMENT_MATCH_ACTIVITY_OPEN;
            default:
                return 0;
        }
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater.Factory2 getLayoutInflaterFactory() {
        return this.mLayoutInflaterFactory;
    }

    public FragmentStrictMode.Policy getStrictModePolicy() {
        return this.mStrictModePolicy;
    }

    public void setStrictModePolicy(FragmentStrictMode.Policy policy) {
        this.mStrictModePolicy = policy;
    }

    private class PopBackStackState implements OpGenerator {
        final int mFlags;
        final int mId;
        final String mName;

        PopBackStackState(String name, int id, int flags) {
            this.mName = name;
            this.mId = id;
            this.mFlags = flags;
        }

        public boolean generateOps(ArrayList<BackStackRecord> records, ArrayList<Boolean> isRecordPop) {
            if (FragmentManager.this.mPrimaryNav != null && this.mId < 0 && this.mName == null && FragmentManager.this.mPrimaryNav.getChildFragmentManager().popBackStackImmediate()) {
                return false;
            }
            return FragmentManager.this.popBackStackState(records, isRecordPop, this.mName, this.mId, this.mFlags);
        }
    }

    private class RestoreBackStackState implements OpGenerator {
        private final String mName;

        RestoreBackStackState(String name) {
            this.mName = name;
        }

        public boolean generateOps(ArrayList<BackStackRecord> records, ArrayList<Boolean> isRecordPop) {
            return FragmentManager.this.restoreBackStackState(records, isRecordPop, this.mName);
        }
    }

    private class SaveBackStackState implements OpGenerator {
        private final String mName;

        SaveBackStackState(String name) {
            this.mName = name;
        }

        public boolean generateOps(ArrayList<BackStackRecord> records, ArrayList<Boolean> isRecordPop) {
            return FragmentManager.this.saveBackStackState(records, isRecordPop, this.mName);
        }
    }

    private class ClearBackStackState implements OpGenerator {
        private final String mName;

        ClearBackStackState(String name) {
            this.mName = name;
        }

        public boolean generateOps(ArrayList<BackStackRecord> records, ArrayList<Boolean> isRecordPop) {
            return FragmentManager.this.clearBackStackState(records, isRecordPop, this.mName);
        }
    }

    static class LaunchedFragmentInfo implements Parcelable {
        public static final Parcelable.Creator<LaunchedFragmentInfo> CREATOR = new Parcelable.Creator<LaunchedFragmentInfo>() {
            public LaunchedFragmentInfo createFromParcel(Parcel in) {
                return new LaunchedFragmentInfo(in);
            }

            public LaunchedFragmentInfo[] newArray(int size) {
                return new LaunchedFragmentInfo[size];
            }
        };
        int mRequestCode;
        String mWho;

        LaunchedFragmentInfo(String who, int requestCode) {
            this.mWho = who;
            this.mRequestCode = requestCode;
        }

        LaunchedFragmentInfo(Parcel in) {
            this.mWho = in.readString();
            this.mRequestCode = in.readInt();
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel dest, int flags) {
            dest.writeString(this.mWho);
            dest.writeInt(this.mRequestCode);
        }
    }

    static class FragmentIntentSenderContract extends ActivityResultContract<IntentSenderRequest, ActivityResult> {
        FragmentIntentSenderContract() {
        }

        public Intent createIntent(Context context, IntentSenderRequest input) {
            Bundle activityOptions;
            Intent result = new Intent(ActivityResultContracts.StartIntentSenderForResult.ACTION_INTENT_SENDER_REQUEST);
            Intent fillInIntent = input.getFillInIntent();
            if (!(fillInIntent == null || (activityOptions = fillInIntent.getBundleExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE)) == null)) {
                result.putExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE, activityOptions);
                fillInIntent.removeExtra(ActivityResultContracts.StartActivityForResult.EXTRA_ACTIVITY_OPTIONS_BUNDLE);
                if (fillInIntent.getBooleanExtra(FragmentManager.EXTRA_CREATED_FILLIN_INTENT, false)) {
                    input = new IntentSenderRequest.Builder(input.getIntentSender()).setFillInIntent((Intent) null).setFlags(input.getFlagsValues(), input.getFlagsMask()).build();
                }
            }
            result.putExtra(ActivityResultContracts.StartIntentSenderForResult.EXTRA_INTENT_SENDER_REQUEST, input);
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v(FragmentManager.TAG, "CreateIntent created the following intent: " + result);
            }
            return result;
        }

        public ActivityResult parseResult(int resultCode, Intent intent) {
            return new ActivityResult(resultCode, intent);
        }
    }
}
