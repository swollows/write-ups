package common;

import android.view.inputmethod.EditorInfo;

public abstract class Share
{
  public static void setDescription(EditorInfo paramEditorInfo, CharSequence paramCharSequence)
  {
    paramEditorInfo.setInitialSurroundingSubText(paramCharSequence, 0);
  }
}
