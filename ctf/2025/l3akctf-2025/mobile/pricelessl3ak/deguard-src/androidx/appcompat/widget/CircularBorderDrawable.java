package androidx.appcompat.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Outline;
import android.graphics.drawable.Drawable;

public final class CircularBorderDrawable
  extends Drawable
{
  public final ActionBarContainer mContainer;
  
  public CircularBorderDrawable(ActionBarContainer paramActionBarContainer)
  {
    mContainer = paramActionBarContainer;
  }
  
  public final void draw(Canvas paramCanvas)
  {
    Object localObject = mContainer;
    if (mIsSplit)
    {
      localObject = mSplitBackground;
      if (localObject != null) {
        ((Drawable)localObject).draw(paramCanvas);
      }
    }
    else
    {
      Drawable localDrawable = mBackground;
      if (localDrawable != null) {
        localDrawable.draw(paramCanvas);
      }
      localDrawable = mStackedBackground;
      if ((localDrawable != null) && (mIsStacked)) {
        localDrawable.draw(paramCanvas);
      }
    }
  }
  
  public final int getOpacity()
  {
    return 0;
  }
  
  public final void getOutline(Outline paramOutline)
  {
    Object localObject = mContainer;
    if (mIsSplit)
    {
      if (mSplitBackground != null) {
        mBackground.getOutline(paramOutline);
      }
    }
    else
    {
      localObject = mBackground;
      if (localObject != null) {
        ((Drawable)localObject).getOutline(paramOutline);
      }
    }
  }
  
  public final void setAlpha(int paramInt) {}
  
  public final void setColorFilter(ColorFilter paramColorFilter) {}
}
