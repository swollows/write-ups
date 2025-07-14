package androidx.fragment.app;

import android.animation.Animator;
import android.app.Activity;
import android.app.Application;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultCaller;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.ActivityResultRegistry;
import androidx.activity.result.ActivityResultRegistryOwner;
import androidx.activity.result.contract.ActivityResultContract;
import androidx.arch.core.util.Function;
import androidx.core.app.ActivityOptionsCompat;
import androidx.core.app.SharedElementCallback;
import androidx.core.view.LayoutInflaterCompat;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.ViewTreeLifecycleOwner;
import androidx.lifecycle.ViewTreeViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import androidx.lifecycle.viewmodel.MutableCreationExtras;
import androidx.loader.app.LoaderManager;
import androidx.savedstate.SavedStateRegistry;
import androidx.savedstate.SavedStateRegistryController;
import androidx.savedstate.SavedStateRegistryOwner;
import androidx.savedstate.ViewTreeSavedStateRegistryOwner;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public class Fragment implements ComponentCallbacks, View.OnCreateContextMenuListener, LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, SavedStateRegistryOwner, ActivityResultCaller {
    static final int ACTIVITY_CREATED = 4;
    static final int ATTACHED = 0;
    static final int AWAITING_ENTER_EFFECTS = 6;
    static final int AWAITING_EXIT_EFFECTS = 3;
    static final int CREATED = 1;
    static final int INITIALIZING = -1;
    static final int RESUMED = 7;
    static final int STARTED = 5;
    static final Object USE_DEFAULT_TRANSITION = new Object();
    static final int VIEW_CREATED = 2;
    boolean mAdded;
    AnimationInfo mAnimationInfo;
    Bundle mArguments;
    int mBackStackNesting;
    boolean mBeingSaved;
    private boolean mCalled;
    FragmentManager mChildFragmentManager;
    ViewGroup mContainer;
    int mContainerId;
    private int mContentLayoutId;
    ViewModelProvider.Factory mDefaultFactory;
    boolean mDeferStart;
    boolean mDetached;
    int mFragmentId;
    FragmentManager mFragmentManager;
    boolean mFromLayout;
    boolean mHasMenu;
    boolean mHidden;
    boolean mHiddenChanged;
    FragmentHostCallback<?> mHost;
    boolean mInLayout;
    boolean mIsCreated;
    private Boolean mIsPrimaryNavigationFragment;
    LayoutInflater mLayoutInflater;
    LifecycleRegistry mLifecycleRegistry;
    Lifecycle.State mMaxState;
    boolean mMenuVisible;
    private final AtomicInteger mNextLocalRequestCode;
    private final ArrayList<OnPreAttachedListener> mOnPreAttachedListeners;
    Fragment mParentFragment;
    boolean mPerformedCreateView;
    Runnable mPostponedDurationRunnable;
    Handler mPostponedHandler;
    public String mPreviousWho;
    boolean mRemoving;
    boolean mRestored;
    boolean mRetainInstance;
    boolean mRetainInstanceChangedWhileDetached;
    Bundle mSavedFragmentState;
    private final OnPreAttachedListener mSavedStateAttachListener;
    SavedStateRegistryController mSavedStateRegistryController;
    Boolean mSavedUserVisibleHint;
    Bundle mSavedViewRegistryState;
    SparseArray<Parcelable> mSavedViewState;
    int mState;
    String mTag;
    Fragment mTarget;
    int mTargetRequestCode;
    String mTargetWho;
    boolean mUserVisibleHint;
    View mView;
    FragmentViewLifecycleOwner mViewLifecycleOwner;
    MutableLiveData<LifecycleOwner> mViewLifecycleOwnerLiveData;
    String mWho;

    private static abstract class OnPreAttachedListener {
        /* access modifiers changed from: package-private */
        public abstract void onPreAttached();

        private OnPreAttachedListener() {
        }
    }

    public Lifecycle getLifecycle() {
        return this.mLifecycleRegistry;
    }

    public LifecycleOwner getViewLifecycleOwner() {
        if (this.mViewLifecycleOwner != null) {
            return this.mViewLifecycleOwner;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    public LiveData<LifecycleOwner> getViewLifecycleOwnerLiveData() {
        return this.mViewLifecycleOwnerLiveData;
    }

    public ViewModelStore getViewModelStore() {
        if (this.mFragmentManager == null) {
            throw new IllegalStateException("Can't access ViewModels from detached fragment");
        } else if (getMinimumMaxLifecycleState() != Lifecycle.State.INITIALIZED.ordinal()) {
            return this.mFragmentManager.getViewModelStore(this);
        } else {
            throw new IllegalStateException("Calling getViewModelStore() before a Fragment reaches onCreate() when using setMaxLifecycle(INITIALIZED) is not supported");
        }
    }

    private int getMinimumMaxLifecycleState() {
        if (this.mMaxState == Lifecycle.State.INITIALIZED || this.mParentFragment == null) {
            return this.mMaxState.ordinal();
        }
        return Math.min(this.mMaxState.ordinal(), this.mParentFragment.getMinimumMaxLifecycleState());
    }

    public ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        if (this.mFragmentManager != null) {
            if (this.mDefaultFactory == null) {
                Application application = null;
                Context appContext = requireContext().getApplicationContext();
                while (true) {
                    if (!(appContext instanceof ContextWrapper)) {
                        break;
                    } else if (appContext instanceof Application) {
                        application = (Application) appContext;
                        break;
                    } else {
                        appContext = ((ContextWrapper) appContext).getBaseContext();
                    }
                }
                if (application == null && FragmentManager.isLoggingEnabled(3)) {
                    Log.d(FragmentManager.TAG, "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will need CreationExtras to use AndroidViewModel with the default ViewModelProvider.Factory");
                }
                this.mDefaultFactory = new SavedStateViewModelFactory(application, this, getArguments());
            }
            return this.mDefaultFactory;
        }
        throw new IllegalStateException("Can't access ViewModels from detached fragment");
    }

    public CreationExtras getDefaultViewModelCreationExtras() {
        Application application = null;
        Context appContext = requireContext().getApplicationContext();
        while (true) {
            if (!(appContext instanceof ContextWrapper)) {
                break;
            } else if (appContext instanceof Application) {
                application = (Application) appContext;
                break;
            } else {
                appContext = ((ContextWrapper) appContext).getBaseContext();
            }
        }
        if (application == null && FragmentManager.isLoggingEnabled(3)) {
            Log.d(FragmentManager.TAG, "Could not find Application instance from Context " + requireContext().getApplicationContext() + ", you will not be able to use AndroidViewModel with the default ViewModelProvider.Factory");
        }
        MutableCreationExtras extras = new MutableCreationExtras();
        if (application != null) {
            extras.set(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, application);
        }
        extras.set(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        extras.set(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if (getArguments() != null) {
            extras.set(SavedStateHandleSupport.DEFAULT_ARGS_KEY, getArguments());
        }
        return extras;
    }

    public final SavedStateRegistry getSavedStateRegistry() {
        return this.mSavedStateRegistryController.getSavedStateRegistry();
    }

    public static class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
            public SavedState createFromParcel(Parcel in) {
                return new SavedState(in, (ClassLoader) null);
            }

            public SavedState createFromParcel(Parcel in, ClassLoader loader) {
                return new SavedState(in, loader);
            }

            public SavedState[] newArray(int size) {
                return new SavedState[size];
            }
        };
        final Bundle mState;

        SavedState(Bundle state) {
            this.mState = state;
        }

        SavedState(Parcel in, ClassLoader loader) {
            this.mState = in.readBundle();
            if (loader != null && this.mState != null) {
                this.mState.setClassLoader(loader);
            }
        }

        public int describeContents() {
            return 0;
        }

        public void writeToParcel(Parcel dest, int flags) {
            dest.writeBundle(this.mState);
        }
    }

    public static class InstantiationException extends RuntimeException {
        public InstantiationException(String msg, Exception cause) {
            super(msg, cause);
        }
    }

    public Fragment() {
        this.mState = -1;
        this.mWho = UUID.randomUUID().toString();
        this.mTargetWho = null;
        this.mIsPrimaryNavigationFragment = null;
        this.mChildFragmentManager = new FragmentManagerImpl();
        this.mMenuVisible = true;
        this.mUserVisibleHint = true;
        this.mPostponedDurationRunnable = new Runnable() {
            public void run() {
                Fragment.this.startPostponedEnterTransition();
            }
        };
        this.mMaxState = Lifecycle.State.RESUMED;
        this.mViewLifecycleOwnerLiveData = new MutableLiveData<>();
        this.mNextLocalRequestCode = new AtomicInteger();
        this.mOnPreAttachedListeners = new ArrayList<>();
        this.mSavedStateAttachListener = new OnPreAttachedListener() {
            /* access modifiers changed from: package-private */
            public void onPreAttached() {
                Bundle savedStateRegistryState;
                Fragment.this.mSavedStateRegistryController.performAttach();
                SavedStateHandleSupport.enableSavedStateHandles(Fragment.this);
                if (Fragment.this.mSavedFragmentState != null) {
                    savedStateRegistryState = Fragment.this.mSavedFragmentState.getBundle("registryState");
                } else {
                    savedStateRegistryState = null;
                }
                Fragment.this.mSavedStateRegistryController.performRestore(savedStateRegistryState);
            }
        };
        initLifecycle();
    }

    public Fragment(int contentLayoutId) {
        this();
        this.mContentLayoutId = contentLayoutId;
    }

    private void initLifecycle() {
        this.mLifecycleRegistry = new LifecycleRegistry(this);
        this.mSavedStateRegistryController = SavedStateRegistryController.create(this);
        this.mDefaultFactory = null;
        if (!this.mOnPreAttachedListeners.contains(this.mSavedStateAttachListener)) {
            registerOnPreAttachListener(this.mSavedStateAttachListener);
        }
    }

    @Deprecated
    public static Fragment instantiate(Context context, String fname) {
        return instantiate(context, fname, (Bundle) null);
    }

    @Deprecated
    public static Fragment instantiate(Context context, String fname, Bundle args) {
        try {
            Fragment f = (Fragment) FragmentFactory.loadFragmentClass(context.getClassLoader(), fname).getConstructor(new Class[0]).newInstance(new Object[0]);
            if (args != null) {
                args.setClassLoader(f.getClass().getClassLoader());
                f.setArguments(args);
            }
            return f;
        } catch (InstantiationException e) {
            throw new InstantiationException("Unable to instantiate fragment " + fname + ": make sure class name exists, is public, and has an empty constructor that is public", e);
        } catch (IllegalAccessException e2) {
            throw new InstantiationException("Unable to instantiate fragment " + fname + ": make sure class name exists, is public, and has an empty constructor that is public", e2);
        } catch (NoSuchMethodException e3) {
            throw new InstantiationException("Unable to instantiate fragment " + fname + ": could not find Fragment constructor", e3);
        } catch (InvocationTargetException e4) {
            throw new InstantiationException("Unable to instantiate fragment " + fname + ": calling Fragment constructor caused an exception", e4);
        }
    }

    /* access modifiers changed from: package-private */
    public final void restoreViewState(Bundle savedInstanceState) {
        if (this.mSavedViewState != null) {
            this.mView.restoreHierarchyState(this.mSavedViewState);
            this.mSavedViewState = null;
        }
        this.mCalled = false;
        onViewStateRestored(savedInstanceState);
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onViewStateRestored()");
        } else if (this.mView != null) {
            this.mViewLifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean isInBackStack() {
        return this.mBackStackNesting > 0;
    }

    public final boolean equals(Object o) {
        return super.equals(o);
    }

    public final int hashCode() {
        return super.hashCode();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(128);
        sb.append(getClass().getSimpleName());
        sb.append("{");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("}");
        sb.append(" (");
        sb.append(this.mWho);
        if (this.mFragmentId != 0) {
            sb.append(" id=0x");
            sb.append(Integer.toHexString(this.mFragmentId));
        }
        if (this.mTag != null) {
            sb.append(" tag=");
            sb.append(this.mTag);
        }
        sb.append(")");
        return sb.toString();
    }

    public final int getId() {
        return this.mFragmentId;
    }

    public final String getTag() {
        return this.mTag;
    }

    public void setArguments(Bundle args) {
        if (this.mFragmentManager == null || !isStateSaved()) {
            this.mArguments = args;
            return;
        }
        throw new IllegalStateException("Fragment already added and state has been saved");
    }

    public final Bundle getArguments() {
        return this.mArguments;
    }

    public final Bundle requireArguments() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments;
        }
        throw new IllegalStateException("Fragment " + this + " does not have any arguments.");
    }

    public final boolean isStateSaved() {
        if (this.mFragmentManager == null) {
            return false;
        }
        return this.mFragmentManager.isStateSaved();
    }

    public void setInitialSavedState(SavedState state) {
        if (this.mFragmentManager == null) {
            this.mSavedFragmentState = (state == null || state.mState == null) ? null : state.mState;
            return;
        }
        throw new IllegalStateException("Fragment already added");
    }

    @Deprecated
    public void setTargetFragment(Fragment fragment, int requestCode) {
        FragmentManager theirs;
        if (fragment != null) {
            FragmentStrictMode.onSetTargetFragmentUsage(this, fragment, requestCode);
        }
        FragmentManager mine = this.mFragmentManager;
        if (fragment != null) {
            theirs = fragment.mFragmentManager;
        } else {
            theirs = null;
        }
        if (mine == null || theirs == null || mine == theirs) {
            Fragment check = fragment;
            while (check != null) {
                if (!check.equals(this)) {
                    check = check.getTargetFragment(false);
                } else {
                    throw new IllegalArgumentException("Setting " + fragment + " as the target of " + this + " would create a target cycle");
                }
            }
            if (fragment == null) {
                this.mTargetWho = null;
                this.mTarget = null;
            } else if (this.mFragmentManager == null || fragment.mFragmentManager == null) {
                this.mTargetWho = null;
                this.mTarget = fragment;
            } else {
                this.mTargetWho = fragment.mWho;
                this.mTarget = null;
            }
            this.mTargetRequestCode = requestCode;
            return;
        }
        throw new IllegalArgumentException("Fragment " + fragment + " must share the same FragmentManager to be set as a target fragment");
    }

    @Deprecated
    public final Fragment getTargetFragment() {
        return getTargetFragment(true);
    }

    private Fragment getTargetFragment(boolean logViolations) {
        if (logViolations) {
            FragmentStrictMode.onGetTargetFragmentUsage(this);
        }
        if (this.mTarget != null) {
            return this.mTarget;
        }
        if (this.mFragmentManager == null || this.mTargetWho == null) {
            return null;
        }
        return this.mFragmentManager.findActiveFragment(this.mTargetWho);
    }

    @Deprecated
    public final int getTargetRequestCode() {
        FragmentStrictMode.onGetTargetFragmentRequestCodeUsage(this);
        return this.mTargetRequestCode;
    }

    public Context getContext() {
        if (this.mHost == null) {
            return null;
        }
        return this.mHost.getContext();
    }

    public final Context requireContext() {
        Context context = getContext();
        if (context != null) {
            return context;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a context.");
    }

    public final FragmentActivity getActivity() {
        if (this.mHost == null) {
            return null;
        }
        return (FragmentActivity) this.mHost.getActivity();
    }

    public final FragmentActivity requireActivity() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            return activity;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to an activity.");
    }

    public final Object getHost() {
        if (this.mHost == null) {
            return null;
        }
        return this.mHost.onGetHost();
    }

    public final Object requireHost() {
        Object host = getHost();
        if (host != null) {
            return host;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to a host.");
    }

    public final Resources getResources() {
        return requireContext().getResources();
    }

    public final CharSequence getText(int resId) {
        return getResources().getText(resId);
    }

    public final String getString(int resId) {
        return getResources().getString(resId);
    }

    public final String getString(int resId, Object... formatArgs) {
        return getResources().getString(resId, formatArgs);
    }

    @Deprecated
    public final FragmentManager getFragmentManager() {
        return this.mFragmentManager;
    }

    public final FragmentManager getParentFragmentManager() {
        FragmentManager fragmentManager = this.mFragmentManager;
        if (fragmentManager != null) {
            return fragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " not associated with a fragment manager.");
    }

    @Deprecated
    public final FragmentManager requireFragmentManager() {
        return getParentFragmentManager();
    }

    public final FragmentManager getChildFragmentManager() {
        if (this.mHost != null) {
            return this.mChildFragmentManager;
        }
        throw new IllegalStateException("Fragment " + this + " has not been attached yet.");
    }

    public final Fragment getParentFragment() {
        return this.mParentFragment;
    }

    public final Fragment requireParentFragment() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null) {
            return parentFragment;
        }
        if (getContext() == null) {
            throw new IllegalStateException("Fragment " + this + " is not attached to any Fragment or host");
        }
        throw new IllegalStateException("Fragment " + this + " is not a child Fragment, it is directly attached to " + getContext());
    }

    public final boolean isAdded() {
        return this.mHost != null && this.mAdded;
    }

    public final boolean isDetached() {
        return this.mDetached;
    }

    public final boolean isRemoving() {
        return this.mRemoving;
    }

    public final boolean isInLayout() {
        return this.mInLayout;
    }

    public final boolean isResumed() {
        return this.mState >= 7;
    }

    public final boolean isVisible() {
        return isAdded() && !isHidden() && this.mView != null && this.mView.getWindowToken() != null && this.mView.getVisibility() == 0;
    }

    public final boolean isHidden() {
        return this.mHidden || (this.mFragmentManager != null && this.mFragmentManager.isParentHidden(this.mParentFragment));
    }

    public final boolean hasOptionsMenu() {
        return this.mHasMenu;
    }

    public final boolean isMenuVisible() {
        return this.mMenuVisible && (this.mFragmentManager == null || this.mFragmentManager.isParentMenuVisible(this.mParentFragment));
    }

    public void onHiddenChanged(boolean hidden) {
    }

    @Deprecated
    public void setRetainInstance(boolean retain) {
        FragmentStrictMode.onSetRetainInstanceUsage(this);
        this.mRetainInstance = retain;
        if (this.mFragmentManager == null) {
            this.mRetainInstanceChangedWhileDetached = true;
        } else if (retain) {
            this.mFragmentManager.addRetainedFragment(this);
        } else {
            this.mFragmentManager.removeRetainedFragment(this);
        }
    }

    @Deprecated
    public final boolean getRetainInstance() {
        FragmentStrictMode.onGetRetainInstanceUsage(this);
        return this.mRetainInstance;
    }

    @Deprecated
    public void setHasOptionsMenu(boolean hasMenu) {
        if (this.mHasMenu != hasMenu) {
            this.mHasMenu = hasMenu;
            if (isAdded() && !isHidden()) {
                this.mHost.onSupportInvalidateOptionsMenu();
            }
        }
    }

    public void setMenuVisibility(boolean menuVisible) {
        if (this.mMenuVisible != menuVisible) {
            this.mMenuVisible = menuVisible;
            if (this.mHasMenu && isAdded() && !isHidden()) {
                this.mHost.onSupportInvalidateOptionsMenu();
            }
        }
    }

    @Deprecated
    public void setUserVisibleHint(boolean isVisibleToUser) {
        FragmentStrictMode.onSetUserVisibleHint(this, isVisibleToUser);
        if (!this.mUserVisibleHint && isVisibleToUser && this.mState < 5 && this.mFragmentManager != null && isAdded() && this.mIsCreated) {
            this.mFragmentManager.performPendingDeferredStart(this.mFragmentManager.createOrGetFragmentStateManager(this));
        }
        this.mUserVisibleHint = isVisibleToUser;
        this.mDeferStart = this.mState < 5 && !isVisibleToUser;
        if (this.mSavedFragmentState != null) {
            this.mSavedUserVisibleHint = Boolean.valueOf(isVisibleToUser);
        }
    }

    @Deprecated
    public boolean getUserVisibleHint() {
        return this.mUserVisibleHint;
    }

    @Deprecated
    public LoaderManager getLoaderManager() {
        return LoaderManager.getInstance(this);
    }

    public void startActivity(Intent intent) {
        startActivity(intent, (Bundle) null);
    }

    public void startActivity(Intent intent, Bundle options) {
        if (this.mHost != null) {
            this.mHost.onStartActivityFromFragment(this, intent, -1, options);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int requestCode) {
        startActivityForResult(intent, requestCode, (Bundle) null);
    }

    @Deprecated
    public void startActivityForResult(Intent intent, int requestCode, Bundle options) {
        if (this.mHost != null) {
            getParentFragmentManager().launchStartActivityForResult(this, intent, requestCode, options);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void startIntentSenderForResult(IntentSender intent, int requestCode, Intent fillInIntent, int flagsMask, int flagsValues, int extraFlags, Bundle options) throws IntentSender.SendIntentException {
        if (this.mHost != null) {
            if (FragmentManager.isLoggingEnabled(2)) {
                IntentSender intentSender = intent;
                Log.v(FragmentManager.TAG, "Fragment " + this + " received the following in startIntentSenderForResult() requestCode: " + requestCode + " IntentSender: " + intent + " fillInIntent: " + fillInIntent + " options: " + options);
            } else {
                IntentSender intentSender2 = intent;
                int i = requestCode;
                Intent intent2 = fillInIntent;
                Bundle bundle = options;
            }
            getParentFragmentManager().launchStartIntentSenderForResult(this, intent, requestCode, fillInIntent, flagsMask, flagsValues, extraFlags, options);
            return;
        }
        IntentSender intentSender3 = intent;
        int i2 = requestCode;
        Intent intent3 = fillInIntent;
        Bundle bundle2 = options;
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v(FragmentManager.TAG, "Fragment " + this + " received the following in onActivityResult(): requestCode: " + requestCode + " resultCode: " + resultCode + " data: " + data);
        }
    }

    @Deprecated
    public final void requestPermissions(String[] permissions, int requestCode) {
        if (this.mHost != null) {
            getParentFragmentManager().launchRequestPermissions(this, permissions, requestCode);
            return;
        }
        throw new IllegalStateException("Fragment " + this + " not attached to Activity");
    }

    @Deprecated
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
    }

    public boolean shouldShowRequestPermissionRationale(String permission) {
        if (this.mHost != null) {
            return this.mHost.onShouldShowRequestPermissionRationale(permission);
        }
        return false;
    }

    public LayoutInflater onGetLayoutInflater(Bundle savedInstanceState) {
        return getLayoutInflater(savedInstanceState);
    }

    public final LayoutInflater getLayoutInflater() {
        if (this.mLayoutInflater == null) {
            return performGetLayoutInflater((Bundle) null);
        }
        return this.mLayoutInflater;
    }

    /* access modifiers changed from: package-private */
    public LayoutInflater performGetLayoutInflater(Bundle savedInstanceState) {
        this.mLayoutInflater = onGetLayoutInflater(savedInstanceState);
        return this.mLayoutInflater;
    }

    @Deprecated
    public LayoutInflater getLayoutInflater(Bundle savedFragmentState) {
        if (this.mHost != null) {
            LayoutInflater result = this.mHost.onGetLayoutInflater();
            LayoutInflaterCompat.setFactory2(result, this.mChildFragmentManager.getLayoutInflaterFactory());
            return result;
        }
        throw new IllegalStateException("onGetLayoutInflater() cannot be executed until the Fragment is attached to the FragmentManager.");
    }

    public void onInflate(Context context, AttributeSet attrs, Bundle savedInstanceState) {
        this.mCalled = true;
        Activity hostActivity = this.mHost == null ? null : this.mHost.getActivity();
        if (hostActivity != null) {
            this.mCalled = false;
            onInflate(hostActivity, attrs, savedInstanceState);
        }
    }

    @Deprecated
    public void onInflate(Activity activity, AttributeSet attrs, Bundle savedInstanceState) {
        this.mCalled = true;
    }

    @Deprecated
    public void onAttachFragment(Fragment childFragment) {
    }

    public void onAttach(Context context) {
        this.mCalled = true;
        Activity hostActivity = this.mHost == null ? null : this.mHost.getActivity();
        if (hostActivity != null) {
            this.mCalled = false;
            onAttach(hostActivity);
        }
    }

    @Deprecated
    public void onAttach(Activity activity) {
        this.mCalled = true;
    }

    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) {
        return null;
    }

    public Animator onCreateAnimator(int transit, boolean enter, int nextAnim) {
        return null;
    }

    public void onCreate(Bundle savedInstanceState) {
        this.mCalled = true;
        restoreChildFragmentState();
        if (!this.mChildFragmentManager.isStateAtLeast(1)) {
            this.mChildFragmentManager.dispatchCreate();
        }
    }

    /* access modifiers changed from: package-private */
    public void restoreChildFragmentState() {
        Bundle childFragmentManagerState;
        if (this.mSavedFragmentState != null && (childFragmentManagerState = this.mSavedFragmentState.getBundle("childFragmentManager")) != null) {
            this.mChildFragmentManager.restoreSaveStateInternal(childFragmentManagerState);
            this.mChildFragmentManager.dispatchCreate();
        }
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (this.mContentLayoutId != 0) {
            return inflater.inflate(this.mContentLayoutId, container, false);
        }
        return null;
    }

    public void onViewCreated(View view, Bundle savedInstanceState) {
    }

    public View getView() {
        return this.mView;
    }

    public final View requireView() {
        View view = getView();
        if (view != null) {
            return view;
        }
        throw new IllegalStateException("Fragment " + this + " did not return a View from onCreateView() or this was called before onCreateView().");
    }

    @Deprecated
    public void onActivityCreated(Bundle savedInstanceState) {
        this.mCalled = true;
    }

    public void onViewStateRestored(Bundle savedInstanceState) {
        this.mCalled = true;
    }

    public void onStart() {
        this.mCalled = true;
    }

    public void onResume() {
        this.mCalled = true;
    }

    public void onSaveInstanceState(Bundle outState) {
    }

    public void onMultiWindowModeChanged(boolean isInMultiWindowMode) {
    }

    public void onPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
    }

    public void onConfigurationChanged(Configuration newConfig) {
        this.mCalled = true;
    }

    public void onPrimaryNavigationFragmentChanged(boolean isPrimaryNavigationFragment) {
    }

    public void onPause() {
        this.mCalled = true;
    }

    public void onStop() {
        this.mCalled = true;
    }

    public void onLowMemory() {
        this.mCalled = true;
    }

    public void onDestroyView() {
        this.mCalled = true;
    }

    public void onDestroy() {
        this.mCalled = true;
    }

    /* access modifiers changed from: package-private */
    public void initState() {
        initLifecycle();
        this.mPreviousWho = this.mWho;
        this.mWho = UUID.randomUUID().toString();
        this.mAdded = false;
        this.mRemoving = false;
        this.mFromLayout = false;
        this.mInLayout = false;
        this.mRestored = false;
        this.mBackStackNesting = 0;
        this.mFragmentManager = null;
        this.mChildFragmentManager = new FragmentManagerImpl();
        this.mHost = null;
        this.mFragmentId = 0;
        this.mContainerId = 0;
        this.mTag = null;
        this.mHidden = false;
        this.mDetached = false;
    }

    public void onDetach() {
        this.mCalled = true;
    }

    @Deprecated
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
    }

    @Deprecated
    public void onPrepareOptionsMenu(Menu menu) {
    }

    @Deprecated
    public void onDestroyOptionsMenu() {
    }

    @Deprecated
    public boolean onOptionsItemSelected(MenuItem item) {
        return false;
    }

    @Deprecated
    public void onOptionsMenuClosed(Menu menu) {
    }

    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        requireActivity().onCreateContextMenu(menu, v, menuInfo);
    }

    public void registerForContextMenu(View view) {
        view.setOnCreateContextMenuListener(this);
    }

    public void unregisterForContextMenu(View view) {
        view.setOnCreateContextMenuListener((View.OnCreateContextMenuListener) null);
    }

    public boolean onContextItemSelected(MenuItem item) {
        return false;
    }

    public void setEnterSharedElementCallback(SharedElementCallback callback) {
        ensureAnimationInfo().mEnterTransitionCallback = callback;
    }

    public void setExitSharedElementCallback(SharedElementCallback callback) {
        ensureAnimationInfo().mExitTransitionCallback = callback;
    }

    public void setEnterTransition(Object transition) {
        ensureAnimationInfo().mEnterTransition = transition;
    }

    public Object getEnterTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.mEnterTransition;
    }

    public void setReturnTransition(Object transition) {
        ensureAnimationInfo().mReturnTransition = transition;
    }

    public Object getReturnTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        if (this.mAnimationInfo.mReturnTransition == USE_DEFAULT_TRANSITION) {
            return getEnterTransition();
        }
        return this.mAnimationInfo.mReturnTransition;
    }

    public void setExitTransition(Object transition) {
        ensureAnimationInfo().mExitTransition = transition;
    }

    public Object getExitTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.mExitTransition;
    }

    public void setReenterTransition(Object transition) {
        ensureAnimationInfo().mReenterTransition = transition;
    }

    public Object getReenterTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        if (this.mAnimationInfo.mReenterTransition == USE_DEFAULT_TRANSITION) {
            return getExitTransition();
        }
        return this.mAnimationInfo.mReenterTransition;
    }

    public void setSharedElementEnterTransition(Object transition) {
        ensureAnimationInfo().mSharedElementEnterTransition = transition;
    }

    public Object getSharedElementEnterTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.mSharedElementEnterTransition;
    }

    public void setSharedElementReturnTransition(Object transition) {
        ensureAnimationInfo().mSharedElementReturnTransition = transition;
    }

    public Object getSharedElementReturnTransition() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        if (this.mAnimationInfo.mSharedElementReturnTransition == USE_DEFAULT_TRANSITION) {
            return getSharedElementEnterTransition();
        }
        return this.mAnimationInfo.mSharedElementReturnTransition;
    }

    public void setAllowEnterTransitionOverlap(boolean allow) {
        ensureAnimationInfo().mAllowEnterTransitionOverlap = Boolean.valueOf(allow);
    }

    public boolean getAllowEnterTransitionOverlap() {
        if (this.mAnimationInfo == null || this.mAnimationInfo.mAllowEnterTransitionOverlap == null) {
            return true;
        }
        return this.mAnimationInfo.mAllowEnterTransitionOverlap.booleanValue();
    }

    public void setAllowReturnTransitionOverlap(boolean allow) {
        ensureAnimationInfo().mAllowReturnTransitionOverlap = Boolean.valueOf(allow);
    }

    public boolean getAllowReturnTransitionOverlap() {
        if (this.mAnimationInfo == null || this.mAnimationInfo.mAllowReturnTransitionOverlap == null) {
            return true;
        }
        return this.mAnimationInfo.mAllowReturnTransitionOverlap.booleanValue();
    }

    public void postponeEnterTransition() {
        ensureAnimationInfo().mEnterTransitionPostponed = true;
    }

    public final void postponeEnterTransition(long duration, TimeUnit timeUnit) {
        ensureAnimationInfo().mEnterTransitionPostponed = true;
        if (this.mPostponedHandler != null) {
            this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        }
        if (this.mFragmentManager != null) {
            this.mPostponedHandler = this.mFragmentManager.getHost().getHandler();
        } else {
            this.mPostponedHandler = new Handler(Looper.getMainLooper());
        }
        this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
        this.mPostponedHandler.postDelayed(this.mPostponedDurationRunnable, timeUnit.toMillis(duration));
    }

    public void startPostponedEnterTransition() {
        if (this.mAnimationInfo != null && ensureAnimationInfo().mEnterTransitionPostponed) {
            if (this.mHost == null) {
                ensureAnimationInfo().mEnterTransitionPostponed = false;
            } else if (Looper.myLooper() != this.mHost.getHandler().getLooper()) {
                this.mHost.getHandler().postAtFrontOfQueue(new Runnable() {
                    public void run() {
                        Fragment.this.callStartTransitionListener(false);
                    }
                });
            } else {
                callStartTransitionListener(true);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void callStartTransitionListener(boolean calledDirectly) {
        if (this.mAnimationInfo != null) {
            this.mAnimationInfo.mEnterTransitionPostponed = false;
        }
        if (this.mView != null && this.mContainer != null && this.mFragmentManager != null) {
            final SpecialEffectsController controller = SpecialEffectsController.getOrCreateController(this.mContainer, this.mFragmentManager);
            controller.markPostponedState();
            if (calledDirectly) {
                this.mHost.getHandler().post(new Runnable() {
                    public void run() {
                        controller.executePendingOperations();
                    }
                });
            } else {
                controller.executePendingOperations();
            }
            if (this.mPostponedHandler != null) {
                this.mPostponedHandler.removeCallbacks(this.mPostponedDurationRunnable);
                this.mPostponedHandler = null;
            }
        }
    }

    public void dump(String prefix, FileDescriptor fd, PrintWriter writer, String[] args) {
        writer.print(prefix);
        writer.print("mFragmentId=#");
        writer.print(Integer.toHexString(this.mFragmentId));
        writer.print(" mContainerId=#");
        writer.print(Integer.toHexString(this.mContainerId));
        writer.print(" mTag=");
        writer.println(this.mTag);
        writer.print(prefix);
        writer.print("mState=");
        writer.print(this.mState);
        writer.print(" mWho=");
        writer.print(this.mWho);
        writer.print(" mBackStackNesting=");
        writer.println(this.mBackStackNesting);
        writer.print(prefix);
        writer.print("mAdded=");
        writer.print(this.mAdded);
        writer.print(" mRemoving=");
        writer.print(this.mRemoving);
        writer.print(" mFromLayout=");
        writer.print(this.mFromLayout);
        writer.print(" mInLayout=");
        writer.println(this.mInLayout);
        writer.print(prefix);
        writer.print("mHidden=");
        writer.print(this.mHidden);
        writer.print(" mDetached=");
        writer.print(this.mDetached);
        writer.print(" mMenuVisible=");
        writer.print(this.mMenuVisible);
        writer.print(" mHasMenu=");
        writer.println(this.mHasMenu);
        writer.print(prefix);
        writer.print("mRetainInstance=");
        writer.print(this.mRetainInstance);
        writer.print(" mUserVisibleHint=");
        writer.println(this.mUserVisibleHint);
        if (this.mFragmentManager != null) {
            writer.print(prefix);
            writer.print("mFragmentManager=");
            writer.println(this.mFragmentManager);
        }
        if (this.mHost != null) {
            writer.print(prefix);
            writer.print("mHost=");
            writer.println(this.mHost);
        }
        if (this.mParentFragment != null) {
            writer.print(prefix);
            writer.print("mParentFragment=");
            writer.println(this.mParentFragment);
        }
        if (this.mArguments != null) {
            writer.print(prefix);
            writer.print("mArguments=");
            writer.println(this.mArguments);
        }
        if (this.mSavedFragmentState != null) {
            writer.print(prefix);
            writer.print("mSavedFragmentState=");
            writer.println(this.mSavedFragmentState);
        }
        if (this.mSavedViewState != null) {
            writer.print(prefix);
            writer.print("mSavedViewState=");
            writer.println(this.mSavedViewState);
        }
        if (this.mSavedViewRegistryState != null) {
            writer.print(prefix);
            writer.print("mSavedViewRegistryState=");
            writer.println(this.mSavedViewRegistryState);
        }
        Fragment target = getTargetFragment(false);
        if (target != null) {
            writer.print(prefix);
            writer.print("mTarget=");
            writer.print(target);
            writer.print(" mTargetRequestCode=");
            writer.println(this.mTargetRequestCode);
        }
        writer.print(prefix);
        writer.print("mPopDirection=");
        writer.println(getPopDirection());
        if (getEnterAnim() != 0) {
            writer.print(prefix);
            writer.print("getEnterAnim=");
            writer.println(getEnterAnim());
        }
        if (getExitAnim() != 0) {
            writer.print(prefix);
            writer.print("getExitAnim=");
            writer.println(getExitAnim());
        }
        if (getPopEnterAnim() != 0) {
            writer.print(prefix);
            writer.print("getPopEnterAnim=");
            writer.println(getPopEnterAnim());
        }
        if (getPopExitAnim() != 0) {
            writer.print(prefix);
            writer.print("getPopExitAnim=");
            writer.println(getPopExitAnim());
        }
        if (this.mContainer != null) {
            writer.print(prefix);
            writer.print("mContainer=");
            writer.println(this.mContainer);
        }
        if (this.mView != null) {
            writer.print(prefix);
            writer.print("mView=");
            writer.println(this.mView);
        }
        if (getAnimatingAway() != null) {
            writer.print(prefix);
            writer.print("mAnimatingAway=");
            writer.println(getAnimatingAway());
        }
        if (getContext() != null) {
            LoaderManager.getInstance(this).dump(prefix, fd, writer, args);
        }
        writer.print(prefix);
        writer.println("Child " + this.mChildFragmentManager + ":");
        this.mChildFragmentManager.dump(prefix + "  ", fd, writer, args);
    }

    /* access modifiers changed from: package-private */
    public Fragment findFragmentByWho(String who) {
        if (who.equals(this.mWho)) {
            return this;
        }
        return this.mChildFragmentManager.findFragmentByWho(who);
    }

    /* access modifiers changed from: package-private */
    public FragmentContainer createFragmentContainer() {
        return new FragmentContainer() {
            public View onFindViewById(int id) {
                if (Fragment.this.mView != null) {
                    return Fragment.this.mView.findViewById(id);
                }
                throw new IllegalStateException("Fragment " + Fragment.this + " does not have a view");
            }

            public boolean onHasView() {
                return Fragment.this.mView != null;
            }
        };
    }

    /* access modifiers changed from: package-private */
    public void performAttach() {
        Iterator<OnPreAttachedListener> it = this.mOnPreAttachedListeners.iterator();
        while (it.hasNext()) {
            it.next().onPreAttached();
        }
        this.mOnPreAttachedListeners.clear();
        this.mChildFragmentManager.attachController(this.mHost, createFragmentContainer(), this);
        this.mState = 0;
        this.mCalled = false;
        onAttach(this.mHost.getContext());
        if (this.mCalled) {
            this.mFragmentManager.dispatchOnAttachFragment(this);
            this.mChildFragmentManager.dispatchAttach();
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onAttach()");
    }

    /* access modifiers changed from: package-private */
    public void performCreate(Bundle savedInstanceState) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mState = 1;
        this.mCalled = false;
        this.mLifecycleRegistry.addObserver(new LifecycleEventObserver() {
            public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_STOP && Fragment.this.mView != null) {
                    Api19Impl.cancelPendingInputEvents(Fragment.this.mView);
                }
            }
        });
        onCreate(savedInstanceState);
        this.mIsCreated = true;
        if (this.mCalled) {
            this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onCreate()");
    }

    /* access modifiers changed from: package-private */
    public void performCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mPerformedCreateView = true;
        this.mViewLifecycleOwner = new FragmentViewLifecycleOwner(this, getViewModelStore(), new Fragment$$ExternalSyntheticLambda0(this));
        this.mView = onCreateView(inflater, container, savedInstanceState);
        if (this.mView != null) {
            this.mViewLifecycleOwner.initialize();
            if (FragmentManager.isLoggingEnabled(3)) {
                Log.d(FragmentManager.TAG, "Setting ViewLifecycleOwner on View " + this.mView + " for Fragment " + this);
            }
            ViewTreeLifecycleOwner.set(this.mView, this.mViewLifecycleOwner);
            ViewTreeViewModelStoreOwner.set(this.mView, this.mViewLifecycleOwner);
            ViewTreeSavedStateRegistryOwner.set(this.mView, this.mViewLifecycleOwner);
            this.mViewLifecycleOwnerLiveData.setValue(this.mViewLifecycleOwner);
        } else if (!this.mViewLifecycleOwner.isInitialized()) {
            this.mViewLifecycleOwner = null;
        } else {
            throw new IllegalStateException("Called getViewLifecycleOwner() but onCreateView() returned null");
        }
    }

    /* access modifiers changed from: package-private */
    /* renamed from: lambda$performCreateView$0$androidx-fragment-app-Fragment  reason: not valid java name */
    public /* synthetic */ void m138lambda$performCreateView$0$androidxfragmentappFragment() {
        this.mViewLifecycleOwner.performRestore(this.mSavedViewRegistryState);
        this.mSavedViewRegistryState = null;
    }

    /* access modifiers changed from: package-private */
    public void performViewCreated() {
        Bundle savedInstanceState = null;
        if (this.mSavedFragmentState != null) {
            savedInstanceState = this.mSavedFragmentState.getBundle("savedInstanceState");
        }
        onViewCreated(this.mView, savedInstanceState);
        this.mChildFragmentManager.dispatchViewCreated();
    }

    /* access modifiers changed from: package-private */
    public void performActivityCreated(Bundle savedInstanceState) {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mState = 3;
        this.mCalled = false;
        onActivityCreated(savedInstanceState);
        if (this.mCalled) {
            restoreViewState();
            this.mChildFragmentManager.dispatchActivityCreated();
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onActivityCreated()");
    }

    private void restoreViewState() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d(FragmentManager.TAG, "moveto RESTORE_VIEW_STATE: " + this);
        }
        if (this.mView != null) {
            Bundle savedInstanceState = null;
            if (this.mSavedFragmentState != null) {
                savedInstanceState = this.mSavedFragmentState.getBundle("savedInstanceState");
            }
            restoreViewState(savedInstanceState);
        }
        this.mSavedFragmentState = null;
    }

    /* access modifiers changed from: package-private */
    public void performStart() {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mChildFragmentManager.execPendingActions(true);
        this.mState = 5;
        this.mCalled = false;
        onStart();
        if (this.mCalled) {
            this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_START);
            if (this.mView != null) {
                this.mViewLifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_START);
            }
            this.mChildFragmentManager.dispatchStart();
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onStart()");
    }

    /* access modifiers changed from: package-private */
    public void performResume() {
        this.mChildFragmentManager.noteStateNotSaved();
        this.mChildFragmentManager.execPendingActions(true);
        this.mState = 7;
        this.mCalled = false;
        onResume();
        if (this.mCalled) {
            this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
            if (this.mView != null) {
                this.mViewLifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
            }
            this.mChildFragmentManager.dispatchResume();
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onResume()");
    }

    /* access modifiers changed from: package-private */
    public void noteStateNotSaved() {
        this.mChildFragmentManager.noteStateNotSaved();
    }

    /* access modifiers changed from: package-private */
    public void performPrimaryNavigationFragmentChanged() {
        boolean isPrimaryNavigationFragment = this.mFragmentManager.isPrimaryNavigation(this);
        if (this.mIsPrimaryNavigationFragment == null || this.mIsPrimaryNavigationFragment.booleanValue() != isPrimaryNavigationFragment) {
            this.mIsPrimaryNavigationFragment = Boolean.valueOf(isPrimaryNavigationFragment);
            onPrimaryNavigationFragmentChanged(isPrimaryNavigationFragment);
            this.mChildFragmentManager.dispatchPrimaryNavigationFragmentChanged();
        }
    }

    /* access modifiers changed from: package-private */
    public void performMultiWindowModeChanged(boolean isInMultiWindowMode) {
        onMultiWindowModeChanged(isInMultiWindowMode);
    }

    /* access modifiers changed from: package-private */
    public void performPictureInPictureModeChanged(boolean isInPictureInPictureMode) {
        onPictureInPictureModeChanged(isInPictureInPictureMode);
    }

    /* access modifiers changed from: package-private */
    public void performConfigurationChanged(Configuration newConfig) {
        onConfigurationChanged(newConfig);
    }

    /* access modifiers changed from: package-private */
    public void performLowMemory() {
        onLowMemory();
    }

    /* access modifiers changed from: package-private */
    public boolean performCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        boolean show = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            show = true;
            onCreateOptionsMenu(menu, inflater);
        }
        return show | this.mChildFragmentManager.dispatchCreateOptionsMenu(menu, inflater);
    }

    /* access modifiers changed from: package-private */
    public boolean performPrepareOptionsMenu(Menu menu) {
        boolean show = false;
        if (this.mHidden) {
            return false;
        }
        if (this.mHasMenu && this.mMenuVisible) {
            show = true;
            onPrepareOptionsMenu(menu);
        }
        return show | this.mChildFragmentManager.dispatchPrepareOptionsMenu(menu);
    }

    /* access modifiers changed from: package-private */
    public boolean performOptionsItemSelected(MenuItem item) {
        if (this.mHidden) {
            return false;
        }
        if (!this.mHasMenu || !this.mMenuVisible || !onOptionsItemSelected(item)) {
            return this.mChildFragmentManager.dispatchOptionsItemSelected(item);
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean performContextItemSelected(MenuItem item) {
        if (this.mHidden) {
            return false;
        }
        if (onContextItemSelected(item)) {
            return true;
        }
        return this.mChildFragmentManager.dispatchContextItemSelected(item);
    }

    /* access modifiers changed from: package-private */
    public void performOptionsMenuClosed(Menu menu) {
        if (!this.mHidden) {
            if (this.mHasMenu && this.mMenuVisible) {
                onOptionsMenuClosed(menu);
            }
            this.mChildFragmentManager.dispatchOptionsMenuClosed(menu);
        }
    }

    /* access modifiers changed from: package-private */
    public void performSaveInstanceState(Bundle outState) {
        onSaveInstanceState(outState);
    }

    /* access modifiers changed from: package-private */
    public void performPause() {
        this.mChildFragmentManager.dispatchPause();
        if (this.mView != null) {
            this.mViewLifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        this.mState = 6;
        this.mCalled = false;
        onPause();
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onPause()");
        }
    }

    /* access modifiers changed from: package-private */
    public void performStop() {
        this.mChildFragmentManager.dispatchStop();
        if (this.mView != null) {
            this.mViewLifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        }
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        this.mState = 4;
        this.mCalled = false;
        onStop();
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onStop()");
        }
    }

    /* access modifiers changed from: package-private */
    public void performDestroyView() {
        this.mChildFragmentManager.dispatchDestroyView();
        if (this.mView != null && this.mViewLifecycleOwner.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
            this.mViewLifecycleOwner.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        }
        this.mState = 1;
        this.mCalled = false;
        onDestroyView();
        if (this.mCalled) {
            LoaderManager.getInstance(this).markForRedelivery();
            this.mPerformedCreateView = false;
            return;
        }
        throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDestroyView()");
    }

    /* access modifiers changed from: package-private */
    public void performDestroy() {
        this.mChildFragmentManager.dispatchDestroy();
        this.mLifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        this.mState = 0;
        this.mCalled = false;
        this.mIsCreated = false;
        onDestroy();
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDestroy()");
        }
    }

    /* access modifiers changed from: package-private */
    public void performDetach() {
        this.mState = -1;
        this.mCalled = false;
        onDetach();
        this.mLayoutInflater = null;
        if (!this.mCalled) {
            throw new SuperNotCalledException("Fragment " + this + " did not call through to super.onDetach()");
        } else if (!this.mChildFragmentManager.isDestroyed()) {
            this.mChildFragmentManager.dispatchDestroy();
            this.mChildFragmentManager = new FragmentManagerImpl();
        }
    }

    private AnimationInfo ensureAnimationInfo() {
        if (this.mAnimationInfo == null) {
            this.mAnimationInfo = new AnimationInfo();
        }
        return this.mAnimationInfo;
    }

    /* access modifiers changed from: package-private */
    public void setAnimations(int enter, int exit, int popEnter, int popExit) {
        if (this.mAnimationInfo != null || enter != 0 || exit != 0 || popEnter != 0 || popExit != 0) {
            ensureAnimationInfo().mEnterAnim = enter;
            ensureAnimationInfo().mExitAnim = exit;
            ensureAnimationInfo().mPopEnterAnim = popEnter;
            ensureAnimationInfo().mPopExitAnim = popExit;
        }
    }

    /* access modifiers changed from: package-private */
    public int getEnterAnim() {
        if (this.mAnimationInfo == null) {
            return 0;
        }
        return this.mAnimationInfo.mEnterAnim;
    }

    /* access modifiers changed from: package-private */
    public int getExitAnim() {
        if (this.mAnimationInfo == null) {
            return 0;
        }
        return this.mAnimationInfo.mExitAnim;
    }

    /* access modifiers changed from: package-private */
    public int getPopEnterAnim() {
        if (this.mAnimationInfo == null) {
            return 0;
        }
        return this.mAnimationInfo.mPopEnterAnim;
    }

    /* access modifiers changed from: package-private */
    public int getPopExitAnim() {
        if (this.mAnimationInfo == null) {
            return 0;
        }
        return this.mAnimationInfo.mPopExitAnim;
    }

    /* access modifiers changed from: package-private */
    public boolean getPopDirection() {
        if (this.mAnimationInfo == null) {
            return false;
        }
        return this.mAnimationInfo.mIsPop;
    }

    /* access modifiers changed from: package-private */
    public void setPopDirection(boolean isPop) {
        if (this.mAnimationInfo != null) {
            ensureAnimationInfo().mIsPop = isPop;
        }
    }

    /* access modifiers changed from: package-private */
    public int getNextTransition() {
        if (this.mAnimationInfo == null) {
            return 0;
        }
        return this.mAnimationInfo.mNextTransition;
    }

    /* access modifiers changed from: package-private */
    public void setNextTransition(int nextTransition) {
        if (this.mAnimationInfo != null || nextTransition != 0) {
            ensureAnimationInfo();
            this.mAnimationInfo.mNextTransition = nextTransition;
        }
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> getSharedElementSourceNames() {
        if (this.mAnimationInfo == null || this.mAnimationInfo.mSharedElementSourceNames == null) {
            return new ArrayList<>();
        }
        return this.mAnimationInfo.mSharedElementSourceNames;
    }

    /* access modifiers changed from: package-private */
    public ArrayList<String> getSharedElementTargetNames() {
        if (this.mAnimationInfo == null || this.mAnimationInfo.mSharedElementTargetNames == null) {
            return new ArrayList<>();
        }
        return this.mAnimationInfo.mSharedElementTargetNames;
    }

    /* access modifiers changed from: package-private */
    public void setSharedElementNames(ArrayList<String> sharedElementSourceNames, ArrayList<String> sharedElementTargetNames) {
        ensureAnimationInfo();
        this.mAnimationInfo.mSharedElementSourceNames = sharedElementSourceNames;
        this.mAnimationInfo.mSharedElementTargetNames = sharedElementTargetNames;
    }

    /* access modifiers changed from: package-private */
    public SharedElementCallback getEnterTransitionCallback() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.mEnterTransitionCallback;
    }

    /* access modifiers changed from: package-private */
    public SharedElementCallback getExitTransitionCallback() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.mExitTransitionCallback;
    }

    /* access modifiers changed from: package-private */
    public View getAnimatingAway() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.mAnimatingAway;
    }

    /* access modifiers changed from: package-private */
    public void setPostOnViewCreatedAlpha(float alpha) {
        ensureAnimationInfo().mPostOnViewCreatedAlpha = alpha;
    }

    /* access modifiers changed from: package-private */
    public float getPostOnViewCreatedAlpha() {
        if (this.mAnimationInfo == null) {
            return 1.0f;
        }
        return this.mAnimationInfo.mPostOnViewCreatedAlpha;
    }

    /* access modifiers changed from: package-private */
    public void setFocusedView(View view) {
        ensureAnimationInfo().mFocusedView = view;
    }

    /* access modifiers changed from: package-private */
    public View getFocusedView() {
        if (this.mAnimationInfo == null) {
            return null;
        }
        return this.mAnimationInfo.mFocusedView;
    }

    /* access modifiers changed from: package-private */
    public boolean isPostponed() {
        if (this.mAnimationInfo == null) {
            return false;
        }
        return this.mAnimationInfo.mEnterTransitionPostponed;
    }

    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> contract, ActivityResultCallback<O> callback) {
        return prepareCallInternal(contract, new Function<Void, ActivityResultRegistry>() {
            public ActivityResultRegistry apply(Void input) {
                if (Fragment.this.mHost instanceof ActivityResultRegistryOwner) {
                    return ((ActivityResultRegistryOwner) Fragment.this.mHost).getActivityResultRegistry();
                }
                return Fragment.this.requireActivity().getActivityResultRegistry();
            }
        }, callback);
    }

    public final <I, O> ActivityResultLauncher<I> registerForActivityResult(ActivityResultContract<I, O> contract, final ActivityResultRegistry registry, ActivityResultCallback<O> callback) {
        return prepareCallInternal(contract, new Function<Void, ActivityResultRegistry>() {
            public ActivityResultRegistry apply(Void input) {
                return registry;
            }
        }, callback);
    }

    private <I, O> ActivityResultLauncher<I> prepareCallInternal(final ActivityResultContract<I, O> contract, Function<Void, ActivityResultRegistry> registryProvider, ActivityResultCallback<O> callback) {
        if (this.mState <= 1) {
            final AtomicReference<ActivityResultLauncher<I>> ref = new AtomicReference<>();
            final Function<Void, ActivityResultRegistry> function = registryProvider;
            final AtomicReference<ActivityResultLauncher<I>> atomicReference = ref;
            final ActivityResultContract<I, O> activityResultContract = contract;
            final ActivityResultCallback<O> activityResultCallback = callback;
            registerOnPreAttachListener(new OnPreAttachedListener() {
                /* access modifiers changed from: package-private */
                public void onPreAttached() {
                    atomicReference.set(((ActivityResultRegistry) function.apply(null)).register(Fragment.this.generateActivityResultKey(), Fragment.this, activityResultContract, activityResultCallback));
                }
            });
            return new ActivityResultLauncher<I>() {
                public void launch(I input, ActivityOptionsCompat options) {
                    ActivityResultLauncher<I> delegate = (ActivityResultLauncher) ref.get();
                    if (delegate != null) {
                        delegate.launch(input, options);
                        return;
                    }
                    throw new IllegalStateException("Operation cannot be started before fragment is in created state");
                }

                public void unregister() {
                    ActivityResultLauncher<I> delegate = (ActivityResultLauncher) ref.getAndSet((Object) null);
                    if (delegate != null) {
                        delegate.unregister();
                    }
                }

                public ActivityResultContract<I, ?> getContract() {
                    return contract;
                }
            };
        }
        throw new IllegalStateException("Fragment " + this + " is attempting to registerForActivityResult after being created. Fragments must call registerForActivityResult() before they are created (i.e. initialization, onAttach(), or onCreate()).");
    }

    private void registerOnPreAttachListener(OnPreAttachedListener callback) {
        if (this.mState >= 0) {
            callback.onPreAttached();
        } else {
            this.mOnPreAttachedListeners.add(callback);
        }
    }

    /* access modifiers changed from: package-private */
    public String generateActivityResultKey() {
        return "fragment_" + this.mWho + "_rq#" + this.mNextLocalRequestCode.getAndIncrement();
    }

    static class AnimationInfo {
        Boolean mAllowEnterTransitionOverlap;
        Boolean mAllowReturnTransitionOverlap;
        View mAnimatingAway;
        int mEnterAnim;
        Object mEnterTransition = null;
        SharedElementCallback mEnterTransitionCallback = null;
        boolean mEnterTransitionPostponed;
        int mExitAnim;
        Object mExitTransition = null;
        SharedElementCallback mExitTransitionCallback = null;
        View mFocusedView = null;
        boolean mIsPop;
        int mNextTransition;
        int mPopEnterAnim;
        int mPopExitAnim;
        float mPostOnViewCreatedAlpha = 1.0f;
        Object mReenterTransition = Fragment.USE_DEFAULT_TRANSITION;
        Object mReturnTransition = Fragment.USE_DEFAULT_TRANSITION;
        Object mSharedElementEnterTransition = null;
        Object mSharedElementReturnTransition = Fragment.USE_DEFAULT_TRANSITION;
        ArrayList<String> mSharedElementSourceNames;
        ArrayList<String> mSharedElementTargetNames;

        AnimationInfo() {
        }
    }

    static class Api19Impl {
        private Api19Impl() {
        }

        static void cancelPendingInputEvents(View view) {
            view.cancelPendingInputEvents();
        }
    }
}
