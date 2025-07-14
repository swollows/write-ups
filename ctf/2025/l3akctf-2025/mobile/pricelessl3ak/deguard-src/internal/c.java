package internal;

import drupal.Context;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import net.PhoneNumberMatcher;

public final class c
  implements Iterable, ssh.Object
{
  public static final c c = new c(0L, 0L, 0, null);
  public final long a;
  public final int[] d;
  public final int e;
  public final long f;
  
  public c(long paramLong1, long paramLong2, int paramInt, int[] paramArrayOfInt)
  {
    a = paramLong1;
    f = paramLong2;
    e = paramInt;
    d = paramArrayOfInt;
  }
  
  public final c a(int paramInt)
  {
    int i = e;
    int j = paramInt - i;
    long l2 = f;
    long l1;
    Object localObject1;
    if ((j >= 0) && (j < 64))
    {
      l1 = 1L << j;
      if ((l2 & l1) == 0L)
      {
        localObject1 = d;
        return new c(a, l2 | l1, i, (int[])localObject1);
      }
    }
    else
    {
      l1 = a;
      long l3;
      if ((j >= 64) && (j < 128))
      {
        l3 = 1L << j - 64;
        if ((l1 & l3) == 0L) {
          return new c(l1 | l3, l2, i, d);
        }
      }
      else
      {
        int[] arrayOfInt = d;
        if (j >= 128)
        {
          if (!b(paramInt))
          {
            int k = (paramInt + 1) / 64 * 64;
            i = e;
            Object localObject3;
            for (localObject1 = null; i < k; localObject1 = localObject3)
            {
              localObject3 = localObject1;
              if (l2 != 0L)
              {
                localObject2 = localObject1;
                if (localObject1 == null)
                {
                  localObject1 = new ArrayList();
                  localObject2 = localObject1;
                  if (arrayOfInt != null)
                  {
                    int m = arrayOfInt.length;
                    j = 0;
                    for (;;)
                    {
                      localObject2 = localObject1;
                      if (j >= m) {
                        break;
                      }
                      ((ArrayList)localObject1).add(Integer.valueOf(arrayOfInt[j]));
                      j += 1;
                    }
                  }
                }
                j = 0;
                for (;;)
                {
                  localObject3 = localObject2;
                  if (j >= 64) {
                    break;
                  }
                  if ((1L << j & l2) != 0L) {
                    ((java.util.List)localObject2).add(Integer.valueOf(j + i));
                  }
                  j += 1;
                }
              }
              if (l1 == 0L)
              {
                l2 = 0L;
                i = k;
                localObject1 = localObject3;
                break;
              }
              i += 64;
              l3 = 0L;
              l2 = l1;
              l1 = l3;
            }
            Object localObject2 = arrayOfInt;
            if (localObject1 != null)
            {
              localObject3 = new int[((Collection)localObject1).size()];
              localObject1 = ((Collection)localObject1).iterator();
              j = 0;
              for (;;)
              {
                localObject2 = localObject3;
                if (!((Iterator)localObject1).hasNext()) {
                  break;
                }
                localObject3[j] = ((Number)((Iterator)localObject1).next()).intValue();
                j += 1;
              }
            }
            return new c(l1, l2, i, (int[])localObject2).a(paramInt);
          }
        }
        else
        {
          if (arrayOfInt == null) {
            return new c(l1, l2, i, new int[] { paramInt });
          }
          i = Context.remove(arrayOfInt, paramInt);
          if (i < 0)
          {
            i = -(i + 1);
            j = arrayOfInt.length;
            localObject1 = new int[j + 1];
            collections.List.append(0, 0, i, arrayOfInt, (int[])localObject1);
            collections.List.append(i + 1, i, j, arrayOfInt, (int[])localObject1);
            localObject1[i] = paramInt;
            paramInt = e;
            return new c(a, f, paramInt, (int[])localObject1);
          }
        }
      }
    }
    return this;
  }
  
  public final boolean b(int paramInt)
  {
    int i = paramInt - e;
    if ((i >= 0) && (i < 64)) {
      return (1L << i & f) != 0L;
    }
    if ((i >= 64) && (i < 128)) {
      return (1L << i - 64 & a) != 0L;
    }
    if (i > 0) {
      return false;
    }
    int[] arrayOfInt = d;
    if (arrayOfInt != null) {
      return Context.remove(arrayOfInt, paramInt) >= 0;
    }
    return false;
  }
  
  public final Iterator iterator()
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.toString());
    localStringBuilder.append(" [");
    ArrayList localArrayList = new ArrayList(collections.Object.apply(this));
    Object localObject1 = iterator();
    Object localObject2;
    for (;;)
    {
      localObject2 = (PhoneNumberMatcher)localObject1;
      if (!((PhoneNumberMatcher)localObject2).hasNext()) {
        break;
      }
      localArrayList.add(String.valueOf(((Number)((PhoneNumberMatcher)localObject2).next()).intValue()));
    }
    localObject1 = new StringBuilder();
    ((StringBuilder)localObject1).append("");
    int k = localArrayList.size();
    int i = 0;
    int j = 0;
    while (i < k)
    {
      localObject2 = localArrayList.get(i);
      boolean bool = true;
      j += 1;
      if (j > 1) {
        ((StringBuilder)localObject1).append(", ");
      }
      if (localObject2 != null) {
        bool = localObject2 instanceof CharSequence;
      }
      if (bool) {
        ((StringBuilder)localObject1).append((CharSequence)localObject2);
      } else if ((localObject2 instanceof Character)) {
        ((StringBuilder)localObject1).append(((Character)localObject2).charValue());
      } else {
        ((StringBuilder)localObject1).append(String.valueOf(localObject2));
      }
      i += 1;
    }
    ((StringBuilder)localObject1).append("");
    localStringBuilder.append(((StringBuilder)localObject1).toString());
    localStringBuilder.append(']');
    return localStringBuilder.toString();
  }
}
