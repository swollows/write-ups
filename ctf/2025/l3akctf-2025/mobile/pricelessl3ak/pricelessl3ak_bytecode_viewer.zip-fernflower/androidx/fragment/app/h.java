package androidx.fragment.app;

import android.os.Handler;
import androidx.lifecycle.T;
import androidx.lifecycle.U;

public final class h implements U, androidx.lifecycle.u, Q.h {
   public final i a;
   public final Handler b;
   public final u c;
   public final androidx.appcompat.app.k d;

   public h(androidx.appcompat.app.k var1) {
      this.d = var1;
      Handler var2 = new Handler();
      this.c = new t();
      this.a = var1;
      this.b = var2;
   }

   public final androidx.lifecycle.p getLifecycle() {
      return this.d.mFragmentLifecycleRegistry;
   }

   public final Q.e getSavedStateRegistry() {
      return this.d.getSavedStateRegistry();
   }

   public final T getViewModelStore() {
      return this.d.getViewModelStore();
   }
}
