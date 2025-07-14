package app;

import android.graphics.drawable.Icon;
import android.icu.text.DecimalFormatSymbols;
import android.text.PrecomputedText.Params;
import android.view.ViewConfiguration;
import android.widget.TextView;
import androidx.appcompat.widget.BubbleTextView;

public abstract class Preference
{
  public static int add(Object paramObject)
  {
    return ((Icon)paramObject).getResId();
  }
  
  public static int getScaledPagingTouchSlop(ViewConfiguration paramViewConfiguration)
  {
    return paramViewConfiguration.getScaledHoverSlop();
  }
  
  public static PrecomputedText.Params getSharedPreferences(BubbleTextView paramBubbleTextView)
  {
    return paramBubbleTextView.getTextMetricsParams();
  }
  
  public static String[] init(DecimalFormatSymbols paramDecimalFormatSymbols)
  {
    return paramDecimalFormatSymbols.getDigitStrings();
  }
  
  public static boolean setKey(ViewConfiguration paramViewConfiguration)
  {
    return paramViewConfiguration.shouldShowMenuShortcutsWhenKeyboardPresent();
  }
  
  public static void showText(TextView paramTextView, int paramInt)
  {
    paramTextView.setFirstBaselineToTopHeight(paramInt);
  }
}
