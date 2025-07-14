package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;

class ActionMenuPresenter$SavedState implements Parcelable {
   public static final Parcelable.Creator CREATOR = new l(0);
   public final int a;

   public ActionMenuPresenter$SavedState() {
   }

   public ActionMenuPresenter$SavedState(Parcel var1) {
      this.a = var1.readInt();
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeInt(this.a);
   }
}
