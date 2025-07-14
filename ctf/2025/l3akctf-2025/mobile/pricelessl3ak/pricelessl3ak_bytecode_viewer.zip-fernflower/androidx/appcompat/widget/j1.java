package androidx.appcompat.widget;

import android.content.Context;
import android.view.View;
import android.view.Window;

public final class j1 implements View.OnClickListener {
   public final j.a a;
   public final l1 b;

   public j1(l1 var1) {
      this.b = var1;
      Context var2 = var1.a.getContext();
      CharSequence var3 = var1.h;
      Object var4 = new Object();
      ((j.a)var4).e = 4096;
      ((j.a)var4).g = 4096;
      ((j.a)var4).l = null;
      ((j.a)var4).m = null;
      ((j.a)var4).n = false;
      ((j.a)var4).o = false;
      ((j.a)var4).p = 16;
      ((j.a)var4).i = var2;
      ((j.a)var4).a = var3;
      this.a = (j.a)var4;
   }

   public final void onClick(View var1) {
      l1 var3 = this.b;
      Window.Callback var2 = var3.k;
      if (var2 != null && var3.l) {
         var2.onMenuItemSelected(0, this.a);
      }

   }
}
