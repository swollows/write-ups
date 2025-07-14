package androidx.fragment.asm;

import android.os.Handler;
import android.os.Looper;
import astuetz.Menu;
import core.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;
import ui.i;

public abstract class h
{
  public misc.ByteVector A;
  public i B;
  public final MonthByWeekFragment.2 C;
  public misc.ByteVector E;
  public final ClassWriter a = new ClassWriter();
  public ArrayList b;
  public final Map c = Collections.synchronizedMap(new HashMap());
  public boolean d;
  public final ByteVector e;
  public c f;
  public final Map g = Collections.synchronizedMap(new HashMap());
  public final Label h = new Label(this);
  public boolean i;
  public final CopyOnWriteArrayList j;
  public final AnnotationWriter k;
  public final ArrayList l = new ArrayList();
  public ArrayList m;
  public final FragmentManagerImpl mFragments = new FragmentManagerImpl(this);
  public boolean mStopped;
  public final AnnotationWriter n;
  public ArrayList o;
  public final p p;
  public ArrayDeque q;
  public Type r;
  public ArrayList s;
  public c t;
  public final AnnotationWriter u;
  public final AnnotationWriter v;
  public final AtomicInteger w = new AtomicInteger();
  public int x;
  public misc.ByteVector y;
  public boolean z;
  
  public h()
  {
    Collections.synchronizedMap(new HashMap());
    new CopyOnWriteArrayList();
    j = new CopyOnWriteArrayList();
    k = new AnnotationWriter(this, 0);
    n = new AnnotationWriter(this, 1);
    v = new AnnotationWriter(this, 2);
    u = new AnnotationWriter(this, 3);
    p = new p(this);
    x = -1;
    e = new ByteVector(this);
    q = new ArrayDeque();
    C = new MonthByWeekFragment.2(this);
  }
  
  public final void a()
  {
    Object localObject1 = l;
    try
    {
      boolean bool2 = l.isEmpty();
      bool1 = true;
      if (!bool2)
      {
        Object localObject2 = h;
        i = true;
        localObject2 = c;
        if (localObject2 != null) {
          ((Menu)localObject2).a();
        }
        return;
      }
    }
    catch (Throwable localThrowable)
    {
      boolean bool1;
      break label131;
      localObject1 = h;
      ArrayList localArrayList = m;
      int i1;
      if (localArrayList != null) {
        i1 = localArrayList.size();
      } else {
        i1 = 0;
      }
      if (i1 <= 0) {
        bool1 = false;
      }
      i = bool1;
      localObject1 = c;
      if (localObject1 != null)
      {
        ((Menu)localObject1).a();
        return;
        label131:
        throw localArrayList;
      }
    }
  }
  
  public final void a(int paramInt)
  {
    try
    {
      z = true;
      Iterator localIterator = a.a.values().iterator();
      Object localObject;
      do
      {
        bool = localIterator.hasNext();
        if (!bool) {
          break;
        }
        localObject = localIterator.next();
      } while (localObject == null);
      throw new ClassCastException();
      a(paramInt, false);
      localIterator = get().iterator();
      boolean bool = localIterator.hasNext();
      if (!bool)
      {
        z = false;
        a(true);
        return;
      }
      ((f)localIterator.next()).e();
      throw new NullPointerException("Null throw statement replaced by Soot");
    }
    catch (Throwable localThrowable)
    {
      z = false;
      throw localThrowable;
    }
  }
  
  public final void a(int paramInt, boolean paramBoolean)
  {
    if ((t == null) && (paramInt != -1)) {
      throw new IllegalStateException("No activity");
    }
    if ((!paramBoolean) && (paramInt == x)) {
      return;
    }
    x = paramInt;
    Object localObject = a;
    Iterator localIterator = c.iterator();
    if (!localIterator.hasNext())
    {
      localIterator = a.values().iterator();
      while (localIterator.hasNext()) {
        if (localIterator.next() != null) {
          throw new ClassCastException();
        }
      }
      localObject = ((ClassWriter)localObject).b().iterator();
      if (!((Iterator)localObject).hasNext()) {
        return;
      }
      ((Iterator)localObject).next().getClass();
      throw new ClassCastException();
    }
    localIterator.next().getClass();
    throw new ClassCastException();
  }
  
  public final void a(ArrayList paramArrayList1, ArrayList paramArrayList2)
  {
    if (paramArrayList1.isEmpty()) {
      return;
    }
    if (paramArrayList1.size() == paramArrayList2.size())
    {
      int i5 = paramArrayList1.size();
      int i1 = 0;
      int i2;
      for (int i3 = 0; i1 < i5; i3 = i2)
      {
        int i4 = i1;
        i2 = i3;
        if (!getr)
        {
          if (i3 != i1) {
            a(paramArrayList1, paramArrayList2, i3, i1);
          }
          i3 = i1 + 1;
          i2 = i3;
          if (((Boolean)paramArrayList2.get(i1)).booleanValue()) {
            for (;;)
            {
              i2 = i3;
              if (i3 >= i5) {
                break;
              }
              i2 = i3;
              if (!((Boolean)paramArrayList2.get(i3)).booleanValue()) {
                break;
              }
              i2 = i3;
              if (getr) {
                break;
              }
              i3 += 1;
            }
          }
          a(paramArrayList1, paramArrayList2, i1, i2);
          i4 = i2 - 1;
        }
        i1 = i4 + 1;
      }
      if (i3 != i5) {
        a(paramArrayList1, paramArrayList2, i3, i5);
      }
    }
    else
    {
      throw new IllegalStateException("Internal error with the back stack records");
    }
  }
  
  public final void a(ArrayList paramArrayList1, ArrayList paramArrayList2, int paramInt1, int paramInt2)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final boolean a(boolean paramBoolean)
  {
    b(paramBoolean);
    paramBoolean = false;
    for (;;)
    {
      ArrayList localArrayList2 = o;
      ArrayList localArrayList3 = s;
      ArrayList localArrayList1 = l;
      int i1;
      try
      {
        if (l.isEmpty()) {
          i1 = 0;
        }
      }
      catch (Throwable localThrowable2)
      {
        break label215;
      }
      try
      {
        int i3 = l.size();
        int i2 = 0;
        for (i1 = 0; i2 < i3; i1 = 1)
        {
          ((m)l.get(i2)).a(localThrowable2, localArrayList3);
          i2 += 1;
        }
        l.clear();
      }
      catch (Throwable localThrowable3) {}
      t.h.removeCallbacks(C);
      if (i1 != 0)
      {
        z = true;
        try
        {
          a(o, s);
          c();
          paramBoolean = true;
        }
        catch (Throwable localThrowable1)
        {
          c();
          throw localThrowable1;
        }
      }
    }
    a();
    a.a.values().removeAll(Collections.singleton(null));
    return paramBoolean;
    l.clear();
    t.h.removeCallbacks(C);
    throw localThrowable3;
    label215:
    throw localThrowable3;
  }
  
  public final void b()
  {
    Object localObject = a;
    ArrayList localArrayList = c;
    int i1 = localArrayList.size() - 1;
    while (i1 >= 0) {
      if (localArrayList.get(i1) == null) {
        i1 -= 1;
      } else {
        throw new ClassCastException();
      }
    }
    localObject = a.values().iterator();
    while (((Iterator)localObject).hasNext()) {
      File.write(((Iterator)localObject).next());
    }
  }
  
  public final void b(boolean paramBoolean)
  {
    if (!z)
    {
      if (t == null)
      {
        if (i) {
          throw new IllegalStateException("FragmentManager has been destroyed");
        }
        throw new IllegalStateException("FragmentManager has not been attached to a host.");
      }
      if (Looper.myLooper() == t.h.getLooper())
      {
        if ((!paramBoolean) && ((d) || (mStopped))) {
          throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
        }
        if (o == null)
        {
          o = new ArrayList();
          s = new ArrayList();
        }
      }
      else
      {
        throw new IllegalStateException("Must be called from main thread of fragment host");
      }
    }
    else
    {
      throw new IllegalStateException("FragmentManager is already executing transactions");
    }
  }
  
  public final void c()
  {
    z = false;
    s.clear();
    o.clear();
  }
  
  public final HashSet get()
  {
    HashSet localHashSet = new HashSet();
    Iterator localIterator = a.b().iterator();
    if (!localIterator.hasNext()) {
      return localHashSet;
    }
    File.write(localIterator.next());
    throw new NullPointerException("Null throw statement replaced by Soot");
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder(128);
    localStringBuilder.append("FragmentManager{");
    localStringBuilder.append(Integer.toHexString(System.identityHashCode(this)));
    localStringBuilder.append(" in ");
    c localC = t;
    if (localC != null)
    {
      localStringBuilder.append(localC.getClass().getSimpleName());
      localStringBuilder.append("{");
      localStringBuilder.append(Integer.toHexString(System.identityHashCode(t)));
      localStringBuilder.append("}");
    }
    else
    {
      localStringBuilder.append("null");
    }
    localStringBuilder.append("}}");
    return localStringBuilder.toString();
  }
}
