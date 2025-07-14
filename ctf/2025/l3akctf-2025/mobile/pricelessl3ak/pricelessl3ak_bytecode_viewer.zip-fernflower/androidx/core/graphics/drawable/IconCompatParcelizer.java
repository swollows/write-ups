package androidx.core.graphics.drawable;

import V.b;
import V.c;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff.Mode;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.Charset;

public class IconCompatParcelizer {
   public static IconCompat read(b var0) {
      IconCompat var3 = new IconCompat();
      int var1 = var3.a;
      if (var0.e(1)) {
         var1 = ((c)var0).e.readInt();
      }

      var3.a = var1;
      byte[] var2 = var3.c;
      if (var0.e(2)) {
         Parcel var4 = ((c)var0).e;
         var1 = var4.readInt();
         if (var1 < 0) {
            var2 = null;
         } else {
            var2 = new byte[var1];
            var4.readByteArray(var2);
         }
      }

      var3.c = var2;
      var3.d = var0.f(var3.d, 3);
      var1 = var3.e;
      if (var0.e(4)) {
         var1 = ((c)var0).e.readInt();
      }

      var3.e = var1;
      var1 = var3.f;
      if (var0.e(5)) {
         var1 = ((c)var0).e.readInt();
      }

      var3.f = var1;
      var3.g = (ColorStateList)var0.f(var3.g, 6);
      String var8 = var3.i;
      if (var0.e(7)) {
         var8 = ((c)var0).e.readString();
      }

      var3.i = var8;
      var8 = var3.j;
      String var5;
      if (!var0.e(8)) {
         var5 = var8;
      } else {
         var5 = ((c)var0).e.readString();
      }

      var3.j = var5;
      var3.h = Mode.valueOf(var3.i);
      Parcelable var6;
      switch (var3.a) {
         case -1:
            var6 = var3.d;
            if (var6 == null) {
               throw new IllegalArgumentException("Invalid icon");
            }

            var3.b = var6;
         case 0:
         default:
            break;
         case 1:
         case 5:
            var6 = var3.d;
            if (var6 != null) {
               var3.b = var6;
            } else {
               byte[] var7 = var3.c;
               var3.b = var7;
               var3.a = 3;
               var3.e = 0;
               var3.f = var7.length;
            }
            break;
         case 2:
         case 4:
         case 6:
            var5 = new String(var3.c, Charset.forName("UTF-16"));
            var3.b = var5;
            if (var3.a == 2 && var3.j == null) {
               var3.j = var5.split(":", -1)[0];
            }
            break;
         case 3:
            var3.b = var3.c;
      }

      return var3;
   }

   public static void write(IconCompat var0, b var1) {
      var1.getClass();
      var0.i = var0.h.name();
      switch (var0.a) {
         case -1:
            var0.d = (Parcelable)var0.b;
         case 0:
         default:
            break;
         case 1:
         case 5:
            var0.d = (Parcelable)var0.b;
            break;
         case 2:
            var0.c = ((String)var0.b).getBytes(Charset.forName("UTF-16"));
            break;
         case 3:
            var0.c = (byte[])var0.b;
            break;
         case 4:
         case 6:
            var0.c = var0.b.toString().getBytes(Charset.forName("UTF-16"));
      }

      int var2 = var0.a;
      if (-1 != var2) {
         var1.h(1);
         ((c)var1).e.writeInt(var2);
      }

      byte[] var3 = var0.c;
      if (var3 != null) {
         var1.h(2);
         c var4 = (c)var1;
         var2 = var3.length;
         Parcel var9 = var4.e;
         var9.writeInt(var2);
         var9.writeByteArray(var3);
      }

      Parcelable var6 = var0.d;
      if (var6 != null) {
         var1.h(3);
         ((c)var1).e.writeParcelable(var6, 0);
      }

      var2 = var0.e;
      if (var2 != 0) {
         var1.h(4);
         ((c)var1).e.writeInt(var2);
      }

      var2 = var0.f;
      if (var2 != 0) {
         var1.h(5);
         ((c)var1).e.writeInt(var2);
      }

      ColorStateList var7 = var0.g;
      if (var7 != null) {
         var1.h(6);
         ((c)var1).e.writeParcelable(var7, 0);
      }

      String var8 = var0.i;
      if (var8 != null) {
         var1.h(7);
         ((c)var1).e.writeString(var8);
      }

      String var5 = var0.j;
      if (var5 != null) {
         var1.h(8);
         ((c)var1).e.writeString(var5);
      }

   }
}
