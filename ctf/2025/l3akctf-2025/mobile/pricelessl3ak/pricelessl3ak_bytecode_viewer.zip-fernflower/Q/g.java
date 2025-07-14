package Q;

import C.b;
import D.z;
import R.a;
import Y.c;
import android.os.Bundle;
import androidx.lifecycle.o;
import androidx.lifecycle.u;
import androidx.lifecycle.w;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

public final class g {
   public final a a;
   public final e b;

   public g(a var1) {
      this.a = var1;
      this.b = new e(var1);
   }

   public final void a(Bundle var1) {
      a var4 = this.a;
      if (!var4.e) {
         var4.a();
      }

      Object var2 = var4.a;
      if (((w)((u)var2).getLifecycle()).c.compareTo(o.d) < 0) {
         if (!var4.g) {
            Object var3 = null;
            Bundle var6 = (Bundle)var3;
            if (var1 != null) {
               var6 = (Bundle)var3;
               if (var1.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
                  var6 = C.b.s("androidx.lifecycle.BundlableSavedStateRegistry.key", var1);
               }
            }

            var4.f = var6;
            var4.g = true;
         } else {
            throw new IllegalStateException("SavedStateRegistry was already restored.");
         }
      } else {
         StringBuilder var5 = new StringBuilder("performRestore cannot be called when owner is ");
         var5.append(((w)((u)var2).getLifecycle()).c);
         throw new IllegalStateException(var5.toString().toString());
      }
   }

   public final void b(Bundle var1) {
      a var4 = this.a;
      Bundle var3 = q.e.a((c[])Arrays.copyOf(new c[0], 0));
      Bundle var2 = var4.f;
      if (var2 != null) {
         var3.putAll(var2);
      }

      z var14 = var4.c;
      synchronized(var14){}

      label101: {
         Throwable var10000;
         label100: {
            Iterator var15;
            boolean var10001;
            try {
               var15 = var4.d.entrySet().iterator();
            } catch (Throwable var12) {
               var10000 = var12;
               var10001 = false;
               break label100;
            }

            while(true) {
               try {
                  if (!var15.hasNext()) {
                     break label101;
                  }

                  Map.Entry var6 = (Map.Entry)var15.next();
                  String var5 = (String)var6.getKey();
                  Bundle var16 = ((d)var6.getValue()).a();
                  i0.d.e(var5, "key");
                  var3.putBundle(var5, var16);
               } catch (Throwable var11) {
                  var10000 = var11;
                  var10001 = false;
                  break;
               }
            }
         }

         Throwable var13 = var10000;
         throw var13;
      }

      if (!var3.isEmpty()) {
         var1.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", var3);
      }

   }
}
