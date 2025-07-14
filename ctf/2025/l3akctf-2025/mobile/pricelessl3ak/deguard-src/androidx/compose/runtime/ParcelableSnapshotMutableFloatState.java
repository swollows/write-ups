package androidx.compose.runtime;

import activities.Integer;
import activities.ParcelableCompat.CompatCreator;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import internal.Item;
import internal.Label;
import internal.f;

public final class ParcelableSnapshotMutableFloatState
  extends Label
  implements Parcelable
{
  public static final Parcelable.Creator<ParcelableSnapshotMutableFloatState> CREATOR = new ParcelableCompat.CompatCreator(1);
  public Integer a;
  
  public final Item b()
  {
    return a;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    Integer localInteger = (Integer)f.a(a);
    StringBuilder localStringBuilder = new StringBuilder("MutableFloatState(value=");
    localStringBuilder.append(y);
    localStringBuilder.append(")@");
    localStringBuilder.append(hashCode());
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeFloat(aa, this)).y);
  }
}
