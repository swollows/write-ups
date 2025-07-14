package asm;

import java.nio.ByteBuffer;
import model.LocalService;

public final class d
{
  public int A;
  public c a;
  public int b;
  public final c c;
  public c f;
  public int p = 1;
  
  public d(c paramC)
  {
    c = paramC;
    f = paramC;
  }
  
  public final boolean a()
  {
    LocalService localLocalService = f.a.read();
    int i = localLocalService.read(6);
    if ((i != 0) && (((ByteBuffer)value).get(i + data) != 0)) {
      return true;
    }
    return A == 65039;
  }
  
  public final void b()
  {
    p = 1;
    f = c;
    b = 0;
  }
}
