package androidx.appcompat.widget;

import Console.R.styleable;
import a.ClassWriter;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.text.TextUtils;
import android.text.TextUtils.TruncateAt;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.c;
import androidx.customview.view.AbsSavedState;
import app.ViewCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import menu.f;
import view.SupportMenuInflater;
import views.NumberPicker;

public class Toolbar
  extends ViewGroup
{
  public boolean G;
  public int after;
  public int before;
  public androidx.appcompat.app.b mActionMenuPresenterCallback;
  public final int mButtonGravity;
  public androidx.appcompat.app.ActionMenuView.MenuBuilderCallback mCallback;
  public ImageButton mCollapseButtonView;
  public final CharSequence mCollapseDescription;
  public final Drawable mCollapseIcon;
  public boolean mCollapsible;
  public RtlSpacingHelper mContentInsets;
  public boolean mEatingHover;
  public boolean mEatingTouch;
  public View mExpandedActionView;
  public d mExpandedMenuPresenter;
  public final int mGravity = 8388627;
  public final ArrayList mHiddenViews = new ArrayList();
  public ArrayList mListener = new ArrayList();
  public FloatingActionButton mLogoView;
  public final int mMaxButtonHeight;
  public ActionMenuView mMenuView;
  public final ActionMenuView.MenuBuilderCallback mMenuViewItemClickListener = new ActionMenuView.MenuBuilderCallback(this);
  public ImageButton mNavButtonView;
  public ActionMenuView.OnMenuItemClickListener mOnMenuItemClickListener;
  public b mOuterActionMenuPresenter;
  public android.content.Context mPopupContext;
  public int mPopupTheme;
  public final NumberPicker mShowOverflowMenuRunnable = new NumberPicker(4, this);
  public CharSequence mSubtitleText;
  public int mSubtitleTextAppearance;
  public ColorStateList mSubtitleTextColor;
  public BubbleTextView mSubtitleTextView;
  public final int[] mTempMargins = new int[2];
  public final ArrayList mTempViews = new ArrayList();
  public int mTitleMarginBottom;
  public int mTitleMarginEnd;
  public int mTitleMarginStart;
  public int mTitleMarginTop;
  public CharSequence mTitleText;
  public int mTitleTextAppearance;
  public ColorStateList mTitleTextColor;
  public BubbleTextView mTitleTextView;
  public ToolbarWidgetWrapper mWrapper;
  public final app.b this$0 = new app.b(new GifDrawable.3(this, 1));
  public OnBackInvokedCallback x;
  public OnBackInvokedDispatcher y;
  
  public Toolbar(android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 2130903310);
    Object localObject = getContext();
    int[] arrayOfInt = R.styleable.m;
    localObject = ClassWriter.obtainStyledAttributes((android.content.Context)localObject, paramAttributeSet, arrayOfInt, 2130903310);
    ViewCompat.init(this, paramContext, arrayOfInt, paramAttributeSet, (TypedArray)b, 2130903310);
    paramContext = (TypedArray)b;
    mTitleTextAppearance = paramContext.getResourceId(28, 0);
    mSubtitleTextAppearance = paramContext.getResourceId(19, 0);
    mGravity = paramContext.getInteger(0, 8388627);
    mButtonGravity = paramContext.getInteger(2, 48);
    int j = paramContext.getDimensionPixelOffset(22, 0);
    int i = j;
    if (paramContext.hasValue(27)) {
      i = paramContext.getDimensionPixelOffset(27, j);
    }
    mTitleMarginBottom = i;
    mTitleMarginTop = i;
    mTitleMarginEnd = i;
    mTitleMarginStart = i;
    i = paramContext.getDimensionPixelOffset(25, -1);
    if (i >= 0) {
      mTitleMarginStart = i;
    }
    i = paramContext.getDimensionPixelOffset(24, -1);
    if (i >= 0) {
      mTitleMarginEnd = i;
    }
    i = paramContext.getDimensionPixelOffset(26, -1);
    if (i >= 0) {
      mTitleMarginTop = i;
    }
    i = paramContext.getDimensionPixelOffset(23, -1);
    if (i >= 0) {
      mTitleMarginBottom = i;
    }
    mMaxButtonHeight = paramContext.getDimensionPixelSize(13, -1);
    i = paramContext.getDimensionPixelOffset(9, Integer.MIN_VALUE);
    j = paramContext.getDimensionPixelOffset(5, Integer.MIN_VALUE);
    int k = paramContext.getDimensionPixelSize(7, 0);
    int m = paramContext.getDimensionPixelSize(8, 0);
    setDirection();
    paramAttributeSet = mContentInsets;
    mIsRelative = false;
    if (k != Integer.MIN_VALUE)
    {
      mExplicitLeft = k;
      mLeft = k;
    }
    if (m != Integer.MIN_VALUE)
    {
      mExplicitRight = m;
      mRight = m;
    }
    if ((i != Integer.MIN_VALUE) || (j != Integer.MIN_VALUE)) {
      paramAttributeSet.setRelative(i, j);
    }
    after = paramContext.getDimensionPixelOffset(10, Integer.MIN_VALUE);
    before = paramContext.getDimensionPixelOffset(6, Integer.MIN_VALUE);
    mCollapseIcon = ((ClassWriter)localObject).getDrawable(4);
    mCollapseDescription = paramContext.getText(3);
    paramAttributeSet = paramContext.getText(21);
    if (!TextUtils.isEmpty(paramAttributeSet)) {
      setTitle(paramAttributeSet);
    }
    paramAttributeSet = paramContext.getText(18);
    if (!TextUtils.isEmpty(paramAttributeSet)) {
      setSubtitle(paramAttributeSet);
    }
    mPopupContext = getContext();
    setPopupTheme(paramContext.getResourceId(17, 0));
    paramAttributeSet = ((ClassWriter)localObject).getDrawable(16);
    if (paramAttributeSet != null) {
      setNavigationIcon(paramAttributeSet);
    }
    paramAttributeSet = paramContext.getText(15);
    if (!TextUtils.isEmpty(paramAttributeSet)) {
      setNavigationContentDescription(paramAttributeSet);
    }
    paramAttributeSet = ((ClassWriter)localObject).getDrawable(11);
    if (paramAttributeSet != null) {
      setLogo(paramAttributeSet);
    }
    paramAttributeSet = paramContext.getText(12);
    if (!TextUtils.isEmpty(paramAttributeSet)) {
      setLogoDescription(paramAttributeSet);
    }
    if (paramContext.hasValue(29)) {
      setTitleTextColor(((ClassWriter)localObject).init(29));
    }
    if (paramContext.hasValue(20)) {
      setSubtitleTextColor(((ClassWriter)localObject).init(20));
    }
    if (paramContext.hasValue(14))
    {
      i = paramContext.getResourceId(14, 0);
      getMenuInflater().inflate(i, getMenu());
    }
    ((ClassWriter)localObject).recycle();
  }
  
  private ArrayList getCurrentMenuItems()
  {
    ArrayList localArrayList = new ArrayList();
    Menu localMenu = getMenu();
    int i = 0;
    while (i < localMenu.size())
    {
      localArrayList.add(localMenu.getItem(i));
      i += 1;
    }
    return localArrayList;
  }
  
  public static int getHorizontalMargins(View paramView)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = paramView.getMarginStart();
    return paramView.getMarginEnd() + i;
  }
  
  private MenuInflater getMenuInflater()
  {
    return new SupportMenuInflater(getContext());
  }
  
  public static int getVerticalMargins(View paramView)
  {
    paramView = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    return topMargin + bottomMargin;
  }
  
  public static ActionBar.LayoutParams init()
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public static ActionBar.LayoutParams setCustomView(ViewGroup.LayoutParams paramLayoutParams)
  {
    boolean bool = paramLayoutParams instanceof ActionBar.LayoutParams;
    Object localObject;
    if (bool)
    {
      localObject = (ActionBar.LayoutParams)paramLayoutParams;
      paramLayoutParams = new ActionBar.LayoutParams((ActionBar.LayoutParams)localObject);
      mViewType = 0;
      mViewType = mViewType;
      return paramLayoutParams;
    }
    if (bool)
    {
      paramLayoutParams = new ActionBar.LayoutParams((ActionBar.LayoutParams)paramLayoutParams);
      mViewType = 0;
      return paramLayoutParams;
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams))
    {
      localObject = (ViewGroup.MarginLayoutParams)paramLayoutParams;
      paramLayoutParams = new ActionBar.LayoutParams((ViewGroup.LayoutParams)localObject);
      mViewType = 0;
      leftMargin = leftMargin;
      topMargin = topMargin;
      rightMargin = rightMargin;
      bottomMargin = bottomMargin;
      return paramLayoutParams;
    }
    paramLayoutParams = new ActionBar.LayoutParams(paramLayoutParams);
    mViewType = 0;
    return paramLayoutParams;
  }
  
  public final void a()
  {
    if (Build.VERSION.SDK_INT >= 33)
    {
      OnBackInvokedDispatcher localOnBackInvokedDispatcher = Frame.a(this);
      d localD = mExpandedMenuPresenter;
      int i;
      if ((localD != null) && (a != null) && (localOnBackInvokedDispatcher != null) && (isAttachedToWindow()) && (G)) {
        i = 1;
      } else {
        i = 0;
      }
      if ((i != 0) && (y == null))
      {
        if (x == null) {
          x = Frame.a(new GifDrawable.3(this, 0));
        }
        Frame.append(localOnBackInvokedDispatcher, x);
        y = localOnBackInvokedDispatcher;
        return;
      }
      if (i == 0)
      {
        localOnBackInvokedDispatcher = y;
        if (localOnBackInvokedDispatcher != null)
        {
          Frame.push(localOnBackInvokedDispatcher, x);
          y = null;
        }
      }
    }
  }
  
  public final void addCustomViewsWithGravity(ArrayList paramArrayList, int paramInt)
  {
    int j = getLayoutDirection();
    int i = 0;
    if (j == 1) {
      j = 1;
    } else {
      j = 0;
    }
    int m = getChildCount();
    int k = Gravity.getAbsoluteGravity(paramInt, getLayoutDirection());
    paramArrayList.clear();
    View localView;
    ActionBar.LayoutParams localLayoutParams;
    if (j != 0)
    {
      i = m - 1;
      while (i >= 0)
      {
        localView = getChildAt(i);
        localLayoutParams = (ActionBar.LayoutParams)localView.getLayoutParams();
        if ((mViewType == 0) && (shouldLayout(localView)))
        {
          paramInt = gravity;
          m = getLayoutDirection();
          j = Gravity.getAbsoluteGravity(paramInt, m) & 0x7;
          paramInt = j;
          if (j != 1)
          {
            paramInt = j;
            if (j != 3)
            {
              paramInt = j;
              if (j != 5) {
                if (m == 1) {
                  paramInt = 5;
                } else {
                  paramInt = 3;
                }
              }
            }
          }
          if (paramInt == k) {
            paramArrayList.add(localView);
          }
        }
        i -= 1;
      }
    }
    while (i < m)
    {
      localView = getChildAt(i);
      localLayoutParams = (ActionBar.LayoutParams)localView.getLayoutParams();
      if ((mViewType == 0) && (shouldLayout(localView)))
      {
        paramInt = gravity;
        int n = getLayoutDirection();
        j = Gravity.getAbsoluteGravity(paramInt, n) & 0x7;
        paramInt = j;
        if (j != 1)
        {
          paramInt = j;
          if (j != 3)
          {
            paramInt = j;
            if (j != 5) {
              if (n == 1) {
                paramInt = 5;
              } else {
                paramInt = 3;
              }
            }
          }
        }
        if (paramInt == k) {
          paramArrayList.add(localView);
        }
      }
      i += 1;
    }
  }
  
  public final void addSystemView(View paramView, boolean paramBoolean)
  {
    Object localObject = paramView.getLayoutParams();
    if (localObject == null) {
      localObject = init();
    } else if (!checkLayoutParams((ViewGroup.LayoutParams)localObject)) {
      localObject = setCustomView((ViewGroup.LayoutParams)localObject);
    } else {
      localObject = (ActionBar.LayoutParams)localObject;
    }
    mViewType = 1;
    if ((paramBoolean) && (mExpandedActionView != null))
    {
      paramView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      mHiddenViews.add(paramView);
      return;
    }
    addView(paramView, (ViewGroup.LayoutParams)localObject);
  }
  
  public final boolean checkLayoutParams(ViewGroup.LayoutParams paramLayoutParams)
  {
    return (super.checkLayoutParams(paramLayoutParams)) && ((paramLayoutParams instanceof ActionBar.LayoutParams));
  }
  
  public final void ensureCollapseButtonView()
  {
    if (mCollapseButtonView == null)
    {
      Object localObject = new ImageButton(getContext(), null, 2130903309);
      mCollapseButtonView = ((ImageButton)localObject);
      ((ImageButton)localObject).setImageDrawable(mCollapseIcon);
      mCollapseButtonView.setContentDescription(mCollapseDescription);
      localObject = init();
      gravity = (mButtonGravity & 0x70 | 0x800003);
      mViewType = 2;
      mCollapseButtonView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      mCollapseButtonView.setOnClickListener(new c(2, this));
    }
  }
  
  public final void ensureMenu()
  {
    ensureMenuView();
    Object localObject = mMenuView;
    if (mMenu == null)
    {
      localObject = (f)((ActionMenuView)localObject).getMenu();
      if (mExpandedMenuPresenter == null) {
        mExpandedMenuPresenter = new d(this);
      }
      mMenuView.setExpandedActionViewsExclusive(true);
      ((f)localObject).a(mExpandedMenuPresenter, mPopupContext);
      a();
    }
  }
  
  public final void ensureMenuView()
  {
    if (mMenuView == null)
    {
      Object localObject = new ActionMenuView(getContext(), null);
      mMenuView = ((ActionMenuView)localObject);
      ((ActionMenuView)localObject).setPopupTheme(mPopupTheme);
      mMenuView.setOnMenuItemClickListener(mMenuViewItemClickListener);
      localObject = mMenuView;
      androidx.appcompat.app.b localB = mActionMenuPresenterCallback;
      ActionMenuView.MenuBuilderCallback localMenuBuilderCallback = new ActionMenuView.MenuBuilderCallback(this);
      mActionMenuPresenterCallback = localB;
      mMenuBuilderCallback = localMenuBuilderCallback;
      localObject = init();
      gravity = (mButtonGravity & 0x70 | 0x800005);
      mMenuView.setLayoutParams((ViewGroup.LayoutParams)localObject);
      addSystemView(mMenuView, false);
    }
  }
  
  public final void ensureNavButtonView()
  {
    if (mNavButtonView == null)
    {
      mNavButtonView = new ImageButton(getContext(), null, 2130903309);
      ActionBar.LayoutParams localLayoutParams = init();
      gravity = (mButtonGravity & 0x70 | 0x800003);
      mNavButtonView.setLayoutParams(localLayoutParams);
    }
  }
  
  public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet paramAttributeSet)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final int getChildTop(View paramView, int paramInt)
  {
    ActionBar.LayoutParams localLayoutParams = (ActionBar.LayoutParams)paramView.getLayoutParams();
    int k = paramView.getMeasuredHeight();
    if (paramInt > 0) {
      paramInt = (k - paramInt) / 2;
    } else {
      paramInt = 0;
    }
    int j = gravity & 0x70;
    int i = j;
    if (j != 16)
    {
      i = j;
      if (j != 48)
      {
        i = j;
        if (j != 80) {
          i = mGravity & 0x70;
        }
      }
    }
    if (i != 48)
    {
      if (i != 80)
      {
        j = getPaddingTop();
        int m = getPaddingBottom();
        int n = getHeight();
        i = (n - j - m - k) / 2;
        paramInt = topMargin;
        if (i >= paramInt)
        {
          k = n - m - k - i - j;
          m = bottomMargin;
          paramInt = i;
          if (k < m) {
            paramInt = Math.max(0, i - (m - k));
          }
        }
        return j + paramInt;
      }
      return getHeight() - getPaddingBottom() - k - bottomMargin - paramInt;
    }
    return getPaddingTop() - paramInt;
  }
  
  public CharSequence getCollapseContentDescription()
  {
    ImageButton localImageButton = mCollapseButtonView;
    if (localImageButton != null) {
      return localImageButton.getContentDescription();
    }
    return null;
  }
  
  public Drawable getCollapseIcon()
  {
    ImageButton localImageButton = mCollapseButtonView;
    if (localImageButton != null) {
      return localImageButton.getDrawable();
    }
    return null;
  }
  
  public int getContentInsetEnd()
  {
    RtlSpacingHelper localRtlSpacingHelper = mContentInsets;
    if (localRtlSpacingHelper != null)
    {
      if (mIsRtl) {
        return mLeft;
      }
      return mRight;
    }
    return 0;
  }
  
  public int getContentInsetEndWithActions()
  {
    int i = before;
    if (i != Integer.MIN_VALUE) {
      return i;
    }
    return getContentInsetEnd();
  }
  
  public int getContentInsetLeft()
  {
    RtlSpacingHelper localRtlSpacingHelper = mContentInsets;
    if (localRtlSpacingHelper != null) {
      return mLeft;
    }
    return 0;
  }
  
  public int getContentInsetRight()
  {
    RtlSpacingHelper localRtlSpacingHelper = mContentInsets;
    if (localRtlSpacingHelper != null) {
      return mRight;
    }
    return 0;
  }
  
  public int getContentInsetStart()
  {
    RtlSpacingHelper localRtlSpacingHelper = mContentInsets;
    if (localRtlSpacingHelper != null)
    {
      if (mIsRtl) {
        return mRight;
      }
      return mLeft;
    }
    return 0;
  }
  
  public int getContentInsetStartWithNavigation()
  {
    int i = after;
    if (i != Integer.MIN_VALUE) {
      return i;
    }
    return getContentInsetStart();
  }
  
  public int getCurrentContentInsetEnd()
  {
    Object localObject = mMenuView;
    if (localObject != null)
    {
      localObject = mMenu;
      if ((localObject != null) && (((f)localObject).hasVisibleItems())) {
        return Math.max(getContentInsetEnd(), Math.max(before, 0));
      }
    }
    return getContentInsetEnd();
  }
  
  public int getCurrentContentInsetLeft()
  {
    if (getLayoutDirection() == 1) {
      return getCurrentContentInsetEnd();
    }
    return getCurrentContentInsetStart();
  }
  
  public int getCurrentContentInsetRight()
  {
    if (getLayoutDirection() == 1) {
      return getCurrentContentInsetStart();
    }
    return getCurrentContentInsetEnd();
  }
  
  public int getCurrentContentInsetStart()
  {
    if (getNavigationIcon() != null) {
      return Math.max(getContentInsetStart(), Math.max(after, 0));
    }
    return getContentInsetStart();
  }
  
  public Drawable getLogo()
  {
    FloatingActionButton localFloatingActionButton = mLogoView;
    if (localFloatingActionButton != null) {
      return localFloatingActionButton.getDrawable();
    }
    return null;
  }
  
  public CharSequence getLogoDescription()
  {
    FloatingActionButton localFloatingActionButton = mLogoView;
    if (localFloatingActionButton != null) {
      return localFloatingActionButton.getContentDescription();
    }
    return null;
  }
  
  public Menu getMenu()
  {
    ensureMenu();
    return mMenuView.getMenu();
  }
  
  public View getNavButtonView()
  {
    return mNavButtonView;
  }
  
  public CharSequence getNavigationContentDescription()
  {
    ImageButton localImageButton = mNavButtonView;
    if (localImageButton != null) {
      return localImageButton.getContentDescription();
    }
    return null;
  }
  
  public Drawable getNavigationIcon()
  {
    ImageButton localImageButton = mNavButtonView;
    if (localImageButton != null) {
      return localImageButton.getDrawable();
    }
    return null;
  }
  
  public b getOuterActionMenuPresenter()
  {
    return mOuterActionMenuPresenter;
  }
  
  public Drawable getOverflowIcon()
  {
    ensureMenu();
    return mMenuView.getOverflowIcon();
  }
  
  public android.content.Context getPopupContext()
  {
    return mPopupContext;
  }
  
  public int getPopupTheme()
  {
    return mPopupTheme;
  }
  
  public CharSequence getSubtitle()
  {
    return mSubtitleText;
  }
  
  public final TextView getSubtitleTextView()
  {
    return mSubtitleTextView;
  }
  
  public CharSequence getTitle()
  {
    return mTitleText;
  }
  
  public int getTitleMarginBottom()
  {
    return mTitleMarginBottom;
  }
  
  public int getTitleMarginEnd()
  {
    return mTitleMarginEnd;
  }
  
  public int getTitleMarginStart()
  {
    return mTitleMarginStart;
  }
  
  public int getTitleMarginTop()
  {
    return mTitleMarginTop;
  }
  
  public final TextView getTitleTextView()
  {
    return mTitleTextView;
  }
  
  public DecorToolbar getWrapper()
  {
    if (mWrapper == null) {
      mWrapper = new ToolbarWidgetWrapper(this, true);
    }
    return mWrapper;
  }
  
  public final boolean isChildOrHidden(View paramView)
  {
    return (paramView.getParent() == this) || (mHiddenViews.contains(paramView));
  }
  
  public final boolean isOverflowMenuShowing()
  {
    Object localObject = mMenuView;
    if (localObject != null)
    {
      localObject = mPresenter;
      if ((localObject != null) && (((b)localObject).c())) {
        return true;
      }
    }
    return false;
  }
  
  public final int layoutChildLeft(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    ActionBar.LayoutParams localLayoutParams = (ActionBar.LayoutParams)paramView.getLayoutParams();
    int i = leftMargin - paramArrayOfInt[0];
    paramInt1 = Math.max(0, i) + paramInt1;
    paramArrayOfInt[0] = Math.max(0, -i);
    paramInt2 = getChildTop(paramView, paramInt2);
    i = paramView.getMeasuredWidth();
    paramView.layout(paramInt1, paramInt2, paramInt1 + i, paramView.getMeasuredHeight() + paramInt2);
    return i + rightMargin + paramInt1;
  }
  
  public final int layoutChildRight(View paramView, int paramInt1, int paramInt2, int[] paramArrayOfInt)
  {
    ActionBar.LayoutParams localLayoutParams = (ActionBar.LayoutParams)paramView.getLayoutParams();
    int i = rightMargin - paramArrayOfInt[1];
    paramInt1 -= Math.max(0, i);
    paramArrayOfInt[1] = Math.max(0, -i);
    paramInt2 = getChildTop(paramView, paramInt2);
    i = paramView.getMeasuredWidth();
    paramView.layout(paramInt1 - i, paramInt2, paramInt1, paramView.getMeasuredHeight() + paramInt2);
    return paramInt1 - (i + leftMargin);
  }
  
  public final int measureChildCollapseMargins(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int[] paramArrayOfInt)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int j = leftMargin - paramArrayOfInt[0];
    int k = rightMargin - paramArrayOfInt[1];
    int i = Math.max(0, j);
    i = Math.max(0, k) + i;
    paramArrayOfInt[0] = Math.max(0, -j);
    paramArrayOfInt[1] = Math.max(0, -k);
    j = getPaddingLeft();
    paramInt1 = ViewGroup.getChildMeasureSpec(paramInt1, getPaddingRight() + j + i + paramInt2, width);
    paramInt2 = getPaddingTop();
    paramView.measure(paramInt1, ViewGroup.getChildMeasureSpec(paramInt3, getPaddingBottom() + paramInt2 + topMargin + bottomMargin + paramInt4, height));
    return paramView.getMeasuredWidth() + i;
  }
  
  public final void measureChildConstrained(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    ViewGroup.MarginLayoutParams localMarginLayoutParams = (ViewGroup.MarginLayoutParams)paramView.getLayoutParams();
    int i = getPaddingLeft();
    i = ViewGroup.getChildMeasureSpec(paramInt1, getPaddingRight() + i + leftMargin + rightMargin + paramInt2, width);
    paramInt1 = getPaddingTop();
    paramInt3 = ViewGroup.getChildMeasureSpec(paramInt3, getPaddingBottom() + paramInt1 + topMargin + bottomMargin, height);
    paramInt1 = paramInt3;
    int j = View.MeasureSpec.getMode(paramInt3);
    paramInt2 = paramInt1;
    if (j != 1073741824)
    {
      paramInt2 = paramInt1;
      if (paramInt4 >= 0)
      {
        paramInt1 = paramInt4;
        if (j != 0) {
          paramInt1 = Math.min(View.MeasureSpec.getSize(paramInt3), paramInt4);
        }
        paramInt2 = View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
      }
    }
    paramView.measure(i, paramInt2);
  }
  
  public final void onAttachedToWindow()
  {
    super.onAttachedToWindow();
    a();
  }
  
  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    removeCallbacks(mShowOverflowMenuRunnable);
    a();
  }
  
  public final boolean onHoverEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    if (i == 9) {
      mEatingHover = false;
    }
    if (!mEatingHover)
    {
      boolean bool = super.onHoverEvent(paramMotionEvent);
      if ((i == 9) && (!bool)) {
        mEatingHover = true;
      }
    }
    if ((i == 10) || (i == 3)) {
      mEatingHover = false;
    }
    return true;
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (getLayoutDirection() == 1) {
      k = 1;
    } else {
      k = 0;
    }
    int i1 = getWidth();
    int i4 = getHeight();
    paramInt3 = getPaddingLeft();
    int i2 = getPaddingRight();
    int i3 = getPaddingTop();
    int i5 = getPaddingBottom();
    int m = i1 - i2;
    int[] arrayOfInt = mTempMargins;
    arrayOfInt[1] = 0;
    arrayOfInt[0] = 0;
    Object localObject1 = ViewCompat.this$0;
    paramInt1 = getMinimumHeight();
    if (paramInt1 >= 0) {
      paramInt2 = Math.min(paramInt1, paramInt4 - paramInt2);
    } else {
      paramInt2 = 0;
    }
    if (shouldLayout(mNavButtonView)) {
      if (k != 0)
      {
        paramInt1 = layoutChildRight(mNavButtonView, m, paramInt2, arrayOfInt);
        j = paramInt3;
        break label169;
      }
    }
    for (int j = layoutChildLeft(mNavButtonView, paramInt3, paramInt2, arrayOfInt);; j = paramInt3)
    {
      paramInt1 = m;
      break;
    }
    label169:
    paramInt4 = paramInt1;
    int i = j;
    if (shouldLayout(mCollapseButtonView)) {
      if (k != 0)
      {
        paramInt4 = layoutChildRight(mCollapseButtonView, paramInt1, paramInt2, arrayOfInt);
        i = j;
      }
      else
      {
        i = layoutChildLeft(mCollapseButtonView, j, paramInt2, arrayOfInt);
        paramInt4 = paramInt1;
      }
    }
    paramInt1 = paramInt4;
    j = i;
    if (shouldLayout(mMenuView)) {
      if (k != 0)
      {
        j = layoutChildLeft(mMenuView, i, paramInt2, arrayOfInt);
        paramInt1 = paramInt4;
      }
      else
      {
        paramInt1 = layoutChildRight(mMenuView, paramInt4, paramInt2, arrayOfInt);
        j = i;
      }
    }
    paramInt4 = getCurrentContentInsetLeft();
    i = getCurrentContentInsetRight();
    arrayOfInt[0] = Math.max(0, paramInt4 - j);
    arrayOfInt[1] = Math.max(0, i - (m - paramInt1));
    int n = Math.max(j, paramInt4);
    paramInt4 = n;
    m = Math.min(paramInt1, m - i);
    i = m;
    paramInt1 = paramInt4;
    j = i;
    if (shouldLayout(mExpandedActionView)) {
      if (k != 0)
      {
        j = layoutChildRight(mExpandedActionView, m, paramInt2, arrayOfInt);
        paramInt1 = paramInt4;
      }
      else
      {
        paramInt1 = layoutChildLeft(mExpandedActionView, n, paramInt2, arrayOfInt);
        j = i;
      }
    }
    i = paramInt1;
    paramInt4 = j;
    if (shouldLayout(mLogoView)) {
      if (k != 0)
      {
        paramInt4 = layoutChildRight(mLogoView, j, paramInt2, arrayOfInt);
        i = paramInt1;
      }
      else
      {
        i = layoutChildLeft(mLogoView, paramInt1, paramInt2, arrayOfInt);
        paramInt4 = j;
      }
    }
    paramBoolean = shouldLayout(mTitleTextView);
    boolean bool = shouldLayout(mSubtitleTextView);
    if (paramBoolean)
    {
      localObject1 = (ActionBar.LayoutParams)mTitleTextView.getLayoutParams();
      paramInt1 = topMargin;
      j = mTitleTextView.getMeasuredHeight();
      paramInt1 = bottomMargin + (j + paramInt1);
    }
    else
    {
      paramInt1 = 0;
    }
    m = paramInt1;
    if (bool)
    {
      localObject1 = (ActionBar.LayoutParams)mSubtitleTextView.getLayoutParams();
      j = topMargin;
      m = paramInt1 + (mSubtitleTextView.getMeasuredHeight() + j + bottomMargin);
    }
    Object localObject2;
    if ((!paramBoolean) && (!bool))
    {
      paramInt1 = i;
      i = paramInt4;
    }
    else
    {
      if (paramBoolean) {
        localObject1 = mTitleTextView;
      } else {
        localObject1 = mSubtitleTextView;
      }
      if (bool) {
        localObject2 = mSubtitleTextView;
      } else {
        localObject2 = mTitleTextView;
      }
      localObject1 = (ActionBar.LayoutParams)((View)localObject1).getLayoutParams();
      localObject2 = (ActionBar.LayoutParams)((View)localObject2).getLayoutParams();
      if (((paramBoolean) && (mTitleTextView.getMeasuredWidth() > 0)) || ((bool) && (mSubtitleTextView.getMeasuredWidth() > 0))) {
        j = 1;
      } else {
        j = 0;
      }
      paramInt1 = mGravity & 0x70;
      if (paramInt1 != 48)
      {
        if (paramInt1 != 80)
        {
          n = (i4 - i3 - i5 - m) / 2;
          paramInt1 = topMargin + mTitleMarginTop;
          if (n >= paramInt1)
          {
            m = i4 - i5 - m - n - i3;
            i4 = bottomMargin;
            i5 = mTitleMarginBottom;
            paramInt1 = n;
            if (m < i4 + i5) {
              paramInt1 = Math.max(0, n - (bottomMargin + i5 - m));
            }
          }
          paramInt1 = i3 + paramInt1;
        }
        else
        {
          paramInt1 = i4 - i5 - bottomMargin - mTitleMarginBottom - m;
        }
      }
      else {
        paramInt1 = getPaddingTop() + topMargin + mTitleMarginTop;
      }
      if (k != 0)
      {
        if (j != 0) {}
        for (k = mTitleMarginStart;; k = 0) {
          break;
        }
        k -= arrayOfInt[1];
        paramInt4 -= Math.max(0, k);
        arrayOfInt[1] = Math.max(0, -k);
        if (paramBoolean)
        {
          localObject1 = (ActionBar.LayoutParams)mTitleTextView.getLayoutParams();
          m = paramInt4 - mTitleTextView.getMeasuredWidth();
          k = mTitleTextView.getMeasuredHeight() + paramInt1;
          mTitleTextView.layout(m, paramInt1, paramInt4, k);
          paramInt1 = m - mTitleMarginEnd;
          m = k + bottomMargin;
        }
        else
        {
          k = paramInt4;
          m = paramInt1;
          paramInt1 = k;
        }
        if (bool)
        {
          k = m + mSubtitleTextView.getLayoutParams()).topMargin;
          m = mSubtitleTextView.getMeasuredWidth();
          n = mSubtitleTextView.getMeasuredHeight();
          mSubtitleTextView.layout(paramInt4 - m, k, paramInt4, n + k);
          k = paramInt4 - mTitleMarginEnd;
        }
        else
        {
          k = paramInt4;
        }
        if (j != 0) {
          paramInt4 = Math.min(paramInt1, k);
        }
        paramInt1 = i;
        i = paramInt4;
      }
      else
      {
        if (j != 0) {}
        for (k = mTitleMarginStart;; k = 0) {
          break;
        }
        k -= arrayOfInt[0];
        i = Math.max(0, k) + i;
        arrayOfInt[0] = Math.max(0, -k);
        if (paramBoolean)
        {
          localObject1 = (ActionBar.LayoutParams)mTitleTextView.getLayoutParams();
          k = mTitleTextView.getMeasuredWidth() + i;
          m = mTitleTextView.getMeasuredHeight() + paramInt1;
          mTitleTextView.layout(i, paramInt1, k, m);
          k += mTitleMarginEnd;
          paramInt1 = m + bottomMargin;
        }
        else
        {
          k = i;
        }
        if (bool)
        {
          paramInt1 += mSubtitleTextView.getLayoutParams()).topMargin;
          m = mSubtitleTextView.getMeasuredWidth() + i;
          n = mSubtitleTextView.getMeasuredHeight();
          mSubtitleTextView.layout(i, paramInt1, m, n + paramInt1);
          m += mTitleMarginEnd;
        }
        else
        {
          m = i;
        }
        paramInt1 = i;
        i = paramInt4;
        if (j != 0)
        {
          paramInt1 = Math.max(k, m);
          i = paramInt4;
        }
      }
    }
    m = paramInt3;
    int k = paramInt2;
    localObject1 = mTempViews;
    addCustomViewsWithGravity((ArrayList)localObject1, 3);
    paramInt3 = ((ArrayList)localObject1).size();
    paramInt2 = 0;
    while (paramInt2 < paramInt3)
    {
      paramInt1 = layoutChildLeft((View)((ArrayList)localObject1).get(paramInt2), paramInt1, k, arrayOfInt);
      paramInt2 += 1;
    }
    addCustomViewsWithGravity((ArrayList)localObject1, 5);
    paramInt3 = ((ArrayList)localObject1).size();
    paramInt2 = 0;
    while (paramInt2 < paramInt3)
    {
      i = layoutChildRight((View)((ArrayList)localObject1).get(paramInt2), i, k, arrayOfInt);
      paramInt2 += 1;
    }
    addCustomViewsWithGravity((ArrayList)localObject1, 1);
    j = arrayOfInt[0];
    paramInt4 = arrayOfInt[1];
    n = ((ArrayList)localObject1).size();
    paramInt3 = 0;
    paramInt2 = 0;
    while (paramInt3 < n)
    {
      localObject2 = (View)((ArrayList)localObject1).get(paramInt3);
      ActionBar.LayoutParams localLayoutParams = (ActionBar.LayoutParams)((View)localObject2).getLayoutParams();
      j = leftMargin - j;
      paramInt4 = rightMargin - paramInt4;
      i3 = Math.max(0, j);
      i4 = Math.max(0, paramInt4);
      j = Math.max(0, -j);
      paramInt4 = Math.max(0, -paramInt4);
      paramInt2 += ((View)localObject2).getMeasuredWidth() + i3 + i4;
      paramInt3 += 1;
    }
    paramInt3 = 0;
    paramInt4 = (i1 - m - i2) / 2 + m - paramInt2 / 2;
    paramInt2 += paramInt4;
    if (paramInt4 >= paramInt1) {
      if (paramInt2 > i) {
        paramInt1 = paramInt4 - (paramInt2 - i);
      } else {
        paramInt1 = paramInt4;
      }
    }
    paramInt4 = ((ArrayList)localObject1).size();
    paramInt2 = paramInt3;
    while (paramInt2 < paramInt4)
    {
      paramInt1 = layoutChildLeft((View)((ArrayList)localObject1).get(paramInt2), paramInt1, k, arrayOfInt);
      paramInt2 += 1;
    }
    ((ArrayList)localObject1).clear();
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    boolean bool = R.id.this$0;
    int i = getLayoutDirection();
    int i3 = 0;
    if (i == 1)
    {
      i2 = 1;
      i1 = 0;
    }
    else
    {
      i1 = 1;
      i2 = 0;
    }
    if (shouldLayout(mNavButtonView))
    {
      measureChildConstrained(mNavButtonView, paramInt1, 0, paramInt2, mMaxButtonHeight);
      i = mNavButtonView.getMeasuredWidth();
      n = getHorizontalMargins(mNavButtonView) + i;
      i = mNavButtonView.getMeasuredHeight();
      m = Math.max(0, getVerticalMargins(mNavButtonView) + i);
      k = View.combineMeasuredStates(0, mNavButtonView.getMeasuredState());
    }
    else
    {
      n = 0;
      m = 0;
      k = 0;
    }
    int j = m;
    i = k;
    if (shouldLayout(mCollapseButtonView))
    {
      measureChildConstrained(mCollapseButtonView, paramInt1, 0, paramInt2, mMaxButtonHeight);
      i = mCollapseButtonView.getMeasuredWidth();
      n = getHorizontalMargins(mCollapseButtonView) + i;
      i = mCollapseButtonView.getMeasuredHeight();
      j = Math.max(m, getVerticalMargins(mCollapseButtonView) + i);
      i = View.combineMeasuredStates(k, mCollapseButtonView.getMeasuredState());
    }
    int k = getCurrentContentInsetStart();
    int m = Math.max(k, n);
    k = Math.max(0, k - n);
    Object localObject = mTempMargins;
    localObject[i2] = k;
    if (shouldLayout(mMenuView))
    {
      measureChildConstrained(mMenuView, paramInt1, m, paramInt2, mMaxButtonHeight);
      k = mMenuView.getMeasuredWidth();
      k = getHorizontalMargins(mMenuView) + k;
      n = mMenuView.getMeasuredHeight();
      j = Math.max(j, getVerticalMargins(mMenuView) + n);
      i = View.combineMeasuredStates(i, mMenuView.getMeasuredState());
    }
    else
    {
      k = 0;
    }
    int n = getCurrentContentInsetEnd();
    int i2 = m + Math.max(n, k);
    localObject[i1] = Math.max(0, n - k);
    m = j;
    k = i;
    n = i2;
    if (shouldLayout(mExpandedActionView))
    {
      n = i2 + measureChildCollapseMargins(mExpandedActionView, paramInt1, i2, paramInt2, 0, (int[])localObject);
      k = mExpandedActionView.getMeasuredHeight();
      m = Math.max(j, getVerticalMargins(mExpandedActionView) + k);
      k = View.combineMeasuredStates(i, mExpandedActionView.getMeasuredState());
    }
    j = m;
    i = k;
    int i1 = n;
    if (shouldLayout(mLogoView))
    {
      i1 = n + measureChildCollapseMargins(mLogoView, paramInt1, n, paramInt2, 0, (int[])localObject);
      i = mLogoView.getMeasuredHeight();
      j = Math.max(m, getVerticalMargins(mLogoView) + i);
      i = View.combineMeasuredStates(k, mLogoView.getMeasuredState());
    }
    int i4 = getChildCount();
    k = 0;
    m = j;
    while (k < i4)
    {
      View localView = getChildAt(k);
      i2 = m;
      n = i;
      j = i1;
      if (getLayoutParamsmViewType == 0) {
        if (!shouldLayout(localView))
        {
          i2 = m;
          n = i;
          j = i1;
        }
        else
        {
          j = i1 + measureChildCollapseMargins(localView, paramInt1, i1, paramInt2, 0, (int[])localObject);
          n = localView.getMeasuredHeight();
          i2 = Math.max(m, getVerticalMargins(localView) + n);
          n = View.combineMeasuredStates(i, localView.getMeasuredState());
        }
      }
      k += 1;
      m = i2;
      i = n;
      i1 = j;
    }
    n = mTitleMarginTop + mTitleMarginBottom;
    i2 = mTitleMarginStart + mTitleMarginEnd;
    if (shouldLayout(mTitleTextView))
    {
      measureChildCollapseMargins(mTitleTextView, paramInt1, i1 + i2, paramInt2, n, (int[])localObject);
      j = mTitleTextView.getMeasuredWidth();
      k = getHorizontalMargins(mTitleTextView) + j;
      j = mTitleTextView.getMeasuredHeight();
      j = getVerticalMargins(mTitleTextView) + j;
      i = View.combineMeasuredStates(i, mTitleTextView.getMeasuredState());
    }
    else
    {
      j = 0;
      k = 0;
    }
    if (shouldLayout(mSubtitleTextView))
    {
      k = Math.max(k, measureChildCollapseMargins(mSubtitleTextView, paramInt1, i1 + i2, paramInt2, j + n, (int[])localObject));
      n = mSubtitleTextView.getMeasuredHeight();
      j = getVerticalMargins(mSubtitleTextView) + n + j;
      i = View.combineMeasuredStates(i, mSubtitleTextView.getMeasuredState());
    }
    for (;;)
    {
      break;
    }
    m = Math.max(m, j);
    j = getPaddingLeft();
    i4 = getPaddingRight();
    n = getPaddingTop();
    i2 = getPaddingBottom();
    j = View.resolveSizeAndState(Math.max(i4 + j + (i1 + k), getSuggestedMinimumWidth()), paramInt1, 0xFF000000 & i);
    i = View.resolveSizeAndState(Math.max(i2 + n + m, getSuggestedMinimumHeight()), paramInt2, i << 16);
    if (mCollapsible)
    {
      k = getChildCount();
      paramInt1 = 0;
    }
    for (;;)
    {
      paramInt2 = i3;
      if (paramInt1 >= k) {
        break;
      }
      localObject = getChildAt(paramInt1);
      if ((shouldLayout((View)localObject)) && (((View)localObject).getMeasuredWidth() > 0) && (((View)localObject).getMeasuredHeight() > 0))
      {
        paramInt2 = i;
        break;
      }
      paramInt1 += 1;
    }
    setMeasuredDimension(j, paramInt2);
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    if (!(paramParcelable instanceof SavedState))
    {
      super.onRestoreInstanceState(paramParcelable);
      return;
    }
    SavedState localSavedState = (SavedState)paramParcelable;
    super.onRestoreInstanceState(mSuperState);
    paramParcelable = mMenuView;
    if (paramParcelable != null) {
      paramParcelable = mMenu;
    } else {
      paramParcelable = null;
    }
    int i = expandedMenuItemId;
    if ((i != 0) && (mExpandedMenuPresenter != null) && (paramParcelable != null))
    {
      paramParcelable = paramParcelable.findItem(i);
      if (paramParcelable != null) {
        paramParcelable.expandActionView();
      }
    }
    if (isOverflowOpen)
    {
      paramParcelable = mShowOverflowMenuRunnable;
      removeCallbacks(paramParcelable);
      post(paramParcelable);
    }
  }
  
  public final void onRtlPropertiesChanged(int paramInt)
  {
    super.onRtlPropertiesChanged(paramInt);
    setDirection();
    RtlSpacingHelper localRtlSpacingHelper = mContentInsets;
    boolean bool = true;
    if (paramInt != 1) {
      bool = false;
    }
    if (bool == mIsRtl) {
      return;
    }
    mIsRtl = bool;
    if (mIsRelative)
    {
      if (bool)
      {
        paramInt = mEnd;
        if (paramInt == Integer.MIN_VALUE) {
          paramInt = mExplicitLeft;
        }
        mLeft = paramInt;
        paramInt = mStart;
        if (paramInt == Integer.MIN_VALUE) {
          paramInt = mExplicitRight;
        }
        mRight = paramInt;
        return;
      }
      paramInt = mStart;
      if (paramInt == Integer.MIN_VALUE) {
        paramInt = mExplicitLeft;
      }
      mLeft = paramInt;
      paramInt = mEnd;
      if (paramInt == Integer.MIN_VALUE) {
        paramInt = mExplicitRight;
      }
      mRight = paramInt;
      return;
    }
    mLeft = mExplicitLeft;
    mRight = mExplicitRight;
  }
  
  public final Parcelable onSaveInstanceState()
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    int i = paramMotionEvent.getActionMasked();
    if (i == 0) {
      mEatingTouch = false;
    }
    if (!mEatingTouch)
    {
      boolean bool = super.onTouchEvent(paramMotionEvent);
      if ((i == 0) && (!bool)) {
        mEatingTouch = true;
      }
    }
    if ((i == 1) || (i == 3)) {
      mEatingTouch = false;
    }
    return true;
  }
  
  public final void run()
  {
    Object localObject1 = mListener.iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (MenuItem)((Iterator)localObject1).next();
      getMenu().removeItem(((MenuItem)localObject2).getItemId());
    }
    getMenu();
    localObject1 = getCurrentMenuItems();
    getMenuInflater();
    this$0.b();
    Object localObject2 = getCurrentMenuItems();
    ((ArrayList)localObject2).removeAll((Collection)localObject1);
    mListener = ((ArrayList)localObject2);
  }
  
  public void setBackInvokedCallbackEnabled(boolean paramBoolean)
  {
    if (G != paramBoolean)
    {
      G = paramBoolean;
      a();
    }
  }
  
  public void setCollapseContentDescription(int paramInt)
  {
    CharSequence localCharSequence;
    if (paramInt != 0) {
      localCharSequence = getContext().getText(paramInt);
    } else {
      localCharSequence = null;
    }
    setCollapseContentDescription(localCharSequence);
  }
  
  public void setCollapseContentDescription(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence)) {
      ensureCollapseButtonView();
    }
    ImageButton localImageButton = mCollapseButtonView;
    if (localImageButton != null) {
      localImageButton.setContentDescription(paramCharSequence);
    }
  }
  
  public void setCollapseIcon(int paramInt)
  {
    setCollapseIcon(drupal.Context.getDrawable(getContext(), paramInt));
  }
  
  public void setCollapseIcon(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      ensureCollapseButtonView();
      mCollapseButtonView.setImageDrawable(paramDrawable);
      return;
    }
    paramDrawable = mCollapseButtonView;
    if (paramDrawable != null) {
      paramDrawable.setImageDrawable(mCollapseIcon);
    }
  }
  
  public void setCollapsible(boolean paramBoolean)
  {
    mCollapsible = paramBoolean;
    requestLayout();
  }
  
  public void setContentInsetEndWithActions(int paramInt)
  {
    int i = paramInt;
    if (paramInt < 0) {
      i = Integer.MIN_VALUE;
    }
    if (i != before)
    {
      before = i;
      if (getNavigationIcon() != null) {
        requestLayout();
      }
    }
  }
  
  public void setContentInsetStartWithNavigation(int paramInt)
  {
    int i = paramInt;
    if (paramInt < 0) {
      i = Integer.MIN_VALUE;
    }
    if (i != after)
    {
      after = i;
      if (getNavigationIcon() != null) {
        requestLayout();
      }
    }
  }
  
  public final void setDirection()
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public void setLogo(int paramInt)
  {
    setLogo(drupal.Context.getDrawable(getContext(), paramInt));
  }
  
  public void setLogo(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      if (mLogoView == null) {
        mLogoView = new FloatingActionButton(getContext(), null, 0);
      }
      if (!isChildOrHidden(mLogoView)) {
        addSystemView(mLogoView, true);
      }
    }
    else
    {
      localFloatingActionButton = mLogoView;
      if ((localFloatingActionButton != null) && (isChildOrHidden(localFloatingActionButton)))
      {
        removeView(mLogoView);
        mHiddenViews.remove(mLogoView);
      }
    }
    FloatingActionButton localFloatingActionButton = mLogoView;
    if (localFloatingActionButton != null) {
      localFloatingActionButton.setImageDrawable(paramDrawable);
    }
  }
  
  public void setLogoDescription(int paramInt)
  {
    setLogoDescription(getContext().getText(paramInt));
  }
  
  public void setLogoDescription(CharSequence paramCharSequence)
  {
    if ((!TextUtils.isEmpty(paramCharSequence)) && (mLogoView == null)) {
      mLogoView = new FloatingActionButton(getContext(), null, 0);
    }
    FloatingActionButton localFloatingActionButton = mLogoView;
    if (localFloatingActionButton != null) {
      localFloatingActionButton.setContentDescription(paramCharSequence);
    }
  }
  
  public void setNavigationContentDescription(int paramInt)
  {
    CharSequence localCharSequence;
    if (paramInt != 0) {
      localCharSequence = getContext().getText(paramInt);
    } else {
      localCharSequence = null;
    }
    setNavigationContentDescription(localCharSequence);
  }
  
  public void setNavigationContentDescription(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence)) {
      ensureNavButtonView();
    }
    ImageButton localImageButton = mNavButtonView;
    if (localImageButton != null)
    {
      localImageButton.setContentDescription(paramCharSequence);
      drupal.Context.b(mNavButtonView, paramCharSequence);
    }
  }
  
  public void setNavigationIcon(int paramInt)
  {
    setNavigationIcon(drupal.Context.getDrawable(getContext(), paramInt));
  }
  
  public void setNavigationIcon(Drawable paramDrawable)
  {
    if (paramDrawable != null)
    {
      ensureNavButtonView();
      if (!isChildOrHidden(mNavButtonView)) {
        addSystemView(mNavButtonView, true);
      }
    }
    else
    {
      localImageButton = mNavButtonView;
      if ((localImageButton != null) && (isChildOrHidden(localImageButton)))
      {
        removeView(mNavButtonView);
        mHiddenViews.remove(mNavButtonView);
      }
    }
    ImageButton localImageButton = mNavButtonView;
    if (localImageButton != null) {
      localImageButton.setImageDrawable(paramDrawable);
    }
  }
  
  public void setNavigationOnClickListener(View.OnClickListener paramOnClickListener)
  {
    ensureNavButtonView();
    mNavButtonView.setOnClickListener(paramOnClickListener);
  }
  
  public void setOnMenuItemClickListener(ActionMenuView.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    mOnMenuItemClickListener = paramOnMenuItemClickListener;
  }
  
  public void setOverflowIcon(Drawable paramDrawable)
  {
    ensureMenu();
    mMenuView.setOverflowIcon(paramDrawable);
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
  
  public void setSubtitle(int paramInt)
  {
    setSubtitle(getContext().getText(paramInt));
  }
  
  public void setSubtitle(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (mSubtitleTextView == null)
      {
        localObject = getContext();
        BubbleTextView localBubbleTextView = new BubbleTextView((android.content.Context)localObject, null);
        mSubtitleTextView = localBubbleTextView;
        localBubbleTextView.setSingleLine();
        mSubtitleTextView.setEllipsize(TextUtils.TruncateAt.END);
        int i = mSubtitleTextAppearance;
        if (i != 0) {
          mSubtitleTextView.setTextAppearance((android.content.Context)localObject, i);
        }
        localObject = mSubtitleTextColor;
        if (localObject != null) {
          mSubtitleTextView.setTextColor((ColorStateList)localObject);
        }
      }
      if (!isChildOrHidden(mSubtitleTextView)) {
        addSystemView(mSubtitleTextView, true);
      }
    }
    else
    {
      localObject = mSubtitleTextView;
      if ((localObject != null) && (isChildOrHidden((View)localObject)))
      {
        removeView(mSubtitleTextView);
        mHiddenViews.remove(mSubtitleTextView);
      }
    }
    Object localObject = mSubtitleTextView;
    if (localObject != null) {
      ((TextView)localObject).setText(paramCharSequence);
    }
    mSubtitleText = paramCharSequence;
  }
  
  public void setSubtitleTextColor(int paramInt)
  {
    setSubtitleTextColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setSubtitleTextColor(ColorStateList paramColorStateList)
  {
    mSubtitleTextColor = paramColorStateList;
    BubbleTextView localBubbleTextView = mSubtitleTextView;
    if (localBubbleTextView != null) {
      localBubbleTextView.setTextColor(paramColorStateList);
    }
  }
  
  public void setTitle(int paramInt)
  {
    setTitle(getContext().getText(paramInt));
  }
  
  public void setTitle(CharSequence paramCharSequence)
  {
    if (!TextUtils.isEmpty(paramCharSequence))
    {
      if (mTitleTextView == null)
      {
        localObject = getContext();
        BubbleTextView localBubbleTextView = new BubbleTextView((android.content.Context)localObject, null);
        mTitleTextView = localBubbleTextView;
        localBubbleTextView.setSingleLine();
        mTitleTextView.setEllipsize(TextUtils.TruncateAt.END);
        int i = mTitleTextAppearance;
        if (i != 0) {
          mTitleTextView.setTextAppearance((android.content.Context)localObject, i);
        }
        localObject = mTitleTextColor;
        if (localObject != null) {
          mTitleTextView.setTextColor((ColorStateList)localObject);
        }
      }
      if (!isChildOrHidden(mTitleTextView)) {
        addSystemView(mTitleTextView, true);
      }
    }
    else
    {
      localObject = mTitleTextView;
      if ((localObject != null) && (isChildOrHidden((View)localObject)))
      {
        removeView(mTitleTextView);
        mHiddenViews.remove(mTitleTextView);
      }
    }
    Object localObject = mTitleTextView;
    if (localObject != null) {
      ((TextView)localObject).setText(paramCharSequence);
    }
    mTitleText = paramCharSequence;
  }
  
  public void setTitleMarginBottom(int paramInt)
  {
    mTitleMarginBottom = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginEnd(int paramInt)
  {
    mTitleMarginEnd = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginStart(int paramInt)
  {
    mTitleMarginStart = paramInt;
    requestLayout();
  }
  
  public void setTitleMarginTop(int paramInt)
  {
    mTitleMarginTop = paramInt;
    requestLayout();
  }
  
  public void setTitleTextColor(int paramInt)
  {
    setTitleTextColor(ColorStateList.valueOf(paramInt));
  }
  
  public void setTitleTextColor(ColorStateList paramColorStateList)
  {
    mTitleTextColor = paramColorStateList;
    BubbleTextView localBubbleTextView = mTitleTextView;
    if (localBubbleTextView != null) {
      localBubbleTextView.setTextColor(paramColorStateList);
    }
  }
  
  public final boolean shouldLayout(View paramView)
  {
    return (paramView != null) && (paramView.getParent() == this) && (paramView.getVisibility() != 8);
  }
  
  public final boolean showOverflowMenu()
  {
    Object localObject = mMenuView;
    if (localObject != null)
    {
      localObject = mPresenter;
      if ((localObject != null) && (((b)localObject).showOverflowMenu())) {
        return true;
      }
    }
    return false;
  }
  
  public static class SavedState
    extends AbsSavedState
  {
    public static final Parcelable.Creator<SavedState> CREATOR;
    public int expandedMenuItemId;
    public boolean isOverflowOpen;
    
    static
    {
      throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
    
    public SavedState(Parcel paramParcel)
    {
      this(paramParcel, null);
    }
    
    public SavedState(Parcel paramParcel, ClassLoader paramClassLoader)
    {
      super(paramClassLoader);
      expandedMenuItemId = paramParcel.readInt();
      boolean bool;
      if (paramParcel.readInt() != 0) {
        bool = true;
      } else {
        bool = false;
      }
      isOverflowOpen = bool;
    }
    
    public void writeToParcel(Parcel paramParcel, int paramInt)
    {
      throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s1stmt(TypeTransformer.java:810)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:840)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
    }
  }
}
