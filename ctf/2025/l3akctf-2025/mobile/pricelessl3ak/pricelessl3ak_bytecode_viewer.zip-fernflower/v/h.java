package v;

import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;

public final class h {
   public final ColorStateList a;
   public final Configuration b;
   public final int c;

   public h(ColorStateList var1, Configuration var2, Resources.Theme var3) {
      this.a = var1;
      this.b = var2;
      int var4;
      if (var3 == null) {
         var4 = 0;
      } else {
         var4 = var3.hashCode();
      }

      this.c = var4;
   }
}
