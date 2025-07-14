package views;

import drupal.AdView;
import http.AbstractMultimap;
import java.util.ArrayList;

public final class Label
  implements AdView
{
  public final void a(Object paramObject)
  {
    switch (a)
    {
    default: 
      Type localType1 = (Type)paramObject;
      paramObject = ClassWriter.v;
      try
      {
        localAbstractMultimap = ClassWriter.c;
        localArrayList = (ArrayList)localAbstractMultimap.get((String)e);
        if (localArrayList == null) {
          return;
        }
      }
      catch (Throwable localThrowable)
      {
        AbstractMultimap localAbstractMultimap;
        ArrayList localArrayList;
        break label121;
        localAbstractMultimap.remove((String)e);
        int i = 0;
        while (i < localArrayList.size())
        {
          ((AdView)localArrayList.get(i)).a(localThrowable);
          i += 1;
        }
        return;
        label121:
        throw localThrowable;
      }
    }
    Type localType2 = (Type)paramObject;
    paramObject = localType2;
    if (localType2 == null) {
      paramObject = new Type(-3);
    }
    ((i)e).add(paramObject);
  }
}
