package l;

import java.util.Iterator;

public final class b extends e implements Iterator {
   public c a;
   public c b;
   public final int c;

   public b(c var1, c var2, int var3) {
      this.c = var3;
      this.a = var2;
      this.b = var1;
   }

   public final void a(c var1) {
      c var2 = this.a;
      Object var3 = null;
      if (var2 == var1 && var1 == this.b) {
         this.b = null;
         this.a = null;
      }

      var2 = this.a;
      if (var2 == var1) {
         switch (this.c) {
            case 0:
               var2 = var2.d;
               break;
            default:
               var2 = var2.c;
         }

         this.a = var2;
      }

      var2 = this.b;
      if (var2 == var1) {
         c var4 = this.a;
         var1 = (c)var3;
         if (var2 != var4) {
            if (var4 == null) {
               var1 = (c)var3;
            } else {
               var1 = this.b(var2);
            }
         }

         this.b = var1;
      }

   }

   public final c b(c var1) {
      switch (this.c) {
         case 0:
            return var1.c;
         default:
            return var1.d;
      }
   }

   public final boolean hasNext() {
      boolean var1;
      if (this.b != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final Object next() {
      c var2 = this.b;
      c var1 = this.a;
      if (var2 != var1 && var1 != null) {
         var1 = this.b(var2);
      } else {
         var1 = null;
      }

      this.b = var1;
      return var2;
   }
}
