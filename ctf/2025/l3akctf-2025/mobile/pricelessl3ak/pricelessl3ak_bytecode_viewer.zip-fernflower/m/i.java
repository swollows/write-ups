package m;

import java.util.ConcurrentModificationException;

public abstract class i {
   public static final Object a = new Object();
   public static final Object b = new Object();

   public static final int a(g var0, Object var1, int var2) {
      i0.d.e(var0, "<this>");
      int var5 = var0.c;
      if (var5 == 0) {
         return -1;
      } else {
         int var4;
         try {
            int[] var6 = var0.a;
            var4 = n.a.a(var0.c, var2, var6);
         } catch (IndexOutOfBoundsException var7) {
            throw new ConcurrentModificationException();
         }

         if (var4 < 0) {
            return var4;
         } else if (i0.d.a(var1, var0.b[var4])) {
            return var4;
         } else {
            int var3;
            for(var3 = var4 + 1; var3 < var5 && var0.a[var3] == var2; ++var3) {
               if (i0.d.a(var1, var0.b[var3])) {
                  return var3;
               }
            }

            --var4;

            while(var4 >= 0 && var0.a[var4] == var2) {
               if (i0.d.a(var1, var0.b[var4])) {
                  return var4;
               }

               --var4;
            }

            return ~var3;
         }
      }
   }
}
