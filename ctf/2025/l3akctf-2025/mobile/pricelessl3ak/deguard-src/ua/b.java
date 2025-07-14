package ua;

import gr.Frame;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

public final class b
  extends Frame
  implements l
{
  public static final AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(p0.b.class, Object.class, "_state");
  private volatile Object _state;
  public int a;
  
  public b(Object paramObject)
  {
    super();
    _state = paramObject;
  }
  
  /* Error */
  public final void a(Object paramObject)
  {
    // Byte code:
    //   0: aload_1
    //   1: astore 5
    //   3: aload_1
    //   4: ifnonnull +8 -> 12
    //   7: getstatic 40	gr/Frame:g	Lasm/h;
    //   10: astore 5
    //   12: aload_0
    //   13: monitorenter
    //   14: getstatic 27	ua/b:b	Ljava/util/concurrent/atomic/AtomicReferenceFieldUpdater;
    //   17: astore_1
    //   18: aload_1
    //   19: aload_0
    //   20: invokevirtual 44	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   23: aload 5
    //   25: invokestatic 50	params/Log:equals	(Ljava/lang/Object;Ljava/lang/Object;)Z
    //   28: istore 4
    //   30: iload 4
    //   32: ifeq +6 -> 38
    //   35: aload_0
    //   36: monitorexit
    //   37: return
    //   38: aload_1
    //   39: aload_0
    //   40: aload 5
    //   42: invokevirtual 54	java/util/concurrent/atomic/AtomicReferenceFieldUpdater:set	(Ljava/lang/Object;Ljava/lang/Object;)V
    //   45: aload_0
    //   46: getfield 56	ua/b:a	I
    //   49: istore_2
    //   50: iload_2
    //   51: iconst_1
    //   52: iand
    //   53: ifne +55 -> 108
    //   56: iload_2
    //   57: iconst_1
    //   58: iadd
    //   59: istore_2
    //   60: aload_0
    //   61: iload_2
    //   62: putfield 56	ua/b:a	I
    //   65: aload_0
    //   66: monitorexit
    //   67: aload_0
    //   68: monitorenter
    //   69: aload_0
    //   70: getfield 56	ua/b:a	I
    //   73: istore_3
    //   74: iload_3
    //   75: iload_2
    //   76: if_icmpne +17 -> 93
    //   79: aload_0
    //   80: iload_2
    //   81: iconst_1
    //   82: iadd
    //   83: putfield 56	ua/b:a	I
    //   86: aload_0
    //   87: monitorexit
    //   88: return
    //   89: astore_1
    //   90: goto +10 -> 100
    //   93: aload_0
    //   94: monitorexit
    //   95: iload_3
    //   96: istore_2
    //   97: goto -30 -> 67
    //   100: aload_0
    //   101: monitorexit
    //   102: aload_1
    //   103: athrow
    //   104: astore_1
    //   105: goto +13 -> 118
    //   108: aload_0
    //   109: iload_2
    //   110: iconst_2
    //   111: iadd
    //   112: putfield 56	ua/b:a	I
    //   115: aload_0
    //   116: monitorexit
    //   117: return
    //   118: aload_0
    //   119: monitorexit
    //   120: aload_1
    //   121: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	122	0	this	b
    //   0	122	1	paramObject	Object
    //   49	63	2	i	int
    //   73	23	3	j	int
    //   28	3	4	bool	boolean
    //   1	40	5	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   69	74	89	java/lang/Throwable
    //   79	86	89	java/lang/Throwable
    //   14	30	104	java/lang/Throwable
    //   38	50	104	java/lang/Throwable
    //   60	65	104	java/lang/Throwable
    //   108	115	104	java/lang/Throwable
  }
}
