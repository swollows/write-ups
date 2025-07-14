package androidx.fragment.asm;

import Abstract.R.id;
import android.animation.LayoutTransition;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowInsets;
import android.widget.FrameLayout;
import app.Elements;
import app.TypeToken;
import app.ViewCompat;
import java.util.ArrayList;
import java.util.Iterator;
import params.Log;

public final class CellLayout
  extends FrameLayout
{
  public final ArrayList a = new ArrayList();
  public View.OnApplyWindowInsetsListener mRows;
  public final ArrayList q = new ArrayList();
  public boolean visible = true;
  
  public CellLayout(Context paramContext, AttributeSet paramAttributeSet, h paramH)
  {
    super(paramContext, paramAttributeSet);
    String str2 = paramAttributeSet.getClassAttribute();
    String str1 = str2;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, R.id.b, 0, 0);
    paramAttributeSet = str1;
    if (str2 == null) {
      paramAttributeSet = localTypedArray.getString(0);
    }
    str1 = localTypedArray.getString(1);
    localTypedArray.recycle();
    int i = getId();
    paramH.b();
    if (paramAttributeSet != null)
    {
      if (i == -1)
      {
        if (str1 != null) {
          paramContext = " with tag ".concat(str1);
        } else {
          paramContext = "";
        }
        paramH = new StringBuilder("FragmentContainerView must have an android:id to add Fragment ");
        paramH.append(paramAttributeSet);
        paramH.append(paramContext);
        throw new IllegalStateException(paramH.toString());
      }
      paramContext.getClassLoader();
      e.add(paramAttributeSet);
      Log.append(null, "fm.fragmentFactory.insta?ontext.classLoader, name)");
      throw new NullPointerException("Null throw statement replaced by Soot");
    }
    paramContext = a.b().iterator();
    if (!paramContext.hasNext()) {
      return;
    }
    paramContext.next().getClass();
    throw new ClassCastException();
  }
  
  public final void addView(android.view.View paramView, int paramInt, ViewGroup.LayoutParams paramLayoutParams)
  {
    Log.get(paramView, "child");
    paramView.getTag(2131230811);
    paramLayoutParams = new StringBuilder("Views added to a FragmentContainerView must be associated with a Fragment. View ");
    paramLayoutParams.append(paramView);
    paramLayoutParams.append(" is not associated with a Fragment.");
    throw new IllegalStateException(paramLayoutParams.toString().toString());
  }
  
  public final WindowInsets dispatchApplyWindowInsets(WindowInsets paramWindowInsets)
  {
    Log.get(paramWindowInsets, "insets");
    Object localObject1 = TypeToken.get(paramWindowInsets, null);
    Object localObject2 = localObject1;
    Object localObject3 = mRows;
    if (localObject3 != null)
    {
      localObject1 = ((View.OnApplyWindowInsetsListener)localObject3).onApplyWindowInsets(this, paramWindowInsets);
      Log.append(localObject1, "onApplyWindowInsetsListe?lyWindowInsets(v, insets)");
      localObject1 = TypeToken.get((WindowInsets)localObject1, null);
    }
    else
    {
      localObject3 = ViewCompat.this$0;
      localObject3 = ((TypeToken)localObject1).unwrap();
      localObject1 = localObject2;
      if (localObject3 != null)
      {
        WindowInsets localWindowInsets = app.View.onApplyWindowInsets(this, (WindowInsets)localObject3);
        localObject1 = localObject2;
        if (!localWindowInsets.equals(localObject3)) {
          localObject1 = TypeToken.get(localWindowInsets, this);
        }
      }
    }
    if (!a.isEmpty())
    {
      int j = getChildCount();
      int i = 0;
      while (i < j)
      {
        ViewCompat.apply(getChildAt(i), (TypeToken)localObject1);
        i += 1;
      }
    }
    return paramWindowInsets;
  }
  
  public final void dispatchDraw(Canvas paramCanvas)
  {
    Log.get(paramCanvas, "canvas");
    if (visible)
    {
      Iterator localIterator = a.iterator();
      while (localIterator.hasNext()) {
        super.drawChild(paramCanvas, (android.view.View)localIterator.next(), getDrawingTime());
      }
    }
    super.dispatchDraw(paramCanvas);
  }
  
  public final boolean drawChild(Canvas paramCanvas, android.view.View paramView, long paramLong)
  {
    Log.get(paramCanvas, "canvas");
    Log.get(paramView, "child");
    if (visible)
    {
      ArrayList localArrayList = a;
      if ((!localArrayList.isEmpty()) && (localArrayList.contains(paramView))) {
        return false;
      }
    }
    return super.drawChild(paramCanvas, paramView, paramLong);
  }
  
  public final void endViewTransition(android.view.View paramView)
  {
    Log.get(paramView, "view");
    q.remove(paramView);
    if (a.remove(paramView)) {
      visible = true;
    }
    super.endViewTransition(paramView);
  }
  
  public final Fragment getFragment()
  {
    Object localObject = this;
    while (localObject != null)
    {
      ((android.view.View)localObject).getTag(2131230811);
      localObject = ((android.view.View)localObject).getParent();
      if ((localObject instanceof android.view.View)) {
        localObject = (android.view.View)localObject;
      } else {
        localObject = null;
      }
    }
    for (localObject = getContext(); (localObject instanceof ContextWrapper); localObject = ((ContextWrapper)localObject).getBaseContext()) {
      if ((localObject instanceof FragmentActivity))
      {
        localObject = (FragmentActivity)localObject;
        break label78;
      }
    }
    localObject = null;
    label78:
    if (localObject != null)
    {
      localObject = ((FragmentActivity)localObject).getSupportFragmentManager();
      getId();
      ((h)localObject).b();
      return null;
    }
    localObject = new StringBuilder("View ");
    ((StringBuilder)localObject).append(this);
    ((StringBuilder)localObject).append(" is not within a subclass of FragmentActivity.");
    throw new IllegalStateException(((StringBuilder)localObject).toString());
  }
  
  public final WindowInsets onApplyWindowInsets(WindowInsets paramWindowInsets)
  {
    Log.get(paramWindowInsets, "insets");
    return paramWindowInsets;
  }
  
  public final void remove(android.view.View paramView)
  {
    if (q.contains(paramView)) {
      a.add(paramView);
    }
  }
  
  public final void removeAllViewsInLayout()
  {
    int i = getChildCount() - 1;
    while (-1 < i)
    {
      android.view.View localView = getChildAt(i);
      Log.append(localView, "view");
      remove(localView);
      i -= 1;
    }
    super.removeAllViewsInLayout();
  }
  
  public final void removeView(android.view.View paramView)
  {
    Log.get(paramView, "view");
    remove(paramView);
    super.removeView(paramView);
  }
  
  public final void removeViewAt(int paramInt)
  {
    android.view.View localView = getChildAt(paramInt);
    Log.append(localView, "view");
    remove(localView);
    super.removeViewAt(paramInt);
  }
  
  public final void removeViewInLayout(android.view.View paramView)
  {
    Log.get(paramView, "view");
    remove(paramView);
    super.removeViewInLayout(paramView);
  }
  
  public final void removeViews(int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    while (i < paramInt1 + paramInt2)
    {
      android.view.View localView = getChildAt(i);
      Log.append(localView, "view");
      remove(localView);
      i += 1;
    }
    super.removeViews(paramInt1, paramInt2);
  }
  
  public final void removeViewsInLayout(int paramInt1, int paramInt2)
  {
    int i = paramInt1;
    while (i < paramInt1 + paramInt2)
    {
      android.view.View localView = getChildAt(i);
      Log.append(localView, "view");
      remove(localView);
      i += 1;
    }
    super.removeViewsInLayout(paramInt1, paramInt2);
  }
  
  public final void setDrawDisappearingViewsLast(boolean paramBoolean)
  {
    visible = paramBoolean;
  }
  
  public void setLayoutTransition(LayoutTransition paramLayoutTransition)
  {
    throw new UnsupportedOperationException("FragmentContainerView does not support Layout Transitions or animateLayoutChanges=\"true\".");
  }
  
  public void setOnApplyWindowInsetsListener(View.OnApplyWindowInsetsListener paramOnApplyWindowInsetsListener)
  {
    Log.get(paramOnApplyWindowInsetsListener, "listener");
    mRows = paramOnApplyWindowInsetsListener;
  }
  
  public final void startViewTransition(android.view.View paramView)
  {
    Log.get(paramView, "view");
    if (paramView.getParent() == this) {
      q.add(paramView);
    }
    super.startViewTransition(paramView);
  }
}
