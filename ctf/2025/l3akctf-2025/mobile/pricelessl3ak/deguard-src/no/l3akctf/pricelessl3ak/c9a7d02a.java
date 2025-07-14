package no.l3akctf.pricelessl3ak;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import bsh.ParcelableCompat.CompatCreator;

public class c9a7d02a
  implements Parcelable
{
  public static final Parcelable.Creator<ctf.l3akctf.pricelessl3ak.c9a7d02a> CREATOR = new ParcelableCompat.CompatCreator(2);
  public boolean c;
  public int d;
  public boolean e;
  
  public c9a7d02a(Parcel paramParcel)
  {
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
    d = paramParcel.readInt();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeByte((byte)e);
    paramParcel.writeByte((byte)c);
    paramParcel.writeInt(d);
  }
}
