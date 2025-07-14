package androidx.fragment.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

final class BackStackRecordState implements Parcelable {
   public static final Parcelable.Creator CREATOR = new b(0);
   public final int[] a;
   public final ArrayList b;
   public final int[] c;
   public final int[] d;
   public final int e;
   public final String f;
   public final int g;
   public final int h;
   public final CharSequence i;
   public final int j;
   public final CharSequence k;
   public final ArrayList l;
   public final ArrayList m;
   public final boolean n;

   public BackStackRecordState(Parcel var1) {
      this.a = var1.createIntArray();
      this.b = var1.createStringArrayList();
      this.c = var1.createIntArray();
      this.d = var1.createIntArray();
      this.e = var1.readInt();
      this.f = var1.readString();
      this.g = var1.readInt();
      this.h = var1.readInt();
      Parcelable.Creator var3 = TextUtils.CHAR_SEQUENCE_CREATOR;
      this.i = (CharSequence)var3.createFromParcel(var1);
      this.j = var1.readInt();
      this.k = (CharSequence)var3.createFromParcel(var1);
      this.l = var1.createStringArrayList();
      this.m = var1.createStringArrayList();
      boolean var2;
      if (var1.readInt() != 0) {
         var2 = true;
      } else {
         var2 = false;
      }

      this.n = var2;
   }

   public BackStackRecordState(a var1) {
      int var5 = var1.a.size();
      this.a = new int[var5 * 6];
      if (!var1.g) {
         throw new IllegalStateException("Not on back stack");
      } else {
         this.b = new ArrayList(var5);
         this.c = new int[var5];
         this.d = new int[var5];
         int var3 = 0;
         int var2 = 0;

         while(true) {
            int var4 = var2;
            if (var3 >= var5) {
               this.e = var1.f;
               this.f = var1.h;
               this.g = var1.q;
               this.h = var1.i;
               this.i = var1.j;
               this.j = var1.k;
               this.k = var1.l;
               this.l = var1.m;
               this.m = var1.n;
               this.n = var1.o;
               return;
            }

            y var7 = (y)var1.a.get(var3);
            this.a[var2] = var7.a;
            this.b.add((Object)null);
            int[] var6 = this.a;
            var6[var2 + 1] = var7.b;
            var6[var2 + 2] = var7.c;
            var6[var2 + 3] = var7.d;
            var6[var2 + 4] = var7.e;
            var2 += 6;
            var6[var4 + 5] = var7.f;
            this.c[var3] = var7.g.ordinal();
            this.d[var3] = var7.h.ordinal();
            ++var3;
         }
      }
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeIntArray(this.a);
      var1.writeStringList(this.b);
      var1.writeIntArray(this.c);
      var1.writeIntArray(this.d);
      var1.writeInt(this.e);
      var1.writeString(this.f);
      var1.writeInt(this.g);
      var1.writeInt(this.h);
      TextUtils.writeToParcel(this.i, var1, 0);
      var1.writeInt(this.j);
      TextUtils.writeToParcel(this.k, var1, 0);
      var1.writeStringList(this.l);
      var1.writeStringList(this.m);
      var1.writeInt(this.n);
   }
}
