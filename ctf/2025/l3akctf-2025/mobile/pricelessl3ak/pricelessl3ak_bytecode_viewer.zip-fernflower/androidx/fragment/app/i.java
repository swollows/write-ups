package androidx.fragment.app;

import android.app.SharedElementCallback;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.S;
import androidx.lifecycle.T;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public abstract class i extends b.l {
   static final String LIFECYCLE_TAG = "android:support:lifecycle";
   boolean mCreated;
   final androidx.lifecycle.w mFragmentLifecycleRegistry;
   final k mFragments;
   boolean mResumed;
   boolean mStopped;

   public i() {
      androidx.appcompat.app.k var1 = (androidx.appcompat.app.k)this;
      this.mFragments = new k(new h(var1));
      this.mFragmentLifecycleRegistry = new androidx.lifecycle.w(this);
      this.mStopped = true;
      this.getSavedStateRegistry().c("android:support:lifecycle", new e(0, var1));
      this.addOnConfigurationChangedListener(new f(var1, 0));
      this.addOnNewIntentListener(new f(var1, 1));
      this.addOnContextAvailableListener(new g(var1));
   }

   public final View dispatchFragmentsOnCreateView(View var1, String var2, Context var3, AttributeSet var4) {
      return this.mFragments.a.c.e.onCreateView(var1, var2, var3, var4);
   }

   public void dump(String var1, FileDescriptor var2, PrintWriter var3, String[] var4) {
      super.dump(var1, var2, var3, var4);
      if (this.shouldDumpInternalState(var4)) {
         var3.print(var1);
         var3.print("Local FragmentActivity ");
         var3.print(Integer.toHexString(System.identityHashCode(this)));
         var3.println(" State:");
         StringBuilder var41 = new StringBuilder();
         var41.append(var1);
         var41.append("  ");
         String var44 = var41.toString();
         var3.print(var44);
         var3.print("mCreated=");
         var3.print(this.mCreated);
         var3.print(" mResumed=");
         var3.print(this.mResumed);
         var3.print(" mStopped=");
         var3.print(this.mStopped);
         if (this.getApplication() != null) {
            m.l var42 = ((O.c)(new S(this.getViewModelStore(), O.c.c)).a(O.c.class)).b;
            if (var42.c > 0) {
               var3.print(var44);
               var3.println("Loaders:");
               if (var42.c > 0) {
                  if (var42.b[0] == null) {
                     var3.print(var44);
                     var3.print("  #");
                     var3.print(var42.a[0]);
                     var3.print(": ");
                     throw null;
                  }

                  throw new ClassCastException();
               }
            }
         }

         u var43 = this.mFragments.a.c;
         var43.getClass();
         StringBuilder var45 = new StringBuilder();
         var45.append(var1);
         var45.append("    ");
         var44 = var45.toString();
         x var8 = var43.c;
         var8.getClass();
         HashMap var9 = var8.b;
         if (!var9.isEmpty()) {
            var3.print(var1);
            var3.println("Active Fragments:");
            Iterator var49 = var9.values().iterator();

            while(var49.hasNext()) {
               P.d.a(var49.next());
               var3.print(var1);
               var3.println("null");
            }
         }

         ArrayList var47 = var8.a;
         int var5 = var47.size();
         byte var6 = 0;
         if (var5 > 0) {
            var3.print(var1);
            var3.println("Added Fragments:");
            if (var5 > 0) {
               if (var47.get(0) == null) {
                  var3.print(var1);
                  var3.print("  #");
                  var3.print(0);
                  var3.print(": ");
                  throw null;
               }

               throw new ClassCastException();
            }
         }

         var47 = var43.d;
         int var7;
         a var48;
         if (var47 != null) {
            var7 = var47.size();
            if (var7 > 0) {
               var3.print(var1);
               var3.println("Back Stack:");

               for(var5 = 0; var5 < var7; ++var5) {
                  var48 = (a)var43.d.get(var5);
                  var3.print(var1);
                  var3.print("  #");
                  var3.print(var5);
                  var3.print(": ");
                  var3.println(var48.toString());
                  var48.b(var44, var3, true);
               }
            }
         }

         var3.print(var1);
         var45 = new StringBuilder("Back Stack Index: ");
         var45.append(var43.h.get());
         var3.println(var45.toString());
         ArrayList var46 = var43.a;
         synchronized(var46){}

         label617: {
            Throwable var10000;
            boolean var10001;
            label618: {
               try {
                  var7 = var43.a.size();
               } catch (Throwable var39) {
                  var10000 = var39;
                  var10001 = false;
                  break label618;
               }

               if (var7 > 0) {
                  try {
                     var3.print(var1);
                     var3.println("Pending Actions:");
                  } catch (Throwable var38) {
                     var10000 = var38;
                     var10001 = false;
                     break label618;
                  }

                  for(var5 = var6; var5 < var7; ++var5) {
                     try {
                        var48 = (a)var43.a.get(var5);
                        var3.print(var1);
                        var3.print("  #");
                        var3.print(var5);
                        var3.print(": ");
                        var3.println(var48);
                     } catch (Throwable var37) {
                        var10000 = var37;
                        var10001 = false;
                        break label618;
                     }
                  }
               }

               label578:
               try {
                  break label617;
               } catch (Throwable var36) {
                  var10000 = var36;
                  var10001 = false;
                  break label578;
               }
            }

            while(true) {
               Throwable var40 = var10000;

               try {
                  throw var40;
               } catch (Throwable var35) {
                  var10000 = var35;
                  var10001 = false;
                  continue;
               }
            }
         }

         var3.print(var1);
         var3.println("FragmentManager misc state:");
         var3.print(var1);
         var3.print("  mHost=");
         var3.println(var43.r);
         var3.print(var1);
         var3.print("  mContainer=");
         var3.println(var43.s);
         var3.print(var1);
         var3.print("  mCurState=");
         var3.print(var43.q);
         var3.print(" mStateSaved=");
         var3.print(var43.y);
         var3.print(" mStopped=");
         var3.print(var43.z);
         var3.print(" mDestroyed=");
         var3.println(var43.A);
      }
   }

   public t getSupportFragmentManager() {
      return this.mFragments.a.c;
   }

   @Deprecated
   public O.a getSupportLoaderManager() {
      return new O.d(this, this.getViewModelStore());
   }

   public void markFragmentsCreated() {
      Iterator var1 = this.getSupportFragmentManager().c.c().iterator();

      do {
         if (!var1.hasNext()) {
            return;
         }
      } while(var1.next() == null);

      throw new ClassCastException();
   }

   public void onActivityResult(int var1, int var2, Intent var3) {
      this.mFragments.a();
      super.onActivityResult(var1, var2, var3);
   }

   @Deprecated
   public void onAttachFragment(d var1) {
   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      this.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_CREATE);
      u var2 = this.mFragments.a.c;
      var2.y = false;
      var2.z = false;
      var2.E.getClass();
      var2.c(1);
   }

   public View onCreateView(View var1, String var2, Context var3, AttributeSet var4) {
      View var5 = this.dispatchFragmentsOnCreateView(var1, var2, var3, var4);
      return var5 == null ? super.onCreateView(var1, var2, var3, var4) : var5;
   }

   public View onCreateView(String var1, Context var2, AttributeSet var3) {
      View var4 = this.dispatchFragmentsOnCreateView((View)null, var1, var2, var3);
      return var4 == null ? super.onCreateView(var1, var2, var3) : var4;
   }

   public void onDestroy() {
      super.onDestroy();
      u var2 = this.mFragments.a.c;
      boolean var1 = true;
      var2.A = true;
      var2.e(true);
      Iterator var3 = var2.b().iterator();
      if (!var3.hasNext()) {
         h var4 = var2.r;
         x var11 = var2.c;
         if (var4 != null) {
            var1 = var11.d.e;
         } else {
            i var13 = var4.a;
            if (var13 != null) {
               var1 = true ^ var13.isChangingConfigurations();
            }
         }

         if (var1) {
            Iterator var5 = var2.i.values().iterator();

            while(var5.hasNext()) {
               Iterator var14 = ((BackStackState)var5.next()).a.iterator();

               while(var14.hasNext()) {
                  String var6 = (String)var14.next();
                  w var7 = var11.d;
                  var7.getClass();
                  if (Log.isLoggable("FragmentManager", 3)) {
                     StringBuilder var8 = new StringBuilder("Clearing non-config state for saved state of Fragment ");
                     var8.append(var6);
                     Log.d("FragmentManager", var8.toString());
                  }

                  HashMap var9 = var7.c;
                  w var17 = (w)var9.get(var6);
                  if (var17 != null) {
                     var17.b();
                     var9.remove(var6);
                  }

                  HashMap var16 = var7.d;
                  T var18 = (T)var16.get(var6);
                  if (var18 != null) {
                     var18.a();
                     var16.remove(var6);
                  }
               }
            }
         }

         var2.c(-1);
         h var12 = var2.r;
         if (var12 != null) {
            var12.d.removeOnTrimMemoryListener(var2.m);
         }

         var12 = var2.r;
         if (var12 != null) {
            var12.d.removeOnConfigurationChangedListener(var2.l);
         }

         var12 = var2.r;
         if (var12 != null) {
            var12.d.removeOnMultiWindowModeChangedListener(var2.n);
         }

         var12 = var2.r;
         if (var12 != null) {
            var12.d.removeOnPictureInPictureModeChangedListener(var2.o);
         }

         var12 = var2.r;
         if (var12 != null) {
            var12.d.removeMenuProvider(var2.p);
         }

         var2.r = null;
         var2.s = null;
         if (var2.f != null) {
            var3 = var2.g.b.iterator();

            while(var3.hasNext()) {
               ((b.b)var3.next()).cancel();
            }

            var2.f = null;
         }

         d.h var15 = var2.u;
         if (var15 != null) {
            var15.a.d(var15.b);
            var15 = var2.v;
            var15.a.d(var15.b);
            d.h var10 = var2.w;
            var10.a.d(var10.b);
         }

         this.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_DESTROY);
      } else {
         ((A)var3.next()).a();
         throw null;
      }
   }

   public boolean onMenuItemSelected(int var1, MenuItem var2) {
      if (super.onMenuItemSelected(var1, var2)) {
         return true;
      } else {
         if (var1 == 6) {
            u var3 = this.mFragments.a.c;
            if (var3.q >= 1) {
               Iterator var4 = var3.c.c().iterator();

               while(var4.hasNext()) {
                  if (var4.next() != null) {
                     throw new ClassCastException();
                  }
               }
            }
         }

         return false;
      }
   }

   public void onPause() {
      super.onPause();
      this.mResumed = false;
      this.mFragments.a.c.c(5);
      this.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_PAUSE);
   }

   public void onPostResume() {
      super.onPostResume();
      this.onResumeFragments();
   }

   public void onRequestPermissionsResult(int var1, String[] var2, int[] var3) {
      this.mFragments.a();
      super.onRequestPermissionsResult(var1, var2, var3);
   }

   public void onResume() {
      this.mFragments.a();
      super.onResume();
      this.mResumed = true;
      this.mFragments.a.c.e(true);
   }

   public void onResumeFragments() {
      this.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_RESUME);
      u var1 = this.mFragments.a.c;
      var1.y = false;
      var1.z = false;
      var1.E.getClass();
      var1.c(7);
   }

   public void onStart() {
      this.mFragments.a();
      super.onStart();
      this.mStopped = false;
      u var1;
      if (!this.mCreated) {
         this.mCreated = true;
         var1 = this.mFragments.a.c;
         var1.y = false;
         var1.z = false;
         var1.E.getClass();
         var1.c(4);
      }

      this.mFragments.a.c.e(true);
      this.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_START);
      var1 = this.mFragments.a.c;
      var1.y = false;
      var1.z = false;
      var1.E.getClass();
      var1.c(5);
   }

   public void onStateNotSaved() {
      this.mFragments.a();
   }

   public void onStop() {
      super.onStop();
      this.mStopped = true;
      this.markFragmentsCreated();
      u var1 = this.mFragments.a.c;
      var1.z = true;
      var1.E.getClass();
      var1.c(4);
      this.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_STOP);
   }

   public void setEnterSharedElementCallback(t.i var1) {
      this.setEnterSharedElementCallback((SharedElementCallback)null);
   }

   public void setExitSharedElementCallback(t.i var1) {
      this.setExitSharedElementCallback((SharedElementCallback)null);
   }

   public void startActivityFromFragment(d var1, Intent var2, int var3) {
      this.startActivityFromFragment(var1, var2, var3, (Bundle)null);
   }

   public void startActivityFromFragment(d var1, Intent var2, int var3, Bundle var4) {
      if (var3 == -1) {
         this.startActivityForResult(var2, -1, var4);
      } else {
         throw null;
      }
   }

   @Deprecated
   public void startIntentSenderFromFragment(d var1, IntentSender var2, int var3, Intent var4, int var5, int var6, int var7, Bundle var8) {
      if (var3 == -1) {
         this.startIntentSenderForResult(var2, var3, var4, var5, var6, var7, var8);
      } else {
         throw null;
      }
   }

   public void supportFinishAfterTransition() {
      this.finishAfterTransition();
   }

   public void supportPostponeEnterTransition() {
      this.postponeEnterTransition();
   }

   public void supportStartPostponedEnterTransition() {
      this.startPostponedEnterTransition();
   }

   @Deprecated
   public final void validateRequestPermissionsRequestCode(int var1) {
   }
}
