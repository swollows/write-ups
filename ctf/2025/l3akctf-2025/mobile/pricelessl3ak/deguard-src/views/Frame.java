package views;

import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.res.Resources;
import http.Label;

public abstract class Frame
{
  public static final Label list;
  public static final DeviceListFragment.1 values;
  
  static
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  /* Error */
  public static Attribute get(android.content.Context paramContext, java.util.List paramList)
  {
    // Byte code:
    //   0: ldc 27
    //   2: invokestatic 32	drupal/Context:add	(Ljava/lang/String;)V
    //   5: new 34	java/util/ArrayList
    //   8: dup
    //   9: invokespecial 36	java/util/ArrayList:<init>	()V
    //   12: astore 4
    //   14: iconst_0
    //   15: istore_2
    //   16: aload_1
    //   17: invokeinterface 42 1 0
    //   22: istore_3
    //   23: iload_2
    //   24: iload_3
    //   25: if_icmpge +76 -> 101
    //   28: aload_1
    //   29: iload_2
    //   30: invokeinterface 45 2 0
    //   35: checkcast 47	views/Context
    //   38: astore 5
    //   40: aload_0
    //   41: invokevirtual 53	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   44: aload 5
    //   46: aload_0
    //   47: invokevirtual 57	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   50: invokestatic 61	views/Frame:init	(Landroid/content/pm/PackageManager;Lviews/Context;Landroid/content/res/Resources;)Landroid/content/pm/ProviderInfo;
    //   53: astore 6
    //   55: aload 6
    //   57: ifnonnull +16 -> 73
    //   60: new 63	views/Attribute
    //   63: dup
    //   64: invokespecial 64	views/Attribute:<init>	()V
    //   67: astore_0
    //   68: invokestatic 69	android/os/Trace:endSection	()V
    //   71: aload_0
    //   72: areturn
    //   73: aload 4
    //   75: aload_0
    //   76: aload 5
    //   78: aload 6
    //   80: getfield 75	android/content/pm/ProviderInfo:authority	Ljava/lang/String;
    //   83: invokestatic 79	views/Frame:load	(Landroid/content/Context;Lviews/Context;Ljava/lang/String;)[Lviews/Item;
    //   86: invokevirtual 82	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   89: pop
    //   90: iload_2
    //   91: iconst_1
    //   92: iadd
    //   93: istore_2
    //   94: goto -78 -> 16
    //   97: astore_0
    //   98: goto +18 -> 116
    //   101: new 63	views/Attribute
    //   104: dup
    //   105: aload 4
    //   107: invokespecial 85	views/Attribute:<init>	(Ljava/util/ArrayList;)V
    //   110: astore_0
    //   111: invokestatic 69	android/os/Trace:endSection	()V
    //   114: aload_0
    //   115: areturn
    //   116: invokestatic 69	android/os/Trace:endSection	()V
    //   119: aload_0
    //   120: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	121	0	paramContext	android.content.Context
    //   0	121	1	paramList	java.util.List
    //   15	79	2	i	int
    //   22	4	3	j	int
    //   12	94	4	localArrayList	java.util.ArrayList
    //   38	39	5	localContext	Context
    //   53	26	6	localProviderInfo	ProviderInfo
    // Exception table:
    //   from	to	target	type
    //   5	14	97	java/lang/Throwable
    //   16	23	97	java/lang/Throwable
    //   28	55	97	java/lang/Throwable
    //   60	68	97	java/lang/Throwable
    //   73	90	97	java/lang/Throwable
    //   101	111	97	java/lang/Throwable
  }
  
  public static ProviderInfo init(PackageManager paramPackageManager, Context paramContext, Resources paramResources)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  /* Error */
  public static Item[] load(android.content.Context paramContext, Context paramContext1, String paramString)
  {
    // Byte code:
    //   0: ldc 89
    //   2: invokestatic 32	drupal/Context:add	(Ljava/lang/String;)V
    //   5: new 34	java/util/ArrayList
    //   8: dup
    //   9: invokespecial 36	java/util/ArrayList:<init>	()V
    //   12: astore 14
    //   14: new 91	android/net/Uri$Builder
    //   17: dup
    //   18: invokespecial 92	android/net/Uri$Builder:<init>	()V
    //   21: ldc 94
    //   23: invokevirtual 98	android/net/Uri$Builder:scheme	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   26: aload_2
    //   27: invokevirtual 100	android/net/Uri$Builder:authority	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   30: invokevirtual 104	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   33: astore 16
    //   35: new 91	android/net/Uri$Builder
    //   38: dup
    //   39: invokespecial 92	android/net/Uri$Builder:<init>	()V
    //   42: ldc 94
    //   44: invokevirtual 98	android/net/Uri$Builder:scheme	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   47: aload_2
    //   48: invokevirtual 100	android/net/Uri$Builder:authority	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   51: ldc 106
    //   53: invokevirtual 109	android/net/Uri$Builder:appendPath	(Ljava/lang/String;)Landroid/net/Uri$Builder;
    //   56: invokevirtual 104	android/net/Uri$Builder:build	()Landroid/net/Uri;
    //   59: astore 18
    //   61: aload_0
    //   62: invokevirtual 113	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   65: aload 16
    //   67: invokevirtual 119	android/content/ContentResolver:acquireUnstableContentProviderClient	(Landroid/net/Uri;)Landroid/content/ContentProviderClient;
    //   70: astore 17
    //   72: aconst_null
    //   73: astore_0
    //   74: aconst_null
    //   75: astore 15
    //   77: aload_0
    //   78: astore_2
    //   79: ldc 121
    //   81: invokestatic 32	drupal/Context:add	(Ljava/lang/String;)V
    //   84: aload_1
    //   85: getfield 124	views/Context:s	Ljava/lang/String;
    //   88: astore_1
    //   89: aload 17
    //   91: ifnonnull +9 -> 100
    //   94: aload 15
    //   96: astore_0
    //   97: goto +82 -> 179
    //   100: aload 17
    //   102: aload 16
    //   104: bipush 7
    //   106: anewarray 126	java/lang/String
    //   109: dup
    //   110: iconst_0
    //   111: ldc -128
    //   113: aastore
    //   114: dup
    //   115: iconst_1
    //   116: ldc -126
    //   118: aastore
    //   119: dup
    //   120: iconst_2
    //   121: ldc -124
    //   123: aastore
    //   124: dup
    //   125: iconst_3
    //   126: ldc -122
    //   128: aastore
    //   129: dup
    //   130: iconst_4
    //   131: ldc -120
    //   133: aastore
    //   134: dup
    //   135: iconst_5
    //   136: ldc -118
    //   138: aastore
    //   139: dup
    //   140: bipush 6
    //   142: ldc -116
    //   144: aastore
    //   145: ldc -114
    //   147: iconst_1
    //   148: anewarray 126	java/lang/String
    //   151: dup
    //   152: iconst_0
    //   153: aload_1
    //   154: aastore
    //   155: aconst_null
    //   156: aconst_null
    //   157: invokevirtual 148	android/content/ContentProviderClient:query	(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/database/Cursor;
    //   160: astore_1
    //   161: aload_1
    //   162: astore_0
    //   163: goto +16 -> 179
    //   166: astore_1
    //   167: ldc -106
    //   169: ldc -104
    //   171: aload_1
    //   172: invokestatic 158	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   175: pop
    //   176: aload 15
    //   178: astore_0
    //   179: aload_0
    //   180: astore_2
    //   181: invokestatic 69	android/os/Trace:endSection	()V
    //   184: aload 14
    //   186: astore_1
    //   187: aload_0
    //   188: ifnull +302 -> 490
    //   191: aload_0
    //   192: astore_2
    //   193: aload_0
    //   194: invokeinterface 163 1 0
    //   199: istore_3
    //   200: aload 14
    //   202: astore_1
    //   203: iload_3
    //   204: ifle +286 -> 490
    //   207: aload_0
    //   208: astore_2
    //   209: aload_0
    //   210: ldc -116
    //   212: invokeinterface 167 2 0
    //   217: istore 6
    //   219: aload_0
    //   220: astore_2
    //   221: new 34	java/util/ArrayList
    //   224: dup
    //   225: invokespecial 36	java/util/ArrayList:<init>	()V
    //   228: astore 14
    //   230: aload_0
    //   231: astore_2
    //   232: aload_0
    //   233: ldc -128
    //   235: invokeinterface 167 2 0
    //   240: istore 7
    //   242: aload_0
    //   243: astore_2
    //   244: aload_0
    //   245: ldc -126
    //   247: invokeinterface 167 2 0
    //   252: istore 8
    //   254: aload_0
    //   255: astore_2
    //   256: aload_0
    //   257: ldc -124
    //   259: invokeinterface 167 2 0
    //   264: istore 9
    //   266: aload_0
    //   267: astore_2
    //   268: aload_0
    //   269: ldc -120
    //   271: invokeinterface 167 2 0
    //   276: istore 10
    //   278: aload_0
    //   279: astore_2
    //   280: aload_0
    //   281: ldc -118
    //   283: invokeinterface 167 2 0
    //   288: istore 11
    //   290: aload_0
    //   291: astore_2
    //   292: aload_0
    //   293: invokeinterface 171 1 0
    //   298: istore 13
    //   300: aload 14
    //   302: astore_1
    //   303: iload 13
    //   305: ifeq +185 -> 490
    //   308: iload 6
    //   310: iconst_m1
    //   311: if_icmpeq +21 -> 332
    //   314: aload_0
    //   315: astore_2
    //   316: aload_0
    //   317: iload 6
    //   319: invokeinterface 175 2 0
    //   324: istore_3
    //   325: goto +9 -> 334
    //   328: astore_0
    //   329: goto +215 -> 544
    //   332: iconst_0
    //   333: istore_3
    //   334: iload 9
    //   336: iconst_m1
    //   337: if_icmpeq +18 -> 355
    //   340: aload_0
    //   341: astore_2
    //   342: aload_0
    //   343: iload 9
    //   345: invokeinterface 175 2 0
    //   350: istore 4
    //   352: goto +6 -> 358
    //   355: iconst_0
    //   356: istore 4
    //   358: iload 8
    //   360: iconst_m1
    //   361: if_icmpne +22 -> 383
    //   364: aload_0
    //   365: astore_2
    //   366: aload 16
    //   368: aload_0
    //   369: iload 7
    //   371: invokeinterface 179 2 0
    //   376: invokestatic 185	android/content/ContentUris:withAppendedId	(Landroid/net/Uri;J)Landroid/net/Uri;
    //   379: astore_1
    //   380: goto +22 -> 402
    //   383: aload_0
    //   384: astore_2
    //   385: aload 18
    //   387: aload_0
    //   388: iload 8
    //   390: invokeinterface 179 2 0
    //   395: invokestatic 185	android/content/ContentUris:withAppendedId	(Landroid/net/Uri;J)Landroid/net/Uri;
    //   398: astore_1
    //   399: goto -19 -> 380
    //   402: iload 10
    //   404: iconst_m1
    //   405: if_icmpeq +18 -> 423
    //   408: aload_0
    //   409: astore_2
    //   410: aload_0
    //   411: iload 10
    //   413: invokeinterface 175 2 0
    //   418: istore 5
    //   420: goto +11 -> 431
    //   423: sipush 400
    //   426: istore 5
    //   428: goto -8 -> 420
    //   431: iload 11
    //   433: iconst_m1
    //   434: if_icmpeq +27 -> 461
    //   437: aload_0
    //   438: astore_2
    //   439: aload_0
    //   440: iload 11
    //   442: invokeinterface 175 2 0
    //   447: istore 12
    //   449: iload 12
    //   451: iconst_1
    //   452: if_icmpne +9 -> 461
    //   455: iconst_1
    //   456: istore 13
    //   458: goto +6 -> 464
    //   461: iconst_0
    //   462: istore 13
    //   464: aload_0
    //   465: astore_2
    //   466: aload 14
    //   468: new 187	views/Item
    //   471: dup
    //   472: aload_1
    //   473: iload 4
    //   475: iload 5
    //   477: iload 13
    //   479: iload_3
    //   480: invokespecial 190	views/Item:<init>	(Landroid/net/Uri;IIZI)V
    //   483: invokevirtual 82	java/util/ArrayList:add	(Ljava/lang/Object;)Z
    //   486: pop
    //   487: goto -197 -> 290
    //   490: aload_0
    //   491: ifnull +16 -> 507
    //   494: aload_0
    //   495: invokeinterface 193 1 0
    //   500: goto +7 -> 507
    //   503: astore_0
    //   504: goto +62 -> 566
    //   507: aload 17
    //   509: ifnull +8 -> 517
    //   512: aload 17
    //   514: invokevirtual 194	android/content/ContentProviderClient:close	()V
    //   517: aload_1
    //   518: iconst_0
    //   519: anewarray 187	views/Item
    //   522: invokevirtual 198	java/util/ArrayList:toArray	([Ljava/lang/Object;)[Ljava/lang/Object;
    //   525: checkcast 200	[Lviews/Item;
    //   528: astore_0
    //   529: invokestatic 69	android/os/Trace:endSection	()V
    //   532: aload_0
    //   533: areturn
    //   534: astore_1
    //   535: aload_0
    //   536: astore_2
    //   537: invokestatic 69	android/os/Trace:endSection	()V
    //   540: aload_0
    //   541: astore_2
    //   542: aload_1
    //   543: athrow
    //   544: aload_2
    //   545: ifnull +9 -> 554
    //   548: aload_2
    //   549: invokeinterface 193 1 0
    //   554: aload 17
    //   556: ifnull +8 -> 564
    //   559: aload 17
    //   561: invokevirtual 194	android/content/ContentProviderClient:close	()V
    //   564: aload_0
    //   565: athrow
    //   566: invokestatic 69	android/os/Trace:endSection	()V
    //   569: aload_0
    //   570: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	571	0	paramContext	android.content.Context
    //   0	571	1	paramContext1	Context
    //   0	571	2	paramString	String
    //   199	281	3	i	int
    //   350	124	4	j	int
    //   418	58	5	k	int
    //   217	101	6	m	int
    //   240	130	7	n	int
    //   252	137	8	i1	int
    //   264	80	9	i2	int
    //   276	136	10	i3	int
    //   288	153	11	i4	int
    //   447	6	12	i5	int
    //   298	180	13	bool	boolean
    //   12	455	14	localArrayList	java.util.ArrayList
    //   75	102	15	localObject	Object
    //   33	334	16	localUri1	android.net.Uri
    //   70	490	17	localContentProviderClient	android.content.ContentProviderClient
    //   59	327	18	localUri2	android.net.Uri
    // Exception table:
    //   from	to	target	type
    //   100	161	166	android/os/RemoteException
    //   79	84	328	java/lang/Throwable
    //   181	184	328	java/lang/Throwable
    //   193	200	328	java/lang/Throwable
    //   209	219	328	java/lang/Throwable
    //   221	230	328	java/lang/Throwable
    //   232	242	328	java/lang/Throwable
    //   244	254	328	java/lang/Throwable
    //   256	266	328	java/lang/Throwable
    //   268	278	328	java/lang/Throwable
    //   280	290	328	java/lang/Throwable
    //   292	300	328	java/lang/Throwable
    //   316	325	328	java/lang/Throwable
    //   342	352	328	java/lang/Throwable
    //   366	380	328	java/lang/Throwable
    //   385	399	328	java/lang/Throwable
    //   410	420	328	java/lang/Throwable
    //   439	449	328	java/lang/Throwable
    //   466	487	328	java/lang/Throwable
    //   537	540	328	java/lang/Throwable
    //   542	544	328	java/lang/Throwable
    //   5	72	503	java/lang/Throwable
    //   494	500	503	java/lang/Throwable
    //   512	517	503	java/lang/Throwable
    //   517	529	503	java/lang/Throwable
    //   548	554	503	java/lang/Throwable
    //   559	564	503	java/lang/Throwable
    //   564	566	503	java/lang/Throwable
    //   84	89	534	java/lang/Throwable
    //   100	161	534	java/lang/Throwable
    //   167	176	534	java/lang/Throwable
  }
}
