package androidx.appcompat.widget;

import Console.R.styleable;
import a.ClassWriter;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.TextView;
import app.ViewCompat;

public final class AppCompatCompoundButtonHelper
{
  public ColorStateList mButtonTintList;
  public PorterDuff.Mode mButtonTintMode;
  public boolean mHasButtonTint;
  public boolean mHasButtonTintMode;
  public boolean mSkipNextApply;
  public final TextView mView;
  
  public void applyButtonTint()
  {
    CompoundButton localCompoundButton = (CompoundButton)mView;
    Drawable localDrawable = localCompoundButton.getButtonDrawable();
    if ((localDrawable != null) && ((mHasButtonTint) || (mHasButtonTintMode)))
    {
      localDrawable = localDrawable.mutate();
      if (mHasButtonTint) {
        localDrawable.setTintList(mButtonTintList);
      }
      if (mHasButtonTintMode) {
        localDrawable.setTintMode(mButtonTintMode);
      }
      if (localDrawable.isStateful()) {
        localDrawable.setState(localCompoundButton.getDrawableState());
      }
      localCompoundButton.setButtonDrawable(localDrawable);
    }
  }
  
  public void loadFromAttributes(AttributeSet paramAttributeSet, int paramInt)
  {
    CompoundButton localCompoundButton = (CompoundButton)mView;
    Object localObject = localCompoundButton.getContext();
    int[] arrayOfInt = R.styleable.CompoundButton;
    localObject = ClassWriter.obtainStyledAttributes((android.content.Context)localObject, paramAttributeSet, arrayOfInt, paramInt);
    TypedArray localTypedArray = (TypedArray)b;
    ViewCompat.init(localCompoundButton, localCompoundButton.getContext(), arrayOfInt, paramAttributeSet, (TypedArray)b, paramInt);
    try
    {
      bool = localTypedArray.hasValue(1);
      if (bool)
      {
        paramInt = localTypedArray.getResourceId(1, 0);
        if (paramInt == 0) {}
      }
      bool = localTypedArray.hasValue(0);
    }
    catch (Throwable paramAttributeSet)
    {
      try
      {
        localCompoundButton.setButtonDrawable(drupal.Context.getDrawable(localCompoundButton.getContext(), paramInt));
      }
      catch (Resources.NotFoundException paramAttributeSet)
      {
        boolean bool;
        for (;;) {}
      }
      paramAttributeSet = paramAttributeSet;
    }
    if (bool)
    {
      paramInt = localTypedArray.getResourceId(0, 0);
      if (paramInt != 0) {
        localCompoundButton.setButtonDrawable(drupal.Context.getDrawable(localCompoundButton.getContext(), paramInt));
      }
    }
    bool = localTypedArray.hasValue(2);
    if (bool) {
      localCompoundButton.setButtonTintList(((ClassWriter)localObject).init(2));
    }
    bool = localTypedArray.hasValue(3);
    if (bool) {
      localCompoundButton.setButtonTintMode(Context.parseTintMode(localTypedArray.getInt(3, -1), null));
    }
    ((ClassWriter)localObject).recycle();
    return;
    ((ClassWriter)localObject).recycle();
    throw paramAttributeSet;
  }
  
  public void onBindViewHolder()
  {
    CheckedTextView localCheckedTextView = (CheckedTextView)mView;
    Drawable localDrawable = localCheckedTextView.getCheckMarkDrawable();
    if ((localDrawable != null) && ((mHasButtonTint) || (mHasButtonTintMode)))
    {
      localDrawable = localDrawable.mutate();
      if (mHasButtonTint) {
        localDrawable.setTintList(mButtonTintList);
      }
      if (mHasButtonTintMode) {
        localDrawable.setTintMode(mButtonTintMode);
      }
      if (localDrawable.isStateful()) {
        localDrawable.setState(localCheckedTextView.getDrawableState());
      }
      localCheckedTextView.setCheckMarkDrawable(localDrawable);
    }
  }
}
