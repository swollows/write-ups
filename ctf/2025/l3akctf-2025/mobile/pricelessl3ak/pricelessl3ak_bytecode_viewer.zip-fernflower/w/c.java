package w;

import android.graphics.Insets;

public final class c {
   public static final c e = new c(0, 0, 0, 0);
   public final int a;
   public final int b;
   public final int c;
   public final int d;

   public c(int var1, int var2, int var3, int var4) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
   }

   public static c a(int var0, int var1, int var2, int var3) {
      return var0 == 0 && var1 == 0 && var2 == 0 && var3 == 0 ? e : new c(var0, var1, var2, var3);
   }

   public final Insets b() {
      return w.b.a(this.a, this.b, this.c, this.d);
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && c.class == var1.getClass()) {
         c var2 = (c)var1;
         if (this.d != var2.d) {
            return false;
         } else if (this.a != var2.a) {
            return false;
         } else if (this.c != var2.c) {
            return false;
         } else {
            return this.b == var2.b;
         }
      } else {
         return false;
      }
   }

   public final int hashCode() {
      return ((this.a * 31 + this.b) * 31 + this.c) * 31 + this.d;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder("Insets{left=");
      var1.append(this.a);
      var1.append(", top=");
      var1.append(this.b);
      var1.append(", right=");
      var1.append(this.c);
      var1.append(", bottom=");
      var1.append(this.d);
      var1.append('}');
      return var1.toString();
   }
}
