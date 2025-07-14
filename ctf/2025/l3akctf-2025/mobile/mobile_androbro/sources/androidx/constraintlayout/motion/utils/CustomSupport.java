package androidx.constraintlayout.motion.utils;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.util.Log;
import android.view.View;
import androidx.constraintlayout.motion.widget.Debug;
import androidx.constraintlayout.widget.ConstraintAttribute;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class CustomSupport {
    private static final boolean DEBUG = false;
    private static final String TAG = "CustomSupport";

    public static void setInterpolatedValue(ConstraintAttribute att, View view, float[] value) {
        View view2 = view;
        Class<?> cls = view.getClass();
        String methodName = "set" + att.getName();
        try {
            boolean z = true;
            switch (att.getType()) {
                case INT_TYPE:
                    cls.getMethod(methodName, new Class[]{Integer.TYPE}).invoke(view2, new Object[]{Integer.valueOf((int) value[0])});
                    return;
                case FLOAT_TYPE:
                    cls.getMethod(methodName, new Class[]{Float.TYPE}).invoke(view2, new Object[]{Float.valueOf(value[0])});
                    return;
                case COLOR_DRAWABLE_TYPE:
                    Method method = cls.getMethod(methodName, new Class[]{Drawable.class});
                    int r = clamp((int) (((float) Math.pow((double) value[0], 0.45454545454545453d)) * 255.0f));
                    int g = clamp((int) (((float) Math.pow((double) value[1], 0.45454545454545453d)) * 255.0f));
                    int b = clamp((int) (((float) Math.pow((double) value[2], 0.45454545454545453d)) * 255.0f));
                    ColorDrawable drawable = new ColorDrawable();
                    drawable.setColor((clamp((int) (value[3] * 255.0f)) << 24) | (r << 16) | (g << 8) | b);
                    method.invoke(view2, new Object[]{drawable});
                    return;
                case COLOR_TYPE:
                    cls.getMethod(methodName, new Class[]{Integer.TYPE}).invoke(view2, new Object[]{Integer.valueOf((clamp((int) (value[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow((double) value[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (((float) Math.pow((double) value[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow((double) value[2], 0.45454545454545453d)) * 255.0f)))});
                    return;
                case STRING_TYPE:
                    throw new RuntimeException("unable to interpolate strings " + att.getName());
                case BOOLEAN_TYPE:
                    Method method2 = cls.getMethod(methodName, new Class[]{Boolean.TYPE});
                    if (value[0] <= 0.5f) {
                        z = false;
                    }
                    method2.invoke(view2, new Object[]{Boolean.valueOf(z)});
                    return;
                case DIMENSION_TYPE:
                    cls.getMethod(methodName, new Class[]{Float.TYPE}).invoke(view2, new Object[]{Float.valueOf(value[0])});
                    return;
                default:
                    return;
            }
        } catch (NoSuchMethodException e) {
            Log.e(TAG, "No method " + methodName + " on View \"" + Debug.getName(view) + "\"", e);
        } catch (IllegalAccessException e2) {
            Log.e(TAG, "Cannot access method " + methodName + " on View \"" + Debug.getName(view) + "\"", e2);
        } catch (InvocationTargetException e3) {
            Log.e(TAG, "Cannot invoke method " + methodName + " on View \"" + Debug.getName(view) + "\"", e3);
        }
    }

    private static int clamp(int c) {
        int c2 = (c & (~(c >> 31))) - 255;
        return (c2 & (c2 >> 31)) + 255;
    }
}
