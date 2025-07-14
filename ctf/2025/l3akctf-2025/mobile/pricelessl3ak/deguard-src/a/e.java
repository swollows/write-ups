package a;

import android.app.AlertDialog.Builder;
import app.f;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import no.l3akctf.pricelessl3ak.h1832fla12;
import no.l3akctf.pricelessl3ak.p2a1672ac;
import no.l3akctf.pricelessl3ak.v1289a0d;

public final class e
  implements Item
{
  public e(f paramF)
  {
    d = paramF;
  }
  
  public final void a(p2a1672ac paramP2a1672ac)
  {
    f localF2 = d;
    int i;
    boolean bool;
    if (b == 4920)
    {
      byte[] arrayOfByte = p;
      localF1 = null;
      paramP2a1672ac = localF1;
      if (arrayOfByte != null)
      {
        i = arrayOfByte.length;
        bool = true;
        if (i < 1)
        {
          paramP2a1672ac = localF1;
        }
        else
        {
          paramP2a1672ac = ByteBuffer.wrap(arrayOfByte);
          paramP2a1672ac.order(ByteOrder.LITTLE_ENDIAN);
        }
      }
    }
    try
    {
      i = paramP2a1672ac.get();
      if (i != 1) {
        bool = false;
      }
      paramP2a1672ac = new v1289a0d(bool);
    }
    catch (Exception paramP2a1672ac)
    {
      for (;;)
      {
        paramP2a1672ac = localF1;
      }
    }
    if (paramP2a1672ac != null)
    {
      localF1 = (f)a;
      if (header)
      {
        paramP2a1672ac = (h1832fla12)a).c;
        new AlertDialog.Builder(paramP2a1672ac).setTitle("SUCCESS!").setMessage("Success!").setPositiveButton("Amazing!", new l(paramP2a1672ac, 0)).setCancelable(false).show();
        return;
      }
      localF1.a("Failed!");
      return;
    }
    localF2.a("Failed");
    return;
    localF2.a("Invalid response");
  }
  
  public final void setTitle(String paramString)
  {
    d.a(paramString);
  }
}
