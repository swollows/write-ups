package D;

import android.os.Build.VERSION;
import android.view.View;
import java.util.Objects;
import w.c;

public class o0 {
   public static final p0 b;
   public final p0 a;

   static {
      int var0 = VERSION.SDK_INT;
      Object var1;
      if (var0 >= 34) {
         var1 = new f0();
      } else if (var0 >= 30) {
         var1 = new e0();
      } else if (var0 >= 29) {
         var1 = new d0();
      } else {
         var1 = new b0();
      }

      b = ((g0)var1).b().a.a().a.b().a.c();
   }

   public o0(p0 var1) {
      this.a = var1;
   }

   public p0 a() {
      return this.a;
   }

   public p0 b() {
      return this.a;
   }

   public p0 c() {
      return this.a;
   }

   public void d(View var1) {
   }

   public k e() {
      return null;
   }

   public boolean equals(Object var1) {
      boolean var2 = true;
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof o0)) {
         return false;
      } else {
         o0 var3 = (o0)var1;
         if (this.j() != var3.j() || this.i() != var3.i() || !Objects.equals(this.g(), var3.g()) || !Objects.equals(this.f(), var3.f()) || !Objects.equals(this.e(), var3.e())) {
            var2 = false;
         }

         return var2;
      }
   }

   public c f() {
      return c.e;
   }

   public c g() {
      return c.e;
   }

   public p0 h(int var1, int var2, int var3, int var4) {
      return b;
   }

   public int hashCode() {
      return Objects.hash(new Object[]{this.j(), this.i(), this.g(), this.f(), this.e()});
   }

   public boolean i() {
      return false;
   }

   public boolean j() {
      return false;
   }

   public void k(c[] var1) {
   }

   public void l(p0 var1) {
   }

   public void m(c var1) {
   }

   public void n(int var1) {
   }
}
