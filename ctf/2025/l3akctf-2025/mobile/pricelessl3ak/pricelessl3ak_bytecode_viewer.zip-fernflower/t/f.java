package t;

import D.l;
import android.app.Activity;
import android.os.Bundle;
import android.os.Build.VERSION;
import android.view.KeyEvent;
import android.view.View;
import androidx.lifecycle.C;
import androidx.lifecycle.E;
import androidx.lifecycle.o;
import androidx.lifecycle.p;
import androidx.lifecycle.u;
import androidx.lifecycle.w;

public abstract class f extends Activity implements u, l {
   private final m.k extraDataMap = new m.k(0);
   private final w lifecycleRegistry = new w(this);

   public boolean dispatchKeyEvent(KeyEvent var1) {
      i0.d.e(var1, "event");
      View var3 = this.getWindow().getDecorView();
      i0.d.d(var3, "window.decorView");
      boolean var2;
      if (C.b.j(var3, var1)) {
         var2 = true;
      } else {
         var2 = C.b.k(this, var3, this, var1);
      }

      return var2;
   }

   public boolean dispatchKeyShortcutEvent(KeyEvent var1) {
      i0.d.e(var1, "event");
      View var3 = this.getWindow().getDecorView();
      i0.d.d(var3, "window.decorView");
      boolean var2;
      if (C.b.j(var3, var1)) {
         var2 = true;
      } else {
         var2 = super.dispatchKeyShortcutEvent(var1);
      }

      return var2;
   }

   public e getExtraData(Class var1) {
      i0.d.e(var1, "extraDataClass");
      if (this.extraDataMap.get(var1) == null) {
         return null;
      } else {
         throw new ClassCastException();
      }
   }

   public p getLifecycle() {
      return this.lifecycleRegistry;
   }

   public void onCreate(Bundle var1) {
      super.onCreate(var1);
      int var2 = E.b;
      C.b(this);
   }

   public void onSaveInstanceState(Bundle var1) {
      i0.d.e(var1, "outState");
      w var3 = this.lifecycleRegistry;
      o var2 = o.c;
      var3.d("setCurrentState");
      var3.f(var2);
      super.onSaveInstanceState(var1);
   }

   public void putExtraData(e var1) {
      i0.d.e(var1, "extraData");
      throw null;
   }

   public final boolean shouldDumpInternalState(String[] var1) {
      boolean var3 = false;
      boolean var2 = var3;
      if (var1 != null) {
         if (var1.length == 0) {
            var2 = var3;
         } else {
            label46: {
               String var4 = var1[0];
               switch (var4.hashCode()) {
                  case -645125871:
                     if (!var4.equals("--translation")) {
                        var2 = var3;
                        return var2 ^ true;
                     }

                     var2 = var3;
                     if (VERSION.SDK_INT < 31) {
                        return var2 ^ true;
                     }
                     break label46;
                  case 100470631:
                     if (!var4.equals("--dump-dumpable")) {
                        var2 = var3;
                        return var2 ^ true;
                     }
                     break;
                  case 472614934:
                     if (!var4.equals("--list-dumpables")) {
                        var2 = var3;
                        return var2 ^ true;
                     }
                     break;
                  case 1159329357:
                     if (!var4.equals("--contentcapture")) {
                        var2 = var3;
                        return var2 ^ true;
                     }

                     var2 = var3;
                     if (VERSION.SDK_INT < 29) {
                        return var2 ^ true;
                     }
                     break label46;
                  case 1455016274:
                     if (!var4.equals("--autofill")) {
                        var2 = var3;
                        return var2 ^ true;
                     }

                     var2 = var3;
                     if (VERSION.SDK_INT < 26) {
                        return var2 ^ true;
                     }
                     break label46;
                  default:
                     var2 = var3;
                     return var2 ^ true;
               }

               var2 = var3;
               if (VERSION.SDK_INT < 33) {
                  return var2 ^ true;
               }
            }

            var2 = true;
         }
      }

      return var2 ^ true;
   }

   public boolean superDispatchKeyEvent(KeyEvent var1) {
      i0.d.e(var1, "event");
      return super.dispatchKeyEvent(var1);
   }
}
