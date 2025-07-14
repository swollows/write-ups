package view;

import android.view.Window.Callback;

public abstract class RefreshableActivity
{
  public static void doRefresh(Window.Callback paramCallback, boolean paramBoolean)
  {
    paramCallback.onPointerCaptureChanged(paramBoolean);
  }
}
