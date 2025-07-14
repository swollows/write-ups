package androidx.appcompat.widget;

import android.widget.TextView;

public abstract class c0 {
   public static int a(TextView var0) {
      return var0.getAutoSizeStepGranularity();
   }

   public static void b(TextView var0, int var1, int var2, int var3, int var4) {
      var0.setAutoSizeTextTypeUniformWithConfiguration(var1, var2, var3, var4);
   }

   public static void c(TextView var0, int[] var1, int var2) {
      var0.setAutoSizeTextTypeUniformWithPresetSizes(var1, var2);
   }

   public static boolean d(TextView var0, String var1) {
      return var0.setFontVariationSettings(var1);
   }
}
