package H;

import D.I;
import java.nio.ByteBuffer;

public final class z {
   public static final ThreadLocal d = new ThreadLocal();
   public final int a;
   public final w b;
   public volatile int c = 0;

   public z(w var1, int var2) {
      this.b = var1;
      this.a = var2;
   }

   public final int a(int var1) {
      I.a var3 = this.c();
      int var2 = var3.a(16);
      if (var2 != 0) {
         ByteBuffer var4 = (ByteBuffer)var3.d;
         var2 += var3.a;
         var1 = var4.getInt(var1 * 4 + var4.getInt(var2) + var2 + 4);
      } else {
         var1 = 0;
      }

      return var1;
   }

   public final int b() {
      I.a var3 = this.c();
      int var1 = var3.a(16);
      if (var1 != 0) {
         int var2 = var1 + var3.a;
         var1 = ((ByteBuffer)var3.d).getInt(var2);
         var1 = ((ByteBuffer)var3.d).getInt(var1 + var2);
      } else {
         var1 = 0;
      }

      return var1;
   }

   public final I.a c() {
      ThreadLocal var5 = d;
      I.a var4 = (I.a)var5.get();
      Object var3 = var4;
      if (var4 == null) {
         var3 = new I();
         var5.set(var3);
      }

      I.b var6 = (I.b)this.b.a;
      int var1 = var6.a(6);
      if (var1 != 0) {
         var1 += var6.a;
         int var2 = ((ByteBuffer)var6.d).getInt(var1);
         var1 = this.a * 4 + var2 + var1 + 4;
         var1 += ((ByteBuffer)var6.d).getInt(var1);
         ByteBuffer var7 = (ByteBuffer)var6.d;
         ((I)var3).d = var7;
         if (var7 != null) {
            ((I)var3).a = var1;
            var1 -= var7.getInt(var1);
            ((I)var3).b = var1;
            ((I)var3).c = ((ByteBuffer)((I)var3).d).getShort(var1);
         } else {
            ((I)var3).a = 0;
            ((I)var3).b = 0;
            ((I)var3).c = 0;
         }
      }

      return (I.a)var3;
   }

   public final String toString() {
      StringBuilder var5 = new StringBuilder();
      var5.append(super.toString());
      var5.append(", id:");
      I.a var4 = this.c();
      int var1 = var4.a(4);
      byte var2 = 0;
      if (var1 != 0) {
         var1 = ((ByteBuffer)var4.d).getInt(var1 + var4.a);
      } else {
         var1 = 0;
      }

      var5.append(Integer.toHexString(var1));
      var5.append(", codepoints:");
      int var3 = this.b();

      for(var1 = var2; var1 < var3; ++var1) {
         var5.append(Integer.toHexString(this.a(var1)));
         var5.append(" ");
      }

      return var5.toString();
   }
}
