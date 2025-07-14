package net;

import drupal.Context;
import email.Attribute;
import email.Message;
import java.util.Iterator;
import java.util.NoSuchElementException;
import params.Log;
import widgets.Label;

public final class PhoneNumberMatcher
  implements Iterator, Attribute, ssh.Object
{
  public Attribute a;
  public int i;
  public Integer state;
  
  public final void a(Object paramObject)
  {
    Context.a(paramObject);
    i = 4;
  }
  
  public final RuntimeException advance()
  {
    int j = i;
    if (j != 4)
    {
      if (j != 5)
      {
        StringBuilder localStringBuilder = new StringBuilder("Unexpected state of the iterator: ");
        localStringBuilder.append(i);
        return new IllegalStateException(localStringBuilder.toString());
      }
      return new IllegalStateException("Iterator has failed.");
    }
    return new NoSuchElementException();
  }
  
  public final Message d()
  {
    return Message.m;
  }
  
  public final boolean hasNext()
  {
    for (;;)
    {
      int j = i;
      if (j != 0)
      {
        if (j != 1)
        {
          if ((j == 2) || (j == 3)) {
            break;
          }
          if (j == 4) {
            return false;
          }
          throw advance();
        }
        Log.get(null);
        throw new NullPointerException("Null throw statement replaced by Soot");
      }
      i = 5;
      Attribute localAttribute = a;
      Log.get(localAttribute);
      a = null;
      localAttribute.a(Label.i);
    }
    return true;
  }
  
  public final Object next()
  {
    int j = i;
    if ((j != 0) && (j != 1))
    {
      if (j != 2)
      {
        if (j == 3)
        {
          i = 0;
          Integer localInteger = state;
          state = null;
          return localInteger;
        }
        throw advance();
      }
      i = 1;
      Log.get(null);
      throw new NullPointerException("Null throw statement replaced by Soot");
    }
    if (hasNext()) {
      return next();
    }
    throw new NoSuchElementException();
  }
  
  public final void remove()
  {
    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
  }
}
