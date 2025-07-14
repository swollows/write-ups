package i;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.AssetManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.view.LayoutInflater;

public final class d extends ContextWrapper {
   public static Configuration f;
   public int a;
   public Resources.Theme b;
   public LayoutInflater c;
   public Configuration d;
   public Resources e;

   public d(Context var1, int var2) {
      super(var1);
      this.a = var2;
   }

   public final void a(Configuration var1) {
      if (this.e == null) {
         if (this.d == null) {
            this.d = new Configuration(var1);
         } else {
            throw new IllegalStateException("Override configuration has already been set");
         }
      } else {
         throw new IllegalStateException("getResources() or getAssets() has already been called");
      }
   }

   public final void attachBaseContext(Context var1) {
      super.attachBaseContext(var1);
   }

   public final void b() {
      if (this.b == null) {
         this.b = this.getResources().newTheme();
         Resources.Theme var1 = this.getBaseContext().getTheme();
         if (var1 != null) {
            this.b.setTo(var1);
         }
      }

      this.b.applyStyle(this.a, true);
   }

   public final AssetManager getAssets() {
      return this.getResources().getAssets();
   }

   public final Resources getResources() {
      if (this.e == null) {
         label30: {
            Configuration var1 = this.d;
            if (var1 != null) {
               if (VERSION.SDK_INT < 26) {
                  break label30;
               }

               if (f == null) {
                  Configuration var2 = new Configuration();
                  var2.fontScale = 0.0F;
                  f = var2;
               }

               if (!var1.equals(f)) {
                  break label30;
               }
            }

            this.e = super.getResources();
            return this.e;
         }

         this.e = this.createConfigurationContext(this.d).getResources();
      }

      return this.e;
   }

   public final Object getSystemService(String var1) {
      if ("layout_inflater".equals(var1)) {
         if (this.c == null) {
            this.c = LayoutInflater.from(this.getBaseContext()).cloneInContext(this);
         }

         return this.c;
      } else {
         return this.getBaseContext().getSystemService(var1);
      }
   }

   public final Resources.Theme getTheme() {
      Resources.Theme var1 = this.b;
      if (var1 != null) {
         return var1;
      } else {
         if (this.a == 0) {
            this.a = 2131624197;
         }

         this.b();
         return this.b;
      }
   }

   public final void setTheme(int var1) {
      if (this.a != var1) {
         this.a = var1;
         this.b();
      }

   }
}
