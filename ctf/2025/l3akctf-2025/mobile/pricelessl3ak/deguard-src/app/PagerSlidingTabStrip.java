package app;

import android.text.TextUtils;
import android.view.View;

public final class PagerSlidingTabStrip
  extends Attribute
{
  public PagerSlidingTabStrip(int paramInt1, Class paramClass, int paramInt2, int paramInt3, int paramInt4)
  {
    super();
    data = paramInt1;
    value = paramClass;
    count = paramInt2;
    size = paramInt3;
  }
  
  public final Object a(View paramView)
  {
    switch (i)
    {
    default: 
      return Boolean.valueOf(m.b(paramView));
    case 1: 
      return m.format(paramView);
    }
    return Boolean.valueOf(m.c(paramView));
  }
  
  public final void a(View paramView, Object paramObject)
  {
    switch (i)
    {
    default: 
      m.setEnabled(paramView, ((Boolean)paramObject).booleanValue());
      return;
    case 1: 
      m.a(paramView, (CharSequence)paramObject);
      return;
    }
    m.setChecked(paramView, ((Boolean)paramObject).booleanValue());
  }
  
  public final boolean a(Object paramObject1, Object paramObject2)
  {
    int j;
    int k;
    switch (i)
    {
    default: 
      paramObject1 = (Boolean)paramObject1;
      paramObject2 = (Boolean)paramObject2;
      m = 0;
      if ((paramObject1 != null) && (paramObject1.booleanValue())) {
        j = 1;
      } else {
        j = 0;
      }
      if ((paramObject2 != null) && (paramObject2.booleanValue())) {
        k = 1;
      } else {
        k = 0;
      }
      if (j == k) {
        m = 1;
      }
      return m ^ 0x1;
    case 1: 
      return TextUtils.equals((CharSequence)paramObject1, (CharSequence)paramObject2) ^ true;
    }
    paramObject1 = (Boolean)paramObject1;
    paramObject2 = (Boolean)paramObject2;
    int m = 0;
    if ((paramObject1 != null) && (paramObject1.booleanValue())) {
      j = 1;
    } else {
      j = 0;
    }
    if ((paramObject2 != null) && (paramObject2.booleanValue())) {
      k = 1;
    } else {
      k = 0;
    }
    if (j == k) {
      m = 1;
    }
    return m ^ 0x1;
  }
}
