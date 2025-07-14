package androidx.lifecycle;

import java.util.HashMap;

public final class e implements s {
   public final int a;
   public final Object b;

   // $FF: synthetic method
   public e(int var1, Object var2) {
      this.a = var1;
      this.b = var2;
   }

   public final void a(u var1, n var2) {
      switch (this.a) {
         case 0:
            new HashMap();
            i[] var3 = (i[])this.b;
            i var4;
            if (var3.length <= 0) {
               if (var3.length <= 0) {
                  return;
               }

               var4 = var3[0];
               throw null;
            }

            var4 = var3[0];
            throw null;
         default:
            if (var2 == n.ON_CREATE) {
               var1.getLifecycle().b(this);
               ((J)this.b).b();
            } else {
               StringBuilder var5 = new StringBuilder("Next event must be ON_CREATE, it was ");
               var5.append(var2);
               throw new IllegalStateException(var5.toString().toString());
            }
      }
   }
}
