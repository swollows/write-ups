package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import util.ColorUtils;

public final class c
{
  public final int[] a = { 2131165209, 2131165244, 2131165216, 2131165211, 2131165212, 2131165215, 2131165214 };
  public final int[] b = { 2131165252, 2131165262 };
  public final int[] c = { 2131165234, 2131165200, 2131165233 };
  public final int[] d = { 2131165261, 2131165259, 2131165185 };
  public final int[] f = { 2131165258, 2131165260, 2131165202, 2131165254, 2131165255, 2131165256, 2131165257 };
  public final int[] l = { 2131165188, 2131165194, 2131165189, 2131165195 };
  
  public c() {}
  
  public static boolean a(int[] paramArrayOfInt, int paramInt)
  {
    int j = paramArrayOfInt.length;
    int i = 0;
    while (i < j)
    {
      if (paramArrayOfInt[i] == paramInt) {
        return true;
      }
      i += 1;
    }
    return false;
  }
  
  public static ColorStateList createButtonColorStateList(android.content.Context paramContext, int paramInt)
  {
    int k = ThemeUtils.getThemeAttrColor(paramContext, 2130903125);
    int i = ThemeUtils.init(paramContext, 2130903123);
    paramContext = ThemeUtils.DISABLED_STATE_SET;
    int[] arrayOfInt1 = ThemeUtils.CHECKED_STATE_SET;
    int j = ColorUtils.compositeColors(k, paramInt);
    int[] arrayOfInt2 = ThemeUtils.FOCUSED_STATE_SET;
    k = ColorUtils.compositeColors(k, paramInt);
    return new ColorStateList(new int[][] { paramContext, arrayOfInt1, arrayOfInt2, ThemeUtils.EMPTY_STATE_SET }, new int[] { i, j, k, paramInt });
  }
  
  public static LayerDrawable getDrawable(TintManager paramTintManager, android.content.Context paramContext, int paramInt)
  {
    paramInt = paramContext.getResources().getDimensionPixelSize(paramInt);
    Object localObject2 = paramTintManager.getDrawable(paramContext, 2131165248);
    Object localObject1 = paramTintManager.getDrawable(paramContext, 2131165249);
    if (((localObject2 instanceof BitmapDrawable)) && (((Drawable)localObject2).getIntrinsicWidth() == paramInt) && (((Drawable)localObject2).getIntrinsicHeight() == paramInt))
    {
      paramTintManager = (BitmapDrawable)localObject2;
      paramContext = new BitmapDrawable(paramTintManager.getBitmap());
    }
    else
    {
      paramContext = Bitmap.createBitmap(paramInt, paramInt, Bitmap.Config.ARGB_8888);
      paramTintManager = new Canvas(paramContext);
      ((Drawable)localObject2).setBounds(0, 0, paramInt, paramInt);
      ((Drawable)localObject2).draw(paramTintManager);
      paramTintManager = new BitmapDrawable(paramContext);
      paramContext = new BitmapDrawable(paramContext);
    }
    paramContext.setTileModeX(Shader.TileMode.REPEAT);
    if (((localObject1 instanceof BitmapDrawable)) && (((Drawable)localObject1).getIntrinsicWidth() == paramInt) && (((Drawable)localObject1).getIntrinsicHeight() == paramInt))
    {
      localObject1 = (BitmapDrawable)localObject1;
    }
    else
    {
      localObject2 = Bitmap.createBitmap(paramInt, paramInt, Bitmap.Config.ARGB_8888);
      Canvas localCanvas = new Canvas((Bitmap)localObject2);
      ((Drawable)localObject1).setBounds(0, 0, paramInt, paramInt);
      ((Drawable)localObject1).draw(localCanvas);
      localObject1 = new BitmapDrawable((Bitmap)localObject2);
    }
    paramTintManager = new LayerDrawable(new Drawable[] { paramTintManager, localObject1, paramContext });
    paramTintManager.setId(0, 16908288);
    paramTintManager.setId(1, 16908303);
    paramTintManager.setId(2, 16908301);
    return paramTintManager;
  }
  
  public static void setPorterDuffColorFilter(Drawable paramDrawable, int paramInt, PorterDuff.Mode paramMode)
  {
    Drawable localDrawable = paramDrawable.mutate();
    paramDrawable = paramMode;
    if (paramMode == null) {
      paramDrawable = AppCompatDrawableManager.DEFAULT_MODE;
    }
    paramMode = AppCompatDrawableManager.DEFAULT_MODE;
    try
    {
      paramDrawable = TintManager.get(paramInt, paramDrawable);
      localDrawable.setColorFilter(paramDrawable);
      return;
    }
    catch (Throwable paramDrawable)
    {
      throw paramDrawable;
    }
  }
  
  public final ColorStateList onCreateView(android.content.Context paramContext, int paramInt)
  {
    if (paramInt == 2131165205) {
      return drupal.Context.get(paramContext, 2131034133);
    }
    if (paramInt == 2131165251) {
      return drupal.Context.get(paramContext, 2131034136);
    }
    if (paramInt == 2131165250)
    {
      int[][] arrayOfInt = new int[3][];
      int[] arrayOfInt1 = new int[3];
      ColorStateList localColorStateList = ThemeUtils.getThemeAttrColorStateList(paramContext, 2130903130);
      if ((localColorStateList != null) && (localColorStateList.isStateful()))
      {
        int[] arrayOfInt2 = ThemeUtils.DISABLED_STATE_SET;
        arrayOfInt[0] = arrayOfInt2;
        arrayOfInt1[0] = localColorStateList.getColorForState(arrayOfInt2, 0);
        arrayOfInt[1] = ThemeUtils.SELECTED_STATE_SET;
        arrayOfInt1[1] = ThemeUtils.getThemeAttrColor(paramContext, 2130903124);
        arrayOfInt[2] = ThemeUtils.EMPTY_STATE_SET;
        arrayOfInt1[2] = localColorStateList.getDefaultColor();
      }
      else
      {
        arrayOfInt[0] = ThemeUtils.DISABLED_STATE_SET;
        arrayOfInt1[0] = ThemeUtils.init(paramContext, 2130903130);
        arrayOfInt[1] = ThemeUtils.SELECTED_STATE_SET;
        arrayOfInt1[1] = ThemeUtils.getThemeAttrColor(paramContext, 2130903124);
        arrayOfInt[2] = ThemeUtils.EMPTY_STATE_SET;
        arrayOfInt1[2] = ThemeUtils.getThemeAttrColor(paramContext, 2130903130);
      }
      return new ColorStateList(arrayOfInt, arrayOfInt1);
    }
    if (paramInt == 2131165193) {
      return createButtonColorStateList(paramContext, ThemeUtils.getThemeAttrColor(paramContext, 2130903123));
    }
    if (paramInt == 2131165187) {
      return createButtonColorStateList(paramContext, 0);
    }
    if (paramInt == 2131165192) {
      return createButtonColorStateList(paramContext, ThemeUtils.getThemeAttrColor(paramContext, 2130903121));
    }
    if ((paramInt != 2131165246) && (paramInt != 2131165247))
    {
      if (a(a, paramInt)) {
        return ThemeUtils.getThemeAttrColorStateList(paramContext, 2130903126);
      }
      if (a(b, paramInt)) {
        return drupal.Context.get(paramContext, 2131034132);
      }
      if (a(l, paramInt)) {
        return drupal.Context.get(paramContext, 2131034131);
      }
      if (paramInt == 2131165243) {
        return drupal.Context.get(paramContext, 2131034134);
      }
      return null;
    }
    return drupal.Context.get(paramContext, 2131034135);
  }
}
