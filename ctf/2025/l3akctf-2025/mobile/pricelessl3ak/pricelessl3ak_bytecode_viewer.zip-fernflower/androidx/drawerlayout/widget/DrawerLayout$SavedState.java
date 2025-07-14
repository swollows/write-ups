package androidx.drawerlayout.widget;

import G.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

public class DrawerLayout$SavedState extends AbsSavedState {
   public static final Parcelable.Creator CREATOR = new a(0);
   public final int c = 0;
   public final int d;
   public final int e;
   public final int f;
   public final int g;

   public DrawerLayout$SavedState(Parcel var1, ClassLoader var2) {
      super(var1, var2);
      this.c = var1.readInt();
      this.d = var1.readInt();
      this.e = var1.readInt();
      this.f = var1.readInt();
      this.g = var1.readInt();
   }

   public void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeInt(this.c);
      var1.writeInt(this.d);
      var1.writeInt(this.e);
      var1.writeInt(this.f);
      var1.writeInt(this.g);
   }
}
