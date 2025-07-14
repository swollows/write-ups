package m;

import java.util.Arrays;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class f extends k implements Map {
   public a d;
   public c e;
   public e f;

   public final Set entrySet() {
      a var2 = this.d;
      a var1 = var2;
      if (var2 == null) {
         var1 = new a(this);
         this.d = var1;
      }

      return var1;
   }

   public final boolean i(Collection var1) {
      Iterator var2 = var1.iterator();

      do {
         if (!var2.hasNext()) {
            return true;
         }
      } while(super.containsKey(var2.next()));

      return false;
   }

   public final boolean j(Collection var1) {
      int var2 = super.c;
      Iterator var4 = var1.iterator();

      while(var4.hasNext()) {
         super.remove(var4.next());
      }

      boolean var3;
      if (var2 != super.c) {
         var3 = true;
      } else {
         var3 = false;
      }

      return var3;
   }

   public final Set keySet() {
      c var2 = this.e;
      c var1 = var2;
      if (var2 == null) {
         var1 = new c(this);
         this.e = var1;
      }

      return var1;
   }

   public final void putAll(Map var1) {
      int var2 = super.c;
      var2 += var1.size();
      int var3 = super.c;
      int[] var4 = super.a;
      if (var4.length < var2) {
         var4 = Arrays.copyOf(var4, var2);
         i0.d.d(var4, "copyOf(this, newSize)");
         super.a = var4;
         Object[] var7 = Arrays.copyOf(super.b, var2 * 2);
         i0.d.d(var7, "copyOf(this, newSize)");
         super.b = var7;
      }

      if (super.c != var3) {
         throw new ConcurrentModificationException();
      } else {
         Iterator var5 = var1.entrySet().iterator();

         while(var5.hasNext()) {
            Map.Entry var6 = (Map.Entry)var5.next();
            this.put(var6.getKey(), var6.getValue());
         }

      }
   }

   public final Collection values() {
      e var2 = this.f;
      e var1 = var2;
      if (var2 == null) {
         var1 = new e(this);
         this.f = var1;
      }

      return var1;
   }
}
