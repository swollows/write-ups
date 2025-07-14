package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import o.d;
import o.g;
import q.e;
import q.f;

public final class ParcelableSnapshotMutableFloatState extends e implements Parcelable {
   public static final Parcelable.Creator CREATOR = new d(1);
   public g a;

   public int describeContents() {
      return 0;
   }

   public final f o() {
      return this.a;
   }

   public final String toString() {
      g var1 = (g)q.d.a(this.a);
      StringBuilder var2 = new StringBuilder("MutableFloatState(value=");
      var2.append(var1.b);
      var2.append(")@");
      var2.append(this.hashCode());
      return var2.toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeFloat(((g)q.d.d(this.a, this)).b);
   }
}
