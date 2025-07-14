package a0;

import java.util.AbstractCollection;
import java.util.Collection;
import java.util.Iterator;

public final class e extends AbstractCollection implements Collection, j0.a {
   public final c a;

   public e(c var1) {
      this.a = var1;
   }

   public final boolean add(Object var1) {
      throw new UnsupportedOperationException();
   }

   public final boolean addAll(Collection var1) {
      i0.d.e(var1, "elements");
      throw new UnsupportedOperationException();
   }

   public final void clear() {
      this.a.clear();
   }

   public final boolean contains(Object var1) {
      return this.a.containsValue(var1);
   }

   public final boolean isEmpty() {
      return this.a.isEmpty();
   }

   public final Iterator iterator() {
      c var1 = this.a;
      var1.getClass();
      return new a(var1, 2);
   }

   public final boolean remove(Object var1) {
      c var4 = this.a;
      var4.b();
      int var2 = var4.h(var1);
      boolean var3;
      if (var2 < 0) {
         var3 = false;
      } else {
         var4.k(var2);
         var3 = true;
      }

      return var3;
   }

   public final boolean removeAll(Collection var1) {
      i0.d.e(var1, "elements");
      this.a.b();
      return super.removeAll(var1);
   }

   public final boolean retainAll(Collection var1) {
      i0.d.e(var1, "elements");
      this.a.b();
      return super.retainAll(var1);
   }

   public final int size() {
      return this.a.i;
   }
}
