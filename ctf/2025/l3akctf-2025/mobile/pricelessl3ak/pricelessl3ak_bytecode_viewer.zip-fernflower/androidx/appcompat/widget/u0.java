package androidx.appcompat.widget;

import android.view.View;
import android.widget.AbsListView;
import android.widget.AdapterView;
import java.lang.reflect.Method;

public abstract class u0 {
   public static final Method a;
   public static final Method b;
   public static final Method c;
   public static final boolean d;

   static {
      try {
         Class var0 = Integer.TYPE;
         Class var1 = Boolean.TYPE;
         Class var2 = Float.TYPE;
         Method var5 = AbsListView.class.getDeclaredMethod("positionSelector", var0, View.class, var1, var2, var2);
         a = var5;
         var5.setAccessible(true);
         var5 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", var0);
         b = var5;
         var5.setAccessible(true);
         Method var4 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", var0);
         c = var4;
         var4.setAccessible(true);
         d = true;
      } catch (NoSuchMethodException var3) {
         var3.printStackTrace();
      }

   }
}
