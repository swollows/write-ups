package w;

import A.k;
import A.p;
import A.q;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.os.Trace;
import android.os.Build.VERSION;
import android.util.Log;
import androidx.appcompat.app.o;
import androidx.appcompat.widget.Z;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

public abstract class e {
   public static final q.e a;
   public static final m.j b;

   static {
      C.b.d("TypefaceCompat static init");
      int var0 = VERSION.SDK_INT;
      if (var0 >= 29) {
         a = new q.e(3);
      } else if (var0 >= 28) {
         a = new h();
      } else if (var0 >= 26) {
         a = new h();
      } else {
         Method var1 = g.c;
         if (var1 == null) {
            Log.w("TypefaceCompatApi24Impl", "Unable to collect necessary private methods.Fallback to legacy implementation.");
         }

         if (var1 != null) {
            a = new q.e(3);
         } else {
            a = new q.e(3);
         }
      }

      b = new m.j(16);
      Trace.endSection();
   }

   public static Typeface a(Context var0, v.d var1, Resources var2, int var3, String var4, int var5, int var6, Z var7) {
      Throwable var10000;
      boolean var10001;
      label766: {
         Typeface var78;
         if (!(var1 instanceof v.g)) {
            var78 = a.i(var0, (v.e)var1, var2, var6);
            if (var78 != null) {
               (new Handler(Looper.getMainLooper())).post(new o(var7, var78, 2));
            } else {
               var7.a();
            }
         } else {
            Object var13;
            v.g var16;
            Typeface var82;
            label751: {
               var16 = (v.g)var1;
               String var80 = var16.e;
               var13 = null;
               if (var80 != null && !var80.isEmpty()) {
                  var82 = Typeface.create(var80, 0);
                  Typeface var14 = Typeface.create(Typeface.DEFAULT, 0);
                  if (var82 != null && !var82.equals(var14)) {
                     break label751;
                  }
               }

               var82 = null;
            }

            if (var82 != null) {
               (new Handler(Looper.getMainLooper())).post(new o(var7, var82, 2));
               return var82;
            }

            boolean var8;
            if (var16.d == 0) {
               var8 = true;
            } else {
               var8 = false;
            }

            int var10 = var16.c;
            Handler var101 = new Handler(Looper.getMainLooper());
            D.d var15 = new D.d(19);
            var15.b = var7;
            A.g var85 = var16.b;
            List var87;
            ArrayList var89;
            Object var97;
            A.g var98;
            ArrayList var106;
            if (var85 != null) {
               A.g var17 = var16.a;
               var106 = new ArrayList(2);

               for(int var9 = 0; var9 < 2; ++var9) {
                  var97 = (new Object[]{var17, var85})[var9];
                  Objects.requireNonNull(var97);
                  var106.add(var97);
               }

               var87 = Collections.unmodifiableList(var106);
            } else {
               var98 = var16.a;
               var89 = new ArrayList(1);
               var97 = (new Object[]{var98})[0];
               Objects.requireNonNull(var97);
               var89.add(var97);
               var87 = Collections.unmodifiableList(var89);
            }

            p var108 = new p(var101);
            A.c var102 = new A.c(var15, var108);
            String var107;
            if (var8) {
               if (var87.size() > 1) {
                  throw new IllegalArgumentException("Fallbacks with blocking fetches are not supported for performance reasons");
               }

               var98 = (A.g)var87.get(0);
               m.j var91 = k.a;
               var106 = new ArrayList(1);
               Object var92 = (new Object[]{var98})[0];
               Objects.requireNonNull(var92);
               var106.add(var92);
               var107 = k.a(Collections.unmodifiableList(var106), var6);
               var82 = (Typeface)k.a.a(var107);
               if (var82 != null) {
                  var108.execute(new A.a(var15, var82, 0));
                  var78 = var82;
               } else {
                  A.j var79;
                  if (var10 == -1) {
                     var89 = new ArrayList(1);
                     var97 = (new Object[]{var98})[0];
                     Objects.requireNonNull(var97);
                     var89.add(var97);
                     var79 = k.b(var107, var0, Collections.unmodifiableList(var89), var6);
                     var102.i(var79);
                     var78 = var79.a;
                  } else {
                     label761: {
                        A.h var81 = new A.h(var107, var0, var98, var6, 0);

                        label762: {
                           Future var83;
                           try {
                              var83 = k.b.submit(var81);
                           } catch (InterruptedException var74) {
                              var10001 = false;
                              break label762;
                           }

                           long var11 = (long)var10;

                           InterruptedException var84;
                           Object var88;
                           try {
                              var88 = var83.get(var11, TimeUnit.MILLISECONDS);
                           } catch (ExecutionException var71) {
                              ExecutionException var95 = var71;

                              try {
                                 RuntimeException var86 = new RuntimeException(var95);
                                 throw var86;
                              } catch (InterruptedException var68) {
                                 var10001 = false;
                                 break label762;
                              }
                           } catch (InterruptedException var72) {
                              var84 = var72;

                              try {
                                 throw var84;
                              } catch (InterruptedException var69) {
                                 var10001 = false;
                                 break label762;
                              }
                           } catch (TimeoutException var73) {
                              try {
                                 var84 = new InterruptedException("timeout");
                                 throw var84;
                              } catch (InterruptedException var67) {
                                 var10001 = false;
                                 break label762;
                              }
                           }

                           try {
                              var79 = (A.j)var88;
                              var102.i(var79);
                              var78 = var79.a;
                              break label761;
                           } catch (InterruptedException var70) {
                              var10001 = false;
                           }
                        }

                        A.b var90 = new A.b((D.d)var102.a, -3);
                        ((p)var102.b).execute(var90);
                        var78 = (Typeface)var13;
                     }
                  }
               }
            } else {
               var107 = k.a(var87, var6);
               Typeface var99 = (Typeface)k.a.a(var107);
               if (var99 != null) {
                  var108.execute(new A.a(var15, var99, 0));
                  var78 = var99;
               } else {
                  A.i var103 = new A.i(0, var102);
                  var97 = k.c;
                  synchronized(var97){}

                  m.k var104;
                  ArrayList var109;
                  try {
                     var104 = k.d;
                     var109 = (ArrayList)var104.get(var107);
                  } catch (Throwable var77) {
                     var10000 = var77;
                     var10001 = false;
                     break label766;
                  }

                  if (var109 != null) {
                     try {
                        var109.add(var103);
                     } catch (Throwable var76) {
                        var10000 = var76;
                        var10001 = false;
                        break label766;
                     }

                     var78 = (Typeface)var13;
                  } else {
                     try {
                        var109 = new ArrayList();
                        var109.add(var103);
                        var104.put(var107, var109);
                     } catch (Throwable var75) {
                        var10000 = var75;
                        var10001 = false;
                        break label766;
                     }

                     A.h var96 = new A.h(var107, var0, var87, var6, 1);
                     ThreadPoolExecutor var100 = k.b;
                     var103 = new A.i(1, var107);
                     Handler var94;
                     if (Looper.myLooper() == null) {
                        var94 = new Handler(Looper.getMainLooper());
                     } else {
                        var94 = new Handler();
                     }

                     Object var105 = new Object();
                     ((q)var105).a = var96;
                     ((q)var105).b = var103;
                     ((q)var105).c = var94;
                     var100.execute((Runnable)var105);
                     var78 = (Typeface)var13;
                  }
               }
            }
         }

         if (var78 != null) {
            b.b(b(var2, var3, var4, var5, var6), var78);
         }

         return var78;
      }

      while(true) {
         Throwable var93 = var10000;

         try {
            throw var93;
         } catch (Throwable var66) {
            var10000 = var66;
            var10001 = false;
            continue;
         }
      }
   }

   public static String b(Resources var0, int var1, String var2, int var3, int var4) {
      StringBuilder var5 = new StringBuilder();
      var5.append(var0.getResourcePackageName(var1));
      var5.append('-');
      var5.append(var2);
      var5.append('-');
      var5.append(var3);
      var5.append('-');
      var5.append(var1);
      var5.append('-');
      var5.append(var4);
      return var5.toString();
   }
}
