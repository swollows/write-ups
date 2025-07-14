package ec;

import drupal.Context;
import java.util.concurrent.Executors;

public final class h
  extends Context
{
  public static volatile h g;
  public final Object d = new Object();
  
  public h(int paramInt)
  {
    super();
    Executors.newFixedThreadPool(4, new NamedThreadFactory());
  }
}
