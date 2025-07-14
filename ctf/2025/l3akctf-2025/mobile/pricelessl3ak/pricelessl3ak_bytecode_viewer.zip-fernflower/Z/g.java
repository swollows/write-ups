package Z;

import C.b;
import i0.d;

public abstract class g extends b {
   public static void L(int var0, int var1, int var2, int[] var3, int[] var4) {
      d.e(var3, "<this>");
      d.e(var4, "destination");
      System.arraycopy(var3, var1, var4, var0, var2 - var1);
   }

   public static void M(Object[] var0, Object[] var1, int var2, int var3, int var4) {
      d.e(var0, "<this>");
      d.e(var1, "destination");
      System.arraycopy(var0, var3, var1, var2, var4 - var3);
   }

   // $FF: synthetic method
   public static void N(int var0, int var1, int[] var2, int[] var3) {
      if ((var1 & 8) != 0) {
         var0 = var2.length;
      }

      L(0, 0, var0, var2, var3);
   }

   // $FF: synthetic method
   public static void O(Object[] var0, Object[] var1, int var2, int var3, int var4) {
      if ((var4 & 4) != 0) {
         var2 = 0;
      }

      M(var0, var1, 0, var2, var3);
   }
}
