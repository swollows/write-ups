package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;

public final class l implements LayoutInflater.Factory2 {
   public final t a;

   public l(t var1) {
      this.a = var1;
   }

   public final View onCreateView(View var1, String var2, Context var3, AttributeSet var4) {
      boolean var7 = j.class.getName().equals(var2);
      t var9 = this.a;
      if (var7) {
         return new j(var3, var4, var9);
      } else if (!"fragment".equals(var2)) {
         return null;
      } else {
         String var8 = var4.getAttributeValue((String)null, "class");
         TypedArray var10 = var3.obtainStyledAttributes(var4, K.a.a);
         int var5 = 0;
         var2 = var8;
         if (var8 == null) {
            var2 = var10.getString(0);
         }

         int var6 = var10.getResourceId(1, -1);
         var8 = var10.getString(2);
         var10.recycle();
         if (var2 != null) {
            ClassLoader var17 = var3.getClassLoader();

            try {
               var7 = d.class.isAssignableFrom(q.b(var17, var2));
            } catch (ClassNotFoundException var11) {
               var7 = false;
            }

            if (var7) {
               if (var1 != null) {
                  var5 = var1.getId();
               }

               if (var5 == -1 && var6 == -1 && var8 == null) {
                  StringBuilder var15 = new StringBuilder();
                  var15.append(var4.getPositionDescription());
                  var15.append(": Must specify unique android:id, android:tag, or have a parent with an id for ");
                  var15.append(var2);
                  throw new IllegalArgumentException(var15.toString());
               }

               if (var6 != -1) {
                  var9.g();
               }

               if (var8 != null) {
                  x var16 = var9.c;
                  ArrayList var12 = var16.a;

                  for(var6 = var12.size() - 1; var6 >= 0; --var6) {
                     if (var12.get(var6) != null) {
                        throw new ClassCastException();
                     }
                  }

                  Iterator var13 = var16.b.values().iterator();

                  while(var13.hasNext()) {
                     if (var13.next() != null) {
                        throw new ClassCastException();
                     }
                  }
               }

               if (var5 != -1) {
                  var9.g();
               }

               q var14 = var9.t;
               var3.getClassLoader();
               var14.a(var2);
               throw null;
            }
         }

         return null;
      }
   }

   public final View onCreateView(String var1, Context var2, AttributeSet var3) {
      return this.onCreateView((View)null, var1, var2, var3);
   }
}
