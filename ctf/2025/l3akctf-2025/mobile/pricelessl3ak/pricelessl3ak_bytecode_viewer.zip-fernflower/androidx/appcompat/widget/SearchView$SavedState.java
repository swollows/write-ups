package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

class SearchView$SavedState extends AbsSavedState {
   public static final Parcelable.Creator CREATOR = new Object();
   public final boolean c;

   public SearchView$SavedState(Parcel var1, ClassLoader var2) {
      super(var1, var2);
      this.c = (Boolean)var1.readValue((ClassLoader)null);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder("SearchView.SavedState{");
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      var1.append(" isIconified=");
      var1.append(this.c);
      var1.append("}");
      return var1.toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeValue(this.c);
   }
}
