package androidx.appcompat.app;

public final class TwilightCalculator
{
  public static TwilightCalculator id;
  public int state;
  public long sunrise;
  public long sunset;
  
  public final void calculateTwilight(long paramLong, double paramDouble1, double paramDouble2)
  {
    float f1 = (float)(paramLong - 946728000000L) / 8.64E7F;
    float f2 = 0.01720197F * f1 + 6.24006F;
    double d1 = f2;
    double d2 = Math.sin(d1);
    double d3 = Math.sin(2.0F * f2);
    d2 = Math.sin(f2 * 3.0F) * 5.236000106378924E-6D + (d3 * 3.4906598739326E-4D + (d2 * 0.03341960161924362D + d1)) + 1.796593063D + 3.141592653589793D;
    paramDouble2 = -paramDouble2 / 360.0D;
    d3 = (float)Math.round(f1 - 9.0E-4F - paramDouble2) + 9.0E-4F;
    d1 = Math.sin(d1);
    paramDouble2 = Math.sin(2.0D * d2) * -0.0069D + (d1 * 0.0053D + (d3 + paramDouble2));
    d1 = Math.sin(d2);
    d1 = Math.asin(Math.sin(0.4092797040939331D) * d1);
    double d4 = 0.01745329238474369D * paramDouble1;
    paramDouble1 = Math.sin(-0.10471975803375244D);
    d2 = Math.sin(d4);
    d3 = Math.sin(d1);
    d4 = Math.cos(d4);
    paramDouble1 = (paramDouble1 - d3 * d2) / (Math.cos(d1) * d4);
    if (paramDouble1 >= 1.0D)
    {
      state = 1;
      sunset = -1L;
      sunrise = -1L;
      return;
    }
    if (paramDouble1 <= -1.0D)
    {
      state = 0;
      sunset = -1L;
      sunrise = -1L;
      return;
    }
    paramDouble1 = (float)(Math.acos(paramDouble1) / 6.283185307179586D);
    sunset = (Math.round((paramDouble2 + paramDouble1) * 8.64E7D) + 946728000000L);
    long l = Math.round((paramDouble2 - paramDouble1) * 8.64E7D) + 946728000000L;
    sunrise = l;
    if ((l < paramLong) && (sunset > paramLong))
    {
      state = 0;
      return;
    }
    state = 1;
  }
}
