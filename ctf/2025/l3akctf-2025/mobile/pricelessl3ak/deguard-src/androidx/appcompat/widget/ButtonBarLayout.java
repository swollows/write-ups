package androidx.appcompat.widget;

import Console.R.styleable;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import app.ViewCompat;

public class ButtonBarLayout
  extends LinearLayout
{
  public boolean mAllowStacking;
  public int mLastWidthSize = -1;
  public boolean shouldExpand;
  
  public ButtonBarLayout(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    int[] arrayOfInt = R.styleable.BottomSheetBehavior_Params;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(paramAttributeSet, arrayOfInt);
    ViewCompat.init(this, paramContext, arrayOfInt, paramAttributeSet, localTypedArray, 0);
    shouldExpand = localTypedArray.getBoolean(0, true);
    localTypedArray.recycle();
    if (getOrientation() == 1) {
      setStacked(shouldExpand);
    }
  }
  
  private void setStacked(boolean paramBoolean)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    int i = View.MeasureSpec.getSize(paramInt1);
    boolean bool = shouldExpand;
    int k = 0;
    if (bool)
    {
      if ((i > mLastWidthSize) && (mAllowStacking)) {
        setStacked(false);
      }
      mLastWidthSize = i;
    }
    if ((!mAllowStacking) && (View.MeasureSpec.getMode(paramInt1) == 1073741824))
    {
      j = View.MeasureSpec.makeMeasureSpec(i, Integer.MIN_VALUE);
      i = 1;
    }
    else
    {
      j = paramInt1;
      i = 0;
    }
    super.onMeasure(j, paramInt2);
    int j = i;
    if (shouldExpand)
    {
      j = i;
      if (!mAllowStacking)
      {
        j = i;
        if ((getMeasuredWidthAndState() & 0xFF000000) == 16777216)
        {
          setStacked(true);
          j = 1;
        }
      }
    }
    if (j != 0) {
      super.onMeasure(paramInt1, paramInt2);
    }
    j = getChildCount();
    i = 0;
    int m;
    for (;;)
    {
      m = -1;
      if (i >= j) {
        break;
      }
      if (getChildAt(i).getVisibility() == 0)
      {
        j = i;
        break label183;
      }
      i += 1;
    }
    j = -1;
    label183:
    i = k;
    if (j >= 0)
    {
      localObject = getChildAt(j);
      LinearLayout.LayoutParams localLayoutParams = (LinearLayout.LayoutParams)((View)localObject).getLayoutParams();
      i = getPaddingTop();
      k = ((View)localObject).getMeasuredHeight() + i + topMargin + bottomMargin;
      if (mAllowStacking)
      {
        i = j + 1;
        int n = getChildCount();
        for (;;)
        {
          j = m;
          if (i >= n) {
            break;
          }
          if (getChildAt(i).getVisibility() == 0)
          {
            j = i;
            break;
          }
          i += 1;
        }
        if (j >= 0) {
          i = getChildAt(j).getPaddingTop() + (int)(getResourcesgetDisplayMetricsdensity * 16.0F) + k;
        } else {
          i = k;
        }
      }
      else
      {
        i = getPaddingBottom() + k;
      }
    }
    Object localObject = ViewCompat.this$0;
    if (getMinimumHeight() != i)
    {
      setMinimumHeight(i);
      if (paramInt2 == 0) {
        super.onMeasure(paramInt1, paramInt2);
      }
    }
  }
  
  public void setAllowStacking(boolean paramBoolean)
  {
    if (shouldExpand != paramBoolean)
    {
      shouldExpand = paramBoolean;
      if ((!paramBoolean) && (mAllowStacking)) {
        setStacked(false);
      }
      requestLayout();
    }
  }
}
