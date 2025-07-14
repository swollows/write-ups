package A;

import java.util.List;
import java.util.Objects;

public final class e {
   public String a;
   public String b;
   public List c;

   public final boolean equals(Object var1) {
      boolean var2 = true;
      if (this == var1) {
         return true;
      } else if (!(var1 instanceof e)) {
         return false;
      } else {
         e var3 = (e)var1;
         String var4 = var3.a;
         if (!Objects.equals(this.a, var4) || !Objects.equals(this.b, var3.b) || !Objects.equals(this.c, var3.c)) {
            var2 = false;
         }

         return var2;
      }
   }

   public final int hashCode() {
      String var2 = this.b;
      List var1 = this.c;
      return Objects.hash(new Object[]{this.a, var2, var1});
   }
}
