package androidx.fragment.asm;

import java.util.Iterator;
import java.util.List;

public final class FragmentController
{
  public final c mFragments;
  
  public FragmentController(c paramC)
  {
    mFragments = paramC;
  }
  
  public final void d()
  {
    Object localObject = mFragments.d;
    if (t == null) {
      return;
    }
    d = false;
    mStopped = false;
    r.getClass();
    localObject = a.get().iterator();
    while (((Iterator)localObject).hasNext()) {
      if (((Iterator)localObject).next() != null) {
        throw new ClassCastException();
      }
    }
  }
}
