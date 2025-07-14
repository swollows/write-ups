package Z;

import java.util.Collection;

public abstract class j extends i {
   public static int L(Iterable var0) {
      int var1;
      if (var0 instanceof Collection) {
         var1 = ((Collection)var0).size();
      } else {
         var1 = 10;
      }

      return var1;
   }
}
