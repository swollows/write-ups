package menu;

import android.view.MenuItem;

public final class a
  implements Runnable
{
  public a(app.f paramF, b paramB, h paramH, f paramF1)
  {
    d = paramF;
    c = paramB;
    a = paramH;
    b = paramF1;
  }
  
  public final void run()
  {
    Object localObject = c;
    if (localObject != null)
    {
      app.f localF = d;
      a).s = true;
      c.a(false);
      a).s = false;
    }
    localObject = a;
    if ((((h)localObject).isEnabled()) && (((h)localObject).hasSubMenu())) {
      b.a((MenuItem)localObject, null, 4);
    }
  }
}
