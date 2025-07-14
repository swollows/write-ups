package androidx.appcompat.widget;

import D.C;
import D.T;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.TextUtils;
import android.text.method.PasswordTransformationMethod;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import java.lang.ref.WeakReference;
import java.util.Arrays;

public final class e0 {
   public final TextView a;
   public a1 b;
   public a1 c;
   public a1 d;
   public a1 e;
   public a1 f;
   public a1 g;
   public a1 h;
   public final n0 i;
   public int j = 0;
   public int k = -1;
   public Typeface l;
   public boolean m;

   public e0(TextView var1) {
      this.a = var1;
      this.i = new n0(var1);
   }

   public static a1 c(Context var0, y var1, int var2) {
      synchronized(var1){}

      ColorStateList var10;
      try {
         var10 = var1.a.f(var0, var2);
      } catch (Throwable var8) {
         Throwable var10000 = var8;
         boolean var10001 = false;

         while(true) {
            Throwable var9 = var10000;

            try {
               throw var9;
            } catch (Throwable var7) {
               var10000 = var7;
               var10001 = false;
               continue;
            }
         }
      }

      if (var10 != null) {
         Object var11 = new Object();
         ((a1)var11).d = true;
         ((a1)var11).a = var10;
         return (a1)var11;
      } else {
         return null;
      }
   }

   public static void h(EditorInfo var0, InputConnection var1, TextView var2) {
      int var3 = VERSION.SDK_INT;
      if (var3 < 30 && var1 != null) {
         CharSequence var11 = var2.getText();
         if (var3 >= 30) {
            F.b.a(var0, var11);
         } else {
            var11.getClass();
            if (var3 >= 30) {
               F.b.a(var0, var11);
            } else {
               var3 = var0.initialSelStart;
               int var4 = var0.initialSelEnd;
               int var5;
               if (var3 > var4) {
                  var5 = var4;
               } else {
                  var5 = var3;
               }

               if (var3 <= var4) {
                  var3 = var4;
               }

               var4 = var11.length();
               if (var5 >= 0 && var3 <= var4) {
                  int var6 = var0.inputType & 4095;
                  if (var6 != 129 && var6 != 225 && var6 != 18) {
                     if (var4 <= 2048) {
                        F.c.a(var0, var11, var5, var3);
                     } else {
                        int var8 = var3 - var5;
                        if (var8 > 1024) {
                           var4 = 0;
                        } else {
                           var4 = var8;
                        }

                        int var7 = var11.length();
                        var6 = 2048 - var4;
                        int var9 = Math.min(var7 - var3, var6 - Math.min(var5, (int)((double)var6 * 0.8)));
                        var7 = Math.min(var5, var6 - var9);
                        int var10 = var5 - var7;
                        var6 = var7;
                        var5 = var10;
                        if (Character.isLowSurrogate(var11.charAt(var10))) {
                           var5 = var10 + 1;
                           var6 = var7 - 1;
                        }

                        var7 = var9;
                        if (Character.isHighSurrogate(var11.charAt(var3 + var9 - 1))) {
                           var7 = var9 - 1;
                        }

                        var9 = var6 + var4;
                        if (var4 != var8) {
                           var11 = TextUtils.concat(new CharSequence[]{var11.subSequence(var5, var5 + var6), var11.subSequence(var3, var7 + var3)});
                        } else {
                           var11 = var11.subSequence(var5, var9 + var7 + var5);
                        }

                        F.c.a(var0, var11, var6, var9);
                     }
                  } else {
                     F.c.a(var0, (CharSequence)null, 0, 0);
                  }
               } else {
                  F.c.a(var0, (CharSequence)null, 0, 0);
               }
            }
         }
      }

   }

   public final void a(Drawable var1, a1 var2) {
      if (var1 != null && var2 != null) {
         y.d(var1, var2, this.a.getDrawableState());
      }

   }

   public final void b() {
      a1 var2 = this.b;
      TextView var1 = this.a;
      if (var2 != null || this.c != null || this.d != null || this.e != null) {
         Drawable[] var4 = var1.getCompoundDrawables();
         this.a(var4[0], this.b);
         this.a(var4[1], this.c);
         this.a(var4[2], this.d);
         this.a(var4[3], this.e);
      }

      if (this.f != null || this.g != null) {
         Drawable[] var3 = var1.getCompoundDrawablesRelative();
         this.a(var3[0], this.f);
         this.a(var3[2], this.g);
      }

   }

   public final ColorStateList d() {
      a1 var1 = this.h;
      ColorStateList var2;
      if (var1 != null) {
         var2 = var1.a;
      } else {
         var2 = null;
      }

      return var2;
   }

   public final PorterDuff.Mode e() {
      a1 var1 = this.h;
      PorterDuff.Mode var2;
      if (var1 != null) {
         var2 = var1.b;
      } else {
         var2 = null;
      }

      return var2;
   }

   public final void f(AttributeSet var1, int var2) {
      TextView var16 = this.a;
      Context var17 = var16.getContext();
      y var14 = y.a();
      int[] var12 = g.a.h;
      X.h var11 = X.h.m(var17, var1, var12, var2);
      T.h(var16, var16.getContext(), var12, var1, (TypedArray)var11.b, var2);
      TypedArray var26 = (TypedArray)var11.b;
      int var7 = var26.getResourceId(0, -1);
      if (var26.hasValue(3)) {
         this.b = c(var17, var14, var26.getResourceId(3, 0));
      }

      if (var26.hasValue(1)) {
         this.c = c(var17, var14, var26.getResourceId(1, 0));
      }

      if (var26.hasValue(4)) {
         this.d = c(var17, var14, var26.getResourceId(4, 0));
      }

      if (var26.hasValue(2)) {
         this.e = c(var17, var14, var26.getResourceId(2, 0));
      }

      if (var26.hasValue(5)) {
         this.f = c(var17, var14, var26.getResourceId(5, 0));
      }

      if (var26.hasValue(6)) {
         this.g = c(var17, var14, var26.getResourceId(6, 0));
      }

      var11.o();
      boolean var10 = var16.getTransformationMethod() instanceof PasswordTransformationMethod;
      int[] var13 = g.a.v;
      int var8;
      boolean var9;
      boolean var23;
      String var25;
      String var27;
      if (var7 != -1) {
         TypedArray var24 = var17.obtainStyledAttributes(var7, var13);
         X.h var15 = new X.h(var17, var24);
         if (!var10 && var24.hasValue(14)) {
            var9 = var24.getBoolean(14, false);
            var23 = true;
         } else {
            var9 = false;
            var23 = false;
         }

         this.n(var17, var15);
         var8 = VERSION.SDK_INT;
         if (var24.hasValue(15)) {
            var27 = var24.getString(15);
         } else {
            var27 = null;
         }

         if (var8 >= 26 && var24.hasValue(13)) {
            var25 = var24.getString(13);
         } else {
            var25 = null;
         }

         var15.o();
      } else {
         var9 = false;
         var23 = false;
         var25 = null;
         var27 = null;
      }

      TypedArray var37 = var17.obtainStyledAttributes(var1, var13, var2, 0);
      X.h var28 = new X.h(var17, var37);
      if (!var10 && var37.hasValue(14)) {
         var9 = var37.getBoolean(14, false);
         var23 = true;
      }

      var8 = VERSION.SDK_INT;
      if (var37.hasValue(15)) {
         var27 = var37.getString(15);
      }

      if (var8 >= 26 && var37.hasValue(13)) {
         var25 = var37.getString(13);
      }

      if (var8 >= 28 && var37.hasValue(0) && var37.getDimensionPixelSize(0, -1) == 0) {
         var16.setTextSize(0, 0.0F);
      }

      this.n(var17, var28);
      var28.o();
      if (!var10 && var23) {
         var16.setAllCaps(var9);
      }

      Typeface var30 = this.l;
      if (var30 != null) {
         if (this.k == -1) {
            var16.setTypeface(var30, this.j);
         } else {
            var16.setTypeface(var30);
         }
      }

      if (var25 != null) {
         c0.d(var16, var25);
      }

      if (var27 != null) {
         b0.b(var16, b0.a(var27));
      }

      var12 = g.a.i;
      n0 var29 = this.i;
      Context var39 = var29.j;
      TypedArray var32 = var39.obtainStyledAttributes(var1, var12, var2, 0);
      TextView var18 = var29.i;
      T.h(var18, var18.getContext(), var12, var1, var32, var2);
      if (var32.hasValue(5)) {
         var29.a = var32.getInt(5, 0);
      }

      float var3;
      if (var32.hasValue(4)) {
         var3 = var32.getDimension(4, -1.0F);
      } else {
         var3 = -1.0F;
      }

      float var5;
      if (var32.hasValue(2)) {
         var5 = var32.getDimension(2, -1.0F);
      } else {
         var5 = -1.0F;
      }

      float var4;
      if (var32.hasValue(1)) {
         var4 = var32.getDimension(1, -1.0F);
      } else {
         var4 = -1.0F;
      }

      if (var32.hasValue(3)) {
         var2 = var32.getResourceId(3, 0);
         if (var2 > 0) {
            TypedArray var19 = var32.getResources().obtainTypedArray(var2);
            var7 = var19.length();
            int[] var43 = new int[var7];
            if (var7 > 0) {
               for(var2 = 0; var2 < var7; ++var2) {
                  var43[var2] = var19.getDimensionPixelSize(var2, -1);
               }

               var29.f = n0.b(var43);
               var29.i();
            }

            var19.recycle();
         }
      }

      var32.recycle();
      if (var29.j()) {
         if (var29.a == 1) {
            if (!var29.g) {
               DisplayMetrics var33 = var39.getResources().getDisplayMetrics();
               if (var5 == -1.0F) {
                  var5 = TypedValue.applyDimension(2, 12.0F, var33);
               }

               float var6 = var4;
               if (var4 == -1.0F) {
                  var6 = TypedValue.applyDimension(2, 112.0F, var33);
               }

               var4 = var3;
               if (var3 == -1.0F) {
                  var4 = 1.0F;
               }

               var29.k(var5, var6, var4);
            }

            var29.h();
         }
      } else {
         var29.a = 0;
      }

      if (t1.c && var29.a != 0) {
         var13 = var29.f;
         if (var13.length > 0) {
            if ((float)c0.a(var16) != -1.0F) {
               c0.b(var16, Math.round(var29.d), Math.round(var29.e), Math.round(var29.c), 0);
            } else {
               c0.c(var16, var13, 0);
            }
         }
      }

      TypedArray var44 = var17.obtainStyledAttributes(var1, var12);
      var2 = var44.getResourceId(8, -1);
      Drawable var36;
      if (var2 != -1) {
         var36 = var14.b(var17, var2);
      } else {
         var36 = null;
      }

      var2 = var44.getResourceId(13, -1);
      Drawable var31;
      if (var2 != -1) {
         var31 = var14.b(var17, var2);
      } else {
         var31 = null;
      }

      var2 = var44.getResourceId(9, -1);
      Drawable var35;
      if (var2 != -1) {
         var35 = var14.b(var17, var2);
      } else {
         var35 = null;
      }

      var2 = var44.getResourceId(6, -1);
      Drawable var20;
      if (var2 != -1) {
         var20 = var14.b(var17, var2);
      } else {
         var20 = null;
      }

      var2 = var44.getResourceId(10, -1);
      Drawable var40;
      if (var2 != -1) {
         var40 = var14.b(var17, var2);
      } else {
         var40 = null;
      }

      var2 = var44.getResourceId(7, -1);
      Drawable var34;
      if (var2 != -1) {
         var34 = var14.b(var17, var2);
      } else {
         var34 = null;
      }

      if (var40 == null && var34 == null) {
         if (var36 != null || var31 != null || var35 != null || var20 != null) {
            Drawable[] var42 = var16.getCompoundDrawablesRelative();
            var34 = var42[0];
            if (var34 == null && var42[2] == null) {
               Drawable[] var41 = var16.getCompoundDrawables();
               if (var36 == null) {
                  var36 = var41[0];
               }

               if (var31 == null) {
                  var31 = var41[1];
               }

               if (var35 == null) {
                  var35 = var41[2];
               }

               if (var20 == null) {
                  var20 = var41[3];
               }

               var16.setCompoundDrawablesWithIntrinsicBounds(var36, var31, var35, var20);
            } else {
               if (var31 == null) {
                  var31 = var42[1];
               }

               if (var20 == null) {
                  var20 = var42[3];
               }

               var16.setCompoundDrawablesRelativeWithIntrinsicBounds(var34, var31, var42[2], var20);
            }
         }
      } else {
         Drawable[] var38 = var16.getCompoundDrawablesRelative();
         if (var40 == null) {
            var40 = var38[0];
         }

         if (var31 == null) {
            var31 = var38[1];
         }

         if (var34 == null) {
            var34 = var38[2];
         }

         if (var20 == null) {
            var20 = var38[3];
         }

         var16.setCompoundDrawablesRelativeWithIntrinsicBounds(var40, var31, var34, var20);
      }

      if (var44.hasValue(11)) {
         ColorStateList var21;
         label267: {
            if (var44.hasValue(11)) {
               var2 = var44.getResourceId(11, 0);
               if (var2 != 0) {
                  var21 = C.b.l(var17, var2);
                  if (var21 != null) {
                     break label267;
                  }
               }
            }

            var21 = var44.getColorStateList(11);
         }

         var16.setCompoundDrawableTintList(var21);
      }

      if (var44.hasValue(12)) {
         var16.setCompoundDrawableTintMode(s0.b(var44.getInt(12, -1), (PorterDuff.Mode)null));
      }

      var7 = var44.getDimensionPixelSize(15, -1);
      var8 = var44.getDimensionPixelSize(18, -1);
      if (var44.hasValue(19)) {
         TypedValue var22 = var44.peekValue(19);
         if (var22 != null && var22.type == 5) {
            var2 = var22.data;
            var3 = TypedValue.complexToFloat(var2);
            var2 &= 15;
         } else {
            var3 = (float)var44.getDimensionPixelSize(19, -1);
            var2 = -1;
         }
      } else {
         var2 = -1;
         var3 = -1.0F;
      }

      var44.recycle();
      if (var7 != -1) {
         C.b.E(var16, var7);
      }

      if (var8 != -1) {
         C.b.F(var16, var8);
      }

      if (var3 != -1.0F) {
         if (var2 == -1) {
            C.b.G(var16, (int)var3);
         } else if (VERSION.SDK_INT >= 34) {
            C.i(var16, var2, var3);
         } else {
            C.b.G(var16, Math.round(TypedValue.applyDimension(var2, var3, var16.getResources().getDisplayMetrics())));
         }
      }

   }

   public final void g(Context var1, int var2) {
      TypedArray var6 = var1.obtainStyledAttributes(var2, g.a.v);
      X.h var5 = new X.h(var1, var6);
      boolean var3 = var6.hasValue(14);
      TextView var4 = this.a;
      if (var3) {
         var4.setAllCaps(var6.getBoolean(14, false));
      }

      var2 = VERSION.SDK_INT;
      if (var6.hasValue(0) && var6.getDimensionPixelSize(0, -1) == 0) {
         var4.setTextSize(0, 0.0F);
      }

      this.n(var1, var5);
      if (var2 >= 26 && var6.hasValue(13)) {
         String var7 = var6.getString(13);
         if (var7 != null) {
            c0.d(var4, var7);
         }
      }

      var5.o();
      Typeface var8 = this.l;
      if (var8 != null) {
         var4.setTypeface(var8, this.j);
      }

   }

   public final void i(int var1, int var2, int var3, int var4) {
      n0 var5 = this.i;
      if (var5.j()) {
         DisplayMetrics var6 = var5.j.getResources().getDisplayMetrics();
         var5.k(TypedValue.applyDimension(var4, (float)var1, var6), TypedValue.applyDimension(var4, (float)var2, var6), TypedValue.applyDimension(var4, (float)var3, var6));
         if (var5.h()) {
            var5.a();
         }
      }

   }

   public final void j(int[] var1, int var2) {
      n0 var7 = this.i;
      if (var7.j()) {
         int var4 = var1.length;
         int var3 = 0;
         if (var4 <= 0) {
            var7.g = false;
         } else {
            int[] var6 = new int[var4];
            int[] var5;
            if (var2 == 0) {
               var5 = Arrays.copyOf(var1, var4);
            } else {
               DisplayMetrics var8 = var7.j.getResources().getDisplayMetrics();

               while(true) {
                  var5 = var6;
                  if (var3 >= var4) {
                     break;
                  }

                  var6[var3] = Math.round(TypedValue.applyDimension(var2, (float)var1[var3], var8));
                  ++var3;
               }
            }

            var7.f = n0.b(var5);
            if (!var7.i()) {
               StringBuilder var9 = new StringBuilder("None of the preset sizes is valid: ");
               var9.append(Arrays.toString(var1));
               throw new IllegalArgumentException(var9.toString());
            }
         }

         if (var7.h()) {
            var7.a();
         }
      }

   }

   public final void k(int var1) {
      n0 var3 = this.i;
      if (var3.j()) {
         if (var1 != 0) {
            if (var1 != 1) {
               StringBuilder var4 = new StringBuilder("Unknown auto-size text type: ");
               var4.append(var1);
               throw new IllegalArgumentException(var4.toString());
            }

            DisplayMetrics var2 = var3.j.getResources().getDisplayMetrics();
            var3.k(TypedValue.applyDimension(2, 12.0F, var2), TypedValue.applyDimension(2, 112.0F, var2), 1.0F);
            if (var3.h()) {
               var3.a();
            }
         } else {
            var3.a = 0;
            var3.d = -1.0F;
            var3.e = -1.0F;
            var3.c = -1.0F;
            var3.f = new int[0];
            var3.b = false;
         }
      }

   }

   public final void l(ColorStateList var1) {
      if (this.h == null) {
         this.h = (a1)(new Object());
      }

      a1 var3 = this.h;
      var3.a = var1;
      boolean var2;
      if (var1 != null) {
         var2 = true;
      } else {
         var2 = false;
      }

      var3.d = var2;
      this.b = var3;
      this.c = var3;
      this.d = var3;
      this.e = var3;
      this.f = var3;
      this.g = var3;
   }

   public final void m(PorterDuff.Mode var1) {
      if (this.h == null) {
         this.h = (a1)(new Object());
      }

      a1 var3 = this.h;
      var3.b = var1;
      boolean var2;
      if (var1 != null) {
         var2 = true;
      } else {
         var2 = false;
      }

      var3.c = var2;
      this.b = var3;
      this.c = var3;
      this.d = var3;
      this.e = var3;
      this.f = var3;
      this.g = var3;
   }

   public final void n(Context var1, X.h var2) {
      int var3 = this.j;
      TypedArray var9 = (TypedArray)var2.b;
      this.j = var9.getInt(2, var3);
      int var4 = VERSION.SDK_INT;
      if (var4 >= 28) {
         var3 = var9.getInt(11, -1);
         this.k = var3;
         if (var3 != -1) {
            this.j &= 2;
         }
      }

      byte var19 = 10;
      boolean var7 = var9.hasValue(10);
      boolean var8 = false;
      if (!var7 && !var9.hasValue(12)) {
         if (var9.hasValue(1)) {
            this.m = false;
            var3 = var9.getInt(1, 1);
            if (var3 != 1) {
               if (var3 != 2) {
                  if (var3 == 3) {
                     this.l = Typeface.MONOSPACE;
                  }
               } else {
                  this.l = Typeface.SERIF;
               }
            } else {
               this.l = Typeface.SANS_SERIF;
            }
         }

      } else {
         this.l = null;
         if (var9.hasValue(12)) {
            var19 = 12;
         }

         int var6 = this.k;
         int var5 = this.j;
         Typeface var17;
         if (!var1.isRestricted()) {
            label127: {
               Z var16 = new Z(this, var6, var5, new WeakReference(this.a));

               boolean var10001;
               try {
                  var17 = var2.j(var19, this.j, var16);
               } catch (Resources.NotFoundException | UnsupportedOperationException var15) {
                  var10001 = false;
                  break label127;
               }

               if (var17 != null) {
                  label125: {
                     if (var4 >= 28) {
                        label124: {
                           label103: {
                              label102: {
                                 try {
                                    if (this.k == -1) {
                                       break label124;
                                    }

                                    var17 = Typeface.create(var17, 0);
                                    var4 = this.k;
                                    if ((this.j & 2) != 0) {
                                       break label102;
                                    }
                                 } catch (Resources.NotFoundException | UnsupportedOperationException var14) {
                                    var10001 = false;
                                    break label127;
                                 }

                                 var7 = false;
                                 break label103;
                              }

                              var7 = true;
                           }

                           try {
                              this.l = d0.a(var17, var4, var7);
                              break label125;
                           } catch (Resources.NotFoundException | UnsupportedOperationException var13) {
                              var10001 = false;
                              break label127;
                           }
                        }
                     }

                     try {
                        this.l = var17;
                     } catch (Resources.NotFoundException | UnsupportedOperationException var12) {
                        var10001 = false;
                        break label127;
                     }
                  }
               }

               label87: {
                  label86: {
                     try {
                        if (this.l != null) {
                           break label86;
                        }
                     } catch (Resources.NotFoundException | UnsupportedOperationException var11) {
                        var10001 = false;
                        break label127;
                     }

                     var7 = true;
                     break label87;
                  }

                  var7 = false;
               }

               try {
                  this.m = var7;
               } catch (Resources.NotFoundException | UnsupportedOperationException var10) {
                  var10001 = false;
               }
            }
         }

         if (this.l == null) {
            String var18 = var9.getString(var19);
            if (var18 != null) {
               if (VERSION.SDK_INT >= 28 && this.k != -1) {
                  var17 = Typeface.create(var18, 0);
                  var3 = this.k;
                  var7 = var8;
                  if ((this.j & 2) != 0) {
                     var7 = true;
                  }

                  this.l = d0.a(var17, var3, var7);
               } else {
                  this.l = Typeface.create(var18, this.j);
               }
            }
         }

      }
   }
}
