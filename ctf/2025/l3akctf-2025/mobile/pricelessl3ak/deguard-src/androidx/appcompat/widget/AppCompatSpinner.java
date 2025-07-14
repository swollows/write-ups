package androidx.appcompat.widget;

import Console.R.styleable;
import a.ClassWriter;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Log;
import android.view.AbsSavedState;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.widget.AbsSpinner;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import view.ContextThemeWrapper;

public final class AppCompatSpinner
  extends Spinner
{
  public static final int[] ATTRS_ANDROID_SPINNERMODE = { 16843505 };
  public final AppCompatBackgroundHelper mBackgroundTintHelper;
  public int mDropDownWidth;
  public final AppCompatSpinner.1 mForwardingListener;
  public final SpinnerCompat.SpinnerPopup mPopup;
  public final android.content.Context mPopupContext;
  public final boolean mPopupSet;
  public SpinnerAdapter mTempAdapter;
  public final Rect mTempRect = new Rect();
  
  public AppCompatSpinner(android.content.Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet, 2130903262);
    ThemeUtils.a(this, getContext());
    int[] arrayOfInt = R.styleable.CollapsingAppBarLayout_LayoutParams;
    ClassWriter localClassWriter = ClassWriter.obtainStyledAttributes(paramContext, paramAttributeSet, arrayOfInt, 2130903262);
    mBackgroundTintHelper = new AppCompatBackgroundHelper(this);
    TypedArray localTypedArray2 = (TypedArray)b;
    int i = localTypedArray2.getResourceId(4, 0);
    if (i != 0) {
      mPopupContext = new ContextThemeWrapper(paramContext, i);
    } else {
      mPopupContext = paramContext;
    }
    int j = -1;
    Object localObject2 = null;
    Object localObject1 = ATTRS_ANDROID_SPINNERMODE;
    try
    {
      TypedArray localTypedArray1 = paramContext.obtainStyledAttributes(paramAttributeSet, (int[])localObject1, 2130903262, 0);
      localObject1 = localTypedArray1;
      localObject2 = localObject1;
      try
      {
        boolean bool = localTypedArray1.hasValue(0);
        i = j;
        localObject2 = localObject1;
        if (bool)
        {
          localObject2 = localObject1;
          i = localTypedArray1.getInt(0, 0);
          localObject2 = localObject1;
        }
      }
      catch (Throwable paramContext)
      {
        break label440;
      }
      catch (Exception localException1)
      {
        break label194;
      }
    }
    catch (Throwable paramContext) {}catch (Exception localException2)
    {
      for (;;)
      {
        localObject1 = null;
        label194:
        localObject2 = localObject1;
        Log.i("AppCompatSpinner", "Could not read android:spinnerMode", localException2);
        i = j;
        if (localObject1 == null) {
          break;
        }
        i = j;
        localObject2 = localObject1;
      }
    }
    ((TypedArray)localObject2).recycle();
    if (i != 0)
    {
      if (i == 1)
      {
        localObject1 = new SpinnerCompat.DropdownPopup(this, mPopupContext, paramAttributeSet);
        localObject2 = ClassWriter.obtainStyledAttributes(mPopupContext, paramAttributeSet, arrayOfInt, 2130903262);
        mDropDownWidth = ((TypedArray)b).getLayoutDimension(3, -2);
        ((ListPopupWindow)localObject1).setBackgroundDrawable(((ClassWriter)localObject2).getDrawable(1));
        mHintText = localTypedArray2.getString(2);
        ((ClassWriter)localObject2).recycle();
        mPopup = ((SpinnerCompat.SpinnerPopup)localObject1);
        mForwardingListener = new AppCompatSpinner.1(this, this, (SpinnerCompat.DropdownPopup)localObject1);
      }
    }
    else
    {
      localObject1 = new SpinnerCompat.DialogPopup(this);
      mPopup = ((SpinnerCompat.SpinnerPopup)localObject1);
      mPrompt = localTypedArray2.getString(2);
    }
    localObject1 = localTypedArray2.getTextArray(0);
    if (localObject1 != null)
    {
      paramContext = new ArrayAdapter(paramContext, 17367048, (Object[])localObject1);
      paramContext.setDropDownViewResource(2131427369);
      setAdapter(paramContext);
    }
    localClassWriter.recycle();
    mPopupSet = true;
    paramContext = mTempAdapter;
    if (paramContext != null)
    {
      setAdapter(paramContext);
      mTempAdapter = null;
    }
    mBackgroundTintHelper.loadFromAttributes(paramAttributeSet, 2130903262);
    return;
    label440:
    if (localObject2 != null) {
      ((TypedArray)localObject2).recycle();
    }
    throw paramContext;
  }
  
  public final int compatMeasureContentWidth(SpinnerAdapter paramSpinnerAdapter, Drawable paramDrawable)
  {
    int k = 0;
    if (paramSpinnerAdapter == null) {
      return 0;
    }
    int i1 = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
    int i2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
    int i = Math.max(0, getSelectedItemPosition());
    int i3 = Math.min(paramSpinnerAdapter.getCount(), i + 15);
    i = Math.max(0, i - (15 - (i3 - i)));
    Object localObject = null;
    int j = 0;
    while (i < i3)
    {
      int n = paramSpinnerAdapter.getItemViewType(i);
      int m = k;
      if (n != k)
      {
        localObject = null;
        m = n;
      }
      View localView = paramSpinnerAdapter.getView(i, (View)localObject, this);
      localObject = localView;
      if (localView.getLayoutParams() == null) {
        localView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
      }
      localView.measure(i1, i2);
      j = Math.max(j, localView.getMeasuredWidth());
      i += 1;
      k = m;
    }
    if (paramDrawable != null)
    {
      paramSpinnerAdapter = mTempRect;
      paramDrawable.getPadding(paramSpinnerAdapter);
      return j + (left + right);
    }
    return j;
  }
  
  public final void drawableStateChanged()
  {
    super.drawableStateChanged();
    AppCompatBackgroundHelper localAppCompatBackgroundHelper = mBackgroundTintHelper;
    if (localAppCompatBackgroundHelper != null) {
      localAppCompatBackgroundHelper.applySupportBackgroundTint();
    }
  }
  
  public int getDropDownHorizontalOffset()
  {
    SpinnerCompat.SpinnerPopup localSpinnerPopup = mPopup;
    if (localSpinnerPopup != null) {
      return localSpinnerPopup.getHorizontalOffset();
    }
    return super.getDropDownHorizontalOffset();
  }
  
  public int getDropDownVerticalOffset()
  {
    SpinnerCompat.SpinnerPopup localSpinnerPopup = mPopup;
    if (localSpinnerPopup != null) {
      return localSpinnerPopup.getVerticalOffset();
    }
    return super.getDropDownVerticalOffset();
  }
  
  public int getDropDownWidth()
  {
    if (mPopup != null) {
      return mDropDownWidth;
    }
    return super.getDropDownWidth();
  }
  
  public final SpinnerCompat.SpinnerPopup getInternalPopup()
  {
    return mPopup;
  }
  
  public Drawable getPopupBackground()
  {
    SpinnerCompat.SpinnerPopup localSpinnerPopup = mPopup;
    if (localSpinnerPopup != null) {
      return localSpinnerPopup.getBackground();
    }
    return super.getPopupBackground();
  }
  
  public android.content.Context getPopupContext()
  {
    return mPopupContext;
  }
  
  public CharSequence getPrompt()
  {
    SpinnerCompat.SpinnerPopup localSpinnerPopup = mPopup;
    if (localSpinnerPopup != null) {
      return localSpinnerPopup.getHintText();
    }
    return super.getPrompt();
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
  
  public final void onDetachedFromWindow()
  {
    super.onDetachedFromWindow();
    SpinnerCompat.SpinnerPopup localSpinnerPopup = mPopup;
    if ((localSpinnerPopup != null) && (localSpinnerPopup.isShowing())) {
      localSpinnerPopup.dismiss();
    }
  }
  
  public final void onMeasure(int paramInt1, int paramInt2)
  {
    super.onMeasure(paramInt1, paramInt2);
    if ((mPopup != null) && (View.MeasureSpec.getMode(paramInt1) == Integer.MIN_VALUE)) {
      setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), compatMeasureContentWidth(getAdapter(), getBackground())), View.MeasureSpec.getSize(paramInt1)), getMeasuredHeight());
    }
  }
  
  public final void onRestoreInstanceState(Parcelable paramParcelable)
  {
    paramParcelable = (AppCompatSpinner.SavedState)paramParcelable;
    super.onRestoreInstanceState(paramParcelable.getSuperState());
    if (showDropdown)
    {
      paramParcelable = getViewTreeObserver();
      if (paramParcelable != null) {
        paramParcelable.addOnGlobalLayoutListener(new MenuPopupHelper(0, this));
      }
    }
  }
  
  public final Parcelable onSaveInstanceState()
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final boolean onTouchEvent(MotionEvent paramMotionEvent)
  {
    AppCompatSpinner.1 local1 = mForwardingListener;
    if ((local1 != null) && (local1.onTouch(this, paramMotionEvent))) {
      return true;
    }
    return super.onTouchEvent(paramMotionEvent);
  }
  
  public final boolean performClick()
  {
    SpinnerCompat.SpinnerPopup localSpinnerPopup = mPopup;
    if (localSpinnerPopup != null)
    {
      if (!localSpinnerPopup.isShowing())
      {
        int i = getTextDirection();
        int j = getTextAlignment();
        mPopup.show(i, j);
      }
      return true;
    }
    return super.performClick();
  }
  
  public void setAdapter(SpinnerAdapter paramSpinnerAdapter)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
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
  
  public void setDropDownHorizontalOffset(int paramInt)
  {
    SpinnerCompat.SpinnerPopup localSpinnerPopup = mPopup;
    if (localSpinnerPopup != null)
    {
      localSpinnerPopup.show(paramInt);
      localSpinnerPopup.setHorizontalOffset(paramInt);
      return;
    }
    super.setDropDownHorizontalOffset(paramInt);
  }
  
  public void setDropDownVerticalOffset(int paramInt)
  {
    SpinnerCompat.SpinnerPopup localSpinnerPopup = mPopup;
    if (localSpinnerPopup != null)
    {
      localSpinnerPopup.setVerticalOffset(paramInt);
      return;
    }
    super.setDropDownVerticalOffset(paramInt);
  }
  
  public void setDropDownWidth(int paramInt)
  {
    if (mPopup != null)
    {
      mDropDownWidth = paramInt;
      return;
    }
    super.setDropDownWidth(paramInt);
  }
  
  public void setPopupBackgroundDrawable(Drawable paramDrawable)
  {
    SpinnerCompat.SpinnerPopup localSpinnerPopup = mPopup;
    if (localSpinnerPopup != null)
    {
      localSpinnerPopup.setBackgroundDrawable(paramDrawable);
      return;
    }
    super.setPopupBackgroundDrawable(paramDrawable);
  }
  
  public void setPopupBackgroundResource(int paramInt)
  {
    setPopupBackgroundDrawable(drupal.Context.getDrawable(getPopupContext(), paramInt));
  }
  
  public void setPrompt(CharSequence paramCharSequence)
  {
    SpinnerCompat.SpinnerPopup localSpinnerPopup = mPopup;
    if (localSpinnerPopup != null)
    {
      localSpinnerPopup.setPromptText(paramCharSequence);
      return;
    }
    super.setPrompt(paramCharSequence);
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
}
