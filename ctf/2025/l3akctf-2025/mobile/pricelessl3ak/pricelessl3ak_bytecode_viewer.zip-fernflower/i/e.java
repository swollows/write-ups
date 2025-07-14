package i;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;

public final class e extends b implements j.j {
   public Context c;
   public ActionBarContextView d;
   public A.c e;
   public WeakReference f;
   public boolean g;
   public j.l h;

   public final void a() {
      if (!this.g) {
         this.g = true;
         this.e.e(this);
      }
   }

   public final View b() {
      WeakReference var1 = this.f;
      View var2;
      if (var1 != null) {
         var2 = (View)var1.get();
      } else {
         var2 = null;
      }

      return var2;
   }

   public final j.l c() {
      return this.h;
   }

   public final MenuInflater d() {
      return new i(this.d.getContext());
   }

   public final CharSequence e() {
      return this.d.getSubtitle();
   }

   public final CharSequence f() {
      return this.d.getTitle();
   }

   public final void g() {
      j.l var1 = this.h;
      this.e.c(this, var1);
   }

   public final boolean h() {
      return this.d.s;
   }

   public final void i(j.l var1) {
      this.g();
      androidx.appcompat.widget.m var2 = this.d.d;
      if (var2 != null) {
         var2.l();
      }

   }

   public final void j(View var1) {
      this.d.setCustomView(var1);
      WeakReference var2;
      if (var1 != null) {
         var2 = new WeakReference(var1);
      } else {
         var2 = null;
      }

      this.f = var2;
   }

   public final boolean k(j.l var1, MenuItem var2) {
      return ((a)this.e.a).a(this, var2);
   }

   public final void l(int var1) {
      this.m(this.c.getString(var1));
   }

   public final void m(CharSequence var1) {
      this.d.setSubtitle(var1);
   }

   public final void n(int var1) {
      this.o(this.c.getString(var1));
   }

   public final void o(CharSequence var1) {
      this.d.setTitle(var1);
   }

   public final void p(boolean var1) {
      super.b = var1;
      this.d.setTitleOptional(var1);
   }
}
