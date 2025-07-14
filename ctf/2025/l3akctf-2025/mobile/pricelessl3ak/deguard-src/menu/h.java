package menu;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import android.widget.LinearLayout;
import java.util.ArrayList;

public final class h
  implements preferences.MenuItem
{
  public View A;
  public d B;
  public CharSequence a;
  public final f b;
  public final int c;
  public final int d;
  public CharSequence e;
  public CharSequence f;
  public Intent g;
  public char h;
  public char i;
  public final int id;
  public final int j;
  public int k = 4096;
  public int l = 4096;
  public boolean m = false;
  public ColorStateList mButtonTintList = null;
  public PorterDuff.Mode mButtonTintMode = null;
  public boolean mHasButtonTint = false;
  public boolean mHasButtonTintMode = false;
  public Drawable mIconDrawable;
  public int mIconResId = 0;
  public MenuItem.OnActionExpandListener mOnActionExpandListener;
  public int n = 16;
  public MenuItem.OnMenuItemClickListener o;
  public p p;
  public int q;
  public boolean r = false;
  public CharSequence u;
  
  public h(f paramF, int paramInt1, int paramInt2, int paramInt3, int paramInt4, CharSequence paramCharSequence, int paramInt5)
  {
    b = paramF;
    id = paramInt2;
    j = paramInt1;
    c = paramInt3;
    d = paramInt4;
    a = paramCharSequence;
    q = paramInt5;
  }
  
  public static void add(StringBuilder paramStringBuilder, int paramInt1, int paramInt2, String paramString)
  {
    if ((paramInt1 & paramInt2) == paramInt2) {
      paramStringBuilder.append(paramString);
    }
  }
  
  public final Drawable a(Drawable paramDrawable)
  {
    Drawable localDrawable = paramDrawable;
    if (paramDrawable != null)
    {
      localDrawable = paramDrawable;
      if (m) {
        if (!mHasButtonTint)
        {
          localDrawable = paramDrawable;
          if (!mHasButtonTintMode) {}
        }
        else
        {
          localDrawable = paramDrawable.mutate();
          if (mHasButtonTint) {
            localDrawable.setTintList(mButtonTintList);
          }
          if (mHasButtonTintMode) {
            localDrawable.setTintMode(mButtonTintMode);
          }
          m = false;
        }
      }
    }
    return localDrawable;
  }
  
  public final preferences.MenuItem a(d paramD)
  {
    A = null;
    B = paramD;
    b.b(true);
    paramD = B;
    if (paramD != null)
    {
      b = new app.f(16, this);
      a.setVisibilityListener(paramD);
    }
    return this;
  }
  
  public final boolean a()
  {
    return (n & 0x20) == 32;
  }
  
  public final boolean collapseActionView()
  {
    if ((q & 0x8) == 0) {
      return false;
    }
    if (A == null) {
      return true;
    }
    MenuItem.OnActionExpandListener localOnActionExpandListener = mOnActionExpandListener;
    if ((localOnActionExpandListener != null) && (!localOnActionExpandListener.onMenuItemActionCollapse(this))) {
      return false;
    }
    return b.d(this);
  }
  
  public final void d(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      n |= 0x20;
      return;
    }
    n &= 0xFFFFFFDF;
  }
  
  public final boolean expandActionView()
  {
    if (!n()) {
      return false;
    }
    MenuItem.OnActionExpandListener localOnActionExpandListener = mOnActionExpandListener;
    if ((localOnActionExpandListener != null) && (!localOnActionExpandListener.onMenuItemActionExpand(this))) {
      return false;
    }
    return b.c(this);
  }
  
  public final ActionProvider getActionProvider()
  {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.getActionProvider()");
  }
  
  public final View getActionView()
  {
    Object localObject = A;
    if (localObject != null) {
      return localObject;
    }
    localObject = B;
    if (localObject != null)
    {
      localObject = a.onCreateActionView(this);
      A = ((View)localObject);
      return localObject;
    }
    return null;
  }
  
  public final int getAlphabeticModifiers()
  {
    return l;
  }
  
  public final char getAlphabeticShortcut()
  {
    return i;
  }
  
  public final CharSequence getContentDescription()
  {
    return u;
  }
  
  public final int getGroupId()
  {
    return j;
  }
  
  public final Drawable getIcon()
  {
    Drawable localDrawable = mIconDrawable;
    if (localDrawable != null) {
      return a(localDrawable);
    }
    int i1 = mIconResId;
    if (i1 != 0)
    {
      localDrawable = drupal.Context.getDrawable(b.a, i1);
      mIconResId = 0;
      mIconDrawable = localDrawable;
      return a(localDrawable);
    }
    return null;
  }
  
  public final ColorStateList getIconTintList()
  {
    return mButtonTintList;
  }
  
  public final PorterDuff.Mode getIconTintMode()
  {
    return mButtonTintMode;
  }
  
  public final Intent getIntent()
  {
    return g;
  }
  
  public final int getItemId()
  {
    return id;
  }
  
  public final ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return null;
  }
  
  public final int getNumericModifiers()
  {
    return k;
  }
  
  public final char getNumericShortcut()
  {
    return h;
  }
  
  public final int getOrder()
  {
    return c;
  }
  
  public final SubMenu getSubMenu()
  {
    return p;
  }
  
  public final d getSupportActionProvider()
  {
    return B;
  }
  
  public final CharSequence getTitle()
  {
    return a;
  }
  
  public final CharSequence getTitleCondensed()
  {
    CharSequence localCharSequence = f;
    if (localCharSequence != null) {
      return localCharSequence;
    }
    return a;
  }
  
  public final CharSequence getTooltipText()
  {
    return e;
  }
  
  public final boolean hasSubMenu()
  {
    return p != null;
  }
  
  public final boolean isActionViewExpanded()
  {
    return r;
  }
  
  public final boolean isCheckable()
  {
    return (n & 0x1) == 1;
  }
  
  public final boolean isChecked()
  {
    return (n & 0x2) == 2;
  }
  
  public final boolean isEnabled()
  {
    return (n & 0x10) != 0;
  }
  
  public final boolean isVisible()
  {
    d localD = B;
    if ((localD != null) && (a.overridesItemVisibility()))
    {
      if (((n & 0x8) == 0) && (B.a.isVisible())) {
        return true;
      }
    }
    else if ((n & 0x8) == 0) {
      return true;
    }
    return false;
  }
  
  public final boolean n()
  {
    if ((q & 0x8) != 0)
    {
      if (A == null)
      {
        d localD = B;
        if (localD != null) {
          A = a.onCreateActionView(this);
        }
      }
      if (A != null) {
        return true;
      }
    }
    return false;
  }
  
  public final android.view.MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    throw new UnsupportedOperationException("This is not supported, use MenuItemCompat.setActionProvider()");
  }
  
  public final android.view.MenuItem setActionView(int paramInt)
  {
    Object localObject = b.a;
    localObject = LayoutInflater.from((android.content.Context)localObject).inflate(paramInt, new LinearLayout((android.content.Context)localObject), false);
    A = ((View)localObject);
    B = null;
    if ((localObject != null) && (((View)localObject).getId() == -1))
    {
      paramInt = id;
      if (paramInt > 0) {
        ((View)localObject).setId(paramInt);
      }
    }
    localObject = b;
    o = true;
    ((f)localObject).b(true);
    return this;
  }
  
  public final android.view.MenuItem setActionView(View paramView)
  {
    A = paramView;
    B = null;
    if ((paramView != null) && (paramView.getId() == -1))
    {
      int i1 = id;
      if (i1 > 0) {
        paramView.setId(i1);
      }
    }
    paramView = b;
    o = true;
    paramView.b(true);
    return this;
  }
  
  public final android.view.MenuItem setAlphabeticShortcut(char paramChar)
  {
    if (i == paramChar) {
      return this;
    }
    i = Character.toLowerCase(paramChar);
    b.b(false);
    return this;
  }
  
  public final android.view.MenuItem setAlphabeticShortcut(char paramChar, int paramInt)
  {
    if ((i == paramChar) && (l == paramInt)) {
      return this;
    }
    i = Character.toLowerCase(paramChar);
    l = KeyEvent.normalizeMetaState(paramInt);
    b.b(false);
    return this;
  }
  
  public final android.view.MenuItem setCheckable(boolean paramBoolean)
  {
    int i1 = n;
    int i2 = paramBoolean | i1 & 0xFFFFFFFE;
    n = i2;
    if (i1 != i2) {
      b.b(false);
    }
    return this;
  }
  
  public final android.view.MenuItem setChecked(boolean paramBoolean)
  {
    int i2 = n;
    int i1 = 2;
    if ((i2 & 0x4) != 0)
    {
      f localF = b;
      localF.getClass();
      ArrayList localArrayList = j;
      int i3 = localArrayList.size();
      localF.g();
      i1 = 0;
      while (i1 < i3)
      {
        h localH = (h)localArrayList.get(i1);
        if ((j == j) && ((n & 0x4) != 0) && (localH.isCheckable()))
        {
          if (localH == this) {
            i2 = 1;
          } else {
            i2 = 0;
          }
          int i4 = n;
          if (i2 != 0) {
            i2 = 2;
          } else {
            i2 = 0;
          }
          i2 |= i4 & 0xFFFFFFFD;
          n = i2;
          if (i4 != i2) {
            b.b(false);
          }
        }
        i1 += 1;
      }
      localF.h();
      return this;
    }
    if (!paramBoolean) {
      i1 = 0;
    }
    i1 = i2 & 0xFFFFFFFD | i1;
    n = i1;
    if (i2 != i1) {
      b.b(false);
    }
    return this;
  }
  
  public final preferences.MenuItem setContentDescription(CharSequence paramCharSequence)
  {
    u = paramCharSequence;
    b.b(false);
    return this;
  }
  
  public final android.view.MenuItem setEnabled(boolean paramBoolean)
  {
    if (paramBoolean) {
      n |= 0x10;
    } else {
      n &= 0xFFFFFFEF;
    }
    b.b(false);
    return this;
  }
  
  public final android.view.MenuItem setIcon(int paramInt)
  {
    mIconDrawable = null;
    mIconResId = paramInt;
    m = true;
    b.b(false);
    return this;
  }
  
  public final android.view.MenuItem setIcon(Drawable paramDrawable)
  {
    mIconResId = 0;
    mIconDrawable = paramDrawable;
    m = true;
    b.b(false);
    return this;
  }
  
  public final android.view.MenuItem setIconTintList(ColorStateList paramColorStateList)
  {
    mButtonTintList = paramColorStateList;
    mHasButtonTint = true;
    m = true;
    b.b(false);
    return this;
  }
  
  public final android.view.MenuItem setIconTintMode(PorterDuff.Mode paramMode)
  {
    mButtonTintMode = paramMode;
    mHasButtonTintMode = true;
    m = true;
    b.b(false);
    return this;
  }
  
  public final android.view.MenuItem setIntent(Intent paramIntent)
  {
    g = paramIntent;
    return this;
  }
  
  public final android.view.MenuItem setNumericShortcut(char paramChar)
  {
    if (h == paramChar) {
      return this;
    }
    h = paramChar;
    b.b(false);
    return this;
  }
  
  public final android.view.MenuItem setNumericShortcut(char paramChar, int paramInt)
  {
    if ((h == paramChar) && (k == paramInt)) {
      return this;
    }
    h = paramChar;
    k = KeyEvent.normalizeMetaState(paramInt);
    b.b(false);
    return this;
  }
  
  public final android.view.MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    mOnActionExpandListener = paramOnActionExpandListener;
    return this;
  }
  
  public final android.view.MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    o = paramOnMenuItemClickListener;
    return this;
  }
  
  public final android.view.MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    h = paramChar1;
    i = Character.toLowerCase(paramChar2);
    b.b(false);
    return this;
  }
  
  public final android.view.MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2)
  {
    h = paramChar1;
    k = KeyEvent.normalizeMetaState(paramInt1);
    i = Character.toLowerCase(paramChar2);
    l = KeyEvent.normalizeMetaState(paramInt2);
    b.b(false);
    return this;
  }
  
  public final void setShowAsAction(int paramInt)
  {
    int i1 = paramInt & 0x3;
    if ((i1 != 0) && (i1 != 1) && (i1 != 2)) {
      throw new IllegalArgumentException("SHOW_AS_ACTION_ALWAYS, SHOW_AS_ACTION_IF_ROOM, and SHOW_AS_ACTION_NEVER are mutually exclusive.");
    }
    q = paramInt;
    f localF = b;
    o = true;
    localF.b(true);
  }
  
  public final android.view.MenuItem setShowAsActionFlags(int paramInt)
  {
    setShowAsAction(paramInt);
    return this;
  }
  
  public final android.view.MenuItem setTitle(int paramInt)
  {
    setTitle(b.a.getString(paramInt));
    return this;
  }
  
  public final android.view.MenuItem setTitle(CharSequence paramCharSequence)
  {
    a = paramCharSequence;
    b.b(false);
    p localP = p;
    if (localP != null) {
      localP.setHeaderTitle(paramCharSequence);
    }
    return this;
  }
  
  public final android.view.MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    f = paramCharSequence;
    b.b(false);
    return this;
  }
  
  public final preferences.MenuItem setTooltipText(CharSequence paramCharSequence)
  {
    e = paramCharSequence;
    b.b(false);
    return this;
  }
  
  public final android.view.MenuItem setVisible(boolean paramBoolean)
  {
    int i2 = n;
    int i1;
    if (paramBoolean) {
      i1 = 0;
    } else {
      i1 = 8;
    }
    i1 |= i2 & 0xFFFFFFF7;
    n = i1;
    if (i2 != i1)
    {
      f localF = b;
      mIsVisibleItemsStale = true;
      localF.b(true);
    }
    return this;
  }
  
  public final String toString()
  {
    CharSequence localCharSequence = a;
    if (localCharSequence != null) {
      return localCharSequence.toString();
    }
    return null;
  }
}
