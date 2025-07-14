package androidx.emoji2.text;

import D.d;
import H.j;
import H.k;
import H.u;
import S.a;
import S.b;
import android.content.Context;
import androidx.lifecycle.ProcessLifecycleInitializer;
import androidx.lifecycle.p;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class EmojiCompatInitializer implements b {
   public final List a() {
      return Collections.singletonList(ProcessLifecycleInitializer.class);
   }

   public final Object b(Context var1) {
      u var4 = new u(new d(var1));
      var4.b = 1;
      Object var2;
      Throwable var10000;
      boolean var10001;
      Throwable var61;
      if (j.k == null) {
         label595: {
            var2 = j.j;
            synchronized(var2){}

            label594: {
               try {
                  if (j.k == null) {
                     j var3 = new j(var4);
                     j.k = var3;
                  }
               } catch (Throwable var60) {
                  var10000 = var60;
                  var10001 = false;
                  break label594;
               }

               label578:
               try {
                  break label595;
               } catch (Throwable var59) {
                  var10000 = var59;
                  var10001 = false;
                  break label578;
               }
            }

            while(true) {
               var61 = var10000;

               try {
                  throw var61;
               } catch (Throwable var55) {
                  var10000 = var55;
                  var10001 = false;
                  continue;
               }
            }
         }
      }

      a var66 = a.c(var1);
      var66.getClass();
      Object var64 = a.e;
      synchronized(var64){}

      Object var62;
      label592: {
         label593: {
            try {
               var2 = var66.a.get(ProcessLifecycleInitializer.class);
            } catch (Throwable var58) {
               var10000 = var58;
               var10001 = false;
               break label593;
            }

            var62 = var2;
            if (var2 == null) {
               try {
                  HashSet var63 = new HashSet();
                  var62 = var66.b(ProcessLifecycleInitializer.class, var63);
               } catch (Throwable var57) {
                  var10000 = var57;
                  var10001 = false;
                  break label593;
               }
            }

            label562:
            try {
               break label592;
            } catch (Throwable var56) {
               var10000 = var56;
               var10001 = false;
               break label562;
            }
         }

         while(true) {
            var61 = var10000;

            try {
               throw var61;
            } catch (Throwable var54) {
               var10000 = var54;
               var10001 = false;
               continue;
            }
         }
      }

      p var65 = ((androidx.lifecycle.u)var62).getLifecycle();
      var65.a(new k(this, var65));
      return Boolean.TRUE;
   }
}
