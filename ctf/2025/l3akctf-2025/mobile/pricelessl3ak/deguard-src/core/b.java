package core;

import android.content.pm.PackageInfo;
import app.Element;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;

public abstract class b
{
  public static final byte[] a;
  public static final byte[] b;
  public static final byte[] c;
  public static final byte[] d;
  public static final byte[] e;
  public static final byte[] f;
  public static final byte[] g;
  public static final byte[] h;
  public static final Element i;
  public static final byte[] s;
  
  public static long a(InputStream paramInputStream, int paramInt)
  {
    paramInputStream = toString(paramInputStream, paramInt);
    long l = 0L;
    int j = 0;
    while (j < paramInt)
    {
      l += ((paramInputStream[j] & 0xFF) << j * 8);
      j += 1;
    }
    return l;
  }
  
  public static String a(String paramString1, String paramString2, byte[] paramArrayOfByte)
  {
    byte[] arrayOfByte2 = b;
    boolean bool = Arrays.equals(paramArrayOfByte, arrayOfByte2);
    byte[] arrayOfByte1 = h;
    String str = "!";
    if (bool) {}
    while (Arrays.equals(paramArrayOfByte, arrayOfByte1))
    {
      localObject = ":";
      break;
    }
    Object localObject = "!";
    if (paramString1.length() <= 0)
    {
      if ("!".equals(localObject)) {
        return paramString2.replace(":", "!");
      }
      if (":".equals(localObject)) {
        return paramString2.replace("!", ":");
      }
    }
    else
    {
      if (paramString2.equals("classes.dex")) {
        return paramString1;
      }
      if ((!paramString2.contains("!")) && (!paramString2.contains(":")))
      {
        if (paramString2.endsWith(".apk")) {
          return paramString2;
        }
        localObject = new StringBuilder();
        ((StringBuilder)localObject).append(paramString1);
        if (Arrays.equals(paramArrayOfByte, arrayOfByte2)) {}
        do
        {
          paramString1 = ":";
          break;
          paramString1 = str;
        } while (Arrays.equals(paramArrayOfByte, arrayOfByte1));
        ((StringBuilder)localObject).append(paramString1);
        ((StringBuilder)localObject).append(paramString2);
        return ((StringBuilder)localObject).toString();
      }
      if ("!".equals(localObject)) {
        return paramString2.replace(":", "!");
      }
      if (":".equals(localObject)) {
        return paramString2.replace("!", ":");
      }
    }
    return paramString2;
  }
  
  /* Error */
  public static void a(android.content.Context paramContext, java.util.concurrent.Executor paramExecutor, Menu paramMenu, boolean paramBoolean)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 124	android/content/Context:getApplicationContext	()Landroid/content/Context;
    //   4: astore 11
    //   6: aload 11
    //   8: invokevirtual 127	android/content/Context:getPackageName	()Ljava/lang/String;
    //   11: astore 9
    //   13: aload 11
    //   15: invokevirtual 131	android/content/Context:getApplicationInfo	()Landroid/content/pm/ApplicationInfo;
    //   18: astore 10
    //   20: aload 11
    //   22: invokevirtual 135	android/content/Context:getAssets	()Landroid/content/res/AssetManager;
    //   25: astore 14
    //   27: new 137	java/io/File
    //   30: dup
    //   31: aload 10
    //   33: getfield 143	android/content/pm/ApplicationInfo:sourceDir	Ljava/lang/String;
    //   36: invokespecial 146	java/io/File:<init>	(Ljava/lang/String;)V
    //   39: invokevirtual 149	java/io/File:getName	()Ljava/lang/String;
    //   42: astore 10
    //   44: aload_0
    //   45: invokevirtual 153	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   48: astore 11
    //   50: aload 11
    //   52: aload 9
    //   54: iconst_0
    //   55: invokevirtual 159	android/content/pm/PackageManager:getPackageInfo	(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
    //   58: astore 11
    //   60: aload_0
    //   61: invokevirtual 163	android/content/Context:getFilesDir	()Ljava/io/File;
    //   64: astore 12
    //   66: iload_3
    //   67: ifne +169 -> 236
    //   70: new 137	java/io/File
    //   73: dup
    //   74: aload 12
    //   76: ldc -91
    //   78: invokespecial 168	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   81: astore 13
    //   83: aload 13
    //   85: invokevirtual 172	java/io/File:exists	()Z
    //   88: ifne +9 -> 97
    //   91: iconst_0
    //   92: istore 5
    //   94: goto +99 -> 193
    //   97: new 174	java/io/DataInputStream
    //   100: dup
    //   101: new 176	java/io/FileInputStream
    //   104: dup
    //   105: aload 13
    //   107: invokespecial 179	java/io/FileInputStream:<init>	(Ljava/io/File;)V
    //   110: invokespecial 182	java/io/DataInputStream:<init>	(Ljava/io/InputStream;)V
    //   113: astore 15
    //   115: aload 15
    //   117: invokevirtual 186	java/io/DataInputStream:readLong	()J
    //   120: lstore 7
    //   122: aload 15
    //   124: invokevirtual 191	java/io/InputStream:close	()V
    //   127: lload 7
    //   129: aload 11
    //   131: getfield 197	android/content/pm/PackageInfo:lastUpdateTime	J
    //   134: lcmp
    //   135: ifne +9 -> 144
    //   138: iconst_1
    //   139: istore 4
    //   141: goto +6 -> 147
    //   144: iconst_0
    //   145: istore 4
    //   147: iload 4
    //   149: istore 5
    //   151: iload 4
    //   153: ifeq +40 -> 193
    //   156: aload_2
    //   157: iconst_2
    //   158: aconst_null
    //   159: invokeinterface 203 3 0
    //   164: iload 4
    //   166: istore 5
    //   168: goto +25 -> 193
    //   171: astore 13
    //   173: aload 15
    //   175: invokevirtual 191	java/io/InputStream:close	()V
    //   178: goto +12 -> 190
    //   181: astore 15
    //   183: aload 13
    //   185: aload 15
    //   187: invokevirtual 207	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   190: aload 13
    //   192: athrow
    //   193: iload 5
    //   195: ifne +6 -> 201
    //   198: goto +38 -> 236
    //   201: new 98	java/lang/StringBuilder
    //   204: dup
    //   205: ldc -47
    //   207: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   210: astore_1
    //   211: aload_1
    //   212: aload_0
    //   213: invokevirtual 127	android/content/Context:getPackageName	()Ljava/lang/String;
    //   216: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   219: pop
    //   220: ldc -44
    //   222: aload_1
    //   223: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   226: invokestatic 217	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   229: pop
    //   230: aload_0
    //   231: iconst_0
    //   232: invokestatic 222	core/Frame:a	(Landroid/content/Context;Z)V
    //   235: return
    //   236: new 98	java/lang/StringBuilder
    //   239: dup
    //   240: ldc -32
    //   242: invokespecial 210	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   245: astore 13
    //   247: aload 13
    //   249: aload_0
    //   250: invokevirtual 127	android/content/Context:getPackageName	()Ljava/lang/String;
    //   253: invokevirtual 104	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   256: pop
    //   257: ldc -44
    //   259: aload 13
    //   261: invokevirtual 107	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   264: invokestatic 217	android/util/Log:d	(Ljava/lang/String;Ljava/lang/String;)I
    //   267: pop
    //   268: new 137	java/io/File
    //   271: dup
    //   272: new 137	java/io/File
    //   275: dup
    //   276: ldc -30
    //   278: aload 9
    //   280: invokespecial 229	java/io/File:<init>	(Ljava/lang/String;Ljava/lang/String;)V
    //   283: ldc -25
    //   285: invokespecial 168	java/io/File:<init>	(Ljava/io/File;Ljava/lang/String;)V
    //   288: astore 13
    //   290: new 233	core/f
    //   293: dup
    //   294: aload 14
    //   296: aload_1
    //   297: aload_2
    //   298: aload 10
    //   300: aload 13
    //   302: invokespecial 236	core/f:<init>	(Landroid/content/res/AssetManager;Ljava/util/concurrent/Executor;Lcore/Menu;Ljava/lang/String;Ljava/io/File;)V
    //   305: astore 9
    //   307: aload 9
    //   309: getfield 237	core/f:b	[B
    //   312: astore 15
    //   314: aload 15
    //   316: ifnonnull +18 -> 334
    //   319: aload 9
    //   321: iconst_3
    //   322: getstatic 243	android/os/Build$VERSION:SDK_INT	I
    //   325: invokestatic 249	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   328: invokevirtual 250	core/f:add	(ILjava/io/Serializable;)V
    //   331: goto +1086 -> 1417
    //   334: aload 13
    //   336: invokevirtual 172	java/io/File:exists	()Z
    //   339: ifeq +21 -> 360
    //   342: aload 13
    //   344: invokevirtual 253	java/io/File:canWrite	()Z
    //   347: ifne +38 -> 385
    //   350: aload 9
    //   352: iconst_4
    //   353: aconst_null
    //   354: invokevirtual 250	core/f:add	(ILjava/io/Serializable;)V
    //   357: goto -26 -> 331
    //   360: aload 13
    //   362: invokevirtual 256	java/io/File:createNewFile	()Z
    //   365: istore 6
    //   367: iload 6
    //   369: ifne +16 -> 385
    //   372: aload 9
    //   374: iconst_4
    //   375: aconst_null
    //   376: invokevirtual 250	core/f:add	(ILjava/io/Serializable;)V
    //   379: goto -48 -> 331
    //   382: goto +1028 -> 1410
    //   385: aload 9
    //   387: iconst_1
    //   388: putfield 259	core/f:e	Z
    //   391: getstatic 32	core/b:s	[B
    //   394: astore 13
    //   396: aload 9
    //   398: aload 14
    //   400: ldc_w 261
    //   403: invokevirtual 265	core/f:getItem	(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;
    //   406: astore_1
    //   407: goto +28 -> 435
    //   410: astore_1
    //   411: aload_2
    //   412: bipush 7
    //   414: aload_1
    //   415: invokeinterface 203 3 0
    //   420: goto +13 -> 433
    //   423: astore_1
    //   424: aload_2
    //   425: bipush 6
    //   427: aload_1
    //   428: invokeinterface 203 3 0
    //   433: aconst_null
    //   434: astore_1
    //   435: aload_1
    //   436: ifnull +190 -> 626
    //   439: aload 13
    //   441: aload_1
    //   442: iconst_4
    //   443: invokestatic 60	core/b:toString	(Ljava/io/InputStream;I)[B
    //   446: invokestatic 67	java/util/Arrays:equals	([B[B)Z
    //   449: istore 6
    //   451: iload 6
    //   453: ifeq +73 -> 526
    //   456: aload_1
    //   457: iconst_4
    //   458: invokestatic 60	core/b:toString	(Ljava/io/InputStream;I)[B
    //   461: astore 10
    //   463: aload 9
    //   465: getfield 268	core/f:t	Ljava/lang/String;
    //   468: astore 16
    //   470: aload_1
    //   471: aload 10
    //   473: aload 16
    //   475: invokestatic 271	core/b:a	(Ljava/io/FileInputStream;[BLjava/lang/String;)[Lcore/Label;
    //   478: astore 10
    //   480: aload_1
    //   481: invokevirtual 191	java/io/InputStream:close	()V
    //   484: aload 10
    //   486: astore_1
    //   487: goto +111 -> 598
    //   490: astore_1
    //   491: aload_2
    //   492: bipush 7
    //   494: aload_1
    //   495: invokeinterface 203 3 0
    //   500: aload 10
    //   502: astore_1
    //   503: goto +95 -> 598
    //   506: goto +101 -> 607
    //   509: goto +66 -> 575
    //   512: astore_0
    //   513: goto -7 -> 506
    //   516: astore 10
    //   518: goto +23 -> 541
    //   521: astore 10
    //   523: goto -14 -> 509
    //   526: new 118	java/lang/IllegalStateException
    //   529: dup
    //   530: ldc_w 273
    //   533: invokespecial 274	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   536: astore 10
    //   538: aload 10
    //   540: athrow
    //   541: aload_2
    //   542: bipush 8
    //   544: aload 10
    //   546: invokeinterface 203 3 0
    //   551: aload_1
    //   552: invokevirtual 191	java/io/InputStream:close	()V
    //   555: goto +41 -> 596
    //   558: astore_1
    //   559: aload_2
    //   560: bipush 7
    //   562: aload_1
    //   563: invokeinterface 203 3 0
    //   568: goto +28 -> 596
    //   571: astore_0
    //   572: goto -66 -> 506
    //   575: aload_2
    //   576: bipush 7
    //   578: aload 10
    //   580: invokeinterface 203 3 0
    //   585: aload_1
    //   586: invokevirtual 191	java/io/InputStream:close	()V
    //   589: goto +7 -> 596
    //   592: astore_1
    //   593: goto -34 -> 559
    //   596: aconst_null
    //   597: astore_1
    //   598: aload 9
    //   600: aload_1
    //   601: putfield 277	core/f:a	[Lcore/Label;
    //   604: goto +22 -> 626
    //   607: aload_1
    //   608: invokevirtual 191	java/io/InputStream:close	()V
    //   611: goto +13 -> 624
    //   614: astore_1
    //   615: aload_2
    //   616: bipush 7
    //   618: aload_1
    //   619: invokeinterface 203 3 0
    //   624: aload_0
    //   625: athrow
    //   626: aload 9
    //   628: getfield 277	core/f:a	[Lcore/Label;
    //   631: astore_1
    //   632: aload_1
    //   633: ifnull +207 -> 840
    //   636: getstatic 243	android/os/Build$VERSION:SDK_INT	I
    //   639: istore 4
    //   641: iload 4
    //   643: bipush 31
    //   645: if_icmplt +6 -> 651
    //   648: goto +20 -> 668
    //   651: iload 4
    //   653: bipush 24
    //   655: if_icmpeq +13 -> 668
    //   658: iload 4
    //   660: bipush 25
    //   662: if_icmpeq +6 -> 668
    //   665: goto +175 -> 840
    //   668: aload 9
    //   670: aload 14
    //   672: ldc_w 279
    //   675: invokevirtual 265	core/f:getItem	(Landroid/content/res/AssetManager;Ljava/lang/String;)Ljava/io/FileInputStream;
    //   678: astore 10
    //   680: aload 10
    //   682: ifnull +97 -> 779
    //   685: getstatic 35	core/b:c	[B
    //   688: aload 10
    //   690: iconst_4
    //   691: invokestatic 60	core/b:toString	(Ljava/io/InputStream;I)[B
    //   694: invokestatic 67	java/util/Arrays:equals	([B[B)Z
    //   697: istore 6
    //   699: iload 6
    //   701: ifeq +49 -> 750
    //   704: aload 9
    //   706: aload 10
    //   708: aload 10
    //   710: iconst_4
    //   711: invokestatic 60	core/b:toString	(Ljava/io/InputStream;I)[B
    //   714: aload 15
    //   716: aload_1
    //   717: invokestatic 282	core/b:a	(Ljava/io/FileInputStream;[B[B[Lcore/Label;)[Lcore/Label;
    //   720: putfield 277	core/f:a	[Lcore/Label;
    //   723: aload 10
    //   725: invokevirtual 191	java/io/InputStream:close	()V
    //   728: aload 9
    //   730: astore_1
    //   731: goto +102 -> 833
    //   734: astore_1
    //   735: goto +57 -> 792
    //   738: astore_1
    //   739: goto +71 -> 810
    //   742: astore_1
    //   743: goto +79 -> 822
    //   746: astore_1
    //   747: goto +14 -> 761
    //   750: new 118	java/lang/IllegalStateException
    //   753: dup
    //   754: ldc_w 273
    //   757: invokespecial 274	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   760: athrow
    //   761: aload 10
    //   763: invokevirtual 191	java/io/InputStream:close	()V
    //   766: goto +11 -> 777
    //   769: astore 10
    //   771: aload_1
    //   772: aload 10
    //   774: invokevirtual 207	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   777: aload_1
    //   778: athrow
    //   779: aload 10
    //   781: ifnull +50 -> 831
    //   784: aload 10
    //   786: invokevirtual 191	java/io/InputStream:close	()V
    //   789: goto +42 -> 831
    //   792: aload 9
    //   794: aconst_null
    //   795: putfield 277	core/f:a	[Lcore/Label;
    //   798: aload_2
    //   799: bipush 8
    //   801: aload_1
    //   802: invokeinterface 203 3 0
    //   807: goto +24 -> 831
    //   810: aload_2
    //   811: bipush 7
    //   813: aload_1
    //   814: invokeinterface 203 3 0
    //   819: goto +12 -> 831
    //   822: aload_2
    //   823: bipush 9
    //   825: aload_1
    //   826: invokeinterface 203 3 0
    //   831: aconst_null
    //   832: astore_1
    //   833: aload_1
    //   834: ifnull +6 -> 840
    //   837: goto +6 -> 843
    //   840: aload 9
    //   842: astore_1
    //   843: aload_1
    //   844: getfield 286	core/f:n	Lcore/Menu;
    //   847: astore_2
    //   848: aload_1
    //   849: getfield 277	core/f:a	[Lcore/Label;
    //   852: astore 10
    //   854: aload 10
    //   856: ifnull +178 -> 1034
    //   859: aload_1
    //   860: getfield 237	core/f:b	[B
    //   863: astore 14
    //   865: aload 14
    //   867: ifnonnull +6 -> 873
    //   870: goto +164 -> 1034
    //   873: aload_1
    //   874: getfield 259	core/f:e	Z
    //   877: ifeq +146 -> 1023
    //   880: new 288	java/io/ByteArrayOutputStream
    //   883: dup
    //   884: invokespecial 289	java/io/ByteArrayOutputStream:<init>	()V
    //   887: astore 9
    //   889: aload 9
    //   891: aload 13
    //   893: invokevirtual 295	java/io/OutputStream:write	([B)V
    //   896: aload 9
    //   898: aload 14
    //   900: invokevirtual 295	java/io/OutputStream:write	([B)V
    //   903: aload 9
    //   905: aload 14
    //   907: aload 10
    //   909: invokestatic 298	core/b:a	(Ljava/io/ByteArrayOutputStream;[B[Lcore/Label;)Z
    //   912: istore 6
    //   914: iload 6
    //   916: ifne +39 -> 955
    //   919: aload_2
    //   920: iconst_5
    //   921: aconst_null
    //   922: invokeinterface 203 3 0
    //   927: aload_1
    //   928: aconst_null
    //   929: putfield 277	core/f:a	[Lcore/Label;
    //   932: aload 9
    //   934: invokevirtual 299	java/io/ByteArrayOutputStream:close	()V
    //   937: goto +97 -> 1034
    //   940: astore 9
    //   942: goto +50 -> 992
    //   945: astore 9
    //   947: goto +58 -> 1005
    //   950: astore 10
    //   952: goto +20 -> 972
    //   955: aload_1
    //   956: aload 9
    //   958: invokevirtual 303	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   961: putfield 304	core/f:c	[B
    //   964: aload 9
    //   966: invokevirtual 299	java/io/ByteArrayOutputStream:close	()V
    //   969: goto +46 -> 1015
    //   972: aload 9
    //   974: invokevirtual 299	java/io/ByteArrayOutputStream:close	()V
    //   977: goto +12 -> 989
    //   980: astore 9
    //   982: aload 10
    //   984: aload 9
    //   986: invokevirtual 207	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   989: aload 10
    //   991: athrow
    //   992: aload_2
    //   993: bipush 8
    //   995: aload 9
    //   997: invokeinterface 203 3 0
    //   1002: goto +13 -> 1015
    //   1005: aload_2
    //   1006: bipush 7
    //   1008: aload 9
    //   1010: invokeinterface 203 3 0
    //   1015: aload_1
    //   1016: aconst_null
    //   1017: putfield 277	core/f:a	[Lcore/Label;
    //   1020: goto +14 -> 1034
    //   1023: new 118	java/lang/IllegalStateException
    //   1026: dup
    //   1027: ldc_w 306
    //   1030: invokespecial 274	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   1033: athrow
    //   1034: aload_1
    //   1035: getfield 304	core/f:c	[B
    //   1038: astore_2
    //   1039: aload_2
    //   1040: ifnonnull +9 -> 1049
    //   1043: iconst_0
    //   1044: istore 4
    //   1046: goto +318 -> 1364
    //   1049: aload_1
    //   1050: getfield 259	core/f:e	Z
    //   1053: ifeq +346 -> 1399
    //   1056: new 308	java/io/ByteArrayInputStream
    //   1059: dup
    //   1060: aload_2
    //   1061: invokespecial 310	java/io/ByteArrayInputStream:<init>	([B)V
    //   1064: astore 9
    //   1066: new 312	java/io/FileOutputStream
    //   1069: dup
    //   1070: aload_1
    //   1071: getfield 315	core/f:f	Ljava/io/File;
    //   1074: invokespecial 316	java/io/FileOutputStream:<init>	(Ljava/io/File;)V
    //   1077: astore 10
    //   1079: aload 10
    //   1081: invokevirtual 320	java/io/FileOutputStream:getChannel	()Ljava/nio/channels/FileChannel;
    //   1084: astore 13
    //   1086: aload 13
    //   1088: invokevirtual 326	java/nio/channels/FileChannel:tryLock	()Ljava/nio/channels/FileLock;
    //   1091: astore 14
    //   1093: aload 14
    //   1095: ifnull +116 -> 1211
    //   1098: aload 14
    //   1100: invokevirtual 331	java/nio/channels/FileLock:isValid	()Z
    //   1103: istore 6
    //   1105: iload 6
    //   1107: ifeq +104 -> 1211
    //   1110: sipush 512
    //   1113: newarray byte
    //   1115: astore_2
    //   1116: aload 9
    //   1118: aload_2
    //   1119: invokevirtual 335	java/io/InputStream:read	([B)I
    //   1122: istore 4
    //   1124: iload 4
    //   1126: ifle +15 -> 1141
    //   1129: aload 10
    //   1131: aload_2
    //   1132: iconst_0
    //   1133: iload 4
    //   1135: invokevirtual 338	java/io/OutputStream:write	([BII)V
    //   1138: goto -22 -> 1116
    //   1141: aload_1
    //   1142: iconst_1
    //   1143: aconst_null
    //   1144: invokevirtual 250	core/f:add	(ILjava/io/Serializable;)V
    //   1147: aload 14
    //   1149: invokevirtual 339	java/nio/channels/FileLock:close	()V
    //   1152: aload 13
    //   1154: invokevirtual 342	java/nio/channels/spi/AbstractInterruptibleChannel:close	()V
    //   1157: aload 10
    //   1159: invokevirtual 343	java/io/FileOutputStream:close	()V
    //   1162: aload 9
    //   1164: invokevirtual 191	java/io/InputStream:close	()V
    //   1167: aload_1
    //   1168: aconst_null
    //   1169: putfield 304	core/f:c	[B
    //   1172: aload_1
    //   1173: aconst_null
    //   1174: putfield 277	core/f:a	[Lcore/Label;
    //   1177: iconst_1
    //   1178: istore 4
    //   1180: goto +184 -> 1364
    //   1183: astore_0
    //   1184: goto +203 -> 1387
    //   1187: astore_2
    //   1188: goto +143 -> 1331
    //   1191: astore_2
    //   1192: goto +159 -> 1351
    //   1195: astore_2
    //   1196: goto +109 -> 1305
    //   1199: astore_2
    //   1200: goto +83 -> 1283
    //   1203: astore_2
    //   1204: goto +52 -> 1256
    //   1207: astore_2
    //   1208: goto +21 -> 1229
    //   1211: goto +7 -> 1218
    //   1214: astore_2
    //   1215: goto -7 -> 1208
    //   1218: new 112	java/io/IOException
    //   1221: dup
    //   1222: ldc_w 345
    //   1225: invokespecial 346	java/io/IOException:<init>	(Ljava/lang/String;)V
    //   1228: athrow
    //   1229: aload 14
    //   1231: ifnull +19 -> 1250
    //   1234: aload 14
    //   1236: invokevirtual 339	java/nio/channels/FileLock:close	()V
    //   1239: goto +11 -> 1250
    //   1242: astore 14
    //   1244: aload_2
    //   1245: aload 14
    //   1247: invokevirtual 207	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   1250: aload_2
    //   1251: athrow
    //   1252: astore_2
    //   1253: goto -49 -> 1204
    //   1256: aload 13
    //   1258: ifnull +19 -> 1277
    //   1261: aload 13
    //   1263: invokevirtual 342	java/nio/channels/spi/AbstractInterruptibleChannel:close	()V
    //   1266: goto +11 -> 1277
    //   1269: astore 13
    //   1271: aload_2
    //   1272: aload 13
    //   1274: invokevirtual 207	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   1277: aload_2
    //   1278: athrow
    //   1279: astore_2
    //   1280: goto -80 -> 1200
    //   1283: aload 10
    //   1285: invokevirtual 343	java/io/FileOutputStream:close	()V
    //   1288: goto +11 -> 1299
    //   1291: astore 10
    //   1293: aload_2
    //   1294: aload 10
    //   1296: invokevirtual 207	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   1299: aload_2
    //   1300: athrow
    //   1301: astore_2
    //   1302: goto -106 -> 1196
    //   1305: aload 9
    //   1307: invokevirtual 191	java/io/InputStream:close	()V
    //   1310: goto +11 -> 1321
    //   1313: astore 9
    //   1315: aload_2
    //   1316: aload 9
    //   1318: invokevirtual 207	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   1321: aload_2
    //   1322: athrow
    //   1323: astore_2
    //   1324: goto -136 -> 1188
    //   1327: astore_2
    //   1328: goto -136 -> 1192
    //   1331: aload_1
    //   1332: bipush 7
    //   1334: aload_2
    //   1335: invokevirtual 250	core/f:add	(ILjava/io/Serializable;)V
    //   1338: aload_1
    //   1339: aconst_null
    //   1340: putfield 304	core/f:c	[B
    //   1343: aload_1
    //   1344: aconst_null
    //   1345: putfield 277	core/f:a	[Lcore/Label;
    //   1348: goto +13 -> 1361
    //   1351: aload_1
    //   1352: bipush 6
    //   1354: aload_2
    //   1355: invokevirtual 250	core/f:add	(ILjava/io/Serializable;)V
    //   1358: goto -20 -> 1338
    //   1361: iconst_0
    //   1362: istore 4
    //   1364: iload 4
    //   1366: istore 5
    //   1368: iload 4
    //   1370: ifeq +50 -> 1420
    //   1373: aload 11
    //   1375: aload 12
    //   1377: invokestatic 349	core/b:write	(Landroid/content/pm/PackageInfo;Ljava/io/File;)V
    //   1380: iload 4
    //   1382: istore 5
    //   1384: goto +36 -> 1420
    //   1387: aload_1
    //   1388: aconst_null
    //   1389: putfield 304	core/f:c	[B
    //   1392: aload_1
    //   1393: aconst_null
    //   1394: putfield 277	core/f:a	[Lcore/Label;
    //   1397: aload_0
    //   1398: athrow
    //   1399: new 118	java/lang/IllegalStateException
    //   1402: dup
    //   1403: ldc_w 306
    //   1406: invokespecial 274	java/lang/IllegalStateException:<init>	(Ljava/lang/String;)V
    //   1409: athrow
    //   1410: aload 9
    //   1412: iconst_4
    //   1413: aconst_null
    //   1414: invokevirtual 250	core/f:add	(ILjava/io/Serializable;)V
    //   1417: iconst_0
    //   1418: istore 5
    //   1420: iload 5
    //   1422: ifeq +12 -> 1434
    //   1425: iload_3
    //   1426: ifeq +8 -> 1434
    //   1429: iconst_1
    //   1430: istore_3
    //   1431: goto +5 -> 1436
    //   1434: iconst_0
    //   1435: istore_3
    //   1436: aload_0
    //   1437: iload_3
    //   1438: invokestatic 222	core/Frame:a	(Landroid/content/Context;Z)V
    //   1441: return
    //   1442: astore_1
    //   1443: aload_2
    //   1444: bipush 7
    //   1446: aload_1
    //   1447: invokeinterface 203 3 0
    //   1452: aload_0
    //   1453: iconst_0
    //   1454: invokestatic 222	core/Frame:a	(Landroid/content/Context;Z)V
    //   1457: return
    //   1458: astore 13
    //   1460: goto -1369 -> 91
    //   1463: astore 13
    //   1465: goto -1374 -> 91
    //   1468: astore 13
    //   1470: goto -1379 -> 91
    //   1473: astore_1
    //   1474: goto -1092 -> 382
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1477	0	paramContext	android.content.Context
    //   0	1477	1	paramExecutor	java.util.concurrent.Executor
    //   0	1477	2	paramMenu	Menu
    //   0	1477	3	paramBoolean	boolean
    //   139	1242	4	j	int
    //   92	1329	5	k	int
    //   365	741	6	bool	boolean
    //   120	8	7	l	long
    //   11	922	9	localObject1	Object
    //   940	1	9	localIllegalStateException1	IllegalStateException
    //   945	28	9	localIOException1	IOException
    //   980	29	9	localThrowable1	Throwable
    //   1064	242	9	localByteArrayInputStream	ByteArrayInputStream
    //   1313	98	9	localThrowable2	Throwable
    //   18	483	10	localObject2	Object
    //   516	1	10	localIllegalStateException2	IllegalStateException
    //   521	1	10	localIOException2	IOException
    //   536	226	10	localObject3	Object
    //   769	16	10	localThrowable3	Throwable
    //   852	56	10	arrayOfLabel	Label[]
    //   950	40	10	localThrowable4	Throwable
    //   1077	207	10	localFileOutputStream	FileOutputStream
    //   1291	4	10	localThrowable5	Throwable
    //   4	1370	11	localObject4	Object
    //   64	1312	12	localFile1	File
    //   81	25	13	localFile2	File
    //   171	20	13	localThrowable6	Throwable
    //   245	1017	13	localObject5	Object
    //   1269	4	13	localThrowable7	Throwable
    //   1458	1	13	localIOException3	IOException
    //   1463	1	13	localIOException4	IOException
    //   1468	1	13	localIOException5	IOException
    //   25	1210	14	localObject6	Object
    //   1242	4	14	localThrowable8	Throwable
    //   113	61	15	localDataInputStream	java.io.DataInputStream
    //   181	5	15	localThrowable9	Throwable
    //   312	403	15	arrayOfByte	byte[]
    //   468	6	16	str	String
    // Exception table:
    //   from	to	target	type
    //   115	122	171	java/lang/Throwable
    //   173	178	181	java/lang/Throwable
    //   396	407	410	java/io/IOException
    //   396	407	423	java/io/FileNotFoundException
    //   480	484	490	java/io/IOException
    //   439	451	512	java/lang/Throwable
    //   456	463	512	java/lang/Throwable
    //   470	480	512	java/lang/Throwable
    //   526	538	512	java/lang/Throwable
    //   538	541	512	java/lang/Throwable
    //   575	585	512	java/lang/Throwable
    //   439	451	516	java/lang/IllegalStateException
    //   456	463	516	java/lang/IllegalStateException
    //   470	480	516	java/lang/IllegalStateException
    //   526	538	516	java/lang/IllegalStateException
    //   538	541	516	java/lang/IllegalStateException
    //   439	451	521	java/io/IOException
    //   456	463	521	java/io/IOException
    //   470	480	521	java/io/IOException
    //   526	538	521	java/io/IOException
    //   551	555	558	java/io/IOException
    //   541	551	571	java/lang/Throwable
    //   585	589	592	java/io/IOException
    //   607	611	614	java/io/IOException
    //   668	680	734	java/lang/IllegalStateException
    //   723	728	734	java/lang/IllegalStateException
    //   771	777	734	java/lang/IllegalStateException
    //   777	779	734	java/lang/IllegalStateException
    //   784	789	734	java/lang/IllegalStateException
    //   668	680	738	java/io/IOException
    //   723	728	738	java/io/IOException
    //   771	777	738	java/io/IOException
    //   777	779	738	java/io/IOException
    //   784	789	738	java/io/IOException
    //   668	680	742	java/io/FileNotFoundException
    //   723	728	742	java/io/FileNotFoundException
    //   771	777	742	java/io/FileNotFoundException
    //   777	779	742	java/io/FileNotFoundException
    //   784	789	742	java/io/FileNotFoundException
    //   685	699	746	java/lang/Throwable
    //   704	723	746	java/lang/Throwable
    //   750	761	746	java/lang/Throwable
    //   761	766	769	java/lang/Throwable
    //   880	889	940	java/lang/IllegalStateException
    //   932	937	940	java/lang/IllegalStateException
    //   964	969	940	java/lang/IllegalStateException
    //   982	989	940	java/lang/IllegalStateException
    //   989	992	940	java/lang/IllegalStateException
    //   880	889	945	java/io/IOException
    //   932	937	945	java/io/IOException
    //   964	969	945	java/io/IOException
    //   982	989	945	java/io/IOException
    //   989	992	945	java/io/IOException
    //   889	914	950	java/lang/Throwable
    //   919	932	950	java/lang/Throwable
    //   955	964	950	java/lang/Throwable
    //   972	977	980	java/lang/Throwable
    //   1056	1066	1183	java/lang/Throwable
    //   1162	1167	1183	java/lang/Throwable
    //   1315	1321	1183	java/lang/Throwable
    //   1321	1323	1183	java/lang/Throwable
    //   1331	1338	1183	java/lang/Throwable
    //   1351	1358	1183	java/lang/Throwable
    //   1162	1167	1187	java/io/IOException
    //   1315	1321	1187	java/io/IOException
    //   1321	1323	1187	java/io/IOException
    //   1162	1167	1191	java/io/FileNotFoundException
    //   1315	1321	1191	java/io/FileNotFoundException
    //   1321	1323	1191	java/io/FileNotFoundException
    //   1157	1162	1195	java/lang/Throwable
    //   1293	1299	1195	java/lang/Throwable
    //   1299	1301	1195	java/lang/Throwable
    //   1152	1157	1199	java/lang/Throwable
    //   1271	1277	1199	java/lang/Throwable
    //   1277	1279	1199	java/lang/Throwable
    //   1147	1152	1203	java/lang/Throwable
    //   1244	1250	1203	java/lang/Throwable
    //   1250	1252	1203	java/lang/Throwable
    //   1141	1147	1207	java/lang/Throwable
    //   1218	1229	1207	java/lang/Throwable
    //   1098	1105	1214	java/lang/Throwable
    //   1110	1116	1214	java/lang/Throwable
    //   1116	1124	1214	java/lang/Throwable
    //   1129	1138	1214	java/lang/Throwable
    //   1234	1239	1242	java/lang/Throwable
    //   1086	1093	1252	java/lang/Throwable
    //   1261	1266	1269	java/lang/Throwable
    //   1079	1086	1279	java/lang/Throwable
    //   1283	1288	1291	java/lang/Throwable
    //   1066	1079	1301	java/lang/Throwable
    //   1305	1310	1313	java/lang/Throwable
    //   1056	1066	1323	java/io/IOException
    //   1056	1066	1327	java/io/FileNotFoundException
    //   50	60	1442	android/content/pm/PackageManager$NameNotFoundException
    //   97	115	1458	java/io/IOException
    //   122	127	1463	java/io/IOException
    //   183	190	1468	java/io/IOException
    //   190	193	1468	java/io/IOException
    //   360	367	1473	java/io/IOException
    //   372	379	1473	java/io/IOException
  }
  
  public static void a(ByteArrayOutputStream paramByteArrayOutputStream, int paramInt)
  {
    a(paramByteArrayOutputStream, paramInt, 2);
  }
  
  public static void a(ByteArrayOutputStream paramByteArrayOutputStream, long paramLong, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    int j = 0;
    while (j < paramInt)
    {
      arrayOfByte[j] = ((byte)(int)(paramLong >> j * 8 & 0xFF));
      j += 1;
    }
    paramByteArrayOutputStream.write(arrayOfByte);
  }
  
  public static void a(ByteArrayOutputStream paramByteArrayOutputStream, Label paramLabel)
  {
    write(paramByteArrayOutputStream, paramLabel);
    Object localObject = f;
    int n = localObject.length;
    int j = 0;
    int m;
    for (int k = 0; j < n; k = m)
    {
      m = localObject[j];
      a(paramByteArrayOutputStream, m - k);
      j += 1;
    }
    j = b;
    localObject = new byte[(j * 2 + 7 & 0xFFFFFFF8) / 8];
    paramLabel = c.entrySet().iterator();
    while (paramLabel.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramLabel.next();
      k = ((Integer)localEntry.getKey()).intValue();
      m = ((Integer)localEntry.getValue()).intValue();
      if ((m & 0x2) != 0)
      {
        n = k / 8;
        localObject[n] = ((byte)(localObject[n] | 1 << k % 8));
      }
      if ((m & 0x4) != 0)
      {
        k += j;
        m = k / 8;
        localObject[m] = ((byte)(1 << k % 8 | localObject[m]));
      }
    }
    paramByteArrayOutputStream.write((byte[])localObject);
  }
  
  public static void a(ByteArrayOutputStream paramByteArrayOutputStream, Label paramLabel, String paramString)
  {
    Charset localCharset = StandardCharsets.UTF_8;
    a(paramByteArrayOutputStream, paramString.getBytes(localCharset).length);
    a(paramByteArrayOutputStream, d);
    a(paramByteArrayOutputStream, e, 4);
    a(paramByteArrayOutputStream, i, 4);
    a(paramByteArrayOutputStream, b, 4);
    paramByteArrayOutputStream.write(paramString.getBytes(localCharset));
  }
  
  public static boolean a(ByteArrayOutputStream paramByteArrayOutputStream, byte[] paramArrayOfByte, Label[] paramArrayOfLabel)
  {
    Object localObject3 = a;
    Object localObject2;
    int k;
    int j;
    int m;
    Object localObject4;
    int n;
    if (Arrays.equals(paramArrayOfByte, (byte[])localObject3))
    {
      localObject1 = new ArrayList(3);
      paramArrayOfByte = new ArrayList(3);
      localObject2 = new ByteArrayOutputStream();
      try
      {
        a((ByteArrayOutputStream)localObject2, paramArrayOfLabel.length);
        k = 0;
        j = 2;
        for (;;)
        {
          m = paramArrayOfLabel.length;
          if (k >= m) {
            break;
          }
          localObject4 = paramArrayOfLabel[k];
          a((ByteArrayOutputStream)localObject2, i, 4);
          a((ByteArrayOutputStream)localObject2, a, 4);
          a((ByteArrayOutputStream)localObject2, b, 4);
          localObject4 = a(g, p, (byte[])localObject3);
          localObject5 = StandardCharsets.UTF_8;
          m = ((String)localObject4).getBytes((Charset)localObject5).length;
          a((ByteArrayOutputStream)localObject2, m);
          j = j + 14 + m;
          ((OutputStream)localObject2).write(((String)localObject4).getBytes((Charset)localObject5));
          k += 1;
        }
      }
      catch (Throwable paramByteArrayOutputStream)
      {
        Object localObject5;
        for (;;) {}
        localObject3 = ((ByteArrayOutputStream)localObject2).toByteArray();
        k = localObject3.length;
        if (j == k)
        {
          localObject3 = new e(1, (byte[])localObject3, false);
          ((ByteArrayOutputStream)localObject2).close();
          ((ArrayList)localObject1).add(localObject3);
          localObject2 = new ByteArrayOutputStream();
          j = 0;
          k = 0;
          for (;;)
          {
            int i1 = 0;
            try
            {
              m = paramArrayOfLabel.length;
              if (j >= m) {
                break label364;
              }
              localObject3 = paramArrayOfLabel[j];
              a((ByteArrayOutputStream)localObject2, j);
              a((ByteArrayOutputStream)localObject2, d);
              m = d;
              n = k + 4 + m * 2;
              localObject3 = f;
              int i2 = localObject3.length;
              m = 0;
              k = i1;
              while (k < i2)
              {
                i1 = localObject3[k];
                a((ByteArrayOutputStream)localObject2, i1 - m);
                k += 1;
                m = i1;
              }
              j += 1;
              k = n;
            }
            catch (Throwable paramByteArrayOutputStream)
            {
              for (;;) {}
              label364:
              localObject3 = ((ByteArrayOutputStream)localObject2).toByteArray();
              j = localObject3.length;
              if (k != j) {
                break label1059;
              }
              localObject3 = new e(3, (byte[])localObject3, true);
              ((ByteArrayOutputStream)localObject2).close();
              ((ArrayList)localObject1).add(localObject3);
              localObject2 = new ByteArrayOutputStream();
              k = 0;
              j = 0;
              try
              {
                m = paramArrayOfLabel.length;
                if (k < m)
                {
                  localObject3 = paramArrayOfLabel[k];
                  localObject4 = c.entrySet().iterator();
                  m = 0;
                  for (;;)
                  {
                    boolean bool = ((Iterator)localObject4).hasNext();
                    if (!bool) {
                      break;
                    }
                    n = ((Integer)((Map.Entry)((Iterator)localObject4).next()).getValue()).intValue();
                    m |= n;
                  }
                  localObject5 = new ByteArrayOutputStream();
                }
              }
              catch (Throwable paramByteArrayOutputStream)
              {
                try
                {
                  for (;;)
                  {
                    write((ByteArrayOutputStream)localObject5, m, (Label)localObject3);
                    localObject4 = ((ByteArrayOutputStream)localObject5).toByteArray();
                    ((ByteArrayOutputStream)localObject5).close();
                    localObject5 = new ByteArrayOutputStream();
                    try
                    {
                      write((ByteArrayOutputStream)localObject5, (Label)localObject3);
                      localObject3 = ((ByteArrayOutputStream)localObject5).toByteArray();
                      ((ByteArrayOutputStream)localObject5).close();
                      a((ByteArrayOutputStream)localObject2, k);
                      n = localObject4.length;
                      i1 = localObject3.length;
                      n = n + 2 + i1;
                      a((ByteArrayOutputStream)localObject2, n, 4);
                      a((ByteArrayOutputStream)localObject2, m);
                      ((OutputStream)localObject2).write((byte[])localObject4);
                      ((OutputStream)localObject2).write((byte[])localObject3);
                      j = j + 6 + n;
                      k += 1;
                    }
                    catch (Throwable paramByteArrayOutputStream)
                    {
                      try
                      {
                        ((ByteArrayOutputStream)localObject5).close();
                      }
                      catch (Throwable paramArrayOfByte)
                      {
                        paramByteArrayOutputStream.addSuppressed(paramArrayOfByte);
                      }
                      throw paramByteArrayOutputStream;
                    }
                  }
                  paramByteArrayOutputStream = paramByteArrayOutputStream;
                }
                catch (Throwable paramByteArrayOutputStream)
                {
                  try
                  {
                    ((ByteArrayOutputStream)localObject5).close();
                  }
                  catch (Throwable paramArrayOfByte)
                  {
                    paramByteArrayOutputStream.addSuppressed(paramArrayOfByte);
                  }
                  throw paramByteArrayOutputStream;
                }
                paramArrayOfLabel = ((ByteArrayOutputStream)localObject2).toByteArray();
                k = paramArrayOfLabel.length;
                if (j == k)
                {
                  paramArrayOfLabel = new e(4, paramArrayOfLabel, true);
                  ((ByteArrayOutputStream)localObject2).close();
                  ((ArrayList)localObject1).add(paramArrayOfLabel);
                  long l1 = 4;
                  long l2 = l1 + l1 + 4L + ((ArrayList)localObject1).size() * 16;
                  a(paramByteArrayOutputStream, ((ArrayList)localObject1).size(), 4);
                  j = 0;
                  while (j < ((ArrayList)localObject1).size())
                  {
                    paramArrayOfLabel = (e)((ArrayList)localObject1).get(j);
                    k = f;
                    if (k != 1) {
                      if (k != 2) {
                        if (k != 3) {
                          if (k != 4) {
                            if (k == 5) {
                              l1 = 4L;
                            }
                          }
                        }
                      }
                    }
                    for (;;)
                    {
                      break;
                      throw new NullPointerException("Null throw statement replaced by Soot");
                      l1 = 3L;
                      continue;
                      l1 = 2L;
                      continue;
                      l1 = 1L;
                      continue;
                      l1 = 0L;
                    }
                    a(paramByteArrayOutputStream, l1, 4);
                    a(paramByteArrayOutputStream, l2, 4);
                    localObject2 = b;
                    if (c)
                    {
                      l1 = localObject2.length;
                      paramArrayOfLabel = write((byte[])localObject2);
                      paramArrayOfByte.add(paramArrayOfLabel);
                      a(paramByteArrayOutputStream, paramArrayOfLabel.length, 4);
                      a(paramByteArrayOutputStream, l1, 4);
                    }
                    for (k = paramArrayOfLabel.length;; k = localObject2.length)
                    {
                      l2 += k;
                      break;
                      paramArrayOfByte.add(localObject2);
                      a(paramByteArrayOutputStream, localObject2.length, 4);
                      a(paramByteArrayOutputStream, 0L, 4);
                    }
                    j += 1;
                  }
                  j = 0;
                  while (j < paramArrayOfByte.size())
                  {
                    paramByteArrayOutputStream.write((byte[])paramArrayOfByte.get(j));
                    j += 1;
                  }
                  return true;
                }
                paramByteArrayOutputStream = new StringBuilder();
                paramByteArrayOutputStream.append("Expected size ");
                paramByteArrayOutputStream.append(j);
                paramByteArrayOutputStream.append(", does not match actual size ");
                paramByteArrayOutputStream.append(paramArrayOfLabel.length);
                throw new IllegalStateException(paramByteArrayOutputStream.toString());
                try
                {
                  ((ByteArrayOutputStream)localObject2).close();
                }
                catch (Throwable paramArrayOfByte)
                {
                  paramByteArrayOutputStream.addSuppressed(paramArrayOfByte);
                }
                throw paramByteArrayOutputStream;
              }
              label1059:
              paramByteArrayOutputStream = new StringBuilder();
              paramByteArrayOutputStream.append("Expected size ");
              paramByteArrayOutputStream.append(k);
              paramByteArrayOutputStream.append(", does not match actual size ");
              paramByteArrayOutputStream.append(localObject3.length);
              throw new IllegalStateException(paramByteArrayOutputStream.toString());
            }
          }
          try
          {
            ((ByteArrayOutputStream)localObject2).close();
          }
          catch (Throwable paramArrayOfByte)
          {
            paramByteArrayOutputStream.addSuppressed(paramArrayOfByte);
          }
          throw paramByteArrayOutputStream;
        }
        paramByteArrayOutputStream = new StringBuilder();
        paramByteArrayOutputStream.append("Expected size ");
        paramByteArrayOutputStream.append(j);
        paramByteArrayOutputStream.append(", does not match actual size ");
        paramByteArrayOutputStream.append(localObject3.length);
        throw new IllegalStateException(paramByteArrayOutputStream.toString());
      }
      try
      {
        ((ByteArrayOutputStream)localObject2).close();
      }
      catch (Throwable paramArrayOfByte)
      {
        paramByteArrayOutputStream.addSuppressed(paramArrayOfByte);
      }
      throw paramByteArrayOutputStream;
    }
    Object localObject1 = f;
    if (Arrays.equals(paramArrayOfByte, (byte[])localObject1))
    {
      paramArrayOfByte = a(paramArrayOfLabel, (byte[])localObject1);
      a(paramByteArrayOutputStream, paramArrayOfLabel.length, 1);
      a(paramByteArrayOutputStream, paramArrayOfByte.length, 4);
      paramArrayOfByte = write(paramArrayOfByte);
      a(paramByteArrayOutputStream, paramArrayOfByte.length, 4);
      paramByteArrayOutputStream.write(paramArrayOfByte);
      return true;
    }
    localObject1 = h;
    if (Arrays.equals(paramArrayOfByte, (byte[])localObject1))
    {
      a(paramByteArrayOutputStream, paramArrayOfLabel.length, 1);
      m = paramArrayOfLabel.length;
      j = 0;
      while (j < m)
      {
        paramArrayOfByte = paramArrayOfLabel[j];
        k = c.size();
        localObject2 = p;
        localObject2 = a(g, (String)localObject2, (byte[])localObject1);
        localObject3 = StandardCharsets.UTF_8;
        a(paramByteArrayOutputStream, ((String)localObject2).getBytes((Charset)localObject3).length);
        a(paramByteArrayOutputStream, f.length);
        a(paramByteArrayOutputStream, k * 4, 4);
        a(paramByteArrayOutputStream, i, 4);
        paramByteArrayOutputStream.write(((String)localObject2).getBytes((Charset)localObject3));
        localObject2 = c.keySet().iterator();
        while (((Iterator)localObject2).hasNext())
        {
          a(paramByteArrayOutputStream, ((Integer)((Iterator)localObject2).next()).intValue());
          a(paramByteArrayOutputStream, 0);
        }
        paramArrayOfByte = f;
        n = paramArrayOfByte.length;
        k = 0;
        while (k < n)
        {
          a(paramByteArrayOutputStream, paramArrayOfByte[k]);
          k += 1;
        }
        j += 1;
      }
      return true;
    }
    localObject1 = g;
    if (Arrays.equals(paramArrayOfByte, (byte[])localObject1))
    {
      paramArrayOfByte = a(paramArrayOfLabel, (byte[])localObject1);
      a(paramByteArrayOutputStream, paramArrayOfLabel.length, 1);
      a(paramByteArrayOutputStream, paramArrayOfByte.length, 4);
      paramArrayOfByte = write(paramArrayOfByte);
      a(paramByteArrayOutputStream, paramArrayOfByte.length, 4);
      paramByteArrayOutputStream.write(paramArrayOfByte);
      return true;
    }
    localObject1 = b;
    if (Arrays.equals(paramArrayOfByte, (byte[])localObject1))
    {
      a(paramByteArrayOutputStream, paramArrayOfLabel.length);
      m = paramArrayOfLabel.length;
      j = 0;
      while (j < m)
      {
        paramArrayOfByte = paramArrayOfLabel[j];
        localObject2 = a(g, p, (byte[])localObject1);
        localObject3 = StandardCharsets.UTF_8;
        a(paramByteArrayOutputStream, ((String)localObject2).getBytes((Charset)localObject3).length);
        localObject4 = c;
        a(paramByteArrayOutputStream, ((TreeMap)localObject4).size());
        a(paramByteArrayOutputStream, f.length);
        a(paramByteArrayOutputStream, i, 4);
        paramByteArrayOutputStream.write(((String)localObject2).getBytes((Charset)localObject3));
        localObject2 = ((TreeMap)localObject4).keySet().iterator();
        while (((Iterator)localObject2).hasNext()) {
          a(paramByteArrayOutputStream, ((Integer)((Iterator)localObject2).next()).intValue());
        }
        paramArrayOfByte = f;
        n = paramArrayOfByte.length;
        k = 0;
        while (k < n)
        {
          a(paramByteArrayOutputStream, paramArrayOfByte[k]);
          k += 1;
        }
        j += 1;
      }
      return true;
    }
    return false;
  }
  
  public static boolean a(File paramFile)
  {
    if (paramFile.isDirectory())
    {
      paramFile = paramFile.listFiles();
      if (paramFile == null) {
        return false;
      }
      int k = paramFile.length;
      int j = 0;
      boolean bool = true;
      while (j < k)
      {
        if ((a(paramFile[j])) && (bool)) {
          bool = true;
        } else {
          bool = false;
        }
        j += 1;
      }
      return bool;
    }
    paramFile.delete();
    return true;
  }
  
  public static byte[] a(Label[] paramArrayOfLabel, byte[] paramArrayOfByte)
  {
    int i1 = paramArrayOfLabel.length;
    int m = 0;
    int n = 0;
    int k = 0;
    int j = 0;
    while (k < i1)
    {
      localObject = paramArrayOfLabel[k];
      int i2 = a(g, p, paramArrayOfByte).getBytes(StandardCharsets.UTF_8).length;
      int i3 = d;
      int i4 = e;
      j += (b * 2 + 7 & 0xFFFFFFF8) / 8 + (i3 * 2 + (i2 + 16) + i4);
      k += 1;
    }
    Object localObject = new ByteArrayOutputStream(j);
    Label localLabel;
    if (Arrays.equals(paramArrayOfByte, g))
    {
      m = paramArrayOfLabel.length;
      k = n;
      while (k < m)
      {
        localLabel = paramArrayOfLabel[k];
        a((ByteArrayOutputStream)localObject, localLabel, a(g, p, paramArrayOfByte));
        a((ByteArrayOutputStream)localObject, localLabel);
        k += 1;
      }
    }
    n = paramArrayOfLabel.length;
    k = 0;
    while (k < n)
    {
      localLabel = paramArrayOfLabel[k];
      a((ByteArrayOutputStream)localObject, localLabel, a(g, p, paramArrayOfByte));
      k += 1;
    }
    n = paramArrayOfLabel.length;
    k = m;
    while (k < n)
    {
      a((ByteArrayOutputStream)localObject, paramArrayOfLabel[k]);
      k += 1;
    }
    if (((ByteArrayOutputStream)localObject).size() == j) {
      return ((ByteArrayOutputStream)localObject).toByteArray();
    }
    paramArrayOfLabel = new StringBuilder("The bytes saved do not match expectation. actual=");
    paramArrayOfLabel.append(((ByteArrayOutputStream)localObject).size());
    paramArrayOfLabel.append(" expected=");
    paramArrayOfLabel.append(j);
    throw new IllegalStateException(paramArrayOfLabel.toString());
  }
  
  public static int[] a(ByteArrayInputStream paramByteArrayInputStream, int paramInt)
  {
    int[] arrayOfInt = new int[paramInt];
    int j = 0;
    int k = 0;
    while (j < paramInt)
    {
      k += (int)a(paramByteArrayInputStream, 2);
      arrayOfInt[j] = k;
      j += 1;
    }
    return arrayOfInt;
  }
  
  public static Label[] a(ByteArrayInputStream paramByteArrayInputStream, int paramInt, Label[] paramArrayOfLabel)
  {
    int j = paramByteArrayInputStream.available();
    int m = 0;
    if (j == 0) {
      return new Label[0];
    }
    if (paramInt == paramArrayOfLabel.length)
    {
      String[] arrayOfString = new String[paramInt];
      int[] arrayOfInt = new int[paramInt];
      j = 0;
      int k;
      for (;;)
      {
        k = m;
        if (j >= paramInt) {
          break;
        }
        k = (int)a(paramByteArrayInputStream, 2);
        arrayOfInt[j] = ((int)a(paramByteArrayInputStream, 2));
        arrayOfString[j] = new String(toString(paramByteArrayInputStream, k), StandardCharsets.UTF_8);
        j += 1;
      }
      for (;;)
      {
        if (k >= paramInt) {
          return paramArrayOfLabel;
        }
        Label localLabel = paramArrayOfLabel[k];
        if (!p.equals(arrayOfString[k])) {
          break;
        }
        j = arrayOfInt[k];
        d = j;
        f = a(paramByteArrayInputStream, j);
        k += 1;
      }
      throw new IllegalStateException("Order of dexfiles in metadata did not match baseline");
    }
    throw new IllegalStateException("Mismatched number of dex files found in metadata");
    return paramArrayOfLabel;
  }
  
  public static Label[] a(ByteArrayInputStream paramByteArrayInputStream, String paramString, int paramInt)
  {
    if (paramByteArrayInputStream.available() == 0) {
      return new Label[0];
    }
    Label[] arrayOfLabel = new Label[paramInt];
    int j = 0;
    int m;
    while (j < paramInt)
    {
      k = (int)a(paramByteArrayInputStream, 2);
      m = (int)a(paramByteArrayInputStream, 2);
      long l1 = a(paramByteArrayInputStream, 4);
      long l2 = a(paramByteArrayInputStream, 4);
      long l3 = a(paramByteArrayInputStream, 4);
      arrayOfLabel[j] = new Label(paramString, new String(toString(paramByteArrayInputStream, k), StandardCharsets.UTF_8), l2, m, (int)l1, (int)l3, new int[m], new TreeMap());
      j += 1;
    }
    int k = 0;
    while (k < paramInt)
    {
      paramString = arrayOfLabel[k];
      int i2 = paramByteArrayInputStream.available() - e;
      int n = 0;
      j = paramByteArrayInputStream.available();
      TreeMap localTreeMap = c;
      int i1;
      if (j > i2)
      {
        m = n + (int)a(paramByteArrayInputStream, 2);
        j = m;
        localTreeMap.put(Integer.valueOf(m), Integer.valueOf(1));
        m = (int)a(paramByteArrayInputStream, 2);
        for (;;)
        {
          n = j;
          if (m <= 0) {
            break;
          }
          a(paramByteArrayInputStream, 2);
          i1 = (int)a(paramByteArrayInputStream, 1);
          if (i1 != 6)
          {
            n = i1;
            if (i1 != 7) {
              while (n > 0)
              {
                a(paramByteArrayInputStream, 1);
                i1 = (int)a(paramByteArrayInputStream, 1);
                while (i1 > 0)
                {
                  a(paramByteArrayInputStream, 2);
                  i1 -= 1;
                }
                n -= 1;
              }
            }
          }
          m -= 1;
        }
      }
      if (paramByteArrayInputStream.available() == i2)
      {
        f = a(paramByteArrayInputStream, d);
        i1 = b;
        BitSet localBitSet = BitSet.valueOf(toString(paramByteArrayInputStream, (i1 * 2 + 7 & 0xFFFFFFF8) / 8));
        m = 0;
        while (m < i1)
        {
          if (localBitSet.get(m)) {
            j = 2;
          } else {
            j = 0;
          }
          n = j;
          if (localBitSet.get(m + i1)) {
            n = j | 0x4;
          }
          if (n != 0)
          {
            Integer localInteger = (Integer)localTreeMap.get(Integer.valueOf(m));
            paramString = localInteger;
            if (localInteger == null) {
              paramString = Integer.valueOf(0);
            }
            localTreeMap.put(Integer.valueOf(m), Integer.valueOf(n | paramString.intValue()));
          }
          m += 1;
        }
        k += 1;
      }
      else
      {
        throw new IllegalStateException("Read too much data during profile line parse");
      }
    }
    return arrayOfLabel;
  }
  
  public static Label[] a(ByteArrayInputStream paramByteArrayInputStream, byte[] paramArrayOfByte, int paramInt, Label[] paramArrayOfLabel)
  {
    if (paramByteArrayInputStream.available() == 0) {
      return new Label[0];
    }
    if (paramInt == paramArrayOfLabel.length)
    {
      int j = 0;
      String str;
      for (;;)
      {
        if (j >= paramInt) {
          return paramArrayOfLabel;
        }
        a(paramByteArrayInputStream, 2);
        str = new String(toString(paramByteArrayInputStream, (int)a(paramByteArrayInputStream, 2)), StandardCharsets.UTF_8);
        long l = a(paramByteArrayInputStream, 4);
        int n = (int)a(paramByteArrayInputStream, 2);
        int k = paramArrayOfLabel.length;
        Object localObject3 = null;
        Object localObject1;
        if (k <= 0)
        {
          localObject1 = localObject3;
        }
        else
        {
          int m = str.indexOf("!");
          k = m;
          if (m < 0) {
            k = str.indexOf(":");
          }
          if (k > 0) {
            localObject2 = str.substring(k + 1);
          } else {
            localObject2 = str;
          }
          k = 0;
          for (;;)
          {
            localObject1 = localObject3;
            if (k >= paramArrayOfLabel.length) {
              break;
            }
            if (p.equals(localObject2))
            {
              localObject1 = paramArrayOfLabel[k];
              break;
            }
            k += 1;
          }
        }
        if (localObject1 == null) {
          break;
        }
        a = l;
        Object localObject2 = a(paramByteArrayInputStream, n);
        if (Arrays.equals(paramArrayOfByte, b))
        {
          d = n;
          f = ((int[])localObject2);
        }
        j += 1;
      }
      throw new IllegalStateException("Missing profile key: ".concat(str));
    }
    throw new IllegalStateException("Mismatched number of dex files found in metadata");
    return paramArrayOfLabel;
  }
  
  public static Label[] a(FileInputStream paramFileInputStream, byte[] paramArrayOfByte, String paramString)
  {
    if (Arrays.equals(paramArrayOfByte, f))
    {
      int j = (int)a(paramFileInputStream, 1);
      long l = a(paramFileInputStream, 4);
      paramArrayOfByte = read(paramFileInputStream, (int)a(paramFileInputStream, 4), (int)l);
      if (paramFileInputStream.read() <= 0)
      {
        paramFileInputStream = new ByteArrayInputStream(paramArrayOfByte);
        try
        {
          paramArrayOfByte = a(paramFileInputStream, paramString, j);
          paramFileInputStream.close();
          return paramArrayOfByte;
        }
        catch (Throwable paramArrayOfByte)
        {
          try
          {
            paramFileInputStream.close();
          }
          catch (Throwable paramFileInputStream)
          {
            paramArrayOfByte.addSuppressed(paramFileInputStream);
          }
          throw paramArrayOfByte;
        }
      }
      throw new IllegalStateException("Content found after the end of file");
    }
    throw new IllegalStateException("Unsupported version");
  }
  
  public static Label[] a(FileInputStream paramFileInputStream, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, Label[] paramArrayOfLabel)
  {
    byte[] arrayOfByte = d;
    int j;
    long l;
    if (Arrays.equals(paramArrayOfByte1, arrayOfByte))
    {
      if (!Arrays.equals(a, paramArrayOfByte2))
      {
        if (Arrays.equals(paramArrayOfByte1, arrayOfByte))
        {
          j = (int)a(paramFileInputStream, 1);
          l = a(paramFileInputStream, 4);
          paramArrayOfByte1 = read(paramFileInputStream, (int)a(paramFileInputStream, 4), (int)l);
          if (paramFileInputStream.read() <= 0)
          {
            paramFileInputStream = new ByteArrayInputStream(paramArrayOfByte1);
            try
            {
              paramArrayOfByte1 = a(paramFileInputStream, j, paramArrayOfLabel);
              paramFileInputStream.close();
              return paramArrayOfByte1;
            }
            catch (Throwable paramArrayOfByte1)
            {
              try
              {
                paramFileInputStream.close();
              }
              catch (Throwable paramFileInputStream)
              {
                paramArrayOfByte1.addSuppressed(paramFileInputStream);
              }
              throw paramArrayOfByte1;
            }
          }
          throw new IllegalStateException("Content found after the end of file");
        }
        throw new IllegalStateException("Unsupported meta version");
      }
      throw new IllegalStateException("Requires new Baseline Profile Metadata. Please rebuild the APK with Android Gradle Plugin 7.2 Canary 7 or higher");
    }
    if (Arrays.equals(paramArrayOfByte1, e))
    {
      j = (int)a(paramFileInputStream, 2);
      l = a(paramFileInputStream, 4);
      paramArrayOfByte1 = read(paramFileInputStream, (int)a(paramFileInputStream, 4), (int)l);
      if (paramFileInputStream.read() <= 0)
      {
        paramFileInputStream = new ByteArrayInputStream(paramArrayOfByte1);
        try
        {
          paramArrayOfByte1 = a(paramFileInputStream, paramArrayOfByte2, j, paramArrayOfLabel);
          paramFileInputStream.close();
          return paramArrayOfByte1;
        }
        catch (Throwable paramArrayOfByte1)
        {
          try
          {
            paramFileInputStream.close();
          }
          catch (Throwable paramFileInputStream)
          {
            paramArrayOfByte1.addSuppressed(paramFileInputStream);
          }
          throw paramArrayOfByte1;
        }
      }
      throw new IllegalStateException("Content found after the end of file");
    }
    throw new IllegalStateException("Unsupported meta version");
  }
  
  public static byte[] read(FileInputStream paramFileInputStream, int paramInt1, int paramInt2)
  {
    localInflater = new Inflater();
    try
    {
      arrayOfByte1 = new byte[paramInt2];
      arrayOfByte2 = new byte['?'];
      j = 0;
      k = 0;
    }
    catch (Throwable paramFileInputStream)
    {
      byte[] arrayOfByte1;
      int j;
      try
      {
        byte[] arrayOfByte2;
        int k;
        int m;
        int n = localInflater.inflate(arrayOfByte1, k, paramInt2 - k);
        k += n;
        j += m;
      }
      catch (DataFormatException paramFileInputStream)
      {
        throw new IllegalStateException(paramFileInputStream.getMessage());
      }
      paramFileInputStream = paramFileInputStream;
      break label251;
      paramFileInputStream = new StringBuilder();
      paramFileInputStream.append("Invalid zip data. Stream ended after $totalBytesRead bytes. Expected ");
      paramFileInputStream.append(paramInt1);
      paramFileInputStream.append(" bytes");
      throw new IllegalStateException(paramFileInputStream.toString());
      if (j != paramInt1) {
        break label203;
      }
      boolean bool = localInflater.finished();
      if (!bool) {
        break label192;
      }
      localInflater.end();
      return arrayOfByte1;
      throw new IllegalStateException("Inflater did not finish");
      paramFileInputStream = new StringBuilder();
      paramFileInputStream.append("Didn't read enough bytes during decompression. expected=");
      paramFileInputStream.append(paramInt1);
      paramFileInputStream.append(" actual=");
      paramFileInputStream.append(j);
      throw new IllegalStateException(paramFileInputStream.toString());
      localInflater.end();
      throw paramFileInputStream;
    }
    bool = localInflater.finished();
    if (!bool)
    {
      bool = localInflater.needsDictionary();
      if ((!bool) && (j < paramInt1))
      {
        m = paramFileInputStream.read(arrayOfByte2);
        if (m >= 0) {
          localInflater.setInput(arrayOfByte2, 0, m);
        }
      }
    }
  }
  
  public static byte[] toString(InputStream paramInputStream, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    int j = 0;
    while (j < paramInt)
    {
      int k = paramInputStream.read(arrayOfByte, j, paramInt - j);
      if (k >= 0)
      {
        j += k;
      }
      else
      {
        paramInputStream = new StringBuilder("Not enough bytes to read: ");
        paramInputStream.append(paramInt);
        throw new IllegalStateException(paramInputStream.toString());
      }
    }
    return arrayOfByte;
  }
  
  public static void write(PackageInfo paramPackageInfo, File paramFile)
  {
    paramFile = new File(paramFile, "profileinstaller_profileWrittenFor_lastUpdateTime.dat");
    try
    {
      paramFile = new DataOutputStream(new FileOutputStream(paramFile));
      try
      {
        paramFile.writeLong(lastUpdateTime);
        try
        {
          paramPackageInfo.addSuppressed(paramFile);
          throw paramPackageInfo;
        }
        catch (IOException paramPackageInfo) {}
      }
      catch (Throwable paramPackageInfo)
      {
        try
        {
          paramFile.close();
          return;
        }
        catch (IOException paramPackageInfo)
        {
          return;
        }
        paramPackageInfo = paramPackageInfo;
        try
        {
          paramFile.close();
        }
        catch (Throwable paramFile) {}
      }
      return;
    }
    catch (IOException paramPackageInfo)
    {
      return;
    }
  }
  
  public static void write(ByteArrayOutputStream paramByteArrayOutputStream, int paramInt, Label paramLabel)
  {
    int j = Integer.bitCount(paramInt & 0xFFFFFFFE);
    int m = b;
    byte[] arrayOfByte = new byte[(j * m + 7 & 0xFFFFFFF8) / 8];
    paramLabel = c.entrySet().iterator();
    if (paramLabel.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramLabel.next();
      int n = ((Integer)localEntry.getKey()).intValue();
      int i1 = ((Integer)localEntry.getValue()).intValue();
      int k = 0;
      j = 1;
      label99:
      if (j <= 4) {
        if (j != 1) {
          break label116;
        }
      }
      for (;;)
      {
        j <<= 1;
        break label99;
        break;
        label116:
        if ((j & paramInt) != 0)
        {
          if ((j & i1) == j)
          {
            int i2 = k * m + n;
            int i3 = i2 / 8;
            arrayOfByte[i3] = ((byte)(1 << i2 % 8 | arrayOfByte[i3]));
          }
          k += 1;
        }
      }
    }
    paramByteArrayOutputStream.write(arrayOfByte);
  }
  
  public static void write(ByteArrayOutputStream paramByteArrayOutputStream, Label paramLabel)
  {
    paramLabel = c.entrySet().iterator();
    int j = 0;
    while (paramLabel.hasNext())
    {
      Map.Entry localEntry = (Map.Entry)paramLabel.next();
      int k = ((Integer)localEntry.getKey()).intValue();
      if ((((Integer)localEntry.getValue()).intValue() & 0x1) != 0)
      {
        a(paramByteArrayOutputStream, k - j);
        a(paramByteArrayOutputStream, 0);
        j = k;
      }
    }
  }
  
  /* Error */
  public static byte[] write(byte[] paramArrayOfByte)
  {
    // Byte code:
    //   0: new 631	java/util/zip/Deflater
    //   3: dup
    //   4: iconst_1
    //   5: invokespecial 632	java/util/zip/Deflater:<init>	(I)V
    //   8: astore_1
    //   9: new 288	java/io/ByteArrayOutputStream
    //   12: dup
    //   13: invokespecial 289	java/io/ByteArrayOutputStream:<init>	()V
    //   16: astore_3
    //   17: new 634	java/util/zip/DeflaterOutputStream
    //   20: dup
    //   21: aload_3
    //   22: aload_1
    //   23: invokespecial 637	java/util/zip/DeflaterOutputStream:<init>	(Ljava/io/OutputStream;Ljava/util/zip/Deflater;)V
    //   26: astore_2
    //   27: aload_2
    //   28: aload_0
    //   29: invokevirtual 295	java/io/OutputStream:write	([B)V
    //   32: aload_2
    //   33: invokevirtual 638	java/util/zip/DeflaterOutputStream:close	()V
    //   36: aload_1
    //   37: invokevirtual 639	java/util/zip/Deflater:end	()V
    //   40: aload_3
    //   41: invokevirtual 303	java/io/ByteArrayOutputStream:toByteArray	()[B
    //   44: areturn
    //   45: astore_0
    //   46: goto +19 -> 65
    //   49: astore_0
    //   50: aload_2
    //   51: invokevirtual 638	java/util/zip/DeflaterOutputStream:close	()V
    //   54: goto +9 -> 63
    //   57: astore_2
    //   58: aload_0
    //   59: aload_2
    //   60: invokevirtual 207	java/lang/Throwable:addSuppressed	(Ljava/lang/Throwable;)V
    //   63: aload_0
    //   64: athrow
    //   65: aload_1
    //   66: invokevirtual 639	java/util/zip/Deflater:end	()V
    //   69: aload_0
    //   70: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	71	0	paramArrayOfByte	byte[]
    //   8	58	1	localDeflater	java.util.zip.Deflater
    //   26	25	2	localDeflaterOutputStream	java.util.zip.DeflaterOutputStream
    //   57	3	2	localThrowable	Throwable
    //   16	25	3	localByteArrayOutputStream	ByteArrayOutputStream
    // Exception table:
    //   from	to	target	type
    //   17	27	45	java/lang/Throwable
    //   32	36	45	java/lang/Throwable
    //   58	63	45	java/lang/Throwable
    //   63	65	45	java/lang/Throwable
    //   27	32	49	java/lang/Throwable
    //   50	54	57	java/lang/Throwable
  }
}
