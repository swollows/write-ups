package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

class FragmentTabHost$SavedState extends View.BaseSavedState {
   public static final Parcelable.Creator CREATOR = new b(5);
   public final String a;

   public FragmentTabHost$SavedState(Parcel var1) {
      super(var1);
      this.a = var1.readString();
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder("FragmentTabHost.SavedState{");
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      var1.append(" curTab=");
      var1.append(this.a);
      var1.append("}");
      return var1.toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeString(this.a);
   }
}
