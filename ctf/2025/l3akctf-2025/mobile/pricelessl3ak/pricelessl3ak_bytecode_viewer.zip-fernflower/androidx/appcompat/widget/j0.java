package androidx.appcompat.widget;

import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.StaticLayout.Builder;
import android.util.Log;
import android.widget.TextView;

public abstract class j0 {
   public static StaticLayout a(CharSequence var0, Layout.Alignment var1, int var2, int var3, TextView var4, TextPaint var5, m0 var6) {
      StaticLayout.Builder var8 = Builder.obtain(var0, 0, var0.length(), var5, var2);
      StaticLayout.Builder var9 = var8.setAlignment(var1).setLineSpacing(var4.getLineSpacingExtra(), var4.getLineSpacingMultiplier()).setIncludePad(var4.getIncludeFontPadding()).setBreakStrategy(var4.getBreakStrategy()).setHyphenationFrequency(var4.getHyphenationFrequency());
      var2 = var3;
      if (var3 == -1) {
         var2 = Integer.MAX_VALUE;
      }

      var9.setMaxLines(var2);

      try {
         var6.a(var8, var4);
      } catch (ClassCastException var7) {
         Log.w("ACTVAutoSizeHelper", "Failed to obtain TextDirectionHeuristic, auto size may be incorrect");
      }

      return var8.build();
   }
}
