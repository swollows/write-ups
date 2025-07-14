package b;

import D.C;
import android.window.BackEvent;

public final class a {
   public final float a;
   public final float b;
   public final float c;
   public final int d;

   public a(BackEvent var1) {
      float var2 = C.k(var1);
      float var3 = C.l(var1);
      float var4 = C.h(var1);
      int var5 = C.j(var1);
      super();
      this.a = var2;
      this.b = var3;
      this.c = var4;
      this.d = var5;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder("BackEventCompat{touchX=");
      var1.append(this.a);
      var1.append(", touchY=");
      var1.append(this.b);
      var1.append(", progress=");
      var1.append(this.c);
      var1.append(", swipeEdge=");
      var1.append(this.d);
      var1.append('}');
      return var1.toString();
   }
}
