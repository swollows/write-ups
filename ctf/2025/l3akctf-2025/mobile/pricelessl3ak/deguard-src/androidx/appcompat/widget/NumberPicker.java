package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.widget.RatingBar;

public final class NumberPicker
  extends RatingBar
{
  public final Label i;
  
  public NumberPicker(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 2130903245);
    ThemeUtils.a(this, getContext());
    paramContext = new Label(this);
    i = paramContext;
    paramContext.loadFromAttributes(paramAttributeSet, 2130903245);
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    try
    {
      super.onMeasure(paramInt1, paramInt2);
      Bitmap localBitmap = (Bitmap)i.k;
      if (localBitmap != null) {
        setMeasuredDimension(View.resolveSizeAndState(localBitmap.getWidth() * getNumStars(), paramInt1, 0), getMeasuredHeight());
      }
    }
    catch (Throwable localThrowable)
    {
      break label55;
    }
    return;
    label55:
    throw localThrowable;
  }
}
