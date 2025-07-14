package F;

import android.content.ClipDescription;
import android.net.Uri;
import android.os.Bundle;
import android.os.ResultReceiver;
import android.text.TextUtils;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputConnectionWrapper;

public final class f extends InputConnectionWrapper {
   public final d a;

   public f(InputConnection var1, d var2) {
      super(var1, false);
      this.a = var2;
   }

   public final boolean performPrivateCommand(String var1, Bundle var2) {
      d var8 = this.a;
      int var4 = 0;
      byte var5 = 0;
      if (var2 != null) {
         boolean var3;
         if (TextUtils.equals("androidx.core.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", var1)) {
            var3 = false;
         } else {
            if (!TextUtils.equals("android.support.v13.view.inputmethod.InputConnectionCompat.COMMIT_CONTENT", var1)) {
               return var4 != 0 ? true : super.performPrivateCommand(var1, var2);
            }

            var3 = true;
         }

         String var6;
         if (var3) {
            var6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
         } else {
            var6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_RESULT_RECEIVER";
         }

         ResultReceiver var7;
         try {
            var7 = (ResultReceiver)var2.getParcelable(var6);
         } finally {
            ;
         }

         if (var3) {
            var6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_URI";
         } else {
            var6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_URI";
         }

         byte var70;
         label873: {
            Throwable var10000;
            label874: {
               Uri var9;
               boolean var10001;
               try {
                  var9 = (Uri)var2.getParcelable(var6);
               } catch (Throwable var68) {
                  var10000 = var68;
                  var10001 = false;
                  break label874;
               }

               if (var3) {
                  var6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
               } else {
                  var6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_DESCRIPTION";
               }

               ClipDescription var10;
               try {
                  var10 = (ClipDescription)var2.getParcelable(var6);
               } catch (Throwable var67) {
                  var10000 = var67;
                  var10001 = false;
                  break label874;
               }

               if (var3) {
                  var6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
               } else {
                  var6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_LINK_URI";
               }

               Uri var11;
               try {
                  var11 = (Uri)var2.getParcelable(var6);
               } catch (Throwable var66) {
                  var10000 = var66;
                  var10001 = false;
                  break label874;
               }

               if (var3) {
                  var6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
               } else {
                  var6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_FLAGS";
               }

               try {
                  var4 = var2.getInt(var6);
               } catch (Throwable var65) {
                  var10000 = var65;
                  var10001 = false;
                  break label874;
               }

               if (var3) {
                  var6 = "android.support.v13.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
               } else {
                  var6 = "androidx.core.view.inputmethod.InputConnectionCompat.CONTENT_OPTS";
               }

               Bundle var12;
               try {
                  var12 = (Bundle)var2.getParcelable(var6);
               } catch (Throwable var64) {
                  var10000 = var64;
                  var10001 = false;
                  break label874;
               }

               var70 = var5;
               if (var9 == null) {
                  break label873;
               }

               var70 = var5;
               if (var10 == null) {
                  break label873;
               }

               label846:
               try {
                  D.d var71 = new D.d(var9, var10, var11);
                  var70 = var8.a(var71, var4, var12);
                  break label873;
               } catch (Throwable var63) {
                  var10000 = var63;
                  var10001 = false;
                  break label846;
               }
            }

            Throwable var69 = var10000;
            if (var7 != null) {
               var7.send(0, (Bundle)null);
            }

            throw var69;
         }

         var4 = var70;
         if (var7 != null) {
            var7.send(var70, (Bundle)null);
            var4 = var70;
         }
      }

      return var4 != 0 ? true : super.performPrivateCommand(var1, var2);
   }
}
