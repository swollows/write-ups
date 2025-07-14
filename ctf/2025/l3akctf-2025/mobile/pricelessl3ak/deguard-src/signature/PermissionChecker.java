package signature;

import android.content.Context;

public abstract class PermissionChecker
{
  public static String checkPermission(Context paramContext)
  {
    return paramContext.getOpPackageName();
  }
}
