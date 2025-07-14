package i0;

public final class f implements a {
   public final Class a;

   public f(Class var1) {
      this.a = var1;
   }

   public final Class a() {
      return this.a;
   }

   public final boolean equals(Object var1) {
      boolean var2;
      if (var1 instanceof f) {
         Class var3 = ((f)var1).a;
         if (d.a(this.a, var3)) {
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
      StringBuilder var1 = new StringBuilder();
      var1.append(this.a.toString());
      var1.append(" (Kotlin reflection is not available)");
      return var1.toString();
   }
}
