package menu;

import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.view.ActionProvider;
import android.view.CollapsibleActionView;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.MenuItem.OnActionExpandListener;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.app.e;
import java.lang.reflect.Method;

public final class MenuItemWrapper
  extends e
  implements android.view.MenuItem
{
  public Method d;
  public final preferences.MenuItem mNativeItem;
  
  public MenuItemWrapper(Context paramContext, preferences.MenuItem paramMenuItem)
  {
    super(paramContext);
    if (paramMenuItem != null)
    {
      mNativeItem = paramMenuItem;
      return;
    }
    throw new IllegalArgumentException("Wrapped Object can not be null.");
  }
  
  public final boolean collapseActionView()
  {
    return mNativeItem.collapseActionView();
  }
  
  public final boolean expandActionView()
  {
    return mNativeItem.expandActionView();
  }
  
  public final ActionProvider getActionProvider()
  {
    d localD = mNativeItem.getSupportActionProvider();
    if (localD != null) {
      return a;
    }
    return null;
  }
  
  public final View getActionView()
  {
    View localView2 = mNativeItem.getActionView();
    View localView1 = localView2;
    if ((localView2 instanceof m)) {
      localView1 = (View)a;
    }
    return localView1;
  }
  
  public final int getAlphabeticModifiers()
  {
    return mNativeItem.getAlphabeticModifiers();
  }
  
  public final char getAlphabeticShortcut()
  {
    return mNativeItem.getAlphabeticShortcut();
  }
  
  public final CharSequence getContentDescription()
  {
    return mNativeItem.getContentDescription();
  }
  
  public final int getGroupId()
  {
    return mNativeItem.getGroupId();
  }
  
  public final Drawable getIcon()
  {
    return mNativeItem.getIcon();
  }
  
  public final ColorStateList getIconTintList()
  {
    return mNativeItem.getIconTintList();
  }
  
  public final PorterDuff.Mode getIconTintMode()
  {
    return mNativeItem.getIconTintMode();
  }
  
  public final Intent getIntent()
  {
    return mNativeItem.getIntent();
  }
  
  public final int getItemId()
  {
    return mNativeItem.getItemId();
  }
  
  public final ContextMenu.ContextMenuInfo getMenuInfo()
  {
    return mNativeItem.getMenuInfo();
  }
  
  public final int getNumericModifiers()
  {
    return mNativeItem.getNumericModifiers();
  }
  
  public final char getNumericShortcut()
  {
    return mNativeItem.getNumericShortcut();
  }
  
  public final int getOrder()
  {
    return mNativeItem.getOrder();
  }
  
  public final SubMenu getSubMenu()
  {
    return mNativeItem.getSubMenu();
  }
  
  public final CharSequence getTitle()
  {
    return mNativeItem.getTitle();
  }
  
  public final CharSequence getTitleCondensed()
  {
    return mNativeItem.getTitleCondensed();
  }
  
  public final CharSequence getTooltipText()
  {
    return mNativeItem.getTooltipText();
  }
  
  public final boolean hasSubMenu()
  {
    return mNativeItem.hasSubMenu();
  }
  
  public final boolean isActionViewExpanded()
  {
    return mNativeItem.isActionViewExpanded();
  }
  
  public final boolean isCheckable()
  {
    return mNativeItem.isCheckable();
  }
  
  public final boolean isChecked()
  {
    return mNativeItem.isChecked();
  }
  
  public final boolean isEnabled()
  {
    return mNativeItem.isEnabled();
  }
  
  public final boolean isVisible()
  {
    return mNativeItem.isVisible();
  }
  
  public final android.view.MenuItem setActionProvider(ActionProvider paramActionProvider)
  {
    d localD = new d(this, paramActionProvider);
    if (paramActionProvider != null) {
      paramActionProvider = localD;
    } else {
      paramActionProvider = null;
    }
    mNativeItem.a(paramActionProvider);
    return this;
  }
  
  public final android.view.MenuItem setActionView(int paramInt)
  {
    preferences.MenuItem localMenuItem = mNativeItem;
    localMenuItem.setActionView(paramInt);
    View localView = localMenuItem.getActionView();
    if ((localView instanceof CollapsibleActionView)) {
      localMenuItem.setActionView(new m(localView));
    }
    return this;
  }
  
  public final android.view.MenuItem setActionView(View paramView)
  {
    Object localObject = paramView;
    if ((paramView instanceof CollapsibleActionView)) {
      localObject = new m(paramView);
    }
    mNativeItem.setActionView((View)localObject);
    return this;
  }
  
  public final android.view.MenuItem setAlphabeticShortcut(char paramChar)
  {
    mNativeItem.setAlphabeticShortcut(paramChar);
    return this;
  }
  
  public final android.view.MenuItem setAlphabeticShortcut(char paramChar, int paramInt)
  {
    mNativeItem.setAlphabeticShortcut(paramChar, paramInt);
    return this;
  }
  
  public final android.view.MenuItem setCheckable(boolean paramBoolean)
  {
    mNativeItem.setCheckable(paramBoolean);
    return this;
  }
  
  public final android.view.MenuItem setChecked(boolean paramBoolean)
  {
    mNativeItem.setChecked(paramBoolean);
    return this;
  }
  
  public final android.view.MenuItem setContentDescription(CharSequence paramCharSequence)
  {
    mNativeItem.setContentDescription(paramCharSequence);
    return this;
  }
  
  public final android.view.MenuItem setEnabled(boolean paramBoolean)
  {
    mNativeItem.setEnabled(paramBoolean);
    return this;
  }
  
  public final android.view.MenuItem setIcon(int paramInt)
  {
    mNativeItem.setIcon(paramInt);
    return this;
  }
  
  public final android.view.MenuItem setIcon(Drawable paramDrawable)
  {
    mNativeItem.setIcon(paramDrawable);
    return this;
  }
  
  public final android.view.MenuItem setIconTintList(ColorStateList paramColorStateList)
  {
    mNativeItem.setIconTintList(paramColorStateList);
    return this;
  }
  
  public final android.view.MenuItem setIconTintMode(PorterDuff.Mode paramMode)
  {
    mNativeItem.setIconTintMode(paramMode);
    return this;
  }
  
  public final android.view.MenuItem setIntent(Intent paramIntent)
  {
    mNativeItem.setIntent(paramIntent);
    return this;
  }
  
  public final android.view.MenuItem setNumericShortcut(char paramChar)
  {
    mNativeItem.setNumericShortcut(paramChar);
    return this;
  }
  
  public final android.view.MenuItem setNumericShortcut(char paramChar, int paramInt)
  {
    mNativeItem.setNumericShortcut(paramChar, paramInt);
    return this;
  }
  
  public final android.view.MenuItem setOnActionExpandListener(MenuItem.OnActionExpandListener paramOnActionExpandListener)
  {
    if (paramOnActionExpandListener != null) {
      paramOnActionExpandListener = new MenuItemCompatIcs.OnActionExpandListenerWrapper(this, paramOnActionExpandListener);
    } else {
      paramOnActionExpandListener = null;
    }
    mNativeItem.setOnActionExpandListener(paramOnActionExpandListener);
    return this;
  }
  
  public final android.view.MenuItem setOnMenuItemClickListener(MenuItem.OnMenuItemClickListener paramOnMenuItemClickListener)
  {
    if (paramOnMenuItemClickListener != null) {
      paramOnMenuItemClickListener = new MenuItemWrapperICS.OnMenuItemClickListenerWrapper(this, paramOnMenuItemClickListener);
    } else {
      paramOnMenuItemClickListener = null;
    }
    mNativeItem.setOnMenuItemClickListener(paramOnMenuItemClickListener);
    return this;
  }
  
  public final android.view.MenuItem setShortcut(char paramChar1, char paramChar2)
  {
    mNativeItem.setShortcut(paramChar1, paramChar2);
    return this;
  }
  
  public final android.view.MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2)
  {
    mNativeItem.setShortcut(paramChar1, paramChar2, paramInt1, paramInt2);
    return this;
  }
  
  public final void setShowAsAction(int paramInt)
  {
    mNativeItem.setShowAsAction(paramInt);
  }
  
  public final android.view.MenuItem setShowAsActionFlags(int paramInt)
  {
    mNativeItem.setShowAsActionFlags(paramInt);
    return this;
  }
  
  public final android.view.MenuItem setTitle(int paramInt)
  {
    mNativeItem.setTitle(paramInt);
    return this;
  }
  
  public final android.view.MenuItem setTitle(CharSequence paramCharSequence)
  {
    mNativeItem.setTitle(paramCharSequence);
    return this;
  }
  
  public final android.view.MenuItem setTitleCondensed(CharSequence paramCharSequence)
  {
    mNativeItem.setTitleCondensed(paramCharSequence);
    return this;
  }
  
  public final android.view.MenuItem setTooltipText(CharSequence paramCharSequence)
  {
    mNativeItem.setTooltipText(paramCharSequence);
    return this;
  }
  
  public final android.view.MenuItem setVisible(boolean paramBoolean)
  {
    return mNativeItem.setVisible(paramBoolean);
  }
}
