package androidx.emoji2.text;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.style.CharacterStyle;

public final class TypefaceEmojiSpan extends EmojiSpan {
    private static Paint sDebugPaint;
    private TextPaint mWorkingPaint;

    public TypefaceEmojiSpan(TypefaceEmojiRasterizer metadata) {
        super(metadata);
    }

    public void draw(Canvas canvas, CharSequence text, int start, int end, float x, int top, int y, int bottom, Paint paint) {
        float f = x;
        int i = top;
        int i2 = bottom;
        Paint paint2 = paint;
        TextPaint textPaint = applyCharacterSpanStyles(text, start, end, paint2);
        if (!(textPaint == null || textPaint.bgColor == 0)) {
            drawBackground(canvas, textPaint, x, f + ((float) getWidth()), (float) i, (float) i2);
        }
        if (EmojiCompat.get().isEmojiSpanIndicatorEnabled()) {
            canvas.drawRect(x, (float) i, f + ((float) getWidth()), (float) i2, getDebugPaint());
        }
        getTypefaceRasterizer().draw(canvas, f, (float) y, textPaint != null ? textPaint : paint2);
    }

    /* access modifiers changed from: package-private */
    public void drawBackground(Canvas c, TextPaint textPaint, float leftX, float rightX, float top, float bottom) {
        int previousColor = textPaint.getColor();
        Paint.Style previousStyle = textPaint.getStyle();
        textPaint.setColor(textPaint.bgColor);
        textPaint.setStyle(Paint.Style.FILL);
        c.drawRect(leftX, top, rightX, bottom, textPaint);
        textPaint.setStyle(previousStyle);
        textPaint.setColor(previousColor);
    }

    private TextPaint applyCharacterSpanStyles(CharSequence text, int start, int end, Paint paint) {
        if (text instanceof Spanned) {
            CharacterStyle[] spans = (CharacterStyle[]) ((Spanned) text).getSpans(start, end, CharacterStyle.class);
            if (spans.length != 0 && (spans.length != 1 || spans[0] != this)) {
                TextPaint wp = this.mWorkingPaint;
                if (wp == null) {
                    wp = new TextPaint();
                    this.mWorkingPaint = wp;
                }
                wp.set(paint);
                for (CharacterStyle updateDrawState : spans) {
                    updateDrawState.updateDrawState(wp);
                }
                return wp;
            } else if (paint instanceof TextPaint) {
                return (TextPaint) paint;
            } else {
                return null;
            }
        } else if (paint instanceof TextPaint) {
            return (TextPaint) paint;
        } else {
            return null;
        }
    }

    private static Paint getDebugPaint() {
        if (sDebugPaint == null) {
            sDebugPaint = new TextPaint();
            sDebugPaint.setColor(EmojiCompat.get().getEmojiSpanIndicatorColor());
            sDebugPaint.setStyle(Paint.Style.FILL);
        }
        return sDebugPaint;
    }
}
