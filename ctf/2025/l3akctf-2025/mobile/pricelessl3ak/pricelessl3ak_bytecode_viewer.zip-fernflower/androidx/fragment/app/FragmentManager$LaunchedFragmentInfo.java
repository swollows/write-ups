package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;

class FragmentManager$LaunchedFragmentInfo implements Parcelable {
   public static final Parcelable.Creator CREATOR = new b(2);
   public final String a;
   public final int b;

   public FragmentManager$LaunchedFragmentInfo(Parcel var1) {
      this.a = var1.readString();
      this.b = var1.readInt();
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeString(this.a);
      var1.writeInt(this.b);
   }
}
