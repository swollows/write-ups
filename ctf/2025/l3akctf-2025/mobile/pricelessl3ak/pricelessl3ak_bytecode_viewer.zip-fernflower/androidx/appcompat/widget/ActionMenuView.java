package androidx.appcompat.widget;

import D.d;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.MeasureSpec;
import android.view.accessibility.AccessibilityEvent;
import android.widget.LinearLayout;
import androidx.appcompat.app.O;
import androidx.appcompat.view.menu.ActionMenuItemView;
import j.n;

public class ActionMenuView extends D0 implements j.k, j.z {
   public q A;
   public j.l p;
   public Context q;
   public int r;
   public boolean s;
   public m t;
   public O u;
   public j.j v;
   public boolean w;
   public int x;
   public final int y;
   public final int z;

   public ActionMenuView(Context var1, AttributeSet var2) {
      super(var1, var2);
      this.setBaselineAligned(false);
      float var3 = var1.getResources().getDisplayMetrics().density;
      this.y = (int)(56.0F * var3);
      this.z = (int)(var3 * 4.0F);
      this.q = var1;
      this.r = 0;
   }

   public static p i() {
      LinearLayout.LayoutParams var0 = new LinearLayout.LayoutParams(-2, -2);
      var0.a = false;
      var0.gravity = 16;
      return var0;
   }

   public static p j(ViewGroup.LayoutParams var0) {
      if (var0 != null) {
         LinearLayout.LayoutParams var2;
         if (var0 instanceof p) {
            p var1 = (p)var0;
            var2 = new LinearLayout.LayoutParams(var1);
            var2.a = var1.a;
         } else {
            var2 = new LinearLayout.LayoutParams(var0);
         }

         if (var2.gravity <= 0) {
            var2.gravity = 16;
         }

         return var2;
      } else {
         return i();
      }
   }

   public final void a(j.l var1) {
      this.p = var1;
   }

   public final boolean b(n var1) {
      return this.p.q(var1, (j.x)null, 0);
   }

   public final boolean checkLayoutParams(ViewGroup.LayoutParams var1) {
      return var1 instanceof p;
   }

   public final boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent var1) {
      return false;
   }

   public final C0 f(AttributeSet var1) {
      return new LinearLayout.LayoutParams(this.getContext(), var1);
   }

   public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet var1) {
      return new LinearLayout.LayoutParams(this.getContext(), var1);
   }

   public Menu getMenu() {
      if (this.p == null) {
         Context var1 = this.getContext();
         j.l var2 = new j.l(var1);
         this.p = var2;
         var2.e = new d(12, this);
         m var4 = new m(var1);
         this.t = var4;
         var4.l = true;
         var4.m = true;
         Object var3 = this.u;
         if (var3 == null) {
            var3 = new Object();
         }

         var4.e = (j.w)var3;
         this.p.b(var4, this.q);
         m var5 = this.t;
         var5.h = this;
         this.p = var5.c;
      }

      return this.p;
   }

   public Drawable getOverflowIcon() {
      this.getMenu();
      m var1 = this.t;
      k var2 = var1.i;
      Drawable var3;
      if (var2 != null) {
         var3 = var2.getDrawable();
      } else if (var1.k) {
         var3 = var1.j;
      } else {
         var3 = null;
      }

      return var3;
   }

   public int getPopupTheme() {
      return this.r;
   }

   public int getWindowAnimations() {
      return 0;
   }

   public final boolean k(int var1) {
      boolean var3 = false;
      if (var1 == 0) {
         return false;
      } else {
         View var4 = this.getChildAt(var1 - 1);
         View var5 = this.getChildAt(var1);
         boolean var2 = var3;
         if (var1 < this.getChildCount()) {
            var2 = var3;
            if (var4 instanceof androidx.appcompat.widget.n) {
               var2 = ((androidx.appcompat.widget.n)var4).b();
            }
         }

         var3 = var2;
         if (var1 > 0) {
            var3 = var2;
            if (var5 instanceof androidx.appcompat.widget.n) {
               var3 = var2 | ((androidx.appcompat.widget.n)var5).a();
            }
         }

         return var3;
      }
   }

   public final void onConfigurationChanged(Configuration var1) {
      super.onConfigurationChanged(var1);
      m var2 = this.t;
      if (var2 != null) {
         var2.c();
         if (this.t.k()) {
            this.t.g();
            this.t.l();
         }
      }

   }

   public final void onDetachedFromWindow() {
      super.onDetachedFromWindow();
      m var1 = this.t;
      if (var1 != null) {
         var1.g();
         g var2 = var1.t;
         if (var2 != null && var2.b()) {
            var2.i.dismiss();
         }
      }

   }

   public final void onLayout(boolean var1, int var2, int var3, int var4, int var5) {
      if (!this.w) {
         super.onLayout(var1, var2, var3, var4, var5);
      } else {
         int var10 = this.getChildCount();
         int var9 = (var5 - var3) / 2;
         int var11 = this.getDividerWidth();
         int var12 = var4 - var2;
         var2 = var12 - this.getPaddingRight() - this.getPaddingLeft();
         var1 = t1.a;
         boolean var17;
         if (this.getLayoutDirection() == 1) {
            var17 = true;
         } else {
            var17 = false;
         }

         var4 = 0;
         int var6 = 0;

         int var7;
         View var15;
         for(var5 = 0; var4 < var10; ++var4) {
            var15 = this.getChildAt(var4);
            if (var15.getVisibility() != 8) {
               p var16 = (p)var15.getLayoutParams();
               if (var16.a) {
                  var7 = var15.getMeasuredWidth();
                  var6 = var7;
                  if (this.k(var4)) {
                     var6 = var7 + var11;
                  }

                  int var13 = var15.getMeasuredHeight();
                  int var8;
                  if (var17) {
                     var7 = this.getPaddingLeft() + var16.leftMargin;
                     var8 = var7 + var6;
                  } else {
                     var8 = this.getWidth() - this.getPaddingRight() - var16.rightMargin;
                     var7 = var8 - var6;
                  }

                  int var14 = var9 - var13 / 2;
                  var15.layout(var7, var14, var8, var13 + var14);
                  var2 -= var6;
                  var6 = 1;
               } else {
                  var2 -= var15.getMeasuredWidth() + var16.leftMargin + var16.rightMargin;
                  this.k(var4);
                  ++var5;
               }
            }
         }

         if (var10 == 1 && var6 == 0) {
            var15 = this.getChildAt(0);
            var2 = var15.getMeasuredWidth();
            var3 = var15.getMeasuredHeight();
            var4 = var12 / 2 - var2 / 2;
            var5 = var9 - var3 / 2;
            var15.layout(var4, var5, var2 + var4, var3 + var5);
         } else {
            var4 = var5 - (var6 ^ 1);
            if (var4 > 0) {
               var2 /= var4;
            } else {
               var2 = 0;
            }

            var5 = Math.max(0, var2);
            p var18;
            View var19;
            if (var17) {
               var4 = this.getWidth() - this.getPaddingRight();

               for(var2 = 0; var2 < var10; var4 = var3) {
                  var19 = this.getChildAt(var2);
                  var18 = (p)var19.getLayoutParams();
                  var3 = var4;
                  if (var19.getVisibility() != 8) {
                     if (var18.a) {
                        var3 = var4;
                     } else {
                        var7 = var4 - var18.rightMargin;
                        var3 = var19.getMeasuredWidth();
                        var4 = var19.getMeasuredHeight();
                        var6 = var9 - var4 / 2;
                        var19.layout(var7 - var3, var6, var7, var4 + var6);
                        var3 = var7 - (var3 + var18.leftMargin + var5);
                     }
                  }

                  ++var2;
               }
            } else {
               var4 = this.getPaddingLeft();

               for(var2 = 0; var2 < var10; var4 = var3) {
                  var19 = this.getChildAt(var2);
                  var18 = (p)var19.getLayoutParams();
                  var3 = var4;
                  if (var19.getVisibility() != 8) {
                     if (var18.a) {
                        var3 = var4;
                     } else {
                        var4 += var18.leftMargin;
                        var7 = var19.getMeasuredWidth();
                        var3 = var19.getMeasuredHeight();
                        var6 = var9 - var3 / 2;
                        var19.layout(var4, var6, var4 + var7, var3 + var6);
                        var3 = var7 + var18.rightMargin + var5 + var4;
                     }
                  }

                  ++var2;
               }
            }

         }
      }
   }

   public final void onMeasure(int var1, int var2) {
      boolean var26 = this.w;
      boolean var25;
      if (MeasureSpec.getMode(var1) == 1073741824) {
         var25 = true;
      } else {
         var25 = false;
      }

      this.w = var25;
      if (var26 != var25) {
         this.x = 0;
      }

      int var6 = MeasureSpec.getSize(var1);
      if (this.w) {
         j.l var35 = this.p;
         if (var35 != null && var6 != this.x) {
            this.x = var6;
            var35.p(true);
         }
      }

      int var7 = this.getChildCount();
      p var45;
      if (this.w && var7 > 0) {
         int var12 = MeasureSpec.getMode(var2);
         var6 = MeasureSpec.getSize(var1);
         int var8 = MeasureSpec.getSize(var2);
         var7 = this.getPaddingLeft();
         var1 = this.getPaddingRight();
         int var9 = this.getPaddingTop();
         int var16 = this.getPaddingBottom() + var9;
         int var18 = ViewGroup.getChildMeasureSpec(var2, var16, -2);
         int var11 = var6 - (var1 + var7);
         var1 = this.y;
         int var10 = var11 / var1;
         if (var10 == 0) {
            this.setMeasuredDimension(var11, 0);
         } else {
            int var23 = var11 % var1 / var10 + var1;
            int var19 = this.getChildCount();
            byte var41 = 0;
            int var13 = 0;
            var6 = var13;
            var7 = var13;
            long var27 = 0L;
            int var15 = var13;
            int var14 = var13;
            var1 = var10;
            var2 = var8;
            var8 = var41;

            while(true) {
               int var24 = this.z;
               int var20;
               int var21;
               long var29;
               p var36;
               if (var15 >= var19) {
                  boolean var43;
                  if (var6 != 0 && var13 == 2) {
                     var43 = true;
                  } else {
                     var43 = false;
                  }

                  boolean var42 = false;
                  int var44 = var1;
                  var15 = var19;
                  var9 = var18;

                  boolean var39;
                  View var47;
                  for(var39 = var42; var7 > 0 && var44 > 0; var39 = true) {
                     var18 = Integer.MAX_VALUE;
                     var20 = 0;
                     var19 = 0;

                     long var31;
                     for(var31 = 0L; var19 < var15; var31 = var29) {
                        var45 = (p)this.getChildAt(var19).getLayoutParams();
                        if (!var45.d) {
                           var21 = var18;
                           var10 = var20;
                           var29 = var31;
                        } else {
                           int var22 = var45.b;
                           if (var22 < var18) {
                              var29 = 1L << var19;
                              var21 = var22;
                              var10 = 1;
                           } else {
                              var21 = var18;
                              var10 = var20;
                              var29 = var31;
                              if (var22 == var18) {
                                 var29 = var31 | 1L << var19;
                                 var10 = var20 + 1;
                                 var21 = var18;
                              }
                           }
                        }

                        ++var19;
                        var18 = var21;
                        var20 = var10;
                     }

                     var27 |= var31;
                     if (var20 > var44) {
                        break;
                     }

                     for(var1 = 0; var1 < var15; var27 = var29) {
                        var47 = this.getChildAt(var1);
                        var45 = (p)var47.getLayoutParams();
                        long var33 = (long)(1 << var1);
                        if ((var31 & var33) == 0L) {
                           var10 = var44;
                           var29 = var27;
                           if (var45.b == var18 + 1) {
                              var29 = var27 | var33;
                              var10 = var44;
                           }
                        } else {
                           if (var43 && var45.e && var44 == 1) {
                              var47.setPadding(var24 + var23, 0, var24, 0);
                           }

                           ++var45.b;
                           var45.f = true;
                           var10 = var44 - 1;
                           var29 = var27;
                        }

                        ++var1;
                        var44 = var10;
                     }
                  }

                  boolean var40;
                  if (var6 == 0 && var13 == 1) {
                     var40 = true;
                  } else {
                     var40 = false;
                  }

                  if (var44 > 0 && var27 != 0L && (var44 < var13 - 1 || var40 || var14 > 1)) {
                     float var5 = (float)Long.bitCount(var27);
                     float var3 = var5;
                     if (!var40) {
                        float var4 = var5;
                        if ((var27 & 1L) != 0L) {
                           var4 = var5;
                           if (!((p)this.getChildAt(0).getLayoutParams()).e) {
                              var4 = var5 - 0.5F;
                           }
                        }

                        var6 = var15 - 1;
                        var3 = var4;
                        if ((var27 & (long)(1 << var6)) != 0L) {
                           var3 = var4;
                           if (!((p)this.getChildAt(var6).getLayoutParams()).e) {
                              var3 = var4 - 0.5F;
                           }
                        }
                     }

                     if (var3 > 0.0F) {
                        var7 = (int)((float)(var44 * var23) / var3);
                     } else {
                        var7 = 0;
                     }

                     for(var10 = 0; var10 < var15; var39 = var40) {
                        label214: {
                           if ((var27 & (long)(1 << var10)) != 0L) {
                              View var48 = this.getChildAt(var10);
                              var36 = (p)var48.getLayoutParams();
                              if (!(var48 instanceof ActionMenuItemView)) {
                                 if (var36.a) {
                                    var36.c = var7;
                                    var36.f = true;
                                    var36.rightMargin = -var7 / 2;
                                    var40 = true;
                                 } else {
                                    if (var10 != 0) {
                                       var36.leftMargin = var7 / 2;
                                    }

                                    var40 = var39;
                                    if (var10 != var15 - 1) {
                                       var36.rightMargin = var7 / 2;
                                       var40 = var39;
                                    }
                                 }
                                 break label214;
                              }

                              var36.c = var7;
                              var36.f = true;
                              if (var10 == 0 && !var36.e) {
                                 var36.leftMargin = -var7 / 2;
                              }

                              var39 = true;
                           }

                           var40 = var39;
                        }

                        ++var10;
                     }
                  }

                  if (var39) {
                     for(var1 = 0; var1 < var15; ++var1) {
                        var47 = this.getChildAt(var1);
                        var45 = (p)var47.getLayoutParams();
                        if (var45.f) {
                           var47.measure(MeasureSpec.makeMeasureSpec(var45.b * var23 + var45.c, 1073741824), var9);
                        }
                     }
                  }

                  if (var12 != 1073741824) {
                     var2 = var8;
                  }

                  this.setMeasuredDimension(var11, var2);
                  break;
               }

               View var37 = this.getChildAt(var15);
               if (var37.getVisibility() != 8) {
                  var26 = var37 instanceof ActionMenuItemView;
                  if (var26) {
                     var37.setPadding(var24, 0, var24, 0);
                  }

                  var36 = (p)var37.getLayoutParams();
                  var36.f = false;
                  var36.c = 0;
                  var36.b = 0;
                  var36.d = false;
                  var36.leftMargin = 0;
                  var36.rightMargin = 0;
                  if (var26 && !TextUtils.isEmpty(((ActionMenuItemView)var37).getText())) {
                     var25 = true;
                  } else {
                     var25 = false;
                  }

                  var36.e = var25;
                  if (var36.a) {
                     var9 = 1;
                  } else {
                     var9 = var1;
                  }

                  p var38 = (p)var37.getLayoutParams();
                  var20 = MeasureSpec.makeMeasureSpec(MeasureSpec.getSize(var18) - var16, MeasureSpec.getMode(var18));
                  ActionMenuItemView var46;
                  if (var26) {
                     var46 = (ActionMenuItemView)var37;
                  } else {
                     var46 = null;
                  }

                  boolean var17;
                  if (var46 != null && !TextUtils.isEmpty(var46.getText())) {
                     var17 = true;
                  } else {
                     var17 = false;
                  }

                  if (var9 <= 0 || var17 && var9 < 2) {
                     var9 = 0;
                  } else {
                     var37.measure(MeasureSpec.makeMeasureSpec(var9 * var23, Integer.MIN_VALUE), var20);
                     var21 = var37.getMeasuredWidth();
                     var9 = var21 / var23;
                     var10 = var9;
                     if (var21 % var23 != 0) {
                        var10 = var9 + 1;
                     }

                     var9 = var10;
                     if (var17) {
                        var9 = var10;
                        if (var10 < 2) {
                           var9 = 2;
                        }
                     }
                  }

                  if (!var38.a && var17) {
                     var25 = true;
                  } else {
                     var25 = false;
                  }

                  var38.d = var25;
                  var38.b = var9;
                  var37.measure(MeasureSpec.makeMeasureSpec(var9 * var23, 1073741824), var20);
                  var14 = Math.max(var14, var9);
                  var10 = var7;
                  if (var36.d) {
                     var10 = var7 + 1;
                  }

                  if (var36.a) {
                     var6 = 1;
                  }

                  var1 -= var9;
                  var8 = Math.max(var8, var37.getMeasuredHeight());
                  var29 = var27;
                  if (var9 == 1) {
                     var29 = var27 | (long)(1 << var15);
                  }

                  ++var13;
                  var7 = var10;
                  var27 = var29;
               }

               ++var15;
            }
         }
      } else {
         for(var6 = 0; var6 < var7; ++var6) {
            var45 = (p)this.getChildAt(var6).getLayoutParams();
            var45.rightMargin = 0;
            var45.leftMargin = 0;
         }

         super.onMeasure(var1, var2);
      }

   }

   public void setExpandedActionViewsExclusive(boolean var1) {
      this.t.q = var1;
   }

   public void setOnMenuItemClickListener(q var1) {
      this.A = var1;
   }

   public void setOverflowIcon(Drawable var1) {
      this.getMenu();
      m var3 = this.t;
      k var2 = var3.i;
      if (var2 != null) {
         var2.setImageDrawable(var1);
      } else {
         var3.k = true;
         var3.j = var1;
      }

   }

   public void setOverflowReserved(boolean var1) {
      this.s = var1;
   }

   public void setPopupTheme(int var1) {
      if (this.r != var1) {
         this.r = var1;
         if (var1 == 0) {
            this.q = this.getContext();
         } else {
            this.q = new ContextThemeWrapper(this.getContext(), var1);
         }
      }

   }

   public void setPresenter(m var1) {
      this.t = var1;
      var1.h = this;
      this.p = var1.c;
   }
}
