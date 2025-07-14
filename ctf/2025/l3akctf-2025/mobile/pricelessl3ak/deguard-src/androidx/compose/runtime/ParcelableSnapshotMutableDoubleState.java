package androidx.compose.runtime;

import activities.ParcelableCompat.CompatCreator;
import activities.SeekBar;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import internal.Item;
import internal.Label;
import internal.f;

public final class ParcelableSnapshotMutableDoubleState
  extends Label
  implements Parcelable
{
  public static final Parcelable.Creator<ParcelableSnapshotMutableDoubleState> CREATOR = new ParcelableCompat.CompatCreator(0);
  public SeekBar a;
  
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
    SeekBar localSeekBar = (SeekBar)f.a(a);
    StringBuilder localStringBuilder = new StringBuilder("MutableDoubleState(value=");
    localStringBuilder.append(b);
    localStringBuilder.append(")@");
    localStringBuilder.append(hashCode());
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeDouble(aa, this)).b);
  }
}
