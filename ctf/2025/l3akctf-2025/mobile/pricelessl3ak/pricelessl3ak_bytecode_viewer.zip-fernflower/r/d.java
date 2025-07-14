package r;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class d extends q.e {
   public final AtomicReferenceFieldUpdater a;
   public final AtomicReferenceFieldUpdater b;
   public final AtomicReferenceFieldUpdater c;
   public final AtomicReferenceFieldUpdater d;
   public final AtomicReferenceFieldUpdater e;

   public d(AtomicReferenceFieldUpdater var1, AtomicReferenceFieldUpdater var2, AtomicReferenceFieldUpdater var3, AtomicReferenceFieldUpdater var4, AtomicReferenceFieldUpdater var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var4;
      this.e = var5;
   }

   public final boolean b(g var1, c var2) {
      c var4 = r.c.b;

      boolean var3;
      while(true) {
         AtomicReferenceFieldUpdater var5 = this.d;
         if (var5.compareAndSet(var1, var2, var4)) {
            var3 = true;
            break;
         }

         if (var5.get(var1) != var2) {
            var3 = false;
            break;
         }
      }

      return var3;
   }

   public final boolean c(g var1, Object var2, Object var3) {
      while(true) {
         AtomicReferenceFieldUpdater var5 = this.e;
         boolean var4;
         if (var5.compareAndSet(var1, var2, var3)) {
            var4 = true;
         } else {
            if (var5.get(var1) == var2) {
               continue;
            }

            var4 = false;
         }

         return var4;
      }
   }

   public final boolean d(g var1, f var2, f var3) {
      while(true) {
         AtomicReferenceFieldUpdater var5 = this.c;
         boolean var4;
         if (var5.compareAndSet(var1, var2, var3)) {
            var4 = true;
         } else {
            if (var5.get(var1) == var2) {
               continue;
            }

            var4 = false;
         }

         return var4;
      }
   }

   public final void s(f var1, f var2) {
      this.b.lazySet(var1, var2);
   }

   public final void t(f var1, Thread var2) {
      this.a.lazySet(var1, var2);
   }
}
