package androidx.fragment.asm;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import java.util.ArrayList;

final class FragmentManagerState
  implements Parcelable
{
  public static final Parcelable.Creator<androidx.fragment.app.FragmentManagerState> CREATOR = new ParcelableCompat.CompatCreator(3);
  public final ArrayList a = new ArrayList();
  public final ArrayList b = new ArrayList();
  public final String c = null;
  public int d;
  public BackStackRecordState[] e;
  public ArrayList f;
  public ArrayList g;
  public ArrayList r;
  
  public FragmentManagerState() {}
  
  public FragmentManagerState(Parcel paramParcel)
  {
    f = paramParcel.createStringArrayList();
    g = paramParcel.createStringArrayList();
    e = ((BackStackRecordState[])paramParcel.createTypedArray(BackStackRecordState.CREATOR));
    d = paramParcel.readInt();
    c = paramParcel.readString();
    a = paramParcel.createStringArrayList();
    b = paramParcel.createTypedArrayList(BackStackState.CREATOR);
    r = paramParcel.createTypedArrayList(FragmentManager.LaunchedFragmentInfo.CREATOR);
  }
  
  public int describeContents()
  {
    return 0;
  }
  
  public void writeToParcel(Parcel paramParcel, int paramInt)
  {
    paramParcel.writeStringList(f);
    paramParcel.writeStringList(g);
    paramParcel.writeTypedArray(e, paramInt);
    paramParcel.writeInt(d);
    paramParcel.writeString(c);
    paramParcel.writeStringList(a);
    paramParcel.writeTypedList(b);
    paramParcel.writeTypedList(r);
  }
}
