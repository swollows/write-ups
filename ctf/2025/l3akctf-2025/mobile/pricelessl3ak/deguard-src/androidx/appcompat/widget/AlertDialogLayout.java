package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout.LayoutParams;
import app.ViewCompat;
import java.util.WeakHashMap;

public class AlertDialogLayout
  extends LinearLayoutCompat
{
  public AlertDialogLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
  }
  
  public static int getMinimumHeight(View paramView)
  {
    WeakHashMap localWeakHashMap = ViewCompat.this$0;
    int i = paramView.getMinimumHeight();
    if (i > 0) {
      return i;
    }
    if ((paramView instanceof ViewGroup))
    {
      paramView = (ViewGroup)paramView;
      if (paramView.getChildCount() == 1) {
        return getMinimumHeight(paramView.getChildAt(0));
      }
    }
    return 0;
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int j = getPaddingLeft();
    int k = paramInt3 - paramInt1;
    int m = getPaddingRight();
    int n = getPaddingRight();
    paramInt1 = getMeasuredHeight();
    int i1 = getChildCount();
    int i2 = getGravity();
    paramInt3 = i2 & 0x70;
    if (paramInt3 != 16)
    {
      if (paramInt3 != 80) {
        paramInt1 = getPaddingTop();
      } else {
        paramInt1 = getPaddingTop() + paramInt4 - paramInt2 - paramInt1;
      }
    }
    else
    {
      paramInt3 = getPaddingTop();
      paramInt1 = (paramInt4 - paramInt2 - paramInt1) / 2 + paramInt3;
    }
    Object localObject = getDividerDrawable();
    paramInt3 = 0;
    if (localObject == null) {
      paramInt2 = 0;
    } else {
      paramInt2 = ((Drawable)localObject).getIntrinsicHeight();
    }
    while (paramInt3 < i1)
    {
      localObject = getChildAt(paramInt3);
      paramInt4 = paramInt1;
      if (localObject != null)
      {
        paramInt4 = paramInt1;
        if (((View)localObject).getVisibility() != 8)
        {
          int i3 = ((View)localObject).getMeasuredWidth();
          int i4 = ((View)localObject).getMeasuredHeight();
          IcsLinearLayout.LayoutParams localLayoutParams = (IcsLinearLayout.LayoutParams)((View)localObject).getLayoutParams();
          int i = gravity;
          paramInt4 = i;
          if (i < 0) {
            paramInt4 = i2 & 0x800007;
          }
          paramInt4 = Gravity.getAbsoluteGravity(paramInt4, getLayoutDirection()) & 0x7;
          if (paramInt4 != 1)
          {
            if (paramInt4 != 5) {
              paramInt4 = leftMargin + j;
            } else {
              paramInt4 = k - m - i3;
            }
          }
          else {
            for (i = rightMargin;; i = rightMargin)
            {
              paramInt4 -= i;
              break;
              paramInt4 = (k - j - n - i3) / 2 + j + leftMargin;
            }
          }
          i = paramInt1;
          if (hasDividerBeforeChildAt(paramInt3)) {
            i = paramInt1 + paramInt2;
          }
          paramInt1 = i + topMargin;
          ((View)localObject).layout(paramInt4, paramInt1, i3 + paramInt4, paramInt1 + i4);
          paramInt4 = i4 + bottomMargin + paramInt1;
        }
      }
      paramInt3 += 1;
      paramInt1 = paramInt4;
    }
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    int i5 = getChildCount();
    Object localObject3 = null;
    Object localObject2 = null;
    Object localObject1 = null;
    int i = 0;
    View localView;
    while (i < i5)
    {
      localView = getChildAt(i);
      if (localView.getVisibility() != 8)
      {
        j = localView.getId();
        if (j == 2131230901)
        {
          localObject3 = localView;
        }
        else if (j == 2131230786)
        {
          localObject2 = localView;
        }
        else
        {
          if (((j != 2131230796) && (j != 2131230798)) || (localObject1 != null))
          {
            super.onMeasure(paramInt1, paramInt2);
            return;
          }
          localObject1 = localView;
        }
      }
      i += 1;
    }
    int i7 = View.MeasureSpec.getMode(paramInt2);
    int n = View.MeasureSpec.getSize(paramInt2);
    int i6 = View.MeasureSpec.getMode(paramInt1);
    i = getPaddingTop();
    int k = getPaddingBottom() + i;
    if (localObject3 != null)
    {
      localObject3.measure(paramInt1, 0);
      k += localObject3.getMeasuredHeight();
      j = View.combineMeasuredStates(0, localObject3.getMeasuredState());
    }
    else
    {
      j = 0;
    }
    int i1;
    if (localObject2 != null)
    {
      localObject2.measure(paramInt1, 0);
      m = getMinimumHeight(localObject2);
      i = m;
      i1 = localObject2.getMeasuredHeight() - m;
      k += m;
      j = View.combineMeasuredStates(j, localObject2.getMeasuredState());
    }
    else
    {
      i = 0;
      i1 = 0;
    }
    int i2;
    if (localObject1 != null)
    {
      if (i7 == 0) {
        m = 0;
      } else {
        m = View.MeasureSpec.makeMeasureSpec(Math.max(0, n - k), i7);
      }
      ((View)localObject1).measure(paramInt1, m);
      m = ((View)localObject1).getMeasuredHeight();
      i2 = m;
      k += m;
      j = View.combineMeasuredStates(j, ((View)localObject1).getMeasuredState());
    }
    else
    {
      i2 = 0;
    }
    int i3 = n - k;
    n = k;
    int i4 = i3;
    int m = j;
    if (localObject2 != null)
    {
      i1 = Math.min(i3, i1);
      n = i3;
      m = i;
      if (i1 > 0)
      {
        n = i3 - i1;
        m = i + i1;
      }
      localObject2.measure(paramInt1, View.MeasureSpec.makeMeasureSpec(m, 1073741824));
      i = k - i + localObject2.getMeasuredHeight();
      m = View.combineMeasuredStates(j, localObject2.getMeasuredState());
      i4 = n;
      n = i;
    }
    int j = n;
    i = m;
    if (localObject1 != null)
    {
      j = n;
      i = m;
      if (i4 > 0)
      {
        ((View)localObject1).measure(paramInt1, View.MeasureSpec.makeMeasureSpec(i2 + i4, i7));
        j = n - i2 + ((View)localObject1).getMeasuredHeight();
        i = View.combineMeasuredStates(m, ((View)localObject1).getMeasuredState());
      }
    }
    m = 0;
    for (k = 0; m < i5; k = n)
    {
      localView = getChildAt(m);
      n = k;
      if (localView.getVisibility() != 8) {
        n = Math.max(k, localView.getMeasuredWidth());
      }
      m += 1;
    }
    m = getPaddingLeft();
    setMeasuredDimension(View.resolveSizeAndState(getPaddingRight() + m + k, paramInt1, i), View.resolveSizeAndState(j, paramInt2, 0));
    if (i6 != 1073741824)
    {
      i = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
      paramInt1 = 0;
      while (paramInt1 < i5)
      {
        localView = getChildAt(paramInt1);
        if (localView.getVisibility() != 8)
        {
          localObject1 = (IcsLinearLayout.LayoutParams)localView.getLayoutParams();
          if (width == -1)
          {
            j = height;
            height = localView.getMeasuredHeight();
            measureChildWithMargins(localView, i, 0, paramInt2, 0);
            height = j;
          }
        }
        paramInt1 += 1;
      }
    }
  }
}
