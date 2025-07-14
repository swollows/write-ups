package androidx.appcompat.widget;

import android.content.Context;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.widget.HeaderViewListAdapter;
import android.widget.ListAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import j.n;

public final class P0 extends y0 {
   public final int m;
   public final int n;
   public M0 o;
   public n p;

   public P0(Context var1, boolean var2) {
      super(var1, var2);
      if (1 == var1.getResources().getConfiguration().getLayoutDirection()) {
         this.m = 21;
         this.n = 22;
      } else {
         this.m = 22;
         this.n = 21;
      }

   }

   public final boolean onHoverEvent(MotionEvent var1) {
      if (this.o != null) {
         ListAdapter var4 = this.getAdapter();
         int var2;
         j.i var8;
         if (var4 instanceof HeaderViewListAdapter) {
            HeaderViewListAdapter var7 = (HeaderViewListAdapter)var4;
            var2 = var7.getHeadersCount();
            var8 = (j.i)var7.getWrappedAdapter();
         } else {
            var8 = (j.i)var4;
            var2 = 0;
         }

         n var5;
         label30: {
            if (var1.getAction() != 10) {
               int var3 = this.pointToPosition((int)var1.getX(), (int)var1.getY());
               if (var3 != -1) {
                  var2 = var3 - var2;
                  if (var2 >= 0 && var2 < var8.getCount()) {
                     var5 = var8.b(var2);
                     break label30;
                  }
               }
            }

            var5 = null;
         }

         n var6 = this.p;
         if (var6 != var5) {
            j.l var9 = var8.a;
            if (var6 != null) {
               this.o.j(var9, var6);
            }

            this.p = var5;
            if (var5 != null) {
               this.o.f(var9, var5);
            }
         }
      }

      return super.onHoverEvent(var1);
   }

   public final boolean onKeyDown(int var1, KeyEvent var2) {
      ListMenuItemView var3 = (ListMenuItemView)this.getSelectedView();
      if (var3 != null && var1 == this.m) {
         if (var3.isEnabled() && var3.getItemData().hasSubMenu()) {
            this.performItemClick(var3, this.getSelectedItemPosition(), this.getSelectedItemId());
         }

         return true;
      } else if (var3 != null && var1 == this.n) {
         this.setSelection(-1);
         ListAdapter var4 = this.getAdapter();
         j.i var5;
         if (var4 instanceof HeaderViewListAdapter) {
            var5 = (j.i)((HeaderViewListAdapter)var4).getWrappedAdapter();
         } else {
            var5 = (j.i)var4;
         }

         var5.a.c(false);
         return true;
      } else {
         return super.onKeyDown(var1, var2);
      }
   }

   public void setHoverListener(M0 var1) {
      this.o = var1;
   }
}
