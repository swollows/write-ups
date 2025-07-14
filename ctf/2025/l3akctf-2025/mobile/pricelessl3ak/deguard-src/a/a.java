package a;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Handler;
import android.os.Message;
import android.os.Parcel;
import android.os.Parcelable.Creator;
import android.util.Log;
import java.io.InputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import no.l3akctf.pricelessl3ak.p2a1672ac;
import no.l3akctf.pricelessl3ak.v1289a0d;
import no.l3akctf.pricelessl3ak.v27a8612b;

public final class a
  extends Handler
{
  public Context c;
  
  public static v1289a0d a(List paramList, String paramString)
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public static ArrayList read(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length >= 7) {
      try
      {
        paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte);
        Object localObject = ByteOrder.LITTLE_ENDIAN;
        paramArrayOfByte.order((ByteOrder)localObject);
        localObject = new ArrayList();
        for (;;)
        {
          int i = paramArrayOfByte.remaining();
          if (i < 7) {
            break;
          }
          i = paramArrayOfByte.get();
          int j = paramArrayOfByte.get();
          int k = paramArrayOfByte.get();
          int m = paramArrayOfByte.getInt();
          ((ArrayList)localObject).add(new v27a8612b(i & 0xFF, j & 0xFF, k & 0xFF, m));
        }
        boolean bool;
        label119:
        return null;
      }
      catch (Exception paramArrayOfByte)
      {
        break label119;
        bool = ((ArrayList)localObject).isEmpty();
        if (bool) {
          return null;
        }
        return localObject;
        localObject = new StringBuilder("Failed");
        ((StringBuilder)localObject).append(paramArrayOfByte.getMessage());
        Log.d("", ((StringBuilder)localObject).toString());
      }
    }
  }
  
  public final ArrayList a(String paramString)
  {
    for (;;)
    {
      try
      {
        i = Math.abs(paramString.hashCode());
        i %= 5;
        if (i != 0)
        {
          if (i != 1)
          {
            if (i != 2)
            {
              if (i != 3)
              {
                paramString = "27382asds982";
              }
              else
              {
                paramString = "as8d71aASAS";
                continue;
              }
            }
            else
            {
              paramString = "7a879fa823as";
              continue;
            }
          }
          else
          {
            paramString = "12789a712xa";
            continue;
          }
        }
        else
        {
          paramString = "217sd87as";
          continue;
        }
        j = 0;
        i = 0;
        if (i < 6) {
          localObject = new String[] { "217sd87as", paramString, "12789a712xa", "7a879fa823as", "as8d71aASAS", "27382asds982" }[i];
        }
      }
      catch (Exception paramString)
      {
        try
        {
          int i;
          int j;
          boolean bool;
          Object localObject = new StringBuilder("Failed");
          ((StringBuilder)localObject).append(paramString.getMessage());
          Log.d("", ((StringBuilder)localObject).toString());
          return null;
        }
        catch (Exception paramString) {}
        paramString = paramString;
        return null;
      }
      try
      {
        localObject = read((String)localObject);
        bool = ((ArrayList)localObject).isEmpty();
        if (!bool) {
          return localObject;
        }
      }
      catch (Exception localException)
      {
        continue;
      }
      i += 1;
    }
    paramString = new byte[14];
    i = j;
    while (i < 14)
    {
      paramString[i] = ((byte)(new byte[] { -104, -85, -86, -86, -86, -86, -86, -38, -86, -86, -86, -86, -86, -86 }[i] ^ 0xAA));
      i += 1;
    }
    try
    {
      paramString = read(paramString);
      return paramString;
    }
    catch (Exception paramString) {}
    return null;
  }
  
  public final void handleMessage(Message paramMessage)
  {
    Object localObject1 = obj;
    if ((localObject1 instanceof Parcel))
    {
      localObject1 = (Parcel)localObject1;
      ((Parcel)localObject1).setDataPosition(0);
      Object localObject3;
      try
      {
        Object localObject2 = p2a1672ac.CREATOR;
        if (localObject3 == null) {
          break label136;
        }
      }
      catch (Throwable localThrowable)
      {
        try
        {
          localObject2 = ((Parcelable.Creator)localObject2).createFromParcel((Parcel)localObject1);
          localObject2 = (p2a1672ac)localObject2;
          localObject2 = read((p2a1672ac)localObject2);
          localObject3 = ClassWriter.a();
          i = what;
          localObject3 = (ConcurrentHashMap)b;
          localObject3 = ((ConcurrentHashMap)localObject3).get(Integer.valueOf(i));
          localObject3 = (Item)localObject3;
          if ((localObject3 == null) || (localObject2 == null)) {
            break label122;
          }
          ((Item)localObject3).a((p2a1672ac)localObject2);
        }
        catch (Exception localException)
        {
          break label165;
        }
        localThrowable = localThrowable;
      }
      label122:
      ((Item)localObject3).setTitle("Processing returned null result");
      for (;;)
      {
        label136:
        ((Parcel)localObject1).recycle();
        localObject1 = ClassWriter.a();
        i = what;
        ((ConcurrentHashMap)b).remove(Integer.valueOf(i));
        return;
        label165:
        localException.printStackTrace();
        localObject3 = ClassWriter.a();
        i = what;
        localObject3 = (Item)((ConcurrentHashMap)b).get(Integer.valueOf(i));
        if (localObject3 != null)
        {
          StringBuilder localStringBuilder = new StringBuilder("Processing failed: ");
          localStringBuilder.append(localException.getMessage());
          ((Item)localObject3).setTitle(localStringBuilder.toString());
        }
      }
      ((Parcel)localObject1).recycle();
      localObject1 = ClassWriter.a();
      int i = what;
      ((ConcurrentHashMap)b).remove(Integer.valueOf(i));
      throw localException;
    }
  }
  
  public final ArrayList read(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    paramString = c.getAssets().open(paramString);
    byte[] arrayOfByte = new byte[paramString.available()];
    paramString.read(arrayOfByte);
    paramString.close();
    paramString = ByteBuffer.wrap(arrayOfByte);
    paramString.order(ByteOrder.LITTLE_ENDIAN);
    while (paramString.remaining() >= 7) {
      localArrayList.add(new v27a8612b(paramString.get() & 0xFF, paramString.get() & 0xFF, paramString.get() & 0xFF, paramString.getInt()));
    }
    return localArrayList;
  }
  
  public final p2a1672ac read(p2a1672ac paramP2a1672ac)
  {
    if (b == 4919)
    {
      Object localObject2 = d;
      Object localObject1 = a;
      boolean bool;
      if (localObject1 != null) {
        try
        {
          bool = ((List)localObject1).isEmpty();
          if (!bool) {
            paramP2a1672ac = (p2a1672ac)localObject1;
          }
        }
        catch (Exception paramP2a1672ac)
        {
          break label181;
        }
      }
      paramP2a1672ac = p;
      if ((paramP2a1672ac != null) && (paramP2a1672ac.length > 0)) {
        paramP2a1672ac = read(paramP2a1672ac);
      } else {
        paramP2a1672ac = a((String)localObject2);
      }
      if (paramP2a1672ac != null)
      {
        bool = paramP2a1672ac.isEmpty();
        if (bool) {
          return null;
        }
        localObject1 = a(paramP2a1672ac, (String)localObject2);
        paramP2a1672ac = ByteBuffer.allocate(4);
        localObject2 = ByteOrder.LITTLE_ENDIAN;
        paramP2a1672ac.order((ByteOrder)localObject2);
        byte b = (byte)header;
        paramP2a1672ac.put(b);
        int i = paramP2a1672ac.position();
        localObject1 = new byte[i];
        paramP2a1672ac.rewind();
        paramP2a1672ac.get((byte[])localObject1);
        try
        {
          paramP2a1672ac = new p2a1672ac(4920, (byte[])localObject1);
          return paramP2a1672ac;
        }
        catch (Exception paramP2a1672ac)
        {
          paramP2a1672ac.printStackTrace();
          return null;
        }
        label181:
        paramP2a1672ac.printStackTrace();
      }
    }
    return null;
  }
}
