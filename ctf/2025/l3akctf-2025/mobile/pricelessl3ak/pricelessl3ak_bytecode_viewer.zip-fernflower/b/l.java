package b;

import D.z;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.lifecycle.C;
import androidx.lifecycle.E;
import androidx.lifecycle.I;
import androidx.lifecycle.J;
import androidx.lifecycle.O;
import androidx.lifecycle.P;
import androidx.lifecycle.T;
import androidx.lifecycle.U;
import androidx.lifecycle.u;
import androidx.lifecycle.w;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class l extends t.f implements U, androidx.lifecycle.j, Q.h {
   private static final String ACTIVITY_RESULT_TAG = "android:support:activity-result";
   private static final f Companion = new Object();
   private T _viewModelStore;
   private final d.i activityResultRegistry;
   private int contentLayoutId;
   private final c.a contextAwareHelper = new c.a();
   private final Y.b defaultViewModelProviderFactory$delegate;
   private boolean dispatchingOnMultiWindowModeChanged;
   private boolean dispatchingOnPictureInPictureModeChanged;
   private final Y.b fullyDrawnReporter$delegate;
   private final D.p menuHostHelper;
   private final AtomicInteger nextLocalRequestCode;
   private final Y.b onBackPressedDispatcher$delegate;
   private final CopyOnWriteArrayList onConfigurationChangedListeners;
   private final CopyOnWriteArrayList onMultiWindowModeChangedListeners;
   private final CopyOnWriteArrayList onNewIntentListeners;
   private final CopyOnWriteArrayList onPictureInPictureModeChangedListeners;
   private final CopyOnWriteArrayList onTrimMemoryListeners;
   private final CopyOnWriteArrayList onUserLeaveHintListeners;
   private final h reportFullyDrawnExecutor;
   private final Q.g savedStateRegistryController;

   public l() {
      androidx.fragment.app.i var1 = (androidx.fragment.app.i)this;
      this.menuHostHelper = new D.p(new c(var1, 0));
      R.a var2 = new R.a(this, new Q.f(this, 0));
      this.savedStateRegistryController = new Q.g(var2);
      this.reportFullyDrawnExecutor = new i(var1);
      this.fullyDrawnReporter$delegate = new Y.e(new k(var1, 2));
      this.nextLocalRequestCode = new AtomicInteger();
      this.activityResultRegistry = new d.i();
      this.onConfigurationChangedListeners = new CopyOnWriteArrayList();
      this.onTrimMemoryListeners = new CopyOnWriteArrayList();
      this.onNewIntentListeners = new CopyOnWriteArrayList();
      this.onMultiWindowModeChangedListeners = new CopyOnWriteArrayList();
      this.onPictureInPictureModeChangedListeners = new CopyOnWriteArrayList();
      this.onUserLeaveHintListeners = new CopyOnWriteArrayList();
      if (this.getLifecycle() != null) {
         this.getLifecycle().a(new d(0, var1));
         this.getLifecycle().a(new d(1, var1));
         this.getLifecycle().a(new Q.b(var1, 1));
         var2.a();
         androidx.lifecycle.o var3 = ((w)this.getLifecycle()).c;
         if (var3 != androidx.lifecycle.o.b && var3 != androidx.lifecycle.o.c) {
            throw new IllegalArgumentException("Failed requirement.");
         } else {
            if (this.getSavedStateRegistry().b() == null) {
               J var4 = new J(this.getSavedStateRegistry(), this);
               this.getSavedStateRegistry().c("androidx.lifecycle.internal.SavedStateHandlesProvider", var4);
               this.getLifecycle().a(new androidx.lifecycle.e(1, var4));
            }

            this.getSavedStateRegistry().c("android:support:activity-result", new L.a(1, var1));
            this.addOnContextAvailableListener(new e(var1));
            this.defaultViewModelProviderFactory$delegate = new Y.e(new k(var1, 0));
            this.onBackPressedDispatcher$delegate = new Y.e(new k(var1, 3));
         }
      } else {
         throw new IllegalStateException("getLifecycle() returned null in ComponentActivity's constructor. Please make sure you are lazily constructing your Lifecycle in the first call to getLifecycle() rather than relying on field initialization.");
      }
   }

   public static void a(androidx.fragment.app.i var0, l var1) {
      i0.d.e(var1, "it");
      Bundle var7 = var0.getSavedStateRegistry().a("android:support:activity-result");
      if (var7 != null) {
         d.i var14 = var0.activityResultRegistry;
         var14.getClass();
         ArrayList var6 = var7.getIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS");
         ArrayList var12 = var7.getStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS");
         if (var12 != null && var6 != null) {
            ArrayList var8 = var7.getStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS");
            if (var8 != null) {
               var14.d.addAll(var8);
            }

            Bundle var17 = var7.getBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT");
            var7 = var14.g;
            if (var17 != null) {
               var7.putAll(var17);
            }

            int var3 = var12.size();

            for(int var2 = 0; var2 < var3; ++var2) {
               String var11 = (String)var12.get(var2);
               LinkedHashMap var18 = var14.b;
               boolean var5 = var18.containsKey(var11);
               LinkedHashMap var9 = var14.a;
               if (var5) {
                  Integer var10 = (Integer)var18.remove(var11);
                  if (!var7.containsKey(var11)) {
                     if (var9 instanceof j0.a && !(var9 instanceof j0.b)) {
                        String var13;
                        if (var9 == null) {
                           var13 = "null";
                        } else {
                           var13 = var9.getClass().getName();
                        }

                        StringBuilder var15 = new StringBuilder();
                        var15.append(var13);
                        var15.append(" cannot be cast to ");
                        var15.append("kotlin.collections.MutableMap");
                        ClassCastException var16 = new ClassCastException(var15.toString());
                        i0.d.f(var16, i0.i.class.getName());
                        throw var16;
                     }

                     var9.remove(var10);
                  }
               }

               Object var19 = var6.get(var2);
               i0.d.d(var19, "rcs[i]");
               int var4 = ((Number)var19).intValue();
               var19 = var12.get(var2);
               i0.d.d(var19, "keys[i]");
               String var20 = (String)var19;
               var9.put(var4, var20);
               var18.put(var20, var4);
            }
         }
      }

   }

   public static final void access$addObserverForBackInvoker(l var0, t var1) {
      var0.getLifecycle().a(new D.n(var1, var0, 1));
   }

   public static final void access$ensureViewModelStore(l var0) {
      if (var0._viewModelStore == null) {
         g var1 = (g)var0.getLastNonConfigurationInstance();
         if (var1 != null) {
            var0._viewModelStore = var1.b;
         }

         if (var0._viewModelStore == null) {
            var0._viewModelStore = new T();
         }
      }

   }

   // $FF: synthetic method
   public static final h access$getReportFullyDrawnExecutor$p(l var0) {
      return var0.reportFullyDrawnExecutor;
   }

   // $FF: synthetic method
   public static final void access$onBackPressed$s1027565324(l var0) {
      var0.onBackPressed();
   }

   public static void b(androidx.fragment.app.i var0, u var1, androidx.lifecycle.n var2) {
      if (var2 == androidx.lifecycle.n.ON_DESTROY) {
         var0.contextAwareHelper.b = null;
         if (!var0.isChangingConfigurations()) {
            var0.getViewModelStore().a();
         }

         i var3 = (i)var0.reportFullyDrawnExecutor;
         androidx.fragment.app.i var4 = var3.d;
         var4.getWindow().getDecorView().removeCallbacks(var3);
         var4.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener(var3);
      }

   }

   public static Bundle c(androidx.fragment.app.i var0) {
      Bundle var1 = new Bundle();
      d.i var3 = var0.activityResultRegistry;
      var3.getClass();
      LinkedHashMap var2 = var3.b;
      var1.putIntegerArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_RCS", new ArrayList(var2.values()));
      var1.putStringArrayList("KEY_COMPONENT_ACTIVITY_REGISTERED_KEYS", new ArrayList(var2.keySet()));
      var1.putStringArrayList("KEY_COMPONENT_ACTIVITY_LAUNCHED_KEYS", new ArrayList(var3.d));
      var1.putBundle("KEY_COMPONENT_ACTIVITY_PENDING_RESULT", new Bundle(var3.g));
      return var1;
   }

   // $FF: synthetic method
   public static void getOnBackPressedDispatcher$annotations() {
   }

   public void addMenuProvider(D.r var1) {
      i0.d.e(var1, "provider");
      D.p var2 = this.menuHostHelper;
      var2.b.add(var1);
      var2.a.run();
   }

   public void addMenuProvider(D.r var1, u var2) {
      i0.d.e(var1, "provider");
      i0.d.e(var2, "owner");
      D.p var3 = this.menuHostHelper;
      var3.b.add(var1);
      var3.a.run();
      androidx.lifecycle.p var5 = var2.getLifecycle();
      HashMap var4 = var3.c;
      D.o var6 = (D.o)var4.remove(var1);
      if (var6 != null) {
         var6.a.b(var6.b);
         var6.b = null;
      }

      var4.put(var1, new D.o(var5, new D.n(var3, var1, 0)));
   }

   public void addMenuProvider(D.r var1, u var2, androidx.lifecycle.o var3) {
      i0.d.e(var1, "provider");
      i0.d.e(var2, "owner");
      i0.d.e(var3, "state");
      D.p var4 = this.menuHostHelper;
      var4.getClass();
      androidx.lifecycle.p var5 = var2.getLifecycle();
      HashMap var6 = var4.c;
      D.o var7 = (D.o)var6.remove(var1);
      if (var7 != null) {
         var7.a.b(var7.b);
         var7.b = null;
      }

      var6.put(var1, new D.o(var5, new D.m(var4, var3, var1)));
   }

   public final void addOnConfigurationChangedListener(C.a var1) {
      i0.d.e(var1, "listener");
      this.onConfigurationChangedListeners.add(var1);
   }

   public final void addOnContextAvailableListener(c.b var1) {
      i0.d.e(var1, "listener");
      c.a var2 = this.contextAwareHelper;
      var2.getClass();
      l var3 = var2.b;
      if (var3 != null) {
         var1.a(var3);
      }

      var2.a.add(var1);
   }

   public final void addOnMultiWindowModeChangedListener(C.a var1) {
      i0.d.e(var1, "listener");
      this.onMultiWindowModeChangedListeners.add(var1);
   }

   public final void addOnNewIntentListener(C.a var1) {
      i0.d.e(var1, "listener");
      this.onNewIntentListeners.add(var1);
   }

   public final void addOnPictureInPictureModeChangedListener(C.a var1) {
      i0.d.e(var1, "listener");
      this.onPictureInPictureModeChangedListeners.add(var1);
   }

   public final void addOnTrimMemoryListener(C.a var1) {
      i0.d.e(var1, "listener");
      this.onTrimMemoryListeners.add(var1);
   }

   public final void addOnUserLeaveHintListener(Runnable var1) {
      i0.d.e(var1, "listener");
      this.onUserLeaveHintListeners.add(var1);
   }

   public final d.i getActivityResultRegistry() {
      return this.activityResultRegistry;
   }

   public M.b getDefaultViewModelCreationExtras() {
      M.c var3 = new M.c(M.a.b);
      Application var1 = this.getApplication();
      LinkedHashMap var2 = var3.a;
      if (var1 != null) {
         z var5 = O.d;
         Application var4 = this.getApplication();
         i0.d.d(var4, "application");
         var2.put(var5, var4);
      }

      var2.put(I.a, this);
      var2.put(I.b, this);
      Intent var6 = this.getIntent();
      Bundle var7;
      if (var6 != null) {
         var7 = var6.getExtras();
      } else {
         var7 = null;
      }

      if (var7 != null) {
         var2.put(I.c, var7);
      }

      return var3;
   }

   public P getDefaultViewModelProviderFactory() {
      return (P)((Y.e)this.defaultViewModelProviderFactory$delegate).a();
   }

   public m getFullyDrawnReporter() {
      return (m)((Y.e)this.fullyDrawnReporter$delegate).a();
   }

   public Object getLastCustomNonConfigurationInstance() {
      g var1 = (g)this.getLastNonConfigurationInstance();
      Object var2;
      if (var1 != null) {
         var2 = var1.a;
      } else {
         var2 = null;
      }

      return var2;
   }

   public androidx.lifecycle.p getLifecycle() {
      return super.getLifecycle();
   }

   public final t getOnBackPressedDispatcher() {
      return (t)((Y.e)this.onBackPressedDispatcher$delegate).a();
   }

   public final Q.e getSavedStateRegistry() {
      return this.savedStateRegistryController.b;
   }

   public T getViewModelStore() {
      if (this.getApplication() != null) {
         if (this._viewModelStore == null) {
            g var1 = (g)this.getLastNonConfigurationInstance();
            if (var1 != null) {
               this._viewModelStore = var1.b;
            }

            if (this._viewModelStore == null) {
               this._viewModelStore = new T();
            }
         }

         T var2 = this._viewModelStore;
         i0.d.b(var2);
         return var2;
      } else {
         throw new IllegalStateException("Your activity is not yet attached to the Application instance. You can't request ViewModel before onCreate call.");
      }
   }

   public void initializeViewTreeOwners() {
      View var1 = this.getWindow().getDecorView();
      i0.d.d(var1, "window.decorView");
      var1.setTag(2131230907, this);
      var1 = this.getWindow().getDecorView();
      i0.d.d(var1, "window.decorView");
      var1.setTag(2131230910, this);
      var1 = this.getWindow().getDecorView();
      i0.d.d(var1, "window.decorView");
      var1.setTag(2131230909, this);
      var1 = this.getWindow().getDecorView();
      i0.d.d(var1, "window.decorView");
      var1.setTag(2131230908, this);
      var1 = this.getWindow().getDecorView();
      i0.d.d(var1, "window.decorView");
      var1.setTag(2131230845, this);
   }

   public void invalidateMenu() {
      this.invalidateOptionsMenu();
   }

   public void onActivityResult(int var1, int var2, Intent var3) {
      if (!this.activityResultRegistry.a(var1, var2, var3)) {
         super.onActivityResult(var1, var2, var3);
      }

   }

   public void onBackPressed() {
      this.getOnBackPressedDispatcher().b();
   }

   public void onConfigurationChanged(Configuration var1) {
      i0.d.e(var1, "newConfig");
      super.onConfigurationChanged(var1);
      Iterator var2 = this.onConfigurationChangedListeners.iterator();

      while(var2.hasNext()) {
         ((C.a)var2.next()).a(var1);
      }

   }

   public void onCreate(Bundle var1) {
      this.savedStateRegistryController.a(var1);
      c.a var3 = this.contextAwareHelper;
      var3.getClass();
      var3.b = this;
      Iterator var4 = var3.a.iterator();

      while(var4.hasNext()) {
         ((c.b)var4.next()).a(this);
      }

      super.onCreate(var1);
      int var2 = E.b;
      C.b(this);
      var2 = this.contentLayoutId;
      if (var2 != 0) {
         this.setContentView(var2);
      }

   }

   public boolean onCreatePanelMenu(int var1, Menu var2) {
      i0.d.e(var2, "menu");
      if (var1 == 0) {
         super.onCreatePanelMenu(var1, var2);
         D.p var3 = this.menuHostHelper;
         this.getMenuInflater();
         var3.a();
      }

      return true;
   }

   public boolean onMenuItemSelected(int var1, MenuItem var2) {
      i0.d.e(var2, "item");
      if (super.onMenuItemSelected(var1, var2)) {
         return true;
      } else {
         if (var1 == 0) {
            this.menuHostHelper.b();
         }

         return false;
      }
   }

   public void onMultiWindowModeChanged(boolean var1) {
      if (!this.dispatchingOnMultiWindowModeChanged) {
         Iterator var2 = this.onMultiWindowModeChangedListeners.iterator();

         while(var2.hasNext()) {
            ((C.a)var2.next()).a(new t.g(var1));
         }

      }
   }

   public void onMultiWindowModeChanged(boolean var1, Configuration var2) {
      i0.d.e(var2, "newConfig");
      this.dispatchingOnMultiWindowModeChanged = true;

      try {
         super.onMultiWindowModeChanged(var1, var2);
      } finally {
         this.dispatchingOnMultiWindowModeChanged = false;
      }

      Iterator var5 = this.onMultiWindowModeChangedListeners.iterator();

      while(var5.hasNext()) {
         ((C.a)var5.next()).a(new t.g(var1));
      }

   }

   public void onNewIntent(Intent var1) {
      i0.d.e(var1, "intent");
      super.onNewIntent(var1);
      Iterator var2 = this.onNewIntentListeners.iterator();

      while(var2.hasNext()) {
         ((C.a)var2.next()).a(var1);
      }

   }

   public void onPanelClosed(int var1, Menu var2) {
      i0.d.e(var2, "menu");
      Iterator var3 = this.menuHostHelper.b.iterator();

      while(true) {
         androidx.fragment.app.t var4;
         do {
            if (!var3.hasNext()) {
               super.onPanelClosed(var1, var2);
               return;
            }

            var4 = ((androidx.fragment.app.p)((D.r)var3.next())).a;
         } while(var4.q < 1);

         Iterator var5 = var4.c.c().iterator();

         while(var5.hasNext()) {
            if (var5.next() != null) {
               throw new ClassCastException();
            }
         }
      }
   }

   public void onPictureInPictureModeChanged(boolean var1) {
      if (!this.dispatchingOnPictureInPictureModeChanged) {
         Iterator var2 = this.onPictureInPictureModeChangedListeners.iterator();

         while(var2.hasNext()) {
            ((C.a)var2.next()).a(new t.h(var1));
         }

      }
   }

   public void onPictureInPictureModeChanged(boolean var1, Configuration var2) {
      i0.d.e(var2, "newConfig");
      this.dispatchingOnPictureInPictureModeChanged = true;

      try {
         super.onPictureInPictureModeChanged(var1, var2);
      } finally {
         this.dispatchingOnPictureInPictureModeChanged = false;
      }

      Iterator var5 = this.onPictureInPictureModeChangedListeners.iterator();

      while(var5.hasNext()) {
         ((C.a)var5.next()).a(new t.h(var1));
      }

   }

   public boolean onPreparePanel(int var1, View var2, Menu var3) {
      i0.d.e(var3, "menu");
      if (var1 == 0) {
         super.onPreparePanel(var1, var2, var3);
         this.menuHostHelper.c();
      }

      return true;
   }

   public void onRequestPermissionsResult(int var1, String[] var2, int[] var3) {
      i0.d.e(var2, "permissions");
      i0.d.e(var3, "grantResults");
      if (!this.activityResultRegistry.a(var1, -1, (new Intent()).putExtra("androidx.activity.result.contract.extra.PERMISSIONS", var2).putExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS", var3))) {
         super.onRequestPermissionsResult(var1, var2, var3);
      }

   }

   public Object onRetainCustomNonConfigurationInstance() {
      return null;
   }

   public final Object onRetainNonConfigurationInstance() {
      Object var3 = this.onRetainCustomNonConfigurationInstance();
      T var2 = this._viewModelStore;
      T var1 = var2;
      if (var2 == null) {
         g var4 = (g)this.getLastNonConfigurationInstance();
         var1 = var2;
         if (var4 != null) {
            var1 = var4.b;
         }
      }

      if (var1 == null && var3 == null) {
         return null;
      } else {
         Object var5 = new Object();
         ((g)var5).a = var3;
         ((g)var5).b = var1;
         return var5;
      }
   }

   public void onSaveInstanceState(Bundle var1) {
      i0.d.e(var1, "outState");
      if (this.getLifecycle() instanceof w) {
         androidx.lifecycle.p var2 = this.getLifecycle();
         i0.d.c(var2, "null cannot be cast to non-null type androidx.lifecycle.LifecycleRegistry");
         w var4 = (w)var2;
         androidx.lifecycle.o var3 = androidx.lifecycle.o.c;
         var4.d("setCurrentState");
         var4.f(var3);
      }

      super.onSaveInstanceState(var1);
      this.savedStateRegistryController.b(var1);
   }

   public void onTrimMemory(int var1) {
      super.onTrimMemory(var1);
      Iterator var2 = this.onTrimMemoryListeners.iterator();

      while(var2.hasNext()) {
         ((C.a)var2.next()).a(var1);
      }

   }

   public void onUserLeaveHint() {
      super.onUserLeaveHint();
      Iterator var1 = this.onUserLeaveHintListeners.iterator();

      while(var1.hasNext()) {
         ((Runnable)var1.next()).run();
      }

   }

   public Context peekAvailableContext() {
      return this.contextAwareHelper.b;
   }

   public final d.b registerForActivityResult(e.a var1, d.a var2) {
      i0.d.e(var1, "contract");
      i0.d.e(var2, "callback");
      return this.registerForActivityResult(var1, this.activityResultRegistry, var2);
   }

   public final d.b registerForActivityResult(e.a var1, d.i var2, d.a var3) {
      i0.d.e(var1, "contract");
      i0.d.e(var2, "registry");
      i0.d.e(var3, "callback");
      StringBuilder var4 = new StringBuilder("activity_rq#");
      var4.append(this.nextLocalRequestCode.getAndIncrement());
      String var6 = var4.toString();
      i0.d.e(var6, "key");
      androidx.lifecycle.p var8 = this.getLifecycle();
      w var11 = (w)var8;
      if (var11.c.compareTo(androidx.lifecycle.o.d) < 0) {
         var2.c(var6);
         LinkedHashMap var7 = var2.c;
         d.e var5 = (d.e)var7.get(var6);
         d.e var12 = var5;
         if (var5 == null) {
            var12 = new d.e(var8);
         }

         d.c var10 = new d.c(var2, var6, var3, var1);
         var12.a.a(var10);
         var12.b.add(var10);
         var7.put(var6, var12);
         return (d.b)(new Object());
      } else {
         StringBuilder var9 = new StringBuilder("LifecycleOwner ");
         var9.append(this);
         var9.append(" is attempting to register while current state is ");
         var9.append(var11.c);
         var9.append(". LifecycleOwners must call register before they are STARTED.");
         throw new IllegalStateException(var9.toString().toString());
      }
   }

   public void removeMenuProvider(D.r var1) {
      i0.d.e(var1, "provider");
      this.menuHostHelper.d(var1);
   }

   public final void removeOnConfigurationChangedListener(C.a var1) {
      i0.d.e(var1, "listener");
      this.onConfigurationChangedListeners.remove(var1);
   }

   public final void removeOnContextAvailableListener(c.b var1) {
      i0.d.e(var1, "listener");
      c.a var2 = this.contextAwareHelper;
      var2.getClass();
      var2.a.remove(var1);
   }

   public final void removeOnMultiWindowModeChangedListener(C.a var1) {
      i0.d.e(var1, "listener");
      this.onMultiWindowModeChangedListeners.remove(var1);
   }

   public final void removeOnNewIntentListener(C.a var1) {
      i0.d.e(var1, "listener");
      this.onNewIntentListeners.remove(var1);
   }

   public final void removeOnPictureInPictureModeChangedListener(C.a var1) {
      i0.d.e(var1, "listener");
      this.onPictureInPictureModeChangedListeners.remove(var1);
   }

   public final void removeOnTrimMemoryListener(C.a var1) {
      i0.d.e(var1, "listener");
      this.onTrimMemoryListeners.remove(var1);
   }

   public final void removeOnUserLeaveHintListener(Runnable var1) {
      i0.d.e(var1, "listener");
      this.onUserLeaveHintListeners.remove(var1);
   }

   public void reportFullyDrawn() {
      // $FF: Couldn't be decompiled
   }

   public abstract void setContentView(int var1);

   public void setContentView(View var1) {
      this.initializeViewTreeOwners();
      h var3 = this.reportFullyDrawnExecutor;
      View var2 = this.getWindow().getDecorView();
      i0.d.d(var2, "window.decorView");
      i var4 = (i)var3;
      var4.getClass();
      if (!var4.c) {
         var4.c = true;
         var2.getViewTreeObserver().addOnDrawListener(var4);
      }

      super.setContentView(var1);
   }

   public void startActivityForResult(Intent var1, int var2) {
      i0.d.e(var1, "intent");
      super.startActivityForResult(var1, var2);
   }

   public void startActivityForResult(Intent var1, int var2, Bundle var3) {
      i0.d.e(var1, "intent");
      super.startActivityForResult(var1, var2, var3);
   }

   public void startIntentSenderForResult(IntentSender var1, int var2, Intent var3, int var4, int var5, int var6) {
      i0.d.e(var1, "intent");
      super.startIntentSenderForResult(var1, var2, var3, var4, var5, var6);
   }

   public void startIntentSenderForResult(IntentSender var1, int var2, Intent var3, int var4, int var5, int var6, Bundle var7) {
      i0.d.e(var1, "intent");
      super.startIntentSenderForResult(var1, var2, var3, var4, var5, var6, var7);
   }
}
