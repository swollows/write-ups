package app;

import android.view.View;
import java.util.Objects;
import util.Headers;

public class Elements
{
  public static final TypeToken NONE;
  public final TypeToken this$0;
  
  static
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: fail exe a2 = a1\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:92)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.dfs(Cfg.java:255)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze0(BaseAnalyze.java:75)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.analyze(BaseAnalyze.java:69)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer.transform(UnSSATransformer.java:274)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:163)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\nCaused by: java.lang.NullPointerException\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:552)\n\tat com.googlecode.dex2jar.ir.ts.UnSSATransformer$LiveA.onUseLocal(UnSSATransformer.java:1)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:166)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.onUse(BaseAnalyze.java:1)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:331)\n\tat com.googlecode.dex2jar.ir.ts.Cfg.travel(Cfg.java:387)\n\tat com.googlecode.dex2jar.ir.ts.an.BaseAnalyze.exec(BaseAnalyze.java:90)\n\t... 17 more\n");
  }
  
  public Elements(TypeToken paramTypeToken)
  {
    this$0 = paramTypeToken;
  }
  
  public Headers add()
  {
    return Headers.array;
  }
  
  public void add(int paramInt) {}
  
  public TypeToken equals()
  {
    return this$0;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (!(paramObject instanceof Elements)) {
      return false;
    }
    paramObject = (Elements)paramObject;
    return (size() == paramObject.size()) && (isEmpty() == paramObject.isEmpty()) && (Objects.equals(add(), paramObject.add())) && (Objects.equals(unwrap(), paramObject.unwrap())) && (Objects.equals(peek(), paramObject.peek()));
  }
  
  public TypeToken get()
  {
    return this$0;
  }
  
  public TypeToken get(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    return NONE;
  }
  
  public int hashCode()
  {
    return Objects.hash(new Object[] { Boolean.valueOf(size()), Boolean.valueOf(isEmpty()), add(), unwrap(), peek() });
  }
  
  public void init(Headers paramHeaders) {}
  
  public boolean isEmpty()
  {
    return false;
  }
  
  public Buffer peek()
  {
    return null;
  }
  
  public void set(View paramView) {}
  
  public void set(TypeToken paramTypeToken) {}
  
  public void set(Headers[] paramArrayOfHeaders) {}
  
  public boolean size()
  {
    return false;
  }
  
  public Headers unwrap()
  {
    return Headers.array;
  }
  
  public TypeToken wrap()
  {
    return this$0;
  }
}
