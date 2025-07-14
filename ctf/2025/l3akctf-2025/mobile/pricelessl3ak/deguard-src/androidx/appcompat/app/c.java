package androidx.appcompat.app;

import android.os.Handler;
import android.os.Message;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.d;
import menu.h;
import view.ActionMode;

public final class c
  implements View.OnClickListener
{
  public final void onClick(View paramView)
  {
    switch (a)
    {
    default: 
      paramView = e).mExpandedMenuPresenter;
      if (paramView == null) {
        paramView = null;
      } else {
        paramView = a;
      }
      if (paramView != null)
      {
        paramView.collapseActionView();
        return;
      }
      break;
    case 1: 
      ((ActionMode)e).finish();
      return;
    case 0: 
      paramView = (AlertController)e;
      Button localButton = mButton;
      mHandler.obtainMessage(1, mDialog).sendToTarget();
    }
  }
}
