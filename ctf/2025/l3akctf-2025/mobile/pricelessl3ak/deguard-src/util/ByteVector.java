package util;

import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.graphics.Typeface.CustomFallbackBuilder;
import android.graphics.fonts.Font;
import android.graphics.fonts.Font.Builder;
import android.graphics.fonts.FontFamily;
import android.graphics.fonts.FontFamily.Builder;
import android.graphics.fonts.FontStyle;
import android.util.Log;
import data.Namespace;
import internal.Label;
import java.io.InputStream;
import java.util.List;
import views.Item;

public final class ByteVector
  extends Label
{
  public static FontFamily a(Item[] paramArrayOfItem, ContentResolver paramContentResolver)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.provideAs(TypeTransformer.java:780)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.e1expr(TypeTransformer.java:496)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:713)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.enexpr(TypeTransformer.java:698)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:719)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.exExpr(TypeTransformer.java:703)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.s2stmt(TypeTransformer.java:820)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.sxStmt(TypeTransformer.java:843)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:206)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public static int add(FontStyle paramFontStyle1, FontStyle paramFontStyle2)
  {
    int j = Math.abs(paramFontStyle1.getWeight() - paramFontStyle2.getWeight()) / 100;
    int i;
    if (paramFontStyle1.getSlant() == paramFontStyle2.getSlant()) {
      i = 0;
    } else {
      i = 2;
    }
    return j + i;
  }
  
  public static Font add(FontFamily paramFontFamily, int paramInt)
  {
    if ((paramInt & 0x1) != 0) {
      i = 700;
    } else {
      i = 400;
    }
    int j = 1;
    if ((paramInt & 0x2) != 0) {
      paramInt = 1;
    } else {
      paramInt = 0;
    }
    FontStyle localFontStyle = new FontStyle(i, paramInt);
    Font localFont2 = paramFontFamily.getFont(0);
    Font localFont1 = localFont2;
    int i = add(localFontStyle, localFont2.getStyle());
    paramInt = j;
    while (paramInt < paramFontFamily.getSize())
    {
      localFont2 = paramFontFamily.getFont(paramInt);
      int k = add(localFontStyle, localFont2.getStyle());
      j = i;
      if (k < i)
      {
        localFont1 = localFont2;
        j = k;
      }
      paramInt += 1;
      i = j;
    }
    return localFont1;
  }
  
  public final Typeface a(Context paramContext, List paramList, int paramInt)
  {
    paramContext = paramContext.getContentResolver();
    Object localObject1;
    Typeface.CustomFallbackBuilder localCustomFallbackBuilder;
    for (;;)
    {
      int i;
      try
      {
        localObject1 = paramList.get(0);
        localObject1 = (Item[])localObject1;
        localObject1 = a((Item[])localObject1, paramContext);
        if (localObject1 == null) {
          return null;
        }
        localCustomFallbackBuilder = new Typeface.CustomFallbackBuilder((FontFamily)localObject1);
        i = 1;
        int j = paramList.size();
        if (i >= j) {
          break;
        }
        Object localObject2 = paramList.get(i);
        localObject2 = (Item[])localObject2;
        localObject2 = a((Item[])localObject2, paramContext);
        if (localObject2 != null) {
          localCustomFallbackBuilder.addCustomFallback((FontFamily)localObject2);
        }
      }
      catch (Exception paramContext)
      {
        break label139;
      }
      i += 1;
    }
    paramContext = localCustomFallbackBuilder.setStyle(add((FontFamily)localObject1, paramInt).getStyle()).build();
    return paramContext;
    label139:
    Log.w("TypefaceCompatApi29Impl", "Font load failed", paramContext);
    return null;
  }
  
  public final Item a(Item[] paramArrayOfItem, int paramInt)
  {
    throw new RuntimeException("Do not use this function in API 29 or later.");
  }
  
  public final Typeface copy(Context paramContext, InputStream paramInputStream)
  {
    throw new RuntimeException("Do not use this function in API 29 or later.");
  }
  
  public final Typeface get(Context paramContext, Resources paramResources, int paramInt1, String paramString, int paramInt2)
  {
    try
    {
      paramContext = new Font.Builder(paramResources, paramInt1).build();
      paramResources = new FontFamily.Builder(paramContext).build();
      paramContext = new Typeface.CustomFallbackBuilder(paramResources).setStyle(paramContext.getStyle()).build();
      return paramContext;
    }
    catch (Exception paramContext)
    {
      Log.w("TypefaceCompatApi29Impl", "Font load failed", paramContext);
    }
    return null;
  }
  
  public final Typeface get(Context paramContext, Namespace paramNamespace, Resources paramResources, int paramInt)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: can not merge I and Z\n\tat com.googlecode.dex2jar.ir.TypeClass.merge(TypeClass.java:100)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeRef.updateTypeClass(TypeTransformer.java:174)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.copyTypes(TypeTransformer.java:311)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.fixTypes(TypeTransformer.java:226)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer$TypeAnalyze.analyze(TypeTransformer.java:207)\n\tat com.googlecode.dex2jar.ir.ts.TypeTransformer.transform(TypeTransformer.java:44)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:162)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final Typeface read(Context paramContext, Item[] paramArrayOfItem, int paramInt)
  {
    paramContext = paramContext.getContentResolver();
    try
    {
      paramContext = a(paramArrayOfItem, paramContext);
      if (paramContext == null) {
        return null;
      }
      paramContext = new Typeface.CustomFallbackBuilder(paramContext).setStyle(add(paramContext, paramInt).getStyle()).build();
      return paramContext;
    }
    catch (Exception paramContext)
    {
      Log.w("TypefaceCompatApi29Impl", "Font load failed", paramContext);
    }
    return null;
  }
}
