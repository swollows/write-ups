package A;

import java.util.Comparator;

public final class d implements Comparator {
   public final int compare(Object var1, Object var2) {
      byte[] var6 = (byte[])var1;
      byte[] var7 = (byte[])var2;
      int var3;
      if (var6.length != var7.length) {
         var3 = var6.length - var7.length;
      } else {
         var3 = 0;

         while(true) {
            if (var3 >= var6.length) {
               var3 = 0;
               break;
            }

            byte var5 = var6[var3];
            byte var4 = var7[var3];
            if (var5 != var4) {
               var3 = var5 - var4;
               break;
            }

            ++var3;
         }
      }

      return var3;
   }
}
