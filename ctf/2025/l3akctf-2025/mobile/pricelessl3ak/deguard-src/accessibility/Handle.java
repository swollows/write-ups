package accessibility;

import Client.StringUtil;
import Client.Util;
import E.i;
import E.j;
import E.k;
import E.l;
import E.m;
import E.n;
import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;
import app.FastMathLiteralArrays;
import app.Log;
import app.Vector;

public final class Handle
{
  public static final Handle BOTTOM;
  public static final Handle CENTER;
  public static final Handle TOP;
  public static final Handle b;
  public final Object a;
  public final int d;
  
  static
  {
    new Handle(null, 1, null);
    new Handle(null, 2, null);
    new Handle(null, 4, null);
    new Handle(null, 8, null);
    new Handle(null, 16, null);
    new Handle(null, 32, null);
    new Handle(null, 64, null);
    new Handle(null, 128, null);
    new Handle(null, 256, E.h.class);
    new Handle(null, 512, E.h.class);
    new Handle(null, 1024, i.class);
    new Handle(null, 2048, i.class);
    b = new Handle(null, 4096, null);
    TOP = new Handle(null, 8192, null);
    new Handle(null, 16384, null);
    new Handle(null, 32768, null);
    new Handle(null, 65536, null);
    new Handle(null, 131072, m.class);
    new Handle(null, 262144, null);
    new Handle(null, 524288, null);
    new Handle(null, 1048576, null);
    new Handle(null, 2097152, n.class);
    int i = Build.VERSION.SDK_INT;
    new Handle(AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, null);
    new Handle(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, k.class);
    CENTER = new Handle(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP, 16908344, null);
    new Handle(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, null);
    BOTTOM = new Handle(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, null);
    new Handle(AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, null);
    AccessibilityNodeInfo.AccessibilityAction localAccessibilityAction;
    if (i >= 29) {
      localAccessibilityAction = Log.getID();
    } else {
      localAccessibilityAction = null;
    }
    new Handle(localAccessibilityAction, 16908358, null);
    if (i >= 29) {
      localAccessibilityAction = Log.getLog();
    } else {
      localAccessibilityAction = null;
    }
    new Handle(localAccessibilityAction, 16908359, null);
    if (i >= 29) {
      localAccessibilityAction = Log.value();
    } else {
      localAccessibilityAction = null;
    }
    new Handle(localAccessibilityAction, 16908360, null);
    if (i >= 29) {
      localAccessibilityAction = Log.fromDrawable();
    } else {
      localAccessibilityAction = null;
    }
    new Handle(localAccessibilityAction, 16908361, null);
    new Handle(AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, null);
    new Handle(AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS, 16908349, l.class);
    if (i >= 26) {
      localAccessibilityAction = StringUtil.multiply();
    } else {
      localAccessibilityAction = null;
    }
    new Handle(localAccessibilityAction, 16908354, j.class);
    if (i >= 28) {
      localAccessibilityAction = Util.getClientURL();
    } else {
      localAccessibilityAction = null;
    }
    new Handle(localAccessibilityAction, 16908356, null);
    if (i >= 28) {
      localAccessibilityAction = Util.getImageFileName();
    } else {
      localAccessibilityAction = null;
    }
    new Handle(localAccessibilityAction, 16908357, null);
    if (i >= 30) {
      localAccessibilityAction = FastMathLiteralArrays.loadExpFracB();
    } else {
      localAccessibilityAction = null;
    }
    new Handle(localAccessibilityAction, 16908362, null);
    if (i >= 30) {
      localAccessibilityAction = FastMathLiteralArrays.loadLnMant();
    } else {
      localAccessibilityAction = null;
    }
    new Handle(localAccessibilityAction, 16908372, null);
    if (i >= 32) {
      localAccessibilityAction = AccessibilityNodeInfoCompat.AccessibilityActionCompat.getPrivilege();
    } else {
      localAccessibilityAction = null;
    }
    new Handle(localAccessibilityAction, 16908373, null);
    if (i >= 32) {
      localAccessibilityAction = AccessibilityNodeInfoCompat.AccessibilityActionCompat.getId();
    } else {
      localAccessibilityAction = null;
    }
    new Handle(localAccessibilityAction, 16908374, null);
    if (i >= 32) {
      localAccessibilityAction = AccessibilityNodeInfoCompat.AccessibilityActionCompat.getLabel();
    } else {
      localAccessibilityAction = null;
    }
    new Handle(localAccessibilityAction, 16908375, null);
    if (i >= 33) {
      localAccessibilityAction = h.i();
    } else {
      localAccessibilityAction = null;
    }
    new Handle(localAccessibilityAction, 16908376, null);
    if (i >= 34) {
      localAccessibilityAction = Vector.negate();
    } else {
      localAccessibilityAction = null;
    }
    new Handle(localAccessibilityAction, 16908382, null);
  }
  
  public Handle(Object paramObject, int paramInt, Class paramClass)
  {
    d = paramInt;
    if (paramObject == null)
    {
      a = new AccessibilityNodeInfo.AccessibilityAction(paramInt, null);
      return;
    }
    a = paramObject;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == null) {
      return false;
    }
    if (!(paramObject instanceof Handle)) {
      return false;
    }
    paramObject = a;
    Object localObject = a;
    if (localObject == null)
    {
      if (paramObject != null) {
        return false;
      }
    }
    else if (!localObject.equals(paramObject)) {
      return false;
    }
    return true;
  }
  
  public final int hashCode()
  {
    Object localObject = a;
    if (localObject != null) {
      return localObject.hashCode();
    }
    return 0;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("AccessibilityActionCompat: ");
    Object localObject3 = AccessibilityNodeInfoCompat.getActionSymbolicName(d);
    Object localObject1 = localObject3;
    Object localObject2 = localObject1;
    if (((String)localObject3).equals("ACTION_UNKNOWN"))
    {
      localObject3 = a;
      localObject2 = localObject1;
      if (((AccessibilityNodeInfo.AccessibilityAction)localObject3).getLabel() != null) {
        localObject2 = ((AccessibilityNodeInfo.AccessibilityAction)localObject3).getLabel().toString();
      }
    }
    localStringBuilder.append((String)localObject2);
    return localStringBuilder.toString();
  }
}
