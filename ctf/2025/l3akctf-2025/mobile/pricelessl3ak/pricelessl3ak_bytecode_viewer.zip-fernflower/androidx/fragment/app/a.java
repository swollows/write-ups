package androidx.fragment.app;

import android.util.Log;
import java.io.PrintWriter;
import java.util.ArrayList;

public final class a {
   public final ArrayList a;
   public int b;
   public int c;
   public int d;
   public int e;
   public int f;
   public boolean g;
   public String h;
   public int i;
   public CharSequence j;
   public int k;
   public CharSequence l;
   public ArrayList m;
   public ArrayList n;
   public boolean o;
   public final u p;
   public int q;

   public a(u var1) {
      q var2 = var1.t;
      h var3 = var1.r;
      if (var3 != null) {
         var3.a.getClassLoader();
      }

      super();
      this.a = new ArrayList();
      this.o = false;
      this.q = -1;
      this.p = var1;
   }

   public final void a(int var1) {
      if (this.g) {
         if (Log.isLoggable("FragmentManager", 2)) {
            StringBuilder var3 = new StringBuilder("Bump nesting in ");
            var3.append(this);
            var3.append(" by ");
            var3.append(var1);
            Log.v("FragmentManager", var3.toString());
         }

         ArrayList var4 = this.a;
         int var2 = var4.size();

         for(var1 = 0; var1 < var2; ++var1) {
            ((y)var4.get(var1)).getClass();
         }

      }
   }

   public final void b(String var1, PrintWriter var2, boolean var3) {
      int var4 = 0;
      if (var3) {
         var2.print(var1);
         var2.print("mName=");
         var2.print(this.h);
         var2.print(" mIndex=");
         var2.print(this.q);
         var2.print(" mCommitted=");
         var2.println(false);
         if (this.f != 0) {
            var2.print(var1);
            var2.print("mTransition=#");
            var2.print(Integer.toHexString(this.f));
         }

         if (this.b != 0 || this.c != 0) {
            var2.print(var1);
            var2.print("mEnterAnim=#");
            var2.print(Integer.toHexString(this.b));
            var2.print(" mExitAnim=#");
            var2.println(Integer.toHexString(this.c));
         }

         if (this.d != 0 || this.e != 0) {
            var2.print(var1);
            var2.print("mPopEnterAnim=#");
            var2.print(Integer.toHexString(this.d));
            var2.print(" mPopExitAnim=#");
            var2.println(Integer.toHexString(this.e));
         }

         if (this.i != 0 || this.j != null) {
            var2.print(var1);
            var2.print("mBreadCrumbTitleRes=#");
            var2.print(Integer.toHexString(this.i));
            var2.print(" mBreadCrumbTitleText=");
            var2.println(this.j);
         }

         if (this.k != 0 || this.l != null) {
            var2.print(var1);
            var2.print("mBreadCrumbShortTitleRes=#");
            var2.print(Integer.toHexString(this.k));
            var2.print(" mBreadCrumbShortTitleText=");
            var2.println(this.l);
         }
      }

      ArrayList var7 = this.a;
      if (!var7.isEmpty()) {
         var2.print(var1);
         var2.println("Operations:");

         for(int var5 = var7.size(); var4 < var5; ++var4) {
            y var8 = (y)var7.get(var4);
            String var6;
            switch (var8.a) {
               case 0:
                  var6 = "NULL";
                  break;
               case 1:
                  var6 = "ADD";
                  break;
               case 2:
                  var6 = "REPLACE";
                  break;
               case 3:
                  var6 = "REMOVE";
                  break;
               case 4:
                  var6 = "HIDE";
                  break;
               case 5:
                  var6 = "SHOW";
                  break;
               case 6:
                  var6 = "DETACH";
                  break;
               case 7:
                  var6 = "ATTACH";
                  break;
               case 8:
                  var6 = "SET_PRIMARY_NAV";
                  break;
               case 9:
                  var6 = "UNSET_PRIMARY_NAV";
                  break;
               case 10:
                  var6 = "OP_SET_MAX_LIFECYCLE";
                  break;
               default:
                  StringBuilder var9 = new StringBuilder("cmd=");
                  var9.append(var8.a);
                  var6 = var9.toString();
            }

            var2.print(var1);
            var2.print("  Op #");
            var2.print(var4);
            var2.print(": ");
            var2.print(var6);
            var2.print(" ");
            var2.println((Object)null);
            if (var3) {
               if (var8.c != 0 || var8.d != 0) {
                  var2.print(var1);
                  var2.print("enterAnim=#");
                  var2.print(Integer.toHexString(var8.c));
                  var2.print(" exitAnim=#");
                  var2.println(Integer.toHexString(var8.d));
               }

               if (var8.e != 0 || var8.f != 0) {
                  var2.print(var1);
                  var2.print("popEnterAnim=#");
                  var2.print(Integer.toHexString(var8.e));
                  var2.print(" popExitAnim=#");
                  var2.println(Integer.toHexString(var8.f));
               }
            }
         }
      }

   }

   public final void c(ArrayList var1, ArrayList var2) {
      if (Log.isLoggable("FragmentManager", 2)) {
         StringBuilder var3 = new StringBuilder("Run: ");
         var3.append(this);
         Log.v("FragmentManager", var3.toString());
      }

      var1.add(this);
      var2.add(Boolean.FALSE);
      if (this.g) {
         u var4 = this.p;
         if (var4.d == null) {
            var4.d = new ArrayList();
         }

         var4.d.add(this);
      }

   }

   public final String toString() {
      StringBuilder var1 = new StringBuilder(128);
      var1.append("BackStackEntry{");
      var1.append(Integer.toHexString(System.identityHashCode(this)));
      if (this.q >= 0) {
         var1.append(" #");
         var1.append(this.q);
      }

      if (this.h != null) {
         var1.append(" ");
         var1.append(this.h);
      }

      var1.append("}");
      return var1.toString();
   }
}
