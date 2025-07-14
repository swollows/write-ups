package androidx.lifecycle;

import android.os.BaseBundle;
import android.os.Bundle;
import internal.Label;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import params.Log;
import smb.e;
import tts.h;
import tts.l;
import ui.AbstractGalleryActivity;
import widgets.Item;
import widgets.Pair;

public final class b
  implements l
{
  public final h a;
  public Bundle c;
  public boolean e;
  public final Item h;
  
  public b(h paramH, AbstractGalleryActivity paramAbstractGalleryActivity)
  {
    a = paramH;
    h = new Item(new tts.p(paramAbstractGalleryActivity, 1));
  }
  
  public final Bundle a()
  {
    Bundle localBundle = Label.bundleOf((Pair[])Arrays.copyOf(new Pair[0], 0));
    Object localObject1 = c;
    if (localObject1 != null) {
      localBundle.putAll((Bundle)localObject1);
    }
    localObject1 = h.a()).a.entrySet().iterator();
    while (((Iterator)localObject1).hasNext())
    {
      Object localObject2 = (Map.Entry)((Iterator)localObject1).next();
      String str = (String)((Map.Entry)localObject2).getKey();
      localObject2 = getValuec.k.a();
      if (!((BaseBundle)localObject2).isEmpty())
      {
        Log.get(str, "key");
        localBundle.putBundle(str, (Bundle)localObject2);
      }
    }
    e = false;
    return localBundle;
  }
  
  public final void c()
  {
    if (!e)
    {
      Object localObject = a.a("androidx.lifecycle.internal.SavedStateHandlesProvider");
      Bundle localBundle1 = Label.bundleOf((Pair[])Arrays.copyOf(new Pair[0], 0));
      Bundle localBundle2 = c;
      if (localBundle2 != null) {
        localBundle1.putAll(localBundle2);
      }
      if (localObject != null) {
        localBundle1.putAll((Bundle)localObject);
      }
      c = localBundle1;
      e = true;
      localObject = (p)h.a();
    }
  }
}
