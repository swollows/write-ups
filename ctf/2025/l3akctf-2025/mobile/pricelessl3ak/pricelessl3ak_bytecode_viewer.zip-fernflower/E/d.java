package E;

import B.a;
import D.C;
import D.c0;
import D.l0;
import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.accessibility.AccessibilityNodeInfo.AccessibilityAction;

public final class d {
   public static final d c;
   public static final d d;
   public static final d e;
   public static final d f;
   public final Object a;
   public final int b;

   static {
      new d((Object)null, 1, (Class)null);
      new d((Object)null, 2, (Class)null);
      new d((Object)null, 4, (Class)null);
      new d((Object)null, 8, (Class)null);
      new d((Object)null, 16, (Class)null);
      new d((Object)null, 32, (Class)null);
      new d((Object)null, 64, (Class)null);
      new d((Object)null, 128, (Class)null);
      new d((Object)null, 256, h.class);
      new d((Object)null, 512, h.class);
      new d((Object)null, 1024, i.class);
      new d((Object)null, 2048, i.class);
      c = new d((Object)null, 4096, (Class)null);
      d = new d((Object)null, 8192, (Class)null);
      new d((Object)null, 16384, (Class)null);
      new d((Object)null, 32768, (Class)null);
      new d((Object)null, 65536, (Class)null);
      new d((Object)null, 131072, m.class);
      new d((Object)null, 262144, (Class)null);
      new d((Object)null, 524288, (Class)null);
      new d((Object)null, 1048576, (Class)null);
      new d((Object)null, 2097152, n.class);
      int var0 = VERSION.SDK_INT;
      new d(AccessibilityAction.ACTION_SHOW_ON_SCREEN, 16908342, (Class)null);
      new d(AccessibilityAction.ACTION_SCROLL_TO_POSITION, 16908343, k.class);
      e = new d(AccessibilityAction.ACTION_SCROLL_UP, 16908344, (Class)null);
      new d(AccessibilityAction.ACTION_SCROLL_LEFT, 16908345, (Class)null);
      f = new d(AccessibilityAction.ACTION_SCROLL_DOWN, 16908346, (Class)null);
      new d(AccessibilityAction.ACTION_SCROLL_RIGHT, 16908347, (Class)null);
      AccessibilityNodeInfo.AccessibilityAction var1;
      if (var0 >= 29) {
         var1 = c0.f();
      } else {
         var1 = null;
      }

      new d(var1, 16908358, (Class)null);
      if (var0 >= 29) {
         var1 = c0.j();
      } else {
         var1 = null;
      }

      new d(var1, 16908359, (Class)null);
      if (var0 >= 29) {
         var1 = c0.l();
      } else {
         var1 = null;
      }

      new d(var1, 16908360, (Class)null);
      if (var0 >= 29) {
         var1 = c0.m();
      } else {
         var1 = null;
      }

      new d(var1, 16908361, (Class)null);
      new d(AccessibilityAction.ACTION_CONTEXT_CLICK, 16908348, (Class)null);
      new d(AccessibilityAction.ACTION_SET_PROGRESS, 16908349, l.class);
      if (var0 >= 26) {
         var1 = B.a.b();
      } else {
         var1 = null;
      }

      new d(var1, 16908354, j.class);
      if (var0 >= 28) {
         var1 = B.b.k();
      } else {
         var1 = null;
      }

      new d(var1, 16908356, (Class)null);
      if (var0 >= 28) {
         var1 = B.b.s();
      } else {
         var1 = null;
      }

      new d(var1, 16908357, (Class)null);
      if (var0 >= 30) {
         var1 = l0.b();
      } else {
         var1 = null;
      }

      new d(var1, 16908362, (Class)null);
      if (var0 >= 30) {
         var1 = l0.c();
      } else {
         var1 = null;
      }

      new d(var1, 16908372, (Class)null);
      if (var0 >= 32) {
         var1 = E.b.a();
      } else {
         var1 = null;
      }

      new d(var1, 16908373, (Class)null);
      if (var0 >= 32) {
         var1 = E.b.b();
      } else {
         var1 = null;
      }

      new d(var1, 16908374, (Class)null);
      if (var0 >= 32) {
         var1 = E.b.c();
      } else {
         var1 = null;
      }

      new d(var1, 16908375, (Class)null);
      if (var0 >= 33) {
         var1 = E.c.a();
      } else {
         var1 = null;
      }

      new d(var1, 16908376, (Class)null);
      if (var0 >= 34) {
         var1 = C.a();
      } else {
         var1 = null;
      }

      new d(var1, 16908382, (Class)null);
   }

   public d(Object var1, int var2, Class var3) {
      this.b = var2;
      if (var1 == null) {
         this.a = new AccessibilityNodeInfo.AccessibilityAction(var2, (CharSequence)null);
      } else {
         this.a = var1;
      }

   }

   public final boolean equals(Object var1) {
      if (var1 == null) {
         return false;
      } else if (!(var1 instanceof d)) {
         return false;
      } else {
         var1 = ((d)var1).a;
         Object var2 = this.a;
         if (var2 == null) {
            if (var1 != null) {
               return false;
            }
         } else if (!var2.equals(var1)) {
            return false;
         }

         return true;
      }
   }

   public final int hashCode() {
      Object var2 = this.a;
      int var1;
      if (var2 != null) {
         var1 = var2.hashCode();
      } else {
         var1 = 0;
      }

      return var1;
   }

   public final String toString() {
      StringBuilder var3 = new StringBuilder("AccessibilityActionCompat: ");
      String var2 = g.b(this.b);
      String var1 = var2;
      if (var2.equals("ACTION_UNKNOWN")) {
         Object var4 = this.a;
         var1 = var2;
         if (((AccessibilityNodeInfo.AccessibilityAction)var4).getLabel() != null) {
            var1 = ((AccessibilityNodeInfo.AccessibilityAction)var4).getLabel().toString();
         }
      }

      var3.append(var1);
      return var3.toString();
   }
}
