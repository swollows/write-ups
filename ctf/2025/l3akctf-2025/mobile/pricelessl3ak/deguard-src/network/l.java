package network;

import android.text.Editable;
import android.text.Editable.Factory;
import asm.StrBuilder;

public final class l
  extends Editable.Factory
{
  public static volatile l b;
  public static Class c;
  public static final Object d = new Object();
  
  public final Editable newEditable(CharSequence paramCharSequence)
  {
    Class localClass = c;
    if (localClass != null) {
      return new StrBuilder(localClass, paramCharSequence);
    }
    return super.newEditable(paramCharSequence);
  }
}
