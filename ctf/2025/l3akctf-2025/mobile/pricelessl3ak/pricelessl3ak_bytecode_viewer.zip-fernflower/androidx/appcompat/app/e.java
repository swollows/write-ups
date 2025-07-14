package androidx.appcompat.app;

import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;

public final class e {
   public final ContextThemeWrapper a;
   public final LayoutInflater b;
   public Drawable c;
   public CharSequence d;
   public View e;
   public j.m f;
   public Object g;
   public DialogInterface.OnClickListener h;
   public boolean i;
   public int j = -1;

   public e(ContextThemeWrapper var1) {
      this.a = var1;
      this.b = (LayoutInflater)var1.getSystemService("layout_inflater");
   }
}
