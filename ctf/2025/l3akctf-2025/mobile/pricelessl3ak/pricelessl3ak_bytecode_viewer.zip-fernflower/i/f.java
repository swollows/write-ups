package i;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import j.A;

public final class f extends ActionMode {
   public final Context a;
   public final b b;

   public f(Context var1, b var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void finish() {
      this.b.a();
   }

   public final View getCustomView() {
      return this.b.b();
   }

   public final Menu getMenu() {
      j.l var1 = this.b.c();
      return new A(this.a, var1);
   }

   public final MenuInflater getMenuInflater() {
      return this.b.d();
   }

   public final CharSequence getSubtitle() {
      return this.b.e();
   }

   public final Object getTag() {
      return this.b.a;
   }

   public final CharSequence getTitle() {
      return this.b.f();
   }

   public final boolean getTitleOptionalHint() {
      return this.b.b;
   }

   public final void invalidate() {
      this.b.g();
   }

   public final boolean isTitleOptional() {
      return this.b.h();
   }

   public final void setCustomView(View var1) {
      this.b.j(var1);
   }

   public final void setSubtitle(int var1) {
      this.b.l(var1);
   }

   public final void setSubtitle(CharSequence var1) {
      this.b.m(var1);
   }

   public final void setTag(Object var1) {
      this.b.a = var1;
   }

   public final void setTitle(int var1) {
      this.b.n(var1);
   }

   public final void setTitle(CharSequence var1) {
      this.b.o(var1);
   }

   public final void setTitleOptionalHint(boolean var1) {
      this.b.p(var1);
   }
}
