package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.TextView;

public final class p1 {
   public final Context a;
   public final View b;
   public final TextView c;
   public final WindowManager.LayoutParams d;
   public final Rect e;
   public final int[] f;
   public final int[] g;

   public p1(Context var1) {
      WindowManager.LayoutParams var3 = new WindowManager.LayoutParams();
      this.d = var3;
      this.e = new Rect();
      this.f = new int[2];
      this.g = new int[2];
      this.a = var1;
      View var2 = LayoutInflater.from(var1).inflate(2131427355, (ViewGroup)null);
      this.b = var2;
      this.c = (TextView)var2.findViewById(2131230829);
      var3.setTitle(p1.class.getSimpleName());
      var3.packageName = var1.getPackageName();
      var3.type = 1002;
      var3.width = -2;
      var3.height = -2;
      var3.format = -3;
      var3.windowAnimations = 2131623940;
      var3.flags = 24;
   }
}
