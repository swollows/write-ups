package androidx.appcompat.app;

import android.os.PowerManager;
import java.util.Locale;

public abstract class w {
   public static boolean a(PowerManager var0) {
      return var0.isPowerSaveMode();
   }

   public static String b(Locale var0) {
      return var0.toLanguageTag();
   }
}
