package data;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources.Theme;

public final class Block
{
  public final int hash;
  public final ColorStateList key;
  public final Configuration type;
  
  public Block(ColorStateList paramColorStateList, Configuration paramConfiguration, Resources.Theme paramTheme)
  {
    key = paramColorStateList;
    type = paramConfiguration;
    int i;
    if (paramTheme == null) {
      i = 0;
    } else {
      i = paramTheme.hashCode();
    }
    hash = i;
  }
}
