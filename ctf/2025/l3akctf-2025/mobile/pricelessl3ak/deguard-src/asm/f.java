package asm;

import android.graphics.Paint;
import android.text.TextPaint;

public final class f
{
  public static final ThreadLocal t = new ThreadLocal();
  public final TextPaint b;
  
  public f()
  {
    TextPaint localTextPaint = new TextPaint();
    b = localTextPaint;
    localTextPaint.setTextSize(10.0F);
  }
}
