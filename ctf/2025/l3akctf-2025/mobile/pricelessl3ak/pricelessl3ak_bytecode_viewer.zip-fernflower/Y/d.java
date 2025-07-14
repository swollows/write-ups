package Y;

import java.io.Serializable;

public final class d implements Serializable {
   public final Throwable a;

   public d(Throwable var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      boolean var2;
      if (var1 instanceof d) {
         Throwable var3 = ((d)var1).a;
         if (i0.d.a(this.a, var3)) {
            var2 = true;
            return var2;
         }
      }

      var2 = false;
      return var2;
   }

   public final int hashCode() {
      return this.a.hashCode();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder("Failure(");
      var1.append(this.a);
      var1.append(')');
      return var1.toString();
   }
}
