package util;

import android.graphics.Typeface;
import android.util.Log;
import internal.Label;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class InsnList
  extends Label
{
  public static boolean b;
  public static Constructor c;
  public static Class first;
  public static Method mStartForeground;
  public static Method mStopForeground;
  
  public static boolean add(Object paramObject, String paramString, int paramInt, boolean paramBoolean)
  {
    set();
    Method localMethod = mStopForeground;
    try
    {
      paramObject = localMethod.invoke(paramObject, new Object[] { paramString, Integer.valueOf(paramInt), Boolean.valueOf(paramBoolean) });
      paramObject = (Boolean)paramObject;
      paramBoolean = paramObject.booleanValue();
      return paramBoolean;
    }
    catch (InvocationTargetException paramObject) {}catch (IllegalAccessException paramObject) {}
    throw new RuntimeException(paramObject);
  }
  
  public static void set()
  {
    if (b) {
      return;
    }
    b = true;
    Object localObject3 = null;
    try
    {
      Object localObject6 = Class.forName("android.graphics.FontFamily");
      Object localObject1 = localObject6;
      localObject5 = ((Class)localObject6).getConstructor(null);
      localObject4 = Integer.TYPE;
      Class localClass = Boolean.TYPE;
      localObject4 = ((Class)localObject6).getMethod("addFontWeightStyle", new Class[] { String.class, localObject4, localClass });
      localObject6 = Array.newInstance((Class)localObject6, 1);
      localObject6 = localObject6.getClass();
      localObject6 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[] { localObject6 });
      localObject3 = localObject5;
      localObject5 = localObject6;
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}catch (ClassNotFoundException localClassNotFoundException) {}
    Log.e("TypefaceCompatApi21Impl", localClassNotFoundException.getClass().getName(), localClassNotFoundException);
    Object localObject5 = null;
    Object localObject2 = null;
    Object localObject4 = null;
    c = localObject3;
    first = localObject2;
    mStopForeground = (Method)localObject4;
    mStartForeground = (Method)localObject5;
  }
  
  /* Error */
  public Typeface get(android.content.Context paramContext, data.Namespace paramNamespace, android.content.res.Resources paramResources, int paramInt)
  {
    // Byte code:
    //   0: invokestatic 23	util/InsnList:set	()V
    //   3: getstatic 113	util/InsnList:c	Ljava/lang/reflect/Constructor;
    //   6: astore 7
    //   8: aload 7
    //   10: aconst_null
    //   11: invokevirtual 128	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   14: astore 7
    //   16: aload_2
    //   17: getfield 134	data/Namespace:index	[Ldata/R$string;
    //   20: astore 8
    //   22: aload 8
    //   24: arraylength
    //   25: istore 5
    //   27: iconst_0
    //   28: istore 4
    //   30: iload 4
    //   32: iload 5
    //   34: if_icmpge +107 -> 141
    //   37: aload 8
    //   39: iload 4
    //   41: aaload
    //   42: astore 9
    //   44: aload_1
    //   45: invokestatic 138	internal/Label:open	(Landroid/content/Context;)Ljava/io/File;
    //   48: astore_2
    //   49: aload_2
    //   50: ifnonnull +5 -> 55
    //   53: aconst_null
    //   54: areturn
    //   55: aload_2
    //   56: aload_3
    //   57: aload 9
    //   59: getfield 144	data/R$string:value	I
    //   62: invokestatic 148	internal/Label:copy	(Ljava/io/File;Landroid/content/res/Resources;I)Z
    //   65: istore 6
    //   67: iload 6
    //   69: ifne +10 -> 79
    //   72: aload_2
    //   73: invokevirtual 153	java/io/File:delete	()Z
    //   76: pop
    //   77: aconst_null
    //   78: areturn
    //   79: aload 7
    //   81: aload_2
    //   82: invokevirtual 156	java/io/File:getPath	()Ljava/lang/String;
    //   85: aload 9
    //   87: getfield 159	data/R$string:offset	I
    //   90: aload 9
    //   92: getfield 162	data/R$string:data	Z
    //   95: invokestatic 164	util/InsnList:add	(Ljava/lang/Object;Ljava/lang/String;IZ)Z
    //   98: istore 6
    //   100: iload 6
    //   102: ifne +10 -> 112
    //   105: aload_2
    //   106: invokevirtual 153	java/io/File:delete	()Z
    //   109: pop
    //   110: aconst_null
    //   111: areturn
    //   112: aload_2
    //   113: invokevirtual 153	java/io/File:delete	()Z
    //   116: pop
    //   117: iload 4
    //   119: iconst_1
    //   120: iadd
    //   121: istore 4
    //   123: goto -93 -> 30
    //   126: astore_1
    //   127: aload_2
    //   128: invokevirtual 153	java/io/File:delete	()Z
    //   131: pop
    //   132: aload_1
    //   133: athrow
    //   134: aload_2
    //   135: invokevirtual 153	java/io/File:delete	()Z
    //   138: pop
    //   139: aconst_null
    //   140: areturn
    //   141: invokestatic 23	util/InsnList:set	()V
    //   144: getstatic 115	util/InsnList:first	Ljava/lang/Class;
    //   147: astore_1
    //   148: aload_1
    //   149: iconst_1
    //   150: invokestatic 91	java/lang/reflect/Array:newInstance	(Ljava/lang/Class;I)Ljava/lang/Object;
    //   153: astore_1
    //   154: aload_1
    //   155: iconst_0
    //   156: aload 7
    //   158: invokestatic 167	java/lang/reflect/Array:set	(Ljava/lang/Object;ILjava/lang/Object;)V
    //   161: getstatic 117	util/InsnList:mStartForeground	Ljava/lang/reflect/Method;
    //   164: astore_2
    //   165: aload_2
    //   166: aconst_null
    //   167: iconst_1
    //   168: anewarray 27	java/lang/Object
    //   171: dup
    //   172: iconst_0
    //   173: aload_1
    //   174: aastore
    //   175: invokevirtual 44	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   178: astore_1
    //   179: aload_1
    //   180: checkcast 97	android/graphics/Typeface
    //   183: areturn
    //   184: astore_1
    //   185: goto +4 -> 189
    //   188: astore_1
    //   189: new 50	java/lang/RuntimeException
    //   192: dup
    //   193: aload_1
    //   194: invokespecial 54	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   197: athrow
    //   198: astore_1
    //   199: goto +8 -> 207
    //   202: astore_1
    //   203: goto +4 -> 207
    //   206: astore_1
    //   207: new 50	java/lang/RuntimeException
    //   210: dup
    //   211: aload_1
    //   212: invokespecial 54	java/lang/RuntimeException:<init>	(Ljava/lang/Throwable;)V
    //   215: athrow
    //   216: astore_1
    //   217: goto -83 -> 134
    //   220: astore_1
    //   221: goto -87 -> 134
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	224	0	this	InsnList
    //   0	224	1	paramContext	android.content.Context
    //   0	224	2	paramNamespace	data.Namespace
    //   0	224	3	paramResources	android.content.res.Resources
    //   0	224	4	paramInt	int
    //   25	10	5	i	int
    //   65	36	6	bool	boolean
    //   6	151	7	localObject	Object
    //   20	18	8	arrayOfString	data.R.string[]
    //   42	49	9	str	data.R.string
    // Exception table:
    //   from	to	target	type
    //   55	67	126	java/lang/Throwable
    //   79	100	126	java/lang/Throwable
    //   148	161	184	java/lang/reflect/InvocationTargetException
    //   165	179	184	java/lang/reflect/InvocationTargetException
    //   148	161	188	java/lang/IllegalAccessException
    //   165	179	188	java/lang/IllegalAccessException
    //   8	16	198	java/lang/reflect/InvocationTargetException
    //   8	16	202	java/lang/InstantiationException
    //   8	16	206	java/lang/IllegalAccessException
    //   55	67	216	java/lang/RuntimeException
    //   79	100	220	java/lang/RuntimeException
  }
  
  /* Error */
  public Typeface read(android.content.Context paramContext, views.Item[] paramArrayOfItem, int paramInt)
  {
    // Byte code:
    //   0: aload_2
    //   1: arraylength
    //   2: iconst_1
    //   3: if_icmpge +5 -> 8
    //   6: aconst_null
    //   7: areturn
    //   8: aload_0
    //   9: aload_2
    //   10: iload_3
    //   11: invokevirtual 177	internal/Label:a	([Lviews/Item;I)Lviews/Item;
    //   14: astore 5
    //   16: aload_1
    //   17: invokevirtual 183	android/content/Context:getContentResolver	()Landroid/content/ContentResolver;
    //   20: astore_2
    //   21: aload 5
    //   23: getfield 188	views/Item:c	Landroid/net/Uri;
    //   26: astore 5
    //   28: aload_2
    //   29: aload 5
    //   31: ldc -66
    //   33: aconst_null
    //   34: invokevirtual 196	android/content/ContentResolver:openFileDescriptor	(Landroid/net/Uri;Ljava/lang/String;Landroid/os/CancellationSignal;)Landroid/os/ParcelFileDescriptor;
    //   37: astore 5
    //   39: aload 5
    //   41: ifnonnull +15 -> 56
    //   44: aload 5
    //   46: ifnull +186 -> 232
    //   49: aload 5
    //   51: invokevirtual 201	android/os/ParcelFileDescriptor:close	()V
    //   54: aconst_null
    //   55: areturn
    //   56: new 203	java/lang/StringBuilder
    //   59: dup
    //   60: ldc -51
    //   62: invokespecial 208	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   65: astore_2
    //   66: aload_2
    //   67: aload 5
    //   69: invokevirtual 212	android/os/ParcelFileDescriptor:getFd	()I
    //   72: invokevirtual 216	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   75: pop
    //   76: aload_2
    //   77: invokevirtual 219	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   80: invokestatic 225	android/system/Os:readlink	(Ljava/lang/String;)Ljava/lang/String;
    //   83: astore_2
    //   84: aload_2
    //   85: invokestatic 229	android/system/Os:stat	(Ljava/lang/String;)Landroid/system/StructStat;
    //   88: astore 6
    //   90: aload 6
    //   92: getfield 234	android/system/StructStat:st_mode	I
    //   95: istore_3
    //   96: iload_3
    //   97: invokestatic 240	android/system/OsConstants:S_ISREG	(I)Z
    //   100: istore 4
    //   102: iload 4
    //   104: ifeq +15 -> 119
    //   107: new 150	java/io/File
    //   110: dup
    //   111: aload_2
    //   112: invokespecial 241	java/io/File:<init>	(Ljava/lang/String;)V
    //   115: astore_2
    //   116: goto +5 -> 121
    //   119: aconst_null
    //   120: astore_2
    //   121: aload_2
    //   122: ifnull +33 -> 155
    //   125: aload_2
    //   126: invokevirtual 244	java/io/File:canRead	()Z
    //   129: istore 4
    //   131: iload 4
    //   133: ifne +6 -> 139
    //   136: goto +19 -> 155
    //   139: aload_2
    //   140: invokestatic 248	android/graphics/Typeface:createFromFile	(Ljava/io/File;)Landroid/graphics/Typeface;
    //   143: astore_1
    //   144: aload 5
    //   146: invokevirtual 201	android/os/ParcelFileDescriptor:close	()V
    //   149: aload_1
    //   150: areturn
    //   151: astore_1
    //   152: goto +50 -> 202
    //   155: new 250	java/io/FileInputStream
    //   158: dup
    //   159: aload 5
    //   161: invokevirtual 254	android/os/ParcelFileDescriptor:getFileDescriptor	()Ljava/io/FileDescriptor;
    //   164: invokespecial 257	java/io/FileInputStream:<init>	(Ljava/io/FileDescriptor;)V
    //   167: astore_2
    //   168: aload_0
    //   169: aload_1
    //   170: aload_2
    //   171: invokevirtual 260	internal/Label:copy	(Landroid/content/Context;Ljava/io/InputStream;)Landroid/graphics/Typeface;
    //   174: astore_1
    //   175: aload_2
    //   176: invokevirtual 261	java/io/FileInputStream:close	()V
    //   179: aload 5
    //   181: invokevirtual 201	android/os/ParcelFileDescriptor:close	()V
    //   184: aload_1
    //   185: areturn
    //   186: astore_1
    //   187: aload_2
    //   188: invokevirtual 261	java/io/FileInputStream:close	()V
    //   191: goto +9 -> 200
    //   194: astore_2
    //   195: aload_1
    //   196: aload_2
    //   197: invokevirtual 264	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   200: aload_1
    //   201: athrow
    //   202: aload 5
    //   204: invokevirtual 201	android/os/ParcelFileDescriptor:close	()V
    //   207: goto +9 -> 216
    //   210: astore_2
    //   211: aload_1
    //   212: aload_2
    //   213: invokevirtual 264	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   216: aload_1
    //   217: athrow
    //   218: astore_1
    //   219: aconst_null
    //   220: areturn
    //   221: astore_2
    //   222: goto -103 -> 119
    //   225: astore_1
    //   226: aconst_null
    //   227: areturn
    //   228: astore_1
    //   229: aconst_null
    //   230: areturn
    //   231: astore_1
    //   232: aconst_null
    //   233: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	234	0	this	InsnList
    //   0	234	1	paramContext	android.content.Context
    //   0	234	2	paramArrayOfItem	views.Item[]
    //   0	234	3	paramInt	int
    //   100	32	4	bool	boolean
    //   14	189	5	localObject	Object
    //   88	3	6	localStructStat	android.system.StructStat
    // Exception table:
    //   from	to	target	type
    //   56	90	151	java/lang/Throwable
    //   96	102	151	java/lang/Throwable
    //   107	116	151	java/lang/Throwable
    //   125	131	151	java/lang/Throwable
    //   139	144	151	java/lang/Throwable
    //   155	168	151	java/lang/Throwable
    //   175	179	151	java/lang/Throwable
    //   195	200	151	java/lang/Throwable
    //   200	202	151	java/lang/Throwable
    //   168	175	186	java/lang/Throwable
    //   187	191	194	java/lang/Throwable
    //   202	207	210	java/lang/Throwable
    //   28	39	218	java/io/IOException
    //   49	54	218	java/io/IOException
    //   56	90	221	android/system/ErrnoException
    //   96	102	221	android/system/ErrnoException
    //   107	116	221	android/system/ErrnoException
    //   144	149	225	java/io/IOException
    //   179	184	228	java/io/IOException
    //   211	216	231	java/io/IOException
    //   216	218	231	java/io/IOException
  }
}
