package ui;

import accessibility.Frame;
import android.os.Build.VERSION;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.fragment.asm.ClassWriter;
import androidx.fragment.asm.Label;
import androidx.fragment.asm.h;
import androidx.fragment.asm.m;
import collections.LinkedList;
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public final class i
{
  public final LinkedList a;
  public Label c;
  public boolean e;
  public final Runnable q;
  public boolean s;
  public final OnBackInvokedCallback w;
  public OnBackInvokedDispatcher x;
  
  public i(Runnable paramRunnable) {}
  
  public final void a()
  {
    Object localObject2 = c;
    Object localObject1 = localObject2;
    Object localObject3;
    if (localObject2 == null)
    {
      localObject1 = a;
      localObject1.getClass();
      localObject3 = ((AbstractList)localObject1).listIterator(size);
      while (((ListIterator)localObject3).hasPrevious())
      {
        localObject2 = ((ListIterator)localObject3).previous();
        localObject1 = localObject2;
        if (i) {
          break label72;
        }
      }
      localObject1 = null;
      label72:
      localObject1 = (Label)localObject1;
    }
    c = null;
    if (localObject1 != null)
    {
      localObject1 = b;
      ((h)localObject1).a(true);
      if (h.i)
      {
        ((h)localObject1).a(false);
        ((h)localObject1).b(true);
        localObject2 = o;
        localObject3 = s;
        ArrayList localArrayList = m;
        int i;
        if ((localArrayList != null) && (!localArrayList.isEmpty())) {
          i = m.size() - 1;
        } else {
          i = -1;
        }
        if (i >= 0)
        {
          int j = m.size() - 1;
          while (j >= i)
          {
            ((ArrayList)localObject2).add((m)m.remove(j));
            ((ArrayList)localObject3).add(Boolean.TRUE);
            j -= 1;
          }
          z = true;
        }
        try
        {
          ((h)localObject1).a(o, s);
          ((h)localObject1).c();
          ((h)localObject1).a();
          a.a.values().removeAll(Collections.singleton(null));
          return;
        }
        catch (Throwable localThrowable)
        {
          ((h)localObject1).c();
          throw localThrowable;
        }
      }
      B.a();
      return;
    }
    q.run();
  }
  
  public final void a(boolean paramBoolean)
  {
    OnBackInvokedDispatcher localOnBackInvokedDispatcher = x;
    OnBackInvokedCallback localOnBackInvokedCallback = w;
    if ((localOnBackInvokedDispatcher != null) && (localOnBackInvokedCallback != null))
    {
      if ((paramBoolean) && (!s))
      {
        Frame.append(localOnBackInvokedDispatcher, localOnBackInvokedCallback);
        s = true;
        return;
      }
      if ((!paramBoolean) && (s))
      {
        Frame.set(localOnBackInvokedDispatcher, localOnBackInvokedCallback);
        s = false;
      }
    }
  }
  
  public final void b()
  {
    boolean bool3 = e;
    boolean bool2 = false;
    Object localObject = a;
    boolean bool1;
    if ((localObject != null) && (((Collection)localObject).isEmpty()))
    {
      bool1 = bool2;
    }
    else
    {
      localObject = ((Iterable)localObject).iterator();
      do
      {
        bool1 = bool2;
        if (!((Iterator)localObject).hasNext()) {
          break;
        }
      } while (!nexti);
      bool1 = true;
    }
    e = bool1;
    if ((bool1 != bool3) && (Build.VERSION.SDK_INT >= 33)) {
      a(bool1);
    }
  }
  
  public final void draw()
  {
    if (c == null)
    {
      Object localObject1 = a;
      ListIterator localListIterator = ((List)localObject1).listIterator(((List)localObject1).size());
      while (localListIterator.hasPrevious())
      {
        Object localObject2 = localListIterator.previous();
        localObject1 = localObject2;
        if (i) {
          break label58;
        }
      }
      localObject1 = null;
      label58:
      localObject1 = (Label)localObject1;
    }
    c = null;
  }
}
