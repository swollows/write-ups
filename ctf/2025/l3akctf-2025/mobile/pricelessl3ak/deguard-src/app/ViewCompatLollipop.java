package app;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.os.Build.VERSION;
import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

public abstract class ViewCompatLollipop
{
  public static TypeToken get(View paramView, TypeToken paramTypeToken, Rect paramRect)
  {
    WindowInsets localWindowInsets = paramTypeToken.unwrap();
    if (localWindowInsets != null) {
      return TypeToken.get(paramView.computeSystemWindowInsets(localWindowInsets, paramRect), paramView);
    }
    paramRect.setEmpty();
    return paramTypeToken;
  }
  
  public static ColorStateList getBackgroundTintList(View paramView)
  {
    return paramView.getBackgroundTintList();
  }
  
  public static PorterDuff.Mode getBackgroundTintMode(View paramView)
  {
    return paramView.getBackgroundTintMode();
  }
  
  public static void onApplyWindowInsets(WindowInsets paramWindowInsets, View paramView)
  {
    View.OnApplyWindowInsetsListener localOnApplyWindowInsetsListener = (View.OnApplyWindowInsetsListener)paramView.getTag(2131230891);
    if (localOnApplyWindowInsetsListener != null) {
      localOnApplyWindowInsetsListener.onApplyWindowInsets(paramView, paramWindowInsets);
    }
  }
  
  public static void onCreateView(View paramView, ViewPropertyAnimatorUpdateListener paramViewPropertyAnimatorUpdateListener)
  {
    if (paramViewPropertyAnimatorUpdateListener != null) {
      paramViewPropertyAnimatorUpdateListener = new ViewCompatLollipop.1(paramView, paramViewPropertyAnimatorUpdateListener);
    } else {
      paramViewPropertyAnimatorUpdateListener = null;
    }
    if (Build.VERSION.SDK_INT < 30) {
      paramView.setTag(2131230882, paramViewPropertyAnimatorUpdateListener);
    }
    if (paramView.getTag(2131230881) != null) {
      return;
    }
    if (paramViewPropertyAnimatorUpdateListener != null)
    {
      paramView.setOnApplyWindowInsetsListener(paramViewPropertyAnimatorUpdateListener);
      return;
    }
    paramView.setOnApplyWindowInsetsListener((View.OnApplyWindowInsetsListener)paramView.getTag(2131230891));
  }
  
  public static void setBackgroundTintList(View paramView, ColorStateList paramColorStateList)
  {
    paramView.setBackgroundTintList(paramColorStateList);
  }
  
  public static void setBackgroundTintMode(View paramView, PorterDuff.Mode paramMode)
  {
    paramView.setBackgroundTintMode(paramMode);
  }
  
  public static void setElevation(View paramView, float paramFloat)
  {
    paramView.setElevation(paramFloat);
  }
  
  public static void stopNestedScroll(View paramView)
  {
    paramView.stopNestedScroll();
  }
}
