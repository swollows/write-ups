package androidx.appcompat.app;

import Console.R.styleable;
import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.ComponentName;
import android.content.ContextWrapper;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.media.AudioManager;
import android.os.BaseBundle;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.LocaleList;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.Log;
import android.util.LongSparseArray;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.LayoutInflater.Factory2;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewManager;
import android.view.Window;
import android.view.Window.Callback;
import android.view.WindowManager;
import android.view.WindowManager.LayoutParams;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.view.menu.ExpandedMenuView;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.DecorContentParent;
import androidx.appcompat.widget.TintManager;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.ToolbarWidgetWrapper;
import androidx.appcompat.widget.b;
import androidx.lifecycle.c;
import androidx.lifecycle.x;
import app.ViewCompat;
import app.ViewPropertyAnimatorCompat;
import http.AbstractMultimap;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Set;
import java.util.WeakHashMap;
import menu.e.a;
import menu.f.a;
import menu.i;
import menu.v;
import sync.Label;
import view.ActionMode;
import view.ActionMode.Callback;
import view.ContextThemeWrapper;
import view.SupportMenuInflater;

public final class AppCompatDelegateImplV7
  extends f
  implements f.a, LayoutInflater.Factory2
{
  public static final int[] i = { 16842836 };
  public static final boolean k = "robolectric".equals(Build.FINGERPRINT) ^ true;
  public static final AbstractMultimap m = new AbstractMultimap(0);
  public int A;
  public OnBackInvokedDispatcher a;
  public boolean b;
  public final Object c;
  public CharSequence d;
  public AppCompatDelegateImplV7.PanelFeatureState[] f;
  public Item g;
  public Item h;
  public a j;
  public boolean l;
  public ActionMode mActionMode;
  public PopupWindow mActionModePopup;
  public ActionBarContextView mActionModeView;
  public final Object mActivity;
  public final android.content.Context mContext;
  public DecorContentParent mDecorContentParent;
  public boolean mEatKeyUpEvent;
  public ViewPropertyAnimatorCompat mFadeAnim;
  public boolean mFeatureIndeterminateProgress;
  public boolean mFeatureProgress;
  public boolean mHasActionBar;
  public final AppCompatDelegateImplV7.5 mInvalidatePanelMenuRunnable;
  public boolean mIsFloating;
  public SupportMenuInflater mMenuInflater;
  public WindowCallbackWrapper mOriginalWindowCallback;
  public boolean mOverlayActionBar;
  public boolean mOverlayActionMode;
  public AppCompatDelegateImplV7.5 mShowActionModePopup;
  public View mStatusGuard;
  public ViewGroup mSubDecor;
  public boolean mSubDecorInstalled;
  public Rect mTempRect1;
  public Rect mTempRect2;
  public TextView mTitleView;
  public Window mWindow;
  public boolean mWindowNoTitle;
  public final int n;
  public int o;
  public boolean p;
  public int q;
  public Configuration r;
  public boolean s;
  public boolean t;
  public ActionBar this$0;
  public Switch type;
  public boolean v;
  public boolean w;
  public a x;
  public OnBackInvokedCallback y;
  public AppCompatDelegateImplV7.PanelFeatureState z;
  
  public AppCompatDelegateImplV7(android.content.Context paramContext, Window paramWindow, AppCompatCallback paramAppCompatCallback, Object paramObject)
  {
    super();
    Object localObject = null;
    mFadeAnim = null;
    n = -100;
    mInvalidatePanelMenuRunnable = new AppCompatDelegateImplV7.5(this, 0);
    mContext = paramContext;
    mActivity = paramAppCompatCallback;
    c = paramObject;
    if ((paramObject instanceof Dialog))
    {
      for (;;)
      {
        paramAppCompatCallback = localObject;
        if (paramContext == null) {
          break;
        }
        if ((paramContext instanceof AppCompatActivity))
        {
          paramAppCompatCallback = (AppCompatActivity)paramContext;
          break;
        }
        paramAppCompatCallback = localObject;
        if (!(paramContext instanceof ContextWrapper)) {
          break;
        }
        paramContext = ((ContextWrapper)paramContext).getBaseContext();
      }
      if (paramAppCompatCallback != null) {
        n = getDelegaten;
      }
    }
    if (n == -100)
    {
      paramContext = m;
      paramAppCompatCallback = (Integer)paramContext.get(c.getClass().getName());
      if (paramAppCompatCallback != null)
      {
        n = paramAppCompatCallback.intValue();
        paramContext.remove(c.getClass().getName());
      }
    }
    if (paramWindow != null) {
      a(paramWindow);
    }
    AppCompatDrawableManager.read();
  }
  
  public static Configuration a(android.content.Context paramContext, int paramInt, Label paramLabel, Configuration paramConfiguration, boolean paramBoolean)
  {
    if (paramInt != 1)
    {
      if (paramInt != 2)
      {
        if (paramBoolean) {
          paramInt = 0;
        } else {
          paramInt = getApplicationContextgetResourcesgetConfigurationuiMode & 0x30;
        }
      }
      else {
        paramInt = 32;
      }
    }
    else {
      paramInt = 16;
    }
    paramContext = new Configuration();
    fontScale = 0.0F;
    if (paramConfiguration != null) {
      paramContext.setTo(paramConfiguration);
    }
    uiMode = (paramInt | uiMode & 0xFFFFFFCF);
    if (paramLabel != null) {
      Widget.a(paramContext, paramLabel);
    }
    return paramContext;
  }
  
  public static Label a(android.content.Context paramContext)
  {
    if (Build.VERSION.SDK_INT >= 33) {
      return null;
    }
    Object localObject = f.c;
    if (localObject == null) {
      return null;
    }
    Label localLabel = Widget.a(paramContext.getApplicationContext().getResources().getConfiguration());
    localObject = d;
    if (c.isEmpty())
    {
      paramContext = Label.c;
    }
    else
    {
      LinkedHashSet localLinkedHashSet = new LinkedHashSet();
      int i1 = 0;
      for (;;)
      {
        int i2 = c.size();
        if (i1 >= d.c.size() + i2) {
          break;
        }
        if (i1 < c.size())
        {
          paramContext = c.get(i1);
        }
        else
        {
          i2 = c.size();
          paramContext = d.c.get(i1 - i2);
        }
        if (paramContext != null) {
          localLinkedHashSet.add(paramContext);
        }
        i1 += 1;
      }
      paramContext = new Label(new sync.Type(new LocaleList((Locale[])localLinkedHashSet.toArray(new Locale[localLinkedHashSet.size()]))));
    }
    if (d.c.isEmpty()) {
      return localLabel;
    }
    return paramContext;
  }
  
  public final int a(android.content.Context paramContext, int paramInt)
  {
    if (paramInt != -100)
    {
      int i1 = paramInt;
      if (paramInt != -1)
      {
        if (paramInt != 0)
        {
          if ((paramInt != 1) && (paramInt != 2))
          {
            if (paramInt == 3)
            {
              if (h == null) {
                h = new Item(this, paramContext);
              }
              return h.doInBackground();
            }
            throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
          }
        }
        else
        {
          if (((UiModeManager)paramContext.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
            return -1;
          }
          i1 = b(paramContext).doInBackground();
        }
      }
      else {
        return i1;
      }
    }
    else
    {
      return -1;
    }
    return paramInt;
  }
  
  public final AppCompatDelegateImplV7.PanelFeatureState a(int paramInt)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final void a()
  {
    Object localObject2 = c;
    AppCompatDelegateImplV7 localAppCompatDelegateImplV7 = this;
    if ((localObject2 instanceof Activity))
    {
      localObject2 = f.r;
      try
      {
        f.a(localAppCompatDelegateImplV7);
      }
      catch (Throwable localThrowable)
      {
        throw localThrowable;
      }
    }
    if (t) {
      mWindow.getDecorView().removeCallbacks(mInvalidatePanelMenuRunnable);
    }
    b = true;
    if (n != -100)
    {
      localObject2 = c;
      if (((localObject2 instanceof Activity)) && (((Activity)localObject2).isChangingConfigurations()))
      {
        localObject2 = m;
        localObject3 = c;
        ((AbstractMultimap)localObject2).put(localObject3.getClass().getName(), Integer.valueOf(n));
        break label146;
      }
    }
    Object localObject1 = this;
    localObject2 = m;
    Object localObject3 = c;
    ((AbstractMultimap)localObject2).remove(localObject3.getClass().getName());
    label146:
    localObject2 = this$0;
    if (localObject2 != null) {
      ((ActionBar)localObject2).show();
    }
    localObject2 = g;
    if (localObject2 != null) {
      ((e)localObject2).a();
    }
    localObject1 = h;
    if (localObject1 != null) {
      ((e)localObject1).a();
    }
  }
  
  public final void a(int paramInt, AppCompatDelegateImplV7.PanelFeatureState paramPanelFeatureState, menu.f paramF)
  {
    Object localObject2 = paramPanelFeatureState;
    Object localObject1 = paramF;
    if (paramF == null)
    {
      AppCompatDelegateImplV7.PanelFeatureState localPanelFeatureState = paramPanelFeatureState;
      if (paramPanelFeatureState == null)
      {
        localPanelFeatureState = paramPanelFeatureState;
        if (paramInt >= 0)
        {
          localObject1 = f;
          localPanelFeatureState = paramPanelFeatureState;
          if (paramInt < localObject1.length) {
            localPanelFeatureState = localObject1[paramInt];
          }
        }
      }
      localObject2 = localPanelFeatureState;
      localObject1 = paramF;
      if (localPanelFeatureState != null)
      {
        localObject1 = j;
        localObject2 = localPanelFeatureState;
      }
    }
    if ((localObject2 != null) && (!p)) {
      return;
    }
    if (!b)
    {
      paramPanelFeatureState = mOriginalWindowCallback;
      paramF = mWindow.getCallback();
      paramPanelFeatureState.getClass();
      try
      {
        a = true;
        paramF.onPanelClosed(paramInt, (Menu)localObject1);
        a = false;
        return;
      }
      catch (Throwable paramF)
      {
        a = false;
        throw paramF;
      }
    }
  }
  
  public final void a(Window paramWindow)
  {
    if (mWindow == null)
    {
      Object localObject1 = paramWindow.getCallback();
      if (!(localObject1 instanceof WindowCallbackWrapper))
      {
        localObject1 = new WindowCallbackWrapper(this, (Window.Callback)localObject1);
        mOriginalWindowCallback = ((WindowCallbackWrapper)localObject1);
        paramWindow.setCallback((Window.Callback)localObject1);
        Object localObject2 = i;
        localObject1 = mContext;
        localObject2 = ((android.content.Context)localObject1).obtainStyledAttributes(null, (int[])localObject2);
        if (((TypedArray)localObject2).hasValue(0))
        {
          int i1 = ((TypedArray)localObject2).getResourceId(0, 0);
          if (i1 != 0)
          {
            AppCompatDrawableManager localAppCompatDrawableManager = AppCompatDrawableManager.get();
            try
            {
              localObject1 = this$0.getDrawable((android.content.Context)localObject1, i1, true);
            }
            catch (Throwable paramWindow)
            {
              throw paramWindow;
            }
          }
        }
        localObject1 = null;
        if (localObject1 != null) {
          paramWindow.setBackgroundDrawable((Drawable)localObject1);
        }
        ((TypedArray)localObject2).recycle();
        mWindow = paramWindow;
        if (Build.VERSION.SDK_INT >= 33)
        {
          paramWindow = a;
          if (paramWindow == null)
          {
            if (paramWindow != null)
            {
              localObject1 = y;
              if (localObject1 != null)
              {
                l.a(paramWindow, localObject1);
                y = null;
              }
            }
            paramWindow = c;
            if ((paramWindow instanceof Activity))
            {
              paramWindow = (Activity)paramWindow;
              if (paramWindow.getWindow() != null)
              {
                a = l.a(paramWindow);
                break label212;
              }
            }
            a = null;
            label212:
            d();
          }
        }
      }
      else
      {
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
      }
    }
    else
    {
      throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }
  }
  
  public final void a(AppCompatDelegateImplV7.PanelFeatureState paramPanelFeatureState, KeyEvent paramKeyEvent)
  {
    if (!p)
    {
      if (b) {
        return;
      }
      int i2 = a;
      Object localObject1 = mContext;
      if ((i2 == 0) && ((getResourcesgetConfigurationscreenLayout & 0xF) == 4)) {
        return;
      }
      Object localObject2 = mWindow.getCallback();
      if ((localObject2 != null) && (!((Window.Callback)localObject2).onMenuOpened(i2, j)))
      {
        a(paramPanelFeatureState, true);
        return;
      }
      localObject2 = (WindowManager)((android.content.Context)localObject1).getSystemService("window");
      if (localObject2 == null) {
        return;
      }
      if (!b(paramPanelFeatureState, paramKeyEvent)) {
        return;
      }
      paramKeyEvent = g;
      if ((paramKeyEvent != null) && (!q))
      {
        paramKeyEvent = i;
        if (paramKeyEvent != null)
        {
          paramKeyEvent = paramKeyEvent.getLayoutParams();
          if ((paramKeyEvent != null) && (width == -1))
          {
            i1 = -1;
            break label752;
          }
        }
      }
      else
      {
        if (paramKeyEvent == null)
        {
          initWindowDecorActionBar();
          paramKeyEvent = this$0;
          if (paramKeyEvent != null) {
            paramKeyEvent = paramKeyEvent.getThemedContext();
          } else {
            paramKeyEvent = null;
          }
          if (paramKeyEvent == null) {
            paramKeyEvent = (KeyEvent)localObject1;
          }
          TypedValue localTypedValue = new TypedValue();
          localObject1 = paramKeyEvent.getResources().newTheme();
          ((Resources.Theme)localObject1).setTo(paramKeyEvent.getTheme());
          ((Resources.Theme)localObject1).resolveAttribute(2130903042, localTypedValue, true);
          i1 = resourceId;
          if (i1 != 0) {
            ((Resources.Theme)localObject1).applyStyle(i1, true);
          }
          ((Resources.Theme)localObject1).resolveAttribute(2130903233, localTypedValue, true);
          i1 = resourceId;
          if (i1 != 0) {
            ((Resources.Theme)localObject1).applyStyle(i1, true);
          } else {
            ((Resources.Theme)localObject1).applyStyle(2131624184, true);
          }
          paramKeyEvent = new ContextThemeWrapper(paramKeyEvent, 0);
          paramKeyEvent.getTheme().setTo((Resources.Theme)localObject1);
          e = paramKeyEvent;
          paramKeyEvent = paramKeyEvent.obtainStyledAttributes(R.styleable.type);
          b = paramKeyEvent.getResourceId(86, 0);
          f = paramKeyEvent.getResourceId(1, 0);
          paramKeyEvent.recycle();
          g = new AppCompatDelegateImplV7.ListMenuDecorView(this, e);
          c = 81;
        }
        else if ((q) && (paramKeyEvent.getChildCount() > 0))
        {
          g.removeAllViews();
        }
        paramKeyEvent = i;
        if (paramKeyEvent != null)
        {
          h = paramKeyEvent;
        }
        else
        {
          if (j == null) {
            break label821;
          }
          if (x == null) {
            x = new a(this, 3);
          }
          localObject1 = x;
          if (d == null)
          {
            paramKeyEvent = new menu.e(e);
            d = paramKeyEvent;
            h = ((menu.Object)localObject1);
            localObject1 = j;
            ((menu.f)localObject1).a(paramKeyEvent, a);
          }
          paramKeyEvent = d;
          localObject1 = g;
          if (d == null)
          {
            d = ((ExpandedMenuView)b.inflate(2131427341, (ViewGroup)localObject1, false));
            if (g == null) {
              g = new e.a(paramKeyEvent);
            }
            d.setAdapter(g);
            d.setOnItemClickListener(paramKeyEvent);
          }
          paramKeyEvent = d;
          h = paramKeyEvent;
          if (paramKeyEvent == null) {
            break label821;
          }
        }
        if (h == null) {
          break label821;
        }
        if (i == null)
        {
          paramKeyEvent = d;
          if (g == null) {
            g = new e.a(paramKeyEvent);
          }
          if (g.getCount() <= 0) {
            break label821;
          }
        }
        localObject1 = h.getLayoutParams();
        paramKeyEvent = (KeyEvent)localObject1;
        if (localObject1 == null) {
          paramKeyEvent = new ViewGroup.LayoutParams(-2, -2);
        }
        i1 = b;
        g.setBackgroundResource(i1);
        localObject1 = h.getParent();
        if ((localObject1 instanceof ViewGroup)) {
          ((ViewGroup)localObject1).removeView(h);
        }
        g.addView(h, paramKeyEvent);
        if (!h.hasFocus()) {
          h.requestFocus();
        }
      }
      int i1 = -2;
      label752:
      k = false;
      paramKeyEvent = new WindowManager.LayoutParams(i1, -2, 0, 0, 1002, 8519680, -3);
      gravity = c;
      windowAnimations = f;
      ((ViewManager)localObject2).addView(g, paramKeyEvent);
      p = true;
      if (i2 == 0)
      {
        d();
        return;
        label821:
        q = true;
      }
    }
  }
  
  public final void a(AppCompatDelegateImplV7.PanelFeatureState paramPanelFeatureState, boolean paramBoolean)
  {
    if ((paramBoolean) && (a == 0))
    {
      localObject = mDecorContentParent;
      if (localObject != null)
      {
        localObject = (ActionBarOverlayLayout)localObject;
        ((ActionBarOverlayLayout)localObject).pullChildren();
        if (mDecorToolbar).mToolbar.isOverflowMenuShowing())
        {
          a(j);
          return;
        }
      }
    }
    Object localObject = (WindowManager)mContext.getSystemService("window");
    if ((localObject != null) && (p))
    {
      AppCompatDelegateImplV7.ListMenuDecorView localListMenuDecorView = g;
      if (localListMenuDecorView != null)
      {
        ((ViewManager)localObject).removeView(localListMenuDecorView);
        if (paramBoolean) {
          a(a, paramPanelFeatureState, null);
        }
      }
    }
    m = false;
    k = false;
    p = false;
    h = null;
    q = true;
    if (z == paramPanelFeatureState) {
      z = null;
    }
    if (a == 0) {
      d();
    }
  }
  
  public final void a(menu.f paramF)
  {
    boolean bool = w;
    AppCompatDelegateImplV7 localAppCompatDelegateImplV7 = this;
    if (bool) {
      return;
    }
    w = true;
    Object localObject = (ActionBarOverlayLayout)mDecorContentParent;
    ((ActionBarOverlayLayout)localObject).pullChildren();
    localObject = mDecorToolbar).mToolbar.mMenuView;
    if (localObject != null)
    {
      localObject = mPresenter;
      if (localObject != null)
      {
        ((b)localObject).hideOverflowMenu();
        localObject = m;
        if ((localObject != null) && (((i)localObject).a())) {
          l.dismiss();
        }
      }
    }
    localObject = mWindow.getCallback();
    if ((localObject != null) && (!b)) {
      ((Window.Callback)localObject).onPanelClosed(108, paramF);
    }
    w = false;
  }
  
  public final boolean a(AppCompatDelegateImplV7.PanelFeatureState paramPanelFeatureState, int paramInt, KeyEvent paramKeyEvent)
  {
    if (paramKeyEvent.isSystem()) {
      return false;
    }
    if ((m) || (b(paramPanelFeatureState, paramKeyEvent)))
    {
      paramPanelFeatureState = j;
      if (paramPanelFeatureState != null) {
        return paramPanelFeatureState.performShortcut(paramInt, paramKeyEvent, 1);
      }
    }
    return false;
  }
  
  public final boolean a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (b) {
      return false;
    }
    int i2 = n;
    if (i2 == -100) {
      for (;;)
      {
        i2 = f.v;
      }
    }
    android.content.Context localContext = mContext;
    int i5 = a(localContext, i2);
    int i1 = Build.VERSION.SDK_INT;
    Object localObject1;
    if (i1 < 33) {
      localObject1 = a(localContext);
    } else {
      localObject1 = null;
    }
    Object localObject3 = localObject1;
    if (!paramBoolean2)
    {
      localObject3 = localObject1;
      if (localObject1 != null) {
        localObject3 = Widget.a(localContext.getResources().getConfiguration());
      }
    }
    Configuration localConfiguration = a(localContext, i5, (Label)localObject3, null, false);
    paramBoolean2 = s;
    Object localObject7 = c;
    if ((!paramBoolean2) && ((localObject7 instanceof Activity)))
    {
      localObject1 = localContext.getPackageManager();
      if (localObject1 == null)
      {
        i4 = 0;
        break label242;
      }
      if (i1 >= 29) {
        i1 = 269221888;
      } else {
        i1 = 786432;
      }
      try
      {
        localObject1 = ((PackageManager)localObject1).getActivityInfo(new ComponentName(localContext, localObject7.getClass()), i1);
        if (localObject1 != null) {
          A = configChanges;
        }
      }
      catch (PackageManager.NameNotFoundException localNameNotFoundException)
      {
        Log.d("AppCompatDelegate", "Exception while getting ActivityInfo", localNameNotFoundException);
        A = 0;
      }
    }
    s = true;
    int i4 = A;
    label242:
    Object localObject4 = r;
    Object localObject2 = localObject4;
    if (localObject4 == null) {
      localObject2 = localContext.getResources().getConfiguration();
    }
    i1 = uiMode;
    int i6 = uiMode & 0x30;
    localObject4 = Widget.a((Configuration)localObject2);
    if (localObject3 == null) {
      localObject2 = null;
    } else {
      localObject2 = Widget.a(localConfiguration);
    }
    if ((i1 & 0x30) != i6) {
      i1 = 512;
    } else {
      i1 = 0;
    }
    int i3 = i1;
    if (localObject2 != null)
    {
      i3 = i1;
      if (!((Label)localObject4).equals(localObject2)) {
        i3 = i1 | 0x2004;
      }
    }
    if (((i4 & i3) != 0) && (paramBoolean1) && (l) && ((k) || (p)) && ((localObject7 instanceof Activity)))
    {
      localObject4 = (Activity)localObject7;
      if (!((Activity)localObject4).isChild())
      {
        i1 = Build.VERSION.SDK_INT;
        if ((i1 >= 31) && ((i3 & 0x2000) != 0)) {
          ((Activity)localObject4).getWindow().getDecorView().setLayoutDirection(localConfiguration.getLayoutDirection());
        }
        if (i1 >= 28) {
          ((Activity)localObject4).recreate();
        } else {
          new Handler(((android.content.Context)localObject4).getMainLooper()).post(new asm.Type(4, localObject4));
        }
        paramBoolean1 = true;
        break label491;
      }
    }
    paramBoolean1 = false;
    label491:
    paramBoolean2 = paramBoolean1;
    if (!paramBoolean1)
    {
      paramBoolean2 = paramBoolean1;
      if (i3 != 0)
      {
        if ((i4 & i3) == i3) {
          i1 = 1;
        } else {
          i1 = 0;
        }
        localObject4 = localContext.getResources();
        localConfiguration = new Configuration(((Resources)localObject4).getConfiguration());
        uiMode = (getConfigurationuiMode & 0xFFFFFFCF | i6);
        if (localObject2 != null) {
          Widget.a(localConfiguration, (Label)localObject2);
        }
        ((Resources)localObject4).updateConfiguration(localConfiguration, null);
        i4 = Build.VERSION.SDK_INT;
        Activity localActivity;
        if ((i4 < 26) && (i4 < 28))
        {
          if (!drupal.Context.b)
          {
            try
            {
              Field localField1 = Resources.class.getDeclaredField("mResourcesImpl");
              drupal.Context.m = localField1;
              localField1.setAccessible(true);
            }
            catch (NoSuchFieldException localNoSuchFieldException1)
            {
              for (;;)
              {
                Log.e("ResourcesFlusher", "Could not retrieve Resources#mResourcesImpl field", localNoSuchFieldException1);
              }
            }
            drupal.Context.b = true;
          }
          Field localField2 = drupal.Context.m;
          if (localField2 != null)
          {
            Object localObject5;
            try
            {
              localObject4 = localField2.get(localObject4);
            }
            catch (IllegalAccessException localIllegalAccessException1)
            {
              Log.e("ResourcesFlusher", "Could not retrieve value from Resources#mResourcesImpl", localIllegalAccessException1);
              localObject5 = null;
            }
            if (localObject5 != null)
            {
              if (!drupal.Context.l)
              {
                try
                {
                  localField2 = localObject5.getClass().getDeclaredField("mDrawableCache");
                  drupal.Context.n = localField2;
                  localField2.setAccessible(true);
                }
                catch (NoSuchFieldException localNoSuchFieldException2)
                {
                  for (;;)
                  {
                    Log.e("ResourcesFlusher", "Could not retrieve ResourcesImpl#mDrawableCache field", localNoSuchFieldException2);
                  }
                }
                drupal.Context.l = true;
              }
              Object localObject8 = drupal.Context.n;
              Object localObject6;
              if (localObject8 != null) {
                try
                {
                  localObject5 = ((Field)localObject8).get(localObject5);
                }
                catch (IllegalAccessException localIllegalAccessException2)
                {
                  Log.e("ResourcesFlusher", "Could not retrieve value from ResourcesImpl#mDrawableCache", localIllegalAccessException2);
                }
              } else {
                localObject6 = null;
              }
              if (localObject6 != null)
              {
                if (!drupal.Context.i)
                {
                  try
                  {
                    localObject8 = Class.forName("android.content.res.ThemedResourceCache");
                    drupal.Context.c = (Class)localObject8;
                  }
                  catch (ClassNotFoundException localClassNotFoundException)
                  {
                    for (;;)
                    {
                      Log.e("ResourcesFlusher", "Could not find ThemedResourceCache class", localClassNotFoundException);
                    }
                  }
                  drupal.Context.i = true;
                }
                Object localObject9 = drupal.Context.c;
                if (localObject9 != null)
                {
                  if (!drupal.Context.s)
                  {
                    try
                    {
                      localObject9 = ((Class)localObject9).getDeclaredField("mUnthemedEntries");
                      drupal.Context.r = (Field)localObject9;
                      ((AccessibleObject)localObject9).setAccessible(true);
                    }
                    catch (NoSuchFieldException localNoSuchFieldException3)
                    {
                      for (;;)
                      {
                        Log.e("ResourcesFlusher", "Could not retrieve ThemedResourceCache#mUnthemedEntries field", localNoSuchFieldException3);
                      }
                    }
                    drupal.Context.s = true;
                  }
                  Field localField3 = drupal.Context.r;
                  if (localField3 != null)
                  {
                    try
                    {
                      localObject6 = localField3.get(localObject6);
                      localObject6 = (LongSparseArray)localObject6;
                    }
                    catch (IllegalAccessException localIllegalAccessException3)
                    {
                      Log.e("ResourcesFlusher", "Could not retrieve value from ThemedResourceCache#mUnthemedEntries", localIllegalAccessException3);
                      localActivity = null;
                    }
                    if (localActivity != null) {
                      localActivity.clear();
                    }
                  }
                }
              }
            }
          }
        }
        i4 = o;
        if (i4 != 0)
        {
          localContext.setTheme(i4);
          localContext.getTheme().applyStyle(o, true);
        }
        paramBoolean1 = true;
        paramBoolean2 = paramBoolean1;
        if (i1 != 0)
        {
          paramBoolean2 = paramBoolean1;
          if ((localObject7 instanceof Activity))
          {
            localActivity = (Activity)localObject7;
            if ((localActivity instanceof x))
            {
              paramBoolean2 = paramBoolean1;
              if (getLifecyclea.compareTo(c.c) >= 0)
              {
                localActivity.onConfigurationChanged(localConfiguration);
                paramBoolean2 = paramBoolean1;
              }
            }
            else
            {
              paramBoolean2 = paramBoolean1;
              if (p)
              {
                paramBoolean2 = paramBoolean1;
                if (!b)
                {
                  localActivity.onConfigurationChanged(localConfiguration);
                  paramBoolean2 = paramBoolean1;
                }
              }
            }
          }
        }
      }
    }
    if ((paramBoolean2) && ((localObject7 instanceof AppCompatActivity)))
    {
      if ((i3 & 0x200) != 0) {
        ((AppCompatActivity)localObject7).onNightModeChanged(i5);
      }
      if ((i3 & 0x4) != 0) {
        ((AppCompatActivity)localObject7).onLocalesChanged((Label)localObject3);
      }
    }
    if (localObject2 != null) {
      Widget.a(Widget.a(localContext.getResources().getConfiguration()));
    }
    if (i2 == 0)
    {
      b(localContext).onCreate();
    }
    else
    {
      localObject2 = g;
      if (localObject2 != null) {
        ((e)localObject2).a();
      }
    }
    if (i2 == 3)
    {
      if (h == null) {
        h = new Item(this, localContext);
      }
      h.onCreate();
      return paramBoolean2;
    }
    localObject2 = h;
    if (localObject2 != null) {
      ((e)localObject2).a();
    }
    return paramBoolean2;
  }
  
  public final e b(android.content.Context paramContext)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final void b()
  {
    LayoutInflater localLayoutInflater = LayoutInflater.from(mContext);
    if (localLayoutInflater.getFactory() == null)
    {
      localLayoutInflater.setFactory2(this);
      return;
    }
    if (!(localLayoutInflater.getFactory2() instanceof AppCompatDelegateImplV7)) {
      Log.i("AppCompatDelegate", "The Activity's LayoutInflater already has a Factory installed so we can not install AppCompat's");
    }
  }
  
  public final void b(CharSequence paramCharSequence)
  {
    d = paramCharSequence;
    Object localObject = mDecorContentParent;
    if (localObject != null)
    {
      ((DecorContentParent)localObject).setWindowTitle(paramCharSequence);
      return;
    }
    localObject = this$0;
    if (localObject != null)
    {
      ((ActionBar)localObject).setTitle(paramCharSequence);
      return;
    }
    localObject = mTitleView;
    if (localObject != null) {
      ((TextView)localObject).setText(paramCharSequence);
    }
  }
  
  public final boolean b(AppCompatDelegateImplV7.PanelFeatureState paramPanelFeatureState, KeyEvent paramKeyEvent)
  {
    if (b) {
      return false;
    }
    if (m) {
      return true;
    }
    Object localObject1 = z;
    if ((localObject1 != null) && (localObject1 != paramPanelFeatureState)) {
      a((AppCompatDelegateImplV7.PanelFeatureState)localObject1, false);
    }
    Window.Callback localCallback = mWindow.getCallback();
    int i2 = a;
    if (localCallback != null) {
      i = localCallback.onCreatePanelView(i2);
    }
    int i1;
    if ((i2 != 0) && (i2 != 108)) {
      i1 = 0;
    } else {
      i1 = 1;
    }
    if (i1 != 0)
    {
      localObject1 = mDecorContentParent;
      if (localObject1 != null)
      {
        localObject1 = (ActionBarOverlayLayout)localObject1;
        ((ActionBarOverlayLayout)localObject1).pullChildren();
        mDecorToolbar).i = true;
      }
    }
    if ((i == null) && ((i1 == 0) || (!(this$0 instanceof ToolbarActionBar))))
    {
      localObject1 = j;
      if ((localObject1 == null) || (r))
      {
        Object localObject3;
        Object localObject2;
        if (localObject1 == null)
        {
          localObject3 = mContext;
          if (i2 != 0)
          {
            localObject1 = localObject3;
            if (i2 != 108) {}
          }
          else
          {
            localObject1 = localObject3;
            if (mDecorContentParent != null)
            {
              TypedValue localTypedValue = new TypedValue();
              Resources.Theme localTheme = ((android.content.Context)localObject3).getTheme();
              localTheme.resolveAttribute(2130903049, localTypedValue, true);
              if (resourceId != 0)
              {
                localObject2 = ((android.content.Context)localObject3).getResources().newTheme();
                localObject1 = localObject2;
                ((Resources.Theme)localObject2).setTo(localTheme);
                ((Resources.Theme)localObject2).applyStyle(resourceId, true);
                ((Resources.Theme)localObject2).resolveAttribute(2130903050, localTypedValue, true);
              }
              else
              {
                localTheme.resolveAttribute(2130903050, localTypedValue, true);
                localObject1 = null;
              }
              localObject2 = localObject1;
              if (resourceId != 0)
              {
                localObject2 = localObject1;
                if (localObject1 == null)
                {
                  localObject1 = ((android.content.Context)localObject3).getResources().newTheme();
                  localObject2 = localObject1;
                  ((Resources.Theme)localObject1).setTo(localTheme);
                }
                ((Resources.Theme)localObject2).applyStyle(resourceId, true);
              }
              localObject1 = localObject3;
              if (localObject2 != null)
              {
                localObject1 = new ContextThemeWrapper((android.content.Context)localObject3, 0);
                ((ContextThemeWrapper)localObject1).getTheme().setTo((Resources.Theme)localObject2);
              }
            }
          }
          localObject1 = new menu.f((android.content.Context)localObject1);
          i = this;
          localObject2 = j;
          if (localObject1 != localObject2)
          {
            if (localObject2 != null) {
              ((menu.f)localObject2).b(d);
            }
            j = ((menu.f)localObject1);
            localObject2 = d;
            if (localObject2 != null) {
              ((menu.f)localObject1).a((menu.l)localObject2, a);
            }
          }
          if (j == null) {
            return false;
          }
        }
        if (i1 != 0)
        {
          localObject1 = mDecorContentParent;
          if (localObject1 != null)
          {
            if (j == null) {
              j = new a(this, 2);
            }
            localObject2 = j;
            localObject3 = j;
            ((ActionBarOverlayLayout)localObject1).setMenu((menu.f)localObject2, (menu.Object)localObject3);
          }
        }
        j.g();
        if (!localCallback.onCreatePanelMenu(i2, j))
        {
          paramKeyEvent = j;
          if (paramKeyEvent != null)
          {
            if (paramKeyEvent != null) {
              paramKeyEvent.b(d);
            }
            j = null;
          }
          if (i1 != 0)
          {
            paramPanelFeatureState = mDecorContentParent;
            if (paramPanelFeatureState != null)
            {
              paramKeyEvent = j;
              ((ActionBarOverlayLayout)paramPanelFeatureState).setMenu(null, paramKeyEvent);
              return false;
            }
          }
        }
        else
        {
          r = false;
        }
      }
      else
      {
        j.g();
        localObject1 = s;
        if (localObject1 != null)
        {
          j.b((Bundle)localObject1);
          s = null;
        }
        if (!localCallback.onPreparePanel(0, i, j))
        {
          if (i1 != 0)
          {
            paramKeyEvent = mDecorContentParent;
            if (paramKeyEvent != null)
            {
              localObject1 = j;
              ((ActionBarOverlayLayout)paramKeyEvent).setMenu(null, (menu.Object)localObject1);
            }
          }
          j.h();
          return false;
        }
        if (paramKeyEvent != null) {
          i1 = paramKeyEvent.getDeviceId();
        } else {
          i1 = -1;
        }
        boolean bool;
        if (KeyCharacterMap.load(i1).getKeyboardType() != 1) {
          bool = true;
        } else {
          bool = false;
        }
        j.setQwertyMode(bool);
        j.h();
      }
    }
    else
    {
      m = true;
      k = false;
      z = paramPanelFeatureState;
      return true;
    }
    return false;
  }
  
  public final void d()
  {
    if (Build.VERSION.SDK_INT >= 33)
    {
      Object localObject = a;
      int i1 = 0;
      if (localObject != null)
      {
        if (a0p) {}
        while (mActionMode != null)
        {
          i1 = 1;
          break;
        }
      }
      if ((i1 != 0) && (y == null))
      {
        y = l.a(a, this);
        return;
      }
      if (i1 == 0)
      {
        localObject = y;
        if (localObject != null)
        {
          l.a(a, localObject);
          y = null;
        }
      }
    }
  }
  
  public final boolean dispatchKeyEvent()
  {
    boolean bool = mEatKeyUpEvent;
    mEatKeyUpEvent = false;
    Object localObject = a(0);
    if (p)
    {
      if (!bool)
      {
        a((AppCompatDelegateImplV7.PanelFeatureState)localObject, true);
        return true;
      }
    }
    else
    {
      localObject = mActionMode;
      if (localObject != null)
      {
        ((ActionMode)localObject).finish();
        return true;
      }
      initWindowDecorActionBar();
      localObject = this$0;
      if (localObject != null)
      {
        if (!((ActionBar)localObject).collapseActionView()) {
          break label76;
        }
        return true;
      }
      return false;
    }
    return true;
    label76:
    return false;
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    Object localObject1 = c;
    boolean bool2 = localObject1 instanceof app.k;
    boolean bool1 = true;
    if ((bool2) || ((localObject1 instanceof k)))
    {
      localObject1 = mWindow.getDecorView();
      if ((localObject1 != null) && (drupal.Context.a((View)localObject1, paramKeyEvent))) {
        return true;
      }
    }
    Object localObject2;
    if (paramKeyEvent.getKeyCode() == 82)
    {
      localObject1 = mOriginalWindowCallback;
      localObject2 = mWindow.getCallback();
      localObject1.getClass();
      try
      {
        mEatKeyUpEvent = true;
        bool2 = ((Window.Callback)localObject2).dispatchKeyEvent(paramKeyEvent);
        mEatKeyUpEvent = false;
        if (bool2) {
          return true;
        }
      }
      catch (Throwable paramKeyEvent)
      {
        mEatKeyUpEvent = false;
        throw paramKeyEvent;
      }
    }
    int i1 = paramKeyEvent.getKeyCode();
    if (paramKeyEvent.getAction() == 0) {
      if (i1 != 4)
      {
        if (i1 == 82)
        {
          if (paramKeyEvent.getRepeatCount() != 0) {
            break label572;
          }
          localObject1 = a(0);
          if (p) {
            break label572;
          }
          b((AppCompatDelegateImplV7.PanelFeatureState)localObject1, paramKeyEvent);
          return true;
        }
      }
      else
      {
        if ((paramKeyEvent.getFlags() & 0x80) == 0) {
          bool1 = false;
        }
        mEatKeyUpEvent = bool1;
      }
    }
    label506:
    label511:
    label523:
    do
    {
      do
      {
        return false;
        if (i1 == 4) {
          break;
        }
      } while (i1 != 82);
      if (mActionMode != null) {
        return true;
      }
      localObject2 = a(0);
      Object localObject3 = mDecorContentParent;
      localObject1 = mContext;
      if (localObject3 != null)
      {
        localObject3 = (ActionBarOverlayLayout)localObject3;
        ((ActionBarOverlayLayout)localObject3).pullChildren();
        localObject3 = mDecorToolbar).mToolbar;
        if (((View)localObject3).getVisibility() == 0)
        {
          localObject3 = mMenuView;
          if ((localObject3 != null) && (mContext) && (!ViewConfiguration.get((android.content.Context)localObject1).hasPermanentMenuKey()))
          {
            localObject3 = (ActionBarOverlayLayout)mDecorContentParent;
            ((ActionBarOverlayLayout)localObject3).pullChildren();
            if (!mDecorToolbar).mToolbar.isOverflowMenuShowing())
            {
              if ((b) || (!b((AppCompatDelegateImplV7.PanelFeatureState)localObject2, paramKeyEvent))) {
                break label511;
              }
              paramKeyEvent = (ActionBarOverlayLayout)mDecorContentParent;
              paramKeyEvent.pullChildren();
              bool1 = mDecorToolbar).mToolbar.showOverflowMenu();
              break label523;
            }
            paramKeyEvent = (ActionBarOverlayLayout)mDecorContentParent;
            paramKeyEvent.pullChildren();
            paramKeyEvent = mDecorToolbar).mToolbar.mMenuView;
            if (paramKeyEvent == null) {
              break label511;
            }
            paramKeyEvent = mPresenter;
            if ((paramKeyEvent == null) || (!paramKeyEvent.hideOverflowMenu())) {
              break label511;
            }
            break label506;
          }
        }
      }
      bool1 = p;
      if ((!bool1) && (!k))
      {
        if (m)
        {
          if (r)
          {
            m = false;
            bool1 = b((AppCompatDelegateImplV7.PanelFeatureState)localObject2, paramKeyEvent);
          }
          else
          {
            bool1 = true;
          }
          if (bool1)
          {
            a((AppCompatDelegateImplV7.PanelFeatureState)localObject2, paramKeyEvent);
            bool1 = true;
            break label523;
          }
        }
        bool1 = false;
      }
      else
      {
        a((AppCompatDelegateImplV7.PanelFeatureState)localObject2, true);
      }
      if (!bool1) {
        break;
      }
      paramKeyEvent = (AudioManager)((android.content.Context)localObject1).getApplicationContext().getSystemService("audio");
      if (paramKeyEvent != null)
      {
        paramKeyEvent.playSoundEffect(0);
        return true;
      }
      Log.w("AppCompatDelegate", "Couldn't get audio manager");
      return true;
    } while (!dispatchKeyEvent());
    label572:
    return true;
  }
  
  public final void e(int paramInt)
  {
    AppCompatDelegateImplV7.PanelFeatureState localPanelFeatureState = a(paramInt);
    if (j != null)
    {
      Bundle localBundle = new Bundle();
      j.c(localBundle);
      if (localBundle.size() > 0) {
        s = localBundle;
      }
      j.g();
      j.clear();
    }
    r = true;
    q = true;
    if (((paramInt == 108) || (paramInt == 0)) && (mDecorContentParent != null))
    {
      localPanelFeatureState = a(0);
      m = false;
      b(localPanelFeatureState, null);
    }
  }
  
  public final void ensureSubDecor()
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: fail exe a8 = a7\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:92)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.dfs(Cfg.java:255)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze0(BaseAnalyze.java:75)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze(BaseAnalyze.java:69)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:274)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\nCaused by: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:552)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:1)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:166)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:331)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:387)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:90)\n\t... 17 more\n");
  }
  
  public final void initWindowDecorActionBar()
  {
    ensureSubDecor();
    if (mHasActionBar)
    {
      if (this$0 != null) {
        return;
      }
      Object localObject = c;
      if ((localObject instanceof Activity)) {
        this$0 = new WindowDecorActionBar((Activity)localObject, mOverlayActionBar);
      } else if ((localObject instanceof Dialog)) {
        this$0 = new WindowDecorActionBar((Dialog)localObject);
      }
      localObject = this$0;
      if (localObject != null) {
        ((ActionBar)localObject).setDisplayOptions(v);
      }
    }
  }
  
  public final void invalidateOptionsMenu()
  {
    if (this$0 != null)
    {
      initWindowDecorActionBar();
      if (this$0.invalidateOptionsMenu()) {
        return;
      }
      invalidatePanelMenu(0);
    }
  }
  
  public final void invalidatePanelMenu(int paramInt)
  {
    q = (1 << paramInt | q);
    if (!t)
    {
      View localView = mWindow.getDecorView();
      AppCompatDelegateImplV7.5 local5 = mInvalidatePanelMenuRunnable;
      WeakHashMap localWeakHashMap = ViewCompat.this$0;
      localView.postOnAnimation(local5);
      t = true;
    }
  }
  
  /* Error */
  public final void onCreate()
  {
    // Byte code:
    //   0: aload_0
    //   1: iconst_1
    //   2: putfield 802	androidx/appcompat/app/AppCompatDelegateImplV7:l	Z
    //   5: aload_0
    //   6: iconst_0
    //   7: iconst_1
    //   8: invokevirtual 1165	androidx/appcompat/app/AppCompatDelegateImplV7:a	(ZZ)Z
    //   11: pop
    //   12: aload_0
    //   13: invokevirtual 1168	androidx/appcompat/app/AppCompatDelegateImplV7:setContentView	()V
    //   16: aload_0
    //   17: getfield 142	androidx/appcompat/app/AppCompatDelegateImplV7:c	Ljava/lang/Object;
    //   20: astore_1
    //   21: aload_1
    //   22: instanceof 330
    //   25: ifeq +93 -> 118
    //   28: aload_1
    //   29: checkcast 330	android/app/Activity
    //   32: astore_1
    //   33: aload_1
    //   34: aload_1
    //   35: invokevirtual 1172	android/app/Activity:getComponentName	()Landroid/content/ComponentName;
    //   38: invokestatic 1178	signature/NavUtils:getParentActivityName	(Landroid/app/Activity;Landroid/content/ComponentName;)Ljava/lang/String;
    //   41: astore_1
    //   42: goto +15 -> 57
    //   45: astore_1
    //   46: new 1163	java/lang/IllegalArgumentException
    //   49: dup
    //   50: aload_1
    //   51: invokespecial 1181	java/lang/IllegalArgumentException:<init>	(Ljava/lang/Throwable;)V
    //   54: athrow
    //   55: aconst_null
    //   56: astore_1
    //   57: aload_1
    //   58: ifnull +25 -> 83
    //   61: aload_0
    //   62: getfield 366	androidx/appcompat/app/AppCompatDelegateImplV7:this$0	Landroidx/appcompat/app/ActionBar;
    //   65: astore_1
    //   66: aload_1
    //   67: ifnonnull +11 -> 78
    //   70: aload_0
    //   71: iconst_1
    //   72: putfield 1141	androidx/appcompat/app/AppCompatDelegateImplV7:v	Z
    //   75: goto +8 -> 83
    //   78: aload_1
    //   79: iconst_1
    //   80: invokevirtual 1144	androidx/appcompat/app/ActionBar:setDisplayOptions	(Z)V
    //   83: getstatic 332	androidx/appcompat/app/f:r	Ljava/lang/Object;
    //   86: astore_1
    //   87: aload_1
    //   88: monitorenter
    //   89: aload_0
    //   90: invokestatic 335	androidx/appcompat/app/f:a	(Landroidx/appcompat/app/AppCompatDelegateImplV7;)V
    //   93: getstatic 1184	androidx/appcompat/app/f:a	Lhttp/TCharArrayList;
    //   96: new 1186	java/lang/ref/WeakReference
    //   99: dup
    //   100: aload_0
    //   101: invokespecial 1189	java/lang/ref/WeakReference:<init>	(Ljava/lang/Object;)V
    //   104: invokevirtual 1192	http/TCharArrayList:add	(Ljava/lang/Object;)Z
    //   107: pop
    //   108: aload_1
    //   109: monitorexit
    //   110: goto +8 -> 118
    //   113: astore_2
    //   114: aload_1
    //   115: monitorexit
    //   116: aload_2
    //   117: athrow
    //   118: aload_0
    //   119: new 205	android/content/res/Configuration
    //   122: dup
    //   123: aload_0
    //   124: getfield 138	androidx/appcompat/app/AppCompatDelegateImplV7:mContext	Landroid/content/Context;
    //   127: invokevirtual 197	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   130: invokevirtual 203	android/content/res/Resources:getConfiguration	()Landroid/content/res/Configuration;
    //   133: invokespecial 834	android/content/res/Configuration:<init>	(Landroid/content/res/Configuration;)V
    //   136: putfield 799	androidx/appcompat/app/AppCompatDelegateImplV7:r	Landroid/content/res/Configuration;
    //   139: aload_0
    //   140: iconst_1
    //   141: putfield 803	androidx/appcompat/app/AppCompatDelegateImplV7:p	Z
    //   144: return
    //   145: astore_1
    //   146: goto -91 -> 55
    //   149: astore_1
    //   150: goto -95 -> 55
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	153	0	this	AppCompatDelegateImplV7
    //   20	22	1	localObject1	Object
    //   45	6	1	localNameNotFoundException	PackageManager.NameNotFoundException
    //   56	59	1	localObject2	Object
    //   145	1	1	localIllegalArgumentException1	IllegalArgumentException
    //   149	1	1	localIllegalArgumentException2	IllegalArgumentException
    //   113	4	2	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   33	42	45	android/content/pm/PackageManager$NameNotFoundException
    //   89	110	113	java/lang/Throwable
    //   114	116	113	java/lang/Throwable
    //   33	42	145	java/lang/IllegalArgumentException
    //   46	55	149	java/lang/IllegalArgumentException
  }
  
  public final View onCreateView(View paramView, String paramString, android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: fail exe a20 = a19\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:92)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.dfs(Cfg.java:255)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze0(BaseAnalyze.java:75)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze(BaseAnalyze.java:69)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:274)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\nCaused by: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:552)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:1)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:166)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:331)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:387)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:90)\n\t... 17 more\n");
  }
  
  public final View onCreateView(String paramString, android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    return onCreateView(null, paramString, paramContext, paramAttributeSet);
  }
  
  public final boolean onMenuItemSelected(menu.f paramF, MenuItem paramMenuItem)
  {
    Window.Callback localCallback = mWindow.getCallback();
    if ((localCallback != null) && (!b))
    {
      menu.f localF = paramF.q();
      AppCompatDelegateImplV7.PanelFeatureState[] arrayOfPanelFeatureState = f;
      int i1;
      if (arrayOfPanelFeatureState != null) {
        i1 = arrayOfPanelFeatureState.length;
      } else {
        i1 = 0;
      }
      int i2 = 0;
      while (i2 < i1)
      {
        paramF = arrayOfPanelFeatureState[i2];
        if ((paramF != null) && (j == localF)) {
          break label89;
        }
        i2 += 1;
      }
      paramF = null;
      label89:
      if (paramF != null) {
        return localCallback.onMenuItemSelected(a, paramMenuItem);
      }
    }
    return false;
  }
  
  public final void onMenuModeChange(menu.f paramF)
  {
    paramF = mDecorContentParent;
    if (paramF != null)
    {
      paramF = (ActionBarOverlayLayout)paramF;
      paramF.pullChildren();
      paramF = mDecorToolbar).mToolbar;
      if (paramF.getVisibility() == 0)
      {
        paramF = mMenuView;
        if ((paramF != null) && (mContext)) {
          if (ViewConfiguration.get(mContext).hasPermanentMenuKey())
          {
            paramF = (ActionBarOverlayLayout)mDecorContentParent;
            paramF.pullChildren();
            paramF = mDecorToolbar).mToolbar.mMenuView;
            if (paramF != null)
            {
              paramF = mPresenter;
              if ((paramF == null) || ((mPostedOpenRunnable == null) && (!paramF.c()))) {}
            }
          }
          else
          {
            paramF = mWindow.getCallback();
            Object localObject1 = (ActionBarOverlayLayout)mDecorContentParent;
            ((ActionBarOverlayLayout)localObject1).pullChildren();
            if (mDecorToolbar).mToolbar.isOverflowMenuShowing())
            {
              localObject1 = (ActionBarOverlayLayout)mDecorContentParent;
              ((ActionBarOverlayLayout)localObject1).pullChildren();
              localObject1 = mDecorToolbar).mToolbar.mMenuView;
              if (localObject1 != null)
              {
                localObject1 = mPresenter;
                if (localObject1 != null) {
                  ((b)localObject1).hideOverflowMenu();
                }
              }
              if (b) {
                return;
              }
              paramF.onPanelClosed(108, a0j);
              return;
            }
            if ((paramF == null) || (b)) {
              return;
            }
            if ((t) && ((0x1 & q) != 0))
            {
              localObject1 = mWindow.getDecorView();
              localObject2 = mInvalidatePanelMenuRunnable;
              ((View)localObject1).removeCallbacks((Runnable)localObject2);
              ((AppCompatDelegateImplV7.5)localObject2).run();
            }
            localObject1 = a(0);
            Object localObject2 = j;
            if ((localObject2 == null) || (r) || (!paramF.onPreparePanel(0, i, (Menu)localObject2))) {
              return;
            }
            paramF.onMenuOpened(108, j);
            paramF = (ActionBarOverlayLayout)mDecorContentParent;
            paramF.pullChildren();
            mDecorToolbar).mToolbar.showOverflowMenu();
            return;
          }
        }
      }
    }
    paramF = a(0);
    q = true;
    a(paramF, false);
    a(paramF, null);
  }
  
  public final boolean requestWindowFeature(int paramInt)
  {
    int i1;
    if (paramInt == 8)
    {
      Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR id when requesting this feature.");
      i1 = 108;
    }
    else
    {
      i1 = paramInt;
      if (paramInt == 9)
      {
        Log.i("AppCompatDelegate", "You should now use the AppCompatDelegate.FEATURE_SUPPORT_ACTION_BAR_OVERLAY id when requesting this feature.");
        i1 = 109;
      }
    }
    if ((mWindowNoTitle) && (i1 == 108)) {
      return false;
    }
    if ((mHasActionBar) && (i1 == 1)) {
      mHasActionBar = false;
    }
    if (i1 != 1)
    {
      if (i1 != 2)
      {
        if (i1 != 5)
        {
          if (i1 != 10)
          {
            if (i1 != 108)
            {
              if (i1 != 109) {
                return mWindow.requestFeature(i1);
              }
              throwFeatureRequestIfSubDecorInstalled();
              mOverlayActionBar = true;
              return true;
            }
            throwFeatureRequestIfSubDecorInstalled();
            mHasActionBar = true;
            return true;
          }
          throwFeatureRequestIfSubDecorInstalled();
          mOverlayActionMode = true;
          return true;
        }
        throwFeatureRequestIfSubDecorInstalled();
        mFeatureProgress = true;
        return true;
      }
      throwFeatureRequestIfSubDecorInstalled();
      mFeatureIndeterminateProgress = true;
      return true;
    }
    throwFeatureRequestIfSubDecorInstalled();
    mWindowNoTitle = true;
    return true;
  }
  
  public final void setContentView()
  {
    if (mWindow == null)
    {
      Object localObject = c;
      if ((localObject instanceof Activity)) {
        a(((Activity)localObject).getWindow());
      }
    }
    if (mWindow != null) {
      return;
    }
    throw new IllegalStateException("We have not been given a Window");
  }
  
  public final void setContentView(int paramInt)
  {
    ensureSubDecor();
    ViewGroup localViewGroup = (ViewGroup)mSubDecor.findViewById(16908290);
    localViewGroup.removeAllViews();
    LayoutInflater.from(mContext).inflate(paramInt, localViewGroup);
    mOriginalWindowCallback.a(mWindow.getCallback());
  }
  
  public final void setContentView(View paramView)
  {
    ensureSubDecor();
    ViewGroup localViewGroup = (ViewGroup)mSubDecor.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView);
    mOriginalWindowCallback.a(mWindow.getCallback());
  }
  
  public final void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    ensureSubDecor();
    ViewGroup localViewGroup = (ViewGroup)mSubDecor.findViewById(16908290);
    localViewGroup.removeAllViews();
    localViewGroup.addView(paramView, paramLayoutParams);
    mOriginalWindowCallback.a(mWindow.getCallback());
  }
  
  public final ActionMode startSupportActionModeFromWindow(ActionMode.Callback paramCallback)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final void throwFeatureRequestIfSubDecorInstalled()
  {
    if (!mSubDecorInstalled) {
      return;
    }
    throw new AndroidRuntimeException("Window feature must be requested before adding content");
  }
}
