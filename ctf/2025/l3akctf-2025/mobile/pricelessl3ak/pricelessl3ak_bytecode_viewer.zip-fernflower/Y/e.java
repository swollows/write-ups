package Y;

import h0.a;
import java.io.Serializable;

public final class e implements b, Serializable {
   public a a;
   public volatile Object b;
   public final Object c;

   public e(a var1) {
      this.a = var1;
      this.b = f.b;
      this.c = this;
   }

   public final Object a() {
      Object var1 = this.b;
      f var3 = f.b;
      if (var1 != var3) {
         return var1;
      } else {
         Object var2 = this.c;
         synchronized(var2){}

         Throwable var10000;
         label88: {
            boolean var10001;
            try {
               var1 = this.b;
            } catch (Throwable var9) {
               var10000 = var9;
               var10001 = false;
               break label88;
            }

            if (var1 != var3) {
               return var1;
            }

            label77:
            try {
               a var11 = this.a;
               i0.d.b(var11);
               var1 = var11.b();
               this.b = var1;
               this.a = null;
               return var1;
            } catch (Throwable var8) {
               var10000 = var8;
               var10001 = false;
               break label77;
            }
         }

         Throwable var10 = var10000;
         throw var10;
      }
   }

   public final String toString() {
      String var1;
      if (this.b != f.b) {
         var1 = String.valueOf(this.a());
      } else {
         var1 = "Lazy value not initialized yet.";
      }

      return var1;
   }
}
