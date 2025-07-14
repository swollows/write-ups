package i;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;

public abstract class k {
   public static boolean a(Window.Callback var0, SearchEvent var1) {
      return var0.onSearchRequested(var1);
   }

   public static ActionMode b(Window.Callback var0, ActionMode.Callback var1, int var2) {
      return var0.onWindowStartingActionMode(var1, var2);
   }
}
