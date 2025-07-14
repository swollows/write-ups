package i;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.AttributeSet;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import androidx.appcompat.widget.s0;
import g.a;
import j.o;

public final class i extends MenuInflater {
   public static final Class[] e;
   public static final Class[] f;
   public final Object[] a;
   public final Object[] b;
   public final Context c;
   public Object d;

   static {
      Class[] var0 = new Class[]{Context.class};
      e = var0;
      f = var0;
   }

   public i(Context var1) {
      super(var1);
      this.c = var1;
      Object[] var2 = new Object[]{var1};
      this.a = var2;
      this.b = var2;
   }

   public static Object a(Object var0) {
      if (var0 instanceof Activity) {
         return var0;
      } else {
         Object var1 = var0;
         if (var0 instanceof ContextWrapper) {
            var1 = a(((ContextWrapper)var0).getBaseContext());
         }

         return var1;
      }
   }

   public final void b(XmlResourceParser var1, AttributeSet var2, Menu var3) {
      h var13 = new h(this, var3);
      int var5 = var1.getEventType();

      int var7;
      int var9;
      String var17;
      while(true) {
         var9 = 1;
         if (var5 == 2) {
            var17 = var1.getName();
            if (!var17.equals("menu")) {
               throw new RuntimeException("Expecting menu, got ".concat(var17));
            }

            var7 = var1.next();
            break;
         }

         var5 = var1.next();
         if (var5 == 1) {
            var7 = var5;
            break;
         }
      }

      byte var6 = 0;
      boolean var8 = false;
      var17 = null;
      byte var18 = (byte)var9;

      boolean var20;
      for(var9 = var7; var6 == 0; var8 = var20) {
         if (var9 == var18) {
            throw new RuntimeException("Unexpected end of document");
         }

         label124: {
            int var10;
            String var12;
            CharSequence var22;
            if (var9 != 2) {
               if (var9 == 3) {
                  var12 = var1.getName();
                  if (var8 && var12.equals(var17)) {
                     var20 = false;
                     var17 = null;
                     break label124;
                  }

                  if (var12.equals("group")) {
                     var13.b = 0;
                     var13.c = 0;
                     var13.d = 0;
                     var13.e = 0;
                     var13.f = (boolean)var18;
                     var13.g = (boolean)var18;
                  } else if (var12.equals("item")) {
                     if (!var13.h) {
                        o var21 = var13.z;
                        if (var21 != null && var21.b.hasSubMenu()) {
                           var13.h = (boolean)var18;
                           var7 = var13.b;
                           var9 = var13.i;
                           var10 = var13.j;
                           var22 = var13.k;
                           var13.b(var13.a.addSubMenu(var7, var9, var10, var22).getItem());
                        } else {
                           var13.h = (boolean)var18;
                           var9 = var13.b;
                           var10 = var13.i;
                           var7 = var13.j;
                           var22 = var13.k;
                           var13.b(var13.a.add(var9, var10, var7, var22));
                        }
                     }
                  } else if (var12.equals("menu")) {
                     var6 = var18;
                  }
               }
            } else if (!var8) {
               var12 = var1.getName();
               boolean var11 = var12.equals("group");
               i var15 = var13.E;
               if (!var11) {
                  if (var12.equals("item")) {
                     Context var25 = var15.c;
                     TypedArray var14 = var25.obtainStyledAttributes(var2, g.a.q);
                     var13.i = var14.getResourceId(2, 0);
                     var13.j = var14.getInt(5, var13.c) & -65536 | var14.getInt(6, var13.d) & '\uffff';
                     var13.k = var14.getText(7);
                     var13.l = var14.getText(8);
                     var13.m = var14.getResourceId(0, 0);
                     String var16 = var14.getString(9);
                     char var4;
                     if (var16 == null) {
                        var4 = 0;
                     } else {
                        var4 = var16.charAt(0);
                     }

                     var13.n = var4;
                     var13.o = var14.getInt(16, 4096);
                     var16 = var14.getString(10);
                     if (var16 == null) {
                        var4 = 0;
                     } else {
                        var4 = var16.charAt(0);
                     }

                     var13.p = var4;
                     var13.q = var14.getInt(20, 4096);
                     if (var14.hasValue(11)) {
                        var13.r = var14.getBoolean(11, false);
                     } else {
                        var13.r = var13.e;
                     }

                     var13.s = var14.getBoolean(3, false);
                     var13.t = var14.getBoolean(4, var13.f);
                     var13.u = var14.getBoolean(1, var13.g);
                     var13.v = var14.getInt(21, -1);
                     var13.y = var14.getString(12);
                     var13.w = var14.getResourceId(13, 0);
                     var13.x = var14.getString(15);
                     var16 = var14.getString(14);
                     boolean var19;
                     if (var16 != null) {
                        var19 = true;
                     } else {
                        var19 = false;
                     }

                     if (var19 && var13.w == 0 && var13.x == null) {
                        var13.z = (o)var13.a(var16, f, var15.b);
                     } else {
                        if (var19) {
                           Log.w("SupportMenuInflater", "Ignoring attribute 'actionProviderClass'. Action view already specified.");
                        }

                        var13.z = null;
                     }

                     var13.A = var14.getText(17);
                     var13.B = var14.getText(22);
                     if (var14.hasValue(19)) {
                        var13.D = s0.b(var14.getInt(19, -1), var13.D);
                     } else {
                        var13.D = null;
                     }

                     if (var14.hasValue(18)) {
                        ColorStateList var26;
                        label106: {
                           if (var14.hasValue(18)) {
                              var5 = var14.getResourceId(18, 0);
                              if (var5 != 0) {
                                 var26 = C.b.l(var25, var5);
                                 if (var26 != null) {
                                    break label106;
                                 }
                              }
                           }

                           var26 = var14.getColorStateList(18);
                        }

                        var13.C = var26;
                     } else {
                        var13.C = null;
                     }

                     var14.recycle();
                     var13.h = false;
                     var18 = 1;
                     var20 = var8;
                     break label124;
                  }

                  if (var12.equals("menu")) {
                     var18 = 1;
                     var13.h = true;
                     var10 = var13.b;
                     var7 = var13.i;
                     var9 = var13.j;
                     var22 = var13.k;
                     SubMenu var24 = var13.a.addSubMenu(var10, var7, var9, var22);
                     var13.b(var24.getItem());
                     this.b(var1, var2, var24);
                     var20 = var8;
                  } else {
                     var18 = 1;
                     var17 = var12;
                     var20 = true;
                  }
                  break label124;
               }

               TypedArray var23 = var15.c.obtainStyledAttributes(var2, g.a.p);
               var13.b = var23.getResourceId(var18, 0);
               var13.c = var23.getInt(3, 0);
               var13.d = var23.getInt(4, 0);
               var13.e = var23.getInt(5, 0);
               var13.f = var23.getBoolean(2, (boolean)var18);
               var13.g = var23.getBoolean(0, (boolean)var18);
               var23.recycle();
            }

            var20 = var8;
         }

         var9 = var1.next();
      }

   }

   public final void inflate(int param1, Menu param2) {
      // $FF: Couldn't be decompiled
   }
}
