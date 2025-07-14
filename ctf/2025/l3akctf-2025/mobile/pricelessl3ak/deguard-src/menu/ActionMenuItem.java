package menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;

public final class ActionMenuItem
  implements preferences.MenuItem
{
  public boolean a;
  public PorterDuff.Mode b;
  public CharSequence currentName;
  public boolean e;
  public int h;
  public int i;
  public Drawable j;
  public ColorStateList l;
  public CharSequence mContentDesc;
  public Context mContext;
  public int mFlags;
  public Intent mIntent;
  public char mShortcutAlphabeticChar;
  public char mShortcutNumericChar;
  public CharSequence mTitle;
  public CharSequence mTitleCondensed;
  
  public final preferences.MenuItem a(d paramD)
  {
    throw new UnsupportedOperationException();
  }
  
  public final boolean collapseActionView()
  {
    return false;
  }
  
  public final boolean expandActionView()
  {
    return false;
  }
  
  public final ActionProvider getActionProvider()
  {
    throw new UnsupportedOperationException();
  }
  
  public final View getActionView()
  {
    return null;
  }
  
  public final int getAlphabeticModifiers()
  {
    return i;
  }
  
  public final char getAlphabeticShortcut()
  {
    return mShortcutAlphabeticChar;
  }
  
  public final CharSequence getContentDescription()
  {
    return mContentDesc;
  }
  
  public final int getGroupId()
  {
    return 0;
  }
  
  public final Drawable getIcon()
  {
    return j;
  }
  
  public final ColorStateList getIconTintList()
  {
    return l;
  }
  
  public final PorterDuff.Mode getIconTintMode()
  {
    return b;
  }
  
  public final Intent getIntent()
  {
    return mIntent;
  }
  
  public final int getItemId()
  {
    return 16908332;
  }
  
  public final ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return null;
  }
  
  public final int getNumericModifiers()
  {
    return h;
  }
  
  public final char getNumericShortcut()
  {
    return mShortcutNumericChar;
  }
  
  public final int getOrder()
  {
    return 0;
  }
  
  public final SubMenu getSubMenu()
  {
    return null;
  }
  
  public final d getSupportActionProvider()
  {
    return null;
  }
  
  public final CharSequence getTitle()
  {
    return mTitle;
  }
  
  public final CharSequence getTitleCondensed()
  {
    CharSequence localCharSequence = mTitleCondensed;
    if (localCharSequence != null) {
      return localCharSequence;
    }
    return mTitle;
  }
  
  public final CharSequence getTooltipText()
  {
    return currentName;
  }
  
  public final boolean hasSubMenu()
  {
    return false;
  }
  
  public final boolean isActionViewExpanded()
  {
    return false;
  }
  
  public final boolean isCheckable()
  {
    return (mFlags & 0x1) != 0;
  }
  
  public final boolean isChecked()
  {
    return (mFlags & 0x2) != 0;
  }
  
  public final boolean isEnabled()
  {
    return (mFlags & 0x10) != 0;
  }
  
  public final boolean isVisible()
  {
    return (mFlags & 0x8) == 0;
  }
  
  public final android.view.MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    throw new UnsupportedOperationException();
  }
  
  public final android.view.MenuItem setActionView(int paramInt)
  {
    throw new UnsupportedOperationException();
  }
  
  public final android.view.MenuItem setActionView(View paramView)
  {
    throw new UnsupportedOperationException();
  }
  
  public final android.view.MenuItem setAlphabeticShortcut(char paramChar)
  {
    mShortcutAlphabeticChar = Character.toLowerCase(paramChar);
    return this;
  }
  
  public final android.view.MenuItem setAlphabeticShortcut(char paramChar, int paramInt)
  {
    mShortcutAlphabeticChar = Character.toLowerCase(paramChar);
    i = KeyEvent.normalizeMetaState(paramInt);
    return this;
  }
  
  public final android.view.MenuItem setCheckable(boolean paramBoolean)
  {
    mFlags = (paramBoolean | mFlags & 0xFFFFFFFE);
    return this;
  }
  
  public final android.view.MenuItem setChecked(boolean paramBoolean)
  {
    int m = mFlags;
    int k;
    if (paramBoolean) {
      k = 2;
    } else {
      k = 0;
    }
    mFlags = (k | m & 0xFFFFFFFD);
    return this;
  }
  
  public final android.view.MenuItem setContentDescription(CharSequence paramCharSequence)
  {
    mContentDesc = paramCharSequence;
    return this;
  }
  
  public final preferences.MenuItem setContentDescription(CharSequence paramCharSequence)
  {
    mContentDesc = paramCharSequence;
    return this;
  }
  
  public final android.view.MenuItem setEnabled(boolean paramBoolean)
  {
    int m = mFlags;
    int k;
    if (paramBoolean) {
      k = 16;
    } else {
      k = 0;
    }
    mFlags = (k | m & 0xFFFFFFEF);
    return this;
  }
  
  public final android.view.MenuItem setIcon(int paramInt)
  {
    j = mContext.getDrawable(paramInt);
    setIcon();
    return this;
  }
  
  public final android.view.MenuItem setIcon(Drawable paramDrawable)
  {
    j = paramDrawable;
    setIcon();
    return this;
  }
  
  public final void setIcon()
  {
    Drawable localDrawable = j;
    if ((localDrawable != null) && ((a) || (e)))
    {
      j = localDrawable;
      localDrawable = localDrawable.mutate();
      j = localDrawable;
      if (a) {
        localDrawable.setTintList(l);
      }
      if (e) {
        j.setTintMode(b);
      }
    }
  }
  
  public final android.view.MenuItem setIconTintList(ColorStateList paramColorStateList)
  {
    l = paramColorStateList;
    a = true;
    setIcon();
    return this;
  }
  
  public final android.view.MenuItem setIconTintMode(PorterDuff.Mode paramMode)
  {
    b = paramMode;
    e = true;
    setIcon();
    return this;
  }
  
  public final android.view.MenuItem setIntent(Intent paramIntent)
  {
    mIntent = paramIntent;
    return this;
  }
  
  public final android.view.MenuItem setNumericShortcut(char paramChar)
  {
    mShortcutNumericChar = paramChar;
    return this;
  }
  
  public final android.view.MenuItem setNumericShortcut(char paramChar, int paramInt)
  {
    mShortcutNumericChar = paramChar;
    h = KeyEvent.normalizeMetaState(paramInt);
    return this;
  }
  
  public final android.view.MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    throw new UnsupportedOperationException();
  }
  
  public final android.view.MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    return this;
  }
  
  public final android.view.MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    mShortcutNumericChar = paramChar1;
    mShortcutAlphabeticChar = Character.toLowerCase(paramChar2);
    return this;
  }
  
  public final android.view.MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2)
  {
    mShortcutNumericChar = paramChar1;
    h = KeyEvent.normalizeMetaState(paramInt1);
    mShortcutAlphabeticChar = Character.toLowerCase(paramChar2);
    i = KeyEvent.normalizeMetaState(paramInt2);
    return this;
  }
  
  public final void setShowAsAction(int paramInt) {}
  
  public final android.view.MenuItem setShowAsActionFlags(int paramInt)
  {
    return this;
  }
  
  public final android.view.MenuItem setTitle(int paramInt)
  {
    mTitle = mContext.getResources().getString(paramInt);
    return this;
  }
  
  public final android.view.MenuItem setTitle(CharSequence paramCharSequence)
  {
    mTitle = paramCharSequence;
    return this;
  }
  
  public final android.view.MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    mTitleCondensed = paramCharSequence;
    return this;
  }
  
  public final android.view.MenuItem setTooltipText(CharSequence paramCharSequence)
  {
    currentName = paramCharSequence;
    return this;
  }
  
  public final preferences.MenuItem setTooltipText(CharSequence paramCharSequence)
  {
    currentName = paramCharSequence;
    return this;
  }
  
  public final android.view.MenuItem setVisible(boolean paramBoolean)
  {
    int m = mFlags;
    int k = 8;
    if (paramBoolean) {
      k = 0;
    }
    mFlags = (m & 0x8 | k);
    return this;
  }
}
