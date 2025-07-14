package H;

import android.text.TextUtils;

public final class q implements p {
   public final int a;
   public final String b;

   // $FF: synthetic method
   public q(String var1, int var2) {
      this.a = var2;
      this.b = var1;
   }

   public Object b() {
      return this;
   }

   public boolean f(CharSequence var1, int var2, int var3, z var4) {
      if (TextUtils.equals(var1.subSequence(var2, var3), this.b)) {
         var4.c = var4.c & 3 | 4;
         return false;
      } else {
         return true;
      }
   }

   public String toString() {
      switch (this.a) {
         case 1:
            StringBuilder var1 = new StringBuilder("<");
            var1.append(this.b);
            var1.append('>');
            return var1.toString();
         default:
            return super.toString();
      }
   }
}
