package asm;

import android.util.SparseArray;

public final class c
{
  public Attribute a;
  public final SparseArray d;
  
  public c(int paramInt)
  {
    d = new SparseArray(paramInt);
  }
  
  public final void a(Attribute paramAttribute, int paramInt1, int paramInt2)
  {
    int i = paramAttribute.read(paramInt1);
    SparseArray localSparseArray = d;
    c localC1;
    if (localSparseArray == null) {
      localC1 = null;
    } else {
      localC1 = (c)localSparseArray.get(i);
    }
    c localC2 = localC1;
    if (localC1 == null)
    {
      localC2 = new c(1);
      localSparseArray.put(paramAttribute.read(paramInt1), localC2);
    }
    if (paramInt2 > paramInt1)
    {
      localC2.a(paramAttribute, paramInt1 + 1, paramInt2);
      return;
    }
    a = paramAttribute;
  }
}
