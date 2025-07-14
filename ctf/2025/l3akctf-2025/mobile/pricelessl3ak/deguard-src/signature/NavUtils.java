package signature;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageItemInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.BaseBundle;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.appcompat.app.AppCompatActivity;

public abstract class NavUtils
{
  public static final Object $SwitchMap$com$fasterxml$jackson$core$JsonToken = new Object();
  
  public static Intent getParentActivityIntent(AppCompatActivity paramAppCompatActivity)
  {
    Object localObject = paramAppCompatActivity.getParentActivityIntent();
    if (localObject != null) {
      return localObject;
    }
    for (;;)
    {
      try
      {
        localObject = getParentActivityName(paramAppCompatActivity, paramAppCompatActivity.getComponentName());
        if (localObject == null) {
          return null;
        }
        localComponentName = new ComponentName(paramAppCompatActivity, (String)localObject);
      }
      catch (PackageManager.NameNotFoundException paramAppCompatActivity)
      {
        ComponentName localComponentName;
        throw new IllegalArgumentException(paramAppCompatActivity);
      }
      try
      {
        paramAppCompatActivity = getParentActivityName(paramAppCompatActivity, localComponentName);
        if (paramAppCompatActivity == null)
        {
          paramAppCompatActivity = Intent.makeMainActivity(localComponentName);
          return paramAppCompatActivity;
        }
        paramAppCompatActivity = new Intent().setComponent(localComponentName);
        return paramAppCompatActivity;
      }
      catch (PackageManager.NameNotFoundException paramAppCompatActivity) {}
    }
    paramAppCompatActivity = new StringBuilder("getParentActivityIntent: bad parentActivityName '");
    paramAppCompatActivity.append((String)localObject);
    paramAppCompatActivity.append("' in manifest");
    Log.e("NavUtils", paramAppCompatActivity.toString());
    return null;
  }
  
  public static Intent getParentActivityIntent(AppCompatActivity paramAppCompatActivity, ComponentName paramComponentName)
  {
    String str = getParentActivityName(paramAppCompatActivity, paramComponentName);
    if (str == null) {
      return null;
    }
    paramComponentName = new ComponentName(paramComponentName.getPackageName(), str);
    if (getParentActivityName(paramAppCompatActivity, paramComponentName) == null) {
      return Intent.makeMainActivity(paramComponentName);
    }
    return new Intent().setComponent(paramComponentName);
  }
  
  public static String getParentActivityName(Activity paramActivity, ComponentName paramComponentName)
  {
    Object localObject = paramActivity.getPackageManager();
    int i;
    if (Build.VERSION.SDK_INT >= 29) {
      i = 269222528;
    } else {
      i = 787072;
    }
    paramComponentName = ((PackageManager)localObject).getActivityInfo(paramComponentName, i);
    localObject = parentActivityName;
    if (localObject != null) {
      return localObject;
    }
    paramComponentName = metaData;
    if (paramComponentName == null) {
      return null;
    }
    localObject = paramComponentName.getString("android.support.PARENT_ACTIVITY");
    if (localObject == null) {
      return null;
    }
    paramComponentName = (ComponentName)localObject;
    if (((String)localObject).charAt(0) == '.')
    {
      paramComponentName = new StringBuilder();
      paramComponentName.append(paramActivity.getPackageName());
      paramComponentName.append((String)localObject);
      paramComponentName = paramComponentName.toString();
    }
    return paramComponentName;
  }
  
  /* Error */
  public static String parse(Context paramContext)
  {
    // Byte code:
    //   0: getstatic 13	signature/NavUtils:$SwitchMap$com$fasterxml$jackson$core$JsonToken	Ljava/lang/Object;
    //   3: astore 8
    //   5: aload 8
    //   7: monitorenter
    //   8: ldc -113
    //   10: astore 6
    //   12: aload_0
    //   13: ldc -111
    //   15: invokevirtual 149	android/content/Context:openFileInput	(Ljava/lang/String;)Ljava/io/FileInputStream;
    //   18: astore 9
    //   20: invokestatic 155	android/util/Xml:newPullParser	()Lorg/xmlpull/v1/XmlPullParser;
    //   23: astore 7
    //   25: aload 7
    //   27: aload 9
    //   29: ldc -99
    //   31: invokeinterface 163 3 0
    //   36: aload 7
    //   38: invokeinterface 167 1 0
    //   43: istore_1
    //   44: aload 7
    //   46: invokeinterface 170 1 0
    //   51: istore_2
    //   52: aload 6
    //   54: astore 5
    //   56: iload_2
    //   57: iconst_1
    //   58: if_icmpeq +59 -> 117
    //   61: iload_2
    //   62: iconst_3
    //   63: if_icmpne +182 -> 245
    //   66: aload 7
    //   68: invokeinterface 167 1 0
    //   73: istore_3
    //   74: aload 6
    //   76: astore 5
    //   78: iload_3
    //   79: iload_1
    //   80: if_icmple +37 -> 117
    //   83: goto +162 -> 245
    //   86: aload 7
    //   88: invokeinterface 173 1 0
    //   93: ldc -81
    //   95: invokevirtual 179	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   98: istore 4
    //   100: iload 4
    //   102: ifeq -58 -> 44
    //   105: aload 7
    //   107: aconst_null
    //   108: ldc -75
    //   110: invokeinterface 185 3 0
    //   115: astore 5
    //   117: aload 5
    //   119: astore 7
    //   121: aload 9
    //   123: ifnull +43 -> 166
    //   126: aload 9
    //   128: invokevirtual 190	java/io/FileInputStream:close	()V
    //   131: aload 5
    //   133: astore 7
    //   135: goto +31 -> 166
    //   138: astore_0
    //   139: goto +69 -> 208
    //   142: ldc -64
    //   144: ldc -62
    //   146: invokestatic 197	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   149: pop
    //   150: aload 6
    //   152: astore 7
    //   154: aload 9
    //   156: ifnull +10 -> 166
    //   159: aload 6
    //   161: astore 5
    //   163: goto -37 -> 126
    //   166: aload 7
    //   168: invokevirtual 201	java/lang/String:isEmpty	()Z
    //   171: ifne +6 -> 177
    //   174: goto +10 -> 184
    //   177: aload_0
    //   178: ldc -111
    //   180: invokevirtual 205	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   183: pop
    //   184: aload 8
    //   186: monitorexit
    //   187: aload 7
    //   189: areturn
    //   190: aload 9
    //   192: ifnull +8 -> 200
    //   195: aload 9
    //   197: invokevirtual 190	java/io/FileInputStream:close	()V
    //   200: aload_0
    //   201: athrow
    //   202: aload 8
    //   204: monitorexit
    //   205: ldc -113
    //   207: areturn
    //   208: aload 8
    //   210: monitorexit
    //   211: aload_0
    //   212: athrow
    //   213: astore_0
    //   214: goto -12 -> 202
    //   217: astore 5
    //   219: goto -77 -> 142
    //   222: astore 5
    //   224: goto -82 -> 142
    //   227: astore 6
    //   229: aload 5
    //   231: astore 7
    //   233: goto -67 -> 166
    //   236: astore 5
    //   238: goto -38 -> 200
    //   241: astore_0
    //   242: goto -52 -> 190
    //   245: iload_2
    //   246: iconst_3
    //   247: if_icmpeq -203 -> 44
    //   250: iload_2
    //   251: iconst_4
    //   252: if_icmpne -166 -> 86
    //   255: goto -211 -> 44
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	258	0	paramContext	Context
    //   43	38	1	i	int
    //   51	202	2	j	int
    //   73	8	3	k	int
    //   98	3	4	bool	boolean
    //   54	108	5	str1	String
    //   217	1	5	localXmlPullParserException	org.xmlpull.v1.XmlPullParserException
    //   222	8	5	localIOException1	java.io.IOException
    //   236	1	5	localIOException2	java.io.IOException
    //   10	150	6	str2	String
    //   227	1	6	localIOException3	java.io.IOException
    //   23	209	7	localObject1	Object
    //   3	206	8	localObject2	Object
    //   18	178	9	localFileInputStream	java.io.FileInputStream
    // Exception table:
    //   from	to	target	type
    //   12	20	138	java/lang/Throwable
    //   126	131	138	java/lang/Throwable
    //   166	174	138	java/lang/Throwable
    //   177	184	138	java/lang/Throwable
    //   184	187	138	java/lang/Throwable
    //   195	200	138	java/lang/Throwable
    //   200	202	138	java/lang/Throwable
    //   202	205	138	java/lang/Throwable
    //   208	211	138	java/lang/Throwable
    //   12	20	213	java/io/FileNotFoundException
    //   20	44	217	org/xmlpull/v1/XmlPullParserException
    //   44	52	217	org/xmlpull/v1/XmlPullParserException
    //   66	74	217	org/xmlpull/v1/XmlPullParserException
    //   86	100	217	org/xmlpull/v1/XmlPullParserException
    //   105	117	217	org/xmlpull/v1/XmlPullParserException
    //   20	44	222	java/io/IOException
    //   44	52	222	java/io/IOException
    //   66	74	222	java/io/IOException
    //   86	100	222	java/io/IOException
    //   105	117	222	java/io/IOException
    //   126	131	227	java/io/IOException
    //   195	200	236	java/io/IOException
    //   20	44	241	java/lang/Throwable
    //   44	52	241	java/lang/Throwable
    //   66	74	241	java/lang/Throwable
    //   86	100	241	java/lang/Throwable
    //   105	117	241	java/lang/Throwable
    //   142	150	241	java/lang/Throwable
  }
  
  /* Error */
  public static void serialize(Context paramContext, String paramString)
  {
    // Byte code:
    //   0: getstatic 13	signature/NavUtils:$SwitchMap$com$fasterxml$jackson$core$JsonToken	Ljava/lang/Object;
    //   3: astore_2
    //   4: aload_2
    //   5: monitorenter
    //   6: aload_1
    //   7: ldc -113
    //   9: invokevirtual 179	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   12: ifeq +17 -> 29
    //   15: aload_0
    //   16: ldc -111
    //   18: invokevirtual 205	android/content/Context:deleteFile	(Ljava/lang/String;)Z
    //   21: pop
    //   22: aload_2
    //   23: monitorexit
    //   24: return
    //   25: astore_0
    //   26: goto +132 -> 158
    //   29: aload_0
    //   30: ldc -111
    //   32: iconst_0
    //   33: invokevirtual 212	android/content/Context:openFileOutput	(Ljava/lang/String;I)Ljava/io/FileOutputStream;
    //   36: astore_0
    //   37: invokestatic 216	android/util/Xml:newSerializer	()Lorg/xmlpull/v1/XmlSerializer;
    //   40: astore_3
    //   41: aload_3
    //   42: aload_0
    //   43: aconst_null
    //   44: invokeinterface 222 3 0
    //   49: getstatic 228	java/lang/Boolean:TRUE	Ljava/lang/Boolean;
    //   52: astore 4
    //   54: aload_3
    //   55: ldc -99
    //   57: aload 4
    //   59: invokeinterface 232 3 0
    //   64: aload_3
    //   65: aconst_null
    //   66: ldc -81
    //   68: invokeinterface 236 3 0
    //   73: pop
    //   74: aload_3
    //   75: aconst_null
    //   76: ldc -75
    //   78: aload_1
    //   79: invokeinterface 240 4 0
    //   84: pop
    //   85: aload_3
    //   86: aconst_null
    //   87: ldc -81
    //   89: invokeinterface 243 3 0
    //   94: pop
    //   95: aload_3
    //   96: invokeinterface 246 1 0
    //   101: aload_0
    //   102: ifnull +31 -> 133
    //   105: aload_0
    //   106: invokevirtual 249	java/io/FileOutputStream:close	()V
    //   109: goto +24 -> 133
    //   112: astore_1
    //   113: goto +23 -> 136
    //   116: astore_1
    //   117: ldc -64
    //   119: ldc -5
    //   121: aload_1
    //   122: invokestatic 254	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   125: pop
    //   126: aload_0
    //   127: ifnull +6 -> 133
    //   130: goto -25 -> 105
    //   133: aload_2
    //   134: monitorexit
    //   135: return
    //   136: aload_0
    //   137: ifnull +7 -> 144
    //   140: aload_0
    //   141: invokevirtual 249	java/io/FileOutputStream:close	()V
    //   144: aload_1
    //   145: athrow
    //   146: ldc -64
    //   148: ldc_w 256
    //   151: invokestatic 197	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   154: pop
    //   155: aload_2
    //   156: monitorexit
    //   157: return
    //   158: aload_2
    //   159: monitorexit
    //   160: aload_0
    //   161: athrow
    //   162: astore_0
    //   163: goto -17 -> 146
    //   166: astore_0
    //   167: goto -34 -> 133
    //   170: astore_0
    //   171: goto -27 -> 144
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	174	0	paramContext	Context
    //   0	174	1	paramString	String
    //   3	156	2	localObject	Object
    //   40	56	3	localXmlSerializer	org.xmlpull.v1.XmlSerializer
    //   52	6	4	localBoolean	Boolean
    // Exception table:
    //   from	to	target	type
    //   6	24	25	java/lang/Throwable
    //   29	37	25	java/lang/Throwable
    //   37	41	25	java/lang/Throwable
    //   105	109	25	java/lang/Throwable
    //   133	135	25	java/lang/Throwable
    //   140	144	25	java/lang/Throwable
    //   144	146	25	java/lang/Throwable
    //   146	157	25	java/lang/Throwable
    //   158	160	25	java/lang/Throwable
    //   41	49	112	java/lang/Throwable
    //   54	101	112	java/lang/Throwable
    //   117	126	112	java/lang/Throwable
    //   41	49	116	java/lang/Exception
    //   54	101	116	java/lang/Exception
    //   29	37	162	java/io/FileNotFoundException
    //   105	109	166	java/io/IOException
    //   140	144	170	java/io/IOException
  }
}
