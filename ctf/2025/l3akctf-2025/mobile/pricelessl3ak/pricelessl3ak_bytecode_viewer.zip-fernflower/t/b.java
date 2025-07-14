package t;

import android.app.Activity;
import android.content.res.Configuration;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import android.os.Build.VERSION;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.List;

public abstract class b {
   public static final Class a;
   public static final Field b;
   public static final Field c;
   public static final Method d;
   public static final Method e;
   public static final Method f;
   public static final Handler g = new Handler(Looper.getMainLooper());

   static {
      Object var2 = null;

      Class var1;
      try {
         var1 = Class.forName("android.app.ActivityThread");
      } finally {
         ;
      }

      a = var1;

      Field var47;
      try {
         var47 = Activity.class.getDeclaredField("mMainThread");
         var47.setAccessible(true);
      } finally {
         ;
      }

      b = var47;

      try {
         var47 = Activity.class.getDeclaredField("mToken");
         var47.setAccessible(true);
      } finally {
         ;
      }

      Method var48;
      label415: {
         c = var47;
         var1 = a;
         if (var1 != null) {
            label413:
            try {
               var48 = var1.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE, String.class);
               var48.setAccessible(true);
               break label415;
            } finally {
               break label413;
            }
         }

         var1 = null;
      }

      label409: {
         d = var1;
         var1 = a;
         if (var1 != null) {
            label407:
            try {
               var48 = var1.getDeclaredMethod("performStopActivity", IBinder.class, Boolean.TYPE);
               var48.setAccessible(true);
               break label409;
            } finally {
               break label407;
            }
         }

         var1 = null;
      }

      label403: {
         e = var1;
         Class var3 = a;
         int var0 = VERSION.SDK_INT;
         if (var0 != 26) {
            var48 = (Method)var2;
            if (var0 != 27) {
               break label403;
            }
         }

         if (var3 == null) {
            var48 = (Method)var2;
         } else {
            try {
               Class var4 = Integer.TYPE;
               var1 = Boolean.TYPE;
               var48 = var3.getDeclaredMethod("requestRelaunchActivity", IBinder.class, List.class, List.class, var4, var1, Configuration.class, Configuration.class, var1, var1);
               var48.setAccessible(true);
            } finally {
               ;
            }
         }
      }

      f = var48;
   }
}
