package androidx.transition;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.TypeEvaluator;
import android.content.Context;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.Property;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.transition.Transition;
import androidx.transition.TransitionUtils;

public class ChangeImageTransform extends Transition {
    private static final Property<ImageView, Matrix> ANIMATED_TRANSFORM_PROPERTY = new Property<ImageView, Matrix>(Matrix.class, "animatedTransform") {
        public void set(ImageView view, Matrix matrix) {
            ImageViewUtils.animateTransform(view, matrix);
        }

        public Matrix get(ImageView object) {
            return null;
        }
    };
    private static final TypeEvaluator<Matrix> NULL_MATRIX_EVALUATOR = new TypeEvaluator<Matrix>() {
        public Matrix evaluate(float fraction, Matrix startValue, Matrix endValue) {
            return null;
        }
    };
    private static final String PROPNAME_BOUNDS = "android:changeImageTransform:bounds";
    private static final String PROPNAME_MATRIX = "android:changeImageTransform:matrix";
    private static final String[] sTransitionProperties = {PROPNAME_MATRIX, PROPNAME_BOUNDS};

    public ChangeImageTransform() {
    }

    public ChangeImageTransform(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public boolean isSeekingSupported() {
        return true;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v2, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: android.graphics.Matrix} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void captureValues(androidx.transition.TransitionValues r12, boolean r13) {
        /*
            r11 = this;
            android.view.View r0 = r12.view
            boolean r1 = r0 instanceof android.widget.ImageView
            if (r1 == 0) goto L_0x004b
            int r1 = r0.getVisibility()
            if (r1 == 0) goto L_0x000d
            goto L_0x004b
        L_0x000d:
            r1 = r0
            android.widget.ImageView r1 = (android.widget.ImageView) r1
            android.graphics.drawable.Drawable r2 = r1.getDrawable()
            if (r2 != 0) goto L_0x0017
            return
        L_0x0017:
            java.util.Map<java.lang.String, java.lang.Object> r3 = r12.values
            int r4 = r0.getLeft()
            int r5 = r0.getTop()
            int r6 = r0.getRight()
            int r7 = r0.getBottom()
            android.graphics.Rect r8 = new android.graphics.Rect
            r8.<init>(r4, r5, r6, r7)
            java.lang.String r9 = "android:changeImageTransform:bounds"
            r3.put(r9, r8)
            r9 = 0
            if (r13 == 0) goto L_0x003f
            int r10 = androidx.transition.R.id.transition_image_transform
            java.lang.Object r10 = r1.getTag(r10)
            r9 = r10
            android.graphics.Matrix r9 = (android.graphics.Matrix) r9
        L_0x003f:
            if (r9 != 0) goto L_0x0045
            android.graphics.Matrix r9 = copyImageMatrix(r1)
        L_0x0045:
            java.lang.String r10 = "android:changeImageTransform:matrix"
            r3.put(r10, r9)
            return
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.transition.ChangeImageTransform.captureValues(androidx.transition.TransitionValues, boolean):void");
    }

    public void captureStartValues(TransitionValues transitionValues) {
        captureValues(transitionValues, true);
    }

    public void captureEndValues(TransitionValues transitionValues) {
        captureValues(transitionValues, false);
    }

    public String[] getTransitionProperties() {
        return sTransitionProperties;
    }

    public Animator createAnimator(ViewGroup sceneRoot, TransitionValues startValues, TransitionValues endValues) {
        if (startValues == null || endValues == null) {
            return null;
        }
        Rect startBounds = (Rect) startValues.values.get(PROPNAME_BOUNDS);
        Rect endBounds = (Rect) endValues.values.get(PROPNAME_BOUNDS);
        if (startBounds == null || endBounds == null) {
            return null;
        }
        Matrix startMatrix = (Matrix) startValues.values.get(PROPNAME_MATRIX);
        Matrix endMatrix = (Matrix) endValues.values.get(PROPNAME_MATRIX);
        boolean matricesEqual = (startMatrix == null && endMatrix == null) || (startMatrix != null && startMatrix.equals(endMatrix));
        if (startBounds.equals(endBounds) && matricesEqual) {
            return null;
        }
        ImageView imageView = (ImageView) endValues.view;
        Drawable drawable = imageView.getDrawable();
        int drawableWidth = drawable.getIntrinsicWidth();
        int drawableHeight = drawable.getIntrinsicHeight();
        if (drawableWidth <= 0 || drawableHeight <= 0) {
            return createNullAnimator(imageView);
        }
        if (startMatrix == null) {
            startMatrix = MatrixUtils.IDENTITY_MATRIX;
        }
        if (endMatrix == null) {
            endMatrix = MatrixUtils.IDENTITY_MATRIX;
        }
        ANIMATED_TRANSFORM_PROPERTY.set(imageView, startMatrix);
        ObjectAnimator animator = createMatrixAnimator(imageView, startMatrix, endMatrix);
        Listener listener = new Listener(imageView, startMatrix, endMatrix);
        animator.addListener(listener);
        animator.addPauseListener(listener);
        addListener(listener);
        return animator;
    }

    private ObjectAnimator createNullAnimator(ImageView imageView) {
        return ObjectAnimator.ofObject(imageView, ANIMATED_TRANSFORM_PROPERTY, NULL_MATRIX_EVALUATOR, new Matrix[]{MatrixUtils.IDENTITY_MATRIX, MatrixUtils.IDENTITY_MATRIX});
    }

    private ObjectAnimator createMatrixAnimator(ImageView imageView, Matrix startMatrix, Matrix endMatrix) {
        return ObjectAnimator.ofObject(imageView, ANIMATED_TRANSFORM_PROPERTY, new TransitionUtils.MatrixEvaluator(), new Matrix[]{startMatrix, endMatrix});
    }

    private static Matrix copyImageMatrix(ImageView view) {
        Drawable image = view.getDrawable();
        if (image.getIntrinsicWidth() <= 0 || image.getIntrinsicHeight() <= 0) {
            return new Matrix(view.getImageMatrix());
        }
        switch (AnonymousClass3.$SwitchMap$android$widget$ImageView$ScaleType[view.getScaleType().ordinal()]) {
            case 1:
                return fitXYMatrix(view);
            case 2:
                return centerCropMatrix(view);
            default:
                return new Matrix(view.getImageMatrix());
        }
    }

    /* renamed from: androidx.transition.ChangeImageTransform$3  reason: invalid class name */
    static /* synthetic */ class AnonymousClass3 {
        static final /* synthetic */ int[] $SwitchMap$android$widget$ImageView$ScaleType = new int[ImageView.ScaleType.values().length];

        static {
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.FIT_XY.ordinal()] = 1;
            } catch (NoSuchFieldError e) {
            }
            try {
                $SwitchMap$android$widget$ImageView$ScaleType[ImageView.ScaleType.CENTER_CROP.ordinal()] = 2;
            } catch (NoSuchFieldError e2) {
            }
        }
    }

    private static Matrix fitXYMatrix(ImageView view) {
        Drawable image = view.getDrawable();
        Matrix matrix = new Matrix();
        matrix.postScale(((float) view.getWidth()) / ((float) image.getIntrinsicWidth()), ((float) view.getHeight()) / ((float) image.getIntrinsicHeight()));
        return matrix;
    }

    private static Matrix centerCropMatrix(ImageView view) {
        Drawable image = view.getDrawable();
        int imageWidth = image.getIntrinsicWidth();
        int imageViewWidth = view.getWidth();
        int imageHeight = image.getIntrinsicHeight();
        int imageViewHeight = view.getHeight();
        float maxScale = Math.max(((float) imageViewWidth) / ((float) imageWidth), ((float) imageViewHeight) / ((float) imageHeight));
        int tx = Math.round((((float) imageViewWidth) - (((float) imageWidth) * maxScale)) / 2.0f);
        int ty = Math.round((((float) imageViewHeight) - (((float) imageHeight) * maxScale)) / 2.0f);
        Matrix matrix = new Matrix();
        matrix.postScale(maxScale, maxScale);
        matrix.postTranslate((float) tx, (float) ty);
        return matrix;
    }

    private static class Listener extends AnimatorListenerAdapter implements Transition.TransitionListener {
        private final Matrix mEndMatrix;
        private final ImageView mImageView;
        private boolean mIsBeforeAnimator = true;
        private final Matrix mStartMatrix;

        Listener(ImageView imageView, Matrix startMatrix, Matrix endMatrix) {
            this.mImageView = imageView;
            this.mStartMatrix = startMatrix;
            this.mEndMatrix = endMatrix;
        }

        public void onTransitionStart(Transition transition) {
        }

        public void onTransitionEnd(Transition transition) {
        }

        public void onTransitionCancel(Transition transition) {
        }

        public void onTransitionPause(Transition transition) {
            if (this.mIsBeforeAnimator) {
                saveMatrix(this.mStartMatrix);
            }
        }

        public void onTransitionResume(Transition transition) {
            restoreMatrix();
        }

        public void onAnimationStart(Animator animation, boolean isReverse) {
            this.mIsBeforeAnimator = false;
        }

        public void onAnimationStart(Animator animation) {
            this.mIsBeforeAnimator = false;
        }

        public void onAnimationEnd(Animator animation, boolean isReverse) {
            this.mIsBeforeAnimator = isReverse;
        }

        public void onAnimationEnd(Animator animation) {
            this.mIsBeforeAnimator = false;
        }

        public void onAnimationPause(Animator animation) {
            saveMatrix((Matrix) ((ObjectAnimator) animation).getAnimatedValue());
        }

        public void onAnimationResume(Animator animation) {
            restoreMatrix();
        }

        private void restoreMatrix() {
            Matrix pauseMatrix = (Matrix) this.mImageView.getTag(R.id.transition_image_transform);
            if (pauseMatrix != null) {
                ImageViewUtils.animateTransform(this.mImageView, pauseMatrix);
                this.mImageView.setTag(R.id.transition_image_transform, (Object) null);
            }
        }

        private void saveMatrix(Matrix pauseMatrix) {
            this.mImageView.setTag(R.id.transition_image_transform, pauseMatrix);
            ImageViewUtils.animateTransform(this.mImageView, this.mEndMatrix);
        }
    }
}
