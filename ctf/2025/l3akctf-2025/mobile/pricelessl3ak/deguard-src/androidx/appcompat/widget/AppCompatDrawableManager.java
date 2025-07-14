package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.Log;

public final class AppCompatDrawableManager
{
  public static final PorterDuff.Mode DEFAULT_MODE = PorterDuff.Mode.SRC_IN;
  public static AppCompatDrawableManager INSTANCE;
  public TintManager this$0;
  
  public static AppCompatDrawableManager get()
  {
    try
    {
      if (INSTANCE == null) {
        read();
      }
      localAppCompatDrawableManager = INSTANCE;
      return localAppCompatDrawableManager;
    }
    catch (Throwable localThrowable)
    {
      AppCompatDrawableManager localAppCompatDrawableManager;
      for (;;) {}
    }
    throw localAppCompatDrawableManager;
  }
  
  public static void read()
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public static void tintDrawable(Drawable paramDrawable, TintInfo paramTintInfo, int[] paramArrayOfInt)
  {
    Object localObject1 = TintManager.DEFAULT_MODE;
    localObject1 = paramDrawable.getState();
    if (paramDrawable.mutate() == paramDrawable)
    {
      if (((paramDrawable instanceof LayerDrawable)) && (paramDrawable.isStateful()))
      {
        paramDrawable.setState(new int[0]);
        paramDrawable.setState((int[])localObject1);
      }
      boolean bool = mHasTintList;
      if ((!bool) && (!mHasTintMode))
      {
        paramDrawable.clearColorFilter();
        return;
      }
      Object localObject3 = null;
      if (bool) {
        localObject1 = mTintList;
      } else {
        localObject1 = null;
      }
      if (mHasTintMode) {
        paramTintInfo = mTintMode;
      } else {
        paramTintInfo = TintManager.DEFAULT_MODE;
      }
      Object localObject2 = localObject3;
      if (localObject1 != null) {
        if (paramTintInfo == null) {
          localObject2 = localObject3;
        } else {
          localObject2 = TintManager.get(((ColorStateList)localObject1).getColorForState(paramArrayOfInt, 0), paramTintInfo);
        }
      }
      paramDrawable.setColorFilter((ColorFilter)localObject2);
      return;
    }
    Log.d("ResourceManagerInternal", "Mutated drawable is not the same instance as the input.");
  }
  
  public final Drawable getDrawable(Context paramContext, int paramInt)
  {
    try
    {
      paramContext = this$0.getDrawable(paramContext, paramInt);
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      throw paramContext;
    }
  }
}
