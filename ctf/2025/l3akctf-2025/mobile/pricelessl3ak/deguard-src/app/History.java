package app;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.view.MenuItem;

public abstract class History
{
  public static void a(MenuItem paramMenuItem, char paramChar, int paramInt)
  {
    paramMenuItem.setNumericShortcut(paramChar, paramInt);
  }
  
  public static void a(MenuItem paramMenuItem, CharSequence paramCharSequence)
  {
    paramMenuItem.setTooltipText(paramCharSequence);
  }
  
  public static void update(MenuItem paramMenuItem, char paramChar, int paramInt)
  {
    paramMenuItem.setAlphabeticShortcut(paramChar, paramInt);
  }
  
  public static void update(MenuItem paramMenuItem, ColorStateList paramColorStateList)
  {
    paramMenuItem.setIconTintList(paramColorStateList);
  }
  
  public static void update(MenuItem paramMenuItem, PorterDuff.Mode paramMode)
  {
    paramMenuItem.setIconTintMode(paramMode);
  }
  
  public static void update(MenuItem paramMenuItem, CharSequence paramCharSequence)
  {
    paramMenuItem.setContentDescription(paramCharSequence);
  }
}
