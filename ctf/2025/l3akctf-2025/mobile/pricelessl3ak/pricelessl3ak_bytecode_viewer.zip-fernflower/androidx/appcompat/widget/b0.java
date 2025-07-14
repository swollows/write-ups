package androidx.appcompat.widget;

import android.os.LocaleList;
import android.widget.TextView;

public abstract class b0 {
   public static LocaleList a(String var0) {
      return LocaleList.forLanguageTags(var0);
   }

   public static void b(TextView var0, LocaleList var1) {
      var0.setTextLocales(var1);
   }
}
