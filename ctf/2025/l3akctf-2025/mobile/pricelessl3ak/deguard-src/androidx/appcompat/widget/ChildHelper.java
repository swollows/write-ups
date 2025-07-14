package androidx.appcompat.widget;

import android.widget.PopupWindow;

public abstract class ChildHelper
{
  public static void addView(PopupWindow paramPopupWindow, boolean paramBoolean)
  {
    paramPopupWindow.setTouchModal(paramBoolean);
  }
}
