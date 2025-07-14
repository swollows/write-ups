package E;

import D.C;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Build.VERSION;
import android.text.SpannableString;
import android.text.TextUtils;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

public final class g {
   public static int b;
   public final AccessibilityNodeInfo a;

   public g(AccessibilityNodeInfo var1) {
      this.a = var1;
   }

   public static String b(int var0) {
      if (var0 != 1) {
         if (var0 != 2) {
            switch (var0) {
               case 4:
                  return "ACTION_SELECT";
               case 8:
                  return "ACTION_CLEAR_SELECTION";
               case 16:
                  return "ACTION_CLICK";
               case 32:
                  return "ACTION_LONG_CLICK";
               case 64:
                  return "ACTION_ACCESSIBILITY_FOCUS";
               case 128:
                  return "ACTION_CLEAR_ACCESSIBILITY_FOCUS";
               case 256:
                  return "ACTION_NEXT_AT_MOVEMENT_GRANULARITY";
               case 512:
                  return "ACTION_PREVIOUS_AT_MOVEMENT_GRANULARITY";
               case 1024:
                  return "ACTION_NEXT_HTML_ELEMENT";
               case 2048:
                  return "ACTION_PREVIOUS_HTML_ELEMENT";
               case 4096:
                  return "ACTION_SCROLL_FORWARD";
               case 8192:
                  return "ACTION_SCROLL_BACKWARD";
               case 16384:
                  return "ACTION_COPY";
               case 32768:
                  return "ACTION_PASTE";
               case 65536:
                  return "ACTION_CUT";
               case 131072:
                  return "ACTION_SET_SELECTION";
               case 262144:
                  return "ACTION_EXPAND";
               case 524288:
                  return "ACTION_COLLAPSE";
               case 2097152:
                  return "ACTION_SET_TEXT";
               case 16908354:
                  return "ACTION_MOVE_WINDOW";
               case 16908382:
                  return "ACTION_SCROLL_IN_DIRECTION";
               default:
                  switch (var0) {
                     case 16908342:
                        return "ACTION_SHOW_ON_SCREEN";
                     case 16908343:
                        return "ACTION_SCROLL_TO_POSITION";
                     case 16908344:
                        return "ACTION_SCROLL_UP";
                     case 16908345:
                        return "ACTION_SCROLL_LEFT";
                     case 16908346:
                        return "ACTION_SCROLL_DOWN";
                     case 16908347:
                        return "ACTION_SCROLL_RIGHT";
                     case 16908348:
                        return "ACTION_CONTEXT_CLICK";
                     case 16908349:
                        return "ACTION_SET_PROGRESS";
                     default:
                        switch (var0) {
                           case 16908356:
                              return "ACTION_SHOW_TOOLTIP";
                           case 16908357:
                              return "ACTION_HIDE_TOOLTIP";
                           case 16908358:
                              return "ACTION_PAGE_UP";
                           case 16908359:
                              return "ACTION_PAGE_DOWN";
                           case 16908360:
                              return "ACTION_PAGE_LEFT";
                           case 16908361:
                              return "ACTION_PAGE_RIGHT";
                           case 16908362:
                              return "ACTION_PRESS_AND_HOLD";
                           default:
                              switch (var0) {
                                 case 16908372:
                                    return "ACTION_IME_ENTER";
                                 case 16908373:
                                    return "ACTION_DRAG_START";
                                 case 16908374:
                                    return "ACTION_DRAG_DROP";
                                 case 16908375:
                                    return "ACTION_DRAG_CANCEL";
                                 default:
                                    return "ACTION_UNKNOWN";
                              }
                        }
                  }
            }
         } else {
            return "ACTION_CLEAR_FOCUS";
         }
      } else {
         return "ACTION_FOCUS";
      }
   }

   public final ArrayList a(String var1) {
      AccessibilityNodeInfo var4 = this.a;
      ArrayList var3 = var4.getExtras().getIntegerArrayList(var1);
      ArrayList var2 = var3;
      if (var3 == null) {
         var2 = new ArrayList();
         var4.getExtras().putIntegerArrayList(var1, var2);
      }

      return var2;
   }

   public final boolean c(int var1) {
      Bundle var3 = this.a.getExtras();
      boolean var2 = false;
      if (var3 == null) {
         return false;
      } else {
         if ((var3.getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOOLEAN_PROPERTY_KEY", 0) & var1) == var1) {
            var2 = true;
         }

         return var2;
      }
   }

   public final boolean equals(Object var1) {
      if (this == var1) {
         return true;
      } else if (var1 == null) {
         return false;
      } else if (!(var1 instanceof g)) {
         return false;
      } else {
         AccessibilityNodeInfo var2 = ((g)var1).a;
         AccessibilityNodeInfo var3 = this.a;
         if (var3 == null) {
            if (var2 != null) {
               return false;
            }
         } else if (!var3.equals(var2)) {
            return false;
         }

         return true;
      }
   }

   public final int hashCode() {
      AccessibilityNodeInfo var2 = this.a;
      int var1;
      if (var2 == null) {
         var1 = 0;
      } else {
         var1 = var2.hashCode();
      }

      return var1;
   }

   public final String toString() {
      StringBuilder var8 = new StringBuilder();
      var8.append(super.toString());
      Rect var6 = new Rect();
      AccessibilityNodeInfo var9 = this.a;
      var9.getBoundsInParent(var6);
      StringBuilder var7 = new StringBuilder("; boundsInParent: ");
      var7.append(var6);
      var8.append(var7.toString());
      var9.getBoundsInScreen(var6);
      var7 = new StringBuilder("; boundsInScreen: ");
      var7.append(var6);
      var8.append(var7.toString());
      if (VERSION.SDK_INT >= 34) {
         C.c(var9, var6);
      } else {
         Rect var16 = (Rect)var9.getExtras().getParcelable("androidx.view.accessibility.AccessibilityNodeInfoCompat.BOUNDS_IN_WINDOW_KEY");
         if (var16 != null) {
            var6.set(var16.left, var16.top, var16.right, var16.bottom);
         }
      }

      var7 = new StringBuilder("; boundsInWindow: ");
      var7.append(var6);
      var8.append(var7.toString());
      var8.append("; packageName: ");
      var8.append(var9.getPackageName());
      var8.append("; className: ");
      var8.append(var9.getClassName());
      var8.append("; text: ");
      boolean var5 = this.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY").isEmpty();
      byte var3 = 0;
      int var1;
      Object var14;
      if (!var5) {
         ArrayList var11 = this.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_START_KEY");
         ArrayList var12 = this.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_END_KEY");
         ArrayList var10 = this.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_FLAGS_KEY");
         ArrayList var13 = this.a("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ID_KEY");
         SpannableString var17 = new SpannableString(TextUtils.substring(var9.getText(), 0, var9.getText().length()));
         var1 = 0;

         while(true) {
            var14 = var17;
            if (var1 >= var11.size()) {
               break;
            }

            var17.setSpan(new a((Integer)var13.get(var1), this, var9.getExtras().getInt("androidx.view.accessibility.AccessibilityNodeInfoCompat.SPANS_ACTION_ID_KEY")), (Integer)var11.get(var1), (Integer)var12.get(var1), (Integer)var10.get(var1));
            ++var1;
         }
      } else {
         var14 = var9.getText();
      }

      var8.append((CharSequence)var14);
      var8.append("; error: ");
      var8.append(var9.getError());
      var8.append("; maxTextLength: ");
      var8.append(var9.getMaxTextLength());
      var8.append("; stateDescription: ");
      var1 = VERSION.SDK_INT;
      CharSequence var15;
      if (var1 >= 30) {
         var15 = e.a(var9);
      } else {
         var15 = var9.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.STATE_DESCRIPTION_KEY");
      }

      var8.append(var15);
      var8.append("; contentDescription: ");
      var8.append(var9.getContentDescription());
      var8.append("; tooltipText: ");
      if (var1 >= 28) {
         var15 = B.b.l(var9);
      } else {
         var15 = var9.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.TOOLTIP_TEXT_KEY");
      }

      var8.append(var15);
      var8.append("; viewIdResName: ");
      var8.append(var9.getViewIdResourceName());
      var8.append("; uniqueId: ");
      String var19;
      if (var1 >= 33) {
         var19 = f.c(var9);
      } else {
         var19 = var9.getExtras().getString("androidx.view.accessibility.AccessibilityNodeInfoCompat.UNIQUE_ID_KEY");
      }

      var8.append(var19);
      var8.append("; checkable: ");
      var8.append(var9.isCheckable());
      var8.append("; checked: ");
      var8.append(var9.isChecked());
      var8.append("; fieldRequired: ");
      var8.append(var9.getExtras().getBoolean("androidx.view.accessibility.AccessibilityNodeInfoCompat.IS_REQUIRED_KEY"));
      var8.append("; focusable: ");
      var8.append(var9.isFocusable());
      var8.append("; focused: ");
      var8.append(var9.isFocused());
      var8.append("; selected: ");
      var8.append(var9.isSelected());
      var8.append("; clickable: ");
      var8.append(var9.isClickable());
      var8.append("; longClickable: ");
      var8.append(var9.isLongClickable());
      var8.append("; contextClickable: ");
      var8.append(var9.isContextClickable());
      var8.append("; enabled: ");
      var8.append(var9.isEnabled());
      var8.append("; password: ");
      var8.append(var9.isPassword());
      StringBuilder var21 = new StringBuilder("; scrollable: ");
      var21.append(var9.isScrollable());
      var8.append(var21.toString());
      var8.append("; containerTitle: ");
      if (var1 >= 34) {
         var15 = C.d(var9);
      } else {
         var15 = var9.getExtras().getCharSequence("androidx.view.accessibility.AccessibilityNodeInfoCompat.CONTAINER_TITLE_KEY");
      }

      var8.append(var15);
      var8.append("; granularScrollingSupported: ");
      var8.append(this.c(67108864));
      var8.append("; importantForAccessibility: ");
      var8.append(var9.isImportantForAccessibility());
      var8.append("; visible: ");
      var8.append(var9.isVisibleToUser());
      var8.append("; isTextSelectable: ");
      if (var1 >= 33) {
         var5 = f.d(var9);
      } else {
         var5 = this.c(8388608);
      }

      var8.append(var5);
      var8.append("; accessibilityDataSensitive: ");
      if (var1 >= 34) {
         var5 = C.g(var9);
      } else {
         var5 = this.c(64);
      }

      var8.append(var5);
      var8.append("; [");
      List var24 = var9.getActionList();
      ArrayList var20 = new ArrayList();
      int var4 = var24.size();
      int var2 = 0;

      while(true) {
         var1 = var3;
         if (var2 >= var4) {
            for(; var1 < var20.size(); ++var1) {
               d var22 = (d)var20.get(var1);
               String var18 = b(((AccessibilityNodeInfo.AccessibilityAction)var22.a).getId());
               var19 = var18;
               if (var18.equals("ACTION_UNKNOWN")) {
                  Object var23 = var22.a;
                  var19 = var18;
                  if (((AccessibilityNodeInfo.AccessibilityAction)var23).getLabel() != null) {
                     var19 = ((AccessibilityNodeInfo.AccessibilityAction)var23).getLabel().toString();
                  }
               }

               var8.append(var19);
               if (var1 != var20.size() - 1) {
                  var8.append(", ");
               }
            }

            var8.append("]");
            return var8.toString();
         }

         var20.add(new d(var24.get(var2), 0, (Class)null));
         ++var2;
      }
   }
}
