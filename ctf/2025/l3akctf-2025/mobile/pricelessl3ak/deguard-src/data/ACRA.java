package data;

import android.content.res.Resources.Theme;

public abstract class ACRA
{
  public static void init(Resources.Theme paramTheme)
  {
    paramTheme.rebase();
  }
}
