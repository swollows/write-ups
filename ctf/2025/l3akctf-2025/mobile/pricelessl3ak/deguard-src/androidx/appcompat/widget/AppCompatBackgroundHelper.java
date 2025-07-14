package androidx.appcompat.widget;

import Console.R.styleable;
import a.ClassWriter;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff.Mode;
import android.util.AttributeSet;
import android.view.View;
import app.ViewCompat;
import app.ViewCompatLollipop;

public final class AppCompatBackgroundHelper
{
  public int id = -1;
  public TintInfo mBackgroundTint;
  public final AppCompatDrawableManager mDrawableManager;
  public TintInfo mInternalBackgroundTint;
  public TintInfo mTmpInfo;
  public final View mView;
  
  public AppCompatBackgroundHelper(View paramView)
  {
    mView = paramView;
    mDrawableManager = AppCompatDrawableManager.get();
  }
  
  public final void applySupportBackgroundTint()
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final ColorStateList getSupportBackgroundTintList()
  {
    TintInfo localTintInfo = mBackgroundTint;
    if (localTintInfo != null) {
      return mTintList;
    }
    return null;
  }
  
  public final PorterDuff.Mode getSupportBackgroundTintMode()
  {
    TintInfo localTintInfo = mBackgroundTint;
    if (localTintInfo != null) {
      return mTintMode;
    }
    return null;
  }
  
  public final void loadFromAttributes(int paramInt)
  {
    id = paramInt;
    AppCompatDrawableManager localAppCompatDrawableManager = mDrawableManager;
    ColorStateList localColorStateList;
    if (localAppCompatDrawableManager != null)
    {
      Object localObject = mView.getContext();
      try
      {
        localObject = this$0.get((android.content.Context)localObject, paramInt);
      }
      catch (Throwable localThrowable)
      {
        throw localThrowable;
      }
    }
    else
    {
      localColorStateList = null;
    }
    setInternalBackgroundTint(localColorStateList);
    applySupportBackgroundTint();
  }
  
  public final void loadFromAttributes(AttributeSet paramAttributeSet, int paramInt)
  {
    View localView1 = mView;
    Object localObject1 = localView1.getContext();
    Object localObject2 = R.styleable.TextAppearance;
    localObject1 = ClassWriter.obtainStyledAttributes((android.content.Context)localObject1, paramAttributeSet, (int[])localObject2, paramInt);
    TypedArray localTypedArray = (TypedArray)b;
    View localView2 = mView;
    ViewCompat.init(localView2, localView2.getContext(), (int[])localObject2, paramAttributeSet, (TypedArray)b, paramInt);
    try
    {
      bool = localTypedArray.hasValue(0);
      if (bool)
      {
        id = localTypedArray.getResourceId(0, -1);
        paramAttributeSet = mDrawableManager;
        localObject2 = localView1.getContext();
        paramInt = id;
      }
      bool = localTypedArray.hasValue(1);
    }
    catch (Throwable paramAttributeSet)
    {
      try
      {
        localObject2 = this$0.get((android.content.Context)localObject2, paramInt);
        if (localObject2 == null) {
          break label147;
        }
        setInternalBackgroundTint((ColorStateList)localObject2);
      }
      catch (Throwable localThrowable)
      {
        throw localThrowable;
      }
      paramAttributeSet = paramAttributeSet;
    }
    label147:
    if (bool) {
      ViewCompatLollipop.setBackgroundTintList(localThrowable, ((ClassWriter)localObject1).init(1));
    }
    boolean bool = localTypedArray.hasValue(2);
    if (bool) {
      ViewCompatLollipop.setBackgroundTintMode(localThrowable, Context.parseTintMode(localTypedArray.getInt(2, -1), null));
    }
    ((ClassWriter)localObject1).recycle();
    return;
    ((ClassWriter)localObject1).recycle();
    throw paramAttributeSet;
  }
  
  public final void setInternalBackgroundTint(ColorStateList paramColorStateList)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final void setSupportBackgroundTintList()
  {
    id = -1;
    setInternalBackgroundTint(null);
    applySupportBackgroundTint();
  }
  
  public final void setSupportBackgroundTintList(ColorStateList paramColorStateList)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final void setSupportBackgroundTintMode(PorterDuff.Mode paramMode)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
}
