package network;

import android.os.BaseBundle;
import android.os.Bundle;
import android.text.Editable;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;
import android.widget.EditText;
import android.widget.TextView;
import app.Attribute;
import app.Element;
import asm.ClassWriter;
import asm.Label;
import asm.i;
import java.nio.ByteBuffer;
import model.License;

public final class c
  extends InputConnectionWrapper
{
  public final EditText c;
  public final Element e;
  
  public c(EditText paramEditText, InputConnection paramInputConnection, EditorInfo paramEditorInfo)
  {
    super(paramInputConnection, false);
    c = paramEditText;
    e = ((Element)localObject);
    if (ClassWriter.b != null)
    {
      paramEditText = ClassWriter.a();
      if (paramEditText.get() == 1)
      {
        if (paramEditorInfo == null) {
          return;
        }
        if (extras == null) {
          extras = new Bundle();
        }
        paramEditText = p;
        paramEditText.getClass();
        paramInputConnection = extras;
        localObject = (License)c.a;
        int i = ((Attribute)localObject).read(4);
        if (i != 0) {
          i = ((ByteBuffer)value).getInt(i + data);
        } else {
          i = 0;
        }
        paramInputConnection.putInt("android.support.text.emoji.emojiCompat_metadataVersion", i);
        paramInputConnection = extras;
        a.getClass();
        paramInputConnection.putBoolean("android.support.text.emoji.emojiCompat_replaceAll", false);
      }
    }
  }
  
  public final boolean deleteSurroundingText(int paramInt1, int paramInt2)
  {
    Editable localEditable = c.getEditableText();
    e.getClass();
    return (Element.convert(this, localEditable, paramInt1, paramInt2, false)) || (super.deleteSurroundingText(paramInt1, paramInt2));
  }
  
  public final boolean deleteSurroundingTextInCodePoints(int paramInt1, int paramInt2)
  {
    Editable localEditable = c.getEditableText();
    e.getClass();
    if (!Element.convert(this, localEditable, paramInt1, paramInt2, true)) {
      return super.deleteSurroundingTextInCodePoints(paramInt1, paramInt2);
    }
    return true;
  }
}
