package w;

import A.m;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontStyle;
import android.os.CancellationSignal;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public final class j extends q.e {
   public static Font u(FontFamily var0, int var1) {
      int var2;
      if ((var1 & 1) != 0) {
         var2 = 700;
      } else {
         var2 = 400;
      }

      int var3 = 1;
      byte var8;
      if ((var1 & 2) != 0) {
         var8 = 1;
      } else {
         var8 = 0;
      }

      FontStyle var7 = new FontStyle(var2, var8);
      Font var5 = var0.getFont(0);
      var2 = w(var7, var5.getStyle());

      for(var1 = var3; var1 < var0.getSize(); var2 = var3) {
         Font var6 = var0.getFont(var1);
         int var4 = w(var7, var6.getStyle());
         var3 = var2;
         if (var4 < var2) {
            var5 = var6;
            var3 = var4;
         }

         ++var1;
      }

      return var5;
   }

   public static FontFamily v(m[] var0, ContentResolver var1) {
      int var3 = var0.length;
      int var2 = 0;

      FontFamily.Builder var4;
      FontFamily.Builder var5;
      for(var4 = null; var2 < var3; var4 = var5) {
         m var7 = var0[var2];
         var5 = var4;

         label433: {
            label432: {
               IOException var10000;
               label444: {
                  ParcelFileDescriptor var6;
                  boolean var10001;
                  try {
                     var6 = var1.openFileDescriptor(var7.a, "r", (CancellationSignal)null);
                  } catch (IOException var47) {
                     var10000 = var47;
                     var10001 = false;
                     break label444;
                  }

                  if (var6 == null) {
                     var5 = var4;
                     if (var6 == null) {
                        break label433;
                     }
                  } else {
                     label443: {
                        Throwable var53;
                        label424: {
                           Font var50;
                           try {
                              Font.Builder var49 = new Font.Builder(var6);
                              var50 = var49.setWeight(var7.c).setSlant(var7.d).setTtcIndex(var7.b).build();
                           } catch (Throwable var46) {
                              var53 = var46;
                              var10001 = false;
                              break label424;
                           }

                           if (var4 == null) {
                              label418: {
                                 try {
                                    var5 = new FontFamily.Builder(var50);
                                 } catch (Throwable var44) {
                                    var53 = var44;
                                    var10001 = false;
                                    break label418;
                                 }

                                 var4 = var5;
                              }
                           } else {
                              label420:
                              try {
                                 var4.addFont(var50);
                              } catch (Throwable var45) {
                                 var53 = var45;
                                 var10001 = false;
                                 break label420;
                              }
                           }
                           break label443;
                        }

                        Throwable var52 = var53;

                        try {
                           var6.close();
                        } catch (Throwable var42) {
                           Throwable var51 = var42;
                           var5 = var4;

                           label404:
                           try {
                              var52.addSuppressed(var51);
                              break label404;
                           } catch (IOException var41) {
                              var10000 = var41;
                              var10001 = false;
                              break label444;
                           }
                        }

                        var5 = var4;

                        try {
                           throw var52;
                        } catch (IOException var40) {
                           var10000 = var40;
                           var10001 = false;
                           break label444;
                        }
                     }
                  }

                  var5 = var4;

                  try {
                     var6.close();
                     break label432;
                  } catch (IOException var43) {
                     var10000 = var43;
                     var10001 = false;
                  }
               }

               IOException var48 = var10000;
               Log.w("TypefaceCompatApi29Impl", "Font load failed", var48);
               break label433;
            }

            var5 = var4;
         }

         ++var2;
      }

      return var4 == null ? null : var4.build();
   }

   public static int w(FontStyle var0, FontStyle var1) {
      int var3 = Math.abs(var0.getWeight() - var1.getWeight()) / 100;
      byte var2;
      if (var0.getSlant() == var1.getSlant()) {
         var2 = 0;
      } else {
         var2 = 2;
      }

      return var3 + var2;
   }

   public final Typeface i(Context param1, v.e param2, Resources param3, int param4) {
      // $FF: Couldn't be decompiled
   }

   public final Typeface j(Context var1, m[] var2, int var3) {
      ContentResolver var6 = var1.getContentResolver();

      Exception var10000;
      label27: {
         boolean var10001;
         FontFamily var7;
         try {
            var7 = v(var2, var6);
         } catch (Exception var5) {
            var10000 = var5;
            var10001 = false;
            break label27;
         }

         if (var7 == null) {
            return null;
         }

         try {
            Typeface.CustomFallbackBuilder var9 = new Typeface.CustomFallbackBuilder(var7);
            Typeface var10 = var9.setStyle(u(var7, var3).getStyle()).build();
            return var10;
         } catch (Exception var4) {
            var10000 = var4;
            var10001 = false;
         }
      }

      Exception var8 = var10000;
      Log.w("TypefaceCompatApi29Impl", "Font load failed", var8);
      return null;
   }

   public final Typeface k(Context var1, List var2, int var3) {
      ContentResolver var5 = var1.getContentResolver();

      Exception var10000;
      label57: {
         FontFamily var6;
         boolean var10001;
         try {
            var6 = v((m[])var2.get(0), var5);
         } catch (Exception var12) {
            var10000 = var12;
            var10001 = false;
            break label57;
         }

         if (var6 == null) {
            return null;
         }

         Typeface.CustomFallbackBuilder var13;
         try {
            var13 = new Typeface.CustomFallbackBuilder(var6);
         } catch (Exception var11) {
            var10000 = var11;
            var10001 = false;
            break label57;
         }

         int var4 = 1;

         while(true) {
            FontFamily var7;
            try {
               if (var4 >= var2.size()) {
                  break;
               }

               var7 = v((m[])var2.get(var4), var5);
            } catch (Exception var10) {
               var10000 = var10;
               var10001 = false;
               break label57;
            }

            if (var7 != null) {
               try {
                  var13.addCustomFallback(var7);
               } catch (Exception var9) {
                  var10000 = var9;
                  var10001 = false;
                  break label57;
               }
            }

            ++var4;
         }

         try {
            Typeface var15 = var13.setStyle(u(var6, var3).getStyle()).build();
            return var15;
         } catch (Exception var8) {
            var10000 = var8;
            var10001 = false;
         }
      }

      Exception var14 = var10000;
      Log.w("TypefaceCompatApi29Impl", "Font load failed", var14);
      return null;
   }

   public final Typeface l(Context var1, InputStream var2) {
      throw new RuntimeException("Do not use this function in API 29 or later.");
   }

   public final Typeface m(Context var1, Resources var2, int var3, String var4, int var5) {
      try {
         Font.Builder var7 = new Font.Builder(var2, var3);
         Font var8 = var7.build();
         FontFamily.Builder var10 = new FontFamily.Builder(var8);
         FontFamily var12 = var10.build();
         Typeface.CustomFallbackBuilder var11 = new Typeface.CustomFallbackBuilder(var12);
         Typeface var9 = var11.setStyle(var8.getStyle()).build();
         return var9;
      } catch (Exception var6) {
         Log.w("TypefaceCompatApi29Impl", "Font load failed", var6);
         return null;
      }
   }

   public final m n(m[] var1, int var2) {
      throw new RuntimeException("Do not use this function in API 29 or later.");
   }
}
