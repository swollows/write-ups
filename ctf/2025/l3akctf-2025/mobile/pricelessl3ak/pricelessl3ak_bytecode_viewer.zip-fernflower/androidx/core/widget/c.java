package androidx.core.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.EdgeEffect;

public abstract class c {
   public static EdgeEffect a(Context var0, AttributeSet var1) {
      try {
         EdgeEffect var4 = new EdgeEffect(var0, var1);
         return var4;
      } finally {
         return new EdgeEffect(var0);
      }
   }

   public static float b(EdgeEffect var0) {
      try {
         float var1 = var0.getDistance();
         return var1;
      } finally {
         ;
      }
   }

   public static float c(EdgeEffect var0, float var1, float var2) {
      try {
         float var3 = var0.onPullDistance(var1, var2);
         return var3;
      } finally {
         var0.onPull(var1, var2);
         return 0.0F;
      }
   }
}
