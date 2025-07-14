package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.Button;
import androidx.appcompat.widget.i0;
import androidx.appcompat.widget.j;
import androidx.appcompat.widget.n;
import g.a;
import j.b;
import j.k;
import j.l;
import j.y;

public class ActionMenuItemView extends i0 implements y, View.OnClickListener, n {
   public j.n h;
   public CharSequence i;
   public Drawable j;
   public k k;
   public j l;
   public b m;
   public boolean n;
   public boolean o;
   public final int p;
   public int q;
   public final int r;

   public ActionMenuItemView(Context var1, AttributeSet var2) {
      super(var1, var2, 0);
      Resources var3 = var1.getResources();
      this.n = this.h();
      TypedArray var4 = var1.obtainStyledAttributes(var2, a.c, 0, 0);
      this.p = var4.getDimensionPixelSize(0, 0);
      var4.recycle();
      this.r = (int)(var3.getDisplayMetrics().density * 32.0F + 0.5F);
      this.setOnClickListener(this);
      this.q = -1;
      this.setSaveEnabled(false);
   }

   public final boolean a() {
      boolean var1;
      if (!TextUtils.isEmpty(this.getText()) && this.h.getIcon() == null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final boolean b() {
      return TextUtils.isEmpty(this.getText()) ^ true;
   }

   public final void c(j.n var1) {
      this.h = var1;
      this.setIcon(var1.getIcon());
      this.setTitle(var1.getTitleCondensed());
      this.setId(var1.a);
      byte var2;
      if (var1.isVisible()) {
         var2 = 0;
      } else {
         var2 = 8;
      }

      this.setVisibility(var2);
      this.setEnabled(var1.isEnabled());
      if (var1.hasSubMenu() && this.l == null) {
         this.l = new j(this);
      }

   }

   public CharSequence getAccessibilityClassName() {
      return Button.class.getName();
   }

   public j.n getItemData() {
      return this.h;
   }

   public final boolean h() {
      Configuration var4 = this.getContext().getResources().getConfiguration();
      int var1 = var4.screenWidthDp;
      int var2 = var4.screenHeightDp;
      boolean var3;
      if (var1 < 480 && (var1 < 640 || var2 < 480) && var4.orientation != 2) {
         var3 = false;
      } else {
         var3 = true;
      }

      return var3;
   }

   public final void i() {
      boolean var3 = TextUtils.isEmpty(this.i);
      boolean var2 = true;
      boolean var1 = var2;
      if (this.j != null) {
         label41: {
            if ((this.h.y & 4) == 4) {
               var1 = var2;
               if (this.n) {
                  break label41;
               }

               if (this.o) {
                  var1 = var2;
                  break label41;
               }
            }

            var1 = false;
         }
      }

      var1 &= var3 ^ true;
      Object var5 = null;
      CharSequence var4;
      if (var1) {
         var4 = this.i;
      } else {
         var4 = null;
      }

      this.setText(var4);
      var4 = this.h.q;
      if (TextUtils.isEmpty(var4)) {
         if (var1) {
            var4 = null;
         } else {
            var4 = this.h.e;
         }

         this.setContentDescription(var4);
      } else {
         this.setContentDescription(var4);
      }

      var4 = this.h.r;
      if (TextUtils.isEmpty(var4)) {
         if (var1) {
            var4 = (CharSequence)var5;
         } else {
            var4 = this.h.e;
         }

         C.b.H(this, var4);
      } else {
         C.b.H(this, var4);
      }

   }

   public final void onClick(View var1) {
      k var2 = this.k;
      if (var2 != null) {
         var2.b(this.h);
      }

   }

   public final void onConfigurationChanged(Configuration var1) {
      super.onConfigurationChanged(var1);
      this.n = this.h();
      this.i();
   }

   public final void onMeasure(int var1, int var2) {
      boolean var6 = TextUtils.isEmpty(this.getText());
      int var3;
      if (!var6) {
         var3 = this.q;
         if (var3 >= 0) {
            super.setPadding(var3, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
         }
      }

      super.onMeasure(var1, var2);
      int var4 = MeasureSpec.getMode(var1);
      var1 = MeasureSpec.getSize(var1);
      int var5 = this.getMeasuredWidth();
      var3 = this.p;
      if (var4 == Integer.MIN_VALUE) {
         var1 = Math.min(var1, var3);
      } else {
         var1 = var3;
      }

      if (var4 != 1073741824 && var3 > 0 && var5 < var1) {
         super.onMeasure(MeasureSpec.makeMeasureSpec(var1, 1073741824), var2);
      }

      if (var6 && this.j != null) {
         super.setPadding((this.getMeasuredWidth() - this.j.getBounds().width()) / 2, this.getPaddingTop(), this.getPaddingRight(), this.getPaddingBottom());
      }

   }

   public final void onRestoreInstanceState(Parcelable var1) {
      super.onRestoreInstanceState((Parcelable)null);
   }

   public final boolean onTouchEvent(MotionEvent var1) {
      if (this.h.hasSubMenu()) {
         j var2 = this.l;
         if (var2 != null && var2.onTouch(this, var1)) {
            return true;
         }
      }

      return super.onTouchEvent(var1);
   }

   public void setCheckable(boolean var1) {
   }

   public void setChecked(boolean var1) {
   }

   public void setExpandedFormat(boolean var1) {
      if (this.o != var1) {
         this.o = var1;
         j.n var2 = this.h;
         if (var2 != null) {
            l var3 = var2.n;
            var3.k = true;
            var3.p(true);
         }
      }

   }

   public void setIcon(Drawable var1) {
      this.j = var1;
      if (var1 != null) {
         int var7 = var1.getIntrinsicWidth();
         int var6 = var1.getIntrinsicHeight();
         int var5 = this.r;
         int var3 = var7;
         int var4 = var6;
         float var2;
         if (var7 > var5) {
            var2 = (float)var5 / (float)var7;
            var4 = (int)((float)var6 * var2);
            var3 = var5;
         }

         if (var4 > var5) {
            var2 = (float)var5 / (float)var4;
            var3 = (int)((float)var3 * var2);
         } else {
            var5 = var4;
         }

         var1.setBounds(0, 0, var3, var5);
      }

      this.setCompoundDrawables(var1, (Drawable)null, (Drawable)null, (Drawable)null);
      this.i();
   }

   public void setItemInvoker(k var1) {
      this.k = var1;
   }

   public final void setPadding(int var1, int var2, int var3, int var4) {
      this.q = var1;
      super.setPadding(var1, var2, var3, var4);
   }

   public void setPopupCallback(b var1) {
      this.m = var1;
   }

   public void setTitle(CharSequence var1) {
      this.i = var1;
      this.i();
   }
}
