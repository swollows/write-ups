package n;

import i0.d;

public abstract class a {
   public static final int[] a = new int[0];
   public static final Object[] b = new Object[0];

   public static final int a(int var0, int var1, int[] var2) {
      d.e(var2, "array");
      --var0;
      int var3 = 0;

      while(var3 <= var0) {
         int var4 = var3 + var0 >>> 1;
         int var5 = var2[var4];
         if (var5 < var1) {
            var3 = var4 + 1;
         } else {
            if (var5 <= var1) {
               return var4;
            }

            var0 = var4 - 1;
         }
      }

      return ~var3;
   }

   public static final int b(long[] var0, int var1, long var2) {
      d.e(var0, "array");
      --var1;
      int var4 = 0;

      while(var4 <= var1) {
         int var5 = var4 + var1 >>> 1;
         long var7;
         int var6 = (var7 = var0[var5] - var2) == 0L ? 0 : (var7 < 0L ? -1 : 1);
         if (var6 < 0) {
            var4 = var5 + 1;
         } else {
            if (var6 <= 0) {
               return var5;
            }

            var1 = var5 - 1;
         }
      }

      return ~var4;
   }
}
