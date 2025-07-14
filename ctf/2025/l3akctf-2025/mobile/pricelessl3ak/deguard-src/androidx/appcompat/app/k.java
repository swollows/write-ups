package androidx.appcompat.app;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.res.Resources.Theme;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.AbsListView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.window.OnBackInvokedDispatcher;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.ClassWriter;
import androidx.lifecycle.Handle;
import androidx.lifecycle.x;
import app.Menu;
import app.ViewCompat;
import asm.Type;
import date4j.a;
import params.Log;
import tts.c;
import tts.g;
import tts.p;
import ui.i;
import view.ActionMode;
import view.ActionMode.Callback;

public final class k
  extends Dialog
  implements DialogInterface, AppCompatCallback, x, c
{
  public final i a = new i(new Type(3, this));
  public androidx.lifecycle.f b;
  public final Calendar c = new Calendar(this);
  public final g d = new g(new a(this, new p(this, 0)));
  public AppCompatDelegateImplV7 f;
  public final AlertController this$0;
  
  public k(ContextThemeWrapper paramContextThemeWrapper, int paramInt)
  {
    super(paramContextThemeWrapper, j);
    Object localObject = a();
    if (paramInt == 0)
    {
      TypedValue localTypedValue = new TypedValue();
      paramContextThemeWrapper.getTheme().resolveAttribute(2130903144, localTypedValue, true);
      i = resourceId;
    }
    o = i;
    ((f)localObject).onCreate();
    this$0 = new AlertController(getContext(), this, getWindow());
  }
  
  public static int a(android.content.Context paramContext, int paramInt)
  {
    if ((paramInt >>> 24 & 0xFF) >= 1) {
      return paramInt;
    }
    TypedValue localTypedValue = new TypedValue();
    paramContext.getTheme().resolveAttribute(2130903079, localTypedValue, true);
    return resourceId;
  }
  
  public static void a(k paramK)
  {
    paramK.onBackPressed();
  }
  
  public final f a()
  {
    if (f == null)
    {
      SerializingExecutor localSerializingExecutor = f.this$0;
      f = new AppCompatDelegateImplV7(getContext(), getWindow(), this, this);
    }
    return f;
  }
  
  public final void a(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 33)
    {
      OnBackInvokedDispatcher localOnBackInvokedDispatcher = accessibility.h.a(this);
      Log.append(localOnBackInvokedDispatcher, "onBackInvokedDispatcher");
      i localI = a;
      x = localOnBackInvokedDispatcher;
      localI.a(e);
    }
    d.a(paramBundle);
    e().d(Handle.ON_CREATE);
  }
  
  public final void a(CharSequence paramCharSequence)
  {
    super.setTitle(paramCharSequence);
    a().b(paramCharSequence);
  }
  
  public final boolean a(KeyEvent paramKeyEvent)
  {
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public final void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    hide();
    AppCompatDelegateImplV7 localAppCompatDelegateImplV7 = (AppCompatDelegateImplV7)a();
    localAppCompatDelegateImplV7.ensureSubDecor();
    ((ViewGroup)mSubDecor.findViewById(16908290)).addView(paramView, paramLayoutParams);
    mOriginalWindowCallback.a(mWindow.getCallback());
  }
  
  public final void dismiss()
  {
    super.dismiss();
    a().a();
  }
  
  public final boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    View localView = getWindow().getDecorView();
    return drupal.Context.a(c, localView, this, paramKeyEvent);
  }
  
  public final androidx.lifecycle.f e()
  {
    androidx.lifecycle.f localF2 = b;
    androidx.lifecycle.f localF1 = localF2;
    if (localF2 == null)
    {
      localF1 = new androidx.lifecycle.f(this);
      b = localF1;
    }
    return localF1;
  }
  
  public final View findViewById(int paramInt)
  {
    AppCompatDelegateImplV7 localAppCompatDelegateImplV7 = (AppCompatDelegateImplV7)a();
    localAppCompatDelegateImplV7.ensureSubDecor();
    return mWindow.findViewById(paramInt);
  }
  
  public final ClassWriter getLifecycle()
  {
    return e();
  }
  
  public final tts.h getSavedStateRegistry()
  {
    return d.e;
  }
  
  public final void hide()
  {
    Object localObject = getWindow();
    Log.get(localObject);
    localObject = ((Window)localObject).getDecorView();
    Log.append(localObject, "window!!.decorView");
    ((View)localObject).setTag(2131230907, this);
    localObject = getWindow();
    Log.get(localObject);
    localObject = ((Window)localObject).getDecorView();
    Log.append(localObject, "window!!.decorView");
    ((View)localObject).setTag(2131230908, this);
    localObject = getWindow();
    Log.get(localObject);
    localObject = ((Window)localObject).getDecorView();
    Log.append(localObject, "window!!.decorView");
    ((View)localObject).setTag(2131230909, this);
  }
  
  public final void invalidateOptionsMenu()
  {
    a().invalidateOptionsMenu();
  }
  
  public final void onBackPressed()
  {
    a.a();
  }
  
  public final void onCreate(Bundle paramBundle)
  {
    int i1 = 2;
    setTitle(paramBundle);
    AlertController localAlertController = this$0;
    mDialog.setContentView(mAlertDialogLayout);
    Object localObject1 = mWindow;
    paramBundle = ((Window)localObject1).findViewById(2131230840);
    Object localObject3 = paramBundle.findViewById(2131230901);
    Object localObject2 = paramBundle.findViewById(2131230796);
    Object localObject4 = paramBundle.findViewById(2131230786);
    paramBundle = (ViewGroup)paramBundle.findViewById(2131230798);
    ((Window)localObject1).setFlags(131072, 131072);
    paramBundle.setVisibility(8);
    View localView = paramBundle.findViewById(2131230901);
    Object localObject6 = paramBundle.findViewById(2131230796);
    Object localObject5 = paramBundle.findViewById(2131230786);
    localObject3 = AlertController.resolvePanel(localView, (View)localObject3);
    localObject2 = AlertController.resolvePanel((View)localObject6, (View)localObject2);
    localObject4 = AlertController.resolvePanel((View)localObject5, (View)localObject4);
    localObject5 = (NestedScrollView)((Window)localObject1).findViewById(2131230852);
    mScrollView = ((NestedScrollView)localObject5);
    ((View)localObject5).setFocusable(false);
    mScrollView.setNestedScrollingEnabled(false);
    localObject5 = (TextView)((View)localObject2).findViewById(16908299);
    mMessageView = ((TextView)localObject5);
    int i;
    if (localObject5 != null)
    {
      ((View)localObject5).setVisibility(8);
      mScrollView.removeView(mMessageView);
      if (mListView != null)
      {
        localObject5 = (ViewGroup)mScrollView.getParent();
        i = ((ViewGroup)localObject5).indexOfChild(mScrollView);
        ((ViewGroup)localObject5).removeViewAt(i);
        ((ViewGroup)localObject5).addView(mListView, i, new ViewGroup.LayoutParams(-1, -1));
      }
      else
      {
        ((View)localObject2).setVisibility(8);
      }
    }
    localObject6 = (Button)((View)localObject4).findViewById(16908313);
    mButton = ((Button)localObject6);
    localObject5 = this$0;
    ((View)localObject6).setOnClickListener((View.OnClickListener)localObject5);
    if (TextUtils.isEmpty(null))
    {
      mButton.setVisibility(8);
      i = 0;
    }
    else
    {
      mButton.setText(null);
      mButton.setVisibility(0);
      i = 1;
    }
    localObject6 = (Button)((View)localObject4).findViewById(16908314);
    mTitleView = ((Button)localObject6);
    ((View)localObject6).setOnClickListener((View.OnClickListener)localObject5);
    if (TextUtils.isEmpty(null))
    {
      mTitleView.setVisibility(8);
    }
    else
    {
      mTitleView.setText(null);
      mTitleView.setVisibility(0);
      i |= 0x2;
    }
    localObject6 = (Button)((View)localObject4).findViewById(16908315);
    mView = ((Button)localObject6);
    ((View)localObject6).setOnClickListener((View.OnClickListener)localObject5);
    if (TextUtils.isEmpty(null))
    {
      mView.setVisibility(8);
    }
    else
    {
      mView.setText(null);
      mView.setVisibility(0);
      i |= 0x4;
    }
    localObject5 = new TypedValue();
    mContext.getTheme().resolveAttribute(2130903077, (TypedValue)localObject5, true);
    if (data != 0) {
      if (i == 1)
      {
        localObject5 = mButton;
        localObject6 = (LinearLayout.LayoutParams)((View)localObject5).getLayoutParams();
        gravity = 1;
        weight = 0.5F;
        ((View)localObject5).setLayoutParams((ViewGroup.LayoutParams)localObject6);
      }
      else if (i == 2)
      {
        localObject5 = mTitleView;
        localObject6 = (LinearLayout.LayoutParams)((View)localObject5).getLayoutParams();
        gravity = 1;
        weight = 0.5F;
        ((View)localObject5).setLayoutParams((ViewGroup.LayoutParams)localObject6);
      }
      else if (i == 4)
      {
        localObject5 = mView;
        localObject6 = (LinearLayout.LayoutParams)((View)localObject5).getLayoutParams();
        gravity = 1;
        weight = 0.5F;
        ((View)localObject5).setLayoutParams((ViewGroup.LayoutParams)localObject6);
      }
    }
    if (i == 0) {
      ((View)localObject4).setVisibility(8);
    }
    if (g != null)
    {
      localObject5 = new ViewGroup.LayoutParams(-1, -2);
      ((ViewGroup)localObject3).addView(g, 0, (ViewGroup.LayoutParams)localObject5);
      ((Window)localObject1).findViewById(2131230899).setVisibility(8);
    }
    else
    {
      b = ((ImageView)((Window)localObject1).findViewById(16908294));
      if ((!TextUtils.isEmpty(d)) && (p))
      {
        localObject5 = (TextView)((Window)localObject1).findViewById(2131230779);
        c = ((TextView)localObject5);
        ((TextView)localObject5).setText(d);
        localObject5 = a;
        if (localObject5 != null)
        {
          b.setImageDrawable((Drawable)localObject5);
        }
        else
        {
          c.setPadding(b.getPaddingLeft(), b.getPaddingTop(), b.getPaddingRight(), b.getPaddingBottom());
          b.setVisibility(8);
        }
      }
      else
      {
        ((Window)localObject1).findViewById(2131230899).setVisibility(8);
        b.setVisibility(8);
        ((View)localObject3).setVisibility(8);
      }
    }
    if (paramBundle.getVisibility() != 8) {
      i = 1;
    } else {
      i = 0;
    }
    int j;
    if ((localObject3 != null) && (((View)localObject3).getVisibility() != 8)) {
      j = 1;
    } else {
      j = 0;
    }
    int k;
    if (((View)localObject4).getVisibility() != 8) {
      k = 1;
    } else {
      k = 0;
    }
    if (k == 0)
    {
      paramBundle = ((View)localObject2).findViewById(2131230894);
      if (paramBundle != null) {
        paramBundle.setVisibility(0);
      }
    }
    if (j != 0)
    {
      paramBundle = mScrollView;
      if (paramBundle != null) {
        paramBundle.setClipToPadding(true);
      }
      if (mListView != null) {
        paramBundle = ((View)localObject3).findViewById(2131230898);
      } else {
        paramBundle = null;
      }
      if (paramBundle != null) {
        paramBundle.setVisibility(0);
      }
    }
    else
    {
      paramBundle = ((View)localObject2).findViewById(2131230895);
      if (paramBundle != null) {
        paramBundle.setVisibility(0);
      }
    }
    paramBundle = mListView;
    if (paramBundle != null)
    {
      paramBundle.getClass();
      if ((k == 0) || (j == 0))
      {
        int i2 = paramBundle.getPaddingLeft();
        int m;
        if (j != 0) {
          m = paramBundle.getPaddingTop();
        } else {
          m = mSelectedIndex;
        }
        int i3 = paramBundle.getPaddingRight();
        int n;
        if (k != 0) {
          n = paramBundle.getPaddingBottom();
        } else {
          n = mSelected;
        }
        paramBundle.setPadding(i2, m, i3, n);
      }
    }
    if (i == 0)
    {
      paramBundle = mListView;
      if (paramBundle == null) {
        paramBundle = mScrollView;
      }
      if (paramBundle != null)
      {
        if (k != 0) {
          i = i1;
        } else {
          i = 0;
        }
        localObject3 = ((Window)localObject1).findViewById(2131230851);
        localObject1 = ((Window)localObject1).findViewById(2131230850);
        localObject4 = ViewCompat.this$0;
        Menu.setScrollIndicators(paramBundle, i | j, 3);
        if (localObject3 != null) {
          ((ViewGroup)localObject2).removeView((View)localObject3);
        }
        if (localObject1 != null) {
          ((ViewGroup)localObject2).removeView((View)localObject1);
        }
      }
    }
    paramBundle = mListView;
    if (paramBundle != null)
    {
      localObject1 = mAdapter;
      if (localObject1 != null)
      {
        paramBundle.setAdapter((ListAdapter)localObject1);
        i = mCheckedItem;
        if (i > -1)
        {
          paramBundle.setItemChecked(i, true);
          paramBundle.setSelection(i);
        }
      }
    }
  }
  
  public final boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    NestedScrollView localNestedScrollView = this$0.mScrollView;
    if ((localNestedScrollView != null) && (localNestedScrollView.executeKeyEvent(paramKeyEvent))) {
      return true;
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public final boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    NestedScrollView localNestedScrollView = this$0.mScrollView;
    if ((localNestedScrollView != null) && (localNestedScrollView.executeKeyEvent(paramKeyEvent))) {
      return true;
    }
    return super.onKeyUp(paramInt, paramKeyEvent);
  }
  
  public final Bundle onSaveInstanceState()
  {
    Bundle localBundle = super.onSaveInstanceState();
    Log.append(localBundle, "super.onSaveInstanceState()");
    d.b(localBundle);
    return localBundle;
  }
  
  public final void onStart()
  {
    super.onStart();
    e().d(Handle.ON_RESUME);
  }
  
  public final void onStop()
  {
    setTitle();
    Object localObject = (AppCompatDelegateImplV7)a();
    ((AppCompatDelegateImplV7)localObject).initWindowDecorActionBar();
    localObject = this$0;
    if (localObject != null) {
      ((ActionBar)localObject).setShowHideAnimationEnabled(false);
    }
  }
  
  public final void onSupportActionModeFinished(ActionMode paramActionMode) {}
  
  public final void onSupportActionModeStarted(ActionMode paramActionMode) {}
  
  public final ActionMode onWindowStartingSupportActionMode(ActionMode.Callback paramCallback)
  {
    return null;
  }
  
  public final void setContentView(int paramInt)
  {
    hide();
    a().setContentView(paramInt);
  }
  
  public final void setContentView(View paramView)
  {
    hide();
    a().setContentView(paramView);
  }
  
  public final void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    hide();
    a().setContentView(paramView, paramLayoutParams);
  }
  
  public final void setTitle()
  {
    e().d(Handle.ON_DESTROY);
    b = null;
    super.onStop();
  }
  
  public final void setTitle(int paramInt)
  {
    super.setTitle(paramInt);
    a().b(getContext().getString(paramInt));
  }
  
  public final void setTitle(Bundle paramBundle)
  {
    a().b();
    a(paramBundle);
    a().onCreate();
  }
  
  public final void setTitle(CharSequence paramCharSequence)
  {
    a(paramCharSequence);
    Object localObject = this$0;
    d = paramCharSequence;
    localObject = c;
    if (localObject != null) {
      ((TextView)localObject).setText(paramCharSequence);
    }
  }
}
