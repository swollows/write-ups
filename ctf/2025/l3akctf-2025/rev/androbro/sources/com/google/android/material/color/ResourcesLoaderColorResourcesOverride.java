package com.google.android.material.color;

import android.content.Context;
import android.content.res.Configuration;
import android.view.ContextThemeWrapper;
import com.google.android.material.R;
import java.util.Map;

class ResourcesLoaderColorResourcesOverride implements ColorResourcesOverride {
    private ResourcesLoaderColorResourcesOverride() {
    }

    public boolean applyIfPossible(Context context, Map<Integer, Integer> colorResourceIdsToColorValues) {
        if (!ResourcesLoaderUtils.addResourcesLoaderToContext(context, colorResourceIdsToColorValues)) {
            return false;
        }
        ThemeUtils.applyThemeOverlay(context, R.style.ThemeOverlay_Material3_PersonalizedColors);
        return true;
    }

    public Context wrapContextIfPossible(Context context, Map<Integer, Integer> colorResourceIdsToColorValues) {
        ContextThemeWrapper themeWrapper = new ContextThemeWrapper(context, R.style.ThemeOverlay_Material3_PersonalizedColors);
        themeWrapper.applyOverrideConfiguration(new Configuration());
        if (ResourcesLoaderUtils.addResourcesLoaderToContext(themeWrapper, colorResourceIdsToColorValues)) {
            return themeWrapper;
        }
        return context;
    }

    static ColorResourcesOverride getInstance() {
        return ResourcesLoaderColorResourcesOverrideSingleton.INSTANCE;
    }

    private static class ResourcesLoaderColorResourcesOverrideSingleton {
        /* access modifiers changed from: private */
        public static final ResourcesLoaderColorResourcesOverride INSTANCE = new ResourcesLoaderColorResourcesOverride();

        private ResourcesLoaderColorResourcesOverrideSingleton() {
        }
    }
}
