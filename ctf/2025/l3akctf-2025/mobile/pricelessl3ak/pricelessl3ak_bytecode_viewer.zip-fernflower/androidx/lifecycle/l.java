package androidx.lifecycle;

public final class l {
   public static n a(o var0) {
      i0.d.e(var0, "state");
      int var1 = var0.ordinal();
      n var2;
      if (var1 != 2) {
         if (var1 != 3) {
            if (var1 != 4) {
               var2 = null;
            } else {
               var2 = n.ON_PAUSE;
            }
         } else {
            var2 = n.ON_STOP;
         }
      } else {
         var2 = n.ON_DESTROY;
      }

      return var2;
   }

   public static n b(o var0) {
      i0.d.e(var0, "state");
      int var1 = var0.ordinal();
      n var2;
      if (var1 != 1) {
         if (var1 != 2) {
            if (var1 != 3) {
               var2 = null;
            } else {
               var2 = n.ON_RESUME;
            }
         } else {
            var2 = n.ON_START;
         }
      } else {
         var2 = n.ON_CREATE;
      }

      return var2;
   }
}
