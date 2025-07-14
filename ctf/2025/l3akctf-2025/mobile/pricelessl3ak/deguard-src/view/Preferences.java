package view;

import android.view.ActionMode;
import android.view.ActionMode.Callback;
import android.view.SearchEvent;
import android.view.Window.Callback;

public abstract class Preferences
{
  public static boolean onMenuItemSelected(Window.Callback paramCallback, SearchEvent paramSearchEvent)
  {
    return paramCallback.onSearchRequested(paramSearchEvent);
  }
  
  public static ActionMode startAsSupportActionMode(Window.Callback paramCallback, ActionMode.Callback paramCallback1, int paramInt)
  {
    return paramCallback.onWindowStartingActionMode(paramCallback1, paramInt);
  }
}
