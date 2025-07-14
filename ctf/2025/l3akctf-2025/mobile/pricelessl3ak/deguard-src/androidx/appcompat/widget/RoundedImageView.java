package androidx.appcompat.widget;

import Console.R.styleable;
import a.ClassWriter;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import app.ViewCompat;

public final class RoundedImageView
{
  public TintInfo mBackgroundTint;
  public int mIcon = 0;
  public final ImageView mView;
  
  public RoundedImageView(ImageView paramImageView)
  {
    mView = paramImageView;
  }
  
  public final void init(AttributeSet paramAttributeSet, int paramInt)
  {
    ImageView localImageView = mView;
    Object localObject2 = localImageView.getContext();
    Object localObject1 = R.styleable.View;
    ClassWriter localClassWriter = ClassWriter.obtainStyledAttributes((android.content.Context)localObject2, paramAttributeSet, (int[])localObject1, paramInt);
    ViewCompat.init(localImageView, localImageView.getContext(), (int[])localObject1, paramAttributeSet, (TypedArray)b, paramInt);
    TypedArray localTypedArray;
    try
    {
      localObject2 = localImageView.getDrawable();
      localObject1 = localObject2;
      localTypedArray = (TypedArray)b;
      paramAttributeSet = (AttributeSet)localObject1;
      if (localObject2 == null)
      {
        paramInt = localTypedArray.getResourceId(1, -1);
        paramAttributeSet = (AttributeSet)localObject1;
        if (paramInt != -1)
        {
          localObject2 = drupal.Context.getDrawable(localImageView.getContext(), paramInt);
          localObject1 = localObject2;
          paramAttributeSet = (AttributeSet)localObject1;
          if (localObject2 != null)
          {
            localImageView.setImageDrawable((Drawable)localObject2);
            paramAttributeSet = (AttributeSet)localObject1;
          }
        }
      }
    }
    catch (Throwable paramAttributeSet)
    {
      break label199;
    }
    if (paramAttributeSet != null) {
      Context.update(paramAttributeSet);
    }
    boolean bool = localTypedArray.hasValue(2);
    if (bool) {
      localImageView.setImageTintList(localClassWriter.init(2));
    }
    bool = localTypedArray.hasValue(3);
    if (bool) {
      localImageView.setImageTintMode(Context.parseTintMode(localTypedArray.getInt(3, -1), null));
    }
    localClassWriter.recycle();
    return;
    label199:
    localClassWriter.recycle();
    throw paramAttributeSet;
  }
  
  public final void setImageResource()
  {
    ImageView localImageView = mView;
    Drawable localDrawable = localImageView.getDrawable();
    if (localDrawable != null) {
      Context.update(localDrawable);
    }
    if (localDrawable != null)
    {
      TintInfo localTintInfo = mBackgroundTint;
      if (localTintInfo != null) {
        AppCompatDrawableManager.tintDrawable(localDrawable, localTintInfo, localImageView.getDrawableState());
      }
    }
  }
}
