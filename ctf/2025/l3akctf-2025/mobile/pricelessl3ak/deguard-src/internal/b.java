package internal;

import drupal.Context;
import email.Message;
import java.io.Serializable;
import net.PhoneNumberMatcher;
import params.Log;
import params.Type;
import params.l;
import widget.TextOrientationType;
import widgets.Handle;
import widgets.Label;

public final class b
  implements l, widgets.Object, email.Attribute, Serializable
{
  public final email.Attribute a;
  public int b;
  public final int e;
  public int g;
  public int[] h;
  public int i;
  
  public b(c paramC, email.Attribute paramAttribute)
  {
    a = paramAttribute;
    if ((paramAttribute != null) && (paramAttribute.d() != Message.m)) {
      throw new IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext");
    }
    e = 2;
  }
  
  public final void a(Object paramObject)
  {
    Object localObject1 = this;
    do
    {
      b localB = (b)localObject1;
      localObject1 = a;
      Log.get(localObject1);
      try
      {
        Object localObject2 = localB.b(paramObject);
        paramObject = localObject2;
        TextOrientationType localTextOrientationType = TextOrientationType.b;
        if (localObject2 == localTextOrientationType) {
          return;
        }
      }
      catch (Throwable paramObject)
      {
        paramObject = new Handle(paramObject);
        localB.getClass();
      }
    } while ((localObject1 instanceof b));
    ((email.Attribute)localObject1).a(paramObject);
  }
  
  public final int b()
  {
    return e;
  }
  
  public final Object b(Object paramObject)
  {
    TextOrientationType localTextOrientationType = TextOrientationType.b;
    int j = i;
    Object localObject2 = c;
    long l1 = a;
    int m = e;
    long l2 = f;
    int k;
    if (j != 0)
    {
      if (j != 1)
      {
        if (j != 2)
        {
          if (j == 3)
          {
            k = g;
            localObject1 = (PhoneNumberMatcher)d;
            Context.a(paramObject);
            paramObject = localObject1;
            break label436;
          }
          throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        k = g;
        localObject1 = (PhoneNumberMatcher)d;
        Context.a(paramObject);
        break label338;
      }
      j = b;
      k = g;
      localObject2 = h;
      localObject1 = (PhoneNumberMatcher)d;
      Context.a(paramObject);
      k += 1;
    }
    else
    {
      Context.a(paramObject);
      localObject1 = (PhoneNumberMatcher)d;
      localObject2 = d;
      paramObject = localObject1;
      if (localObject2 == null) {
        break label249;
      }
      j = localObject2.length;
      k = 0;
    }
    paramObject = localObject1;
    if (k < j)
    {
      paramObject = new Integer(localObject2[k]);
      d = localObject1;
      h = ((int[])localObject2);
      g = k;
      b = j;
      i = 1;
      state = paramObject;
      i = 3;
      a = this;
      return localTextOrientationType;
    }
    label249:
    Object localObject1 = paramObject;
    if (l2 != 0L)
    {
      j = 0;
      for (;;)
      {
        localObject1 = paramObject;
        if (j >= 64) {
          break;
        }
        k = j;
        localObject1 = paramObject;
        if ((l2 & 1L << j) != 0L)
        {
          localObject1 = new Integer(m + j);
          d = paramObject;
          h = null;
          g = j;
          i = 2;
          state = ((Integer)localObject1);
          i = 3;
          a = this;
          return localTextOrientationType;
        }
        label338:
        j = k + 1;
        paramObject = localObject1;
      }
    }
    if (l1 != 0L)
    {
      j = 0;
      while (j < 64)
      {
        k = j;
        paramObject = localObject1;
        if ((l1 & 1L << j) != 0L)
        {
          paramObject = new Integer(j + 64 + m);
          d = localObject1;
          h = null;
          g = j;
          i = 3;
          state = paramObject;
          i = 3;
          a = this;
          return localTextOrientationType;
        }
        label436:
        j = k + 1;
        localObject1 = paramObject;
      }
    }
    return Label.i;
  }
  
  public void close() {}
  
  public final Message d()
  {
    return Message.m;
  }
  
  public final String get()
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: fail exe a25 = a24\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:92)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.dfs(Cfg.java:255)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze0(BaseAnalyze.java:75)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze(BaseAnalyze.java:69)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:274)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\nCaused by: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:552)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:1)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:166)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:331)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:387)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:90)\n\t... 17 more\n");
  }
  
  public final String toString()
  {
    if (a == null)
    {
      Type.a.getClass();
      String str = params.Attribute.getString(this);
      Log.append(str, "renderLambdaToString(...)");
      return str;
    }
    return get();
  }
}
