package k;

import java.util.concurrent.Executors;

public final class a extends C.b {
   public static volatile a p;
   public final Object o;

   public a(int var1) {
      switch (var1) {
         case 1:
            super();
            this.o = new Object();
            Executors.newFixedThreadPool(4, new b());
            return;
         default:
            super();
            this.o = new a(1);
      }
   }
}
