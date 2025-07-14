package asm;

import drupal.Context;
import java.util.ArrayList;
import java.util.List;

public final class b
  implements Runnable
{
  public final ArrayList a;
  public final int b;
  
  public b(List paramList, int paramInt, Throwable paramThrowable)
  {
    Context.get(paramList, "initCallbacks cannot be null");
    a = new ArrayList(paramList);
    b = paramInt;
  }
  
  public final void run()
  {
    ArrayList localArrayList = a;
    int k = localArrayList.size();
    int m = b;
    int i = 0;
    int j = 0;
    if (m != 1)
    {
      i = j;
      while (i < k)
      {
        ((Handler)localArrayList.get(i)).getClass();
        i += 1;
      }
    }
    while (i < k)
    {
      ((Handler)localArrayList.get(i)).init();
      i += 1;
    }
  }
}
