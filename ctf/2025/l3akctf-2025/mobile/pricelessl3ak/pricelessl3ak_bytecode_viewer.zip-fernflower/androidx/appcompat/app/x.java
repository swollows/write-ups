package androidx.appcompat.app;

import android.content.res.Configuration;
import android.os.LocaleList;

public abstract class x {
   public static void a(Configuration var0, Configuration var1, Configuration var2) {
      LocaleList var4 = var0.getLocales();
      LocaleList var3 = var1.getLocales();
      if (!var4.equals(var3)) {
         var2.setLocales(var3);
         var2.locale = var1.locale;
      }

   }

   public static z.b b(Configuration var0) {
      return z.b.a(var0.getLocales().toLanguageTags());
   }

   public static void c(z.b var0) {
      LocaleList.setDefault(LocaleList.forLanguageTags(var0.a.a.toLanguageTags()));
   }

   public static void d(Configuration var0, z.b var1) {
      var0.setLocales(LocaleList.forLanguageTags(var1.a.a.toLanguageTags()));
   }
}
