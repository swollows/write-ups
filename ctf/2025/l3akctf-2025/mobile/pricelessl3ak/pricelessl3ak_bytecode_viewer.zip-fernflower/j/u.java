package j;

import android.widget.PopupWindow;

public final class u implements PopupWindow.OnDismissListener {
   public final v a;

   public u(v var1) {
      this.a = var1;
   }

   public final void onDismiss() {
      this.a.c();
   }
}
