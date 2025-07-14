package tts;

import androidx.lifecycle.MenuItem;

public final class a
  implements MenuItem
{
  public final Object k;
  
  /* Error */
  public final void a(androidx.lifecycle.x paramX, androidx.lifecycle.Handle paramHandle)
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 14	tts/a:a	I
    //   4: lookupswitch	default:+20->24, 0:+44->48
    //   24: goto +3 -> 27
    //   27: aload_0
    //   28: getfield 16	tts/a:k	Ljava/lang/Object;
    //   31: checkcast 29	androidx/fragment/asm/FragmentActivity
    //   34: astore_1
    //   35: aload_1
    //   36: invokestatic 35	ui/AbstractGalleryActivity:access$ensureViewModelStore	(Lui/AbstractGalleryActivity;)V
    //   39: aload_1
    //   40: invokevirtual 39	ui/AbstractGalleryActivity:getLifecycle	()Landroidx/lifecycle/ClassWriter;
    //   43: aload_0
    //   44: invokevirtual 45	androidx/lifecycle/ClassWriter:b	(Landroidx/lifecycle/SupportMenuItem;)V
    //   47: return
    //   48: aload_2
    //   49: getstatic 51	androidx/lifecycle/Handle:ON_CREATE	Landroidx/lifecycle/Handle;
    //   52: if_acmpne +429 -> 481
    //   55: aload_1
    //   56: invokeinterface 54 1 0
    //   61: aload_0
    //   62: invokevirtual 45	androidx/lifecycle/ClassWriter:b	(Landroidx/lifecycle/SupportMenuItem;)V
    //   65: aload_0
    //   66: getfield 16	tts/a:k	Ljava/lang/Object;
    //   69: astore_1
    //   70: aload_1
    //   71: checkcast 56	tts/c
    //   74: invokeinterface 60 1 0
    //   79: ldc 62
    //   81: invokevirtual 67	tts/h:a	(Ljava/lang/String;)Landroid/os/Bundle;
    //   84: astore_2
    //   85: aload_2
    //   86: ifnonnull +4 -> 90
    //   89: return
    //   90: aload_2
    //   91: ldc 69
    //   93: invokevirtual 75	android/os/Bundle:getStringArrayList	(Ljava/lang/String;)Ljava/util/ArrayList;
    //   96: astore_2
    //   97: aload_2
    //   98: ifnull +373 -> 471
    //   101: aload_2
    //   102: invokeinterface 81 1 0
    //   107: astore_2
    //   108: aload_2
    //   109: invokeinterface 87 1 0
    //   114: ifeq +377 -> 491
    //   117: aload_2
    //   118: invokeinterface 91 1 0
    //   123: checkcast 93	java/lang/String
    //   126: astore_3
    //   127: aload_3
    //   128: iconst_0
    //   129: ldc 95
    //   131: invokevirtual 101	java/lang/Class:getClassLoader	()Ljava/lang/ClassLoader;
    //   134: invokestatic 105	java/lang/Class:forName	(Ljava/lang/String;ZLjava/lang/ClassLoader;)Ljava/lang/Class;
    //   137: ldc 107
    //   139: invokevirtual 111	java/lang/Class:asSubclass	(Ljava/lang/Class;)Ljava/lang/Class;
    //   142: astore 4
    //   144: aload 4
    //   146: invokestatic 117	params/Log:get	(Ljava/lang/Object;)V
    //   149: aload 4
    //   151: aconst_null
    //   152: invokevirtual 121	java/lang/Class:getDeclaredConstructor	([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
    //   155: astore 5
    //   157: aload 5
    //   159: iconst_1
    //   160: invokevirtual 127	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   163: aload 5
    //   165: aconst_null
    //   166: invokevirtual 133	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   169: astore 4
    //   171: aload 4
    //   173: invokestatic 117	params/Log:get	(Ljava/lang/Object;)V
    //   176: aload 4
    //   178: checkcast 135	tts/x
    //   181: astore_3
    //   182: aload_1
    //   183: instanceof 137
    //   186: ifeq +146 -> 332
    //   189: aload_1
    //   190: checkcast 137	androidx/lifecycle/List
    //   193: invokeinterface 141 1 0
    //   198: astore 4
    //   200: aload_1
    //   201: checkcast 56	tts/c
    //   204: invokeinterface 60 1 0
    //   209: astore_3
    //   210: aload 4
    //   212: invokevirtual 145	java/lang/Object:getClass	()Ljava/lang/Class;
    //   215: pop
    //   216: aload 4
    //   218: getfield 151	androidx/lifecycle/PieChart:m	Ljava/util/LinkedHashMap;
    //   221: astore 4
    //   223: new 153	java/util/HashSet
    //   226: dup
    //   227: aload 4
    //   229: invokevirtual 159	java/util/LinkedHashMap:keySet	()Ljava/util/Set;
    //   232: invokespecial 162	java/util/HashSet:<init>	(Ljava/util/Collection;)V
    //   235: invokevirtual 163	java/util/HashSet:iterator	()Ljava/util/Iterator;
    //   238: astore 5
    //   240: aload 5
    //   242: invokeinterface 87 1 0
    //   247: ifeq +60 -> 307
    //   250: aload 5
    //   252: invokeinterface 91 1 0
    //   257: checkcast 93	java/lang/String
    //   260: astore 6
    //   262: aload 6
    //   264: ldc -91
    //   266: invokestatic 168	params/Log:get	(Ljava/lang/Object;Ljava/lang/String;)V
    //   269: aload 4
    //   271: aload 6
    //   273: invokevirtual 171	java/util/LinkedHashMap:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   276: checkcast 173	androidx/lifecycle/Label
    //   279: astore 6
    //   281: aload 6
    //   283: ifnonnull +6 -> 289
    //   286: goto -46 -> 240
    //   289: aload 6
    //   291: aload_3
    //   292: aload_1
    //   293: checkcast 53	androidx/lifecycle/x
    //   296: invokeinterface 54 1 0
    //   301: invokestatic 178	androidx/lifecycle/Frame:a	(Landroidx/lifecycle/Label;Ltts/h;Landroidx/lifecycle/ClassWriter;)V
    //   304: goto -64 -> 240
    //   307: new 153	java/util/HashSet
    //   310: dup
    //   311: aload 4
    //   313: invokevirtual 159	java/util/LinkedHashMap:keySet	()Ljava/util/Set;
    //   316: invokespecial 162	java/util/HashSet:<init>	(Ljava/util/Collection;)V
    //   319: invokevirtual 181	java/util/HashSet:isEmpty	()Z
    //   322: ifne -214 -> 108
    //   325: aload_3
    //   326: invokevirtual 183	tts/h:a	()V
    //   329: goto -221 -> 108
    //   332: new 185	java/lang/StringBuilder
    //   335: dup
    //   336: ldc -69
    //   338: invokespecial 190	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   341: astore_2
    //   342: aload_2
    //   343: aload_1
    //   344: invokevirtual 194	java/lang/StringBuilder:append	(Ljava/lang/Object;)Ljava/lang/StringBuilder;
    //   347: pop
    //   348: new 196	java/lang/IllegalStateException
    //   351: dup
    //   352: aload_2
    //   353: invokevirtual 200	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   356: invokevirtual 201	java/lang/Object:toString	()Ljava/lang/String;
    //   359: invokespecial 202	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   362: athrow
    //   363: astore_1
    //   364: new 185	java/lang/StringBuilder
    //   367: dup
    //   368: ldc -52
    //   370: invokespecial 190	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   373: astore_2
    //   374: aload_2
    //   375: aload_3
    //   376: invokevirtual 207	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   379: pop
    //   380: new 209	java/lang/RuntimeException
    //   383: dup
    //   384: aload_2
    //   385: invokevirtual 200	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   388: aload_1
    //   389: invokespecial 212	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   392: athrow
    //   393: astore_1
    //   394: new 185	java/lang/StringBuilder
    //   397: dup
    //   398: ldc -42
    //   400: invokespecial 190	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   403: astore_2
    //   404: aload_2
    //   405: aload 4
    //   407: invokevirtual 217	java/lang/Class:getSimpleName	()Ljava/lang/String;
    //   410: invokevirtual 207	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   413: pop
    //   414: aload_2
    //   415: ldc -37
    //   417: invokevirtual 207	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   420: pop
    //   421: new 196	java/lang/IllegalStateException
    //   424: dup
    //   425: aload_2
    //   426: invokevirtual 200	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   429: aload_1
    //   430: invokespecial 220	java/lang/IllegalStateException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   433: athrow
    //   434: astore_1
    //   435: new 185	java/lang/StringBuilder
    //   438: dup
    //   439: ldc -42
    //   441: invokespecial 190	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   444: astore_2
    //   445: aload_2
    //   446: aload_3
    //   447: invokevirtual 207	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   450: pop
    //   451: aload_2
    //   452: ldc -34
    //   454: invokevirtual 207	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   457: pop
    //   458: new 209	java/lang/RuntimeException
    //   461: dup
    //   462: aload_2
    //   463: invokevirtual 200	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   466: aload_1
    //   467: invokespecial 212	java/lang/RuntimeException:<init>	(Ljava/lang/String;Ljava/lang/Throwable;)V
    //   470: athrow
    //   471: new 196	java/lang/IllegalStateException
    //   474: dup
    //   475: ldc -32
    //   477: invokespecial 202	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   480: athrow
    //   481: new 226	java/lang/AssertionError
    //   484: dup
    //   485: ldc -28
    //   487: invokespecial 230	java/lang/AssertionError:<init>	(Ljava/lang/Object;)V
    //   490: athrow
    //   491: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	492	0	this	a
    //   0	492	1	paramX	androidx.lifecycle.x
    //   0	492	2	paramHandle	androidx.lifecycle.Handle
    //   126	321	3	localObject1	Object
    //   142	264	4	localObject2	Object
    //   155	96	5	localObject3	Object
    //   260	30	6	localObject4	Object
    // Exception table:
    //   from	to	target	type
    //   163	176	363	java/lang/Exception
    //   149	157	393	java/lang/NoSuchMethodException
    //   127	149	434	java/lang/ClassNotFoundException
  }
}
