package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import java.util.List;

public final class ProcessLifecycleInitializer implements S.b {
   public final List a() {
      return Z.p.a;
   }

   public final Object b(Context var1) {
      i0.d.e(var1, "context");
      S.a var2 = S.a.c(var1);
      i0.d.d(var2, "getInstance(...)");
      if (var2.b.contains(ProcessLifecycleInitializer.class)) {
         if (!r.a.getAndSet(true)) {
            Context var3 = var1.getApplicationContext();
            i0.d.c(var3, "null cannot be cast to non-null type android.app.Application");
            ((Application)var3).registerActivityLifecycleCallbacks(new q());
         }

         B var4 = B.i;
         var4.getClass();
         var4.e = new Handler();
         var4.f.e(n.ON_CREATE);
         var1 = var1.getApplicationContext();
         i0.d.c(var1, "null cannot be cast to non-null type android.app.Application");
         ((Application)var1).registerActivityLifecycleCallbacks(new A(var4));
         return var4;
      } else {
         throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml");
      }
   }
}
