package w;

import A.m;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.system.ErrnoException;
import android.system.Os;
import android.system.OsConstants;
import android.util.Log;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class f extends q.e {
   public static Class a;
   public static Constructor b;
   public static Method c;
   public static Method d;
   public static boolean e;

   public static boolean u(Object var0, String var1, int var2, boolean var3) {
      v();

      try {
         var3 = (Boolean)c.invoke(var0, var1, var2, var3);
         return var3;
      } catch (IllegalAccessException var4) {
         var0 = var4;
      } catch (InvocationTargetException var5) {
         var0 = var5;
      }

      throw new RuntimeException((Throwable)var0);
   }

   public static void v() {
      if (!e) {
         e = true;
         Constructor var2 = null;

         Method var1;
         Object var3;
         Class var7;
         label20: {
            Constructor var4;
            label19: {
               Object var0;
               try {
                  var7 = Class.forName("android.graphics.FontFamily");
                  var4 = var7.getConstructor((Class[])null);
                  var3 = var7.getMethod("addFontWeightStyle", String.class, Integer.TYPE, Boolean.TYPE);
                  var1 = Typeface.class.getMethod("createFromFamiliesWithDefault", Array.newInstance(var7, 1).getClass());
                  break label19;
               } catch (ClassNotFoundException var5) {
                  var0 = var5;
               } catch (NoSuchMethodException var6) {
                  var0 = var6;
               }

               Log.e("TypefaceCompatApi21Impl", var0.getClass().getName(), (Throwable)var0);
               var1 = null;
               var7 = null;
               var3 = var7;
               break label20;
            }

            var2 = var4;
         }

         b = var2;
         a = var7;
         c = (Method)var3;
         d = var1;
      }
   }

   public Typeface i(Context param1, v.e param2, Resources param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   public Typeface j(Context var1, m[] var2, int var3) {
      if (var2.length < 1) {
         return null;
      } else {
         m var4 = this.n(var2, var3);
         ContentResolver var195 = var1.getContentResolver();

         ParcelFileDescriptor var199;
         boolean var10001;
         try {
            var199 = var195.openFileDescriptor(var4.a, "r", (CancellationSignal)null);
         } catch (IOException var192) {
            var10001 = false;
            return null;
         }

         if (var199 == null) {
            if (var199 != null) {
               try {
                  var199.close();
               } catch (IOException var180) {
                  var10001 = false;
                  return null;
               }
            }

            return null;
         } else {
            Throwable var193;
            Throwable var200;
            Throwable var10000;
            label1332: {
               File var197;
               label1314: {
                  try {
                     try {
                        StringBuilder var196 = new StringBuilder("/proc/self/fd/");
                        var196.append(var199.getFd());
                        String var5 = Os.readlink(var196.toString());
                        if (OsConstants.S_ISREG(Os.stat(var5).st_mode)) {
                           var197 = new File(var5);
                           break label1314;
                        }
                     } catch (ErrnoException var190) {
                     }
                  } catch (Throwable var191) {
                     var10000 = var191;
                     var10001 = false;
                     break label1332;
                  }

                  var197 = null;
               }

               Typeface var194;
               if (var197 != null) {
                  label1333: {
                     label1304:
                     try {
                        if (var197.canRead()) {
                           break label1304;
                        }
                        break label1333;
                     } catch (Throwable var189) {
                        var10000 = var189;
                        var10001 = false;
                        break label1332;
                     }

                     try {
                        var194 = Typeface.createFromFile(var197);
                     } catch (Throwable var185) {
                        var10000 = var185;
                        var10001 = false;
                        break label1332;
                     }

                     try {
                        var199.close();
                        return var194;
                     } catch (IOException var181) {
                        var10001 = false;
                        return null;
                     }
                  }
               }

               FileInputStream var198;
               try {
                  var198 = new FileInputStream(var199.getFileDescriptor());
               } catch (Throwable var188) {
                  var10000 = var188;
                  var10001 = false;
                  break label1332;
               }

               try {
                  var194 = this.l(var1, var198);
               } catch (Throwable var187) {
                  var193 = var187;

                  try {
                     var198.close();
                  } catch (Throwable var184) {
                     var200 = var184;

                     label1280:
                     try {
                        var193.addSuppressed(var200);
                        break label1280;
                     } catch (Throwable var183) {
                        var10000 = var183;
                        var10001 = false;
                        break label1332;
                     }
                  }

                  try {
                     throw var193;
                  } catch (Throwable var179) {
                     var10000 = var179;
                     var10001 = false;
                     break label1332;
                  }
               }

               try {
                  var198.close();
               } catch (Throwable var186) {
                  var10000 = var186;
                  var10001 = false;
                  break label1332;
               }

               try {
                  var199.close();
                  return var194;
               } catch (IOException var182) {
                  var10001 = false;
                  return null;
               }
            }

            var193 = var10000;

            try {
               var199.close();
            } catch (Throwable var178) {
               var200 = var178;

               label1262:
               try {
                  var193.addSuppressed(var200);
                  break label1262;
               } catch (IOException var177) {
                  var10001 = false;
                  return null;
               }
            }

            try {
               throw var193;
            } catch (IOException var176) {
               var10001 = false;
               return null;
            }
         }
      }
   }
}
