package params;

public final class Record
  implements Object
{
  public final Class type;
  
  public Record(Class paramClass)
  {
    type = paramClass;
  }
  
  public final boolean equals(java.lang.Object paramObject)
  {
    if ((paramObject instanceof Record))
    {
      paramObject = type;
      if (Log.equals(type, paramObject)) {
        return true;
      }
    }
    return false;
  }
  
  public final Class getType()
  {
    return type;
  }
  
  public final int hashCode()
  {
    return type.hashCode();
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(type.toString());
    localStringBuilder.append(" (Kotlin reflection is not available)");
    return localStringBuilder.toString();
  }
}
