package data;

import android.content.res.Resources;
import android.content.res.Resources.Theme;
import java.util.Objects;
import v.i;

public final class Game
{
  public final Resources res;
  public final Resources.Theme title;
  
  public Game(Resources paramResources, Resources.Theme paramTheme)
  {
    res = paramResources;
    title = paramTheme;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject != null)
    {
      if (i.class != paramObject.getClass()) {
        return false;
      }
      paramObject = (Game)paramObject;
      if ((res.equals(res)) && (Objects.equals(title, title))) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { res, title });
  }
}
