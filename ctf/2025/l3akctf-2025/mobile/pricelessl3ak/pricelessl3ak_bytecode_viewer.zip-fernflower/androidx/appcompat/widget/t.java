package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.Button;

public final class t extends Button {
   public final s a;
   public final e0 b;
   public B c;

   public t(Context var1, AttributeSet var2) {
      Z0.a(var1);
      super(var1, var2, 2130903107);
      Y0.a(this, this.getContext());
      s var3 = new s(this);
      this.a = var3;
      var3.d(var2, 2130903107);
      e0 var4 = new e0(this);
      this.b = var4;
      var4.f(var2, 2130903107);
      var4.b();
      this.getEmojiTextViewHelper().a(var2, 2130903107);
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

   public int getAutoSizeMaxTextSize() {
      if (t1.c) {
         return super.getAutoSizeMaxTextSize();
      } else {
         e0 var1 = this.b;
         return var1 != null ? Math.round(var1.i.e) : -1;
      }
   }

   public int getAutoSizeMinTextSize() {
      if (t1.c) {
         return super.getAutoSizeMinTextSize();
      } else {
         e0 var1 = this.b;
         return var1 != null ? Math.round(var1.i.d) : -1;
      }
   }

   public int getAutoSizeStepGranularity() {
      if (t1.c) {
         return super.getAutoSizeStepGranularity();
      } else {
         e0 var1 = this.b;
         return var1 != null ? Math.round(var1.i.c) : -1;
      }
   }

   public int[] getAutoSizeTextAvailableSizes() {
      if (t1.c) {
         return super.getAutoSizeTextAvailableSizes();
      } else {
         e0 var1 = this.b;
         return var1 != null ? var1.i.f : new int[0];
      }
   }

   public int getAutoSizeTextType() {
      boolean var2 = t1.c;
      byte var1 = 0;
      if (var2) {
         if (super.getAutoSizeTextType() == 1) {
            var1 = 1;
         }

         return var1;
      } else {
         e0 var3 = this.b;
         return var3 != null ? var3.i.a : 0;
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

   public final void onInitializeAccessibilityEvent(AccessibilityEvent var1) {
      super.onInitializeAccessibilityEvent(var1);
      var1.setClassName(Button.class.getName());
   }

   public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo var1) {
      super.onInitializeAccessibilityNodeInfo(var1);
      var1.setClassName(Button.class.getName());
   }

   public final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      e0 var6 = this.b;
      if (var6 != null && !t1.c) {
         var6.i.a();
      }

   }

   public final void onTextChanged(CharSequence var1, int var2, int var3, int var4) {
      super.onTextChanged(var1, var2, var3, var4);
      e0 var5 = this.b;
      if (var5 != null && !t1.c) {
         n0 var6 = var5.i;
         if (var6.f()) {
            var6.a();
         }
      }

   }

   public void setAllCaps(boolean var1) {
      super.setAllCaps(var1);
      this.getEmojiTextViewHelper().b(var1);
   }

   public final void setAutoSizeTextTypeUniformWithConfiguration(int var1, int var2, int var3, int var4) {
      if (t1.c) {
         super.setAutoSizeTextTypeUniformWithConfiguration(var1, var2, var3, var4);
      } else {
         e0 var5 = this.b;
         if (var5 != null) {
            var5.i(var1, var2, var3, var4);
         }
      }

   }

   public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] var1, int var2) {
      if (t1.c) {
         super.setAutoSizeTextTypeUniformWithPresetSizes(var1, var2);
      } else {
         e0 var3 = this.b;
         if (var3 != null) {
            var3.j(var1, var2);
         }
      }

   }

   public void setAutoSizeTextTypeWithDefaults(int var1) {
      if (t1.c) {
         super.setAutoSizeTextTypeWithDefaults(var1);
      } else {
         e0 var2 = this.b;
         if (var2 != null) {
            var2.k(var1);
         }
      }

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

   public void setCustomSelectionActionModeCallback(ActionMode.Callback var1) {
      super.setCustomSelectionActionModeCallback(C.b.K(var1, this));
   }

   public void setEmojiCompatEnabled(boolean var1) {
      this.getEmojiTextViewHelper().c(var1);
   }

   public void setFilters(InputFilter[] var1) {
      super.setFilters(((C.b)this.getEmojiTextViewHelper().b.b).p(var1));
   }

   public void setSupportAllCaps(boolean var1) {
      e0 var2 = this.b;
      if (var2 != null) {
         var2.a.setAllCaps(var1);
      }

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

   public final void setTextSize(int var1, float var2) {
      boolean var3 = t1.c;
      if (var3) {
         super.setTextSize(var1, var2);
      } else {
         e0 var4 = this.b;
         if (var4 != null && !var3) {
            n0 var5 = var4.i;
            if (!var5.f()) {
               var5.g(var1, var2);
            }
         }
      }

   }
}
