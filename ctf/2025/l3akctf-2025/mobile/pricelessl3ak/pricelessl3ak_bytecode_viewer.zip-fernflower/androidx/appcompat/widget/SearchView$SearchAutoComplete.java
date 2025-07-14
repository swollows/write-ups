package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;

public class SearchView$SearchAutoComplete extends r {
   public int e = this.getThreshold();
   public boolean f;
   public final A.b g = new A.b(3, this);

   public SearchView$SearchAutoComplete(Context var1, AttributeSet var2) {
      super(var1, var2);
   }

   private int getSearchViewTextMinWidthDp() {
      Configuration var3 = this.getResources().getConfiguration();
      int var1 = var3.screenWidthDp;
      int var2 = var3.screenHeightDp;
      if (var1 >= 960 && var2 >= 720 && var3.orientation == 2) {
         return 256;
      } else {
         return var1 >= 600 || var1 >= 640 && var2 >= 480 ? 192 : 160;
      }
   }

   public final boolean enoughToFilter() {
      boolean var1;
      if (this.e > 0 && !super.enoughToFilter()) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public final InputConnection onCreateInputConnection(EditorInfo var1) {
      InputConnection var3 = super.onCreateInputConnection(var1);
      if (this.f) {
         A.b var2 = this.g;
         this.removeCallbacks(var2);
         this.post(var2);
      }

      return var3;
   }

   public final void onFinishInflate() {
      super.onFinishInflate();
      DisplayMetrics var1 = this.getResources().getDisplayMetrics();
      this.setMinWidth((int)TypedValue.applyDimension(1, (float)this.getSearchViewTextMinWidthDp(), var1));
   }

   public final void onFocusChanged(boolean var1, int var2, Rect var3) {
      super.onFocusChanged(var1, var2, var3);
      throw null;
   }

   public final boolean onKeyPreIme(int var1, KeyEvent var2) {
      if (var1 == 4) {
         KeyEvent.DispatcherState var3;
         if (var2.getAction() == 0 && var2.getRepeatCount() == 0) {
            var3 = this.getKeyDispatcherState();
            if (var3 != null) {
               var3.startTracking(var2, this);
            }

            return true;
         }

         if (var2.getAction() == 1) {
            var3 = this.getKeyDispatcherState();
            if (var3 != null) {
               var3.handleUpEvent(var2);
            }

            if (var2.isTracking() && !var2.isCanceled()) {
               throw null;
            }
         }
      }

      return super.onKeyPreIme(var1, var2);
   }

   public final void onWindowFocusChanged(boolean var1) {
      super.onWindowFocusChanged(var1);
      if (var1) {
         throw null;
      }
   }

   public final void performCompletion() {
   }

   public final void replaceText(CharSequence var1) {
   }

   public void setImeVisibility(boolean var1) {
      InputMethodManager var2 = (InputMethodManager)this.getContext().getSystemService("input_method");
      A.b var3 = this.g;
      if (!var1) {
         this.f = false;
         this.removeCallbacks(var3);
         var2.hideSoftInputFromWindow(this.getWindowToken(), 0);
      } else if (var2.isActive(this)) {
         this.f = false;
         this.removeCallbacks(var3);
         var2.showSoftInput(this, 0);
      } else {
         this.f = true;
      }
   }

   public void setSearchView(X0 var1) {
   }

   public void setThreshold(int var1) {
      super.setThreshold(var1);
      this.e = var1;
   }
}
