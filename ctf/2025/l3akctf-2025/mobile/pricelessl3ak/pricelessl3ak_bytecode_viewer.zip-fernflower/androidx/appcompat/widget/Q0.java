package androidx.appcompat.widget;

import D.d;
import android.content.Context;
import android.os.Build.VERSION;
import android.util.Log;
import android.widget.PopupWindow;
import j.n;
import java.lang.reflect.Method;

public final class Q0 extends L0 implements M0 {
   public static final Method C;
   public d B;

   static {
      try {
         if (VERSION.SDK_INT <= 28) {
            C = PopupWindow.class.getDeclaredMethod("setTouchModal", Boolean.TYPE);
         }
      } catch (NoSuchMethodException var1) {
         Log.i("MenuPopupWindow", "Could not find method setTouchModal() on PopupWindow. Oh well.");
      }

   }

   public final y0 a(Context var1, boolean var2) {
      P0 var3 = new P0(var1, var2);
      var3.setHoverListener(this);
      return var3;
   }

   public final void f(j.l var1, n var2) {
      d var3 = this.B;
      if (var3 != null) {
         var3.f(var1, var2);
      }

   }

   public final void j(j.l var1, n var2) {
      d var3 = this.B;
      if (var3 != null) {
         var3.j(var1, var2);
      }

   }
}
