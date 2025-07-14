package Client;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.os.LocaleList;
import android.text.PrecomputedText.Params;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.Objects;

public final class Tuple3
{
  public final TextPaint a;
  public final TextDirectionHeuristic b;
  public final int c;
  public final int r;
  
  public Tuple3(PrecomputedText.Params paramParams)
  {
    a = Util.getTextPaint(paramParams);
    b = Util.toByteArray(paramParams);
    c = Util.readString(paramParams);
    r = Util.getDimensionPixelSize(paramParams);
  }
  
  public Tuple3(TextPaint paramTextPaint, TextDirectionHeuristic paramTextDirectionHeuristic, int paramInt1, int paramInt2)
  {
    if (Build.VERSION.SDK_INT >= 29) {
      Util.setText(Util.distance(Util.getLocation(Util.parseInt(Util.readFile(paramTextPaint), paramInt1), paramInt2), paramTextDirectionHeuristic));
    }
    a = paramTextPaint;
    b = paramTextDirectionHeuristic;
    c = paramInt1;
    r = paramInt2;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof Tuple3)) {
      return false;
    }
    paramObject = (Tuple3)paramObject;
    int i = c;
    if (c != i) {
      return false;
    }
    if (r != r) {
      return false;
    }
    TextPaint localTextPaint1 = a;
    float f = localTextPaint1.getTextSize();
    TextPaint localTextPaint2 = a;
    if (f != localTextPaint2.getTextSize()) {
      return false;
    }
    if (localTextPaint1.getTextScaleX() != localTextPaint2.getTextScaleX()) {
      return false;
    }
    if (localTextPaint1.getTextSkewX() != localTextPaint2.getTextSkewX()) {
      return false;
    }
    if (localTextPaint1.getLetterSpacing() != localTextPaint2.getLetterSpacing()) {
      return false;
    }
    if (!TextUtils.equals(localTextPaint1.getFontFeatureSettings(), localTextPaint2.getFontFeatureSettings())) {
      return false;
    }
    if (localTextPaint1.getFlags() != localTextPaint2.getFlags()) {
      return false;
    }
    if (!localTextPaint1.getTextLocales().equals(localTextPaint2.getTextLocales())) {
      return false;
    }
    if (localTextPaint1.getTypeface() == null)
    {
      if (localTextPaint2.getTypeface() != null) {
        return false;
      }
    }
    else if (!localTextPaint1.getTypeface().equals(localTextPaint2.getTypeface())) {
      return false;
    }
    return b == b;
  }
  
  public final int hashCode()
  {
    TextPaint localTextPaint = a;
    float f1 = localTextPaint.getTextSize();
    float f2 = localTextPaint.getTextScaleX();
    float f3 = localTextPaint.getTextSkewX();
    float f4 = localTextPaint.getLetterSpacing();
    int i = localTextPaint.getFlags();
    LocaleList localLocaleList = localTextPaint.getTextLocales();
    Typeface localTypeface = localTextPaint.getTypeface();
    boolean bool = localTextPaint.isElegantTextHeight();
    int j = c;
    int k = r;
    return Objects.hash(new Object[] { Float.valueOf(f1), Float.valueOf(f2), Float.valueOf(f3), Float.valueOf(f4), Integer.valueOf(i), localLocaleList, localTypeface, Boolean.valueOf(bool), b, Integer.valueOf(j), Integer.valueOf(k) });
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder1 = new StringBuilder("{");
    StringBuilder localStringBuilder2 = new StringBuilder("textSize=");
    Object localObject = a;
    localStringBuilder2.append(((Paint)localObject).getTextSize());
    localStringBuilder1.append(localStringBuilder2.toString());
    localStringBuilder2 = new StringBuilder(", textScaleX=");
    localStringBuilder2.append(((Paint)localObject).getTextScaleX());
    localStringBuilder1.append(localStringBuilder2.toString());
    localStringBuilder2 = new StringBuilder(", textSkewX=");
    localStringBuilder2.append(((Paint)localObject).getTextSkewX());
    localStringBuilder1.append(localStringBuilder2.toString());
    int i = Build.VERSION.SDK_INT;
    localStringBuilder2 = new StringBuilder(", letterSpacing=");
    localStringBuilder2.append(((Paint)localObject).getLetterSpacing());
    localStringBuilder1.append(localStringBuilder2.toString());
    localStringBuilder2 = new StringBuilder(", elegantTextHeight=");
    localStringBuilder2.append(((Paint)localObject).isElegantTextHeight());
    localStringBuilder1.append(localStringBuilder2.toString());
    localStringBuilder2 = new StringBuilder(", textLocale=");
    localStringBuilder2.append(((Paint)localObject).getTextLocales());
    localStringBuilder1.append(localStringBuilder2.toString());
    localStringBuilder2 = new StringBuilder(", typeface=");
    localStringBuilder2.append(((Paint)localObject).getTypeface());
    localStringBuilder1.append(localStringBuilder2.toString());
    if (i >= 26)
    {
      localStringBuilder2 = new StringBuilder(", variationSettings=");
      localStringBuilder2.append(StringUtil.join((TextPaint)localObject));
      localStringBuilder1.append(localStringBuilder2.toString());
    }
    localObject = new StringBuilder(", textDir=");
    ((StringBuilder)localObject).append(b);
    localStringBuilder1.append(((StringBuilder)localObject).toString());
    localObject = new StringBuilder(", breakStrategy=");
    ((StringBuilder)localObject).append(c);
    localStringBuilder1.append(((StringBuilder)localObject).toString());
    localObject = new StringBuilder(", hyphenationFrequency=");
    ((StringBuilder)localObject).append(r);
    localStringBuilder1.append(((StringBuilder)localObject).toString());
    localStringBuilder1.append("}");
    return localStringBuilder1.toString();
  }
}
