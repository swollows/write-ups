package androidx.appcompat.widget;

import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import java.util.ArrayList;
import java.util.Iterator;
import menu.b;
import menu.k;
import menu.w;

public final class MenuPopupHelper
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  public final void onGlobalLayout()
  {
    Object localObject1;
    Object localObject2;
    View localView;
    switch (this$0)
    {
    default: 
      localObject1 = (k)mPopup;
      if (!((k)localObject1).isShowing()) {
        return;
      }
      localObject2 = mPopup;
      if (this$0) {
        return;
      }
      localView = mAnchorView;
      if ((localView != null) && (localView.isShown()))
      {
        ((ListPopupWindow)localObject2).show();
        return;
      }
      ((k)localObject1).dismiss();
      return;
    case 2: 
      localObject1 = (w)mPopup;
      if (!((w)localObject1).isShowing()) {
        return;
      }
      localObject2 = c;
      if ((((ArrayList)localObject2).size() <= 0) || (get0this$0.this$0)) {
        return;
      }
      localView = view;
      if ((localView != null) && (localView.isShown())) {
        localObject1 = ((ArrayList)localObject2).iterator();
      }
      break;
    }
    while (((Iterator)localObject1).hasNext())
    {
      nextthis$0.show();
      continue;
      ((w)localObject1).dismiss();
      return;
      localObject1 = (SpinnerCompat.DropdownPopup)mPopup;
      localObject2 = this$0;
      localObject1.getClass();
      if ((((View)localObject2).isAttachedToWindow()) && (((View)localObject2).getGlobalVisibleRect(mPopup)))
      {
        ((SpinnerCompat.DropdownPopup)localObject1).computeContentWidth();
        ((ListPopupWindow)localObject1).show();
        return;
      }
      ((ListPopupWindow)localObject1).dismiss();
      return;
      localObject1 = (AppCompatSpinner)mPopup;
      if (!((AppCompatSpinner)localObject1).getInternalPopup().isShowing())
      {
        int i = ((View)localObject1).getTextDirection();
        int j = ((View)localObject1).getTextAlignment();
        mPopup.show(i, j);
      }
      localObject1 = ((View)localObject1).getViewTreeObserver();
      if (localObject1 != null) {
        ((ViewTreeObserver)localObject1).removeOnGlobalLayoutListener(this);
      }
    }
  }
}
