package androidx.appcompat.app;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

public final class f extends Handler {
   public WeakReference a;

   public final void handleMessage(Message var1) {
      int var2 = var1.what;
      if (var2 != -3 && var2 != -2 && var2 != -1) {
         if (var2 == 1) {
            ((DialogInterface)var1.obj).dismiss();
         }
      } else {
         ((DialogInterface.OnClickListener)var1.obj).onClick((DialogInterface)this.a.get(), var1.what);
      }

   }
}
