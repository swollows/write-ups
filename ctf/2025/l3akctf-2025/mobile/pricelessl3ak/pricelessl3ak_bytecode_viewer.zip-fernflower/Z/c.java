package z;

import android.os.LocaleList;

public final class c {
   public final LocaleList a;

   public c(LocaleList var1) {
      this.a = var1;
   }

   public final boolean equals(Object var1) {
      LocaleList var2 = ((c)var1).a;
      return this.a.equals(var2);
   }

   public final int hashCode() {
      return this.a.hashCode();
   }

   public final String toString() {
      return this.a.toString();
   }
}
