package cryptopro;

import app.Element;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public final class a
{
  public final Element b = new Element(8);
  public volatile boolean e;
  public final LinkedHashMap l = new LinkedHashMap();
  public final LinkedHashSet m = new LinkedHashSet();
  
  public a() {}
  
  public static void read(AutoCloseable paramAutoCloseable)
  {
    if (paramAutoCloseable != null) {
      try
      {
        paramAutoCloseable.close();
        return;
      }
      catch (Exception paramAutoCloseable)
      {
        throw new RuntimeException(paramAutoCloseable);
      }
    }
  }
}
