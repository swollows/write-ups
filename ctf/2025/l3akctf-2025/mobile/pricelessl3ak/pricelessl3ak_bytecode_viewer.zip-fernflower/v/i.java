package v;

import android.content.res.Resources;
import java.util.Objects;

public final class i {
   public final Resources a;
   public final Resources.Theme b;

   public i(Resources var1, Resources.Theme var2) {
      this.a = var1;
      this.b = var2;
   }

   public final boolean equals(Object var1) {
      boolean var2 = true;
      if (this == var1) {
         return true;
      } else if (var1 != null && i.class == var1.getClass()) {
         i var3 = (i)var1;
         if (!this.a.equals(var3.a) || !Objects.equals(this.b, var3.b)) {
            var2 = false;
         }

         return var2;
      } else {
         return false;
      }
   }

   public final int hashCode() {
      return Objects.hash(new Object[]{this.a, this.b});
   }
}
