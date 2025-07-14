package androidx.compose.runtime;

import activities.EditText;
import activities.ParcelableCompat.CompatCreator;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import internal.Item;
import internal.Label;
import internal.f;

public final class ParcelableSnapshotMutableLongState
  extends Label
  implements Parcelable
{
  public static final Parcelable.Creator<ParcelableSnapshotMutableLongState> CREATOR = new ParcelableCompat.CompatCreator(3);
  public EditText b;
  
  public final Item b()
  {
    return b;
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public final String toString()
  {
    EditText localEditText = (EditText)f.a(b);
    StringBuilder localStringBuilder = new StringBuilder("MutableLongState(value=");
    localStringBuilder.append(mId);
    localStringBuilder.append(")@");
    localStringBuilder.append(hashCode());
    return localStringBuilder.toString();
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeLong(ab, this)).mId);
  }
}
