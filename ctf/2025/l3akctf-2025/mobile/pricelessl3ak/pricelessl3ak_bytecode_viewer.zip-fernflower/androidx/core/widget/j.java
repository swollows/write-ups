package androidx.core.widget;

import android.content.ClipData;
import android.content.Context;
import android.text.Editable;
import android.text.Selection;
import android.text.Spanned;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public final class j {
   public static D.h a(View var0, D.h var1) {
      if (Log.isLoggable("ReceiveContent", 3)) {
         StringBuilder var7 = new StringBuilder("onReceive: ");
         var7.append(var1);
         Log.d("ReceiveContent", var7.toString());
      }

      if (var1.a.g() == 2) {
         return var1;
      } else {
         D.g var13 = var1.a;
         ClipData var17 = var13.h();
         int var5 = var13.n();
         TextView var10 = (TextView)var0;
         Editable var8 = (Editable)var10.getText();
         Context var9 = var10.getContext();
         int var2 = 0;

         boolean var4;
         for(boolean var3 = false; var2 < var17.getItemCount(); var3 = var4) {
            ClipData.Item var11 = var17.getItemAt(var2);
            Object var12;
            if ((var5 & 1) != 0) {
               CharSequence var14 = var11.coerceToText(var9);
               var12 = var14;
               if (var14 instanceof Spanned) {
                  var12 = var14.toString();
               }
            } else {
               var12 = var11.coerceToStyledText(var9);
            }

            var4 = var3;
            if (var12 != null) {
               if (!var3) {
                  int var6 = Selection.getSelectionStart(var8);
                  int var16 = Selection.getSelectionEnd(var8);
                  int var15 = Math.max(0, Math.min(var6, var16));
                  var16 = Math.max(0, Math.max(var6, var16));
                  Selection.setSelection(var8, var16);
                  var8.replace(var15, var16, (CharSequence)var12);
                  var4 = true;
               } else {
                  var8.insert(Selection.getSelectionEnd(var8), "\n");
                  var8.insert(Selection.getSelectionEnd(var8), (CharSequence)var12);
                  var4 = var3;
               }
            }

            ++var2;
         }

         return null;
      }
   }
}
