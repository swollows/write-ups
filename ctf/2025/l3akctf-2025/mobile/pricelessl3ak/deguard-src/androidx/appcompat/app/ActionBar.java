package androidx.appcompat.app;

import android.content.Context;
import android.view.KeyEvent;
import view.ActionMode;
import views.i;

public abstract class ActionBar
{
  public abstract boolean collapseActionView();
  
  public abstract void dispatchMenuVisibilityChanged(boolean paramBoolean);
  
  public abstract int getDisplayOptions();
  
  public abstract Context getThemedContext();
  
  public boolean invalidateOptionsMenu()
  {
    return false;
  }
  
  public abstract boolean onKeyShortcut(int paramInt, KeyEvent paramKeyEvent);
  
  public boolean onKeyShortcut(KeyEvent paramKeyEvent)
  {
    return false;
  }
  
  public boolean openOptionsMenu()
  {
    return false;
  }
  
  public abstract void setDisplayOptions(boolean paramBoolean);
  
  public abstract void setShowHideAnimationEnabled(boolean paramBoolean);
  
  public abstract void setTitle();
  
  public abstract void setTitle(CharSequence paramCharSequence);
  
  public void show() {}
  
  public boolean showOverflowMenu()
  {
    return false;
  }
  
  public ActionMode startActionMode(i paramI)
  {
    return null;
  }
}
