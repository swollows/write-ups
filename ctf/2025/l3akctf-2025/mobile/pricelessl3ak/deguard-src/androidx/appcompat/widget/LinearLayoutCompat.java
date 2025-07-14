package androidx.appcompat.widget;

import Console.R.styleable;
import a.ClassWriter;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.Gravity;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import android.widget.LinearLayout.LayoutParams;
import app.ViewCompat;

public abstract class LinearLayoutCompat
  extends ViewGroup
{
  public boolean mBaselineAligned = true;
  public int mBaselineAlignedChildIndex = -1;
  public int mBaselineChildTop = 0;
  public Drawable mDivider;
  public int mDividerHeight;
  public int mDividerPadding;
  public int mDividerWidth;
  public int mGravity = 8388659;
  public int[] mMaxAscent;
  public int[] mMaxDescent;
  public int mOrientation;
  public int mShowDividers;
  public int mTotalLength;
  public boolean mUseLargestChild;
  public float mWeightSum;
  
  public LinearLayoutCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 0);
    int[] arrayOfInt = R.styleable.DrawerArrowToggle;
    ClassWriter localClassWriter = ClassWriter.obtainStyledAttributes(paramContext, paramAttributeSet, arrayOfInt, 0);
    ViewCompat.init(this, paramContext, arrayOfInt, paramAttributeSet, (TypedArray)b, 0);
    paramContext = (TypedArray)b;
    int i = paramContext.getInt(1, -1);
    if (i >= 0) {
      setOrientation(i);
    }
    i = paramContext.getInt(0, -1);
    if (i >= 0) {
      setGravity(i);
    }
    boolean bool = paramContext.getBoolean(2, true);
    if (!bool) {
      setBaselineAligned(bool);
    }
    mWeightSum = paramContext.getFloat(4, -1.0F);
    mBaselineAlignedChildIndex = paramContext.getInt(3, -1);
    mUseLargestChild = paramContext.getBoolean(7, false);
    setDividerDrawable(localClassWriter.getDrawable(5));
    mShowDividers = paramContext.getInt(8, 0);
    mDividerPadding = paramContext.getDimensionPixelSize(6, 0);
    localClassWriter.recycle();
  }
  
  public boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof IcsLinearLayout.LayoutParams;
  }
  
  public final void drawHorizontalDivider(Canvas paramCanvas, int paramInt)
  {
    mDivider.setBounds(getPaddingLeft() + mDividerPadding, paramInt, getWidth() - getPaddingRight() - mDividerPadding, mDividerHeight + paramInt);
    mDivider.draw(paramCanvas);
  }
  
  public final void drawVerticalDivider(Canvas paramCanvas, int paramInt)
  {
    mDivider.setBounds(paramInt, getPaddingTop() + mDividerPadding, mDividerWidth + paramInt, getHeight() - getPaddingBottom() - mDividerPadding);
    mDivider.draw(paramCanvas);
  }
  
  public int getBaseline()
  {
    if (mBaselineAlignedChildIndex < 0) {
      return super.getBaseline();
    }
    int i = getChildCount();
    int j = mBaselineAlignedChildIndex;
    if (i > j)
    {
      View localView = getChildAt(j);
      int k = localView.getBaseline();
      if (k == -1)
      {
        if (mBaselineAlignedChildIndex == 0) {
          return -1;
        }
        throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
      }
      j = mBaselineChildTop;
      i = j;
      if (mOrientation == 1)
      {
        int m = mGravity & 0x70;
        i = j;
        if (m != 48) {
          if (m != 16)
          {
            if (m != 80) {
              i = j;
            } else {
              i = getBottom() - getTop() - getPaddingBottom() - mTotalLength;
            }
          }
          else {
            i = j + (getBottom() - getTop() - getPaddingTop() - getPaddingBottom() - mTotalLength) / 2;
          }
        }
      }
      return i + getLayoutParamstopMargin + k;
    }
    throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
  }
  
  public int getBaselineAlignedChildIndex()
  {
    return mBaselineAlignedChildIndex;
  }
  
  public Drawable getDividerDrawable()
  {
    return mDivider;
  }
  
  public int getDividerPadding()
  {
    return mDividerPadding;
  }
  
  public int getDividerWidth()
  {
    return mDividerWidth;
  }
  
  public int getGravity()
  {
    return mGravity;
  }
  
  public int getOrientation()
  {
    return mOrientation;
  }
  
  public int getShowDividers()
  {
    return mShowDividers;
  }
  
  public int getVirtualChildCount()
  {
    return getChildCount();
  }
  
  public float getWeightSum()
  {
    return mWeightSum;
  }
  
  public final boolean hasDividerBeforeChildAt(int paramInt)
  {
    if (paramInt == 0)
    {
      if ((mShowDividers & 0x1) != 0) {
        return true;
      }
    }
    else if (paramInt == getChildCount())
    {
      if ((mShowDividers & 0x4) != 0) {
        return true;
      }
    }
    else if ((mShowDividers & 0x2) != 0)
    {
      paramInt -= 1;
      while (paramInt >= 0)
      {
        if (getChildAt(paramInt).getVisibility() != 8) {
          return true;
        }
        paramInt -= 1;
      }
    }
    return false;
  }
  
  public IcsLinearLayout.LayoutParams initialize(AttributeSet paramAttributeSet)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public IcsLinearLayout.LayoutParams onCreateView(ViewGroup.LayoutParams paramLayoutParams)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    if (mDivider == null) {
      return;
    }
    int k = mOrientation;
    int j = 0;
    int i = 0;
    View localView;
    IcsLinearLayout.LayoutParams localLayoutParams;
    if (k == 1)
    {
      j = getVirtualChildCount();
      while (i < j)
      {
        localView = getChildAt(i);
        if ((localView != null) && (localView.getVisibility() != 8) && (hasDividerBeforeChildAt(i)))
        {
          localLayoutParams = (IcsLinearLayout.LayoutParams)localView.getLayoutParams();
          drawHorizontalDivider(paramCanvas, localView.getTop() - topMargin - mDividerHeight);
        }
        i += 1;
      }
      if (hasDividerBeforeChildAt(j))
      {
        localView = getChildAt(j - 1);
        if (localView == null)
        {
          i = getHeight() - getPaddingBottom() - mDividerHeight;
        }
        else
        {
          localLayoutParams = (IcsLinearLayout.LayoutParams)localView.getLayoutParams();
          i = localView.getBottom() + bottomMargin;
        }
        drawHorizontalDivider(paramCanvas, i);
      }
    }
    else
    {
      int m = getVirtualChildCount();
      boolean bool = R.id.this$0;
      if (getLayoutDirection() == 1) {
        i = 1;
      } else {
        i = 0;
      }
      while (j < m)
      {
        localView = getChildAt(j);
        if ((localView != null) && (localView.getVisibility() != 8) && (hasDividerBeforeChildAt(j)))
        {
          localLayoutParams = (IcsLinearLayout.LayoutParams)localView.getLayoutParams();
          if (i != 0) {
            k = localView.getRight() + rightMargin;
          } else {
            k = localView.getLeft() - leftMargin - mDividerWidth;
          }
          drawVerticalDivider(paramCanvas, k);
        }
        j += 1;
      }
      if (hasDividerBeforeChildAt(m))
      {
        localView = getChildAt(m - 1);
        if (localView == null)
        {
          if (i != 0) {
            i = getPaddingLeft();
          } else {
            j = getWidth() - getPaddingRight();
          }
        }
        else
        {
          for (i = mDividerWidth;; i = mDividerWidth)
          {
            i = j - i;
            break label399;
            localLayoutParams = (IcsLinearLayout.LayoutParams)localView.getLayoutParams();
            if (i == 0) {
              break;
            }
            j = localView.getLeft() - leftMargin;
          }
          i = localView.getRight() + rightMargin;
        }
        label399:
        drawVerticalDivider(paramCanvas, i);
      }
    }
  }
  
  public final void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
  }
  
  public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName("androidx.appcompat.widget.LinearLayoutCompat");
  }
  
  public void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int j;
    int m;
    if (mOrientation == 1)
    {
      i = getPaddingLeft();
      j = paramInt3 - paramInt1;
      k = getPaddingRight();
      m = getPaddingRight();
      n = getVirtualChildCount();
      i1 = mGravity;
      paramInt1 = i1 & 0x70;
      if (paramInt1 != 16)
      {
        if (paramInt1 != 80) {
          paramInt1 = getPaddingTop();
        } else {
          paramInt1 = getPaddingTop() + paramInt4 - paramInt2 - mTotalLength;
        }
      }
      else {
        paramInt1 = getPaddingTop() + (paramInt4 - paramInt2 - mTotalLength) / 2;
      }
      paramInt2 = 0;
      while (paramInt2 < n)
      {
        localObject1 = getChildAt(paramInt2);
        if (localObject1 == null)
        {
          paramInt3 = paramInt1;
        }
        else
        {
          paramInt3 = paramInt1;
          if (((View)localObject1).getVisibility() != 8)
          {
            i2 = ((View)localObject1).getMeasuredWidth();
            i3 = ((View)localObject1).getMeasuredHeight();
            localObject2 = (IcsLinearLayout.LayoutParams)((View)localObject1).getLayoutParams();
            paramInt4 = gravity;
            paramInt3 = paramInt4;
            if (paramInt4 < 0) {
              paramInt3 = 0x800007 & i1;
            }
            paramInt3 = Gravity.getAbsoluteGravity(paramInt3, getLayoutDirection()) & 0x7;
            if (paramInt3 != 1)
            {
              if (paramInt3 != 5) {
                paramInt3 = leftMargin + i;
              } else {
                paramInt3 = j - k - i2;
              }
            }
            else {
              for (paramInt4 = rightMargin;; paramInt4 = rightMargin)
              {
                paramInt3 -= paramInt4;
                break;
                paramInt3 = (j - i - m - i2) / 2 + i + leftMargin;
              }
            }
            paramInt4 = paramInt1;
            if (hasDividerBeforeChildAt(paramInt2)) {
              paramInt4 = paramInt1 + mDividerHeight;
            }
            paramInt1 = paramInt4 + topMargin;
            ((View)localObject1).layout(paramInt3, paramInt1, i2 + paramInt3, paramInt1 + i3);
            paramInt3 = i3 + bottomMargin + paramInt1;
          }
        }
        paramInt2 += 1;
        paramInt1 = paramInt3;
      }
    }
    paramBoolean = R.id.this$0;
    if (getLayoutDirection() == 1) {
      i = 1;
    } else {
      i = 0;
    }
    int k = getPaddingTop();
    int n = paramInt4 - paramInt2;
    int i1 = getPaddingBottom();
    int i2 = getPaddingBottom();
    int i3 = getVirtualChildCount();
    int i4 = mGravity;
    paramBoolean = mBaselineAligned;
    Object localObject1 = mMaxAscent;
    Object localObject2 = mMaxDescent;
    paramInt2 = Gravity.getAbsoluteGravity(0x800007 & i4, getLayoutDirection());
    if (paramInt2 != 1)
    {
      if (paramInt2 != 5) {
        paramInt2 = getPaddingLeft();
      } else {
        paramInt2 = getPaddingLeft() + paramInt3 - paramInt1 - mTotalLength;
      }
    }
    else {
      paramInt2 = getPaddingLeft() + (paramInt3 - paramInt1 - mTotalLength) / 2;
    }
    if (i != 0)
    {
      paramInt4 = i3 - 1;
      paramInt3 = -1;
    }
    else
    {
      paramInt3 = 1;
      paramInt4 = 0;
    }
    int i = 0;
    while (i < i3)
    {
      int i7 = paramInt3 * i + paramInt4;
      View localView = getChildAt(i7);
      if (localView != null)
      {
        if (localView.getVisibility() != 8)
        {
          int i5 = localView.getMeasuredWidth();
          int i6 = localView.getMeasuredHeight();
          IcsLinearLayout.LayoutParams localLayoutParams = (IcsLinearLayout.LayoutParams)localView.getLayoutParams();
          if ((paramBoolean) && (height != -1)) {
            j = localView.getBaseline();
          } else {
            j = -1;
          }
          m = gravity;
          paramInt1 = m;
          if (m < 0) {
            paramInt1 = i4 & 0x70;
          }
          paramInt1 &= 0x70;
          if (paramInt1 != 16)
          {
            if (paramInt1 != 48)
            {
              if (paramInt1 != 80)
              {
                paramInt1 = k;
              }
              else
              {
                m = n - i1 - i6 - bottomMargin;
                paramInt1 = m;
                if (j != -1)
                {
                  paramInt1 = localView.getMeasuredHeight();
                  paramInt1 = m - (localObject2[2] - (paramInt1 - j));
                }
              }
            }
            else
            {
              m = topMargin + k;
              paramInt1 = m;
              if (j != -1) {
                paramInt1 = localObject1[1] - j + m;
              }
            }
          }
          else {
            paramInt1 = (n - k - i2 - i6) / 2 + k + topMargin - bottomMargin;
          }
          j = paramInt2;
          if (hasDividerBeforeChildAt(i7)) {
            j = paramInt2 + mDividerWidth;
          }
          paramInt2 = j + leftMargin;
          localView.layout(paramInt2, paramInt1, paramInt2 + i5, paramInt1 + i6);
          paramInt2 = i5 + rightMargin + paramInt2;
        }
        for (;;)
        {
          break;
        }
      }
      i += 1;
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    int i10;
    int m;
    int i11;
    int i12;
    boolean bool1;
    int j;
    int i7;
    int n;
    int i6;
    int i3;
    int i1;
    int i2;
    int i;
    int k;
    float f1;
    Object localObject2;
    int i8;
    Object localObject1;
    float f2;
    int i5;
    int i4;
    int i9;
    if (mOrientation == 1)
    {
      mTotalLength = 0;
      i10 = getVirtualChildCount();
      m = View.MeasureSpec.getMode(paramInt1);
      i11 = View.MeasureSpec.getMode(paramInt2);
      i12 = mBaselineAlignedChildIndex;
      bool1 = mUseLargestChild;
      j = 1;
      i7 = 0;
      n = 0;
      i6 = 0;
      i3 = 0;
      i1 = 0;
      i2 = 0;
      i = 0;
      k = 0;
      f1 = 0.0F;
      while (i7 < i10)
      {
        localObject2 = getChildAt(i7);
        if (localObject2 == null) {
          mTotalLength = mTotalLength;
        }
        while (((View)localObject2).getVisibility() == 8)
        {
          i8 = i;
          break;
        }
        if (hasDividerBeforeChildAt(i7)) {
          mTotalLength += mDividerHeight;
        }
        localObject1 = (IcsLinearLayout.LayoutParams)((View)localObject2).getLayoutParams();
        f2 = weight;
        f1 += f2;
        if ((i11 == 1073741824) && (height == 0) && (f2 > 0.0F))
        {
          i3 = mTotalLength;
          mTotalLength = Math.max(i3, topMargin + i3 + bottomMargin);
          i5 = 1;
          i4 = i1;
        }
        else
        {
          if ((height == 0) && (f2 > 0.0F))
          {
            height = -2;
            i4 = 0;
          }
          else
          {
            i4 = Integer.MIN_VALUE;
          }
          if (f1 == 0.0F) {
            i5 = mTotalLength;
          } else {
            i5 = 0;
          }
          measureChildWithMargins((View)localObject2, paramInt1, 0, paramInt2, i5);
          if (i4 != Integer.MIN_VALUE) {
            height = i4;
          }
          i8 = ((View)localObject2).getMeasuredHeight();
          i4 = mTotalLength;
          mTotalLength = Math.max(i4, i4 + i8 + topMargin + bottomMargin);
          i4 = i1;
          i5 = i3;
          if (bool1)
          {
            i4 = Math.max(i8, i1);
            i5 = i3;
          }
        }
        i1 = m;
        if ((i12 >= 0) && (i12 == i7 + 1)) {
          mBaselineChildTop = mTotalLength;
        }
        if ((i7 >= i12) || (weight <= 0.0F)) {
          m = i1;
        } else {
          throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
        }
        if ((i1 != 1073741824) && (width == -1))
        {
          i1 = 1;
          k = 1;
        }
        else
        {
          i1 = 0;
        }
        i3 = leftMargin + rightMargin;
        i8 = ((View)localObject2).getMeasuredWidth() + i3;
        i2 = Math.max(i2, i8);
        i9 = View.combineMeasuredStates(i, ((View)localObject2).getMeasuredState());
        if ((j != 0) && (width == -1)) {
          i = 1;
        } else {
          i = 0;
        }
        if (weight > 0.0F)
        {
          if (i1 == 0) {
            for (;;)
            {
              i3 = i8;
            }
          }
          i6 = Math.max(i6, i3);
          i1 = i4;
          j = i;
          i3 = i5;
          i8 = i9;
        }
        else
        {
          if (i1 == 0) {
            for (;;)
            {
              i3 = i8;
            }
          }
          n = Math.max(n, i3);
          i8 = i9;
          i3 = i5;
          j = i;
          i1 = i4;
        }
        i7 += 1;
        i = i8;
      }
      i4 = i2;
      if ((mTotalLength > 0) && (hasDividerBeforeChildAt(i10))) {
        mTotalLength += mDividerHeight;
      }
      if ((bool1) && ((i11 == Integer.MIN_VALUE) || (i11 == 0)))
      {
        mTotalLength = 0;
        i2 = 0;
        while (i2 < i10)
        {
          localObject1 = getChildAt(i2);
          if (localObject1 == null)
          {
            mTotalLength = mTotalLength;
          }
          else if (((View)localObject1).getVisibility() != 8)
          {
            localObject1 = (IcsLinearLayout.LayoutParams)((View)localObject1).getLayoutParams();
            i5 = mTotalLength;
            mTotalLength = Math.max(i5, i5 + i1 + topMargin + bottomMargin);
          }
          i2 += 1;
        }
      }
      i2 = mTotalLength;
      i5 = getPaddingTop();
      i2 = getPaddingBottom() + i5 + i2;
      mTotalLength = i2;
      i8 = View.resolveSizeAndState(Math.max(i2, getSuggestedMinimumHeight()), paramInt2, 0);
      i2 = (0xFFFFFF & i8) - mTotalLength;
      if ((i3 == 0) && ((i2 == 0) || (f1 <= 0.0F)))
      {
        i7 = Math.max(n, i6);
        i3 = j;
        n = i7;
        i2 = i4;
        i5 = i;
        if (bool1)
        {
          i3 = j;
          n = i7;
          i2 = i4;
          i5 = i;
          if (i11 != 1073741824)
          {
            i6 = 0;
            for (;;)
            {
              i3 = j;
              n = i7;
              i2 = i4;
              i5 = i;
              if (i6 >= i10) {
                break;
              }
              localObject1 = getChildAt(i6);
              if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8) && (getLayoutParamsweight > 0.0F)) {
                ((View)localObject1).measure(View.MeasureSpec.makeMeasureSpec(((View)localObject1).getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i1, 1073741824));
              }
              i6 += 1;
            }
          }
        }
      }
      for (;;)
      {
        break;
        f2 = mWeightSum;
        if (f2 > 0.0F) {
          f1 = f2;
        }
        mTotalLength = 0;
        i5 = 0;
        i1 = i4;
        while (i5 < i10)
        {
          localObject1 = getChildAt(i5);
          if (((View)localObject1).getVisibility() != 8)
          {
            localObject2 = (IcsLinearLayout.LayoutParams)((View)localObject1).getLayoutParams();
            float f3 = weight;
            i3 = i;
            f2 = f1;
            i4 = i2;
            if (f3 > 0.0F)
            {
              i4 = (int)(i2 * f3 / f1);
              f2 = f1 - f3;
              i3 = getPaddingLeft();
              i7 = ViewGroup.getChildMeasureSpec(paramInt1, getPaddingRight() + i3 + leftMargin + rightMargin, width);
              if ((height == 0) && (i11 == 1073741824))
              {
                if (i4 > 0) {
                  i3 = i4;
                } else {
                  i3 = 0;
                }
                ((View)localObject1).measure(i7, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
              }
              else
              {
                i6 = ((View)localObject1).getMeasuredHeight() + i4;
                i3 = i6;
                if (i6 < 0) {
                  i3 = 0;
                }
                ((View)localObject1).measure(i7, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
              }
              i3 = View.combineMeasuredStates(i, ((View)localObject1).getMeasuredState() & 0xFF00);
              i4 = i2 - i4;
            }
            i = leftMargin + rightMargin;
            i2 = ((View)localObject1).getMeasuredWidth() + i;
            i1 = Math.max(i1, i2);
            if ((m == 1073741824) || (width != -1)) {
              i = i2;
            }
            n = Math.max(n, i);
            if ((j != 0) && (width == -1)) {
              i = 1;
            } else {
              i = 0;
            }
            j = mTotalLength;
            mTotalLength = Math.max(j, ((View)localObject1).getMeasuredHeight() + j + topMargin + bottomMargin);
            j = i;
            i2 = i4;
            f1 = f2;
            i = i3;
          }
          i5 += 1;
        }
        i2 = mTotalLength;
        i3 = getPaddingTop();
        mTotalLength = (getPaddingBottom() + i3 + i2);
        i3 = j;
        i2 = i1;
        i5 = i;
      }
      if ((i3 != 0) || (m == 1073741824)) {
        n = i2;
      }
      i = getPaddingLeft();
      setMeasuredDimension(View.resolveSizeAndState(Math.max(getPaddingRight() + i + n, getSuggestedMinimumWidth()), paramInt1, i5), i8);
      if (k != 0)
      {
        i = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        paramInt1 = 0;
        while (paramInt1 < i10)
        {
          localObject1 = getChildAt(paramInt1);
          if (((View)localObject1).getVisibility() != 8)
          {
            localObject2 = (IcsLinearLayout.LayoutParams)((View)localObject1).getLayoutParams();
            if (width == -1)
            {
              j = height;
              height = ((View)localObject1).getMeasuredHeight();
              measureChildWithMargins((View)localObject1, i, 0, paramInt2, 0);
              height = j;
            }
          }
          paramInt1 += 1;
        }
      }
    }
    else
    {
      mTotalLength = 0;
      i11 = getVirtualChildCount();
      int i13 = View.MeasureSpec.getMode(paramInt1);
      i12 = View.MeasureSpec.getMode(paramInt2);
      if ((mMaxAscent == null) || (mMaxDescent == null))
      {
        mMaxAscent = new int[4];
        mMaxDescent = new int[4];
      }
      int[] arrayOfInt1 = mMaxAscent;
      int[] arrayOfInt2 = mMaxDescent;
      arrayOfInt1[3] = -1;
      arrayOfInt1[2] = -1;
      arrayOfInt1[1] = -1;
      arrayOfInt1[0] = -1;
      arrayOfInt2[3] = -1;
      arrayOfInt2[2] = -1;
      arrayOfInt2[1] = -1;
      arrayOfInt2[0] = -1;
      bool1 = mBaselineAligned;
      boolean bool2 = mUseLargestChild;
      if (i13 == 1073741824) {
        i6 = 1;
      } else {
        i6 = 0;
      }
      i = 1;
      j = 0;
      f1 = 0.0F;
      i1 = 0;
      i7 = 0;
      i3 = 0;
      m = 0;
      k = 0;
      i2 = 0;
      n = 0;
      int i14;
      while (i7 < i11)
      {
        View localView = getChildAt(i7);
        if (localView == null)
        {
          mTotalLength = mTotalLength;
        }
        else if (localView.getVisibility() != 8)
        {
          if (hasDividerBeforeChildAt(i7)) {
            mTotalLength += mDividerWidth;
          }
          localObject1 = (IcsLinearLayout.LayoutParams)localView.getLayoutParams();
          f2 = weight;
          f1 += f2;
          if ((i13 == 1073741824) && (width == 0) && (f2 > 0.0F))
          {
            if (i6 != 0)
            {
              i4 = mTotalLength;
              mTotalLength = (leftMargin + rightMargin + i4);
            }
            else
            {
              i4 = mTotalLength;
              mTotalLength = Math.max(i4, leftMargin + i4 + rightMargin);
            }
            if (bool1)
            {
              i4 = View.MeasureSpec.makeMeasureSpec(0, 0);
              localView.measure(i4, i4);
              i4 = i2;
              i5 = m;
            }
            else
            {
              i4 = 1;
              i5 = m;
            }
          }
          else
          {
            if ((width == 0) && (f2 > 0.0F))
            {
              width = -2;
              i4 = 0;
            }
            else
            {
              i4 = Integer.MIN_VALUE;
            }
            if (f1 == 0.0F) {
              i5 = mTotalLength;
            } else {
              i5 = 0;
            }
            measureChildWithMargins(localView, paramInt1, i5, paramInt2, 0);
            if (i4 != Integer.MIN_VALUE) {
              width = i4;
            }
            localObject2 = localObject1;
            i8 = localView.getMeasuredWidth();
            if (i6 != 0)
            {
              i4 = mTotalLength;
              mTotalLength = (leftMargin + i8 + rightMargin + i4);
            }
            else
            {
              i4 = mTotalLength;
              mTotalLength = Math.max(i4, i4 + i8 + leftMargin + rightMargin);
            }
            i4 = i2;
            i5 = m;
            if (bool2)
            {
              i5 = Math.max(i8, m);
              i4 = i2;
            }
          }
          if ((i12 != 1073741824) && (height == -1))
          {
            m = 1;
            n = 1;
          }
          else
          {
            m = 0;
          }
          i2 = topMargin + bottomMargin;
          i8 = localView.getMeasuredHeight() + i2;
          i9 = View.combineMeasuredStates(i3, localView.getMeasuredState());
          if (bool1)
          {
            i14 = localView.getBaseline();
            if (i14 != -1)
            {
              i10 = gravity;
              i3 = i10;
              if (i10 < 0) {
                i3 = mGravity;
              }
              i3 = ((i3 & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
              arrayOfInt1[i3] = Math.max(arrayOfInt1[i3], i14);
              arrayOfInt2[i3] = Math.max(arrayOfInt2[i3], i8 - i14);
            }
          }
          for (;;)
          {
            break;
          }
          i1 = Math.max(i1, i8);
          if ((i != 0) && (height == -1)) {
            i = 1;
          } else {
            i = 0;
          }
          if (weight > 0.0F)
          {
            if (m != 0) {
              i8 = i2;
            }
            k = Math.max(k, i8);
          }
          else
          {
            if (m != 0) {
              i8 = i2;
            }
            j = Math.max(j, i8);
          }
          m = i5;
          i2 = i4;
          i3 = i9;
        }
        i7 += 1;
      }
      if ((mTotalLength > 0) && (hasDividerBeforeChildAt(i11))) {
        mTotalLength += mDividerWidth;
      }
      i4 = arrayOfInt1[1];
      if ((i4 == -1) && (arrayOfInt1[0] == -1) && (arrayOfInt1[2] == -1) && (arrayOfInt1[3] == -1)) {
        break label2572;
      }
      i4 = Math.max(arrayOfInt1[3], Math.max(arrayOfInt1[0], Math.max(i4, arrayOfInt1[2])));
      i1 = Math.max(i1, Math.max(arrayOfInt2[3], Math.max(arrayOfInt2[0], Math.max(arrayOfInt2[1], arrayOfInt2[2]))) + i4);
      label2572:
      if ((bool2) && ((i13 == Integer.MIN_VALUE) || (i13 == 0)))
      {
        mTotalLength = 0;
        i4 = 0;
        while (i4 < i11)
        {
          localObject1 = getChildAt(i4);
          if (localObject1 == null)
          {
            mTotalLength = mTotalLength;
          }
          else if (((View)localObject1).getVisibility() != 8)
          {
            localObject1 = (IcsLinearLayout.LayoutParams)((View)localObject1).getLayoutParams();
            if (i6 != 0)
            {
              i5 = mTotalLength;
              mTotalLength = (leftMargin + m + rightMargin + i5);
            }
            else
            {
              i5 = mTotalLength;
              mTotalLength = Math.max(i5, i5 + m + leftMargin + rightMargin);
            }
          }
          i4 += 1;
        }
      }
      i4 = mTotalLength;
      i5 = getPaddingLeft();
      i4 = getPaddingRight() + i5 + i4;
      mTotalLength = i4;
      i10 = View.resolveSizeAndState(Math.max(i4, getSuggestedMinimumWidth()), paramInt1, 0);
      i4 = (0xFFFFFF & i10) - mTotalLength;
      if ((i2 == 0) && ((i4 == 0) || (f1 <= 0.0F)))
      {
        k = Math.max(j, k);
        if ((bool2) && (i13 != 1073741824))
        {
          j = 0;
          while (j < i11)
          {
            localObject1 = getChildAt(j);
            if ((localObject1 != null) && (((View)localObject1).getVisibility() != 8) && (getLayoutParamsweight > 0.0F)) {
              ((View)localObject1).measure(View.MeasureSpec.makeMeasureSpec(m, 1073741824), View.MeasureSpec.makeMeasureSpec(((View)localObject1).getMeasuredHeight(), 1073741824));
            }
            j += 1;
          }
        }
        j = k;
      }
      else
      {
        f2 = mWeightSum;
        if (f2 > 0.0F) {
          f1 = f2;
        }
        arrayOfInt1[3] = -1;
        arrayOfInt1[2] = -1;
        arrayOfInt1[1] = -1;
        arrayOfInt1[0] = -1;
        arrayOfInt2[3] = -1;
        arrayOfInt2[2] = -1;
        arrayOfInt2[1] = -1;
        arrayOfInt2[0] = -1;
        mTotalLength = 0;
        k = i3;
        i1 = -1;
        i3 = 0;
        m = i4;
        while (i3 < i11)
        {
          localObject1 = getChildAt(i3);
          if ((localObject1 == null) || (((View)localObject1).getVisibility() == 8))
          {
            i2 = m;
            i4 = i;
            i5 = k;
            f2 = f1;
          }
          else
          {
            localObject2 = (IcsLinearLayout.LayoutParams)((View)localObject1).getLayoutParams();
            f2 = weight;
            if (f2 > 0.0F)
            {
              i4 = (int)(m * f2 / f1);
              f1 -= f2;
              i2 = m - i4;
              m = getPaddingTop();
              i5 = ViewGroup.getChildMeasureSpec(paramInt2, getPaddingBottom() + m + topMargin + bottomMargin, height);
              if ((width == 0) && (i13 == 1073741824))
              {
                if (i4 > 0) {
                  m = i4;
                } else {
                  m = 0;
                }
                ((View)localObject1).measure(View.MeasureSpec.makeMeasureSpec(m, 1073741824), i5);
              }
              else
              {
                i4 = ((View)localObject1).getMeasuredWidth() + i4;
                m = i4;
                if (i4 < 0) {
                  m = 0;
                }
                ((View)localObject1).measure(View.MeasureSpec.makeMeasureSpec(m, 1073741824), i5);
              }
              m = View.combineMeasuredStates(k, ((View)localObject1).getMeasuredState() & 0xFF000000);
              k = i2;
            }
            else
            {
              i2 = m;
              m = k;
              k = i2;
            }
            if (i6 != 0) {
              i2 = mTotalLength;
            }
            for (mTotalLength = (((View)localObject1).getMeasuredWidth() + leftMargin + rightMargin + i2);; mTotalLength = Math.max(i2, ((View)localObject1).getMeasuredWidth() + i2 + leftMargin + rightMargin))
            {
              break;
              i2 = mTotalLength;
            }
            if ((i12 != 1073741824) && (height == -1)) {
              i2 = 1;
            } else {
              i2 = 0;
            }
            i4 = topMargin + bottomMargin;
            i7 = ((View)localObject1).getMeasuredHeight() + i4;
            i8 = Math.max(i1, i7);
            if (i2 != 0) {
              i1 = i4;
            } else {
              i1 = i7;
            }
            i9 = Math.max(j, i1);
            if ((i != 0) && (height == -1)) {
              i = 1;
            } else {
              i = 0;
            }
            i2 = k;
            i1 = i8;
            i4 = i;
            j = i9;
            i5 = m;
            f2 = f1;
            if (bool1)
            {
              i14 = ((View)localObject1).getBaseline();
              i2 = k;
              i1 = i8;
              i4 = i;
              j = i9;
              i5 = m;
              f2 = f1;
              if (i14 != -1)
              {
                i1 = gravity;
                j = i1;
                if (i1 < 0) {
                  j = mGravity;
                }
                j = ((j & 0x70) >> 4 & 0xFFFFFFFE) >> 1;
                arrayOfInt1[j] = Math.max(arrayOfInt1[j], i14);
                arrayOfInt2[j] = Math.max(arrayOfInt2[j], i7 - i14);
                i2 = k;
                i1 = i8;
                i4 = i;
                j = i9;
                i5 = m;
                f2 = f1;
              }
            }
          }
          i3 += 1;
          m = i2;
          i = i4;
          k = i5;
          f1 = f2;
        }
        m = mTotalLength;
        i2 = getPaddingLeft();
        mTotalLength = (getPaddingRight() + i2 + m);
        m = arrayOfInt1[1];
        if ((m == -1) && (arrayOfInt1[0] == -1) && (arrayOfInt1[2] == -1) && (arrayOfInt1[3] == -1)) {
          break label3743;
        }
        m = Math.max(arrayOfInt1[3], Math.max(arrayOfInt1[0], Math.max(m, arrayOfInt1[2])));
        i1 = Math.max(i1, Math.max(arrayOfInt2[3], Math.max(arrayOfInt2[0], Math.max(arrayOfInt2[1], arrayOfInt2[2]))) + m);
        label3743:
        i3 = k;
      }
      k = 0;
      if ((i != 0) || (i12 == 1073741824)) {
        j = i1;
      }
      i = getPaddingTop();
      setMeasuredDimension(i3 & 0xFF000000 | i10, View.resolveSizeAndState(Math.max(getPaddingBottom() + i + j, getSuggestedMinimumHeight()), paramInt2, i3 << 16));
      if (n != 0)
      {
        i = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        paramInt2 = k;
        while (paramInt2 < i11)
        {
          localObject1 = getChildAt(paramInt2);
          if (((View)localObject1).getVisibility() != 8)
          {
            localObject2 = (IcsLinearLayout.LayoutParams)((View)localObject1).getLayoutParams();
            if (height == -1)
            {
              j = width;
              width = ((View)localObject1).getMeasuredWidth();
              measureChildWithMargins((View)localObject1, paramInt1, 0, i, 0);
              width = j;
            }
          }
          paramInt2 += 1;
        }
      }
    }
  }
  
  public void setBaselineAligned(boolean paramBoolean)
  {
    mBaselineAligned = paramBoolean;
  }
  
  public void setBaselineAlignedChildIndex(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < getChildCount()))
    {
      mBaselineAlignedChildIndex = paramInt;
      return;
    }
    StringBuilder localStringBuilder = new StringBuilder("base aligned child index out of range (0, ");
    localStringBuilder.append(getChildCount());
    localStringBuilder.append(")");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public void setDividerDrawable(Drawable paramDrawable)
  {
    if (paramDrawable == mDivider) {
      return;
    }
    mDivider = paramDrawable;
    boolean bool = false;
    if (paramDrawable != null)
    {
      mDividerWidth = paramDrawable.getIntrinsicWidth();
      mDividerHeight = paramDrawable.getIntrinsicHeight();
    }
    else
    {
      mDividerWidth = 0;
      mDividerHeight = 0;
    }
    if (paramDrawable == null) {
      bool = true;
    }
    setWillNotDraw(bool);
    requestLayout();
  }
  
  public void setDividerPadding(int paramInt)
  {
    mDividerPadding = paramInt;
  }
  
  public void setGravity(int paramInt)
  {
    if (mGravity != paramInt)
    {
      int i = paramInt;
      if ((0x800007 & paramInt) == 0) {
        i = paramInt | 0x800003;
      }
      paramInt = i;
      if ((i & 0x70) == 0) {
        paramInt = i | 0x30;
      }
      mGravity = paramInt;
      requestLayout();
    }
  }
  
  public void setHorizontalGravity(int paramInt)
  {
    paramInt &= 0x800007;
    int i = mGravity;
    if ((0x800007 & i) != paramInt)
    {
      mGravity = (paramInt | 0xFF7FFFF8 & i);
      requestLayout();
    }
  }
  
  public void setMeasureWithLargestChildEnabled(boolean paramBoolean)
  {
    mUseLargestChild = paramBoolean;
  }
  
  public IcsLinearLayout.LayoutParams setOrientation()
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public void setOrientation(int paramInt)
  {
    if (mOrientation != paramInt)
    {
      mOrientation = paramInt;
      requestLayout();
    }
  }
  
  public void setShowDividers(int paramInt)
  {
    if (paramInt != mShowDividers) {
      requestLayout();
    }
    mShowDividers = paramInt;
  }
  
  public void setVerticalGravity(int paramInt)
  {
    paramInt &= 0x70;
    int i = mGravity;
    if ((i & 0x70) != paramInt)
    {
      mGravity = (paramInt | i & 0xFFFFFF8F);
      requestLayout();
    }
  }
  
  public void setWeightSum(float paramFloat)
  {
    mWeightSum = Math.max(0.0F, paramFloat);
  }
  
  public final boolean shouldDelayChildPressedState()
  {
    return false;
  }
}
