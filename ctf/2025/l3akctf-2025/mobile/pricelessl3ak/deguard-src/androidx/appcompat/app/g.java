package androidx.appcompat.app;

import android.content.DialogInterface.OnClickListener;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;

public final class g
  implements AdapterView.OnItemClickListener
{
  public g(h paramH, AlertController paramAlertController)
  {
    g = paramH;
    this$0 = paramAlertController;
  }
  
  public final void onItemClick(AdapterView paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    paramAdapterView = g;
    paramView = u;
    AlertController localAlertController = this$0;
    paramView.onClick(mDialog, paramInt);
    if (!c) {
      mDialog.dismiss();
    }
  }
}
