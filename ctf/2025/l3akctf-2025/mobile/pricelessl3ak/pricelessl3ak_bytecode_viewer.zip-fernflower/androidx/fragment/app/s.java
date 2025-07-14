package androidx.fragment.app;

import android.content.Intent;
import androidx.activity.result.ActivityResult;
import java.util.ArrayList;
import java.util.Iterator;

public final class s extends e.a {
   public final int a;

   // $FF: synthetic method
   public s(int var1) {
      this.a = var1;
   }

   public final Object a(Intent var1, int var2) {
      switch (this.a) {
         case 0:
            return new ActivityResult(var1, var2);
         case 1:
            Z.q var6 = Z.q.a;
            Object var9;
            if (var2 != -1) {
               var9 = var6;
            } else if (var1 == null) {
               var9 = var6;
            } else {
               String[] var7 = var1.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
               int[] var8 = var1.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
               var9 = var6;
               if (var8 != null) {
                  if (var7 == null) {
                     var9 = var6;
                  } else {
                     ArrayList var10 = new ArrayList(var8.length);
                     int var4 = var8.length;
                     byte var3 = 0;

                     for(var2 = 0; var2 < var4; ++var2) {
                        boolean var5;
                        if (var8[var2] == 0) {
                           var5 = true;
                        } else {
                           var5 = false;
                        }

                        var10.add(var5);
                     }

                     ArrayList var11 = new ArrayList();
                     var4 = var7.length;

                     for(var2 = var3; var2 < var4; ++var2) {
                        String var13 = var7[var2];
                        if (var13 != null) {
                           var11.add(var13);
                        }
                     }

                     Iterator var12 = var11.iterator();
                     Iterator var14 = var10.iterator();
                     var10 = new ArrayList(Math.min(Z.j.L(var11), Z.j.L(var10)));

                     while(var12.hasNext() && var14.hasNext()) {
                        var10.add(new Y.c(var12.next(), var14.next()));
                     }

                     var9 = Z.s.M(var10);
                  }
               }
            }

            return var9;
         default:
            return new ActivityResult(var1, var2);
      }
   }
}
