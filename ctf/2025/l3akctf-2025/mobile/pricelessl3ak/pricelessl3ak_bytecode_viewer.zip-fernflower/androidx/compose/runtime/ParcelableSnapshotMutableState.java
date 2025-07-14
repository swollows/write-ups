package androidx.compose.runtime;

import android.os.Parcel;
import android.os.Parcelable;
import o.c;
import o.j;
import o.k;
import q.d;
import q.e;
import q.f;

public final class ParcelableSnapshotMutableState extends e implements Parcelable {
   public static final Parcelable.Creator CREATOR = new Object();
   public final k a;
   public final j b;

   public ParcelableSnapshotMutableState(Object var1, k var2) {
      super(0);
      this.a = var2;
      f var3 = new f();
      var3.b = var1;
      d.a.u();
      this.b = var3;
   }

   public int describeContents() {
      return 0;
   }

   public final f o() {
      return this.b;
   }

   public final String toString() {
      j var2 = (j)d.a(this.b);
      StringBuilder var1 = new StringBuilder("MutableState(value=");
      var1.append(var2.b);
      var1.append(")@");
      var1.append(this.hashCode());
      return var1.toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeValue(((j)d.d(this.b, this)).b);
      c var4 = c.b;
      k var3 = this.a;
      byte var5;
      if (i0.d.a(var3, var4)) {
         var5 = 0;
      } else if (i0.d.a(var3, c.d)) {
         var5 = 1;
      } else {
         if (!i0.d.a(var3, c.c)) {
            throw new IllegalStateException("Only known types of MutableState's SnapshotMutationPolicy are supported");
         }

         var5 = 2;
      }

      var1.writeInt(var5);
   }
}
