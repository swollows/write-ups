package androidx.appcompat.widget;

import Console.R.styleable;
import a.ClassWriter;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AbsSeekBar;
import android.widget.ProgressBar;
import app.ViewCompat;

public final class AppCompatTextHelper
  extends Label
{
  public ColorStateList mButtonTintList = null;
  public PorterDuff.Mode mButtonTintMode = null;
  public Drawable mDrawable;
  public boolean mHasButtonTint = false;
  public boolean mHasButtonTintMode = false;
  public final SwitchCompat mView;
  
  public AppCompatTextHelper(SwitchCompat paramSwitchCompat)
  {
    super(paramSwitchCompat);
    mView = paramSwitchCompat;
  }
  
  public final void applyButtonTint()
  {
    Drawable localDrawable = mDrawable;
    if ((localDrawable != null) && ((mHasButtonTint) || (mHasButtonTintMode)))
    {
      localDrawable = localDrawable.mutate();
      mDrawable = localDrawable;
      if (mHasButtonTint) {
        localDrawable.setTintList(mButtonTintList);
      }
      if (mHasButtonTintMode) {
        mDrawable.setTintMode(mButtonTintMode);
      }
      if (mDrawable.isStateful()) {
        mDrawable.setState(mView.getDrawableState());
      }
    }
  }
  
  public final void draw(Canvas paramCanvas)
  {
    if (mDrawable != null)
    {
      SwitchCompat localSwitchCompat = mView;
      int k = localSwitchCompat.getMax();
      int j = 1;
      if (k > 1)
      {
        int i = mDrawable.getIntrinsicWidth();
        int m = mDrawable.getIntrinsicHeight();
        if (i >= 0) {
          i /= 2;
        } else {
          i = 1;
        }
        if (m >= 0) {
          j = m / 2;
        }
        mDrawable.setBounds(-i, -j, i, j);
        float f = (localSwitchCompat.getWidth() - localSwitchCompat.getPaddingLeft() - localSwitchCompat.getPaddingRight()) / k;
        j = paramCanvas.save();
        paramCanvas.translate(localSwitchCompat.getPaddingLeft(), localSwitchCompat.getHeight() / 2);
        i = 0;
        while (i <= k)
        {
          mDrawable.draw(paramCanvas);
          paramCanvas.translate(f, 0.0F);
          i += 1;
        }
        paramCanvas.restoreToCount(j);
      }
    }
  }
  
  public final void loadFromAttributes(AttributeSet paramAttributeSet, int paramInt)
  {
    super.loadFromAttributes(paramAttributeSet, 2130903251);
    SwitchCompat localSwitchCompat = mView;
    Object localObject1 = localSwitchCompat.getContext();
    Object localObject2 = R.styleable.ViewBackgroundHelper;
    localObject1 = ClassWriter.obtainStyledAttributes((android.content.Context)localObject1, paramAttributeSet, (int[])localObject2, 2130903251);
    ViewCompat.init(localSwitchCompat, localSwitchCompat.getContext(), (int[])localObject2, paramAttributeSet, (TypedArray)b, 2130903251);
    paramAttributeSet = ((ClassWriter)localObject1).get(0);
    if (paramAttributeSet != null) {
      localSwitchCompat.setThumb(paramAttributeSet);
    }
    paramAttributeSet = ((ClassWriter)localObject1).getDrawable(1);
    localObject2 = mDrawable;
    if (localObject2 != null) {
      ((Drawable)localObject2).setCallback(null);
    }
    mDrawable = paramAttributeSet;
    if (paramAttributeSet != null)
    {
      paramAttributeSet.setCallback(localSwitchCompat);
      paramAttributeSet.setLayoutDirection(localSwitchCompat.getLayoutDirection());
      if (paramAttributeSet.isStateful()) {
        paramAttributeSet.setState(localSwitchCompat.getDrawableState());
      }
      applyButtonTint();
    }
    localSwitchCompat.invalidate();
    paramAttributeSet = (TypedArray)b;
    if (paramAttributeSet.hasValue(3))
    {
      mButtonTintMode = Context.parseTintMode(paramAttributeSet.getInt(3, -1), mButtonTintMode);
      mHasButtonTintMode = true;
    }
    if (paramAttributeSet.hasValue(2))
    {
      mButtonTintList = ((ClassWriter)localObject1).init(2);
      mHasButtonTint = true;
    }
    ((ClassWriter)localObject1).recycle();
    applyButtonTint();
  }
}
