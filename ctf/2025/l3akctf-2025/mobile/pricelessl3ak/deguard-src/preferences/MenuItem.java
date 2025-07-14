package preferences;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import menu.d;

public abstract interface MenuItem
  extends android.view.MenuItem
{
  public abstract MenuItem a(d paramD);
  
  public abstract int getAlphabeticModifiers();
  
  public abstract CharSequence getContentDescription();
  
  public abstract ColorStateList getIconTintList();
  
  public abstract PorterDuff.Mode getIconTintMode();
  
  public abstract int getNumericModifiers();
  
  public abstract d getSupportActionProvider();
  
  public abstract CharSequence getTooltipText();
  
  public abstract android.view.MenuItem setAlphabeticShortcut(char paramChar, int paramInt);
  
  public abstract MenuItem setContentDescription(CharSequence paramCharSequence);
  
  public abstract android.view.MenuItem setIconTintList(ColorStateList paramColorStateList);
  
  public abstract android.view.MenuItem setIconTintMode(PorterDuff.Mode paramMode);
  
  public abstract android.view.MenuItem setNumericShortcut(char paramChar, int paramInt);
  
  public abstract android.view.MenuItem setShortcut(char paramChar1, char paramChar2, int paramInt1, int paramInt2);
  
  public abstract MenuItem setTooltipText(CharSequence paramCharSequence);
}
