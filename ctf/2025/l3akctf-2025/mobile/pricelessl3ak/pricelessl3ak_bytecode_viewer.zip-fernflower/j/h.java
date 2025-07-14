package j;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.WindowManager;
import android.widget.AdapterView;
import androidx.appcompat.view.menu.ExpandedMenuView;

public final class h implements x, AdapterView.OnItemClickListener {
   public Context a;
   public LayoutInflater b;
   public l c;
   public ExpandedMenuView d;
   public w e;
   public g f;

   public h(ContextWrapper var1) {
      this.a = var1;
      this.b = LayoutInflater.from(var1);
   }

   public final void a(l var1, boolean var2) {
      w var3 = this.e;
      if (var3 != null) {
         var3.a(var1, var2);
      }

   }

   public final void c() {
      g var1 = this.f;
      if (var1 != null) {
         var1.notifyDataSetChanged();
      }

   }

   public final boolean d(n var1) {
      return false;
   }

   public final void e(Context var1, l var2) {
      if (this.a != null) {
         this.a = var1;
         if (this.b == null) {
            this.b = LayoutInflater.from(var1);
         }
      }

      this.c = var2;
      g var3 = this.f;
      if (var3 != null) {
         var3.notifyDataSetChanged();
      }

   }

   public final boolean f() {
      return false;
   }

   public final void h(w var1) {
      throw null;
   }

   public final boolean i(D var1) {
      if (!var1.hasVisibleItems()) {
         return false;
      } else {
         Object var2 = new Object();
         ((m)var2).a = var1;
         Context var5 = var1.a;
         A.l var3 = new A.l(var5);
         androidx.appcompat.app.e var4 = (androidx.appcompat.app.e)var3.b;
         h var6 = new h(var4.a);
         ((m)var2).c = var6;
         var6.e = (w)var2;
         var1.b(var6, var5);
         h var10 = ((m)var2).c;
         if (var10.f == null) {
            var10.f = new g(var10);
         }

         var4.g = var10.f;
         var4.h = (DialogInterface.OnClickListener)var2;
         View var11 = var1.o;
         if (var11 != null) {
            var4.e = var11;
         } else {
            var4.c = var1.n;
            var4.d = var1.m;
         }

         var4.f = (m)var2;
         androidx.appcompat.app.i var8 = var3.a();
         ((m)var2).b = var8;
         var8.setOnDismissListener((DialogInterface.OnDismissListener)var2);
         WindowManager.LayoutParams var9 = ((m)var2).b.getWindow().getAttributes();
         var9.type = 1003;
         var9.flags |= 131072;
         ((m)var2).b.show();
         w var7 = this.e;
         if (var7 != null) {
            var7.c(var1);
         }

         return true;
      }
   }

   public final boolean j(n var1) {
      return false;
   }

   public final void onItemClick(AdapterView var1, View var2, int var3, long var4) {
      this.c.q(this.f.b(var3), this, 0);
   }
}
