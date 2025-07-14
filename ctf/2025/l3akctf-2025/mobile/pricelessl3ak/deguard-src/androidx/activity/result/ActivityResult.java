package androidx.activity.result;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import bsh.ParcelableCompat.CompatCreator;
import params.Log;

public final class ActivityResult
  implements Parcelable
{
  public static final Parcelable.Creator<ActivityResult> CREATOR = new ParcelableCompat.CompatCreator(8);
  public final int d;
  public final Intent f;
  
  public ActivityResult(Intent paramIntent, int paramInt)
  {
    d = paramInt;
    f = paramIntent;
  }
  
  public ActivityResult(Parcel paramParcel)
  {
    this(paramParcel, i);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    StringBuilder localStringBuilder = new StringBuilder("ActivityResult{resultCode=");
    int i = d;
    String str;
    if (i != -1)
    {
      if (i != 0) {
        str = String.valueOf(i);
      } else {
        str = "RESULT_CANCELED";
      }
    }
    else {
      str = "RESULT_OK";
    }
    localStringBuilder.append(str);
    localStringBuilder.append(", data=");
    localStringBuilder.append(f);
    localStringBuilder.append('}');
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    Log.get(paramParcel, "dest");
    paramParcel.writeInt(d);
    Intent localIntent = f;
    int i;
    if (localIntent == null) {
      i = 0;
    } else {
      i = 1;
    }
    paramParcel.writeInt(i);
    if (localIntent != null) {
      localIntent.writeToParcel(paramParcel, paramInt);
    }
  }
}
