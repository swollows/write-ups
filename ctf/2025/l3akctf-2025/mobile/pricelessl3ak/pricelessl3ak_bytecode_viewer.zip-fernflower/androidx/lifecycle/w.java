package androidx.lifecycle;

import android.os.Looper;
import java.lang.ref.WeakReference;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicReference;

public final class w extends p {
   public final boolean a;
   public l.a b;
   public o c;
   public final WeakReference d;
   public int e;
   public boolean f;
   public boolean g;
   public final ArrayList h;
   public final p0.b i;

   public w(u var1) {
      new AtomicReference((Object)null);
      this.a = true;
      this.b = new l.a();
      o var2 = o.b;
      this.c = var2;
      this.h = new ArrayList();
      this.d = new WeakReference(var1);
      this.i = new p0.b(var2);
   }

   public final void a(t var1) {
      ArrayList var9 = this.h;
      boolean var2 = false;
      this.d("addObserver");
      o var6 = this.c;
      o var7 = o.a;
      if (var6 != var7) {
         var7 = o.b;
      }

      Object var10 = new Object();
      HashMap var14 = x.a;
      boolean var5 = var1 instanceof s;
      boolean var4 = var1 instanceof H.k;
      o var8 = null;
      Object var15;
      if (var5 && var4) {
         var15 = new g((H.k)var1, (s)var1, 0);
      } else if (var4) {
         var15 = new g((H.k)var1, (Object)null, 0);
      } else if (var5) {
         var15 = (s)var1;
      } else {
         Class var16 = var1.getClass();
         if (x.c(var16) == 2) {
            var15 = x.b.get(var16);
            i0.d.b(var15);
            List var11 = (List)var15;
            if (var11.size() == 1) {
               x.a((Constructor)var11.get(0), var1);
               throw null;
            }

            int var3 = var11.size();
            i[] var18 = new i[var3];
            if (var3 > 0) {
               x.a((Constructor)var11.get(0), var1);
               throw null;
            }

            var15 = new e(0, var18);
         } else {
            var15 = new g(var1);
         }
      }

      ((v)var10).b = (s)var15;
      ((v)var10).a = var7;
      l.a var20 = this.b;
      l.c var17 = (l.c)var20.e.get(var1);
      v var21;
      if (var17 != null) {
         var21 = var17.b;
      } else {
         HashMap var22 = var20.e;
         var17 = new l.c(var1, (v)var10);
         ++var20.d;
         l.c var12 = var20.b;
         if (var12 == null) {
            var20.a = var17;
            var20.b = var17;
         } else {
            var12.c = var17;
            var17.d = var12;
            var20.b = var17;
         }

         var22.put(var1, var17);
         var21 = var8;
      }

      if (var21 == null) {
         u var19 = (u)this.d.get();
         if (var19 != null) {
            if (this.e != 0 || this.f) {
               var2 = true;
            }

            var6 = this.c(var1);
            ++this.e;

            while(((v)var10).a.compareTo(var6) < 0 && this.b.e.containsKey(var1)) {
               var9.add(((v)var10).a);
               l var23 = n.Companion;
               var8 = ((v)var10).a;
               var23.getClass();
               n var24 = l.b(var8);
               if (var24 == null) {
                  StringBuilder var13 = new StringBuilder("no event up from ");
                  var13.append(((v)var10).a);
                  throw new IllegalStateException(var13.toString());
               }

               ((v)var10).a(var19, var24);
               var9.remove(var9.size() - 1);
               var6 = this.c(var1);
            }

            if (!var2) {
               this.g();
            }

            --this.e;
         }
      }
   }

   public final void b(t var1) {
      i0.d.e(var1, "observer");
      this.d("removeObserver");
      l.a var2 = this.b;
      l.c var3 = (l.c)var2.e.get(var1);
      if (var3 != null) {
         --var2.d;
         WeakHashMap var4 = var2.c;
         if (!var4.isEmpty()) {
            Iterator var6 = var4.keySet().iterator();

            while(var6.hasNext()) {
               ((l.e)var6.next()).a(var3);
            }
         }

         l.c var5 = var3.d;
         if (var5 != null) {
            var5.c = var3.c;
         } else {
            var2.a = var3.c;
         }

         l.c var7 = var3.c;
         if (var7 != null) {
            var7.d = var5;
         } else {
            var2.b = var5;
         }

         var3.c = null;
         var3.d = null;
      }

      var2.e.remove(var1);
   }

   public final o c(t var1) {
      HashMap var4 = this.b.e;
      boolean var2 = var4.containsKey(var1);
      o var3 = null;
      l.c var5;
      if (var2) {
         var5 = ((l.c)var4.get(var1)).d;
      } else {
         var5 = null;
      }

      o var6;
      if (var5 != null) {
         var6 = var5.b.a;
      } else {
         var6 = null;
      }

      ArrayList var7 = this.h;
      if (!var7.isEmpty()) {
         var3 = (o)var7.get(var7.size() - 1);
      }

      o var8 = this.c;
      i0.d.e(var8, "state1");
      if (var6 == null || var6.compareTo(var8) >= 0) {
         var6 = var8;
      }

      if (var3 != null && var3.compareTo(var6) < 0) {
         var6 = var3;
      }

      return var6;
   }

   public final void d(String var1) {
      if (this.a) {
         k.a var2;
         if (k.a.p != null) {
            var2 = k.a.p;
         } else {
            synchronized(k.a.class){}

            label217: {
               Throwable var10000;
               boolean var10001;
               label218: {
                  try {
                     if (k.a.p == null) {
                        var2 = new k.a(0);
                        k.a.p = var2;
                     }
                  } catch (Throwable var14) {
                     var10000 = var14;
                     var10001 = false;
                     break label218;
                  }

                  label199:
                  try {
                     break label217;
                  } catch (Throwable var13) {
                     var10000 = var13;
                     var10001 = false;
                     break label199;
                  }
               }

               while(true) {
                  Throwable var15 = var10000;

                  try {
                     throw var15;
                  } catch (Throwable var12) {
                     var10000 = var12;
                     var10001 = false;
                     continue;
                  }
               }
            }

            var2 = k.a.p;
         }

         ((k.a)var2.o).getClass();
         if (Looper.getMainLooper().getThread() != Thread.currentThread()) {
            StringBuilder var16 = new StringBuilder("Method ");
            var16.append(var1);
            var16.append(" must be called on the main thread");
            throw new IllegalStateException(var16.toString().toString());
         }
      }

   }

   public final void e(n var1) {
      i0.d.e(var1, "event");
      this.d("handleLifecycleEvent");
      this.f(var1.a());
   }

   public final void f(o var1) {
      if (this.c != var1) {
         u var2 = (u)this.d.get();
         o var4 = this.c;
         i0.d.e(var4, "current");
         o var5 = o.b;
         o var3 = o.a;
         if (var4 == var5 && var1 == var3) {
            StringBuilder var6 = new StringBuilder("State must be at least '");
            var6.append(o.c);
            var6.append("' to be moved to '");
            var6.append(var1);
            var6.append("' in component ");
            var6.append(var2);
            throw new IllegalStateException(var6.toString().toString());
         } else if (var4 == var3 && var4 != var1) {
            StringBuilder var7 = new StringBuilder("State is '");
            var7.append(var3);
            var7.append("' and cannot be moved to `");
            var7.append(var1);
            var7.append("` in component ");
            var7.append(var2);
            throw new IllegalStateException(var7.toString().toString());
         } else {
            this.c = var1;
            if (!this.f && this.e == 0) {
               this.f = true;
               this.g();
               this.f = false;
               if (this.c == var3) {
                  this.b = new l.a();
               }

            } else {
               this.g = true;
            }
         }
      }
   }

   public final void g() {
      u var1 = (u)this.d.get();
      if (var1 == null) {
         throw new IllegalStateException("LifecycleOwner of this LifecycleRegistry is already garbage collected. It is too late to change lifecycle state.");
      } else {
         while(true) {
            l.a var2 = this.b;
            if (var2.d == 0) {
               break;
            }

            l.c var9 = var2.a;
            i0.d.b(var9);
            o var10 = var9.b.a;
            l.c var3 = this.b.b;
            i0.d.b(var3);
            o var11 = var3.b.a;
            if (var10 == var11 && this.c == var11) {
               break;
            }

            this.g = false;
            var11 = this.c;
            var9 = this.b.a;
            i0.d.b(var9);
            StringBuilder var7;
            l.a var13;
            n var20;
            ArrayList var21;
            if (var11.compareTo(var9.b.a) < 0) {
               var13 = this.b;
               l.b var12 = new l.b(var13.b, var13.a, 1);
               var13.c.put(var12, Boolean.FALSE);

               while(var12.hasNext() && !this.g) {
                  Map.Entry var15 = (Map.Entry)var12.next();
                  i0.d.b(var15);
                  t var4 = (t)var15.getKey();
                  v var17 = (v)var15.getValue();

                  while(var17.a.compareTo(this.c) > 0 && !this.g && this.b.e.containsKey(var4)) {
                     l var5 = n.Companion;
                     o var6 = var17.a;
                     var5.getClass();
                     var20 = l.a(var6);
                     if (var20 == null) {
                        var7 = new StringBuilder("no event down from ");
                        var7.append(var17.a);
                        throw new IllegalStateException(var7.toString());
                     }

                     var6 = var20.a();
                     this.h.add(var6);
                     var17.a(var1, var20);
                     var21 = this.h;
                     var21.remove(var21.size() - 1);
                  }
               }
            }

            var9 = this.b.b;
            if (!this.g && var9 != null && this.c.compareTo(var9.b.a) > 0) {
               var13 = this.b;
               var13.getClass();
               l.d var14 = new l.d(var13);
               var13.c.put(var14, Boolean.FALSE);

               while(var14.hasNext() && !this.g) {
                  Map.Entry var16 = (Map.Entry)var14.next();
                  t var19 = (t)var16.getKey();
                  v var18 = (v)var16.getValue();

                  while(var18.a.compareTo(this.c) < 0 && !this.g && this.b.e.containsKey(var19)) {
                     o var22 = var18.a;
                     this.h.add(var22);
                     l var23 = n.Companion;
                     var22 = var18.a;
                     var23.getClass();
                     var20 = l.b(var22);
                     if (var20 == null) {
                        var7 = new StringBuilder("no event up from ");
                        var7.append(var18.a);
                        throw new IllegalStateException(var7.toString());
                     }

                     var18.a(var1, var20);
                     var21 = this.h;
                     var21.remove(var21.size() - 1);
                  }
               }
            }
         }

         this.g = false;
         o var8 = this.c;
         this.i.a(var8);
      }
   }
}
