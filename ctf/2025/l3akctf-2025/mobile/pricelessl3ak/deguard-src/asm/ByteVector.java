package asm;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint.Style;
import android.graphics.Typeface;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.ReplacementSpan;
import drupal.Context;
import java.nio.ByteBuffer;
import model.LocalService;

public final class ByteVector
  extends ReplacementSpan
{
  public TextPaint a;
  public final Paint.FontMetricsInt data = new Paint.FontMetricsInt();
  public short n = -1;
  public float size = 1.0F;
  public final Attribute this$0;
  
  public ByteVector(Attribute paramAttribute)
  {
    Context.get(paramAttribute, "rasterizer cannot be null");
    this$0 = paramAttribute;
  }
  
  public final void draw(Canvas paramCanvas, CharSequence paramCharSequence, int paramInt1, int paramInt2, float paramFloat, int paramInt3, int paramInt4, int paramInt5, Paint paramPaint)
  {
    Object localObject1 = paramPaint;
    boolean bool = paramCharSequence instanceof Spanned;
    Object localObject2 = null;
    if (bool)
    {
      localObject3 = (CharacterStyle[])((Spanned)paramCharSequence).getSpans(paramInt1, paramInt2, CharacterStyle.class);
      if (localObject3.length != 0)
      {
        paramInt2 = localObject3.length;
        paramInt1 = 0;
        if ((paramInt2 != 1) || (localObject3[0] != this))
        {
          localObject2 = a;
          paramCharSequence = (CharSequence)localObject2;
          if (localObject2 == null)
          {
            paramCharSequence = new TextPaint();
            a = paramCharSequence;
          }
          localObject2 = paramCharSequence;
          paramCharSequence.set(paramPaint);
          for (;;)
          {
            paramCharSequence = (CharSequence)localObject2;
            if (paramInt1 >= localObject3.length) {
              break;
            }
            localObject3[paramInt1].updateDrawState((TextPaint)localObject2);
            paramInt1 += 1;
          }
        }
      }
      paramCharSequence = (CharSequence)localObject2;
      if ((paramPaint instanceof TextPaint)) {
        paramCharSequence = (TextPaint)paramPaint;
      }
    }
    else
    {
      paramCharSequence = (CharSequence)localObject2;
      if ((paramPaint instanceof TextPaint)) {
        paramCharSequence = (TextPaint)paramPaint;
      }
    }
    if ((paramCharSequence != null) && (bgColor != 0))
    {
      f1 = n;
      float f2 = paramInt3;
      float f3 = paramInt5;
      paramInt1 = paramCharSequence.getColor();
      paramPaint = paramCharSequence.getStyle();
      paramCharSequence.setColor(bgColor);
      paramCharSequence.setStyle(Paint.Style.FILL);
      paramCanvas.drawRect(paramFloat, f2, paramFloat + f1, f3, paramCharSequence);
      paramCharSequence.setStyle(paramPaint);
      paramCharSequence.setColor(paramInt1);
    }
    ClassWriter.a().getClass();
    float f1 = paramInt4;
    if (paramCharSequence != null) {
      localObject1 = paramCharSequence;
    }
    paramCharSequence = this$0;
    paramPaint = i;
    localObject2 = (Typeface)b;
    Object localObject3 = ((Paint)localObject1).getTypeface();
    ((Paint)localObject1).setTypeface((Typeface)localObject2);
    paramInt1 = type;
    paramCanvas.drawText((char[])x, paramInt1 * 2, 2, paramFloat, f1, (Paint)localObject1);
    ((Paint)localObject1).setTypeface((Typeface)localObject3);
  }
  
  public final int getSize(Paint paramPaint, CharSequence paramCharSequence, int paramInt1, int paramInt2, Paint.FontMetricsInt paramFontMetricsInt)
  {
    paramCharSequence = data;
    paramPaint.getFontMetricsInt(paramCharSequence);
    float f = Math.abs(descent - ascent);
    paramPaint = this$0;
    LocalService localLocalService = paramPaint.read();
    paramInt1 = localLocalService.read(14);
    paramInt2 = 0;
    if (paramInt1 != 0) {
      paramInt1 = ((ByteBuffer)value).getShort(paramInt1 + data);
    } else {
      paramInt1 = 0;
    }
    size = (f * 1.0F / paramInt1);
    localLocalService = paramPaint.read();
    paramInt1 = localLocalService.read(14);
    if (paramInt1 != 0) {
      ((ByteBuffer)value).getShort(paramInt1 + data);
    }
    paramPaint = paramPaint.read();
    int i = paramPaint.read(12);
    paramInt1 = paramInt2;
    if (i != 0) {
      paramInt1 = ((ByteBuffer)value).getShort(i + data);
    }
    short s = (short)(int)(paramInt1 * size);
    n = s;
    if (paramFontMetricsInt != null)
    {
      ascent = ascent;
      descent = descent;
      top = top;
      bottom = bottom;
    }
    return s;
  }
}
