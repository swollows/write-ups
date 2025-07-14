package androidx.appcompat.widget;

import android.widget.AbsListView;

public abstract class v0 {
   public static boolean a(AbsListView var0) {
      return var0.isSelectedChildViewEnabled();
   }

   public static void b(AbsListView var0, boolean var1) {
      var0.setSelectedChildViewEnabled(var1);
   }
}
