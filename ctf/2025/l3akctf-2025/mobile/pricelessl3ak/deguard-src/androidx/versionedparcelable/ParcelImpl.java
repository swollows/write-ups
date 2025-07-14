package androidx.versionedparcelable;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import bsh.Attribute;
import bsh.ByteVector;
import bsh.ParcelableCompat.CompatCreator;
import bsh.Token;

public class ParcelImpl
  implements Parcelable
{
  public static final Parcelable.Creator<ParcelImpl> CREATOR = new ParcelableCompat.CompatCreator(0);
  public final Token info;
  
  public ParcelImpl(Parcel paramParcel)
  {
    info = new Attribute(paramParcel).get();
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    new Attribute(paramParcel).write(info);
  }
}
