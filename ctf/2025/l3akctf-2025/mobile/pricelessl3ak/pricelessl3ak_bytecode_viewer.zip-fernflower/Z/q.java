package Z;

import i0.d;
import j0.a;
import java.io.Serializable;
import java.util.Map;

public final class q implements Map, Serializable, a {
   public static final q a = new Object();

   public final void clear() {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public final boolean containsKey(Object var1) {
      return false;
   }

   public final boolean containsValue(Object var1) {
      if (!(var1 instanceof Void)) {
         return false;
      } else {
         d.e((Void)var1, "value");
         return false;
      }
   }

   public final boolean equals(Object var1) {
      boolean var2;
      if (var1 instanceof Map && ((Map)var1).isEmpty()) {
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

   public final void putAll(Map var1) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public final Object remove(Object var1) {
      throw new UnsupportedOperationException("Operation is not supported for read-only collection");
   }

   public final String toString() {
      return "{}";
   }
}
