package Z;

import i0.d;
import j0.a;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

public final class e implements Collection, a {
   public final Object[] a;

   public e(Object[] var1) {
      this.a = var1;
   }

   public final boolean add(Object var1) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public final boolean addAll(Collection var1) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public final void clear() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public final boolean contains(Object var1) {
      int var2;
      boolean var4;
      label37: {
         Object[] var5 = this.a;
         d.e(var5, "<this>");
         var4 = false;
         int var3;
         if (var1 == null) {
            var3 = var5.length;

            for(var2 = 0; var2 < var3; ++var2) {
               if (var5[var2] == null) {
                  break label37;
               }
            }
         } else {
            var3 = var5.length;

            for(var2 = 0; var2 < var3; ++var2) {
               if (var1.equals(var5[var2])) {
                  break label37;
               }
            }
         }

         var2 = -1;
      }

      if (var2 >= 0) {
         var4 = true;
      }

      return var4;
   }

   public final boolean containsAll(Collection var1) {
      d.e(var1, "elements");
      boolean var2 = var1.isEmpty();
      boolean var3 = true;
      if (var2) {
         var2 = var3;
      } else {
         Iterator var4 = var1.iterator();

         while(true) {
            var2 = var3;
            if (!var4.hasNext()) {
               break;
            }

            if (!this.contains(var4.next())) {
               var2 = false;
               break;
            }
         }
      }

      return var2;
   }

   public final boolean isEmpty() {
      boolean var1;
      if (this.a.length == 0) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final Iterator iterator() {
      return new Z.a(this.a);
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

   public final int size() {
      return this.a.length;
   }

   public final Object[] toArray() {
      Object[] var1 = this.a;
      var1 = Arrays.copyOf(var1, var1.length, Object[].class);
      d.d(var1, "copyOf(...)");
      return var1;
   }

   public final Object[] toArray(Object[] var1) {
      d.e(var1, "array");
      return d.h(this, var1);
   }
}
