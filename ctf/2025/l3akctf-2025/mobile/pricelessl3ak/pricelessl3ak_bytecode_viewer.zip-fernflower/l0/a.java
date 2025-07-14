package l0;

import i0.d;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public final class a extends k0.a {
   public final Random a() {
      ThreadLocalRandom var1 = ThreadLocalRandom.current();
      d.d(var1, "current(...)");
      return var1;
   }
}
