package signature;

import android.app.Activity;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.lifecycle.ClassWriter;
import androidx.lifecycle.Dictionary;
import androidx.lifecycle.PreferenceFragment;
import androidx.lifecycle.c;
import androidx.lifecycle.f;
import androidx.lifecycle.x;
import drupal.Context;
import http.AbstractMultimap;
import params.Log;

public abstract class BaseListFragment
  extends Activity
  implements x, app.k
{
  private final m.k extraDataMap = new AbstractMultimap(0);
  private final f lifecycleRegistry = new f(this);
  
  public BaseListFragment() {}
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    Log.get(paramKeyEvent, "event");
    View localView = getWindow().getDecorView();
    Log.append(localView, "window.decorView");
    if (Context.a(localView, paramKeyEvent)) {
      return true;
    }
    return Context.a(this, localView, this, paramKeyEvent);
  }
  
  public boolean dispatchKeyShortcutEvent(KeyEvent paramKeyEvent)
  {
    Log.get(paramKeyEvent, "event");
    View localView = getWindow().getDecorView();
    Log.append(localView, "window.decorView");
    if (Context.a(localView, paramKeyEvent)) {
      return true;
    }
    return super.dispatchKeyShortcutEvent(paramKeyEvent);
  }
  
  public HttpParameters getExtraData(Class paramClass)
  {
    Log.get(paramClass, "extraDataClass");
    if (extraDataMap.get(paramClass) == null) {
      return null;
    }
    throw new ClassCastException();
  }
  
  public ClassWriter getLifecycle()
  {
    return lifecycleRegistry;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    super.onCreate(paramBundle);
    int i = PreferenceFragment.emptyView;
    Dictionary.onCreate(this);
  }
  
  public void onSaveInstanceState(Bundle paramBundle)
  {
    Log.get(paramBundle, "outState");
    f localF = lifecycleRegistry;
    c localC = c.c;
    localF.a("setCurrentState");
    localF.a(localC);
    super.onSaveInstanceState(paramBundle);
  }
  
  public void putExtraData(HttpParameters paramHttpParameters)
  {
    Log.get(paramHttpParameters, "extraData");
    throw new NullPointerException("Null throw statement replaced by Soot");
  }
  
  public final boolean shouldDumpInternalState(String[] paramArrayOfString)
  {
    int j = 0;
    int i = j;
    if (paramArrayOfString != null) {
      if (paramArrayOfString.length == 0)
      {
        i = j;
      }
      else
      {
        paramArrayOfString = paramArrayOfString[0];
        switch (paramArrayOfString.hashCode())
        {
        default: 
          i = j;
          break;
        case 1455016274: 
          if (!paramArrayOfString.equals("--autofill"))
          {
            i = j;
          }
          else
          {
            i = j;
            if (Build.VERSION.SDK_INT < 26) {
              break;
            }
          }
          break;
        case 1159329357: 
        case 472614934: 
        case 100470631: 
        case -645125871: 
          do
          {
            for (;;)
            {
              i = 1;
              break;
              if (!paramArrayOfString.equals("--contentcapture"))
              {
                i = j;
                break;
              }
              i = j;
              if (Build.VERSION.SDK_INT < 29) {
                break;
              }
              continue;
              if (!paramArrayOfString.equals("--list-dumpables"))
              {
                i = j;
                break;
                if (!paramArrayOfString.equals("--dump-dumpable"))
                {
                  i = j;
                  break;
                }
              }
              i = j;
              if (Build.VERSION.SDK_INT < 33) {
                break;
              }
            }
            if (!paramArrayOfString.equals("--translation"))
            {
              i = j;
              break;
            }
            i = j;
          } while (Build.VERSION.SDK_INT >= 31);
        }
      }
    }
    return i ^ 0x1;
  }
  
  public boolean superDispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    Log.get(paramKeyEvent, "event");
    return super.dispatchKeyEvent(paramKeyEvent);
  }
}
