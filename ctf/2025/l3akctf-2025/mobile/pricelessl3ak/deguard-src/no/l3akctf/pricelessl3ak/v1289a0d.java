package no.l3akctf.pricelessl3ak;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import bsh.ParcelableCompat.CompatCreator;

public class v1289a0d
  implements Parcelable
{
  public static final Parcelable.Creator<ctf.l3akctf.pricelessl3ak.v1289a0d> CREATOR = new ParcelableCompat.CompatCreator(5);
  public final boolean header;
  
  public v1289a0d(Parcel paramParcel)
  {
    boolean bool;
    if (paramParcel.readByte() != 0) {
      bool = true;
    } else {
      bool = false;
    }
    header = bool;
  }
  
  public v1289a0d(boolean paramBoolean)
  {
    header = paramBoolean;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeByte((byte)header);
  }
}
