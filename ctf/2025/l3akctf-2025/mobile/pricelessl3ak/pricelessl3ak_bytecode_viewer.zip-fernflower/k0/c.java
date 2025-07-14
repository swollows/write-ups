package k0;

import java.util.Random;

public final class c extends a {
   public final b c = new ThreadLocal();

   public final Random a() {
      Object var1 = this.c.get();
      i0.d.d(var1, "get(...)");
      return (Random)var1;
   }
}
