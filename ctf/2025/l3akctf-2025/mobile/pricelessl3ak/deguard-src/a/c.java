package a;

import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import app.f;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import no.l3akctf.pricelessl3ak.p2a1672ac;

public final class c
{
  public k a;
  public Context c;
  public boolean l;
  
  public final void a()
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final void a(f paramF, String paramString, ArrayList paramArrayList)
  {
    if (!l) {
      a();
    }
    ClassWriter localClassWriter = ClassWriter.a();
    if (!paramArrayList.isEmpty()) {
      paramString = new p2a1672ac(paramString, paramArrayList);
    } else {
      paramString = new p2a1672ac(paramString, null);
    }
    paramF = new e(paramF);
    paramArrayList = (ConcurrentHashMap)c;
    int i = b;
    paramArrayList = (a)paramArrayList.get(Integer.valueOf(i));
    if (paramArrayList != null)
    {
      Parcel localParcel = Parcel.obtain();
      paramString.writeToParcel(localParcel, 0);
      paramString = paramArrayList.obtainMessage();
      obj = localParcel;
      i = ((AtomicInteger)a).incrementAndGet();
      what = i;
      ((ConcurrentHashMap)b).put(Integer.valueOf(i), paramF);
      paramArrayList.sendMessageDelayed(paramString, 50L);
      return;
    }
    paramString = new StringBuilder("No handler registered for message type: ");
    paramString.append(i);
    paramF.setTitle(paramString.toString());
  }
}
