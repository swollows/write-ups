package androidx.core.app;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import androidx.core.view.accessibility.AccessibilityEventCompat;
import java.io.Closeable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.CountDownLatch;

public final class PendingIntentCompat {

    @Retention(RetentionPolicy.SOURCE)
    public @interface Flags {
    }

    public static PendingIntent getActivities(Context context, int requestCode, Intent[] intents, int flags, Bundle options, boolean isMutable) {
        return PendingIntent.getActivities(context, requestCode, intents, addMutabilityFlags(isMutable, flags), options);
    }

    public static PendingIntent getActivities(Context context, int requestCode, Intent[] intents, int flags, boolean isMutable) {
        return PendingIntent.getActivities(context, requestCode, intents, addMutabilityFlags(isMutable, flags));
    }

    public static PendingIntent getActivity(Context context, int requestCode, Intent intent, int flags, boolean isMutable) {
        return PendingIntent.getActivity(context, requestCode, intent, addMutabilityFlags(isMutable, flags));
    }

    public static PendingIntent getActivity(Context context, int requestCode, Intent intent, int flags, Bundle options, boolean isMutable) {
        return PendingIntent.getActivity(context, requestCode, intent, addMutabilityFlags(isMutable, flags), options);
    }

    public static PendingIntent getBroadcast(Context context, int requestCode, Intent intent, int flags, boolean isMutable) {
        return PendingIntent.getBroadcast(context, requestCode, intent, addMutabilityFlags(isMutable, flags));
    }

    public static PendingIntent getForegroundService(Context context, int requestCode, Intent intent, int flags, boolean isMutable) {
        return Api26Impl.getForegroundService(context, requestCode, intent, addMutabilityFlags(isMutable, flags));
    }

    public static PendingIntent getService(Context context, int requestCode, Intent intent, int flags, boolean isMutable) {
        return PendingIntent.getService(context, requestCode, intent, addMutabilityFlags(isMutable, flags));
    }

    public static void send(PendingIntent pendingIntent, int code, PendingIntent.OnFinished onFinished, Handler handler) throws PendingIntent.CanceledException {
        GatedCallback gatedCallback = new GatedCallback(onFinished);
        try {
            pendingIntent.send(code, gatedCallback.getCallback(), handler);
            gatedCallback.complete();
            gatedCallback.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    public static void send(PendingIntent pendingIntent, Context context, int code, Intent intent, PendingIntent.OnFinished onFinished, Handler handler) throws PendingIntent.CanceledException {
        send(pendingIntent, context, code, intent, onFinished, handler, (String) null, (Bundle) null);
    }

    public static void send(PendingIntent pendingIntent, Context context, int code, Intent intent, PendingIntent.OnFinished onFinished, Handler handler, String requiredPermissions, Bundle options) throws PendingIntent.CanceledException {
        GatedCallback gatedCallback = new GatedCallback(onFinished);
        try {
            Api23Impl.send(pendingIntent, context, code, intent, onFinished, handler, requiredPermissions, options);
            gatedCallback.complete();
            gatedCallback.close();
            return;
        } catch (Throwable th) {
            th.addSuppressed(th);
        }
        throw th;
    }

    private static int addMutabilityFlags(boolean isMutable, int flags) {
        if (!isMutable) {
            return flags | AccessibilityEventCompat.TYPE_VIEW_TARGETED_BY_SCROLL;
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return flags | 33554432;
        }
        return flags;
    }

    private PendingIntentCompat() {
    }

    private static class Api23Impl {
        private Api23Impl() {
        }

        public static void send(PendingIntent pendingIntent, Context context, int code, Intent intent, PendingIntent.OnFinished onFinished, Handler handler, String requiredPermission, Bundle options) throws PendingIntent.CanceledException {
            pendingIntent.send(context, code, intent, onFinished, handler, requiredPermission, options);
        }
    }

    private static class Api26Impl {
        private Api26Impl() {
        }

        public static PendingIntent getForegroundService(Context context, int requestCode, Intent intent, int flags) {
            return PendingIntent.getForegroundService(context, requestCode, intent, flags);
        }
    }

    private static class GatedCallback implements Closeable {
        private PendingIntent.OnFinished mCallback;
        private final CountDownLatch mComplete = new CountDownLatch(1);
        private boolean mSuccess;

        GatedCallback(PendingIntent.OnFinished callback) {
            this.mCallback = callback;
            this.mSuccess = false;
        }

        public PendingIntent.OnFinished getCallback() {
            if (this.mCallback == null) {
                return null;
            }
            return new PendingIntentCompat$GatedCallback$$ExternalSyntheticLambda0(this);
        }

        public void complete() {
            this.mSuccess = true;
        }

        public void close() {
            if (!this.mSuccess) {
                this.mCallback = null;
            }
            this.mComplete.countDown();
        }

        /* access modifiers changed from: private */
        public void onSendFinished(PendingIntent pendingIntent, Intent intent, int resultCode, String resultData, Bundle resultExtras) {
            boolean interrupted = false;
            while (true) {
                try {
                    this.mComplete.await();
                    break;
                } catch (InterruptedException e) {
                    interrupted = true;
                } catch (Throwable th) {
                    if (interrupted) {
                        Thread.currentThread().interrupt();
                    }
                    throw th;
                }
            }
            if (interrupted) {
                Thread.currentThread().interrupt();
            }
            if (this.mCallback != null) {
                this.mCallback.onSendFinished(pendingIntent, intent, resultCode, resultData, resultExtras);
                this.mCallback = null;
            }
        }
    }
}
