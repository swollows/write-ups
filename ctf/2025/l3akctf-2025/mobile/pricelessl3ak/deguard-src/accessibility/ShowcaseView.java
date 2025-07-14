package accessibility;

import android.os.BaseBundle;
import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;

public final class ShowcaseView
  extends ClickableSpan
{
  public final AccessibilityNodeInfoCompat a;
  public final int b;
  public final int c;
  
  public ShowcaseView(int paramInt1, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat, int paramInt2)
  {
    c = paramInt1;
    a = paramAccessibilityNodeInfoCompat;
    b = paramInt2;
  }
  
  public final void onClick(View paramView)
  {
    paramView = new Bundle();
    paramView.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", c);
    a.IMPL.performAction(b, paramView);
  }
}
