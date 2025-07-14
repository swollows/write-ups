package androidx.appcompat.widget;

import android.widget.AbsListView;
import java.lang.reflect.Field;

public abstract class x0 {
   public static final Field a;

   static {
      Field var0 = null;

      label25: {
         Field var1;
         label24: {
            NoSuchFieldException var10000;
            label29: {
               boolean var10001;
               try {
                  var1 = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
               } catch (NoSuchFieldException var3) {
                  var10000 = var3;
                  var10001 = false;
                  break label29;
               }

               var0 = var1;

               try {
                  var1.setAccessible(true);
                  break label24;
               } catch (NoSuchFieldException var2) {
                  var10000 = var2;
                  var10001 = false;
               }
            }

            NoSuchFieldException var4 = var10000;
            var4.printStackTrace();
            break label25;
         }

         var0 = var1;
      }

      a = var0;
   }
}
