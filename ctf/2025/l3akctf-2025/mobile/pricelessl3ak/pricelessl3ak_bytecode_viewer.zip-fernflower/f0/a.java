package f0;

public abstract class a {
   public static final Integer a;

   static {
      Object var2 = null;

      Object var0;
      label46: {
         label45:
         try {
            var0 = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get((Object)null);
            if (var0 instanceof Integer) {
               Integer var5 = (Integer)var0;
               break label46;
            }
         } finally {
            break label45;
         }

         var0 = null;
      }

      Object var1 = var2;
      if (var0 != null) {
         var1 = var2;
         if (((Number)var0).intValue() > 0) {
            var1 = var0;
         }
      }

      a = (Integer)var1;
   }
}
