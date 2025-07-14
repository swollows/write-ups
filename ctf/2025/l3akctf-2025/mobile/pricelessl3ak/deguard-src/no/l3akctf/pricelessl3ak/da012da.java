package no.l3akctf.pricelessl3ak;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import bsh.ParcelableCompat.CompatCreator;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map.Entry;
import java.util.Set;

public class da012da
  implements Parcelable
{
  public static final Parcelable.Creator<ctf.l3akctf.pricelessl3ak.da012da> CREATOR = new ParcelableCompat.CompatCreator(3);
  public HashMap a;
  public int b;
  public ArrayList c;
  public int[] d;
  public String f;
  
  public da012da(Parcel paramParcel)
  {
    d = paramParcel.createIntArray();
    a = new HashMap();
    int k = paramParcel.readInt();
    int j = 0;
    int i = 0;
    while (i < k)
    {
      int m = paramParcel.readInt();
      int n = paramParcel.readInt();
      a.put(Integer.valueOf(m), Integer.valueOf(n));
      i += 1;
    }
    f = paramParcel.readString();
    c = new ArrayList();
    k = paramParcel.readInt();
    i = j;
    while (i < k)
    {
      c.add(Integer.valueOf(paramParcel.readInt()));
      i += 1;
    }
    b = paramParcel.readInt();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeIntArray(d);
    Object localObject = a;
    paramParcel.writeInt(((HashMap)localObject).size());
    localObject = ((HashMap)localObject).entrySet().iterator();
    while (((Iterator)localObject).hasNext())
    {
      Map.Entry localEntry = (Map.Entry)((Iterator)localObject).next();
      paramParcel.writeInt(((Integer)localEntry.getKey()).intValue());
      paramParcel.writeInt(((Integer)localEntry.getValue()).intValue());
    }
    paramParcel.writeString(f);
    localObject = c;
    paramParcel.writeInt(((ArrayList)localObject).size());
    localObject = ((ArrayList)localObject).iterator();
    while (((Iterator)localObject).hasNext()) {
      paramParcel.writeInt(((Integer)((Iterator)localObject).next()).intValue());
    }
    paramParcel.writeInt(b);
  }
}
