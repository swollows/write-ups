package androidx.lifecycle;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public final class b {
   public final HashMap a;
   public final HashMap b;

   public b(HashMap var1) {
      this.b = var1;
      this.a = new HashMap();

      Map.Entry var5;
      Object var6;
      for(Iterator var4 = var1.entrySet().iterator(); var4.hasNext(); ((List)var6).add((c)var5.getKey())) {
         var5 = (Map.Entry)var4.next();
         n var3 = (n)var5.getValue();
         List var2 = (List)this.a.get(var3);
         var6 = var2;
         if (var2 == null) {
            var6 = new ArrayList();
            this.a.put(var3, var6);
         }
      }

   }

   public static void a(List var0, u var1, n var2, t var3) {
      if (var0 != null) {
         for(int var4 = var0.size() - 1; var4 >= 0; --var4) {
            c var6 = (c)var0.get(var4);
            var6.getClass();

            InvocationTargetException var18;
            label62: {
               IllegalAccessException var10000;
               label61: {
                  int var5;
                  boolean var10001;
                  try {
                     var5 = var6.a;
                  } catch (InvocationTargetException var13) {
                     var18 = var13;
                     var10001 = false;
                     break label62;
                  } catch (IllegalAccessException var14) {
                     var10000 = var14;
                     var10001 = false;
                     break label61;
                  }

                  Method var17 = var6.b;
                  if (var5 != 0) {
                     if (var5 != 1) {
                        if (var5 != 2) {
                           continue;
                        }

                        try {
                           var17.invoke(var3, var1, var2);
                           continue;
                        } catch (InvocationTargetException var7) {
                           var18 = var7;
                           var10001 = false;
                           break label62;
                        } catch (IllegalAccessException var8) {
                           var10000 = var8;
                           var10001 = false;
                        }
                     } else {
                        try {
                           var17.invoke(var3, var1);
                           continue;
                        } catch (InvocationTargetException var9) {
                           var18 = var9;
                           var10001 = false;
                           break label62;
                        } catch (IllegalAccessException var10) {
                           var10000 = var10;
                           var10001 = false;
                        }
                     }
                  } else {
                     try {
                        var17.invoke(var3, (Object[])null);
                        continue;
                     } catch (InvocationTargetException var11) {
                        var18 = var11;
                        var10001 = false;
                        break label62;
                     } catch (IllegalAccessException var12) {
                        var10000 = var12;
                        var10001 = false;
                     }
                  }
               }

               IllegalAccessException var15 = var10000;
               throw new RuntimeException(var15);
            }

            InvocationTargetException var16 = var18;
            throw new RuntimeException("Failed to call observer method", var16.getCause());
         }
      }

   }
}
