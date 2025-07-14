package core;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build.VERSION;
import app.Element;
import concurrent.AbstractFuture;
import concurrent.Futures.NonCancellationPropagatingFuture;
import internal.Label;

public abstract class Frame
{
  public static Element a;
  public static final Object b;
  public static final Futures.NonCancellationPropagatingFuture min;
  
  static
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  /* Error */
  public static void a(Context paramContext, boolean paramBoolean)
  {
    // Byte code:
    //   0: iload_1
    //   1: ifne +10 -> 11
    //   4: getstatic 32	core/Frame:a	Lapp/Element;
    //   7: ifnull +4 -> 11
    //   10: return
    //   11: getstatic 34	core/Frame:b	Ljava/lang/Object;
    //   14: astore 14
    //   16: aload 14
    //   18: monitorenter
    //   19: iload_1
    //   20: ifne +17 -> 37
    //   23: getstatic 32	core/Frame:a	Lapp/Element;
    //   26: ifnull +11 -> 37
    //   29: aload 14
    //   31: monitorexit
    //   32: return
    //   33: astore_0
    //   34: goto +386 -> 420
    //   37: iconst_0
    //   38: istore 5
    //   40: aload_0
    //   41: invokevirtual 40	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   44: ldc 42
    //   46: invokevirtual 48	android/content/res/AssetManager:openFd	(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
    //   49: astore 16
    //   51: aload 16
    //   53: invokevirtual 54	android/content/res/AssetFileDescriptor:getLength	()J
    //   56: lstore 8
    //   58: lload 8
    //   60: lconst_0
    //   61: lcmp
    //   62: ifle +8 -> 70
    //   65: iconst_1
    //   66: istore_2
    //   67: goto +5 -> 72
    //   70: iconst_0
    //   71: istore_2
    //   72: aload 16
    //   74: invokevirtual 57	android/content/res/AssetFileDescriptor:close	()V
    //   77: goto +32 -> 109
    //   80: astore 15
    //   82: aload 16
    //   84: ifnull +20 -> 104
    //   87: aload 16
    //   89: invokevirtual 57	android/content/res/AssetFileDescriptor:close	()V
    //   92: goto +12 -> 104
    //   95: astore 16
    //   97: aload 15
    //   99: aload 16
    //   101: invokevirtual 61	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   104: aload 15
    //   106: athrow
    //   107: iconst_0
    //   108: istore_2
    //   109: getstatic 67	android/os/Build$VERSION:SDK_INT	I
    //   112: istore_3
    //   113: iload_3
    //   114: bipush 28
    //   116: if_icmplt +296 -> 412
    //   119: iload_3
    //   120: bipush 30
    //   122: if_icmpne +6 -> 128
    //   125: goto +287 -> 412
    //   128: new 69	java/io/File
    //   131: dup
    //   132: new 69	java/io/File
    //   135: dup
    //   136: ldc 71
    //   138: aload_0
    //   139: invokevirtual 75	android/content/Context:getPackageName	()Ljava/lang/String;
    //   142: invokespecial 78	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   145: ldc 80
    //   147: invokespecial 83	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   150: astore 15
    //   152: aload 15
    //   154: invokevirtual 86	java/io/File:length	()J
    //   157: lstore 8
    //   159: aload 15
    //   161: invokevirtual 90	java/io/File:exists	()Z
    //   164: ifeq +288 -> 452
    //   167: lload 8
    //   169: lconst_0
    //   170: lcmp
    //   171: ifle +281 -> 452
    //   174: iconst_1
    //   175: istore_3
    //   176: goto +3 -> 179
    //   179: new 69	java/io/File
    //   182: dup
    //   183: new 69	java/io/File
    //   186: dup
    //   187: ldc 92
    //   189: aload_0
    //   190: invokevirtual 75	android/content/Context:getPackageName	()Ljava/lang/String;
    //   193: invokespecial 78	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   196: ldc 80
    //   198: invokespecial 83	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   201: astore 15
    //   203: aload 15
    //   205: invokevirtual 86	java/io/File:length	()J
    //   208: lstore 10
    //   210: aload 15
    //   212: invokevirtual 90	java/io/File:exists	()Z
    //   215: istore 7
    //   217: iload 7
    //   219: ifeq +16 -> 235
    //   222: lload 10
    //   224: lconst_0
    //   225: lcmp
    //   226: ifle +9 -> 235
    //   229: iconst_1
    //   230: istore 4
    //   232: goto +6 -> 238
    //   235: iconst_0
    //   236: istore 4
    //   238: aload_0
    //   239: invokestatic 96	core/Frame:init	(Landroid/content/Context;)J
    //   242: lstore 12
    //   244: new 69	java/io/File
    //   247: dup
    //   248: aload_0
    //   249: invokevirtual 100	android/content/Context:getFilesDir	()Ljava/io/File;
    //   252: ldc 102
    //   254: invokespecial 83	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   257: astore 15
    //   259: aload 15
    //   261: invokevirtual 90	java/io/File:exists	()Z
    //   264: istore 7
    //   266: iload 7
    //   268: ifeq +20 -> 288
    //   271: aload 15
    //   273: invokestatic 108	core/Type:read	(Ljava/io/File;)Lcore/Type;
    //   276: astore_0
    //   277: goto +13 -> 290
    //   280: invokestatic 112	core/Frame:set	()Lapp/Element;
    //   283: pop
    //   284: aload 14
    //   286: monitorexit
    //   287: return
    //   288: aconst_null
    //   289: astore_0
    //   290: aload_0
    //   291: ifnull +172 -> 463
    //   294: aload_0
    //   295: getfield 115	core/Type:b	J
    //   298: lload 12
    //   300: lcmp
    //   301: ifne +162 -> 463
    //   304: aload_0
    //   305: getfield 117	core/Type:a	I
    //   308: istore 6
    //   310: iload 6
    //   312: iconst_2
    //   313: if_icmpne +144 -> 457
    //   316: goto +147 -> 463
    //   319: iload_3
    //   320: istore_2
    //   321: aload_0
    //   322: ifnull +37 -> 359
    //   325: iload_3
    //   326: istore_2
    //   327: aload_0
    //   328: getfield 117	core/Type:a	I
    //   331: iconst_2
    //   332: if_icmpne +27 -> 359
    //   335: iload_3
    //   336: istore_2
    //   337: iload_3
    //   338: iconst_1
    //   339: if_icmpne +20 -> 359
    //   342: iload_3
    //   343: istore_2
    //   344: lload 8
    //   346: aload_0
    //   347: getfield 120	core/Type:d	J
    //   350: lcmp
    //   351: ifge +8 -> 359
    //   354: iconst_3
    //   355: istore_2
    //   356: goto +3 -> 359
    //   359: new 104	core/Type
    //   362: dup
    //   363: iconst_1
    //   364: iload_2
    //   365: lload 12
    //   367: lload 10
    //   369: invokespecial 123	core/Type:<init>	(IIJJ)V
    //   372: astore 16
    //   374: aload_0
    //   375: ifnull +14 -> 389
    //   378: aload_0
    //   379: aload 16
    //   381: invokevirtual 127	core/Type:equals	(Ljava/lang/Object;)Z
    //   384: istore_1
    //   385: iload_1
    //   386: ifne +10 -> 396
    //   389: aload 16
    //   391: aload 15
    //   393: invokevirtual 130	core/Type:a	(Ljava/io/File;)V
    //   396: invokestatic 112	core/Frame:set	()Lapp/Element;
    //   399: pop
    //   400: aload 14
    //   402: monitorexit
    //   403: return
    //   404: invokestatic 112	core/Frame:set	()Lapp/Element;
    //   407: pop
    //   408: aload 14
    //   410: monitorexit
    //   411: return
    //   412: invokestatic 112	core/Frame:set	()Lapp/Element;
    //   415: pop
    //   416: aload 14
    //   418: monitorexit
    //   419: return
    //   420: aload 14
    //   422: monitorexit
    //   423: aload_0
    //   424: athrow
    //   425: astore 15
    //   427: goto -320 -> 107
    //   430: astore 15
    //   432: goto -325 -> 107
    //   435: astore 15
    //   437: goto -330 -> 107
    //   440: astore_0
    //   441: goto -37 -> 404
    //   444: astore_0
    //   445: goto -165 -> 280
    //   448: astore_0
    //   449: goto -53 -> 396
    //   452: iconst_0
    //   453: istore_3
    //   454: goto -275 -> 179
    //   457: iload 6
    //   459: istore_2
    //   460: goto +32 -> 492
    //   463: iload_2
    //   464: ifne +9 -> 473
    //   467: ldc -125
    //   469: istore_2
    //   470: goto +22 -> 492
    //   473: iload_3
    //   474: ifeq +8 -> 482
    //   477: iconst_1
    //   478: istore_2
    //   479: goto +13 -> 492
    //   482: iload 5
    //   484: istore_2
    //   485: iload 4
    //   487: ifeq +5 -> 492
    //   490: iconst_2
    //   491: istore_2
    //   492: iload_2
    //   493: istore_3
    //   494: iload_1
    //   495: ifeq -176 -> 319
    //   498: iload_2
    //   499: istore_3
    //   500: iload 4
    //   502: ifeq -183 -> 319
    //   505: iload_2
    //   506: istore_3
    //   507: iload_2
    //   508: iconst_1
    //   509: if_icmpeq -190 -> 319
    //   512: iconst_2
    //   513: istore_3
    //   514: goto -195 -> 319
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	517	0	paramContext	Context
    //   0	517	1	paramBoolean	boolean
    //   66	444	2	i	int
    //   112	402	3	j	int
    //   230	271	4	k	int
    //   38	445	5	m	int
    //   308	150	6	n	int
    //   215	52	7	bool	boolean
    //   56	289	8	l1	long
    //   208	160	10	l2	long
    //   242	124	12	l3	long
    //   14	407	14	localObject	Object
    //   80	25	15	localThrowable1	Throwable
    //   150	242	15	localFile	java.io.File
    //   425	1	15	localIOException1	java.io.IOException
    //   430	1	15	localIOException2	java.io.IOException
    //   435	1	15	localIOException3	java.io.IOException
    //   49	39	16	localAssetFileDescriptor	android.content.res.AssetFileDescriptor
    //   95	5	16	localThrowable2	Throwable
    //   372	18	16	localType	Type
    // Exception table:
    //   from	to	target	type
    //   23	32	33	java/lang/Throwable
    //   40	51	33	java/lang/Throwable
    //   72	77	33	java/lang/Throwable
    //   97	104	33	java/lang/Throwable
    //   104	107	33	java/lang/Throwable
    //   109	113	33	java/lang/Throwable
    //   128	167	33	java/lang/Throwable
    //   179	217	33	java/lang/Throwable
    //   238	244	33	java/lang/Throwable
    //   244	266	33	java/lang/Throwable
    //   271	277	33	java/lang/Throwable
    //   280	287	33	java/lang/Throwable
    //   294	310	33	java/lang/Throwable
    //   327	335	33	java/lang/Throwable
    //   344	354	33	java/lang/Throwable
    //   359	374	33	java/lang/Throwable
    //   378	385	33	java/lang/Throwable
    //   389	396	33	java/lang/Throwable
    //   396	403	33	java/lang/Throwable
    //   404	411	33	java/lang/Throwable
    //   412	419	33	java/lang/Throwable
    //   420	423	33	java/lang/Throwable
    //   51	58	80	java/lang/Throwable
    //   87	92	95	java/lang/Throwable
    //   40	51	425	java/io/IOException
    //   72	77	430	java/io/IOException
    //   97	104	435	java/io/IOException
    //   104	107	435	java/io/IOException
    //   238	244	440	android/content/pm/PackageManager$NameNotFoundException
    //   271	277	444	java/io/IOException
    //   389	396	448	java/io/IOException
  }
  
  public static long init(Context paramContext)
  {
    PackageManager localPackageManager = paramContext.getApplicationContext().getPackageManager();
    if (Build.VERSION.SDK_INT >= 33) {
      return getPackageInfolastUpdateTime;
    }
    return getPackageInfogetPackageName0lastUpdateTime;
  }
  
  public static Element set()
  {
    Element localElement = new Element(12);
    a = localElement;
    Futures.NonCancellationPropagatingFuture localNonCancellationPropagatingFuture = min;
    localNonCancellationPropagatingFuture.getClass();
    if (AbstractFuture.this$0.set(localNonCancellationPropagatingFuture, null, localElement)) {
      AbstractFuture.get(localNonCancellationPropagatingFuture);
    }
    return a;
  }
}
