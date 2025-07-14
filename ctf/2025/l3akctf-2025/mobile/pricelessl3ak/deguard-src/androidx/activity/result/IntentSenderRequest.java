package androidx.activity.result;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import bsh.ParcelableCompat.CompatCreator;
import params.Log;

public final class IntentSenderRequest
  implements Parcelable
{
  public static final Parcelable.Creator<IntentSenderRequest> CREATOR = new ParcelableCompat.CompatCreator(9);
  public final IntentSender major;
  public final Intent minor;
  public final int rssi;
  public final int txPower;
  
  public IntentSenderRequest(Parcel paramParcel)
  {
    major = ((IntentSender)localObject);
    minor = localIntent;
    txPower = i;
    rssi = j;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Log.get(paramParcel, "dest");
    paramParcel.writeParcelable(major, paramInt);
    paramParcel.writeParcelable(minor, paramInt);
    paramParcel.writeInt(txPower);
    paramParcel.writeInt(rssi);
  }
}
