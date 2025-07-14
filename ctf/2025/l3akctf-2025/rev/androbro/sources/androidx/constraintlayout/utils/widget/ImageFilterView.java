package androidx.constraintlayout.utils.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewOutlineProvider;
import android.widget.ImageView;
import androidx.appcompat.content.res.AppCompatResources;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.R;

public class ImageFilterView extends AppCompatImageView {
    private Drawable mAltDrawable = null;
    private float mCrossfade = 0.0f;
    private Drawable mDrawable = null;
    private ImageMatrix mImageMatrix = new ImageMatrix();
    LayerDrawable mLayer;
    Drawable[] mLayers = new Drawable[2];
    private boolean mOverlay = true;
    float mPanX = Float.NaN;
    float mPanY = Float.NaN;
    private Path mPath;
    RectF mRect;
    float mRotate = Float.NaN;
    /* access modifiers changed from: private */
    public float mRound = Float.NaN;
    /* access modifiers changed from: private */
    public float mRoundPercent = 0.0f;
    ViewOutlineProvider mViewOutlineProvider;
    float mZoom = Float.NaN;

    static class ImageMatrix {
        float mBrightness = 1.0f;
        ColorMatrix mColorMatrix = new ColorMatrix();
        float mContrast = 1.0f;
        float[] mMatrix = new float[20];
        float mSaturation = 1.0f;
        ColorMatrix mTmpColorMatrix = new ColorMatrix();
        float mWarmth = 1.0f;

        ImageMatrix() {
        }

        private void saturation(float saturationStrength) {
            float s = saturationStrength;
            float ms = 1.0f - s;
            float Rt = 0.2999f * ms;
            float Gt = 0.587f * ms;
            float Bt = 0.114f * ms;
            this.mMatrix[0] = Rt + s;
            this.mMatrix[1] = Gt;
            this.mMatrix[2] = Bt;
            this.mMatrix[3] = 0.0f;
            this.mMatrix[4] = 0.0f;
            this.mMatrix[5] = Rt;
            this.mMatrix[6] = Gt + s;
            this.mMatrix[7] = Bt;
            this.mMatrix[8] = 0.0f;
            this.mMatrix[9] = 0.0f;
            this.mMatrix[10] = Rt;
            this.mMatrix[11] = Gt;
            this.mMatrix[12] = Bt + s;
            this.mMatrix[13] = 0.0f;
            this.mMatrix[14] = 0.0f;
            this.mMatrix[15] = 0.0f;
            this.mMatrix[16] = 0.0f;
            this.mMatrix[17] = 0.0f;
            this.mMatrix[18] = 1.0f;
            this.mMatrix[19] = 0.0f;
        }

        private void warmth(float warmth) {
            float colorG;
            float colorR;
            float colorB;
            float color_b;
            float colorR2;
            float colorG2;
            float colorB2;
            float warmth2 = warmth <= 0.0f ? 0.01f : warmth;
            float centiKelvin = (5000.0f / warmth2) / 100.0f;
            if (centiKelvin > 66.0f) {
                float tmp = centiKelvin - 60.0f;
                float f = warmth2;
                colorR = ((float) Math.pow((double) tmp, -0.13320475816726685d)) * 329.69873f;
                colorG = ((float) Math.pow((double) tmp, 0.07551485300064087d)) * 288.12216f;
            } else {
                colorG = (((float) Math.log((double) centiKelvin)) * 99.4708f) - 161.11957f;
                colorR = 255.0f;
            }
            if (centiKelvin >= 66.0f) {
                colorB = 255.0f;
            } else if (centiKelvin > 19.0f) {
                colorB = (((float) Math.log((double) (centiKelvin - 10.0f))) * 138.51773f) - 305.0448f;
            } else {
                colorB = 0.0f;
            }
            float tmpColor_r = Math.min(255.0f, Math.max(colorR, 0.0f));
            float tmpColor_g = Math.min(255.0f, Math.max(colorG, 0.0f));
            float colorR3 = Math.min(255.0f, Math.max(colorB, 0.0f));
            float color_r = tmpColor_r;
            float color_g = tmpColor_g;
            float color_b2 = colorR3;
            float centiKelvin2 = 5000.0f / 100.0f;
            if (centiKelvin2 > 66.0f) {
                float tmp2 = centiKelvin2 - 60.0f;
                float f2 = tmpColor_g;
                color_b = color_b2;
                colorR2 = ((float) Math.pow((double) tmp2, -0.13320475816726685d)) * 329.69873f;
                float f3 = colorR3;
                colorG2 = ((float) Math.pow((double) tmp2, 0.07551485300064087d)) * 288.12216f;
            } else {
                float tmpColor_b = colorR3;
                color_b = color_b2;
                float f4 = tmpColor_g;
                colorG2 = (((float) Math.log((double) centiKelvin2)) * 99.4708f) - 161.11957f;
                colorR2 = 255.0f;
            }
            if (centiKelvin2 >= 66.0f) {
                colorB2 = 255.0f;
            } else if (centiKelvin2 > 19.0f) {
                colorB2 = (((float) Math.log((double) (centiKelvin2 - 10.0f))) * 138.51773f) - 305.0448f;
            } else {
                colorB2 = 0.0f;
            }
            float tmpColor_r2 = Math.min(255.0f, Math.max(colorR2, 0.0f));
            float tmpColor_g2 = Math.min(255.0f, Math.max(colorG2, 0.0f));
            this.mMatrix[0] = color_r / tmpColor_r2;
            this.mMatrix[1] = 0.0f;
            this.mMatrix[2] = 0.0f;
            this.mMatrix[3] = 0.0f;
            this.mMatrix[4] = 0.0f;
            this.mMatrix[5] = 0.0f;
            this.mMatrix[6] = color_g / tmpColor_g2;
            this.mMatrix[7] = 0.0f;
            this.mMatrix[8] = 0.0f;
            this.mMatrix[9] = 0.0f;
            this.mMatrix[10] = 0.0f;
            this.mMatrix[11] = 0.0f;
            this.mMatrix[12] = color_b / Math.min(255.0f, Math.max(colorB2, 0.0f));
            this.mMatrix[13] = 0.0f;
            this.mMatrix[14] = 0.0f;
            this.mMatrix[15] = 0.0f;
            this.mMatrix[16] = 0.0f;
            this.mMatrix[17] = 0.0f;
            this.mMatrix[18] = 1.0f;
            this.mMatrix[19] = 0.0f;
        }

        private void brightness(float brightness) {
            this.mMatrix[0] = brightness;
            this.mMatrix[1] = 0.0f;
            this.mMatrix[2] = 0.0f;
            this.mMatrix[3] = 0.0f;
            this.mMatrix[4] = 0.0f;
            this.mMatrix[5] = 0.0f;
            this.mMatrix[6] = brightness;
            this.mMatrix[7] = 0.0f;
            this.mMatrix[8] = 0.0f;
            this.mMatrix[9] = 0.0f;
            this.mMatrix[10] = 0.0f;
            this.mMatrix[11] = 0.0f;
            this.mMatrix[12] = brightness;
            this.mMatrix[13] = 0.0f;
            this.mMatrix[14] = 0.0f;
            this.mMatrix[15] = 0.0f;
            this.mMatrix[16] = 0.0f;
            this.mMatrix[17] = 0.0f;
            this.mMatrix[18] = 1.0f;
            this.mMatrix[19] = 0.0f;
        }

        /* access modifiers changed from: package-private */
        public void updateMatrix(ImageView view) {
            this.mColorMatrix.reset();
            boolean filter = false;
            if (this.mSaturation != 1.0f) {
                saturation(this.mSaturation);
                this.mColorMatrix.set(this.mMatrix);
                filter = true;
            }
            if (this.mContrast != 1.0f) {
                this.mTmpColorMatrix.setScale(this.mContrast, this.mContrast, this.mContrast, 1.0f);
                this.mColorMatrix.postConcat(this.mTmpColorMatrix);
                filter = true;
            }
            if (this.mWarmth != 1.0f) {
                warmth(this.mWarmth);
                this.mTmpColorMatrix.set(this.mMatrix);
                this.mColorMatrix.postConcat(this.mTmpColorMatrix);
                filter = true;
            }
            if (this.mBrightness != 1.0f) {
                brightness(this.mBrightness);
                this.mTmpColorMatrix.set(this.mMatrix);
                this.mColorMatrix.postConcat(this.mTmpColorMatrix);
                filter = true;
            }
            if (filter) {
                view.setColorFilter(new ColorMatrixColorFilter(this.mColorMatrix));
            } else {
                view.clearColorFilter();
            }
        }
    }

    public float getImagePanX() {
        return this.mPanX;
    }

    public float getImagePanY() {
        return this.mPanY;
    }

    public float getImageZoom() {
        return this.mZoom;
    }

    public float getImageRotate() {
        return this.mRotate;
    }

    public void setImagePanX(float pan) {
        this.mPanX = pan;
        updateViewMatrix();
    }

    public void setImagePanY(float pan) {
        this.mPanY = pan;
        updateViewMatrix();
    }

    public void setImageZoom(float zoom) {
        this.mZoom = zoom;
        updateViewMatrix();
    }

    public void setImageRotate(float rotation) {
        this.mRotate = rotation;
        updateViewMatrix();
    }

    public void setImageDrawable(Drawable drawable) {
        if (this.mAltDrawable == null || drawable == null) {
            super.setImageDrawable(drawable);
            return;
        }
        this.mDrawable = drawable.mutate();
        this.mLayers[0] = this.mDrawable;
        this.mLayers[1] = this.mAltDrawable;
        this.mLayer = new LayerDrawable(this.mLayers);
        super.setImageDrawable(this.mLayer);
        setCrossfade(this.mCrossfade);
    }

    public void setImageResource(int resId) {
        if (this.mAltDrawable != null) {
            this.mDrawable = AppCompatResources.getDrawable(getContext(), resId).mutate();
            this.mLayers[0] = this.mDrawable;
            this.mLayers[1] = this.mAltDrawable;
            this.mLayer = new LayerDrawable(this.mLayers);
            super.setImageDrawable(this.mLayer);
            setCrossfade(this.mCrossfade);
            return;
        }
        super.setImageResource(resId);
    }

    public void setAltImageResource(int resId) {
        this.mAltDrawable = AppCompatResources.getDrawable(getContext(), resId);
        setAltImageDrawable(this.mAltDrawable);
    }

    public void setAltImageDrawable(Drawable altDrawable) {
        this.mAltDrawable = altDrawable.mutate();
        this.mLayers[0] = this.mDrawable;
        this.mLayers[1] = this.mAltDrawable;
        this.mLayer = new LayerDrawable(this.mLayers);
        super.setImageDrawable(this.mLayer);
        setCrossfade(this.mCrossfade);
    }

    private void updateViewMatrix() {
        if (!Float.isNaN(this.mPanX) || !Float.isNaN(this.mPanY) || !Float.isNaN(this.mZoom) || !Float.isNaN(this.mRotate)) {
            setMatrix();
        } else {
            setScaleType(ImageView.ScaleType.FIT_CENTER);
        }
    }

    private void setMatrix() {
        if (!Float.isNaN(this.mPanX) || !Float.isNaN(this.mPanY) || !Float.isNaN(this.mZoom) || !Float.isNaN(this.mRotate)) {
            float rota = 0.0f;
            float panX = Float.isNaN(this.mPanX) ? 0.0f : this.mPanX;
            float panY = Float.isNaN(this.mPanY) ? 0.0f : this.mPanY;
            float zoom = Float.isNaN(this.mZoom) ? 1.0f : this.mZoom;
            if (!Float.isNaN(this.mRotate)) {
                rota = this.mRotate;
            }
            Matrix imageMatrix = new Matrix();
            imageMatrix.reset();
            float iw = (float) getDrawable().getIntrinsicWidth();
            float ih = (float) getDrawable().getIntrinsicHeight();
            float sw = (float) getWidth();
            float sh = (float) getHeight();
            float scale = (iw * sh < ih * sw ? sw / iw : sh / ih) * zoom;
            imageMatrix.postScale(scale, scale);
            imageMatrix.postTranslate(((((sw - (scale * iw)) * panX) + sw) - (scale * iw)) * 0.5f, ((((sh - (scale * ih)) * panY) + sh) - (scale * ih)) * 0.5f);
            imageMatrix.postRotate(rota, sw / 2.0f, sh / 2.0f);
            setImageMatrix(imageMatrix);
            setScaleType(ImageView.ScaleType.MATRIX);
        }
    }

    public ImageFilterView(Context context) {
        super(context);
        init(context, (AttributeSet) null);
    }

    public ImageFilterView(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context, attrs);
    }

    public ImageFilterView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    private void init(Context context, AttributeSet attrs) {
        if (attrs != null) {
            TypedArray a = context.obtainStyledAttributes(attrs, R.styleable.ImageFilterView);
            int count = a.getIndexCount();
            this.mAltDrawable = a.getDrawable(R.styleable.ImageFilterView_altSrc);
            for (int i = 0; i < count; i++) {
                int attr = a.getIndex(i);
                if (attr == R.styleable.ImageFilterView_crossfade) {
                    this.mCrossfade = a.getFloat(attr, 0.0f);
                } else if (attr == R.styleable.ImageFilterView_warmth) {
                    setWarmth(a.getFloat(attr, 0.0f));
                } else if (attr == R.styleable.ImageFilterView_saturation) {
                    setSaturation(a.getFloat(attr, 0.0f));
                } else if (attr == R.styleable.ImageFilterView_contrast) {
                    setContrast(a.getFloat(attr, 0.0f));
                } else if (attr == R.styleable.ImageFilterView_brightness) {
                    setBrightness(a.getFloat(attr, 0.0f));
                } else if (attr == R.styleable.ImageFilterView_round) {
                    setRound(a.getDimension(attr, 0.0f));
                } else if (attr == R.styleable.ImageFilterView_roundPercent) {
                    setRoundPercent(a.getFloat(attr, 0.0f));
                } else if (attr == R.styleable.ImageFilterView_overlay) {
                    setOverlay(a.getBoolean(attr, this.mOverlay));
                } else if (attr == R.styleable.ImageFilterView_imagePanX) {
                    setImagePanX(a.getFloat(attr, this.mPanX));
                } else if (attr == R.styleable.ImageFilterView_imagePanY) {
                    setImagePanY(a.getFloat(attr, this.mPanY));
                } else if (attr == R.styleable.ImageFilterView_imageRotate) {
                    setImageRotate(a.getFloat(attr, this.mRotate));
                } else if (attr == R.styleable.ImageFilterView_imageZoom) {
                    setImageZoom(a.getFloat(attr, this.mZoom));
                }
            }
            a.recycle();
            this.mDrawable = getDrawable();
            if (this.mAltDrawable == null || this.mDrawable == null) {
                this.mDrawable = getDrawable();
                if (this.mDrawable != null) {
                    Drawable[] drawableArr = this.mLayers;
                    Drawable mutate = this.mDrawable.mutate();
                    this.mDrawable = mutate;
                    drawableArr[0] = mutate;
                    return;
                }
                return;
            }
            Drawable[] drawableArr2 = this.mLayers;
            Drawable mutate2 = getDrawable().mutate();
            this.mDrawable = mutate2;
            drawableArr2[0] = mutate2;
            this.mLayers[1] = this.mAltDrawable.mutate();
            this.mLayer = new LayerDrawable(this.mLayers);
            this.mLayer.getDrawable(1).setAlpha((int) (this.mCrossfade * 255.0f));
            if (!this.mOverlay) {
                this.mLayer.getDrawable(0).setAlpha((int) ((1.0f - this.mCrossfade) * 255.0f));
            }
            super.setImageDrawable(this.mLayer);
        }
    }

    private void setOverlay(boolean overlay) {
        this.mOverlay = overlay;
    }

    public void setSaturation(float saturation) {
        this.mImageMatrix.mSaturation = saturation;
        this.mImageMatrix.updateMatrix(this);
    }

    public float getSaturation() {
        return this.mImageMatrix.mSaturation;
    }

    public void setContrast(float contrast) {
        this.mImageMatrix.mContrast = contrast;
        this.mImageMatrix.updateMatrix(this);
    }

    public float getContrast() {
        return this.mImageMatrix.mContrast;
    }

    public void setWarmth(float warmth) {
        this.mImageMatrix.mWarmth = warmth;
        this.mImageMatrix.updateMatrix(this);
    }

    public float getWarmth() {
        return this.mImageMatrix.mWarmth;
    }

    public void setCrossfade(float crossfade) {
        this.mCrossfade = crossfade;
        if (this.mLayers != null) {
            if (!this.mOverlay) {
                this.mLayer.getDrawable(0).setAlpha((int) ((1.0f - this.mCrossfade) * 255.0f));
            }
            this.mLayer.getDrawable(1).setAlpha((int) (this.mCrossfade * 255.0f));
            super.setImageDrawable(this.mLayer);
        }
    }

    public float getCrossfade() {
        return this.mCrossfade;
    }

    public void setBrightness(float brightness) {
        this.mImageMatrix.mBrightness = brightness;
        this.mImageMatrix.updateMatrix(this);
    }

    public float getBrightness() {
        return this.mImageMatrix.mBrightness;
    }

    public void setRoundPercent(float round) {
        boolean change = this.mRoundPercent != round;
        this.mRoundPercent = round;
        if (this.mRoundPercent != 0.0f) {
            if (this.mPath == null) {
                this.mPath = new Path();
            }
            if (this.mRect == null) {
                this.mRect = new RectF();
            }
            if (this.mViewOutlineProvider == null) {
                this.mViewOutlineProvider = new ViewOutlineProvider() {
                    public void getOutline(View view, Outline outline) {
                        int w = ImageFilterView.this.getWidth();
                        int h = ImageFilterView.this.getHeight();
                        outline.setRoundRect(0, 0, w, h, (((float) Math.min(w, h)) * ImageFilterView.this.mRoundPercent) / 2.0f);
                    }
                };
                setOutlineProvider(this.mViewOutlineProvider);
            }
            setClipToOutline(true);
            int w = getWidth();
            int h = getHeight();
            float r = (((float) Math.min(w, h)) * this.mRoundPercent) / 2.0f;
            this.mRect.set(0.0f, 0.0f, (float) w, (float) h);
            this.mPath.reset();
            this.mPath.addRoundRect(this.mRect, r, r, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (change) {
            invalidateOutline();
        }
    }

    public void setRound(float round) {
        if (Float.isNaN(round)) {
            this.mRound = round;
            float tmp = this.mRoundPercent;
            this.mRoundPercent = -1.0f;
            setRoundPercent(tmp);
            return;
        }
        boolean change = this.mRound != round;
        this.mRound = round;
        if (this.mRound != 0.0f) {
            if (this.mPath == null) {
                this.mPath = new Path();
            }
            if (this.mRect == null) {
                this.mRect = new RectF();
            }
            if (this.mViewOutlineProvider == null) {
                this.mViewOutlineProvider = new ViewOutlineProvider() {
                    public void getOutline(View view, Outline outline) {
                        outline.setRoundRect(0, 0, ImageFilterView.this.getWidth(), ImageFilterView.this.getHeight(), ImageFilterView.this.mRound);
                    }
                };
                setOutlineProvider(this.mViewOutlineProvider);
            }
            setClipToOutline(true);
            this.mRect.set(0.0f, 0.0f, (float) getWidth(), (float) getHeight());
            this.mPath.reset();
            this.mPath.addRoundRect(this.mRect, this.mRound, this.mRound, Path.Direction.CW);
        } else {
            setClipToOutline(false);
        }
        if (change) {
            invalidateOutline();
        }
    }

    public float getRoundPercent() {
        return this.mRoundPercent;
    }

    public float getRound() {
        return this.mRound;
    }

    public void draw(Canvas canvas) {
        super.draw(canvas);
        if (0 != 0) {
            canvas.restore();
        }
    }

    public void layout(int l, int t, int r, int b) {
        super.layout(l, t, r, b);
        setMatrix();
    }
}
