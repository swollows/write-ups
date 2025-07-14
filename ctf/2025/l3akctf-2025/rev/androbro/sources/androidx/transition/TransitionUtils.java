package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.TypeEvaluator;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Picture;
import android.graphics.RectF;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.constraintlayout.core.widgets.analyzer.BasicMeasure;

class TransitionUtils {
    private static final boolean HAS_PICTURE_BITMAP = (Build.VERSION.SDK_INT >= 28);
    private static final int MAX_IMAGE_SIZE = 1048576;

    static View copyViewImage(ViewGroup sceneRoot, View view, View parent) {
        Matrix matrix = new Matrix();
        matrix.setTranslate((float) (-parent.getScrollX()), (float) (-parent.getScrollY()));
        ViewUtils.transformMatrixToGlobal(view, matrix);
        ViewUtils.transformMatrixToLocal(sceneRoot, matrix);
        RectF bounds = new RectF(0.0f, 0.0f, (float) view.getWidth(), (float) view.getHeight());
        matrix.mapRect(bounds);
        int left = Math.round(bounds.left);
        int top = Math.round(bounds.top);
        int right = Math.round(bounds.right);
        int bottom = Math.round(bounds.bottom);
        ImageView copy = new ImageView(view.getContext());
        copy.setScaleType(ImageView.ScaleType.CENTER_CROP);
        Bitmap bitmap = createViewBitmap(view, matrix, bounds, sceneRoot);
        if (bitmap != null) {
            copy.setImageBitmap(bitmap);
        }
        copy.measure(View.MeasureSpec.makeMeasureSpec(right - left, BasicMeasure.EXACTLY), View.MeasureSpec.makeMeasureSpec(bottom - top, BasicMeasure.EXACTLY));
        copy.layout(left, top, right, bottom);
        return copy;
    }

    /* JADX WARNING: type inference failed for: r4v4, types: [android.view.ViewParent] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static android.graphics.Bitmap createViewBitmap(android.view.View r10, android.graphics.Matrix r11, android.graphics.RectF r12, android.view.ViewGroup r13) {
        /*
            boolean r0 = r10.isAttachedToWindow()
            r1 = 1
            r0 = r0 ^ r1
            if (r13 == 0) goto L_0x000f
            boolean r2 = r13.isAttachedToWindow()
            if (r2 == 0) goto L_0x000f
            goto L_0x0010
        L_0x000f:
            r1 = 0
        L_0x0010:
            r2 = 0
            r3 = 0
            if (r0 == 0) goto L_0x002a
            if (r1 != 0) goto L_0x0018
            r4 = 0
            return r4
        L_0x0018:
            android.view.ViewParent r4 = r10.getParent()
            r2 = r4
            android.view.ViewGroup r2 = (android.view.ViewGroup) r2
            int r3 = r2.indexOfChild(r10)
            android.view.ViewGroupOverlay r4 = r13.getOverlay()
            r4.add(r10)
        L_0x002a:
            r4 = 0
            float r5 = r12.width()
            int r5 = java.lang.Math.round(r5)
            float r6 = r12.height()
            int r6 = java.lang.Math.round(r6)
            if (r5 <= 0) goto L_0x008f
            if (r6 <= 0) goto L_0x008f
            int r7 = r5 * r6
            float r7 = (float) r7
            r8 = 1233125376(0x49800000, float:1048576.0)
            float r8 = r8 / r7
            r7 = 1065353216(0x3f800000, float:1.0)
            float r7 = java.lang.Math.min(r7, r8)
            float r8 = (float) r5
            float r8 = r8 * r7
            int r5 = java.lang.Math.round(r8)
            float r8 = (float) r6
            float r8 = r8 * r7
            int r6 = java.lang.Math.round(r8)
            float r8 = r12.left
            float r8 = -r8
            float r9 = r12.top
            float r9 = -r9
            r11.postTranslate(r8, r9)
            r11.postScale(r7, r7)
            boolean r8 = HAS_PICTURE_BITMAP
            if (r8 == 0) goto L_0x007e
            android.graphics.Picture r8 = new android.graphics.Picture
            r8.<init>()
            android.graphics.Canvas r9 = r8.beginRecording(r5, r6)
            r9.concat(r11)
            r10.draw(r9)
            r8.endRecording()
            android.graphics.Bitmap r4 = androidx.transition.TransitionUtils.Api28Impl.createBitmap(r8)
            goto L_0x008f
        L_0x007e:
            android.graphics.Bitmap$Config r8 = android.graphics.Bitmap.Config.ARGB_8888
            android.graphics.Bitmap r4 = android.graphics.Bitmap.createBitmap(r5, r6, r8)
            android.graphics.Canvas r8 = new android.graphics.Canvas
            r8.<init>(r4)
            r8.concat(r11)
            r10.draw(r8)
        L_0x008f:
            if (r0 == 0) goto L_0x009b
            android.view.ViewGroupOverlay r7 = r13.getOverlay()
            r7.remove(r10)
            r2.addView(r10, r3)
        L_0x009b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.TransitionUtils.createViewBitmap(android.view.View, android.graphics.Matrix, android.graphics.RectF, android.view.ViewGroup):android.graphics.Bitmap");
    }

    static Animator mergeAnimators(Animator animator1, Animator animator2) {
        if (animator1 == null) {
            return animator2;
        }
        if (animator2 == null) {
            return animator1;
        }
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.playTogether(new Animator[]{animator1, animator2});
        return animatorSet;
    }

    static class MatrixEvaluator implements TypeEvaluator<Matrix> {
        final float[] mTempEndValues = new float[9];
        final Matrix mTempMatrix = new Matrix();
        final float[] mTempStartValues = new float[9];

        MatrixEvaluator() {
        }

        public Matrix evaluate(float fraction, Matrix startValue, Matrix endValue) {
            startValue.getValues(this.mTempStartValues);
            endValue.getValues(this.mTempEndValues);
            for (int i = 0; i < 9; i++) {
                this.mTempEndValues[i] = this.mTempStartValues[i] + (fraction * (this.mTempEndValues[i] - this.mTempStartValues[i]));
            }
            this.mTempMatrix.setValues(this.mTempEndValues);
            return this.mTempMatrix;
        }
    }

    private TransitionUtils() {
    }

    static class Api28Impl {
        private Api28Impl() {
        }

        static Bitmap createBitmap(Picture source) {
            return Bitmap.createBitmap(source);
        }
    }
}
