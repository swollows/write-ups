package http;

import cat.HttpFields;
import collections.List;
import java.util.Arrays;
import params.Log;

public final class b
  implements Cloneable
{
  public final void a(long paramLong, Object paramObject)
  {
    int j = HttpFields.add(b, m, paramLong);
    if (j >= 0)
    {
      n[j] = paramObject;
      return;
    }
    int k = j;
    int i2 = m;
    Object localObject1 = Item.b;
    Object localObject2;
    if (k < i2)
    {
      localObject2 = n;
      if (localObject2[k] == localObject1)
      {
        b[k] = paramLong;
        localObject2[k] = paramObject;
        return;
      }
    }
    j = k;
    int i1;
    if (i)
    {
      localObject2 = b;
      j = k;
      if (i2 >= localObject2.length)
      {
        Object[] arrayOfObject = n;
        j = 0;
        for (k = 0; j < i2; k = i1)
        {
          Object localObject3 = arrayOfObject[j];
          i1 = k;
          if (localObject3 != localObject1)
          {
            if (j != k)
            {
              localObject2[k] = localObject2[j];
              arrayOfObject[k] = localObject3;
              arrayOfObject[j] = null;
            }
            i1 = k + 1;
          }
          j += 1;
        }
        i = false;
        m = k;
        j = HttpFields.add(b, k, paramLong);
      }
    }
    k = m;
    if (k >= b.length)
    {
      i2 = (k + 1) * 8;
      k = 4;
      for (;;)
      {
        i1 = i2;
        if (k >= 32) {
          break;
        }
        i1 = (1 << k) - 12;
        if (i2 <= i1) {
          break;
        }
        k += 1;
      }
      k = i1 / 8;
      localObject1 = Arrays.copyOf(b, k);
      Log.append(localObject1, "copyOf(this, newSize)");
      b = ((long[])localObject1);
      localObject1 = Arrays.copyOf(n, k);
      Log.append(localObject1, "copyOf(this, newSize)");
      n = ((Object[])localObject1);
    }
    k = m - j;
    if (k != 0)
    {
      localObject1 = b;
      i1 = j + 1;
      Log.get(localObject1, "<this>");
      System.arraycopy(localObject1, j, localObject1, i1, k);
      localObject1 = n;
      List.append((Object[])localObject1, (Object[])localObject1, i1, j, m);
    }
    b[j] = paramLong;
    n[j] = paramObject;
    m += 1;
  }
  
  public final Object clone()
  {
    Object localObject = super.clone();
    Log.add(localObject, "null cannot be cast to non-null type androidx.collection.LongSparseArray<E of androidx.collection.LongSparseArray>");
    localObject = (b)localObject;
    b = ((long[])b.clone());
    n = ((Object[])n.clone());
    return localObject;
  }
  
  public final String toString()
  {
    boolean bool = i;
    Object localObject1 = Item.b;
    int i2;
    Object localObject3;
    int k;
    Object[] arrayOfObject;
    int i1;
    if (bool)
    {
      i2 = m;
      localObject2 = b;
      localObject3 = n;
      j = 0;
      for (k = 0; j < i2; k = i1)
      {
        arrayOfObject = localObject3[j];
        i1 = k;
        if (arrayOfObject != localObject1)
        {
          if (j != k)
          {
            localObject2[k] = localObject2[j];
            localObject3[k] = arrayOfObject;
            localObject3[j] = null;
          }
          i1 = k + 1;
        }
        j += 1;
      }
      i = false;
      m = k;
    }
    int j = m;
    if (j <= 0) {
      return "{}";
    }
    Object localObject2 = new StringBuilder(j * 28);
    ((StringBuilder)localObject2).append('{');
    int i3 = m;
    j = 0;
    while (j < i3)
    {
      if (j > 0) {
        ((StringBuilder)localObject2).append(", ");
      }
      if (j >= 0)
      {
        int i4 = m;
        if (j < i4)
        {
          Object localObject4;
          if (i)
          {
            localObject3 = b;
            arrayOfObject = n;
            k = 0;
            for (i1 = 0; k < i4; i1 = i2)
            {
              localObject4 = arrayOfObject[k];
              i2 = i1;
              if (localObject4 != localObject1)
              {
                if (k != i1)
                {
                  localObject3[i1] = localObject3[k];
                  arrayOfObject[i1] = localObject4;
                  arrayOfObject[k] = null;
                }
                i2 = i1 + 1;
              }
              k += 1;
            }
            i = false;
            m = i1;
          }
          ((StringBuilder)localObject2).append(b[j]);
          ((StringBuilder)localObject2).append('=');
          if (j >= 0)
          {
            i4 = m;
            if (j < i4)
            {
              if (i)
              {
                localObject3 = b;
                arrayOfObject = n;
                k = 0;
                for (i1 = 0; k < i4; i1 = i2)
                {
                  localObject4 = arrayOfObject[k];
                  i2 = i1;
                  if (localObject4 != localObject1)
                  {
                    if (k != i1)
                    {
                      localObject3[i1] = localObject3[k];
                      arrayOfObject[i1] = localObject4;
                      arrayOfObject[k] = null;
                    }
                    i2 = i1 + 1;
                  }
                  k += 1;
                }
                i = false;
                m = i1;
              }
              localObject3 = n[j];
              if (localObject3 != localObject2) {
                ((StringBuilder)localObject2).append(localObject3);
              } else {
                ((StringBuilder)localObject2).append("(this Map)");
              }
              j += 1;
              continue;
            }
          }
          localObject1 = new StringBuilder("Expected index to be within 0..size()-1, but was ");
          ((StringBuilder)localObject1).append(j);
          throw new IllegalArgumentException(((StringBuilder)localObject1).toString().toString());
        }
      }
      localObject1 = new StringBuilder("Expected index to be within 0..size()-1, but was ");
      ((StringBuilder)localObject1).append(j);
      throw new IllegalArgumentException(((StringBuilder)localObject1).toString().toString());
    }
    ((StringBuilder)localObject2).append('}');
    localObject1 = ((StringBuilder)localObject2).toString();
    Log.append(localObject1, "StringBuilder(capacity).?builderAction).toString()");
    return localObject1;
  }
}
