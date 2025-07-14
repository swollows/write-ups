package data;

import android.graphics.Color;
import util.ColorUtils;

public final class d
{
  public final float h;
  public final float i;
  public final float j;
  public final float q;
  public final float r;
  public final float w;
  
  public d(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6)
  {
    h = paramFloat1;
    i = paramFloat2;
    r = paramFloat3;
    w = paramFloat4;
    q = paramFloat5;
    j = paramFloat6;
  }
  
  public static d a(float paramFloat1, float paramFloat2, float paramFloat3)
  {
    f localF = f.h;
    float f1 = c;
    double d = paramFloat1 / 100.0D;
    Math.sqrt(d);
    float f2 = m;
    f1 = b;
    Math.sqrt(paramFloat2 / (float)Math.sqrt(d) * c / (f2 + 4.0F));
    f2 = 3.1415927F * paramFloat3 / 180.0F;
    float f3 = 1.7F * paramFloat1 / (0.007F * paramFloat1 + 1.0F);
    f1 = (float)Math.log(f1 * paramFloat2 * 0.0228D + 1.0D) * 43.85965F;
    d = f2;
    return new d(paramFloat3, paramFloat2, paramFloat1, f3, f1 * (float)Math.cos(d), f1 * (float)Math.sin(d));
  }
  
  public static d draw(int paramInt)
  {
    f localF = f.h;
    float f3 = Label.setColor(Color.red(paramInt));
    float f4 = Label.setColor(Color.green(paramInt));
    float f5 = Label.setColor(Color.blue(paramInt));
    Object localObject1 = Label.h;
    Object localObject2 = localObject1[0];
    float f1 = localObject2[0];
    float f2 = localObject2[1];
    f1 = localObject2[2] * f5 + (f2 * f4 + f1 * f3);
    localObject2 = localObject1[1];
    f2 = localObject2[0];
    float f6 = localObject2[1];
    f2 = localObject2[2] * f5 + (f6 * f4 + f2 * f3);
    localObject1 = localObject1[2];
    f6 = localObject1[0];
    float f7 = localObject1[1];
    f5 = f5 * localObject1[2] + (f4 * f7 + f3 * f6);
    localObject1 = Label.g;
    localObject2 = localObject1[0];
    f3 = localObject2[0];
    float f11 = localObject2[1];
    float f12 = localObject2[2];
    localObject2 = localObject1[1];
    f4 = localObject2[0];
    float f9 = localObject2[1];
    float f10 = localObject2[2];
    localObject1 = localObject1[2];
    f6 = localObject1[0];
    f7 = localObject1[1];
    float f8 = localObject1[2];
    localObject1 = a;
    f3 = localObject1[0] * (f12 * f5 + (f11 * f2 + f3 * f1));
    f4 = localObject1[1] * (f10 * f5 + (f9 * f2 + f4 * f1));
    f2 = localObject1[2] * (f5 * f8 + (f2 * f7 + f1 * f6));
    f5 = Math.abs(f3);
    f1 = f;
    f7 = (float)Math.pow(f5 * f1 / 100.0D, 0.42D);
    f5 = (float)Math.pow(Math.abs(f4) * f1 / 100.0D, 0.42D);
    f6 = (float)Math.pow(Math.abs(f2) * f1 / 100.0D, 0.42D);
    f1 = Math.signum(f3) * 400.0F * f7 / (f7 + 27.13F);
    f5 = Math.signum(f4) * 400.0F * f5 / (f5 + 27.13F);
    f2 = Math.signum(f2) * 400.0F * f6 / (f6 + 27.13F);
    double d1 = f1;
    double d2 = f5;
    double d3 = f2;
    f3 = (float)(d2 * -12.0D + d1 * 11.0D + d3) / 11.0F;
    f4 = (float)(f1 + f5 - d3 * 2.0D) / 9.0F;
    f6 = f5 * 20.0F;
    f5 = (21.0F * f2 + (f1 * 20.0F + f6)) / 20.0F;
    f8 = (f1 * 40.0F + f6 + f2) / 20.0F;
    f2 = (float)Math.atan2(f4, f3) * 180.0F / 3.1415927F;
    if (f2 < 0.0F) {
      f1 = f2 + 360.0F;
    }
    for (;;)
    {
      break;
      f1 = f2;
      if (f2 >= 360.0F) {
        f1 = f2 - 360.0F;
      }
    }
    f6 = 3.1415927F * f1 / 180.0F;
    f2 = n;
    f7 = m;
    d1 = f8 * f2 / f7;
    f9 = c;
    f8 = (float)Math.pow(d1, k * f9) * 100.0F;
    Math.sqrt(f8 / 100.0F);
    f2 = f1;
    if (f1 < 20.14D) {
      f2 = 360.0F + f1;
    }
    f2 = (float)(Math.cos(f2 * 3.141592653589793D / 180.0D + 2.0D) + 3.8D) * 0.25F * 3846.1538F * l * j * (float)Math.sqrt(f4 * f4 + f3 * f3) / (f5 + 0.305F);
    f4 = (float)Math.pow(1.64D - Math.pow(0.29D, g), 0.73D) * (float)Math.pow(f2, 0.9D);
    f2 = f4 * (float)Math.sqrt(f8 / 100.0D);
    f3 = b;
    Math.sqrt(f4 * f9 / (f7 + 4.0F));
    f4 = 1.7F * f8 / (0.007F * f8 + 1.0F);
    f3 = (float)Math.log(f3 * f2 * 0.0228F + 1.0F) * 43.85965F;
    d1 = f6;
    return new d(f1, f2, f8, f4, f3 * (float)Math.cos(d1), f3 * (float)Math.sin(d1));
  }
  
  public final int a(f paramF)
  {
    float f1 = i;
    double d = f1;
    float f3 = r;
    if (d != 0.0D)
    {
      d = f3;
      if (d != 0.0D)
      {
        f1 /= (float)Math.sqrt(d / 100.0D);
        break label55;
      }
    }
    f1 = 0.0F;
    label55:
    f1 = (float)Math.pow(f1 / Math.pow(1.64D - Math.pow(0.29D, g), 0.73D), 1.1111111111111112D);
    d = h * 3.1415927F / 180.0F;
    float f2 = (float)(Math.cos(2.0D + d) + 3.8D);
    f3 = (float)Math.pow(f3 / 100.0D, 1.0D / c / k);
    float f6 = m;
    float f4 = l;
    float f5 = j;
    f3 = f6 * f3 / n;
    f6 = (float)Math.sin(d);
    float f7 = (float)Math.cos(d);
    f2 = (0.305F + f3) * 23.0F * f1 / (f1 * 108.0F * f6 + (11.0F * f1 * f7 + f2 * 0.25F * 3846.1538F * f4 * f5 * 23.0F));
    f1 = f7 * f2;
    f4 = f2 * f6;
    f5 = f3 * 460.0F;
    f3 = (288.0F * f4 + (451.0F * f1 + f5)) / 1403.0F;
    f2 = (f5 - 891.0F * f1 - 261.0F * f4) / 1403.0F;
    f4 = (f5 - f1 * 220.0F - f4 * 6300.0F) / 1403.0F;
    f5 = (float)Math.max(0.0D, Math.abs(f3) * 27.13D / (400.0D - Math.abs(f3)));
    f1 = Math.signum(f3);
    f3 = 100.0F / f;
    f5 = (float)Math.pow(f5, 2.380952380952381D);
    f6 = (float)Math.max(0.0D, Math.abs(f2) * 27.13D / (400.0D - Math.abs(f2)));
    f2 = Math.signum(f2);
    f6 = (float)Math.pow(f6, 2.380952380952381D);
    f7 = (float)Math.max(0.0D, Math.abs(f4) * 27.13D / (400.0D - Math.abs(f4)));
    f4 = Math.signum(f4);
    f7 = (float)Math.pow(f7, 2.380952380952381D);
    paramF = a;
    f1 = f1 * f3 * f5 / paramF[0];
    f2 = f2 * f3 * f6 / paramF[1];
    f3 = f4 * f3 * f7 / paramF[2];
    paramF = Label.k;
    Object localObject = paramF[0];
    f4 = localObject[0];
    f5 = localObject[1];
    f6 = localObject[2];
    localObject = paramF[1];
    f7 = localObject[0];
    float f8 = localObject[1];
    float f9 = localObject[2];
    paramF = paramF[2];
    float f10 = paramF[0];
    float f11 = paramF[1];
    float f12 = paramF[2];
    return ColorUtils.XYZToColor(f6 * f3 + (f5 * f2 + f4 * f1), f9 * f3 + (f8 * f2 + f7 * f1), f3 * f12 + (f2 * f11 + f1 * f10));
  }
}
