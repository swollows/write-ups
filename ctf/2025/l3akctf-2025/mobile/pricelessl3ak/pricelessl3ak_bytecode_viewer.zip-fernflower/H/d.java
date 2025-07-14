package H;

import android.text.TextPaint;

public final class d {
   public static final ThreadLocal b = new ThreadLocal();
   public final TextPaint a;

   public d() {
      TextPaint var1 = new TextPaint();
      this.a = var1;
      var1.setTextSize(10.0F);
   }
}
