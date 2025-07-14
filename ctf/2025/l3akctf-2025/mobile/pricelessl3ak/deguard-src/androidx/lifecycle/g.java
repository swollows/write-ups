package androidx.lifecycle;

import app.Element;
import java.util.HashMap;
import params.Item;
import params.Type;

public final class g
{
  public static final Element a = new Element(19);
  public final Object d;
  
  public g(PieChart paramPieChart, l paramL)
  {
    d = paramPieChart;
  }
  
  public g(Plot paramPlot)
  {
    d = paramPlot;
  }
  
  public Label a(Class paramClass)
  {
    Item localItem = Type.get(paramClass);
    Object localObject2 = type;
    boolean bool = ((Class)localObject2).isAnonymousClass();
    Object localObject1 = null;
    paramClass = null;
    if (bool)
    {
      paramClass = (Class)localObject1;
    }
    else if (((Class)localObject2).isLocalClass())
    {
      paramClass = (Class)localObject1;
    }
    else
    {
      bool = ((Class)localObject2).isArray();
      HashMap localHashMap = Item.b;
      if (bool)
      {
        localObject2 = ((Class)localObject2).getComponentType();
        localObject1 = paramClass;
        if (((Class)localObject2).isPrimitive())
        {
          localObject2 = (String)localHashMap.get(((Class)localObject2).getName());
          localObject1 = paramClass;
          if (localObject2 != null) {
            localObject1 = ((String)localObject2).concat("Array");
          }
        }
        paramClass = (Class)localObject1;
        if (localObject1 == null) {
          paramClass = "kotlin.Array";
        }
      }
      else
      {
        localObject1 = (String)localHashMap.get(((Class)localObject2).getName());
        paramClass = (Class)localObject1;
        if (localObject1 == null) {
          paramClass = ((Class)localObject2).getCanonicalName();
        }
      }
    }
    if (paramClass != null)
    {
      paramClass = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(paramClass);
      return ((asm.Label)d).a(localItem, paramClass);
    }
    throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
  }
}
