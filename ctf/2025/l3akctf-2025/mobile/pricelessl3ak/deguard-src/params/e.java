package params;

import java.io.Serializable;

public abstract class e
  implements l, Serializable
{
  public final int b;
  
  public e(int paramInt)
  {
    b = paramInt;
  }
  
  public final int b()
  {
    return b;
  }
  
  public final String toString()
  {
    Type.a.getClass();
    String str = Attribute.getString(this);
    Log.append(str, "renderLambdaToString(...)");
    return str;
  }
}
