package l;

import java.util.Iterator;

public final class d extends e implements Iterator {
   public c a;
   public boolean b;
   public final a c;

   public d(a var1) {
      this.c = var1;
      this.b = true;
   }

   public final void a(c var1) {
      c var3 = this.a;
      if (var1 == var3) {
         var1 = var3.d;
         this.a = var1;
         boolean var2;
         if (var1 == null) {
            var2 = true;
         } else {
            var2 = false;
         }

         this.b = var2;
      }

   }

   public final boolean hasNext() {
      boolean var3 = this.b;
      boolean var2 = false;
      boolean var1 = false;
      if (var3) {
         if (this.c.a != null) {
            var1 = true;
         }

         return var1;
      } else {
         c var4 = this.a;
         var1 = var2;
         if (var4 != null) {
            var1 = var2;
            if (var4.c != null) {
               var1 = true;
            }
         }

         return var1;
      }
   }

   public final Object next() {
      if (this.b) {
         this.b = false;
         this.a = this.c.a;
      } else {
         c var1 = this.a;
         if (var1 != null) {
            var1 = var1.c;
         } else {
            var1 = null;
         }

         this.a = var1;
      }

      return this.a;
   }
}
