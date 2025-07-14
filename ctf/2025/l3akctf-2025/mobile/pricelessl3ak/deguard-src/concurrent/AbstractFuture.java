package concurrent;

import internal.Label;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Delayed;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

public abstract class AbstractFuture
  implements Future
{
  public static final boolean GENERATE_CANCELLATION_CAUSES;
  public static final Logger log;
  public static final Object sync;
  public static final Label this$0;
  public volatile AbstractFuture.Waiter next;
  public volatile State size;
  public volatile Object value;
  
  static
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public static Object get(Object paramObject)
  {
    if (!(paramObject instanceof ClassWriter))
    {
      if (!(paramObject instanceof MergeStrategy))
      {
        if (paramObject == sync) {
          return null;
        }
      }
      else
      {
        ((MergeStrategy)paramObject).getClass();
        throw new ExecutionException(null);
      }
    }
    else
    {
      paramObject = thrown;
      CancellationException localCancellationException = new CancellationException("Task was cancelled.");
      localCancellationException.initCause(paramObject);
      throw localCancellationException;
    }
    return paramObject;
  }
  
  public static void get(AbstractFuture paramAbstractFuture)
  {
    do
    {
      localObject1 = next;
    } while (!this$0.add(paramAbstractFuture, (AbstractFuture.Waiter)localObject1, AbstractFuture.Waiter.TOMBSTONE));
    Object localObject2;
    while (localObject1 != null)
    {
      localObject2 = thread;
      if (localObject2 != null)
      {
        thread = null;
        LockSupport.unpark((Thread)localObject2);
      }
      localObject1 = next;
    }
    do
    {
      localObject2 = size;
    } while (!this$0.set(paramAbstractFuture, (State)localObject2));
    Object localObject1 = null;
    for (paramAbstractFuture = (AbstractFuture)localObject2;; paramAbstractFuture = (AbstractFuture)localObject2)
    {
      localObject2 = localObject1;
      if (paramAbstractFuture == null) {
        break;
      }
      localObject2 = state;
      state = ((State)localObject1);
      localObject1 = paramAbstractFuture;
    }
    for (;;)
    {
      if (localObject2 == null) {
        return;
      }
      localObject2 = state;
      try
      {
        throw new NullPointerException("Null throw statement replaced by Soot");
      }
      catch (RuntimeException paramAbstractFuture)
      {
        localObject1 = Level.SEVERE;
        log.log((Level)localObject1, "RuntimeException while executing runnable null with executor null", paramAbstractFuture);
      }
    }
  }
  
  public static Object set(AbstractFuture paramAbstractFuture)
  {
    int i = 0;
    try
    {
      Object localObject = paramAbstractFuture.get();
      if (i != 0)
      {
        Thread.currentThread().interrupt();
        return localObject;
      }
    }
    catch (Throwable paramAbstractFuture)
    {
      for (;;)
      {
        if (i != 0) {
          Thread.currentThread().interrupt();
        }
        throw paramAbstractFuture;
        i = 1;
      }
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
      return localInterruptedException;
    }
  }
  
  public final boolean cancel(boolean paramBoolean)
  {
    Object localObject = value;
    if (localObject == null)
    {
      ClassWriter localClassWriter;
      if (GENERATE_CANCELLATION_CAUSES) {
        localClassWriter = new ClassWriter(paramBoolean, new CancellationException("Future.cancel() was called."));
      } else if (paramBoolean) {
        localClassWriter = ClassWriter.b;
      } else {
        localClassWriter = ClassWriter.a;
      }
      if (this$0.set(this, localObject, localClassWriter))
      {
        get(this);
        return true;
      }
    }
    return false;
  }
  
  public final Object get()
  {
    if (!Thread.interrupted())
    {
      Object localObject1 = value;
      if (localObject1 != null) {
        return get(localObject1);
      }
      localObject1 = next;
      AbstractFuture.Waiter localWaiter2 = AbstractFuture.Waiter.TOMBSTONE;
      if (localObject1 != localWaiter2)
      {
        AbstractFuture.Waiter localWaiter1 = new AbstractFuture.Waiter();
        Object localObject2;
        do
        {
          localObject2 = this$0;
          ((Label)localObject2).putNext(localWaiter1, (AbstractFuture.Waiter)localObject1);
          if (((Label)localObject2).add(this, (AbstractFuture.Waiter)localObject1, localWaiter1))
          {
            do
            {
              LockSupport.park(this);
              if (Thread.interrupted()) {
                break;
              }
              localObject1 = value;
            } while (localObject1 == null);
            return get(localObject1);
            removeWaiter(localWaiter1);
            throw new InterruptedException();
          }
          localObject2 = next;
          localObject1 = localObject2;
        } while (localObject2 != localWaiter2);
      }
      return get(value);
    }
    throw new InterruptedException();
  }
  
  public final Object get(long paramLong, TimeUnit paramTimeUnit)
  {
    long l4 = paramTimeUnit.toNanos(paramLong);
    long l1 = l4;
    if (!Thread.interrupted())
    {
      Object localObject1 = value;
      if (localObject1 != null) {
        return get(localObject1);
      }
      long l3;
      if (l4 > 0L) {
        l3 = System.nanoTime() + l4;
      } else {
        l3 = 0L;
      }
      long l2 = l1;
      if (l4 >= 1000L)
      {
        localObject1 = next;
        localObject4 = AbstractFuture.Waiter.TOMBSTONE;
        if (localObject1 != localObject4)
        {
          localObject3 = new AbstractFuture.Waiter();
          do
          {
            localObject2 = this$0;
            ((Label)localObject2).putNext((AbstractFuture.Waiter)localObject3, (AbstractFuture.Waiter)localObject1);
            if (((Label)localObject2).add(this, (AbstractFuture.Waiter)localObject1, (AbstractFuture.Waiter)localObject3))
            {
              do
              {
                LockSupport.parkNanos(this, l1);
                if (Thread.interrupted()) {
                  break;
                }
                localObject1 = value;
                if (localObject1 != null) {
                  return get(localObject1);
                }
                l2 = l3 - System.nanoTime();
                l1 = l2;
              } while (l2 >= 1000L);
              removeWaiter((AbstractFuture.Waiter)localObject3);
              break;
              removeWaiter((AbstractFuture.Waiter)localObject3);
              throw new InterruptedException();
            }
            localObject2 = next;
            localObject1 = localObject2;
          } while (localObject2 != localObject4);
        }
        return get(value);
      }
      while (l2 > 0L)
      {
        localObject1 = value;
        if (localObject1 != null) {
          return get(localObject1);
        }
        if (!Thread.interrupted()) {
          l2 = l3 - System.nanoTime();
        } else {
          throw new InterruptedException();
        }
      }
      Object localObject3 = toString();
      Object localObject2 = paramTimeUnit.toString();
      localObject1 = Locale.ROOT;
      Object localObject4 = ((String)localObject2).toLowerCase((Locale)localObject1);
      localObject2 = new StringBuilder("Waited ");
      ((StringBuilder)localObject2).append(paramLong);
      ((StringBuilder)localObject2).append(" ");
      ((StringBuilder)localObject2).append(paramTimeUnit.toString().toLowerCase((Locale)localObject1));
      localObject2 = ((StringBuilder)localObject2).toString();
      localObject1 = localObject2;
      if (l2 + 1000L < 0L)
      {
        localObject1 = new StringBuilder();
        ((StringBuilder)localObject1).append((String)localObject2);
        ((StringBuilder)localObject1).append(" (plus ");
        localObject2 = ((StringBuilder)localObject1).toString();
        localObject1 = localObject2;
        l1 = -l2;
        paramLong = paramTimeUnit.convert(l1, TimeUnit.NANOSECONDS);
        l1 -= paramTimeUnit.toNanos(paramLong);
        boolean bool = paramLong < 0L;
        int i;
        if ((bool) && (l1 <= 1000L)) {
          i = 0;
        } else {
          i = 1;
        }
        paramTimeUnit = (TimeUnit)localObject1;
        if (bool)
        {
          paramTimeUnit = new StringBuilder();
          paramTimeUnit.append((String)localObject2);
          paramTimeUnit.append(paramLong);
          paramTimeUnit.append(" ");
          paramTimeUnit.append((String)localObject4);
          localObject1 = paramTimeUnit.toString();
          paramTimeUnit = (TimeUnit)localObject1;
          if (i != 0)
          {
            paramTimeUnit = new StringBuilder();
            paramTimeUnit.append((String)localObject1);
            paramTimeUnit.append(",");
            paramTimeUnit = paramTimeUnit.toString();
          }
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append(paramTimeUnit);
          ((StringBuilder)localObject1).append(" ");
          paramTimeUnit = ((StringBuilder)localObject1).toString();
        }
        localObject1 = paramTimeUnit;
        if (i != 0)
        {
          localObject1 = new StringBuilder();
          ((StringBuilder)localObject1).append(paramTimeUnit);
          ((StringBuilder)localObject1).append(l1);
          ((StringBuilder)localObject1).append(" nanoseconds ");
          localObject1 = ((StringBuilder)localObject1).toString();
        }
        paramTimeUnit = new StringBuilder();
        paramTimeUnit.append((String)localObject1);
        paramTimeUnit.append("delay)");
        localObject1 = paramTimeUnit.toString();
      }
      if (isDone())
      {
        paramTimeUnit = new StringBuilder();
        paramTimeUnit.append((String)localObject1);
        paramTimeUnit.append(" but future completed as timeout expired");
        throw new TimeoutException(paramTimeUnit.toString());
      }
      paramTimeUnit = new StringBuilder();
      paramTimeUnit.append((String)localObject1);
      paramTimeUnit.append(" for ");
      paramTimeUnit.append((String)localObject3);
      throw new TimeoutException(paramTimeUnit.toString());
    }
    throw new InterruptedException();
  }
  
  public final boolean isCancelled()
  {
    return value instanceof ClassWriter;
  }
  
  public final boolean isDone()
  {
    return value != null;
  }
  
  public final void removeWaiter(AbstractFuture.Waiter paramWaiter)
  {
    thread = null;
    paramWaiter = next;
    if (paramWaiter == AbstractFuture.Waiter.TOMBSTONE) {
      return;
    }
    Object localObject2;
    for (Object localObject1 = null;; localObject1 = localObject2)
    {
      if (paramWaiter == null) {
        return;
      }
      AbstractFuture.Waiter localWaiter = next;
      if (thread != null)
      {
        localObject2 = paramWaiter;
      }
      else
      {
        if (localObject1 != null)
        {
          next = localWaiter;
          localObject2 = localObject1;
          if (thread != null) {
            break label82;
          }
          break;
        }
        localObject2 = localObject1;
        if (!this$0.add(this, paramWaiter, localWaiter)) {
          break;
        }
      }
      label82:
      paramWaiter = localWaiter;
    }
  }
  
  public final void set(StringBuilder paramStringBuilder)
  {
    try
    {
      try
      {
        Object localObject = set(this);
        paramStringBuilder.append("SUCCESS, result=[");
        if (localObject == this) {
          localObject = "this future";
        } else {
          localObject = String.valueOf(localObject);
        }
        paramStringBuilder.append((String)localObject);
        paramStringBuilder.append("]");
        return;
      }
      catch (RuntimeException localRuntimeException) {}catch (ExecutionException localExecutionException) {}
      paramStringBuilder.append("UNKNOWN, cause=[");
      paramStringBuilder.append(localExecutionException.getClass());
      paramStringBuilder.append(" thrown from get()]");
      return;
    }
    catch (CancellationException localCancellationException)
    {
      for (;;) {}
    }
    paramStringBuilder.append("CANCELLED");
    return;
    paramStringBuilder.append("FAILURE, cause=[");
    paramStringBuilder.append(localExecutionException.getCause());
    paramStringBuilder.append("]");
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.toString());
    localStringBuilder.append("[status=");
    if ((value instanceof ClassWriter))
    {
      localStringBuilder.append("CANCELLED");
    }
    else if (isDone())
    {
      set(localStringBuilder);
    }
    else
    {
      if ((this instanceof ScheduledFuture)) {}
      String str;
      try
      {
        localObject1 = new StringBuilder("remaining delay=[");
        localObject2 = (ScheduledFuture)this;
        TimeUnit localTimeUnit = TimeUnit.MILLISECONDS;
        ((StringBuilder)localObject1).append(((Delayed)localObject2).getDelay(localTimeUnit));
        ((StringBuilder)localObject1).append(" ms]");
        localObject1 = ((StringBuilder)localObject1).toString();
      }
      catch (RuntimeException localRuntimeException)
      {
        Object localObject1;
        Object localObject2 = new StringBuilder("Exception thrown from implementation: ");
        ((StringBuilder)localObject2).append(localRuntimeException.getClass());
        str = ((StringBuilder)localObject2).toString();
      }
      localObject1 = null;
      if ((str != null) && (!str.isEmpty()))
      {
        localStringBuilder.append("PENDING, info=[");
        localStringBuilder.append(str);
        localStringBuilder.append("]");
      }
      else if (isDone())
      {
        set(localStringBuilder);
      }
      else
      {
        localStringBuilder.append("PENDING");
      }
    }
    localStringBuilder.append("]");
    return localStringBuilder.toString();
  }
}
