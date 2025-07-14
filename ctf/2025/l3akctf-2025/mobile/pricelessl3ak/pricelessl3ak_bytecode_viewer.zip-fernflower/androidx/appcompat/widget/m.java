package androidx.appcompat.widget;

import D.d;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.SparseBooleanArray;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.View.MeasureSpec;
import androidx.appcompat.view.menu.ActionMenuItemView;
import j.n;
import java.util.ArrayList;

public final class m implements j.x {
   public final Context a;
   public Context b;
   public j.l c;
   public final LayoutInflater d;
   public j.w e;
   public final int f;
   public final int g;
   public j.z h;
   public k i;
   public Drawable j;
   public boolean k;
   public boolean l;
   public boolean m;
   public int n;
   public int o;
   public int p;
   public boolean q;
   public final SparseBooleanArray r;
   public g s;
   public g t;
   public i u;
   public h v;
   public final d w;

   public m(Context var1) {
      this.a = var1;
      this.d = LayoutInflater.from(var1);
      this.f = 2131427331;
      this.g = 2131427330;
      this.r = new SparseBooleanArray();
      this.w = new d(11, this);
   }

   public final void a(j.l var1, boolean var2) {
      this.g();
      g var3 = this.t;
      if (var3 != null && var3.b()) {
         var3.i.dismiss();
      }

      j.w var4 = this.e;
      if (var4 != null) {
         var4.a(var1, var2);
      }

   }

   public final View b(n var1, View var2, ViewGroup var3) {
      View var6 = var1.getActionView();
      byte var4 = 0;
      if (var6 == null || var1.e()) {
         j.y var9;
         if (var2 instanceof j.y) {
            var9 = (j.y)var2;
         } else {
            int var5 = this.g;
            var9 = (j.y)this.d.inflate(var5, var3, false);
         }

         var9.c(var1);
         ActionMenuView var7 = (ActionMenuView)this.h;
         ActionMenuItemView var11 = (ActionMenuItemView)var9;
         var11.setItemInvoker(var7);
         if (this.v == null) {
            this.v = new h(this);
         }

         var11.setPopupCallback(this.v);
         var6 = (View)var9;
      }

      if (var1.C) {
         var4 = 8;
      }

      var6.setVisibility(var4);
      ActionMenuView var8 = (ActionMenuView)var3;
      ViewGroup.LayoutParams var10 = var6.getLayoutParams();
      var8.getClass();
      if (!(var10 instanceof p)) {
         var6.setLayoutParams(ActionMenuView.j(var10));
      }

      return var6;
   }

   public final void c() {
      ViewGroup var8 = (ViewGroup)this.h;
      p var7 = null;
      boolean var4 = false;
      int var1;
      int var2;
      j.l var6;
      ViewGroup var15;
      if (var8 != null) {
         var6 = this.c;
         if (var6 != null) {
            var6.i();
            ArrayList var9 = this.c.l();
            int var5 = var9.size();
            int var3 = 0;
            var1 = 0;

            while(true) {
               var2 = var1;
               if (var3 >= var5) {
                  break;
               }

               n var10 = (n)var9.get(var3);
               var2 = var1;
               if (var10.f()) {
                  View var11 = var8.getChildAt(var1);
                  n var14;
                  if (var11 instanceof j.y) {
                     var14 = ((j.y)var11).getItemData();
                  } else {
                     var14 = null;
                  }

                  View var12 = this.b(var10, var11, var8);
                  if (var10 != var14) {
                     var12.setPressed(false);
                     var12.jumpDrawablesToCurrentState();
                  }

                  if (var12 != var11) {
                     var15 = (ViewGroup)var12.getParent();
                     if (var15 != null) {
                        var15.removeView(var12);
                     }

                     ((ViewGroup)this.h).addView(var12, var1);
                  }

                  var2 = var1 + 1;
               }

               ++var3;
               var1 = var2;
            }
         } else {
            var2 = 0;
         }

         while(var2 < var8.getChildCount()) {
            if (var8.getChildAt(var2) == this.i) {
               ++var2;
            } else {
               var8.removeViewAt(var2);
            }
         }
      }

      ((View)this.h).requestLayout();
      var6 = this.c;
      if (var6 != null) {
         var6.i();
         ArrayList var18 = var6.i;
         var2 = var18.size();

         for(var1 = 0; var1 < var2; ++var1) {
            j.o var17 = ((n)var18.get(var1)).A;
         }
      }

      j.l var20 = this.c;
      ArrayList var19 = var7;
      if (var20 != null) {
         var20.i();
         var19 = var20.j;
      }

      boolean var13 = var4;
      if (this.l) {
         var13 = var4;
         if (var19 != null) {
            var2 = var19.size();
            if (var2 == 1) {
               var13 = ((n)var19.get(0)).C ^ true;
            } else {
               var13 = var4;
               if (var2 > 0) {
                  var13 = true;
               }
            }
         }
      }

      k var22;
      if (var13) {
         if (this.i == null) {
            this.i = new k(this, this.a);
         }

         var15 = (ViewGroup)this.i.getParent();
         if (var15 != this.h) {
            if (var15 != null) {
               var15.removeView(this.i);
            }

            ActionMenuView var21 = (ActionMenuView)this.h;
            var22 = this.i;
            var21.getClass();
            var7 = ActionMenuView.i();
            var7.a = true;
            var21.addView(var22, var7);
         }
      } else {
         var22 = this.i;
         if (var22 != null) {
            ViewParent var23 = var22.getParent();
            j.z var16 = this.h;
            if (var23 == var16) {
               ((ViewGroup)var16).removeView(this.i);
            }
         }
      }

      ((ActionMenuView)this.h).setOverflowReserved(this.l);
   }

   public final boolean d(n var1) {
      return false;
   }

   public final void e(Context var1, j.l var2) {
      this.b = var1;
      LayoutInflater.from(var1);
      this.c = var2;
      Resources var9 = var1.getResources();
      if (!this.m) {
         this.l = true;
      }

      int var5 = var1.getResources().getDisplayMetrics().widthPixels;
      int var4 = 2;
      this.n = var5 / 2;
      Configuration var7 = var1.getResources().getConfiguration();
      var5 = var7.screenWidthDp;
      int var6 = var7.screenHeightDp;
      if (var7.smallestScreenWidthDp > 600 || var5 > 600 || var5 > 960 && var6 > 720 || var5 > 720 && var6 > 960) {
         var4 = 5;
      } else if (var5 < 500 && (var5 <= 640 || var6 <= 480) && (var5 <= 480 || var6 <= 640)) {
         if (var5 >= 360) {
            var4 = 3;
         }
      } else {
         var4 = 4;
      }

      this.p = var4;
      var4 = this.n;
      if (this.l) {
         if (this.i == null) {
            k var8 = new k(this, this.a);
            this.i = var8;
            if (this.k) {
               var8.setImageDrawable(this.j);
               this.j = null;
               this.k = false;
            }

            var5 = MeasureSpec.makeMeasureSpec(0, 0);
            this.i.measure(var5, var5);
         }

         var4 -= this.i.getMeasuredWidth();
      } else {
         this.i = null;
      }

      this.o = var4;
      float var3 = var9.getDisplayMetrics().density;
   }

   public final boolean f() {
      j.l var14 = this.c;
      int var6;
      ArrayList var21;
      if (var14 != null) {
         var21 = var14.l();
         var6 = var21.size();
      } else {
         var6 = 0;
         var21 = null;
      }

      int var7 = this.p;
      int var8 = this.o;
      int var9 = MeasureSpec.makeMeasureSpec(0, 0);
      ViewGroup var15 = (ViewGroup)this.h;
      int var3 = 0;
      int var5 = 0;
      int var2 = var5;
      int var4 = var5;

      int var1;
      for(var1 = var7; var3 < var6; var1 = var7) {
         n var16 = (n)var21.get(var3);
         var7 = var16.y;
         if ((var7 & 2) == 2) {
            ++var4;
         } else if ((var7 & 1) == 1) {
            ++var2;
         } else {
            var5 = 1;
         }

         var7 = var1;
         if (this.q) {
            var7 = var1;
            if (var16.C) {
               var7 = 0;
            }
         }

         ++var3;
      }

      var3 = var1;
      if (this.l) {
         label122: {
            if (var5 == 0) {
               var3 = var1;
               if (var2 + var4 <= var1) {
                  break label122;
               }
            }

            var3 = var1 - 1;
         }
      }

      var1 = var3 - var4;
      SparseBooleanArray var22 = this.r;
      var22.clear();
      var7 = 0;
      var2 = 0;

      for(var5 = var8; var7 < var6; var5 = var4) {
         n var17 = (n)var21.get(var7);
         var4 = var17.y;
         boolean var20;
         if ((var4 & 2) == 2) {
            var20 = true;
         } else {
            var20 = false;
         }

         label114: {
            int var10 = var17.b;
            View var18;
            if (var20) {
               var18 = this.b(var17, (View)null, var15);
               var18.measure(var9, var9);
               var8 = var18.getMeasuredWidth();
               var4 = var5 - var8;
               var3 = var2;
               if (var2 == 0) {
                  var3 = var8;
               }

               if (var10 != 0) {
                  var22.put(var10, true);
               }

               var17.g(true);
            } else {
               if ((var4 & 1) != 1) {
                  var17.g(false);
                  var4 = var5;
                  break label114;
               }

               boolean var13 = var22.get(var10);
               boolean var11;
               if ((var1 > 0 || var13) && var5 > 0) {
                  var11 = true;
               } else {
                  var11 = false;
               }

               var4 = var5;
               var3 = var2;
               boolean var12 = var11;
               if (var11) {
                  var18 = this.b(var17, (View)null, var15);
                  var18.measure(var9, var9);
                  var8 = var18.getMeasuredWidth();
                  var4 = var5 - var8;
                  var3 = var2;
                  if (var2 == 0) {
                     var3 = var8;
                  }

                  boolean var19;
                  if (var4 + var3 > 0) {
                     var19 = true;
                  } else {
                     var19 = false;
                  }

                  var12 = var11 & var19;
               }

               if (var12 && var10 != 0) {
                  var22.put(var10, true);
                  var2 = var1;
               } else {
                  var2 = var1;
                  if (var13) {
                     var22.put(var10, false);
                     var5 = 0;

                     while(true) {
                        var2 = var1;
                        if (var5 >= var7) {
                           break;
                        }

                        n var23 = (n)var21.get(var5);
                        var2 = var1;
                        if (var23.b == var10) {
                           var2 = var1;
                           if (var23.f()) {
                              var2 = var1 + 1;
                           }

                           var23.g(false);
                        }

                        ++var5;
                        var1 = var2;
                     }
                  }
               }

               var1 = var2;
               if (var12) {
                  var1 = var2 - 1;
               }

               var17.g(var12);
            }

            var2 = var3;
         }

         ++var7;
      }

      return true;
   }

   public final boolean g() {
      i var1 = this.u;
      if (var1 != null) {
         j.z var2 = this.h;
         if (var2 != null) {
            ((View)var2).removeCallbacks(var1);
            this.u = null;
            return true;
         }
      }

      g var3 = this.s;
      if (var3 != null) {
         if (var3.b()) {
            var3.i.dismiss();
         }

         return true;
      } else {
         return false;
      }
   }

   public final void h(j.w var1) {
      throw null;
   }

   public final boolean i(j.D var1) {
      if (!var1.hasVisibleItems()) {
         return false;
      } else {
         j.D var5 = var1;

         while(true) {
            j.l var6 = var5.z;
            if (var6 == this.c) {
               ViewGroup var8 = (ViewGroup)this.h;
               Object var7 = null;
               int var2;
               int var3;
               View var11;
               if (var8 == null) {
                  var11 = (View)var7;
               } else {
                  var3 = var8.getChildCount();
                  var2 = 0;

                  while(true) {
                     var11 = (View)var7;
                     if (var2 >= var3) {
                        break;
                     }

                     var11 = var8.getChildAt(var2);
                     if (var11 instanceof j.y && ((j.y)var11).getItemData() == var5.A) {
                        break;
                     }

                     ++var2;
                  }
               }

               if (var11 == null) {
                  return false;
               } else {
                  var1.A.getClass();
                  var3 = var1.f.size();
                  var2 = 0;

                  boolean var4;
                  while(true) {
                     if (var2 >= var3) {
                        var4 = false;
                        break;
                     }

                     MenuItem var9 = var1.getItem(var2);
                     if (var9.isVisible() && var9.getIcon() != null) {
                        var4 = true;
                        break;
                     }

                     ++var2;
                  }

                  g var10 = new g(this, this.b, var1, var11);
                  this.t = var10;
                  var10.g = var4;
                  j.t var12 = var10.i;
                  if (var12 != null) {
                     var12.o(var4);
                  }

                  var10 = this.t;
                  if (!var10.b()) {
                     if (var10.e == null) {
                        throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                     }

                     var10.d(0, 0, false, false);
                  }

                  j.w var13 = this.e;
                  if (var13 != null) {
                     var13.c(var1);
                  }

                  return true;
               }
            }

            var5 = (j.D)var6;
         }
      }
   }

   public final boolean j(n var1) {
      return false;
   }

   public final boolean k() {
      g var2 = this.s;
      boolean var1;
      if (var2 != null && var2.b()) {
         var1 = true;
      } else {
         var1 = false;
      }

      return var1;
   }

   public final boolean l() {
      if (this.l && !this.k()) {
         j.l var1 = this.c;
         if (var1 != null && this.h != null && this.u == null) {
            var1.i();
            if (!var1.j.isEmpty()) {
               i var2 = new i(this, new g(this, this.b, this.c, this.i));
               this.u = var2;
               ((View)this.h).post(var2);
               return true;
            }
         }
      }

      return false;
   }
}
