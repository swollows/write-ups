package androidx.appcompat.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;

class AppCompatSpinner$SavedState extends View.BaseSavedState {
   public static final Parcelable.Creator CREATOR = new l(1);
   public boolean a;

   public AppCompatSpinner$SavedState(Parcel var1) {
      super(var1);
      boolean var2;
      if (var1.readByte() != 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.a = var2;
   }

   public void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeByte((byte)this.a);
   }
}
