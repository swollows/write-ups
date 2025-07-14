package q;

import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

public abstract class d {
   public static final D.d a = new D.d(18);
   public static final Object b = new Object();
   public static final c c;
   public static final int d;
   public static final AtomicReference e;

   static {
      c = q.c.e;
      d = 2;
      D.f var2 = new D.f(2);
      var2.b = new int[16];
      var2.e = new int[16];
      int[] var3 = new int[16];

      int var0;
      int var1;
      for(var0 = 0; var0 < 16; var0 = var1) {
         var1 = var0 + 1;
         var3[var0] = var1;
      }

      var2.f = var3;
      var0 = d++;
      Object var10 = b;
      synchronized(var10){}
      c var4 = q.c.e;
      Object var5 = new Object();
      ((a)var5).a = var4;
      ((a)var5).b = var0;
      if (var0 != 0) {
         synchronized(var10){}

         try {
            var2.a(var0);
         } finally {
            ;
         }
      }

      c = c.b(((a)var5).b);
      AtomicReference var8 = new AtomicReference(var5);
      e = var8;
      a var9 = (a)var8.get();
      new AtomicInteger(0);
   }

   public static final f a(f var0) {
      a var1 = b();
      f var2 = c(var0, var1.b, var1.a);
      f var5 = var2;
      if (var2 == null) {
         Object var6 = b;
         synchronized(var6){}

         try {
            var1 = b();
            var5 = c(var0, var1.b, var1.a);
         } finally {
            ;
         }

         if (var5 == null) {
            throw new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
         }
      }

      return var5;
   }

   public static final a b() {
      a.u();
      return (a)e.get();
   }

   public static final f c(f var0, int var1, c var2) {
      f var4;
      f var5;
      for(var4 = null; var0 != null; var4 = var5) {
         int var3 = var0.a;
         var5 = var4;
         if (var3 != 0) {
            var5 = var4;
            if (var3 <= var1) {
               var5 = var4;
               if (!var2.a(var3)) {
                  if (var4 != null && var4.a >= var0.a) {
                     var0 = var4;
                  }

                  var5 = var0;
               }
            }
         }

         var0 = null;
      }

      if (var4 != null) {
         return var4;
      } else {
         return null;
      }
   }

   public static final f d(f var0, e var1) {
      a var2 = b();
      var2.getClass();
      f var13 = c(var0, var2.b, var2.a);
      var0 = var13;
      if (var13 == null) {
         Object var14 = b;
         synchronized(var14){}

         Throwable var10000;
         label87: {
            boolean var10001;
            try {
               a var9 = b();
               f var10 = var1.o();
               i0.d.c(var10, "null cannot be cast to non-null type T of androidx.compose.runtime.snapshots.SnapshotKt.readable$lambda$9");
               var0 = c(var10, var9.b, var9.a);
            } catch (Throwable var8) {
               var10000 = var8;
               var10001 = false;
               break label87;
            }

            if (var0 != null) {
               return var0;
            }

            label74:
            try {
               IllegalStateException var12 = new IllegalStateException("Reading a state that was created after the snapshot was taken or in a snapshot that has not yet been applied");
               throw var12;
            } catch (Throwable var7) {
               var10000 = var7;
               var10001 = false;
               break label74;
            }
         }

         Throwable var11 = var10000;
         throw var11;
      } else {
         return var0;
      }
   }
}
