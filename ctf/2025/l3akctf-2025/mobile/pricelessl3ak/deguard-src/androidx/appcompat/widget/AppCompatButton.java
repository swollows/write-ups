package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.text.InputFilter;
import android.util.AttributeSet;
import android.view.ActionMode.Callback;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityRecord;
import android.widget.Button;
import android.widget.TextView;

public final class AppCompatButton
  extends Button
{
  public ByteVector lineNumber;
  public final AppCompatBackgroundHelper mBackgroundTintHelper;
  public final ClassWriter v;
  
  public AppCompatButton(android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 2130903107);
    ThemeUtils.a(this, getContext());
    paramContext = new AppCompatBackgroundHelper(this);
    mBackgroundTintHelper = paramContext;
    paramContext.loadFromAttributes(paramAttributeSet, 2130903107);
    paramContext = new ClassWriter(this);
    v = paramContext;
    paramContext.init(paramAttributeSet, 2130903107);
    paramContext.a();
    getEmojiTextViewHelper().a(paramAttributeSet, 2130903107);
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
    localObject = v;
    if (localObject != null) {
      ((ClassWriter)localObject).a();
    }
  }
  
  public int getAutoSizeMaxTextSize()
  {
    if (R.id.i) {
      return super.getAutoSizeMaxTextSize();
    }
    ClassWriter localClassWriter = v;
    if (localClassWriter != null) {
      return Math.round(d.x);
    }
    return -1;
  }
  
  public int getAutoSizeMinTextSize()
  {
    if (R.id.i) {
      return super.getAutoSizeMinTextSize();
    }
    ClassWriter localClassWriter = v;
    if (localClassWriter != null) {
      return Math.round(d.n);
    }
    return -1;
  }
  
  public int getAutoSizeStepGranularity()
  {
    if (R.id.i) {
      return super.getAutoSizeStepGranularity();
    }
    ClassWriter localClassWriter = v;
    if (localClassWriter != null) {
      return Math.round(d.y);
    }
    return -1;
  }
  
  public int[] getAutoSizeTextAvailableSizes()
  {
    if (R.id.i) {
      return super.getAutoSizeTextAvailableSizes();
    }
    ClassWriter localClassWriter = v;
    if (localClassWriter != null) {
      return d.e;
    }
    return new int[0];
  }
  
  public int getAutoSizeTextType()
  {
    if (R.id.i)
    {
      if (super.getAutoSizeTextType() == 1) {
        return 1;
      }
    }
    else
    {
      ClassWriter localClassWriter = v;
      if (localClassWriter != null) {
        return d.b;
      }
    }
    return 0;
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
    return v.getFormattedDate();
  }
  
  public PorterDuff.Mode getSupportCompoundDrawablesTintMode()
  {
    return v.getDay();
  }
  
  public final void onInitializeAccessibilityEvent(AccessibilityEvent paramAccessibilityEvent)
  {
    super.onInitializeAccessibilityEvent(paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(Button.class.getName());
  }
  
  public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo paramAccessibilityNodeInfo)
  {
    super.onInitializeAccessibilityNodeInfo(paramAccessibilityNodeInfo);
    paramAccessibilityNodeInfo.setClassName(Button.class.getName());
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    ClassWriter localClassWriter = v;
    if ((localClassWriter != null) && (!R.id.i)) {
      d.draw();
    }
  }
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    paramCharSequence = v;
    if ((paramCharSequence != null) && (!R.id.i))
    {
      paramCharSequence = d;
      if (paramCharSequence.add()) {
        paramCharSequence.draw();
      }
    }
  }
  
  public void setAllCaps(boolean paramBoolean)
  {
    super.setAllCaps(paramBoolean);
    getEmojiTextViewHelper().e(paramBoolean);
  }
  
  public final void setAutoSizeTextTypeUniformWithConfiguration(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (R.id.i)
    {
      super.setAutoSizeTextTypeUniformWithConfiguration(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    ClassWriter localClassWriter = v;
    if (localClassWriter != null) {
      localClassWriter.a(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] paramArrayOfInt, int paramInt)
  {
    if (R.id.i)
    {
      super.setAutoSizeTextTypeUniformWithPresetSizes(paramArrayOfInt, paramInt);
      return;
    }
    ClassWriter localClassWriter = v;
    if (localClassWriter != null) {
      localClassWriter.a(paramArrayOfInt, paramInt);
    }
  }
  
  public void setAutoSizeTextTypeWithDefaults(int paramInt)
  {
    if (R.id.i)
    {
      super.setAutoSizeTextTypeWithDefaults(paramInt);
      return;
    }
    ClassWriter localClassWriter = v;
    if (localClassWriter != null) {
      localClassWriter.a(paramInt);
    }
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
  
  public void setCustomSelectionActionModeCallback(ActionMode.Callback paramCallback)
  {
    super.setCustomSelectionActionModeCallback(drupal.Context.a(paramCallback, this));
  }
  
  public void setEmojiCompatEnabled(boolean paramBoolean)
  {
    getEmojiTextViewHelper().f(paramBoolean);
  }
  
  public void setFilters(InputFilter[] paramArrayOfInputFilter)
  {
    super.setFilters(((drupal.Context)getEmojiTextViewHelperb.a).a(paramArrayOfInputFilter));
  }
  
  public void setSupportAllCaps(boolean paramBoolean)
  {
    ClassWriter localClassWriter = v;
    if (localClassWriter != null) {
      a.setAllCaps(paramBoolean);
    }
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
    ClassWriter localClassWriter = v;
    localClassWriter.init(paramColorStateList);
    localClassWriter.a();
  }
  
  public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode paramMode)
  {
    ClassWriter localClassWriter = v;
    localClassWriter.init(paramMode);
    localClassWriter.a();
  }
  
  public final void setTextAppearance(android.content.Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    ClassWriter localClassWriter = v;
    if (localClassWriter != null) {
      localClassWriter.init(paramContext, paramInt);
    }
  }
  
  public final void setTextSize(int paramInt, float paramFloat)
  {
    boolean bool = R.id.i;
    if (bool)
    {
      super.setTextSize(paramInt, paramFloat);
      return;
    }
    Object localObject = v;
    if ((localObject != null) && (!bool))
    {
      localObject = d;
      if (!((f)localObject).add()) {
        ((f)localObject).b(paramInt, paramFloat);
      }
    }
  }
}
