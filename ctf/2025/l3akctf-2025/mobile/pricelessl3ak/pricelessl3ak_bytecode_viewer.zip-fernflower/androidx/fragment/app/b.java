package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

public final class b implements Parcelable.Creator {
   public final int a;

   // $FF: synthetic method
   public b(int var1) {
      this.a = var1;
   }

   public final Object createFromParcel(Parcel var1) {
      switch (this.a) {
         case 0:
            return new BackStackRecordState(var1);
         case 1:
            return new BackStackState(var1);
         case 2:
            return new FragmentManager$LaunchedFragmentInfo(var1);
         case 3:
            return new FragmentManagerState(var1);
         case 4:
            return new FragmentState(var1);
         default:
            return new FragmentTabHost$SavedState(var1);
      }
   }

   public final Object[] newArray(int var1) {
      switch (this.a) {
         case 0:
            return new BackStackRecordState[var1];
         case 1:
            return new BackStackState[var1];
         case 2:
            return new FragmentManager$LaunchedFragmentInfo[var1];
         case 3:
            return new FragmentManagerState[var1];
         case 4:
            return new FragmentState[var1];
         default:
            return new FragmentTabHost$SavedState[var1];
      }
   }
}
