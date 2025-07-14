package androidx.transition;

import android.graphics.Canvas;
import android.os.Build;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

class CanvasUtils {
    private static Method sInorderBarrierMethod;
    private static boolean sOrderMethodsFetched;
    private static Method sReorderBarrierMethod;

    static void enableZ(Canvas canvas, boolean enable) {
        if (Build.VERSION.SDK_INT >= 29) {
            if (enable) {
                Api29Impl.enableZ(canvas);
            } else {
                Api29Impl.disableZ(canvas);
            }
        } else if (Build.VERSION.SDK_INT != 28) {
            if (!sOrderMethodsFetched) {
                try {
                    sReorderBarrierMethod = Canvas.class.getDeclaredMethod("insertReorderBarrier", new Class[0]);
                    sReorderBarrierMethod.setAccessible(true);
                    sInorderBarrierMethod = Canvas.class.getDeclaredMethod("insertInorderBarrier", new Class[0]);
                    sInorderBarrierMethod.setAccessible(true);
                } catch (NoSuchMethodException e) {
                }
                sOrderMethodsFetched = true;
            }
            if (enable) {
                try {
                    if (sReorderBarrierMethod != null) {
                        sReorderBarrierMethod.invoke(canvas, new Object[0]);
                    }
                } catch (IllegalAccessException e2) {
                    return;
                } catch (InvocationTargetException e3) {
                    throw new RuntimeException(e3.getCause());
                }
            }
            if (!enable && sInorderBarrierMethod != null) {
                sInorderBarrierMethod.invoke(canvas, new Object[0]);
            }
        } else {
            throw new IllegalStateException("This method doesn't work on Pie!");
        }
    }

    private CanvasUtils() {
    }

    static class Api29Impl {
        private Api29Impl() {
        }

        static void enableZ(Canvas canvas) {
            canvas.enableZ();
        }

        static void disableZ(Canvas canvas) {
            canvas.disableZ();
        }
    }
}
