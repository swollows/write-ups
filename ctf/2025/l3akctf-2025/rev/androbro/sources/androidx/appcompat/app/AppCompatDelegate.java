package androidx.appcompat.app;

import android.app.Activity;
import android.app.Dialog;
import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.view.ActionMode;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.VectorEnabledTintResources;
import androidx.collection.ArraySet;
import androidx.core.app.AppLocalesStorageHelper;
import androidx.core.os.LocaleListCompat;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.Objects;
import java.util.Queue;
import java.util.concurrent.Executor;

public abstract class AppCompatDelegate {
    static final String APP_LOCALES_META_DATA_HOLDER_SERVICE_NAME = "androidx.appcompat.app.AppLocalesMetadataHolderService";
    static final boolean DEBUG = false;
    public static final int FEATURE_ACTION_MODE_OVERLAY = 10;
    public static final int FEATURE_SUPPORT_ACTION_BAR = 108;
    public static final int FEATURE_SUPPORT_ACTION_BAR_OVERLAY = 109;
    @Deprecated
    public static final int MODE_NIGHT_AUTO = 0;
    public static final int MODE_NIGHT_AUTO_BATTERY = 3;
    @Deprecated
    public static final int MODE_NIGHT_AUTO_TIME = 0;
    public static final int MODE_NIGHT_FOLLOW_SYSTEM = -1;
    public static final int MODE_NIGHT_NO = 1;
    public static final int MODE_NIGHT_UNSPECIFIED = -100;
    public static final int MODE_NIGHT_YES = 2;
    static final String TAG = "AppCompatDelegate";
    private static final ArraySet<WeakReference<AppCompatDelegate>> sActivityDelegates = new ArraySet<>();
    private static final Object sActivityDelegatesLock = new Object();
    private static final Object sAppLocalesStorageSyncLock = new Object();
    private static int sDefaultNightMode = -100;
    private static Boolean sIsAutoStoreLocalesOptedIn = null;
    private static boolean sIsFrameworkSyncChecked = false;
    private static LocaleListCompat sRequestedAppLocales = null;
    static SerialExecutor sSerialExecutorForLocalesStorage = new SerialExecutor(new ThreadPerTaskExecutor());
    private static LocaleListCompat sStoredAppLocales = null;

    @Retention(RetentionPolicy.SOURCE)
    public @interface NightMode {
    }

    public abstract void addContentView(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean applyDayNight();

    public abstract View createView(View view, String str, Context context, AttributeSet attributeSet);

    public abstract <T extends View> T findViewById(int i);

    public abstract ActionBarDrawerToggle.Delegate getDrawerToggleDelegate();

    public abstract MenuInflater getMenuInflater();

    public abstract ActionBar getSupportActionBar();

    public abstract boolean hasWindowFeature(int i);

    public abstract void installViewFactory();

    public abstract void invalidateOptionsMenu();

    public abstract boolean isHandleNativeActionModesEnabled();

    public abstract void onConfigurationChanged(Configuration configuration);

    public abstract void onCreate(Bundle bundle);

    public abstract void onDestroy();

    public abstract void onPostCreate(Bundle bundle);

    public abstract void onPostResume();

    public abstract void onSaveInstanceState(Bundle bundle);

    public abstract void onStart();

    public abstract void onStop();

    public abstract boolean requestWindowFeature(int i);

    public abstract void setContentView(int i);

    public abstract void setContentView(View view);

    public abstract void setContentView(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void setHandleNativeActionModesEnabled(boolean z);

    public abstract void setLocalNightMode(int i);

    public abstract void setSupportActionBar(Toolbar toolbar);

    public abstract void setTitle(CharSequence charSequence);

    public abstract ActionMode startSupportActionMode(ActionMode.Callback callback);

    static class SerialExecutor implements Executor {
        Runnable mActive;
        final Executor mExecutor;
        private final Object mLock = new Object();
        final Queue<Runnable> mTasks = new ArrayDeque();

        SerialExecutor(Executor executor) {
            this.mExecutor = executor;
        }

        public void execute(Runnable r) {
            synchronized (this.mLock) {
                this.mTasks.add(new AppCompatDelegate$SerialExecutor$$ExternalSyntheticLambda0(this, r));
                if (this.mActive == null) {
                    scheduleNext();
                }
            }
        }

        /* access modifiers changed from: package-private */
        /* renamed from: lambda$execute$0$androidx-appcompat-app-AppCompatDelegate$SerialExecutor  reason: not valid java name */
        public /* synthetic */ void m78lambda$execute$0$androidxappcompatappAppCompatDelegate$SerialExecutor(Runnable r) {
            try {
                r.run();
            } finally {
                scheduleNext();
            }
        }

        /* access modifiers changed from: protected */
        public void scheduleNext() {
            synchronized (this.mLock) {
                Runnable poll = this.mTasks.poll();
                this.mActive = poll;
                if (poll != null) {
                    this.mExecutor.execute(this.mActive);
                }
            }
        }
    }

    static class ThreadPerTaskExecutor implements Executor {
        ThreadPerTaskExecutor() {
        }

        public void execute(Runnable r) {
            new Thread(r).start();
        }
    }

    public static AppCompatDelegate create(Activity activity, AppCompatCallback callback) {
        return new AppCompatDelegateImpl(activity, callback);
    }

    public static AppCompatDelegate create(Dialog dialog, AppCompatCallback callback) {
        return new AppCompatDelegateImpl(dialog, callback);
    }

    public static AppCompatDelegate create(Context context, Window window, AppCompatCallback callback) {
        return new AppCompatDelegateImpl(context, window, callback);
    }

    public static AppCompatDelegate create(Context context, Activity activity, AppCompatCallback callback) {
        return new AppCompatDelegateImpl(context, activity, callback);
    }

    AppCompatDelegate() {
    }

    public void setTheme(int themeResId) {
    }

    @Deprecated
    public void attachBaseContext(Context context) {
    }

    public Context attachBaseContext2(Context context) {
        attachBaseContext(context);
        return context;
    }

    public void setOnBackInvokedDispatcher(OnBackInvokedDispatcher dispatcher) {
    }

    /* access modifiers changed from: package-private */
    public boolean applyAppLocales() {
        return false;
    }

    public Context getContextForDelegate() {
        return null;
    }

    public int getLocalNightMode() {
        return -100;
    }

    public static void setDefaultNightMode(int mode) {
        switch (mode) {
            case -1:
            case 0:
            case 1:
            case 2:
            case 3:
                if (sDefaultNightMode != mode) {
                    sDefaultNightMode = mode;
                    applyDayNightToActiveDelegates();
                    return;
                }
                return;
            default:
                Log.d(TAG, "setDefaultNightMode() called with an unknown mode");
                return;
        }
    }

    public static void setApplicationLocales(LocaleListCompat locales) {
        Objects.requireNonNull(locales);
        if (Build.VERSION.SDK_INT >= 33) {
            Object localeManager = getLocaleManagerForApplication();
            if (localeManager != null) {
                Api33Impl.localeManagerSetApplicationLocales(localeManager, Api24Impl.localeListForLanguageTags(locales.toLanguageTags()));
            }
        } else if (!locales.equals(sRequestedAppLocales)) {
            synchronized (sActivityDelegatesLock) {
                sRequestedAppLocales = locales;
                applyLocalesToActiveDelegates();
            }
        }
    }

    public static LocaleListCompat getApplicationLocales() {
        if (Build.VERSION.SDK_INT >= 33) {
            Object localeManager = getLocaleManagerForApplication();
            if (localeManager != null) {
                return LocaleListCompat.wrap(Api33Impl.localeManagerGetApplicationLocales(localeManager));
            }
        } else if (sRequestedAppLocales != null) {
            return sRequestedAppLocales;
        }
        return LocaleListCompat.getEmptyLocaleList();
    }

    public static int getDefaultNightMode() {
        return sDefaultNightMode;
    }

    static LocaleListCompat getRequestedAppLocales() {
        return sRequestedAppLocales;
    }

    static LocaleListCompat getStoredAppLocales() {
        return sStoredAppLocales;
    }

    static void resetStaticRequestedAndStoredLocales() {
        sRequestedAppLocales = null;
        sStoredAppLocales = null;
    }

    static void setIsAutoStoreLocalesOptedIn(boolean isAutoStoreLocalesOptedIn) {
        sIsAutoStoreLocalesOptedIn = Boolean.valueOf(isAutoStoreLocalesOptedIn);
    }

    static Object getLocaleManagerForApplication() {
        Context context;
        Iterator<WeakReference<AppCompatDelegate>> it = sActivityDelegates.iterator();
        while (it.hasNext()) {
            AppCompatDelegate delegate = (AppCompatDelegate) it.next().get();
            if (delegate != null && (context = delegate.getContextForDelegate()) != null) {
                return context.getSystemService("locale");
            }
        }
        return null;
    }

    static boolean isAutoStorageOptedIn(Context context) {
        if (sIsAutoStoreLocalesOptedIn == null) {
            try {
                ServiceInfo serviceInfo = AppLocalesMetadataHolderService.getServiceInfo(context);
                if (serviceInfo.metaData != null) {
                    sIsAutoStoreLocalesOptedIn = Boolean.valueOf(serviceInfo.metaData.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException e) {
                Log.d(TAG, "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
                sIsAutoStoreLocalesOptedIn = false;
            }
        }
        return sIsAutoStoreLocalesOptedIn.booleanValue();
    }

    /* access modifiers changed from: package-private */
    public void asyncExecuteSyncRequestedAndStoredLocales(Context context) {
        sSerialExecutorForLocalesStorage.execute(new AppCompatDelegate$$ExternalSyntheticLambda1(context));
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:28:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void syncRequestedAndStoredLocales(android.content.Context r3) {
        /*
            boolean r0 = isAutoStorageOptedIn(r3)
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 33
            if (r0 < r1) goto L_0x001c
            boolean r0 = sIsFrameworkSyncChecked
            if (r0 != 0) goto L_0x0059
            androidx.appcompat.app.AppCompatDelegate$SerialExecutor r0 = sSerialExecutorForLocalesStorage
            androidx.appcompat.app.AppCompatDelegate$$ExternalSyntheticLambda0 r1 = new androidx.appcompat.app.AppCompatDelegate$$ExternalSyntheticLambda0
            r1.<init>(r3)
            r0.execute(r1)
            goto L_0x0059
        L_0x001c:
            java.lang.Object r0 = sAppLocalesStorageSyncLock
            monitor-enter(r0)
            androidx.core.os.LocaleListCompat r1 = sRequestedAppLocales     // Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x0041
            androidx.core.os.LocaleListCompat r1 = sStoredAppLocales     // Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x0032
            java.lang.String r1 = androidx.core.app.AppLocalesStorageHelper.readLocales(r3)     // Catch:{ all -> 0x005a }
            androidx.core.os.LocaleListCompat r1 = androidx.core.os.LocaleListCompat.forLanguageTags(r1)     // Catch:{ all -> 0x005a }
            sStoredAppLocales = r1     // Catch:{ all -> 0x005a }
        L_0x0032:
            androidx.core.os.LocaleListCompat r1 = sStoredAppLocales     // Catch:{ all -> 0x005a }
            boolean r1 = r1.isEmpty()     // Catch:{ all -> 0x005a }
            if (r1 == 0) goto L_0x003c
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            return
        L_0x003c:
            androidx.core.os.LocaleListCompat r1 = sStoredAppLocales     // Catch:{ all -> 0x005a }
            sRequestedAppLocales = r1     // Catch:{ all -> 0x005a }
            goto L_0x0058
        L_0x0041:
            androidx.core.os.LocaleListCompat r1 = sRequestedAppLocales     // Catch:{ all -> 0x005a }
            androidx.core.os.LocaleListCompat r2 = sStoredAppLocales     // Catch:{ all -> 0x005a }
            boolean r1 = r1.equals(r2)     // Catch:{ all -> 0x005a }
            if (r1 != 0) goto L_0x0058
            androidx.core.os.LocaleListCompat r1 = sRequestedAppLocales     // Catch:{ all -> 0x005a }
            sStoredAppLocales = r1     // Catch:{ all -> 0x005a }
            androidx.core.os.LocaleListCompat r1 = sRequestedAppLocales     // Catch:{ all -> 0x005a }
            java.lang.String r1 = r1.toLanguageTags()     // Catch:{ all -> 0x005a }
            androidx.core.app.AppLocalesStorageHelper.persistLocales(r3, r1)     // Catch:{ all -> 0x005a }
        L_0x0058:
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
        L_0x0059:
            return
        L_0x005a:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x005a }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.app.AppCompatDelegate.syncRequestedAndStoredLocales(android.content.Context):void");
    }

    static /* synthetic */ void lambda$syncRequestedAndStoredLocales$1(Context context) {
        syncLocalesToFramework(context);
        sIsFrameworkSyncChecked = true;
    }

    public static void setCompatVectorFromResourcesEnabled(boolean enabled) {
        VectorEnabledTintResources.setCompatVectorFromResourcesEnabled(enabled);
    }

    public static boolean isCompatVectorFromResourcesEnabled() {
        return VectorEnabledTintResources.isCompatVectorFromResourcesEnabled();
    }

    static void addActiveDelegate(AppCompatDelegate delegate) {
        synchronized (sActivityDelegatesLock) {
            removeDelegateFromActives(delegate);
            sActivityDelegates.add(new WeakReference(delegate));
        }
    }

    static void removeActivityDelegate(AppCompatDelegate delegate) {
        synchronized (sActivityDelegatesLock) {
            removeDelegateFromActives(delegate);
        }
    }

    static void syncLocalesToFramework(Context context) {
        if (Build.VERSION.SDK_INT >= 33) {
            ComponentName app_locales_component = new ComponentName(context, APP_LOCALES_META_DATA_HOLDER_SERVICE_NAME);
            if (context.getPackageManager().getComponentEnabledSetting(app_locales_component) != 1) {
                if (getApplicationLocales().isEmpty()) {
                    String appLocales = AppLocalesStorageHelper.readLocales(context);
                    Object localeManager = context.getSystemService("locale");
                    if (localeManager != null) {
                        Api33Impl.localeManagerSetApplicationLocales(localeManager, Api24Impl.localeListForLanguageTags(appLocales));
                    }
                }
                context.getPackageManager().setComponentEnabledSetting(app_locales_component, 1, 1);
            }
        }
    }

    private static void removeDelegateFromActives(AppCompatDelegate toRemove) {
        synchronized (sActivityDelegatesLock) {
            Iterator<WeakReference<AppCompatDelegate>> i = sActivityDelegates.iterator();
            while (i.hasNext()) {
                AppCompatDelegate delegate = (AppCompatDelegate) i.next().get();
                if (delegate == toRemove || delegate == null) {
                    i.remove();
                }
            }
        }
    }

    private static void applyDayNightToActiveDelegates() {
        synchronized (sActivityDelegatesLock) {
            Iterator<WeakReference<AppCompatDelegate>> it = sActivityDelegates.iterator();
            while (it.hasNext()) {
                AppCompatDelegate delegate = (AppCompatDelegate) it.next().get();
                if (delegate != null) {
                    delegate.applyDayNight();
                }
            }
        }
    }

    private static void applyLocalesToActiveDelegates() {
        Iterator<WeakReference<AppCompatDelegate>> it = sActivityDelegates.iterator();
        while (it.hasNext()) {
            AppCompatDelegate delegate = (AppCompatDelegate) it.next().get();
            if (delegate != null) {
                delegate.applyAppLocales();
            }
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static LocaleList localeListForLanguageTags(String list) {
            return LocaleList.forLanguageTags(list);
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static void localeManagerSetApplicationLocales(Object localeManager, LocaleList locales) {
            ((LocaleManager) localeManager).setApplicationLocales(locales);
        }

        static LocaleList localeManagerGetApplicationLocales(Object localeManager) {
            return ((LocaleManager) localeManager).getApplicationLocales();
        }
    }
}
