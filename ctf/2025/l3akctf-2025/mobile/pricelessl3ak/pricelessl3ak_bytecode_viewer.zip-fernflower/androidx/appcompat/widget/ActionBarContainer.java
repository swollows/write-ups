package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.FrameLayout;

public class ActionBarContainer extends FrameLayout {
   public boolean a;
   public View b;
   public View c;
   public Drawable d;
   public Drawable e;
   public Drawable f;
   public final boolean g;
   public boolean h;
   public final int i;

   public ActionBarContainer(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.setBackground(new b(this));
      TypedArray var5 = var1.obtainStyledAttributes(var2, g.a.a);
      boolean var4 = false;
      this.d = var5.getDrawable(0);
      this.e = var5.getDrawable(2);
      this.i = var5.getDimensionPixelSize(13, -1);
      if (this.getId() == 2131230870) {
         this.g = true;
         this.f = var5.getDrawable(1);
      }

      boolean var3;
      label20: {
         var5.recycle();
         if (this.g) {
            var3 = var4;
            if (this.f != null) {
               break label20;
            }
         } else {
            var3 = var4;
            if (this.d != null) {
               break label20;
            }

            var3 = var4;
            if (this.e != null) {
               break label20;
            }
         }

         var3 = true;
      }

      this.setWillNotDraw(var3);
   }

   public final void drawableStateChanged() {
      super.drawableStateChanged();
      Drawable var1 = this.d;
      if (var1 != null && var1.isStateful()) {
         this.d.setState(this.getDrawableState());
      }

      var1 = this.e;
      if (var1 != null && var1.isStateful()) {
         this.e.setState(this.getDrawableState());
      }

      var1 = this.f;
      if (var1 != null && var1.isStateful()) {
         this.f.setState(this.getDrawableState());
      }

   }

   public View getTabContainer() {
      return null;
   }

   public final void jumpDrawablesToCurrentState() {
      super.jumpDrawablesToCurrentState();
      Drawable var1 = this.d;
      if (var1 != null) {
         var1.jumpToCurrentState();
      }

      var1 = this.e;
      if (var1 != null) {
         var1.jumpToCurrentState();
      }

      var1 = this.f;
      if (var1 != null) {
         var1.jumpToCurrentState();
      }

   }

   public final void onFinishInflate() {
      super.onFinishInflate();
      this.b = this.findViewById(2131230759);
      this.c = this.findViewById(2131230767);
   }

   public final boolean onHoverEvent(MotionEvent var1) {
      super.onHoverEvent(var1);
      return true;
   }

   public final boolean onInterceptTouchEvent(MotionEvent var1) {
      boolean var2;
      if (!this.a && !super.onInterceptTouchEvent(var1)) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }

   public final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      super.onLayout(var1, var2, var3, var4, var5);
      var1 = this.g;
      boolean var7 = true;
      boolean var8 = true;
      if (var1) {
         Drawable var6 = this.f;
         if (var6 != null) {
            var6.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
         } else {
            var7 = false;
         }
      } else {
         if (this.d != null) {
            if (this.b.getVisibility() == 0) {
               this.d.setBounds(this.b.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
               var7 = var8;
            } else {
               View var9 = this.c;
               if (var9 != null && var9.getVisibility() == 0) {
                  this.d.setBounds(this.c.getLeft(), this.c.getTop(), this.c.getRight(), this.c.getBottom());
                  var7 = var8;
               } else {
                  this.d.setBounds(0, 0, 0, 0);
                  var7 = var8;
               }
            }
         } else {
            var7 = false;
         }

         this.h = false;
      }

      if (var7) {
         this.invalidate();
      }

   }

   public final void onMeasure(int var1, int var2) {
      int var3 = var2;
      if (this.b == null) {
         var3 = var2;
         if (MeasureSpec.getMode(var2) == Integer.MIN_VALUE) {
            int var4 = this.i;
            var3 = var2;
            if (var4 >= 0) {
               var3 = MeasureSpec.makeMeasureSpec(Math.min(var4, MeasureSpec.getSize(var2)), Integer.MIN_VALUE);
            }
         }
      }

      super.onMeasure(var1, var3);
      if (this.b != null) {
         MeasureSpec.getMode(var3);
      }
   }

   public final boolean onTouchEvent(MotionEvent var1) {
      super.onTouchEvent(var1);
      return true;
   }

   public void setPrimaryBackground(Drawable var1) {
      Drawable var4 = this.d;
      if (var4 != null) {
         var4.setCallback((Drawable.Callback)null);
         this.unscheduleDrawable(this.d);
      }

      this.d = var1;
      if (var1 != null) {
         var1.setCallback(this);
         View var5 = this.b;
         if (var5 != null) {
            this.d.setBounds(var5.getLeft(), this.b.getTop(), this.b.getRight(), this.b.getBottom());
         }
      }

      boolean var2;
      label24: {
         var2 = this.g;
         boolean var3 = false;
         if (var2) {
            var2 = var3;
            if (this.f != null) {
               break label24;
            }
         } else {
            var2 = var3;
            if (this.d != null) {
               break label24;
            }

            var2 = var3;
            if (this.e != null) {
               break label24;
            }
         }

         var2 = true;
      }

      this.setWillNotDraw(var2);
      this.invalidate();
      this.invalidateOutline();
   }

   public void setSplitBackground(Drawable var1) {
      Drawable var4 = this.f;
      if (var4 != null) {
         var4.setCallback((Drawable.Callback)null);
         this.unscheduleDrawable(this.f);
      }

      this.f = var1;
      boolean var2 = this.g;
      boolean var3 = false;
      if (var1 != null) {
         var1.setCallback(this);
         if (var2) {
            var1 = this.f;
            if (var1 != null) {
               var1.setBounds(0, 0, this.getMeasuredWidth(), this.getMeasuredHeight());
            }
         }
      }

      label26: {
         if (var2) {
            var2 = var3;
            if (this.f != null) {
               break label26;
            }
         } else {
            var2 = var3;
            if (this.d != null) {
               break label26;
            }

            var2 = var3;
            if (this.e != null) {
               break label26;
            }
         }

         var2 = true;
      }

      this.setWillNotDraw(var2);
      this.invalidate();
      this.invalidateOutline();
   }

   public void setStackedBackground(Drawable var1) {
      Drawable var4 = this.e;
      if (var4 != null) {
         var4.setCallback((Drawable.Callback)null);
         this.unscheduleDrawable(this.e);
      }

      this.e = var1;
      if (var1 != null) {
         var1.setCallback(this);
         if (this.h && this.e != null) {
            throw null;
         }
      }

      boolean var2;
      label27: {
         var2 = this.g;
         boolean var3 = false;
         if (var2) {
            var2 = var3;
            if (this.f != null) {
               break label27;
            }
         } else {
            var2 = var3;
            if (this.d != null) {
               break label27;
            }

            var2 = var3;
            if (this.e != null) {
               break label27;
            }
         }

         var2 = true;
      }

      this.setWillNotDraw(var2);
      this.invalidate();
      this.invalidateOutline();
   }

   public void setTabContainer(V0 var1) {
   }

   public void setTransitioning(boolean var1) {
      this.a = var1;
      int var2;
      if (var1) {
         var2 = 393216;
      } else {
         var2 = 262144;
      }

      this.setDescendantFocusability(var2);
   }

   public void setVisibility(int var1) {
      super.setVisibility(var1);
      boolean var2;
      if (var1 == 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      Drawable var3 = this.d;
      if (var3 != null) {
         var3.setVisible(var2, false);
      }

      var3 = this.e;
      if (var3 != null) {
         var3.setVisible(var2, false);
      }

      var3 = this.f;
      if (var3 != null) {
         var3.setVisible(var2, false);
      }

   }

   public final ActionMode startActionModeForChild(View var1, ActionMode.Callback var2) {
      return null;
   }

   public final ActionMode startActionModeForChild(View var1, ActionMode.Callback var2, int var3) {
      return var3 != 0 ? super.startActionModeForChild(var1, var2, var3) : null;
   }

   public final boolean verifyDrawable(Drawable var1) {
      Drawable var3 = this.d;
      boolean var2 = this.g;
      if ((var1 != var3 || var2) && (var1 != this.e || !this.h) && (var1 != this.f || !var2) && !super.verifyDrawable(var1)) {
         var2 = false;
      } else {
         var2 = true;
      }

      return var2;
   }
}
