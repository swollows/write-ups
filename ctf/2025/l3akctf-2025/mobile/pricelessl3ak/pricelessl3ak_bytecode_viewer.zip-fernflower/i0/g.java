package i0;

public abstract class g {
   public static final h a;

   static {
      Object var0 = null;

      label18: {
         h var1;
         try {
            var1 = (h)Class.forName("kotlin.reflect.jvm.internal.ReflectionFactoryImpl").newInstance();
         } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | ClassCastException var2) {
            break label18;
         }

         var0 = var1;
      }

      if (var0 == null) {
         var0 = new Object();
      }

      a = (h)var0;
   }

   public static b a(Class var0) {
      a.getClass();
      return new b(var0);
   }
}
