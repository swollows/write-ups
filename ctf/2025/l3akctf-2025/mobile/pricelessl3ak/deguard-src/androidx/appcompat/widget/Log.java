package androidx.appcompat.widget;

import android.widget.TextView;

public abstract class Log
{
  public static int d(TextView paramTextView)
  {
    return paramTextView.getAutoSizeStepGranularity();
  }
  
  public static void setText(TextView paramTextView, int[] paramArrayOfInt, int paramInt)
  {
    paramTextView.setAutoSizeTextTypeUniformWithPresetSizes(paramArrayOfInt, paramInt);
  }
  
  public static boolean setText(TextView paramTextView, String paramString)
  {
    return paramTextView.setFontVariationSettings(paramString);
  }
  
  public static void setTime(TextView paramTextView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    paramTextView.setAutoSizeTextTypeUniformWithConfiguration(paramInt1, paramInt2, paramInt3, paramInt4);
  }
}
