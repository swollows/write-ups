package androidx.fragment.app;

import android.app.Activity;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.fragment.R;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.SpecialEffectsController;
import androidx.fragment.app.strictmode.FragmentStrictMode;
import androidx.lifecycle.ViewModelStoreOwner;

class FragmentStateManager {
    static final String ARGUMENTS_KEY = "arguments";
    static final String CHILD_FRAGMENT_MANAGER_KEY = "childFragmentManager";
    static final String FRAGMENT_STATE_KEY = "state";
    static final String REGISTRY_STATE_KEY = "registryState";
    static final String SAVED_INSTANCE_STATE_KEY = "savedInstanceState";
    private static final String TAG = "FragmentManager";
    static final String VIEW_REGISTRY_STATE_KEY = "viewRegistryState";
    static final String VIEW_STATE_KEY = "viewState";
    private final FragmentLifecycleCallbacksDispatcher mDispatcher;
    private final Fragment mFragment;
    private int mFragmentManagerState = -1;
    private final FragmentStore mFragmentStore;
    private boolean mMovingToState = false;

    FragmentStateManager(FragmentLifecycleCallbacksDispatcher dispatcher, FragmentStore fragmentStore, Fragment fragment) {
        this.mDispatcher = dispatcher;
        this.mFragmentStore = fragmentStore;
        this.mFragment = fragment;
    }

    FragmentStateManager(FragmentLifecycleCallbacksDispatcher dispatcher, FragmentStore fragmentStore, ClassLoader classLoader, FragmentFactory fragmentFactory, Bundle state) {
        this.mDispatcher = dispatcher;
        this.mFragmentStore = fragmentStore;
        this.mFragment = ((FragmentState) state.getParcelable(FRAGMENT_STATE_KEY)).instantiate(fragmentFactory, classLoader);
        this.mFragment.mSavedFragmentState = state;
        Bundle arguments = state.getBundle(ARGUMENTS_KEY);
        if (arguments != null) {
            arguments.setClassLoader(classLoader);
        }
        this.mFragment.setArguments(arguments);
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Instantiated fragment " + this.mFragment);
        }
    }

    FragmentStateManager(FragmentLifecycleCallbacksDispatcher dispatcher, FragmentStore fragmentStore, Fragment retainedFragment, Bundle state) {
        this.mDispatcher = dispatcher;
        this.mFragmentStore = fragmentStore;
        this.mFragment = retainedFragment;
        this.mFragment.mSavedViewState = null;
        this.mFragment.mSavedViewRegistryState = null;
        this.mFragment.mBackStackNesting = 0;
        this.mFragment.mInLayout = false;
        this.mFragment.mAdded = false;
        this.mFragment.mTargetWho = this.mFragment.mTarget != null ? this.mFragment.mTarget.mWho : null;
        this.mFragment.mTarget = null;
        this.mFragment.mSavedFragmentState = state;
        this.mFragment.mArguments = state.getBundle(ARGUMENTS_KEY);
    }

    /* access modifiers changed from: package-private */
    public Fragment getFragment() {
        return this.mFragment;
    }

    /* access modifiers changed from: package-private */
    public void setFragmentManagerState(int state) {
        this.mFragmentManagerState = state;
    }

    /* access modifiers changed from: package-private */
    public int computeExpectedState() {
        if (this.mFragment.mFragmentManager == null) {
            return this.mFragment.mState;
        }
        int maxState = this.mFragmentManagerState;
        switch (this.mFragment.mMaxState) {
            case RESUMED:
                break;
            case STARTED:
                maxState = Math.min(maxState, 5);
                break;
            case CREATED:
                maxState = Math.min(maxState, 1);
                break;
            case INITIALIZED:
                maxState = Math.min(maxState, 0);
                break;
            default:
                maxState = Math.min(maxState, -1);
                break;
        }
        if (this.mFragment.mFromLayout) {
            if (this.mFragment.mInLayout) {
                maxState = Math.max(this.mFragmentManagerState, 2);
                if (this.mFragment.mView != null && this.mFragment.mView.getParent() == null) {
                    maxState = Math.min(maxState, 2);
                }
            } else {
                maxState = this.mFragmentManagerState < 4 ? Math.min(maxState, this.mFragment.mState) : Math.min(maxState, 1);
            }
        }
        if (!this.mFragment.mAdded) {
            maxState = Math.min(maxState, 1);
        }
        SpecialEffectsController.Operation.LifecycleImpact awaitingEffect = null;
        if (this.mFragment.mContainer != null) {
            awaitingEffect = SpecialEffectsController.getOrCreateController(this.mFragment.mContainer, this.mFragment.getParentFragmentManager()).getAwaitingCompletionLifecycleImpact(this);
        }
        if (awaitingEffect == SpecialEffectsController.Operation.LifecycleImpact.ADDING) {
            maxState = Math.min(maxState, 6);
        } else if (awaitingEffect == SpecialEffectsController.Operation.LifecycleImpact.REMOVING) {
            maxState = Math.max(maxState, 3);
        } else if (this.mFragment.mRemoving) {
            if (this.mFragment.isInBackStack()) {
                maxState = Math.min(maxState, 1);
            } else {
                maxState = Math.min(maxState, -1);
            }
        }
        if (this.mFragment.mDeferStart && this.mFragment.mState < 5) {
            maxState = Math.min(maxState, 4);
        }
        if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "computeExpectedState() of " + maxState + " for " + this.mFragment);
        }
        return maxState;
    }

    /* JADX INFO: finally extract failed */
    /* access modifiers changed from: package-private */
    public void moveToExpectedState() {
        if (!this.mMovingToState) {
            try {
                this.mMovingToState = true;
                boolean stateWasChanged = false;
                while (true) {
                    int computeExpectedState = computeExpectedState();
                    int newState = computeExpectedState;
                    if (computeExpectedState != this.mFragment.mState) {
                        stateWasChanged = true;
                        if (newState <= this.mFragment.mState) {
                            switch (this.mFragment.mState - 1) {
                                case -1:
                                    detach();
                                    break;
                                case 0:
                                    if (this.mFragment.mBeingSaved && this.mFragmentStore.getSavedState(this.mFragment.mWho) == null) {
                                        this.mFragmentStore.setSavedState(this.mFragment.mWho, saveState());
                                    }
                                    destroy();
                                    break;
                                case 1:
                                    destroyFragmentView();
                                    this.mFragment.mState = 1;
                                    break;
                                case 2:
                                    this.mFragment.mInLayout = false;
                                    this.mFragment.mState = 2;
                                    break;
                                case 3:
                                    if (FragmentManager.isLoggingEnabled(3)) {
                                        Log.d("FragmentManager", "movefrom ACTIVITY_CREATED: " + this.mFragment);
                                    }
                                    if (this.mFragment.mBeingSaved) {
                                        this.mFragmentStore.setSavedState(this.mFragment.mWho, saveState());
                                    } else if (this.mFragment.mView != null && this.mFragment.mSavedViewState == null) {
                                        saveViewState();
                                    }
                                    if (!(this.mFragment.mView == null || this.mFragment.mContainer == null)) {
                                        SpecialEffectsController.getOrCreateController(this.mFragment.mContainer, this.mFragment.getParentFragmentManager()).enqueueRemove(this);
                                    }
                                    this.mFragment.mState = 3;
                                    break;
                                case 4:
                                    stop();
                                    break;
                                case 5:
                                    this.mFragment.mState = 5;
                                    break;
                                case 6:
                                    pause();
                                    break;
                            }
                        } else {
                            switch (this.mFragment.mState + 1) {
                                case 0:
                                    attach();
                                    break;
                                case 1:
                                    create();
                                    break;
                                case 2:
                                    ensureInflatedView();
                                    createView();
                                    break;
                                case 3:
                                    activityCreated();
                                    break;
                                case 4:
                                    if (!(this.mFragment.mView == null || this.mFragment.mContainer == null)) {
                                        SpecialEffectsController.getOrCreateController(this.mFragment.mContainer, this.mFragment.getParentFragmentManager()).enqueueAdd(SpecialEffectsController.Operation.State.from(this.mFragment.mView.getVisibility()), this);
                                    }
                                    this.mFragment.mState = 4;
                                    break;
                                case 5:
                                    start();
                                    break;
                                case 6:
                                    this.mFragment.mState = 6;
                                    break;
                                case 7:
                                    resume();
                                    break;
                            }
                        }
                    } else {
                        if (!stateWasChanged && this.mFragment.mState == -1 && this.mFragment.mRemoving && !this.mFragment.isInBackStack() && !this.mFragment.mBeingSaved) {
                            if (FragmentManager.isLoggingEnabled(3)) {
                                Log.d("FragmentManager", "Cleaning up state of never attached fragment: " + this.mFragment);
                            }
                            this.mFragmentStore.getNonConfig().clearNonConfigState(this.mFragment, true);
                            this.mFragmentStore.makeInactive(this);
                            if (FragmentManager.isLoggingEnabled(3)) {
                                Log.d("FragmentManager", "initState called for fragment: " + this.mFragment);
                            }
                            this.mFragment.initState();
                        }
                        if (this.mFragment.mHiddenChanged) {
                            if (!(this.mFragment.mView == null || this.mFragment.mContainer == null)) {
                                SpecialEffectsController controller = SpecialEffectsController.getOrCreateController(this.mFragment.mContainer, this.mFragment.getParentFragmentManager());
                                if (this.mFragment.mHidden) {
                                    controller.enqueueHide(this);
                                } else {
                                    controller.enqueueShow(this);
                                }
                            }
                            if (this.mFragment.mFragmentManager != null) {
                                this.mFragment.mFragmentManager.invalidateMenuForFragment(this.mFragment);
                            }
                            this.mFragment.mHiddenChanged = false;
                            this.mFragment.onHiddenChanged(this.mFragment.mHidden);
                            this.mFragment.mChildFragmentManager.dispatchOnHiddenChanged();
                        }
                        this.mMovingToState = false;
                        return;
                    }
                }
            } catch (Throwable th) {
                this.mMovingToState = false;
                throw th;
            }
        } else if (FragmentManager.isLoggingEnabled(2)) {
            Log.v("FragmentManager", "Ignoring re-entrant call to moveToExpectedState() for " + getFragment());
        }
    }

    /* access modifiers changed from: package-private */
    public void ensureInflatedView() {
        if (this.mFragment.mFromLayout && this.mFragment.mInLayout && !this.mFragment.mPerformedCreateView) {
            if (FragmentManager.isLoggingEnabled(3)) {
                Log.d("FragmentManager", "moveto CREATE_VIEW: " + this.mFragment);
            }
            Bundle savedInstanceState = null;
            if (this.mFragment.mSavedFragmentState != null) {
                savedInstanceState = this.mFragment.mSavedFragmentState.getBundle(SAVED_INSTANCE_STATE_KEY);
            }
            this.mFragment.performCreateView(this.mFragment.performGetLayoutInflater(savedInstanceState), (ViewGroup) null, savedInstanceState);
            if (this.mFragment.mView != null) {
                this.mFragment.mView.setSaveFromParentEnabled(false);
                this.mFragment.mView.setTag(R.id.fragment_container_view_tag, this.mFragment);
                if (this.mFragment.mHidden) {
                    this.mFragment.mView.setVisibility(8);
                }
                this.mFragment.performViewCreated();
                this.mDispatcher.dispatchOnFragmentViewCreated(this.mFragment, this.mFragment.mView, savedInstanceState, false);
                this.mFragment.mState = 2;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void restoreState(ClassLoader classLoader) {
        if (this.mFragment.mSavedFragmentState != null) {
            this.mFragment.mSavedFragmentState.setClassLoader(classLoader);
            if (this.mFragment.mSavedFragmentState.getBundle(SAVED_INSTANCE_STATE_KEY) == null) {
                this.mFragment.mSavedFragmentState.putBundle(SAVED_INSTANCE_STATE_KEY, new Bundle());
            }
            this.mFragment.mSavedViewState = this.mFragment.mSavedFragmentState.getSparseParcelableArray(VIEW_STATE_KEY);
            this.mFragment.mSavedViewRegistryState = this.mFragment.mSavedFragmentState.getBundle(VIEW_REGISTRY_STATE_KEY);
            FragmentState fs = (FragmentState) this.mFragment.mSavedFragmentState.getParcelable(FRAGMENT_STATE_KEY);
            if (fs != null) {
                this.mFragment.mTargetWho = fs.mTargetWho;
                this.mFragment.mTargetRequestCode = fs.mTargetRequestCode;
                if (this.mFragment.mSavedUserVisibleHint != null) {
                    this.mFragment.mUserVisibleHint = this.mFragment.mSavedUserVisibleHint.booleanValue();
                    this.mFragment.mSavedUserVisibleHint = null;
                } else {
                    this.mFragment.mUserVisibleHint = fs.mUserVisibleHint;
                }
            }
            if (!this.mFragment.mUserVisibleHint) {
                this.mFragment.mDeferStart = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void attach() {
        FragmentStateManager targetFragmentStateManager;
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "moveto ATTACHED: " + this.mFragment);
        }
        if (this.mFragment.mTarget != null) {
            targetFragmentStateManager = this.mFragmentStore.getFragmentStateManager(this.mFragment.mTarget.mWho);
            if (targetFragmentStateManager != null) {
                this.mFragment.mTargetWho = this.mFragment.mTarget.mWho;
                this.mFragment.mTarget = null;
            } else {
                throw new IllegalStateException("Fragment " + this.mFragment + " declared target fragment " + this.mFragment.mTarget + " that does not belong to this FragmentManager!");
            }
        } else if (this.mFragment.mTargetWho != null) {
            targetFragmentStateManager = this.mFragmentStore.getFragmentStateManager(this.mFragment.mTargetWho);
            if (targetFragmentStateManager == null) {
                throw new IllegalStateException("Fragment " + this.mFragment + " declared target fragment " + this.mFragment.mTargetWho + " that does not belong to this FragmentManager!");
            }
        } else {
            targetFragmentStateManager = null;
        }
        if (targetFragmentStateManager != null) {
            targetFragmentStateManager.moveToExpectedState();
        }
        this.mFragment.mHost = this.mFragment.mFragmentManager.getHost();
        this.mFragment.mParentFragment = this.mFragment.mFragmentManager.getParent();
        this.mDispatcher.dispatchOnFragmentPreAttached(this.mFragment, false);
        this.mFragment.performAttach();
        this.mDispatcher.dispatchOnFragmentAttached(this.mFragment, false);
    }

    /* access modifiers changed from: package-private */
    public void create() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "moveto CREATED: " + this.mFragment);
        }
        Bundle savedInstanceState = null;
        if (this.mFragment.mSavedFragmentState != null) {
            savedInstanceState = this.mFragment.mSavedFragmentState.getBundle(SAVED_INSTANCE_STATE_KEY);
        }
        if (!this.mFragment.mIsCreated) {
            this.mDispatcher.dispatchOnFragmentPreCreated(this.mFragment, savedInstanceState, false);
            this.mFragment.performCreate(savedInstanceState);
            this.mDispatcher.dispatchOnFragmentCreated(this.mFragment, savedInstanceState, false);
            return;
        }
        this.mFragment.mState = 1;
        this.mFragment.restoreChildFragmentState();
    }

    /* JADX WARNING: type inference failed for: r6v4, types: [android.view.View] */
    /* access modifiers changed from: package-private */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void createView() {
        /*
            r10 = this;
            androidx.fragment.app.Fragment r0 = r10.mFragment
            boolean r0 = r0.mFromLayout
            if (r0 == 0) goto L_0x0007
            return
        L_0x0007:
            r0 = 3
            boolean r1 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            java.lang.String r2 = "FragmentManager"
            if (r1 == 0) goto L_0x0028
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r3 = "moveto CREATE_VIEW: "
            java.lang.StringBuilder r1 = r1.append(r3)
            androidx.fragment.app.Fragment r3 = r10.mFragment
            java.lang.StringBuilder r1 = r1.append(r3)
            java.lang.String r1 = r1.toString()
            android.util.Log.d(r2, r1)
        L_0x0028:
            r1 = 0
            androidx.fragment.app.Fragment r3 = r10.mFragment
            android.os.Bundle r3 = r3.mSavedFragmentState
            if (r3 == 0) goto L_0x003a
            androidx.fragment.app.Fragment r3 = r10.mFragment
            android.os.Bundle r3 = r3.mSavedFragmentState
            java.lang.String r4 = "savedInstanceState"
            android.os.Bundle r1 = r3.getBundle(r4)
        L_0x003a:
            androidx.fragment.app.Fragment r3 = r10.mFragment
            android.view.LayoutInflater r3 = r3.performGetLayoutInflater(r1)
            r4 = 0
            androidx.fragment.app.Fragment r5 = r10.mFragment
            android.view.ViewGroup r5 = r5.mContainer
            if (r5 == 0) goto L_0x004d
            androidx.fragment.app.Fragment r5 = r10.mFragment
            android.view.ViewGroup r4 = r5.mContainer
            goto L_0x00ec
        L_0x004d:
            androidx.fragment.app.Fragment r5 = r10.mFragment
            int r5 = r5.mContainerId
            if (r5 == 0) goto L_0x00ec
            androidx.fragment.app.Fragment r5 = r10.mFragment
            int r5 = r5.mContainerId
            r6 = -1
            if (r5 == r6) goto L_0x00cb
            androidx.fragment.app.Fragment r5 = r10.mFragment
            androidx.fragment.app.FragmentManager r5 = r5.mFragmentManager
            androidx.fragment.app.FragmentContainer r5 = r5.getContainer()
            androidx.fragment.app.Fragment r6 = r10.mFragment
            int r6 = r6.mContainerId
            android.view.View r6 = r5.onFindViewById(r6)
            r4 = r6
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r4 != 0) goto L_0x00c1
            androidx.fragment.app.Fragment r6 = r10.mFragment
            boolean r6 = r6.mRestored
            if (r6 == 0) goto L_0x0076
            goto L_0x00ec
        L_0x0076:
            androidx.fragment.app.Fragment r0 = r10.mFragment     // Catch:{ NotFoundException -> 0x0085 }
            android.content.res.Resources r0 = r0.getResources()     // Catch:{ NotFoundException -> 0x0085 }
            androidx.fragment.app.Fragment r2 = r10.mFragment     // Catch:{ NotFoundException -> 0x0085 }
            int r2 = r2.mContainerId     // Catch:{ NotFoundException -> 0x0085 }
            java.lang.String r0 = r0.getResourceName(r2)     // Catch:{ NotFoundException -> 0x0085 }
            goto L_0x008a
        L_0x0085:
            r0 = move-exception
            java.lang.String r2 = "unknown"
            r0 = r2
        L_0x008a:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r7 = "No view found for id 0x"
            java.lang.StringBuilder r6 = r6.append(r7)
            androidx.fragment.app.Fragment r7 = r10.mFragment
            int r7 = r7.mContainerId
            java.lang.String r7 = java.lang.Integer.toHexString(r7)
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r7 = " ("
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.StringBuilder r6 = r6.append(r0)
            java.lang.String r7 = ") for fragment "
            java.lang.StringBuilder r6 = r6.append(r7)
            androidx.fragment.app.Fragment r7 = r10.mFragment
            java.lang.StringBuilder r6 = r6.append(r7)
            java.lang.String r6 = r6.toString()
            r2.<init>(r6)
            throw r2
        L_0x00c1:
            boolean r6 = r4 instanceof androidx.fragment.app.FragmentContainerView
            if (r6 != 0) goto L_0x00ec
            androidx.fragment.app.Fragment r6 = r10.mFragment
            androidx.fragment.app.strictmode.FragmentStrictMode.onWrongFragmentContainer(r6, r4)
            goto L_0x00ec
        L_0x00cb:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r5 = "Cannot create fragment "
            java.lang.StringBuilder r2 = r2.append(r5)
            androidx.fragment.app.Fragment r5 = r10.mFragment
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r5 = " for a container view with no id"
            java.lang.StringBuilder r2 = r2.append(r5)
            java.lang.String r2 = r2.toString()
            r0.<init>(r2)
            throw r0
        L_0x00ec:
            androidx.fragment.app.Fragment r5 = r10.mFragment
            r5.mContainer = r4
            androidx.fragment.app.Fragment r5 = r10.mFragment
            r5.performCreateView(r3, r4, r1)
            androidx.fragment.app.Fragment r5 = r10.mFragment
            android.view.View r5 = r5.mView
            r6 = 2
            if (r5 == 0) goto L_0x01cb
            boolean r0 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r0)
            if (r0 == 0) goto L_0x011a
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r5 = "moveto VIEW_CREATED: "
            java.lang.StringBuilder r0 = r0.append(r5)
            androidx.fragment.app.Fragment r5 = r10.mFragment
            java.lang.StringBuilder r0 = r0.append(r5)
            java.lang.String r0 = r0.toString()
            android.util.Log.d(r2, r0)
        L_0x011a:
            androidx.fragment.app.Fragment r0 = r10.mFragment
            android.view.View r0 = r0.mView
            r5 = 0
            r0.setSaveFromParentEnabled(r5)
            androidx.fragment.app.Fragment r0 = r10.mFragment
            android.view.View r0 = r0.mView
            int r7 = androidx.fragment.R.id.fragment_container_view_tag
            androidx.fragment.app.Fragment r8 = r10.mFragment
            r0.setTag(r7, r8)
            if (r4 == 0) goto L_0x0132
            r10.addViewToContainer()
        L_0x0132:
            androidx.fragment.app.Fragment r0 = r10.mFragment
            boolean r0 = r0.mHidden
            if (r0 == 0) goto L_0x0141
            androidx.fragment.app.Fragment r0 = r10.mFragment
            android.view.View r0 = r0.mView
            r7 = 8
            r0.setVisibility(r7)
        L_0x0141:
            androidx.fragment.app.Fragment r0 = r10.mFragment
            android.view.View r0 = r0.mView
            boolean r0 = androidx.core.view.ViewCompat.isAttachedToWindow(r0)
            if (r0 == 0) goto L_0x0153
            androidx.fragment.app.Fragment r0 = r10.mFragment
            android.view.View r0 = r0.mView
            androidx.core.view.ViewCompat.requestApplyInsets(r0)
            goto L_0x015f
        L_0x0153:
            androidx.fragment.app.Fragment r0 = r10.mFragment
            android.view.View r0 = r0.mView
            androidx.fragment.app.FragmentStateManager$1 r7 = new androidx.fragment.app.FragmentStateManager$1
            r7.<init>(r0)
            r0.addOnAttachStateChangeListener(r7)
        L_0x015f:
            androidx.fragment.app.Fragment r0 = r10.mFragment
            r0.performViewCreated()
            androidx.fragment.app.FragmentLifecycleCallbacksDispatcher r0 = r10.mDispatcher
            androidx.fragment.app.Fragment r7 = r10.mFragment
            androidx.fragment.app.Fragment r8 = r10.mFragment
            android.view.View r8 = r8.mView
            r0.dispatchOnFragmentViewCreated(r7, r8, r1, r5)
            androidx.fragment.app.Fragment r0 = r10.mFragment
            android.view.View r0 = r0.mView
            int r0 = r0.getVisibility()
            androidx.fragment.app.Fragment r5 = r10.mFragment
            android.view.View r5 = r5.mView
            float r5 = r5.getAlpha()
            androidx.fragment.app.Fragment r7 = r10.mFragment
            r7.setPostOnViewCreatedAlpha(r5)
            androidx.fragment.app.Fragment r7 = r10.mFragment
            android.view.ViewGroup r7 = r7.mContainer
            if (r7 == 0) goto L_0x01cb
            if (r0 != 0) goto L_0x01cb
            androidx.fragment.app.Fragment r7 = r10.mFragment
            android.view.View r7 = r7.mView
            android.view.View r7 = r7.findFocus()
            if (r7 == 0) goto L_0x01c3
            androidx.fragment.app.Fragment r8 = r10.mFragment
            r8.setFocusedView(r7)
            boolean r8 = androidx.fragment.app.FragmentManager.isLoggingEnabled(r6)
            if (r8 == 0) goto L_0x01c3
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "requestFocus: Saved focused view "
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.StringBuilder r8 = r8.append(r7)
            java.lang.String r9 = " for Fragment "
            java.lang.StringBuilder r8 = r8.append(r9)
            androidx.fragment.app.Fragment r9 = r10.mFragment
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            android.util.Log.v(r2, r8)
        L_0x01c3:
            androidx.fragment.app.Fragment r2 = r10.mFragment
            android.view.View r2 = r2.mView
            r8 = 0
            r2.setAlpha(r8)
        L_0x01cb:
            androidx.fragment.app.Fragment r0 = r10.mFragment
            r0.mState = r6
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.fragment.app.FragmentStateManager.createView():void");
    }

    /* access modifiers changed from: package-private */
    public void activityCreated() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "moveto ACTIVITY_CREATED: " + this.mFragment);
        }
        Bundle savedInstanceState = null;
        if (this.mFragment.mSavedFragmentState != null) {
            savedInstanceState = this.mFragment.mSavedFragmentState.getBundle(SAVED_INSTANCE_STATE_KEY);
        }
        this.mFragment.performActivityCreated(savedInstanceState);
        this.mDispatcher.dispatchOnFragmentActivityCreated(this.mFragment, savedInstanceState, false);
    }

    /* access modifiers changed from: package-private */
    public void start() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "moveto STARTED: " + this.mFragment);
        }
        this.mFragment.performStart();
        this.mDispatcher.dispatchOnFragmentStarted(this.mFragment, false);
    }

    /* access modifiers changed from: package-private */
    public void resume() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "moveto RESUMED: " + this.mFragment);
        }
        View focusedView = this.mFragment.getFocusedView();
        if (focusedView != null && isFragmentViewChild(focusedView)) {
            boolean success = focusedView.requestFocus();
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "requestFocus: Restoring focused view " + focusedView + " " + (success ? "succeeded" : "failed") + " on Fragment " + this.mFragment + " resulting in focused view " + this.mFragment.mView.findFocus());
            }
        }
        this.mFragment.setFocusedView((View) null);
        this.mFragment.performResume();
        this.mDispatcher.dispatchOnFragmentResumed(this.mFragment, false);
        this.mFragmentStore.setSavedState(this.mFragment.mWho, (Bundle) null);
        this.mFragment.mSavedFragmentState = null;
        this.mFragment.mSavedViewState = null;
        this.mFragment.mSavedViewRegistryState = null;
    }

    private boolean isFragmentViewChild(View view) {
        if (view == this.mFragment.mView) {
            return true;
        }
        for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
            if (parent == this.mFragment.mView) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void pause() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "movefrom RESUMED: " + this.mFragment);
        }
        this.mFragment.performPause();
        this.mDispatcher.dispatchOnFragmentPaused(this.mFragment, false);
    }

    /* access modifiers changed from: package-private */
    public void stop() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "movefrom STARTED: " + this.mFragment);
        }
        this.mFragment.performStop();
        this.mDispatcher.dispatchOnFragmentStopped(this.mFragment, false);
    }

    /* access modifiers changed from: package-private */
    public Bundle saveState() {
        Bundle stateBundle = new Bundle();
        if (this.mFragment.mState == -1 && this.mFragment.mSavedFragmentState != null) {
            stateBundle.putAll(this.mFragment.mSavedFragmentState);
        }
        stateBundle.putParcelable(FRAGMENT_STATE_KEY, new FragmentState(this.mFragment));
        if (this.mFragment.mState > -1) {
            Bundle savedInstanceState = new Bundle();
            this.mFragment.performSaveInstanceState(savedInstanceState);
            if (!savedInstanceState.isEmpty()) {
                stateBundle.putBundle(SAVED_INSTANCE_STATE_KEY, savedInstanceState);
            }
            this.mDispatcher.dispatchOnFragmentSaveInstanceState(this.mFragment, savedInstanceState, false);
            Bundle savedStateRegistryState = new Bundle();
            this.mFragment.mSavedStateRegistryController.performSave(savedStateRegistryState);
            if (!savedStateRegistryState.isEmpty()) {
                stateBundle.putBundle(REGISTRY_STATE_KEY, savedStateRegistryState);
            }
            Bundle childFragmentManagerState = this.mFragment.mChildFragmentManager.m144lambda$attachController$4$androidxfragmentappFragmentManager();
            if (!childFragmentManagerState.isEmpty()) {
                stateBundle.putBundle(CHILD_FRAGMENT_MANAGER_KEY, childFragmentManagerState);
            }
            if (this.mFragment.mView != null) {
                saveViewState();
            }
            if (this.mFragment.mSavedViewState != null) {
                stateBundle.putSparseParcelableArray(VIEW_STATE_KEY, this.mFragment.mSavedViewState);
            }
            if (this.mFragment.mSavedViewRegistryState != null) {
                stateBundle.putBundle(VIEW_REGISTRY_STATE_KEY, this.mFragment.mSavedViewRegistryState);
            }
        }
        if (this.mFragment.mArguments != null) {
            stateBundle.putBundle(ARGUMENTS_KEY, this.mFragment.mArguments);
        }
        return stateBundle;
    }

    /* access modifiers changed from: package-private */
    public Fragment.SavedState saveInstanceState() {
        if (this.mFragment.mState > -1) {
            return new Fragment.SavedState(saveState());
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public void saveViewState() {
        if (this.mFragment.mView != null) {
            if (FragmentManager.isLoggingEnabled(2)) {
                Log.v("FragmentManager", "Saving view state for fragment " + this.mFragment + " with view " + this.mFragment.mView);
            }
            SparseArray<Parcelable> mStateArray = new SparseArray<>();
            this.mFragment.mView.saveHierarchyState(mStateArray);
            if (mStateArray.size() > 0) {
                this.mFragment.mSavedViewState = mStateArray;
            }
            Bundle outBundle = new Bundle();
            this.mFragment.mViewLifecycleOwner.performSave(outBundle);
            if (!outBundle.isEmpty()) {
                this.mFragment.mSavedViewRegistryState = outBundle;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void destroyFragmentView() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "movefrom CREATE_VIEW: " + this.mFragment);
        }
        if (!(this.mFragment.mContainer == null || this.mFragment.mView == null)) {
            this.mFragment.mContainer.removeView(this.mFragment.mView);
        }
        this.mFragment.performDestroyView();
        this.mDispatcher.dispatchOnFragmentViewDestroyed(this.mFragment, false);
        this.mFragment.mContainer = null;
        this.mFragment.mView = null;
        this.mFragment.mViewLifecycleOwner = null;
        this.mFragment.mViewLifecycleOwnerLiveData.setValue(null);
        this.mFragment.mInLayout = false;
    }

    /* access modifiers changed from: package-private */
    public void destroy() {
        Fragment target;
        boolean shouldClear;
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "movefrom CREATED: " + this.mFragment);
        }
        boolean beingRemoved = this.mFragment.mRemoving && !this.mFragment.isInBackStack();
        if (beingRemoved && !this.mFragment.mBeingSaved) {
            this.mFragmentStore.setSavedState(this.mFragment.mWho, (Bundle) null);
        }
        if (beingRemoved || this.mFragmentStore.getNonConfig().shouldDestroy(this.mFragment)) {
            FragmentHostCallback<?> host = this.mFragment.mHost;
            if (host instanceof ViewModelStoreOwner) {
                shouldClear = this.mFragmentStore.getNonConfig().isCleared();
            } else if (host.getContext() instanceof Activity) {
                shouldClear = true ^ ((Activity) host.getContext()).isChangingConfigurations();
            } else {
                shouldClear = true;
            }
            if ((beingRemoved && !this.mFragment.mBeingSaved) || shouldClear) {
                this.mFragmentStore.getNonConfig().clearNonConfigState(this.mFragment, false);
            }
            this.mFragment.performDestroy();
            this.mDispatcher.dispatchOnFragmentDestroyed(this.mFragment, false);
            for (FragmentStateManager fragmentStateManager : this.mFragmentStore.getActiveFragmentStateManagers()) {
                if (fragmentStateManager != null) {
                    Fragment fragment = fragmentStateManager.getFragment();
                    if (this.mFragment.mWho.equals(fragment.mTargetWho)) {
                        fragment.mTarget = this.mFragment;
                        fragment.mTargetWho = null;
                    }
                }
            }
            if (this.mFragment.mTargetWho != null) {
                this.mFragment.mTarget = this.mFragmentStore.findActiveFragment(this.mFragment.mTargetWho);
            }
            this.mFragmentStore.makeInactive(this);
            return;
        }
        if (!(this.mFragment.mTargetWho == null || (target = this.mFragmentStore.findActiveFragment(this.mFragment.mTargetWho)) == null || !target.mRetainInstance)) {
            this.mFragment.mTarget = target;
        }
        this.mFragment.mState = 0;
    }

    /* access modifiers changed from: package-private */
    public void detach() {
        if (FragmentManager.isLoggingEnabled(3)) {
            Log.d("FragmentManager", "movefrom ATTACHED: " + this.mFragment);
        }
        this.mFragment.performDetach();
        boolean beingRemoved = false;
        this.mDispatcher.dispatchOnFragmentDetached(this.mFragment, false);
        this.mFragment.mState = -1;
        this.mFragment.mHost = null;
        this.mFragment.mParentFragment = null;
        this.mFragment.mFragmentManager = null;
        if (this.mFragment.mRemoving && !this.mFragment.isInBackStack()) {
            beingRemoved = true;
        }
        if (beingRemoved || this.mFragmentStore.getNonConfig().shouldDestroy(this.mFragment)) {
            if (FragmentManager.isLoggingEnabled(3)) {
                Log.d("FragmentManager", "initState called for fragment: " + this.mFragment);
            }
            this.mFragment.initState();
        }
    }

    /* access modifiers changed from: package-private */
    public void addViewToContainer() {
        Fragment expectedParent = FragmentManager.findViewFragment(this.mFragment.mContainer);
        Fragment actualParent = this.mFragment.getParentFragment();
        if (expectedParent != null && !expectedParent.equals(actualParent)) {
            FragmentStrictMode.onWrongNestedHierarchy(this.mFragment, expectedParent, this.mFragment.mContainerId);
        }
        this.mFragment.mContainer.addView(this.mFragment.mView, this.mFragmentStore.findFragmentIndexInContainer(this.mFragment));
    }
}
