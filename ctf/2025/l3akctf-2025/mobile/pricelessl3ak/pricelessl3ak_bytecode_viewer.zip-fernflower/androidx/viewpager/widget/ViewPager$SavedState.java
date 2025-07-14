package androidx.viewpager.widget;

import G.a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.customview.view.AbsSavedState;

public class ViewPager$SavedState extends AbsSavedState {
   public static final Parcelable.Creator CREATOR = new a(1);
   public final int c;
   public final Parcelable d;

   public ViewPager$SavedState(Parcel var1, ClassLoader var2) {
      super(var1, var2);
      ClassLoader var3 = var2;
      if (var2 == null) {
         var3 = this.getClass().getClassLoader();
      }

      this.c = var1.readInt();
      this.d = var1.readParcelable(var3);
   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder("FragmentPager.SavedState{");
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      var1.append(" position=");
      var1.append(this.c);
      var1.append("}");
      return var1.toString();
   }

   public void writeToParcel(Parcel var1, int var2) {
      super.writeToParcel(var1, var2);
      var1.writeInt(this.c);
      var1.writeParcelable(this.d, var2);
   }
}
