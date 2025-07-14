package H;

import android.os.Build.VERSION;
import android.text.Editable;
import android.text.SpanWatcher;
import android.text.Spannable;
import android.text.TextWatcher;
import java.util.concurrent.atomic.AtomicInteger;

public final class x implements TextWatcher, SpanWatcher {
   public final Object a;
   public final AtomicInteger b = new AtomicInteger(0);

   public x(Object var1) {
      this.a = var1;
   }

   public final void afterTextChanged(Editable var1) {
      ((TextWatcher)this.a).afterTextChanged(var1);
   }

   public final void beforeTextChanged(CharSequence var1, int var2, int var3, int var4) {
      ((TextWatcher)this.a).beforeTextChanged(var1, var2, var3, var4);
   }

   public final void onSpanAdded(Spannable var1, Object var2, int var3, int var4) {
      if (this.b.get() <= 0 || !(var2 instanceof A)) {
         ((SpanWatcher)this.a).onSpanAdded(var1, var2, var3, var4);
      }
   }

   public final void onSpanChanged(Spannable var1, Object var2, int var3, int var4, int var5, int var6) {
      if (this.b.get() <= 0 || !(var2 instanceof A)) {
         int var8;
         label21: {
            var8 = var3;
            if (VERSION.SDK_INT < 28) {
               int var7 = var3;
               if (var3 > var4) {
                  var7 = 0;
               }

               var8 = var7;
               if (var5 > var6) {
                  var3 = 0;
                  var8 = var7;
                  break label21;
               }
            }

            var3 = var5;
         }

         ((SpanWatcher)this.a).onSpanChanged(var1, var2, var8, var4, var3, var6);
      }
   }

   public final void onSpanRemoved(Spannable var1, Object var2, int var3, int var4) {
      if (this.b.get() <= 0 || !(var2 instanceof A)) {
         ((SpanWatcher)this.a).onSpanRemoved(var1, var2, var3, var4);
      }
   }

   public final void onTextChanged(CharSequence var1, int var2, int var3, int var4) {
      ((TextWatcher)this.a).onTextChanged(var1, var2, var3, var4);
   }
}
