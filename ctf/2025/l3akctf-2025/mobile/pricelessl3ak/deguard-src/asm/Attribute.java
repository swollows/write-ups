package asm;

import java.nio.ByteBuffer;
import model.LocalService;

public final class Attribute
{
  public static final ThreadLocal chars = new ThreadLocal();
  public volatile int b = 0;
  public final Label i;
  public final int type;
  
  public Attribute(Label paramLabel, int paramInt)
  {
    i = paramLabel;
    type = paramInt;
  }
  
  public final int getSize()
  {
    LocalService localLocalService = read();
    int j = localLocalService.read(16);
    if (j != 0)
    {
      j += data;
      int k = ((ByteBuffer)value).getInt(j);
      return ((ByteBuffer)value).getInt(k + j);
    }
    return 0;
  }
  
  public final int read(int paramInt)
  {
    LocalService localLocalService = read();
    int j = localLocalService.read(16);
    if (j != 0)
    {
      ByteBuffer localByteBuffer = (ByteBuffer)value;
      j += data;
      return localByteBuffer.getInt(paramInt * 4 + (localByteBuffer.getInt(j) + j + 4));
    }
    return 0;
  }
  
  public final LocalService read()
  {
    throw new Runtime("d2j fail translate: java.lang.RuntimeException: \n\tat com.googlecode.dex2jar.ir.ts.NewTransformer.transform(NewTransformer.java:134)\n\tat com.googlecode.d2j.dex.Dex2jar$2.optimize(Dex2jar.java:148)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertCode(Dex2Asm.java:414)\n\tat com.googlecode.d2j.dex.ExDex2Asm.convertCode(ExDex2Asm.java:42)\n\tat com.googlecode.d2j.dex.Dex2jar$2.convertCode(Dex2jar.java:128)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertMethod(Dex2Asm.java:509)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertClass(Dex2Asm.java:406)\n\tat com.googlecode.d2j.dex.Dex2Asm.convertDex(Dex2Asm.java:422)\n\tat com.googlecode.d2j.dex.Dex2jar.doTranslate(Dex2jar.java:172)\n\tat com.googlecode.d2j.dex.Dex2jar.to(Dex2jar.java:272)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.doCommandLine(Dex2jarCmd.java:108)\n\tat com.googlecode.dex2jar.tools.BaseCmd.doMain(BaseCmd.java:288)\n\tat com.googlecode.dex2jar.tools.Dex2jarCmd.main(Dex2jarCmd.java:32)\n");
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder();
    localStringBuilder.append(super.toString());
    localStringBuilder.append(", id:");
    LocalService localLocalService = read();
    int j = localLocalService.read(4);
    int k = 0;
    if (j != 0) {
      j = ((ByteBuffer)value).getInt(j + data);
    } else {
      j = 0;
    }
    localStringBuilder.append(Integer.toHexString(j));
    localStringBuilder.append(", codepoints:");
    int m = getSize();
    j = k;
    while (j < m)
    {
      localStringBuilder.append(Integer.toHexString(read(j)));
      localStringBuilder.append(" ");
      j += 1;
    }
    return localStringBuilder.toString();
  }
}
