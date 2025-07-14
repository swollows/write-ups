package no.l3akctf.pricelessl3ak;

import a.ClassWriter;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import app.f;
import views.i;

public class h1832fla12
  extends Activity
{
  public ClassWriter a;
  
  public h1832fla12() {}
  
  public final void onCreate(Bundle paramBundle)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final void onNewIntent(Intent paramIntent)
  {
    super.onNewIntent(paramIntent);
    setIntent(paramIntent);
    if ("BANGO".equals(paramIntent.getAction()))
    {
      Object localObject = a;
      if ((byte[])a == null) {
        return;
      }
      if (paramIntent.getFlags() != 0)
      {
        String str = paramIntent.getStringExtra("f");
        if (str == null) {
          return;
        }
        int i = paramIntent.getFlags();
        byte[] arrayOfByte = (byte[])a;
        paramIntent = new f(9, localObject);
        localObject = (i)b;
        localObject.getClass();
        long l = i;
        try
        {
          ((i)localObject).a(paramIntent, str, i.read(i.parse(arrayOfByte, l)));
          return;
        }
        catch (Exception localException)
        {
          localObject = new StringBuilder(" ");
          ((StringBuilder)localObject).append(localException.getMessage());
          paramIntent.a(((StringBuilder)localObject).toString());
        }
      }
    }
  }
}
