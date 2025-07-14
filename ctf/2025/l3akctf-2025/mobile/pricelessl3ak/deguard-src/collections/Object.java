package collections;

import java.util.Collection;

public abstract class Object
  extends FastHashMap
{
  public static int apply(Iterable paramIterable)
  {
    if ((paramIterable instanceof Collection)) {
      return ((Collection)paramIterable).size();
    }
    return 10;
  }
}
