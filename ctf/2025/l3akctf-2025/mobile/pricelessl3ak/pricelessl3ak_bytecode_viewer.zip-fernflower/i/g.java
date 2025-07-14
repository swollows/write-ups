package i;

import android.view.MenuItem;
import java.lang.reflect.Method;

public final class g implements MenuItem.OnMenuItemClickListener {
   public static final Class[] c = new Class[]{MenuItem.class};
   public Object a;
   public Method b;

   public final boolean onMenuItemClick(MenuItem var1) {
      Method var5 = this.b;

      Exception var10000;
      label27: {
         boolean var10001;
         Class var2;
         Class var3;
         try {
            var2 = var5.getReturnType();
            var3 = Boolean.TYPE;
         } catch (Exception var8) {
            var10000 = var8;
            var10001 = false;
            break label27;
         }

         Object var4 = this.a;
         if (var2 == var3) {
            try {
               return (Boolean)var5.invoke(var4, var1);
            } catch (Exception var6) {
               var10000 = var6;
               var10001 = false;
            }
         } else {
            try {
               var5.invoke(var4, var1);
               return true;
            } catch (Exception var7) {
               var10000 = var7;
               var10001 = false;
            }
         }
      }

      Exception var9 = var10000;
      throw new RuntimeException(var9);
   }
}
