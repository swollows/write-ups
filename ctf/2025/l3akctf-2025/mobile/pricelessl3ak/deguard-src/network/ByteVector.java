package network;

import android.text.InputFilter;
import android.widget.TextView;
import asm.ClassWriter;
import drupal.Context;

public final class ByteVector
  extends Context
{
  public final Label b;
  
  public ByteVector(TextView paramTextView)
  {
    super();
    b = new Label(paramTextView);
  }
  
  public final void a(boolean paramBoolean)
  {
    int i;
    if (ClassWriter.b != null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      return;
    }
    b.a(paramBoolean);
  }
  
  public final InputFilter[] a(InputFilter[] paramArrayOfInputFilter)
  {
    int i;
    if (ClassWriter.b != null) {
      i = 1;
    } else {
      i = 0;
    }
    if (i == 0) {
      return paramArrayOfInputFilter;
    }
    return b.a(paramArrayOfInputFilter);
  }
  
  public final void b(boolean paramBoolean)
  {
    int i;
    if (ClassWriter.b != null) {
      i = 1;
    } else {
      i = 0;
    }
    Label localLabel = b;
    if (i == 0)
    {
      f = paramBoolean;
      return;
    }
    localLabel.b(paramBoolean);
  }
}
