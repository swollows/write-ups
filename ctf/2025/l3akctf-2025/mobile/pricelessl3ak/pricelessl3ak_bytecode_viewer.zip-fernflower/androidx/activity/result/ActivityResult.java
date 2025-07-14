package androidx.activity.result;

import V.a;
import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import i0.d;

public final class ActivityResult implements Parcelable {
   public static final Parcelable.Creator CREATOR = new a(8);
   public final int a;
   public final Intent b;

   public ActivityResult(Intent var1, int var2) {
      this.a = var2;
      this.b = var1;
   }

   public ActivityResult(Parcel var1) {
      d.e(var1, "parcel");
      int var2 = var1.readInt();
      Intent var3;
      if (var1.readInt() == 0) {
         var3 = null;
      } else {
         var3 = (Intent)Intent.CREATOR.createFromParcel(var1);
      }

      this(var3, var2);
   }

   public int describeContents() {
      return 0;
   }

   public final String toString() {
      StringBuilder var3 = new StringBuilder("ActivityResult{resultCode=");
      int var1 = this.a;
      String var2;
      if (var1 != -1) {
         if (var1 != 0) {
            var2 = String.valueOf(var1);
         } else {
            var2 = "RESULT_CANCELED";
         }
      } else {
         var2 = "RESULT_OK";
      }

      var3.append(var2);
      var3.append(", data=");
      var3.append(this.b);
      var3.append('}');
      return var3.toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      d.e(var1, "dest");
      var1.writeInt(this.a);
      Intent var4 = this.b;
      byte var3;
      if (var4 == null) {
         var3 = 0;
      } else {
         var3 = 1;
      }

      var1.writeInt(var3);
      if (var4 != null) {
         var4.writeToParcel(var1, var2);
      }

   }
}
