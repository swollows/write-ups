package v;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Base64;
import android.util.Xml;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParserException;

public abstract class b {
   public static final float[][] a = new float[][]{{0.401288F, 0.650173F, -0.051461F}, {-0.250268F, 1.204414F, 0.045854F}, {-0.002079F, 0.048952F, 0.953127F}};
   public static final float[][] b;
   public static final float[] c;
   public static final float[][] d;
   public static final Object e;
   public static Method f;
   public static boolean g;

   static {
      float[] var0 = new float[]{0.38752654F, 0.62144744F, -0.00897398F};
      float[] var1 = new float[]{-0.0158415F, -0.03412294F, 1.0499644F};
      b = new float[][]{{1.8620678F, -1.0112547F, 0.14918678F}, var0, var1};
      c = new float[]{95.047F, 100.0F, 108.883F};
      var0 = new float[]{0.01932141F, 0.11916382F, 0.9503448F};
      d = new float[][]{{0.41233894F, 0.35762063F, 0.18051042F}, {0.2126F, 0.7152F, 0.0722F}, var0};
      e = new Object();
   }

   public static int a(float var0) {
      if (var0 < 1.0F) {
         return -16777216;
      } else if (var0 > 99.0F) {
         return -1;
      } else {
         float var3 = (var0 + 16.0F) / 116.0F;
         if (var0 > 8.0F) {
            var0 = var3 * var3 * var3;
         } else {
            var0 /= 903.2963F;
         }

         float var1 = var3 * var3 * var3;
         boolean var4;
         if (var1 > 0.008856452F) {
            var4 = true;
         } else {
            var4 = false;
         }

         float var2;
         if (var4) {
            var2 = var1;
         } else {
            var2 = (var3 * 116.0F - 16.0F) / 903.2963F;
         }

         if (!var4) {
            var1 = (var3 * 116.0F - 16.0F) / 903.2963F;
         }

         float[] var5 = c;
         return w.a.a((double)(var2 * var5[0]), (double)(var0 * var5[1]), (double)(var1 * var5[2]));
      }
   }

   public static float b(int var0) {
      float var1 = (float)var0 / 255.0F;
      if (var1 <= 0.04045F) {
         var1 /= 12.92F;
      } else {
         var1 = (float)Math.pow((double)((var1 + 0.055F) / 1.055F), 2.4000000953674316);
      }

      return var1 * 100.0F;
   }

   public static d c(XmlResourceParser var0, Resources var1) {
      int var2;
      do {
         var2 = var0.next();
      } while(var2 != 2 && var2 != 1);

      if (var2 != 2) {
         throw new XmlPullParserException("No start tag found");
      } else {
         var0.require(2, (String)null, "font-family");
         Object var13;
         if (var0.getName().equals("font-family")) {
            TypedArray var12 = var1.obtainAttributes(Xml.asAttributeSet(var0), s.a.b);
            String var10 = var12.getString(0);
            String var9 = var12.getString(5);
            String var8 = var12.getString(6);
            String var11 = var12.getString(2);
            int var3 = var12.getResourceId(1, 0);
            var2 = var12.getInteger(3, 1);
            int var4 = var12.getInteger(4, 500);
            String var7 = var12.getString(7);
            var12.recycle();
            if (var10 != null && var9 != null && var8 != null) {
               while(var0.next() != 3) {
                  e(var0);
               }

               List var15 = d(var1, var3);
               A.g var14;
               if (var11 != null) {
                  var14 = new A.g(var10, var9, var11, var15);
               } else {
                  var14 = null;
               }

               var13 = new g(new A.g(var10, var9, var8, var15), var14, var2, var4, var7);
               return (d)var13;
            }

            ArrayList var18 = new ArrayList();

            label98:
            while(true) {
               while(true) {
                  do {
                     if (var0.next() == 3) {
                        if (!var18.isEmpty()) {
                           var13 = new e((f[])var18.toArray(new f[0]));
                           return (d)var13;
                        }
                        break label98;
                     }
                  } while(var0.getEventType() != 2);

                  if (var0.getName().equals("font")) {
                     TypedArray var19 = var1.obtainAttributes(Xml.asAttributeSet(var0), s.a.c);
                     byte var16 = 8;
                     if (!var19.hasValue(8)) {
                        var16 = 1;
                     }

                     var4 = var19.getInt(var16, 400);
                     if (var19.hasValue(6)) {
                        var16 = 6;
                     } else {
                        var16 = 2;
                     }

                     boolean var6;
                     if (1 == var19.getInt(var16, 0)) {
                        var6 = true;
                     } else {
                        var6 = false;
                     }

                     var16 = 9;
                     if (!var19.hasValue(9)) {
                        var16 = 3;
                     }

                     byte var17;
                     if (var19.hasValue(7)) {
                        var17 = 7;
                     } else {
                        var17 = 4;
                     }

                     var8 = var19.getString(var17);
                     var3 = var19.getInt(var16, 0);
                     if (var19.hasValue(5)) {
                        var16 = 5;
                     } else {
                        var16 = 0;
                     }

                     int var5 = var19.getResourceId(var16, 0);
                     var9 = var19.getString(var16);
                     var19.recycle();

                     while(var0.next() != 3) {
                        e(var0);
                     }

                     var18.add(new f(var9, var4, var6, var8, var3, var5));
                  } else {
                     e(var0);
                  }
               }
            }
         } else {
            e(var0);
         }

         var13 = null;
         return (d)var13;
      }
   }

   public static List d(Resources var0, int var1) {
      if (var1 == 0) {
         return Collections.emptyList();
      } else {
         TypedArray var4 = var0.obtainTypedArray(var1);

         Throwable var10000;
         label991: {
            boolean var10001;
            label984: {
               List var98;
               try {
                  if (var4.length() != 0) {
                     break label984;
                  }

                  var98 = Collections.emptyList();
               } catch (Throwable var97) {
                  var10000 = var97;
                  var10001 = false;
                  break label991;
               }

               var4.recycle();
               return var98;
            }

            ArrayList var5;
            label992: {
               int var2;
               label993: {
                  try {
                     var5 = new ArrayList();
                     if (var4.getType(0) != 1) {
                        break label993;
                     }
                  } catch (Throwable var96) {
                     var10000 = var96;
                     var10001 = false;
                     break label991;
                  }

                  var1 = 0;

                  while(true) {
                     try {
                        if (var1 >= var4.length()) {
                           break label992;
                        }

                        var2 = var4.getResourceId(var1, 0);
                     } catch (Throwable var95) {
                        var10000 = var95;
                        var10001 = false;
                        break label991;
                     }

                     if (var2 != 0) {
                        int var3;
                        String[] var6;
                        ArrayList var7;
                        try {
                           var6 = var0.getStringArray(var2);
                           var7 = new ArrayList();
                           var3 = var6.length;
                        } catch (Throwable var94) {
                           var10000 = var94;
                           var10001 = false;
                           break label991;
                        }

                        for(var2 = 0; var2 < var3; ++var2) {
                           try {
                              var7.add(Base64.decode(var6[var2], 0));
                           } catch (Throwable var93) {
                              var10000 = var93;
                              var10001 = false;
                              break label991;
                           }
                        }

                        try {
                           var5.add(var7);
                        } catch (Throwable var92) {
                           var10000 = var92;
                           var10001 = false;
                           break label991;
                        }
                     }

                     ++var1;
                  }
               }

               String[] var99;
               ArrayList var101;
               try {
                  var99 = var0.getStringArray(var1);
                  var101 = new ArrayList();
                  var2 = var99.length;
               } catch (Throwable var91) {
                  var10000 = var91;
                  var10001 = false;
                  break label991;
               }

               for(var1 = 0; var1 < var2; ++var1) {
                  try {
                     var101.add(Base64.decode(var99[var1], 0));
                  } catch (Throwable var90) {
                     var10000 = var90;
                     var10001 = false;
                     break label991;
                  }
               }

               try {
                  var5.add(var101);
               } catch (Throwable var89) {
                  var10000 = var89;
                  var10001 = false;
                  break label991;
               }
            }

            var4.recycle();
            return var5;
         }

         Throwable var100 = var10000;
         var4.recycle();
         throw var100;
      }
   }

   public static void e(XmlResourceParser var0) {
      int var1 = 1;

      while(var1 > 0) {
         int var2 = var0.next();
         if (var2 != 2) {
            if (var2 == 3) {
               --var1;
            }
         } else {
            ++var1;
         }
      }

   }

   public static float f() {
      return (float)Math.pow(((double)50.0F + 16.0) / 116.0, 3.0) * 100.0F;
   }
}
