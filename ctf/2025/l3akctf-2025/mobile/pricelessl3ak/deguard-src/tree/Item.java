package tree;

import androidx.lifecycle.SupportMenuItem;
import androidx.lifecycle.d;
import java.util.Map.Entry;

public final class Item
  implements Map.Entry
{
  public final d a;
  public final SupportMenuItem data;
  public Item i;
  public Item k;
  
  public Item(SupportMenuItem paramSupportMenuItem, d paramD)
  {
    data = paramSupportMenuItem;
    a = paramD;
  }
  
  public final boolean equals(Object paramObject)
  {
    if (paramObject == this) {
      return true;
    }
    if (!(paramObject instanceof Item)) {
      return false;
    }
    paramObject = (Item)paramObject;
    SupportMenuItem localSupportMenuItem = data;
    return (data.equals(localSupportMenuItem)) && (a.equals(a));
  }
  
  public final Object getKey()
  {
    return data;
  }
  
  public final Object getValue()
  {
    return a;
  }
  
  public final int hashCode()
  {
    return data.hashCode() ^ a.hashCode();
  }
  
  public final Object setValue(Object paramObject)
  {
    throw new UnsupportedOperationException("An entry modification is not supported");
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(data);
    localStringBuilder.append("=");
    localStringBuilder.append(a);
    return localStringBuilder.toString();
  }
}
