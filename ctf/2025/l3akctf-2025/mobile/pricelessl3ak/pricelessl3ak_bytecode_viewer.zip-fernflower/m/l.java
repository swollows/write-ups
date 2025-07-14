package m;

import java.util.Arrays;

public final class l implements Cloneable {
   public int[] a;
   public Object[] b;
   public int c;

   public l() {
      int var1 = 4;

      int var2;
      while(true) {
         var2 = 40;
         if (var1 >= 32) {
            break;
         }

         var2 = (1 << var1) - 12;
         if (40 <= var2) {
            break;
         }

         ++var1;
      }

      var1 = var2 / 4;
      this.a = new int[var1];
      this.b = new Object[var1];
   }

   public final void a(int var1, Object var2) {
      int var6 = this.c;
      int var3;
      int var4;
      int var5;
      int[] var7;
      Object[] var8;
      if (var6 != 0 && var1 <= this.a[var6 - 1]) {
         var7 = this.a;
         var3 = n.a.a(this.c, var1, var7);
         if (var3 >= 0) {
            this.b[var3] = var2;
         } else {
            var6 = ~var3;
            var3 = this.c;
            if (var6 < var3) {
               var8 = this.b;
               if (var8[var6] == i.b) {
                  this.a[var6] = var1;
                  var8[var6] = var2;
                  return;
               }
            }

            if (var3 >= this.a.length) {
               var5 = (var3 + 1) * 4;
               var3 = 4;

               while(true) {
                  var4 = var5;
                  if (var3 >= 32) {
                     break;
                  }

                  var4 = (1 << var3) - 12;
                  if (var5 <= var4) {
                     break;
                  }

                  ++var3;
               }

               var3 = var4 / 4;
               var7 = Arrays.copyOf(this.a, var3);
               i0.d.d(var7, "copyOf(this, newSize)");
               this.a = var7;
               var8 = Arrays.copyOf(this.b, var3);
               i0.d.d(var8, "copyOf(this, newSize)");
               this.b = var8;
            }

            var3 = this.c;
            if (var3 - var6 != 0) {
               var7 = this.a;
               var4 = var6 + 1;
               Z.g.L(var4, var6, var3, var7, var7);
               var8 = this.b;
               Z.g.M(var8, var8, var4, var6, this.c);
            }

            this.a[var6] = var1;
            this.b[var6] = var2;
            ++this.c;
         }
      } else {
         if (var6 >= this.a.length) {
            var5 = (var6 + 1) * 4;
            var3 = 4;

            while(true) {
               var4 = var5;
               if (var3 >= 32) {
                  break;
               }

               var4 = (1 << var3) - 12;
               if (var5 <= var4) {
                  break;
               }

               ++var3;
            }

            var3 = var4 / 4;
            var7 = Arrays.copyOf(this.a, var3);
            i0.d.d(var7, "copyOf(this, newSize)");
            this.a = var7;
            var8 = Arrays.copyOf(this.b, var3);
            i0.d.d(var8, "copyOf(this, newSize)");
            this.b = var8;
         }

         this.a[var6] = var1;
         this.b[var6] = var2;
         this.c = var6 + 1;
      }

   }

   public final Object clone() {
      Object var1 = super.clone();
      i0.d.c(var1, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
      l var2 = (l)var1;
      var2.a = (int[])this.a.clone();
      var2.b = (Object[])this.b.clone();
      return var2;
   }

   public final String toString() {
      int var1 = this.c;
      String var3;
      if (var1 <= 0) {
         var3 = "{}";
      } else {
         StringBuilder var4 = new StringBuilder(var1 * 28);
         var4.append('{');
         int var2 = this.c;

         for(var1 = 0; var1 < var2; ++var1) {
            if (var1 > 0) {
               var4.append(", ");
            }

            var4.append(this.a[var1]);
            var4.append('=');
            Object var5 = this.b[var1];
            if (var5 != this) {
               var4.append(var5);
            } else {
               var4.append("(this Map)");
            }
         }

         var4.append('}');
         var3 = var4.toString();
         i0.d.d(var3, "buffer.toString()");
      }

      return var3;
   }
}
