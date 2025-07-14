package H;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ThreadPoolExecutor;

public final class t implements i {
   public final Context a;
   public final A.g b;
   public final D.z c;
   public final Object d;
   public Handler e;
   public ThreadPoolExecutor f;
   public ThreadPoolExecutor g;
   public C.b h;

   public t(Context var1, A.g var2) {
      D.z var3 = u.d;
      super();
      this.d = new Object();
      C.b.f(var1, "Context cannot be null");
      this.a = var1.getApplicationContext();
      this.b = var2;
      this.c = var3;
   }

   public final void a() {
      Object var1 = this.d;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label344: {
         Handler var2;
         try {
            this.h = null;
            var2 = this.e;
         } catch (Throwable var44) {
            var10000 = var44;
            var10001 = false;
            break label344;
         }

         if (var2 != null) {
            try {
               var2.removeCallbacks((Runnable)null);
            } catch (Throwable var43) {
               var10000 = var43;
               var10001 = false;
               break label344;
            }
         }

         ThreadPoolExecutor var45;
         try {
            this.e = null;
            var45 = this.g;
         } catch (Throwable var42) {
            var10000 = var42;
            var10001 = false;
            break label344;
         }

         if (var45 != null) {
            try {
               var45.shutdown();
            } catch (Throwable var41) {
               var10000 = var41;
               var10001 = false;
               break label344;
            }
         }

         label325:
         try {
            this.f = null;
            this.g = null;
            return;
         } catch (Throwable var40) {
            var10000 = var40;
            var10001 = false;
            break label325;
         }
      }

      while(true) {
         Throwable var46 = var10000;

         try {
            throw var46;
         } catch (Throwable var39) {
            var10000 = var39;
            var10001 = false;
            continue;
         }
      }
   }

   public final A.m b() {
      A.l var6;
      try {
         D.z var4 = this.c;
         Context var2 = this.a;
         A.g var3 = this.b;
         var4.getClass();
         ArrayList var10 = new ArrayList(1);
         Object var9 = (new Object[]{var3})[0];
         Objects.requireNonNull(var9);
         var10.add(var9);
         var6 = A.f.a(var2, Collections.unmodifiableList(var10));
      } catch (PackageManager.NameNotFoundException var5) {
         throw new RuntimeException("provider not found", var5);
      }

      int var1 = var6.a;
      if (var1 == 0) {
         A.m[] var8 = (A.m[])((List)var6.b).get(0);
         if (var8 != null && var8.length != 0) {
            return var8[0];
         } else {
            throw new RuntimeException("fetchFonts failed (empty result)");
         }
      } else {
         StringBuilder var7 = new StringBuilder("fetchFonts failed (");
         var7.append(var1);
         var7.append(")");
         throw new RuntimeException(var7.toString());
      }
   }

   public final void r(C.b param1) {
      // $FF: Couldn't be decompiled
   }
}
