package Z;

import i0.d;
import j0.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class r implements Set, Serializable, a {
   public static final r a = new Object();

   public final boolean addAll(Collection var1) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public final void clear() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public final boolean contains(Object var1) {
      if (!(var1 instanceof Void)) {
         return false;
      } else {
         d.e((Void)var1, "element");
         return false;
      }
   }

   public final boolean containsAll(Collection var1) {
      d.e(var1, "elements");
      return var1.isEmpty();
   }

   public final boolean equals(Object var1) {
      boolean var2;
      if (var1 instanceof Set && ((Set)var1).isEmpty()) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public final int hashCode() {
      return 0;
   }

   public final boolean isEmpty() {
      return true;
   }

   public final Iterator iterator() {
      return o.a;
   }

   public final boolean remove(Object var1) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public final boolean removeAll(Collection var1) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public final boolean retainAll(Collection var1) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public final Object[] toArray() {
      return d.g(this);
   }

   public final Object[] toArray(Object[] var1) {
      d.e(var1, "array");
      return d.h(this, var1);
   }

   public final String toString() {
      return "[]";
   }
}
