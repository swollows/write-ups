package b;

import java.io.Serializable;

public final class s implements h0.a, i0.c, m0.a, Serializable, Y.a {
   public transient m0.a a;
   public final Object b;
   public final Class c;
   public final String d;
   public final String e;
   public final boolean f;
   public final int g;
   public final int h;

   public s(int var1, Object var2) {
      this.h = var1;
      this.b = var2;
      this.c = t.class;
      this.d = "updateEnabledCallbacks";
      this.e = "updateEnabledCallbacks()V";
      this.f = false;
      this.g = 0;
   }

   public final m0.a a() {
      i0.g.a.getClass();
      return this;
   }

   public final Object b() {
      switch (this.h) {
         case 0:
            ((t)this.b).d();
            return Y.f.c;
         default:
            ((t)this.b).d();
            return Y.f.c;
      }
   }

   public final int c() {
      return 0;
   }

   public final i0.a d() {
      Class var1 = this.c;
      Object var2;
      if (this.f) {
         i0.g.a.getClass();
         var2 = new i0.f(var1);
      } else {
         var2 = i0.g.a(var1);
      }

      return (i0.a)var2;
   }

   public final boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof s)) {
         if (var1 instanceof s) {
            m0.a var4 = this.a;
            Object var6 = var4;
            if (var4 == null) {
               this.a();
               this.a = this;
               var6 = this;
            }

            return var1.equals(var6);
         } else {
            return false;
         }
      } else {
         s var3 = (s)var1;
         String var5 = var3.d;
         if (!this.d.equals(var5) || !this.e.equals(var3.e) || this.g != var3.g || !this.b.equals(var3.b) || !this.d().equals(var3.d())) {
            var2 = false;
         }

         return var2;
      }
   }

   public final int hashCode() {
      this.d();
      int var2 = this.d().hashCode();
      int var1 = this.d.hashCode();
      return this.e.hashCode() + (var1 + var2 * 31) * 31;
   }

   public final String toString() {
      m0.a var2 = this.a;
      Object var1 = var2;
      if (var2 == null) {
         this.a();
         this.a = this;
         var1 = this;
      }

      if (var1 != this) {
         return var1.toString();
      } else {
         String var4 = this.d;
         String var3;
         if ("<init>".equals(var4)) {
            var3 = "constructor (Kotlin reflection is not available)";
         } else {
            StringBuilder var5 = new StringBuilder("function ");
            var5.append(var4);
            var5.append(" (Kotlin reflection is not available)");
            var3 = var5.toString();
         }

         return var3;
      }
   }
}
