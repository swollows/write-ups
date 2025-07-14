package http;

import cat.HttpFields;
import java.util.ConcurrentModificationException;
import params.Log;

public abstract class Item
{
  public static final Object a;
  public static final Object b;
  
  public static final int get(TCharArrayList paramTCharArrayList, Object paramObject, int paramInt)
  {
    Log.get(paramTCharArrayList, "<this>");
    int j = data;
    if (j == 0) {
      return -1;
    }
    int[] arrayOfInt = next;
    int i = data;
    try
    {
      int k = HttpFields.get(i, paramInt, arrayOfInt);
      if (k < 0) {
        return k;
      }
      if (Log.equals(paramObject, length[k])) {
        return k;
      }
      i = k + 1;
      while ((i < j) && (next[i] == paramInt))
      {
        if (Log.equals(paramObject, length[i])) {
          return i;
        }
        i += 1;
      }
      j = k - 1;
      while ((j >= 0) && (next[j] == paramInt))
      {
        if (Log.equals(paramObject, length[j])) {
          return j;
        }
        j -= 1;
      }
      return i;
    }
    catch (IndexOutOfBoundsException paramTCharArrayList)
    {
      for (;;) {}
    }
    throw new ConcurrentModificationException();
  }
}
