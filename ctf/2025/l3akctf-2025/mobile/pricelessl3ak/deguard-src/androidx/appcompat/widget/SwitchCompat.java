package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.SeekBar;

public final class SwitchCompat
  extends SeekBar
{
  public final AppCompatTextHelper mThumbDrawable;
  
  public SwitchCompat(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 2130903251);
    ThemeUtils.a(this, getContext());
    paramContext = new AppCompatTextHelper(this);
    mThumbDrawable = paramContext;
    paramContext.loadFromAttributes(paramAttributeSet, 2130903251);
  }
  
  public final void drawableStateChanged()
  {
    super.drawableStateChanged();
    Object localObject = mThumbDrawable;
    Drawable localDrawable = mDrawable;
    if ((localDrawable != null) && (localDrawable.isStateful()))
    {
      localObject = mView;
      if (localDrawable.setState(((View)localObject).getDrawableState())) {
        ((View)localObject).invalidateDrawable(localDrawable);
      }
    }
  }
  
  public final void jumpDrawablesToCurrentState()
  {
    super.jumpDrawablesToCurrentState();
    Drawable localDrawable = mThumbDrawable.mDrawable;
    if (localDrawable != null) {
      localDrawable.jumpToCurrentState();
    }
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    try
    {
      super.onDraw(paramCanvas);
      mThumbDrawable.draw(paramCanvas);
      return;
    }
    catch (Throwable paramCanvas)
    {
      throw paramCanvas;
    }
  }
}
