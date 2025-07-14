package androidx.appcompat.widget;

import D.T;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ImageView;

public final class D {
   public final ImageView a;
   public a1 b;
   public int c = 0;

   public D(ImageView var1) {
      this.a = var1;
   }

   public final void a() {
      ImageView var2 = this.a;
      Drawable var3 = var2.getDrawable();
      if (var3 != null) {
         s0.a(var3);
      }

      if (var3 != null) {
         a1 var1 = this.b;
         if (var1 != null) {
            y.d(var3, var1, var2.getDrawableState());
         }
      }

   }

   public final void b(AttributeSet var1, int var2) {
      ImageView var5 = this.a;
      Context var4 = var5.getContext();
      int[] var3 = g.a.f;
      X.h var66 = X.h.m(var4, var1, var3, var2);
      T.h(var5, var5.getContext(), var3, var1, (TypedArray)var66.b, var2);

      label485: {
         Throwable var10000;
         label489: {
            Drawable var65;
            boolean var10001;
            try {
               var65 = var5.getDrawable();
            } catch (Throwable var62) {
               var10000 = var62;
               var10001 = false;
               break label489;
            }

            TypedArray var6 = (TypedArray)var66.b;
            Drawable var63 = var65;
            if (var65 == null) {
               try {
                  var2 = var6.getResourceId(1, -1);
               } catch (Throwable var61) {
                  var10000 = var61;
                  var10001 = false;
                  break label489;
               }

               var63 = var65;
               if (var2 != -1) {
                  try {
                     var65 = C.b.n(var5.getContext(), var2);
                  } catch (Throwable var60) {
                     var10000 = var60;
                     var10001 = false;
                     break label489;
                  }

                  var63 = var65;
                  if (var65 != null) {
                     try {
                        var5.setImageDrawable(var65);
                     } catch (Throwable var59) {
                        var10000 = var59;
                        var10001 = false;
                        break label489;
                     }

                     var63 = var65;
                  }
               }
            }

            if (var63 != null) {
               try {
                  s0.a(var63);
               } catch (Throwable var58) {
                  var10000 = var58;
                  var10001 = false;
                  break label489;
               }
            }

            try {
               if (var6.hasValue(2)) {
                  var5.setImageTintList(var66.g(2));
               }
            } catch (Throwable var57) {
               var10000 = var57;
               var10001 = false;
               break label489;
            }

            label463:
            try {
               if (var6.hasValue(3)) {
                  var5.setImageTintMode(s0.b(var6.getInt(3, -1), (PorterDuff.Mode)null));
               }
               break label485;
            } catch (Throwable var56) {
               var10000 = var56;
               var10001 = false;
               break label463;
            }
         }

         Throwable var64 = var10000;
         var66.o();
         throw var64;
      }

      var66.o();
   }
}
