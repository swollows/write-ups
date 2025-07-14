package androidx.fragment.asm;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

public final class ParcelableCompatCreatorHoneycombMR2
  implements Parcelable.ClassLoaderCreator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    return new Fragment.SavedState(paramParcel, null);
  }
  
  public final Object createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return new Fragment.SavedState(paramParcel, paramClassLoader);
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new Fragment.SavedState[paramInt];
  }
}
