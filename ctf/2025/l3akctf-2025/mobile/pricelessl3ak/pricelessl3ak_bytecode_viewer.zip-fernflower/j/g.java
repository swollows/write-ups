package j;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

public final class g extends BaseAdapter {
   public int a;
   public final h b;

   public g(h var1) {
      this.b = var1;
      this.a = -1;
      this.a();
   }

   public final void a() {
      l var4 = this.b.c;
      n var3 = var4.v;
      if (var3 != null) {
         var4.i();
         ArrayList var5 = var4.j;
         int var2 = var5.size();

         for(int var1 = 0; var1 < var2; ++var1) {
            if ((n)var5.get(var1) == var3) {
               this.a = var1;
               return;
            }
         }
      }

      this.a = -1;
   }

   public final n b(int var1) {
      h var4 = this.b;
      l var5 = var4.c;
      var5.i();
      ArrayList var6 = var5.j;
      var4.getClass();
      int var3 = this.a;
      int var2 = var1;
      if (var3 >= 0) {
         var2 = var1;
         if (var1 >= var3) {
            var2 = var1 + 1;
         }
      }

      return (n)var6.get(var2);
   }

   public final int getCount() {
      h var3 = this.b;
      l var2 = var3.c;
      var2.i();
      int var1 = var2.j.size();
      var3.getClass();
      return this.a < 0 ? var1 : var1 - 1;
   }

   public final long getItemId(int var1) {
      return (long)var1;
   }

   public final View getView(int var1, View var2, ViewGroup var3) {
      View var4 = var2;
      if (var2 == null) {
         var4 = this.b.b.inflate(2131427344, var3, false);
      }

      ((y)var4).c(this.b(var1));
      return var4;
   }

   public final void notifyDataSetChanged() {
      this.a();
      super.notifyDataSetChanged();
   }
}
