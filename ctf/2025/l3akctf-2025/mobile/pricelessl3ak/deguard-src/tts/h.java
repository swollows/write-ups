package tts;

import android.os.BaseBundle;
import android.os.Bundle;
import androidx.lifecycle.k;
import app.Element;
import date4j.a;
import drupal.Context;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import params.Log;

public final class h
{
  public b e;
  public final a j;
  
  public h(a paramA)
  {
    j = paramA;
  }
  
  public final Bundle a(String paramString)
  {
    a localA = j;
    if (l)
    {
      Bundle localBundle2 = c;
      if (localBundle2 == null) {
        return null;
      }
      Bundle localBundle1;
      if (localBundle2.containsKey(paramString)) {
        localBundle1 = Context.get(paramString, localBundle2);
      } else {
        localBundle1 = null;
      }
      localBundle2.remove(paramString);
      if (localBundle2.isEmpty()) {
        c = null;
      }
      return localBundle1;
    }
    throw new IllegalStateException("You can 'consumeRestoredStateForKey' only after the corresponding component has moved to the 'CREATED' state");
  }
  
  public final void a()
  {
    if (j.i)
    {
      Object localObject2 = e;
      Object localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = new b(this);
      }
      e = ((b)localObject1);
      try
      {
        k.class.getDeclaredConstructor(null);
        localObject1 = e;
        if (localObject1 == null) {
          return;
        }
        localObject2 = k.class.getName();
        ((LinkedHashSet)b).add(localObject2);
        return;
      }
      catch (NoSuchMethodException localNoSuchMethodException)
      {
        localObject2 = new StringBuilder("Class ");
        ((StringBuilder)localObject2).append(k.class.getSimpleName());
        ((StringBuilder)localObject2).append(" must have default constructor in order to be automatically recreated");
        throw new IllegalArgumentException(((StringBuilder)localObject2).toString(), localNoSuchMethodException);
      }
    }
    else
    {
      throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
    }
  }
  
  public final void a(String paramString, l paramL)
  {
    Log.get(paramL, "provider");
    a localA = j;
    Element localElement = a;
    try
    {
      if (!h.containsKey(paramString))
      {
        h.put(paramString, paramL);
        return;
      }
    }
    catch (Throwable paramString)
    {
      break label64;
      throw new IllegalArgumentException("SavedStateProvider with the given key is already registered");
      label64:
      throw paramString;
    }
  }
  
  public final l b()
  {
    Object localObject1 = j;
    Element localElement = a;
    try
    {
      Iterator localIterator = h.entrySet().iterator();
      do
      {
        boolean bool = localIterator.hasNext();
        localObject1 = null;
        Object localObject2 = null;
        if (!bool) {
          break;
        }
        Object localObject3 = (Map.Entry)localIterator.next();
        localObject1 = (String)((Map.Entry)localObject3).getKey();
        localObject3 = (l)((Map.Entry)localObject3).getValue();
        bool = Log.equals(localObject1, "androidx.lifecycle.internal.SavedStateHandlesProvider");
        localObject1 = localObject2;
        if (bool) {
          localObject1 = localObject3;
        }
      } while (localObject1 == null);
    }
    catch (Throwable localThrowable)
    {
      break label111;
    }
    return localThrowable;
    label111:
    throw localThrowable;
  }
}
