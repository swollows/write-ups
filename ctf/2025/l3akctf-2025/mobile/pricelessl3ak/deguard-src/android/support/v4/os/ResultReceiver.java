package android.support.v4.os;

import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import androidplot.b;
import androidplot.l;
import bsh.ParcelableCompat.CompatCreator;

public class ResultReceiver
  implements Parcelable
{
  public static final Parcelable.Creator<ResultReceiver> CREATOR = new ParcelableCompat.CompatCreator(7);
  public l mReceiver;
  
  public ResultReceiver(Parcel paramParcel) {}
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    try
    {
      if (mReceiver == null) {
        mReceiver = new b(this);
      }
      paramParcel.writeStrongBinder(mReceiver.asBinder());
      return;
    }
    catch (Throwable paramParcel)
    {
      for (;;) {}
    }
    throw paramParcel;
  }
}
