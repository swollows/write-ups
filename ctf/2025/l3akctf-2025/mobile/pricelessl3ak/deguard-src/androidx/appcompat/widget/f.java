package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.RectF;
import android.os.Build.VERSION;
import android.text.Layout;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.Log;
import android.util.TypedValue;
import android.view.View;
import android.widget.TextView;
import java.lang.reflect.AccessibleObject;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;

public final class f
{
  public static final RectF g = new RectF();
  public static final ConcurrentHashMap m = new ConcurrentHashMap();
  public final TextView a;
  public int b = 0;
  public final Complex c;
  public boolean d = false;
  public int[] e = new int[0];
  public boolean h = false;
  public final Context j;
  public float n = -1.0F;
  public TextPaint v;
  public float x = -1.0F;
  public float y = -1.0F;
  
  public f(TextView paramTextView)
  {
    a = paramTextView;
    j = paramTextView.getContext();
    if (Build.VERSION.SDK_INT >= 29)
    {
      c = new QEAbstract();
      return;
    }
    c = new Complex();
  }
  
  public static Object a(Object paramObject1, String paramString, Object paramObject2)
  {
    try
    {
      paramObject1 = get(paramString).invoke(paramObject1, null);
      return paramObject1;
    }
    catch (Throwable paramObject1) {}catch (Exception paramObject1) {}
    throw paramObject1;
    StringBuilder localStringBuilder = new StringBuilder("Failed to invoke TextView#");
    localStringBuilder.append(paramString);
    localStringBuilder.append("() method");
    Log.w("ACTVAutoSizeHelper", localStringBuilder.toString(), paramObject1);
    return paramObject2;
  }
  
  public static Method get(String paramString)
  {
    ConcurrentHashMap localConcurrentHashMap = m;
    Object localObject;
    try
    {
      localObject = localConcurrentHashMap.get(paramString);
      localObject = (Method)localObject;
      if (localObject == null)
      {
        localObject = TextView.class.getDeclaredMethod(paramString, null);
        if (localObject == null) {
          return localObject;
        }
        ((AccessibleObject)localObject).setAccessible(true);
        localConcurrentHashMap.put(paramString, localObject);
        return localObject;
      }
    }
    catch (Exception localException)
    {
      break label51;
      return localObject;
      label51:
      localObject = new StringBuilder("Failed to retrieve TextView#");
      ((StringBuilder)localObject).append(paramString);
      ((StringBuilder)localObject).append("() method");
      Log.w("ACTVAutoSizeHelper", ((StringBuilder)localObject).toString(), localException);
      return null;
    }
    return localObject;
  }
  
  public static int[] sort(int[] paramArrayOfInt)
  {
    int i1 = paramArrayOfInt.length;
    if (i1 == 0) {
      return paramArrayOfInt;
    }
    Arrays.sort(paramArrayOfInt);
    ArrayList localArrayList = new ArrayList();
    int k = 0;
    int i = 0;
    while (i < i1)
    {
      int i2 = paramArrayOfInt[i];
      if ((i2 > 0) && (Collections.binarySearch(localArrayList, Integer.valueOf(i2)) < 0)) {
        localArrayList.add(Integer.valueOf(i2));
      }
      i += 1;
    }
    if (i1 == localArrayList.size()) {
      return paramArrayOfInt;
    }
    i1 = localArrayList.size();
    paramArrayOfInt = new int[i1];
    i = k;
    while (i < i1)
    {
      paramArrayOfInt[i] = ((Integer)localArrayList.get(i)).intValue();
      i += 1;
    }
    return paramArrayOfInt;
  }
  
  public final void a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    if (paramFloat1 > 0.0F)
    {
      if (paramFloat2 > paramFloat1)
      {
        if (paramFloat3 > 0.0F)
        {
          b = 1;
          n = paramFloat1;
          x = paramFloat2;
          y = paramFloat3;
          h = false;
          return;
        }
        localStringBuilder = new StringBuilder("The auto-size step granularity (");
        localStringBuilder.append(paramFloat3);
        localStringBuilder.append("px) is less or equal to (0px)");
        throw new IllegalArgumentException(localStringBuilder.toString());
      }
      localStringBuilder = new StringBuilder("Maximum auto-size text size (");
      localStringBuilder.append(paramFloat2);
      localStringBuilder.append("px) is less or equal to minimum auto-size text size (");
      localStringBuilder.append(paramFloat1);
      localStringBuilder.append("px)");
      throw new IllegalArgumentException(localStringBuilder.toString());
    }
    StringBuilder localStringBuilder = new StringBuilder("Minimum auto-size text size (");
    localStringBuilder.append(paramFloat1);
    localStringBuilder.append("px) is less or equal to (0px)");
    throw new IllegalArgumentException(localStringBuilder.toString());
  }
  
  public final boolean a()
  {
    boolean bool = d();
    int i = 0;
    if ((bool) && (b == 1))
    {
      if ((!h) || (e.length == 0))
      {
        int k = (int)Math.floor((x - n) / y) + 1;
        int[] arrayOfInt = new int[k];
        while (i < k)
        {
          float f = n;
          arrayOfInt[i] = Math.round(i * y + f);
          i += 1;
        }
        e = sort(arrayOfInt);
      }
      d = true;
    }
    else
    {
      d = false;
    }
    return d;
  }
  
  public final boolean add()
  {
    return (d()) && (b != 0);
  }
  
  public final void b(int paramInt, float paramFloat)
  {
    Object localObject = j;
    if (localObject == null) {
      localObject = Resources.getSystem();
    } else {
      localObject = ((Context)localObject).getResources();
    }
    paramFloat = TypedValue.applyDimension(paramInt, paramFloat, ((Resources)localObject).getDisplayMetrics());
    localObject = a;
    if (paramFloat != ((TextView)localObject).getPaint().getTextSize())
    {
      ((TextView)localObject).getPaint().setTextSize(paramFloat);
      boolean bool = ((View)localObject).isInLayout();
      if (((TextView)localObject).getLayout() != null)
      {
        d = false;
        try
        {
          Method localMethod = get("nullLayouts");
          if (localMethod != null) {
            localMethod.invoke(localObject, null);
          }
        }
        catch (Exception localException)
        {
          Log.w("ACTVAutoSizeHelper", "Failed to invoke TextView#nullLayouts() method", localException);
        }
        if (!bool) {
          ((View)localObject).requestLayout();
        } else {
          ((View)localObject).forceLayout();
        }
        ((View)localObject).invalidate();
      }
    }
  }
  
  public final boolean b()
  {
    int[] arrayOfInt = e;
    int i = arrayOfInt.length;
    boolean bool;
    if (i > 0) {
      bool = true;
    } else {
      bool = false;
    }
    h = bool;
    if (bool)
    {
      b = 1;
      n = arrayOfInt[0];
      x = arrayOfInt[(i - 1)];
      y = -1.0F;
    }
    return bool;
  }
  
  public final boolean d()
  {
    return a instanceof AppCompatEditText ^ true;
  }
  
  public final int draw(RectF paramRectF)
  {
    int i = e.length;
    if (i != 0)
    {
      int i1 = i - 1;
      int k = 0;
      i = 1;
      while (i <= i1)
      {
        k = (i + i1) / 2;
        int i3 = e[k];
        Object localObject4 = a;
        Object localObject3 = ((TextView)localObject4).getText();
        Object localObject2 = localObject3;
        TransformationMethod localTransformationMethod = ((TextView)localObject4).getTransformationMethod();
        Object localObject1 = localObject2;
        if (localTransformationMethod != null)
        {
          localObject3 = localTransformationMethod.getTransformation((CharSequence)localObject3, (View)localObject4);
          localObject1 = localObject2;
          if (localObject3 != null) {
            localObject1 = localObject3;
          }
        }
        int i2 = ((TextView)localObject4).getMaxLines();
        localObject2 = v;
        if (localObject2 == null) {
          v = new TextPaint();
        } else {
          ((Paint)localObject2).reset();
        }
        v.set(((TextView)localObject4).getPaint());
        v.setTextSize(i3);
        localObject2 = (Layout.Alignment)a(localObject4, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
        i3 = Math.round(right);
        localObject3 = v;
        localObject4 = c;
        localObject2 = IonBitmapCache.get(localObject1, (Layout.Alignment)localObject2, i3, i2, a, (TextPaint)localObject3, (CharArray)localObject4);
        if (((i2 != -1) && ((((StaticLayout)localObject2).getLineCount() > i2) || (((Layout)localObject2).getLineEnd(((StaticLayout)localObject2).getLineCount() - 1) != localObject1.length()))) || (((Layout)localObject2).getHeight() > bottom))
        {
          k -= 1;
          i1 = k;
        }
        else
        {
          i2 = k + 1;
          k = i;
          i = i2;
        }
      }
      return e[k];
    }
    throw new IllegalStateException("No available text sizes to choose from.");
  }
  
  public final void draw()
  {
    if (!add()) {
      return;
    }
    int i;
    int k;
    RectF localRectF;
    if (d)
    {
      if (a.getMeasuredHeight() <= 0) {
        break label187;
      }
      if (a.getMeasuredWidth() <= 0) {
        return;
      }
      if (c.add(a)) {
        i = 1048576;
      } else {
        i = a.getMeasuredWidth() - a.getTotalPaddingLeft() - a.getTotalPaddingRight();
      }
      k = a.getHeight() - a.getCompoundPaddingBottom() - a.getCompoundPaddingTop();
      if (i <= 0) {
        break label187;
      }
      if (k <= 0) {
        return;
      }
      localRectF = g;
    }
    try
    {
      localRectF.setEmpty();
      right = i;
      bottom = k;
      float f = draw(localRectF);
      if (f != a.getTextSize()) {
        b(0, f);
      }
    }
    catch (Throwable localThrowable)
    {
      Object localObject;
      for (;;) {}
    }
    throw localObject;
    d = true;
    label187:
  }
}
