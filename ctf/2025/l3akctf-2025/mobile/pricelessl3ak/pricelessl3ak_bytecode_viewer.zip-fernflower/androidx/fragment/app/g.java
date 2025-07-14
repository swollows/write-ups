package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import androidx.lifecycle.S;
import java.io.PrintWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class g implements c.b {
   public final androidx.appcompat.app.k a;

   // $FF: synthetic method
   public g(androidx.appcompat.app.k var1) {
      this.a = var1;
   }

   public final void a(b.l var1) {
      h var10 = this.a.mFragments.a;
      u var17 = var10.c;
      if (var17.r == null) {
         var17.r = var10;
         var17.s = var10;
         var17.k.add(var10);
         androidx.appcompat.app.k var20 = var10.d;
         b.t var11 = var20.getOnBackPressedDispatcher();
         var17.f = var11;
         var11.getClass();
         o var12 = var17.g;
         i0.d.e(var12, "onBackPressedCallback");
         androidx.lifecycle.w var13 = var20.mFragmentLifecycleRegistry;
         if (var13.c != androidx.lifecycle.o.a) {
            b.q var33 = new b.q(var11, var13, var12);
            var12.b.add(var33);
            var11.d();
            var12.c = new b.s(0, var11);
         }

         w var23 = (w)(new S(var20.getViewModelStore(), w.f)).a(w.class);
         var17.E = var23;
         x var21 = var17.c;
         var21.d = var23;
         h var25 = var17.r;
         if (var25 != null) {
            Q.e var26 = var25.d.getSavedStateRegistry();
            var26.c("android:support:fragments", new e(1, var17));
            Bundle var28 = var26.a("android:support:fragments");
            if (var28 != null) {
               Iterator var29 = var28.keySet().iterator();

               String var14;
               while(var29.hasNext()) {
                  var14 = (String)var29.next();
                  if (var14.startsWith("result_")) {
                     Bundle var35 = var28.getBundle(var14);
                     if (var35 != null) {
                        var35.setClassLoader(var17.r.a.getClassLoader());
                        var14 = var14.substring(7);
                        var17.j.put(var14, var35);
                     }
                  }
               }

               ArrayList var30 = new ArrayList();
               Iterator var37 = var28.keySet().iterator();

               while(var37.hasNext()) {
                  var14 = (String)var37.next();
                  if (var14.startsWith("fragment_")) {
                     Bundle var43 = var28.getBundle(var14);
                     if (var43 != null) {
                        var43.setClassLoader(var17.r.a.getClassLoader());
                        var30.add((FragmentState)var43.getParcelable("state"));
                     }
                  }
               }

               HashMap var40 = var21.c;
               var40.clear();
               var29 = var30.iterator();

               FragmentState var44;
               while(var29.hasNext()) {
                  var44 = (FragmentState)var29.next();
                  var40.put(var44.b, var44);
               }

               FragmentManagerState var31 = (FragmentManagerState)var28.getParcelable("state");
               if (var31 != null) {
                  HashMap var34 = var21.b;
                  var34.clear();
                  Iterator var15 = var31.a.iterator();

                  while(var15.hasNext()) {
                     var44 = (FragmentState)var40.remove((String)var15.next());
                     if (var44 != null) {
                        if (var17.E.b.get(var44.b) == null) {
                           ClassLoader var22 = var17.r.a.getClassLoader();
                           String var32 = var44.a;
                           var17.t.a(var32);
                           Bundle var18 = var44.j;
                           if (var18 != null) {
                              var18.setClassLoader(var22);
                           }

                           throw null;
                        }

                        throw new ClassCastException();
                     }
                  }

                  w var42 = var17.E;
                  var42.getClass();
                  var37 = (new ArrayList(var42.b.values())).iterator();
                  if (var37.hasNext()) {
                     var37.next().getClass();
                     throw new ClassCastException();
                  }

                  ArrayList var45 = var31.b;
                  var21.a.clear();
                  if (var45 != null) {
                     var37 = var45.iterator();
                     if (var37.hasNext()) {
                        String var19 = (String)var37.next();
                        P.d.a(var34.get(var19));
                        StringBuilder var38 = new StringBuilder("No instantiated fragment for (");
                        var38.append(var19);
                        var38.append(")");
                        throw new IllegalStateException(var38.toString());
                     }
                  }

                  int var2;
                  if (var31.c == null) {
                     var17.d = null;
                  } else {
                     var17.d = new ArrayList(var31.c.length);
                     int var3 = 0;

                     label141:
                     while(true) {
                        BackStackRecordState[] var36 = var31.c;
                        if (var3 >= var36.length) {
                           break;
                        }

                        BackStackRecordState var48 = var36[var3];
                        var48.getClass();
                        a var39 = new a(var17);
                        var2 = 0;
                        int var4 = 0;

                        while(true) {
                           int[] var46 = var48.a;
                           int var5 = var46.length;
                           boolean var9 = true;
                           if (var2 >= var5) {
                              var39.f = var48.e;
                              var39.h = var48.f;
                              var39.g = true;
                              var39.i = var48.h;
                              var39.j = var48.i;
                              var39.k = var48.j;
                              var39.l = var48.k;
                              var39.m = var48.l;
                              var39.n = var48.m;
                              var39.o = var48.n;
                              var39.q = var48.g;
                              var2 = 0;

                              while(true) {
                                 ArrayList var50 = var48.b;
                                 if (var2 >= var50.size()) {
                                    var39.a(1);
                                    if (Log.isLoggable("FragmentManager", 2)) {
                                       StringBuilder var51 = new StringBuilder("restoreAllState: back stack #");
                                       var51.append(var3);
                                       var51.append(" (index ");
                                       var51.append(var39.q);
                                       var51.append("): ");
                                       var51.append(var39);
                                       Log.v("FragmentManager", var51.toString());
                                       PrintWriter var52 = new PrintWriter(new z());
                                       var39.b("  ", var52, false);
                                       var52.close();
                                    }

                                    var17.d.add(var39);
                                    ++var3;
                                    continue label141;
                                 }

                                 String var47 = (String)var50.get(var2);
                                 if (var47 != null) {
                                    y var53 = (y)var39.a.get(var2);
                                    P.d.a(var21.b.get(var47));
                                    var53.getClass();
                                 }

                                 ++var2;
                              }
                           }

                           Object var49 = new Object();
                           var5 = var2 + 1;
                           ((y)var49).a = var46[var2];
                           if (Log.isLoggable("FragmentManager", 2)) {
                              StringBuilder var16 = new StringBuilder("Instantiate ");
                              var16.append(var39);
                              var16.append(" op #");
                              var16.append(var4);
                              var16.append(" base fragment #");
                              var16.append(var46[var5]);
                              Log.v("FragmentManager", var16.toString());
                           }

                           ((y)var49).g = androidx.lifecycle.o.values()[var48.c[var4]];
                           ((y)var49).h = androidx.lifecycle.o.values()[var48.d[var4]];
                           if (var46[var5] == 0) {
                              var9 = false;
                           }

                           ((y)var49).b = var9;
                           int var7 = var46[var2 + 2];
                           ((y)var49).c = var7;
                           int var8 = var46[var2 + 3];
                           ((y)var49).d = var8;
                           int var6 = var46[var2 + 4];
                           ((y)var49).e = var6;
                           var5 = var2 + 6;
                           var2 = var46[var2 + 5];
                           ((y)var49).f = var2;
                           var39.b = var7;
                           var39.c = var8;
                           var39.d = var6;
                           var39.e = var2;
                           var39.a.add(var49);
                           ((y)var49).c = var39.b;
                           ((y)var49).d = var39.c;
                           ((y)var49).e = var39.d;
                           ((y)var49).f = var39.e;
                           ++var4;
                           var2 = var5;
                        }
                     }
                  }

                  var17.h.set(var31.d);
                  String var41 = var31.e;
                  if (var41 != null) {
                     P.d.a(var21.b.get(var41));
                  }

                  ArrayList var24 = var31.f;
                  if (var24 != null) {
                     for(var2 = 0; var2 < var24.size(); ++var2) {
                        var41 = (String)var24.get(var2);
                        BackStackState var54 = (BackStackState)var31.g.get(var2);
                        var17.i.put(var41, var54);
                     }
                  }

                  var17.x = new ArrayDeque(var31.h);
               }
            }
         }

         var10 = var17.r;
         if (var10 != null) {
            d.i var27 = var10.d.getActivityResultRegistry();
            var17.u = var27.b("FragmentManager:StartActivityForResult", new s(2), new n(var17, 1));
            var17.v = var27.b("FragmentManager:StartIntentSenderForResult", new s(0), new n(var17, 2));
            var17.w = var27.b("FragmentManager:RequestPermissions", new s(1), new n(var17, 0));
         }

         var10 = var17.r;
         if (var10 != null) {
            var10.d.addOnConfigurationChangedListener(var17.l);
         }

         var10 = var17.r;
         if (var10 != null) {
            var10.d.addOnTrimMemoryListener(var17.m);
         }

         var10 = var17.r;
         if (var10 != null) {
            var10.d.addOnMultiWindowModeChangedListener(var17.n);
         }

         var10 = var17.r;
         if (var10 != null) {
            var10.d.addOnPictureInPictureModeChangedListener(var17.o);
         }

         var10 = var17.r;
         if (var10 != null) {
            var10.d.addMenuProvider(var17.p);
         }

      } else {
         throw new IllegalStateException("Already attached");
      }
   }
}
