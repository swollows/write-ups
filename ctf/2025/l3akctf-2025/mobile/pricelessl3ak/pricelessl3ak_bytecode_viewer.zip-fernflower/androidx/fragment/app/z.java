package androidx.fragment.app;

import android.util.Log;
import java.io.Writer;

public final class z extends Writer {
   public final String a = "FragmentManager";
   public final StringBuilder b = new StringBuilder(128);

   public final void a() {
      StringBuilder var1 = this.b;
      if (var1.length() > 0) {
         Log.d(this.a, var1.toString());
         var1.delete(0, var1.length());
      }

   }

   public final void close() {
      this.a();
   }

   public final void flush() {
      this.a();
   }

   public final void write(char[] var1, int var2, int var3) {
      for(int var5 = 0; var5 < var3; ++var5) {
         char var4 = var1[var2 + var5];
         if (var4 == '\n') {
            this.a();
         } else {
            this.b.append(var4);
         }
      }

   }
}
