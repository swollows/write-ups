package A;

import android.util.Base64;
import java.util.List;

public final class g {
   public final String a;
   public final String b;
   public final String c;
   public final List d;
   public final String e;

   public g(String var1, String var2, String var3, List var4) {
      var1.getClass();
      this.a = var1;
      var2.getClass();
      this.b = var2;
      this.c = var3;
      var4.getClass();
      this.d = var4;
      StringBuilder var5 = new StringBuilder();
      var5.append(var1);
      var5.append("-");
      var5.append(var2);
      var5.append("-");
      var5.append(var3);
      this.e = var5.toString();
   }

   public final String toString() {
      StringBuilder var3 = new StringBuilder();
      StringBuilder var4 = new StringBuilder("FontRequest {mProviderAuthority: ");
      var4.append(this.a);
      var4.append(", mProviderPackage: ");
      var4.append(this.b);
      var4.append(", mQuery: ");
      var4.append(this.c);
      var4.append(", mCertificates:");
      var3.append(var4.toString());
      int var1 = 0;

      while(true) {
         List var5 = this.d;
         if (var1 >= var5.size()) {
            var3.append("}mCertificatesArray: 0");
            return var3.toString();
         }

         var3.append(" [");
         var5 = (List)var5.get(var1);

         for(int var2 = 0; var2 < var5.size(); ++var2) {
            var3.append(" \"");
            var3.append(Base64.encodeToString((byte[])var5.get(var2), 0));
            var3.append("\"");
         }

         var3.append(" ]");
         ++var1;
      }
   }
}
