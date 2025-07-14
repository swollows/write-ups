package androidx.appcompat.app;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.View;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.appcompat.widget.d;
import app.ViewCompat;
import java.util.ArrayList;
import menu.h;
import views.NumberPicker;

public final class ToolbarActionBar
  extends ActionBar
{
  public boolean mLastMenuVisibility;
  public boolean mMenuCallbackSet;
  public final NumberPicker mMenuInvalidator = new NumberPicker(1, this);
  public final ArrayList mMenuVisibilityListeners = new ArrayList();
  public final ToolbarWidgetWrapper mToolbar;
  public final ActionMenuView.MenuBuilderCallback mWindow;
  public boolean r;
  public final WindowCallbackWrapper this$0;
  
  public ToolbarActionBar(Toolbar paramToolbar, CharSequence paramCharSequence, WindowCallbackWrapper paramWindowCallbackWrapper)
  {
    super();
    ActionMenuView.MenuBuilderCallback localMenuBuilderCallback = new ActionMenuView.MenuBuilderCallback(this);
    ToolbarWidgetWrapper localToolbarWidgetWrapper = new ToolbarWidgetWrapper(paramToolbar, false);
    mToolbar = localToolbarWidgetWrapper;
    paramWindowCallbackWrapper.getClass();
    this$0 = paramWindowCallbackWrapper;
    mWindowCallback = paramWindowCallbackWrapper;
    paramToolbar.setOnMenuItemClickListener(localMenuBuilderCallback);
    if (!mContext)
    {
      mTitle = paramCharSequence;
      if ((mDisplayOpts & 0x8) != 0)
      {
        paramToolbar = mToolbar;
        paramToolbar.setTitle(paramCharSequence);
        if (mContext) {
          ViewCompat.a(paramToolbar.getRootView(), paramCharSequence);
        }
      }
    }
    mWindow = new ActionMenuView.MenuBuilderCallback(this);
  }
  
  public final boolean collapseActionView()
  {
    d localD = mToolbar.mToolbar.mExpandedMenuPresenter;
    if (localD != null)
    {
      h localH = a;
      if (localH != null)
      {
        if (localD == null) {
          localH = null;
        }
        if (localH != null) {
          localH.collapseActionView();
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
    return mToolbar.mDisplayOpts;
  }
  
  public final Menu getMenu()
  {
    boolean bool = mMenuCallbackSet;
    ToolbarWidgetWrapper localToolbarWidgetWrapper = mToolbar;
    if (!bool)
    {
      b localB = new b(this);
      ActionMenuView.MenuBuilderCallback localMenuBuilderCallback = new ActionMenuView.MenuBuilderCallback(this);
      Object localObject = mToolbar;
      mActionMenuPresenterCallback = localB;
      mCallback = localMenuBuilderCallback;
      localObject = mMenuView;
      if (localObject != null)
      {
        mActionMenuPresenterCallback = localB;
        mMenuBuilderCallback = localMenuBuilderCallback;
      }
      mMenuCallbackSet = true;
    }
    return mToolbar.getMenu();
  }
  
  public final Context getThemedContext()
  {
    return mToolbar.mToolbar.getContext();
  }
  
  public final boolean invalidateOptionsMenu()
  {
    Object localObject1 = mToolbar;
    Object localObject2 = mToolbar;
    NumberPicker localNumberPicker = mMenuInvalidator;
    ((View)localObject2).removeCallbacks(localNumberPicker);
    localObject1 = mToolbar;
    localObject2 = ViewCompat.this$0;
    ((View)localObject1).postOnAnimation(localNumberPicker);
    return true;
  }
  
  public final boolean onKeyShortcut(int paramInt, KeyEvent paramKeyEvent)
  {
    Menu localMenu = getMenu();
    if (localMenu != null)
    {
      int i = KeyCharacterMap.load(paramKeyEvent.getDeviceId()).getKeyboardType();
      boolean bool = true;
      if (i == 1) {
        bool = false;
      }
      localMenu.setQwertyMode(bool);
      return localMenu.performShortcut(paramInt, paramKeyEvent, 0);
    }
    return false;
  }
  
  public final boolean onKeyShortcut(KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.getAction() == 1) {
      openOptionsMenu();
    }
    return true;
  }
  
  public final boolean openOptionsMenu()
  {
    return mToolbar.mToolbar.showOverflowMenu();
  }
  
  public final void setDisplayOptions(boolean paramBoolean) {}
  
  public final void setShowHideAnimationEnabled(boolean paramBoolean) {}
  
  public final void setTitle() {}
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    ToolbarWidgetWrapper localToolbarWidgetWrapper = mToolbar;
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
  
  public final void show()
  {
    mToolbar.mToolbar.removeCallbacks(mMenuInvalidator);
  }
  
  public final boolean showOverflowMenu()
  {
    Object localObject = mToolbar.mToolbar.mMenuView;
    if (localObject != null)
    {
      localObject = mPresenter;
      if ((localObject != null) && (((androidx.appcompat.widget.b)localObject).hideOverflowMenu())) {
        return true;
      }
    }
    return false;
  }
}
