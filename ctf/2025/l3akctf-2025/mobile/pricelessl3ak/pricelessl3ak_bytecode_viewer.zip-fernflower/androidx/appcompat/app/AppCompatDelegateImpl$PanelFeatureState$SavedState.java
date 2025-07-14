package androidx.appcompat.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

class AppCompatDelegateImpl$PanelFeatureState$SavedState implements Parcelable {
   public static final Parcelable.Creator CREATOR = new Object();
   public int a;
   public boolean b;
   public Bundle c;

   public AppCompatDelegateImpl$PanelFeatureState$SavedState() {
   }

   public static AppCompatDelegateImpl$PanelFeatureState$SavedState a(Parcel var0, ClassLoader var1) {
      AppCompatDelegateImpl$PanelFeatureState$SavedState var4 = new AppCompatDelegateImpl$PanelFeatureState$SavedState();
      var4.a = var0.readInt();
      int var2 = var0.readInt();
      boolean var3 = true;
      if (var2 != 1) {
         var3 = false;
      }

      var4.b = var3;
      if (var3) {
         var4.c = var0.readBundle(var1);
      }

      return var4;
   }

   public int describeContents() {
      return 0;
   }

   public void writeToParcel(Parcel var1, int var2) {
      var1.writeInt(this.a);
      var1.writeInt(this.b);
      if (this.b) {
         var1.writeBundle(this.c);
      }

   }
}
