package androidx.appcompat.app;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;

public final class d implements AdapterView.OnItemClickListener {
   public final h a;
   public final e b;

   public d(e var1, h var2) {
      this.b = var1;
      this.a = var2;
   }

   public final void onItemClick(AdapterView var1, View var2, int var3, long var4) {
      e var8 = this.b;
      DialogInterface.OnClickListener var6 = var8.h;
      h var7 = this.a;
      var6.onClick(var7.b, var3);
      if (!var8.i) {
         var7.b.dismiss();
      }

   }
}
