package m;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;

public final class e implements Collection {
   public final f a;

   public e(f var1) {
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
      boolean var2;
      if (this.a.a(var1) >= 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      return var2;
   }

   public final boolean containsAll(Collection var1) {
      Iterator var2 = var1.iterator();

      do {
         if (!var2.hasNext()) {
            return true;
         }
      } while(this.contains(var2.next()));

      return false;
   }

   public final boolean isEmpty() {
      return this.a.isEmpty();
   }

   public final Iterator iterator() {
      return new b(this.a, 1);
   }

   public final boolean remove(Object var1) {
      f var3 = this.a;
      int var2 = var3.a(var1);
      if (var2 >= 0) {
         var3.f(var2);
         return true;
      } else {
         return false;
      }
   }

   public final boolean removeAll(Collection var1) {
      f var7 = this.a;
      int var3 = var7.c;
      int var2 = 0;

      int var5;
      boolean var6;
      for(var6 = false; var2 < var3; var3 = var5) {
         var5 = var3;
         int var4 = var2;
         if (var1.contains(var7.h(var2))) {
            var7.f(var2);
            var4 = var2 - 1;
            var5 = var3 - 1;
            var6 = true;
         }

         var2 = var4 + 1;
      }

      return var6;
   }

   public final boolean retainAll(Collection var1) {
      f var7 = this.a;
      int var3 = var7.c;
      int var2 = 0;

      int var4;
      boolean var6;
      for(var6 = false; var2 < var3; var3 = var4) {
         var4 = var3;
         int var5 = var2;
         if (!var1.contains(var7.h(var2))) {
            var7.f(var2);
            var5 = var2 - 1;
            var4 = var3 - 1;
            var6 = true;
         }

         var2 = var5 + 1;
      }

      return var6;
   }

   public final int size() {
      return this.a.c;
   }

   public final Object[] toArray() {
      f var4 = this.a;
      int var2 = var4.c;
      Object[] var3 = new Object[var2];

      for(int var1 = 0; var1 < var2; ++var1) {
         var3[var1] = var4.h(var1);
      }

      return var3;
   }

   public final Object[] toArray(Object[] var1) {
      f var5 = this.a;
      int var3 = var5.c;
      Object[] var4 = var1;
      if (var1.length < var3) {
         var4 = (Object[])Array.newInstance(var1.getClass().getComponentType(), var3);
      }

      for(int var2 = 0; var2 < var3; ++var2) {
         var4[var2] = var5.h(var2);
      }

      if (var4.length > var3) {
         var4[var3] = null;
      }

      return var4;
   }
}
