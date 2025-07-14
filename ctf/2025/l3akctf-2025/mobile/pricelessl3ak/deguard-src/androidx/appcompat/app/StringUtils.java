package androidx.appcompat.app;

import android.os.PowerManager;
import java.util.Locale;

public abstract class StringUtils
{
  public static boolean isPowerSaveMode(PowerManager paramPowerManager)
  {
    return paramPowerManager.isPowerSaveMode();
  }
  
  public static String toLanguageTag(Locale paramLocale)
  {
    return paramLocale.toLanguageTag();
  }
}
