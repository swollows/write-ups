package androidx.fragment.app;

import java.lang.reflect.InvocationTargetException;

public final class q {
   public static final m.k b = new m.k(0);
   public final t a;

   public q(t var1) {
      this.a = var1;
   }

   public static Class b(ClassLoader var0, String var1) {
      m.k var4 = b;
      m.k var3 = (m.k)var4.get(var0);
      m.k var2 = var3;
      if (var3 == null) {
         var2 = new m.k(0);
         var4.put(var0, var2);
      }

      Class var6 = (Class)var2.get(var1);
      Class var5 = var6;
      if (var6 == null) {
         var5 = Class.forName(var1, false, var0);
         var2.put(var1, var5);
      }

      return var5;
   }

   public static Class c(ClassLoader var0, String var1) {
      StringBuilder var2;
      try {
         Class var5 = b(var0, var1);
         return var5;
      } catch (ClassNotFoundException var3) {
         var2 = new StringBuilder("Unable to instantiate fragment ");
         var2.append(var1);
         var2.append(": make sure class name exists");
         throw new RuntimeException(var2.toString(), var3);
      } catch (ClassCastException var4) {
         var2 = new StringBuilder("Unable to instantiate fragment ");
         var2.append(var1);
         var2.append(": make sure class is a valid subclass of Fragment");
         throw new RuntimeException(var2.toString(), var4);
      }
   }

   public final void a(String var1) {
      i var2 = this.a.r.a;

      StringBuilder var8;
      try {
         if (c(var2.getClassLoader(), var1).getConstructor((Class[])null).newInstance((Object[])null) != null) {
            ClassCastException var9 = new ClassCastException();
            throw var9;
         }
      } catch (InstantiationException var4) {
         var8 = new StringBuilder("Unable to instantiate fragment ");
         var8.append(var1);
         var8.append(": make sure class name exists, is public, and has an empty constructor that is public");
         throw new RuntimeException(var8.toString(), var4);
      } catch (IllegalAccessException var5) {
         var8 = new StringBuilder("Unable to instantiate fragment ");
         var8.append(var1);
         var8.append(": make sure class name exists, is public, and has an empty constructor that is public");
         throw new RuntimeException(var8.toString(), var5);
      } catch (NoSuchMethodException var6) {
         var8 = new StringBuilder("Unable to instantiate fragment ");
         var8.append(var1);
         var8.append(": could not find Fragment constructor");
         throw new RuntimeException(var8.toString(), var6);
      } catch (InvocationTargetException var7) {
         StringBuilder var3 = new StringBuilder("Unable to instantiate fragment ");
         var3.append(var1);
         var3.append(": calling Fragment constructor caused an exception");
         throw new RuntimeException(var3.toString(), var7);
      }
   }
}
