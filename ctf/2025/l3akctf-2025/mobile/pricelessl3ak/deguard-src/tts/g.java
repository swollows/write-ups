package tts;

import android.os.BaseBundle;
import android.os.Bundle;
import androidx.lifecycle.c;
import androidx.lifecycle.f;
import androidx.lifecycle.x;
import date4j.a;
import drupal.Context;
import internal.Label;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;
import params.Log;
import widgets.Pair;

public final class g
{
  public final a c;
  public final h e;
  
  public g(a paramA)
  {
    c = paramA;
    e = new h(paramA);
  }
  
  public final void a(Bundle paramBundle)
  {
    a localA = c;
    if (!f) {
      localA.a();
    }
    Object localObject1 = e;
    if (getLifecyclea.compareTo(c.d) < 0)
    {
      if (!l)
      {
        Object localObject2 = null;
        localObject1 = localObject2;
        if (paramBundle != null)
        {
          localObject1 = localObject2;
          if (paramBundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            localObject1 = Context.get("androidx.lifecycle.BundlableSavedStateRegistry.key", paramBundle);
          }
        }
        c = ((Bundle)localObject1);
        l = true;
        return;
      }
      throw new IllegalStateException("SavedStateRegistry was already restored.");
    }
    paramBundle = new StringBuilder("performRestore cannot be called when owner is ");
    paramBundle.append(getLifecyclea);
    throw new IllegalStateException(paramBundle.toString().toString());
  }
  
  public final void b(Bundle paramBundle)
  {
    Object localObject2 = c;
    Bundle localBundle = Label.bundleOf((Pair[])Arrays.copyOf(new Pair[0], 0));
    Object localObject1 = c;
    if (localObject1 != null) {
      localBundle.putAll((Bundle)localObject1);
    }
    localObject1 = a;
    try
    {
      localObject2 = h.entrySet().iterator();
      while (((Iterator)localObject2).hasNext())
      {
        Object localObject3 = (Map.Entry)((Iterator)localObject2).next();
        String str = (String)((Map.Entry)localObject3).getKey();
        localObject3 = ((l)((Map.Entry)localObject3).getValue()).a();
        Log.get(str, "key");
        localBundle.putBundle(str, (Bundle)localObject3);
      }
      return;
    }
    catch (Throwable paramBundle)
    {
      if (!localBundle.isEmpty())
      {
        paramBundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", localBundle);
        return;
        throw paramBundle;
      }
    }
  }
}
