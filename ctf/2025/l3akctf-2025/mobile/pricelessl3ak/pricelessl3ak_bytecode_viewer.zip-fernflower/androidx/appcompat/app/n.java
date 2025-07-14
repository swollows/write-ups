package androidx.appcompat.app;

import android.app.LocaleManager;
import android.os.LocaleList;

public abstract class n {
   public static LocaleList a(Object var0) {
      return ((LocaleManager)var0).getApplicationLocales();
   }

   public static void b(Object var0, LocaleList var1) {
      ((LocaleManager)var0).setApplicationLocales(var1);
   }
}
