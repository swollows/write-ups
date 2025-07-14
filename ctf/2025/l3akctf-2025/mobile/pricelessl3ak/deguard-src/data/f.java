package data;

public final class f
{
  public static final f h;
  public final float[] a;
  public final float b;
  public final float c;
  public final float f;
  public final float g;
  public final float j;
  public final float k;
  public final float l;
  public final float m;
  public final float n;
  
  static
  {
    float[] arrayOfFloat = Label.a;
    float f6 = (float)(Label.evaluate() * 63.66197723675813D / 100.0D);
    Object localObject1 = Label.g;
    float f1 = arrayOfFloat[0];
    Object localObject2 = localObject1[0];
    float f4 = localObject2[0];
    float f2 = arrayOfFloat[1];
    float f5 = localObject2[1];
    float f3 = arrayOfFloat[2];
    f4 = localObject2[2] * f3 + (f5 * f2 + f4 * f1);
    localObject2 = localObject1[1];
    f5 = localObject2[0];
    float f7 = localObject2[1];
    f5 = localObject2[2] * f3 + (f7 * f2 + f5 * f1);
    localObject1 = localObject1[2];
    f7 = localObject1[0];
    float f8 = localObject1[1];
    f7 = f3 * localObject1[2] + (f2 * f8 + f1 * f7);
    if (1.0F >= 0.9D) {}
    for (f2 = 0.69F;; f2 = 0.655F) {
      break;
    }
    f3 = (1.0F - (float)Math.exp((-f6 - 42.0F) / 92.0F) * 0.2777778F) * 1.0F;
    f1 = f3;
    double d = f3;
    if (d > 1.0D) {
      f1 = 1.0F;
    } else if (d < 0.0D) {
      f1 = 0.0F;
    }
    f3 = 100.0F / f4;
    f8 = 100.0F / f5;
    float f9 = 100.0F / f7;
    localObject1 = new float[3];
    localObject1[0] = (f3 * f1 + 1.0F - f1);
    localObject1[1] = (f8 * f1 + 1.0F - f1);
    localObject1[2] = (f9 * f1 + 1.0F - f1);
    f1 = 1.0F / (5.0F * f6 + 1.0F);
    f1 = f1 * f1 * f1 * f1;
    f3 = 1.0F - f1;
    f1 = 0.1F * f3 * f3 * (float)Math.cbrt(f6 * 5.0D) + f1 * f6;
    f3 = Label.evaluate() / arrayOfFloat[1];
    d = f3;
    f6 = (float)Math.sqrt(d);
    f8 = 0.725F / (float)Math.pow(d, 0.2D);
    f4 = (float)Math.pow(localObject1[0] * f1 * f4 / 100.0D, 0.42D);
    f5 = (float)Math.pow(localObject1[1] * f1 * f5 / 100.0D, 0.42D);
    f7 = (float)Math.pow(localObject1[2] * f1 * f7 / 100.0D, 0.42D);
    arrayOfFloat = new float[3];
    arrayOfFloat[0] = f4;
    arrayOfFloat[1] = f5;
    arrayOfFloat[2] = f7;
    f4 = arrayOfFloat[0];
    f4 = f4 * 400.0F / (f4 + 27.13F);
    f5 = arrayOfFloat[1];
    f5 = f5 * 400.0F / (f5 + 27.13F);
    f7 = arrayOfFloat[2];
    f7 = 400.0F * f7 / (f7 + 27.13F);
    arrayOfFloat = new float[3];
    arrayOfFloat[0] = f4;
    arrayOfFloat[1] = f5;
    arrayOfFloat[2] = f7;
    f4 = arrayOfFloat[0];
    f5 = arrayOfFloat[1];
    h = new f(f3, (arrayOfFloat[2] * 0.05F + (f4 * 2.0F + f5)) * f8, f8, f8, f2, 1.0F, (float[])localObject1, f1, (float)Math.pow(f1, 0.25D), f6 + 1.48F);
  }
  
  public f(float paramFloat1, float paramFloat2, float paramFloat3, float paramFloat4, float paramFloat5, float paramFloat6, float[] paramArrayOfFloat, float paramFloat7, float paramFloat8, float paramFloat9)
  {
    g = paramFloat1;
    m = paramFloat2;
    n = paramFloat3;
    j = paramFloat4;
    c = paramFloat5;
    l = paramFloat6;
    a = paramArrayOfFloat;
    f = paramFloat7;
    b = paramFloat8;
    k = paramFloat9;
  }
}
