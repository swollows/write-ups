package net;

import java.util.Iterator;

public final class c
  implements Sequence
{
  public final e a;
  
  public c(e paramE)
  {
    a = paramE;
  }
  
  public final Iterator iterator()
  {
    return new FixedTableModel.a(this);
  }
}
