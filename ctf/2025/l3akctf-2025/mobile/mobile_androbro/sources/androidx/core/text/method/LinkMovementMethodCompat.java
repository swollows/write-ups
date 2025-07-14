package androidx.core.text.method;

import android.text.Layout;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.LinkMovementMethod;
import android.text.method.Touch;
import android.view.MotionEvent;
import android.widget.TextView;
import androidx.core.os.BuildCompat;

public class LinkMovementMethodCompat extends LinkMovementMethod {
    private static LinkMovementMethodCompat sInstance;

    private LinkMovementMethodCompat() {
    }

    public boolean onTouchEvent(TextView widget, Spannable buffer, MotionEvent event) {
        if (!BuildCompat.isAtLeastV()) {
            int action = event.getAction();
            boolean isOutOfLineBounds = true;
            if (action == 1 || action == 0) {
                int x = ((int) event.getX()) - widget.getTotalPaddingLeft();
                int y = ((int) event.getY()) - widget.getTotalPaddingTop();
                int x2 = x + widget.getScrollX();
                int y2 = y + widget.getScrollY();
                Layout layout = widget.getLayout();
                if (y2 < 0 || y2 > layout.getHeight()) {
                    isOutOfLineBounds = true;
                } else {
                    int line = layout.getLineForVertical(y2);
                    if (((float) x2) >= layout.getLineLeft(line) && ((float) x2) <= layout.getLineRight(line)) {
                        isOutOfLineBounds = false;
                    }
                }
                if (isOutOfLineBounds) {
                    Selection.removeSelection(buffer);
                    return Touch.onTouchEvent(widget, buffer, event);
                }
            }
        }
        return super.onTouchEvent(widget, buffer, event);
    }

    public static LinkMovementMethodCompat getInstance() {
        if (sInstance == null) {
            sInstance = new LinkMovementMethodCompat();
        }
        return sInstance;
    }
}
