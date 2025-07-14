package androidx.customview.view;

import G.a;
import android.os.Parcel;
import android.os.Parcelable;

public abstract class AbsSavedState implements Parcelable {
   public static final Parcelable.Creator CREATOR = new a(2);
   public static final AbsSavedState b = new AbsSavedState() {
   };
   public final Parcelable a;

   private AbsSavedState() {
      this.a = null;
   }

   // $FF: synthetic method
   public AbsSavedState(int var1) {
      this();
   }

   public AbsSavedState(Parcel var1) {
      this(var1, (ClassLoader)null);
   }

   public AbsSavedState(Parcel var1, ClassLoader var2) {
      Object var3 = var1.readParcelable(var2);
      if (var3 == null) {
         var3 = b;
      }

      this.a = (Parcelable)var3;
   }

   public AbsSavedState(Parcelable var1) {
      if (var1 != null) {
         if (var1 == b) {
            var1 = null;
         }

         this.a = var1;
      } else {
         throw new IllegalArgumentException("superState must not be null");
      }
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeParcelable(this.a, var2);
   }
}
