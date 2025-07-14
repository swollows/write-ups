package n0;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class b implements Iterator, j0.a {
   public Object a;
   public int b;
   public final c c;

   public b(c var1) {
      this.c = var1;
      this.b = -2;
   }

   public final void a() {
      int var1 = this.b;
      c var2 = this.c;
      Object var4;
      if (var1 == -2) {
         var2.getClass();
         var4 = d.f.b.b();
      } else {
         f var3 = var2.a;
         var4 = this.a;
         i0.d.b(var4);
         var3.getClass();
         i0.d.e(var4, "it");
         var4 = d.f.b.b();
      }

      this.a = var4;
      this.b = 1;
   }

   public final boolean hasNext() {
      if (this.b < 0) {
         this.a();
      }

      int var1 = this.b;
      boolean var2 = true;
      if (var1 != 1) {
         var2 = false;
      }

      return var2;
   }

   public final Object next() {
      if (this.b < 0) {
         this.a();
      }

      if (this.b != 0) {
         Object var1 = this.a;
         i0.d.c(var1, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
         this.b = -1;
         return var1;
      } else {
         throw new NoSuchElementException();
      }
   }

   public final void remove() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }
}
