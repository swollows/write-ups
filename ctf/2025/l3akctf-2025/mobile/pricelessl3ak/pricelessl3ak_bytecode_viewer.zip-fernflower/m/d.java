package m;

import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;

public final class d implements Iterator, Map.Entry {
   public int a;
   public int b;
   public boolean c;
   public final f d;

   public d(f var1) {
      this.d = var1;
      this.a = var1.c - 1;
      this.b = -1;
   }

   public final boolean equals(Object var1) {
      if (this.c) {
         boolean var3 = var1 instanceof Map.Entry;
         boolean var4 = false;
         if (!var3) {
            return false;
         } else {
            Map.Entry var6 = (Map.Entry)var1;
            var1 = var6.getKey();
            int var2 = this.b;
            f var5 = this.d;
            var3 = var4;
            if (i0.d.a(var1, var5.e(var2))) {
               var3 = var4;
               if (i0.d.a(var6.getValue(), var5.h(this.b))) {
                  var3 = true;
               }
            }

            return var3;
         }
      } else {
         throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
   }

   public final Object getKey() {
      if (this.c) {
         return this.d.e(this.b);
      } else {
         throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
   }

   public final Object getValue() {
      if (this.c) {
         return this.d.h(this.b);
      } else {
         throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
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

   public final int hashCode() {
      if (this.c) {
         int var1 = this.b;
         f var4 = this.d;
         Object var3 = var4.e(var1);
         Object var5 = var4.h(this.b);
         int var2 = 0;
         if (var3 == null) {
            var1 = 0;
         } else {
            var1 = var3.hashCode();
         }

         if (var5 != null) {
            var2 = var5.hashCode();
         }

         return var1 ^ var2;
      } else {
         throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
   }

   public final Object next() {
      if (this.hasNext()) {
         ++this.b;
         this.c = true;
         return this;
      } else {
         throw new NoSuchElementException();
      }
   }

   public final void remove() {
      if (this.c) {
         this.d.f(this.b);
         --this.b;
         --this.a;
         this.c = false;
      } else {
         throw new IllegalStateException();
      }
   }

   public final Object setValue(Object var1) {
      if (this.c) {
         return this.d.g(this.b, var1);
      } else {
         throw new IllegalStateException("This container does not support retaining Map.Entry objects");
      }
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.getKey());
      var1.append("=");
      var1.append(this.getValue());
      return var1.toString();
   }
}
