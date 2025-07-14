package A;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import java.util.ArrayList;
import java.util.Collections;

public final class l {
   public final int a;
   public final Object b;

   public l() {
      this.a = 1;
      this.b = Collections.singletonList((Object)null);
   }

   public l(Context var1) {
      int var2 = androidx.appcompat.app.i.h(var1, 0);
      super();
      this.b = new androidx.appcompat.app.e(new ContextThemeWrapper(var1, androidx.appcompat.app.i.h(var1, var2)));
      this.a = var2;
   }

   public l(ArrayList var1) {
      this.a = 0;
      this.b = var1;
   }

   public androidx.appcompat.app.i a() {
      androidx.appcompat.app.e var5 = (androidx.appcompat.app.e)this.b;
      androidx.appcompat.app.i var3 = new androidx.appcompat.app.i(var5.a, this.a);
      View var2 = var5.e;
      androidx.appcompat.app.h var4 = var3.f;
      if (var2 != null) {
         var4.n = var2;
      } else {
         CharSequence var7 = var5.d;
         if (var7 != null) {
            var4.d = var7;
            TextView var6 = var4.l;
            if (var6 != null) {
               var6.setText(var7);
            }
         }

         Drawable var11 = var5.c;
         if (var11 != null) {
            var4.j = var11;
            ImageView var8 = var4.k;
            if (var8 != null) {
               var8.setVisibility(0);
               var4.k.setImageDrawable(var11);
            }
         }
      }

      if (var5.g != null) {
         int var1 = var4.r;
         AlertController$RecycleListView var12 = (AlertController$RecycleListView)var5.b.inflate(var1, (ViewGroup)null);
         if (var5.i) {
            var1 = var4.s;
         } else {
            var1 = var4.t;
         }

         Object var9 = var5.g;
         if (var9 == null) {
            var9 = new ArrayAdapter(var5.a, var1, 16908308, (Object[])null);
         }

         var4.o = (ListAdapter)var9;
         var4.p = var5.j;
         if (var5.h != null) {
            var12.setOnItemClickListener(new androidx.appcompat.app.d(var5, var4));
         }

         if (var5.i) {
            var12.setChoiceMode(1);
         }

         var4.e = var12;
      }

      var3.setCancelable(true);
      var3.setCanceledOnTouchOutside(true);
      var3.setOnCancelListener((DialogInterface.OnCancelListener)null);
      var3.setOnDismissListener((DialogInterface.OnDismissListener)null);
      j.m var10 = var5.f;
      if (var10 != null) {
         var3.setOnKeyListener(var10);
      }

      return var3;
   }
}
