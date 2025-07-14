package com.google.android.material.drawable;

import android.content.res.ColorStateList;
import android.graphics.Outline;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.ColorStateListDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import androidx.core.graphics.drawable.DrawableCompat;
import java.util.Arrays;

public final class DrawableUtils {
    public static final int INTRINSIC_SIZE = -1;
    private static final int UNSPECIFIED_HEIGHT = -1;
    private static final int UNSPECIFIED_WIDTH = -1;

    private DrawableUtils() {
    }

    public static void setTint(Drawable drawable, int color) {
        if (color != 0) {
            DrawableCompat.setTint(drawable, color);
        } else {
            DrawableCompat.setTintList(drawable, (ColorStateList) null);
        }
    }

    public static PorterDuffColorFilter updateTintFilter(Drawable drawable, ColorStateList tint, PorterDuff.Mode tintMode) {
        if (tint == null || tintMode == null) {
            return null;
        }
        return new PorterDuffColorFilter(tint.getColorForState(drawable.getState(), 0), tintMode);
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x0042 A[Catch:{ IOException | XmlPullParserException -> 0x004a }] */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0014 A[Catch:{ IOException | XmlPullParserException -> 0x004a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.util.AttributeSet parseDrawableXml(android.content.Context r5, int r6, java.lang.CharSequence r7) {
        /*
            android.content.res.Resources r0 = r5.getResources()     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            android.content.res.XmlResourceParser r0 = r0.getXml(r6)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
        L_0x0008:
            int r1 = r0.next()     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            r2 = 2
            if (r1 == r2) goto L_0x0012
            r3 = 1
            if (r1 != r3) goto L_0x0008
        L_0x0012:
            if (r1 != r2) goto L_0x0042
            java.lang.String r2 = r0.getName()     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            boolean r2 = android.text.TextUtils.equals(r2, r7)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            if (r2 == 0) goto L_0x0023
            android.util.AttributeSet r2 = android.util.Xml.asAttributeSet(r0)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            return r2
        L_0x0023:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            r3.<init>()     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            java.lang.String r4 = "Must have a <"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            java.lang.StringBuilder r3 = r3.append(r7)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            java.lang.String r4 = "> start tag"
            java.lang.StringBuilder r3 = r3.append(r4)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            java.lang.String r3 = r3.toString()     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            r2.<init>(r3)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            throw r2     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
        L_0x0042:
            org.xmlpull.v1.XmlPullParserException r2 = new org.xmlpull.v1.XmlPullParserException     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            java.lang.String r3 = "No start tag found"
            r2.<init>(r3)     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
            throw r2     // Catch:{ XmlPullParserException -> 0x004c, IOException -> 0x004a }
        L_0x004a:
            r0 = move-exception
            goto L_0x004d
        L_0x004c:
            r0 = move-exception
        L_0x004d:
            android.content.res.Resources$NotFoundException r1 = new android.content.res.Resources$NotFoundException
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = "Can't load badge resource ID #0x"
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r3 = java.lang.Integer.toHexString(r6)
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            r1.initCause(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.drawable.DrawableUtils.parseDrawableXml(android.content.Context, int, java.lang.CharSequence):android.util.AttributeSet");
    }

    public static void setRippleDrawableRadius(RippleDrawable drawable, int radius) {
        drawable.setRadius(radius);
    }

    public static Drawable createTintableDrawableIfNeeded(Drawable drawable, ColorStateList tintList, PorterDuff.Mode tintMode) {
        return createTintableMutatedDrawableIfNeeded(drawable, tintList, tintMode, false);
    }

    public static Drawable createTintableMutatedDrawableIfNeeded(Drawable drawable, ColorStateList tintList, PorterDuff.Mode tintMode) {
        return createTintableMutatedDrawableIfNeeded(drawable, tintList, tintMode, false);
    }

    private static Drawable createTintableMutatedDrawableIfNeeded(Drawable drawable, ColorStateList tintList, PorterDuff.Mode tintMode, boolean forceMutate) {
        if (drawable == null) {
            return null;
        }
        if (tintList != null) {
            drawable = DrawableCompat.wrap(drawable).mutate();
            if (tintMode != null) {
                DrawableCompat.setTintMode(drawable, tintMode);
            }
        } else if (forceMutate) {
            drawable.mutate();
        }
        return drawable;
    }

    public static Drawable compositeTwoLayeredDrawable(Drawable bottomLayerDrawable, Drawable topLayerDrawable) {
        return compositeTwoLayeredDrawable(bottomLayerDrawable, topLayerDrawable, -1, -1);
    }

    public static Drawable compositeTwoLayeredDrawable(Drawable bottomLayerDrawable, Drawable topLayerDrawable, int topLayerDesiredWidth, int topLayerDesiredHeight) {
        int topLayerNewHeight;
        int topLayerNewWidth;
        if (bottomLayerDrawable == null) {
            return topLayerDrawable;
        }
        if (topLayerDrawable == null) {
            return bottomLayerDrawable;
        }
        if (topLayerDesiredWidth == -1 || topLayerDesiredHeight == -1) {
        }
        if (topLayerDesiredWidth == -1) {
            topLayerDesiredWidth = getTopLayerIntrinsicWidth(bottomLayerDrawable, topLayerDrawable);
        }
        if (topLayerDesiredHeight == -1) {
            topLayerDesiredHeight = getTopLayerIntrinsicHeight(bottomLayerDrawable, topLayerDrawable);
        }
        if (topLayerDesiredWidth > bottomLayerDrawable.getIntrinsicWidth() || topLayerDesiredHeight > bottomLayerDrawable.getIntrinsicHeight()) {
            float topLayerRatio = ((float) topLayerDesiredWidth) / ((float) topLayerDesiredHeight);
            if (topLayerRatio >= ((float) bottomLayerDrawable.getIntrinsicWidth()) / ((float) bottomLayerDrawable.getIntrinsicHeight())) {
                int topLayerNewWidth2 = bottomLayerDrawable.getIntrinsicWidth();
                topLayerNewWidth = topLayerNewWidth2;
                topLayerNewHeight = (int) (((float) topLayerNewWidth2) / topLayerRatio);
            } else {
                int topLayerNewWidth3 = bottomLayerDrawable.getIntrinsicHeight();
                topLayerNewHeight = topLayerNewWidth3;
                topLayerNewWidth = (int) (((float) topLayerNewWidth3) * topLayerRatio);
            }
        } else {
            topLayerNewWidth = topLayerDesiredWidth;
            topLayerNewHeight = topLayerDesiredHeight;
        }
        LayerDrawable drawable = new LayerDrawable(new Drawable[]{bottomLayerDrawable, topLayerDrawable});
        drawable.setLayerSize(1, topLayerNewWidth, topLayerNewHeight);
        drawable.setLayerGravity(1, 17);
        return drawable;
    }

    private static int getTopLayerIntrinsicWidth(Drawable bottomLayerDrawable, Drawable topLayerDrawable) {
        int topLayerIntrinsicWidth = topLayerDrawable.getIntrinsicWidth();
        return topLayerIntrinsicWidth != -1 ? topLayerIntrinsicWidth : bottomLayerDrawable.getIntrinsicWidth();
    }

    private static int getTopLayerIntrinsicHeight(Drawable bottomLayerDrawable, Drawable topLayerDrawable) {
        int topLayerIntrinsicHeight = topLayerDrawable.getIntrinsicHeight();
        return topLayerIntrinsicHeight != -1 ? topLayerIntrinsicHeight : bottomLayerDrawable.getIntrinsicHeight();
    }

    public static int[] getCheckedState(int[] state) {
        for (int i = 0; i < state.length; i++) {
            if (state[i] == 16842912) {
                return state;
            }
            if (state[i] == 0) {
                int[] newState = (int[]) state.clone();
                newState[i] = 16842912;
                return newState;
            }
        }
        int[] newState2 = Arrays.copyOf(state, state.length + 1);
        newState2[state.length] = 16842912;
        return newState2;
    }

    public static int[] getUncheckedState(int[] state) {
        int[] newState = new int[state.length];
        int i = 0;
        for (int subState : state) {
            if (subState != 16842912) {
                newState[i] = subState;
                i++;
            }
        }
        return newState;
    }

    public static void setOutlineToPath(Outline outline, Path path) {
        if (Build.VERSION.SDK_INT >= 30) {
            OutlineCompatR.setPath(outline, path);
        } else if (Build.VERSION.SDK_INT >= 29) {
            try {
                OutlineCompatL.setConvexPath(outline, path);
            } catch (IllegalArgumentException e) {
            }
        } else if (path.isConvex()) {
            OutlineCompatL.setConvexPath(outline, path);
        }
    }

    public static ColorStateList getColorStateListOrNull(Drawable drawable) {
        if (drawable instanceof ColorDrawable) {
            return ColorStateList.valueOf(((ColorDrawable) drawable).getColor());
        }
        if (Build.VERSION.SDK_INT < 29 || !(drawable instanceof ColorStateListDrawable)) {
            return null;
        }
        return ((ColorStateListDrawable) drawable).getColorStateList();
    }

    private static class OutlineCompatR {
        private OutlineCompatR() {
        }

        static void setPath(Outline outline, Path path) {
            outline.setPath(path);
        }
    }

    private static class OutlineCompatL {
        private OutlineCompatL() {
        }

        static void setConvexPath(Outline outline, Path path) {
            outline.setConvexPath(path);
        }
    }
}
