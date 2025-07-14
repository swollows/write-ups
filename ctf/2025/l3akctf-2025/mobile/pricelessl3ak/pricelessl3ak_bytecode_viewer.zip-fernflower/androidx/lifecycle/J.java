package androidx.lifecycle;

import android.os.Bundle;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class J implements Q.d {
   public final Q.e a;
   public boolean b;
   public Bundle c;
   public final Y.e d;

   public J(Q.e var1, b.l var2) {
      i0.d.e(var1, "savedStateRegistry");
      super();
      this.a = var1;
      this.d = new Y.e(new Q.f(var2, 1));
   }

   public final Bundle a() {
      Bundle var1 = q.e.a((Y.c[])Arrays.copyOf(new Y.c[0], 0));
      Bundle var2 = this.c;
      if (var2 != null) {
         var1.putAll(var2);
      }

      Iterator var5 = ((K)this.d.a()).b.entrySet().iterator();

      while(var5.hasNext()) {
         Map.Entry var4 = (Map.Entry)var5.next();
         String var3 = (String)var4.getKey();
         Bundle var6 = ((F)var4.getValue()).a.e.a();
         if (!var6.isEmpty()) {
            i0.d.e(var3, "key");
            var1.putBundle(var3, var6);
         }
      }

      this.b = false;
      return var1;
   }

   public final void b() {
      if (!this.b) {
         Bundle var3 = this.a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
         Bundle var2 = q.e.a((Y.c[])Arrays.copyOf(new Y.c[0], 0));
         Bundle var1 = this.c;
         if (var1 != null) {
            var2.putAll(var1);
         }

         if (var3 != null) {
            var2.putAll(var3);
         }

         this.c = var2;
         this.b = true;
         K var4 = (K)this.d.a();
      }

   }
}
