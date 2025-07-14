package com.google.android.material.progressindicator;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import androidx.core.graphics.drawable.DrawableCompat;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import androidx.vectordrawable.graphics.drawable.VectorDrawableCompat;
import com.google.android.material.R;
import com.google.android.material.progressindicator.BaseProgressIndicatorSpec;
import com.google.android.material.progressindicator.DrawingDelegate;

public final class IndeterminateDrawable<S extends BaseProgressIndicatorSpec> extends DrawableWithAnimatedVisibilityChange {
    private IndeterminateAnimatorDelegate<ObjectAnimator> animatorDelegate;
    private DrawingDelegate<S> drawingDelegate;
    private Drawable staticDummyDrawable;

    public /* bridge */ /* synthetic */ void clearAnimationCallbacks() {
        super.clearAnimationCallbacks();
    }

    public /* bridge */ /* synthetic */ int getAlpha() {
        return super.getAlpha();
    }

    public /* bridge */ /* synthetic */ int getOpacity() {
        return super.getOpacity();
    }

    public /* bridge */ /* synthetic */ boolean hideNow() {
        return super.hideNow();
    }

    public /* bridge */ /* synthetic */ boolean isHiding() {
        return super.isHiding();
    }

    public /* bridge */ /* synthetic */ boolean isRunning() {
        return super.isRunning();
    }

    public /* bridge */ /* synthetic */ boolean isShowing() {
        return super.isShowing();
    }

    public /* bridge */ /* synthetic */ void registerAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        super.registerAnimationCallback(animationCallback);
    }

    public /* bridge */ /* synthetic */ void setAlpha(int i) {
        super.setAlpha(i);
    }

    public /* bridge */ /* synthetic */ void setColorFilter(ColorFilter colorFilter) {
        super.setColorFilter(colorFilter);
    }

    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2) {
        return super.setVisible(z, z2);
    }

    public /* bridge */ /* synthetic */ boolean setVisible(boolean z, boolean z2, boolean z3) {
        return super.setVisible(z, z2, z3);
    }

    public /* bridge */ /* synthetic */ void start() {
        super.start();
    }

    public /* bridge */ /* synthetic */ void stop() {
        super.stop();
    }

    public /* bridge */ /* synthetic */ boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        return super.unregisterAnimationCallback(animationCallback);
    }

    IndeterminateDrawable(Context context, BaseProgressIndicatorSpec baseSpec, DrawingDelegate<S> drawingDelegate2, IndeterminateAnimatorDelegate<ObjectAnimator> animatorDelegate2) {
        super(context, baseSpec);
        setDrawingDelegate(drawingDelegate2);
        setAnimatorDelegate(animatorDelegate2);
    }

    public static IndeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(Context context, LinearProgressIndicatorSpec spec) {
        return createLinearDrawable(context, spec, new LinearDrawingDelegate(spec));
    }

    static IndeterminateDrawable<LinearProgressIndicatorSpec> createLinearDrawable(Context context, LinearProgressIndicatorSpec spec, LinearDrawingDelegate drawingDelegate2) {
        IndeterminateAnimatorDelegate indeterminateAnimatorDelegate;
        if (spec.indeterminateAnimationType == 0) {
            indeterminateAnimatorDelegate = new LinearIndeterminateContiguousAnimatorDelegate(spec);
        } else {
            indeterminateAnimatorDelegate = new LinearIndeterminateDisjointAnimatorDelegate(context, spec);
        }
        return new IndeterminateDrawable<>(context, spec, drawingDelegate2, indeterminateAnimatorDelegate);
    }

    public static IndeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(Context context, CircularProgressIndicatorSpec spec) {
        return createCircularDrawable(context, spec, new CircularDrawingDelegate(spec));
    }

    static IndeterminateDrawable<CircularProgressIndicatorSpec> createCircularDrawable(Context context, CircularProgressIndicatorSpec spec, CircularDrawingDelegate drawingDelegate2) {
        IndeterminateDrawable<CircularProgressIndicatorSpec> indeterminateDrawable = new IndeterminateDrawable<>(context, spec, drawingDelegate2, new CircularIndeterminateAnimatorDelegate(spec));
        indeterminateDrawable.setStaticDummyDrawable(VectorDrawableCompat.create(context.getResources(), R.drawable.indeterminate_static, (Resources.Theme) null));
        return indeterminateDrawable;
    }

    /* access modifiers changed from: package-private */
    public boolean setVisibleInternal(boolean visible, boolean restart, boolean animate) {
        boolean changed = super.setVisibleInternal(visible, restart, animate);
        if (isSystemAnimatorDisabled() && this.staticDummyDrawable != null) {
            return this.staticDummyDrawable.setVisible(visible, restart);
        }
        if (!isRunning()) {
            this.animatorDelegate.cancelAnimatorImmediately();
        }
        if (visible && animate) {
            this.animatorDelegate.startAnimator();
        }
        return changed;
    }

    public int getIntrinsicWidth() {
        return this.drawingDelegate.getPreferredWidth();
    }

    public int getIntrinsicHeight() {
        return this.drawingDelegate.getPreferredHeight();
    }

    public void draw(Canvas canvas) {
        Rect clipBounds = new Rect();
        if (!getBounds().isEmpty() && isVisible() && canvas.getClipBounds(clipBounds)) {
            if (!isSystemAnimatorDisabled() || this.staticDummyDrawable == null) {
                canvas.save();
                this.drawingDelegate.validateSpecAndAdjustCanvas(canvas, getBounds(), getGrowFraction(), isShowing(), isHiding());
                int gapSize = this.baseSpec.indicatorTrackGapSize;
                int trackAlpha = getAlpha();
                if (gapSize == 0) {
                    this.drawingDelegate.fillTrack(canvas, this.paint, 0.0f, 1.0f, this.baseSpec.trackColor, trackAlpha, 0);
                } else {
                    DrawingDelegate.ActiveIndicator firstIndicator = this.animatorDelegate.activeIndicators.get(0);
                    DrawingDelegate.ActiveIndicator lastIndicator = this.animatorDelegate.activeIndicators.get(this.animatorDelegate.activeIndicators.size() - 1);
                    if (this.drawingDelegate instanceof LinearDrawingDelegate) {
                        int i = trackAlpha;
                        int i2 = gapSize;
                        this.drawingDelegate.fillTrack(canvas, this.paint, 0.0f, firstIndicator.startFraction, this.baseSpec.trackColor, i, i2);
                        this.drawingDelegate.fillTrack(canvas, this.paint, lastIndicator.endFraction, 1.0f, this.baseSpec.trackColor, i, i2);
                    } else {
                        trackAlpha = 0;
                        this.drawingDelegate.fillTrack(canvas, this.paint, lastIndicator.endFraction, 1.0f + firstIndicator.startFraction, this.baseSpec.trackColor, 0, gapSize);
                    }
                }
                for (int indicatorIndex = 0; indicatorIndex < this.animatorDelegate.activeIndicators.size(); indicatorIndex++) {
                    DrawingDelegate.ActiveIndicator curIndicator = this.animatorDelegate.activeIndicators.get(indicatorIndex);
                    this.drawingDelegate.fillIndicator(canvas, this.paint, curIndicator, getAlpha());
                    if (indicatorIndex > 0 && gapSize > 0) {
                        this.drawingDelegate.fillTrack(canvas, this.paint, this.animatorDelegate.activeIndicators.get(indicatorIndex - 1).endFraction, curIndicator.startFraction, this.baseSpec.trackColor, trackAlpha, gapSize);
                    }
                }
                canvas.restore();
                return;
            }
            this.staticDummyDrawable.setBounds(getBounds());
            DrawableCompat.setTint(this.staticDummyDrawable, this.baseSpec.indicatorColors[0]);
            this.staticDummyDrawable.draw(canvas);
        }
    }

    private boolean isSystemAnimatorDisabled() {
        if (this.animatorDurationScaleProvider == null || this.animatorDurationScaleProvider.getSystemAnimatorDurationScale(this.context.getContentResolver()) != 0.0f) {
            return false;
        }
        return true;
    }

    public Drawable getStaticDummyDrawable() {
        return this.staticDummyDrawable;
    }

    public void setStaticDummyDrawable(Drawable staticDummyDrawable2) {
        this.staticDummyDrawable = staticDummyDrawable2;
    }

    /* access modifiers changed from: package-private */
    public IndeterminateAnimatorDelegate<ObjectAnimator> getAnimatorDelegate() {
        return this.animatorDelegate;
    }

    /* access modifiers changed from: package-private */
    public void setAnimatorDelegate(IndeterminateAnimatorDelegate<ObjectAnimator> animatorDelegate2) {
        this.animatorDelegate = animatorDelegate2;
        animatorDelegate2.registerDrawable(this);
    }

    /* access modifiers changed from: package-private */
    public DrawingDelegate<S> getDrawingDelegate() {
        return this.drawingDelegate;
    }

    /* access modifiers changed from: package-private */
    public void setDrawingDelegate(DrawingDelegate<S> drawingDelegate2) {
        this.drawingDelegate = drawingDelegate2;
    }
}
