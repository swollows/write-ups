package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;

final class FragmentManagerState implements Parcelable {
   public static final Parcelable.Creator CREATOR = new b(3);
   public ArrayList a;
   public ArrayList b;
   public BackStackRecordState[] c;
   public int d;
   public final String e = null;
   public final ArrayList f = new ArrayList();
   public final ArrayList g = new ArrayList();
   public ArrayList h;

   public FragmentManagerState() {
   }

   public FragmentManagerState(Parcel var1) {
      this.a = var1.createStringArrayList();
      this.b = var1.createStringArrayList();
      this.c = (BackStackRecordState[])var1.createTypedArray(BackStackRecordState.CREATOR);
      this.d = var1.readInt();
      this.e = var1.readString();
      this.f = var1.createStringArrayList();
      this.g = var1.createTypedArrayList(BackStackState.CREATOR);
      this.h = var1.createTypedArrayList(FragmentManager$LaunchedFragmentInfo.CREATOR);
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeStringList(this.a);
      var1.writeStringList(this.b);
      var1.writeTypedArray(this.c, var2);
      var1.writeInt(this.d);
      var1.writeString(this.e);
      var1.writeStringList(this.f);
      var1.writeTypedList(this.g);
      var1.writeTypedList(this.h);
   }
}
