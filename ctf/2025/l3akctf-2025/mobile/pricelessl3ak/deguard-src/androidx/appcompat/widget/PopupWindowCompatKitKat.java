package androidx.appcompat.widget;

import android.graphics.Rect;
import android.widget.PopupWindow;

public abstract class PopupWindowCompatKitKat
{
  public static void showAsDropDown(PopupWindow paramPopupWindow, Rect paramRect)
  {
    paramPopupWindow.setEpicenterBounds(paramRect);
  }
  
  public static void showAsDropDown(PopupWindow paramPopupWindow, boolean paramBoolean)
  {
    paramPopupWindow.setIsClippedToScreen(paramBoolean);
  }
}
