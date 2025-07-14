package r;

public final class e extends q.e {
   public final boolean b(g var1, c var2) {
      c var3 = c.b;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label123: {
         try {
            if (var1.b == var2) {
               var1.b = var3;
               return true;
            }
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label123;
         }

         label117:
         try {
            return false;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label117;
         }
      }

      while(true) {
         Throwable var16 = var10000;

         try {
            throw var16;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            continue;
         }
      }
   }

   public final boolean c(g var1, Object var2, Object var3) {
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label123: {
         try {
            if (var1.a == var2) {
               var1.a = var3;
               return true;
            }
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label123;
         }

         label117:
         try {
            return false;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label117;
         }
      }

      while(true) {
         Throwable var16 = var10000;

         try {
            throw var16;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            continue;
         }
      }
   }

   public final boolean d(g var1, f var2, f var3) {
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label123: {
         try {
            if (var1.c == var2) {
               var1.c = var3;
               return true;
            }
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label123;
         }

         label117:
         try {
            return false;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            break label117;
         }
      }

      while(true) {
         Throwable var16 = var10000;

         try {
            throw var16;
         } catch (Throwable var13) {
            var10000 = var13;
            var10001 = false;
            continue;
         }
      }
   }

   public final void s(f var1, f var2) {
      var1.b = var2;
   }

   public final void t(f var1, Thread var2) {
      var1.a = var2;
   }
}
