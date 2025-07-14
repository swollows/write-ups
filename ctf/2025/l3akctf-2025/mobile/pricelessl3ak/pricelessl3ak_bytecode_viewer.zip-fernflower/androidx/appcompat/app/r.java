package androidx.appcompat.app;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.lang.ref.WeakReference;

public abstract class r {
   public static final p a = new p((q)(new Object()));
   public static final int b = -100;
   public static z.b c = null;
   public static z.b d = null;
   public static Boolean e = null;
   public static boolean f = false;
   public static final m.g g = new m.g();
   public static final Object h = new Object();
   public static final Object i = new Object();

   public static boolean c(Context var0) {
      if (e == null) {
         label27: {
            boolean var10001;
            Bundle var6;
            try {
               int var1 = M.a;
               var1 = L.a();
               PackageManager var3 = var0.getPackageManager();
               ComponentName var2 = new ComponentName(var0, M.class);
               var6 = var3.getServiceInfo(var2, var1 | 128).metaData;
            } catch (PackageManager.NameNotFoundException var5) {
               var10001 = false;
               break label27;
            }

            if (var6 == null) {
               return e;
            }

            try {
               e = var6.getBoolean("autoStoreLocales");
               return e;
            } catch (PackageManager.NameNotFoundException var4) {
               var10001 = false;
            }
         }

         Log.d("AppCompatDelegate", "Checking for metadata for AppLocalesMetadataHolderService : Service not found");
         e = Boolean.FALSE;
      }

      return e;
   }

   public static void f(H var0) {
      Object var1 = h;
      synchronized(var1){}

      Throwable var10000;
      boolean var10001;
      label297: {
         m.b var2;
         try {
            m.g var3 = g;
            var3.getClass();
            var2 = new m.b(var3);
         } catch (Throwable var32) {
            var10000 = var32;
            var10001 = false;
            break label297;
         }

         while(true) {
            r var35;
            label294: {
               try {
                  if (var2.hasNext()) {
                     var35 = (r)((WeakReference)var2.next()).get();
                     break label294;
                  }
               } catch (Throwable var33) {
                  var10000 = var33;
                  var10001 = false;
                  break;
               }

               try {
                  return;
               } catch (Throwable var30) {
                  var10000 = var30;
                  var10001 = false;
                  break;
               }
            }

            if (var35 == var0 || var35 == null) {
               try {
                  var2.remove();
               } catch (Throwable var31) {
                  var10000 = var31;
                  var10001 = false;
                  break;
               }
            }
         }
      }

      while(true) {
         Throwable var34 = var10000;

         try {
            throw var34;
         } catch (Throwable var29) {
            var10000 = var29;
            var10001 = false;
            continue;
         }
      }
   }

   public abstract void a();

   public abstract void b();

   public abstract void d();

   public abstract void e();

   public abstract boolean g(int var1);

   public abstract void h(int var1);

   public abstract void j(View var1);

   public abstract void l(View var1, ViewGroup.LayoutParams var2);

   public abstract void m(CharSequence var1);

   public abstract i.b n(i.a var1);
}
