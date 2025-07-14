package androidx.appcompat.widget;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.Resources;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnHoverListener;
import android.view.View.OnLongClickListener;
import android.view.ViewConfiguration;
import android.view.ViewManager;
import android.view.Window;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityManager;
import android.widget.TextView;
import app.Common;
import app.Preference;
import app.ViewCompat;

public final class Item
  implements View.OnLongClickListener, View.OnHoverListener, View.OnAttachStateChangeListener
{
  public static Item g;
  public static Item h;
  public final View a;
  public final a b = new a(this, 1);
  public final a c = new a(this, 0);
  public final CharSequence d;
  public boolean i;
  public final int j;
  public int k;
  public boolean l;
  public AnnotationWriter m;
  public int n;
  
  public Item(View paramView, CharSequence paramCharSequence)
  {
    a = paramView;
    d = paramCharSequence;
    paramCharSequence = ViewConfiguration.get(paramView.getContext());
    int i1 = Common.prefs;
    if (Build.VERSION.SDK_INT >= 28) {
      i1 = Preference.getScaledPagingTouchSlop(paramCharSequence);
    } else {
      i1 = paramCharSequence.getScaledTouchSlop() / 2;
    }
    j = i1;
    l = true;
    paramView.setOnLongClickListener(this);
    paramView.setOnHoverListener(this);
  }
  
  public static void a(Item paramItem)
  {
    Object localObject = h;
    if (localObject != null)
    {
      a localA = c;
      a.removeCallbacks(localA);
    }
    h = paramItem;
    if (paramItem != null)
    {
      localObject = c;
      long l1 = ViewConfiguration.getLongPressTimeout();
      a.postDelayed((Runnable)localObject, l1);
    }
  }
  
  public final void a()
  {
    Object localObject = g;
    View localView1 = a;
    if (localObject == this)
    {
      g = null;
      localObject = m;
      if (localObject != null)
      {
        View localView2 = a;
        if (localView2.getParent() != null) {
          ((WindowManager)c.getSystemService("window")).removeView(localView2);
        }
        m = null;
        l = true;
        localView1.removeOnAttachStateChangeListener(this);
      }
      else
      {
        Log.e("TooltipCompatHandler", "sActiveHandler.mPopup == null");
      }
    }
    if (h == this) {
      a(null);
    }
    localView1.removeCallbacks(b);
  }
  
  public final void a(boolean paramBoolean)
  {
    View localView1 = a;
    if (!localView1.isAttachedToWindow()) {
      return;
    }
    a(null);
    Object localObject1 = g;
    if (localObject1 != null) {
      ((Item)localObject1).a();
    }
    g = this;
    i = paramBoolean;
    Object localObject4 = new AnnotationWriter(localView1.getContext());
    m = ((AnnotationWriter)localObject4);
    int i1 = n;
    int i3 = k;
    paramBoolean = i;
    View localView2 = a;
    localObject1 = localView2.getParent();
    Context localContext = c;
    if ((localObject1 != null) && (localView2.getParent() != null)) {
      ((WindowManager)localContext.getSystemService("window")).removeView(localView2);
    }
    e.setText(d);
    WindowManager.LayoutParams localLayoutParams = g;
    token = localView1.getApplicationWindowToken();
    int i2 = localContext.getResources().getDimensionPixelOffset(2131099764);
    if (localView1.getWidth() < i2) {
      i1 = localView1.getWidth() / 2;
    }
    int i4;
    if (localView1.getHeight() >= i2)
    {
      i4 = localContext.getResources().getDimensionPixelOffset(2131099763);
      i2 = i3 + i4;
      i3 -= i4;
    }
    else
    {
      i2 = localView1.getHeight();
      i3 = 0;
    }
    gravity = 49;
    localObject1 = localContext.getResources();
    if (paramBoolean) {
      i4 = 2131099767;
    } else {
      i4 = 2131099766;
    }
    int i5 = ((Resources)localObject1).getDimensionPixelOffset(i4);
    localObject1 = localView1.getRootView();
    Object localObject2 = localObject1;
    localObject1 = ((View)localObject1).getLayoutParams();
    Object localObject3;
    if (((localObject1 instanceof WindowManager.LayoutParams)) && (type == 2)) {
      localObject1 = localObject2;
    } else {
      for (localObject3 = localView1.getContext();; localObject3 = ((ContextWrapper)localObject3).getBaseContext())
      {
        localObject1 = localObject2;
        if (!(localObject3 instanceof ContextWrapper)) {
          break;
        }
        if ((localObject3 instanceof Activity))
        {
          localObject1 = ((Activity)localObject3).getWindow().getDecorView();
          break;
        }
      }
    }
    if (localObject1 == null)
    {
      Log.e("TooltipPopup", "Cannot find app view");
    }
    else
    {
      localObject2 = b;
      ((View)localObject1).getWindowVisibleDisplayFrame((Rect)localObject2);
      if ((left < 0) && (top < 0))
      {
        localObject3 = localContext.getResources();
        i4 = ((Resources)localObject3).getIdentifier("status_bar_height", "dimen", "android");
        if (i4 != 0) {
          i4 = ((Resources)localObject3).getDimensionPixelSize(i4);
        } else {
          i4 = 0;
        }
        localObject3 = ((Resources)localObject3).getDisplayMetrics();
        ((Rect)localObject2).set(0, i4, widthPixels, heightPixels);
      }
      localObject3 = f;
      ((View)localObject1).getLocationOnScreen((int[])localObject3);
      localObject4 = h;
      localView1.getLocationOnScreen((int[])localObject4);
      i4 = localObject4[0] - localObject3[0];
      localObject4[0] = i4;
      localObject4[1] -= localObject3[1];
      x = (i4 + i1 - ((View)localObject1).getWidth() / 2);
      i1 = View.MeasureSpec.makeMeasureSpec(0, 0);
      localView2.measure(i1, i1);
      i1 = localView2.getMeasuredHeight();
      i4 = localObject4[1];
      i3 = i3 + i4 - i5 - i1;
      i2 = i4 + i2 + i5;
      if (paramBoolean)
      {
        if (i3 >= 0) {
          y = i3;
        } else {
          y = i2;
        }
      }
      else if (i1 + i2 <= ((Rect)localObject2).height()) {
        y = i2;
      } else {
        y = i3;
      }
    }
    ((WindowManager)localContext.getSystemService("window")).addView(localView2, localLayoutParams);
    localView1.addOnAttachStateChangeListener(this);
    long l1;
    if (i)
    {
      l1 = 2500L;
    }
    else
    {
      localObject1 = ViewCompat.this$0;
      if ((localView1.getWindowSystemUiVisibility() & 0x1) == 1) {
        l1 = ViewConfiguration.getLongPressTimeout();
      }
      for (long l2 = 3000L;; l2 = 15000L)
      {
        l1 = l2 - l1;
        break;
        l1 = ViewConfiguration.getLongPressTimeout();
      }
    }
    localObject1 = b;
    localView1.removeCallbacks((Runnable)localObject1);
    localView1.postDelayed((Runnable)localObject1, l1);
  }
  
  public final boolean onHover(View paramView, MotionEvent paramMotionEvent)
  {
    if ((m != null) && (i)) {
      return false;
    }
    paramView = a;
    AccessibilityManager localAccessibilityManager = (AccessibilityManager)paramView.getContext().getSystemService("accessibility");
    if ((localAccessibilityManager.isEnabled()) && (localAccessibilityManager.isTouchExplorationEnabled())) {
      return false;
    }
    int i1 = paramMotionEvent.getAction();
    if (i1 != 7)
    {
      if (i1 != 10) {
        return false;
      }
      l = true;
      a();
      return false;
    }
    if ((paramView.isEnabled()) && (m == null))
    {
      i1 = (int)paramMotionEvent.getX();
      int i2 = (int)paramMotionEvent.getY();
      if (!l)
      {
        int i3 = Math.abs(i1 - n);
        int i4 = j;
        if ((i3 <= i4) && (Math.abs(i2 - k) <= i4)) {}
      }
      else
      {
        n = i1;
        k = i2;
        l = false;
        a(this);
      }
    }
    return false;
  }
  
  public final boolean onLongClick(View paramView)
  {
    n = (paramView.getWidth() / 2);
    k = (paramView.getHeight() / 2);
    a(true);
    return true;
  }
  
  public final void onViewAttachedToWindow(View paramView) {}
  
  public final void onViewDetachedFromWindow(View paramView)
  {
    a();
  }
}
