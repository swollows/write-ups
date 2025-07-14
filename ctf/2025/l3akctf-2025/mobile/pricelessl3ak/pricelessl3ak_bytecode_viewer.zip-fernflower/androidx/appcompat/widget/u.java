package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.CheckBox;

public final class u extends CheckBox {
   public final w a;
   public final s b;
   public final e0 c;
   public B d;

   public u(Context var1, AttributeSet var2) {
      Z0.a(var1);
      super(var1, var2, 2130903114);
      Y0.a(this, this.getContext());
      w var3 = new w(this);
      this.a = var3;
      var3.c(var2, 2130903114);
      s var4 = new s(this);
      this.b = var4;
      var4.d(var2, 2130903114);
      e0 var5 = new e0(this);
      this.c = var5;
      var5.f(var2, 2130903114);
      this.getEmojiTextViewHelper().a(var2, 2130903114);
   }

   private B getEmojiTextViewHelper() {
      if (this.d == null) {
         this.d = new B(this);
      }

      return this.d;
   }

   public final void drawableStateChanged() {
      super.drawableStateChanged();
      s var1 = this.b;
      if (var1 != null) {
         var1.a();
      }

      e0 var2 = this.c;
      if (var2 != null) {
         var2.b();
      }

   }

   public ColorStateList getSupportBackgroundTintList() {
      s var1 = this.b;
      ColorStateList var2;
      if (var1 != null) {
         var2 = var1.b();
      } else {
         var2 = null;
      }

      return var2;
   }

   public PorterDuff.Mode getSupportBackgroundTintMode() {
      s var1 = this.b;
      PorterDuff.Mode var2;
      if (var1 != null) {
         var2 = var1.c();
      } else {
         var2 = null;
      }

      return var2;
   }

   public ColorStateList getSupportButtonTintList() {
      w var1 = this.a;
      ColorStateList var2;
      if (var1 != null) {
         var2 = var1.a;
      } else {
         var2 = null;
      }

      return var2;
   }

   public PorterDuff.Mode getSupportButtonTintMode() {
      w var1 = this.a;
      PorterDuff.Mode var2;
      if (var1 != null) {
         var2 = var1.b;
      } else {
         var2 = null;
      }

      return var2;
   }

   public ColorStateList getSupportCompoundDrawablesTintList() {
      return this.c.d();
   }

   public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
      return this.c.e();
   }

   public void setAllCaps(boolean var1) {
      super.setAllCaps(var1);
      this.getEmojiTextViewHelper().b(var1);
   }

   public void setBackgroundDrawable(Drawable var1) {
      super.setBackgroundDrawable(var1);
      s var2 = this.b;
      if (var2 != null) {
         var2.e();
      }

   }

   public void setBackgroundResource(int var1) {
      super.setBackgroundResource(var1);
      s var2 = this.b;
      if (var2 != null) {
         var2.f(var1);
      }

   }

   public void setButtonDrawable(int var1) {
      this.setButtonDrawable(C.b.n(this.getContext(), var1));
   }

   public void setButtonDrawable(Drawable var1) {
      super.setButtonDrawable(var1);
      w var2 = this.a;
      if (var2 != null) {
         if (var2.e) {
            var2.e = false;
         } else {
            var2.e = true;
            var2.a();
         }
      }

   }

   public final void setCompoundDrawables(Drawable var1, Drawable var2, Drawable var3, Drawable var4) {
      super.setCompoundDrawables(var1, var2, var3, var4);
      e0 var5 = this.c;
      if (var5 != null) {
         var5.b();
      }

   }

   public final void setCompoundDrawablesRelative(Drawable var1, Drawable var2, Drawable var3, Drawable var4) {
      super.setCompoundDrawablesRelative(var1, var2, var3, var4);
      e0 var5 = this.c;
      if (var5 != null) {
         var5.b();
      }

   }

   public void setEmojiCompatEnabled(boolean var1) {
      this.getEmojiTextViewHelper().c(var1);
   }

   public void setFilters(InputFilter[] var1) {
      super.setFilters(((C.b)this.getEmojiTextViewHelper().b.b).p(var1));
   }

   public void setSupportBackgroundTintList(ColorStateList var1) {
      s var2 = this.b;
      if (var2 != null) {
         var2.h(var1);
      }

   }

   public void setSupportBackgroundTintMode(PorterDuff.Mode var1) {
      s var2 = this.b;
      if (var2 != null) {
         var2.i(var1);
      }

   }

   public void setSupportButtonTintList(ColorStateList var1) {
      w var2 = this.a;
      if (var2 != null) {
         var2.a = var1;
         var2.c = true;
         var2.a();
      }

   }

   public void setSupportButtonTintMode(PorterDuff.Mode var1) {
      w var2 = this.a;
      if (var2 != null) {
         var2.b = var1;
         var2.d = true;
         var2.a();
      }

   }

   public void setSupportCompoundDrawablesTintList(ColorStateList var1) {
      e0 var2 = this.c;
      var2.l(var1);
      var2.b();
   }

   public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode var1) {
      e0 var2 = this.c;
      var2.m(var1);
      var2.b();
   }
}
