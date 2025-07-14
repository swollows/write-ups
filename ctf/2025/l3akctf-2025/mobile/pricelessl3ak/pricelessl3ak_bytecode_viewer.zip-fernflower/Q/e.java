package q;

import A.m;
import D.z;
import android.app.AppOpsManager;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Binder;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.IBinder;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.os.Process;
import android.os.Build.VERSION;
import android.util.Size;
import android.util.SizeF;
import androidx.activity.result.ActivityResult;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.FileChannel.MapMode;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import r.g;

public abstract class e {
   public e(int var1) {
      switch (var1) {
         case 3:
            super();
            new ConcurrentHashMap();
            return;
         default:
            super();
            new AtomicInteger(0);
      }
   }

   public static final Bundle a(Y.c... var0) {
      Bundle var4 = new Bundle(var0.length);
      int var2 = var0.length;

      for(int var1 = 0; var1 < var2; ++var1) {
         Y.c var5 = var0[var1];
         String var3 = (String)var5.a;
         Object var11 = var5.b;
         if (var11 == null) {
            var4.putString(var3, (String)null);
         } else if (var11 instanceof Boolean) {
            var4.putBoolean(var3, (Boolean)var11);
         } else if (var11 instanceof Byte) {
            var4.putByte(var3, ((Number)var11).byteValue());
         } else if (var11 instanceof Character) {
            var4.putChar(var3, (Character)var11);
         } else if (var11 instanceof Double) {
            var4.putDouble(var3, ((Number)var11).doubleValue());
         } else if (var11 instanceof Float) {
            var4.putFloat(var3, ((Number)var11).floatValue());
         } else if (var11 instanceof Integer) {
            var4.putInt(var3, ((Number)var11).intValue());
         } else if (var11 instanceof Long) {
            var4.putLong(var3, ((Number)var11).longValue());
         } else if (var11 instanceof Short) {
            var4.putShort(var3, ((Number)var11).shortValue());
         } else if (var11 instanceof Bundle) {
            var4.putBundle(var3, (Bundle)var11);
         } else if (var11 instanceof CharSequence) {
            var4.putCharSequence(var3, (CharSequence)var11);
         } else if (var11 instanceof Parcelable) {
            var4.putParcelable(var3, (Parcelable)var11);
         } else if (var11 instanceof boolean[]) {
            var4.putBooleanArray(var3, (boolean[])var11);
         } else if (var11 instanceof byte[]) {
            var4.putByteArray(var3, (byte[])var11);
         } else if (var11 instanceof char[]) {
            var4.putCharArray(var3, (char[])var11);
         } else if (var11 instanceof double[]) {
            var4.putDoubleArray(var3, (double[])var11);
         } else if (var11 instanceof float[]) {
            var4.putFloatArray(var3, (float[])var11);
         } else if (var11 instanceof int[]) {
            var4.putIntArray(var3, (int[])var11);
         } else if (var11 instanceof long[]) {
            var4.putLongArray(var3, (long[])var11);
         } else if (var11 instanceof short[]) {
            var4.putShortArray(var3, (short[])var11);
         } else if (var11 instanceof Object[]) {
            Class var6 = var11.getClass().getComponentType();
            i0.d.b(var6);
            if (Parcelable.class.isAssignableFrom(var6)) {
               var4.putParcelableArray(var3, (Parcelable[])var11);
            } else if (String.class.isAssignableFrom(var6)) {
               var4.putStringArray(var3, (String[])var11);
            } else if (CharSequence.class.isAssignableFrom(var6)) {
               var4.putCharSequenceArray(var3, (CharSequence[])var11);
            } else {
               if (!Serializable.class.isAssignableFrom(var6)) {
                  String var7 = var6.getCanonicalName();
                  StringBuilder var9 = new StringBuilder("Illegal value array type ");
                  var9.append(var7);
                  var9.append(" for key \"");
                  var9.append(var3);
                  var9.append('"');
                  throw new IllegalArgumentException(var9.toString());
               }

               var4.putSerializable(var3, (Serializable)var11);
            }
         } else if (var11 instanceof Serializable) {
            var4.putSerializable(var3, (Serializable)var11);
         } else if (var11 instanceof IBinder) {
            var4.putBinder(var3, (IBinder)var11);
         } else if (var11 instanceof Size) {
            var4.putSize(var3, (Size)var11);
         } else {
            if (!(var11 instanceof SizeF)) {
               String var10 = var11.getClass().getCanonicalName();
               StringBuilder var8 = new StringBuilder("Illegal value type ");
               var8.append(var10);
               var8.append(" for key \"");
               var8.append(var3);
               var8.append('"');
               throw new IllegalArgumentException(var8.toString());
            }

            var4.putSizeF(var3, (SizeF)var11);
         }
      }

      return var4;
   }

   public static int e(Context var0, String var1) {
      int var2 = Process.myPid();
      int var4 = Process.myUid();
      String var5 = var0.getPackageName();
      var2 = var0.checkPermission(var1, var2, var4);
      byte var3 = -1;
      byte var9;
      if (var2 == -1) {
         var9 = var3;
      } else {
         String var6 = AppOpsManager.permissionToOp(var1);
         if (var6 != null) {
            var1 = var5;
            if (var5 == null) {
               String[] var8 = var0.getPackageManager().getPackagesForUid(var4);
               var9 = var3;
               if (var8 == null) {
                  return var9;
               }

               if (var8.length <= 0) {
                  var9 = var3;
                  return var9;
               }

               var1 = var8[0];
            }

            var2 = Process.myUid();
            var5 = var0.getPackageName();
            if (var2 == var4 && Objects.equals(var5, var1)) {
               if (VERSION.SDK_INT >= 29) {
                  AppOpsManager var10 = (AppOpsManager)var0.getSystemService(AppOpsManager.class);
                  var2 = Binder.getCallingUid();
                  var3 = 1;
                  if (var10 == null) {
                     var2 = 1;
                  } else {
                     var2 = var10.checkOpNoThrow(var6, var2, var1);
                  }

                  if (var2 == 0) {
                     String var7 = t.d.a(var0);
                     if (var10 == null) {
                        var2 = var3;
                     } else {
                        var2 = var10.checkOpNoThrow(var6, var4, var7);
                     }
                  }
               } else {
                  var2 = ((AppOpsManager)var0.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(var6, var1);
               }
            } else {
               var2 = ((AppOpsManager)var0.getSystemService(AppOpsManager.class)).noteProxyOpNoThrow(var6, var1);
            }

            if (var2 != 0) {
               var9 = -2;
               return var9;
            }
         }

         var9 = 0;
      }

      return var9;
   }

   public static void f(Closeable var0) {
      if (var0 != null) {
         try {
            var0.close();
         } catch (IOException var1) {
         }
      }

   }

   public static boolean g(File var0, Resources var1, int var2) {
      boolean var9 = false;

      InputStream var4;
      try {
         var9 = true;
         var4 = var1.openRawResource(var2);
         var9 = false;
      } finally {
         if (var9) {
            var0 = null;
            f(var0);
         }
      }

      boolean var3;
      try {
         var3 = h(var0, var4);
      } finally {
         ;
      }

      f(var4);
      return var3;
   }

   public static boolean h(File param0, InputStream param1) {
      // $FF: Couldn't be decompiled
   }

   public static Object p(String var0, Bundle var1) {
      if (VERSION.SDK_INT >= 34) {
         return E.f.b(var0, var1);
      } else {
         Parcelable var2 = var1.getParcelable(var0);
         if (!ActivityResult.class.isInstance(var2)) {
            var2 = null;
         }

         return var2;
      }
   }

   public static File q(Context var0) {
      File var6 = var0.getCacheDir();
      if (var6 == null) {
         return null;
      } else {
         StringBuilder var3 = new StringBuilder(".font");
         var3.append(Process.myPid());
         var3.append("-");
         var3.append(Process.myTid());
         var3.append("-");
         String var7 = var3.toString();

         for(int var1 = 0; var1 < 100; ++var1) {
            StringBuilder var4 = new StringBuilder();
            var4.append(var7);
            var4.append(var1);
            File var8 = new File(var6, var4.toString());

            boolean var2;
            try {
               var2 = var8.createNewFile();
            } catch (IOException var5) {
               continue;
            }

            if (var2) {
               return var8;
            }
         }

         return null;
      }
   }

   public static MappedByteBuffer r(Context var0, Uri var1) {
      ContentResolver var101 = var0.getContentResolver();

      ParcelFileDescriptor var102;
      boolean var10001;
      try {
         var102 = var101.openFileDescriptor(var1, "r", (CancellationSignal)null);
      } catch (IOException var100) {
         var10001 = false;
         return null;
      }

      if (var102 == null) {
         if (var102 != null) {
            try {
               var102.close();
            } catch (IOException var93) {
               var10001 = false;
               return null;
            }
         }

         return null;
      } else {
         MappedByteBuffer var107;
         label654: {
            Throwable var105;
            Throwable var10000;
            label655: {
               FileInputStream var104;
               try {
                  var104 = new FileInputStream(var102.getFileDescriptor());
               } catch (Throwable var99) {
                  var10000 = var99;
                  var10001 = false;
                  break label655;
               }

               try {
                  FileChannel var106 = var104.getChannel();
                  long var2 = var106.size();
                  var107 = var106.map(MapMode.READ_ONLY, 0L, var2);
               } catch (Throwable var98) {
                  Throwable var4 = var98;

                  try {
                     var104.close();
                  } catch (Throwable var96) {
                     var105 = var96;

                     label630:
                     try {
                        var4.addSuppressed(var105);
                        break label630;
                     } catch (Throwable var95) {
                        var10000 = var95;
                        var10001 = false;
                        break label655;
                     }
                  }

                  try {
                     throw var4;
                  } catch (Throwable var92) {
                     var10000 = var92;
                     var10001 = false;
                     break label655;
                  }
               }

               label638:
               try {
                  var104.close();
                  break label654;
               } catch (Throwable var97) {
                  var10000 = var97;
                  var10001 = false;
                  break label638;
               }
            }

            var105 = var10000;

            try {
               var102.close();
            } catch (Throwable var91) {
               Throwable var103 = var91;

               label614:
               try {
                  var105.addSuppressed(var103);
                  break label614;
               } catch (IOException var90) {
                  var10001 = false;
                  return null;
               }
            }

            try {
               throw var105;
            } catch (IOException var89) {
               var10001 = false;
               return null;
            }
         }

         try {
            var102.close();
            return var107;
         } catch (IOException var94) {
            var10001 = false;
            return null;
         }
      }
   }

   public abstract boolean b(g var1, r.c var2);

   public abstract boolean c(g var1, Object var2, Object var3);

   public abstract boolean d(g var1, r.f var2, r.f var3);

   public abstract Typeface i(Context var1, v.e var2, Resources var3, int var4);

   public abstract Typeface j(Context var1, m[] var2, int var3);

   public Typeface k(Context var1, List var2, int var3) {
      throw new IllegalStateException("createFromFontInfoWithFallback must only be called on API 29+");
   }

   public Typeface l(Context param1, InputStream param2) {
      // $FF: Couldn't be decompiled
   }

   public Typeface m(Context param1, Resources param2, int param3, String param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   public m n(m[] var1, int var2) {
      new z(21);
      short var3;
      if ((var2 & 1) == 0) {
         var3 = 400;
      } else {
         var3 = 700;
      }

      boolean var8;
      if ((var2 & 2) != 0) {
         var8 = true;
      } else {
         var8 = false;
      }

      int var7 = var1.length;
      m var9 = null;
      int var4 = Integer.MAX_VALUE;

      int var5;
      for(var2 = 0; var2 < var7; var4 = var5) {
         m var10 = var1[var2];
         int var6 = Math.abs(var10.c - var3);
         if (var10.d == var8) {
            var5 = 0;
         } else {
            var5 = 1;
         }

         label30: {
            var6 = var6 * 2 + var5;
            if (var9 != null) {
               var5 = var4;
               if (var4 <= var6) {
                  break label30;
               }
            }

            var9 = var10;
            var5 = var6;
         }

         ++var2;
      }

      return var9;
   }

   public abstract f o();

   public abstract void s(r.f var1, r.f var2);

   public abstract void t(r.f var1, Thread var2);
}
