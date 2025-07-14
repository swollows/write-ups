package data;

import java.util.WeakHashMap;

public abstract class DeltaBaseCache
{
  public static final WeakHashMap cache = new WeakHashMap(0);
  public static final Object index = new Object();
  public static final ThreadLocal table = new ThreadLocal();
}
