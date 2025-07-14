package b;

import android.os.Build.VERSION;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.y;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public final class t {
   public final Runnable a;
   public final Z.f b;
   public androidx.fragment.app.o c;
   public final OnBackInvokedCallback d;
   public OnBackInvokedDispatcher e;
   public boolean f;
   public boolean g;

   public t(Runnable var1) {
      this.a = var1;
      this.b = new Z.f();
      int var2 = VERSION.SDK_INT;
      if (var2 >= 33) {
         Object var3;
         if (var2 >= 34) {
            var3 = new p(new n(this, 0), new n(this, 1), new o(this, 0), new o(this, 1));
         } else {
            var3 = new y(2, new o(this, 2));
         }

         this.d = (OnBackInvokedCallback)var3;
      }

   }

   public final void a() {
      if (this.c == null) {
         Z.f var1 = this.b;
         ListIterator var2 = var1.listIterator(var1.size());

         Object var3;
         do {
            if (!var2.hasPrevious()) {
               var3 = null;
               break;
            }

            var3 = var2.previous();
         } while(!((androidx.fragment.app.o)var3).a);

         androidx.fragment.app.o var4 = (androidx.fragment.app.o)var3;
      }

      this.c = null;
   }

   public final void b() {
      androidx.fragment.app.o var4 = this.c;
      androidx.fragment.app.o var3 = var4;
      if (var4 == null) {
         Z.f var9 = this.b;
         var9.getClass();
         ListIterator var11 = var9.listIterator(var9.c);

         Object var10;
         do {
            if (!var11.hasPrevious()) {
               var10 = null;
               break;
            }

            var10 = var11.previous();
         } while(!((androidx.fragment.app.o)var10).a);

         var3 = (androidx.fragment.app.o)var10;
      }

      this.c = null;
      if (var3 == null) {
         this.a.run();
      } else {
         androidx.fragment.app.t var13 = var3.d;
         var13.e(true);
         if (var13.g.a) {
            var13.e(false);
            var13.d(true);
            ArrayList var5 = var13.B;
            ArrayList var6 = var13.C;
            ArrayList var12 = var13.d;
            int var1;
            if (var12 != null && !var12.isEmpty()) {
               var1 = var13.d.size() - 1;
            } else {
               var1 = -1;
            }

            if (var1 >= 0) {
               for(int var2 = var13.d.size() - 1; var2 >= var1; --var2) {
                  var5.add((androidx.fragment.app.a)var13.d.remove(var2));
                  var6.add(Boolean.TRUE);
               }

               var13.b = true;

               try {
                  var13.i(var13.B, var13.C);
               } finally {
                  var13.a();
               }
            }

            var13.j();
            var13.c.b.values().removeAll(Collections.singleton((Object)null));
         } else {
            var13.f.b();
         }

      }
   }

   public final void c(boolean var1) {
      OnBackInvokedDispatcher var2 = this.e;
      OnBackInvokedCallback var3 = this.d;
      if (var2 != null && var3 != null) {
         if (var1 && !this.f) {
            E.f.e(var2, var3);
            this.f = true;
         } else if (!var1 && this.f) {
            E.f.f(var2, var3);
            this.f = false;
         }
      }

   }

   public final void d() {
      boolean var3 = this.g;
      boolean var2 = false;
      Z.f var4 = this.b;
      boolean var1;
      if (var4 != null && var4.isEmpty()) {
         var1 = var2;
      } else {
         Iterator var5 = var4.iterator();

         while(true) {
            var1 = var2;
            if (!var5.hasNext()) {
               break;
            }

            if (((androidx.fragment.app.o)var5.next()).a) {
               var1 = true;
               break;
            }
         }
      }

      this.g = var1;
      if (var1 != var3 && VERSION.SDK_INT >= 33) {
         this.c(var1);
      }

   }
}
