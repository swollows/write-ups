package core;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Objects;

public final class Type
{
  public final int a;
  public final long b;
  public final int c;
  public final long d;
  
  public Type(int paramInt1, int paramInt2, long paramLong1, long paramLong2)
  {
    c = paramInt1;
    a = paramInt2;
    b = paramLong1;
    d = paramLong2;
  }
  
  public static Type read(File paramFile)
  {
    paramFile = new DataInputStream(new FileInputStream(paramFile));
    try
    {
      Type localType = new Type(paramFile.readInt(), paramFile.readInt(), paramFile.readLong(), paramFile.readLong());
      paramFile.close();
      return localType;
    }
    catch (Throwable localThrowable)
    {
      try
      {
        paramFile.close();
      }
      catch (Throwable paramFile)
      {
        localThrowable.addSuppressed(paramFile);
      }
      throw localThrowable;
    }
  }
  
  public final void a(File paramFile)
  {
    paramFile.delete();
    DataOutputStream localDataOutputStream = new DataOutputStream(new FileOutputStream(paramFile));
    try
    {
      localDataOutputStream.writeInt(c);
      localDataOutputStream.writeInt(a);
      localDataOutputStream.writeLong(b);
      localDataOutputStream.writeLong(d);
      localDataOutputStream.close();
      return;
    }
    catch (Throwable paramFile)
    {
      try
      {
        localDataOutputStream.close();
      }
      catch (Throwable localThrowable)
      {
        paramFile.addSuppressed(localThrowable);
      }
      throw paramFile;
    }
  }
  
  public final boolean equals(Object paramObject)
  {
    if (this == paramObject) {
      return true;
    }
    if (paramObject != null)
    {
      if (!(paramObject instanceof Type)) {
        return false;
      }
      paramObject = (Type)paramObject;
      if ((a == a) && (b == b) && (c == c) && (d == d)) {
        return true;
      }
    }
    return false;
  }
  
  public final int hashCode()
  {
    return Objects.hash(new Object[] { Integer.valueOf(a), Long.valueOf(b), Integer.valueOf(c), Long.valueOf(d) });
  }
}
