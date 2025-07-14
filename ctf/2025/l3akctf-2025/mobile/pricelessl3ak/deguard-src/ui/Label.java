package ui;

import astuetz.c;
import collections.LinkedList;
import java.util.AbstractList;
import java.util.ListIterator;
import params.Log;
import params.e;

public final class Label
  extends e
  implements c
{
  public final Object draw(Object paramObject)
  {
    Object localObject1;
    switch (a)
    {
    default: 
      Log.get((b)paramObject, "backEvent");
      paramObject = b;
      if (c == null)
      {
        paramObject = a;
        localObject2 = paramObject.listIterator(paramObject.size());
        while (((ListIterator)localObject2).hasPrevious())
        {
          localObject1 = ((ListIterator)localObject2).previous();
          paramObject = localObject1;
          if (i) {
            break label95;
          }
        }
        paramObject = null;
        label95:
        paramObject = (androidx.fragment.asm.Label)paramObject;
      }
      return widgets.Label.i;
    }
    Log.get((b)paramObject, "backEvent");
    Object localObject2 = b;
    paramObject = a;
    ListIterator localListIterator = paramObject.listIterator(paramObject.size());
    while (localListIterator.hasPrevious())
    {
      localObject1 = localListIterator.previous();
      paramObject = localObject1;
      if (i) {
        break label168;
      }
    }
    paramObject = null;
    label168:
    paramObject = (androidx.fragment.asm.Label)paramObject;
    if (c != null) {
      ((i)localObject2).draw();
    }
    c = paramObject;
    return widgets.Label.i;
  }
}
