package app;

import android.graphics.Rect;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import android.widget.TextView;
import android.window.BackEvent;

public abstract class Vector
{
  public static int add(ViewConfiguration paramViewConfiguration, int paramInt1, int paramInt2, int paramInt3)
  {
    return paramViewConfiguration.getScaledMaximumFlingVelocity(paramInt1, paramInt2, paramInt3);
  }
  
  public static float cross(BackEvent paramBackEvent)
  {
    return paramBackEvent.getTouchY();
  }
  
  public static int get(ViewConfiguration paramViewConfiguration, int paramInt1, int paramInt2, int paramInt3)
  {
    return paramViewConfiguration.getScaledMinimumFlingVelocity(paramInt1, paramInt2, paramInt3);
  }
  
  public static void getBoundsInParent(AccessibilityNodeInfo paramAccessibilityNodeInfo, Rect paramRect)
  {
    paramAccessibilityNodeInfo.getBoundsInWindow(paramRect);
  }
  
  public static boolean getDistance(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    return paramAccessibilityNodeInfo.isAccessibilityDataSensitive();
  }
  
  public static float getPosition(BackEvent paramBackEvent)
  {
    return paramBackEvent.getProgress();
  }
  
  public static float getXVelocity(VelocityTracker paramVelocityTracker, int paramInt)
  {
    return paramVelocityTracker.getAxisVelocity(paramInt);
  }
  
  public static CharSequence length(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    return paramAccessibilityNodeInfo.getContainerTitle();
  }
  
  public static AccessibilityNodeInfo.AccessibilityAction negate()
  {
    return AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_IN_DIRECTION;
  }
  
  public static float normalize(BackEvent paramBackEvent)
  {
    return paramBackEvent.getTouchX();
  }
  
  public static void set(TextView paramTextView, int paramInt, float paramFloat)
  {
    paramTextView.setLineHeight(paramInt, paramFloat);
  }
  
  public static int subtract(BackEvent paramBackEvent)
  {
    return paramBackEvent.getSwipeEdge();
  }
}
