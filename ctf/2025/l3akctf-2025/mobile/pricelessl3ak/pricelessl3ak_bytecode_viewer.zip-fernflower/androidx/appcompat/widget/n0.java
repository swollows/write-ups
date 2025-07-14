package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.Layout.Alignment;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public final class n0 {
   public static final RectF l = new RectF();
   public static final ConcurrentHashMap m = new ConcurrentHashMap();
   public int a = 0;
   public boolean b = false;
   public float c = -1.0F;
   public float d = -1.0F;
   public float e = -1.0F;
   public int[] f = new int[0];
   public boolean g = false;
   public TextPaint h;
   public final TextView i;
   public final Context j;
   public final k0 k;

   public n0(TextView var1) {
      this.i = var1;
      this.j = var1.getContext();
      if (VERSION.SDK_INT >= 29) {
         this.k = new l0();
      } else {
         this.k = new k0();
      }

   }

   public static int[] b(int[] var0) {
      int var3 = var0.length;
      if (var3 == 0) {
         return var0;
      } else {
         Arrays.sort(var0);
         ArrayList var5 = new ArrayList();
         byte var2 = 0;

         int var1;
         for(var1 = 0; var1 < var3; ++var1) {
            int var4 = var0[var1];
            if (var4 > 0 && Collections.binarySearch(var5, var4) < 0) {
               var5.add(var4);
            }
         }

         if (var3 == var5.size()) {
            return var0;
         } else {
            var3 = var5.size();
            var0 = new int[var3];

            for(var1 = var2; var1 < var3; ++var1) {
               var0[var1] = (Integer)var5.get(var1);
            }

            return var0;
         }
      }
   }

   public static Method d(String var0) {
      Exception var10000;
      label44: {
         boolean var10001;
         Method var2;
         ConcurrentHashMap var3;
         try {
            var3 = m;
            var2 = (Method)var3.get(var0);
         } catch (Exception var6) {
            var10000 = var6;
            var10001 = false;
            break label44;
         }

         Method var1 = var2;
         if (var2 != null) {
            return var1;
         }

         try {
            var2 = TextView.class.getDeclaredMethod(var0, (Class[])null);
         } catch (Exception var5) {
            var10000 = var5;
            var10001 = false;
            break label44;
         }

         var1 = var2;
         if (var2 == null) {
            return var1;
         }

         try {
            var2.setAccessible(true);
            var3.put(var0, var2);
         } catch (Exception var4) {
            var10000 = var4;
            var10001 = false;
            break label44;
         }

         var1 = var2;
         return var1;
      }

      Exception var8 = var10000;
      StringBuilder var7 = new StringBuilder("Failed to retrieve TextView#");
      var7.append(var0);
      var7.append("() method");
      Log.w("ACTVAutoSizeHelper", var7.toString(), var8);
      return null;
   }

   public static Object e(Object var0, String var1, Object var2) {
      label43: {
         Exception var3;
         try {
            var0 = d(var1).invoke(var0, (Object[])null);
            break label43;
         } catch (Exception var6) {
            var3 = var6;
         } finally {
            ;
         }

         StringBuilder var8 = new StringBuilder("Failed to invoke TextView#");
         var8.append(var1);
         var8.append("() method");
         Log.w("ACTVAutoSizeHelper", var8.toString(), var3);
         return var2;
      }

      var2 = var0;
      return var2;
   }

   public final void a() {
      if (this.f()) {
         if (this.b) {
            label266: {
               if (this.i.getMeasuredHeight() <= 0 || this.i.getMeasuredWidth() <= 0) {
                  return;
               }

               int var2;
               if (this.k.b(this.i)) {
                  var2 = 1048576;
               } else {
                  var2 = this.i.getMeasuredWidth() - this.i.getTotalPaddingLeft() - this.i.getTotalPaddingRight();
               }

               int var3 = this.i.getHeight() - this.i.getCompoundPaddingBottom() - this.i.getCompoundPaddingTop();
               if (var2 <= 0 || var3 <= 0) {
                  return;
               }

               RectF var4 = l;
               synchronized(var4){}

               Throwable var10000;
               boolean var10001;
               label264: {
                  try {
                     var4.setEmpty();
                     var4.right = (float)var2;
                     var4.bottom = (float)var3;
                     float var1 = (float)this.c(var4);
                     if (var1 != this.i.getTextSize()) {
                        this.g(0, var1);
                     }
                  } catch (Throwable var17) {
                     var10000 = var17;
                     var10001 = false;
                     break label264;
                  }

                  label248:
                  try {
                     break label266;
                  } catch (Throwable var16) {
                     var10000 = var16;
                     var10001 = false;
                     break label248;
                  }
               }

               while(true) {
                  Throwable var5 = var10000;

                  try {
                     throw var5;
                  } catch (Throwable var15) {
                     var10000 = var15;
                     var10001 = false;
                     continue;
                  }
               }
            }
         }

         this.b = true;
      }
   }

   public final int c(RectF var1) {
      int var2 = this.f.length;
      if (var2 == 0) {
         throw new IllegalStateException("No available text sizes to choose from.");
      } else {
         int var4 = var2 - 1;
         int var3 = 0;
         var2 = 1;

         while(true) {
            while(var2 <= var4) {
               int var5 = (var2 + var4) / 2;
               int var6 = this.f[var5];
               TextView var10 = this.i;
               CharSequence var8 = var10.getText();
               TransformationMethod var9 = var10.getTransformationMethod();
               CharSequence var7 = var8;
               if (var9 != null) {
                  CharSequence var14 = var9.getTransformation(var8, var10);
                  var7 = var8;
                  if (var14 != null) {
                     var7 = var14;
                  }
               }

               var3 = var10.getMaxLines();
               TextPaint var11 = this.h;
               if (var11 == null) {
                  this.h = new TextPaint();
               } else {
                  var11.reset();
               }

               this.h.set(var10.getPaint());
               this.h.setTextSize((float)var6);
               Layout.Alignment var15 = (Layout.Alignment)e(var10, "getLayoutAlignment", Alignment.ALIGN_NORMAL);
               var6 = Math.round(var1.right);
               TextPaint var16 = this.h;
               k0 var12 = this.k;
               StaticLayout var13 = j0.a(var7, var15, var6, var3, this.i, var16, var12);
               if (var3 != -1 && (var13.getLineCount() > var3 || var13.getLineEnd(var13.getLineCount() - 1) != var7.length()) || (float)var13.getHeight() > var1.bottom) {
                  var3 = var5 - 1;
                  var4 = var3;
               } else {
                  var3 = var2;
                  var2 = var5 + 1;
               }
            }

            return this.f[var3];
         }
      }
   }

   public final boolean f() {
      boolean var1;
      if (this.j() && this.a != 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final void g(int var1, float var2) {
      Context var4 = this.j;
      Resources var8;
      if (var4 == null) {
         var8 = Resources.getSystem();
      } else {
         var8 = var4.getResources();
      }

      var2 = TypedValue.applyDimension(var1, var2, var8.getDisplayMetrics());
      TextView var9 = this.i;
      if (var2 != var9.getPaint().getTextSize()) {
         var9.getPaint().setTextSize(var2);
         boolean var3 = var9.isInLayout();
         if (var9.getLayout() != null) {
            this.b = false;

            label36: {
               Exception var10000;
               label45: {
                  Method var5;
                  boolean var10001;
                  try {
                     var5 = d("nullLayouts");
                  } catch (Exception var7) {
                     var10000 = var7;
                     var10001 = false;
                     break label45;
                  }

                  if (var5 == null) {
                     break label36;
                  }

                  try {
                     var5.invoke(var9, (Object[])null);
                     break label36;
                  } catch (Exception var6) {
                     var10000 = var6;
                     var10001 = false;
                  }
               }

               Exception var10 = var10000;
               Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", var10);
            }

            if (!var3) {
               var9.requestLayout();
            } else {
               var9.forceLayout();
            }

            var9.invalidate();
         }
      }

   }

   public final boolean h() {
      boolean var4 = this.j();
      int var2 = 0;
      if (var4 && this.a == 1) {
         if (!this.g || this.f.length == 0) {
            int var3 = (int)Math.floor((double)((this.e - this.d) / this.c)) + 1;

            int[] var5;
            for(var5 = new int[var3]; var2 < var3; ++var2) {
               float var1 = this.d;
               var5[var2] = Math.round((float)var2 * this.c + var1);
            }

            this.f = b(var5);
         }

         this.b = true;
      } else {
         this.b = false;
      }

      return this.b;
   }

   public final boolean i() {
      int[] var3 = this.f;
      int var1 = var3.length;
      boolean var2;
      if (var1 > 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.g = var2;
      if (var2) {
         this.a = 1;
         this.d = (float)var3[0];
         this.e = (float)var3[var1 - 1];
         this.c = -1.0F;
      }

      return var2;
   }

   public final boolean j() {
      return this.i instanceof A ^ true;
   }

   public final void k(float var1, float var2, float var3) {
      StringBuilder var4;
      if (!(var1 <= 0.0F)) {
         if (!(var2 <= var1)) {
            if (!(var3 <= 0.0F)) {
               this.a = 1;
               this.d = var1;
               this.e = var2;
               this.c = var3;
               this.g = false;
            } else {
               var4 = new StringBuilder("The auto-size step granularity (");
               var4.append(var3);
               var4.append("px) is less or equal to (0px)");
               throw new IllegalArgumentException(var4.toString());
            }
         } else {
            var4 = new StringBuilder("Maximum auto-size text size (");
            var4.append(var2);
            var4.append("px) is less or equal to minimum auto-size text size (");
            var4.append(var1);
            var4.append("px)");
            throw new IllegalArgumentException(var4.toString());
         }
      } else {
         var4 = new StringBuilder("Minimum auto-size text size (");
         var4.append(var1);
         var4.append("px) is less or equal to (0px)");
         throw new IllegalArgumentException(var4.toString());
      }
   }
}
