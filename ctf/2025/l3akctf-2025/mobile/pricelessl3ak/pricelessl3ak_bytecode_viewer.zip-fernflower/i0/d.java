package i0;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public abstract class d {
   public static final Object[] a = new Object[0];

   public static boolean a(Object var0, Object var1) {
      boolean var2;
      if (var0 == null) {
         if (var1 == null) {
            var2 = true;
         } else {
            var2 = false;
         }
      } else {
         var2 = var0.equals(var1);
      }

      return var2;
   }

   public static void b(Object var0) {
      if (var0 == null) {
         NullPointerException var1 = new NullPointerException();
         f(var1, d.class.getName());
         throw var1;
      }
   }

   public static void c(Object var0, String var1) {
      if (var0 == null) {
         NullPointerException var2 = new NullPointerException(var1);
         f(var2, d.class.getName());
         throw var2;
      }
   }

   public static void d(Object var0, String var1) {
      if (var0 == null) {
         NullPointerException var2 = new NullPointerException(var1.concat(" must not be null"));
         f(var2, d.class.getName());
         throw var2;
      }
   }

   public static void e(Object var0, String var1) {
      if (var0 == null) {
         StackTraceElement[] var4 = Thread.currentThread().getStackTrace();
         String var6 = d.class.getName();
         int var2 = 0;

         while(true) {
            int var3 = var2;
            if (var4[var2].getClassName().equals(var6)) {
               while(var4[var3].getClassName().equals(var6)) {
                  ++var3;
               }

               StackTraceElement var8 = var4[var3];
               var6 = var8.getClassName();
               String var9 = var8.getMethodName();
               StringBuilder var5 = new StringBuilder("Parameter specified as non-null is null: method ");
               var5.append(var6);
               var5.append(".");
               var5.append(var9);
               var5.append(", parameter ");
               var5.append(var1);
               NullPointerException var7 = new NullPointerException(var5.toString());
               f(var7, d.class.getName());
               throw var7;
            }

            ++var2;
         }
      }
   }

   public static void f(RuntimeException var0, String var1) {
      StackTraceElement[] var5 = var0.getStackTrace();
      int var4 = var5.length;
      int var3 = -1;

      for(int var2 = 0; var2 < var4; ++var2) {
         if (var1.equals(var5[var2].getClassName())) {
            var3 = var2;
         }
      }

      var0.setStackTrace((StackTraceElement[])Arrays.copyOfRange(var5, var3 + 1, var4));
   }

   public static final Object[] g(Collection var0) {
      int var1 = var0.size();
      Object[] var4 = a;
      Object[] var6;
      if (var1 == 0) {
         var6 = var4;
      } else {
         Iterator var5 = var0.iterator();
         if (!var5.hasNext()) {
            var6 = var4;
         } else {
            var6 = new Object[var1];
            var1 = 0;

            while(true) {
               int var2 = var1 + 1;
               var6[var1] = var5.next();
               if (var2 >= var6.length) {
                  if (!var5.hasNext()) {
                     break;
                  }

                  int var3 = var2 * 3 + 1 >>> 1;
                  var1 = var3;
                  if (var3 <= var2) {
                     var1 = 2147483645;
                     if (var2 >= 2147483645) {
                        throw new OutOfMemoryError();
                     }
                  }

                  var4 = Arrays.copyOf(var6, var1);
                  d(var4, "copyOf(...)");
               } else {
                  var4 = var6;
                  if (!var5.hasNext()) {
                     var6 = Arrays.copyOf(var6, var2);
                     d(var6, "copyOf(...)");
                     break;
                  }
               }

               var1 = var2;
               var6 = var4;
            }
         }
      }

      return var6;
   }

   public static final Object[] h(Collection var0, Object[] var1) {
      int var3 = var0.size();
      int var2 = 0;
      Object[] var7;
      if (var3 == 0) {
         var7 = var1;
         if (var1.length > 0) {
            var1[0] = null;
            var7 = var1;
         }
      } else {
         Iterator var6 = var0.iterator();
         if (!var6.hasNext()) {
            var7 = var1;
            if (var1.length > 0) {
               var1[0] = null;
               var7 = var1;
            }
         } else {
            if (var3 <= var1.length) {
               var7 = var1;
            } else {
               Object var8 = Array.newInstance(var1.getClass().getComponentType(), var3);
               c(var8, "null cannot be cast to non-null type kotlin.Array<kotlin.Any?>");
               var7 = (Object[])var8;
            }

            while(true) {
               var3 = var2 + 1;
               var7[var2] = var6.next();
               Object[] var5;
               if (var3 >= var7.length) {
                  if (!var6.hasNext()) {
                     break;
                  }

                  int var4 = var3 * 3 + 1 >>> 1;
                  var2 = var4;
                  if (var4 <= var3) {
                     var2 = 2147483645;
                     if (var3 >= 2147483645) {
                        throw new OutOfMemoryError();
                     }
                  }

                  var5 = Arrays.copyOf(var7, var2);
                  d(var5, "copyOf(...)");
               } else {
                  var5 = var7;
                  if (!var6.hasNext()) {
                     if (var7 == var1) {
                        var1[var3] = null;
                        var7 = var1;
                     } else {
                        var7 = Arrays.copyOf(var7, var3);
                        d(var7, "copyOf(...)");
                     }
                     break;
                  }
               }

               var2 = var3;
               var7 = var5;
            }
         }
      }

      return var7;
   }
}
