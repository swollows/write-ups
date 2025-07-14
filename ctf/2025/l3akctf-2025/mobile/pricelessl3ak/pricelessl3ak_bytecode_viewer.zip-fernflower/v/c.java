package v;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.util.AttributeSet;
import android.util.StateSet;
import android.util.TypedValue;
import android.util.Xml;
import java.lang.reflect.Array;
import org.xmlpull.v1.XmlPullParserException;

public abstract class c {
   public static final ThreadLocal a = new ThreadLocal();

   public static ColorStateList a(Resources var0, XmlResourceParser var1, Resources.Theme var2) {
      AttributeSet var28 = Xml.asAttributeSet(var1);

      int var20;
      do {
         var20 = var1.next();
      } while(var20 != 2 && var20 != 1);

      if (var20 != 2) {
         throw new XmlPullParserException("No start tag found");
      } else {
         String var29 = var1.getName();
         if (!var29.equals("selector")) {
            StringBuilder var39 = new StringBuilder();
            var39.append(var1.getPositionDescription());
            var39.append(": invalid color state list tag ");
            var39.append(var29);
            throw new XmlPullParserException(var39.toString());
         } else {
            var20 = var1.getDepth();
            int var22 = 1;
            ++var20;
            int[][] var31 = new int[20][];
            int[] var33 = new int[20];
            int var23 = 0;

            while(true) {
               int var24 = var1.next();
               if (var24 == var22) {
                  break;
               }

               int var21 = var1.getDepth();
               if (var21 < var20 && var24 == 3) {
                  break;
               }

               if (var24 == 2 && var21 <= var20 && var1.getName().equals("item")) {
                  int[] var44 = s.a.a;
                  TypedArray var45;
                  if (var2 == null) {
                     var45 = var0.obtainAttributes(var28, var44);
                  } else {
                     var45 = var2.obtainStyledAttributes(var28, var44, 0, 0);
                  }

                  label266: {
                     var24 = var45.getResourceId(0, -1);
                     if (var24 != -1) {
                        ThreadLocal var32 = a;
                        TypedValue var30 = (TypedValue)var32.get();
                        if (var30 == null) {
                           var30 = new TypedValue();
                           var32.set(var30);
                        }

                        var0.getValue(var24, var30, (boolean)var22);
                        var21 = var30.type;
                        if (var21 < 28 || var21 > 31) {
                           try {
                              var21 = a(var0, var0.getXml(var24), var2).getDefaultColor();
                           } catch (Exception var37) {
                              var21 = var45.getColor(0, -65281);
                           }
                           break label266;
                        }
                     }

                     var21 = var45.getColor(0, -65281);
                  }

                  float var3;
                  if (var45.hasValue(var22)) {
                     var3 = var45.getFloat(var22, 1.0F);
                  } else if (var45.hasValue(3)) {
                     var3 = var45.getFloat(3, 1.0F);
                  } else {
                     var3 = 1.0F;
                  }

                  float var10;
                  if (VERSION.SDK_INT >= 31 && var45.hasValue(2)) {
                     var10 = var45.getFloat(2, -1.0F);
                  } else {
                     var10 = var45.getFloat(4, -1.0F);
                  }

                  var45.recycle();
                  int var27 = var28.getAttributeCount();
                  var44 = new int[var27];
                  var24 = 0;

                  int var25;
                  for(var22 = 0; var22 < var27; var24 = var25) {
                     int var26 = var28.getAttributeNameResource(var22);
                     var25 = var24;
                     if (var26 != 16843173) {
                        var25 = var24;
                        if (var26 != 16843551) {
                           var25 = var24;
                           if (var26 != 2130903081) {
                              var25 = var24;
                              if (var26 != 2130903197) {
                                 if (var28.getAttributeBooleanValue(var22, false)) {
                                    var25 = var26;
                                 } else {
                                    var25 = -var26;
                                 }

                                 var44[var24] = var25;
                                 var25 = var24 + 1;
                              }
                           }
                        }
                     }

                     ++var22;
                  }

                  int[] var46 = StateSet.trimStateSet(var44, var24);
                  float var4 = 0.0F;
                  float var5 = 100.0F;
                  boolean var41;
                  if (var10 >= 0.0F && var10 <= 100.0F) {
                     var41 = true;
                  } else {
                     var41 = false;
                  }

                  if (var3 != 1.0F || var41) {
                     var25 = (int)((float)Color.alpha(var21) * var3 + 0.5F);
                     if (var25 < 0) {
                        var22 = 0;
                     } else {
                        var22 = 255;
                        if (var25 <= 255) {
                           var22 = var25;
                        }
                     }

                     if (!var41) {
                        var24 = var21;
                     } else {
                        a var47 = v.a.a(var21);
                        l var35 = l.k;
                        float var7 = var47.b;
                        int[] var43;
                        AttributeSet var48;
                        if (!((double)var7 < 1.0) && !((double)Math.round(var10) <= 0.0) && !((double)Math.round(var10) >= 100.0)) {
                           var3 = var47.a;
                           float var8;
                           if (var3 < 0.0F) {
                              var8 = 0.0F;
                           } else {
                              var8 = Math.min(360.0F, var3);
                           }

                           float var6 = 0.0F;
                           var3 = var7;
                           a var50 = null;
                           var41 = true;
                           var48 = var28;
                           var43 = var46;

                           while(true) {
                              if (!(Math.abs(var6 - var7) >= 0.4F)) {
                                 var21 = var20;
                                 if (var50 == null) {
                                    var20 = b.a(var10);
                                 } else {
                                    var20 = var50.c(var35);
                                 }
                                 break;
                              }

                              float var14 = 1000.0F;
                              float var12 = var4;
                              float var11 = var5;
                              float var13 = 1000.0F;
                              a var49 = null;
                              float var9 = var5;

                              label190: {
                                 for(var5 = var8; Math.abs(var12 - var11) > 0.01F; var4 = 0.0F) {
                                    var4 = (var11 - var12) / 2.0F + var12;
                                    var21 = v.a.b(var4, var3, var5).c(l.k);
                                    float var18 = b.b(Color.red(var21));
                                    float var16 = b.b(Color.green(var21));
                                    float var19 = b.b(Color.blue(var21));
                                    float[] var34 = b.d[1];
                                    float var17 = var34[0];
                                    float var15 = var34[1];
                                    var8 = var34[2];
                                    var9 = 100.0F;
                                    var8 = (var19 * var8 + var16 * var15 + var18 * var17) / 100.0F;
                                    if (var8 <= 0.008856452F) {
                                       var8 *= 903.2963F;
                                    } else {
                                       var8 = (float)Math.cbrt((double)var8) * 116.0F - 16.0F;
                                    }

                                    var15 = Math.abs(var10 - var8);
                                    if (var15 < 0.2F) {
                                       a var53 = v.a.a(var21);
                                       a var36 = v.a.b(var53.c, var53.b, var5);
                                       var17 = var53.d - var36.d;
                                       var18 = var53.e - var36.e;
                                       var16 = var53.f - var36.f;
                                       var16 = (float)(Math.pow(Math.sqrt((double)(var16 * var16 + var18 * var18 + var17 * var17)), 0.63) * 1.41);
                                       if (var16 <= 1.0F) {
                                          var13 = var16;
                                          var49 = var53;
                                          var14 = var15;
                                       }
                                    }

                                    var15 = 0.0F;
                                    if (var14 == 0.0F && var13 == 0.0F) {
                                       var8 = var9;
                                       var4 = var15;
                                       break label190;
                                    }

                                    if (var8 < var10) {
                                       var12 = var4;
                                    } else {
                                       var11 = var4;
                                    }

                                    var9 = 100.0F;
                                 }

                                 var8 = var9;
                              }

                              var21 = var20;
                              if (var41) {
                                 if (var49 != null) {
                                    var20 = var49.c(var35);
                                    break;
                                 }

                                 var3 = (var7 - var6) / 2.0F + var6;
                                 var41 = false;
                              } else {
                                 if (var49 == null) {
                                    var7 = var3;
                                 } else {
                                    var6 = var3;
                                    var50 = var49;
                                 }

                                 var3 = (var7 - var6) / 2.0F + var6;
                              }

                              var9 = var8;
                              var20 = var20;
                              var8 = var5;
                              var5 = var9;
                           }
                        } else {
                           var48 = var28;
                           var21 = var20;
                           var20 = b.a(var10);
                           var43 = var46;
                        }

                        var46 = var43;
                        var24 = var20;
                        var28 = var48;
                        var20 = var21;
                     }

                     var21 = 16777215 & var24 | var22 << 24;
                  }

                  var24 = var23 + 1;
                  var22 = var33.length;
                  byte var42 = 8;
                  var44 = var33;
                  if (var24 > var22) {
                     if (var23 <= 4) {
                        var22 = 8;
                     } else {
                        var22 = var23 * 2;
                     }

                     var44 = new int[var22];
                     System.arraycopy(var33, 0, var44, 0, var23);
                  }

                  var44[var23] = var21;
                  Object var51 = var31;
                  if (var24 > var31.length) {
                     Class var52 = var31.getClass().getComponentType();
                     if (var23 <= 4) {
                        var21 = var42;
                     } else {
                        var21 = var23 * 2;
                     }

                     var51 = (Object[])Array.newInstance(var52, var21);
                     System.arraycopy(var31, 0, var51, 0, var23);
                  }

                  ((Object[])var51)[var23] = var46;
                  var31 = (int[][])var51;
                  var23 = var24;
                  var22 = 1;
                  var33 = var44;
               }
            }

            int[] var40 = new int[var23];
            int[][] var38 = new int[var23][];
            System.arraycopy(var33, 0, var40, 0, var23);
            System.arraycopy(var31, 0, var38, 0, var23);
            return new ColorStateList(var38, var40);
         }
      }
   }
}
