package com.google.android.material.internal;

import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import com.google.android.material.resources.TextAppearance;
import com.google.android.material.resources.TextAppearanceFontCallback;
import java.lang.ref.WeakReference;

public class TextDrawableHelper {
    /* access modifiers changed from: private */
    public WeakReference<TextDrawableDelegate> delegate = new WeakReference<>((Object) null);
    private final TextAppearanceFontCallback fontCallback = new TextAppearanceFontCallback() {
        public void onFontRetrieved(Typeface typeface, boolean fontResolvedSynchronously) {
            if (!fontResolvedSynchronously) {
                boolean unused = TextDrawableHelper.this.textSizeDirty = true;
                TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) TextDrawableHelper.this.delegate.get();
                if (textDrawableDelegate != null) {
                    textDrawableDelegate.onTextSizeChange();
                }
            }
        }

        public void onFontRetrievalFailed(int reason) {
            boolean unused = TextDrawableHelper.this.textSizeDirty = true;
            TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) TextDrawableHelper.this.delegate.get();
            if (textDrawableDelegate != null) {
                textDrawableDelegate.onTextSizeChange();
            }
        }
    };
    private TextAppearance textAppearance;
    private float textHeight;
    private final TextPaint textPaint = new TextPaint(1);
    /* access modifiers changed from: private */
    public boolean textSizeDirty = true;
    private float textWidth;

    public interface TextDrawableDelegate {
        int[] getState();

        boolean onStateChange(int[] iArr);

        void onTextSizeChange();
    }

    public TextDrawableHelper(TextDrawableDelegate delegate2) {
        setDelegate(delegate2);
    }

    public void setDelegate(TextDrawableDelegate delegate2) {
        this.delegate = new WeakReference<>(delegate2);
    }

    public TextPaint getTextPaint() {
        return this.textPaint;
    }

    public void setTextWidthDirty(boolean dirty) {
        this.textSizeDirty = dirty;
    }

    public boolean isTextWidthDirty() {
        return this.textSizeDirty;
    }

    public void setTextSizeDirty(boolean dirty) {
        this.textSizeDirty = dirty;
    }

    private void refreshTextDimens(String text) {
        this.textWidth = calculateTextWidth(text);
        this.textHeight = calculateTextHeight(text);
        this.textSizeDirty = false;
    }

    public float getTextWidth(String text) {
        if (!this.textSizeDirty) {
            return this.textWidth;
        }
        refreshTextDimens(text);
        return this.textWidth;
    }

    private float calculateTextWidth(CharSequence charSequence) {
        if (charSequence == null) {
            return 0.0f;
        }
        return this.textPaint.measureText(charSequence, 0, charSequence.length());
    }

    public float getTextHeight(String text) {
        if (!this.textSizeDirty) {
            return this.textHeight;
        }
        refreshTextDimens(text);
        return this.textHeight;
    }

    private float calculateTextHeight(String str) {
        if (str == null) {
            return 0.0f;
        }
        return Math.abs(this.textPaint.getFontMetrics().ascent);
    }

    public TextAppearance getTextAppearance() {
        return this.textAppearance;
    }

    public void setTextAppearance(TextAppearance textAppearance2, Context context) {
        if (this.textAppearance != textAppearance2) {
            this.textAppearance = textAppearance2;
            if (textAppearance2 != null) {
                textAppearance2.updateMeasureState(context, this.textPaint, this.fontCallback);
                TextDrawableDelegate textDrawableDelegate = (TextDrawableDelegate) this.delegate.get();
                if (textDrawableDelegate != null) {
                    this.textPaint.drawableState = textDrawableDelegate.getState();
                }
                textAppearance2.updateDrawState(context, this.textPaint, this.fontCallback);
                this.textSizeDirty = true;
            }
            TextDrawableDelegate textDrawableDelegate2 = (TextDrawableDelegate) this.delegate.get();
            if (textDrawableDelegate2 != null) {
                textDrawableDelegate2.onTextSizeChange();
                textDrawableDelegate2.onStateChange(textDrawableDelegate2.getState());
            }
        }
    }

    public void updateTextPaintDrawState(Context context) {
        this.textAppearance.updateDrawState(context, this.textPaint, this.fontCallback);
    }
}
