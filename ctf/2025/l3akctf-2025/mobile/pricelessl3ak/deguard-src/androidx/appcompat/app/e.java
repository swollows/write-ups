package androidx.appcompat.app;

import android.content.Context;
import android.content.IntentFilter;
import http.AbstractMultimap;
import menu.MenuItemWrapper;

public abstract class e
{
  public Object a;
  public Object b;
  
  public e(Context paramContext)
  {
    b = paramContext;
  }
  
  public e(AppCompatDelegateImplV7 paramAppCompatDelegateImplV7)
  {
    a = paramAppCompatDelegateImplV7;
  }
  
  public android.view.MenuItem a(android.view.MenuItem paramMenuItem)
  {
    android.view.MenuItem localMenuItem = paramMenuItem;
    if ((paramMenuItem instanceof preferences.MenuItem))
    {
      preferences.MenuItem localMenuItem1 = (preferences.MenuItem)paramMenuItem;
      if ((AbstractMultimap)a == null) {
        a = new AbstractMultimap(0);
      }
      paramMenuItem = (android.view.MenuItem)((AbstractMultimap)a).get(localMenuItem1);
      localMenuItem = paramMenuItem;
      if (paramMenuItem == null)
      {
        paramMenuItem = new MenuItemWrapper((Context)b, localMenuItem1);
        ((AbstractMultimap)a).put(localMenuItem1, paramMenuItem);
        return paramMenuItem;
      }
    }
    return localMenuItem;
  }
  
  public void a()
  {
    PlaybackService.8 local8 = (PlaybackService.8)b;
    if (local8 != null)
    {
      Context localContext = a).mContext;
      try
      {
        localContext.unregisterReceiver(local8);
        b = null;
        return;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        for (;;) {}
      }
    }
  }
  
  public abstract int doInBackground();
  
  public abstract IntentFilter init();
  
  public void onCreate()
  {
    a();
    IntentFilter localIntentFilter = init();
    if (localIntentFilter.countActions() == 0) {
      return;
    }
    if ((PlaybackService.8)b == null) {
      b = new PlaybackService.8(this);
    }
    a).mContext.registerReceiver((PlaybackService.8)b, localIntentFilter);
  }
  
  public abstract void setTitle();
}
