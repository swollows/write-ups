package androidx.appcompat.widget;

import Console.R.styleable;
import android.content.res.ColorStateList;
import android.content.res.Resources.Theme;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import util.ColorUtils;

public abstract class ThemeUtils
{
  public static final int[] CHECKED_STATE_SET;
  public static final int[] DISABLED_STATE_SET;
  public static final int[] EMPTY_STATE_SET = new int[0];
  public static final int[] FOCUSED_STATE_SET;
  public static final int[] SELECTED_STATE_SET;
  public static final int[] TEMP_ARRAY = new int[1];
  public static final ThreadLocal TL_TYPED_VALUE = new ThreadLocal();
  
  static
  {
    DISABLED_STATE_SET = new int[] { -16842910 };
    FOCUSED_STATE_SET = new int[] { 16842908 };
    CHECKED_STATE_SET = new int[] { 16842919 };
    SELECTED_STATE_SET = new int[] { 16842912 };
  }
  
  public static void a(View paramView, android.content.Context paramContext)
  {
    paramContext = paramContext.obtainStyledAttributes(R.styleable.type);
    try
    {
      boolean bool = paramContext.hasValue(117);
      if (!bool)
      {
        StringBuilder localStringBuilder = new StringBuilder("View ");
        localStringBuilder.append(paramView.getClass());
        localStringBuilder.append(" is an AppCompat widget that can only be used with a Theme.AppCompat theme (or descendant).");
        Log.e("ThemeUtils", localStringBuilder.toString());
      }
    }
    catch (Throwable paramView)
    {
      break label67;
    }
    paramContext.recycle();
    return;
    label67:
    paramContext.recycle();
    throw paramView;
  }
  
  public static int getThemeAttrColor(android.content.Context paramContext, int paramInt)
  {
    int[] arrayOfInt = TEMP_ARRAY;
    arrayOfInt[0] = paramInt;
    paramContext = paramContext.obtainStyledAttributes(null, arrayOfInt);
    try
    {
      paramInt = paramContext.getColor(0, 0);
      paramContext.recycle();
      return paramInt;
    }
    catch (Throwable localThrowable)
    {
      paramContext.recycle();
      throw localThrowable;
    }
  }
  
  public static ColorStateList getThemeAttrColorStateList(android.content.Context paramContext, int paramInt)
  {
    Object localObject = TEMP_ARRAY;
    localObject[0] = paramInt;
    TypedArray localTypedArray = paramContext.obtainStyledAttributes(null, (int[])localObject);
    try
    {
      boolean bool = localTypedArray.hasValue(0);
      if (bool)
      {
        paramInt = localTypedArray.getResourceId(0, 0);
        if (paramInt != 0)
        {
          localObject = drupal.Context.get(paramContext, paramInt);
          paramContext = (android.content.Context)localObject;
          if (localObject != null) {
            break label61;
          }
        }
      }
      paramContext = localTypedArray.getColorStateList(0);
      label61:
      localTypedArray.recycle();
      return paramContext;
    }
    catch (Throwable paramContext)
    {
      localTypedArray.recycle();
      throw paramContext;
    }
  }
  
  public static int init(android.content.Context paramContext, int paramInt)
  {
    Object localObject = getThemeAttrColorStateList(paramContext, paramInt);
    if ((localObject != null) && (((ColorStateList)localObject).isStateful())) {
      return ((ColorStateList)localObject).getColorForState(DISABLED_STATE_SET, ((ColorStateList)localObject).getDefaultColor());
    }
    ThreadLocal localThreadLocal = TL_TYPED_VALUE;
    TypedValue localTypedValue = (TypedValue)localThreadLocal.get();
    localObject = localTypedValue;
    if (localTypedValue == null)
    {
      localObject = new TypedValue();
      localThreadLocal.set(localObject);
    }
    paramContext.getTheme().resolveAttribute(16842803, (TypedValue)localObject, true);
    float f = ((TypedValue)localObject).getFloat();
    paramInt = getThemeAttrColor(paramContext, paramInt);
    int i = Math.round(Color.alpha(paramInt) * f);
    int j = ColorUtils.TAN;
    if ((i >= 0) && (i <= 255)) {
      return paramInt & 0xFFFFFF | i << 24;
    }
    throw new IllegalArgumentException("alpha must be between 0 and 255.");
  }
}
