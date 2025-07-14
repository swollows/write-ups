package androidx.appcompat.app;

import android.view.ActionMode.Callback;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.SearchEvent;
import android.view.View;
import android.view.Window.Callback;
import android.view.WindowManager.LayoutParams;
import android.view.accessibility.AccessibilityEvent;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import asm.Label;
import java.util.List;
import view.Preferences;
import view.RefreshableActivity;

public final class WindowCallbackWrapper
  implements Window.Callback
{
  public boolean a;
  public boolean mEatKeyUpEvent;
  public ActionMenuView.MenuBuilderCallback mMenu;
  public boolean mStarted;
  public final Window.Callback mWrapped;
  
  public WindowCallbackWrapper(AppCompatDelegateImplV7 paramAppCompatDelegateImplV7, Window.Callback paramCallback)
  {
    this$0 = paramAppCompatDelegateImplV7;
    if (paramCallback != null)
    {
      mWrapped = paramCallback;
      return;
    }
    throw new IllegalArgumentException("Window callback may not be null");
  }
  
  public final void a(int paramInt, Menu paramMenu)
  {
    mWrapped.onPanelClosed(paramInt, paramMenu);
  }
  
  public final void a(Window.Callback paramCallback)
  {
    try
    {
      mStarted = true;
      paramCallback.onContentChanged();
      mStarted = false;
      return;
    }
    catch (Throwable paramCallback)
    {
      mStarted = false;
      throw paramCallback;
    }
  }
  
  public final boolean dispatchGenericMotionEvent(MotionEvent paramMotionEvent)
  {
    return mWrapped.dispatchGenericMotionEvent(paramMotionEvent);
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    boolean bool = mEatKeyUpEvent;
    Window.Callback localCallback = mWrapped;
    if (bool) {
      return localCallback.dispatchKeyEvent(paramKeyEvent);
    }
    return (this$0.dispatchKeyEvent(paramKeyEvent)) || (localCallback.dispatchKeyEvent(paramKeyEvent));
  }
  
  public final boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
  {
    if (!mWrapped.dispatchKeyShortcutEvent(paramKeyEvent))
    {
      int i = paramKeyEvent.getKeyCode();
      AppCompatDelegateImplV7 localAppCompatDelegateImplV7 = this$0;
      localAppCompatDelegateImplV7.initWindowDecorActionBar();
      Object localObject = this$0;
      if ((localObject != null) && (((ActionBar)localObject).onKeyShortcut(i, paramKeyEvent))) {
        return true;
      }
      localObject = z;
      if ((localObject != null) && (localAppCompatDelegateImplV7.a((AppCompatDelegateImplV7.PanelFeatureState)localObject, paramKeyEvent.getKeyCode(), paramKeyEvent)))
      {
        paramKeyEvent = z;
        if (paramKeyEvent != null)
        {
          k = true;
          return true;
        }
      }
      else
      {
        if (z == null)
        {
          localObject = localAppCompatDelegateImplV7.a(0);
          localAppCompatDelegateImplV7.b((AppCompatDelegateImplV7.PanelFeatureState)localObject, paramKeyEvent);
          boolean bool = localAppCompatDelegateImplV7.a((AppCompatDelegateImplV7.PanelFeatureState)localObject, paramKeyEvent.getKeyCode(), paramKeyEvent);
          m = false;
          if (bool) {
            return true;
          }
        }
        return false;
      }
    }
    return true;
  }
  
  public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    return mWrapped.dispatchPopulateAccessibilityEvent(paramAccessibilityEvent);
  }
  
  public final boolean dispatchTouchEvent(MotionEvent paramMotionEvent)
  {
    return mWrapped.dispatchTouchEvent(paramMotionEvent);
  }
  
  public final boolean dispatchTrackballEvent(MotionEvent paramMotionEvent)
  {
    return mWrapped.dispatchTrackballEvent(paramMotionEvent);
  }
  
  public final void onActionModeFinished(android.view.ActionMode paramActionMode)
  {
    mWrapped.onActionModeFinished(paramActionMode);
  }
  
  public final void onActionModeStarted(android.view.ActionMode paramActionMode)
  {
    mWrapped.onActionModeStarted(paramActionMode);
  }
  
  public final void onAttachedToWindow()
  {
    mWrapped.onAttachedToWindow();
  }
  
  public final void onContentChanged()
  {
    if (mStarted) {
      mWrapped.onContentChanged();
    }
  }
  
  public final boolean onCreatePanelMenu(int paramInt, Menu paramMenu)
  {
    if ((paramInt == 0) && (!(paramMenu instanceof menu.f))) {
      return false;
    }
    return mWrapped.onCreatePanelMenu(paramInt, paramMenu);
  }
  
  public final View onCreatePanelView(int paramInt)
  {
    Object localObject = mMenu;
    if (localObject != null)
    {
      if (paramInt == 0) {
        localObject = new View(this$0.mToolbar.mToolbar.getContext());
      } else {
        localObject = null;
      }
      if (localObject != null) {
        return localObject;
      }
    }
    return mWrapped.onCreatePanelView(paramInt);
  }
  
  public final void onDetachedFromWindow()
  {
    mWrapped.onDetachedFromWindow();
  }
  
  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    return mWrapped.onMenuItemSelected(paramInt, paramMenuItem);
  }
  
  public final boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    onPreparePanel(paramInt, paramMenu);
    paramMenu = this$0;
    if (paramInt == 108)
    {
      paramMenu.initWindowDecorActionBar();
      paramMenu = this$0;
      if (paramMenu != null)
      {
        paramMenu.dispatchMenuVisibilityChanged(true);
        return true;
      }
    }
    else
    {
      paramMenu.getClass();
    }
    return true;
  }
  
  public final void onPanelClosed(int paramInt, Menu paramMenu)
  {
    if (a)
    {
      mWrapped.onPanelClosed(paramInt, paramMenu);
      return;
    }
    a(paramInt, paramMenu);
    paramMenu = this$0;
    if (paramInt == 108)
    {
      paramMenu.initWindowDecorActionBar();
      paramMenu = this$0;
      if (paramMenu != null) {
        paramMenu.dispatchMenuVisibilityChanged(false);
      }
    }
    else if (paramInt == 0)
    {
      AppCompatDelegateImplV7.PanelFeatureState localPanelFeatureState = paramMenu.a(paramInt);
      if (p) {
        paramMenu.a(localPanelFeatureState, false);
      }
    }
    else
    {
      paramMenu.getClass();
    }
  }
  
  public final void onPointerCaptureChanged(boolean paramBoolean)
  {
    RefreshableActivity.doRefresh(mWrapped, paramBoolean);
  }
  
  public final void onPreparePanel(List paramList, Menu paramMenu, int paramInt)
  {
    view.f.a(mWrapped, paramList, paramMenu, paramInt);
  }
  
  public final boolean onPreparePanel(int paramInt, Menu paramMenu)
  {
    return mWrapped.onMenuOpened(paramInt, paramMenu);
  }
  
  public final boolean onPreparePanel(int paramInt, View paramView, Menu paramMenu)
  {
    menu.f localF;
    if ((paramMenu instanceof menu.f)) {
      localF = (menu.f)paramMenu;
    } else {
      localF = null;
    }
    if ((paramInt == 0) && (localF == null)) {
      return false;
    }
    if (localF != null) {
      D = true;
    }
    Object localObject = mMenu;
    if ((localObject != null) && (paramInt == 0))
    {
      localObject = this$0;
      if (!r)
      {
        mToolbar.i = true;
        r = true;
      }
    }
    boolean bool = mWrapped.onPreparePanel(paramInt, paramView, paramMenu);
    if (localF != null) {
      D = false;
    }
    return bool;
  }
  
  public final void onProvideKeyboardShortcuts(List paramList, Menu paramMenu, int paramInt)
  {
    menu.f localF = this$0.a(0).j;
    if (localF != null)
    {
      onPreparePanel(paramList, localF, paramInt);
      return;
    }
    onPreparePanel(paramList, paramMenu, paramInt);
  }
  
  public final boolean onSearchRequested()
  {
    return mWrapped.onSearchRequested();
  }
  
  public final boolean onSearchRequested(SearchEvent paramSearchEvent)
  {
    return Preferences.onMenuItemSelected(mWrapped, paramSearchEvent);
  }
  
  public final void onWindowAttributesChanged(WindowManager.LayoutParams paramLayoutParams)
  {
    mWrapped.onWindowAttributesChanged(paramLayoutParams);
  }
  
  public final void onWindowFocusChanged(boolean paramBoolean)
  {
    mWrapped.onWindowFocusChanged(paramBoolean);
  }
  
  public final android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback)
  {
    return null;
  }
  
  public final android.view.ActionMode onWindowStartingActionMode(ActionMode.Callback paramCallback, int paramInt)
  {
    Object localObject = this$0;
    localObject.getClass();
    if (paramInt != 0) {
      return Preferences.startAsSupportActionMode(mWrapped, paramCallback, paramInt);
    }
    paramCallback = new Label(mContext, paramCallback);
    localObject = ((AppCompatDelegateImplV7)localObject).startSupportActionModeFromWindow(paramCallback);
    if (localObject != null) {
      return paramCallback.getActionModeWrapper((view.ActionMode)localObject);
    }
    return null;
  }
}
