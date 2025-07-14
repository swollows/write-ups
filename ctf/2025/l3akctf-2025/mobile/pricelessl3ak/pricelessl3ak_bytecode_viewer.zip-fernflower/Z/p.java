package Z;

import i0.d;
import j0.a;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

public final class p implements List, Serializable, RandomAccess, a {
   public static final p a = new Object();

   public final boolean addAll(int var1, Collection var2) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

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
      if (var1 instanceof List && ((List)var1).isEmpty()) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public final Object get(int var1) {
      StringBuilder var2 = new StringBuilder("Empty list doesn't contain element at index ");
      var2.append(var1);
      var2.append('.');
      throw new IndexOutOfBoundsException(var2.toString());
   }

   public final int hashCode() {
      return 1;
   }

   public final int indexOf(Object var1) {
      if (!(var1 instanceof Void)) {
         return -1;
      } else {
         d.e((Void)var1, "element");
         return -1;
      }
   }

   public final boolean isEmpty() {
      return true;
   }

   public final Iterator iterator() {
      return o.a;
   }

   public final int lastIndexOf(Object var1) {
      if (!(var1 instanceof Void)) {
         return -1;
      } else {
         d.e((Void)var1, "element");
         return -1;
      }
   }

   public final ListIterator listIterator() {
      return o.a;
   }

   public final ListIterator listIterator(int var1) {
      if (var1 == 0) {
         return o.a;
      } else {
         StringBuilder var2 = new StringBuilder("Index: ");
         var2.append(var1);
         throw new IndexOutOfBoundsException(var2.toString());
      }
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

   public final List subList(int var1, int var2) {
      if (var1 == 0 && var2 == 0) {
         return this;
      } else {
         StringBuilder var3 = new StringBuilder("fromIndex: ");
         var3.append(var1);
         var3.append(", toIndex: ");
         var3.append(var2);
         throw new IndexOutOfBoundsException(var3.toString());
      }
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
