package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import o.d;
import o.f;
import q.e;

public final class ParcelableSnapshotMutableDoubleState extends e implements Parcelable {
   public static final Parcelable.Creator CREATOR = new d(0);
   public f a;

   public int describeContents() {
      return 0;
   }

   public final q.f o() {
      return this.a;
   }

   public final String toString() {
      f var1 = (f)q.d.a(this.a);
      StringBuilder var2 = new StringBuilder("MutableDoubleState(value=");
      var2.append(var1.b);
      var2.append(")@");
      var2.append(this.hashCode());
      return var2.toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeDouble(((f)q.d.d(this.a, this)).b);
   }
}
