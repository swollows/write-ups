package androidx.fragment.app;

import android.util.Log;
import androidx.activity.result.ActivityResult;
import java.util.ArrayList;
import java.util.Map;

public final class n implements d.a {
   public final int a;
   public final u b;

   // $FF: synthetic method
   public n(u var1, int var2) {
      this.a = var2;
      this.b = var1;
   }

   public final void a(Object var1) {
      ActivityResult var5;
      StringBuilder var7;
      u var11;
      FragmentManager$LaunchedFragmentInfo var15;
      String var16;
      switch (this.a) {
         case 0:
            Map var9 = (Map)var1;
            String[] var13 = (String[])var9.keySet().toArray(new String[0]);
            ArrayList var14 = new ArrayList(var9.values());
            int[] var10 = new int[var14.size()];

            for(int var2 = 0; var2 < var14.size(); ++var2) {
               byte var3;
               if ((Boolean)var14.get(var2)) {
                  var3 = 0;
               } else {
                  var3 = -1;
               }

               var10[var2] = var3;
            }

            var11 = this.b;
            var15 = (FragmentManager$LaunchedFragmentInfo)var11.x.pollFirst();
            if (var15 == null) {
               var7 = new StringBuilder("No permissions were requested for ");
               var7.append(this);
               Log.w("FragmentManager", var7.toString());
            } else {
               var16 = var15.a;
               var11.c.a();
               var7 = new StringBuilder("Permission request result delivered for unknown Fragment ");
               var7.append(var16);
               Log.w("FragmentManager", var7.toString());
            }

            return;
         case 1:
            var5 = (ActivityResult)var1;
            u var4 = this.b;
            FragmentManager$LaunchedFragmentInfo var6 = (FragmentManager$LaunchedFragmentInfo)var4.x.pollFirst();
            if (var6 == null) {
               var7 = new StringBuilder("No Activities were started for result for ");
               var7.append(this);
               Log.w("FragmentManager", var7.toString());
            } else {
               String var8 = var6.a;
               var4.c.a();
               StringBuilder var12 = new StringBuilder("Activity result delivered for unknown Fragment ");
               var12.append(var8);
               Log.w("FragmentManager", var12.toString());
            }

            return;
         default:
            var5 = (ActivityResult)var1;
            var11 = this.b;
            var15 = (FragmentManager$LaunchedFragmentInfo)var11.x.pollFirst();
            if (var15 == null) {
               var7 = new StringBuilder("No IntentSenders were started for ");
               var7.append(this);
               Log.w("FragmentManager", var7.toString());
            } else {
               var16 = var15.a;
               var11.c.a();
               var7 = new StringBuilder("Intent Sender result delivered for unknown Fragment ");
               var7.append(var16);
               Log.w("FragmentManager", var7.toString());
            }

      }
   }
}
