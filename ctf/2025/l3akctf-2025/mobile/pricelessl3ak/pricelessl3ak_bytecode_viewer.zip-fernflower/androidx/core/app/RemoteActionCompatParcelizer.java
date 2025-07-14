package androidx.core.app;

import V.b;
import V.c;
import android.app.PendingIntent;
import android.os.Parcel;
import android.text.TextUtils;
import androidx.core.graphics.drawable.IconCompat;

public class RemoteActionCompatParcelizer {
   public static RemoteActionCompat read(b var0) {
      RemoteActionCompat var4 = new RemoteActionCompat();
      Object var3 = var4.a;
      boolean var2 = true;
      if (var0.e(1)) {
         var3 = var0.g();
      }

      var4.a = (IconCompat)var3;
      CharSequence var5 = var4.b;
      c var6;
      if (var0.e(2)) {
         var6 = (c)var0;
         var5 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(var6.e);
      }

      var4.b = var5;
      var5 = var4.c;
      if (var0.e(3)) {
         var6 = (c)var0;
         var5 = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(var6.e);
      }

      var4.c = var5;
      var4.d = (PendingIntent)var0.f(var4.d, 4);
      boolean var1 = var4.e;
      if (var0.e(5)) {
         if (((c)var0).e.readInt() != 0) {
            var1 = true;
         } else {
            var1 = false;
         }
      }

      var4.e = var1;
      var1 = var4.f;
      if (var0.e(6)) {
         if (((c)var0).e.readInt() != 0) {
            var1 = var2;
         } else {
            var1 = false;
         }
      }

      var4.f = var1;
      return var4;
   }

   public static void write(RemoteActionCompat var0, b var1) {
      var1.getClass();
      IconCompat var3 = var0.a;
      var1.h(1);
      var1.i(var3);
      CharSequence var4 = var0.b;
      var1.h(2);
      Parcel var5 = ((c)var1).e;
      TextUtils.writeToParcel(var4, var5, 0);
      var4 = var0.c;
      var1.h(3);
      TextUtils.writeToParcel(var4, var5, 0);
      PendingIntent var6 = var0.d;
      var1.h(4);
      var5.writeParcelable(var6, 0);
      byte var2 = var0.e;
      var1.h(5);
      var5.writeInt(var2);
      var2 = var0.f;
      var1.h(6);
      var5.writeInt(var2);
   }
}
