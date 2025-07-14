package app;

import util.Headers;

public abstract class DeltaBaseCache
{
  public DeltaBaseCache()
  {
    this(new TypeToken());
  }
  
  public DeltaBaseCache(TypeToken paramTypeToken) {}
  
  public abstract TypeToken get();
  
  public abstract void get(Headers paramHeaders);
  
  public final void put() {}
  
  public abstract void put(Headers paramHeaders);
}
