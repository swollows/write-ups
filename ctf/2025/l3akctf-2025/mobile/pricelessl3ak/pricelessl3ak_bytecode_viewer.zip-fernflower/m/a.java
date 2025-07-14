package m;

import java.util.AbstractSet;
import java.util.Iterator;

public final class a extends AbstractSet {
   public final f a;

   public a(f var1) {
      this.a = var1;
   }

   public final Iterator iterator() {
      return new d(this.a);
   }

   public final int size() {
      return this.a.c;
   }
}
