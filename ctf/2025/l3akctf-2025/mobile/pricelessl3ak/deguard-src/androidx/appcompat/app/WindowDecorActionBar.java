package androidx.appcompat.app;

import Console.R.styleable;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.app.Dialog;
import android.content.pm.ApplicationInfo;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.BaseInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionBarOverlayLayout.ActionBarVisibilityCallback;
import androidx.appcompat.widget.DecorToolbar;
import androidx.appcompat.widget.ScrollingTabContainerView.VisibilityAnimListener;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.appcompat.widget.d;
import app.HoneycombMr1AnimatorCompatProvider.HoneycombValueAnimatorCompat.1;
import app.ViewCompat;
import app.ViewCompatLollipop;
import app.ViewPropertyAnimatorCompat;
import java.lang.ref.Reference;
import java.util.ArrayList;
import java.util.WeakHashMap;
import menu.h;
import view.ActionMode;
import view.ActionMode.Callback;
import view.ViewPropertyAnimatorCompatSet;
import views.i;

public final class WindowDecorActionBar
  extends ActionBar
  implements ActionBarOverlayLayout.ActionBarVisibilityCallback
{
  public static final DecelerateInterpolator ALLOW_SHOW_HIDE_ANIMATIONS = new DecelerateInterpolator();
  public static final AccelerateInterpolator sShowInterpolator = new AccelerateInterpolator();
  public WindowDecorActionBar.ActionModeImpl mActionMode;
  public final app.f mActivity;
  public ActionBarContainer mContainerView;
  public boolean mContentAnimations;
  public final android.view.View mContentView;
  public android.content.Context mContext;
  public ActionBarContextView mContextView;
  public int mCurWindowVisibility;
  public ViewPropertyAnimatorCompatSet mCurrentShowAnim;
  public DecorToolbar mDecorToolbar;
  public WindowDecorActionBar.ActionModeImpl mDeferredDestroyActionMode;
  public i mDeferredModeDestroyCallback;
  public boolean mDisplayHomeAsUpSet;
  public boolean mHiddenBySystem;
  public final MainActivity.2 mHideListener;
  public boolean mHideOnContentScroll;
  public boolean mLastMenuVisibility;
  public final ArrayList mMenuVisibilityListeners;
  public boolean mNowShowing;
  public ActionBarOverlayLayout mOverlayLayout;
  public boolean mShowHideAnimationEnabled;
  public final MainActivity.2 mShowListener;
  public boolean mShowingForMode;
  public android.content.Context mThemedContext;
  
  public WindowDecorActionBar(Activity paramActivity, boolean paramBoolean)
  {
    super();
    new ArrayList();
    mMenuVisibilityListeners = new ArrayList();
    mCurWindowVisibility = 0;
    mContentAnimations = true;
    mNowShowing = true;
    mHideListener = new MainActivity.2(this, 0);
    mShowListener = new MainActivity.2(this, 1);
    mActivity = new app.f(10, this);
    paramActivity = paramActivity.getWindow().getDecorView();
    init(paramActivity);
    if (!paramBoolean) {
      mContentView = paramActivity.findViewById(16908290);
    }
  }
  
  public WindowDecorActionBar(Dialog paramDialog)
  {
    super();
    new ArrayList();
    mMenuVisibilityListeners = new ArrayList();
    mCurWindowVisibility = 0;
    mContentAnimations = true;
    mNowShowing = true;
    mHideListener = new MainActivity.2(this, 0);
    mShowListener = new MainActivity.2(this, 1);
    mActivity = new app.f(10, this);
    init(paramDialog.getWindow().getDecorView());
  }
  
  public final boolean collapseActionView()
  {
    Object localObject = mDecorToolbar;
    if (localObject != null)
    {
      d localD = mToolbar.mExpandedMenuPresenter;
      if ((localD != null) && (a != null))
      {
        localObject = mToolbar.mExpandedMenuPresenter;
        if (localObject == null) {
          localObject = null;
        } else {
          localObject = a;
        }
        if (localObject != null) {
          ((h)localObject).collapseActionView();
        }
        return true;
      }
    }
    return false;
  }
  
  public final void dispatchMenuVisibilityChanged(boolean paramBoolean)
  {
    if (paramBoolean == mLastMenuVisibility) {
      return;
    }
    mLastMenuVisibility = paramBoolean;
    ArrayList localArrayList = mMenuVisibilityListeners;
    if (localArrayList.size() <= 0) {
      return;
    }
    localArrayList.get(0).getClass();
    throw new ClassCastException();
  }
  
  public final int getDisplayOptions()
  {
    return mDecorToolbar).mDisplayOpts;
  }
  
  public final android.content.Context getThemedContext()
  {
    if (mThemedContext == null)
    {
      TypedValue localTypedValue = new TypedValue();
      mContext.getTheme().resolveAttribute(2130903050, localTypedValue, true);
      int i = resourceId;
      if (i != 0) {
        mThemedContext = new ContextThemeWrapper(mContext, i);
      } else {
        mThemedContext = mContext;
      }
    }
    return mThemedContext;
  }
  
  public final void hide(boolean paramBoolean)
  {
    Object localObject1;
    if (paramBoolean)
    {
      if (!mShowingForMode)
      {
        mShowingForMode = true;
        localObject1 = mOverlayLayout;
        if (localObject1 != null) {
          ((ActionBarOverlayLayout)localObject1).setShowingForActionMode(true);
        }
        updateVisibility(false);
      }
    }
    else if (mShowingForMode)
    {
      mShowingForMode = false;
      localObject1 = mOverlayLayout;
      if (localObject1 != null) {
        ((ActionBarOverlayLayout)localObject1).setShowingForActionMode(false);
      }
      updateVisibility(false);
    }
    if (mContainerView.isLaidOut())
    {
      if (paramBoolean)
      {
        localObject3 = (ToolbarWidgetWrapper)mDecorToolbar;
        localObject1 = ViewCompat.animate(mToolbar);
        localObject2 = localObject1;
        ((ViewPropertyAnimatorCompat)localObject1).alpha(0.0F);
        ((ViewPropertyAnimatorCompat)localObject1).setDuration(100L);
        ((ViewPropertyAnimatorCompat)localObject1).setListener(new ScrollingTabContainerView.VisibilityAnimListener((ToolbarWidgetWrapper)localObject3, 4));
        localObject1 = mContextView.setupAnimatorToVisibility(0, 200L);
      }
      else
      {
        localObject2 = (ToolbarWidgetWrapper)mDecorToolbar;
        localObject1 = ViewCompat.animate(mToolbar);
        ((ViewPropertyAnimatorCompat)localObject1).alpha(1.0F);
        ((ViewPropertyAnimatorCompat)localObject1).setDuration(200L);
        ((ViewPropertyAnimatorCompat)localObject1).setListener(new ScrollingTabContainerView.VisibilityAnimListener((ToolbarWidgetWrapper)localObject2, 0));
        localObject2 = mContextView.setupAnimatorToVisibility(8, 100L);
      }
      Object localObject3 = new ViewPropertyAnimatorCompatSet();
      ArrayList localArrayList = mAnimators;
      localArrayList.add(localObject2);
      Object localObject2 = (android.view.View)mView.get();
      long l;
      if (localObject2 != null) {
        l = ((android.view.View)localObject2).animate().getDuration();
      } else {
        l = 0L;
      }
      localObject2 = (android.view.View)mView.get();
      if (localObject2 != null) {
        ((android.view.View)localObject2).animate().setStartDelay(l);
      }
      localArrayList.add(localObject1);
      ((ViewPropertyAnimatorCompatSet)localObject3).start();
      return;
    }
    if (paramBoolean)
    {
      mDecorToolbar).mToolbar.setVisibility(4);
      mContextView.setVisibility(0);
      return;
    }
    mDecorToolbar).mToolbar.setVisibility(0);
    mContextView.setVisibility(8);
  }
  
  public final void init(android.view.View paramView)
  {
    Object localObject = (ActionBarOverlayLayout)paramView.findViewById(2131230800);
    mOverlayLayout = ((ActionBarOverlayLayout)localObject);
    if (localObject != null) {
      ((ActionBarOverlayLayout)localObject).setActionBarVisibilityCallback(this);
    }
    localObject = paramView.findViewById(2131230759);
    if ((localObject instanceof DecorToolbar))
    {
      localObject = (DecorToolbar)localObject;
    }
    else
    {
      if (!(localObject instanceof Toolbar)) {
        break label332;
      }
      localObject = ((Toolbar)localObject).getWrapper();
    }
    mDecorToolbar = ((DecorToolbar)localObject);
    mContextView = ((ActionBarContextView)paramView.findViewById(2131230767));
    paramView = (ActionBarContainer)paramView.findViewById(2131230761);
    mContainerView = paramView;
    localObject = mDecorToolbar;
    if ((localObject != null) && (mContextView != null) && (paramView != null))
    {
      paramView = mToolbar.getContext();
      mContext = paramView;
      if ((mDecorToolbar).mDisplayOpts & 0x4) != 0) {
        i = 1;
      } else {
        i = 0;
      }
      if (i != 0) {
        mDisplayHomeAsUpSet = true;
      }
      int i = getApplicationInfotargetSdkVersion;
      mDecorToolbar.getClass();
      setHasEmbeddedTabs(paramView.getResources().getBoolean(2130968576));
      paramView = mContext.obtainStyledAttributes(null, R.styleable.ActionBar, 2130903045, 0);
      if (paramView.getBoolean(14, false))
      {
        localObject = mOverlayLayout;
        if (mOverlayMode)
        {
          mHideOnContentScroll = true;
          ((ActionBarOverlayLayout)localObject).setHideOnContentScrollEnabled(true);
        }
        else
        {
          throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
        }
      }
      i = paramView.getDimensionPixelSize(12, 0);
      if (i != 0)
      {
        float f = i;
        localObject = mContainerView;
        WeakHashMap localWeakHashMap = ViewCompat.this$0;
        ViewCompatLollipop.setElevation((android.view.View)localObject, f);
      }
      paramView.recycle();
      return;
    }
    throw new IllegalStateException(V.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    label332:
    if (localObject != null) {
      paramView = localObject.getClass().getSimpleName();
    } else {
      paramView = "null";
    }
    throw new IllegalStateException("Can't make a decor toolbar out of ".concat(paramView));
  }
  
  public final boolean onKeyShortcut(int paramInt, KeyEvent paramKeyEvent)
  {
    Object localObject = mActionMode;
    if (localObject == null) {
      return false;
    }
    localObject = mMenu;
    if (localObject != null)
    {
      int i = KeyCharacterMap.load(paramKeyEvent.getDeviceId()).getKeyboardType();
      boolean bool = true;
      if (i == 1) {
        bool = false;
      }
      ((menu.f)localObject).setQwertyMode(bool);
      return ((menu.f)localObject).performShortcut(paramInt, paramKeyEvent, 0);
    }
    return false;
  }
  
  public final void setDisplayOptions(boolean paramBoolean)
  {
    if (!mDisplayHomeAsUpSet)
    {
      int i;
      if (paramBoolean) {
        i = 4;
      } else {
        i = 0;
      }
      ToolbarWidgetWrapper localToolbarWidgetWrapper = (ToolbarWidgetWrapper)mDecorToolbar;
      int j = mDisplayOpts;
      mDisplayHomeAsUpSet = true;
      localToolbarWidgetWrapper.setDisplayOptions(i & 0x4 | j & 0xFFFFFFFB);
    }
  }
  
  public final void setHasEmbeddedTabs(boolean paramBoolean)
  {
    if (!paramBoolean)
    {
      ((ToolbarWidgetWrapper)mDecorToolbar).getClass();
      mContainerView.setTabContainer(null);
    }
    else
    {
      mContainerView.setTabContainer(null);
      ((ToolbarWidgetWrapper)mDecorToolbar).getClass();
    }
    mDecorToolbar.getClass();
    mDecorToolbar).mToolbar.setCollapsible(false);
    mOverlayLayout.setHasNonEmbeddedTabs(false);
  }
  
  public final void setShowHideAnimationEnabled(boolean paramBoolean)
  {
    mShowHideAnimationEnabled = paramBoolean;
    if (!paramBoolean)
    {
      ViewPropertyAnimatorCompatSet localViewPropertyAnimatorCompatSet = mCurrentShowAnim;
      if (localViewPropertyAnimatorCompatSet != null) {
        localViewPropertyAnimatorCompatSet.cancel();
      }
    }
  }
  
  public final void setTitle()
  {
    setHasEmbeddedTabs(mContext.getResources().getBoolean(2130968576));
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
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
  
  public final ActionMode startActionMode(i paramI)
  {
    WindowDecorActionBar.ActionModeImpl localActionModeImpl = mActionMode;
    if (localActionModeImpl != null) {
      localActionModeImpl.finish();
    }
    mOverlayLayout.setHideOnContentScrollEnabled(false);
    mContextView.initForMode();
    localActionModeImpl = new WindowDecorActionBar.ActionModeImpl(this, mContextView.getContext(), paramI);
    paramI = mMenu;
    paramI.g();
    try
    {
      boolean bool = ((ActionMode.Callback)mCallback.a).onCreateActionMode(localActionModeImpl, paramI);
      paramI.h();
      if (bool)
      {
        mActionMode = localActionModeImpl;
        localActionModeImpl.invalidate();
        mContextView.initForMode(localActionModeImpl);
        hide(true);
        return localActionModeImpl;
      }
      return null;
    }
    catch (Throwable localThrowable)
    {
      paramI.h();
      throw localThrowable;
    }
  }
  
  public final void updateVisibility(boolean paramBoolean)
  {
    boolean bool = mHiddenBySystem;
    if (mShowingForMode) {}
    while (!bool)
    {
      i = 1;
      break;
    }
    int i = 0;
    Object localObject3 = mContentView;
    Object localObject2 = null;
    Object localObject1 = null;
    app.f localF = mActivity;
    float f2;
    float f1;
    Object localObject4;
    Object localObject5;
    Object localObject6;
    if (i != 0)
    {
      if (!mNowShowing)
      {
        mNowShowing = true;
        localObject2 = mCurrentShowAnim;
        if (localObject2 != null) {
          ((ViewPropertyAnimatorCompatSet)localObject2).cancel();
        }
        mContainerView.setVisibility(0);
        i = mCurWindowVisibility;
        localObject2 = mShowListener;
        if ((i == 0) && ((mShowHideAnimationEnabled) || (paramBoolean)))
        {
          mContainerView.setTranslationY(0.0F);
          f2 = -mContainerView.getHeight();
          f1 = f2;
          if (paramBoolean)
          {
            localObject4 = new int[2];
            Object tmp145_143 = localObject4;
            tmp145_143[0] = 0;
            Object tmp149_145 = tmp145_143;
            tmp149_145[1] = 0;
            tmp149_145;
            mContainerView.getLocationInWindow((int[])localObject4);
            f1 = f2 - localObject4[1];
          }
          mContainerView.setTranslationY(f1);
          localObject4 = new ViewPropertyAnimatorCompatSet();
          localObject5 = ViewCompat.animate(mContainerView);
          ((ViewPropertyAnimatorCompat)localObject5).translationY(0.0F);
          localObject6 = (android.view.View)mView.get();
          if (localObject6 != null)
          {
            if (localF != null) {
              localObject1 = new HoneycombMr1AnimatorCompatProvider.HoneycombValueAnimatorCompat.1(localF, (android.view.View)localObject6);
            }
            ((android.view.View)localObject6).animate().setUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject1);
          }
          paramBoolean = mIsStarted;
          localObject1 = mAnimators;
          if (!paramBoolean) {
            ((ArrayList)localObject1).add(localObject5);
          }
          if ((mContentAnimations) && (localObject3 != null))
          {
            ((android.view.View)localObject3).setTranslationY(f1);
            localObject3 = ViewCompat.animate((android.view.View)localObject3);
            ((ViewPropertyAnimatorCompat)localObject3).translationY(0.0F);
            if (!mIsStarted) {
              ((ArrayList)localObject1).add(localObject3);
            }
          }
          localObject1 = ALLOW_SHOW_HIDE_ANIMATIONS;
          paramBoolean = mIsStarted;
          if (!paramBoolean) {
            mInterpolator = ((BaseInterpolator)localObject1);
          }
          if (!paramBoolean) {
            mDuration = 250L;
          }
          if (!paramBoolean) {
            mListener = ((drupal.Context)localObject2);
          }
          mCurrentShowAnim = ((ViewPropertyAnimatorCompatSet)localObject4);
          ((ViewPropertyAnimatorCompatSet)localObject4).start();
        }
        else
        {
          mContainerView.setAlpha(1.0F);
          mContainerView.setTranslationY(0.0F);
          if ((mContentAnimations) && (localObject3 != null)) {
            ((android.view.View)localObject3).setTranslationY(0.0F);
          }
          ((MainActivity.2)localObject2).onAnimationEnd();
        }
        localObject1 = mOverlayLayout;
        if (localObject1 != null)
        {
          localObject2 = ViewCompat.this$0;
          app.View.requestApplyInsets((android.view.View)localObject1);
        }
      }
    }
    else if (mNowShowing)
    {
      mNowShowing = false;
      localObject1 = mCurrentShowAnim;
      if (localObject1 != null) {
        ((ViewPropertyAnimatorCompatSet)localObject1).cancel();
      }
      i = mCurWindowVisibility;
      localObject4 = mHideListener;
      if ((i == 0) && ((mShowHideAnimationEnabled) || (paramBoolean)))
      {
        mContainerView.setAlpha(1.0F);
        mContainerView.setTransitioning(true);
        localObject5 = new ViewPropertyAnimatorCompatSet();
        f2 = -mContainerView.getHeight();
        f1 = f2;
        if (paramBoolean)
        {
          localObject1 = new int[2];
          Object tmp546_544 = localObject1;
          tmp546_544[0] = 0;
          Object tmp550_546 = tmp546_544;
          tmp550_546[1] = 0;
          tmp550_546;
          mContainerView.getLocationInWindow((int[])localObject1);
          f1 = f2 - localObject1[1];
        }
        localObject6 = ViewCompat.animate(mContainerView);
        ((ViewPropertyAnimatorCompat)localObject6).translationY(f1);
        android.view.View localView = (android.view.View)mView.get();
        if (localView != null)
        {
          localObject1 = localObject2;
          if (localF != null) {
            localObject1 = new HoneycombMr1AnimatorCompatProvider.HoneycombValueAnimatorCompat.1(localF, localView);
          }
          localView.animate().setUpdateListener((ValueAnimator.AnimatorUpdateListener)localObject1);
        }
        paramBoolean = mIsStarted;
        localObject1 = mAnimators;
        if (!paramBoolean) {
          ((ArrayList)localObject1).add(localObject6);
        }
        if ((mContentAnimations) && (localObject3 != null))
        {
          localObject2 = ViewCompat.animate((android.view.View)localObject3);
          ((ViewPropertyAnimatorCompat)localObject2).translationY(f1);
          if (!mIsStarted) {
            ((ArrayList)localObject1).add(localObject2);
          }
        }
        localObject1 = sShowInterpolator;
        paramBoolean = mIsStarted;
        if (!paramBoolean) {
          mInterpolator = ((BaseInterpolator)localObject1);
        }
        if (!paramBoolean) {
          mDuration = 250L;
        }
        if (!paramBoolean) {
          mListener = ((drupal.Context)localObject4);
        }
        mCurrentShowAnim = ((ViewPropertyAnimatorCompatSet)localObject5);
        ((ViewPropertyAnimatorCompatSet)localObject5).start();
        return;
      }
      ((MainActivity.2)localObject4).onAnimationEnd();
    }
  }
}
