package http;

import cat.HttpFields;
import collections.List;
import java.util.Arrays;
import params.Log;

public final class Attribute
  implements Cloneable
{
  public Attribute()
  {
    int j = 4;
    int k;
    for (;;)
    {
      k = 40;
      if (j >= 32) {
        break;
      }
      k = (1 << j) - 12;
      if (40 <= k) {
        break;
      }
      j += 1;
    }
    j = k / 4;
    a = new int[j];
    b = new Object[j];
  }
  
  public final Object clone()
  {
    Object localObject = super.clone();
    Log.add(localObject, "null cannot be cast to non-null type androidx.collection.SparseArrayCompat<E of androidx.collection.SparseArrayCompat>");
    localObject = (Attribute)localObject;
    a = ((int[])a.clone());
    b = ((Object[])b.clone());
    return localObject;
  }
  
  public final void init(int paramInt, Object paramObject)
  {
    int n = i;
    Object localObject;
    int j;
    int m;
    int k;
    if ((n != 0) && (paramInt <= a[(n - 1)]))
    {
      localObject = a;
      j = HttpFields.get(i, paramInt, (int[])localObject);
      if (j >= 0)
      {
        b[j] = paramObject;
        return;
      }
      n = j;
      j = i;
      if (n < j)
      {
        localObject = b;
        if (localObject[n] == Item.a)
        {
          a[n] = paramInt;
          localObject[n] = paramObject;
          return;
        }
      }
      if (j >= a.length)
      {
        m = (j + 1) * 4;
        j = 4;
        for (;;)
        {
          k = m;
          if (j >= 32) {
            break;
          }
          k = (1 << j) - 12;
          if (m <= k) {
            break;
          }
          j += 1;
        }
        j = k / 4;
        localObject = Arrays.copyOf(a, j);
        Log.append(localObject, "copyOf(this, newSize)");
        a = ((int[])localObject);
        localObject = Arrays.copyOf(b, j);
        Log.append(localObject, "copyOf(this, newSize)");
        b = ((Object[])localObject);
      }
      j = i;
      if (j - n != 0)
      {
        localObject = a;
        k = n + 1;
        List.append(k, n, j, (int[])localObject, (int[])localObject);
        localObject = b;
        List.append((Object[])localObject, (Object[])localObject, k, n, i);
      }
      a[n] = paramInt;
      b[n] = paramObject;
      i += 1;
      return;
    }
    if (n >= a.length)
    {
      m = (n + 1) * 4;
      j = 4;
      for (;;)
      {
        k = m;
        if (j >= 32) {
          break;
        }
        k = (1 << j) - 12;
        if (m <= k) {
          break;
        }
        j += 1;
      }
      j = k / 4;
      localObject = Arrays.copyOf(a, j);
      Log.append(localObject, "copyOf(this, newSize)");
      a = ((int[])localObject);
      localObject = Arrays.copyOf(b, j);
      Log.append(localObject, "copyOf(this, newSize)");
      b = ((Object[])localObject);
    }
    a[n] = paramInt;
    b[n] = paramObject;
    i = (n + 1);
  }
  
  public final String toString()
  {
    int j = i;
    if (j <= 0) {
      return "{}";
    }
    Object localObject1 = new StringBuilder(j * 28);
    ((StringBuilder)localObject1).append('{');
    int k = i;
    j = 0;
    while (j < k)
    {
      if (j > 0) {
        ((StringBuilder)localObject1).append(", ");
      }
      ((StringBuilder)localObject1).append(a[j]);
      ((StringBuilder)localObject1).append('=');
      Object localObject2 = b[j];
      if (localObject2 != this) {
        ((StringBuilder)localObject1).append(localObject2);
      } else {
        ((StringBuilder)localObject1).append("(this Map)");
      }
      j += 1;
    }
    ((StringBuilder)localObject1).append('}');
    localObject1 = ((StringBuilder)localObject1).toString();
    Log.append(localObject1, "buffer.toString()");
    return localObject1;
  }
}
