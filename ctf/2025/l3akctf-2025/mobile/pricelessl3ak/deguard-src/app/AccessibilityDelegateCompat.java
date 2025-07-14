package app;

import accessibility.AccessibilityNodeInfoCompat;
import accessibility.Handle;
import android.os.BaseBundle;
import android.os.Bundle;
import android.text.Spanned;
import android.text.style.ClickableSpan;
import android.util.SparseArray;
import android.view.View;
import android.view.View.AccessibilityDelegate;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.List;

public class AccessibilityDelegateCompat
{
  public static final View.AccessibilityDelegate c = new View.AccessibilityDelegate();
  public final AccessibilityDelegateCompatJellyBean.1 mBridge;
  public final View.AccessibilityDelegate val$bridge;
  
  public AccessibilityDelegateCompat()
  {
    this(c);
  }
  
  public AccessibilityDelegateCompat(View.AccessibilityDelegate paramAccessibilityDelegate)
  {
    val$bridge = paramAccessibilityDelegate;
    mBridge = new AccessibilityDelegateCompatJellyBean.1(this);
  }
  
  public boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    List localList = (List)paramView.getTag(2131230877);
    Object localObject = localList;
    if (localList == null) {
      localObject = Collections.emptyList();
    }
    int i = 0;
    while ((i < ((List)localObject).size()) && (((AccessibilityNodeInfo.AccessibilityAction)geta).getId() != paramInt)) {
      i += 1;
    }
    boolean bool = val$bridge.performAccessibilityAction(paramView, paramInt, paramBundle);
    if ((!bool) && (paramInt == 2131230726) && (paramBundle != null))
    {
      paramInt = paramBundle.getInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", -1);
      paramBundle = (SparseArray)paramView.getTag(2131230878);
      if (paramBundle != null)
      {
        paramBundle = (WeakReference)paramBundle.get(paramInt);
        if (paramBundle != null)
        {
          localObject = (ClickableSpan)paramBundle.get();
          if (localObject != null)
          {
            paramBundle = paramView.createAccessibilityNodeInfo().getText();
            if ((paramBundle instanceof Spanned)) {
              paramBundle = (ClickableSpan[])((Spanned)paramBundle).getSpans(0, paramBundle.length(), ClickableSpan.class);
            } else {
              paramBundle = null;
            }
            paramInt = 0;
            while ((paramBundle != null) && (paramInt < paramBundle.length))
            {
              if (localObject.equals(paramBundle[paramInt]))
              {
                ((ClickableSpan)localObject).onClick(paramView);
                return true;
              }
              paramInt += 1;
            }
          }
        }
      }
      return false;
    }
    return bool;
  }
  
  public void onInitializeAccessibilityEvent(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    val$bridge.onInitializeAccessibilityEvent(paramView, paramAccessibilityEvent);
  }
  
  public void onInitializeAccessibilityNodeInfo(View paramView, AccessibilityNodeInfoCompat paramAccessibilityNodeInfoCompat)
  {
    val$bridge.onInitializeAccessibilityNodeInfo(paramView, IMPL);
  }
}
