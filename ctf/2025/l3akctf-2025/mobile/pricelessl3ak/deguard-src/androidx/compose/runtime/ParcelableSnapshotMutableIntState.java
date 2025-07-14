package androidx.compose.runtime;

import activities.ParcelableCompat.CompatCreator;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import internal.Label;
import internal.f;

public final class ParcelableSnapshotMutableIntState
  extends Label
  implements Parcelable
{
  public static final Parcelable.Creator<ParcelableSnapshotMutableIntState> CREATOR = new ParcelableCompat.CompatCreator(2);
  public activities.Item h;
  
  public final internal.Item b()
  {
    return h;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    activities.Item localItem = (activities.Item)f.a(h);
    StringBuilder localStringBuilder = new StringBuilder("MutableIntState(value=");
    localStringBuilder.append(a);
    localStringBuilder.append(")@");
    localStringBuilder.append(hashCode());
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeInt(ah, this)).a);
  }
}
