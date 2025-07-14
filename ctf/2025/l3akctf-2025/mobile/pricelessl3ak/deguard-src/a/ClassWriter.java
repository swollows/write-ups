package a;

import H.A;
import android.content.ClipDescription;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.AttributeSet;
import android.util.Log;
import android.util.TypedValue;
import android.view.KeyEvent;
import androidx.appcompat.widget.AppCompatDrawableManager;
import androidx.appcompat.widget.TintManager;
import asm.ByteVector;
import asm.e;
import asm.f;
import common.i;
import data.DeltaBaseCache;
import data.Future;
import java.io.IOException;
import java.nio.ByteBuffer;
import org.xmlpull.v1.XmlPullParserException;
import util.c;

public final class ClassWriter
  implements i
{
  public static ClassWriter d;
  public static ClassWriter k;
  public Object a;
  public Object b;
  public Object c;
  
  public ClassWriter(android.content.Context paramContext, TypedArray paramTypedArray)
  {
    c = paramContext;
    b = paramTypedArray;
  }
  
  public static ClassWriter a()
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public static boolean action(Editable paramEditable, KeyEvent paramKeyEvent, boolean paramBoolean)
  {
    if (!KeyEvent.metaStateHasNoModifiers(paramKeyEvent.getMetaState())) {
      return false;
    }
    int j = Selection.getSelectionStart(paramEditable);
    int i = Selection.getSelectionEnd(paramEditable);
    if ((j != -1) && (i != -1))
    {
      if (j != i) {
        return false;
      }
      paramKeyEvent = (ByteVector[])paramEditable.getSpans(j, i, A.class);
      if ((paramKeyEvent != null) && (paramKeyEvent.length > 0))
      {
        int m = paramKeyEvent.length;
        i = 0;
        while (i < m)
        {
          Object localObject = paramKeyEvent[i];
          int n = paramEditable.getSpanStart(localObject);
          int i1 = paramEditable.getSpanEnd(localObject);
          if (((paramBoolean) && (n == j)) || ((!paramBoolean) && (i1 == j)) || ((j > n) && (j < i1)))
          {
            paramEditable.delete(n, i1);
            return true;
          }
          i += 1;
        }
      }
    }
    return false;
  }
  
  public static ClassWriter obtainStyledAttributes(android.content.Context paramContext, AttributeSet paramAttributeSet, int[] paramArrayOfInt, int paramInt)
  {
    return new ClassWriter(paramContext, paramContext.obtainStyledAttributes(paramAttributeSet, paramArrayOfInt, paramInt, 0));
  }
  
  public Object a(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean, e paramE)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: fail exe a35 = a15\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:92)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.dfs(Cfg.java:255)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze0(BaseAnalyze.java:75)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze(BaseAnalyze.java:69)\n\tat com.googlecode.dex2jar.ir.ts.Ir2JRegAssignTransformer.transform(Ir2JRegAssignTransformer.java:182)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:164)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\nCaused by: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.an.SimpleLiveAnalyze.onUseLocal(SimpleLiveAnalyze.java:89)\n\tat com.googlecode.dex2jar.ir.ts.an.SimpleLiveAnalyze.onUseLocal(SimpleLiveAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:166)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:331)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:387)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:90)\n\t... 17 more\n");
  }
  
  public boolean a(CharSequence paramCharSequence, int paramInt1, int paramInt2, asm.Attribute paramAttribute)
  {
    if ((b & 0x3) == 0)
    {
      Object localObject1 = (f)a;
      Object localObject2 = paramAttribute.read();
      int i = ((app.Attribute)localObject2).read(8);
      if (i != 0) {
        ((ByteBuffer)value).getShort(i + data);
      }
      localObject1.getClass();
      localObject2 = f.t;
      if (((ThreadLocal)localObject2).get() == null) {
        ((ThreadLocal)localObject2).set(new StringBuilder());
      }
      localObject2 = (StringBuilder)((ThreadLocal)localObject2).get();
      ((StringBuilder)localObject2).setLength(0);
      while (paramInt1 < paramInt2)
      {
        ((StringBuilder)localObject2).append(paramCharSequence.charAt(paramInt1));
        paramInt1 += 1;
      }
      paramCharSequence = b;
      localObject1 = ((StringBuilder)localObject2).toString();
      paramInt1 = c.d;
      boolean bool = paramCharSequence.hasGlyph((String)localObject1);
      paramInt1 = b & 0x4;
      if (bool) {
        paramInt1 |= 0x2;
      } else {
        paramInt1 |= 0x1;
      }
      b = paramInt1;
    }
    return (b & 0x3) == 2;
  }
  
  public Object b()
  {
    return null;
  }
  
  public ClipDescription c()
  {
    return (ClipDescription)b;
  }
  
  public void d() {}
  
  public Uri f()
  {
    return (Uri)c;
  }
  
  public Typeface get(int paramInt1, int paramInt2, androidx.appcompat.widget.Type paramType)
  {
    paramInt1 = ((TypedArray)b).getResourceId(paramInt1, 0);
    if (paramInt1 == 0) {
      return null;
    }
    if ((TypedValue)a == null) {
      a = new TypedValue();
    }
    Object localObject3 = (TypedValue)a;
    Object localObject1 = DeltaBaseCache.table;
    android.content.Context localContext = (android.content.Context)c;
    if (localContext.isRestricted()) {
      return null;
    }
    Resources localResources = localContext.getResources();
    localResources.getValue(paramInt1, (TypedValue)localObject3, true);
    localObject1 = string;
    Object localObject2;
    if (localObject1 != null)
    {
      localObject1 = ((CharSequence)localObject1).toString();
      if (!((String)localObject1).startsWith("res/"))
      {
        paramType.create();
        return null;
      }
      int i = assetCookie;
      Object localObject4 = util.Type.c;
      Typeface localTypeface = (Typeface)((http.Label)localObject4).add(util.Type.create(localResources, paramInt1, (String)localObject1, i, paramInt2));
      if (localTypeface != null)
      {
        new Handler(Looper.getMainLooper()).post(new androidx.appcompat.app.Type(paramType, localTypeface, 2));
        return localTypeface;
      }
      try
      {
        boolean bool = ((String)localObject1).toLowerCase().endsWith(".xml");
        if (!bool) {
          break label282;
        }
        localObject4 = data.Label.load(localResources.getXml(paramInt1), localResources);
        if (localObject4 == null)
        {
          Log.e("ResourcesCompat", "Failed to find font-family tag");
          paramType.create();
          return null;
        }
      }
      catch (IOException localIOException)
      {
        break label377;
      }
      catch (XmlPullParserException localXmlPullParserException) {}
      i = assetCookie;
      localObject2 = util.Type.get(localContext, (Future)localObject4, localXmlPullParserException, paramInt1, (String)localObject1, i, paramInt2, paramType);
      return localObject2;
      label282:
      i = assetCookie;
      localObject3 = util.Type.a;
      localObject3 = ((internal.Label)localObject3).get(localContext, (Resources)localObject2, paramInt1, (String)localObject1, paramInt2);
      if (localObject3 != null) {
        ((http.Label)localObject4).add(util.Type.create((Resources)localObject2, paramInt1, (String)localObject1, i, paramInt2), localObject3);
      }
      if (localObject3 != null)
      {
        localObject2 = new Handler(Looper.getMainLooper());
        ((Handler)localObject2).post(new androidx.appcompat.app.Type(paramType, localObject3, 2));
        return localObject3;
      }
      paramType.create();
      return localObject3;
      label377:
      Log.e("ResourcesCompat", "Failed to read xml resource ".concat((String)localObject1), (Throwable)localObject2);
      break label414;
      Log.e("ResourcesCompat", "Failed to parse xml resource ".concat((String)localObject1), (Throwable)localObject2);
      label414:
      paramType.create();
      return null;
    }
    paramType = new StringBuilder("Resource \"");
    paramType.append(((Resources)localObject2).getResourceName(paramInt1));
    paramType.append("\" (");
    paramType.append(Integer.toHexString(paramInt1));
    paramType.append(") is not a Font: ");
    paramType.append(localObject3);
    throw new Resources.NotFoundException(paramType.toString());
  }
  
  public Drawable get(int paramInt)
  {
    if (((TypedArray)b).hasValue(paramInt))
    {
      paramInt = ((TypedArray)b).getResourceId(paramInt, 0);
      if (paramInt != 0)
      {
        AppCompatDrawableManager localAppCompatDrawableManager = AppCompatDrawableManager.get();
        Object localObject = (android.content.Context)c;
        try
        {
          localObject = this$0.getDrawable((android.content.Context)localObject, paramInt, true);
          return localObject;
        }
        catch (Throwable localThrowable)
        {
          throw localThrowable;
        }
      }
    }
    return null;
  }
  
  public Drawable getDrawable(int paramInt)
  {
    TypedArray localTypedArray = (TypedArray)b;
    if (localTypedArray.hasValue(paramInt))
    {
      int i = localTypedArray.getResourceId(paramInt, 0);
      if (i != 0) {
        return drupal.Context.getDrawable((android.content.Context)c, i);
      }
    }
    return localTypedArray.getDrawable(paramInt);
  }
  
  public ColorStateList init(int paramInt)
  {
    TypedArray localTypedArray = (TypedArray)b;
    if (localTypedArray.hasValue(paramInt))
    {
      int i = localTypedArray.getResourceId(paramInt, 0);
      if (i != 0)
      {
        ColorStateList localColorStateList = drupal.Context.get((android.content.Context)c, i);
        if (localColorStateList != null) {
          return localColorStateList;
        }
      }
    }
    return localTypedArray.getColorStateList(paramInt);
  }
  
  public void recycle()
  {
    ((TypedArray)b).recycle();
  }
  
  public Uri visitAnnotation()
  {
    return (Uri)a;
  }
}
