package androidx.fragment.app;

import android.os.Looper;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

public abstract class t {
   public boolean A;
   public ArrayList B;
   public ArrayList C;
   public ArrayList D;
   public w E;
   public final r F;
   public final ArrayList a = new ArrayList();
   public boolean b;
   public final x c = new x();
   public ArrayList d;
   public final l e = new l(this);
   public b.t f;
   public final o g = new o(this);
   public final AtomicInteger h = new AtomicInteger();
   public final Map i = Collections.synchronizedMap(new HashMap());
   public final Map j = Collections.synchronizedMap(new HashMap());
   public final CopyOnWriteArrayList k;
   public final m l;
   public final m m;
   public final m n;
   public final m o;
   public final p p;
   public int q;
   public h r;
   public h s;
   public final q t;
   public d.h u;
   public d.h v;
   public d.h w;
   public ArrayDeque x;
   public boolean y;
   public boolean z;

   public t() {
      Collections.synchronizedMap(new HashMap());
      new CopyOnWriteArrayList();
      this.k = new CopyOnWriteArrayList();
      this.l = new m(this, 0);
      this.m = new m(this, 1);
      this.n = new m(this, 2);
      this.o = new m(this, 3);
      this.p = new p(this);
      this.q = -1;
      this.t = new q(this);
      this.x = new ArrayDeque();
      this.F = new r(this);
   }

   public final void a() {
      this.b = false;
      this.C.clear();
      this.B.clear();
   }

   public final HashSet b() {
      HashSet var1 = new HashSet();
      Iterator var2 = this.c.b().iterator();
      if (!var2.hasNext()) {
         return var1;
      } else {
         P.d.a(var2.next());
         throw null;
      }
   }

   public final void c(int var1) {
      Throwable var10000;
      label266: {
         Iterator var3;
         boolean var10001;
         try {
            this.b = true;
            var3 = this.c.b.values().iterator();
         } catch (Throwable var32) {
            var10000 = var32;
            var10001 = false;
            break label266;
         }

         while(true) {
            label268: {
               try {
                  if (var3.hasNext()) {
                     if (var3.next() == null) {
                        continue;
                     }
                     break label268;
                  }
               } catch (Throwable var33) {
                  var10000 = var33;
                  var10001 = false;
                  break;
               }

               boolean var2;
               try {
                  this.h(var1, false);
                  var3 = this.b().iterator();
                  var2 = var3.hasNext();
               } catch (Throwable var31) {
                  var10000 = var31;
                  var10001 = false;
                  break;
               }

               if (!var2) {
                  this.b = false;
                  this.e(true);
                  return;
               }

               try {
                  ((A)var3.next()).a();
                  throw null;
               } catch (Throwable var30) {
                  var10000 = var30;
                  var10001 = false;
                  break;
               }
            }

            try {
               ClassCastException var35 = new ClassCastException();
               throw var35;
            } catch (Throwable var29) {
               var10000 = var29;
               var10001 = false;
               break;
            }
         }
      }

      Throwable var34 = var10000;
      this.b = false;
      throw var34;
   }

   public final void d(boolean var1) {
      if (this.b) {
         throw new IllegalStateException("FragmentManager is already executing transactions");
      } else if (this.r == null) {
         if (this.A) {
            throw new IllegalStateException("FragmentManager has been destroyed");
         } else {
            throw new IllegalStateException("FragmentManager has not been attached to a host.");
         }
      } else if (Looper.myLooper() != this.r.b.getLooper()) {
         throw new IllegalStateException("Must be called from main thread of fragment host");
      } else if (!var1 && (this.y || this.z)) {
         throw new IllegalStateException("Can not perform this action after onSaveInstanceState");
      } else {
         if (this.B == null) {
            this.B = new ArrayList();
            this.C = new ArrayList();
         }

      }
   }

   public final boolean e(boolean var1) {
      this.d(var1);
      var1 = false;

      while(true) {
         ArrayList var7 = this.B;
         ArrayList var6 = this.C;
         ArrayList var5 = this.a;
         synchronized(var5){}

         boolean var2;
         label646: {
            label652: {
               Throwable var64;
               Throwable var10000;
               boolean var10001;
               label658: {
                  try {
                     if (this.a.isEmpty()) {
                        break label652;
                     }
                  } catch (Throwable var63) {
                     var10000 = var63;
                     var10001 = false;
                     break label658;
                  }

                  label655: {
                     int var4;
                     try {
                        var4 = this.a.size();
                     } catch (Throwable var62) {
                        var10000 = var62;
                        var10001 = false;
                        break label655;
                     }

                     int var3 = 0;
                     var2 = false;

                     while(true) {
                        if (var3 >= var4) {
                           try {
                              this.a.clear();
                              this.r.b.removeCallbacks(this.F);
                              break label646;
                           } catch (Throwable var60) {
                              var10000 = var60;
                              var10001 = false;
                              break label658;
                           }
                        }

                        try {
                           ((a)this.a.get(var3)).c(var7, var6);
                        } catch (Throwable var61) {
                           var10000 = var61;
                           var10001 = false;
                           break;
                        }

                        ++var3;
                        var2 = true;
                     }
                  }

                  var64 = var10000;

                  label620:
                  try {
                     this.a.clear();
                     this.r.b.removeCallbacks(this.F);
                     throw var64;
                  } catch (Throwable var59) {
                     var10000 = var59;
                     var10001 = false;
                     break label620;
                  }
               }

               while(true) {
                  var64 = var10000;

                  try {
                     throw var64;
                  } catch (Throwable var58) {
                     var10000 = var58;
                     var10001 = false;
                     continue;
                  }
               }
            }

            var2 = false;
         }

         if (!var2) {
            this.j();
            this.c.b.values().removeAll(Collections.singleton((Object)null));
            return var1;
         }

         this.b = true;

         try {
            this.i(this.B, this.C);
         } finally {
            this.a();
         }

         var1 = true;
      }
   }

   public final void f(ArrayList var1, ArrayList var2, int var3, int var4) {
      boolean var9 = ((a)var1.get(var3)).o;
      ArrayList var10 = this.D;
      if (var10 == null) {
         this.D = new ArrayList();
      } else {
         var10.clear();
      }

      this.D.addAll(this.c.c());
      int var6 = var3;

      int var5;
      int var8;
      y var11;
      ArrayList var12;
      ArrayList var13;
      boolean var17;
      a var19;
      for(boolean var7 = false; var6 < var4; var7 = var17) {
         var19 = (a)var1.get(var6);
         if (!(Boolean)var2.get(var6)) {
            ArrayList var21 = this.D;
            var5 = 0;

            while(true) {
               var12 = var19.a;
               if (var5 >= var12.size()) {
                  break;
               }

               label195: {
                  y var15 = (y)var12.get(var5);
                  var8 = var15.a;
                  if (var8 != 1) {
                     if (var8 == 2) {
                        throw null;
                     }

                     Object var14;
                     androidx.lifecycle.o var24;
                     if (var8 == 3 || var8 == 6) {
                        var21.remove((Object)null);
                        var14 = new Object();
                        ((y)var14).a = 9;
                        ((y)var14).b = false;
                        var24 = androidx.lifecycle.o.e;
                        ((y)var14).g = var24;
                        ((y)var14).h = var24;
                        var12.add(var5, var14);
                        ++var5;
                        break label195;
                     }

                     if (var8 != 7) {
                        if (var8 == 8) {
                           var14 = new Object();
                           ((y)var14).a = 9;
                           ((y)var14).b = true;
                           var24 = androidx.lifecycle.o.e;
                           ((y)var14).g = var24;
                           ((y)var14).h = var24;
                           var12.add(var5, var14);
                           var15.b = true;
                           ++var5;
                        }
                        break label195;
                     }
                  }

                  var21.add((Object)null);
               }

               ++var5;
            }
         } else {
            var13 = this.D;
            var12 = var19.a;

            for(var5 = var12.size() - 1; var5 >= 0; --var5) {
               label217: {
                  var11 = (y)var12.get(var5);
                  var8 = var11.a;
                  if (var8 != 1) {
                     if (var8 == 3) {
                        break label217;
                     }

                     switch (var8) {
                        case 6:
                           break label217;
                        case 7:
                           break;
                        case 8:
                        case 9:
                        default:
                           continue;
                        case 10:
                           var11.h = var11.g;
                           continue;
                     }
                  }

                  var13.remove((Object)null);
                  continue;
               }

               var13.add((Object)null);
            }
         }

         if (!var7 && !var19.g) {
            var17 = false;
         } else {
            var17 = true;
         }

         ++var6;
      }

      this.D.clear();
      Iterator var20;
      if (!var9 && this.q >= 1) {
         for(var5 = var3; var5 < var4; ++var5) {
            var20 = ((a)var1.get(var5)).a.iterator();

            while(var20.hasNext()) {
               ((y)var20.next()).getClass();
            }
         }
      }

      for(var5 = var3; var5 < var4; ++var5) {
         var19 = (a)var1.get(var5);
         StringBuilder var16;
         int var18;
         if ((Boolean)var2.get(var5)) {
            var19.a(-1);
            var12 = var19.a;

            for(var6 = var12.size() - 1; var6 >= 0; --var6) {
               var11 = (y)var12.get(var6);
               var11.getClass();
               var18 = var11.a;
               u var25 = var19.p;
               switch (var18) {
                  case 1:
                     throw null;
                  case 2:
                  default:
                     var16 = new StringBuilder("Unknown cmd: ");
                     var16.append(var11.a);
                     throw new IllegalArgumentException(var16.toString());
                  case 3:
                     throw null;
                  case 4:
                     throw null;
                  case 5:
                     throw null;
                  case 6:
                     throw null;
                  case 7:
                     throw null;
                  case 8:
                     var25.getClass();
                     break;
                  case 9:
                     var25.getClass();
                     break;
                  case 10:
                     var25.getClass();
                     throw null;
               }
            }
         } else {
            var19.a(1);
            var13 = var19.a;
            var18 = var13.size();

            for(var6 = 0; var6 < var18; ++var6) {
               var11 = (y)var13.get(var6);
               var11.getClass();
               var8 = var11.a;
               u var23 = var19.p;
               switch (var8) {
                  case 1:
                     throw null;
                  case 2:
                  default:
                     var16 = new StringBuilder("Unknown cmd: ");
                     var16.append(var11.a);
                     throw new IllegalArgumentException(var16.toString());
                  case 3:
                     throw null;
                  case 4:
                     throw null;
                  case 5:
                     throw null;
                  case 6:
                     throw null;
                  case 7:
                     throw null;
                  case 8:
                     var23.getClass();
                     break;
                  case 9:
                     var23.getClass();
                     break;
                  case 10:
                     var23.getClass();
                     throw null;
               }
            }
         }
      }

      var9 = (Boolean)var2.get(var4 - 1);

      for(var5 = var3; var5 < var4; ++var5) {
         var19 = (a)var1.get(var5);
         if (var9) {
            for(var6 = var19.a.size() - 1; var6 >= 0; --var6) {
               ((y)var19.a.get(var6)).getClass();
            }
         } else {
            var20 = var19.a.iterator();

            while(var20.hasNext()) {
               ((y)var20.next()).getClass();
            }
         }
      }

      this.h(this.q, true);
      HashSet var22 = new HashSet();

      for(var5 = var3; var5 < var4; ++var5) {
         var20 = ((a)var1.get(var5)).a.iterator();

         while(var20.hasNext()) {
            ((y)var20.next()).getClass();
         }
      }

      var20 = var22.iterator();
      if (!var20.hasNext()) {
         while(var3 < var4) {
            var19 = (a)var1.get(var3);
            if ((Boolean)var2.get(var3) && var19.q >= 0) {
               var19.q = -1;
            }

            var19.getClass();
            ++var3;
         }

      } else {
         ((A)var20.next()).getClass();
         throw null;
      }
   }

   public final void g() {
      x var2 = this.c;
      ArrayList var3 = var2.a;

      for(int var1 = var3.size() - 1; var1 >= 0; --var1) {
         if (var3.get(var1) != null) {
            throw new ClassCastException();
         }
      }

      Iterator var4 = var2.b.values().iterator();

      while(var4.hasNext()) {
         P.d.a(var4.next());
      }

   }

   public final void h(int var1, boolean var2) {
      if (this.r == null && var1 != -1) {
         throw new IllegalStateException("No activity");
      } else if (var2 || var1 != this.q) {
         this.q = var1;
         x var3 = this.c;
         Iterator var4 = var3.a.iterator();
         if (!var4.hasNext()) {
            var4 = var3.b.values().iterator();

            do {
               if (!var4.hasNext()) {
                  Iterator var5 = var3.b().iterator();
                  if (!var5.hasNext()) {
                     return;
                  }

                  var5.next().getClass();
                  throw new ClassCastException();
               }
            } while(var4.next() == null);

            throw new ClassCastException();
         } else {
            var4.next().getClass();
            throw new ClassCastException();
         }
      }
   }

   public final void i(ArrayList var1, ArrayList var2) {
      if (!var1.isEmpty()) {
         if (var1.size() != var2.size()) {
            throw new IllegalStateException("Internal error with the back stack records");
         } else {
            int var7 = var1.size();
            int var3 = 0;

            int var4;
            int var5;
            for(var5 = 0; var3 < var7; var5 = var4) {
               int var6 = var3;
               var4 = var5;
               if (!((a)var1.get(var3)).o) {
                  if (var5 != var3) {
                     this.f(var1, var2, var5, var3);
                  }

                  var5 = var3 + 1;
                  var4 = var5;
                  if ((Boolean)var2.get(var3)) {
                     while(true) {
                        var4 = var5;
                        if (var5 >= var7) {
                           break;
                        }

                        var4 = var5;
                        if (!(Boolean)var2.get(var5)) {
                           break;
                        }

                        var4 = var5;
                        if (((a)var1.get(var5)).o) {
                           break;
                        }

                        ++var5;
                     }
                  }

                  this.f(var1, var2, var3, var4);
                  var6 = var4 - 1;
               }

               var3 = var6 + 1;
            }

            if (var5 != var7) {
               this.f(var1, var2, var5, var7);
            }

         }
      }
   }

   public final void j() {
      ArrayList var4 = this.a;
      synchronized(var4){}

      Throwable var10000;
      boolean var10001;
      label431: {
         boolean var3;
         try {
            var3 = this.a.isEmpty();
         } catch (Throwable var47) {
            var10000 = var47;
            var10001 = false;
            break label431;
         }

         boolean var2 = true;
         if (!var3) {
            label435: {
               b.s var50;
               try {
                  o var5 = this.g;
                  var5.a = true;
                  var50 = var5.c;
               } catch (Throwable var45) {
                  var10000 = var45;
                  var10001 = false;
                  break label435;
               }

               if (var50 != null) {
                  try {
                     var50.b();
                  } catch (Throwable var44) {
                     var10000 = var44;
                     var10001 = false;
                     break label435;
                  }
               }

               label417:
               try {
                  return;
               } catch (Throwable var43) {
                  var10000 = var43;
                  var10001 = false;
                  break label417;
               }
            }
         } else {
            label436: {
               try {
                  ;
               } catch (Throwable var46) {
                  var10000 = var46;
                  var10001 = false;
                  break label436;
               }

               o var48 = this.g;
               ArrayList var52 = this.d;
               int var1;
               if (var52 != null) {
                  var1 = var52.size();
               } else {
                  var1 = 0;
               }

               if (var1 <= 0) {
                  var2 = false;
               }

               var48.a = var2;
               b.s var49 = var48.c;
               if (var49 != null) {
                  var49.b();
               }

               return;
            }
         }
      }

      while(true) {
         Throwable var51 = var10000;

         try {
            throw var51;
         } catch (Throwable var42) {
            var10000 = var42;
            var10001 = false;
            continue;
         }
      }
   }

   public final String toString() {
      StringBuilder var2 = new StringBuilder(128);
      var2.append("FragmentManager{");
      var2.append(Integer.toHexString(System.identityHashCode(this)));
      var2.append(" in ");
      h var1 = this.r;
      if (var1 != null) {
         var2.append(var1.getClass().getSimpleName());
         var2.append("{");
         var2.append(Integer.toHexString(System.identityHashCode(this.r)));
         var2.append("}");
      } else {
         var2.append("null");
      }

      var2.append("}}");
      return var2.toString();
   }
}
