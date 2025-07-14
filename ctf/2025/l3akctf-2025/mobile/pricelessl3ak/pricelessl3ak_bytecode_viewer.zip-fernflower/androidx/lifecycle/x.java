package androidx.lifecycle;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public abstract class x {
   public static final HashMap a = new HashMap();
   public static final HashMap b = new HashMap();

   public static void a(Constructor var0, t var1) {
      try {
         i0.d.b(var0.newInstance(var1));
         ClassCastException var5 = new ClassCastException();
         throw var5;
      } catch (IllegalAccessException var2) {
         throw new RuntimeException(var2);
      } catch (InstantiationException var3) {
         throw new RuntimeException(var3);
      } catch (InvocationTargetException var4) {
         throw new RuntimeException(var4);
      }
   }

   public static final String b(String var0) {
      StringBuilder var5 = new StringBuilder();
      int var2 = 0;
      int var1 = var0.indexOf(".", 0);
      if (var1 >= 0) {
         int var3 = var0.length();
         if (var3 < 0) {
            throw new OutOfMemoryError();
         }

         StringBuilder var6 = new StringBuilder(var3);

         int var4;
         do {
            var6.append(var0, var2, var1);
            var6.append("_");
            var3 = var1 + 1;
            if (var1 >= var0.length()) {
               break;
            }

            var4 = var0.indexOf(".", var3);
            var2 = var3;
            var1 = var4;
         } while(var4 > 0);

         var6.append(var0, var3, var0.length());
         var0 = var6.toString();
         i0.d.d(var0, "toString(...)");
      }

      var5.append(var0);
      var5.append("_LifecycleAdapter");
      return var5.toString();
   }

   public static int c(Class var0) {
      HashMap var8 = a;
      Integer var5 = (Integer)var8.get(var0);
      if (var5 != null) {
         return var5;
      } else {
         String var32 = var0.getCanonicalName();
         byte var3 = 1;
         byte var31;
         if (var32 == null) {
            var31 = var3;
         } else {
            label210: {
               Class[] var7 = null;

               Constructor var36;
               label193: {
                  Constructor var34;
                  label192: {
                     label191: {
                        NoSuchMethodException var10000;
                        label208: {
                           String var6;
                           boolean var10001;
                           Package var33;
                           try {
                              var33 = var0.getPackage();
                              var6 = var0.getCanonicalName();
                           } catch (ClassNotFoundException var26) {
                              var10001 = false;
                              break label191;
                           } catch (NoSuchMethodException var27) {
                              var10000 = var27;
                              var10001 = false;
                              break label208;
                           }

                           if (var33 != null) {
                              try {
                                 var32 = var33.getName();
                              } catch (ClassNotFoundException var24) {
                                 var10001 = false;
                                 break label191;
                              } catch (NoSuchMethodException var25) {
                                 var10000 = var25;
                                 var10001 = false;
                                 break label208;
                              }
                           } else {
                              var32 = "";
                           }

                           label180: {
                              try {
                                 i0.d.b(var32);
                                 if (var32.length() == 0) {
                                    break label180;
                                 }
                              } catch (ClassNotFoundException var22) {
                                 var10001 = false;
                                 break label191;
                              } catch (NoSuchMethodException var23) {
                                 var10000 = var23;
                                 var10001 = false;
                                 break label208;
                              }

                              try {
                                 i0.d.b(var6);
                                 var6 = var6.substring(var32.length() + 1);
                                 i0.d.d(var6, "substring(...)");
                              } catch (ClassNotFoundException var20) {
                                 var10001 = false;
                                 break label191;
                              } catch (NoSuchMethodException var21) {
                                 var10000 = var21;
                                 var10001 = false;
                                 break label208;
                              }
                           }

                           label172: {
                              label171: {
                                 try {
                                    i0.d.b(var6);
                                    var6 = b(var6);
                                    if (var32.length() == 0) {
                                       break label171;
                                    }
                                 } catch (ClassNotFoundException var18) {
                                    var10001 = false;
                                    break label191;
                                 } catch (NoSuchMethodException var19) {
                                    var10000 = var19;
                                    var10001 = false;
                                    break label208;
                                 }

                                 try {
                                    StringBuilder var9 = new StringBuilder();
                                    var9.append(var32);
                                    var9.append('.');
                                    var9.append(var6);
                                    var32 = var9.toString();
                                    break label172;
                                 } catch (ClassNotFoundException var16) {
                                    var10001 = false;
                                    break label191;
                                 } catch (NoSuchMethodException var17) {
                                    var10000 = var17;
                                    var10001 = false;
                                    break label208;
                                 }
                              }

                              var32 = var6;
                           }

                           try {
                              var34 = Class.forName(var32).getDeclaredConstructor(var0);
                           } catch (ClassNotFoundException var14) {
                              var10001 = false;
                              break label191;
                           } catch (NoSuchMethodException var15) {
                              var10000 = var15;
                              var10001 = false;
                              break label208;
                           }

                           var36 = var34;

                           try {
                              if (var34.isAccessible()) {
                                 break label193;
                              }

                              var34.setAccessible(true);
                              break label192;
                           } catch (ClassNotFoundException var12) {
                              var10001 = false;
                              break label191;
                           } catch (NoSuchMethodException var13) {
                              var10000 = var13;
                              var10001 = false;
                           }
                        }

                        NoSuchMethodException var28 = var10000;
                        throw new RuntimeException(var28);
                     }

                     var36 = null;
                     break label193;
                  }

                  var36 = var34;
               }

               HashMap var38 = b;
               if (var36 != null) {
                  var38.put(var0, C.b.v(var36));
               } else {
                  d var39 = d.c;
                  HashMap var35 = var39.b;
                  Boolean var10 = (Boolean)var35.get(var0);
                  int var1;
                  boolean var4;
                  if (var10 != null) {
                     var4 = var10;
                  } else {
                     Method[] var43;
                     try {
                        var43 = var0.getDeclaredMethods();
                     } catch (NoClassDefFoundError var11) {
                        throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", var11);
                     }

                     int var2 = var43.length;
                     var1 = 0;

                     while(true) {
                        if (var1 >= var2) {
                           var35.put(var0, Boolean.FALSE);
                           var4 = false;
                           break;
                        }

                        if ((y)var43[var1].getAnnotation(y.class) != null) {
                           var39.a(var0, var43);
                           var4 = true;
                           break;
                        }

                        ++var1;
                     }
                  }

                  if (var4) {
                     var31 = var3;
                     break label210;
                  }

                  Class var41 = var0.getSuperclass();
                  boolean var29;
                  if (var41 != null && t.class.isAssignableFrom(var41)) {
                     var29 = true;
                  } else {
                     var29 = false;
                  }

                  ArrayList var37 = var7;
                  if (var29) {
                     i0.d.b(var41);
                     if (c(var41) == 1) {
                        var31 = var3;
                        break label210;
                     }

                     Object var42 = var38.get(var41);
                     i0.d.b(var42);
                     var37 = new ArrayList((Collection)var42);
                  }

                  var7 = var0.getInterfaces();
                  i0.d.e(var7, "array");
                  var1 = 0;

                  while(true) {
                     boolean var30;
                     if (var1 < var7.length) {
                        var30 = true;
                     } else {
                        var30 = false;
                     }

                     if (!var30) {
                        var31 = var3;
                        if (var37 == null) {
                           break label210;
                        }

                        var38.put(var0, var37);
                        break;
                     }

                     Class var45 = var7[var1];
                     if (var45 != null && t.class.isAssignableFrom(var45)) {
                        var30 = true;
                     } else {
                        var30 = false;
                     }

                     ArrayList var44;
                     if (!var30) {
                        var44 = var37;
                     } else {
                        i0.d.b(var45);
                        if (c(var45) == 1) {
                           var31 = var3;
                           break label210;
                        }

                        var44 = var37;
                        if (var37 == null) {
                           var44 = new ArrayList();
                        }

                        Object var40 = var38.get(var45);
                        i0.d.b(var40);
                        var44.addAll((Collection)var40);
                     }

                     ++var1;
                     var37 = var44;
                  }
               }

               var31 = 2;
            }
         }

         var8.put(var0, Integer.valueOf(var31));
         return var31;
      }
   }
}
