package a0;

import java.util.Map;

public final class b implements Map.Entry, j0.a {
   public final c a;
   public final int b;

   public b(c var1, int var2) {
      i0.d.e(var1, "map");
      super();
      this.a = var1;
      this.b = var2;
   }

   public final boolean equals(Object var1) {
      boolean var2;
      if (var1 instanceof Map.Entry) {
         Map.Entry var3 = (Map.Entry)var1;
         if (i0.d.a(var3.getKey(), this.getKey()) && i0.d.a(var3.getValue(), this.getValue())) {
            var2 = true;
            return var2;
         }
      }

      var2 = false;
      return var2;
   }

   public final Object getKey() {
      return this.a.a[this.b];
   }

   public final Object getValue() {
      Object[] var1 = this.a.b;
      i0.d.b(var1);
      return var1[this.b];
   }

   public final int hashCode() {
      Object var3 = this.getKey();
      int var2 = 0;
      int var1;
      if (var3 != null) {
         var1 = var3.hashCode();
      } else {
         var1 = 0;
      }

      var3 = this.getValue();
      if (var3 != null) {
         var2 = var3.hashCode();
      }

      return var1 ^ var2;
   }

   public final Object setValue(Object var1) {
      c var4 = this.a;
      var4.b();
      Object[] var3 = var4.b;
      int var2;
      if (var3 == null) {
         var2 = var4.a.length;
         if (var2 < 0) {
            throw new IllegalArgumentException("capacity must be non-negative.");
         }

         var3 = new Object[var2];
         var4.b = var3;
      }

      var2 = this.b;
      Object var5 = var3[var2];
      var3[var2] = var1;
      return var5;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.getKey());
      var1.append('=');
      var1.append(this.getValue());
      return var1.toString();
   }
}
