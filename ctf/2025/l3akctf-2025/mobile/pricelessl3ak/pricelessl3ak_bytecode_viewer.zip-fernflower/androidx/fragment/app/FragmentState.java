package androidx.fragment.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

final class FragmentState implements Parcelable {
   public static final Parcelable.Creator CREATOR = new b(4);
   public final String a;
   public final String b;
   public final boolean c;
   public final int d;
   public final int e;
   public final String f;
   public final boolean g;
   public final boolean h;
   public final boolean i;
   public final Bundle j;
   public final boolean k;
   public final int l;
   public final Bundle m;

   public FragmentState(Parcel var1) {
      this.a = var1.readString();
      this.b = var1.readString();
      int var2 = var1.readInt();
      boolean var4 = false;
      boolean var3;
      if (var2 != 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      this.c = var3;
      this.d = var1.readInt();
      this.e = var1.readInt();
      this.f = var1.readString();
      if (var1.readInt() != 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      this.g = var3;
      if (var1.readInt() != 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      this.h = var3;
      if (var1.readInt() != 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      this.i = var3;
      this.j = var1.readBundle();
      var3 = var4;
      if (var1.readInt() != 0) {
         var3 = true;
      }

      this.k = var3;
      this.m = var1.readBundle();
      this.l = var1.readInt();
   }

   public int describeContents() {
      return 0;
   }

   public final String toString() {
      StringBuilder var3 = new StringBuilder(128);
      var3.append("FragmentState{");
      var3.append(this.a);
      var3.append(" (");
      var3.append(this.b);
      var3.append(")}:");
      if (this.c) {
         var3.append(" fromLayout");
      }

      int var1 = this.e;
      if (var1 != 0) {
         var3.append(" id=0x");
         var3.append(Integer.toHexString(var1));
      }

      String var2 = this.f;
      if (var2 != null && !var2.isEmpty()) {
         var3.append(" tag=");
         var3.append(var2);
      }

      if (this.g) {
         var3.append(" retainInstance");
      }

      if (this.h) {
         var3.append(" removing");
      }

      if (this.i) {
         var3.append(" detached");
      }

      if (this.k) {
         var3.append(" hidden");
      }

      return var3.toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeString(this.a);
      var1.writeString(this.b);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeInt(this.e);
      var1.writeString(this.f);
      var1.writeInt(this.g);
      var1.writeInt(this.h);
      var1.writeInt(this.i);
      var1.writeBundle(this.j);
      var1.writeInt(this.k);
      var1.writeBundle(this.m);
      var1.writeInt(this.l);
   }
}
