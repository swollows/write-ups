package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.widget.ToggleButton;

public final class o0 extends ToggleButton {
   public final s a;
   public final e0 b;
   public B c;

   public o0(Context var1, AttributeSet var2) {
      super(var1, var2, 16842827);
      Y0.a(this, this.getContext());
      s var3 = new s(this);
      this.a = var3;
      var3.d(var2, 16842827);
      e0 var4 = new e0(this);
      this.b = var4;
      var4.f(var2, 16842827);
      this.getEmojiTextViewHelper().a(var2, 16842827);
   }

   private B getEmojiTextViewHelper() {
      if (this.c == null) {
         this.c = new B(this);
      }

      return this.c;
   }

   public final void drawableStateChanged() {
      super.drawableStateChanged();
      s var1 = this.a;
      if (var1 != null) {
         var1.a();
      }

      e0 var2 = this.b;
      if (var2 != null) {
         var2.b();
      }

   }

   public ColorStateList getSupportBackgroundTintList() {
      s var1 = this.a;
      ColorStateList var2;
      if (var1 != null) {
         var2 = var1.b();
      } else {
         var2 = null;
      }

      return var2;
   }

   public PorterDuff.Mode getSupportBackgroundTintMode() {
      s var1 = this.a;
      PorterDuff.Mode var2;
      if (var1 != null) {
         var2 = var1.c();
      } else {
         var2 = null;
      }

      return var2;
   }

   public ColorStateList getSupportCompoundDrawablesTintList() {
      return this.b.d();
   }

   public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
      return this.b.e();
   }

   public void setAllCaps(boolean var1) {
      super.setAllCaps(var1);
      this.getEmojiTextViewHelper().b(var1);
   }

   public void setBackgroundDrawable(Drawable var1) {
      super.setBackgroundDrawable(var1);
      s var2 = this.a;
      if (var2 != null) {
         var2.e();
      }

   }

   public void setBackgroundResource(int var1) {
      super.setBackgroundResource(var1);
      s var2 = this.a;
      if (var2 != null) {
         var2.f(var1);
      }

   }

   public final void setCompoundDrawables(Drawable var1, Drawable var2, Drawable var3, Drawable var4) {
      super.setCompoundDrawables(var1, var2, var3, var4);
      e0 var5 = this.b;
      if (var5 != null) {
         var5.b();
      }

   }

   public final void setCompoundDrawablesRelative(Drawable var1, Drawable var2, Drawable var3, Drawable var4) {
      super.setCompoundDrawablesRelative(var1, var2, var3, var4);
      e0 var5 = this.b;
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
      s var2 = this.a;
      if (var2 != null) {
         var2.h(var1);
      }

   }

   public void setSupportBackgroundTintMode(PorterDuff.Mode var1) {
      s var2 = this.a;
      if (var2 != null) {
         var2.i(var1);
      }

   }

   public void setSupportCompoundDrawablesTintList(ColorStateList var1) {
      e0 var2 = this.b;
      var2.l(var1);
      var2.b();
   }

   public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode var1) {
      e0 var2 = this.b;
      var2.m(var1);
      var2.b();
   }
}
