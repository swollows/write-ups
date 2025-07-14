package androidx.lifecycle;

import java.util.HashMap;

public final class S {
   public static final D.z b = new D.z(19);
   public final Object a;

   public S(B var1) {
      this.a = var1;
   }

   public S(T var1, P var2) {
      i0.d.e(var1, "store");
      M.a var3 = M.a.b;
      i0.d.e(var3, "defaultCreationExtras");
      H.w var4 = new H.w(var1, var2, var3);
      super();
      this.a = var4;
   }

   public N a(Class var1) {
      i0.b var4 = i0.g.a(var1);
      Class var5 = var4.a;
      boolean var2 = var5.isAnonymousClass();
      String var3 = null;
      var1 = null;
      String var7;
      if (var2) {
         var7 = var3;
      } else if (var5.isLocalClass()) {
         var7 = var3;
      } else {
         var2 = var5.isArray();
         HashMap var6 = i0.b.c;
         if (var2) {
            var5 = var5.getComponentType();
            var3 = var1;
            if (var5.isPrimitive()) {
               String var8 = (String)var6.get(var5.getName());
               var3 = var1;
               if (var8 != null) {
                  var3 = var8.concat("Array");
               }
            }

            var7 = var3;
            if (var3 == null) {
               var7 = "kotlin.Array";
            }
         } else {
            var3 = (String)var6.get(var5.getName());
            var7 = var3;
            if (var3 == null) {
               var7 = var5.getCanonicalName();
            }
         }
      }

      if (var7 != null) {
         var7 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(var7);
         return ((H.w)this.a).f(var4, var7);
      } else {
         throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
      }
   }
}
