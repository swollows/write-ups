package H;

import java.nio.ByteBuffer;

public final class r {
   public int a = 1;
   public final v b;
   public v c;
   public v d;
   public int e;
   public int f;

   public r(v var1) {
      this.b = var1;
      this.c = var1;
   }

   public final void a() {
      this.a = 1;
      this.c = this.b;
      this.f = 0;
   }

   public final boolean b() {
      I.a var2 = this.c.b.c();
      int var1 = var2.a(6);
      if (var1 != 0 && ((ByteBuffer)var2.d).get(var1 + var2.a) != 0) {
         return true;
      } else {
         return this.e == 65039;
      }
   }
}
