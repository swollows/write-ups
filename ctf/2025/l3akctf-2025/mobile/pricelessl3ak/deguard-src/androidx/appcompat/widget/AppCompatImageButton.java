package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.View;
import android.widget.CompoundButton;
import android.widget.RadioButton;
import android.widget.TextView;
import app.f;

public final class AppCompatImageButton
  extends RadioButton
{
  public ByteVector lineNumber;
  public final AppCompatBackgroundHelper mBackgroundTintHelper;
  public final AppCompatCompoundButtonHelper mCompoundButtonHelper;
  public final ClassWriter mDatePicker;
  
  public AppCompatImageButton(android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 2130903244);
    ThemeUtils.a(this, getContext());
    paramContext = new AppCompatCompoundButtonHelper(this);
    mCompoundButtonHelper = paramContext;
    paramContext.loadFromAttributes(paramAttributeSet, 2130903244);
    paramContext = new AppCompatBackgroundHelper(this);
    mBackgroundTintHelper = paramContext;
    paramContext.loadFromAttributes(paramAttributeSet, 2130903244);
    paramContext = new ClassWriter(this);
    mDatePicker = paramContext;
    paramContext.init(paramAttributeSet, 2130903244);
    getEmojiTextViewHelper().a(paramAttributeSet, 2130903244);
  }
  
  private ByteVector getEmojiTextViewHelper()
  {
    if (lineNumber == null) {
      lineNumber = new ByteVector(this);
    }
    return lineNumber;
  }
  
  public final void drawableStateChanged()
  {
    super.drawableStateChanged();
    Object localObject = mBackgroundTintHelper;
    if (localObject != null) {
      ((AppCompatBackgroundHelper)localObject).applySupportBackgroundTint();
    }
    localObject = mDatePicker;
    if (localObject != null) {
      ((ClassWriter)localObject).a();
    }
  }
  
  public ColorStateList getSupportBackgroundTintList()
  {
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      return localAppCompatBackgroundHelper.getSupportBackgroundTintList();
    }
    return null;
  }
  
  public PorterDuff.Mode getSupportBackgroundTintMode()
  {
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      return localAppCompatBackgroundHelper.getSupportBackgroundTintMode();
    }
    return null;
  }
  
  public ColorStateList getSupportButtonTintList()
  {
    AppCompatCompoundButtonHelper localAppCompatCompoundButtonHelper = mCompoundButtonHelper;
    if (localAppCompatCompoundButtonHelper != null) {
      return mButtonTintList;
    }
    return null;
  }
  
  public PorterDuff.Mode getSupportButtonTintMode()
  {
    AppCompatCompoundButtonHelper localAppCompatCompoundButtonHelper = mCompoundButtonHelper;
    if (localAppCompatCompoundButtonHelper != null) {
      return mButtonTintMode;
    }
    return null;
  }
  
  public ColorStateList getSupportCompoundDrawablesTintList()
  {
    return mDatePicker.getFormattedDate();
  }
  
  public PorterDuff.Mode getSupportCompoundDrawablesTintMode()
  {
    return mDatePicker.getDay();
  }
  
  public void setAllCaps(boolean paramBoolean)
  {
    super.setAllCaps(paramBoolean);
    getEmojiTextViewHelper().e(paramBoolean);
  }
  
  public void setBackgroundDrawable(Drawable paramDrawable)
  {
    super.setBackgroundDrawable(paramDrawable);
    paramDrawable = mBackgroundTintHelper;
    if (paramDrawable != null) {
      paramDrawable.setSupportBackgroundTintList();
    }
  }
  
  public void setBackgroundResource(int paramInt)
  {
    super.setBackgroundResource(paramInt);
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.loadFromAttributes(paramInt);
    }
  }
  
  public void setButtonDrawable(int paramInt)
  {
    setButtonDrawable(drupal.Context.getDrawable(getContext(), paramInt));
  }
  
  public void setButtonDrawable(Drawable paramDrawable)
  {
    super.setButtonDrawable(paramDrawable);
    paramDrawable = mCompoundButtonHelper;
    if (paramDrawable != null)
    {
      if (mSkipNextApply)
      {
        mSkipNextApply = false;
        return;
      }
      mSkipNextApply = true;
      paramDrawable.applyButtonTint();
    }
  }
  
  public final void setCompoundDrawables(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawables(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = mDatePicker;
    if (paramDrawable1 != null) {
      paramDrawable1.a();
    }
  }
  
  public final void setCompoundDrawablesRelative(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = mDatePicker;
    if (paramDrawable1 != null) {
      paramDrawable1.a();
    }
  }
  
  public void setEmojiCompatEnabled(boolean paramBoolean)
  {
    getEmojiTextViewHelper().f(paramBoolean);
  }
  
  public void setFilters(InputFilter[] paramArrayOfInputFilter)
  {
    super.setFilters(((drupal.Context)getEmojiTextViewHelperb.a).a(paramArrayOfInputFilter));
  }
  
  public void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.setSupportBackgroundTintList(paramColorStateList);
    }
  }
  
  public void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.setSupportBackgroundTintMode(paramMode);
    }
  }
  
  public void setSupportButtonTintList(ColorStateList paramColorStateList)
  {
    AppCompatCompoundButtonHelper localAppCompatCompoundButtonHelper = mCompoundButtonHelper;
    if (localAppCompatCompoundButtonHelper != null)
    {
      mButtonTintList = paramColorStateList;
      mHasButtonTint = true;
      localAppCompatCompoundButtonHelper.applyButtonTint();
    }
  }
  
  public void setSupportButtonTintMode(PorterDuff.Mode paramMode)
  {
    AppCompatCompoundButtonHelper localAppCompatCompoundButtonHelper = mCompoundButtonHelper;
    if (localAppCompatCompoundButtonHelper != null)
    {
      mButtonTintMode = paramMode;
      mHasButtonTintMode = true;
      localAppCompatCompoundButtonHelper.applyButtonTint();
    }
  }
  
  public void setSupportCompoundDrawablesTintList(ColorStateList paramColorStateList)
  {
    ClassWriter localClassWriter = mDatePicker;
    localClassWriter.init(paramColorStateList);
    localClassWriter.a();
  }
  
  public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode paramMode)
  {
    ClassWriter localClassWriter = mDatePicker;
    localClassWriter.init(paramMode);
    localClassWriter.a();
  }
}
