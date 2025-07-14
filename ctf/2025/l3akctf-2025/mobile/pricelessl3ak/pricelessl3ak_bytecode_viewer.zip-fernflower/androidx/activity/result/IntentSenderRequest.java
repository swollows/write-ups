package androidx.activity.result;

import V.a;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import i0.d;

public final class IntentSenderRequest implements Parcelable {
   public static final Parcelable.Creator CREATOR = new a(9);
   public final IntentSender a;
   public final Intent b;
   public final int c;
   public final int d;

   public IntentSenderRequest(Parcel var1) {
      i0.d.e(var1, "parcel");
      Parcelable var4 = var1.readParcelable(IntentSender.class.getClassLoader());
      i0.d.b(var4);
      IntentSender var6 = (IntentSender)var4;
      Intent var5 = (Intent)var1.readParcelable(Intent.class.getClassLoader());
      int var3 = var1.readInt();
      int var2 = var1.readInt();
      super();
      this.a = var6;
      this.b = var5;
      this.c = var3;
      this.d = var2;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      i0.d.e(var1, "dest");
      var1.writeParcelable(this.a, var2);
      var1.writeParcelable(this.b, var2);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
   }
}
