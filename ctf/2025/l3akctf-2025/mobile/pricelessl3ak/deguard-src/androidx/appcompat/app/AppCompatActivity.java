package androidx.appcompat.app;

import android.app.Activity;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.TintManager;
import androidx.appcompat.widget.Toolbar;
import androidx.appcompat.widget.h;
import androidx.fragment.asm.FragmentActivity;
import http.b;
import java.util.ArrayList;
import java.util.WeakHashMap;
import signature.BaseListFragment;
import signature.NavUtils;
import signature.TaskStackBuilder;
import signature.TaskStackBuilder.SupportParentable;
import sync.Label;
import ui.AbstractGalleryActivity;
import view.ActionMode;
import view.ActionMode.Callback;
import view.SupportMenuInflater;

public abstract class AppCompatActivity
  extends FragmentActivity
  implements AppCompatCallback, TaskStackBuilder.SupportParentable
{
  private static final String DELEGATE_TAG = "androidx:appcompat";
  private f mDelegate;
  private Resources mResources;
  
  public void addContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    initializeViewTreeOwners();
    AppCompatDelegateImplV7 localAppCompatDelegateImplV7 = (AppCompatDelegateImplV7)getDelegate();
    localAppCompatDelegateImplV7.ensureSubDecor();
    ((ViewGroup)mSubDecor.findViewById(16908290)).addView(paramView, paramLayoutParams);
    mOriginalWindowCallback.a(mWindow.getCallback());
  }
  
  /* Error */
  public void attachBaseContext(Context paramContext)
  {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual 28	androidx/appcompat/app/AppCompatActivity:getDelegate	()Landroidx/appcompat/app/f;
    //   4: checkcast 30	androidx/appcompat/app/AppCompatDelegateImplV7
    //   7: astore 9
    //   9: aload 9
    //   11: iconst_1
    //   12: putfield 88	androidx/appcompat/app/AppCompatDelegateImplV7:l	Z
    //   15: aload 9
    //   17: getfield 92	androidx/appcompat/app/AppCompatDelegateImplV7:n	I
    //   20: istore 4
    //   22: iload 4
    //   24: bipush -100
    //   26: if_icmpeq +6 -> 32
    //   29: goto +8 -> 37
    //   32: getstatic 97	androidx/appcompat/app/f:v	I
    //   35: istore 4
    //   37: aload 9
    //   39: aload_1
    //   40: iload 4
    //   42: invokevirtual 100	androidx/appcompat/app/AppCompatDelegateImplV7:a	(Landroid/content/Context;I)I
    //   45: istore 4
    //   47: aload_1
    //   48: invokestatic 104	androidx/appcompat/app/f:parse	(Landroid/content/Context;)Z
    //   51: ifeq +159 -> 210
    //   54: aload_1
    //   55: invokestatic 104	androidx/appcompat/app/f:parse	(Landroid/content/Context;)Z
    //   58: ifne +6 -> 64
    //   61: goto +149 -> 210
    //   64: getstatic 109	android/os/Build$VERSION:SDK_INT	I
    //   67: bipush 33
    //   69: if_icmplt +27 -> 96
    //   72: getstatic 112	androidx/appcompat/app/f:s	Z
    //   75: ifne +135 -> 210
    //   78: getstatic 116	androidx/appcompat/app/f:this$0	Landroidx/appcompat/app/SerializingExecutor;
    //   81: new 118	core/LogFileParser$1
    //   84: dup
    //   85: aload_1
    //   86: iconst_2
    //   87: invokespecial 122	core/LogFileParser$1:<init>	(Landroid/content/Context;I)V
    //   90: invokevirtual 128	androidx/appcompat/app/SerializingExecutor:execute	(Ljava/lang/Runnable;)V
    //   93: goto +117 -> 210
    //   96: getstatic 132	androidx/appcompat/app/f:m	Ljava/lang/Object;
    //   99: astore 9
    //   101: aload 9
    //   103: monitorenter
    //   104: getstatic 136	androidx/appcompat/app/f:c	Lsync/Label;
    //   107: astore 10
    //   109: aload 10
    //   111: ifnonnull +52 -> 163
    //   114: getstatic 139	androidx/appcompat/app/f:b	Lsync/Label;
    //   117: ifnonnull +16 -> 133
    //   120: aload_1
    //   121: invokestatic 144	signature/NavUtils:parse	(Landroid/content/Context;)Ljava/lang/String;
    //   124: invokestatic 149	sync/Label:a	(Ljava/lang/String;)Lsync/Label;
    //   127: putstatic 139	androidx/appcompat/app/f:b	Lsync/Label;
    //   130: goto +3 -> 133
    //   133: getstatic 139	androidx/appcompat/app/f:b	Lsync/Label;
    //   136: getfield 153	sync/Label:d	Lsync/Type;
    //   139: getfield 158	sync/Type:c	Landroid/os/LocaleList;
    //   142: invokevirtual 164	android/os/LocaleList:isEmpty	()Z
    //   145: ifeq +9 -> 154
    //   148: aload 9
    //   150: monitorexit
    //   151: goto +59 -> 210
    //   154: getstatic 139	androidx/appcompat/app/f:b	Lsync/Label;
    //   157: putstatic 136	androidx/appcompat/app/f:c	Lsync/Label;
    //   160: goto +39 -> 199
    //   163: aload 10
    //   165: getstatic 139	androidx/appcompat/app/f:b	Lsync/Label;
    //   168: invokevirtual 168	sync/Label:equals	(Ljava/lang/Object;)Z
    //   171: ifne +28 -> 199
    //   174: getstatic 136	androidx/appcompat/app/f:c	Lsync/Label;
    //   177: astore 10
    //   179: aload 10
    //   181: putstatic 139	androidx/appcompat/app/f:b	Lsync/Label;
    //   184: aload_1
    //   185: aload 10
    //   187: getfield 153	sync/Label:d	Lsync/Type;
    //   190: getfield 158	sync/Type:c	Landroid/os/LocaleList;
    //   193: invokevirtual 172	android/os/LocaleList:toLanguageTags	()Ljava/lang/String;
    //   196: invokestatic 176	signature/NavUtils:serialize	(Landroid/content/Context;Ljava/lang/String;)V
    //   199: aload 9
    //   201: monitorexit
    //   202: goto +8 -> 210
    //   205: aload 9
    //   207: monitorexit
    //   208: aload_1
    //   209: athrow
    //   210: aload_1
    //   211: invokestatic 179	androidx/appcompat/app/AppCompatDelegateImplV7:a	(Landroid/content/Context;)Lsync/Label;
    //   214: astore 11
    //   216: aload_1
    //   217: instanceof 181
    //   220: ifeq +31 -> 251
    //   223: aload_1
    //   224: iload 4
    //   226: aload 11
    //   228: aconst_null
    //   229: iconst_0
    //   230: invokestatic 184	androidx/appcompat/app/AppCompatDelegateImplV7:a	(Landroid/content/Context;ILsync/Label;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;
    //   233: astore 9
    //   235: aload_1
    //   236: checkcast 181	android/view/ContextThemeWrapper
    //   239: astore 10
    //   241: aload 10
    //   243: aload 9
    //   245: invokevirtual 188	android/view/ContextThemeWrapper:applyOverrideConfiguration	(Landroid/content/res/Configuration;)V
    //   248: goto +1039 -> 1287
    //   251: aload_1
    //   252: instanceof 190
    //   255: ifeq +31 -> 286
    //   258: aload_1
    //   259: iload 4
    //   261: aload 11
    //   263: aconst_null
    //   264: iconst_0
    //   265: invokestatic 184	androidx/appcompat/app/AppCompatDelegateImplV7:a	(Landroid/content/Context;ILsync/Label;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;
    //   268: astore 9
    //   270: aload_1
    //   271: checkcast 190	view/ContextThemeWrapper
    //   274: astore 10
    //   276: aload 10
    //   278: aload 9
    //   280: invokevirtual 193	view/ContextThemeWrapper:getTheme	(Landroid/content/res/Configuration;)V
    //   283: goto +1004 -> 1287
    //   286: getstatic 196	androidx/appcompat/app/AppCompatDelegateImplV7:k	Z
    //   289: ifne +6 -> 295
    //   292: goto +995 -> 1287
    //   295: new 198	android/content/res/Configuration
    //   298: dup
    //   299: invokespecial 200	android/content/res/Configuration:<init>	()V
    //   302: astore 9
    //   304: aload 9
    //   306: iconst_m1
    //   307: putfield 203	android/content/res/Configuration:uiMode	I
    //   310: aload 9
    //   312: fconst_0
    //   313: putfield 207	android/content/res/Configuration:fontScale	F
    //   316: aload_1
    //   317: aload 9
    //   319: invokevirtual 213	android/content/Context:createConfigurationContext	(Landroid/content/res/Configuration;)Landroid/content/Context;
    //   322: invokevirtual 217	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   325: invokevirtual 223	android/content/res/Resources:getConfiguration	()Landroid/content/res/Configuration;
    //   328: astore 9
    //   330: aload_1
    //   331: invokevirtual 217	android/content/Context:getResources	()Landroid/content/res/Resources;
    //   334: invokevirtual 223	android/content/res/Resources:getConfiguration	()Landroid/content/res/Configuration;
    //   337: astore 12
    //   339: aload 9
    //   341: aload 12
    //   343: getfield 203	android/content/res/Configuration:uiMode	I
    //   346: putfield 203	android/content/res/Configuration:uiMode	I
    //   349: aload 9
    //   351: aload 12
    //   353: invokevirtual 226	android/content/res/Configuration:equals	(Landroid/content/res/Configuration;)Z
    //   356: ifne +744 -> 1100
    //   359: new 198	android/content/res/Configuration
    //   362: dup
    //   363: invokespecial 200	android/content/res/Configuration:<init>	()V
    //   366: astore 10
    //   368: aload 10
    //   370: fconst_0
    //   371: putfield 207	android/content/res/Configuration:fontScale	F
    //   374: aload 9
    //   376: aload 12
    //   378: invokevirtual 230	android/content/res/Configuration:diff	(Landroid/content/res/Configuration;)I
    //   381: ifne +10 -> 391
    //   384: aload 10
    //   386: astore 9
    //   388: goto +715 -> 1103
    //   391: aload 9
    //   393: getfield 207	android/content/res/Configuration:fontScale	F
    //   396: fstore_2
    //   397: aload 12
    //   399: getfield 207	android/content/res/Configuration:fontScale	F
    //   402: fstore_3
    //   403: fload_2
    //   404: fload_3
    //   405: fcmpl
    //   406: ifeq +9 -> 415
    //   409: aload 10
    //   411: fload_3
    //   412: putfield 207	android/content/res/Configuration:fontScale	F
    //   415: aload 9
    //   417: getfield 233	android/content/res/Configuration:mcc	I
    //   420: istore 5
    //   422: aload 12
    //   424: getfield 233	android/content/res/Configuration:mcc	I
    //   427: istore 6
    //   429: iload 5
    //   431: iload 6
    //   433: if_icmpeq +10 -> 443
    //   436: aload 10
    //   438: iload 6
    //   440: putfield 233	android/content/res/Configuration:mcc	I
    //   443: aload 9
    //   445: getfield 236	android/content/res/Configuration:mnc	I
    //   448: istore 5
    //   450: aload 12
    //   452: getfield 236	android/content/res/Configuration:mnc	I
    //   455: istore 6
    //   457: iload 5
    //   459: iload 6
    //   461: if_icmpeq +10 -> 471
    //   464: aload 10
    //   466: iload 6
    //   468: putfield 236	android/content/res/Configuration:mnc	I
    //   471: getstatic 109	android/os/Build$VERSION:SDK_INT	I
    //   474: istore 5
    //   476: aload 9
    //   478: aload 12
    //   480: aload 10
    //   482: invokestatic 242	androidx/appcompat/app/Widget:setLocale	(Landroid/content/res/Configuration;Landroid/content/res/Configuration;Landroid/content/res/Configuration;)V
    //   485: aload 9
    //   487: getfield 245	android/content/res/Configuration:touchscreen	I
    //   490: istore 6
    //   492: aload 12
    //   494: getfield 245	android/content/res/Configuration:touchscreen	I
    //   497: istore 7
    //   499: iload 6
    //   501: iload 7
    //   503: if_icmpeq +10 -> 513
    //   506: aload 10
    //   508: iload 7
    //   510: putfield 245	android/content/res/Configuration:touchscreen	I
    //   513: aload 9
    //   515: getfield 248	android/content/res/Configuration:keyboard	I
    //   518: istore 6
    //   520: aload 12
    //   522: getfield 248	android/content/res/Configuration:keyboard	I
    //   525: istore 7
    //   527: iload 6
    //   529: iload 7
    //   531: if_icmpeq +10 -> 541
    //   534: aload 10
    //   536: iload 7
    //   538: putfield 248	android/content/res/Configuration:keyboard	I
    //   541: aload 9
    //   543: getfield 251	android/content/res/Configuration:keyboardHidden	I
    //   546: istore 6
    //   548: aload 12
    //   550: getfield 251	android/content/res/Configuration:keyboardHidden	I
    //   553: istore 7
    //   555: iload 6
    //   557: iload 7
    //   559: if_icmpeq +10 -> 569
    //   562: aload 10
    //   564: iload 7
    //   566: putfield 251	android/content/res/Configuration:keyboardHidden	I
    //   569: aload 9
    //   571: getfield 254	android/content/res/Configuration:navigation	I
    //   574: istore 6
    //   576: aload 12
    //   578: getfield 254	android/content/res/Configuration:navigation	I
    //   581: istore 7
    //   583: iload 6
    //   585: iload 7
    //   587: if_icmpeq +10 -> 597
    //   590: aload 10
    //   592: iload 7
    //   594: putfield 254	android/content/res/Configuration:navigation	I
    //   597: aload 9
    //   599: getfield 257	android/content/res/Configuration:navigationHidden	I
    //   602: istore 6
    //   604: aload 12
    //   606: getfield 257	android/content/res/Configuration:navigationHidden	I
    //   609: istore 7
    //   611: iload 6
    //   613: iload 7
    //   615: if_icmpeq +10 -> 625
    //   618: aload 10
    //   620: iload 7
    //   622: putfield 257	android/content/res/Configuration:navigationHidden	I
    //   625: aload 9
    //   627: getfield 260	android/content/res/Configuration:orientation	I
    //   630: istore 6
    //   632: aload 12
    //   634: getfield 260	android/content/res/Configuration:orientation	I
    //   637: istore 7
    //   639: iload 6
    //   641: iload 7
    //   643: if_icmpeq +10 -> 653
    //   646: aload 10
    //   648: iload 7
    //   650: putfield 260	android/content/res/Configuration:orientation	I
    //   653: aload 9
    //   655: getfield 263	android/content/res/Configuration:screenLayout	I
    //   658: istore 6
    //   660: aload 12
    //   662: getfield 263	android/content/res/Configuration:screenLayout	I
    //   665: bipush 15
    //   667: iand
    //   668: istore 7
    //   670: iload 6
    //   672: bipush 15
    //   674: iand
    //   675: iload 7
    //   677: if_icmpeq +16 -> 693
    //   680: aload 10
    //   682: aload 10
    //   684: getfield 263	android/content/res/Configuration:screenLayout	I
    //   687: iload 7
    //   689: ior
    //   690: putfield 263	android/content/res/Configuration:screenLayout	I
    //   693: aload 9
    //   695: getfield 263	android/content/res/Configuration:screenLayout	I
    //   698: istore 6
    //   700: aload 12
    //   702: getfield 263	android/content/res/Configuration:screenLayout	I
    //   705: sipush 192
    //   708: iand
    //   709: istore 7
    //   711: iload 6
    //   713: sipush 192
    //   716: iand
    //   717: iload 7
    //   719: if_icmpeq +16 -> 735
    //   722: aload 10
    //   724: aload 10
    //   726: getfield 263	android/content/res/Configuration:screenLayout	I
    //   729: iload 7
    //   731: ior
    //   732: putfield 263	android/content/res/Configuration:screenLayout	I
    //   735: aload 9
    //   737: getfield 263	android/content/res/Configuration:screenLayout	I
    //   740: istore 6
    //   742: aload 12
    //   744: getfield 263	android/content/res/Configuration:screenLayout	I
    //   747: bipush 48
    //   749: iand
    //   750: istore 7
    //   752: iload 6
    //   754: bipush 48
    //   756: iand
    //   757: iload 7
    //   759: if_icmpeq +16 -> 775
    //   762: aload 10
    //   764: aload 10
    //   766: getfield 263	android/content/res/Configuration:screenLayout	I
    //   769: iload 7
    //   771: ior
    //   772: putfield 263	android/content/res/Configuration:screenLayout	I
    //   775: aload 9
    //   777: getfield 263	android/content/res/Configuration:screenLayout	I
    //   780: istore 6
    //   782: aload 12
    //   784: getfield 263	android/content/res/Configuration:screenLayout	I
    //   787: sipush 768
    //   790: iand
    //   791: istore 7
    //   793: iload 6
    //   795: sipush 768
    //   798: iand
    //   799: iload 7
    //   801: if_icmpeq +16 -> 817
    //   804: aload 10
    //   806: aload 10
    //   808: getfield 263	android/content/res/Configuration:screenLayout	I
    //   811: iload 7
    //   813: ior
    //   814: putfield 263	android/content/res/Configuration:screenLayout	I
    //   817: iload 5
    //   819: bipush 26
    //   821: if_icmplt +76 -> 897
    //   824: aload 9
    //   826: invokestatic 268	Client/StringUtil:toString	(Landroid/content/res/Configuration;)I
    //   829: iconst_3
    //   830: iand
    //   831: aload 12
    //   833: invokestatic 268	Client/StringUtil:toString	(Landroid/content/res/Configuration;)I
    //   836: iconst_3
    //   837: iand
    //   838: if_icmpeq +21 -> 859
    //   841: aload 10
    //   843: aload 10
    //   845: invokestatic 268	Client/StringUtil:toString	(Landroid/content/res/Configuration;)I
    //   848: aload 12
    //   850: invokestatic 268	Client/StringUtil:toString	(Landroid/content/res/Configuration;)I
    //   853: iconst_3
    //   854: iand
    //   855: ior
    //   856: invokestatic 272	Client/StringUtil:init	(Landroid/content/res/Configuration;I)V
    //   859: aload 9
    //   861: invokestatic 268	Client/StringUtil:toString	(Landroid/content/res/Configuration;)I
    //   864: bipush 12
    //   866: iand
    //   867: aload 12
    //   869: invokestatic 268	Client/StringUtil:toString	(Landroid/content/res/Configuration;)I
    //   872: bipush 12
    //   874: iand
    //   875: if_icmpeq +22 -> 897
    //   878: aload 10
    //   880: aload 10
    //   882: invokestatic 268	Client/StringUtil:toString	(Landroid/content/res/Configuration;)I
    //   885: aload 12
    //   887: invokestatic 268	Client/StringUtil:toString	(Landroid/content/res/Configuration;)I
    //   890: bipush 12
    //   892: iand
    //   893: ior
    //   894: invokestatic 272	Client/StringUtil:init	(Landroid/content/res/Configuration;I)V
    //   897: aload 9
    //   899: getfield 203	android/content/res/Configuration:uiMode	I
    //   902: istore 5
    //   904: aload 12
    //   906: getfield 203	android/content/res/Configuration:uiMode	I
    //   909: bipush 15
    //   911: iand
    //   912: istore 6
    //   914: iload 5
    //   916: bipush 15
    //   918: iand
    //   919: iload 6
    //   921: if_icmpeq +16 -> 937
    //   924: aload 10
    //   926: aload 10
    //   928: getfield 203	android/content/res/Configuration:uiMode	I
    //   931: iload 6
    //   933: ior
    //   934: putfield 203	android/content/res/Configuration:uiMode	I
    //   937: aload 9
    //   939: getfield 203	android/content/res/Configuration:uiMode	I
    //   942: istore 5
    //   944: aload 12
    //   946: getfield 203	android/content/res/Configuration:uiMode	I
    //   949: bipush 48
    //   951: iand
    //   952: istore 6
    //   954: iload 5
    //   956: bipush 48
    //   958: iand
    //   959: iload 6
    //   961: if_icmpeq +16 -> 977
    //   964: aload 10
    //   966: aload 10
    //   968: getfield 203	android/content/res/Configuration:uiMode	I
    //   971: iload 6
    //   973: ior
    //   974: putfield 203	android/content/res/Configuration:uiMode	I
    //   977: aload 9
    //   979: getfield 275	android/content/res/Configuration:screenWidthDp	I
    //   982: istore 5
    //   984: aload 12
    //   986: getfield 275	android/content/res/Configuration:screenWidthDp	I
    //   989: istore 6
    //   991: iload 5
    //   993: iload 6
    //   995: if_icmpeq +10 -> 1005
    //   998: aload 10
    //   1000: iload 6
    //   1002: putfield 275	android/content/res/Configuration:screenWidthDp	I
    //   1005: aload 9
    //   1007: getfield 278	android/content/res/Configuration:screenHeightDp	I
    //   1010: istore 5
    //   1012: aload 12
    //   1014: getfield 278	android/content/res/Configuration:screenHeightDp	I
    //   1017: istore 6
    //   1019: iload 5
    //   1021: iload 6
    //   1023: if_icmpeq +10 -> 1033
    //   1026: aload 10
    //   1028: iload 6
    //   1030: putfield 278	android/content/res/Configuration:screenHeightDp	I
    //   1033: aload 9
    //   1035: getfield 281	android/content/res/Configuration:smallestScreenWidthDp	I
    //   1038: istore 5
    //   1040: aload 12
    //   1042: getfield 281	android/content/res/Configuration:smallestScreenWidthDp	I
    //   1045: istore 6
    //   1047: iload 5
    //   1049: iload 6
    //   1051: if_icmpeq +10 -> 1061
    //   1054: aload 10
    //   1056: iload 6
    //   1058: putfield 281	android/content/res/Configuration:smallestScreenWidthDp	I
    //   1061: aload 9
    //   1063: getfield 284	android/content/res/Configuration:densityDpi	I
    //   1066: istore 5
    //   1068: aload 12
    //   1070: getfield 284	android/content/res/Configuration:densityDpi	I
    //   1073: istore 6
    //   1075: aload 10
    //   1077: astore 9
    //   1079: iload 5
    //   1081: iload 6
    //   1083: if_icmpeq +20 -> 1103
    //   1086: aload 10
    //   1088: iload 6
    //   1090: putfield 284	android/content/res/Configuration:densityDpi	I
    //   1093: aload 10
    //   1095: astore 9
    //   1097: goto +6 -> 1103
    //   1100: aconst_null
    //   1101: astore 9
    //   1103: aload_1
    //   1104: iload 4
    //   1106: aload 11
    //   1108: aload 9
    //   1110: iconst_1
    //   1111: invokestatic 184	androidx/appcompat/app/AppCompatDelegateImplV7:a	(Landroid/content/Context;ILsync/Label;Landroid/content/res/Configuration;Z)Landroid/content/res/Configuration;
    //   1114: astore 10
    //   1116: new 190	view/ContextThemeWrapper
    //   1119: dup
    //   1120: aload_1
    //   1121: ldc_w 285
    //   1124: invokespecial 286	view/ContextThemeWrapper:<init>	(Landroid/content/Context;I)V
    //   1127: astore 9
    //   1129: aload 9
    //   1131: aload 10
    //   1133: invokevirtual 193	view/ContextThemeWrapper:getTheme	(Landroid/content/res/Configuration;)V
    //   1136: aload_1
    //   1137: invokevirtual 289	android/content/Context:getTheme	()Landroid/content/res/Resources$Theme;
    //   1140: astore_1
    //   1141: aload_1
    //   1142: ifnull +142 -> 1284
    //   1145: aload 9
    //   1147: invokevirtual 290	view/ContextThemeWrapper:getTheme	()Landroid/content/res/Resources$Theme;
    //   1150: astore_1
    //   1151: getstatic 109	android/os/Build$VERSION:SDK_INT	I
    //   1154: bipush 29
    //   1156: if_icmplt +10 -> 1166
    //   1159: aload_1
    //   1160: invokestatic 295	data/ACRA:init	(Landroid/content/res/Resources$Theme;)V
    //   1163: goto +121 -> 1284
    //   1166: getstatic 299	data/Label:b	Ljava/lang/Object;
    //   1169: astore 10
    //   1171: aload 10
    //   1173: monitorenter
    //   1174: getstatic 302	data/Label:e	Z
    //   1177: istore 8
    //   1179: iload 8
    //   1181: ifne +51 -> 1232
    //   1184: ldc_w 304
    //   1187: ldc_w 306
    //   1190: aconst_null
    //   1191: invokevirtual 312	java/lang/Class:getDeclaredMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   1194: astore 11
    //   1196: aload 11
    //   1198: putstatic 315	data/Label:c	Ljava/lang/reflect/Method;
    //   1201: aload 11
    //   1203: iconst_1
    //   1204: invokevirtual 321	java/lang/reflect/AccessibleObject:setAccessible	(Z)V
    //   1207: goto +21 -> 1228
    //   1210: astore_1
    //   1211: goto +68 -> 1279
    //   1214: astore 11
    //   1216: ldc_w 323
    //   1219: ldc_w 325
    //   1222: aload 11
    //   1224: invokestatic 331	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1227: pop
    //   1228: iconst_1
    //   1229: putstatic 302	data/Label:e	Z
    //   1232: getstatic 315	data/Label:c	Ljava/lang/reflect/Method;
    //   1235: astore 11
    //   1237: aload 11
    //   1239: ifnull +34 -> 1273
    //   1242: aload 11
    //   1244: aload_1
    //   1245: aconst_null
    //   1246: invokevirtual 337	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   1249: pop
    //   1250: goto +23 -> 1273
    //   1253: astore_1
    //   1254: goto +4 -> 1258
    //   1257: astore_1
    //   1258: ldc_w 323
    //   1261: ldc_w 339
    //   1264: aload_1
    //   1265: invokestatic 331	android/util/Log:i	(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I
    //   1268: pop
    //   1269: aconst_null
    //   1270: putstatic 315	data/Label:c	Ljava/lang/reflect/Method;
    //   1273: aload 10
    //   1275: monitorexit
    //   1276: goto +8 -> 1284
    //   1279: aload 10
    //   1281: monitorexit
    //   1282: aload_1
    //   1283: athrow
    //   1284: aload 9
    //   1286: astore_1
    //   1287: aload_0
    //   1288: aload_1
    //   1289: invokespecial 343	android/content/ContextWrapper:attachBaseContext	(Landroid/content/Context;)V
    //   1292: return
    //   1293: astore 9
    //   1295: goto -1044 -> 251
    //   1298: astore 9
    //   1300: goto -1014 -> 286
    //   1303: astore_1
    //   1304: goto -20 -> 1284
    //   1307: astore_1
    //   1308: goto -1103 -> 205
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1311	0	this	AppCompatActivity
    //   0	1311	1	paramContext	Context
    //   396	8	2	f1	float
    //   402	10	3	f2	float
    //   20	1085	4	i	int
    //   420	664	5	j	int
    //   427	662	6	k	int
    //   497	317	7	m	int
    //   1177	3	8	bool	boolean
    //   7	1278	9	localObject1	Object
    //   1293	1	9	localIllegalStateException1	IllegalStateException
    //   1298	1	9	localIllegalStateException2	IllegalStateException
    //   107	1173	10	localObject2	Object
    //   214	988	11	localObject3	Object
    //   1214	9	11	localNoSuchMethodException	NoSuchMethodException
    //   1235	8	11	localMethod	java.lang.reflect.Method
    //   337	732	12	localConfiguration	Configuration
    // Exception table:
    //   from	to	target	type
    //   1174	1179	1210	java/lang/Throwable
    //   1184	1196	1210	java/lang/Throwable
    //   1201	1207	1210	java/lang/Throwable
    //   1216	1228	1210	java/lang/Throwable
    //   1228	1232	1210	java/lang/Throwable
    //   1232	1237	1210	java/lang/Throwable
    //   1242	1250	1210	java/lang/Throwable
    //   1258	1273	1210	java/lang/Throwable
    //   1273	1276	1210	java/lang/Throwable
    //   1279	1282	1210	java/lang/Throwable
    //   1184	1196	1214	java/lang/NoSuchMethodException
    //   1201	1207	1214	java/lang/NoSuchMethodException
    //   1242	1250	1253	java/lang/reflect/InvocationTargetException
    //   1242	1250	1257	java/lang/IllegalAccessException
    //   241	248	1293	java/lang/IllegalStateException
    //   276	283	1298	java/lang/IllegalStateException
    //   1136	1141	1303	java/lang/NullPointerException
    //   104	109	1307	java/lang/Throwable
    //   114	130	1307	java/lang/Throwable
    //   133	151	1307	java/lang/Throwable
    //   154	160	1307	java/lang/Throwable
    //   163	199	1307	java/lang/Throwable
    //   199	202	1307	java/lang/Throwable
    //   205	208	1307	java/lang/Throwable
  }
  
  public void closeOptionsMenu()
  {
    ActionBar localActionBar = getSupportActionBar();
    if ((getWindow().hasFeature(0)) && ((localActionBar == null) || (!localActionBar.showOverflowMenu()))) {
      super.closeOptionsMenu();
    }
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    int i = paramKeyEvent.getKeyCode();
    ActionBar localActionBar = getSupportActionBar();
    if ((i == 82) && (localActionBar != null) && (localActionBar.onKeyShortcut(paramKeyEvent))) {
      return true;
    }
    return super.dispatchKeyEvent(paramKeyEvent);
  }
  
  public View findViewById(int paramInt)
  {
    AppCompatDelegateImplV7 localAppCompatDelegateImplV7 = (AppCompatDelegateImplV7)getDelegate();
    localAppCompatDelegateImplV7.ensureSubDecor();
    return mWindow.findViewById(paramInt);
  }
  
  public f getDelegate()
  {
    if (mDelegate == null)
    {
      SerializingExecutor localSerializingExecutor = f.this$0;
      mDelegate = new AppCompatDelegateImplV7(this, null, this, this);
    }
    return mDelegate;
  }
  
  public ActionBarDrawerToggle.Delegate getDrawerToggleDelegate()
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public MenuInflater getMenuInflater()
  {
    AppCompatDelegateImplV7 localAppCompatDelegateImplV7 = (AppCompatDelegateImplV7)getDelegate();
    if (mMenuInflater == null)
    {
      localAppCompatDelegateImplV7.initWindowDecorActionBar();
      Object localObject = this$0;
      if (localObject != null) {
        localObject = ((ActionBar)localObject).getThemedContext();
      } else {
        localObject = mContext;
      }
      mMenuInflater = new SupportMenuInflater((Context)localObject);
    }
    return mMenuInflater;
  }
  
  public Resources getResources()
  {
    Resources localResources2 = mResources;
    if (localResources2 == null) {
      int i = h.b;
    }
    Resources localResources1 = localResources2;
    if (localResources2 == null) {
      localResources1 = super.getResources();
    }
    return localResources1;
  }
  
  public ActionBar getSupportActionBar()
  {
    AppCompatDelegateImplV7 localAppCompatDelegateImplV7 = (AppCompatDelegateImplV7)getDelegate();
    localAppCompatDelegateImplV7.initWindowDecorActionBar();
    return this$0;
  }
  
  public Intent getSupportParentActivityIntent()
  {
    return NavUtils.getParentActivityIntent(this);
  }
  
  public void invalidateOptionsMenu()
  {
    getDelegate().invalidateOptionsMenu();
  }
  
  public void onConfigurationChanged(Configuration paramConfiguration)
  {
    super.onConfigurationChanged(paramConfiguration);
    Object localObject1 = (AppCompatDelegateImplV7)getDelegate();
    if ((mHasActionBar) && (mSubDecorInstalled))
    {
      ((AppCompatDelegateImplV7)localObject1).initWindowDecorActionBar();
      paramConfiguration = this$0;
      if (paramConfiguration != null) {
        paramConfiguration.setTitle();
      }
    }
    paramConfiguration = AppCompatDrawableManager.get();
    Object localObject2 = mContext;
    for (;;)
    {
      int j;
      Object[] arrayOfObject;
      int i;
      try
      {
        TintManager localTintManager = this$0;
        try
        {
          localObject2 = (b)a.get(localObject2);
          if (localObject2 != null)
          {
            j = m;
            arrayOfObject = n;
            i = 0;
            break label208;
            m = 0;
            i = false;
          }
          r = new Configuration(mContext.getResources().getConfiguration());
          ((AppCompatDelegateImplV7)localObject1).a(false, false);
          if (mResources != null)
          {
            paramConfiguration = super.getResources().getConfiguration();
            localObject1 = super.getResources().getDisplayMetrics();
            mResources.updateConfiguration(paramConfiguration, (DisplayMetrics)localObject1);
            return;
          }
        }
        catch (Throwable localThrowable1)
        {
          throw localThrowable1;
        }
        return;
      }
      catch (Throwable localThrowable2)
      {
        throw localThrowable2;
      }
      label208:
      while (i < j)
      {
        arrayOfObject[i] = null;
        i += 1;
      }
    }
  }
  
  public void onContentChanged()
  {
    onSupportContentChanged();
  }
  
  public void onCreateSupportNavigateUpTaskStack(TaskStackBuilder paramTaskStackBuilder)
  {
    paramTaskStackBuilder.getClass();
    Object localObject2 = getSupportParentActivityIntent();
    Object localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = NavUtils.getParentActivityIntent(this);
    }
    if (localObject1 != null)
    {
      Object localObject3 = ((Intent)localObject1).getComponent();
      localObject2 = localObject3;
      AppCompatActivity localAppCompatActivity = mSourceContext;
      if (localObject3 == null) {
        localObject2 = ((Intent)localObject1).resolveActivity(localAppCompatActivity.getPackageManager());
      }
      localObject3 = mIntents;
      int i = ((ArrayList)localObject3).size();
      try
      {
        for (paramTaskStackBuilder = NavUtils.getParentActivityIntent(localAppCompatActivity, (ComponentName)localObject2); paramTaskStackBuilder != null; paramTaskStackBuilder = NavUtils.getParentActivityIntent(localAppCompatActivity, paramTaskStackBuilder.getComponent())) {
          ((ArrayList)localObject3).add(i, paramTaskStackBuilder);
        }
        label118:
        return;
      }
      catch (PackageManager.NameNotFoundException paramTaskStackBuilder)
      {
        break label118;
        ((ArrayList)localObject3).add(localObject1);
        return;
        Log.e("TaskStackBuilder", "Bad ComponentName while traversing activity parent metadata");
        throw new IllegalArgumentException(paramTaskStackBuilder);
      }
    }
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    getDelegate().a();
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    if ((Build.VERSION.SDK_INT < 26) && (!paramKeyEvent.isCtrlPressed()) && (!KeyEvent.metaStateHasNoModifiers(paramKeyEvent.getMetaState())) && (paramKeyEvent.getRepeatCount() == 0) && (!KeyEvent.isModifierKey(paramKeyEvent.getKeyCode())))
    {
      Window localWindow = getWindow();
      if ((localWindow != null) && (localWindow.getDecorView() != null) && (localWindow.getDecorView().dispatchKeyShortcutEvent(paramKeyEvent))) {
        return true;
      }
    }
    return super.onKeyDown(paramInt, paramKeyEvent);
  }
  
  public void onLocalesChanged(Label paramLabel) {}
  
  public final boolean onMenuItemSelected(int paramInt, MenuItem paramMenuItem)
  {
    if (super.onMenuItemSelected(paramInt, paramMenuItem)) {
      return true;
    }
    ActionBar localActionBar = getSupportActionBar();
    if ((paramMenuItem.getItemId() == 16908332) && (localActionBar != null) && ((localActionBar.getDisplayOptions() & 0x4) != 0)) {
      return onSupportNavigateUp();
    }
    return false;
  }
  
  public boolean onMenuOpened(int paramInt, Menu paramMenu)
  {
    return super.onMenuOpened(paramInt, paramMenu);
  }
  
  public void onNightModeChanged(int paramInt) {}
  
  public void onPanelClosed(int paramInt, Menu paramMenu)
  {
    super.onPanelClosed(paramInt, paramMenu);
  }
  
  public void onPostCreate(Bundle paramBundle)
  {
    super.onPostCreate(paramBundle);
    ((AppCompatDelegateImplV7)getDelegate()).ensureSubDecor();
  }
  
  public void onPostResume()
  {
    super.onPostResume();
    Object localObject = (AppCompatDelegateImplV7)getDelegate();
    ((AppCompatDelegateImplV7)localObject).initWindowDecorActionBar();
    localObject = this$0;
    if (localObject != null) {
      ((ActionBar)localObject).setShowHideAnimationEnabled(true);
    }
  }
  
  public void onPrepareSupportNavigateUpTaskStack(TaskStackBuilder paramTaskStackBuilder) {}
  
  public void onStart()
  {
    super.onStart();
    ((AppCompatDelegateImplV7)getDelegate()).a(true, false);
  }
  
  public void onStop()
  {
    super.onStop();
    Object localObject = (AppCompatDelegateImplV7)getDelegate();
    ((AppCompatDelegateImplV7)localObject).initWindowDecorActionBar();
    localObject = this$0;
    if (localObject != null) {
      ((ActionBar)localObject).setShowHideAnimationEnabled(false);
    }
  }
  
  public void onSupportActionModeFinished(ActionMode paramActionMode) {}
  
  public void onSupportActionModeStarted(ActionMode paramActionMode) {}
  
  public void onSupportContentChanged() {}
  
  public boolean onSupportNavigateUp()
  {
    Object localObject1 = getSupportParentActivityIntent();
    if (localObject1 != null) {
      if (supportShouldUpRecreateTask((Intent)localObject1))
      {
        localObject1 = new TaskStackBuilder(this);
        onCreateSupportNavigateUpTaskStack((TaskStackBuilder)localObject1);
        onPrepareSupportNavigateUpTaskStack((TaskStackBuilder)localObject1);
        Object localObject2 = mIntents;
        if (!((ArrayList)localObject2).isEmpty())
        {
          localObject2 = (Intent[])((ArrayList)localObject2).toArray(new Intent[0]);
          localObject2[0] = new Intent(localObject2[0]).addFlags(268484608);
          mSourceContext.startActivities((Intent[])localObject2, null);
        }
      }
    }
    try
    {
      finishAffinity();
    }
    catch (IllegalStateException localIllegalStateException)
    {
      for (;;) {}
    }
    finish();
    break label118;
    throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
    supportNavigateUpTo((Intent)localObject1);
    label118:
    return true;
    return false;
  }
  
  public void onTitleChanged(CharSequence paramCharSequence, int paramInt)
  {
    super.onTitleChanged(paramCharSequence, paramInt);
    getDelegate().b(paramCharSequence);
  }
  
  public ActionMode onWindowStartingSupportActionMode(ActionMode.Callback paramCallback)
  {
    return null;
  }
  
  public void openOptionsMenu()
  {
    ActionBar localActionBar = getSupportActionBar();
    if ((getWindow().hasFeature(0)) && ((localActionBar == null) || (!localActionBar.openOptionsMenu()))) {
      super.openOptionsMenu();
    }
  }
  
  public void setContentView(int paramInt)
  {
    initializeViewTreeOwners();
    getDelegate().setContentView(paramInt);
  }
  
  public void setContentView(View paramView)
  {
    initializeViewTreeOwners();
    getDelegate().setContentView(paramView);
  }
  
  public void setContentView(View paramView, ViewGroup.LayoutParams paramLayoutParams)
  {
    initializeViewTreeOwners();
    getDelegate().setContentView(paramView, paramLayoutParams);
  }
  
  public void setSupportActionBar(Toolbar paramToolbar)
  {
    AppCompatDelegateImplV7 localAppCompatDelegateImplV7 = (AppCompatDelegateImplV7)getDelegate();
    if (!(c instanceof Activity)) {
      return;
    }
    localAppCompatDelegateImplV7.initWindowDecorActionBar();
    Object localObject = this$0;
    if (!(localObject instanceof WindowDecorActionBar))
    {
      mMenuInflater = null;
      if (localObject != null) {
        ((ActionBar)localObject).show();
      }
      this$0 = null;
      if (paramToolbar != null)
      {
        localObject = c;
        if ((localObject instanceof Activity)) {
          localObject = ((Activity)localObject).getTitle();
        } else {
          localObject = d;
        }
        localObject = new ToolbarActionBar(paramToolbar, (CharSequence)localObject, mOriginalWindowCallback);
        this$0 = ((ActionBar)localObject);
        mOriginalWindowCallback.mMenu = mWindow;
        paramToolbar.setBackInvokedCallbackEnabled(true);
      }
      else
      {
        mOriginalWindowCallback.mMenu = null;
      }
      localAppCompatDelegateImplV7.invalidateOptionsMenu();
      return;
    }
    throw new IllegalStateException("This Activity already has an action bar supplied by the window decor. Do not request Window.FEATURE_SUPPORT_ACTION_BAR and set windowActionBar to false in your theme to use a Toolbar instead.");
  }
  
  public void setSupportProgress(int paramInt) {}
  
  public void setSupportProgressBarIndeterminate(boolean paramBoolean) {}
  
  public void setSupportProgressBarIndeterminateVisibility(boolean paramBoolean) {}
  
  public void setSupportProgressBarVisibility(boolean paramBoolean) {}
  
  public void setTheme(int paramInt)
  {
    super.setTheme(paramInt);
    getDelegateo = paramInt;
  }
  
  public ActionMode startSupportActionMode(ActionMode.Callback paramCallback)
  {
    return getDelegate().startSupportActionModeFromWindow(paramCallback);
  }
  
  public void supportInvalidateOptionsMenu()
  {
    getDelegate().invalidateOptionsMenu();
  }
  
  public void supportNavigateUpTo(Intent paramIntent)
  {
    navigateUpTo(paramIntent);
  }
  
  public boolean supportRequestWindowFeature(int paramInt)
  {
    return getDelegate().requestWindowFeature(paramInt);
  }
  
  public boolean supportShouldUpRecreateTask(Intent paramIntent)
  {
    return shouldUpRecreateTask(paramIntent);
  }
}
