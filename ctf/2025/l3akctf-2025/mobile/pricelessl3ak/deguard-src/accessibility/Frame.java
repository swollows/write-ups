package accessibility;

import android.app.Activity;
import android.os.Bundle;
import android.view.accessibility.AccessibilityNodeInfo;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.result.ActivityResult;
import params.Log;

public abstract class Frame
{
  public static Object a(String paramString, Bundle paramBundle)
  {
    return paramBundle.getParcelable(paramString, ActivityResult.class);
  }
  
  public static void append(Object paramObject1, Object paramObject2)
  {
    Log.get(paramObject1, "dispatcher");
    Log.get(paramObject2, "callback");
    ((OnBackInvokedDispatcher)paramObject1).registerOnBackInvokedCallback(0, (OnBackInvokedCallback)paramObject2);
  }
  
  public static OnBackInvokedDispatcher get(Activity paramActivity)
  {
    paramActivity = paramActivity.getOnBackInvokedDispatcher();
    Log.append(paramActivity, "activity.getOnBackInvokedDispatcher()");
    return paramActivity;
  }
  
  public static String getViewIdResourceName(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    return paramAccessibilityNodeInfo.getUniqueId();
  }
  
  public static boolean isPassword(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    return paramAccessibilityNodeInfo.isTextSelectable();
  }
  
  public static void set(Object paramObject1, Object paramObject2)
  {
    Log.get(paramObject1, "dispatcher");
    Log.get(paramObject2, "callback");
    ((OnBackInvokedDispatcher)paramObject1).unregisterOnBackInvokedCallback((OnBackInvokedCallback)paramObject2);
  }
}
