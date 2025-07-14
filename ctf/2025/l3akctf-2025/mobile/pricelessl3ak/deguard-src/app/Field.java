package app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.AccessibilityDelegate;

public abstract class Field
{
  public static View.AccessibilityDelegate getMinimumWidth(View paramView)
  {
    return paramView.getAccessibilityDelegate();
  }
  
  public static void init(View paramView, Context paramContext, int[] paramArrayOfInt, AttributeSet paramAttributeSet, TypedArray paramTypedArray, int paramInt1, int paramInt2)
  {
    paramView.saveAttributeDataForStyleable(paramContext, paramArrayOfInt, paramAttributeSet, paramTypedArray, paramInt1, paramInt2);
  }
}
