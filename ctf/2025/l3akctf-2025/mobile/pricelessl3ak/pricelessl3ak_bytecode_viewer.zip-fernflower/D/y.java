package D;

import android.view.ScrollFeedbackProvider;
import androidx.core.widget.NestedScrollView;

public final class y implements A {
   public final ScrollFeedbackProvider a;

   public y(NestedScrollView var1) {
      this.a = ScrollFeedbackProvider.createProvider(var1);
   }

   public final void a(int var1, int var2, int var3, boolean var4) {
      this.a.onScrollLimit(var1, var2, var3, var4);
   }

   public final void b(int var1, int var2, int var3, int var4) {
      this.a.onScrollProgress(var1, var2, var3, var4);
   }
}
