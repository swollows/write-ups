package H;

import android.content.Context;
import android.graphics.Typeface;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import androidx.lifecycle.N;
import androidx.lifecycle.P;
import androidx.lifecycle.T;
import j.A;
import java.nio.ByteBuffer;
import java.util.ArrayList;

public final class w implements i.a {
   public final Object a;
   public final Object b;
   public final Object c;
   public final Object d;

   public w(Context var1, ActionMode.Callback var2) {
      this.b = var1;
      this.a = var2;
      this.c = new ArrayList();
      this.d = new m.k(0);
   }

   public w(Typeface var1, I.b var2) {
      this.d = var1;
      this.a = var2;
      this.c = new v(1024);
      int var3 = var2.a(6);
      int var4;
      if (var3 != 0) {
         var3 += var2.a;
         var4 = ((ByteBuffer)var2.d).getInt(var3);
         var3 = ((ByteBuffer)var2.d).getInt(var4 + var3);
      } else {
         var3 = 0;
      }

      this.b = new char[var3 * 2];
      var3 = var2.a(6);
      if (var3 != 0) {
         var4 = var3 + var2.a;
         var3 = ((ByteBuffer)var2.d).getInt(var4);
         var3 = ((ByteBuffer)var2.d).getInt(var3 + var4);
      } else {
         var3 = 0;
      }

      for(var4 = 0; var4 < var3; ++var4) {
         z var6 = new z(this, var4);
         I.a var7 = var6.c();
         int var5 = var7.a(4);
         if (var5 != 0) {
            var5 = ((ByteBuffer)var7.d).getInt(var5 + var7.a);
         } else {
            var5 = 0;
         }

         Character.toChars(var5, (char[])this.b, var4 * 2);
         boolean var8;
         if (var6.b() > 0) {
            var8 = true;
         } else {
            var8 = false;
         }

         if (!var8) {
            throw new IllegalArgumentException("invalid metadata codepoint length");
         }

         var5 = var6.b();
         ((v)this.c).a(var6, 0, var5 - 1);
      }

   }

   public w(T var1, P var2, M.b var3) {
      i0.d.e(var1, "store");
      i0.d.e(var3, "defaultExtras");
      super();
      this.a = var1;
      this.b = var2;
      this.c = var3;
      this.d = new D.z(8);
   }

   public boolean a(i.b var1, MenuItem var2) {
      i.f var3 = this.b(var1);
      j.s var4 = new j.s((Context)this.b, (y.a)var2);
      return ((ActionMode.Callback)this.a).onActionItemClicked(var3, var4);
   }

   public i.f b(i.b var1) {
      ArrayList var4 = (ArrayList)this.c;
      int var3 = var4.size();

      for(int var2 = 0; var2 < var3; ++var2) {
         i.f var5 = (i.f)var4.get(var2);
         if (var5 != null && var5.b == var1) {
            return var5;
         }
      }

      i.f var6 = new i.f((Context)this.b, var1);
      var4.add(var6);
      return var6;
   }

   public boolean c(i.b var1, j.l var2) {
      i.f var4 = this.b(var1);
      m.k var5 = (m.k)this.d;
      Menu var3 = (Menu)var5.get(var2);
      Object var6 = var3;
      if (var3 == null) {
         var6 = new A((Context)this.b, var2);
         var5.put(var2, var6);
      }

      return ((ActionMode.Callback)this.a).onPrepareActionMode(var4, (Menu)var6);
   }

   public boolean d(i.b var1, j.l var2) {
      i.f var5 = this.b(var1);
      m.k var4 = (m.k)this.d;
      Menu var3 = (Menu)var4.get(var2);
      Object var6 = var3;
      if (var3 == null) {
         var6 = new A((Context)this.b, var2);
         var4.put(var2, var6);
      }

      return ((ActionMode.Callback)this.a).onCreateActionMode(var5, (Menu)var6);
   }

   public void e(i.b var1) {
      i.f var2 = this.b(var1);
      ((ActionMode.Callback)this.a).onDestroyActionMode(var2);
   }

   public N f(i0.b param1, String param2) {
      // $FF: Couldn't be decompiled
   }
}
