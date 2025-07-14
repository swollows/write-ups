package androidx.core.widget;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.ScrollView;

public final class e extends D.b {
   public final void a(View var1, AccessibilityEvent var2) {
      super.a(var1, var2);
      NestedScrollView var4 = (NestedScrollView)var1;
      var2.setClassName(ScrollView.class.getName());
      boolean var3;
      if (var4.getScrollRange() > 0) {
         var3 = true;
      } else {
         var3 = false;
      }

      var2.setScrollable(var3);
      var2.setScrollX(var4.getScrollX());
      var2.setScrollY(var4.getScrollY());
      var2.setMaxScrollX(var4.getScrollX());
      var2.setMaxScrollY(var4.getScrollRange());
   }

   public final void b(View var1, E.g var2) {
      View.AccessibilityDelegate var4 = super.a;
      AccessibilityNodeInfo var6 = var2.a;
      var4.onInitializeAccessibilityNodeInfo(var1, var6);
      NestedScrollView var5 = (NestedScrollView)var1;
      var6.setClassName(ScrollView.class.getName());
      if (var5.isEnabled()) {
         int var3 = var5.getScrollRange();
         if (var3 > 0) {
            var6.setScrollable(true);
            if (var5.getScrollY() > 0) {
               var6.addAction((AccessibilityNodeInfo.AccessibilityAction)E.d.d.a);
               var6.addAction((AccessibilityNodeInfo.AccessibilityAction)E.d.e.a);
            }

            if (var5.getScrollY() < var3) {
               var6.addAction((AccessibilityNodeInfo.AccessibilityAction)E.d.c.a);
               var6.addAction((AccessibilityNodeInfo.AccessibilityAction)E.d.f.a);
            }
         }
      }

   }

   public final boolean c(View var1, int var2, Bundle var3) {
      if (super.c(var1, var2, var3)) {
         return true;
      } else {
         NestedScrollView var6 = (NestedScrollView)var1;
         if (!var6.isEnabled()) {
            return false;
         } else {
            int var5 = var6.getHeight();
            Rect var7 = new Rect();
            int var4 = var5;
            if (var6.getMatrix().isIdentity()) {
               var4 = var5;
               if (var6.getGlobalVisibleRect(var7)) {
                  var4 = var7.height();
               }
            }

            if (var2 != 4096) {
               if (var2 == 8192 || var2 == 16908344) {
                  var5 = var6.getPaddingBottom();
                  var2 = var6.getPaddingTop();
                  var2 = Math.max(var6.getScrollY() - (var4 - var5 - var2), 0);
                  if (var2 != var6.getScrollY()) {
                     var6.v(0 - var6.getScrollX(), var2 - var6.getScrollY(), true);
                     return true;
                  } else {
                     return false;
                  }
               }

               if (var2 != 16908346) {
                  return false;
               }
            }

            var5 = var6.getPaddingBottom();
            var2 = var6.getPaddingTop();
            var2 = Math.min(var6.getScrollY() + (var4 - var5 - var2), var6.getScrollRange());
            if (var2 != var6.getScrollY()) {
               var6.v(0 - var6.getScrollX(), var2 - var6.getScrollY(), true);
               return true;
            } else {
               return false;
            }
         }
      }
   }
}
