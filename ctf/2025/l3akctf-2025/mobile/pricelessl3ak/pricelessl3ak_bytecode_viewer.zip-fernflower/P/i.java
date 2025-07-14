package P;

import D.z;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build.VERSION;
import androidx.appcompat.app.H;
import androidx.appcompat.app.n;
import androidx.appcompat.app.r;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import z.b;

public final class i implements Runnable {
   public final int a;
   public final Context b;

   // $FF: synthetic method
   public i(Context var1, int var2) {
      this.a = var2;
      this.b = var1;
   }

   public final void run() {
      Object var2;
      switch (this.a) {
         case 0:
            (new ThreadPoolExecutor(0, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue())).execute(new i(this.b, 1));
            return;
         case 1:
            var2 = new Object();
            z var3 = g.a;
            g.t(this.b, (Executor)var2, var3, false);
            return;
         default:
            int var1 = VERSION.SDK_INT;
            if (var1 >= 33) {
               Context var4 = this.b;
               ComponentName var8 = new ComponentName(var4, "androidx.appcompat.app.AppLocalesMetadataHolderService");
               if (var4.getPackageManager().getComponentEnabledSetting(var8) != 1) {
                  b var9;
                  label44: {
                     if (var1 >= 33) {
                        m.g var6 = r.g;
                        var6.getClass();
                        m.b var7 = new m.b(var6);

                        while(true) {
                           if (!var7.hasNext()) {
                              var2 = null;
                              break;
                           }

                           r var5 = (r)((WeakReference)var7.next()).get();
                           if (var5 != null) {
                              Context var11 = ((H)var5).k;
                              if (var11 != null) {
                                 var2 = var11.getSystemService("locale");
                                 break;
                              }
                           }
                        }

                        if (var2 != null) {
                           var9 = new b(new z.c(n.a(var2)));
                           break label44;
                        }
                     } else {
                        var9 = r.c;
                        if (var9 != null) {
                           break label44;
                        }
                     }

                     var9 = z.b.b;
                  }

                  if (var9.a.a.isEmpty()) {
                     String var10 = t.c.e(var4);
                     Object var12 = var4.getSystemService("locale");
                     if (var12 != null) {
                        n.b(var12, androidx.appcompat.app.m.a(var10));
                     }
                  }

                  var4.getPackageManager().setComponentEnabledSetting(var8, 1, 1);
               }
            }

            r.f = true;
      }
   }
}
