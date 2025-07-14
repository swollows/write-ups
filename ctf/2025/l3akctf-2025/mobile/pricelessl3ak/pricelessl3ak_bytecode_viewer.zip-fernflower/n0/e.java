package n0;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class e implements Iterator, b0.a, j0.a {
   public int a;
   public Integer b;
   public b0.a c;

   public final void a(Object var1) {
      C.b.I(var1);
      this.a = 4;
   }

   public final RuntimeException b() {
      int var1 = this.a;
      Object var3;
      if (var1 != 4) {
         if (var1 != 5) {
            StringBuilder var2 = new StringBuilder("Unexpected state of the iterator: ");
            var2.append(this.a);
            var3 = new IllegalStateException(var2.toString());
         } else {
            var3 = new IllegalStateException("Iterator has failed.");
         }
      } else {
         var3 = new NoSuchElementException();
      }

      return (RuntimeException)var3;
   }

   public final b0.b d() {
      return b0.b.a;
   }

   public final boolean hasNext() {
      while(true) {
         int var1 = this.a;
         if (var1 != 0) {
            if (var1 != 1) {
               if (var1 != 2 && var1 != 3) {
                  if (var1 == 4) {
                     return false;
                  }

                  throw this.b();
               }

               return true;
            }

            i0.d.b((Object)null);
            throw null;
         }

         this.a = 5;
         b0.a var2 = this.c;
         i0.d.b(var2);
         this.c = null;
         var2.a(Y.f.c);
      }
   }

   public final Object next() {
      int var1 = this.a;
      if (var1 != 0 && var1 != 1) {
         if (var1 != 2) {
            if (var1 == 3) {
               this.a = 0;
               Integer var2 = this.b;
               this.b = null;
               return var2;
            } else {
               throw this.b();
            }
         } else {
            this.a = 1;
            i0.d.b((Object)null);
            throw null;
         }
      } else if (this.hasNext()) {
         return this.next();
      } else {
         throw new NoSuchElementException();
      }
   }

   public final void remove() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }
}
