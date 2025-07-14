package no.l3akctf.pricelessl3ak;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import bsh.ParcelableCompat.CompatCreator;

public class a0da01
  implements Parcelable
{
  public static final Parcelable.Creator<ctf.l3akctf.pricelessl3ak.a0da01> CREATOR = new ParcelableCompat.CompatCreator(1);
  public boolean c;
  public int[] d;
  public boolean e;
  
  public a0da01(Parcel paramParcel)
  {
    d = paramParcel.createIntArray();
    int i = paramParcel.readByte();
    boolean bool2 = false;
    if (i != 0) {
      bool1 = true;
    } else {
      bool1 = false;
    }
    e = bool1;
    boolean bool1 = bool2;
    if (paramParcel.readByte() != 0) {
      bool1 = true;
    }
    c = bool1;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeIntArray(d);
    paramParcel.writeByte((byte)e);
    paramParcel.writeByte((byte)c);
  }
}
