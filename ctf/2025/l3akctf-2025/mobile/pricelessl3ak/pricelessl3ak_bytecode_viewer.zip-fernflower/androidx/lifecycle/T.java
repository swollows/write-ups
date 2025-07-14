package androidx.lifecycle;

import java.util.Iterator;
import java.util.LinkedHashMap;

public final class T {
   public final LinkedHashMap a = new LinkedHashMap();

   public final void a() {
      LinkedHashMap var1 = this.a;
      Iterator var2 = var1.values().iterator();

      while(var2.hasNext()) {
         ((N)var2.next()).a();
      }

      var1.clear();
   }
}
