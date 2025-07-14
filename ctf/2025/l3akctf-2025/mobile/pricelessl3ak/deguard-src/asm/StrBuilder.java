package asm;

import H.x;
import android.text.Editable;
import android.text.SpannableStringBuilder;
import drupal.Context;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public final class StrBuilder
  extends SpannableStringBuilder
{
  public final Class size;
  public final ArrayList stack = new ArrayList();
  
  public StrBuilder(Class paramClass, StrBuilder paramStrBuilder, int paramInt1, int paramInt2)
  {
    super(paramStrBuilder, paramInt1, paramInt2);
    Context.get(paramClass, "watcherClass cannot be null");
    size = paramClass;
  }
  
  public StrBuilder(Class paramClass, CharSequence paramCharSequence)
  {
    super(paramCharSequence);
    Context.get(paramClass, "watcherClass cannot be null");
    size = paramClass;
  }
  
  public final Editable append(char paramChar)
  {
    super.append(paramChar);
    return this;
  }
  
  public final Editable append(CharSequence paramCharSequence)
  {
    super.append(paramCharSequence);
    return this;
  }
  
  public final Editable append(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    super.append(paramCharSequence, paramInt1, paramInt2);
    return this;
  }
  
  public final SpannableStringBuilder append(char paramChar)
  {
    super.append(paramChar);
    return this;
  }
  
  public final SpannableStringBuilder append(CharSequence paramCharSequence)
  {
    super.append(paramCharSequence);
    return this;
  }
  
  public final SpannableStringBuilder append(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    super.append(paramCharSequence, paramInt1, paramInt2);
    return this;
  }
  
  public final SpannableStringBuilder append(CharSequence paramCharSequence, Object paramObject, int paramInt)
  {
    super.append(paramCharSequence, paramObject, paramInt);
    return this;
  }
  
  public final Appendable append(char paramChar)
  {
    super.append(paramChar);
    return this;
  }
  
  public final Appendable append(CharSequence paramCharSequence)
  {
    super.append(paramCharSequence);
    return this;
  }
  
  public final Appendable append(CharSequence paramCharSequence, int paramInt1, int paramInt2)
  {
    super.append(paramCharSequence, paramInt1, paramInt2);
    return this;
  }
  
  public final void close()
  {
    int i = 0;
    for (;;)
    {
      ArrayList localArrayList = stack;
      if (i >= localArrayList.size()) {
        break;
      }
      getthis$0.incrementAndGet();
      i += 1;
    }
  }
  
  public final Editable delete(int paramInt1, int paramInt2)
  {
    super.delete(paramInt1, paramInt2);
    return this;
  }
  
  public final SpannableStringBuilder delete(int paramInt1, int paramInt2)
  {
    super.delete(paramInt1, paramInt2);
    return this;
  }
  
  public final boolean delete(Object paramObject)
  {
    if (paramObject != null)
    {
      paramObject = paramObject.getClass();
      if (size == paramObject) {
        return true;
      }
    }
    return false;
  }
  
  public final int getSpanEnd(Object paramObject)
  {
    Object localObject = paramObject;
    if (delete(paramObject))
    {
      SearchFragment.2 local2 = replace(paramObject);
      localObject = paramObject;
      if (local2 != null) {
        localObject = local2;
      }
    }
    return super.getSpanEnd(localObject);
  }
  
  public final int getSpanFlags(Object paramObject)
  {
    Object localObject = paramObject;
    if (delete(paramObject))
    {
      SearchFragment.2 local2 = replace(paramObject);
      localObject = paramObject;
      if (local2 != null) {
        localObject = local2;
      }
    }
    return super.getSpanFlags(localObject);
  }
  
  public final int getSpanStart(Object paramObject)
  {
    Object localObject = paramObject;
    if (delete(paramObject))
    {
      SearchFragment.2 local2 = replace(paramObject);
      localObject = paramObject;
      if (local2 != null) {
        localObject = local2;
      }
    }
    return super.getSpanStart(localObject);
  }
  
  public final Object[] getSpans(int paramInt1, int paramInt2, Class paramClass)
  {
    if (size == paramClass)
    {
      SearchFragment.2[] arrayOf2 = (SearchFragment.2[])super.getSpans(paramInt1, paramInt2, x.class);
      paramClass = (Object[])Array.newInstance(paramClass, arrayOf2.length);
      paramInt1 = 0;
      while (paramInt1 < arrayOf2.length)
      {
        paramClass[paramInt1] = value;
        paramInt1 += 1;
      }
      return paramClass;
    }
    return super.getSpans(paramInt1, paramInt2, paramClass);
  }
  
  public final Editable insert(int paramInt, CharSequence paramCharSequence)
  {
    super.insert(paramInt, paramCharSequence);
    return this;
  }
  
  public final Editable insert(int paramInt1, CharSequence paramCharSequence, int paramInt2, int paramInt3)
  {
    super.insert(paramInt1, paramCharSequence, paramInt2, paramInt3);
    return this;
  }
  
  public final SpannableStringBuilder insert(int paramInt, CharSequence paramCharSequence)
  {
    super.insert(paramInt, paramCharSequence);
    return this;
  }
  
  public final SpannableStringBuilder insert(int paramInt1, CharSequence paramCharSequence, int paramInt2, int paramInt3)
  {
    super.insert(paramInt1, paramCharSequence, paramInt2, paramInt3);
    return this;
  }
  
  public final void next()
  {
    int i = 0;
    for (;;)
    {
      ArrayList localArrayList = stack;
      if (i >= localArrayList.size()) {
        break;
      }
      getthis$0.decrementAndGet();
      i += 1;
    }
  }
  
  public final int nextSpanTransition(int paramInt1, int paramInt2, Class paramClass)
  {
    Object localObject;
    if (paramClass != null)
    {
      localObject = paramClass;
      if (size != paramClass) {}
    }
    else
    {
      localObject = x.class;
    }
    return super.nextSpanTransition(paramInt1, paramInt2, (Class)localObject);
  }
  
  public final void removeSpan(Object paramObject)
  {
    SearchFragment.2 local22;
    if (delete(paramObject))
    {
      SearchFragment.2 local23 = replace(paramObject);
      SearchFragment.2 local21 = local23;
      local22 = local21;
      if (local23 != null)
      {
        paramObject = local23;
        local22 = local21;
      }
    }
    else
    {
      local22 = null;
    }
    super.removeSpan(paramObject);
    if (local22 != null) {
      stack.remove(local22);
    }
  }
  
  public final SpannableStringBuilder replace(int paramInt1, int paramInt2, CharSequence paramCharSequence)
  {
    close();
    super.replace(paramInt1, paramInt2, paramCharSequence);
    next();
    return this;
  }
  
  public final SpannableStringBuilder replace(int paramInt1, int paramInt2, CharSequence paramCharSequence, int paramInt3, int paramInt4)
  {
    close();
    super.replace(paramInt1, paramInt2, paramCharSequence, paramInt3, paramInt4);
    next();
    return this;
  }
  
  public final SearchFragment.2 replace(Object paramObject)
  {
    int i = 0;
    for (;;)
    {
      Object localObject = stack;
      if (i >= ((ArrayList)localObject).size()) {
        break;
      }
      localObject = (SearchFragment.2)((ArrayList)localObject).get(i);
      if (value == paramObject) {
        return localObject;
      }
      i += 1;
    }
    return null;
  }
  
  public final void replace()
  {
    next();
    int i = 0;
    for (;;)
    {
      ArrayList localArrayList = stack;
      if (i >= localArrayList.size()) {
        break;
      }
      ((SearchFragment.2)localArrayList.get(i)).onTextChanged(this, 0, length(), length());
      i += 1;
    }
  }
  
  public final void setSpan(Object paramObject, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject = paramObject;
    if (delete(paramObject))
    {
      localObject = new SearchFragment.2(paramObject);
      stack.add(localObject);
    }
    super.setSpan(localObject, paramInt1, paramInt2, paramInt3);
  }
  
  public final CharSequence subSequence(int paramInt1, int paramInt2)
  {
    return new StrBuilder(size, this, paramInt1, paramInt2);
  }
}
