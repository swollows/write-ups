package androidx.fragment.app;

import android.os.Bundle;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

public final class e implements Q.d {
   public final int a;
   public final Object b;

   // $FF: synthetic method
   public e(int var1, Object var2) {
      this.a = var1;
      this.b = var2;
   }

   public final Bundle a() {
      switch (this.a) {
         case 0:
            androidx.appcompat.app.k var4 = (androidx.appcompat.app.k)this.b;
            var4.markFragmentsCreated();
            var4.mFragmentLifecycleRegistry.e(androidx.lifecycle.n.ON_STOP);
            return new Bundle();
         default:
            u var8 = (u)this.b;
            var8.getClass();
            Bundle var7 = new Bundle();
            Iterator var42 = var8.b().iterator();

            while(var42.hasNext()) {
               ((A)var42.next()).getClass();
            }

            var42 = var8.b().iterator();
            boolean var3 = var42.hasNext();
            BackStackRecordState[] var6 = null;
            if (var3) {
               ((A)var42.next()).a();
               throw null;
            } else {
               var8.e(true);
               var8.y = true;
               var8.E.getClass();
               x var43 = var8.c;
               var43.getClass();
               HashMap var44 = var43.b;
               ArrayList var10 = new ArrayList(var44.size());
               var42 = var44.values().iterator();

               while(var42.hasNext()) {
                  if (var42.next() != null) {
                     throw new ClassCastException();
                  }
               }

               var43 = var8.c;
               var43.getClass();
               ArrayList var9 = new ArrayList(var43.c.values());
               if (var9.isEmpty()) {
                  if (Log.isLoggable("FragmentManager", 2)) {
                     Log.v("FragmentManager", "saveAllState: no fragments!");
                  }
               } else {
                  x var11 = var8.c;
                  ArrayList var5 = var11.a;
                  synchronized(var5){}

                  ArrayList var46;
                  label762: {
                     label782: {
                        Throwable var10000;
                        boolean var10001;
                        label783: {
                           try {
                              if (var11.a.isEmpty()) {
                                 break label782;
                              }
                           } catch (Throwable var41) {
                              var10000 = var41;
                              var10001 = false;
                              break label783;
                           }

                           Iterator var57;
                           try {
                              var46 = new ArrayList(var11.a.size());
                              var57 = var11.a.iterator();
                              if (!var57.hasNext()) {
                                 break label762;
                              }
                           } catch (Throwable var39) {
                              var10000 = var39;
                              var10001 = false;
                              break label783;
                           }

                           try {
                              if (var57.next() == null) {
                                 throw null;
                              }
                           } catch (Throwable var40) {
                              var10000 = var40;
                              var10001 = false;
                              break label783;
                           }

                           label740:
                           try {
                              ClassCastException var52 = new ClassCastException();
                              throw var52;
                           } catch (Throwable var38) {
                              var10000 = var38;
                              var10001 = false;
                              break label740;
                           }
                        }

                        while(true) {
                           Throwable var48 = var10000;

                           try {
                              throw var48;
                           } catch (Throwable var37) {
                              var10000 = var37;
                              var10001 = false;
                              continue;
                           }
                        }
                     }

                     var46 = null;
                  }

                  ArrayList var58 = var8.d;
                  BackStackRecordState[] var45 = var6;
                  if (var58 != null) {
                     int var2 = var58.size();
                     var45 = var6;
                     if (var2 > 0) {
                        var6 = new BackStackRecordState[var2];
                        int var1 = 0;

                        while(true) {
                           var45 = var6;
                           if (var1 >= var2) {
                              break;
                           }

                           var6[var1] = new BackStackRecordState((a)var8.d.get(var1));
                           if (Log.isLoggable("FragmentManager", 2)) {
                              StringBuilder var47 = new StringBuilder("saveAllState: adding back stack #");
                              var47.append(var1);
                              var47.append(": ");
                              var47.append(var8.d.get(var1));
                              Log.v("FragmentManager", var47.toString());
                           }

                           ++var1;
                        }
                     }
                  }

                  FragmentManagerState var49 = new FragmentManagerState();
                  var49.a = var10;
                  var49.b = var46;
                  var49.c = var45;
                  var49.d = var8.h.get();
                  var49.f.addAll(var8.i.keySet());
                  var49.g.addAll(var8.i.values());
                  var49.h = new ArrayList(var8.x);
                  var7.putParcelable("state", var49);
                  var42 = var8.j.keySet().iterator();

                  while(var42.hasNext()) {
                     String var50 = (String)var42.next();
                     StringBuilder var51 = new StringBuilder("result_");
                     var51.append(var50);
                     var7.putBundle(var51.toString(), (Bundle)var8.j.get(var50));
                  }

                  Iterator var53 = var9.iterator();

                  while(var53.hasNext()) {
                     FragmentState var55 = (FragmentState)var53.next();
                     Bundle var54 = new Bundle();
                     var54.putParcelable("state", var55);
                     StringBuilder var56 = new StringBuilder("fragment_");
                     var56.append(var55.b);
                     var7.putBundle(var56.toString(), var54);
                  }
               }

               return var7;
            }
      }
   }
}
