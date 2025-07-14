package no.l3akctf.pricelessl3ak;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import bsh.ParcelableCompat.CompatCreator;
import java.util.ArrayList;

public class p2a1672ac
  implements Parcelable
{
  public static final Parcelable.Creator<ctf.l3akctf.pricelessl3ak.p2a1672ac> CREATOR = new ParcelableCompat.CompatCreator(4);
  public final ArrayList a;
  public final int b;
  public final int c;
  public final String d;
  public final byte[] p;
  
  public p2a1672ac(int paramInt, byte[] paramArrayOfByte)
  {
    b = paramInt;
    p = paramArrayOfByte;
    a = null;
    c = 1;
  }
  
  public p2a1672ac(Parcel paramParcel)
  {
    b = paramParcel.readInt();
    d = paramParcel.readString();
    a = paramParcel.createTypedArrayList(v27a8612b.CREATOR);
    p = paramParcel.createByteArray();
    c = paramParcel.readInt();
  }
  
  public p2a1672ac(String paramString, ArrayList paramArrayList)
  {
    b = 4919;
    d = paramString;
    a = paramArrayList;
    c = 0;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(b);
    paramParcel.writeString(d);
    paramParcel.writeTypedList(a);
    paramParcel.writeByteArray(p);
    paramParcel.writeInt(c);
  }
}
