package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;

public final class DrawableWrapper
  extends Drawable
  implements Drawable.Callback
{
  public Drawable mDrawable;
  public boolean mEnabled;
  
  public final void draw(float paramFloat1, float paramFloat2)
  {
    mDrawable.setHotspot(paramFloat1, paramFloat2);
  }
  
  public final void draw(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    mDrawable.setHotspotBounds(paramInt1, paramInt2, paramInt3, paramInt4);
  }
  
  public final void draw(Canvas paramCanvas)
  {
    if (mEnabled) {
      setState(paramCanvas);
    }
  }
  
  public final int getChangingConfigurations()
  {
    return mDrawable.getChangingConfigurations();
  }
  
  public final Drawable getCurrent()
  {
    return mDrawable.getCurrent();
  }
  
  public final int getIntrinsicHeight()
  {
    return mDrawable.getIntrinsicHeight();
  }
  
  public final int getIntrinsicWidth()
  {
    return mDrawable.getIntrinsicWidth();
  }
  
  public final int getMinimumHeight()
  {
    return mDrawable.getMinimumHeight();
  }
  
  public final int getMinimumWidth()
  {
    return mDrawable.getMinimumWidth();
  }
  
  public final int getOpacity()
  {
    return mDrawable.getOpacity();
  }
  
  public final boolean getPadding(Rect paramRect)
  {
    return mDrawable.getPadding(paramRect);
  }
  
  public final int[] getState()
  {
    return mDrawable.getState();
  }
  
  public final Region getTransparentRegion()
  {
    return mDrawable.getTransparentRegion();
  }
  
  public final void invalidateDrawable(Drawable paramDrawable)
  {
    invalidateSelf();
  }
  
  public final boolean isAutoMirrored()
  {
    return mDrawable.isAutoMirrored();
  }
  
  public final boolean isStateful()
  {
    return mDrawable.isStateful();
  }
  
  public final void jumpToCurrentState()
  {
    mDrawable.jumpToCurrentState();
  }
  
  public final void onBoundsChange(Rect paramRect)
  {
    mDrawable.setBounds(paramRect);
  }
  
  public final boolean onLevelChange(int paramInt)
  {
    return mDrawable.setLevel(paramInt);
  }
  
  public final void scheduleDrawable(Drawable paramDrawable, Runnable paramRunnable, long paramLong)
  {
    scheduleSelf(paramRunnable, paramLong);
  }
  
  public final void setAlpha(int paramInt)
  {
    mDrawable.setAlpha(paramInt);
  }
  
  public final void setAutoMirrored(boolean paramBoolean)
  {
    mDrawable.setAutoMirrored(paramBoolean);
  }
  
  public final void setChangingConfigurations(int paramInt)
  {
    mDrawable.setChangingConfigurations(paramInt);
  }
  
  public final void setColorFilter(ColorFilter paramColorFilter)
  {
    mDrawable.setColorFilter(paramColorFilter);
  }
  
  public final void setDither(boolean paramBoolean)
  {
    mDrawable.setDither(paramBoolean);
  }
  
  public final void setFilterBitmap(boolean paramBoolean)
  {
    mDrawable.setFilterBitmap(paramBoolean);
  }
  
  public final void setHotspot(float paramFloat1, float paramFloat2)
  {
    if (mEnabled) {
      draw(paramFloat1, paramFloat2);
    }
  }
  
  public final void setHotspotBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (mEnabled) {
      draw(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public final void setState(Canvas paramCanvas)
  {
    mDrawable.draw(paramCanvas);
  }
  
  public final boolean setState(int[] paramArrayOfInt)
  {
    if (mEnabled) {
      return mDrawable.setState(paramArrayOfInt);
    }
    return false;
  }
  
  public final void setTint(int paramInt)
  {
    mDrawable.setTint(paramInt);
  }
  
  public final void setTintList(ColorStateList paramColorStateList)
  {
    mDrawable.setTintList(paramColorStateList);
  }
  
  public final void setTintMode(PorterDuff.Mode paramMode)
  {
    mDrawable.setTintMode(paramMode);
  }
  
  public final boolean setVisible(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (mEnabled) {
      return update(paramBoolean1, paramBoolean2);
    }
    return false;
  }
  
  public final void unscheduleDrawable(Drawable paramDrawable, Runnable paramRunnable)
  {
    unscheduleSelf(paramRunnable);
  }
  
  public final boolean update(boolean paramBoolean1, boolean paramBoolean2)
  {
    return (super.setVisible(paramBoolean1, paramBoolean2)) || (mDrawable.setVisible(paramBoolean1, paramBoolean2));
  }
}
