package d;

import android.os.Bundle;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.n;
import androidx.lifecycle.s;
import androidx.lifecycle.u;
import java.util.LinkedHashMap;

public final class c implements s {
   public final i a;
   public final String b;
   public final a c;
   public final e.a d;

   // $FF: synthetic method
   public c(i var1, String var2, a var3, e.a var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public final void a(u var1, n var2) {
      n var4 = n.ON_START;
      i var5 = this.a;
      String var8 = this.b;
      LinkedHashMap var6 = var5.e;
      if (var4 == var2) {
         a var9 = this.c;
         e.a var10 = this.d;
         var6.put(var8, new d(var10, var9));
         LinkedHashMap var7 = var5.f;
         if (var7.containsKey(var8)) {
            Object var12 = var7.get(var8);
            var7.remove(var8);
            var9.a(var12);
         }

         Bundle var13 = var5.g;
         ActivityResult var11 = (ActivityResult)q.e.p(var8, var13);
         if (var11 != null) {
            var13.remove(var8);
            int var3 = var11.a;
            var9.a(var10.a(var11.b, var3));
         }
      } else if (n.ON_STOP == var2) {
         var6.remove(var8);
      } else if (n.ON_DESTROY == var2) {
         var5.d(var8);
      }

   }
}
