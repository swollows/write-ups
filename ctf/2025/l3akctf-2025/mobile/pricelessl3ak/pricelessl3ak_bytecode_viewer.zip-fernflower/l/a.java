package l;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

public final class a implements Iterable {
   public c a;
   public c b;
   public final WeakHashMap c = new WeakHashMap();
   public int d = 0;
   public final HashMap e = new HashMap();

   public final boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof a)) {
         return false;
      } else {
         a var3 = (a)var1;
         if (this.d != var3.d) {
            return false;
         } else {
            Iterator var6 = this.iterator();
            Iterator var7 = var3.iterator();

            while(true) {
               b var4 = (b)var6;
               if (var4.hasNext()) {
                  b var5 = (b)var7;
                  if (var5.hasNext()) {
                     Map.Entry var8 = (Map.Entry)var4.next();
                     Object var9 = var5.next();
                     if ((var8 != null || var9 == null) && (var8 == null || var8.equals(var9))) {
                        continue;
                     }

                     return false;
                  }
               }

               if (var4.hasNext() || ((b)var7).hasNext()) {
                  var2 = false;
               }

               return var2;
            }
         }
      }
   }

   public final int hashCode() {
      Iterator var2 = this.iterator();
      int var1 = 0;

      while(true) {
         b var3 = (b)var2;
         if (!var3.hasNext()) {
            return var1;
         }

         var1 += ((Map.Entry)var3.next()).hashCode();
      }
   }

   public final Iterator iterator() {
      b var1 = new b(this.a, this.b, 0);
      this.c.put(var1, Boolean.FALSE);
      return var1;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder("[");
      Iterator var3 = this.iterator();

      while(true) {
         b var2 = (b)var3;
         if (!var2.hasNext()) {
            var1.append("]");
            return var1.toString();
         }

         var1.append(((Map.Entry)var2.next()).toString());
         if (var2.hasNext()) {
            var1.append(", ");
         }
      }
   }
}
