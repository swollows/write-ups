package androidx.appcompat.widget;

import android.content.res.Configuration;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewPropertyAnimator;
import android.view.Window.Callback;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.appcompat.app.WindowDecorActionBar;
import androidx.core.widget.NestedScrollView;
import app.Elements;
import app.NestedScrollingParent;
import app.NestedScrollingParentHelper;
import app.SwipeRefreshLayout;
import app.TypeToken;
import app.ValueAnimatorCompatImplHoneycombMr1.2;
import app.ViewCompat;
import app.ViewCompatLollipop;
import menu.f;
import menu.l;
import util.Headers;
import view.ViewPropertyAnimatorCompatSet;

public class ActionBarOverlayLayout
  extends ViewGroup
  implements DecorContentParent, SwipeRefreshLayout, NestedScrollingParent
{
  public static final int[] ATTRS;
  public static final android.graphics.Rect TAG;
  public static final TypeToken context;
  public ViewPropertyAnimator animator;
  public TypeToken height;
  public TypeToken left;
  public final ValueAnimatorCompatImplHoneycombMr1.2 listener;
  public int mActionBarHeight;
  public ActionBarContainer mActionBarTop;
  public ActionBarOverlayLayout.ActionBarVisibilityCallback mActionBarVisibilityCallback;
  public final EventInfoFragment.1 mAddActionBarHideOffset;
  public boolean mAnimatingForFling;
  public final android.graphics.Rect mBaseInnerInsets;
  public ContentFrameLayout mContent;
  public final Rect mContentInsets;
  public DecorToolbar mDecorToolbar;
  public OverScroller mFlingEstimator;
  public boolean mHasNonEmbeddedTabs;
  public boolean mHideOnContentScroll;
  public int mHideOnContentScrollReference;
  public final android.graphics.Rect mInnerInsets;
  public final android.graphics.Rect mLastInnerInsets;
  public int mLastSystemUiVisibility;
  public boolean mOverlayMode;
  public final NestedScrollingParentHelper mParentHelper;
  public final EventInfoFragment.1 mRemoveActionBarHideOffset;
  public Drawable mWindowContentOverlay;
  public int mWindowVisibility;
  public final android.graphics.Rect p;
  public TypeToken right;
  public TypeToken type;
  
  static
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: fail exe a2 = a1\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:92)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.dfs(Cfg.java:255)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze0(BaseAnalyze.java:75)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze(BaseAnalyze.java:69)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:274)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\nCaused by: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:552)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:1)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:166)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:331)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:387)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:90)\n\t... 17 more\n");
  }
  
  public ActionBarOverlayLayout(android.content.Context paramContext, AttributeSet paramAttributeSet) {}
  
  public static boolean applyInsets(android.view.View paramView, android.graphics.Rect paramRect, boolean paramBoolean)
  {
    paramView = (ActionBarOverlayLayout.LayoutParams)paramView.getLayoutParams();
    int i = leftMargin;
    int j = left;
    boolean bool;
    if (i != j)
    {
      leftMargin = j;
      bool = true;
    }
    else
    {
      bool = false;
    }
    i = topMargin;
    j = top;
    if (i != j)
    {
      topMargin = j;
      bool = true;
    }
    i = rightMargin;
    j = right;
    if (i != j)
    {
      rightMargin = j;
      bool = true;
    }
    if (paramBoolean)
    {
      i = bottomMargin;
      j = bottom;
      if (i != j)
      {
        bottomMargin = j;
        return true;
      }
    }
    return bool;
  }
  
  public final boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof ActionBarOverlayLayout.LayoutParams;
  }
  
  public final void draw(int paramInt1, int paramInt2, int[] paramArrayOfInt, int paramInt3) {}
  
  public final void draw(Canvas paramCanvas)
  {
    super.draw(paramCanvas);
    if (mWindowContentOverlay != null)
    {
      int i;
      if (mActionBarTop.getVisibility() == 0)
      {
        float f = mActionBarTop.getBottom();
        i = (int)(mActionBarTop.getTranslationY() + f + 0.5F);
      }
      else
      {
        i = 0;
      }
      mWindowContentOverlay.setBounds(0, i, getWidth(), mWindowContentOverlay.getIntrinsicHeight() + i);
      mWindowContentOverlay.draw(paramCanvas);
    }
  }
  
  public final boolean fitSystemWindows(android.graphics.Rect paramRect)
  {
    return super.fitSystemWindows(paramRect);
  }
  
  public final ViewGroup.LayoutParams generateDefaultLayoutParams()
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public int getActionBarHideOffset()
  {
    ActionBarContainer localActionBarContainer = mActionBarTop;
    if (localActionBarContainer != null) {
      return -(int)localActionBarContainer.getTranslationY();
    }
    return 0;
  }
  
  public int getNestedScrollAxes()
  {
    NestedScrollingParentHelper localNestedScrollingParentHelper = mParentHelper;
    int i = mNestedScrollAxes;
    return b | i;
  }
  
  public CharSequence getTitle()
  {
    pullChildren();
    return mDecorToolbar).mToolbar.getTitle();
  }
  
  public final void haltActionBarHideOffsetAnimations()
  {
    removeCallbacks(mRemoveActionBarHideOffset);
    removeCallbacks(mAddActionBarHideOffset);
    ViewPropertyAnimator localViewPropertyAnimator = animator;
    if (localViewPropertyAnimator != null) {
      localViewPropertyAnimator.cancel();
    }
  }
  
  public final void init(int paramInt)
  {
    pullChildren();
    if (paramInt != 2)
    {
      if (paramInt != 5)
      {
        if (paramInt != 109) {
          return;
        }
        setOverlayMode(true);
        return;
      }
      ((ToolbarWidgetWrapper)mDecorToolbar).getClass();
      Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
      return;
    }
    ((ToolbarWidgetWrapper)mDecorToolbar).getClass();
    Log.i("ToolbarWidgetWrapper", "Progress display unsupported");
  }
  
  public final void init(android.content.Context paramContext)
  {
    TypedArray localTypedArray = getContext().getTheme().obtainStyledAttributes(ATTRS);
    boolean bool = false;
    mActionBarHeight = localTypedArray.getDimensionPixelSize(0, 0);
    Drawable localDrawable = localTypedArray.getDrawable(1);
    mWindowContentOverlay = localDrawable;
    if (localDrawable == null) {
      bool = true;
    }
    setWillNotDraw(bool);
    localTypedArray.recycle();
    mFlingEstimator = new OverScroller(paramContext);
  }
  
  public final WindowInsets onApplyWindowInsets(WindowInsets paramWindowInsets)
  {
    pullChildren();
    Object localObject1 = TypeToken.get(paramWindowInsets, this);
    paramWindowInsets = a;
    Object localObject2 = new android.graphics.Rect(addleft, addright, addheight, addtop);
    boolean bool1 = applyInsets(mActionBarTop, (android.graphics.Rect)localObject2, false);
    localObject2 = ViewCompat.this$0;
    localObject2 = mInnerInsets;
    ViewCompatLollipop.get(this, (TypeToken)localObject1, (android.graphics.Rect)localObject2);
    localObject1 = paramWindowInsets.get(left, top, right, bottom);
    left = ((TypeToken)localObject1);
    boolean bool3 = right.equals(localObject1);
    boolean bool2 = true;
    if (!bool3)
    {
      right = left;
      bool1 = true;
    }
    localObject1 = mLastInnerInsets;
    if (!((android.graphics.Rect)localObject1).equals(localObject2))
    {
      ((android.graphics.Rect)localObject1).set((android.graphics.Rect)localObject2);
      bool1 = bool2;
    }
    if (bool1) {
      requestLayout();
    }
    return equalsa.get().a.wrap().unwrap();
  }
  
  public final void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    init(getContext());
    paramConfiguration = ViewCompat.this$0;
    app.View.requestApplyInsets(this);
  }
  
  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    haltActionBarHideOffsetAnimations();
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt2 = getChildCount();
    paramInt3 = getPaddingLeft();
    paramInt4 = getPaddingTop();
    paramInt1 = 0;
    while (paramInt1 < paramInt2)
    {
      android.view.View localView = getChildAt(paramInt1);
      if (localView.getVisibility() != 8)
      {
        ActionBarOverlayLayout.LayoutParams localLayoutParams = (ActionBarOverlayLayout.LayoutParams)localView.getLayoutParams();
        int i = localView.getMeasuredWidth();
        int j = localView.getMeasuredHeight();
        int k = leftMargin + paramInt3;
        int m = topMargin + paramInt4;
        localView.layout(k, m, i + k, j + m);
      }
      paramInt1 += 1;
    }
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: fail exe a25 = a24\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:92)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.dfs(Cfg.java:255)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze0(BaseAnalyze.java:75)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze(BaseAnalyze.java:69)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:274)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\nCaused by: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:552)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:1)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:166)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:331)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:387)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:90)\n\t... 17 more\n");
  }
  
  public final boolean onNestedFling(android.view.View paramView, float paramFloat1, float paramFloat2, boolean paramBoolean)
  {
    if ((mHideOnContentScroll) && (paramBoolean))
    {
      mFlingEstimator.fling(0, 0, 0, (int)paramFloat2, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
      if (mFlingEstimator.getFinalY() > mActionBarTop.getHeight())
      {
        haltActionBarHideOffsetAnimations();
        mAddActionBarHideOffset.run();
      }
      else
      {
        haltActionBarHideOffsetAnimations();
        mRemoveActionBarHideOffset.run();
      }
      mAnimatingForFling = true;
      return true;
    }
    return false;
  }
  
  public final boolean onNestedPreFling(android.view.View paramView, float paramFloat1, float paramFloat2)
  {
    return false;
  }
  
  public final void onNestedPreScroll(android.view.View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt) {}
  
  public final void onNestedScroll(android.view.View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramInt1 = mHideOnContentScrollReference + paramInt2;
    mHideOnContentScrollReference = paramInt1;
    setActionBarHideOffset(paramInt1);
  }
  
  public final void onNestedScroll(NestedScrollView paramNestedScrollView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt5 == 0) {
      onNestedScroll(paramNestedScrollView, paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public final void onNestedScroll(NestedScrollView paramNestedScrollView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int[] paramArrayOfInt)
  {
    onNestedScroll(paramNestedScrollView, paramInt1, paramInt2, paramInt3, paramInt4, paramInt5);
  }
  
  public final void onNestedScrollAccepted(android.view.View paramView1, android.view.View paramView2, int paramInt)
  {
    mParentHelper.mNestedScrollAxes = paramInt;
    mHideOnContentScrollReference = getActionBarHideOffset();
    haltActionBarHideOffsetAnimations();
    paramView1 = mActionBarVisibilityCallback;
    if (paramView1 != null)
    {
      paramView1 = (WindowDecorActionBar)paramView1;
      paramView2 = mCurrentShowAnim;
      if (paramView2 != null)
      {
        paramView2.cancel();
        mCurrentShowAnim = null;
      }
    }
  }
  
  public final boolean onStartNestedScroll(android.view.View paramView1, android.view.View paramView2, int paramInt)
  {
    if (((paramInt & 0x2) != 0) && (mActionBarTop.getVisibility() == 0)) {
      return mHideOnContentScroll;
    }
    return false;
  }
  
  public final boolean onStartNestedScroll(android.view.View paramView1, android.view.View paramView2, int paramInt1, int paramInt2)
  {
    return (paramInt2 == 0) && (onStartNestedScroll(paramView1, paramView2, paramInt1));
  }
  
  public final void onStopNestedScroll(android.view.View paramView)
  {
    if ((mHideOnContentScroll) && (!mAnimatingForFling))
    {
      if (mHideOnContentScrollReference <= mActionBarTop.getHeight())
      {
        haltActionBarHideOffsetAnimations();
        postDelayed(mRemoveActionBarHideOffset, 600L);
        return;
      }
      haltActionBarHideOffsetAnimations();
      postDelayed(mAddActionBarHideOffset, 600L);
    }
  }
  
  public final void onStopNestedScroll(android.view.View paramView, int paramInt)
  {
    if (paramInt == 0) {
      onStopNestedScroll(paramView);
    }
  }
  
  public final void onStopNestedScroll(android.view.View paramView1, android.view.View paramView2, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 0) {
      onNestedScrollAccepted(paramView1, paramView2, paramInt1);
    }
  }
  
  public final void onWindowSystemUiVisibilityChanged(int paramInt)
  {
    super.onWindowSystemUiVisibilityChanged(paramInt);
    pullChildren();
    int k = mLastSystemUiVisibility;
    mLastSystemUiVisibility = paramInt;
    int i;
    if ((paramInt & 0x4) == 0) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if ((paramInt & 0x100) != 0) {
      j = 1;
    } else {
      j = 0;
    }
    Object localObject = mActionBarVisibilityCallback;
    if (localObject != null)
    {
      localObject = (WindowDecorActionBar)localObject;
      mContentAnimations = (j ^ 0x1);
      if ((i == 0) && (j != 0))
      {
        if (!mHiddenBySystem)
        {
          mHiddenBySystem = true;
          ((WindowDecorActionBar)localObject).updateVisibility(true);
        }
      }
      else if (mHiddenBySystem)
      {
        mHiddenBySystem = false;
        ((WindowDecorActionBar)localObject).updateVisibility(true);
      }
    }
    if ((((k ^ paramInt) & 0x100) != 0) && (mActionBarVisibilityCallback != null))
    {
      localObject = ViewCompat.this$0;
      app.View.requestApplyInsets(this);
    }
  }
  
  public final void onWindowVisibilityChanged(int paramInt)
  {
    super.onWindowVisibilityChanged(paramInt);
    mWindowVisibility = paramInt;
    ActionBarOverlayLayout.ActionBarVisibilityCallback localActionBarVisibilityCallback = mActionBarVisibilityCallback;
    if (localActionBarVisibilityCallback != null) {
      mCurWindowVisibility = paramInt;
    }
  }
  
  public final void pullChildren()
  {
    if (mContent == null)
    {
      mContent = ((ContentFrameLayout)findViewById(2131230760));
      mActionBarTop = ((ActionBarContainer)findViewById(2131230761));
      Object localObject = findViewById(2131230759);
      if ((localObject instanceof DecorToolbar))
      {
        localObject = (DecorToolbar)localObject;
      }
      else
      {
        if (!(localObject instanceof Toolbar)) {
          break label79;
        }
        localObject = ((Toolbar)localObject).getWrapper();
      }
      mDecorToolbar = ((DecorToolbar)localObject);
      return;
      label79:
      throw new IllegalStateException("Can't make a decor toolbar out of ".concat(localObject.getClass().getSimpleName()));
    }
  }
  
  public void setActionBarHideOffset(int paramInt)
  {
    haltActionBarHideOffsetAnimations();
    paramInt = Math.max(0, Math.min(paramInt, mActionBarTop.getHeight()));
    mActionBarTop.setTranslationY(-paramInt);
  }
  
  public void setActionBarVisibilityCallback(ActionBarOverlayLayout.ActionBarVisibilityCallback paramActionBarVisibilityCallback)
  {
    mActionBarVisibilityCallback = paramActionBarVisibilityCallback;
    if (getWindowToken() != null)
    {
      paramActionBarVisibilityCallback = mActionBarVisibilityCallback;
      int i = mWindowVisibility;
      mCurWindowVisibility = i;
      i = mLastSystemUiVisibility;
      if (i != 0)
      {
        onWindowSystemUiVisibilityChanged(i);
        paramActionBarVisibilityCallback = ViewCompat.this$0;
        app.View.requestApplyInsets(this);
      }
    }
  }
  
  public void setHasNonEmbeddedTabs(boolean paramBoolean)
  {
    mHasNonEmbeddedTabs = paramBoolean;
  }
  
  public void setHideOnContentScrollEnabled(boolean paramBoolean)
  {
    if (paramBoolean != mHideOnContentScroll)
    {
      mHideOnContentScroll = paramBoolean;
      if (!paramBoolean)
      {
        haltActionBarHideOffsetAnimations();
        setActionBarHideOffset(0);
      }
    }
  }
  
  public void setIcon(int paramInt)
  {
    pullChildren();
    ToolbarWidgetWrapper localToolbarWidgetWrapper = (ToolbarWidgetWrapper)mDecorToolbar;
    Drawable localDrawable;
    if (paramInt != 0) {
      localDrawable = drupal.Context.getDrawable(mToolbar.getContext(), paramInt);
    } else {
      localDrawable = null;
    }
    mIcon = localDrawable;
    localToolbarWidgetWrapper.updateToolbarLogo();
  }
  
  public void setIcon(Drawable paramDrawable)
  {
    pullChildren();
    ToolbarWidgetWrapper localToolbarWidgetWrapper = (ToolbarWidgetWrapper)mDecorToolbar;
    mIcon = paramDrawable;
    localToolbarWidgetWrapper.updateToolbarLogo();
  }
  
  public void setLogo(int paramInt)
  {
    pullChildren();
    ToolbarWidgetWrapper localToolbarWidgetWrapper = (ToolbarWidgetWrapper)mDecorToolbar;
    Drawable localDrawable;
    if (paramInt != 0) {
      localDrawable = drupal.Context.getDrawable(mToolbar.getContext(), paramInt);
    } else {
      localDrawable = null;
    }
    mLogo = localDrawable;
    localToolbarWidgetWrapper.updateToolbarLogo();
  }
  
  public final void setMenu(f paramF, menu.Object paramObject)
  {
    pullChildren();
    Object localObject = (ToolbarWidgetWrapper)mDecorToolbar;
    b localB = mActionMenuPresenter;
    Toolbar localToolbar = mToolbar;
    if (localB == null) {
      mActionMenuPresenter = new b(localToolbar.getContext());
    }
    localObject = mActionMenuPresenter;
    d = paramObject;
    if ((paramF == null) && (mMenuView == null)) {
      return;
    }
    localToolbar.ensureMenuView();
    paramObject = mMenuView.mMenu;
    if (paramObject == paramF) {
      return;
    }
    if (paramObject != null)
    {
      paramObject.b(mOuterActionMenuPresenter);
      paramObject.b(mExpandedMenuPresenter);
    }
    if (mExpandedMenuPresenter == null) {
      mExpandedMenuPresenter = new d(localToolbar);
    }
    s = true;
    if (paramF != null)
    {
      paramF.a((l)localObject, mPopupContext);
      paramF.a(mExpandedMenuPresenter, mPopupContext);
    }
    else
    {
      ((b)localObject).initForMenu(mPopupContext, null);
      mExpandedMenuPresenter.initForMenu(mPopupContext, null);
      ((b)localObject).updateMenuView();
      mExpandedMenuPresenter.updateMenuView();
    }
    mMenuView.setPopupTheme(mPopupTheme);
    mMenuView.setPresenter((b)localObject);
    mOuterActionMenuPresenter = ((b)localObject);
    localToolbar.a();
  }
  
  public void setOverlayMode(boolean paramBoolean)
  {
    mOverlayMode = paramBoolean;
  }
  
  public void setShowingForActionMode(boolean paramBoolean) {}
  
  public void setUiOptions(int paramInt) {}
  
  public void setWindowCallback(Window.Callback paramCallback)
  {
    pullChildren();
    mDecorToolbar).mWindowCallback = paramCallback;
  }
  
  public void setWindowTitle(CharSequence paramCharSequence)
  {
    pullChildren();
    ToolbarWidgetWrapper localToolbarWidgetWrapper = (ToolbarWidgetWrapper)mDecorToolbar;
    if (!mContext)
    {
      mTitle = paramCharSequence;
      if ((mDisplayOpts & 0x8) != 0)
      {
        Toolbar localToolbar = mToolbar;
        localToolbar.setTitle(paramCharSequence);
        if (mContext) {
          ViewCompat.a(localToolbar.getRootView(), paramCharSequence);
        }
      }
    }
  }
  
  public final boolean shouldDelayChildPressedState()
  {
    return false;
  }
}
