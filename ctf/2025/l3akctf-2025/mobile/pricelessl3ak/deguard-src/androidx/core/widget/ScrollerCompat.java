package androidx.core.widget;

import android.view.View;

public abstract class ScrollerCompat
{
  public static void create(NestedScrollView paramNestedScrollView, float paramFloat)
  {
    try
    {
      paramNestedScrollView.setFrameContentVelocity(paramFloat);
      return;
    }
    catch (LinkageError paramNestedScrollView) {}
  }
}
