package A;

import C.a;
import java.util.ArrayList;

public final class i implements a {
   public final int a;
   public final Object b;

   // $FF: synthetic method
   public i(int var1, Object var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void a(Object var1) {
      j var3;
      switch (this.a) {
         case 0:
            var3 = (j)var1;
            j var26 = var3;
            if (var3 == null) {
               var26 = new j(-3);
            }

            ((c)this.b).i(var26);
            return;
         default:
            var3 = (j)var1;
            var1 = k.c;
            synchronized(var1){}

            Throwable var10000;
            boolean var10001;
            label259: {
               m.k var4;
               ArrayList var5;
               try {
                  var4 = k.d;
                  var5 = (ArrayList)var4.get((String)this.b);
               } catch (Throwable var25) {
                  var10000 = var25;
                  var10001 = false;
                  break label259;
               }

               if (var5 == null) {
                  label252:
                  try {
                     return;
                  } catch (Throwable var23) {
                     var10000 = var23;
                     var10001 = false;
                     break label252;
                  }
               } else {
                  label277: {
                     try {
                        var4.remove((String)this.b);
                     } catch (Throwable var24) {
                        var10000 = var24;
                        var10001 = false;
                        break label277;
                     }

                     for(int var2 = 0; var2 < var5.size(); ++var2) {
                        ((a)var5.get(var2)).a(var3);
                     }

                     return;
                  }
               }
            }

            while(true) {
               Throwable var27 = var10000;

               try {
                  throw var27;
               } catch (Throwable var22) {
                  var10000 = var22;
                  var10001 = false;
                  continue;
               }
            }
      }
   }
}
