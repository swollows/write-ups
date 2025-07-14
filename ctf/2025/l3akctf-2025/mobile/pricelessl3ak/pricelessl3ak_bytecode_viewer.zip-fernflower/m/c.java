package m;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;

public final class c implements Set {
   public final f a;

   public c(f var1) {
      this.a = var1;
   }

   public final boolean add(Object var1) {
      throw new UnsupportedOperationException();
   }

   public final boolean addAll(Collection var1) {
      throw new UnsupportedOperationException();
   }

   public final void clear() {
      this.a.clear();
   }

   public final boolean contains(Object var1) {
      return this.a.containsKey(var1);
   }

   public final boolean containsAll(Collection var1) {
      return this.a.i(var1);
   }

   public final boolean equals(Object var1) {
      boolean var2 = true;
      if (this != var1) {
         if (var1 instanceof Set) {
            label29: {
               Set var6 = (Set)var1;
               f var4 = this.a;

               boolean var3;
               try {
                  if (var4.c != var6.size()) {
                     break label29;
                  }

                  var3 = var4.i(var6);
               } catch (ClassCastException | NullPointerException var5) {
                  break label29;
               }

               if (var3) {
                  return var2;
               }
            }
         }

         var2 = false;
      }

      return var2;
   }

   public final int hashCode() {
      f var4 = this.a;
      int var2 = var4.c - 1;

      int var1;
      for(var1 = 0; var2 >= 0; --var2) {
         Object var5 = var4.e(var2);
         int var3;
         if (var5 == null) {
            var3 = 0;
         } else {
            var3 = var5.hashCode();
         }

         var1 += var3;
      }

      return var1;
   }

   public final boolean isEmpty() {
      return this.a.isEmpty();
   }

   public final Iterator iterator() {
      return new b(this.a, 0);
   }

   public final boolean remove(Object var1) {
      f var3 = this.a;
      int var2 = var3.c(var1);
      if (var2 >= 0) {
         var3.f(var2);
         return true;
      } else {
         return false;
      }
   }

   public final boolean removeAll(Collection var1) {
      return this.a.j(var1);
   }

   public final boolean retainAll(Collection var1) {
      f var5 = this.a;
      int var3 = var5.c;

      for(int var2 = var3 - 1; var2 >= 0; --var2) {
         if (!var1.contains(var5.e(var2))) {
            var5.f(var2);
         }
      }

      boolean var4;
      if (var3 != var5.c) {
         var4 = true;
      } else {
         var4 = false;
      }

      return var4;
   }

   public final int size() {
      return this.a.c;
   }

   public final Object[] toArray() {
      f var3 = this.a;
      int var2 = var3.c;
      Object[] var4 = new Object[var2];

      for(int var1 = 0; var1 < var2; ++var1) {
         var4[var1] = var3.e(var1);
      }

      return var4;
   }

   public final Object[] toArray(Object[] var1) {
      f var5 = this.a;
      int var3 = var5.c;
      Object[] var4 = var1;
      if (var1.length < var3) {
         var4 = (Object[])Array.newInstance(var1.getClass().getComponentType(), var3);
      }

      for(int var2 = 0; var2 < var3; ++var2) {
         var4[var2] = var5.e(var2);
      }

      if (var4.length > var3) {
         var4[var3] = null;
      }

      return var4;
   }
}
