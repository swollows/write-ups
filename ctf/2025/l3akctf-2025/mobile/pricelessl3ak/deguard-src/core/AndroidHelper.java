package core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.PackageInfoFlags;

public abstract class AndroidHelper
{
  public static PackageInfo getPackageInfo(PackageManager paramPackageManager, Context paramContext)
  {
    return paramPackageManager.getPackageInfo(paramContext.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
  }
}
