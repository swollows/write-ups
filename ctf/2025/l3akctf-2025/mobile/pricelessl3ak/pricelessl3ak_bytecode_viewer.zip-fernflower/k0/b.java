package k0;

import java.util.Random;

public final class b extends ThreadLocal {
   public final Object initialValue() {
      return new Random();
   }
}
