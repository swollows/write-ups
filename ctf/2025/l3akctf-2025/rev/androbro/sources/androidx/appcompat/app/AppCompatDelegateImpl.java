package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.PowerManager;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.Log;
import android.util.TypedValue;
import android.view.ActionMode;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.KeyboardShortcutGroup;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.Window;
import android.view.WindowManager;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.R;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.view.StandaloneActionMode;
import androidx.appcompat.view.SupportActionModeWrapper;
import androidx.appcompat.view.SupportMenuInflater;
import androidx.appcompat.view.WindowCallbackWrapper;
import androidx.appcompat.view.menu.ListMenuPresenter;
import androidx.appcompat.view.menu.MenuBuilder;
import androidx.appcompat.view.menu.MenuPresenter;
import androidx.appcompat.view.menu.MenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.TintTypedArray;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.appcompat.widget.ViewStubCompat;
import androidx.collection.SimpleArrayMap;
import androidx.core.app.ActivityCompat;
import androidx.core.app.NavUtils;
import androidx.core.content.ContextCompat;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.os.LocaleListCompat;
import androidx.core.view.KeyEventDispatcher;
import androidx.core.view.LayoutInflaterCompat;
import androidx.core.view.PointerIconCompat;
import androidx.core.view.ViewCompat;
import androidx.core.view.ViewPropertyAnimatorCompat;
import androidx.core.view.ViewPropertyAnimatorListener;
import androidx.core.view.ViewPropertyAnimatorListenerAdapter;
import androidx.core.widget.PopupWindowCompat;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.material.internal.ViewUtils;
import java.lang.Thread;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import kotlin.time.DurationKt;
import org.xmlpull.v1.XmlPullParser;

class AppCompatDelegateImpl extends AppCompatDelegate implements MenuBuilder.Callback, LayoutInflater.Factory2 {
    static final String EXCEPTION_HANDLER_MESSAGE_SUFFIX = ". If the resource you are trying to use is a vector resource, you may be referencing it in an unsupported way. See AppCompatDelegate.setCompatVectorFromResourcesEnabled() for more info.";
    private static final boolean IS_PRE_LOLLIPOP = false;
    private static final boolean sCanReturnDifferentContext = (!"robolectric".equals(Build.FINGERPRINT));
    private static boolean sInstalledExceptionHandler = true;
    private static final SimpleArrayMap<String, Integer> sLocalNightModes = new SimpleArrayMap<>();
    private static final int[] sWindowBackgroundStyleable = {16842836};
    ActionBar mActionBar;
    private ActionMenuPresenterCallback mActionMenuPresenterCallback;
    ActionMode mActionMode;
    PopupWindow mActionModePopup;
    ActionBarContextView mActionModeView;
    private int mActivityHandlesConfigFlags;
    private boolean mActivityHandlesConfigFlagsChecked;
    final AppCompatCallback mAppCompatCallback;
    private AppCompatViewInflater mAppCompatViewInflater;
    private AppCompatWindowCallback mAppCompatWindowCallback;
    private AutoNightModeManager mAutoBatteryNightModeManager;
    private AutoNightModeManager mAutoTimeNightModeManager;
    private OnBackInvokedCallback mBackCallback;
    private boolean mBaseContextAttached;
    private boolean mClosingActionMenu;
    final Context mContext;
    private boolean mCreated;
    private DecorContentParent mDecorContentParent;
    boolean mDestroyed;
    private OnBackInvokedDispatcher mDispatcher;
    private Configuration mEffectiveConfiguration;
    private boolean mEnableDefaultActionBarUp;
    ViewPropertyAnimatorCompat mFadeAnim;
    private boolean mFeatureIndeterminateProgress;
    private boolean mFeatureProgress;
    private boolean mHandleNativeActionModes;
    boolean mHasActionBar;
    final Object mHost;
    int mInvalidatePanelMenuFeatures;
    boolean mInvalidatePanelMenuPosted;
    private final Runnable mInvalidatePanelMenuRunnable;
    boolean mIsFloating;
    private LayoutIncludeDetector mLayoutIncludeDetector;
    private int mLocalNightMode;
    private boolean mLongPressBackDown;
    MenuInflater mMenuInflater;
    boolean mOverlayActionBar;
    boolean mOverlayActionMode;
    private PanelMenuPresenterCallback mPanelMenuPresenterCallback;
    private PanelFeatureState[] mPanels;
    private PanelFeatureState mPreparedPanel;
    Runnable mShowActionModePopup;
    private View mStatusGuard;
    ViewGroup mSubDecor;
    private boolean mSubDecorInstalled;
    private Rect mTempRect1;
    private Rect mTempRect2;
    private int mThemeResId;
    private CharSequence mTitle;
    private TextView mTitleView;
    Window mWindow;
    boolean mWindowNoTitle;

    interface ActionBarMenuCallback {
        View onCreatePanelView(int i);

        boolean onPreparePanel(int i);
    }

    static {
        if (IS_PRE_LOLLIPOP && !sInstalledExceptionHandler) {
            final Thread.UncaughtExceptionHandler defHandler = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
                public void uncaughtException(Thread thread, Throwable throwable) {
                    if (shouldWrapException(throwable)) {
                        Throwable wrapped = new Resources.NotFoundException(throwable.getMessage() + AppCompatDelegateImpl.EXCEPTION_HANDLER_MESSAGE_SUFFIX);
                        wrapped.initCause(throwable.getCause());
                        wrapped.setStackTrace(throwable.getStackTrace());
                        defHandler.uncaughtException(thread, wrapped);
                        return;
                    }
                    defHandler.uncaughtException(thread, throwable);
                }

                private boolean shouldWrapException(Throwable throwable) {
                    String message;
                    if (!(throwable instanceof Resources.NotFoundException) || (message = throwable.getMessage()) == null) {
                        return false;
                    }
                    if (message.contains("drawable") || message.contains("Drawable")) {
                        return true;
                    }
                    return false;
                }
            });
        }
    }

    AppCompatDelegateImpl(Activity activity, AppCompatCallback callback) {
        this(activity, (Window) null, callback, activity);
    }

    AppCompatDelegateImpl(Dialog dialog, AppCompatCallback callback) {
        this(dialog.getContext(), dialog.getWindow(), callback, dialog);
    }

    AppCompatDelegateImpl(Context context, Window window, AppCompatCallback callback) {
        this(context, window, callback, context);
    }

    AppCompatDelegateImpl(Context context, Activity activity, AppCompatCallback callback) {
        this(context, (Window) null, callback, activity);
    }

    private AppCompatDelegateImpl(Context context, Window window, AppCompatCallback callback, Object host) {
        Integer value;
        AppCompatActivity activity;
        this.mFadeAnim = null;
        this.mHandleNativeActionModes = true;
        this.mLocalNightMode = -100;
        this.mInvalidatePanelMenuRunnable = new Runnable() {
            public void run() {
                if ((AppCompatDelegateImpl.this.mInvalidatePanelMenuFeatures & 1) != 0) {
                    AppCompatDelegateImpl.this.doInvalidatePanelMenu(0);
                }
                if ((AppCompatDelegateImpl.this.mInvalidatePanelMenuFeatures & 4096) != 0) {
                    AppCompatDelegateImpl.this.doInvalidatePanelMenu(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR);
                }
                AppCompatDelegateImpl.this.mInvalidatePanelMenuPosted = false;
                AppCompatDelegateImpl.this.mInvalidatePanelMenuFeatures = 0;
            }
        };
        this.mContext = context;
        this.mAppCompatCallback = callback;
        this.mHost = host;
        if (this.mLocalNightMode == -100 && (this.mHost instanceof Dialog) && (activity = tryUnwrapContext()) != null) {
            this.mLocalNightMode = activity.getDelegate().getLocalNightMode();
        }
        if (this.mLocalNightMode == -100 && (value = sLocalNightModes.get(this.mHost.getClass().getName())) != null) {
            this.mLocalNightMode = value.intValue();
            sLocalNightModes.remove(this.mHost.getClass().getName());
        }
        if (window != null) {
            attachToWindow(window);
        }
        AppCompatDrawableManager.preload();
    }

    public void setOnBackInvokedDispatcher(OnBackInvokedDispatcher dispatcher) {
        super.setOnBackInvokedDispatcher(dispatcher);
        if (!(this.mDispatcher == null || this.mBackCallback == null)) {
            Api33Impl.unregisterOnBackInvokedCallback(this.mDispatcher, this.mBackCallback);
            this.mBackCallback = null;
        }
        if (dispatcher != null || !(this.mHost instanceof Activity) || ((Activity) this.mHost).getWindow() == null) {
            this.mDispatcher = dispatcher;
        } else {
            this.mDispatcher = Api33Impl.getOnBackInvokedDispatcher((Activity) this.mHost);
        }
        updateBackInvokedCallbackState();
    }

    /* access modifiers changed from: package-private */
    public void updateBackInvokedCallbackState() {
        if (Build.VERSION.SDK_INT >= 33) {
            boolean shouldRegister = shouldRegisterBackInvokedCallback();
            if (shouldRegister && this.mBackCallback == null) {
                this.mBackCallback = Api33Impl.registerOnBackPressedCallback(this.mDispatcher, this);
            } else if (!shouldRegister && this.mBackCallback != null) {
                Api33Impl.unregisterOnBackInvokedCallback(this.mDispatcher, this.mBackCallback);
                this.mBackCallback = null;
            }
        }
    }

    public Context attachBaseContext2(Context baseContext) {
        Configuration configOverlay;
        boolean needsThemeRebase = true;
        this.mBaseContextAttached = true;
        int modeToApply = mapNightMode(baseContext, calculateNightMode());
        if (isAutoStorageOptedIn(baseContext)) {
            syncRequestedAndStoredLocales(baseContext);
        }
        LocaleListCompat localesToApply = calculateApplicationLocales(baseContext);
        if (baseContext instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) baseContext).applyOverrideConfiguration(createOverrideAppConfiguration(baseContext, modeToApply, localesToApply, (Configuration) null, false));
                return baseContext;
            } catch (IllegalStateException e) {
            }
        }
        if (baseContext instanceof androidx.appcompat.view.ContextThemeWrapper) {
            try {
                ((androidx.appcompat.view.ContextThemeWrapper) baseContext).applyOverrideConfiguration(createOverrideAppConfiguration(baseContext, modeToApply, localesToApply, (Configuration) null, false));
                return baseContext;
            } catch (IllegalStateException e2) {
            }
        }
        if (!sCanReturnDifferentContext) {
            return super.attachBaseContext2(baseContext);
        }
        Configuration overrideConfig = new Configuration();
        overrideConfig.uiMode = -1;
        overrideConfig.fontScale = 0.0f;
        Configuration referenceConfig = baseContext.createConfigurationContext(overrideConfig).getResources().getConfiguration();
        Configuration baseConfig = baseContext.getResources().getConfiguration();
        referenceConfig.uiMode = baseConfig.uiMode;
        if (!referenceConfig.equals(baseConfig)) {
            configOverlay = generateConfigDelta(referenceConfig, baseConfig);
        } else {
            configOverlay = null;
        }
        Configuration config = createOverrideAppConfiguration(baseContext, modeToApply, localesToApply, configOverlay, true);
        androidx.appcompat.view.ContextThemeWrapper wrappedContext = new androidx.appcompat.view.ContextThemeWrapper(baseContext, R.style.Theme_AppCompat_Empty);
        wrappedContext.applyOverrideConfiguration(config);
        try {
            if (baseContext.getTheme() == null) {
                needsThemeRebase = false;
            }
        } catch (NullPointerException e3) {
            needsThemeRebase = false;
        }
        if (needsThemeRebase) {
            ResourcesCompat.ThemeCompat.rebase(wrappedContext.getTheme());
        }
        return super.attachBaseContext2(wrappedContext);
    }

    public void onCreate(Bundle savedInstanceState) {
        this.mBaseContextAttached = true;
        applyApplicationSpecificConfig(false);
        ensureWindow();
        if (this.mHost instanceof Activity) {
            String parentActivityName = null;
            try {
                parentActivityName = NavUtils.getParentActivityName((Activity) this.mHost);
            } catch (IllegalArgumentException e) {
            }
            if (parentActivityName != null) {
                ActionBar ab = peekSupportActionBar();
                if (ab == null) {
                    this.mEnableDefaultActionBarUp = true;
                } else {
                    ab.setDefaultDisplayHomeAsUpEnabled(true);
                }
            }
            addActiveDelegate(this);
        }
        this.mEffectiveConfiguration = new Configuration(this.mContext.getResources().getConfiguration());
        this.mCreated = true;
    }

    public void onPostCreate(Bundle savedInstanceState) {
        ensureSubDecor();
    }

    public ActionBar getSupportActionBar() {
        initWindowDecorActionBar();
        return this.mActionBar;
    }

    /* access modifiers changed from: package-private */
    public final ActionBar peekSupportActionBar() {
        return this.mActionBar;
    }

    /* access modifiers changed from: package-private */
    public final Window.Callback getWindowCallback() {
        return this.mWindow.getCallback();
    }

    private void initWindowDecorActionBar() {
        ensureSubDecor();
        if (this.mHasActionBar && this.mActionBar == null) {
            if (this.mHost instanceof Activity) {
                this.mActionBar = new WindowDecorActionBar((Activity) this.mHost, this.mOverlayActionBar);
            } else if (this.mHost instanceof Dialog) {
                this.mActionBar = new WindowDecorActionBar((Dialog) this.mHost);
            }
            if (this.mActionBar != null) {
                this.mActionBar.setDefaultDisplayHomeAsUpEnabled(this.mEnableDefaultActionBarUp);
            }
        }
    }

    public void setSupportActionBar(Toolbar toolbar) {
        if (this.mHost instanceof Activity) {
            ActionBar ab = getSupportActionBar();
            if (!(ab instanceof WindowDecorActionBar)) {
                this.mMenuInflater = null;
                if (ab != null) {
                    ab.onDestroy();
                }
                this.mActionBar = null;
                if (toolbar != null) {
                    ToolbarActionBar tbab = new ToolbarActionBar(toolbar, getTitle(), this.mAppCompatWindowCallback);
                    this.mActionBar = tbab;
                    this.mAppCompatWindowCallback.setActionBarCallback(tbab.mMenuCallback);
                    toolbar.setBackInvokedCallbackEnabled(true);
                } else {
                    this.mAppCompatWindowCallback.setActionBarCallback((ActionBarMenuCallback) null);
                }
                invalidateOptionsMenu();
                return;
            }
            throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
        }
    }

    /* access modifiers changed from: package-private */
    public final Context getActionBarThemedContext() {
        Context context = null;
        ActionBar ab = getSupportActionBar();
        if (ab != null) {
            context = ab.getThemedContext();
        }
        if (context == null) {
            return this.mContext;
        }
        return context;
    }

    public MenuInflater getMenuInflater() {
        if (this.mMenuInflater == null) {
            initWindowDecorActionBar();
            this.mMenuInflater = new SupportMenuInflater(this.mActionBar != null ? this.mActionBar.getThemedContext() : this.mContext);
        }
        return this.mMenuInflater;
    }

    public <T extends View> T findViewById(int id) {
        ensureSubDecor();
        return this.mWindow.findViewById(id);
    }

    public void onConfigurationChanged(Configuration newConfig) {
        ActionBar ab;
        if (this.mHasActionBar && this.mSubDecorInstalled && (ab = getSupportActionBar()) != null) {
            ab.onConfigurationChanged(newConfig);
        }
        AppCompatDrawableManager.get().onConfigurationChanged(this.mContext);
        this.mEffectiveConfiguration = new Configuration(this.mContext.getResources().getConfiguration());
        applyApplicationSpecificConfig(false, false);
    }

    public void onStart() {
        applyApplicationSpecificConfig(true, false);
    }

    public void onStop() {
        ActionBar ab = getSupportActionBar();
        if (ab != null) {
            ab.setShowHideAnimationEnabled(false);
        }
    }

    public void onPostResume() {
        ActionBar ab = getSupportActionBar();
        if (ab != null) {
            ab.setShowHideAnimationEnabled(true);
        }
    }

    public void setContentView(View v) {
        ensureSubDecor();
        ViewGroup contentParent = (ViewGroup) this.mSubDecor.findViewById(16908290);
        contentParent.removeAllViews();
        contentParent.addView(v);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }

    public void setContentView(int resId) {
        ensureSubDecor();
        ViewGroup contentParent = (ViewGroup) this.mSubDecor.findViewById(16908290);
        contentParent.removeAllViews();
        LayoutInflater.from(this.mContext).inflate(resId, contentParent);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }

    public void setContentView(View v, ViewGroup.LayoutParams lp) {
        ensureSubDecor();
        ViewGroup contentParent = (ViewGroup) this.mSubDecor.findViewById(16908290);
        contentParent.removeAllViews();
        contentParent.addView(v, lp);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }

    public void addContentView(View v, ViewGroup.LayoutParams lp) {
        ensureSubDecor();
        ((ViewGroup) this.mSubDecor.findViewById(16908290)).addView(v, lp);
        this.mAppCompatWindowCallback.bypassOnContentChanged(this.mWindow.getCallback());
    }

    public void onSaveInstanceState(Bundle outState) {
    }

    public void onDestroy() {
        if (this.mHost instanceof Activity) {
            removeActivityDelegate(this);
        }
        if (this.mInvalidatePanelMenuPosted) {
            this.mWindow.getDecorView().removeCallbacks(this.mInvalidatePanelMenuRunnable);
        }
        this.mDestroyed = true;
        if (this.mLocalNightMode == -100 || !(this.mHost instanceof Activity) || !((Activity) this.mHost).isChangingConfigurations()) {
            sLocalNightModes.remove(this.mHost.getClass().getName());
        } else {
            sLocalNightModes.put(this.mHost.getClass().getName(), Integer.valueOf(this.mLocalNightMode));
        }
        if (this.mActionBar != null) {
            this.mActionBar.onDestroy();
        }
        cleanupAutoManagers();
    }

    private void cleanupAutoManagers() {
        if (this.mAutoTimeNightModeManager != null) {
            this.mAutoTimeNightModeManager.cleanup();
        }
        if (this.mAutoBatteryNightModeManager != null) {
            this.mAutoBatteryNightModeManager.cleanup();
        }
    }

    public void setTheme(int themeResId) {
        this.mThemeResId = themeResId;
    }

    private void ensureWindow() {
        if (this.mWindow == null && (this.mHost instanceof Activity)) {
            attachToWindow(((Activity) this.mHost).getWindow());
        }
        if (this.mWindow == null) {
            throw new IllegalStateException("We have not been given a Window");
        }
    }

    private void attachToWindow(Window window) {
        if (this.mWindow == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof AppCompatWindowCallback)) {
                this.mAppCompatWindowCallback = new AppCompatWindowCallback(callback);
                window.setCallback(this.mAppCompatWindowCallback);
                TintTypedArray a = TintTypedArray.obtainStyledAttributes(this.mContext, (AttributeSet) null, sWindowBackgroundStyleable);
                Drawable winBg = a.getDrawableIfKnown(0);
                if (winBg != null) {
                    window.setBackgroundDrawable(winBg);
                }
                a.recycle();
                this.mWindow = window;
                if (Build.VERSION.SDK_INT >= 33 && this.mDispatcher == null) {
                    setOnBackInvokedDispatcher((OnBackInvokedDispatcher) null);
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    private void ensureSubDecor() {
        if (!this.mSubDecorInstalled) {
            this.mSubDecor = createSubDecor();
            CharSequence title = getTitle();
            if (!TextUtils.isEmpty(title)) {
                if (this.mDecorContentParent != null) {
                    this.mDecorContentParent.setWindowTitle(title);
                } else if (peekSupportActionBar() != null) {
                    peekSupportActionBar().setWindowTitle(title);
                } else if (this.mTitleView != null) {
                    this.mTitleView.setText(title);
                }
            }
            applyFixedSizeWindow();
            onSubDecorInstalled(this.mSubDecor);
            this.mSubDecorInstalled = true;
            PanelFeatureState st = getPanelState(0, false);
            if (this.mDestroyed) {
                return;
            }
            if (st == null || st.menu == null) {
                invalidatePanelMenu(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR);
            }
        }
    }

    /* JADX WARNING: type inference failed for: r3v24, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r3v26, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r8v5, types: [android.view.View] */
    /* JADX WARNING: type inference failed for: r3v32, types: [android.view.View] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private android.view.ViewGroup createSubDecor() {
        /*
            r10 = this;
            android.content.Context r0 = r10.mContext
            int[] r1 = androidx.appcompat.R.styleable.AppCompatTheme
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            int r1 = androidx.appcompat.R.styleable.AppCompatTheme_windowActionBar
            boolean r1 = r0.hasValue(r1)
            if (r1 == 0) goto L_0x01a2
            int r1 = androidx.appcompat.R.styleable.AppCompatTheme_windowNoTitle
            r2 = 0
            boolean r1 = r0.getBoolean(r1, r2)
            r3 = 1
            if (r1 == 0) goto L_0x001e
            r10.requestWindowFeature(r3)
            goto L_0x002b
        L_0x001e:
            int r1 = androidx.appcompat.R.styleable.AppCompatTheme_windowActionBar
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 == 0) goto L_0x002b
            r1 = 108(0x6c, float:1.51E-43)
            r10.requestWindowFeature(r1)
        L_0x002b:
            int r1 = androidx.appcompat.R.styleable.AppCompatTheme_windowActionBarOverlay
            boolean r1 = r0.getBoolean(r1, r2)
            r4 = 109(0x6d, float:1.53E-43)
            if (r1 == 0) goto L_0x0038
            r10.requestWindowFeature(r4)
        L_0x0038:
            int r1 = androidx.appcompat.R.styleable.AppCompatTheme_windowActionModeOverlay
            boolean r1 = r0.getBoolean(r1, r2)
            if (r1 == 0) goto L_0x0045
            r1 = 10
            r10.requestWindowFeature(r1)
        L_0x0045:
            int r1 = androidx.appcompat.R.styleable.AppCompatTheme_android_windowIsFloating
            boolean r1 = r0.getBoolean(r1, r2)
            r10.mIsFloating = r1
            r0.recycle()
            r10.ensureWindow()
            android.view.Window r1 = r10.mWindow
            r1.getDecorView()
            android.content.Context r1 = r10.mContext
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            r5 = 0
            boolean r6 = r10.mWindowNoTitle
            r7 = 0
            if (r6 != 0) goto L_0x00d9
            boolean r6 = r10.mIsFloating
            if (r6 == 0) goto L_0x0077
            int r3 = androidx.appcompat.R.layout.abc_dialog_title_material
            android.view.View r3 = r1.inflate(r3, r7)
            r5 = r3
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            r10.mOverlayActionBar = r2
            r10.mHasActionBar = r2
            goto L_0x00f0
        L_0x0077:
            boolean r6 = r10.mHasActionBar
            if (r6 == 0) goto L_0x00f0
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.Context r8 = r10.mContext
            android.content.res.Resources$Theme r8 = r8.getTheme()
            int r9 = androidx.appcompat.R.attr.actionBarTheme
            r8.resolveAttribute(r9, r6, r3)
            int r3 = r6.resourceId
            if (r3 == 0) goto L_0x0099
            androidx.appcompat.view.ContextThemeWrapper r3 = new androidx.appcompat.view.ContextThemeWrapper
            android.content.Context r8 = r10.mContext
            int r9 = r6.resourceId
            r3.<init>((android.content.Context) r8, (int) r9)
            goto L_0x009b
        L_0x0099:
            android.content.Context r3 = r10.mContext
        L_0x009b:
            android.view.LayoutInflater r8 = android.view.LayoutInflater.from(r3)
            int r9 = androidx.appcompat.R.layout.abc_screen_toolbar
            android.view.View r8 = r8.inflate(r9, r7)
            r5 = r8
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            int r8 = androidx.appcompat.R.id.decor_content_parent
            android.view.View r8 = r5.findViewById(r8)
            androidx.appcompat.widget.DecorContentParent r8 = (androidx.appcompat.widget.DecorContentParent) r8
            r10.mDecorContentParent = r8
            androidx.appcompat.widget.DecorContentParent r8 = r10.mDecorContentParent
            android.view.Window$Callback r9 = r10.getWindowCallback()
            r8.setWindowCallback(r9)
            boolean r8 = r10.mOverlayActionBar
            if (r8 == 0) goto L_0x00c4
            androidx.appcompat.widget.DecorContentParent r8 = r10.mDecorContentParent
            r8.initFeature(r4)
        L_0x00c4:
            boolean r4 = r10.mFeatureProgress
            if (r4 == 0) goto L_0x00ce
            androidx.appcompat.widget.DecorContentParent r4 = r10.mDecorContentParent
            r8 = 2
            r4.initFeature(r8)
        L_0x00ce:
            boolean r4 = r10.mFeatureIndeterminateProgress
            if (r4 == 0) goto L_0x00d8
            androidx.appcompat.widget.DecorContentParent r4 = r10.mDecorContentParent
            r8 = 5
            r4.initFeature(r8)
        L_0x00d8:
            goto L_0x00f0
        L_0x00d9:
            boolean r3 = r10.mOverlayActionMode
            if (r3 == 0) goto L_0x00e7
            int r3 = androidx.appcompat.R.layout.abc_screen_simple_overlay_action_mode
            android.view.View r3 = r1.inflate(r3, r7)
            r5 = r3
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
            goto L_0x00f0
        L_0x00e7:
            int r3 = androidx.appcompat.R.layout.abc_screen_simple
            android.view.View r3 = r1.inflate(r3, r7)
            r5 = r3
            android.view.ViewGroup r5 = (android.view.ViewGroup) r5
        L_0x00f0:
            if (r5 == 0) goto L_0x0151
            androidx.appcompat.app.AppCompatDelegateImpl$3 r3 = new androidx.appcompat.app.AppCompatDelegateImpl$3
            r3.<init>()
            androidx.core.view.ViewCompat.setOnApplyWindowInsetsListener(r5, r3)
            androidx.appcompat.widget.DecorContentParent r3 = r10.mDecorContentParent
            if (r3 != 0) goto L_0x0109
            int r3 = androidx.appcompat.R.id.title
            android.view.View r3 = r5.findViewById(r3)
            android.widget.TextView r3 = (android.widget.TextView) r3
            r10.mTitleView = r3
        L_0x0109:
            androidx.appcompat.widget.ViewUtils.makeOptionalFitsSystemWindows(r5)
            int r3 = androidx.appcompat.R.id.action_bar_activity_content
            android.view.View r3 = r5.findViewById(r3)
            androidx.appcompat.widget.ContentFrameLayout r3 = (androidx.appcompat.widget.ContentFrameLayout) r3
            android.view.Window r4 = r10.mWindow
            r6 = 16908290(0x1020002, float:2.3877235E-38)
            android.view.View r4 = r4.findViewById(r6)
            android.view.ViewGroup r4 = (android.view.ViewGroup) r4
            if (r4 == 0) goto L_0x0143
        L_0x0121:
            int r8 = r4.getChildCount()
            if (r8 <= 0) goto L_0x0132
            android.view.View r8 = r4.getChildAt(r2)
            r4.removeViewAt(r2)
            r3.addView(r8)
            goto L_0x0121
        L_0x0132:
            r2 = -1
            r4.setId(r2)
            r3.setId(r6)
            boolean r2 = r4 instanceof android.widget.FrameLayout
            if (r2 == 0) goto L_0x0143
            r2 = r4
            android.widget.FrameLayout r2 = (android.widget.FrameLayout) r2
            r2.setForeground(r7)
        L_0x0143:
            android.view.Window r2 = r10.mWindow
            r2.setContentView(r5)
            androidx.appcompat.app.AppCompatDelegateImpl$5 r2 = new androidx.appcompat.app.AppCompatDelegateImpl$5
            r2.<init>()
            r3.setAttachListener(r2)
            return r5
        L_0x0151:
            java.lang.IllegalArgumentException r2 = new java.lang.IllegalArgumentException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "AppCompat does not support the current theme features: { windowActionBar: "
            java.lang.StringBuilder r3 = r3.append(r4)
            boolean r4 = r10.mHasActionBar
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ", windowActionBarOverlay: "
            java.lang.StringBuilder r3 = r3.append(r4)
            boolean r4 = r10.mOverlayActionBar
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ", android:windowIsFloating: "
            java.lang.StringBuilder r3 = r3.append(r4)
            boolean r4 = r10.mIsFloating
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ", windowActionModeOverlay: "
            java.lang.StringBuilder r3 = r3.append(r4)
            boolean r4 = r10.mOverlayActionMode
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = ", windowNoTitle: "
            java.lang.StringBuilder r3 = r3.append(r4)
            boolean r4 = r10.mWindowNoTitle
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r4 = " }"
            java.lang.StringBuilder r3 = r3.append(r4)
            java.lang.String r3 = r3.toString()
            r2.<init>(r3)
            throw r2
        L_0x01a2:
            r0.recycle()
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "You need to use a Theme.AppCompat theme (or descendant) with this activity."
            r1.<init>(r2)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.createSubDecor():android.view.ViewGroup");
    }

    /* access modifiers changed from: package-private */
    public void onSubDecorInstalled(ViewGroup subDecor) {
    }

    private void applyFixedSizeWindow() {
        ContentFrameLayout cfl = (ContentFrameLayout) this.mSubDecor.findViewById(16908290);
        View windowDecor = this.mWindow.getDecorView();
        cfl.setDecorPadding(windowDecor.getPaddingLeft(), windowDecor.getPaddingTop(), windowDecor.getPaddingRight(), windowDecor.getPaddingBottom());
        TypedArray a = this.mContext.obtainStyledAttributes(R.styleable.AppCompatTheme);
        a.getValue(R.styleable.AppCompatTheme_windowMinWidthMajor, cfl.getMinWidthMajor());
        a.getValue(R.styleable.AppCompatTheme_windowMinWidthMinor, cfl.getMinWidthMinor());
        if (a.hasValue(R.styleable.AppCompatTheme_windowFixedWidthMajor)) {
            a.getValue(R.styleable.AppCompatTheme_windowFixedWidthMajor, cfl.getFixedWidthMajor());
        }
        if (a.hasValue(R.styleable.AppCompatTheme_windowFixedWidthMinor)) {
            a.getValue(R.styleable.AppCompatTheme_windowFixedWidthMinor, cfl.getFixedWidthMinor());
        }
        if (a.hasValue(R.styleable.AppCompatTheme_windowFixedHeightMajor)) {
            a.getValue(R.styleable.AppCompatTheme_windowFixedHeightMajor, cfl.getFixedHeightMajor());
        }
        if (a.hasValue(R.styleable.AppCompatTheme_windowFixedHeightMinor)) {
            a.getValue(R.styleable.AppCompatTheme_windowFixedHeightMinor, cfl.getFixedHeightMinor());
        }
        a.recycle();
        cfl.requestLayout();
    }

    public boolean requestWindowFeature(int featureId) {
        int featureId2 = sanitizeWindowFeatureId(featureId);
        if (this.mWindowNoTitle && featureId2 == 108) {
            return false;
        }
        if (this.mHasActionBar && featureId2 == 1) {
            this.mHasActionBar = false;
        }
        switch (featureId2) {
            case 1:
                throwFeatureRequestIfSubDecorInstalled();
                this.mWindowNoTitle = true;
                return true;
            case 2:
                throwFeatureRequestIfSubDecorInstalled();
                this.mFeatureProgress = true;
                return true;
            case 5:
                throwFeatureRequestIfSubDecorInstalled();
                this.mFeatureIndeterminateProgress = true;
                return true;
            case 10:
                throwFeatureRequestIfSubDecorInstalled();
                this.mOverlayActionMode = true;
                return true;
            case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR:
                throwFeatureRequestIfSubDecorInstalled();
                this.mHasActionBar = true;
                return true;
            case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY:
                throwFeatureRequestIfSubDecorInstalled();
                this.mOverlayActionBar = true;
                return true;
            default:
                return this.mWindow.requestFeature(featureId2);
        }
    }

    public boolean hasWindowFeature(int featureId) {
        boolean result = false;
        switch (sanitizeWindowFeatureId(featureId)) {
            case 1:
                result = this.mWindowNoTitle;
                break;
            case 2:
                result = this.mFeatureProgress;
                break;
            case 5:
                result = this.mFeatureIndeterminateProgress;
                break;
            case 10:
                result = this.mOverlayActionMode;
                break;
            case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR:
                result = this.mHasActionBar;
                break;
            case AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY:
                result = this.mOverlayActionBar;
                break;
        }
        return result || this.mWindow.hasFeature(featureId);
    }

    public final void setTitle(CharSequence title) {
        this.mTitle = title;
        if (this.mDecorContentParent != null) {
            this.mDecorContentParent.setWindowTitle(title);
        } else if (peekSupportActionBar() != null) {
            peekSupportActionBar().setWindowTitle(title);
        } else if (this.mTitleView != null) {
            this.mTitleView.setText(title);
        }
    }

    /* access modifiers changed from: package-private */
    public final CharSequence getTitle() {
        if (this.mHost instanceof Activity) {
            return ((Activity) this.mHost).getTitle();
        }
        return this.mTitle;
    }

    /* access modifiers changed from: package-private */
    public void onPanelClosed(int featureId) {
        if (featureId == 108) {
            ActionBar ab = getSupportActionBar();
            if (ab != null) {
                ab.dispatchMenuVisibilityChanged(false);
            }
        } else if (featureId == 0) {
            PanelFeatureState st = getPanelState(featureId, true);
            if (st.isOpen) {
                closePanel(st, false);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void onMenuOpened(int featureId) {
        ActionBar ab;
        if (featureId == 108 && (ab = getSupportActionBar()) != null) {
            ab.dispatchMenuVisibilityChanged(true);
        }
    }

    public boolean onMenuItemSelected(MenuBuilder menu, MenuItem item) {
        PanelFeatureState panel;
        Window.Callback cb = getWindowCallback();
        if (cb == null || this.mDestroyed || (panel = findMenuPanel(menu.getRootMenu())) == null) {
            return false;
        }
        return cb.onMenuItemSelected(panel.featureId, item);
    }

    public void onMenuModeChange(MenuBuilder menu) {
        reopenMenu(true);
    }

    public ActionMode startSupportActionMode(ActionMode.Callback callback) {
        if (callback != null) {
            if (this.mActionMode != null) {
                this.mActionMode.finish();
            }
            ActionMode.Callback wrappedCallback = new ActionModeCallbackWrapperV9(callback);
            ActionBar ab = getSupportActionBar();
            if (ab != null) {
                this.mActionMode = ab.startActionMode(wrappedCallback);
                if (!(this.mActionMode == null || this.mAppCompatCallback == null)) {
                    this.mAppCompatCallback.onSupportActionModeStarted(this.mActionMode);
                }
            }
            if (this.mActionMode == null) {
                this.mActionMode = startSupportActionModeFromWindow(wrappedCallback);
            }
            updateBackInvokedCallbackState();
            return this.mActionMode;
        }
        throw new IllegalArgumentException("ActionMode callback can not be null.");
    }

    public void invalidateOptionsMenu() {
        if (peekSupportActionBar() != null && !getSupportActionBar().invalidateOptionsMenu()) {
            invalidatePanelMenu(0);
        }
    }

    /* access modifiers changed from: package-private */
    public ActionMode startSupportActionModeFromWindow(ActionMode.Callback callback) {
        Context actionBarContext;
        endOnGoingFadeAnimation();
        if (this.mActionMode != null) {
            this.mActionMode.finish();
        }
        if (!(callback instanceof ActionModeCallbackWrapperV9)) {
            callback = new ActionModeCallbackWrapperV9(callback);
        }
        ActionMode mode = null;
        if (this.mAppCompatCallback != null && !this.mDestroyed) {
            try {
                mode = this.mAppCompatCallback.onWindowStartingSupportActionMode(callback);
            } catch (AbstractMethodError e) {
            }
        }
        if (mode != null) {
            this.mActionMode = mode;
        } else {
            boolean z = true;
            if (this.mActionModeView == null) {
                if (this.mIsFloating) {
                    TypedValue outValue = new TypedValue();
                    Resources.Theme baseTheme = this.mContext.getTheme();
                    baseTheme.resolveAttribute(R.attr.actionBarTheme, outValue, true);
                    if (outValue.resourceId != 0) {
                        Resources.Theme actionBarTheme = this.mContext.getResources().newTheme();
                        actionBarTheme.setTo(baseTheme);
                        actionBarTheme.applyStyle(outValue.resourceId, true);
                        actionBarContext = new androidx.appcompat.view.ContextThemeWrapper(this.mContext, 0);
                        actionBarContext.getTheme().setTo(actionBarTheme);
                    } else {
                        actionBarContext = this.mContext;
                    }
                    this.mActionModeView = new ActionBarContextView(actionBarContext);
                    this.mActionModePopup = new PopupWindow(actionBarContext, (AttributeSet) null, R.attr.actionModePopupWindowStyle);
                    PopupWindowCompat.setWindowLayoutType(this.mActionModePopup, 2);
                    this.mActionModePopup.setContentView(this.mActionModeView);
                    this.mActionModePopup.setWidth(-1);
                    actionBarContext.getTheme().resolveAttribute(R.attr.actionBarSize, outValue, true);
                    this.mActionModeView.setContentHeight(TypedValue.complexToDimensionPixelSize(outValue.data, actionBarContext.getResources().getDisplayMetrics()));
                    this.mActionModePopup.setHeight(-2);
                    this.mShowActionModePopup = new Runnable() {
                        public void run() {
                            AppCompatDelegateImpl.this.mActionModePopup.showAtLocation(AppCompatDelegateImpl.this.mActionModeView, 55, 0, 0);
                            AppCompatDelegateImpl.this.endOnGoingFadeAnimation();
                            if (AppCompatDelegateImpl.this.shouldAnimateActionModeView()) {
                                AppCompatDelegateImpl.this.mActionModeView.setAlpha(0.0f);
                                AppCompatDelegateImpl.this.mFadeAnim = ViewCompat.animate(AppCompatDelegateImpl.this.mActionModeView).alpha(1.0f);
                                AppCompatDelegateImpl.this.mFadeAnim.setListener(new ViewPropertyAnimatorListenerAdapter() {
                                    public void onAnimationStart(View view) {
                                        AppCompatDelegateImpl.this.mActionModeView.setVisibility(0);
                                    }

                                    public void onAnimationEnd(View view) {
                                        AppCompatDelegateImpl.this.mActionModeView.setAlpha(1.0f);
                                        AppCompatDelegateImpl.this.mFadeAnim.setListener((ViewPropertyAnimatorListener) null);
                                        AppCompatDelegateImpl.this.mFadeAnim = null;
                                    }
                                });
                                return;
                            }
                            AppCompatDelegateImpl.this.mActionModeView.setAlpha(1.0f);
                            AppCompatDelegateImpl.this.mActionModeView.setVisibility(0);
                        }
                    };
                } else {
                    ViewStubCompat stub = (ViewStubCompat) this.mSubDecor.findViewById(R.id.action_mode_bar_stub);
                    if (stub != null) {
                        stub.setLayoutInflater(LayoutInflater.from(getActionBarThemedContext()));
                        this.mActionModeView = (ActionBarContextView) stub.inflate();
                    }
                }
            }
            if (this.mActionModeView != null) {
                endOnGoingFadeAnimation();
                this.mActionModeView.killMode();
                Context context = this.mActionModeView.getContext();
                ActionBarContextView actionBarContextView = this.mActionModeView;
                if (this.mActionModePopup != null) {
                    z = false;
                }
                ActionMode mode2 = new StandaloneActionMode(context, actionBarContextView, callback, z);
                if (callback.onCreateActionMode(mode2, mode2.getMenu())) {
                    mode2.invalidate();
                    this.mActionModeView.initForMode(mode2);
                    this.mActionMode = mode2;
                    if (shouldAnimateActionModeView()) {
                        this.mActionModeView.setAlpha(0.0f);
                        this.mFadeAnim = ViewCompat.animate(this.mActionModeView).alpha(1.0f);
                        this.mFadeAnim.setListener(new ViewPropertyAnimatorListenerAdapter() {
                            public void onAnimationStart(View view) {
                                AppCompatDelegateImpl.this.mActionModeView.setVisibility(0);
                                if (AppCompatDelegateImpl.this.mActionModeView.getParent() instanceof View) {
                                    ViewCompat.requestApplyInsets((View) AppCompatDelegateImpl.this.mActionModeView.getParent());
                                }
                            }

                            public void onAnimationEnd(View view) {
                                AppCompatDelegateImpl.this.mActionModeView.setAlpha(1.0f);
                                AppCompatDelegateImpl.this.mFadeAnim.setListener((ViewPropertyAnimatorListener) null);
                                AppCompatDelegateImpl.this.mFadeAnim = null;
                            }
                        });
                    } else {
                        this.mActionModeView.setAlpha(1.0f);
                        this.mActionModeView.setVisibility(0);
                        if (this.mActionModeView.getParent() instanceof View) {
                            ViewCompat.requestApplyInsets((View) this.mActionModeView.getParent());
                        }
                    }
                    if (this.mActionModePopup != null) {
                        this.mWindow.getDecorView().post(this.mShowActionModePopup);
                    }
                } else {
                    this.mActionMode = null;
                }
            }
        }
        if (!(this.mActionMode == null || this.mAppCompatCallback == null)) {
            this.mAppCompatCallback.onSupportActionModeStarted(this.mActionMode);
        }
        updateBackInvokedCallbackState();
        return this.mActionMode;
    }

    /* access modifiers changed from: package-private */
    public final boolean shouldAnimateActionModeView() {
        return this.mSubDecorInstalled && this.mSubDecor != null && this.mSubDecor.isLaidOut();
    }

    public void setHandleNativeActionModesEnabled(boolean enabled) {
        this.mHandleNativeActionModes = enabled;
    }

    public boolean isHandleNativeActionModesEnabled() {
        return this.mHandleNativeActionModes;
    }

    /* access modifiers changed from: package-private */
    public void endOnGoingFadeAnimation() {
        if (this.mFadeAnim != null) {
            this.mFadeAnim.cancel();
        }
    }

    /* access modifiers changed from: package-private */
    public boolean shouldRegisterBackInvokedCallback() {
        if (this.mDispatcher == null) {
            return false;
        }
        PanelFeatureState st = getPanelState(0, false);
        if ((st == null || !st.isOpen) && this.mActionMode == null) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean onBackPressed() {
        boolean wasLongPressBackDown = this.mLongPressBackDown;
        this.mLongPressBackDown = false;
        PanelFeatureState st = getPanelState(0, false);
        if (st != null && st.isOpen) {
            if (!wasLongPressBackDown) {
                closePanel(st, true);
            }
            return true;
        } else if (this.mActionMode != null) {
            this.mActionMode.finish();
            return true;
        } else {
            ActionBar ab = getSupportActionBar();
            if (ab == null || !ab.collapseActionView()) {
                return false;
            }
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean onKeyShortcut(int keyCode, KeyEvent ev) {
        ActionBar ab = getSupportActionBar();
        if (ab != null && ab.onKeyShortcut(keyCode, ev)) {
            return true;
        }
        if (this.mPreparedPanel == null || !performPanelShortcut(this.mPreparedPanel, ev.getKeyCode(), ev, 1)) {
            if (this.mPreparedPanel == null) {
                PanelFeatureState st = getPanelState(0, true);
                preparePanel(st, ev);
                boolean handled = performPanelShortcut(st, ev.getKeyCode(), ev, 1);
                st.isPrepared = false;
                if (handled) {
                    return true;
                }
            }
            return false;
        }
        if (this.mPreparedPanel != null) {
            this.mPreparedPanel.isHandled = true;
        }
        return true;
    }

    /* access modifiers changed from: package-private */
    public boolean dispatchKeyEvent(KeyEvent event) {
        View root;
        boolean isDown = true;
        if (((this.mHost instanceof KeyEventDispatcher.Component) || (this.mHost instanceof AppCompatDialog)) && (root = this.mWindow.getDecorView()) != null && KeyEventDispatcher.dispatchBeforeHierarchy(root, event)) {
            return true;
        }
        if (event.getKeyCode() == 82 && this.mAppCompatWindowCallback.bypassDispatchKeyEvent(this.mWindow.getCallback(), event)) {
            return true;
        }
        int keyCode = event.getKeyCode();
        if (event.getAction() != 0) {
            isDown = false;
        }
        return isDown ? onKeyDown(keyCode, event) : onKeyUp(keyCode, event);
    }

    /* access modifiers changed from: package-private */
    public boolean onKeyUp(int keyCode, KeyEvent event) {
        switch (keyCode) {
            case 4:
                if (onBackPressed()) {
                    return true;
                }
                break;
            case 82:
                onKeyUpPanel(0, event);
                return true;
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        boolean z = true;
        switch (keyCode) {
            case 4:
                if ((event.getFlags() & 128) == 0) {
                    z = false;
                }
                this.mLongPressBackDown = z;
                break;
            case 82:
                onKeyDownPanel(0, event);
                return true;
        }
        return false;
    }

    public View createView(View parent, String name, Context context, AttributeSet attrs) {
        boolean z = false;
        if (this.mAppCompatViewInflater == null) {
            TypedArray a = this.mContext.obtainStyledAttributes(R.styleable.AppCompatTheme);
            String viewInflaterClassName = a.getString(R.styleable.AppCompatTheme_viewInflaterClass);
            a.recycle();
            if (viewInflaterClassName == null) {
                this.mAppCompatViewInflater = new AppCompatViewInflater();
            } else {
                try {
                    this.mAppCompatViewInflater = (AppCompatViewInflater) this.mContext.getClassLoader().loadClass(viewInflaterClassName).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (Throwable t) {
                    Log.i("AppCompatDelegate", "Failed to instantiate custom view inflater " + viewInflaterClassName + ". Falling back to default.", t);
                    this.mAppCompatViewInflater = new AppCompatViewInflater();
                }
            }
        }
        boolean inheritContext = false;
        if (IS_PRE_LOLLIPOP) {
            if (this.mLayoutIncludeDetector == null) {
                this.mLayoutIncludeDetector = new LayoutIncludeDetector();
            }
            if (this.mLayoutIncludeDetector.detect(attrs)) {
                inheritContext = true;
            } else {
                if (!(attrs instanceof XmlPullParser)) {
                    z = shouldInheritContext((ViewParent) parent);
                } else if (((XmlPullParser) attrs).getDepth() > 1) {
                    z = true;
                }
                inheritContext = z;
            }
        }
        return this.mAppCompatViewInflater.createView(parent, name, context, attrs, inheritContext, IS_PRE_LOLLIPOP, true, VectorEnabledTintResources.shouldBeUsed());
    }

    private boolean shouldInheritContext(ViewParent parent) {
        if (parent == null) {
            return false;
        }
        View windowDecor = this.mWindow.getDecorView();
        while (parent != null) {
            if (parent == windowDecor || !(parent instanceof View) || ((View) parent).isAttachedToWindow()) {
                return false;
            }
            parent = parent.getParent();
        }
        return true;
    }

    public void installViewFactory() {
        LayoutInflater layoutInflater = LayoutInflater.from(this.mContext);
        if (layoutInflater.getFactory() == null) {
            LayoutInflaterCompat.setFactory2(layoutInflater, this);
        } else if (!(layoutInflater.getFactory2() instanceof AppCompatDelegateImpl)) {
            Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
        }
    }

    public final View onCreateView(View parent, String name, Context context, AttributeSet attrs) {
        return createView(parent, name, context, attrs);
    }

    public View onCreateView(String name, Context context, AttributeSet attrs) {
        return onCreateView((View) null, name, context, attrs);
    }

    private AppCompatActivity tryUnwrapContext() {
        for (Context context = this.mContext; context != null; context = ((ContextWrapper) context).getBaseContext()) {
            if (context instanceof AppCompatActivity) {
                return (AppCompatActivity) context;
            }
            if (!(context instanceof ContextWrapper)) {
                return null;
            }
        }
        return null;
    }

    private void openPanel(PanelFeatureState st, KeyEvent event) {
        ViewGroup.LayoutParams lp;
        PanelFeatureState panelFeatureState = st;
        if (!panelFeatureState.isOpen && !this.mDestroyed) {
            if (panelFeatureState.featureId == 0) {
                if ((this.mContext.getResources().getConfiguration().screenLayout & 15) == 4) {
                    return;
                }
            }
            Window.Callback cb = getWindowCallback();
            if (cb == null || cb.onMenuOpened(panelFeatureState.featureId, panelFeatureState.menu)) {
                WindowManager wm = (WindowManager) this.mContext.getSystemService("window");
                if (wm != null && preparePanel(st, event)) {
                    int width = -2;
                    if (panelFeatureState.decorView == null || panelFeatureState.refreshDecorView) {
                        if (panelFeatureState.decorView == null) {
                            if (!initializePanelDecor(st) || panelFeatureState.decorView == null) {
                                return;
                            }
                        } else if (panelFeatureState.refreshDecorView && panelFeatureState.decorView.getChildCount() > 0) {
                            panelFeatureState.decorView.removeAllViews();
                        }
                        if (!initializePanelContent(st) || !st.hasPanelItems()) {
                            panelFeatureState.refreshDecorView = true;
                            return;
                        }
                        ViewGroup.LayoutParams lp2 = panelFeatureState.shownPanelView.getLayoutParams();
                        if (lp2 == null) {
                            lp2 = new ViewGroup.LayoutParams(-2, -2);
                        }
                        panelFeatureState.decorView.setBackgroundResource(panelFeatureState.background);
                        ViewParent shownPanelParent = panelFeatureState.shownPanelView.getParent();
                        if (shownPanelParent instanceof ViewGroup) {
                            ((ViewGroup) shownPanelParent).removeView(panelFeatureState.shownPanelView);
                        }
                        panelFeatureState.decorView.addView(panelFeatureState.shownPanelView, lp2);
                        if (!panelFeatureState.shownPanelView.hasFocus()) {
                            panelFeatureState.shownPanelView.requestFocus();
                        }
                    } else if (!(panelFeatureState.createdPanelView == null || (lp = panelFeatureState.createdPanelView.getLayoutParams()) == null || lp.width != -1)) {
                        width = -1;
                    }
                    panelFeatureState.isHandled = false;
                    WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(width, -2, panelFeatureState.x, panelFeatureState.y, PointerIconCompat.TYPE_HAND, 8519680, -3);
                    layoutParams.gravity = panelFeatureState.gravity;
                    layoutParams.windowAnimations = panelFeatureState.windowAnimations;
                    wm.addView(panelFeatureState.decorView, layoutParams);
                    panelFeatureState.isOpen = true;
                    if (panelFeatureState.featureId == 0) {
                        updateBackInvokedCallbackState();
                        return;
                    }
                    return;
                }
                return;
            }
            closePanel(panelFeatureState, true);
        }
    }

    private boolean initializePanelDecor(PanelFeatureState st) {
        st.setStyle(getActionBarThemedContext());
        st.decorView = new ListMenuDecorView(st.listPresenterContext);
        st.gravity = 81;
        return true;
    }

    private void reopenMenu(boolean toggleMenuMode) {
        if (this.mDecorContentParent == null || !this.mDecorContentParent.canShowOverflowMenu() || (ViewConfiguration.get(this.mContext).hasPermanentMenuKey() && !this.mDecorContentParent.isOverflowMenuShowPending())) {
            PanelFeatureState st = getPanelState(0, true);
            st.refreshDecorView = true;
            closePanel(st, false);
            openPanel(st, (KeyEvent) null);
            return;
        }
        Window.Callback cb = getWindowCallback();
        if (this.mDecorContentParent.isOverflowMenuShowing() && toggleMenuMode) {
            this.mDecorContentParent.hideOverflowMenu();
            if (!this.mDestroyed) {
                cb.onPanelClosed(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, getPanelState(0, true).menu);
            }
        } else if (cb != null && !this.mDestroyed) {
            if (this.mInvalidatePanelMenuPosted && (this.mInvalidatePanelMenuFeatures & 1) != 0) {
                this.mWindow.getDecorView().removeCallbacks(this.mInvalidatePanelMenuRunnable);
                this.mInvalidatePanelMenuRunnable.run();
            }
            PanelFeatureState st2 = getPanelState(0, true);
            if (st2.menu != null && !st2.refreshMenuContent && cb.onPreparePanel(0, st2.createdPanelView, st2.menu)) {
                cb.onMenuOpened(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, st2.menu);
                this.mDecorContentParent.showOverflowMenu();
            }
        }
    }

    private boolean initializePanelMenu(PanelFeatureState st) {
        Context context = this.mContext;
        if ((st.featureId == 0 || st.featureId == 108) && this.mDecorContentParent != null) {
            TypedValue outValue = new TypedValue();
            Resources.Theme baseTheme = context.getTheme();
            baseTheme.resolveAttribute(R.attr.actionBarTheme, outValue, true);
            Resources.Theme widgetTheme = null;
            if (outValue.resourceId != 0) {
                widgetTheme = context.getResources().newTheme();
                widgetTheme.setTo(baseTheme);
                widgetTheme.applyStyle(outValue.resourceId, true);
                widgetTheme.resolveAttribute(R.attr.actionBarWidgetTheme, outValue, true);
            } else {
                baseTheme.resolveAttribute(R.attr.actionBarWidgetTheme, outValue, true);
            }
            if (outValue.resourceId != 0) {
                if (widgetTheme == null) {
                    widgetTheme = context.getResources().newTheme();
                    widgetTheme.setTo(baseTheme);
                }
                widgetTheme.applyStyle(outValue.resourceId, true);
            }
            if (widgetTheme != null) {
                context = new androidx.appcompat.view.ContextThemeWrapper(context, 0);
                context.getTheme().setTo(widgetTheme);
            }
        }
        MenuBuilder menu = new MenuBuilder(context);
        menu.setCallback(this);
        st.setMenu(menu);
        return true;
    }

    private boolean initializePanelContent(PanelFeatureState st) {
        if (st.createdPanelView != null) {
            st.shownPanelView = st.createdPanelView;
            return true;
        } else if (st.menu == null) {
            return false;
        } else {
            if (this.mPanelMenuPresenterCallback == null) {
                this.mPanelMenuPresenterCallback = new PanelMenuPresenterCallback();
            }
            st.shownPanelView = (View) st.getListMenuView(this.mPanelMenuPresenterCallback);
            if (st.shownPanelView != null) {
                return true;
            }
            return false;
        }
    }

    private boolean preparePanel(PanelFeatureState st, KeyEvent event) {
        if (this.mDestroyed) {
            return false;
        }
        if (st.isPrepared) {
            return true;
        }
        if (!(this.mPreparedPanel == null || this.mPreparedPanel == st)) {
            closePanel(this.mPreparedPanel, false);
        }
        Window.Callback cb = getWindowCallback();
        if (cb != null) {
            st.createdPanelView = cb.onCreatePanelView(st.featureId);
        }
        boolean isActionBarMenu = st.featureId == 0 || st.featureId == 108;
        if (isActionBarMenu && this.mDecorContentParent != null) {
            this.mDecorContentParent.setMenuPrepared();
        }
        if (st.createdPanelView == null && (!isActionBarMenu || !(peekSupportActionBar() instanceof ToolbarActionBar))) {
            if (st.menu == null || st.refreshMenuContent) {
                if (st.menu == null && (!initializePanelMenu(st) || st.menu == null)) {
                    return false;
                }
                if (isActionBarMenu && this.mDecorContentParent != null) {
                    if (this.mActionMenuPresenterCallback == null) {
                        this.mActionMenuPresenterCallback = new ActionMenuPresenterCallback();
                    }
                    this.mDecorContentParent.setMenu(st.menu, this.mActionMenuPresenterCallback);
                }
                st.menu.stopDispatchingItemsChanged();
                if (!cb.onCreatePanelMenu(st.featureId, st.menu)) {
                    st.setMenu((MenuBuilder) null);
                    if (isActionBarMenu && this.mDecorContentParent != null) {
                        this.mDecorContentParent.setMenu((Menu) null, this.mActionMenuPresenterCallback);
                    }
                    return false;
                }
                st.refreshMenuContent = false;
            }
            st.menu.stopDispatchingItemsChanged();
            if (st.frozenActionViewState != null) {
                st.menu.restoreActionViewStates(st.frozenActionViewState);
                st.frozenActionViewState = null;
            }
            if (!cb.onPreparePanel(0, st.createdPanelView, st.menu)) {
                if (isActionBarMenu && this.mDecorContentParent != null) {
                    this.mDecorContentParent.setMenu((Menu) null, this.mActionMenuPresenterCallback);
                }
                st.menu.startDispatchingItemsChanged();
                return false;
            }
            st.qwertyMode = KeyCharacterMap.load(event != null ? event.getDeviceId() : -1).getKeyboardType() != 1;
            st.menu.setQwertyMode(st.qwertyMode);
            st.menu.startDispatchingItemsChanged();
        }
        st.isPrepared = true;
        st.isHandled = false;
        this.mPreparedPanel = st;
        return true;
    }

    /* access modifiers changed from: package-private */
    public void checkCloseActionMenu(MenuBuilder menu) {
        if (!this.mClosingActionMenu) {
            this.mClosingActionMenu = true;
            this.mDecorContentParent.dismissPopups();
            Window.Callback cb = getWindowCallback();
            if (cb != null && !this.mDestroyed) {
                cb.onPanelClosed(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, menu);
            }
            this.mClosingActionMenu = false;
        }
    }

    /* access modifiers changed from: package-private */
    public void closePanel(int featureId) {
        closePanel(getPanelState(featureId, true), true);
    }

    /* access modifiers changed from: package-private */
    public void closePanel(PanelFeatureState st, boolean doCallback) {
        if (!doCallback || st.featureId != 0 || this.mDecorContentParent == null || !this.mDecorContentParent.isOverflowMenuShowing()) {
            WindowManager wm = (WindowManager) this.mContext.getSystemService("window");
            if (!(wm == null || !st.isOpen || st.decorView == null)) {
                wm.removeView(st.decorView);
                if (doCallback) {
                    callOnPanelClosed(st.featureId, st, (Menu) null);
                }
            }
            st.isPrepared = false;
            st.isHandled = false;
            st.isOpen = false;
            st.shownPanelView = null;
            st.refreshDecorView = true;
            if (this.mPreparedPanel == st) {
                this.mPreparedPanel = null;
            }
            if (st.featureId == 0) {
                updateBackInvokedCallbackState();
                return;
            }
            return;
        }
        checkCloseActionMenu(st.menu);
    }

    private boolean onKeyDownPanel(int featureId, KeyEvent event) {
        if (event.getRepeatCount() != 0) {
            return false;
        }
        PanelFeatureState st = getPanelState(featureId, true);
        if (!st.isOpen) {
            return preparePanel(st, event);
        }
        return false;
    }

    private boolean onKeyUpPanel(int featureId, KeyEvent event) {
        if (this.mActionMode != null) {
            return false;
        }
        boolean handled = false;
        PanelFeatureState st = getPanelState(featureId, true);
        if (featureId != 0 || this.mDecorContentParent == null || !this.mDecorContentParent.canShowOverflowMenu() || ViewConfiguration.get(this.mContext).hasPermanentMenuKey()) {
            if (st.isOpen || st.isHandled) {
                handled = st.isOpen;
                closePanel(st, true);
            } else if (st.isPrepared) {
                boolean show = true;
                if (st.refreshMenuContent) {
                    st.isPrepared = false;
                    show = preparePanel(st, event);
                }
                if (show) {
                    openPanel(st, event);
                    handled = true;
                }
            }
        } else if (this.mDecorContentParent.isOverflowMenuShowing()) {
            handled = this.mDecorContentParent.hideOverflowMenu();
        } else if (!this.mDestroyed && preparePanel(st, event)) {
            handled = this.mDecorContentParent.showOverflowMenu();
        }
        if (handled) {
            AudioManager audioManager = (AudioManager) this.mContext.getApplicationContext().getSystemService("audio");
            if (audioManager != null) {
                audioManager.playSoundEffect(0);
            } else {
                Log.w("AppCompatDelegate", "Couldn't get audio manager");
            }
        }
        return handled;
    }

    /* access modifiers changed from: package-private */
    public void callOnPanelClosed(int featureId, PanelFeatureState panel, Menu menu) {
        if (menu == null) {
            if (panel == null && featureId >= 0 && featureId < this.mPanels.length) {
                panel = this.mPanels[featureId];
            }
            if (panel != null) {
                menu = panel.menu;
            }
        }
        if ((panel == null || panel.isOpen) && !this.mDestroyed) {
            this.mAppCompatWindowCallback.bypassOnPanelClosed(this.mWindow.getCallback(), featureId, menu);
        }
    }

    /* access modifiers changed from: package-private */
    public PanelFeatureState findMenuPanel(Menu menu) {
        PanelFeatureState[] panels = this.mPanels;
        int N = panels != null ? panels.length : 0;
        for (int i = 0; i < N; i++) {
            PanelFeatureState panel = panels[i];
            if (panel != null && panel.menu == menu) {
                return panel;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    public PanelFeatureState getPanelState(int featureId, boolean required) {
        PanelFeatureState[] panelFeatureStateArr = this.mPanels;
        PanelFeatureState[] ar = panelFeatureStateArr;
        if (panelFeatureStateArr == null || ar.length <= featureId) {
            PanelFeatureState[] nar = new PanelFeatureState[(featureId + 1)];
            if (ar != null) {
                System.arraycopy(ar, 0, nar, 0, ar.length);
            }
            ar = nar;
            this.mPanels = nar;
        }
        PanelFeatureState st = ar[featureId];
        if (st != null) {
            return st;
        }
        PanelFeatureState panelFeatureState = new PanelFeatureState(featureId);
        PanelFeatureState st2 = panelFeatureState;
        ar[featureId] = panelFeatureState;
        return st2;
    }

    private boolean performPanelShortcut(PanelFeatureState st, int keyCode, KeyEvent event, int flags) {
        if (event.isSystem()) {
            return false;
        }
        boolean handled = false;
        if ((st.isPrepared || preparePanel(st, event)) && st.menu != null) {
            handled = st.menu.performShortcut(keyCode, event, flags);
        }
        if (handled && (flags & 1) == 0 && this.mDecorContentParent == null) {
            closePanel(st, true);
        }
        return handled;
    }

    private void invalidatePanelMenu(int featureId) {
        this.mInvalidatePanelMenuFeatures |= 1 << featureId;
        if (!this.mInvalidatePanelMenuPosted) {
            ViewCompat.postOnAnimation(this.mWindow.getDecorView(), this.mInvalidatePanelMenuRunnable);
            this.mInvalidatePanelMenuPosted = true;
        }
    }

    /* access modifiers changed from: package-private */
    public void doInvalidatePanelMenu(int featureId) {
        PanelFeatureState st;
        PanelFeatureState st2 = getPanelState(featureId, true);
        if (st2.menu != null) {
            Bundle savedActionViewStates = new Bundle();
            st2.menu.saveActionViewStates(savedActionViewStates);
            if (savedActionViewStates.size() > 0) {
                st2.frozenActionViewState = savedActionViewStates;
            }
            st2.menu.stopDispatchingItemsChanged();
            st2.menu.clear();
        }
        st2.refreshMenuContent = true;
        st2.refreshDecorView = true;
        if ((featureId == 108 || featureId == 0) && this.mDecorContentParent != null && (st = getPanelState(0, false)) != null) {
            st.isPrepared = false;
            preparePanel(st, (KeyEvent) null);
        }
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0137  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int updateStatusGuard(androidx.core.view.WindowInsetsCompat r18, android.graphics.Rect r19) {
        /*
            r17 = this;
            r0 = r17
            r1 = r19
            r2 = 0
            if (r18 == 0) goto L_0x000c
            int r2 = r18.getSystemWindowInsetTop()
            goto L_0x0010
        L_0x000c:
            if (r1 == 0) goto L_0x0010
            int r2 = r1.top
        L_0x0010:
            r3 = 0
            androidx.appcompat.widget.ActionBarContextView r4 = r0.mActionModeView
            if (r4 == 0) goto L_0x012e
            androidx.appcompat.widget.ActionBarContextView r4 = r0.mActionModeView
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            boolean r4 = r4 instanceof android.view.ViewGroup.MarginLayoutParams
            if (r4 == 0) goto L_0x012a
            androidx.appcompat.widget.ActionBarContextView r4 = r0.mActionModeView
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r4 = (android.view.ViewGroup.MarginLayoutParams) r4
            r7 = 0
            androidx.appcompat.widget.ActionBarContextView r8 = r0.mActionModeView
            boolean r8 = r8.isShown()
            if (r8 == 0) goto L_0x0112
            android.graphics.Rect r8 = r0.mTempRect1
            if (r8 != 0) goto L_0x0042
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r0.mTempRect1 = r8
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>()
            r0.mTempRect2 = r8
        L_0x0042:
            android.graphics.Rect r8 = r0.mTempRect1
            android.graphics.Rect r9 = r0.mTempRect2
            if (r18 != 0) goto L_0x004c
            r8.set(r1)
            goto L_0x0060
        L_0x004c:
            int r10 = r18.getSystemWindowInsetLeft()
            int r11 = r18.getSystemWindowInsetTop()
            int r12 = r18.getSystemWindowInsetRight()
            int r13 = r18.getSystemWindowInsetBottom()
            r8.set(r10, r11, r12, r13)
        L_0x0060:
            android.view.ViewGroup r10 = r0.mSubDecor
            androidx.appcompat.widget.ViewUtils.computeFitSystemWindows(r10, r8, r9)
            int r10 = r8.top
            int r11 = r8.left
            int r12 = r8.right
            android.view.ViewGroup r13 = r0.mSubDecor
            androidx.core.view.WindowInsetsCompat r13 = androidx.core.view.ViewCompat.getRootWindowInsets(r13)
            if (r13 != 0) goto L_0x0075
            r14 = 0
            goto L_0x0079
        L_0x0075:
            int r14 = r13.getSystemWindowInsetLeft()
        L_0x0079:
            if (r13 != 0) goto L_0x007d
            r15 = 0
            goto L_0x0081
        L_0x007d:
            int r15 = r13.getSystemWindowInsetRight()
        L_0x0081:
            int r6 = r4.topMargin
            if (r6 != r10) goto L_0x008d
            int r6 = r4.leftMargin
            if (r6 != r11) goto L_0x008d
            int r6 = r4.rightMargin
            if (r6 == r12) goto L_0x0095
        L_0x008d:
            r6 = 1
            r4.topMargin = r10
            r4.leftMargin = r11
            r4.rightMargin = r12
            r7 = r6
        L_0x0095:
            if (r10 <= 0) goto L_0x00c4
            android.view.View r6 = r0.mStatusGuard
            if (r6 != 0) goto L_0x00c4
            android.view.View r6 = new android.view.View
            android.content.Context r5 = r0.mContext
            r6.<init>(r5)
            r0.mStatusGuard = r6
            android.view.View r5 = r0.mStatusGuard
            r6 = 8
            r5.setVisibility(r6)
            android.widget.FrameLayout$LayoutParams r5 = new android.widget.FrameLayout$LayoutParams
            int r6 = r4.topMargin
            r1 = 51
            r16 = r2
            r2 = -1
            r5.<init>(r2, r6, r1)
            r1 = r5
            r1.leftMargin = r14
            r1.rightMargin = r15
            android.view.ViewGroup r5 = r0.mSubDecor
            android.view.View r6 = r0.mStatusGuard
            r5.addView(r6, r2, r1)
            goto L_0x00ee
        L_0x00c4:
            r16 = r2
            android.view.View r1 = r0.mStatusGuard
            if (r1 == 0) goto L_0x00ee
            android.view.View r1 = r0.mStatusGuard
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            int r2 = r1.height
            int r5 = r4.topMargin
            if (r2 != r5) goto L_0x00e0
            int r2 = r1.leftMargin
            if (r2 != r14) goto L_0x00e0
            int r2 = r1.rightMargin
            if (r2 == r15) goto L_0x00ef
        L_0x00e0:
            int r2 = r4.topMargin
            r1.height = r2
            r1.leftMargin = r14
            r1.rightMargin = r15
            android.view.View r2 = r0.mStatusGuard
            r2.setLayoutParams(r1)
            goto L_0x00ef
        L_0x00ee:
        L_0x00ef:
            android.view.View r1 = r0.mStatusGuard
            if (r1 == 0) goto L_0x00f5
            r1 = 1
            goto L_0x00f6
        L_0x00f5:
            r1 = 0
        L_0x00f6:
            if (r1 == 0) goto L_0x0105
            android.view.View r2 = r0.mStatusGuard
            int r2 = r2.getVisibility()
            if (r2 == 0) goto L_0x0105
            android.view.View r2 = r0.mStatusGuard
            r0.updateStatusGuardColor(r2)
        L_0x0105:
            boolean r2 = r0.mOverlayActionMode
            if (r2 != 0) goto L_0x010d
            if (r1 == 0) goto L_0x010d
            r2 = 0
            goto L_0x010f
        L_0x010d:
            r2 = r16
        L_0x010f:
            r3 = r1
            r1 = 0
            goto L_0x0122
        L_0x0112:
            r16 = r2
            int r1 = r4.topMargin
            if (r1 == 0) goto L_0x011f
            r7 = 1
            r1 = 0
            r4.topMargin = r1
            r2 = r16
            goto L_0x0122
        L_0x011f:
            r1 = 0
            r2 = r16
        L_0x0122:
            if (r7 == 0) goto L_0x0133
            androidx.appcompat.widget.ActionBarContextView r5 = r0.mActionModeView
            r5.setLayoutParams(r4)
            goto L_0x0133
        L_0x012a:
            r16 = r2
            r1 = 0
            goto L_0x0131
        L_0x012e:
            r16 = r2
            r1 = 0
        L_0x0131:
            r2 = r16
        L_0x0133:
            android.view.View r4 = r0.mStatusGuard
            if (r4 == 0) goto L_0x0142
            android.view.View r4 = r0.mStatusGuard
            if (r3 == 0) goto L_0x013d
            r5 = r1
            goto L_0x013f
        L_0x013d:
            r5 = 8
        L_0x013f:
            r4.setVisibility(r5)
        L_0x0142:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegateImpl.updateStatusGuard(androidx.core.view.WindowInsetsCompat, android.graphics.Rect):int");
    }

    private void updateStatusGuardColor(View v) {
        int i;
        if ((ViewCompat.getWindowSystemUiVisibility(v) & 8192) != 0) {
            i = ContextCompat.getColor(this.mContext, R.color.abc_decor_view_status_guard_light);
        } else {
            i = ContextCompat.getColor(this.mContext, R.color.abc_decor_view_status_guard);
        }
        v.setBackgroundColor(i);
    }

    private void throwFeatureRequestIfSubDecorInstalled() {
        if (this.mSubDecorInstalled) {
            throw new AndroidRuntimeException("Window feature must be requested before adding content");
        }
    }

    private int sanitizeWindowFeatureId(int featureId) {
        if (featureId == 8) {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
            return AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR;
        } else if (featureId != 9) {
            return featureId;
        } else {
            Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
            return AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY;
        }
    }

    /* access modifiers changed from: package-private */
    public ViewGroup getSubDecor() {
        return this.mSubDecor;
    }

    /* access modifiers changed from: package-private */
    public void dismissPopups() {
        if (this.mDecorContentParent != null) {
            this.mDecorContentParent.dismissPopups();
        }
        if (this.mActionModePopup != null) {
            this.mWindow.getDecorView().removeCallbacks(this.mShowActionModePopup);
            if (this.mActionModePopup.isShowing()) {
                try {
                    this.mActionModePopup.dismiss();
                } catch (IllegalArgumentException e) {
                }
            }
            this.mActionModePopup = null;
        }
        endOnGoingFadeAnimation();
        PanelFeatureState st = getPanelState(0, false);
        if (st != null && st.menu != null) {
            st.menu.close();
        }
    }

    public Context getContextForDelegate() {
        return this.mContext;
    }

    public boolean applyDayNight() {
        return applyApplicationSpecificConfig(true);
    }

    /* access modifiers changed from: package-private */
    public boolean applyAppLocales() {
        if (isAutoStorageOptedIn(this.mContext) && getRequestedAppLocales() != null && !getRequestedAppLocales().equals(getStoredAppLocales())) {
            asyncExecuteSyncRequestedAndStoredLocales(this.mContext);
        }
        return applyApplicationSpecificConfig(true);
    }

    private boolean applyApplicationSpecificConfig(boolean allowRecreation) {
        return applyApplicationSpecificConfig(allowRecreation, true);
    }

    private boolean applyApplicationSpecificConfig(boolean allowRecreation, boolean isLocalesApplicationRequired) {
        if (this.mDestroyed) {
            return false;
        }
        int nightMode = calculateNightMode();
        int modeToApply = mapNightMode(this.mContext, nightMode);
        LocaleListCompat localesToBeApplied = null;
        if (Build.VERSION.SDK_INT < 33) {
            localesToBeApplied = calculateApplicationLocales(this.mContext);
        }
        if (!isLocalesApplicationRequired && localesToBeApplied != null) {
            localesToBeApplied = getConfigurationLocales(this.mContext.getResources().getConfiguration());
        }
        boolean applied = updateAppConfiguration(modeToApply, localesToBeApplied, allowRecreation);
        if (nightMode == 0) {
            getAutoTimeNightModeManager(this.mContext).setup();
        } else if (this.mAutoTimeNightModeManager != null) {
            this.mAutoTimeNightModeManager.cleanup();
        }
        if (nightMode == 3) {
            getAutoBatteryNightModeManager(this.mContext).setup();
        } else if (this.mAutoBatteryNightModeManager != null) {
            this.mAutoBatteryNightModeManager.cleanup();
        }
        return applied;
    }

    /* access modifiers changed from: package-private */
    public LocaleListCompat calculateApplicationLocales(Context context) {
        LocaleListCompat requestedLocales;
        if (Build.VERSION.SDK_INT >= 33 || (requestedLocales = getRequestedAppLocales()) == null) {
            return null;
        }
        LocaleListCompat systemLocales = getConfigurationLocales(context.getApplicationContext().getResources().getConfiguration());
        LocaleListCompat localesToBeApplied = LocaleOverlayHelper.combineLocalesIfOverlayExists(requestedLocales, systemLocales);
        if (localesToBeApplied.isEmpty()) {
            return systemLocales;
        }
        return localesToBeApplied;
    }

    public void setLocalNightMode(int mode) {
        if (this.mLocalNightMode != mode) {
            this.mLocalNightMode = mode;
            if (this.mBaseContextAttached) {
                applyDayNight();
            }
        }
    }

    public int getLocalNightMode() {
        return this.mLocalNightMode;
    }

    /* access modifiers changed from: package-private */
    public int mapNightMode(Context context, int mode) {
        switch (mode) {
            case AppCompatDelegate.MODE_NIGHT_UNSPECIFIED:
                return -1;
            case -1:
            case 1:
            case 2:
                return mode;
            case 0:
                if (((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                    return -1;
                }
                return getAutoTimeNightModeManager(context).getApplyableNightMode();
            case 3:
                return getAutoBatteryNightModeManager(context).getApplyableNightMode();
            default:
                throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
        }
    }

    private int calculateNightMode() {
        return this.mLocalNightMode != -100 ? this.mLocalNightMode : getDefaultNightMode();
    }

    /* access modifiers changed from: package-private */
    public void setConfigurationLocales(Configuration conf, LocaleListCompat locales) {
        Api24Impl.setLocales(conf, locales);
    }

    /* access modifiers changed from: package-private */
    public LocaleListCompat getConfigurationLocales(Configuration conf) {
        return Api24Impl.getLocales(conf);
    }

    /* access modifiers changed from: package-private */
    public void setDefaultLocalesForLocaleList(LocaleListCompat locales) {
        Api24Impl.setDefaultLocales(locales);
    }

    private Configuration createOverrideAppConfiguration(Context context, int mode, LocaleListCompat locales, Configuration configOverlay, boolean ignoreFollowSystem) {
        int newNightMode;
        switch (mode) {
            case 1:
                newNightMode = 16;
                break;
            case 2:
                newNightMode = 32;
                break;
            default:
                if (!ignoreFollowSystem) {
                    newNightMode = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                    break;
                } else {
                    newNightMode = 0;
                    break;
                }
        }
        Configuration overrideConf = new Configuration();
        overrideConf.fontScale = 0.0f;
        if (configOverlay != null) {
            overrideConf.setTo(configOverlay);
        }
        overrideConf.uiMode = (overrideConf.uiMode & -49) | newNightMode;
        if (locales != null) {
            setConfigurationLocales(overrideConf, locales);
        }
        return overrideConf;
    }

    private boolean updateAppConfiguration(int nightMode, LocaleListCompat locales, boolean allowRecreation) {
        LocaleListCompat newLocales;
        boolean handled = false;
        Configuration overrideConfig = createOverrideAppConfiguration(this.mContext, nightMode, locales, (Configuration) null, false);
        int activityHandlingConfigChange = getActivityHandlesConfigChangesFlags(this.mContext);
        Configuration currentConfiguration = this.mEffectiveConfiguration == null ? this.mContext.getResources().getConfiguration() : this.mEffectiveConfiguration;
        int currentNightMode = currentConfiguration.uiMode & 48;
        int newNightMode = overrideConfig.uiMode & 48;
        LocaleListCompat currentLocales = getConfigurationLocales(currentConfiguration);
        if (locales == null) {
            newLocales = null;
        } else {
            newLocales = getConfigurationLocales(overrideConfig);
        }
        int configChanges = 0;
        if (currentNightMode != newNightMode) {
            configChanges = 0 | 512;
        }
        if (newLocales != null && !currentLocales.equals(newLocales)) {
            configChanges = configChanges | 4 | 8192;
        }
        if (((~activityHandlingConfigChange) & configChanges) != 0 && allowRecreation && this.mBaseContextAttached && ((sCanReturnDifferentContext || this.mCreated) && (this.mHost instanceof Activity) && !((Activity) this.mHost).isChild())) {
            if (Build.VERSION.SDK_INT >= 31 && (configChanges & 8192) != 0) {
                ((Activity) this.mHost).getWindow().getDecorView().setLayoutDirection(overrideConfig.getLayoutDirection());
            }
            ActivityCompat.recreate((Activity) this.mHost);
            handled = true;
        }
        if (!handled && configChanges != 0) {
            updateResourcesConfiguration(newNightMode, newLocales, (configChanges & activityHandlingConfigChange) == configChanges, (Configuration) null);
            handled = true;
        }
        if (handled && (this.mHost instanceof AppCompatActivity)) {
            if ((configChanges & 512) != 0) {
                ((AppCompatActivity) this.mHost).onNightModeChanged(nightMode);
            }
            if ((configChanges & 4) != 0) {
                ((AppCompatActivity) this.mHost).onLocalesChanged(locales);
            }
        }
        if (newLocales != null) {
            setDefaultLocalesForLocaleList(getConfigurationLocales(this.mContext.getResources().getConfiguration()));
        }
        return handled;
    }

    private void updateResourcesConfiguration(int uiModeNightModeValue, LocaleListCompat locales, boolean callOnConfigChange, Configuration configOverlay) {
        Resources res = this.mContext.getResources();
        Configuration conf = new Configuration(res.getConfiguration());
        if (configOverlay != null) {
            conf.updateFrom(configOverlay);
        }
        conf.uiMode = (res.getConfiguration().uiMode & -49) | uiModeNightModeValue;
        if (locales != null) {
            setConfigurationLocales(conf, locales);
        }
        res.updateConfiguration(conf, (DisplayMetrics) null);
        if (Build.VERSION.SDK_INT < 26) {
            ResourcesFlusher.flush(res);
        }
        if (this.mThemeResId != 0) {
            this.mContext.setTheme(this.mThemeResId);
            this.mContext.getTheme().applyStyle(this.mThemeResId, true);
        }
        if (callOnConfigChange && (this.mHost instanceof Activity)) {
            updateActivityConfiguration(conf);
        }
    }

    private void updateActivityConfiguration(Configuration conf) {
        Activity activity = (Activity) this.mHost;
        if (activity instanceof LifecycleOwner) {
            if (((LifecycleOwner) activity).getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.CREATED)) {
                activity.onConfigurationChanged(conf);
            }
        } else if (this.mCreated && !this.mDestroyed) {
            activity.onConfigurationChanged(conf);
        }
    }

    /* access modifiers changed from: package-private */
    public final AutoNightModeManager getAutoTimeNightModeManager() {
        return getAutoTimeNightModeManager(this.mContext);
    }

    private AutoNightModeManager getAutoTimeNightModeManager(Context context) {
        if (this.mAutoTimeNightModeManager == null) {
            this.mAutoTimeNightModeManager = new AutoTimeNightModeManager(TwilightManager.getInstance(context));
        }
        return this.mAutoTimeNightModeManager;
    }

    private AutoNightModeManager getAutoBatteryNightModeManager(Context context) {
        if (this.mAutoBatteryNightModeManager == null) {
            this.mAutoBatteryNightModeManager = new AutoBatteryNightModeManager(context);
        }
        return this.mAutoBatteryNightModeManager;
    }

    private int getActivityHandlesConfigChangesFlags(Context baseContext) {
        int flags;
        if (!this.mActivityHandlesConfigFlagsChecked && (this.mHost instanceof Activity)) {
            PackageManager pm = baseContext.getPackageManager();
            if (pm == null) {
                return 0;
            }
            try {
                if (Build.VERSION.SDK_INT >= 29) {
                    flags = 269221888;
                } else {
                    flags = 786432;
                }
                ActivityInfo info = pm.getActivityInfo(new ComponentName(baseContext, this.mHost.getClass()), flags);
                if (info != null) {
                    this.mActivityHandlesConfigFlags = info.configChanges;
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", e);
                this.mActivityHandlesConfigFlags = 0;
            }
        }
        this.mActivityHandlesConfigFlagsChecked = true;
        return this.mActivityHandlesConfigFlags;
    }

    class ActionModeCallbackWrapperV9 implements ActionMode.Callback {
        private ActionMode.Callback mWrapped;

        public ActionModeCallbackWrapperV9(ActionMode.Callback wrapped) {
            this.mWrapped = wrapped;
        }

        public boolean onCreateActionMode(ActionMode mode, Menu menu) {
            return this.mWrapped.onCreateActionMode(mode, menu);
        }

        public boolean onPrepareActionMode(ActionMode mode, Menu menu) {
            ViewCompat.requestApplyInsets(AppCompatDelegateImpl.this.mSubDecor);
            return this.mWrapped.onPrepareActionMode(mode, menu);
        }

        public boolean onActionItemClicked(ActionMode mode, MenuItem item) {
            return this.mWrapped.onActionItemClicked(mode, item);
        }

        public void onDestroyActionMode(ActionMode mode) {
            this.mWrapped.onDestroyActionMode(mode);
            if (AppCompatDelegateImpl.this.mActionModePopup != null) {
                AppCompatDelegateImpl.this.mWindow.getDecorView().removeCallbacks(AppCompatDelegateImpl.this.mShowActionModePopup);
            }
            if (AppCompatDelegateImpl.this.mActionModeView != null) {
                AppCompatDelegateImpl.this.endOnGoingFadeAnimation();
                AppCompatDelegateImpl.this.mFadeAnim = ViewCompat.animate(AppCompatDelegateImpl.this.mActionModeView).alpha(0.0f);
                AppCompatDelegateImpl.this.mFadeAnim.setListener(new ViewPropertyAnimatorListenerAdapter() {
                    public void onAnimationEnd(View view) {
                        AppCompatDelegateImpl.this.mActionModeView.setVisibility(8);
                        if (AppCompatDelegateImpl.this.mActionModePopup != null) {
                            AppCompatDelegateImpl.this.mActionModePopup.dismiss();
                        } else if (AppCompatDelegateImpl.this.mActionModeView.getParent() instanceof View) {
                            ViewCompat.requestApplyInsets((View) AppCompatDelegateImpl.this.mActionModeView.getParent());
                        }
                        AppCompatDelegateImpl.this.mActionModeView.killMode();
                        AppCompatDelegateImpl.this.mFadeAnim.setListener((ViewPropertyAnimatorListener) null);
                        AppCompatDelegateImpl.this.mFadeAnim = null;
                        ViewCompat.requestApplyInsets(AppCompatDelegateImpl.this.mSubDecor);
                    }
                });
            }
            if (AppCompatDelegateImpl.this.mAppCompatCallback != null) {
                AppCompatDelegateImpl.this.mAppCompatCallback.onSupportActionModeFinished(AppCompatDelegateImpl.this.mActionMode);
            }
            AppCompatDelegateImpl.this.mActionMode = null;
            ViewCompat.requestApplyInsets(AppCompatDelegateImpl.this.mSubDecor);
            AppCompatDelegateImpl.this.updateBackInvokedCallbackState();
        }
    }

    private final class PanelMenuPresenterCallback implements MenuPresenter.Callback {
        PanelMenuPresenterCallback() {
        }

        public void onCloseMenu(MenuBuilder menu, boolean allMenusAreClosing) {
            Menu parentMenu = menu.getRootMenu();
            boolean isSubMenu = parentMenu != menu;
            PanelFeatureState panel = AppCompatDelegateImpl.this.findMenuPanel(isSubMenu ? parentMenu : menu);
            if (panel == null) {
                return;
            }
            if (isSubMenu) {
                AppCompatDelegateImpl.this.callOnPanelClosed(panel.featureId, panel, parentMenu);
                AppCompatDelegateImpl.this.closePanel(panel, true);
                return;
            }
            AppCompatDelegateImpl.this.closePanel(panel, allMenusAreClosing);
        }

        public boolean onOpenSubMenu(MenuBuilder subMenu) {
            Window.Callback cb;
            if (subMenu != subMenu.getRootMenu() || !AppCompatDelegateImpl.this.mHasActionBar || (cb = AppCompatDelegateImpl.this.getWindowCallback()) == null || AppCompatDelegateImpl.this.mDestroyed) {
                return true;
            }
            cb.onMenuOpened(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, subMenu);
            return true;
        }
    }

    private final class ActionMenuPresenterCallback implements MenuPresenter.Callback {
        ActionMenuPresenterCallback() {
        }

        public boolean onOpenSubMenu(MenuBuilder subMenu) {
            Window.Callback cb = AppCompatDelegateImpl.this.getWindowCallback();
            if (cb == null) {
                return true;
            }
            cb.onMenuOpened(AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR, subMenu);
            return true;
        }

        public void onCloseMenu(MenuBuilder menu, boolean allMenusAreClosing) {
            AppCompatDelegateImpl.this.checkCloseActionMenu(menu);
        }
    }

    protected static final class PanelFeatureState {
        int background;
        View createdPanelView;
        ViewGroup decorView;
        int featureId;
        Bundle frozenActionViewState;
        Bundle frozenMenuState;
        int gravity;
        boolean isHandled;
        boolean isOpen;
        boolean isPrepared;
        ListMenuPresenter listMenuPresenter;
        Context listPresenterContext;
        MenuBuilder menu;
        public boolean qwertyMode;
        boolean refreshDecorView = false;
        boolean refreshMenuContent;
        View shownPanelView;
        boolean wasLastOpen;
        int windowAnimations;
        int x;
        int y;

        PanelFeatureState(int featureId2) {
            this.featureId = featureId2;
        }

        public boolean hasPanelItems() {
            if (this.shownPanelView == null) {
                return false;
            }
            if (this.createdPanelView != null) {
                return true;
            }
            if (this.listMenuPresenter.getAdapter().getCount() > 0) {
                return true;
            }
            return false;
        }

        public void clearMenuPresenters() {
            if (this.menu != null) {
                this.menu.removeMenuPresenter(this.listMenuPresenter);
            }
            this.listMenuPresenter = null;
        }

        /* access modifiers changed from: package-private */
        public void setStyle(Context context) {
            TypedValue outValue = new TypedValue();
            Resources.Theme widgetTheme = context.getResources().newTheme();
            widgetTheme.setTo(context.getTheme());
            widgetTheme.resolveAttribute(R.attr.actionBarPopupTheme, outValue, true);
            if (outValue.resourceId != 0) {
                widgetTheme.applyStyle(outValue.resourceId, true);
            }
            widgetTheme.resolveAttribute(R.attr.panelMenuListTheme, outValue, true);
            if (outValue.resourceId != 0) {
                widgetTheme.applyStyle(outValue.resourceId, true);
            } else {
                widgetTheme.applyStyle(R.style.Theme_AppCompat_CompactMenu, true);
            }
            Context context2 = new androidx.appcompat.view.ContextThemeWrapper(context, 0);
            context2.getTheme().setTo(widgetTheme);
            this.listPresenterContext = context2;
            TypedArray a = context2.obtainStyledAttributes(R.styleable.AppCompatTheme);
            this.background = a.getResourceId(R.styleable.AppCompatTheme_panelBackground, 0);
            this.windowAnimations = a.getResourceId(R.styleable.AppCompatTheme_android_windowAnimationStyle, 0);
            a.recycle();
        }

        /* access modifiers changed from: package-private */
        public void setMenu(MenuBuilder menu2) {
            if (menu2 != this.menu) {
                if (this.menu != null) {
                    this.menu.removeMenuPresenter(this.listMenuPresenter);
                }
                this.menu = menu2;
                if (menu2 != null && this.listMenuPresenter != null) {
                    menu2.addMenuPresenter(this.listMenuPresenter);
                }
            }
        }

        /* access modifiers changed from: package-private */
        public MenuView getListMenuView(MenuPresenter.Callback cb) {
            if (this.menu == null) {
                return null;
            }
            if (this.listMenuPresenter == null) {
                this.listMenuPresenter = new ListMenuPresenter(this.listPresenterContext, R.layout.abc_list_menu_item_layout);
                this.listMenuPresenter.setCallback(cb);
                this.menu.addMenuPresenter(this.listMenuPresenter);
            }
            return this.listMenuPresenter.getMenuView(this.decorView);
        }

        /* access modifiers changed from: package-private */
        public Parcelable onSaveInstanceState() {
            SavedState savedState = new SavedState();
            savedState.featureId = this.featureId;
            savedState.isOpen = this.isOpen;
            if (this.menu != null) {
                savedState.menuState = new Bundle();
                this.menu.savePresenterStates(savedState.menuState);
            }
            return savedState;
        }

        /* access modifiers changed from: package-private */
        public void onRestoreInstanceState(Parcelable state) {
            SavedState savedState = (SavedState) state;
            this.featureId = savedState.featureId;
            this.wasLastOpen = savedState.isOpen;
            this.frozenMenuState = savedState.menuState;
            this.shownPanelView = null;
            this.decorView = null;
        }

        /* access modifiers changed from: package-private */
        public void applyFrozenState() {
            if (this.menu != null && this.frozenMenuState != null) {
                this.menu.restorePresenterStates(this.frozenMenuState);
                this.frozenMenuState = null;
            }
        }

        private static class SavedState implements Parcelable {
            public static final Parcelable.Creator<SavedState> CREATOR = new Parcelable.ClassLoaderCreator<SavedState>() {
                public SavedState createFromParcel(Parcel in, ClassLoader loader) {
                    return SavedState.readFromParcel(in, loader);
                }

                public SavedState createFromParcel(Parcel in) {
                    return SavedState.readFromParcel(in, (ClassLoader) null);
                }

                public SavedState[] newArray(int size) {
                    return new SavedState[size];
                }
            };
            int featureId;
            boolean isOpen;
            Bundle menuState;

            SavedState() {
            }

            public int describeContents() {
                return 0;
            }

            public void writeToParcel(Parcel dest, int flags) {
                dest.writeInt(this.featureId);
                dest.writeInt(this.isOpen ? 1 : 0);
                if (this.isOpen) {
                    dest.writeBundle(this.menuState);
                }
            }

            static SavedState readFromParcel(Parcel source, ClassLoader loader) {
                SavedState savedState = new SavedState();
                savedState.featureId = source.readInt();
                boolean z = true;
                if (source.readInt() != 1) {
                    z = false;
                }
                savedState.isOpen = z;
                if (savedState.isOpen) {
                    savedState.menuState = source.readBundle(loader);
                }
                return savedState;
            }
        }
    }

    private class ListMenuDecorView extends ContentFrameLayout {
        public ListMenuDecorView(Context context) {
            super(context);
        }

        public boolean dispatchKeyEvent(KeyEvent event) {
            return AppCompatDelegateImpl.this.dispatchKeyEvent(event) || super.dispatchKeyEvent(event);
        }

        public boolean onInterceptTouchEvent(MotionEvent event) {
            if (event.getAction() != 0 || !isOutOfBounds((int) event.getX(), (int) event.getY())) {
                return super.onInterceptTouchEvent(event);
            }
            AppCompatDelegateImpl.this.closePanel(0);
            return true;
        }

        public void setBackgroundResource(int resid) {
            setBackgroundDrawable(AppCompatResources.getDrawable(getContext(), resid));
        }

        private boolean isOutOfBounds(int x, int y) {
            return x < -5 || y < -5 || x > getWidth() + 5 || y > getHeight() + 5;
        }
    }

    class AppCompatWindowCallback extends WindowCallbackWrapper {
        private ActionBarMenuCallback mActionBarCallback;
        private boolean mDispatchKeyEventBypassEnabled;
        private boolean mOnContentChangedBypassEnabled;
        private boolean mOnPanelClosedBypassEnabled;

        AppCompatWindowCallback(Window.Callback callback) {
            super(callback);
        }

        /* access modifiers changed from: package-private */
        public void setActionBarCallback(ActionBarMenuCallback callback) {
            this.mActionBarCallback = callback;
        }

        public boolean dispatchKeyEvent(KeyEvent event) {
            if (this.mDispatchKeyEventBypassEnabled) {
                return getWrapped().dispatchKeyEvent(event);
            }
            return AppCompatDelegateImpl.this.dispatchKeyEvent(event) || super.dispatchKeyEvent(event);
        }

        public boolean dispatchKeyShortcutEvent(KeyEvent event) {
            return super.dispatchKeyShortcutEvent(event) || AppCompatDelegateImpl.this.onKeyShortcut(event.getKeyCode(), event);
        }

        public boolean onCreatePanelMenu(int featureId, Menu menu) {
            if (featureId != 0 || (menu instanceof MenuBuilder)) {
                return super.onCreatePanelMenu(featureId, menu);
            }
            return false;
        }

        public View onCreatePanelView(int featureId) {
            View created;
            if (this.mActionBarCallback == null || (created = this.mActionBarCallback.onCreatePanelView(featureId)) == null) {
                return super.onCreatePanelView(featureId);
            }
            return created;
        }

        public void onContentChanged() {
            if (this.mOnContentChangedBypassEnabled) {
                getWrapped().onContentChanged();
            }
        }

        public boolean onPreparePanel(int featureId, View view, Menu menu) {
            MenuBuilder mb = menu instanceof MenuBuilder ? (MenuBuilder) menu : null;
            if (featureId == 0 && mb == null) {
                return false;
            }
            if (mb != null) {
                mb.setOverrideVisibleItems(true);
            }
            boolean handled = false;
            if (this.mActionBarCallback != null && this.mActionBarCallback.onPreparePanel(featureId)) {
                handled = true;
            }
            if (!handled) {
                handled = super.onPreparePanel(featureId, view, menu);
            }
            if (mb != null) {
                mb.setOverrideVisibleItems(false);
            }
            return handled;
        }

        public boolean onMenuOpened(int featureId, Menu menu) {
            super.onMenuOpened(featureId, menu);
            AppCompatDelegateImpl.this.onMenuOpened(featureId);
            return true;
        }

        public void onPanelClosed(int featureId, Menu menu) {
            if (this.mOnPanelClosedBypassEnabled) {
                getWrapped().onPanelClosed(featureId, menu);
                return;
            }
            super.onPanelClosed(featureId, menu);
            AppCompatDelegateImpl.this.onPanelClosed(featureId);
        }

        public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback) {
            return null;
        }

        /* access modifiers changed from: package-private */
        public final android.view.ActionMode startAsSupportActionMode(ActionMode.Callback callback) {
            SupportActionModeWrapper.CallbackWrapper callbackWrapper = new SupportActionModeWrapper.CallbackWrapper(AppCompatDelegateImpl.this.mContext, callback);
            androidx.appcompat.view.ActionMode supportActionMode = AppCompatDelegateImpl.this.startSupportActionMode(callbackWrapper);
            if (supportActionMode != null) {
                return callbackWrapper.getActionModeWrapper(supportActionMode);
            }
            return null;
        }

        public android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback callback, int type) {
            if (AppCompatDelegateImpl.this.isHandleNativeActionModesEnabled()) {
                switch (type) {
                    case 0:
                        return startAsSupportActionMode(callback);
                }
            }
            return super.onWindowStartingActionMode(callback, type);
        }

        public void onProvideKeyboardShortcuts(List<KeyboardShortcutGroup> data, Menu menu, int deviceId) {
            PanelFeatureState panel = AppCompatDelegateImpl.this.getPanelState(0, true);
            if (panel == null || panel.menu == null) {
                super.onProvideKeyboardShortcuts(data, menu, deviceId);
            } else {
                super.onProvideKeyboardShortcuts(data, panel.menu, deviceId);
            }
        }

        /* JADX INFO: finally extract failed */
        public void bypassOnContentChanged(Window.Callback c) {
            try {
                this.mOnContentChangedBypassEnabled = true;
                c.onContentChanged();
                this.mOnContentChangedBypassEnabled = false;
            } catch (Throwable th) {
                this.mOnContentChangedBypassEnabled = false;
                throw th;
            }
        }

        /* JADX INFO: finally extract failed */
        public boolean bypassDispatchKeyEvent(Window.Callback c, KeyEvent e) {
            try {
                this.mDispatchKeyEventBypassEnabled = true;
                boolean dispatchKeyEvent = c.dispatchKeyEvent(e);
                this.mDispatchKeyEventBypassEnabled = false;
                return dispatchKeyEvent;
            } catch (Throwable th) {
                this.mDispatchKeyEventBypassEnabled = false;
                throw th;
            }
        }

        /* JADX INFO: finally extract failed */
        public void bypassOnPanelClosed(Window.Callback c, int featureId, Menu menu) {
            try {
                this.mOnPanelClosedBypassEnabled = true;
                c.onPanelClosed(featureId, menu);
                this.mOnPanelClosedBypassEnabled = false;
            } catch (Throwable th) {
                this.mOnPanelClosedBypassEnabled = false;
                throw th;
            }
        }
    }

    abstract class AutoNightModeManager {
        private BroadcastReceiver mReceiver;

        /* access modifiers changed from: package-private */
        public abstract IntentFilter createIntentFilterForBroadcastReceiver();

        /* access modifiers changed from: package-private */
        public abstract int getApplyableNightMode();

        /* access modifiers changed from: package-private */
        public abstract void onChange();

        AutoNightModeManager() {
        }

        /* access modifiers changed from: package-private */
        public void setup() {
            cleanup();
            IntentFilter filter = createIntentFilterForBroadcastReceiver();
            if (filter != null && filter.countActions() != 0) {
                if (this.mReceiver == null) {
                    this.mReceiver = new BroadcastReceiver() {
                        public void onReceive(Context context, Intent intent) {
                            AutoNightModeManager.this.onChange();
                        }
                    };
                }
                AppCompatDelegateImpl.this.mContext.registerReceiver(this.mReceiver, filter);
            }
        }

        /* access modifiers changed from: package-private */
        public void cleanup() {
            if (this.mReceiver != null) {
                try {
                    AppCompatDelegateImpl.this.mContext.unregisterReceiver(this.mReceiver);
                } catch (IllegalArgumentException e) {
                }
                this.mReceiver = null;
            }
        }

        /* access modifiers changed from: package-private */
        public boolean isListening() {
            return this.mReceiver != null;
        }
    }

    private class AutoTimeNightModeManager extends AutoNightModeManager {
        private final TwilightManager mTwilightManager;

        AutoTimeNightModeManager(TwilightManager twilightManager) {
            super();
            this.mTwilightManager = twilightManager;
        }

        public int getApplyableNightMode() {
            return this.mTwilightManager.isNight() ? 2 : 1;
        }

        public void onChange() {
            AppCompatDelegateImpl.this.applyDayNight();
        }

        /* access modifiers changed from: package-private */
        public IntentFilter createIntentFilterForBroadcastReceiver() {
            IntentFilter filter = new IntentFilter();
            filter.addAction("android.intent.action.TIME_SET");
            filter.addAction("android.intent.action.TIMEZONE_CHANGED");
            filter.addAction("android.intent.action.TIME_TICK");
            return filter;
        }
    }

    private class AutoBatteryNightModeManager extends AutoNightModeManager {
        private final PowerManager mPowerManager;

        AutoBatteryNightModeManager(Context context) {
            super();
            this.mPowerManager = (PowerManager) context.getApplicationContext().getSystemService("power");
        }

        public int getApplyableNightMode() {
            return Api21Impl.isPowerSaveMode(this.mPowerManager) ? 2 : 1;
        }

        public void onChange() {
            AppCompatDelegateImpl.this.applyDayNight();
        }

        /* access modifiers changed from: package-private */
        public IntentFilter createIntentFilterForBroadcastReceiver() {
            IntentFilter filter = new IntentFilter();
            filter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
            return filter;
        }
    }

    public final ActionBarDrawerToggle.Delegate getDrawerToggleDelegate() {
        return new ActionBarDrawableToggleImpl();
    }

    private class ActionBarDrawableToggleImpl implements ActionBarDrawerToggle.Delegate {
        ActionBarDrawableToggleImpl() {
        }

        public Drawable getThemeUpIndicator() {
            TintTypedArray a = TintTypedArray.obtainStyledAttributes(getActionBarThemedContext(), (AttributeSet) null, new int[]{R.attr.homeAsUpIndicator});
            Drawable result = a.getDrawable(0);
            a.recycle();
            return result;
        }

        public Context getActionBarThemedContext() {
            return AppCompatDelegateImpl.this.getActionBarThemedContext();
        }

        public boolean isNavigationVisible() {
            ActionBar ab = AppCompatDelegateImpl.this.getSupportActionBar();
            return (ab == null || (ab.getDisplayOptions() & 4) == 0) ? false : true;
        }

        public void setActionBarUpIndicator(Drawable upDrawable, int contentDescRes) {
            ActionBar ab = AppCompatDelegateImpl.this.getSupportActionBar();
            if (ab != null) {
                ab.setHomeAsUpIndicator(upDrawable);
                ab.setHomeActionContentDescription(contentDescRes);
            }
        }

        public void setActionBarDescription(int contentDescRes) {
            ActionBar ab = AppCompatDelegateImpl.this.getSupportActionBar();
            if (ab != null) {
                ab.setHomeActionContentDescription(contentDescRes);
            }
        }
    }

    private static Configuration generateConfigDelta(Configuration base, Configuration change) {
        Configuration delta = new Configuration();
        delta.fontScale = 0.0f;
        if (change == null || base.diff(change) == 0) {
            return delta;
        }
        if (base.fontScale != change.fontScale) {
            delta.fontScale = change.fontScale;
        }
        if (base.mcc != change.mcc) {
            delta.mcc = change.mcc;
        }
        if (base.mnc != change.mnc) {
            delta.mnc = change.mnc;
        }
        Api24Impl.generateConfigDelta_locale(base, change, delta);
        if (base.touchscreen != change.touchscreen) {
            delta.touchscreen = change.touchscreen;
        }
        if (base.keyboard != change.keyboard) {
            delta.keyboard = change.keyboard;
        }
        if (base.keyboardHidden != change.keyboardHidden) {
            delta.keyboardHidden = change.keyboardHidden;
        }
        if (base.navigation != change.navigation) {
            delta.navigation = change.navigation;
        }
        if (base.navigationHidden != change.navigationHidden) {
            delta.navigationHidden = change.navigationHidden;
        }
        if (base.orientation != change.orientation) {
            delta.orientation = change.orientation;
        }
        if ((base.screenLayout & 15) != (change.screenLayout & 15)) {
            delta.screenLayout |= change.screenLayout & 15;
        }
        if ((base.screenLayout & 192) != (change.screenLayout & 192)) {
            delta.screenLayout |= change.screenLayout & 192;
        }
        if ((base.screenLayout & 48) != (change.screenLayout & 48)) {
            delta.screenLayout |= change.screenLayout & 48;
        }
        if ((base.screenLayout & ViewUtils.EDGE_TO_EDGE_FLAGS) != (change.screenLayout & ViewUtils.EDGE_TO_EDGE_FLAGS)) {
            delta.screenLayout |= change.screenLayout & ViewUtils.EDGE_TO_EDGE_FLAGS;
        }
        if (Build.VERSION.SDK_INT >= 26) {
            Api26Impl.generateConfigDelta_colorMode(base, change, delta);
        }
        if ((base.uiMode & 15) != (change.uiMode & 15)) {
            delta.uiMode |= change.uiMode & 15;
        }
        if ((base.uiMode & 48) != (change.uiMode & 48)) {
            delta.uiMode |= change.uiMode & 48;
        }
        if (base.screenWidthDp != change.screenWidthDp) {
            delta.screenWidthDp = change.screenWidthDp;
        }
        if (base.screenHeightDp != change.screenHeightDp) {
            delta.screenHeightDp = change.screenHeightDp;
        }
        if (base.smallestScreenWidthDp != change.smallestScreenWidthDp) {
            delta.smallestScreenWidthDp = change.smallestScreenWidthDp;
        }
        if (base.densityDpi != change.densityDpi) {
            delta.densityDpi = change.densityDpi;
        }
        return delta;
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static boolean isPowerSaveMode(PowerManager powerManager) {
            return powerManager.isPowerSaveMode();
        }

        static String toLanguageTag(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static void generateConfigDelta_locale(Configuration base, Configuration change, Configuration delta) {
            LocaleList baseLocales = base.getLocales();
            LocaleList changeLocales = change.getLocales();
            if (!baseLocales.equals(changeLocales)) {
                delta.setLocales(changeLocales);
                delta.locale = change.locale;
            }
        }

        static LocaleListCompat getLocales(Configuration configuration) {
            return LocaleListCompat.forLanguageTags(configuration.getLocales().toLanguageTags());
        }

        static void setLocales(Configuration configuration, LocaleListCompat locales) {
            configuration.setLocales(LocaleList.forLanguageTags(locales.toLanguageTags()));
        }

        public static void setDefaultLocales(LocaleListCompat locales) {
            LocaleList.setDefault(LocaleList.forLanguageTags(locales.toLanguageTags()));
        }
    }

    static class Api26Impl {
        private Api26Impl() {
        }

        static void generateConfigDelta_colorMode(Configuration base, Configuration change, Configuration delta) {
            if ((base.colorMode & 3) != (change.colorMode & 3)) {
                delta.colorMode |= change.colorMode & 3;
            }
            if ((base.colorMode & 12) != (change.colorMode & 12)) {
                delta.colorMode |= change.colorMode & 12;
            }
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static OnBackInvokedCallback registerOnBackPressedCallback(Object dispatcher, AppCompatDelegateImpl delegate) {
            Objects.requireNonNull(delegate);
            OnBackInvokedCallback onBackInvokedCallback = new AppCompatDelegateImpl$Api33Impl$$ExternalSyntheticLambda0(delegate);
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(DurationKt.NANOS_IN_MILLIS, onBackInvokedCallback);
            return onBackInvokedCallback;
        }

        static void unregisterOnBackInvokedCallback(Object dispatcher, Object callback) {
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }

        static OnBackInvokedDispatcher getOnBackInvokedDispatcher(Activity activity) {
            return activity.getOnBackInvokedDispatcher();
        }
    }
}
