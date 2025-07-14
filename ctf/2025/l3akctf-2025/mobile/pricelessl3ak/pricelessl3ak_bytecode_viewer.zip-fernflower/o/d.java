package o;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.ParcelableSnapshotMutableDoubleState;
import androidx.compose.runtime.ParcelableSnapshotMutableFloatState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ParcelableSnapshotMutableLongState;

public final class d implements Parcelable.Creator {
   public final int a;

   // $FF: synthetic method
   public d(int var1) {
      this.a = var1;
   }

   public final Object createFromParcel(Parcel var1) {
      q.e var8;
      q.f var9;
      switch (this.a) {
         case 0:
            double var2 = var1.readDouble();
            var8 = new q.e(0);
            var9 = new q.f();
            var9.b = var2;
            q.d.a.u();
            var8.a = var9;
            return var8;
         case 1:
            float var4 = var1.readFloat();
            var8 = new q.e(0);
            var9 = new q.f();
            var9.b = var4;
            q.d.a.u();
            var8.a = var9;
            return var8;
         case 2:
            int var5 = var1.readInt();
            var8 = new q.e(0);
            var9 = new q.f();
            var9.b = var5;
            q.d.a.u();
            var8.a = var9;
            return var8;
         default:
            long var6 = var1.readLong();
            q.e var10 = new q.e(0);
            q.f var11 = new q.f();
            var11.b = var6;
            q.d.a.u();
            var10.a = var11;
            return var10;
      }
   }

   public final Object[] newArray(int var1) {
      switch (this.a) {
         case 0:
            return new ParcelableSnapshotMutableDoubleState[var1];
         case 1:
            return new ParcelableSnapshotMutableFloatState[var1];
         case 2:
            return new ParcelableSnapshotMutableIntState[var1];
         default:
            return new ParcelableSnapshotMutableLongState[var1];
      }
   }
}
