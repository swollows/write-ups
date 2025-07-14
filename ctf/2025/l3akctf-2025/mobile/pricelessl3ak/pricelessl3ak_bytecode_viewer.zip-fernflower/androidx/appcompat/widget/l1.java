package androidx.appcompat.widget;

import D.T;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;

public final class l1 implements r0 {
   public final Toolbar a;
   public int b;
   public final View c;
   public Drawable d;
   public Drawable e;
   public final Drawable f;
   public final boolean g;
   public CharSequence h;
   public final CharSequence i;
   public final CharSequence j;
   public Window.Callback k;
   public boolean l;
   public m m;
   public final int n = 0;
   public final Drawable o;

   public l1(Toolbar var1, boolean var2) {
      this.a = var1;
      this.h = var1.getTitle();
      this.i = var1.getSubtitle();
      boolean var5;
      if (this.h != null) {
         var5 = true;
      } else {
         var5 = false;
      }

      this.g = var5;
      this.f = var1.getNavigationIcon();
      Context var7 = var1.getContext();
      int[] var8 = g.a.a;
      String var6 = null;
      X.h var12 = X.h.m(var7, (AttributeSet)null, var8, 2130903045);
      int var3 = 15;
      this.o = var12.h(15);
      if (var2) {
         TypedArray var11 = (TypedArray)var12.b;
         CharSequence var9 = var11.getText(27);
         if (!TextUtils.isEmpty(var9)) {
            this.g = true;
            this.h = var9;
            if ((this.b & 8) != 0) {
               Toolbar var10 = this.a;
               var10.setTitle(var9);
               if (this.g) {
                  T.j(var10.getRootView(), var9);
               }
            }
         }

         var9 = var11.getText(25);
         if (!TextUtils.isEmpty(var9)) {
            this.i = var9;
            if ((this.b & 8) != 0) {
               var1.setSubtitle(var9);
            }
         }

         Drawable var13 = var12.h(20);
         if (var13 != null) {
            this.e = var13;
            this.c();
         }

         var13 = var12.h(17);
         if (var13 != null) {
            this.d = var13;
            this.c();
         }

         if (this.f == null) {
            Drawable var14 = this.o;
            if (var14 != null) {
               this.f = var14;
               var3 = this.b;
               Toolbar var15 = this.a;
               if ((var3 & 4) != 0) {
                  var15.setNavigationIcon(var14);
               } else {
                  var15.setNavigationIcon((Drawable)null);
               }
            }
         }

         this.a(var11.getInt(10, 0));
         var3 = var11.getResourceId(9, 0);
         if (var3 != 0) {
            View var16 = LayoutInflater.from(var1.getContext()).inflate(var3, var1, false);
            View var17 = this.c;
            if (var17 != null && (this.b & 16) != 0) {
               var1.removeView(var17);
            }

            this.c = var16;
            if (var16 != null && (this.b & 16) != 0) {
               var1.addView(var16);
            }

            this.a(this.b | 16);
         }

         var3 = var11.getLayoutDimension(13, 0);
         if (var3 > 0) {
            ViewGroup.LayoutParams var18 = var1.getLayoutParams();
            var18.height = var3;
            var1.setLayoutParams(var18);
         }

         int var4 = var11.getDimensionPixelOffset(7, -1);
         var3 = var11.getDimensionPixelOffset(3, -1);
         if (var4 >= 0 || var3 >= 0) {
            var4 = Math.max(var4, 0);
            var3 = Math.max(var3, 0);
            var1.d();
            var1.t.a(var4, var3);
         }

         var3 = var11.getResourceId(28, 0);
         i0 var19;
         Context var20;
         if (var3 != 0) {
            var20 = var1.getContext();
            var1.l = var3;
            var19 = var1.b;
            if (var19 != null) {
               var19.setTextAppearance(var20, var3);
            }
         }

         var3 = var11.getResourceId(26, 0);
         if (var3 != 0) {
            var20 = var1.getContext();
            var1.m = var3;
            var19 = var1.c;
            if (var19 != null) {
               var19.setTextAppearance(var20, var3);
            }
         }

         var3 = var11.getResourceId(22, 0);
         if (var3 != 0) {
            var1.setPopupTheme(var3);
         }
      } else {
         if (var1.getNavigationIcon() != null) {
            this.o = var1.getNavigationIcon();
         } else {
            var3 = 11;
         }

         this.b = var3;
      }

      var12.o();
      if (2131558401 != this.n) {
         this.n = 2131558401;
         if (TextUtils.isEmpty(var1.getNavigationContentDescription())) {
            var3 = this.n;
            if (var3 != 0) {
               var6 = var1.getContext().getString(var3);
            }

            this.j = var6;
            this.b();
         }
      }

      this.j = var1.getNavigationContentDescription();
      var1.setNavigationOnClickListener(new j1(this));
   }

   public final void a(int var1) {
      int var3 = this.b ^ var1;
      this.b = var1;
      if (var3 != 0) {
         Toolbar var5;
         if ((var3 & 4) != 0) {
            if ((var1 & 4) != 0) {
               this.b();
            }

            int var2 = this.b;
            var5 = this.a;
            if ((var2 & 4) != 0) {
               Drawable var4 = this.f;
               if (var4 == null) {
                  var4 = this.o;
               }

               var5.setNavigationIcon(var4);
            } else {
               var5.setNavigationIcon((Drawable)null);
            }
         }

         if ((var3 & 3) != 0) {
            this.c();
         }

         var5 = this.a;
         if ((var3 & 8) != 0) {
            if ((var1 & 8) != 0) {
               var5.setTitle(this.h);
               var5.setSubtitle(this.i);
            } else {
               var5.setTitle((CharSequence)null);
               var5.setSubtitle((CharSequence)null);
            }
         }

         if ((var3 & 16) != 0) {
            View var6 = this.c;
            if (var6 != null) {
               if ((var1 & 16) != 0) {
                  var5.addView(var6);
               } else {
                  var5.removeView(var6);
               }
            }
         }
      }

   }

   public final void b() {
      if ((this.b & 4) != 0) {
         boolean var1 = TextUtils.isEmpty(this.j);
         Toolbar var2 = this.a;
         if (var1) {
            var2.setNavigationContentDescription(this.n);
         } else {
            var2.setNavigationContentDescription(this.j);
         }
      }

   }

   public final void c() {
      int var1 = this.b;
      Drawable var2;
      if ((var1 & 2) != 0) {
         if ((var1 & 1) != 0) {
            var2 = this.e;
            if (var2 == null) {
               var2 = this.d;
            }
         } else {
            var2 = this.d;
         }
      } else {
         var2 = null;
      }

      this.a.setLogo(var2);
   }
}
