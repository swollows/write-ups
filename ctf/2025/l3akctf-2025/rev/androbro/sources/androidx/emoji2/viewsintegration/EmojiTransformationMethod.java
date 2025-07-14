package androidx.emoji2.viewsintegration;

import android.graphics.Rect;
import android.text.method.TransformationMethod;
import android.view.View;
import androidx.emoji2.text.EmojiCompat;

class EmojiTransformationMethod implements TransformationMethod {
    private final TransformationMethod mTransformationMethod;

    EmojiTransformationMethod(TransformationMethod transformationMethod) {
        this.mTransformationMethod = transformationMethod;
    }

    public CharSequence getTransformation(CharSequence source, View view) {
        if (view.isInEditMode()) {
            return source;
        }
        if (this.mTransformationMethod != null) {
            source = this.mTransformationMethod.getTransformation(source, view);
        }
        if (source != null) {
            switch (EmojiCompat.get().getLoadState()) {
                case 1:
                    return EmojiCompat.get().process(source);
            }
        }
        return source;
    }

    public void onFocusChanged(View view, CharSequence sourceText, boolean focused, int direction, Rect previouslyFocusedRect) {
        if (this.mTransformationMethod != null) {
            this.mTransformationMethod.onFocusChanged(view, sourceText, focused, direction, previouslyFocusedRect);
        }
    }

    public TransformationMethod getOriginalTransformationMethod() {
        return this.mTransformationMethod;
    }
}
