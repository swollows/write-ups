package androidx.appcompat.widget;

import android.widget.AbsListView;

public abstract class AdapterView
{
  public static void setSelection(AbsListView paramAbsListView, boolean paramBoolean)
  {
    paramAbsListView.setSelectedChildViewEnabled(paramBoolean);
  }
  
  public static boolean setSelection(AbsListView paramAbsListView)
  {
    return paramAbsListView.isSelectedChildViewEnabled();
  }
}
