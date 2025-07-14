package androidx.appcompat.app;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

public final class p implements Executor {
   public final Object a = new Object();
   public final ArrayDeque b = new ArrayDeque();
   public final q c;
   public Runnable d;

   public p(q var1) {
      this.c = var1;
   }

   public final void a() {
      Object var1 = this.a;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label186: {
         Runnable var2;
         try {
            var2 = (Runnable)this.b.poll();
            this.d = var2;
         } catch (Throwable var22) {
            var10000 = var22;
            var10001 = false;
            break label186;
         }

         if (var2 != null) {
            try {
               this.c.execute(var2);
            } catch (Throwable var21) {
               var10000 = var21;
               var10001 = false;
               break label186;
            }
         }

         label174:
         try {
            return;
         } catch (Throwable var20) {
            var10000 = var20;
            var10001 = false;
            break label174;
         }
      }

      while(true) {
         Throwable var23 = var10000;

         try {
            throw var23;
         } catch (Throwable var19) {
            var10000 = var19;
            var10001 = false;
            continue;
         }
      }
   }

   public final void execute(Runnable var1) {
      Object var2 = this.a;
      synchronized(var2){}

      Throwable var10000;
      boolean var10001;
      label134: {
         try {
            ArrayDeque var4 = this.b;
            o var3 = new o(this, var1, 0);
            var4.add(var3);
            if (this.d == null) {
               this.a();
            }
         } catch (Throwable var16) {
            var10000 = var16;
            var10001 = false;
            break label134;
         }

         label123:
         try {
            return;
         } catch (Throwable var15) {
            var10000 = var15;
            var10001 = false;
            break label123;
         }
      }

      while(true) {
         Throwable var17 = var10000;

         try {
            throw var17;
         } catch (Throwable var14) {
            var10000 = var14;
            var10001 = false;
            continue;
         }
      }
   }
}
