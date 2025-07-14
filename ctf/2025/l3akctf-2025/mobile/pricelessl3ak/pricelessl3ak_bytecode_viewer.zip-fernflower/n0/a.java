package n0;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class a implements d {
   public final AtomicReference a;

   public a(d var1) {
      this.a = new AtomicReference(var1);
   }

   public final Iterator iterator() {
      d var1 = (d)this.a.getAndSet((Object)null);
      if (var1 != null) {
         return var1.iterator();
      } else {
         throw new IllegalStateException("This sequence can be consumed only once.");
      }
   }
}
