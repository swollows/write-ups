package i;

import D.Z;
import android.view.View;
import android.view.animation.BaseInterpolator;
import androidx.appcompat.widget.k1;
import java.util.ArrayList;
import java.util.Iterator;

public final class j {
   public final ArrayList a = new ArrayList();
   public long b = -1L;
   public BaseInterpolator c;
   public C.b d;
   public boolean e;
   public final k1 f = new k1(this);

   public final void a() {
      if (this.e) {
         Iterator var1 = this.a.iterator();

         while(var1.hasNext()) {
            ((Z)var1.next()).b();
         }

         this.e = false;
      }
   }

   public final void b() {
      if (!this.e) {
         Iterator var3 = this.a.iterator();

         while(var3.hasNext()) {
            Z var4 = (Z)var3.next();
            long var1 = this.b;
            if (var1 >= 0L) {
               var4.c(var1);
            }

            BaseInterpolator var5 = this.c;
            if (var5 != null) {
               View var6 = (View)var4.a.get();
               if (var6 != null) {
                  var6.animate().setInterpolator(var5);
               }
            }

            if (this.d != null) {
               var4.d(this.f);
            }

            View var7 = (View)var4.a.get();
            if (var7 != null) {
               var7.animate().start();
            }
         }

         this.e = true;
      }
   }
}
