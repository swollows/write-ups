package asm;

import android.text.TextUtils;

public final class h
  implements e
{
  public final String d;
  
  public Object a()
  {
    return this;
  }
  
  public boolean a(CharSequence paramCharSequence, int paramInt1, int paramInt2, Attribute paramAttribute)
  {
    if (TextUtils.equals(paramCharSequence.subSequence(paramInt1, paramInt2), d))
    {
      b = (b & 0x3 | 0x4);
      return false;
    }
    return true;
  }
  
  public String toString()
  {
    switch (c)
    {
    default: 
      return super.toString();
    }
    StringBuilder localStringBuilder = new StringBuilder("<");
    localStringBuilder.append(d);
    localStringBuilder.append('>');
    return localStringBuilder.toString();
  }
}
