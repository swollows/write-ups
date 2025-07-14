package androidx.appcompat.widget;

import android.graphics.Insets;
import android.graphics.Rect;
import android.view.View;
import android.view.WindowInsets;
import android.view.WindowInsets.Builder;

public abstract class Handler
{
  public static void init(View paramView, Rect paramRect1, Rect paramRect2)
  {
    paramView = paramView.computeSystemWindowInsets(new WindowInsets.Builder().setSystemWindowInsets(Insets.of(paramRect1)).build(), paramRect2).getSystemWindowInsets();
    paramRect1.set(left, top, right, bottom);
  }
}
