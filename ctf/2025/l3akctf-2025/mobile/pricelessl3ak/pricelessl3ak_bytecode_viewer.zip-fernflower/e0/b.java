package e0;

import Z.d;
import java.io.Serializable;

public final class b extends d implements a, Serializable {
   public final Enum[] a;

   public b(Enum[] var1) {
      this.a = var1;
   }

   public final int a() {
      return this.a.length;
   }

   public final boolean contains(Object var1) {
      boolean var4 = var1 instanceof Enum;
      boolean var3 = false;
      if (!var4) {
         return false;
      } else {
         Enum var5 = (Enum)var1;
         i0.d.e(var5, "element");
         int var2 = var5.ordinal();
         Enum[] var6 = this.a;
         i0.d.e(var6, "<this>");
         Enum var7;
         if (var2 >= 0 && var2 < var6.length) {
            var7 = var6[var2];
         } else {
            var7 = null;
         }

         if (var7 == var5) {
            var3 = true;
         }

         return var3;
      }
   }

   public final Object get(int var1) {
      Enum[] var3 = this.a;
      int var2 = var3.length;
      if (var1 >= 0 && var1 < var2) {
         return var3[var1];
      } else {
         StringBuilder var4 = new StringBuilder("index: ");
         var4.append(var1);
         var4.append(", size: ");
         var4.append(var2);
         throw new IndexOutOfBoundsException(var4.toString());
      }
   }

   public final int indexOf(Object var1) {
      boolean var4 = var1 instanceof Enum;
      int var2 = -1;
      if (!var4) {
         return -1;
      } else {
         Enum var5 = (Enum)var1;
         i0.d.e(var5, "element");
         int var3 = var5.ordinal();
         Enum[] var6 = this.a;
         i0.d.e(var6, "<this>");
         Enum var7;
         if (var3 >= 0 && var3 < var6.length) {
            var7 = var6[var3];
         } else {
            var7 = null;
         }

         if (var7 == var5) {
            var2 = var3;
         }

         return var2;
      }
   }

   public final int lastIndexOf(Object var1) {
      if (!(var1 instanceof Enum)) {
         return -1;
      } else {
         Enum var2 = (Enum)var1;
         i0.d.e(var2, "element");
         return this.indexOf(var2);
      }
   }
}
