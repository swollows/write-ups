package o0;

public abstract class f extends e {
   public static String L(String var0) {
      i0.d.e(var0, "<this>");
      i0.d.e(var0, "missingDelimiterValue");
      int var1 = var0.lastIndexOf(46, var0.length() - 1);
      if (var1 != -1) {
         var0 = var0.substring(var1 + 1, var0.length());
         i0.d.d(var0, "substring(...)");
      }

      return var0;
   }
}
