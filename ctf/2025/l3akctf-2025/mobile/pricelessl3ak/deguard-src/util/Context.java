package util;

import android.graphics.Typeface;
import android.net.Uri;
import android.util.Log;
import http.AbstractMultimap;
import internal.Label;
import java.lang.reflect.Array;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.util.List;
import views.Item;

public final class Context
  extends Label
{
  public static final Method a;
  public static final Method b;
  public static final Constructor c;
  public static final Class g;
  
  static
  {
    Object localObject3 = null;
    try
    {
      Object localObject6 = Class.forName("android.graphics.FontFamily");
      Object localObject1 = localObject6;
      localObject5 = ((Class)localObject6).getConstructor(null);
      localObject4 = Integer.TYPE;
      Class localClass = Boolean.TYPE;
      localObject4 = ((Class)localObject6).getMethod("addFontWeightStyle", new Class[] { ByteBuffer.class, localObject4, List.class, localObject4, localClass });
      localObject6 = Array.newInstance((Class)localObject6, 1);
      localObject6 = localObject6.getClass();
      localObject6 = Typeface.class.getMethod("createFromFamiliesWithDefault", new Class[] { localObject6 });
      localObject3 = localObject5;
      localObject5 = localObject6;
    }
    catch (NoSuchMethodException localNoSuchMethodException) {}catch (ClassNotFoundException localClassNotFoundException) {}
    Log.e("TypefaceCompatApi24Impl", localClassNotFoundException.getClass().getName(), localClassNotFoundException);
    Object localObject2 = null;
    Object localObject5 = null;
    Object localObject4 = null;
    c = localObject3;
    g = localObject2;
    b = (Method)localObject4;
    a = (Method)localObject5;
  }
  
  public static boolean add(Object paramObject, ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    Method localMethod = b;
    try
    {
      paramObject = localMethod.invoke(paramObject, new Object[] { paramByteBuffer, Integer.valueOf(paramInt1), null, Integer.valueOf(paramInt2), Boolean.valueOf(paramBoolean) });
      paramObject = (Boolean)paramObject;
      paramBoolean = paramObject.booleanValue();
      return paramBoolean;
    }
    catch (IllegalAccessException paramObject)
    {
      for (;;) {}
    }
    catch (InvocationTargetException paramObject)
    {
      for (;;) {}
    }
    return false;
  }
  
  public static Typeface get(Object paramObject)
  {
    Object localObject = g;
    try
    {
      localObject = Array.newInstance((Class)localObject, 1);
      Array.set(localObject, 0, paramObject);
      paramObject = a;
      paramObject = paramObject.invoke(null, new Object[] { localObject });
      return (Typeface)paramObject;
    }
    catch (IllegalAccessException paramObject)
    {
      return null;
    }
    catch (InvocationTargetException paramObject) {}
    return null;
  }
  
  /* Error */
  public final Typeface get(android.content.Context paramContext, data.Namespace paramNamespace, android.content.res.Resources paramResources, int paramInt)
  {
    // Byte code:
    //   0: getstatic 77	util/Context:c	Ljava/lang/reflect/Constructor;
    //   3: astore 10
    //   5: aload 10
    //   7: aconst_null
    //   8: invokevirtual 125	java/lang/reflect/Constructor:newInstance	([Ljava/lang/Object;)Ljava/lang/Object;
    //   11: astore 10
    //   13: goto +6 -> 19
    //   16: aconst_null
    //   17: astore 10
    //   19: aload 10
    //   21: ifnonnull +5 -> 26
    //   24: aconst_null
    //   25: areturn
    //   26: aload_2
    //   27: getfield 131	data/Namespace:index	[Ldata/R$string;
    //   30: astore 11
    //   32: aload 11
    //   34: arraylength
    //   35: istore 5
    //   37: iconst_0
    //   38: istore 4
    //   40: iload 4
    //   42: iload 5
    //   44: if_icmpge +184 -> 228
    //   47: aload 11
    //   49: iload 4
    //   51: aaload
    //   52: astore 12
    //   54: aload 12
    //   56: getfield 137	data/R$string:value	I
    //   59: istore 6
    //   61: aload_1
    //   62: invokestatic 141	internal/Label:open	(Landroid/content/Context;)Ljava/io/File;
    //   65: astore 13
    //   67: aload 13
    //   69: ifnonnull +8 -> 77
    //   72: aconst_null
    //   73: astore_2
    //   74: goto +96 -> 170
    //   77: aload 13
    //   79: aload_3
    //   80: iload 6
    //   82: invokestatic 145	internal/Label:copy	(Ljava/io/File;Landroid/content/res/Resources;I)Z
    //   85: istore 7
    //   87: iload 7
    //   89: ifne +12 -> 101
    //   92: aload 13
    //   94: invokevirtual 150	java/io/File:delete	()Z
    //   97: pop
    //   98: goto -26 -> 72
    //   101: new 152	java/io/FileInputStream
    //   104: dup
    //   105: aload 13
    //   107: invokespecial 156	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   110: astore 14
    //   112: aload 14
    //   114: invokevirtual 160	java/io/FileInputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   117: astore_2
    //   118: aload_2
    //   119: invokevirtual 166	java/nio/channels/FileChannel:size	()J
    //   122: lstore 8
    //   124: aload_2
    //   125: getstatic 172	java/nio/channels/FileChannel$MapMode:READ_ONLY	Ljava/nio/channels/FileChannel$MapMode;
    //   128: lconst_0
    //   129: lload 8
    //   131: invokevirtual 176	java/nio/channels/FileChannel:map	(Ljava/nio/channels/FileChannel$MapMode;JJ)Ljava/nio/MappedByteBuffer;
    //   134: astore_2
    //   135: aload 14
    //   137: invokevirtual 179	java/io/FileInputStream:close	()V
    //   140: goto +24 -> 164
    //   143: astore_2
    //   144: aload 14
    //   146: invokevirtual 179	java/io/FileInputStream:close	()V
    //   149: goto +11 -> 160
    //   152: astore 14
    //   154: aload_2
    //   155: aload 14
    //   157: invokevirtual 183	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   160: aload_2
    //   161: athrow
    //   162: aconst_null
    //   163: astore_2
    //   164: aload 13
    //   166: invokevirtual 150	java/io/File:delete	()Z
    //   169: pop
    //   170: aload_2
    //   171: ifnonnull +5 -> 176
    //   174: aconst_null
    //   175: areturn
    //   176: aload 12
    //   178: getfield 186	data/R$string:offset	I
    //   181: istore 6
    //   183: aload 12
    //   185: getfield 190	data/R$string:data	Z
    //   188: istore 7
    //   190: aload 10
    //   192: aload_2
    //   193: aload 12
    //   195: getfield 193	data/R$string:key	I
    //   198: iload 6
    //   200: iload 7
    //   202: invokestatic 195	util/Context:add	(Ljava/lang/Object;Ljava/nio/ByteBuffer;IIZ)Z
    //   205: ifne +5 -> 210
    //   208: aconst_null
    //   209: areturn
    //   210: iload 4
    //   212: iconst_1
    //   213: iadd
    //   214: istore 4
    //   216: goto -176 -> 40
    //   219: astore_1
    //   220: aload 13
    //   222: invokevirtual 150	java/io/File:delete	()Z
    //   225: pop
    //   226: aload_1
    //   227: athrow
    //   228: aload 10
    //   230: invokestatic 197	util/Context:get	(Ljava/lang/Object;)Landroid/graphics/Typeface;
    //   233: areturn
    //   234: astore 10
    //   236: goto -220 -> 16
    //   239: astore 10
    //   241: goto -225 -> 16
    //   244: astore 10
    //   246: goto -230 -> 16
    //   249: astore_2
    //   250: goto -88 -> 162
    //   253: astore_2
    //   254: goto -92 -> 162
    //   257: astore_2
    //   258: goto -96 -> 162
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	261	0	this	Context
    //   0	261	1	paramContext	android.content.Context
    //   0	261	2	paramNamespace	data.Namespace
    //   0	261	3	paramResources	android.content.res.Resources
    //   0	261	4	paramInt	int
    //   35	10	5	i	int
    //   59	140	6	j	int
    //   85	116	7	bool	boolean
    //   122	8	8	l	long
    //   3	226	10	localObject	Object
    //   234	1	10	localIllegalAccessException	IllegalAccessException
    //   239	1	10	localInstantiationException	InstantiationException
    //   244	1	10	localInvocationTargetException	InvocationTargetException
    //   30	18	11	arrayOfString	data.R.string[]
    //   52	142	12	str	data.R.string
    //   65	156	13	localFile	java.io.File
    //   110	35	14	localFileInputStream	java.io.FileInputStream
    //   152	4	14	localThrowable	Throwable
    // Exception table:
    //   from	to	target	type
    //   112	135	143	java/lang/Throwable
    //   144	149	152	java/lang/Throwable
    //   77	87	219	java/lang/Throwable
    //   101	112	219	java/lang/Throwable
    //   135	140	219	java/lang/Throwable
    //   154	160	219	java/lang/Throwable
    //   160	162	219	java/lang/Throwable
    //   5	13	234	java/lang/IllegalAccessException
    //   5	13	239	java/lang/InstantiationException
    //   5	13	244	java/lang/reflect/InvocationTargetException
    //   101	112	249	java/io/IOException
    //   135	140	253	java/io/IOException
    //   154	160	257	java/io/IOException
    //   160	162	257	java/io/IOException
  }
  
  public final Typeface read(android.content.Context paramContext, Item[] paramArrayOfItem, int paramInt)
  {
    Object localObject1 = c;
    try
    {
      localObject1 = ((Constructor)localObject1).newInstance(null);
    }
    catch (IllegalAccessException localIllegalAccessException)
    {
      int i;
      AbstractMultimap localAbstractMultimap;
      int j;
      for (;;) {}
    }
    catch (InstantiationException localInstantiationException)
    {
      for (;;) {}
    }
    catch (InvocationTargetException localInvocationTargetException)
    {
      for (;;) {}
    }
    localObject1 = null;
    if (localObject1 == null) {
      return null;
    }
    i = 0;
    localAbstractMultimap = new AbstractMultimap(0);
    j = paramArrayOfItem.length;
    while (i < j)
    {
      Item localItem = paramArrayOfItem[i];
      Uri localUri = c;
      Object localObject3 = (ByteBuffer)localAbstractMultimap.get(localUri);
      Object localObject2 = localObject3;
      if (localObject3 == null)
      {
        localObject3 = Label.read(paramContext, localUri);
        localObject2 = localObject3;
        localAbstractMultimap.put(localUri, localObject3);
      }
      if (localObject2 == null) {
        return null;
      }
      int k = a;
      boolean bool = b;
      int m = g;
      if (!add(localObject1, (ByteBuffer)localObject2, m, k, bool)) {
        return null;
      }
      i += 1;
    }
    paramContext = get(localObject1);
    if (paramContext == null) {
      return null;
    }
    return Typeface.create(paramContext, paramInt);
  }
}
