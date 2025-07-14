package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;

public class r extends AutoCompleteTextView {
   public static final int[] d = new int[]{16843126};
   public final s a;
   public final e0 b;
   public final H c;

   public r(Context var1, AttributeSet var2) {
      Z0.a(var1);
      super(var1, var2, 2130903085);
      Y0.a(this, this.getContext());
      X.h var7 = X.h.m(this.getContext(), var2, d, 2130903085);
      if (((TypedArray)var7.b).hasValue(0)) {
         this.setDropDownBackgroundDrawable(var7.h(0));
      }

      var7.o();
      s var8 = new s(this);
      this.a = var8;
      var8.d(var2, 2130903085);
      e0 var9 = new e0(this);
      this.b = var9;
      var9.f(var2, 2130903085);
      var9.b();
      H var10 = new H(this);
      this.c = var10;
      var10.b(var2, 2130903085);
      KeyListener var11 = this.getKeyListener();
      if (!(var11 instanceof NumberKeyListener)) {
         boolean var5 = super.isFocusable();
         boolean var6 = super.isClickable();
         boolean var4 = super.isLongClickable();
         int var3 = super.getInputType();
         KeyListener var12 = var10.a(var11);
         if (var12 != var11) {
            super.setKeyListener(var12);
            super.setRawInputType(var3);
            super.setFocusable(var5);
            super.setClickable(var6);
            super.setLongClickable(var4);
         }
      }

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

   public ActionMode.Callback getCustomSelectionActionModeCallback() {
      return C.b.J(super.getCustomSelectionActionModeCallback());
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

   public InputConnection onCreateInputConnection(EditorInfo var1) {
      InputConnection var2 = super.onCreateInputConnection(var1);
      C.b.w(var1, var2, this);
      return this.c.c(var2, var1);
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

   public void setCustomSelectionActionModeCallback(ActionMode.Callback var1) {
      super.setCustomSelectionActionModeCallback(C.b.K(var1, this));
   }

   public void setDropDownBackgroundResource(int var1) {
      this.setDropDownBackgroundDrawable(C.b.n(this.getContext(), var1));
   }

   public void setEmojiCompatEnabled(boolean var1) {
      this.c.d(var1);
   }

   public void setKeyListener(KeyListener var1) {
      super.setKeyListener(this.c.a(var1));
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

   public final void setTextAppearance(Context var1, int var2) {
      super.setTextAppearance(var1, var2);
      e0 var3 = this.b;
      if (var3 != null) {
         var3.g(var1, var2);
      }

   }
}
