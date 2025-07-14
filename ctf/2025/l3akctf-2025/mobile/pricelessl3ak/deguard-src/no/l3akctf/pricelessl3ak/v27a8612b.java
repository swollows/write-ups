package no.l3akctf.pricelessl3ak;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import bsh.ParcelableCompat.CompatCreator;

public class v27a8612b
  implements Parcelable
{
  public static final Parcelable.Creator<ctf.l3akctf.pricelessl3ak.v27a8612b> CREATOR = new ParcelableCompat.CompatCreator(6);
  public final int a;
  public final int b;
  public final int c;
  public final int d;
  
  public v27a8612b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    d = paramInt1;
    a = paramInt2;
    c = paramInt3;
    b = paramInt4;
  }
  
  public v27a8612b(Parcel paramParcel)
  {
    d = paramParcel.readInt();
    a = paramParcel.readInt();
    c = paramParcel.readInt();
    b = paramParcel.readInt();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(d);
    paramParcel.writeInt(a);
    paramParcel.writeInt(c);
    paramParcel.writeInt(b);
  }
}
