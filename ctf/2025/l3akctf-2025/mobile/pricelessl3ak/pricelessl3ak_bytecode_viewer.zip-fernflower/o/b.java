package o;

import java.util.concurrent.atomic.AtomicInteger;

public final class b extends AtomicInteger {
   public final byte byteValue() {
      return (byte)super.intValue();
   }

   public final short shortValue() {
      return (short)super.intValue();
   }
}
