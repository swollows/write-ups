package androidx.core.graphics.drawable;

import D.U;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.PorterDuff.Mode;
import android.os.Parcelable;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.versionedparcelable.CustomVersionedParcelable;
import java.lang.reflect.InvocationTargetException;

public class IconCompat extends CustomVersionedParcelable {
   public static final PorterDuff.Mode k;
   public int a = -1;
   public Object b;
   public byte[] c = null;
   public Parcelable d = null;
   public int e = 0;
   public int f = 0;
   public ColorStateList g = null;
   public PorterDuff.Mode h;
   public String i;
   public String j;

   static {
      k = Mode.SRC_IN;
   }

   public IconCompat() {
      this.h = k;
      this.i = null;
   }

   public final String toString() {
      if (this.a == -1) {
         return String.valueOf(this.b);
      } else {
         StringBuilder var4 = new StringBuilder("Icon(typ=");
         String var3;
         switch (this.a) {
            case 1:
               var3 = "BITMAP";
               break;
            case 2:
               var3 = "RESOURCE";
               break;
            case 3:
               var3 = "DATA";
               break;
            case 4:
               var3 = "URI";
               break;
            case 5:
               var3 = "BITMAP_MASKABLE";
               break;
            case 6:
               var3 = "URI_MASKABLE";
               break;
            default:
               var3 = "UNKNOWN";
         }

         var4.append(var3);
         switch (this.a) {
            case 1:
            case 5:
               var4.append(" size=");
               var4.append(((Bitmap)this.b).getWidth());
               var4.append("x");
               var4.append(((Bitmap)this.b).getHeight());
               break;
            case 2:
               var4.append(" pkg=");
               var4.append(this.j);
               var4.append(" id=");
               int var1 = this.a;
               if (var1 == -1) {
                  var1 = VERSION.SDK_INT;
                  Object var9 = this.b;
                  if (var1 >= 28) {
                     var1 = U.b(var9);
                  } else {
                     label74: {
                        var1 = 0;

                        int var2;
                        try {
                           var2 = (Integer)var9.getClass().getMethod("getResId", (Class[])null).invoke(var9, (Object[])null);
                        } catch (IllegalAccessException var5) {
                           Log.e("IconCompat", "Unable to get icon resource", var5);
                           break label74;
                        } catch (InvocationTargetException var6) {
                           Log.e("IconCompat", "Unable to get icon resource", var6);
                           break label74;
                        } catch (NoSuchMethodException var7) {
                           Log.e("IconCompat", "Unable to get icon resource", var7);
                           break label74;
                        }

                        var1 = var2;
                     }
                  }
               } else {
                  if (var1 != 2) {
                     StringBuilder var8 = new StringBuilder("called getResId() on ");
                     var8.append(this);
                     throw new IllegalStateException(var8.toString());
                  }

                  var1 = this.e;
               }

               var4.append(String.format("0x%08x", var1));
               break;
            case 3:
               var4.append(" len=");
               var4.append(this.e);
               if (this.f != 0) {
                  var4.append(" off=");
                  var4.append(this.f);
               }
               break;
            case 4:
            case 6:
               var4.append(" uri=");
               var4.append(this.b);
         }

         if (this.g != null) {
            var4.append(" tint=");
            var4.append(this.g);
         }

         if (this.h != k) {
            var4.append(" mode=");
            var4.append(this.h);
         }

         var4.append(")");
         return var4.toString();
      }
   }
}
