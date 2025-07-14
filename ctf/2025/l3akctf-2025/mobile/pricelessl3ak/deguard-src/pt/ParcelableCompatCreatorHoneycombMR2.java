package pt;

import android.os.Parcel;
import android.os.Parcelable.ClassLoaderCreator;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout.SavedState;
import androidx.viewpager.widget.ViewPager.SavedState;

public final class ParcelableCompatCreatorHoneycombMR2
  implements Parcelable.ClassLoaderCreator
{
  public final Object createFromParcel(Parcel paramParcel)
  {
    switch (mCallbacks)
    {
    default: 
      if (paramParcel.readParcelable(null) == null) {
        return AbsSavedState.EMPTY_STATE;
      }
      throw new IllegalStateException("superState must be null");
    case 1: 
      return new ViewPager.SavedState(paramParcel, null);
    }
    return new DrawerLayout.SavedState(paramParcel, null);
  }
  
  public final Object createFromParcel(Parcel paramParcel, ClassLoader paramClassLoader)
  {
    switch (mCallbacks)
    {
    default: 
      if (paramParcel.readParcelable(paramClassLoader) == null) {
        return AbsSavedState.EMPTY_STATE;
      }
      throw new IllegalStateException("superState must be null");
    case 1: 
      return new ViewPager.SavedState(paramParcel, paramClassLoader);
    }
    return new DrawerLayout.SavedState(paramParcel, paramClassLoader);
  }
  
  public final Object[] newArray(int paramInt)
  {
    switch (mCallbacks)
    {
    default: 
      return new AbsSavedState[paramInt];
    case 1: 
      return new ViewPager.SavedState[paramInt];
    }
    return new DrawerLayout.SavedState[paramInt];
  }
}
