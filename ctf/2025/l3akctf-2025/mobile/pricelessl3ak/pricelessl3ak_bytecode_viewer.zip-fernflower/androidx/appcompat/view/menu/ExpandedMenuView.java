package androidx.appcompat.view.menu;

import X.h;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import j.k;
import j.l;
import j.n;
import j.x;
import j.z;

public final class ExpandedMenuView extends ListView implements k, z, AdapterView.OnItemClickListener {
   public static final int[] b = new int[]{16842964, 16843049};
   public l a;

   public ExpandedMenuView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.setOnItemClickListener(this);
      h var4 = h.m(var1, var2, b, 16842868);
      TypedArray var3 = (TypedArray)var4.b;
      if (var3.hasValue(0)) {
         this.setBackgroundDrawable(var4.h(0));
      }

      if (var3.hasValue(1)) {
         this.setDivider(var4.h(1));
      }

      var4.o();
   }

   public final void a(l var1) {
      this.a = var1;
   }

   public final boolean b(n var1) {
      return this.a.q(var1, (x)null, 0);
   }

   public int getWindowAnimations() {
      return 0;
   }

   public final void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      this.setChildrenDrawingCacheEnabled(false);
   }

   public final void onItemClick(AdapterView var1, View var2, int var3, long var4) {
      this.b((n)this.getAdapter().getItem(var3));
   }
}
