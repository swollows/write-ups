package bsh;

import android.os.Parcel;
import android.util.SparseIntArray;
import http.ConcurrentHashMap;

public final class Attribute
  extends ByteVector
{
  public int a = -1;
  public final int b;
  public final Parcel buffer;
  public final SparseIntArray c = new SparseIntArray();
  public int f = -1;
  public final String h;
  public int p;
  public final int s;
  
  public Attribute(Parcel paramParcel) {}
  
  public Attribute(Parcel paramParcel, int paramInt1, int paramInt2, String paramString, ConcurrentHashMap paramConcurrentHashMap1, ConcurrentHashMap paramConcurrentHashMap2, ConcurrentHashMap paramConcurrentHashMap3)
  {
    super(paramConcurrentHashMap1, paramConcurrentHashMap2, paramConcurrentHashMap3);
    buffer = paramParcel;
    s = paramInt1;
    b = paramInt2;
    p = paramInt1;
    h = paramString;
  }
  
  public final Attribute a()
  {
    Parcel localParcel = buffer;
    int k = localParcel.dataPosition();
    int j = p;
    int i = j;
    if (j == s) {
      i = b;
    }
    Object localObject = new StringBuilder();
    ((StringBuilder)localObject).append(h);
    ((StringBuilder)localObject).append("  ");
    localObject = ((StringBuilder)localObject).toString();
    ConcurrentHashMap localConcurrentHashMap1 = b;
    ConcurrentHashMap localConcurrentHashMap2 = c;
    return new Attribute(localParcel, k, i, (String)localObject, buffer, localConcurrentHashMap1, localConcurrentHashMap2);
  }
  
  public final boolean a(int paramInt)
  {
    while (p < b)
    {
      int i = f;
      if (i == paramInt) {
        return true;
      }
      if (String.valueOf(i).compareTo(String.valueOf(paramInt)) > 0) {
        return false;
      }
      i = p;
      Parcel localParcel = buffer;
      localParcel.setDataPosition(i);
      i = localParcel.readInt();
      f = localParcel.readInt();
      p += i;
    }
    return f == paramInt;
  }
  
  public final void write(int paramInt)
  {
    int i = a;
    SparseIntArray localSparseIntArray = c;
    Parcel localParcel = buffer;
    if (i >= 0)
    {
      i = localSparseIntArray.get(i);
      int j = localParcel.dataPosition();
      localParcel.setDataPosition(i);
      localParcel.writeInt(j - i);
      localParcel.setDataPosition(j);
    }
    a = paramInt;
    localSparseIntArray.put(paramInt, localParcel.dataPosition());
    localParcel.writeInt(0);
    localParcel.writeInt(paramInt);
  }
}
