package asm;

import android.text.Spannable;
import android.text.Spanned;
import java.util.stream.IntStream;

public final class Segment
  implements Spannable
{
  public Spannable editable;
  public boolean value = false;
  
  public Segment(Spannable paramSpannable)
  {
    editable = paramSpannable;
  }
  
  public final char charAt(int paramInt)
  {
    return editable.charAt(paramInt);
  }
  
  public final IntStream chars()
  {
    return editable.chars();
  }
  
  public final IntStream codePoints()
  {
    return editable.codePoints();
  }
  
  public final int getSpanEnd(Object paramObject)
  {
    return editable.getSpanEnd(paramObject);
  }
  
  public final int getSpanFlags(Object paramObject)
  {
    return editable.getSpanFlags(paramObject);
  }
  
  public final int getSpanStart(Object paramObject)
  {
    return editable.getSpanStart(paramObject);
  }
  
  public final Object[] getSpans(int paramInt1, int paramInt2, Class paramClass)
  {
    return editable.getSpans(paramInt1, paramInt2, paramClass);
  }
  
  public final int length()
  {
    return editable.length();
  }
  
  public final int nextSpanTransition(int paramInt1, int paramInt2, Class paramClass)
  {
    return editable.nextSpanTransition(paramInt1, paramInt2, paramClass);
  }
  
  public final void read()
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final void removeSpan(Object paramObject)
  {
    read();
    editable.removeSpan(paramObject);
  }
  
  public final void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    read();
    editable.setSpan(paramObject, paramInt1, paramInt2, paramInt3);
  }
  
  public final CharSequence subSequence(int paramInt1, int paramInt2)
  {
    return editable.subSequence(paramInt1, paramInt2);
  }
  
  public final String toString()
  {
    return editable.toString();
  }
}
