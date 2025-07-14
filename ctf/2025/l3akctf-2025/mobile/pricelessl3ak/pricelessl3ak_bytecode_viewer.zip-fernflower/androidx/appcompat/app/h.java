package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;

public final class h {
   public final Context a;
   public final i b;
   public final Window c;
   public CharSequence d;
   public AlertController$RecycleListView e;
   public Button f;
   public Button g;
   public Button h;
   public NestedScrollView i;
   public Drawable j;
   public ImageView k;
   public TextView l;
   public TextView m;
   public View n;
   public ListAdapter o;
   public int p = -1;
   public final int q;
   public final int r;
   public final int s;
   public final int t;
   public final boolean u;
   public final f v;
   public final c w = new c(0, this);

   public h(Context var1, i var2, Window var3) {
      this.a = var1;
      this.b = var2;
      this.c = var3;
      Handler var5 = new Handler();
      var5.a = new WeakReference(var2);
      this.v = var5;
      TypedArray var4 = var1.obtainStyledAttributes((AttributeSet)null, g.a.e, 2130903078, 0);
      this.q = var4.getResourceId(0, 0);
      var4.getResourceId(2, 0);
      this.r = var4.getResourceId(4, 0);
      var4.getResourceId(5, 0);
      this.s = var4.getResourceId(7, 0);
      this.t = var4.getResourceId(3, 0);
      this.u = var4.getBoolean(6, true);
      var4.getDimensionPixelSize(1, 0);
      var4.recycle();
      var2.b().g(1);
   }

   public static ViewGroup a(View var0, View var1) {
      if (var0 == null) {
         var0 = var1;
         if (var1 instanceof ViewStub) {
            var0 = ((ViewStub)var1).inflate();
         }

         return (ViewGroup)var0;
      } else {
         if (var1 != null) {
            ViewParent var2 = var1.getParent();
            if (var2 instanceof ViewGroup) {
               ((ViewGroup)var2).removeView(var1);
            }
         }

         var1 = var0;
         if (var0 instanceof ViewStub) {
            var1 = ((ViewStub)var0).inflate();
         }

         return (ViewGroup)var1;
      }
   }
}
