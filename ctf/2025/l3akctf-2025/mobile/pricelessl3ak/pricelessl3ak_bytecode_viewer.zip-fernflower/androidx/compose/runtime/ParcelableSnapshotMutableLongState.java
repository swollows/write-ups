package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import o.d;
import o.i;
import q.e;
import q.f;

public final class ParcelableSnapshotMutableLongState extends e implements Parcelable {
   public static final Parcelable.Creator CREATOR = new d(3);
   public i a;

   public int describeContents() {
      return 0;
   }

   public final f o() {
      return this.a;
   }

   public final String toString() {
      i var1 = (i)q.d.a(this.a);
      StringBuilder var2 = new StringBuilder("MutableLongState(value=");
      var2.append(var1.b);
      var2.append(")@");
      var2.append(this.hashCode());
      return var2.toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeLong(((i)q.d.d(this.a, this)).b);
   }
}
