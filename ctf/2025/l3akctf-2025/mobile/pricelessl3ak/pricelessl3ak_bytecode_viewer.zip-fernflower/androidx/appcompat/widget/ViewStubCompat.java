package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import java.lang.ref.WeakReference;

public final class ViewStubCompat extends View {
   public int a = 0;
   public int b;
   public WeakReference c;
   public LayoutInflater d;

   public ViewStubCompat(Context var1, AttributeSet var2) {
      super(var1, var2, 0);
      TypedArray var3 = var1.obtainStyledAttributes(var2, g.a.z, 0, 0);
      this.b = var3.getResourceId(2, -1);
      this.a = var3.getResourceId(1, 0);
      this.setId(var3.getResourceId(0, -1));
      var3.recycle();
      this.setVisibility(8);
      this.setWillNotDraw(true);
   }

   public final View a() {
      ViewParent var2 = this.getParent();
      if (var2 instanceof ViewGroup) {
         if (this.a != 0) {
            ViewGroup var3 = (ViewGroup)var2;
            LayoutInflater var5 = this.d;
            if (var5 == null) {
               var5 = LayoutInflater.from(this.getContext());
            }

            View var4 = var5.inflate(this.a, var3, false);
            int var1 = this.b;
            if (var1 != -1) {
               var4.setId(var1);
            }

            var1 = var3.indexOfChild(this);
            var3.removeViewInLayout(this);
            ViewGroup.LayoutParams var6 = this.getLayoutParams();
            if (var6 != null) {
               var3.addView(var4, var1, var6);
            } else {
               var3.addView(var4, var1);
            }

            this.c = new WeakReference(var4);
            return var4;
         } else {
            throw new IllegalArgumentException("ViewStub must have a valid layoutResource");
         }
      } else {
         throw new IllegalStateException("ViewStub must have a non-null ViewGroup viewParent");
      }
   }

   public final void dispatchDraw(Canvas var1) {
   }

   public final void draw(Canvas var1) {
   }

   public int getInflatedId() {
      return this.b;
   }

   public LayoutInflater getLayoutInflater() {
      return this.d;
   }

   public int getLayoutResource() {
      return this.a;
   }

   public final void onMeasure(int var1, int var2) {
      this.setMeasuredDimension(0, 0);
   }

   public void setInflatedId(int var1) {
      this.b = var1;
   }

   public void setLayoutInflater(LayoutInflater var1) {
      this.d = var1;
   }

   public void setLayoutResource(int var1) {
      this.a = var1;
   }

   public void setOnInflateListener(r1 var1) {
   }

   public void setVisibility(int var1) {
      WeakReference var2 = this.c;
      if (var2 != null) {
         View var3 = (View)var2.get();
         if (var3 == null) {
            throw new IllegalStateException("setVisibility called on un-referenced view");
         }

         var3.setVisibility(var1);
      } else {
         super.setVisibility(var1);
         if (var1 == 0 || var1 == 4) {
            this.a();
         }
      }

   }
}
