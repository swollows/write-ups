package data;

import views.Context;

public final class ClassWriter
  implements Future
{
  public final int b;
  public final int c;
  public final String id;
  public final Context l;
  public final Context m;
  
  public ClassWriter(Context paramContext1, Context paramContext2, int paramInt1, int paramInt2, String paramString)
  {
    m = paramContext1;
    l = paramContext2;
    c = paramInt1;
    b = paramInt2;
    id = paramString;
  }
}
