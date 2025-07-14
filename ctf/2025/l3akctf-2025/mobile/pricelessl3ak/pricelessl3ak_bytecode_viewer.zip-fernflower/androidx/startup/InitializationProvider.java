package androidx.startup;

import C.b;
import S.a;
import S.c;
import android.content.ComponentName;
import android.content.ContentProvider;
import android.content.ContentValues;
import android.content.Context;
import android.content.pm.PackageManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Trace;

public class InitializationProvider extends ContentProvider {
   public final int delete(Uri var1, String var2, String[] var3) {
      throw new IllegalStateException("Not allowed.");
   }

   public final String getType(Uri var1) {
      throw new IllegalStateException("Not allowed.");
   }

   public final Uri insert(Uri var1, ContentValues var2) {
      throw new IllegalStateException("Not allowed.");
   }

   public final boolean onCreate() {
      Context var1 = this.getContext();
      if (var1 != null) {
         if (var1.getApplicationContext() != null) {
            a var2 = a.c(var1);
            Context var3 = var2.c;

            try {
               b.d("Startup");
               ComponentName var8 = new ComponentName(var3.getPackageName(), InitializationProvider.class.getName());
               var2.a(var3.getPackageManager().getProviderInfo(var8, 128).metaData);
            } catch (PackageManager.NameNotFoundException var6) {
               c var9 = new c(var6);
               throw var9;
            } finally {
               Trace.endSection();
            }
         }

         return true;
      } else {
         throw new RuntimeException("Context cannot be null");
      }
   }

   public final Cursor query(Uri var1, String[] var2, String var3, String[] var4, String var5) {
      throw new IllegalStateException("Not allowed.");
   }

   public final int update(Uri var1, ContentValues var2, String var3, String[] var4) {
      throw new IllegalStateException("Not allowed.");
   }
}
