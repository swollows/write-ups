package androidx.appcompat.widget;

import android.database.DataSetObserver;

public final class I0 extends DataSetObserver {
   public final L0 a;

   public I0(L0 var1) {
      this.a = var1;
   }

   public final void onChanged() {
      L0 var1 = this.a;
      if (var1.y.isShowing()) {
         var1.k();
      }

   }

   public final void onInvalidated() {
      this.a.dismiss();
   }
}
