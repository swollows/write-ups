package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AbsListView;
import android.widget.Adapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.core.widget.AutoScrollHelper;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import views.NumberPicker;

public class ListViewCompat
  extends ListView
{
  public NumberPicker b;
  public AutoScrollHelper left;
  public final boolean mHijackFocus;
  public boolean mListSelectionHidden;
  public int mMotionPosition;
  public int mSelectionBottomPadding = 0;
  public int mSelectionLeftPadding = 0;
  public int mSelectionRightPadding = 0;
  public int mSelectionTopPadding = 0;
  public DrawableWrapper mSelector;
  public final Rect mSelectorRect = new Rect();
  public boolean s;
  
  public ListViewCompat(Context paramContext, boolean paramBoolean)
  {
    super(paramContext, null, 2130903160);
    mHijackFocus = paramBoolean;
    setCacheColorHint(0);
  }
  
  public final void dispatchDraw(Canvas paramCanvas)
  {
    Rect localRect = mSelectorRect;
    if (!localRect.isEmpty())
    {
      Drawable localDrawable = getSelector();
      if (localDrawable != null)
      {
        localDrawable.setBounds(localRect);
        localDrawable.draw(paramCanvas);
      }
    }
    super.dispatchDraw(paramCanvas);
  }
  
  public final void drawableStateChanged()
  {
    if (b != null) {
      return;
    }
    super.drawableStateChanged();
    Object localObject = mSelector;
    if (localObject != null) {
      mEnabled = true;
    }
    localObject = getSelector();
    if ((localObject != null) && (s) && (isPressed())) {
      ((Drawable)localObject).setState(getDrawableState());
    }
  }
  
  public final boolean hasFocus()
  {
    return (mHijackFocus) || (super.hasFocus());
  }
  
  public final boolean hasWindowFocus()
  {
    return (mHijackFocus) || (super.hasWindowFocus());
  }
  
  public final boolean isFocused()
  {
    return (mHijackFocus) || (super.isFocused());
  }
  
  public final boolean isInTouchMode()
  {
    return ((mHijackFocus) && (mListSelectionHidden)) || (super.isInTouchMode());
  }
  
  public final int measureHeightOfChildrenCompat(int paramInt1, int paramInt2)
  {
    int i = getListPaddingTop();
    int m = getListPaddingBottom();
    int k = getDividerHeight();
    int j = k;
    Object localObject = getDivider();
    ListAdapter localListAdapter = getAdapter();
    if (localListAdapter == null) {
      return i + m;
    }
    i += m;
    if ((k <= 0) || (localObject == null)) {
      j = 0;
    }
    int i2 = localListAdapter.getCount();
    k = 0;
    int n = 0;
    localObject = null;
    while (k < i2)
    {
      int i1 = localListAdapter.getItemViewType(k);
      m = n;
      if (i1 != n)
      {
        localObject = null;
        m = i1;
      }
      View localView = localListAdapter.getView(k, (View)localObject, this);
      localObject = localView;
      ViewGroup.LayoutParams localLayoutParams2 = localView.getLayoutParams();
      ViewGroup.LayoutParams localLayoutParams1 = localLayoutParams2;
      if (localLayoutParams2 == null)
      {
        localLayoutParams2 = generateDefaultLayoutParams();
        localLayoutParams1 = localLayoutParams2;
        localView.setLayoutParams(localLayoutParams2);
      }
      n = height;
      if (n > 0) {
        n = View.MeasureSpec.makeMeasureSpec(n, 1073741824);
      } else {
        n = View.MeasureSpec.makeMeasureSpec(0, 0);
      }
      localView.measure(paramInt1, n);
      localView.forceLayout();
      n = i;
      if (k > 0) {
        n = i + j;
      }
      i = n + localView.getMeasuredHeight();
      if (i >= paramInt2) {
        return paramInt2;
      }
      k += 1;
      n = m;
    }
    return i;
  }
  
  public final void onDetachedFromWindow()
  {
    b = null;
    super.onDetachedFromWindow();
  }
  
  public final boolean onForwardedEvent(MotionEvent paramMotionEvent, int paramInt)
  {
    int j = paramMotionEvent.getActionMasked();
    int i = 0;
    boolean bool1;
    if (j != 1) {
      if (j != 2) {
        if (j != 3)
        {
          bool1 = true;
          paramInt = i;
          break label644;
        }
      }
    }
    label54:
    do
    {
      bool1 = false;
      paramInt = i;
      break;
      bool1 = true;
      break label54;
      bool1 = false;
      k = paramMotionEvent.findPointerIndex(paramInt);
    } while (k < 0);
    paramInt = (int)paramMotionEvent.getX(k);
    int k = (int)paramMotionEvent.getY(k);
    i = pointToPosition(paramInt, k);
    Object localObject1;
    if (i == -1)
    {
      paramInt = 1;
    }
    else
    {
      localObject1 = getChildAt(i - getFirstVisiblePosition());
      float f1 = paramInt;
      float f2 = k;
      s = true;
      k = Build.VERSION.SDK_INT;
      ListPopupWindow.DropDownListView.setPressedItem(this, f1, f2);
      if (!isPressed()) {
        setPressed(true);
      }
      layoutChildren();
      paramInt = mMotionPosition;
      if (paramInt != -1)
      {
        localObject2 = getChildAt(paramInt - getFirstVisiblePosition());
        if ((localObject2 != null) && (localObject2 != localObject1) && (((View)localObject2).isPressed())) {
          ((View)localObject2).setPressed(false);
        }
      }
      mMotionPosition = i;
      ListPopupWindow.DropDownListView.setPressedItem((View)localObject1, f1 - ((View)localObject1).getLeft(), f2 - ((View)localObject1).getTop());
      if (!((View)localObject1).isPressed()) {
        ((View)localObject1).setPressed(true);
      }
      Object localObject2 = getSelector();
      if ((localObject2 != null) && (i != -1)) {
        paramInt = 1;
      } else {
        paramInt = 0;
      }
      if (paramInt != 0) {
        ((Drawable)localObject2).setVisible(false, false);
      }
      int m = ((View)localObject1).getLeft();
      int n = ((View)localObject1).getTop();
      int i1 = ((View)localObject1).getRight();
      int i2 = ((View)localObject1).getBottom();
      Rect localRect = mSelectorRect;
      localRect.set(m, n, i1, i2);
      left -= mSelectionLeftPadding;
      top -= mSelectionTopPadding;
      right += mSelectionRightPadding;
      bottom += mSelectionBottomPadding;
      if (k >= 33)
      {
        bool1 = AdapterView.setSelection(this);
      }
      else
      {
        Field localField1 = Message.settings;
        if (localField1 != null) {
          try
          {
            bool1 = localField1.getBoolean(this);
          }
          catch (IllegalAccessException localIllegalAccessException1)
          {
            localIllegalAccessException1.printStackTrace();
          }
        } else {
          bool1 = false;
        }
      }
      if (((View)localObject1).isEnabled() != bool1)
      {
        bool1 ^= true;
        if (Build.VERSION.SDK_INT >= 33) {
          AdapterView.setSelection(this, bool1);
        }
        for (;;)
        {
          break;
          Field localField2 = Message.settings;
          if (localField2 != null) {
            try
            {
              localField2.set(this, Boolean.valueOf(bool1));
            }
            catch (IllegalAccessException localIllegalAccessException2)
            {
              localIllegalAccessException2.printStackTrace();
            }
          }
        }
        if (i != -1) {
          refreshDrawableState();
        }
      }
      if (paramInt != 0)
      {
        float f3 = localRect.exactCenterX();
        float f4 = localRect.exactCenterY();
        if (getVisibility() == 0) {}
        for (bool1 = true;; bool1 = false) {
          break;
        }
        ((Drawable)localObject2).setVisible(bool1, false);
        ((Drawable)localObject2).setHotspot(f3, f4);
      }
      localObject2 = getSelector();
      if ((localObject2 != null) && (i != -1)) {
        ((Drawable)localObject2).setHotspot(f1, f2);
      }
      localObject2 = mSelector;
      if (localObject2 != null) {
        mEnabled = false;
      }
      refreshDrawableState();
      if (j == 1) {
        performItemClick((View)localObject1, i, getItemIdAtPosition(i));
      }
      bool1 = true;
      paramInt = 0;
    }
    label644:
    if ((!bool1) || (paramInt != 0))
    {
      s = false;
      setPressed(false);
      drawableStateChanged();
      localObject1 = getChildAt(mMotionPosition - getFirstVisiblePosition());
      if (localObject1 != null) {
        ((View)localObject1).setPressed(false);
      }
    }
    if (bool1)
    {
      if (left == null) {
        left = new AutoScrollHelper(this);
      }
      localObject1 = left;
      boolean bool2 = top;
      top = true;
      ((AutoScrollHelper)localObject1).onTouch(this, paramMotionEvent);
      return bool1;
    }
    paramMotionEvent = left;
    if (paramMotionEvent != null)
    {
      if (top) {
        paramMotionEvent.requestStop();
      }
      top = false;
    }
    return bool1;
  }
  
  public boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i = Build.VERSION.SDK_INT;
    if (i < 26) {
      return super.onHoverEvent(paramMotionEvent);
    }
    int j = paramMotionEvent.getActionMasked();
    Object localObject;
    if ((j == 10) && (b == null))
    {
      localObject = new NumberPicker(2, this);
      b = ((NumberPicker)localObject);
      post((Runnable)localObject);
    }
    boolean bool = super.onHoverEvent(paramMotionEvent);
    if ((j != 9) && (j != 7))
    {
      setSelection(-1);
      return bool;
    }
    j = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
    if ((j != -1) && (j != getSelectedItemPosition()))
    {
      paramMotionEvent = getChildAt(j - getFirstVisiblePosition());
      if (paramMotionEvent.isEnabled())
      {
        requestFocus();
        if ((i >= 30) && (Scroller.g))
        {
          localObject = Scroller.a;
          Boolean localBoolean = Boolean.FALSE;
          try
          {
            ((Method)localObject).invoke(this, new Object[] { Integer.valueOf(j), paramMotionEvent, localBoolean, Integer.valueOf(-1), Integer.valueOf(-1) });
            paramMotionEvent = Scroller.c;
            paramMotionEvent.invoke(this, new Object[] { Integer.valueOf(j) });
            paramMotionEvent = Scroller.b;
            paramMotionEvent.invoke(this, new Object[] { Integer.valueOf(j) });
          }
          catch (InvocationTargetException paramMotionEvent) {}catch (IllegalAccessException paramMotionEvent)
          {
            break label262;
          }
          paramMotionEvent.printStackTrace();
          break label283;
          label262:
          paramMotionEvent.printStackTrace();
        }
        else
        {
          setSelectionFromTop(j, paramMotionEvent.getTop() - getTop());
        }
      }
      label283:
      paramMotionEvent = getSelector();
      if ((paramMotionEvent != null) && (s) && (isPressed())) {
        paramMotionEvent.setState(getDrawableState());
      }
    }
    return bool;
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    if (paramMotionEvent.getAction() == 0) {
      mMotionPosition = pointToPosition((int)paramMotionEvent.getX(), (int)paramMotionEvent.getY());
    }
    NumberPicker localNumberPicker = b;
    if (localNumberPicker != null)
    {
      ListViewCompat localListViewCompat = (ListViewCompat)s;
      b = null;
      localListViewCompat.removeCallbacks(localNumberPicker);
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public void setListSelectionHidden(boolean paramBoolean)
  {
    mListSelectionHidden = paramBoolean;
  }
  
  public void setSelector(Drawable paramDrawable)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
}
