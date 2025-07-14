package a0;

import java.util.AbstractSet;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public final class d extends AbstractSet implements Set, j0.a {
   public final int a;
   public final c b;

   // $FF: synthetic method
   public d(c var1, int var2) {
      this.a = var2;
      this.b = var1;
   }

   public final boolean add(Object var1) {
      switch (this.a) {
         case 0:
            i0.d.e((Map.Entry)var1, "element");
            throw new UnsupportedOperationException();
         default:
            throw new UnsupportedOperationException();
      }
   }

   public final boolean addAll(Collection var1) {
      switch (this.a) {
         case 0:
            i0.d.e(var1, "elements");
            throw new UnsupportedOperationException();
         default:
            i0.d.e(var1, "elements");
            throw new UnsupportedOperationException();
      }
   }

   public final void clear() {
      switch (this.a) {
         case 0:
            this.b.clear();
            return;
         default:
            this.b.clear();
      }
   }

   public final boolean contains(Object var1) {
      switch (this.a) {
         case 0:
            boolean var2;
            if (!(var1 instanceof Map.Entry)) {
               var2 = false;
            } else {
               Map.Entry var3 = (Map.Entry)var1;
               i0.d.e(var3, "element");
               var2 = this.b.e(var3);
            }

            return var2;
         default:
            return this.b.containsKey(var1);
      }
   }

   public boolean containsAll(Collection var1) {
      switch (this.a) {
         case 0:
            i0.d.e(var1, "elements");
            return this.b.d(var1);
         default:
            return super.containsAll(var1);
      }
   }

   public final boolean isEmpty() {
      switch (this.a) {
         case 0:
            return this.b.isEmpty();
         default:
            return this.b.isEmpty();
      }
   }

   public final Iterator iterator() {
      c var1;
      switch (this.a) {
         case 0:
            var1 = this.b;
            var1.getClass();
            return new a(var1, 0);
         default:
            var1 = this.b;
            var1.getClass();
            return new a(var1, 1);
      }
   }

   public final boolean remove(Object var1) {
      int var2;
      boolean var3;
      switch (this.a) {
         case 0:
            boolean var4 = var1 instanceof Map.Entry;
            var3 = false;
            if (var4) {
               Map.Entry var6 = (Map.Entry)var1;
               i0.d.e(var6, "element");
               c var7 = this.b;
               var7.getClass();
               var7.b();
               var2 = var7.g(var6.getKey());
               if (var2 >= 0) {
                  Object[] var5 = var7.b;
                  i0.d.b(var5);
                  if (i0.d.a(var5[var2], var6.getValue())) {
                     var7.k(var2);
                     var3 = true;
                  }
               }
            }

            return var3;
         default:
            c var8 = this.b;
            var8.b();
            var2 = var8.g(var1);
            if (var2 < 0) {
               var3 = false;
            } else {
               var8.k(var2);
               var3 = true;
            }

            return var3;
      }
   }

   public final boolean removeAll(Collection var1) {
      switch (this.a) {
         case 0:
            i0.d.e(var1, "elements");
            this.b.b();
            return super.removeAll(var1);
         default:
            i0.d.e(var1, "elements");
            this.b.b();
            return super.removeAll(var1);
      }
   }

   public final boolean retainAll(Collection var1) {
      switch (this.a) {
         case 0:
            i0.d.e(var1, "elements");
            this.b.b();
            return super.retainAll(var1);
         default:
            i0.d.e(var1, "elements");
            this.b.b();
            return super.retainAll(var1);
      }
   }

   public final int size() {
      int var1;
      switch (this.a) {
         case 0:
            var1 = this.b.i;
            break;
         default:
            var1 = this.b.i;
      }

      return var1;
   }
}
