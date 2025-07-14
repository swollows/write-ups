package menu;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.view.KeyEvent;
import android.view.KeyEvent.DispatcherState;
import android.view.View;
import android.view.Window;
import androidx.appcompat.app.k;

public final class g
  implements DialogInterface.OnKeyListener, DialogInterface.OnClickListener, DialogInterface.OnDismissListener, Object
{
  public e a;
  public p b;
  public k c;
  
  public final void a(f paramF, boolean paramBoolean)
  {
    if ((paramBoolean) || (paramF == b))
    {
      paramF = c;
      if (paramF != null) {
        paramF.dismiss();
      }
    }
  }
  
  public final boolean a(f paramF)
  {
    return false;
  }
  
  public final void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramDialogInterface = a;
    if (g == null) {
      g = new e.a(paramDialogInterface);
    }
    paramDialogInterface = g.a(paramInt);
    b.a(paramDialogInterface, null, 0);
  }
  
  public final void onDismiss(DialogInterface paramDialogInterface)
  {
    a.a(b, true);
  }
  
  public final boolean onKey(DialogInterface paramDialogInterface, int paramInt, KeyEvent paramKeyEvent)
  {
    p localP = b;
    if ((paramInt == 82) || (paramInt == 4)) {
      if ((paramKeyEvent.getAction() == 0) && (paramKeyEvent.getRepeatCount() == 0))
      {
        paramDialogInterface = c.getWindow();
        if (paramDialogInterface != null)
        {
          paramDialogInterface = paramDialogInterface.getDecorView();
          if (paramDialogInterface != null)
          {
            paramDialogInterface = paramDialogInterface.getKeyDispatcherState();
            if (paramDialogInterface != null)
            {
              paramDialogInterface.startTracking(paramKeyEvent, this);
              return true;
            }
          }
        }
      }
      else if ((paramKeyEvent.getAction() == 1) && (!paramKeyEvent.isCanceled()))
      {
        java.lang.Object localObject = c.getWindow();
        if (localObject != null)
        {
          localObject = ((Window)localObject).getDecorView();
          if (localObject != null)
          {
            localObject = ((View)localObject).getKeyDispatcherState();
            if ((localObject != null) && (((KeyEvent.DispatcherState)localObject).isTracking(paramKeyEvent)))
            {
              localP.a(true);
              paramDialogInterface.dismiss();
              return true;
            }
          }
        }
      }
    }
    return localP.performShortcut(paramInt, paramKeyEvent, 0);
  }
}
