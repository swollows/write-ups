package r;

import java.util.concurrent.CancellationException;

public final class a {
   public static final a b;
   public static final a c;
   public final CancellationException a;

   static {
      if (g.d) {
         c = null;
         b = null;
      } else {
         c = new a(false, (CancellationException)null);
         b = new a(true, (CancellationException)null);
      }

   }

   public a(boolean var1, CancellationException var2) {
      this.a = var2;
   }
}
