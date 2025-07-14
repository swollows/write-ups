package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import o.d;
import o.h;
import q.e;
import q.f;

public final class ParcelableSnapshotMutableIntState extends e implements Parcelable {
   public static final Parcelable.Creator CREATOR = new d(2);
   public h a;

   public int describeContents() {
      return 0;
   }

   public final f o() {
      return this.a;
   }

   public final String toString() {
      h var2 = (h)q.d.a(this.a);
      StringBuilder var1 = new StringBuilder("MutableIntState(value=");
      var1.append(var2.b);
      var1.append(")@");
      var1.append(this.hashCode());
      return var1.toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeInt(((h)q.d.d(this.a, this)).b);
   }
}
