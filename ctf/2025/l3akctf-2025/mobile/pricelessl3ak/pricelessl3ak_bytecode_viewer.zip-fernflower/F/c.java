package F;

import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.inputmethod.EditorInfo;

public abstract class c {
   public static final String[] a = new String[0];

   public static void a(EditorInfo var0, CharSequence var1, int var2, int var3) {
      if (var0.extras == null) {
         var0.extras = new Bundle();
      }

      SpannableStringBuilder var4;
      if (var1 != null) {
         var4 = new SpannableStringBuilder(var1);
      } else {
         var4 = null;
      }

      var0.extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", var4);
      var0.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", var2);
      var0.extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", var3);
   }
}
