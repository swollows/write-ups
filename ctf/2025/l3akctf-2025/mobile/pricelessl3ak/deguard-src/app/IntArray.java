package app;

import android.graphics.Rect;
import android.os.Build.VERSION;
import android.util.Log;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
import util.Headers;

public abstract class IntArray
  extends Elements
{
  public static Field data;
  public static Field field;
  public static Method method;
  public static Class type;
  public static boolean value;
  public Headers mData = null;
  public final WindowInsets mSource;
  public Headers map;
  public int size;
  
  public IntArray(TypeToken paramTypeToken, WindowInsets paramWindowInsets)
  {
    super(paramTypeToken);
    mSource = paramWindowInsets;
  }
  
  private Headers get(View paramView)
  {
    if (Build.VERSION.SDK_INT < 30)
    {
      if (!value) {
        set();
      }
      Object localObject = method;
      if ((localObject != null) && (type != null))
      {
        if (data == null) {
          return null;
        }
        try
        {
          paramView = ((Method)localObject).invoke(paramView, null);
          if (paramView == null)
          {
            Log.w("WindowInsetsCompat", "Failed to get visible insets. getViewRootImpl() returned null from the provided view. This means that the view is either not attached or the method has been overridden", new NullPointerException());
            return null;
          }
        }
        catch (ReflectiveOperationException paramView)
        {
          break label141;
          localObject = field;
          paramView = ((Field)localObject).get(paramView);
          localObject = data;
          paramView = ((Field)localObject).get(paramView);
          paramView = (Rect)paramView;
          if (paramView == null) {
            break label186;
          }
          int i = left;
          int j = top;
          int k = right;
          int m = bottom;
          paramView = Headers.set(i, j, k, m);
          return paramView;
          label141:
          localObject = new StringBuilder("Failed to get visible insets. (Reflection error). ");
          ((StringBuilder)localObject).append(paramView.getMessage());
          Log.e("WindowInsetsCompat", ((StringBuilder)localObject).toString(), paramView);
          return null;
        }
      }
    }
    else
    {
      throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }
    label186:
    return null;
  }
  
  public static boolean get(int paramInt1, int paramInt2)
  {
    return (paramInt1 & 0x6) == (paramInt2 & 0x6);
  }
  
  private static void set()
  {
    try
    {
      Object localObject = View.class.getDeclaredMethod("getViewRootImpl", null);
      method = (Method)localObject;
      localObject = Class.forName("android.view.View$AttachInfo");
      type = (Class)localObject;
      localObject = ((Class)localObject).getDeclaredField("mVisibleInsets");
      data = (Field)localObject;
      localObject = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
      field = (Field)localObject;
      localObject = data;
      ((AccessibleObject)localObject).setAccessible(true);
      localObject = field;
      ((AccessibleObject)localObject).setAccessible(true);
    }
    catch (ReflectiveOperationException localReflectiveOperationException)
    {
      StringBuilder localStringBuilder = new StringBuilder("Failed to get visible insets. (Reflection error). ");
      localStringBuilder.append(localReflectiveOperationException.getMessage());
      Log.e("WindowInsetsCompat", localStringBuilder.toString(), localReflectiveOperationException);
    }
    value = true;
  }
  
  public final Headers add()
  {
    if (mData == null)
    {
      WindowInsets localWindowInsets = mSource;
      mData = Headers.set(localWindowInsets.getSystemWindowInsetLeft(), localWindowInsets.getSystemWindowInsetTop(), localWindowInsets.getSystemWindowInsetRight(), localWindowInsets.getSystemWindowInsetBottom());
    }
    return mData;
  }
  
  public void add(int paramInt)
  {
    size = paramInt;
  }
  
  public void add(Headers paramHeaders)
  {
    map = paramHeaders;
  }
  
  public boolean equals(Object paramObject)
  {
    if (!super.equals(paramObject)) {
      return false;
    }
    paramObject = (IntArray)paramObject;
    return (Objects.equals(map, map)) && (get(size, size));
  }
  
  public TypeToken get(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: fail exe a8 = a7\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:92)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.dfs(Cfg.java:255)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze0(BaseAnalyze.java:75)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze(BaseAnalyze.java:69)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:274)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\nCaused by: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:552)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:1)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:166)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:331)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:387)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:90)\n\t... 17 more\n");
  }
  
  public void set(View paramView)
  {
    Headers localHeaders = get(paramView);
    paramView = localHeaders;
    if (localHeaders == null) {
      paramView = Headers.array;
    }
    add(paramView);
  }
  
  public void set(TypeToken paramTypeToken) {}
  
  public void set(Headers[] paramArrayOfHeaders) {}
  
  public boolean size()
  {
    return mSource.isRound();
  }
}
