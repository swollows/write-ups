package Z;

import C.b;
import Y.c;
import i0.d;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public abstract class s extends b {
   public static int L(int var0) {
      if (var0 >= 0) {
         if (var0 < 3) {
            ++var0;
         } else if (var0 < 1073741824) {
            var0 = (int)((float)var0 / 0.75F + 1.0F);
         } else {
            var0 = Integer.MAX_VALUE;
         }
      }

      return var0;
   }

   public static Map M(ArrayList var0) {
      Object var2 = q.a;
      int var1 = var0.size();
      if (var1 != 0) {
         if (var1 != 1) {
            LinkedHashMap var3 = new LinkedHashMap(L(var0.size()));
            Iterator var4 = var0.iterator();

            while(true) {
               var2 = var3;
               if (!var4.hasNext()) {
                  break;
               }

               c var6 = (c)var4.next();
               var3.put(var6.a, var6.b);
            }
         } else {
            c var5 = (c)var0.get(0);
            d.e(var5, "pair");
            var2 = Collections.singletonMap(var5.a, var5.b);
            d.d(var2, "singletonMap(...)");
         }
      }

      return (Map)var2;
   }

   public static final Map N(LinkedHashMap var0) {
      d.e(var0, "<this>");
      Map.Entry var1 = (Map.Entry)var0.entrySet().iterator().next();
      Map var2 = Collections.singletonMap(var1.getKey(), var1.getValue());
      d.d(var2, "with(...)");
      return var2;
   }
}
