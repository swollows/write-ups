package j;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.appcompat.view.menu.ListMenuItemView;
import java.util.ArrayList;

public final class i extends BaseAdapter {
   public final l a;
   public int b = -1;
   public boolean c;
   public final boolean d;
   public final LayoutInflater e;
   public final int f;

   public i(l var1, LayoutInflater var2, boolean var3, int var4) {
      this.d = var3;
      this.e = var2;
      this.a = var1;
      this.f = var4;
      this.a();
   }

   public final void a() {
      l var4 = this.a;
      n var3 = var4.v;
      if (var3 != null) {
         var4.i();
         ArrayList var5 = var4.j;
         int var2 = var5.size();

         for(int var1 = 0; var1 < var2; ++var1) {
            if ((n)var5.get(var1) == var3) {
               this.b = var1;
               return;
            }
         }
      }

      this.b = -1;
   }

   public final n b(int var1) {
      l var4 = this.a;
      ArrayList var5;
      if (this.d) {
         var4.i();
         var5 = var4.j;
      } else {
         var5 = var4.l();
      }

      int var3 = this.b;
      int var2 = var1;
      if (var3 >= 0) {
         var2 = var1;
         if (var1 >= var3) {
            var2 = var1 + 1;
         }
      }

      return (n)var5.get(var2);
   }

   public final int getCount() {
      l var1 = this.a;
      ArrayList var2;
      if (this.d) {
         var1.i();
         var2 = var1.j;
      } else {
         var2 = var1.l();
      }

      return this.b < 0 ? var2.size() : var2.size() - 1;
   }

   public final long getItemId(int var1) {
      return (long)var1;
   }

   public final View getView(int var1, View var2, ViewGroup var3) {
      boolean var7 = false;
      View var8 = var2;
      if (var2 == null) {
         var8 = this.e.inflate(this.f, var3, false);
      }

      int var5 = this.b(var1).b;
      int var4 = var1 - 1;
      if (var4 >= 0) {
         var4 = this.b(var4).b;
      } else {
         var4 = var5;
      }

      ListMenuItemView var10 = (ListMenuItemView)var8;
      boolean var6 = var7;
      if (this.a.m()) {
         var6 = var7;
         if (var5 != var4) {
            var6 = true;
         }
      }

      var10.setGroupDividerEnabled(var6);
      y var9 = (y)var8;
      if (this.c) {
         var10.setForceShowIcon(true);
      }

      var9.c(this.b(var1));
      return var8;
   }

   public final void notifyDataSetChanged() {
      this.a();
      super.notifyDataSetChanged();
   }
}
