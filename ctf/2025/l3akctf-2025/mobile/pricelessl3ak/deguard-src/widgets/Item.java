package widgets;

import astuetz.Menu;
import java.io.Serializable;
import params.Log;

public final class Item
  implements Checkable, Serializable
{
  public final Object a;
  public volatile Object b;
  public Menu c;
  
  public Item(Menu paramMenu)
  {
    c = paramMenu;
    b = Label.b;
    a = this;
  }
  
  public final Object a()
  {
    Object localObject1 = b;
    Object localObject2 = Label.b;
    if (localObject1 != localObject2) {
      return localObject1;
    }
    Object localObject3 = a;
    try
    {
      localObject1 = b;
      if (localObject1 == localObject2)
      {
        localObject1 = c;
        Log.get(localObject1);
        localObject2 = ((Menu)localObject1).a();
        localObject1 = localObject2;
        b = localObject2;
        c = null;
      }
      return localObject1;
    }
    catch (Throwable localThrowable)
    {
      throw localThrowable;
    }
  }
  
  public final String toString()
  {
    if (b != Label.b) {
      return String.valueOf(a());
    }
    return "Lazy value not initialized yet.";
  }
}
