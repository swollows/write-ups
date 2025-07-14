package activities;

import java.util.concurrent.atomic.AtomicInteger;

public final class Rational
  extends AtomicInteger
{
  public final byte byteValue()
  {
    return (byte)super.intValue();
  }
  
  public final short shortValue()
  {
    return (short)super.intValue();
  }
}
