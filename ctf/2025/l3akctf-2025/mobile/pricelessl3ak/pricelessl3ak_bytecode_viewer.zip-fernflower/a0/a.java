package a0;

import D.I;
import java.util.Iterator;
import java.util.NoSuchElementException;

public final class a extends I implements Iterator, j0.a {
   public final int e;

   public a(c var1, int var2) {
      this.e = var2;
      i0.d.e(var1, "map");
      super();
      super.d = var1;
      super.b = -1;
      super.c = var1.h;
      this.e();
   }

   public final Object next() {
      int var1;
      c var2;
      Object var3;
      switch (this.e) {
         case 0:
            this.b();
            var1 = super.a;
            var2 = (c)super.d;
            if (var1 < var2.f) {
               super.a = var1 + 1;
               super.b = var1;
               b var4 = new b(var2, var1);
               this.e();
               return var4;
            }

            throw new NoSuchElementException();
         case 1:
            this.b();
            var1 = super.a;
            var2 = (c)super.d;
            if (var1 < var2.f) {
               super.a = var1 + 1;
               super.b = var1;
               var3 = var2.a[var1];
               this.e();
               return var3;
            }

            throw new NoSuchElementException();
         default:
            this.b();
            var1 = super.a;
            var2 = (c)super.d;
            if (var1 < var2.f) {
               super.a = var1 + 1;
               super.b = var1;
               Object[] var5 = var2.b;
               i0.d.b(var5);
               var3 = var5[super.b];
               this.e();
               return var3;
            } else {
               throw new NoSuchElementException();
            }
      }
   }
}
