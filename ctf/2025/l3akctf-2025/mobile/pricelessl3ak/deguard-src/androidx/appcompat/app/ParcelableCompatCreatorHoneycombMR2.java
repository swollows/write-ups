package androidx.appcompat.app;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;

public final class ParcelableCompatCreatorHoneycombMR2
  implements Parcelable.ClassLoaderCreator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    return AppCompatDelegateImpl.PanelFeatureState.SavedState.a(paramParcel, null);
  }
  
  public final Object createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    return AppCompatDelegateImpl.PanelFeatureState.SavedState.a(paramParcel, paramClassLoader);
  }
  
  public final Object[] newArray(int paramInt)
  {
    return new AppCompatDelegateImpl.PanelFeatureState.SavedState[paramInt];
  }
}
