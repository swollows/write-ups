package H;

import android.util.SparseArray;

public final class v {
   public final SparseArray a;
   public z b;

   public v(int var1) {
      this.a = new SparseArray(var1);
   }

   public final void a(z var1, int var2, int var3) {
      int var4 = var1.a(var2);
      SparseArray var7 = this.a;
      v var5;
      if (var7 == null) {
         var5 = null;
      } else {
         var5 = (v)var7.get(var4);
      }

      v var6 = var5;
      if (var5 == null) {
         var6 = new v(1);
         var7.put(var1.a(var2), var6);
      }

      if (var3 > var2) {
         var6.a(var1, var2 + 1, var3);
      } else {
         var6.b = var1;
      }

   }
}
