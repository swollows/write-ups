package androidx.lifecycle;

import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public final class d {
   public static final d c = new d();
   public final HashMap a = new HashMap();
   public final HashMap b = new HashMap();

   public static void b(HashMap var0, c var1, n var2, Class var3) {
      n var4 = (n)var0.get(var1);
      if (var4 != null && var2 != var4) {
         Method var5 = var1.b;
         StringBuilder var6 = new StringBuilder("Method ");
         var6.append(var5.getName());
         var6.append(" in ");
         var6.append(var3.getName());
         var6.append(" already declared with different @OnLifecycleEvent value: previous value ");
         var6.append(var4);
         var6.append(", new value ");
         var6.append(var2);
         throw new IllegalArgumentException(var6.toString());
      } else {
         if (var4 == null) {
            var0.put(var1, var2);
         }

      }
   }

   public final b a(Class var1, Method[] var2) {
      Class var10 = var1.getSuperclass();
      HashMap var9 = new HashMap();
      HashMap var8 = this.a;
      b var7;
      if (var10 != null) {
         var7 = (b)var8.get(var10);
         if (var7 == null) {
            var7 = this.a(var10, (Method[])null);
         }

         var9.putAll(var7.b);
      }

      Class[] var17 = var1.getInterfaces();
      int var4 = var17.length;

      for(int var3 = 0; var3 < var4; ++var3) {
         Class var11 = var17[var3];
         var7 = (b)var8.get(var11);
         if (var7 == null) {
            var7 = this.a(var11, (Method[])null);
         }

         Iterator var15 = var7.b.entrySet().iterator();

         while(var15.hasNext()) {
            Map.Entry var19 = (Map.Entry)var15.next();
            b(var9, (c)var19.getKey(), (n)var19.getValue(), var1);
         }
      }

      if (var2 == null) {
         try {
            var2 = var1.getDeclaredMethods();
         } catch (NoClassDefFoundError var12) {
            throw new IllegalArgumentException("The observer class has some methods that use newer APIs which are not available in the current OS version. Lifecycles cannot access even other methods so you should make sure that your observer classes only access framework classes that are available in your min API level OR use lifecycle:compiler annotation processor.", var12);
         }
      }

      int var5 = var2.length;
      var4 = 0;

      boolean var6;
      for(var6 = false; var4 < var5; ++var4) {
         Method var18 = var2[var4];
         y var20 = (y)var18.getAnnotation(y.class);
         if (var20 != null) {
            Class[] var16 = var18.getParameterTypes();
            byte var14;
            if (var16.length > 0) {
               if (!u.class.isAssignableFrom(var16[0])) {
                  throw new IllegalArgumentException("invalid parameter type. Must be one and instanceof LifecycleOwner");
               }

               var14 = 1;
            } else {
               var14 = 0;
            }

            n var21 = var20.value();
            if (var16.length > 1) {
               if (!n.class.isAssignableFrom(var16[1])) {
                  throw new IllegalArgumentException("invalid parameter type. second arg must be an event");
               }

               if (var21 != n.ON_ANY) {
                  throw new IllegalArgumentException("Second arg is supported only for ON_ANY value");
               }

               var14 = 2;
            }

            if (var16.length > 2) {
               throw new IllegalArgumentException("cannot have more than 2 params");
            }

            b(var9, new c(var14, var18), var21, var1);
            var6 = true;
         }
      }

      b var13 = new b(var9);
      var8.put(var1, var13);
      this.b.put(var1, var6);
      return var13;
   }
}
