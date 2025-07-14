package androidx.fragment.app;

import android.util.Log;
import androidx.lifecycle.N;
import java.util.HashMap;
import java.util.Iterator;

public final class w extends N {
   public static final v f = new Object();
   public final HashMap b = new HashMap();
   public final HashMap c = new HashMap();
   public final HashMap d = new HashMap();
   public boolean e = false;

   public w(boolean var1) {
   }

   public final void b() {
      if (Log.isLoggable("FragmentManager", 3)) {
         StringBuilder var1 = new StringBuilder("onCleared called for ");
         var1.append(this);
         Log.d("FragmentManager", var1.toString());
      }

      this.e = true;
   }

   public final boolean equals(Object var1) {
      boolean var2 = true;
      if (this == var1) {
         return true;
      } else if (var1 != null && w.class == var1.getClass()) {
         w var3 = (w)var1;
         if (!this.b.equals(var3.b) || !this.c.equals(var3.c) || !this.d.equals(var3.d)) {
            var2 = false;
         }

         return var2;
      } else {
         return false;
      }
   }

   public final int hashCode() {
      int var2 = this.b.hashCode();
      int var1 = this.c.hashCode();
      return this.d.hashCode() + (var1 + var2 * 31) * 31;
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder("FragmentManagerViewModel{");
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      var1.append("} Fragments (");
      Iterator var2 = this.b.values().iterator();

      while(var2.hasNext()) {
         var1.append(var2.next());
         if (var2.hasNext()) {
            var1.append(", ");
         }
      }

      var1.append(") Child Non Config (");
      var2 = this.c.keySet().iterator();

      while(var2.hasNext()) {
         var1.append((String)var2.next());
         if (var2.hasNext()) {
            var1.append(", ");
         }
      }

      var1.append(") ViewModelStores (");
      var2 = this.d.keySet().iterator();

      while(var2.hasNext()) {
         var1.append((String)var2.next());
         if (var2.hasNext()) {
            var1.append(", ");
         }
      }

      var1.append(')');
      return var1.toString();
   }
}
