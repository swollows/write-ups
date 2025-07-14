package z;

import android.os.LocaleList;
import java.util.Locale;

public final class b {
   public static final b b = new b(new c(new LocaleList(new Locale[0])));
   public final c a;

   public b(c var1) {
      this.a = var1;
   }

   public static b a(String var0) {
      if (var0 != null && !var0.isEmpty()) {
         String[] var6 = var0.split(",", -1);
         int var2 = var6.length;
         Locale[] var5 = new Locale[var2];

         for(int var1 = 0; var1 < var2; ++var1) {
            String var4 = var6[var1];
            int var3 = z.a.a;
            var5[var1] = Locale.forLanguageTag(var4);
         }

         return new b(new c(new LocaleList(var5)));
      } else {
         return b;
      }
   }

   public final boolean equals(Object var1) {
      boolean var2;
      if (var1 instanceof b) {
         c var3 = ((b)var1).a;
         if (this.a.equals(var3)) {
            var2 = true;
            return var2;
         }
      }

      var2 = false;
      return var2;
   }

   public final int hashCode() {
      return this.a.a.hashCode();
   }

   public final String toString() {
      return this.a.a.toString();
   }
}
