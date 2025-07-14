package androidx.appcompat.widget;

import Client.Jid;
import Client.Tuple3;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.PorterDuff.Mode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.text.InputFilter;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ActionMode.Callback;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
import app.Vector;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import util.Type;

public class BubbleTextView
  extends TextView
{
  public final ClassWriter a;
  public app.f c = null;
  public boolean e = false;
  public final Label k;
  public ByteVector lineNumber;
  public final AppCompatBackgroundHelper mBackgroundTintHelper;
  public Future mDelegate;
  
  public BubbleTextView(android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 16842884);
  }
  
  public BubbleTextView(android.content.Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    ThemeUtils.a(this, getContext());
    paramContext = new AppCompatBackgroundHelper(this);
    mBackgroundTintHelper = paramContext;
    paramContext.loadFromAttributes(paramAttributeSet, paramInt);
    paramContext = new ClassWriter(this);
    a = paramContext;
    paramContext.init(paramAttributeSet, paramInt);
    paramContext.a();
    paramContext = new Label();
    i = this;
    k = paramContext;
    getEmojiTextViewHelper().a(paramAttributeSet, paramInt);
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
    localObject = a;
    if (localObject != null) {
      ((ClassWriter)localObject).a();
    }
  }
  
  public int getAutoSizeMaxTextSize()
  {
    if (R.id.i) {
      return ((BubbleTextView)getSuperCallera).getAutoSizeMaxTextSize();
    }
    ClassWriter localClassWriter = a;
    if (localClassWriter != null) {
      return Math.round(d.x);
    }
    return -1;
  }
  
  public int getAutoSizeMinTextSize()
  {
    if (R.id.i) {
      return ((BubbleTextView)getSuperCallera).getAutoSizeMinTextSize();
    }
    ClassWriter localClassWriter = a;
    if (localClassWriter != null) {
      return Math.round(d.n);
    }
    return -1;
  }
  
  public int getAutoSizeStepGranularity()
  {
    if (R.id.i) {
      return ((BubbleTextView)getSuperCallera).getAutoSizeStepGranularity();
    }
    ClassWriter localClassWriter = a;
    if (localClassWriter != null) {
      return Math.round(d.y);
    }
    return -1;
  }
  
  public int[] getAutoSizeTextAvailableSizes()
  {
    if (R.id.i) {
      return ((BubbleTextView)getSuperCallera).getAutoSizeTextAvailableSizes();
    }
    ClassWriter localClassWriter = a;
    if (localClassWriter != null) {
      return d.e;
    }
    return new int[0];
  }
  
  public int getAutoSizeTextType()
  {
    if (R.id.i)
    {
      if (((BubbleTextView)getSuperCallera).getAutoSizeTextType() == 1) {
        return 1;
      }
    }
    else
    {
      ClassWriter localClassWriter = a;
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
  
  public int getFirstBaselineToTopHeight()
  {
    return getPaddingTop() - getPaintgetFontMetricsInttop;
  }
  
  public int getLastBaselineToBottomHeight()
  {
    return getPaddingBottom() + getPaintgetFontMetricsIntbottom;
  }
  
  public Product getSuperCaller()
  {
    if (c == null)
    {
      int i = Build.VERSION.SDK_INT;
      if (i >= 34) {
        c = new Theories.TheoryAnchor.2(this);
      } else if (i >= 28) {
        c = new Variance(this);
      } else if (i >= 26) {
        c = new app.f(13, this);
      }
    }
    return c;
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
    return a.getFormattedDate();
  }
  
  public PorterDuff.Mode getSupportCompoundDrawablesTintMode()
  {
    return a.getDay();
  }
  
  public CharSequence getText()
  {
    init();
    return super.getText();
  }
  
  public TextClassifier getTextClassifier()
  {
    if (Build.VERSION.SDK_INT < 28)
    {
      Label localLabel = k;
      if (localLabel != null)
      {
        TextClassifier localTextClassifier2 = (TextClassifier)k;
        localTextClassifier1 = localTextClassifier2;
        if (localTextClassifier2 != null) {
          return localTextClassifier1;
        }
        return ImageHelper.showError((TextView)i);
      }
    }
    TextClassifier localTextClassifier1 = ((BubbleTextView)getSuperCallera).getTextClassifier();
    return localTextClassifier1;
  }
  
  public Tuple3 getTextMetricsParamsCompat()
  {
    return drupal.Context.init(this);
  }
  
  public final void init()
  {
    Object localObject = mDelegate;
    if (localObject == null) {
      return;
    }
    mDelegate = null;
    try
    {
      localObject = ((Future)localObject).get();
      if (localObject == null)
      {
        if (Build.VERSION.SDK_INT >= 29)
        {
          localObject = new NullPointerException("Null throw statement replaced by Soot");
          throw ((Throwable)localObject);
        }
        drupal.Context.init(this);
        localObject = new NullPointerException("Null throw statement replaced by Soot");
        throw ((Throwable)localObject);
      }
      localObject = new ClassCastException();
      throw ((Throwable)localObject);
    }
    catch (InterruptedException localInterruptedException) {}catch (ExecutionException localExecutionException) {}
  }
  
  public final InputConnection onCreateInputConnection(EditorInfo paramEditorInfo)
  {
    InputConnection localInputConnection = super.onCreateInputConnection(paramEditorInfo);
    a.getClass();
    ClassWriter.parse(paramEditorInfo, localInputConnection, this);
    drupal.Context.matchesSafely(paramEditorInfo, localInputConnection, this);
    return localInputConnection;
  }
  
  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    int i = Build.VERSION.SDK_INT;
    if ((i >= 30) && (i < 33) && (onCheckIsTextEditor())) {
      ((InputMethodManager)getContext().getSystemService("input_method")).isActive(this);
    }
  }
  
  public final void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    ClassWriter localClassWriter = a;
    if ((localClassWriter != null) && (!R.id.i)) {
      d.draw();
    }
  }
  
  public void onMeasure(int paramInt1, int paramInt2)
  {
    init();
    super.onMeasure(paramInt1, paramInt2);
  }
  
  public final void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    super.onTextChanged(paramCharSequence, paramInt1, paramInt2, paramInt3);
    paramCharSequence = a;
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
      ((BubbleTextView)getSuperCallera).setAutoSizeTextTypeUniformWithConfiguration(paramInt1, paramInt2, paramInt3, paramInt4);
      return;
    }
    ClassWriter localClassWriter = a;
    if (localClassWriter != null) {
      localClassWriter.a(paramInt1, paramInt2, paramInt3, paramInt4);
    }
  }
  
  public final void setAutoSizeTextTypeUniformWithPresetSizes(int[] paramArrayOfInt, int paramInt)
  {
    if (R.id.i)
    {
      ((BubbleTextView)getSuperCallera).setAutoSizeTextTypeUniformWithPresetSizes(paramArrayOfInt, paramInt);
      return;
    }
    ClassWriter localClassWriter = a;
    if (localClassWriter != null) {
      localClassWriter.a(paramArrayOfInt, paramInt);
    }
  }
  
  public void setAutoSizeTextTypeWithDefaults(int paramInt)
  {
    if (R.id.i)
    {
      ((BubbleTextView)getSuperCallera).setAutoSizeTextTypeWithDefaults(paramInt);
      return;
    }
    ClassWriter localClassWriter = a;
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
  
  public final void setCompoundDrawables(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawables(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = a;
    if (paramDrawable1 != null) {
      paramDrawable1.a();
    }
  }
  
  public final void setCompoundDrawablesRelative(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawablesRelative(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = a;
    if (paramDrawable1 != null) {
      paramDrawable1.a();
    }
  }
  
  public final void setCompoundDrawablesRelativeWithIntrinsicBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    android.content.Context localContext = getContext();
    Drawable localDrawable3 = null;
    if (paramInt1 != 0) {
      localObject = drupal.Context.getDrawable(localContext, paramInt1);
    } else {
      localObject = null;
    }
    Drawable localDrawable1;
    if (paramInt2 != 0) {
      localDrawable1 = drupal.Context.getDrawable(localContext, paramInt2);
    } else {
      localDrawable1 = null;
    }
    Drawable localDrawable2;
    if (paramInt3 != 0) {
      localDrawable2 = drupal.Context.getDrawable(localContext, paramInt3);
    } else {
      localDrawable2 = null;
    }
    if (paramInt4 != 0) {
      localDrawable3 = drupal.Context.getDrawable(localContext, paramInt4);
    }
    setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable)localObject, localDrawable1, localDrawable2, localDrawable3);
    Object localObject = a;
    if (localObject != null) {
      ((ClassWriter)localObject).a();
    }
  }
  
  public final void setCompoundDrawablesRelativeWithIntrinsicBounds(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawablesRelativeWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = a;
    if (paramDrawable1 != null) {
      paramDrawable1.a();
    }
  }
  
  public final void setCompoundDrawablesWithIntrinsicBounds(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    android.content.Context localContext = getContext();
    Drawable localDrawable3 = null;
    if (paramInt1 != 0) {
      localObject = drupal.Context.getDrawable(localContext, paramInt1);
    } else {
      localObject = null;
    }
    Drawable localDrawable1;
    if (paramInt2 != 0) {
      localDrawable1 = drupal.Context.getDrawable(localContext, paramInt2);
    } else {
      localDrawable1 = null;
    }
    Drawable localDrawable2;
    if (paramInt3 != 0) {
      localDrawable2 = drupal.Context.getDrawable(localContext, paramInt3);
    } else {
      localDrawable2 = null;
    }
    if (paramInt4 != 0) {
      localDrawable3 = drupal.Context.getDrawable(localContext, paramInt4);
    }
    setCompoundDrawablesWithIntrinsicBounds((Drawable)localObject, localDrawable1, localDrawable2, localDrawable3);
    Object localObject = a;
    if (localObject != null) {
      ((ClassWriter)localObject).a();
    }
  }
  
  public final void setCompoundDrawablesWithIntrinsicBounds(Drawable paramDrawable1, Drawable paramDrawable2, Drawable paramDrawable3, Drawable paramDrawable4)
  {
    super.setCompoundDrawablesWithIntrinsicBounds(paramDrawable1, paramDrawable2, paramDrawable3, paramDrawable4);
    paramDrawable1 = a;
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
  
  public void setFilters(InputFilter[] paramArrayOfInputFilter)
  {
    super.setFilters(((drupal.Context)getEmojiTextViewHelperb.a).a(paramArrayOfInputFilter));
  }
  
  public void setFirstBaselineToTopHeight(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 28)
    {
      getSuperCaller().evaluate(paramInt);
      return;
    }
    drupal.Context.setText(this, paramInt);
  }
  
  public void setLastBaselineToBottomHeight(int paramInt)
  {
    if (Build.VERSION.SDK_INT >= 28)
    {
      getSuperCaller().clear(paramInt);
      return;
    }
    drupal.Context.initialize(this, paramInt);
  }
  
  public void setLineHeight(int paramInt)
  {
    drupal.Context.init(this, paramInt);
  }
  
  public final void setLineHeight(int paramInt, float paramFloat)
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 34)
    {
      getSuperCaller().evaluate(paramInt, paramFloat);
      return;
    }
    if (i >= 34)
    {
      Vector.set(this, paramInt, paramFloat);
      return;
    }
    drupal.Context.init(this, Math.round(TypedValue.applyDimension(paramInt, paramFloat, getResources().getDisplayMetrics())));
  }
  
  public void setPrecomputedText(Jid paramJid)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      throw new NullPointerException("Null throw statement replaced by Soot");
    }
    drupal.Context.init(this);
    throw new NullPointerException("Null throw statement replaced by Soot");
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
    ClassWriter localClassWriter = a;
    localClassWriter.init(paramColorStateList);
    localClassWriter.a();
  }
  
  public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode paramMode)
  {
    ClassWriter localClassWriter = a;
    localClassWriter.init(paramMode);
    localClassWriter.a();
  }
  
  public final void setTextAppearance(android.content.Context paramContext, int paramInt)
  {
    super.setTextAppearance(paramContext, paramInt);
    ClassWriter localClassWriter = a;
    if (localClassWriter != null) {
      localClassWriter.init(paramContext, paramInt);
    }
  }
  
  public void setTextClassifier(TextClassifier paramTextClassifier)
  {
    if (Build.VERSION.SDK_INT < 28)
    {
      Label localLabel = k;
      if (localLabel != null)
      {
        k = paramTextClassifier;
        return;
      }
    }
    ((BubbleTextView)getSuperCallera).setTextClassifier(paramTextClassifier);
  }
  
  public void setTextFuture(Future paramFuture)
  {
    mDelegate = paramFuture;
    if (paramFuture != null) {
      requestLayout();
    }
  }
  
  public void setTextMetricsParamsCompat(Tuple3 paramTuple3)
  {
    TextDirectionHeuristic localTextDirectionHeuristic1 = b;
    TextDirectionHeuristic localTextDirectionHeuristic2 = TextDirectionHeuristics.FIRSTSTRONG_RTL;
    int i = 1;
    if (localTextDirectionHeuristic1 != localTextDirectionHeuristic2)
    {
      TextDirectionHeuristic localTextDirectionHeuristic3 = TextDirectionHeuristics.FIRSTSTRONG_LTR;
      if (localTextDirectionHeuristic1 != localTextDirectionHeuristic3) {
        if (localTextDirectionHeuristic1 == TextDirectionHeuristics.ANYRTL_LTR) {
          i = 2;
        } else if (localTextDirectionHeuristic1 == TextDirectionHeuristics.LTR) {
          i = 3;
        } else if (localTextDirectionHeuristic1 == TextDirectionHeuristics.RTL) {
          i = 4;
        } else if (localTextDirectionHeuristic1 == TextDirectionHeuristics.LOCALE) {
          i = 5;
        } else if (localTextDirectionHeuristic1 == localTextDirectionHeuristic3) {
          i = 6;
        } else if (localTextDirectionHeuristic1 == localTextDirectionHeuristic2) {
          i = 7;
        }
      }
    }
    setTextDirection(i);
    getPaint().set(a);
    setBreakStrategy(c);
    setHyphenationFrequency(r);
  }
  
  public final void setTextSize(int paramInt, float paramFloat)
  {
    boolean bool = R.id.i;
    if (bool)
    {
      super.setTextSize(paramInt, paramFloat);
      return;
    }
    Object localObject = a;
    if ((localObject != null) && (!bool))
    {
      localObject = d;
      if (!((f)localObject).add()) {
        ((f)localObject).b(paramInt, paramFloat);
      }
    }
  }
  
  public final void setTypeface(Typeface paramTypeface, int paramInt)
  {
    if (e) {
      return;
    }
    Object localObject;
    if ((paramTypeface != null) && (paramInt > 0))
    {
      localObject = getContext();
      internal.Label localLabel = Type.a;
      if (localObject != null) {
        localObject = Typeface.create(paramTypeface, paramInt);
      } else {
        throw new IllegalArgumentException("Context cannot be null");
      }
    }
    else
    {
      localObject = null;
    }
    e = true;
    if (localObject != null) {
      paramTypeface = (Typeface)localObject;
    }
    try
    {
      super.setTypeface(paramTypeface, paramInt);
      e = false;
      return;
    }
    catch (Throwable paramTypeface)
    {
      e = false;
      throw paramTypeface;
    }
  }
}
