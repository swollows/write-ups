package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import android.widget.TextView;

public final class w {
   public ColorStateList a;
   public PorterDuff.Mode b;
   public boolean c;
   public boolean d;
   public boolean e;
   public final TextView f;

   // $FF: synthetic method
   public w(TextView var1) {
      this.a = null;
      this.b = null;
      this.c = false;
      this.d = false;
      this.f = var1;
      super();
   }

   public void a() {
      CompoundButton var1 = (CompoundButton)this.f;
      Drawable var2 = var1.getButtonDrawable();
      if (var2 != null && (this.c || this.d)) {
         var2 = var2.mutate();
         if (this.c) {
            var2.setTintList(this.a);
         }

         if (this.d) {
            var2.setTintMode(this.b);
         }

         if (var2.isStateful()) {
            var2.setState(var1.getDrawableState());
         }

         var1.setButtonDrawable(var2);
      }

   }

   public void b() {
      v var1 = (v)this.f;
      Drawable var2 = var1.getCheckMarkDrawable();
      if (var2 != null && (this.c || this.d)) {
         var2 = var2.mutate();
         if (this.c) {
            var2.setTintList(this.a);
         }

         if (this.d) {
            var2.setTintMode(this.b);
         }

         if (var2.isStateful()) {
            var2.setState(var1.getDrawableState());
         }

         var1.setCheckMarkDrawable(var2);
      }

   }

   public void c(AttributeSet param1, int param2) {
      // $FF: Couldn't be decompiled
   }
}
