package t;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;

public final class a implements Application.ActivityLifecycleCallbacks {
   public Object a;
   public Activity b;
   public final int c;
   public boolean d = false;
   public boolean e = false;
   public boolean f = false;

   public a(Activity var1) {
      this.b = var1;
      this.c = var1.hashCode();
   }

   public final void onActivityCreated(Activity var1, Bundle var2) {
   }

   public final void onActivityDestroyed(Activity var1) {
      if (this.b == var1) {
         this.b = null;
         this.e = true;
      }

   }

   public final void onActivityPaused(Activity var1) {
      if (this.e && !this.f && !this.d) {
         Object var4 = this.a;

         label177: {
            Throwable var10000;
            label169: {
               Object var3;
               boolean var10001;
               try {
                  var3 = t.b.c.get(var1);
               } catch (Throwable var17) {
                  var10000 = var17;
                  var10001 = false;
                  break label169;
               }

               if (var3 != var4) {
                  return;
               }

               int var2;
               try {
                  var2 = var1.hashCode();
               } catch (Throwable var16) {
                  var10000 = var16;
                  var10001 = false;
                  break label169;
               }

               if (var2 != this.c) {
                  return;
               }

               label152:
               try {
                  var4 = t.b.b.get(var1);
                  Handler var5 = t.b.g;
                  A.a var19 = new A.a(var4, var3, 4);
                  var5.postAtFrontOfQueue(var19);
                  break label177;
               } catch (Throwable var15) {
                  var10000 = var15;
                  var10001 = false;
                  break label152;
               }
            }

            Throwable var18 = var10000;
            Log.e("ActivityRecreator", "Exception while fetching field values", var18);
            return;
         }

         this.f = true;
         this.a = null;
      }

   }

   public final void onActivityResumed(Activity var1) {
   }

   public final void onActivitySaveInstanceState(Activity var1, Bundle var2) {
   }

   public final void onActivityStarted(Activity var1) {
      if (this.b == var1) {
         this.d = true;
      }

   }

   public final void onActivityStopped(Activity var1) {
   }
}
