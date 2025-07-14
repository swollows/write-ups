package smb;

import java.util.LinkedHashMap;
import java.util.Map;
import params.Log;
import ua.l;

public final class b
{
  public final LinkedHashMap a;
  public final LinkedHashMap b;
  public final e k;
  public final LinkedHashMap l;
  public final LinkedHashMap m;
  
  public b(Map paramMap)
  {
    m = new LinkedHashMap(paramMap);
    b = new LinkedHashMap();
    l = new LinkedHashMap();
    a = new LinkedHashMap();
    k = new e(0, this);
  }
  
  public final void a(Object paramObject, String paramString)
  {
    Log.get(paramString, "key");
    m.put(paramString, paramObject);
    l localL = (l)l.get(paramString);
    if (localL != null) {
      ((ua.b)localL).a(paramObject);
    }
    paramString = (l)a.get(paramString);
    if (paramString != null) {
      ((ua.b)paramString).a(paramObject);
    }
  }
}
