package D;

import B.b;
import android.view.DisplayCutout;
import java.util.Objects;

public final class k {
   public final DisplayCutout a;

   public k(DisplayCutout var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 != null && k.class == var1.getClass()) {
         k var2 = (k)var1;
         return Objects.equals(this.a, var2.a);
      } else {
         return false;
      }
   }

   public final int hashCode() {
      return b.b(this.a);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder("DisplayCutoutCompat{");
      var1.append(this.a);
      var1.append("}");
      return var1.toString();
   }
}
