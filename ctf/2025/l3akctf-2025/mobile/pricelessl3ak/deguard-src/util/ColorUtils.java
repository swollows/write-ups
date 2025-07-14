package util;

import android.graphics.Color;

public abstract class ColorUtils
{
  static
  {
    new ThreadLocal();
  }
  
  public static int XYZToColor(double paramDouble1, double paramDouble2, double paramDouble3)
  {
    double d2 = (-0.4986D * paramDouble3 + (-1.5372D * paramDouble2 + 3.2406D * paramDouble1)) / 100.0D;
    double d1 = (0.0415D * paramDouble3 + (1.8758D * paramDouble2 + -0.9689D * paramDouble1)) / 100.0D;
    paramDouble3 = (1.057D * paramDouble3 + (-0.204D * paramDouble2 + 0.0557D * paramDouble1)) / 100.0D;
    if (d2 > 0.0031308D) {
      paramDouble1 = Math.pow(d2, 0.4166666666666667D) * 1.055D - 0.055D;
    } else {
      paramDouble1 = d2 * 12.92D;
    }
    if (d1 > 0.0031308D) {
      paramDouble2 = Math.pow(d1, 0.4166666666666667D) * 1.055D - 0.055D;
    } else {
      paramDouble2 = d1 * 12.92D;
    }
    if (paramDouble3 > 0.0031308D) {
      paramDouble3 = Math.pow(paramDouble3, 0.4166666666666667D) * 1.055D - 0.055D;
    } else {
      paramDouble3 *= 12.92D;
    }
    int i = (int)Math.round(paramDouble1 * 255.0D);
    int k = 0;
    if (i < 0) {
      i = 0;
    } else {
      i = Math.min(i, 255);
    }
    int j = (int)Math.round(paramDouble2 * 255.0D);
    if (j < 0) {
      j = 0;
    } else {
      j = Math.min(j, 255);
    }
    int m = (int)Math.round(paramDouble3 * 255.0D);
    if (m >= 0) {
      k = Math.min(m, 255);
    }
    return Color.rgb(i, j, k);
  }
  
  public static int compositeColors(int paramInt1, int paramInt2)
  {
    int i = Color.alpha(paramInt2);
    int j = Color.alpha(paramInt1);
    int k = 255 - (255 - j) * (255 - i) / 255;
    return Color.argb(k, compositeComponent(Color.red(paramInt1), j, Color.red(paramInt2), i, k), compositeComponent(Color.green(paramInt1), j, Color.green(paramInt2), i, k), compositeComponent(Color.blue(paramInt1), j, Color.blue(paramInt2), i, k));
  }
  
  public static int compositeComponent(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    if (paramInt5 == 0) {
      return 0;
    }
    return ((255 - paramInt2) * (paramInt3 * paramInt4) + paramInt1 * 255 * paramInt2) / (paramInt5 * 255);
  }
}
