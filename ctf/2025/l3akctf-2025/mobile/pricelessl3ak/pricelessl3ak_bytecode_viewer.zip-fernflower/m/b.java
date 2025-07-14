package m;

import java.util.Iterator;
import java.util.NoSuchElementException;

public final class b implements Iterator, j0.a {
   public int a;
   public int b;
   public boolean c;
   public final int d;
   public final Object e;

   public b(int var1) {
      this.a = var1;
   }

   public b(f var1, int var2) {
      this.d = var2;
      switch (var2) {
         case 1:
            this.e = var1;
            this(var1.c);
            return;
         default:
            this.e = var1;
            this(var1.c);
      }
   }

   public b(g var1) {
      this.d = 2;
      this.e = var1;
      this(var1.c);
   }

   public final boolean hasNext() {
      boolean var1;
      if (this.b < this.a) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final Object next() {
      if (this.hasNext()) {
         int var1 = this.b;
         Object var2;
         switch (this.d) {
            case 0:
               var2 = ((f)this.e).e(var1);
               break;
            case 1:
               var2 = ((f)this.e).h(var1);
               break;
            default:
               var2 = ((g)this.e).b[var1];
         }

         ++this.b;
         this.c = true;
         return var2;
      } else {
         throw new NoSuchElementException();
      }
   }

   public final void remove() {
      if (this.c) {
         int var1 = this.b - 1;
         this.b = var1;
         switch (this.d) {
            case 0:
               ((f)this.e).f(var1);
               break;
            case 1:
               ((f)this.e).f(var1);
               break;
            default:
               ((g)this.e).a(var1);
         }

         --this.a;
         this.c = false;
      } else {
         throw new IllegalStateException("Call next() before removing an element.");
      }
   }
}
