package j;

import android.content.Context;
import android.graphics.Rect;
import android.view.MenuItem;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;

public abstract class t implements B, x, AdapterView.OnItemClickListener {
   public Rect a;

   public static int m(ListAdapter var0, Context var1, int var2) {
      int var4 = 0;
      int var10 = MeasureSpec.makeMeasureSpec(0, 0);
      int var8 = MeasureSpec.makeMeasureSpec(0, 0);
      int var9 = var0.getCount();
      int var3 = 0;
      int var6 = 0;
      FrameLayout var12 = null;

      View var13;
      for(View var11 = null; var4 < var9; var11 = var13) {
         int var7 = var0.getItemViewType(var4);
         int var5 = var6;
         var13 = var11;
         if (var7 != var6) {
            var13 = null;
            var5 = var7;
         }

         FrameLayout var14 = var12;
         if (var12 == null) {
            var14 = new FrameLayout(var1);
         }

         var13 = var0.getView(var4, var13, var14);
         var13.measure(var10, var8);
         var7 = var13.getMeasuredWidth();
         if (var7 >= var2) {
            return var2;
         }

         var6 = var3;
         if (var7 > var3) {
            var6 = var7;
         }

         ++var4;
         var3 = var6;
         var6 = var5;
         var12 = var14;
      }

      return var3;
   }

   public static boolean u(l var0) {
      int var2 = var0.f.size();
      boolean var4 = false;
      int var1 = 0;

      boolean var3;
      while(true) {
         var3 = var4;
         if (var1 >= var2) {
            break;
         }

         MenuItem var5 = var0.getItem(var1);
         if (var5.isVisible() && var5.getIcon() != null) {
            var3 = true;
            break;
         }

         ++var1;
      }

      return var3;
   }

   public final boolean d(n var1) {
      return false;
   }

   public final void e(Context var1, l var2) {
   }

   public final boolean j(n var1) {
      return false;
   }

   public abstract void l(l var1);

   public abstract void n(View var1);

   public abstract void o(boolean var1);

   public final void onItemClick(AdapterView var1, View var2, int var3, long var4) {
      ListAdapter var7 = (ListAdapter)var1.getAdapter();
      i var6;
      if (var7 instanceof HeaderViewListAdapter) {
         var6 = (i)((HeaderViewListAdapter)var7).getWrappedAdapter();
      } else {
         var6 = (i)var7;
      }

      l var8 = var6.a;
      MenuItem var9 = (MenuItem)var7.getItem(var3);
      byte var10;
      if (!(this instanceof f)) {
         var10 = 0;
      } else {
         var10 = 4;
      }

      var8.q(var9, this, var10);
   }

   public abstract void p(int var1);

   public abstract void q(int var1);

   public abstract void r(PopupWindow.OnDismissListener var1);

   public abstract void s(boolean var1);

   public abstract void t(int var1);
}
