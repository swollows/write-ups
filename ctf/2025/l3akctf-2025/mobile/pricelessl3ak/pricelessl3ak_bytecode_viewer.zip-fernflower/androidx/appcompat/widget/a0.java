package androidx.appcompat.widget;

import android.graphics.Typeface;
import android.widget.TextView;

public final class a0 implements Runnable {
   public final TextView a;
   public final Typeface b;
   public final int c;

   public a0(TextView var1, Typeface var2, int var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
   }

   public final void run() {
      Typeface var2 = this.b;
      int var1 = this.c;
      this.a.setTypeface(var2, var1);
   }
}
