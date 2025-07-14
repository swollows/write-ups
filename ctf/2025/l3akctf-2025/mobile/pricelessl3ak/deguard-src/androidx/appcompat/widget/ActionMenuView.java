package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import android.widget.ImageView;
import androidx.appcompat.view.menu.ActionMenuItemView;
import menu.MenuBuilder.ItemInvoker;
import menu.MenuView;
import menu.f;
import menu.f.a;
import menu.h;
import menu.i;
import menu.v;

public class ActionMenuView
  extends LinearLayoutCompat
  implements MenuBuilder.ItemInvoker, MenuView
{
  public androidx.appcompat.app.b mActionMenuPresenterCallback;
  public MenuBuilder.Callback mCallback;
  public boolean mContext;
  public boolean mFormatItems;
  public int mFormatItemsWidth;
  public final int mGeneratedItemPadding;
  public f mMenu;
  public f.a mMenuBuilderCallback;
  public final int mMinCellSize;
  public Context mPopupContext;
  public int mPopupTheme;
  public b mPresenter;
  
  public ActionMenuView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    setBaselineAligned(false);
    float f = getResourcesgetDisplayMetricsdensity;
    mMinCellSize = ((int)(56.0F * f));
    mGeneratedItemPadding = ((int)(f * 4.0F));
    mPopupContext = paramContext;
    mPopupTheme = 0;
  }
  
  public static ActionMenuView.LayoutParams a(ViewGroup.LayoutParams paramLayoutParams)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public static ActionMenuView.LayoutParams onCreateView()
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final boolean b(int paramInt)
  {
    boolean bool2 = false;
    if (paramInt == 0) {
      return false;
    }
    View localView1 = getChildAt(paramInt - 1);
    View localView2 = getChildAt(paramInt);
    boolean bool1 = bool2;
    if (paramInt < getChildCount())
    {
      bool1 = bool2;
      if ((localView1 instanceof MethodWriter)) {
        bool1 = ((MethodWriter)localView1).c();
      }
    }
    bool2 = bool1;
    if (paramInt > 0)
    {
      bool2 = bool1;
      if ((localView2 instanceof MethodWriter)) {
        bool2 = bool1 | ((MethodWriter)localView2).b();
      }
    }
    return bool2;
  }
  
  public final boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof ActionMenuView.LayoutParams;
  }
  
  public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return false;
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public Menu getMenu()
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public Drawable getOverflowIcon()
  {
    getMenu();
    b localB = mPresenter;
    ActionMenuPresenter.OverflowMenuButton localOverflowMenuButton = mOverflowButton;
    if (localOverflowMenuButton != null) {
      return localOverflowMenuButton.getDrawable();
    }
    if (mPendingOverflowIconSet) {
      return mPendingOverflowIcon;
    }
    return null;
  }
  
  public int getPopupTheme()
  {
    return mPopupTheme;
  }
  
  public int getWindowAnimations()
  {
    return 0;
  }
  
  public final IcsLinearLayout.LayoutParams initialize(AttributeSet paramAttributeSet)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final void initialize(f paramF)
  {
    mMenu = paramF;
  }
  
  public final boolean invokeItem(h paramH)
  {
    return mMenu.a(paramH, null, 0);
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    paramConfiguration = mPresenter;
    if (paramConfiguration != null)
    {
      paramConfiguration.updateMenuView();
      if (mPresenter.c())
      {
        mPresenter.hideOverflowMenu();
        mPresenter.showOverflowMenu();
      }
    }
  }
  
  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    Object localObject = mPresenter;
    if (localObject != null)
    {
      ((b)localObject).hideOverflowMenu();
      localObject = m;
      if ((localObject != null) && (((i)localObject).a())) {
        l.dismiss();
      }
    }
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (!mFormatItems)
    {
      super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    int n = getChildCount();
    int m = (paramInt4 - paramInt2) / 2;
    int i1 = getDividerWidth();
    int i2 = paramInt3 - paramInt1;
    paramInt1 = i2 - getPaddingRight() - getPaddingLeft();
    paramBoolean = R.id.this$0;
    if (getLayoutDirection() == 1) {
      paramInt2 = 1;
    } else {
      paramInt2 = 0;
    }
    paramInt3 = 0;
    int i = 0;
    paramInt4 = 0;
    View localView;
    ActionMenuView.LayoutParams localLayoutParams;
    int j;
    while (paramInt3 < n)
    {
      localView = getChildAt(paramInt3);
      if (localView.getVisibility() != 8)
      {
        localLayoutParams = (ActionMenuView.LayoutParams)localView.getLayoutParams();
        if (isOverflowButton)
        {
          j = localView.getMeasuredWidth();
          i = j;
          if (b(paramInt3)) {
            i = j + i1;
          }
          int i3 = localView.getMeasuredHeight();
          int k;
          if (paramInt2 != 0)
          {
            j = getPaddingLeft() + leftMargin;
            k = j + i;
          }
          else
          {
            k = getWidth() - getPaddingRight() - rightMargin;
            j = k - i;
          }
          int i4 = m - i3 / 2;
          localView.layout(j, i4, k, i3 + i4);
          paramInt1 -= i;
          i = 1;
        }
        else
        {
          paramInt1 -= localView.getMeasuredWidth() + leftMargin + rightMargin;
          b(paramInt3);
          paramInt4 += 1;
        }
      }
      paramInt3 += 1;
    }
    if ((n == 1) && (i == 0))
    {
      localView = getChildAt(0);
      paramInt1 = localView.getMeasuredWidth();
      paramInt2 = localView.getMeasuredHeight();
      paramInt3 = i2 / 2 - paramInt1 / 2;
      paramInt4 = m - paramInt2 / 2;
      localView.layout(paramInt3, paramInt4, paramInt1 + paramInt3, paramInt2 + paramInt4);
      return;
    }
    paramInt3 = paramInt4 - (i ^ 0x1);
    if (paramInt3 > 0) {
      paramInt1 /= paramInt3;
    }
    for (;;)
    {
      break;
      paramInt1 = 0;
    }
    paramInt4 = Math.max(0, paramInt1);
    if (paramInt2 != 0)
    {
      paramInt2 = getWidth() - getPaddingRight();
      paramInt1 = 0;
      while (paramInt1 < n)
      {
        localView = getChildAt(paramInt1);
        localLayoutParams = (ActionMenuView.LayoutParams)localView.getLayoutParams();
        paramInt3 = paramInt2;
        if (localView.getVisibility() != 8) {
          if (isOverflowButton)
          {
            paramInt3 = paramInt2;
          }
          else
          {
            paramInt2 -= rightMargin;
            paramInt3 = localView.getMeasuredWidth();
            i = localView.getMeasuredHeight();
            j = m - i / 2;
            localView.layout(paramInt2 - paramInt3, j, paramInt2, i + j);
            paramInt3 = paramInt2 - (paramInt3 + leftMargin + paramInt4);
          }
        }
        paramInt1 += 1;
        paramInt2 = paramInt3;
      }
    }
    paramInt2 = getPaddingLeft();
    paramInt1 = 0;
    while (paramInt1 < n)
    {
      localView = getChildAt(paramInt1);
      localLayoutParams = (ActionMenuView.LayoutParams)localView.getLayoutParams();
      paramInt3 = paramInt2;
      if (localView.getVisibility() != 8) {
        if (isOverflowButton)
        {
          paramInt3 = paramInt2;
        }
        else
        {
          paramInt2 += leftMargin;
          paramInt3 = localView.getMeasuredWidth();
          i = localView.getMeasuredHeight();
          j = m - i / 2;
          localView.layout(paramInt2, j, paramInt2 + paramInt3, i + j);
          paramInt3 = paramInt3 + rightMargin + paramInt4 + paramInt2;
        }
      }
      paramInt1 += 1;
      paramInt2 = paramInt3;
    }
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool2 = mFormatItems;
    boolean bool1;
    if (View.MeasureSpec.getMode(paramInt1) == 1073741824) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    mFormatItems = bool1;
    if (bool2 != bool1) {
      mFormatItemsWidth = 0;
    }
    int i = View.MeasureSpec.getSize(paramInt1);
    Object localObject1;
    if (mFormatItems)
    {
      localObject1 = mMenu;
      if ((localObject1 != null) && (i != mFormatItemsWidth))
      {
        mFormatItemsWidth = i;
        ((f)localObject1).b(true);
      }
    }
    int j = getChildCount();
    if ((mFormatItems) && (j > 0))
    {
      int i1 = View.MeasureSpec.getMode(paramInt2);
      paramInt1 = View.MeasureSpec.getSize(paramInt1);
      int i9 = View.MeasureSpec.getSize(paramInt2);
      i = getPaddingLeft();
      j = getPaddingRight();
      int k = getPaddingTop();
      int i4 = getPaddingBottom() + k;
      int i7 = ViewGroup.getChildMeasureSpec(paramInt2, i4, -2);
      int n = i7;
      int i13 = paramInt1 - (j + i);
      paramInt2 = mMinCellSize;
      paramInt1 = i13 / paramInt2;
      if (paramInt1 == 0)
      {
        setMeasuredDimension(i13, 0);
        return;
      }
      int i14 = i13 % paramInt2 / paramInt1 + paramInt2;
      int i15 = getChildCount();
      paramInt2 = 0;
      int m = 0;
      int i2 = 0;
      int i3 = 0;
      j = 0;
      i = 0;
      int i11;
      Object localObject2;
      int i5;
      int i6;
      long l2;
      int i8;
      int i10;
      for (long l1 = 0L;; l1 = l2)
      {
        i11 = mGeneratedItemPadding;
        if (i3 >= i15) {
          break;
        }
        localObject2 = getChildAt(i3);
        if (((View)localObject2).getVisibility() == 8)
        {
          i5 = j;
          i6 = m;
          l2 = l1;
        }
        else
        {
          bool2 = localObject2 instanceof ActionMenuItemView;
          i8 = m + 1;
          if (bool2) {
            ((View)localObject2).setPadding(i11, 0, i11, 0);
          }
          ActionMenuView.LayoutParams localLayoutParams1 = (ActionMenuView.LayoutParams)((View)localObject2).getLayoutParams();
          expanded = false;
          extraPixels = 0;
          cellsUsed = 0;
          expandable = false;
          leftMargin = 0;
          rightMargin = 0;
          if ((bool2) && (!TextUtils.isEmpty(((ActionMenuItemView)localObject2).getText()))) {
            bool1 = true;
          } else {
            bool1 = false;
          }
          preventEdgeOffset = bool1;
          if (isOverflowButton) {
            k = 1;
          } else {
            k = paramInt1;
          }
          ActionMenuView.LayoutParams localLayoutParams2 = (ActionMenuView.LayoutParams)((View)localObject2).getLayoutParams();
          i6 = View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7) - i4, View.MeasureSpec.getMode(i7));
          if (bool2) {
            localObject1 = (ActionMenuItemView)localObject2;
          } else {
            localObject1 = null;
          }
          if ((localObject1 != null) && (!TextUtils.isEmpty(((BubbleTextView)localObject1).getText()))) {
            i5 = 1;
          } else {
            i5 = 0;
          }
          if ((k > 0) && ((i5 == 0) || (k >= 2)))
          {
            ((View)localObject2).measure(View.MeasureSpec.makeMeasureSpec(k * i14, Integer.MIN_VALUE), i6);
            i10 = ((View)localObject2).getMeasuredWidth();
            k = i10 / i14;
            m = k;
            if (i10 % i14 != 0) {
              m = k + 1;
            }
            k = m;
            if (i5 != 0)
            {
              k = m;
              if (m < 2) {
                k = 2;
              }
            }
          }
          else
          {
            k = 0;
          }
          if ((!isOverflowButton) && (i5 != 0)) {
            bool1 = true;
          } else {
            bool1 = false;
          }
          expandable = bool1;
          cellsUsed = k;
          ((View)localObject2).measure(View.MeasureSpec.makeMeasureSpec(k * i14, 1073741824), i6);
          i10 = Math.max(i2, k);
          m = i;
          if (expandable) {
            m = i + 1;
          }
          if (isOverflowButton) {
            j = 1;
          }
          i11 = paramInt1 - k;
          int i12 = Math.max(paramInt2, ((View)localObject2).getMeasuredHeight());
          i5 = j;
          i2 = i10;
          i = m;
          paramInt2 = i12;
          i6 = i8;
          l2 = l1;
          paramInt1 = i11;
          if (k == 1)
          {
            l2 = l1 | 1 << i3;
            paramInt1 = i11;
            i6 = i8;
            paramInt2 = i12;
            i = m;
            i2 = i10;
            i5 = j;
          }
        }
        i3 += 1;
        j = i5;
        m = i6;
      }
      if ((j != 0) && (m == 2)) {
        i3 = 1;
      } else {
        i3 = 0;
      }
      k = 0;
      i4 = paramInt1;
      paramInt1 = k;
      long l3;
      if ((i > 0) && (i4 > 0))
      {
        i5 = Integer.MAX_VALUE;
        i8 = 0;
        i6 = 0;
        for (l3 = 0L; i6 < i15; l3 = l2)
        {
          localObject1 = (ActionMenuView.LayoutParams)getChildAt(i6).getLayoutParams();
          if (!expandable)
          {
            k = i8;
            i7 = i5;
            l2 = l3;
          }
          else
          {
            i10 = cellsUsed;
            if (i10 < i5)
            {
              l2 = 1L << i6;
              i7 = i10;
              k = 1;
            }
            else
            {
              k = i8;
              i7 = i5;
              l2 = l3;
              if (i10 == i5)
              {
                l2 = l3 | 1L << i6;
                k = i8 + 1;
                i7 = i5;
              }
            }
          }
          i6 += 1;
          i8 = k;
          i5 = i7;
        }
        l1 |= l3;
        if (i8 > i4) {}
      }
      else
      {
        for (;;)
        {
          paramInt1 = 0;
          while (paramInt1 < i15)
          {
            localObject1 = getChildAt(paramInt1);
            localObject2 = (ActionMenuView.LayoutParams)((View)localObject1).getLayoutParams();
            long l4 = 1 << paramInt1;
            if ((l3 & l4) == 0L)
            {
              l2 = l1;
              k = i4;
              if (cellsUsed == i5 + 1)
              {
                l2 = l1 | l4;
                k = i4;
              }
            }
            else
            {
              if ((i3 != 0) && (preventEdgeOffset) && (i4 == 1)) {
                ((View)localObject1).setPadding(i11 + i14, 0, i11, 0);
              }
              cellsUsed += 1;
              expanded = true;
              k = i4 - 1;
              l2 = l1;
            }
            paramInt1 += 1;
            l1 = l2;
            i4 = k;
          }
          paramInt1 = 1;
          break;
        }
      }
      if ((j == 0) && (m == 1)) {
        i = 1;
      } else {
        i = 0;
      }
      if ((i4 <= 0) || (l1 == 0L) || ((i4 >= m - 1) && (i == 0) && (i2 <= 1))) {
        break label1506;
      }
      float f3 = Long.bitCount(l1);
      float f2 = f3;
      if (i == 0)
      {
        float f1 = f3;
        if ((l1 & 1L) != 0L)
        {
          f1 = f3;
          if (!getChildAt0getLayoutParamspreventEdgeOffset) {
            f1 = f3 - 0.5F;
          }
        }
        i = i15 - 1;
        f2 = f1;
        if ((l1 & 1 << i) != 0L)
        {
          f2 = f1;
          if (!getChildAtgetLayoutParamspreventEdgeOffset) {
            f2 = f1 - 0.5F;
          }
        }
      }
      if (f2 > 0.0F) {
        j = (int)(i4 * i14 / f2);
      } else {
        j = 0;
      }
      k = 0;
      while (k < i15)
      {
        if ((l1 & 1 << k) != 0L)
        {
          localObject1 = getChildAt(k);
          localObject2 = (ActionMenuView.LayoutParams)((View)localObject1).getLayoutParams();
          if ((localObject1 instanceof ActionMenuItemView))
          {
            extraPixels = j;
            expanded = true;
            if ((k == 0) && (!preventEdgeOffset)) {
              leftMargin = (-j / 2);
            }
            paramInt1 = 1;
          }
        }
        else
        {
          i = paramInt1;
          break label1491;
        }
        if (isOverflowButton)
        {
          extraPixels = j;
          expanded = true;
          rightMargin = (-j / 2);
          i = 1;
        }
        else
        {
          if (k != 0) {
            leftMargin = (j / 2);
          }
          i = paramInt1;
          if (k != i15 - 1)
          {
            rightMargin = (j / 2);
            i = paramInt1;
          }
        }
        label1491:
        k += 1;
        paramInt1 = i;
      }
      label1506:
      if (paramInt1 != 0)
      {
        paramInt1 = 0;
        while (paramInt1 < i15)
        {
          localObject1 = getChildAt(paramInt1);
          localObject2 = (ActionMenuView.LayoutParams)((View)localObject1).getLayoutParams();
          if (expanded) {
            ((View)localObject1).measure(View.MeasureSpec.makeMeasureSpec(cellsUsed * i14 + extraPixels, 1073741824), n);
          }
          paramInt1 += 1;
        }
      }
      if (i1 != 1073741824) {
        paramInt1 = paramInt2;
      } else {
        paramInt1 = i9;
      }
      setMeasuredDimension(i13, paramInt1);
      return;
    }
    i = 0;
    while (i < j)
    {
      localObject1 = (ActionMenuView.LayoutParams)getChildAt(i).getLayoutParams();
      rightMargin = 0;
      leftMargin = 0;
      i += 1;
    }
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public void setExpandedActionViewsExclusive(boolean paramBoolean)
  {
    mPresenter.s = paramBoolean;
  }
  
  public void setOnMenuItemClickListener(MenuBuilder.Callback paramCallback)
  {
    mCallback = paramCallback;
  }
  
  public void setOverflowIcon(Drawable paramDrawable)
  {
    getMenu();
    b localB = mPresenter;
    ActionMenuPresenter.OverflowMenuButton localOverflowMenuButton = mOverflowButton;
    if (localOverflowMenuButton != null)
    {
      localOverflowMenuButton.setImageDrawable(paramDrawable);
      return;
    }
    mPendingOverflowIconSet = true;
    mPendingOverflowIcon = paramDrawable;
  }
  
  public void setOverflowReserved(boolean paramBoolean)
  {
    mContext = paramBoolean;
  }
  
  public void setPopupTheme(int paramInt)
  {
    if (mPopupTheme != paramInt)
    {
      mPopupTheme = paramInt;
      if (paramInt == 0)
      {
        mPopupContext = getContext();
        return;
      }
      mPopupContext = new ContextThemeWrapper(getContext(), paramInt);
    }
  }
  
  public void setPresenter(b paramB)
  {
    mPresenter = paramB;
    mMenuView = this;
    mMenu = c;
  }
}
