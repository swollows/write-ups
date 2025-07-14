package ctf.l3akctf.pricelessl3ak;

import A.c;
import D.d;
import X.h;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import java.io.InputStream;

public class h1832fla12 extends Activity {
   public static final int b = 0;
   public h a;

   public final void onCreate(Bundle var1) {
      super.onCreate(var1);
      Object var6 = new Object();
      ((h)var6).a = this;
      Object var2 = new Object();
      ((c)var2).a = this;
      ((h)var6).b = var2;
      this.a = (h)var6;
      if ("BINGO".equals(this.getIntent().getAction())) {
         h var4 = this.a;
         h1832fla12 var7 = (h1832fla12)var4.a;

         try {
            InputStream var8 = var7.getAssets().open("data.enc");
            byte[] var3 = new byte[var8.available()];
            var4.c = var3;
            var8.read(var3);
            var8.close();
         } catch (Exception var5) {
            var7.finish();
         }
      } else {
         this.finish();
      }

   }

   public final void onNewIntent(Intent var1) {
      super.onNewIntent(var1);
      this.setIntent(var1);
      if ("BANGO".equals(var1.getAction())) {
         h var7 = this.a;
         if ((byte[])var7.c != null && var1.getFlags() != 0) {
            String var5 = var1.getStringExtra("f"); 
            if (var5 != null) {
               int var2 = var1.getFlags();
               byte[] var6 = (byte[])var7.c;
               d var9 = new d(9, var7);
               c var11 = (c)var7.b;
               var11.getClass();
               long var3 = (long)var2;

               try {
                  var11.h(var9, var5, c.j(c.g(var6, var3)));
               } catch (Exception var8) {
                  StringBuilder var10 = new StringBuilder(" ");
                  var10.append(var8.getMessage());
                  var9.v(var10.toString());
               }
            }
         }
      }

   }
}
