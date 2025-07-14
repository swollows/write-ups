package androidx.lifecycle;

import android.app.Application;
import drupal.Context;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.List;
import params.Log;

public abstract class aa
{
  public static final List a;
  public static final List c = Context.create(F.class);
  
  static
  {
    List localList = Arrays.asList(new Class[] { Application.class, F.class });
    Log.append(localList, "asList(...)");
    a = localList;
  }
  
  public static final Constructor get(Class paramClass, List paramList)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: fail exe a12 = a11\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:92)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.dfs(Cfg.java:255)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze0(BaseAnalyze.java:75)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze(BaseAnalyze.java:69)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:274)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\nCaused by: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:552)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:1)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:166)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:331)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:387)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:90)\n\t... 17 more\n");
  }
  
  public static final Label invoke(Class paramClass, Constructor paramConstructor, Object... paramVarArgs)
  {
    int i = paramVarArgs.length;
    try
    {
      paramConstructor = paramConstructor.newInstance(Arrays.copyOf(paramVarArgs, i));
      return (Label)paramConstructor;
    }
    catch (InvocationTargetException paramConstructor) {}catch (InstantiationException paramConstructor)
    {
      break label62;
    }
    catch (IllegalAccessException paramConstructor) {}
    paramVarArgs = new StringBuilder("An exception happened in constructor of ");
    paramVarArgs.append(paramClass);
    throw new RuntimeException(paramVarArgs.toString(), paramConstructor.getCause());
    label62:
    paramVarArgs = new StringBuilder("A ");
    paramVarArgs.append(paramClass);
    paramVarArgs.append(" cannot be instantiated.");
    throw new RuntimeException(paramVarArgs.toString(), paramConstructor);
    paramVarArgs = new StringBuilder("Failed to access ");
    paramVarArgs.append(paramClass);
    throw new RuntimeException(paramVarArgs.toString(), paramConstructor);
  }
}
