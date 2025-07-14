package home;

import android.graphics.drawable.Drawable.Callback;

public abstract class DrawableWrapper
  extends android.graphics.drawable.Drawable
  implements Drawable.Callback, Drawable
{
  public abstract void setWrappedDrawable(android.graphics.drawable.Drawable paramDrawable);
}
