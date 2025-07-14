package androidx.lifecycle;

import D.c0;
import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

public final class E$a implements Application.ActivityLifecycleCallbacks {
   public static final D Companion = new Object();

   public static final void registerIn(Activity var0) {
      Companion.getClass();
      i0.d.e(var0, "activity");
      c0.g(var0, new E$a());
   }

   public void onActivityCreated(Activity var1, Bundle var2) {
      i0.d.e(var1, "activity");
   }

   public void onActivityDestroyed(Activity var1) {
      i0.d.e(var1, "activity");
   }

   public void onActivityPaused(Activity var1) {
      i0.d.e(var1, "activity");
   }

   public void onActivityPostCreated(Activity var1, Bundle var2) {
      i0.d.e(var1, "activity");
      int var3 = E.b;
      C.a(var1, n.ON_CREATE);
   }

   public void onActivityPostResumed(Activity var1) {
      i0.d.e(var1, "activity");
      int var2 = E.b;
      C.a(var1, n.ON_RESUME);
   }

   public void onActivityPostStarted(Activity var1) {
      i0.d.e(var1, "activity");
      int var2 = E.b;
      C.a(var1, n.ON_START);
   }

   public void onActivityPreDestroyed(Activity var1) {
      i0.d.e(var1, "activity");
      int var2 = E.b;
      C.a(var1, n.ON_DESTROY);
   }

   public void onActivityPrePaused(Activity var1) {
      i0.d.e(var1, "activity");
      int var2 = E.b;
      C.a(var1, n.ON_PAUSE);
   }

   public void onActivityPreStopped(Activity var1) {
      i0.d.e(var1, "activity");
      int var2 = E.b;
      C.a(var1, n.ON_STOP);
   }

   public void onActivityResumed(Activity var1) {
      i0.d.e(var1, "activity");
   }

   public void onActivitySaveInstanceState(Activity var1, Bundle var2) {
      i0.d.e(var1, "activity");
      i0.d.e(var2, "bundle");
   }

   public void onActivityStarted(Activity var1) {
      i0.d.e(var1, "activity");
   }

   public void onActivityStopped(Activity var1) {
      i0.d.e(var1, "activity");
   }
}
