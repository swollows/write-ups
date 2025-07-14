package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.AutoCompleteTextView;
import android.widget.TextView;

public class AppCompatAutoCompleteTextView
  extends AutoCompleteTextView
{
  public static final int[] TINT_ATTRS = { 16843126 };
  public final Label O;
  public final AppCompatBackgroundHelper mBackgroundTintHelper;
  public final ClassWriter mDatePicker;
  
  public AppCompatAutoCompleteTextView(android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 2130903085);
    ThemeUtils.a(this, getContext());
    paramContext = a.ClassWriter.obtainStyledAttributes(getContext(), paramAttributeSet, TINT_ATTRS, 2130903085);
    if (((TypedArray)b).hasValue(0)) {
      setDropDownBackgroundDrawable(paramContext.getDrawable(0));
    }
    paramContext.recycle();
    paramContext = new AppCompatBackgroundHelper(this);
    mBackgroundTintHelper = paramContext;
    paramContext.loadFromAttributes(paramAttributeSet, 2130903085);
    paramContext = new ClassWriter(this);
    mDatePicker = paramContext;
    paramContext.init(paramAttributeSet, 2130903085);
    paramContext.a();
    paramContext = new Label(this);
    O = paramContext;
    paramContext.loadFromAttributes(paramAttributeSet, 2130903085);
    paramAttributeSet = getKeyListener();
    if (!(paramAttributeSet instanceof NumberKeyListener))
    {
      boolean bool1 = super.isFocusable();
      boolean bool2 = super.isClickable();
      boolean bool3 = super.isLongClickable();
      int i = super.getInputType();
      paramContext = paramContext.a(paramAttributeSet);
      if (paramContext == paramAttributeSet) {
        return;
      }
      super.setKeyListener(paramContext);
      super.setRawInputType(i);
      super.setFocusable(bool1);
      super.setClickable(bool2);
      super.setLongClickable(bool3);
    }
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
  
  public ColorStateList getSupportCompoundDrawablesTintList()
  {
    return mDatePicker.getFormattedDate();
  }
  
  public PorterDuff.Mode getSupportCompoundDrawablesTintMode()
  {
    return mDatePicker.getDay();
  }
  
  public InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    InputConnection localInputConnection = super.onCreateInputConnection(paramEditorInfo);
    drupal.Context.matchesSafely(paramEditorInfo, localInputConnection, this);
    return O.a(localInputConnection, paramEditorInfo);
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
  
  public void setDropDownBackgroundResource(int paramInt)
  {
    setDropDownBackgroundDrawable(drupal.Context.getDrawable(getContext(), paramInt));
  }
  
  public void setEmojiCompatEnabled(boolean paramBoolean)
  {
    O.a(paramBoolean);
  }
  
  public void setKeyListener(KeyListener paramKeyListener)
  {
    super.setKeyListener(O.a(paramKeyListener));
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
