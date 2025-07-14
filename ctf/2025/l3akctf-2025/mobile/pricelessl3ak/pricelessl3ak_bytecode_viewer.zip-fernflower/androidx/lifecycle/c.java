package androidx.lifecycle;

import java.lang.reflect.Method;

public final class c {
   public final int a;
   public final Method b;

   public c(int var1, Method var2) {
      this.a = var1;
      this.b = var2;
      var2.setAccessible(true);
   }

   public final boolean equals(Object var1) {
      boolean var3 = true;
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof c)) {
         return false;
      } else {
         c var4 = (c)var1;
         int var2 = var4.a;
         if (this.a != var2 || !this.b.getName().equals(var4.b.getName())) {
            var3 = false;
         }

         return var3;
      }
   }

   public final int hashCode() {
      int var1 = this.a;
      return this.b.getName().hashCode() + var1 * 31;
   }
}
