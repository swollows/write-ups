package androidx.appcompat.view.menu;

import X.h;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import g.a;
import j.l;
import j.n;
import j.y;

public class ListMenuItemView extends LinearLayout implements y, AbsListView.SelectionBoundsAdjuster {
   public n a;
   public ImageView b;
   public RadioButton c;
   public TextView d;
   public CheckBox e;
   public TextView f;
   public ImageView g;
   public ImageView h;
   public LinearLayout i;
   public final Drawable j;
   public final int k;
   public final Context l;
   public boolean m;
   public final Drawable n;
   public final boolean o;
   public LayoutInflater p;
   public boolean q;

   public ListMenuItemView(Context var1, AttributeSet var2) {
      super(var1, var2);
      h var5 = X.h.m(this.getContext(), var2, g.a.r, 2130903207);
      this.j = var5.h(5);
      TypedArray var3 = (TypedArray)var5.b;
      this.k = var3.getResourceId(1, -1);
      this.m = var3.getBoolean(7, false);
      this.l = var1;
      this.n = var5.h(8);
      TypedArray var4 = var1.getTheme().obtainStyledAttributes((AttributeSet)null, new int[]{16843049}, 2130903160, 0);
      this.o = var4.hasValue(0);
      var5.o();
      var4.recycle();
   }

   private LayoutInflater getInflater() {
      if (this.p == null) {
         this.p = LayoutInflater.from(this.getContext());
      }

      return this.p;
   }

   private void setSubMenuArrowVisible(boolean var1) {
      ImageView var3 = this.g;
      if (var3 != null) {
         byte var2;
         if (var1) {
            var2 = 0;
         } else {
            var2 = 8;
         }

         var3.setVisibility(var2);
      }

   }

   public final void adjustListItemSelectionBounds(Rect var1) {
      ImageView var3 = this.h;
      if (var3 != null && var3.getVisibility() == 0) {
         LinearLayout.LayoutParams var4 = (LinearLayout.LayoutParams)this.h.getLayoutParams();
         int var2 = var1.top;
         var1.top = this.h.getHeight() + var4.topMargin + var4.bottomMargin + var2;
      }

   }

   public final void c(n var1) {
      this.a = var1;
      boolean var5 = var1.isVisible();
      int var4 = 0;
      char var3;
      if (var5) {
         var3 = 0;
      } else {
         var3 = '\b';
      }

      boolean var11;
      label82: {
         this.setVisibility(var3);
         this.setTitle(var1.e);
         this.setCheckable(var1.isCheckable());
         if (var1.n.o()) {
            if (var1.n.n()) {
               var3 = var1.j;
            } else {
               var3 = var1.h;
            }

            if (var3 != 0) {
               var11 = true;
               break label82;
            }
         }

         var11 = false;
      }

      byte var14;
      label76: {
         var1.n.n();
         if (var11) {
            label73: {
               n var6 = this.a;
               if (var6.n.o()) {
                  if (var6.n.n()) {
                     var3 = var6.j;
                  } else {
                     var3 = var6.h;
                  }

                  if (var3 != 0) {
                     var11 = true;
                     break label73;
                  }
               }

               var11 = false;
            }

            if (var11) {
               var14 = (byte)var4;
               break label76;
            }
         }

         var14 = 8;
      }

      if (var14 == 0) {
         TextView var7 = this.f;
         n var8 = this.a;
         char var2;
         if (var8.n.n()) {
            var2 = var8.j;
         } else {
            var2 = var8.h;
         }

         String var12;
         if (var2 == 0) {
            var12 = "";
         } else {
            l var10 = var8.n;
            Resources var13 = var10.a.getResources();
            StringBuilder var9 = new StringBuilder();
            if (ViewConfiguration.get(var10.a).hasPermanentMenuKey()) {
               var9.append(var13.getString(2131558417));
            }

            if (var10.n()) {
               var4 = var8.k;
            } else {
               var4 = var8.i;
            }

            j.n.c(var9, var4, 65536, var13.getString(2131558413));
            j.n.c(var9, var4, 4096, var13.getString(2131558409));
            j.n.c(var9, var4, 2, var13.getString(2131558408));
            j.n.c(var9, var4, 1, var13.getString(2131558414));
            j.n.c(var9, var4, 4, var13.getString(2131558416));
            j.n.c(var9, var4, 8, var13.getString(2131558412));
            if (var2 != '\b') {
               if (var2 != '\n') {
                  if (var2 != ' ') {
                     var9.append(var2);
                  } else {
                     var9.append(var13.getString(2131558415));
                  }
               } else {
                  var9.append(var13.getString(2131558411));
               }
            } else {
               var9.append(var13.getString(2131558410));
            }

            var12 = var9.toString();
         }

         var7.setText(var12);
      }

      if (this.f.getVisibility() != var14) {
         this.f.setVisibility(var14);
      }

      this.setIcon(var1.getIcon());
      this.setEnabled(var1.isEnabled());
      this.setSubMenuArrowVisible(var1.hasSubMenu());
      this.setContentDescription(var1.q);
   }

   public n getItemData() {
      return this.a;
   }

   public final void onFinishInflate() {
      super.onFinishInflate();
      this.setBackground(this.j);
      TextView var2 = (TextView)this.findViewById(2131230897);
      this.d = var2;
      int var1 = this.k;
      if (var1 != -1) {
         var2.setTextAppearance(this.l, var1);
      }

      this.f = (TextView)this.findViewById(2131230864);
      ImageView var3 = (ImageView)this.findViewById(2131230874);
      this.g = var3;
      if (var3 != null) {
         var3.setImageDrawable(this.n);
      }

      this.h = (ImageView)this.findViewById(2131230812);
      this.i = (LinearLayout)this.findViewById(2131230795);
   }

   public final void onMeasure(int var1, int var2) {
      if (this.b != null && this.m) {
         ViewGroup.LayoutParams var5 = this.getLayoutParams();
         LinearLayout.LayoutParams var4 = (LinearLayout.LayoutParams)this.b.getLayoutParams();
         int var3 = var5.height;
         if (var3 > 0 && var4.width <= 0) {
            var4.width = var3;
         }
      }

      super.onMeasure(var1, var2);
   }

   public void setCheckable(boolean var1) {
      if (var1 || this.c != null || this.e != null) {
         RadioButton var2;
         LinearLayout var3;
         Object var4;
         CheckBox var5;
         Object var6;
         if ((this.a.x & 4) != 0) {
            if (this.c == null) {
               var2 = (RadioButton)this.getInflater().inflate(2131427345, this, false);
               this.c = var2;
               var3 = this.i;
               if (var3 != null) {
                  var3.addView(var2, -1);
               } else {
                  this.addView(var2, -1);
               }
            }

            var4 = this.c;
            var6 = this.e;
         } else {
            if (this.e == null) {
               var5 = (CheckBox)this.getInflater().inflate(2131427342, this, false);
               this.e = var5;
               var3 = this.i;
               if (var3 != null) {
                  var3.addView(var5, -1);
               } else {
                  this.addView(var5, -1);
               }
            }

            var4 = this.e;
            var6 = this.c;
         }

         if (var1) {
            ((CompoundButton)var4).setChecked(this.a.isChecked());
            if (((View)var4).getVisibility() != 0) {
               ((View)var4).setVisibility(0);
            }

            if (var6 != null && ((View)var6).getVisibility() != 8) {
               ((View)var6).setVisibility(8);
            }
         } else {
            var5 = this.e;
            if (var5 != null) {
               var5.setVisibility(8);
            }

            var2 = this.c;
            if (var2 != null) {
               var2.setVisibility(8);
            }
         }

      }
   }

   public void setChecked(boolean var1) {
      LinearLayout var3;
      Object var4;
      if ((this.a.x & 4) != 0) {
         if (this.c == null) {
            RadioButton var2 = (RadioButton)this.getInflater().inflate(2131427345, this, false);
            this.c = var2;
            var3 = this.i;
            if (var3 != null) {
               var3.addView(var2, -1);
            } else {
               this.addView(var2, -1);
            }
         }

         var4 = this.c;
      } else {
         if (this.e == null) {
            CheckBox var5 = (CheckBox)this.getInflater().inflate(2131427342, this, false);
            this.e = var5;
            var3 = this.i;
            if (var3 != null) {
               var3.addView(var5, -1);
            } else {
               this.addView(var5, -1);
            }
         }

         var4 = this.e;
      }

      ((CompoundButton)var4).setChecked(var1);
   }

   public void setForceShowIcon(boolean var1) {
      this.q = var1;
      this.m = var1;
   }

   public void setGroupDividerEnabled(boolean var1) {
      ImageView var3 = this.h;
      if (var3 != null) {
         byte var2;
         if (!this.o && var1) {
            var2 = 0;
         } else {
            var2 = 8;
         }

         var3.setVisibility(var2);
      }

   }

   public void setIcon(Drawable var1) {
      this.a.n.getClass();
      boolean var2 = this.q;
      if (var2 || this.m) {
         ImageView var3 = this.b;
         if (var3 != null || var1 != null || this.m) {
            if (var3 == null) {
               var3 = (ImageView)this.getInflater().inflate(2131427343, this, false);
               this.b = var3;
               LinearLayout var4 = this.i;
               if (var4 != null) {
                  var4.addView(var3, 0);
               } else {
                  this.addView(var3, 0);
               }
            }

            if (var1 == null && !this.m) {
               this.b.setVisibility(8);
            } else {
               var3 = this.b;
               if (!var2) {
                  var1 = null;
               }

               var3.setImageDrawable(var1);
               if (this.b.getVisibility() != 0) {
                  this.b.setVisibility(0);
               }
            }

         }
      }
   }

   public void setTitle(CharSequence var1) {
      if (var1 != null) {
         this.d.setText(var1);
         if (this.d.getVisibility() != 0) {
            this.d.setVisibility(0);
         }
      } else if (this.d.getVisibility() != 8) {
         this.d.setVisibility(8);
      }

   }
}
