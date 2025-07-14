package d;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import androidx.activity.result.ActivityResult;
import androidx.lifecycle.s;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.NoSuchElementException;

public abstract class i {
   public final LinkedHashMap a = new LinkedHashMap();
   public final LinkedHashMap b = new LinkedHashMap();
   public final LinkedHashMap c = new LinkedHashMap();
   public final ArrayList d = new ArrayList();
   public final transient LinkedHashMap e = new LinkedHashMap();
   public final LinkedHashMap f = new LinkedHashMap();
   public final Bundle g = new Bundle();

   public final boolean a(int var1, int var2, Intent var3) {
      String var5 = (String)this.a.get(var1);
      if (var5 == null) {
         return false;
      } else {
         d var6 = (d)this.e.get(var5);
         a var4;
         if (var6 != null) {
            var4 = var6.a;
         } else {
            var4 = null;
         }

         if (var4 != null) {
            ArrayList var7 = this.d;
            if (var7.contains(var5)) {
               var6.a.a(var6.b.a(var3, var2));
               var7.remove(var5);
               return true;
            }
         }

         this.f.remove(var5);
         ActivityResult var8 = new ActivityResult(var3, var2);
         this.g.putParcelable(var5, var8);
         return true;
      }
   }

   public final h b(String var1, e.a var2, a var3) {
      i0.d.e(var1, "key");
      this.c(var1);
      this.e.put(var1, new d(var2, var3));
      LinkedHashMap var5 = this.f;
      if (var5.containsKey(var1)) {
         Object var6 = var5.get(var1);
         var5.remove(var1);
         var3.a(var6);
      }

      Bundle var8 = this.g;
      ActivityResult var7 = (ActivityResult)q.e.p(var1, var8);
      if (var7 != null) {
         var8.remove(var1);
         int var4 = var7.a;
         var3.a(var2.a(var7.b, var4));
      }

      return new h(this, var1);
   }

   public final void c(String var1) {
      LinkedHashMap var6 = this.b;
      if ((Integer)var6.get(var1) == null) {
         Iterator var3 = (new n0.a(new n0.c(new i0.e(1)))).iterator();

         int var2;
         Number var4;
         LinkedHashMap var5;
         do {
            if (!var3.hasNext()) {
               throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }

            var4 = (Number)var3.next();
            var2 = var4.intValue();
            var5 = this.a;
         } while(var5.containsKey(var2));

         var2 = var4.intValue();
         var5.put(var2, var1);
         var6.put(var1, var2);
      }
   }

   public final void d(String var1) {
      i0.d.e(var1, "key");
      if (!this.d.contains(var1)) {
         Integer var2 = (Integer)this.b.remove(var1);
         if (var2 != null) {
            this.a.remove(var2);
         }
      }

      this.e.remove(var1);
      LinkedHashMap var3 = this.f;
      if (var3.containsKey(var1)) {
         StringBuilder var7 = new StringBuilder("Dropping pending result for request ");
         var7.append(var1);
         var7.append(": ");
         var7.append(var3.get(var1));
         Log.w("ActivityResultRegistry", var7.toString());
         var3.remove(var1);
      }

      Bundle var8 = this.g;
      if (var8.containsKey(var1)) {
         ActivityResult var4 = (ActivityResult)q.e.p(var1, var8);
         StringBuilder var10 = new StringBuilder("Dropping pending result for request ");
         var10.append(var1);
         var10.append(": ");
         var10.append(var4);
         Log.w("ActivityResultRegistry", var10.toString());
         var8.remove(var1);
      }

      LinkedHashMap var9 = this.c;
      e var6 = (e)var9.get(var1);
      if (var6 != null) {
         ArrayList var12 = var6.b;
         Iterator var11 = var12.iterator();

         while(var11.hasNext()) {
            s var5 = (s)var11.next();
            var6.a.b(var5);
         }

         var12.clear();
         var9.remove(var1);
      }

   }
}
