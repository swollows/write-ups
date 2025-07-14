package net;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReference;

public final class ConstrainedOnceSequence
  implements Sequence
{
  public final AtomicReference sequenceRef;
  
  public ConstrainedOnceSequence(Sequence paramSequence)
  {
    sequenceRef = new AtomicReference(paramSequence);
  }
  
  public final Iterator iterator()
  {
    Sequence localSequence = (Sequence)sequenceRef.getAndSet(null);
    if (localSequence != null) {
      return localSequence.iterator();
    }
    throw new IllegalStateException("This sequence can be consumed only once.");
  }
}
