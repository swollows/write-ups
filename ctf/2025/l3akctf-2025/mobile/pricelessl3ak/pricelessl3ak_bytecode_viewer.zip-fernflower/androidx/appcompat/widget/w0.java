package androidx.appcompat.widget;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;

public final class w0 extends Drawable implements Drawable.Callback {
   public Drawable a;
   public boolean b;

   public final void a(Canvas var1) {
      this.a.draw(var1);
   }

   public final void b(float var1, float var2) {
      this.a.setHotspot(var1, var2);
   }

   public final void c(int var1, int var2, int var3, int var4) {
      this.a.setHotspotBounds(var1, var2, var3, var4);
   }

   public final boolean d(boolean var1, boolean var2) {
      if (!super.setVisible(var1, var2) && !this.a.setVisible(var1, var2)) {
         var1 = false;
      } else {
         var1 = true;
      }

      return var1;
   }

   public final void draw(Canvas var1) {
      if (this.b) {
         this.a(var1);
      }

   }

   public final int getChangingConfigurations() {
      return this.a.getChangingConfigurations();
   }

   public final Drawable getCurrent() {
      return this.a.getCurrent();
   }

   public final int getIntrinsicHeight() {
      return this.a.getIntrinsicHeight();
   }

   public final int getIntrinsicWidth() {
      return this.a.getIntrinsicWidth();
   }

   public final int getMinimumHeight() {
      return this.a.getMinimumHeight();
   }

   public final int getMinimumWidth() {
      return this.a.getMinimumWidth();
   }

   public final int getOpacity() {
      return this.a.getOpacity();
   }

   public final boolean getPadding(Rect var1) {
      return this.a.getPadding(var1);
   }

   public final int[] getState() {
      return this.a.getState();
   }

   public final Region getTransparentRegion() {
      return this.a.getTransparentRegion();
   }

   public final void invalidateDrawable(Drawable var1) {
      this.invalidateSelf();
   }

   public final boolean isAutoMirrored() {
      return this.a.isAutoMirrored();
   }

   public final boolean isStateful() {
      return this.a.isStateful();
   }

   public final void jumpToCurrentState() {
      this.a.jumpToCurrentState();
   }

   public final void onBoundsChange(Rect var1) {
      this.a.setBounds(var1);
   }

   public final boolean onLevelChange(int var1) {
      return this.a.setLevel(var1);
   }

   public final void scheduleDrawable(Drawable var1, Runnable var2, long var3) {
      this.scheduleSelf(var2, var3);
   }

   public final void setAlpha(int var1) {
      this.a.setAlpha(var1);
   }

   public final void setAutoMirrored(boolean var1) {
      this.a.setAutoMirrored(var1);
   }

   public final void setChangingConfigurations(int var1) {
      this.a.setChangingConfigurations(var1);
   }

   public final void setColorFilter(ColorFilter var1) {
      this.a.setColorFilter(var1);
   }

   public final void setDither(boolean var1) {
      this.a.setDither(var1);
   }

   public final void setFilterBitmap(boolean var1) {
      this.a.setFilterBitmap(var1);
   }

   public final void setHotspot(float var1, float var2) {
      if (this.b) {
         this.b(var1, var2);
      }

   }

   public final void setHotspotBounds(int var1, int var2, int var3, int var4) {
      if (this.b) {
         this.c(var1, var2, var3, var4);
      }

   }

   public final boolean setState(int[] var1) {
      return this.b ? this.a.setState(var1) : false;
   }

   public final void setTint(int var1) {
      this.a.setTint(var1);
   }

   public final void setTintList(ColorStateList var1) {
      this.a.setTintList(var1);
   }

   public final void setTintMode(PorterDuff.Mode var1) {
      this.a.setTintMode(var1);
   }

   public final boolean setVisible(boolean var1, boolean var2) {
      return this.b ? this.d(var1, var2) : false;
   }

   public final void unscheduleDrawable(Drawable var1, Runnable var2) {
      this.unscheduleSelf(var2);
   }
}
