package accessibility;

import android.view.accessibility.AccessibilityNodeInfo;

public abstract class Response
{
  public static CharSequence getDescription(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    return paramAccessibilityNodeInfo.getStateDescription();
  }
  
  public static void setError(AccessibilityNodeInfo paramAccessibilityNodeInfo, CharSequence paramCharSequence)
  {
    paramAccessibilityNodeInfo.setStateDescription(paramCharSequence);
  }
}
