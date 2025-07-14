package androidx.appcompat.app;

import view.ActionMode;
import view.ActionMode.Callback;

public abstract interface AppCompatCallback
{
  public abstract void onSupportActionModeFinished(ActionMode paramActionMode);
  
  public abstract void onSupportActionModeStarted(ActionMode paramActionMode);
  
  public abstract ActionMode onWindowStartingSupportActionMode(ActionMode.Callback paramCallback);
}
