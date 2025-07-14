package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

class BackStackState implements Parcelable {
   public static final Parcelable.Creator CREATOR = new b(1);
   public final ArrayList a;
   public final ArrayList b;

   public BackStackState(Parcel var1) {
      this.a = var1.createStringArrayList();
      this.b = var1.createTypedArrayList(BackStackRecordState.CREATOR);
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeStringList(this.a);
      var1.writeTypedList(this.b);
   }
}
