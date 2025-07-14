package androidx.appcompat.widget;

public final class k1 extends C.b {
   public final int o;
   public boolean p;
   public int q;
   public final Object r;

   public k1(l1 var1, int var2) {
      this.o = 0;
      super();
      this.r = var1;
      this.q = var2;
      this.p = false;
   }

   public k1(i.j var1) {
      this.o = 1;
      super();
      this.r = var1;
      this.p = false;
      this.q = 0;
   }

   public final void a() {
      switch (this.o) {
         case 0:
            if (!this.p) {
               ((l1)this.r).a.setVisibility(this.q);
            }

            return;
         default:
            int var1 = this.q + 1;
            this.q = var1;
            i.j var2 = (i.j)this.r;
            if (var1 == var2.a.size()) {
               C.b var3 = var2.d;
               if (var3 != null) {
                  var3.a();
               }

               this.q = 0;
               this.p = false;
               var2.e = false;
            }

      }
   }

   public void b() {
      switch (this.o) {
         case 0:
            this.p = true;
            return;
         default:
      }
   }

   public final void c() {
      switch (this.o) {
         case 0:
            ((l1)this.r).a.setVisibility(0);
            return;
         default:
            if (!this.p) {
               this.p = true;
               C.b var1 = ((i.j)this.r).d;
               if (var1 != null) {
                  var1.c();
               }
            }

      }
   }
}
