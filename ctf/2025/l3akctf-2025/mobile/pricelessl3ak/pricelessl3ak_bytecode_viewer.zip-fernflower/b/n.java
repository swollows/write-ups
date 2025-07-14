package b;

import java.util.ListIterator;

public final class n extends i0.e implements h0.l {
   public final int b;
   public final t c;

   // $FF: synthetic method
   public n(t var1, int var2) {
      super(1);
      this.b = var2;
      this.c = var1;
   }

   public final Object a(Object var1) {
      Z.f var4;
      androidx.fragment.app.o var6;
      switch (this.b) {
         case 0:
            i0.d.e((a)var1, "backEvent");
            t var2 = this.c;
            var4 = var2.b;
            ListIterator var3 = var4.listIterator(var4.size());

            do {
               if (!var3.hasPrevious()) {
                  var1 = null;
                  break;
               }

               var1 = var3.previous();
            } while(!((androidx.fragment.app.o)var1).a);

            var6 = (androidx.fragment.app.o)var1;
            if (var2.c != null) {
               var2.a();
            }

            var2.c = var6;
            return Y.f.c;
         default:
            i0.d.e((a)var1, "backEvent");
            t var7 = this.c;
            if (var7.c == null) {
               var4 = var7.b;
               ListIterator var5 = var4.listIterator(var4.size());

               do {
                  if (!var5.hasPrevious()) {
                     var1 = null;
                     break;
                  }

                  var1 = var5.previous();
               } while(!((androidx.fragment.app.o)var1).a);

               var6 = (androidx.fragment.app.o)var1;
            }

            return Y.f.c;
      }
   }
}
