package com.google.android.material.color;

import android.app.Activity;
import android.app.Application;
import android.app.UiModeManager;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.core.content.ContextCompat;
import java.util.LinkedHashSet;
import java.util.Set;

public class ColorContrast {
    private static final float HIGH_CONTRAST_THRESHOLD = 0.6666667f;
    private static final float MEDIUM_CONTRAST_THRESHOLD = 0.33333334f;

    private ColorContrast() {
    }

    public static void applyToActivitiesIfAvailable(Application application, ColorContrastOptions colorContrastOptions) {
        if (isContrastAvailable()) {
            application.registerActivityLifecycleCallbacks(new ColorContrastActivityLifecycleCallbacks(colorContrastOptions));
        }
    }

    public static void applyToActivityIfAvailable(Activity activity, ColorContrastOptions colorContrastOptions) {
        int themeOverlayResourcesId;
        if (isContrastAvailable() && (themeOverlayResourcesId = getContrastThemeOverlayResourceId(activity, colorContrastOptions)) != 0) {
            ThemeUtils.applyThemeOverlay(activity, themeOverlayResourcesId);
        }
    }

    public static Context wrapContextIfAvailable(Context context, ColorContrastOptions colorContrastOptions) {
        int themeOverlayResourcesId;
        if (isContrastAvailable() && (themeOverlayResourcesId = getContrastThemeOverlayResourceId(context, colorContrastOptions)) != 0) {
            return new ContextThemeWrapper(context, themeOverlayResourcesId);
        }
        return context;
    }

    public static boolean isContrastAvailable() {
        return Build.VERSION.SDK_INT >= 34;
    }

    private static int getContrastThemeOverlayResourceId(Context context, ColorContrastOptions colorContrastOptions) {
        UiModeManager uiModeManager = (UiModeManager) context.getSystemService("uimode");
        if (!isContrastAvailable() || uiModeManager == null) {
            return 0;
        }
        float currentContrast = uiModeManager.getContrast();
        int mediumContrastThemeOverlay = colorContrastOptions.getMediumContrastThemeOverlay();
        int highContrastThemeOverlay = colorContrastOptions.getHighContrastThemeOverlay();
        if (currentContrast >= HIGH_CONTRAST_THRESHOLD) {
            return highContrastThemeOverlay == 0 ? mediumContrastThemeOverlay : highContrastThemeOverlay;
        }
        if (currentContrast < MEDIUM_CONTRAST_THRESHOLD) {
            return 0;
        }
        if (mediumContrastThemeOverlay == 0) {
            return highContrastThemeOverlay;
        }
        return mediumContrastThemeOverlay;
    }

    private static class ColorContrastActivityLifecycleCallbacks implements Application.ActivityLifecycleCallbacks {
        /* access modifiers changed from: private */
        public final Set<Activity> activitiesInStack = new LinkedHashSet();
        private final ColorContrastOptions colorContrastOptions;
        private UiModeManager.ContrastChangeListener contrastChangeListener;

        ColorContrastActivityLifecycleCallbacks(ColorContrastOptions colorContrastOptions2) {
            this.colorContrastOptions = colorContrastOptions2;
        }

        public void onActivityPreCreated(Activity activity, Bundle savedInstanceState) {
            UiModeManager uiModeManager = (UiModeManager) activity.getSystemService("uimode");
            if (uiModeManager != null && this.activitiesInStack.isEmpty() && this.contrastChangeListener == null) {
                this.contrastChangeListener = new UiModeManager.ContrastChangeListener() {
                    public void onContrastChanged(float contrastLevel) {
                        for (Activity activityInStack : ColorContrastActivityLifecycleCallbacks.this.activitiesInStack) {
                            activityInStack.recreate();
                        }
                    }
                };
                uiModeManager.addContrastChangeListener(ContextCompat.getMainExecutor(activity.getApplicationContext()), this.contrastChangeListener);
            }
            this.activitiesInStack.add(activity);
            if (uiModeManager != null) {
                ColorContrast.applyToActivityIfAvailable(activity, this.colorContrastOptions);
            }
        }

        public void onActivityCreated(Activity activity, Bundle savedInstanceState) {
        }

        public void onActivityStarted(Activity activity) {
        }

        public void onActivityResumed(Activity activity) {
        }

        public void onActivityPaused(Activity activity) {
        }

        public void onActivityStopped(Activity activity) {
        }

        public void onActivitySaveInstanceState(Activity activity, Bundle outState) {
        }

        public void onActivityDestroyed(Activity activity) {
            this.activitiesInStack.remove(activity);
            UiModeManager uiModeManager = (UiModeManager) activity.getSystemService("uimode");
            if (uiModeManager != null && this.contrastChangeListener != null && this.activitiesInStack.isEmpty()) {
                uiModeManager.removeContrastChangeListener(this.contrastChangeListener);
                this.contrastChangeListener = null;
            }
        }
    }
}
