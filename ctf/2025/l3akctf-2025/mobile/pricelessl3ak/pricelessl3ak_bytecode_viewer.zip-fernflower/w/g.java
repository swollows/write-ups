package w;

import A.m;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import m.k;

public final class g extends q.e {
   public static final Class a;
   public static final Constructor b;
   public static final Method c;
   public static final Method d;

   static {
      Object var4 = null;

      Method var1;
      Class var2;
      Method var3;
      Constructor var8;
      label18: {
         Method var5;
         label17: {
            Object var0;
            try {
               var2 = Class.forName("android.graphics.FontFamily");
               var8 = var2.getConstructor((Class[])null);
               Class var9 = Integer.TYPE;
               var5 = var2.getMethod("addFontWeightStyle", ByteBuffer.class, var9, List.class, var9, Boolean.TYPE);
               var1 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(var2, 1).getClass());
               break label17;
            } catch (ClassNotFoundException var6) {
               var0 = var6;
            } catch (NoSuchMethodException var7) {
               var0 = var7;
            }

            Log.e("TypefaceCompatApi24Impl", var0.getClass().getName(), (Throwable)var0);
            var2 = null;
            var3 = null;
            var1 = var3;
            var8 = (Constructor)var4;
            break label18;
         }

         var3 = var1;
         var1 = var5;
      }

      b = var8;
      a = var2;
      c = var1;
      d = var3;
   }

   public static boolean u(Object var0, ByteBuffer var1, int var2, int var3, boolean var4) {
      try {
         var4 = (Boolean)c.invoke(var0, var1, var2, null, var3, var4);
         return var4;
      } catch (InvocationTargetException | IllegalAccessException var5) {
         return false;
      }
   }

   public static Typeface v(Object var0) {
      try {
         Object var1 = Array.newInstance(a, 1);
         Array.set(var1, 0, var0);
         Typeface var3 = (Typeface)d.invoke((Object)null, var1);
         return var3;
      } catch (InvocationTargetException | IllegalAccessException var2) {
         return null;
      }
   }

   public final Typeface i(Context param1, v.e param2, Resources param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   public final Typeface j(Context var1, m[] var2, int var3) {
      Object var8;
      try {
         var8 = b.newInstance((Object[])null);
      } catch (InstantiationException | InvocationTargetException | IllegalAccessException var14) {
         var8 = null;
      }

      if (var8 == null) {
         return null;
      } else {
         int var4 = 0;
         k var13 = new k(0);

         for(int var5 = var2.length; var4 < var5; ++var4) {
            m var12 = var2[var4];
            Uri var11 = var12.a;
            ByteBuffer var10 = (ByteBuffer)var13.get(var11);
            Object var9 = var10;
            if (var10 == null) {
               var9 = q.e.r(var1, var11);
               var13.put(var11, var9);
            }

            if (var9 == null) {
               return null;
            }

            int var6 = var12.c;
            boolean var7 = var12.d;
            if (!u(var8, (ByteBuffer)var9, var12.b, var6, var7)) {
               return null;
            }
         }

         Typeface var15 = v(var8);
         if (var15 == null) {
            return null;
         } else {
            return Typeface.create(var15, var3);
         }
      }
   }
}
