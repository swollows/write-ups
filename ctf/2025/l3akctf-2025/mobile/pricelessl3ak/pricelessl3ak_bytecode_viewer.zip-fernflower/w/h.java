package w;

import A.m;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.net.Uri;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class h extends f {
   public final Class f;
   public final Constructor g;
   public final Method h;
   public final Method i;
   public final Method j;
   public final Method k;
   public final Method l;

   public h() {
      super(3);
      Object var8 = null;

      Constructor var2;
      Method var3;
      Method var4;
      Method var5;
      Method var6;
      Method var7;
      Class var12;
      label16: {
         Object var1;
         try {
            var12 = Class.forName("android.graphics.FontFamily");
            var2 = var12.getConstructor((Class[])null);
            var3 = C(var12);
            Class var13 = Integer.TYPE;
            var5 = var12.getMethod("addFontFromBuffer", ByteBuffer.class, var13, FontVariationAxis[].class, var13, var13);
            var6 = var12.getMethod("freeze", (Class[])null);
            var4 = var12.getMethod("abortCreation", (Class[])null);
            var7 = this.D(var12);
            break label16;
         } catch (ClassNotFoundException var10) {
            var1 = var10;
         } catch (NoSuchMethodException var11) {
            var1 = var11;
         }

         Log.e("TypefaceCompatApi26Impl", "Unable to collect necessary methods for class ".concat(var1.getClass().getName()), (Throwable)var1);
         Object var9 = null;
         var7 = null;
         var4 = var7;
         var6 = var7;
         var5 = var7;
         var3 = var7;
         var2 = var7;
         var7 = (Method)var9;
         var12 = (Class)var8;
      }

      this.f = var12;
      this.g = var2;
      this.h = var3;
      this.i = var5;
      this.j = var6;
      this.k = var4;
      this.l = var7;
   }

   public static Method C(Class var0) {
      Class var1 = Integer.TYPE;
      return var0.getMethod("addFontFromAssetManager", AssetManager.class, String.class, var1, Boolean.TYPE, var1, var1, var1, FontVariationAxis[].class);
   }

   public final boolean A() {
      Method var2 = this.h;
      if (var2 == null) {
         Log.w("TypefaceCompatApi26Impl", "Unable to collect necessary private methods. Fallback to legacy implementation.");
      }

      boolean var1;
      if (var2 != null) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final Object B() {
      Object var1 = null;

      Object var2;
      try {
         var2 = this.g.newInstance((Object[])null);
      } catch (InstantiationException | InvocationTargetException | IllegalAccessException var3) {
         return var1;
      }

      var1 = var2;
      return var1;
   }

   public Method D(Class var1) {
      var1 = Array.newInstance(var1, 1).getClass();
      Class var2 = Integer.TYPE;
      Method var3 = Typeface.class.getDeclaredMethod("createFromFamiliesWithDefault", var1, var2, var2);
      var3.setAccessible(true);
      return var3;
   }

   public final Typeface i(Context var1, v.e var2, Resources var3, int var4) {
      if (!this.A()) {
         return super.i(var1, var2, var3, var4);
      } else {
         Object var12 = this.B();
         if (var12 == null) {
            return null;
         } else {
            v.f[] var10 = var2.a;
            int var5 = var10.length;

            for(var4 = 0; var4 < var5; ++var4) {
               v.f var11 = var10[var4];
               String var8 = var11.a;
               FontVariationAxis[] var9 = FontVariationAxis.fromFontVariationSettings(var11.d);
               int var6 = var11.b;
               byte var7 = var11.c;
               if (!this.x(var1, var12, var8, var11.e, var6, var7, var9)) {
                  this.w(var12);
                  return null;
               }
            }

            if (!this.z(var12)) {
               return null;
            } else {
               return this.y(var12);
            }
         }
      }
   }

   public final Typeface j(Context var1, m[] var2, int var3) {
      if (var2.length < 1) {
         return null;
      } else if (!this.A()) {
         m var40 = this.n(var2, var3);
         ContentResolver var39 = var1.getContentResolver();

         boolean var10001;
         ParcelFileDescriptor var41;
         try {
            var41 = var39.openFileDescriptor(var40.a, "r", (CancellationSignal)null);
         } catch (IOException var36) {
            var10001 = false;
            return null;
         }

         if (var41 == null) {
            if (var41 != null) {
               try {
                  var41.close();
               } catch (IOException var33) {
                  var10001 = false;
                  return null;
               }
            }

            return null;
         } else {
            Typeface var44;
            try {
               Typeface.Builder var48 = new Typeface.Builder(var41.getFileDescriptor());
               var44 = var48.setWeight(var40.c).setItalic(var40.d).build();
            } catch (Throwable var35) {
               Throwable var42 = var35;

               try {
                  var41.close();
               } catch (Throwable var32) {
                  Throwable var43 = var32;

                  label323:
                  try {
                     var42.addSuppressed(var43);
                     break label323;
                  } catch (IOException var31) {
                     var10001 = false;
                     return null;
                  }
               }

               try {
                  throw var42;
               } catch (IOException var30) {
                  var10001 = false;
                  return null;
               }
            }

            try {
               var41.close();
               return var44;
            } catch (IOException var34) {
               var10001 = false;
               return null;
            }
         }
      } else {
         HashMap var10 = new HashMap();
         int var5 = var2.length;

         int var4;
         m var11;
         for(var4 = 0; var4 < var5; ++var4) {
            var11 = var2[var4];
            if (var11.e == 0) {
               Uri var49 = var11.a;
               if (!var10.containsKey(var49)) {
                  var10.put(var49, q.e.r(var1, var49));
               }
            }
         }

         Map var47 = Collections.unmodifiableMap(var10);
         Object var37 = this.B();
         if (var37 == null) {
            return null;
         } else {
            int var6 = var2.length;
            var4 = 0;

            boolean var45;
            for(var45 = false; var4 < var6; ++var4) {
               var11 = var2[var4];
               ByteBuffer var12 = (ByteBuffer)var47.get(var11.a);
               if (var12 != null) {
                  int var7 = var11.b;
                  int var8 = var11.c;
                  byte var46 = var11.d;

                  boolean var9;
                  try {
                     var9 = (Boolean)this.i.invoke(var37, var12, var7, null, var8, Integer.valueOf(var46));
                  } catch (InvocationTargetException | IllegalAccessException var29) {
                     var9 = false;
                  }

                  if (!var9) {
                     this.w(var37);
                     return null;
                  }

                  var45 = true;
               }
            }

            if (!var45) {
               this.w(var37);
               return null;
            } else if (!this.z(var37)) {
               return null;
            } else {
               Typeface var38 = this.y(var37);
               if (var38 == null) {
                  return null;
               } else {
                  return Typeface.create(var38, var3);
               }
            }
         }
      }
   }

   public final Typeface m(Context var1, Resources var2, int var3, String var4, int var5) {
      if (!this.A()) {
         return super.m(var1, var2, var3, var4, var5);
      } else {
         Object var6 = this.B();
         if (var6 == null) {
            return null;
         } else if (!this.x(var1, var6, var4, 0, -1, -1, (FontVariationAxis[])null)) {
            this.w(var6);
            return null;
         } else {
            return !this.z(var6) ? null : this.y(var6);
         }
      }
   }

   public final void w(Object var1) {
      try {
         this.k.invoke(var1, (Object[])null);
      } catch (InvocationTargetException | IllegalAccessException var2) {
      }

   }

   public final boolean x(Context var1, Object var2, String var3, int var4, int var5, int var6, FontVariationAxis[] var7) {
      boolean var8 = false;

      boolean var9;
      try {
         var9 = (Boolean)this.h.invoke(var2, var1.getAssets(), var3, 0, Boolean.FALSE, var4, var5, var6, var7);
      } catch (InvocationTargetException | IllegalAccessException var10) {
         return var8;
      }

      var8 = var9;
      return var8;
   }

   public Typeface y(Object var1) {
      try {
         Object var2 = Array.newInstance(this.f, 1);
         Array.set(var2, 0, var1);
         Typeface var4 = (Typeface)this.l.invoke((Object)null, var2, -1, -1);
         return var4;
      } catch (InvocationTargetException | IllegalAccessException var3) {
         return null;
      }
   }

   public final boolean z(Object var1) {
      try {
         boolean var2 = (Boolean)this.j.invoke(var1, (Object[])null);
         return var2;
      } catch (InvocationTargetException | IllegalAccessException var3) {
         return false;
      }
   }
}
