package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.TypedValue;
import cat.HttpFields;
import http.Attribute;
import http.Item;
import http.Label;
import slide.withCursor;

public final class TintManager
{
  public static final PorterDuff.Mode DEFAULT_MODE;
  public static TintManager INSTANCE;
  public static final WeakHashMap cache;
  public java.util.WeakHashMap INSTANCE_CACHE;
  public final java.util.WeakHashMap a = new java.util.WeakHashMap(0);
  public c c;
  public boolean loading;
  public TypedValue mTypedValue;
  
  static
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public TintManager() {}
  
  public static PorterDuffColorFilter get(int paramInt, PorterDuff.Mode paramMode)
  {
    PorterDuffColorFilter localPorterDuffColorFilter1;
    try
    {
      WeakHashMap localWeakHashMap = cache;
      localWeakHashMap.getClass();
      int i = (31 + paramInt) * 31;
      PorterDuffColorFilter localPorterDuffColorFilter2 = (PorterDuffColorFilter)localWeakHashMap.add(Integer.valueOf(paramMode.hashCode() + i));
      localPorterDuffColorFilter1 = localPorterDuffColorFilter2;
      if (localPorterDuffColorFilter2 == null)
      {
        localPorterDuffColorFilter1 = new PorterDuffColorFilter(paramInt, paramMode);
        paramMode = (PorterDuffColorFilter)localWeakHashMap.add(Integer.valueOf(paramMode.hashCode() + i), localPorterDuffColorFilter1);
      }
    }
    catch (Throwable paramMode)
    {
      break label90;
    }
    return localPorterDuffColorFilter1;
    label90:
    throw paramMode;
  }
  
  public static TintManager get()
  {
    try
    {
      if (INSTANCE == null) {
        INSTANCE = new TintManager();
      }
      localTintManager = INSTANCE;
      return localTintManager;
    }
    catch (Throwable localThrowable)
    {
      TintManager localTintManager;
      for (;;) {}
    }
    throw localTintManager;
  }
  
  public final Drawable a(android.content.Context paramContext, int paramInt)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final ColorStateList get(android.content.Context paramContext, int paramInt)
  {
    for (;;)
    {
      Object localObject2;
      try
      {
        localObject1 = INSTANCE_CACHE;
        Attribute localAttribute = null;
        if (localObject1 == null) {
          break label224;
        }
        localObject1 = (Attribute)((java.util.WeakHashMap)localObject1).get(paramContext);
        if (localObject1 == null) {
          break label224;
        }
        localObject2 = a;
        int i = HttpFields.get(i, paramInt, (int[])localObject2);
        if (i < 0) {
          break label218;
        }
        localObject2 = b[i];
        localObject1 = localObject2;
        if (localObject2 == Item.a) {
          break label218;
        }
        localObject1 = (ColorStateList)localObject1;
        localObject2 = localObject1;
        if (localObject1 == null)
        {
          localObject1 = c;
          if (localObject1 == null) {
            localObject1 = localAttribute;
          } else {
            localObject1 = ((c)localObject1).onCreateView(paramContext, paramInt);
          }
          if (localObject1 != null)
          {
            if (INSTANCE_CACHE == null) {
              INSTANCE_CACHE = new java.util.WeakHashMap();
            }
            localAttribute = (Attribute)INSTANCE_CACHE.get(paramContext);
            localObject2 = localAttribute;
            if (localAttribute == null)
            {
              localObject2 = new Attribute();
              INSTANCE_CACHE.put(paramContext, localObject2);
            }
            ((Attribute)localObject2).init(paramInt, localObject1);
          }
          localObject2 = localObject1;
        }
      }
      catch (Throwable paramContext)
      {
        break label214;
      }
      return localObject2;
      label214:
      throw paramContext;
      label218:
      Object localObject1 = null;
      continue;
      label224:
      localObject1 = null;
    }
  }
  
  public final Drawable getDrawable(android.content.Context paramContext, int paramInt)
  {
    try
    {
      paramContext = getDrawable(paramContext, paramInt, false);
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      throw paramContext;
    }
  }
  
  public final Drawable getDrawable(android.content.Context paramContext, int paramInt, boolean paramBoolean)
  {
    try
    {
      Object localObject1;
      if (!loading)
      {
        loading = true;
        localObject1 = getDrawable(paramContext, 2131165263);
        if ((localObject1 == null) || ((!(localObject1 instanceof withCursor)) && (!"android.graphics.drawable.VectorDrawable".equals(localObject1.getClass().getName())))) {}
      }
      else
      {
        Object localObject2 = a(paramContext, paramInt);
        localObject1 = localObject2;
        if (localObject2 == null) {
          localObject1 = paramContext.getDrawable(paramInt);
        }
        localObject2 = localObject1;
        if (localObject1 != null) {
          localObject2 = tintDrawable(paramContext, paramInt, paramBoolean, (Drawable)localObject1);
        }
        if (localObject2 != null) {
          Context.update((Drawable)localObject2);
        }
        return localObject2;
      }
      loading = false;
      throw new IllegalStateException("This app has been built with an incorrect configuration. Please configure your build for VectorDrawableCompat.");
    }
    catch (Throwable paramContext)
    {
      for (;;) {}
    }
    throw paramContext;
  }
  
  public final Drawable tintDrawable(android.content.Context paramContext, int paramInt, boolean paramBoolean, Drawable paramDrawable)
  {
    Object localObject3 = get(paramContext, paramInt);
    Object localObject2 = null;
    Object localObject1;
    if (localObject3 != null)
    {
      localObject1 = paramDrawable.mutate();
      ((Drawable)localObject1).setTintList((ColorStateList)localObject3);
      if (c == null)
      {
        paramDrawable = (Drawable)localObject2;
      }
      else
      {
        paramDrawable = (Drawable)localObject2;
        if (paramInt == 2131165250) {
          paramDrawable = PorterDuff.Mode.MULTIPLY;
        }
      }
      paramContext = (android.content.Context)localObject1;
      if (paramDrawable != null)
      {
        ((Drawable)localObject1).setTintMode(paramDrawable);
        return localObject1;
      }
    }
    else
    {
      if (c != null)
      {
        if (paramInt == 2131165245)
        {
          localObject1 = (LayerDrawable)paramDrawable;
          localObject2 = ((LayerDrawable)localObject1).findDrawableByLayerId(16908288);
          paramInt = ThemeUtils.getThemeAttrColor(paramContext, 2130903126);
          localObject3 = AppCompatDrawableManager.DEFAULT_MODE;
          c.setPorterDuffColorFilter((Drawable)localObject2, paramInt, (PorterDuff.Mode)localObject3);
          c.setPorterDuffColorFilter(((LayerDrawable)localObject1).findDrawableByLayerId(16908303), ThemeUtils.getThemeAttrColor(paramContext, 2130903126), (PorterDuff.Mode)localObject3);
          c.setPorterDuffColorFilter(((LayerDrawable)localObject1).findDrawableByLayerId(16908301), ThemeUtils.getThemeAttrColor(paramContext, 2130903124), (PorterDuff.Mode)localObject3);
          return paramDrawable;
        }
        if ((paramInt == 2131165236) || (paramInt == 2131165235) || (paramInt == 2131165237))
        {
          localObject1 = (LayerDrawable)paramDrawable;
          localObject2 = ((LayerDrawable)localObject1).findDrawableByLayerId(16908288);
          paramInt = ThemeUtils.init(paramContext, 2130903126);
          localObject3 = AppCompatDrawableManager.DEFAULT_MODE;
          c.setPorterDuffColorFilter((Drawable)localObject2, paramInt, (PorterDuff.Mode)localObject3);
          c.setPorterDuffColorFilter(((LayerDrawable)localObject1).findDrawableByLayerId(16908303), ThemeUtils.getThemeAttrColor(paramContext, 2130903124), (PorterDuff.Mode)localObject3);
          c.setPorterDuffColorFilter(((LayerDrawable)localObject1).findDrawableByLayerId(16908301), ThemeUtils.getThemeAttrColor(paramContext, 2130903124), (PorterDuff.Mode)localObject3);
          return paramDrawable;
        }
      }
      localObject2 = c;
      int m = 0;
      int k = m;
      if (localObject2 != null)
      {
        localObject1 = AppCompatDrawableManager.DEFAULT_MODE;
        if (c.a(d, paramInt)) {
          paramInt = 2130903126;
        }
        int j;
        for (int i = 1;; i = 0)
        {
          j = -1;
          break label385;
          if (c.a(f, paramInt))
          {
            paramInt = 2130903124;
            break;
          }
          if (c.a(c, paramInt)) {
            localObject1 = PorterDuff.Mode.MULTIPLY;
          }
          do
          {
            paramInt = 16842801;
            break;
            if (paramInt == 2131165222)
            {
              i = 1;
              j = Math.round(40.8F);
              paramInt = 16842800;
              break label385;
            }
          } while (paramInt == 2131165204);
          paramInt = 0;
        }
        label385:
        k = m;
        if (i != 0)
        {
          localObject2 = paramDrawable.mutate();
          paramInt = ThemeUtils.getThemeAttrColor(paramContext, paramInt);
          try
          {
            paramContext = get(paramInt, (PorterDuff.Mode)localObject1);
            ((Drawable)localObject2).setColorFilter(paramContext);
            if (j != -1) {
              ((Drawable)localObject2).setAlpha(j);
            }
            k = 1;
          }
          catch (Throwable paramContext)
          {
            throw paramContext;
          }
        }
      }
      paramContext = paramDrawable;
      if (k == 0)
      {
        paramContext = paramDrawable;
        if (paramBoolean) {
          return null;
        }
      }
    }
    return paramContext;
  }
}
