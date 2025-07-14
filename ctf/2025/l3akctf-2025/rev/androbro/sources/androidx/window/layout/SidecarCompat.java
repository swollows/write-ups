package androidx.window.layout;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.Context;
import android.os.IBinder;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import androidx.window.core.SpecificationComputer;
import androidx.window.core.Version;
import androidx.window.layout.ExtensionInterfaceCompat;
import androidx.window.sidecar.SidecarDeviceState;
import androidx.window.sidecar.SidecarInterface;
import androidx.window.sidecar.SidecarProvider;
import androidx.window.sidecar.SidecarWindowLayoutInfo;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0000\u0018\u0000 !2\u00020\u0001:\u0005!\"#$%B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u001b\b\u0007\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0002\u0010\tJ\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\fH\u0007J\u0010\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\fH\u0016J\u0010\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\fH\u0016J\u0016\u0010\u001a\u001a\u00020\u00182\u0006\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\fJ\u0010\u0010\u001c\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\fH\u0002J\u0010\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u001e\u001a\u00020\u00182\u0006\u0010\u0016\u001a\u00020\fH\u0002J\b\u0010\u001f\u001a\u00020 H\u0017R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000bX\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u000e¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0007\u001a\u00020\bX\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\f0\u000bX\u0004¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Landroidx/window/layout/SidecarCompat;", "Landroidx/window/layout/ExtensionInterfaceCompat;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "sidecar", "Landroidx/window/sidecar/SidecarInterface;", "sidecarAdapter", "Landroidx/window/layout/SidecarAdapter;", "(Landroidx/window/sidecar/SidecarInterface;Landroidx/window/layout/SidecarAdapter;)V", "componentCallbackMap", "", "Landroid/app/Activity;", "Landroid/content/ComponentCallbacks;", "extensionCallback", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "getSidecar", "()Landroidx/window/sidecar/SidecarInterface;", "windowListenerRegisteredContexts", "Landroid/os/IBinder;", "getWindowLayoutInfo", "Landroidx/window/layout/WindowLayoutInfo;", "activity", "onWindowLayoutChangeListenerAdded", "", "onWindowLayoutChangeListenerRemoved", "register", "windowToken", "registerConfigurationChangeListener", "setExtensionCallback", "unregisterComponentCallback", "validateExtensionInterface", "", "Companion", "DistinctElementCallback", "DistinctSidecarElementCallback", "FirstAttachAdapter", "TranslatingCallback", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: SidecarCompat.kt */
public final class SidecarCompat implements ExtensionInterfaceCompat {
    public static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final String TAG = "SidecarCompat";
    private final Map<Activity, ComponentCallbacks> componentCallbackMap;
    /* access modifiers changed from: private */
    public ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallback;
    private final SidecarInterface sidecar;
    /* access modifiers changed from: private */
    public final SidecarAdapter sidecarAdapter;
    /* access modifiers changed from: private */
    public final Map<IBinder, Activity> windowListenerRegisteredContexts;

    public SidecarCompat(SidecarInterface sidecar2, SidecarAdapter sidecarAdapter2) {
        Intrinsics.checkNotNullParameter(sidecarAdapter2, "sidecarAdapter");
        this.sidecar = sidecar2;
        this.sidecarAdapter = sidecarAdapter2;
        this.windowListenerRegisteredContexts = new LinkedHashMap();
        this.componentCallbackMap = new LinkedHashMap();
    }

    public final SidecarInterface getSidecar() {
        return this.sidecar;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public SidecarCompat(Context context) {
        this(Companion.getSidecarCompat$window_release(context), new SidecarAdapter((SpecificationComputer.VerificationMode) null, 1, (DefaultConstructorMarker) null));
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public void setExtensionCallback(ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallback2) {
        Intrinsics.checkNotNullParameter(extensionCallback2, "extensionCallback");
        this.extensionCallback = new DistinctElementCallback(extensionCallback2);
        SidecarInterface sidecarInterface = this.sidecar;
        if (sidecarInterface != null) {
            sidecarInterface.setSidecarCallback(new DistinctSidecarElementCallback(this.sidecarAdapter, new TranslatingCallback(this)));
        }
    }

    public final WindowLayoutInfo getWindowLayoutInfo(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IBinder windowToken = Companion.getActivityWindowToken$window_release(activity);
        if (windowToken == null) {
            return new WindowLayoutInfo(CollectionsKt.emptyList());
        }
        SidecarInterface sidecarInterface = this.sidecar;
        SidecarDeviceState sidecarDeviceState = null;
        SidecarWindowLayoutInfo windowLayoutInfo = sidecarInterface == null ? null : sidecarInterface.getWindowLayoutInfo(windowToken);
        SidecarAdapter sidecarAdapter2 = this.sidecarAdapter;
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarDeviceState = sidecarInterface2.getDeviceState();
        }
        if (sidecarDeviceState == null) {
            sidecarDeviceState = new SidecarDeviceState();
        }
        return sidecarAdapter2.translate(windowLayoutInfo, sidecarDeviceState);
    }

    public void onWindowLayoutChangeListenerAdded(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        IBinder windowToken = Companion.getActivityWindowToken$window_release(activity);
        if (windowToken != null) {
            register(windowToken, activity);
            return;
        }
        activity.getWindow().getDecorView().addOnAttachStateChangeListener(new FirstAttachAdapter(this, activity));
    }

    public final void register(IBinder windowToken, Activity activity) {
        SidecarInterface sidecarInterface;
        Intrinsics.checkNotNullParameter(windowToken, "windowToken");
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.windowListenerRegisteredContexts.put(windowToken, activity);
        SidecarInterface sidecarInterface2 = this.sidecar;
        if (sidecarInterface2 != null) {
            sidecarInterface2.onWindowLayoutChangeListenerAdded(windowToken);
        }
        if (this.windowListenerRegisteredContexts.size() == 1 && (sidecarInterface = this.sidecar) != null) {
            sidecarInterface.onDeviceStateListenersChanged(false);
        }
        ExtensionInterfaceCompat.ExtensionCallbackInterface extensionCallbackInterface = this.extensionCallback;
        if (extensionCallbackInterface != null) {
            extensionCallbackInterface.onWindowLayoutChanged(activity, getWindowLayoutInfo(activity));
        }
        registerConfigurationChangeListener(activity);
    }

    private final void registerConfigurationChangeListener(Activity activity) {
        if (this.componentCallbackMap.get(activity) == null) {
            SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1 configChangeObserver = new SidecarCompat$registerConfigurationChangeListener$configChangeObserver$1(this, activity);
            this.componentCallbackMap.put(activity, configChangeObserver);
            activity.registerComponentCallbacks(configChangeObserver);
        }
    }

    public void onWindowLayoutChangeListenerRemoved(Activity activity) {
        SidecarInterface sidecarInterface;
        Intrinsics.checkNotNullParameter(activity, "activity");
        IBinder windowToken = Companion.getActivityWindowToken$window_release(activity);
        if (windowToken != null) {
            SidecarInterface sidecarInterface2 = this.sidecar;
            if (sidecarInterface2 != null) {
                sidecarInterface2.onWindowLayoutChangeListenerRemoved(windowToken);
            }
            unregisterComponentCallback(activity);
            boolean isLast = this.windowListenerRegisteredContexts.size() == 1;
            this.windowListenerRegisteredContexts.remove(windowToken);
            if (isLast && (sidecarInterface = this.sidecar) != null) {
                sidecarInterface.onDeviceStateListenersChanged(true);
            }
        }
    }

    private final void unregisterComponentCallback(Activity activity) {
        activity.unregisterComponentCallbacks(this.componentCallbackMap.get(activity));
        this.componentCallbackMap.remove(activity);
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x0022 A[Catch:{ NoSuchFieldError -> 0x0130, NoSuchFieldError -> 0x00cd, all -> 0x01e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0024 A[Catch:{ NoSuchFieldError -> 0x0130, NoSuchFieldError -> 0x00cd, all -> 0x01e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0031 A[Catch:{ NoSuchFieldError -> 0x0130, NoSuchFieldError -> 0x00cd, all -> 0x01e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0060 A[Catch:{ NoSuchFieldError -> 0x0130, NoSuchFieldError -> 0x00cd, all -> 0x01e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0062 A[Catch:{ NoSuchFieldError -> 0x0130, NoSuchFieldError -> 0x00cd, all -> 0x01e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x006e A[Catch:{ NoSuchFieldError -> 0x0130, NoSuchFieldError -> 0x00cd, all -> 0x01e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008a A[Catch:{ NoSuchFieldError -> 0x0130, NoSuchFieldError -> 0x00cd, all -> 0x01e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x008c A[Catch:{ NoSuchFieldError -> 0x0130, NoSuchFieldError -> 0x00cd, all -> 0x01e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0099 A[Catch:{ NoSuchFieldError -> 0x0130, NoSuchFieldError -> 0x00cd, all -> 0x01e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x00b5 A[Catch:{ NoSuchFieldError -> 0x0130, NoSuchFieldError -> 0x00cd, all -> 0x01e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:0x00b6 A[Catch:{ NoSuchFieldError -> 0x0130, NoSuchFieldError -> 0x00cd, all -> 0x01e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:59:0x00c3 A[Catch:{ NoSuchFieldError -> 0x0130, NoSuchFieldError -> 0x00cd, all -> 0x01e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01a9 A[Catch:{ NoSuchFieldError -> 0x0130, NoSuchFieldError -> 0x00cd, all -> 0x01e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x01b8 A[Catch:{ NoSuchFieldError -> 0x0130, NoSuchFieldError -> 0x00cd, all -> 0x01e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:95:0x01c7 A[Catch:{ NoSuchFieldError -> 0x0130, NoSuchFieldError -> 0x00cd, all -> 0x01e3 }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x01d5 A[Catch:{ NoSuchFieldError -> 0x0130, NoSuchFieldError -> 0x00cd, all -> 0x01e3 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean validateExtensionInterface() {
        /*
            r21 = this;
            r1 = r21
            r2 = 0
            androidx.window.sidecar.SidecarInterface r0 = r1.sidecar     // Catch:{ all -> 0x01e3 }
            r3 = 1
            r4 = 0
            if (r0 != 0) goto L_0x000b
        L_0x0009:
            r0 = r4
            goto L_0x001f
        L_0x000b:
            java.lang.Class r0 = r0.getClass()     // Catch:{ all -> 0x01e3 }
            if (r0 != 0) goto L_0x0012
            goto L_0x0009
        L_0x0012:
            java.lang.String r5 = "setSidecarCallback"
            java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch:{ all -> 0x01e3 }
            java.lang.Class<androidx.window.sidecar.SidecarInterface$SidecarCallback> r7 = androidx.window.sidecar.SidecarInterface.SidecarCallback.class
            r6[r2] = r7     // Catch:{ all -> 0x01e3 }
            java.lang.reflect.Method r0 = r0.getMethod(r5, r6)     // Catch:{ all -> 0x01e3 }
        L_0x001f:
            r5 = r0
            if (r5 != 0) goto L_0x0024
            r0 = r4
            goto L_0x0028
        L_0x0024:
            java.lang.Class r0 = r5.getReturnType()     // Catch:{ all -> 0x01e3 }
        L_0x0028:
            r6 = r0
            java.lang.Class r0 = java.lang.Void.TYPE     // Catch:{ all -> 0x01e3 }
            boolean r0 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r6, (java.lang.Object) r0)     // Catch:{ all -> 0x01e3 }
            if (r0 == 0) goto L_0x01d5
            androidx.window.sidecar.SidecarInterface r0 = r1.sidecar     // Catch:{ all -> 0x01e3 }
            if (r0 != 0) goto L_0x0037
            r0 = r4
            goto L_0x003b
        L_0x0037:
            androidx.window.sidecar.SidecarDeviceState r0 = r0.getDeviceState()     // Catch:{ all -> 0x01e3 }
        L_0x003b:
            androidx.window.sidecar.SidecarInterface r7 = r1.sidecar     // Catch:{ all -> 0x01e3 }
            if (r7 != 0) goto L_0x0041
            goto L_0x0044
        L_0x0041:
            r7.onDeviceStateListenersChanged(r3)     // Catch:{ all -> 0x01e3 }
        L_0x0044:
            androidx.window.sidecar.SidecarInterface r7 = r1.sidecar     // Catch:{ all -> 0x01e3 }
            if (r7 != 0) goto L_0x004a
        L_0x0048:
            r7 = r4
            goto L_0x005d
        L_0x004a:
            java.lang.Class r7 = r7.getClass()     // Catch:{ all -> 0x01e3 }
            if (r7 != 0) goto L_0x0051
            goto L_0x0048
        L_0x0051:
            java.lang.String r8 = "getWindowLayoutInfo"
            java.lang.Class[] r9 = new java.lang.Class[r3]     // Catch:{ all -> 0x01e3 }
            java.lang.Class<android.os.IBinder> r10 = android.os.IBinder.class
            r9[r2] = r10     // Catch:{ all -> 0x01e3 }
            java.lang.reflect.Method r7 = r7.getMethod(r8, r9)     // Catch:{ all -> 0x01e3 }
        L_0x005d:
            if (r7 != 0) goto L_0x0062
            r8 = r4
            goto L_0x0066
        L_0x0062:
            java.lang.Class r8 = r7.getReturnType()     // Catch:{ all -> 0x01e3 }
        L_0x0066:
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r9 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            boolean r9 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r8, (java.lang.Object) r9)     // Catch:{ all -> 0x01e3 }
            if (r9 == 0) goto L_0x01c7
            androidx.window.sidecar.SidecarInterface r9 = r1.sidecar     // Catch:{ all -> 0x01e3 }
            if (r9 != 0) goto L_0x0074
        L_0x0072:
            r9 = r4
            goto L_0x0087
        L_0x0074:
            java.lang.Class r9 = r9.getClass()     // Catch:{ all -> 0x01e3 }
            if (r9 != 0) goto L_0x007b
            goto L_0x0072
        L_0x007b:
            java.lang.String r10 = "onWindowLayoutChangeListenerAdded"
            java.lang.Class[] r11 = new java.lang.Class[r3]     // Catch:{ all -> 0x01e3 }
            java.lang.Class<android.os.IBinder> r12 = android.os.IBinder.class
            r11[r2] = r12     // Catch:{ all -> 0x01e3 }
            java.lang.reflect.Method r9 = r9.getMethod(r10, r11)     // Catch:{ all -> 0x01e3 }
        L_0x0087:
            if (r9 != 0) goto L_0x008c
            r10 = r4
            goto L_0x0090
        L_0x008c:
            java.lang.Class r10 = r9.getReturnType()     // Catch:{ all -> 0x01e3 }
        L_0x0090:
            java.lang.Class r11 = java.lang.Void.TYPE     // Catch:{ all -> 0x01e3 }
            boolean r11 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r10, (java.lang.Object) r11)     // Catch:{ all -> 0x01e3 }
            if (r11 == 0) goto L_0x01b8
            androidx.window.sidecar.SidecarInterface r11 = r1.sidecar     // Catch:{ all -> 0x01e3 }
            if (r11 != 0) goto L_0x009f
        L_0x009d:
            r11 = r4
            goto L_0x00b2
        L_0x009f:
            java.lang.Class r11 = r11.getClass()     // Catch:{ all -> 0x01e3 }
            if (r11 != 0) goto L_0x00a6
            goto L_0x009d
        L_0x00a6:
            java.lang.String r12 = "onWindowLayoutChangeListenerRemoved"
            java.lang.Class[] r13 = new java.lang.Class[r3]     // Catch:{ all -> 0x01e3 }
            java.lang.Class<android.os.IBinder> r14 = android.os.IBinder.class
            r13[r2] = r14     // Catch:{ all -> 0x01e3 }
            java.lang.reflect.Method r11 = r11.getMethod(r12, r13)     // Catch:{ all -> 0x01e3 }
        L_0x00b2:
            if (r11 != 0) goto L_0x00b6
            goto L_0x00ba
        L_0x00b6:
            java.lang.Class r4 = r11.getReturnType()     // Catch:{ all -> 0x01e3 }
        L_0x00ba:
            java.lang.Class r12 = java.lang.Void.TYPE     // Catch:{ all -> 0x01e3 }
            boolean r12 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r12)     // Catch:{ all -> 0x01e3 }
            if (r12 == 0) goto L_0x01a9
            androidx.window.sidecar.SidecarDeviceState r12 = new androidx.window.sidecar.SidecarDeviceState     // Catch:{ all -> 0x01e3 }
            r12.<init>()     // Catch:{ all -> 0x01e3 }
            r13 = 3
            r12.posture = r13     // Catch:{ NoSuchFieldError -> 0x00cd }
            goto L_0x0106
        L_0x00cd:
            r0 = move-exception
            r14 = r0
            r0 = r14
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r14 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r15 = "setPosture"
            java.lang.Class[] r13 = new java.lang.Class[r3]     // Catch:{ all -> 0x01e3 }
            java.lang.Class r17 = java.lang.Integer.TYPE     // Catch:{ all -> 0x01e3 }
            r13[r2] = r17     // Catch:{ all -> 0x01e3 }
            java.lang.reflect.Method r13 = r14.getMethod(r15, r13)     // Catch:{ all -> 0x01e3 }
            r14 = 3
            java.lang.Integer r15 = java.lang.Integer.valueOf(r14)     // Catch:{ all -> 0x01e3 }
            java.lang.Object[] r14 = new java.lang.Object[]{r15}     // Catch:{ all -> 0x01e3 }
            r13.invoke(r12, r14)     // Catch:{ all -> 0x01e3 }
            java.lang.Class<androidx.window.sidecar.SidecarDeviceState> r14 = androidx.window.sidecar.SidecarDeviceState.class
            java.lang.String r15 = "getPosture"
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ all -> 0x01e3 }
            java.lang.reflect.Method r3 = r14.getMethod(r15, r3)     // Catch:{ all -> 0x01e3 }
            java.lang.Object[] r14 = new java.lang.Object[r2]     // Catch:{ all -> 0x01e3 }
            java.lang.Object r14 = r3.invoke(r12, r14)     // Catch:{ all -> 0x01e3 }
            if (r14 == 0) goto L_0x019e
            java.lang.Integer r14 = (java.lang.Integer) r14     // Catch:{ all -> 0x01e3 }
            int r14 = r14.intValue()     // Catch:{ all -> 0x01e3 }
            r15 = 3
            if (r14 != r15) goto L_0x0193
        L_0x0106:
            androidx.window.sidecar.SidecarDisplayFeature r0 = new androidx.window.sidecar.SidecarDisplayFeature     // Catch:{ all -> 0x01e3 }
            r0.<init>()     // Catch:{ all -> 0x01e3 }
            r3 = r0
            android.graphics.Rect r0 = r3.getRect()     // Catch:{ all -> 0x01e3 }
            java.lang.String r13 = "displayFeature.rect"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r13)     // Catch:{ all -> 0x01e3 }
            r13 = r0
            r3.setRect(r13)     // Catch:{ all -> 0x01e3 }
            int r0 = r3.getType()     // Catch:{ all -> 0x01e3 }
            r14 = r0
            r15 = 1
            r3.setType(r15)     // Catch:{ all -> 0x01e3 }
            androidx.window.sidecar.SidecarWindowLayoutInfo r0 = new androidx.window.sidecar.SidecarWindowLayoutInfo     // Catch:{ all -> 0x01e3 }
            r0.<init>()     // Catch:{ all -> 0x01e3 }
            r15 = r0
            java.util.List r0 = r15.displayFeatures     // Catch:{ NoSuchFieldError -> 0x0130 }
            r19 = r3
            r17 = r5
            goto L_0x0181
        L_0x0130:
            r0 = move-exception
            r16 = r0
            r0 = r16
            java.util.ArrayList r16 = new java.util.ArrayList     // Catch:{ all -> 0x01e3 }
            r16.<init>()     // Catch:{ all -> 0x01e3 }
            java.util.List r16 = (java.util.List) r16     // Catch:{ all -> 0x01e3 }
            r18 = r16
            r2 = r18
            r2.add(r3)     // Catch:{ all -> 0x01e3 }
            r18 = r0
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r0 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            java.lang.String r1 = "setDisplayFeatures"
            r19 = r3
            r17 = r5
            r3 = 1
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch:{ all -> 0x01e3 }
            java.lang.Class<java.util.List> r20 = java.util.List.class
            r16 = 0
            r5[r16] = r20     // Catch:{ all -> 0x01e3 }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r5)     // Catch:{ all -> 0x01e3 }
            java.lang.Object[] r1 = new java.lang.Object[]{r2}     // Catch:{ all -> 0x01e3 }
            r0.invoke(r15, r1)     // Catch:{ all -> 0x01e3 }
            java.lang.Class<androidx.window.sidecar.SidecarWindowLayoutInfo> r1 = androidx.window.sidecar.SidecarWindowLayoutInfo.class
            java.lang.String r5 = "getDisplayFeatures"
            r16 = r0
            r3 = 0
            java.lang.Class[] r0 = new java.lang.Class[r3]     // Catch:{ all -> 0x01e3 }
            java.lang.reflect.Method r0 = r1.getMethod(r5, r0)     // Catch:{ all -> 0x01e3 }
            java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch:{ all -> 0x01e3 }
            java.lang.Object r1 = r0.invoke(r15, r1)     // Catch:{ all -> 0x01e3 }
            if (r1 == 0) goto L_0x018b
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x01e3 }
            boolean r5 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r2, (java.lang.Object) r1)     // Catch:{ all -> 0x01e3 }
            if (r5 == 0) goto L_0x0183
        L_0x0181:
            r2 = 1
            goto L_0x01e6
        L_0x0183:
            java.lang.Exception r5 = new java.lang.Exception     // Catch:{ all -> 0x01e3 }
            java.lang.String r3 = "Invalid display feature getter/setter"
            r5.<init>(r3)     // Catch:{ all -> 0x01e3 }
            throw r5     // Catch:{ all -> 0x01e3 }
        L_0x018b:
            java.lang.NullPointerException r1 = new java.lang.NullPointerException     // Catch:{ all -> 0x01e3 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.collections.List<androidx.window.sidecar.SidecarDisplayFeature>"
            r1.<init>(r3)     // Catch:{ all -> 0x01e3 }
            throw r1     // Catch:{ all -> 0x01e3 }
        L_0x0193:
            r1 = r3
            r17 = r5
            java.lang.Exception r2 = new java.lang.Exception     // Catch:{ all -> 0x01e3 }
            java.lang.String r3 = "Invalid device posture getter/setter"
            r2.<init>(r3)     // Catch:{ all -> 0x01e3 }
            throw r2     // Catch:{ all -> 0x01e3 }
        L_0x019e:
            r1 = r3
            r17 = r5
            java.lang.NullPointerException r2 = new java.lang.NullPointerException     // Catch:{ all -> 0x01e3 }
            java.lang.String r3 = "null cannot be cast to non-null type kotlin.Int"
            r2.<init>(r3)     // Catch:{ all -> 0x01e3 }
            throw r2     // Catch:{ all -> 0x01e3 }
        L_0x01a9:
            r17 = r5
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x01e3 }
            java.lang.String r2 = "Illegal return type for 'onWindowLayoutChangeListenerRemoved': "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r4)     // Catch:{ all -> 0x01e3 }
            r1.<init>(r2)     // Catch:{ all -> 0x01e3 }
            throw r1     // Catch:{ all -> 0x01e3 }
        L_0x01b8:
            r17 = r5
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x01e3 }
            java.lang.String r2 = "Illegal return type for 'onWindowLayoutChangeListenerAdded': "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r10)     // Catch:{ all -> 0x01e3 }
            r1.<init>(r2)     // Catch:{ all -> 0x01e3 }
            throw r1     // Catch:{ all -> 0x01e3 }
        L_0x01c7:
            r17 = r5
            java.lang.NoSuchMethodException r1 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x01e3 }
            java.lang.String r2 = "Illegal return type for 'getWindowLayoutInfo': "
            java.lang.String r2 = kotlin.jvm.internal.Intrinsics.stringPlus(r2, r8)     // Catch:{ all -> 0x01e3 }
            r1.<init>(r2)     // Catch:{ all -> 0x01e3 }
            throw r1     // Catch:{ all -> 0x01e3 }
        L_0x01d5:
            r17 = r5
            java.lang.NoSuchMethodException r0 = new java.lang.NoSuchMethodException     // Catch:{ all -> 0x01e3 }
            java.lang.String r1 = "Illegal return type for 'setSidecarCallback': "
            java.lang.String r1 = kotlin.jvm.internal.Intrinsics.stringPlus(r1, r6)     // Catch:{ all -> 0x01e3 }
            r0.<init>(r1)     // Catch:{ all -> 0x01e3 }
            throw r0     // Catch:{ all -> 0x01e3 }
        L_0x01e3:
            r0 = move-exception
            r2 = 0
        L_0x01e6:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.window.layout.SidecarCompat.validateExtensionInterface():boolean");
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u001c\u0010\u0007\u001a\u0010\u0012\f\u0012\n \t*\u0004\u0018\u00010\u00050\u00050\bX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/window/layout/SidecarCompat$FirstAttachAdapter;", "Landroid/view/View$OnAttachStateChangeListener;", "sidecarCompat", "Landroidx/window/layout/SidecarCompat;", "activity", "Landroid/app/Activity;", "(Landroidx/window/layout/SidecarCompat;Landroid/app/Activity;)V", "activityWeakReference", "Ljava/lang/ref/WeakReference;", "kotlin.jvm.PlatformType", "onViewAttachedToWindow", "", "view", "Landroid/view/View;", "onViewDetachedFromWindow", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: SidecarCompat.kt */
    private static final class FirstAttachAdapter implements View.OnAttachStateChangeListener {
        private final WeakReference<Activity> activityWeakReference;
        private final SidecarCompat sidecarCompat;

        public FirstAttachAdapter(SidecarCompat sidecarCompat2, Activity activity) {
            Intrinsics.checkNotNullParameter(sidecarCompat2, "sidecarCompat");
            Intrinsics.checkNotNullParameter(activity, "activity");
            this.sidecarCompat = sidecarCompat2;
            this.activityWeakReference = new WeakReference<>(activity);
        }

        public void onViewAttachedToWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            view.removeOnAttachStateChangeListener(this);
            Activity activity = (Activity) this.activityWeakReference.get();
            IBinder token = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
            if (activity != null && token != null) {
                this.sidecarCompat.register(token, activity);
            }
        }

        public void onViewDetachedFromWindow(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0004\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0017J\u0018\u0010\u0007\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0017¨\u0006\f"}, d2 = {"Landroidx/window/layout/SidecarCompat$TranslatingCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "(Landroidx/window/layout/SidecarCompat;)V", "onDeviceStateChanged", "", "newDeviceState", "Landroidx/window/sidecar/SidecarDeviceState;", "onWindowLayoutChanged", "windowToken", "Landroid/os/IBinder;", "newLayout", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: SidecarCompat.kt */
    public final class TranslatingCallback implements SidecarInterface.SidecarCallback {
        final /* synthetic */ SidecarCompat this$0;

        public TranslatingCallback(SidecarCompat this$02) {
            Intrinsics.checkNotNullParameter(this$02, "this$0");
            this.this$0 = this$02;
        }

        public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
            SidecarInterface sidecar;
            Intrinsics.checkNotNullParameter(newDeviceState, "newDeviceState");
            SidecarCompat sidecarCompat = this.this$0;
            for (Activity activity : this.this$0.windowListenerRegisteredContexts.values()) {
                IBinder windowToken = SidecarCompat.Companion.getActivityWindowToken$window_release(activity);
                SidecarWindowLayoutInfo sidecarWindowLayoutInfo = null;
                if (!(windowToken == null || (sidecar = sidecarCompat.getSidecar()) == null)) {
                    sidecarWindowLayoutInfo = sidecar.getWindowLayoutInfo(windowToken);
                }
                SidecarWindowLayoutInfo layoutInfo = sidecarWindowLayoutInfo;
                ExtensionInterfaceCompat.ExtensionCallbackInterface access$getExtensionCallback$p = sidecarCompat.extensionCallback;
                if (access$getExtensionCallback$p != null) {
                    access$getExtensionCallback$p.onWindowLayoutChanged(activity, sidecarCompat.sidecarAdapter.translate(layoutInfo, newDeviceState));
                }
            }
        }

        public void onWindowLayoutChanged(IBinder windowToken, SidecarWindowLayoutInfo newLayout) {
            Intrinsics.checkNotNullParameter(windowToken, "windowToken");
            Intrinsics.checkNotNullParameter(newLayout, "newLayout");
            Activity activity = (Activity) this.this$0.windowListenerRegisteredContexts.get(windowToken);
            if (activity == null) {
                Log.w(SidecarCompat.TAG, "Unable to resolve activity from window token. Missing a call to #onWindowLayoutChangeListenerAdded()?");
                return;
            }
            SidecarAdapter access$getSidecarAdapter$p = this.this$0.sidecarAdapter;
            SidecarInterface sidecar = this.this$0.getSidecar();
            SidecarDeviceState deviceState = sidecar == null ? null : sidecar.getDeviceState();
            if (deviceState == null) {
                deviceState = new SidecarDeviceState();
            }
            WindowLayoutInfo layoutInfo = access$getSidecarAdapter$p.translate(newLayout, deviceState);
            ExtensionInterfaceCompat.ExtensionCallbackInterface access$getExtensionCallback$p = this.this$0.extensionCallback;
            if (access$getExtensionCallback$p != null) {
                access$getExtensionCallback$p.onWindowLayoutChanged(activity, layoutInfo);
            }
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0002\u0010\u0003J\u0018\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0007H\u0016R\u001c\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/window/layout/SidecarCompat$DistinctElementCallback;", "Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;", "callbackInterface", "(Landroidx/window/layout/ExtensionInterfaceCompat$ExtensionCallbackInterface;)V", "activityWindowLayoutInfo", "Ljava/util/WeakHashMap;", "Landroid/app/Activity;", "Landroidx/window/layout/WindowLayoutInfo;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "onWindowLayoutChanged", "", "activity", "newLayout", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: SidecarCompat.kt */
    private static final class DistinctElementCallback implements ExtensionInterfaceCompat.ExtensionCallbackInterface {
        private final WeakHashMap<Activity, WindowLayoutInfo> activityWindowLayoutInfo = new WeakHashMap<>();
        private final ExtensionInterfaceCompat.ExtensionCallbackInterface callbackInterface;
        private final ReentrantLock lock = new ReentrantLock();

        public DistinctElementCallback(ExtensionInterfaceCompat.ExtensionCallbackInterface callbackInterface2) {
            Intrinsics.checkNotNullParameter(callbackInterface2, "callbackInterface");
            this.callbackInterface = callbackInterface2;
        }

        public void onWindowLayoutChanged(Activity activity, WindowLayoutInfo newLayout) {
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(newLayout, "newLayout");
            Lock lock2 = this.lock;
            lock2.lock();
            try {
                if (!Intrinsics.areEqual((Object) newLayout, (Object) this.activityWindowLayoutInfo.get(activity))) {
                    WindowLayoutInfo put = this.activityWindowLayoutInfo.put(activity, newLayout);
                    lock2.unlock();
                    this.callbackInterface.onWindowLayoutChanged(activity, newLayout);
                }
            } finally {
                lock2.unlock();
            }
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0002\u0010\u0005J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0007H\u0016J\u0018\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\rH\u0016R\u000e\u0010\u0004\u001a\u00020\u0001X\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b8\u0002X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Landroidx/window/layout/SidecarCompat$DistinctSidecarElementCallback;", "Landroidx/window/sidecar/SidecarInterface$SidecarCallback;", "sidecarAdapter", "Landroidx/window/layout/SidecarAdapter;", "callbackInterface", "(Landroidx/window/layout/SidecarAdapter;Landroidx/window/sidecar/SidecarInterface$SidecarCallback;)V", "lastDeviceState", "Landroidx/window/sidecar/SidecarDeviceState;", "lock", "Ljava/util/concurrent/locks/ReentrantLock;", "mActivityWindowLayoutInfo", "Ljava/util/WeakHashMap;", "Landroid/os/IBinder;", "Landroidx/window/sidecar/SidecarWindowLayoutInfo;", "onDeviceStateChanged", "", "newDeviceState", "onWindowLayoutChanged", "token", "newLayout", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: SidecarCompat.kt */
    private static final class DistinctSidecarElementCallback implements SidecarInterface.SidecarCallback {
        private final SidecarInterface.SidecarCallback callbackInterface;
        private SidecarDeviceState lastDeviceState;
        private final ReentrantLock lock = new ReentrantLock();
        private final WeakHashMap<IBinder, SidecarWindowLayoutInfo> mActivityWindowLayoutInfo = new WeakHashMap<>();
        private final SidecarAdapter sidecarAdapter;

        public DistinctSidecarElementCallback(SidecarAdapter sidecarAdapter2, SidecarInterface.SidecarCallback callbackInterface2) {
            Intrinsics.checkNotNullParameter(sidecarAdapter2, "sidecarAdapter");
            Intrinsics.checkNotNullParameter(callbackInterface2, "callbackInterface");
            this.sidecarAdapter = sidecarAdapter2;
            this.callbackInterface = callbackInterface2;
        }

        public void onDeviceStateChanged(SidecarDeviceState newDeviceState) {
            Intrinsics.checkNotNullParameter(newDeviceState, "newDeviceState");
            Lock lock2 = this.lock;
            lock2.lock();
            try {
                if (!this.sidecarAdapter.isEqualSidecarDeviceState(this.lastDeviceState, newDeviceState)) {
                    this.lastDeviceState = newDeviceState;
                    this.callbackInterface.onDeviceStateChanged(newDeviceState);
                    Unit unit = Unit.INSTANCE;
                    lock2.unlock();
                }
            } finally {
                lock2.unlock();
            }
        }

        public void onWindowLayoutChanged(IBinder token, SidecarWindowLayoutInfo newLayout) {
            Intrinsics.checkNotNullParameter(token, "token");
            Intrinsics.checkNotNullParameter(newLayout, "newLayout");
            synchronized (this.lock) {
                if (!this.sidecarAdapter.isEqualSidecarWindowLayoutInfo(this.mActivityWindowLayoutInfo.get(token), newLayout)) {
                    SidecarWindowLayoutInfo put = this.mActivityWindowLayoutInfo.put(token, newLayout);
                    this.callbackInterface.onWindowLayoutChanged(token, newLayout);
                }
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0019\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0000¢\u0006\u0002\b\rJ\u0017\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0000¢\u0006\u0002\b\u0012R\u000e\u0010\u0003\u001a\u00020\u0004XT¢\u0006\u0002\n\u0000R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u00068F¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Landroidx/window/layout/SidecarCompat$Companion;", "", "()V", "TAG", "", "sidecarVersion", "Landroidx/window/core/Version;", "getSidecarVersion", "()Landroidx/window/core/Version;", "getActivityWindowToken", "Landroid/os/IBinder;", "activity", "Landroid/app/Activity;", "getActivityWindowToken$window_release", "getSidecarCompat", "Landroidx/window/sidecar/SidecarInterface;", "context", "Landroid/content/Context;", "getSidecarCompat$window_release", "window_release"}, k = 1, mv = {1, 6, 0}, xi = 48)
    /* compiled from: SidecarCompat.kt */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Version getSidecarVersion() {
            try {
                String vendorVersion = SidecarProvider.getApiVersion();
                if (!TextUtils.isEmpty(vendorVersion)) {
                    return Version.Companion.parse(vendorVersion);
                }
                return null;
            } catch (NoClassDefFoundError e) {
                Version version = null;
                return null;
            } catch (UnsupportedOperationException e2) {
                Version version2 = null;
                return null;
            }
        }

        public final SidecarInterface getSidecarCompat$window_release(Context context) {
            Intrinsics.checkNotNullParameter(context, "context");
            return SidecarProvider.getSidecarImpl(context.getApplicationContext());
        }

        public final IBinder getActivityWindowToken$window_release(Activity activity) {
            Window window;
            WindowManager.LayoutParams attributes;
            if (activity == null || (window = activity.getWindow()) == null || (attributes = window.getAttributes()) == null) {
                return null;
            }
            return attributes.token;
        }
    }
}
