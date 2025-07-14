package P;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;

public final class k {
   public final int a;
   public final int b;
   public final long c;
   public final long d;

   public k(int var1, int var2, long var3, long var5) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = var5;
   }

   public static k a(File var0) {
      DataInputStream var1 = new DataInputStream(new FileInputStream(var0));

      k var8;
      try {
         var8 = new k(var1.readInt(), var1.readInt(), var1.readLong(), var1.readLong());
      } catch (Throwable var7) {
         try {
            var1.close();
         } catch (Throwable var6) {
            var7.addSuppressed(var6);
            throw var7;
         }

         throw var7;
      }

      var1.close();
      return var8;
   }

   public final void b(File var1) {
      var1.delete();
      DataOutputStream var2 = new DataOutputStream(new FileOutputStream(var1));

      try {
         var2.writeInt(this.a);
         var2.writeInt(this.b);
         var2.writeLong(this.c);
         var2.writeLong(this.d);
      } catch (Throwable var8) {
         try {
            var2.close();
         } catch (Throwable var7) {
            var8.addSuppressed(var7);
            throw var8;
         }

         throw var8;
      }

      var2.close();
   }

   public final boolean equals(Object var1) {
      boolean var2 = true;
      if (this == var1) {
         return true;
      } else if (var1 != null && var1 instanceof k) {
         k var3 = (k)var1;
         if (this.b != var3.b || this.c != var3.c || this.a != var3.a || this.d != var3.d) {
            var2 = false;
         }

         return var2;
      } else {
         return false;
      }
   }

   public final int hashCode() {
      return Objects.hash(new Object[]{this.b, this.c, this.a, this.d});
   }
}
