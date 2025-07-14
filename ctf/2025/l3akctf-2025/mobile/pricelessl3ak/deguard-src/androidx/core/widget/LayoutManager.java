package androidx.core.widget;

import android.widget.EdgeEffect;

public abstract class LayoutManager
{
  public static void draw(EdgeEffect paramEdgeEffect, float paramFloat1, float paramFloat2)
  {
    paramEdgeEffect.onPull(paramFloat1, paramFloat2);
  }
}
