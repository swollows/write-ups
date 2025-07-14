package app;

import android.view.View;

public abstract class m
{
  public static void a(View paramView, CharSequence paramCharSequence)
  {
    paramView.setAccessibilityPaneTitle(paramCharSequence);
  }
  
  public static boolean b(View paramView)
  {
    return paramView.isAccessibilityHeading();
  }
  
  public static boolean c(View paramView)
  {
    return paramView.isScreenReaderFocusable();
  }
  
  public static CharSequence format(View paramView)
  {
    return paramView.getAccessibilityPaneTitle();
  }
  
  public static void setChecked(View paramView, boolean paramBoolean)
  {
    paramView.setScreenReaderFocusable(paramBoolean);
  }
  
  public static void setEnabled(View paramView, boolean paramBoolean)
  {
    paramView.setAccessibilityHeading(paramBoolean);
  }
}
