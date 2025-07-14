package common;

import android.os.BaseBundle;
import android.os.Bundle;
import android.text.SpannableStringBuilder;
import android.view.inputmethod.EditorInfo;

public abstract class Buffer
{
  public static final String[] title = new String[0];
  
  public static void write(EditorInfo paramEditorInfo, CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    if (extras == null) {
      extras = new Bundle();
    }
    if (paramCharSequence != null) {
      paramCharSequence = new SpannableStringBuilder(paramCharSequence);
    } else {
      paramCharSequence = null;
    }
    extras.putCharSequence("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SURROUNDING_TEXT", paramCharSequence);
    extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_HEAD", paramInt1);
    extras.putInt("androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_SELECTION_END", paramInt2);
  }
}
