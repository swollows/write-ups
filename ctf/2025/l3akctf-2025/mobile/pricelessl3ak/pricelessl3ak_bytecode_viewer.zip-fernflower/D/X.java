package D;

import android.animation.ValueAnimator;
import android.view.View;
import androidx.appcompat.app.V;

public final class X implements ValueAnimator.AnimatorUpdateListener {
   public final d a;

   // $FF: synthetic method
   public X(d var1, View var2) {
      this.a = var1;
   }

   public final void onAnimationUpdate(ValueAnimator var1) {
      ((View)((V)this.a.b).d.getParent()).invalidate();
   }
}
