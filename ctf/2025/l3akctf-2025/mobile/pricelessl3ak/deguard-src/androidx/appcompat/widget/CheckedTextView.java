package androidx.appcompat.widget;

import Console.R.styleable;
import android.content.res.ColorStateList;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import app.ViewCompat;

public final class CheckedTextView
  extends android.widget.CheckedTextView
{
  public ByteVector lineNumber;
  public final AppCompatBackgroundHelper mBackgroundTintHelper;
  public final ClassWriter mDatePicker;
  public final AppCompatCompoundButtonHelper mTextHelper;
  
  public CheckedTextView(android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 2130903115);
    ThemeUtils.a(this, getContext());
    paramContext = new ClassWriter(this);
    mDatePicker = paramContext;
    paramContext.init(paramAttributeSet, 2130903115);
    paramContext.a();
    paramContext = new AppCompatBackgroundHelper(this);
    mBackgroundTintHelper = paramContext;
    paramContext.loadFromAttributes(paramAttributeSet, 2130903115);
    mTextHelper = new AppCompatCompoundButtonHelper(this);
    paramContext = getContext();
    int[] arrayOfInt = R.styleable.ButtonBarLayout;
    paramContext = a.ClassWriter.obtainStyledAttributes(paramContext, paramAttributeSet, arrayOfInt, 2130903115);
    TypedArray localTypedArray = (TypedArray)b;
    ViewCompat.init(this, getContext(), arrayOfInt, paramAttributeSet, (TypedArray)b, 2130903115);
    try
    {
      bool = localTypedArray.hasValue(1);
      if (bool)
      {
        i = localTypedArray.getResourceId(1, 0);
        if (i == 0) {}
      }
      bool = localTypedArray.hasValue(0);
    }
    catch (Throwable paramAttributeSet)
    {
      try
      {
        setCheckMarkDrawable(drupal.Context.getDrawable(getContext(), i));
      }
      catch (Resources.NotFoundException localNotFoundException)
      {
        boolean bool;
        int i;
        for (;;) {}
      }
      paramAttributeSet = paramAttributeSet;
    }
    if (bool)
    {
      i = localTypedArray.getResourceId(0, 0);
      if (i != 0) {
        setCheckMarkDrawable(drupal.Context.getDrawable(getContext(), i));
      }
    }
    bool = localTypedArray.hasValue(2);
    if (bool) {
      setCheckMarkTintList(paramContext.init(2));
    }
    bool = localTypedArray.hasValue(3);
    if (bool) {
      setCheckMarkTintMode(Context.parseTintMode(localTypedArray.getInt(3, -1), null));
    }
    paramContext.recycle();
    getEmojiTextViewHelper().a(paramAttributeSet, 2130903115);
    return;
    paramContext.recycle();
    throw paramAttributeSet;
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
    Object localObject = mDatePicker;
    if (localObject != null) {
      ((ClassWriter)localObject).a();
    }
    localObject = mBackgroundTintHelper;
    if (localObject != null) {
      ((AppCompatBackgroundHelper)localObject).applySupportBackgroundTint();
    }
    localObject = mTextHelper;
    if (localObject != null) {
      ((AppCompatCompoundButtonHelper)localObject).onBindViewHolder();
    }
  }
  
  public ActionMode.Callback getCustomSelectionActionModeCallback()
  {
    return drupal.Context.onAnimationEnd(super.getCustomSelectionActionModeCallback());
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
  
  public ColorStateList getSupportCheckMarkTintList()
  {
    AppCompatCompoundButtonHelper localAppCompatCompoundButtonHelper = mTextHelper;
    if (localAppCompatCompoundButtonHelper != null) {
      return mButtonTintList;
    }
    return null;
  }
  
  public PorterDuff.Mode getSupportCheckMarkTintMode()
  {
    AppCompatCompoundButtonHelper localAppCompatCompoundButtonHelper = mTextHelper;
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
  
  public final InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    InputConnection localInputConnection = super.onCreateInputConnection(paramEditorInfo);
    drupal.Context.matchesSafely(paramEditorInfo, localInputConnection, this);
    return localInputConnection;
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
  
  public void setCheckMarkDrawable(int paramInt)
  {
    setCheckMarkDrawable(drupal.Context.getDrawable(getContext(), paramInt));
  }
  
  public void setCheckMarkDrawable(Drawable paramDrawable)
  {
    super.setCheckMarkDrawable(paramDrawable);
    paramDrawable = mTextHelper;
    if (paramDrawable != null)
    {
      if (mSkipNextApply)
      {
        mSkipNextApply = false;
        return;
      }
      mSkipNextApply = true;
      paramDrawable.onBindViewHolder();
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
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback)
  {
    super.setCustomSelectionActionModeCallback(drupal.Context.a(paramCallback, this));
  }
  
  public void setEmojiCompatEnabled(boolean paramBoolean)
  {
    getEmojiTextViewHelper().f(paramBoolean);
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
  
  public void setSupportCheckMarkTintList(ColorStateList paramColorStateList)
  {
    AppCompatCompoundButtonHelper localAppCompatCompoundButtonHelper = mTextHelper;
    if (localAppCompatCompoundButtonHelper != null)
    {
      mButtonTintList = paramColorStateList;
      mHasButtonTint = true;
      localAppCompatCompoundButtonHelper.onBindViewHolder();
    }
  }
  
  public void setSupportCheckMarkTintMode(PorterDuff.Mode paramMode)
  {
    AppCompatCompoundButtonHelper localAppCompatCompoundButtonHelper = mTextHelper;
    if (localAppCompatCompoundButtonHelper != null)
    {
      mButtonTintMode = paramMode;
      mHasButtonTintMode = true;
      localAppCompatCompoundButtonHelper.onBindViewHolder();
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
  
  public final void setTextAppearance(android.content.Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    ClassWriter localClassWriter = mDatePicker;
    if (localClassWriter != null) {
      localClassWriter.init(paramContext, paramInt);
    }
  }
}
