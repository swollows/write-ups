package asm;

import android.graphics.Typeface;
import androidx.lifecycle.Frame;
import androidx.lifecycle.PieChart;
import androidx.lifecycle.e;
import androidx.lifecycle.g;
import app.Element;
import astuetz.Menu;
import handle.AnnotationVisitor;
import handle.Handle;
import http.AbstractMultimap;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import menu.MenuItemWrapper;
import menu.f;
import model.License;
import params.Item;
import params.Log;
import params.Type;
import view.ActionMode;
import view.SupportActionModeWrapper;

public final class Label
  implements view.ActionMode.Callback
{
  public final Object a;
  public final Object b;
  public final Object c;
  public final Object x;
  
  public Label(android.content.Context paramContext, android.view.ActionMode.Callback paramCallback)
  {
    x = paramContext;
    a = paramCallback;
    c = new ArrayList();
    b = new AbstractMultimap(0);
  }
  
  public Label(Typeface paramTypeface, License paramLicense)
  {
    b = paramTypeface;
    a = paramLicense;
    c = new c(1024);
    int i = paramLicense.read(6);
    if (i != 0)
    {
      i += data;
      j = ((ByteBuffer)value).getInt(i);
      i = ((ByteBuffer)value).getInt(j + i);
    }
    else
    {
      i = 0;
    }
    x = new char[i * 2];
    i = paramLicense.read(6);
    if (i != 0)
    {
      i += data;
      j = ((ByteBuffer)value).getInt(i);
      i = ((ByteBuffer)value).getInt(j + i);
    }
    else
    {
      i = 0;
    }
    int j = 0;
    while (j < i)
    {
      paramTypeface = new Attribute(this, j);
      paramLicense = paramTypeface.read();
      int k = paramLicense.read(4);
      if (k != 0) {
        k = ((ByteBuffer)value).getInt(k + data);
      } else {
        k = 0;
      }
      Character.toChars(k, (char[])x, j * 2);
      if (paramTypeface.getSize() > 0) {
        k = 1;
      } else {
        k = 0;
      }
      if (k != 0)
      {
        k = paramTypeface.getSize();
        ((c)c).a(paramTypeface, 0, k - 1);
        j += 1;
      }
      else
      {
        throw new IllegalArgumentException("invalid metadata codepoint length");
      }
    }
  }
  
  public Label(PieChart paramPieChart, androidx.lifecycle.l paramL, Handle paramHandle)
  {
    a = paramPieChart;
    x = paramL;
    c = paramHandle;
    b = new Element(8);
  }
  
  public androidx.lifecycle.Label a(Item paramItem, String paramString)
  {
    Log.get(paramString, "key");
    Element localElement = (Element)b;
    for (;;)
    {
      try
      {
        localObject1 = (PieChart)a;
        localObject1.getClass();
        localObject2 = (androidx.lifecycle.Label)m.get(paramString);
        localObject3 = type;
        localObject1 = Item.a;
        Log.add(localObject1, "null cannot be cast to non-null type kotlin.collections.Map<K of kotlin.collections.MapsKt__MapsKt.get, V of kotlin.collections.MapsKt__MapsKt.get>");
        localObject1 = (Integer)((Map)localObject1).get(localObject3);
        if (localObject1 != null)
        {
          j = ((Number)localObject1).intValue();
          boolean bool3 = localObject2 instanceof widgets.Object;
          bool2 = false;
          bool1 = bool2;
          if (bool3)
          {
            if ((localObject2 instanceof params.l))
            {
              i = ((params.l)localObject2).b();
              continue;
            }
            if ((localObject2 instanceof Menu))
            {
              i = 0;
              continue;
            }
            if (!(localObject2 instanceof astuetz.c)) {
              continue;
            }
            i = 1;
            continue;
          }
        }
        else
        {
          localObject1 = localObject3;
          if (((Class)localObject3).isPrimitive()) {
            localObject1 = drupal.Context.getValue(Type.get((Class)localObject3));
          }
          bool1 = ((Class)localObject1).isInstance(localObject2);
        }
        if (bool1)
        {
          paramItem = (androidx.lifecycle.l)x;
          if ((paramItem instanceof e))
          {
            paramString = (e)paramItem;
            Log.get(localObject2);
            paramItem = a;
            if (paramItem != null)
            {
              paramString = g;
              Log.get(paramString);
              Frame.a((androidx.lifecycle.Label)localObject2, paramString, paramItem);
            }
          }
          Log.add(localObject2, "null cannot be cast to non-null type T of androidx.lifecycle.viewmodel.ViewModelProviderImpl.getViewModel");
          paramItem = (Item)localObject2;
        }
        else
        {
          localObject3 = new AnnotationVisitor((Handle)c);
          localObject1 = g.a;
          c.put(localObject1, paramString);
          localObject2 = (androidx.lifecycle.l)x;
        }
      }
      catch (Throwable paramItem)
      {
        Object localObject1;
        Object localObject2;
        Object localObject3;
        int j;
        boolean bool2;
        boolean bool1;
        int i;
        continue;
      }
      try
      {
        localObject1 = ((androidx.lifecycle.l)localObject2).a(paramItem, (AnnotationVisitor)localObject3);
        paramItem = (Item)localObject1;
        localObject1 = paramItem;
      }
      catch (AbstractMethodError localAbstractMethodError1)
      {
        continue;
      }
      try
      {
        localObject1 = ((androidx.lifecycle.l)localObject2).a(drupal.Context.add(paramItem), (AnnotationVisitor)localObject3);
        paramItem = (Item)localObject1;
      }
      catch (AbstractMethodError localAbstractMethodError2)
      {
        continue;
      }
      paramItem = ((androidx.lifecycle.l)localObject2).a(drupal.Context.add(paramItem));
      continue;
      localObject2 = (PieChart)a;
      localObject2.getClass();
      Log.get(paramItem, "viewModel");
      paramString = (androidx.lifecycle.Label)m.put(paramString, paramItem);
      paramItem = (Item)localObject1;
      if (paramString != null)
      {
        paramString.a();
        paramItem = (Item)localObject1;
      }
      return paramItem;
      throw paramItem;
      i = -1;
      bool1 = bool2;
      if (i == j) {
        bool1 = true;
      }
    }
  }
  
  public SupportActionModeWrapper getActionModeWrapper(ActionMode paramActionMode)
  {
    ArrayList localArrayList = (ArrayList)c;
    int j = localArrayList.size();
    int i = 0;
    while (i < j)
    {
      SupportActionModeWrapper localSupportActionModeWrapper = (SupportActionModeWrapper)localArrayList.get(i);
      if ((localSupportActionModeWrapper != null) && (mWrappedObject == paramActionMode)) {
        return localSupportActionModeWrapper;
      }
      i += 1;
    }
    paramActionMode = new SupportActionModeWrapper((android.content.Context)x, paramActionMode);
    localArrayList.add(paramActionMode);
    return paramActionMode;
  }
  
  public boolean onActionItemClicked(ActionMode paramActionMode, android.view.MenuItem paramMenuItem)
  {
    paramActionMode = getActionModeWrapper(paramActionMode);
    paramMenuItem = new MenuItemWrapper((android.content.Context)x, (preferences.MenuItem)paramMenuItem);
    return ((android.view.ActionMode.Callback)a).onActionItemClicked(paramActionMode, paramMenuItem);
  }
  
  public boolean onCreateActionMode(ActionMode paramActionMode, f paramF)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: fail exe a7 = a6\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:92)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.dfs(Cfg.java:255)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze0(BaseAnalyze.java:75)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze(BaseAnalyze.java:69)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:274)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\nCaused by: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:552)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:1)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:166)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:331)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:387)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:90)\n\t... 17 more\n");
  }
  
  public void onDestroyActionMode(ActionMode paramActionMode)
  {
    paramActionMode = getActionModeWrapper(paramActionMode);
    ((android.view.ActionMode.Callback)a).onDestroyActionMode(paramActionMode);
  }
  
  public boolean onPrepareActionMode(ActionMode paramActionMode, f paramF)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: fail exe a7 = a6\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:92)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.dfs(Cfg.java:255)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze0(BaseAnalyze.java:75)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze(BaseAnalyze.java:69)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:274)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\nCaused by: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:552)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:1)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:166)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:331)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:387)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:90)\n\t... 17 more\n");
  }
}
