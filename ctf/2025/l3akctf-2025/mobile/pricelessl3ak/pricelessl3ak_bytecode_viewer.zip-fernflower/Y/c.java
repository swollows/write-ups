package Y;

import java.io.Serializable;

public final class c implements Serializable {
   public final Object a;
   public final Object b;

   public c(Object var1, Object var2) {
      this.a = var1;
      this.b = var2;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof c)) {
         return false;
      } else {
         c var2 = (c)var1;
         var1 = var2.a;
         if (!i0.d.a(this.a, var1)) {
            return false;
         } else {
            return i0.d.a(this.b, var2.b);
         }
      }
   }

   public final int hashCode() {
      int var2 = 0;
      Object var3 = this.a;
      int var1;
      if (var3 == null) {
         var1 = 0;
      } else {
         var1 = var3.hashCode();
      }

      var3 = this.b;
      if (var3 != null) {
         var2 = var3.hashCode();
      }

      return var1 * 31 + var2;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder("(");
      var1.append(this.a);
      var1.append(", ");
      var1.append(this.b);
      var1.append(')');
      return var1.toString();
   }
}
