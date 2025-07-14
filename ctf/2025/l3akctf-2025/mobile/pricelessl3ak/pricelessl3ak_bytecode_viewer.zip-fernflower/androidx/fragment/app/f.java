package androidx.fragment.app;

import android.content.Intent;
import android.content.res.Configuration;

public final class f implements C.a {
   public final int a;
   public final androidx.appcompat.app.k b;

   // $FF: synthetic method
   public f(androidx.appcompat.app.k var1, int var2) {
      this.a = var2;
      this.b = var1;
   }

   public final void a(Object var1) {
      switch (this.a) {
         case 0:
            Configuration var2 = (Configuration)var1;
            this.b.mFragments.a();
            return;
         default:
            Intent var3 = (Intent)var1;
            this.b.mFragments.a();
      }
   }
}
