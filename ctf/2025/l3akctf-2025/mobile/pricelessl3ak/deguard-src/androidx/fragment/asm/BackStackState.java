package androidx.fragment.asm;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

class BackStackState
  implements Parcelable
{
  public static final Parcelable.Creator<androidx.fragment.app.BackStackState> CREATOR = new ParcelableCompat.CompatCreator(1);
  public final ArrayList mSharedElementSourceNames;
  public final ArrayList mSharedElementTargetNames;
  
  public BackStackState(Parcel paramParcel)
  {
    mSharedElementSourceNames = paramParcel.createStringArrayList();
    mSharedElementTargetNames = paramParcel.createTypedArrayList(BackStackRecordState.CREATOR);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeStringList(mSharedElementSourceNames);
    paramParcel.writeTypedList(mSharedElementTargetNames);
  }
}
