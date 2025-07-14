package androidx.appcompat.widget;

import android.view.Window.Callback;

public abstract interface DecorContentParent
{
  public abstract void setWindowCallback(Window.Callback paramCallback);
  
  public abstract void setWindowTitle(CharSequence paramCharSequence);
}
