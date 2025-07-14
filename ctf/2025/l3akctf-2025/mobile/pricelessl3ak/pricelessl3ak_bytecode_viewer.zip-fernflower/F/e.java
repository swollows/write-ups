package F;

import android.os.Bundle;
import android.os.Build.VERSION;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.view.inputmethod.InputContentInfo;

public final class e extends InputConnectionWrapper {
   public final d a;

   public e(InputConnection var1, d var2) {
      super(var1, false);
      this.a = var2;
   }

   public final boolean commitContent(InputContentInfo var1, int var2, Bundle var3) {
      D.d var4 = null;
      if (var1 != null && VERSION.SDK_INT >= 25) {
         var4 = new D.d(3, new g(var1));
      }

      return this.a.a(var4, var2, var3) ? true : super.commitContent(var1, var2, var3);
   }
}
