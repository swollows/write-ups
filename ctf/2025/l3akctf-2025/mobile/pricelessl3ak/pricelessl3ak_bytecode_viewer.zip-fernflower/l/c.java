package l;

import androidx.lifecycle.t;
import androidx.lifecycle.v;
import java.util.Map;

public final class c implements Map.Entry {
   public final t a;
   public final v b;
   public c c;
   public c d;

   public c(t var1, v var2) {
      this.a = var1;
      this.b = var2;
   }

   public final boolean equals(Object var1) {
      boolean var2 = true;
      if (var1 == this) {
         return true;
      } else if (!(var1 instanceof c)) {
         return false;
      } else {
         c var3 = (c)var1;
         t var4 = var3.a;
         if (!this.a.equals(var4) || !this.b.equals(var3.b)) {
            var2 = false;
         }

         return var2;
      }
   }

   public final Object getKey() {
      return this.a;
   }

   public final Object getValue() {
      return this.b;
   }

   public final int hashCode() {
      return this.a.hashCode() ^ this.b.hashCode();
   }

   public final Object setValue(Object var1) {
      throw new UnsupportedOperationException("An entry modification is not supported");
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder();
      var1.append(this.a);
      var1.append("=");
      var1.append(this.b);
      return var1.toString();
   }
}
