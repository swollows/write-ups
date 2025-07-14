package j;

import android.content.DialogInterface;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;

public final class m implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, w {
   public D a;
   public androidx.appcompat.app.i b;
   public h c;

   public final void a(l var1, boolean var2) {
      if (var2 || var1 == this.a) {
         androidx.appcompat.app.i var3 = this.b;
         if (var3 != null) {
            var3.dismiss();
         }
      }

   }

   public final boolean c(l var1) {
      return false;
   }

   public final void onClick(DialogInterface var1, int var2) {
      h var3 = this.c;
      if (var3.f == null) {
         var3.f = new g(var3);
      }

      n var4 = var3.f.b(var2);
      this.a.q(var4, (x)null, 0);
   }

   public final void onDismiss(DialogInterface var1) {
      this.c.a(this.a, true);
   }

   public final boolean onKey(DialogInterface var1, int var2, KeyEvent var3) {
      D var4 = this.a;
      if (var2 == 82 || var2 == 4) {
         if (var3.getAction() == 0 && var3.getRepeatCount() == 0) {
            Window var6 = this.b.getWindow();
            if (var6 != null) {
               View var7 = var6.getDecorView();
               if (var7 != null) {
                  KeyEvent.DispatcherState var8 = var7.getKeyDispatcherState();
                  if (var8 != null) {
                     var8.startTracking(var3, this);
                     return true;
                  }
               }
            }
         } else if (var3.getAction() == 1 && !var3.isCanceled()) {
            Window var5 = this.b.getWindow();
            if (var5 != null) {
               View var9 = var5.getDecorView();
               if (var9 != null) {
                  KeyEvent.DispatcherState var10 = var9.getKeyDispatcherState();
                  if (var10 != null && var10.isTracking(var3)) {
                     var4.c(true);
                     var1.dismiss();
                     return true;
                  }
               }
            }
         }
      }

      return var4.performShortcut(var2, var3, 0);
   }
}
