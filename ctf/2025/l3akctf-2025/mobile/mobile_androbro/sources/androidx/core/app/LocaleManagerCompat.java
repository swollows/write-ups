package androidx.core.app;

import android.app.LocaleManager;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.LocaleList;
import androidx.core.os.LocaleListCompat;
import java.util.Locale;

public final class LocaleManagerCompat {
    private LocaleManagerCompat() {
    }

    public static LocaleListCompat getSystemLocales(Context context) {
        LocaleListCompat systemLocales = LocaleListCompat.getEmptyLocaleList();
        if (Build.VERSION.SDK_INT < 33) {
            return getConfigurationLocales(Resources.getSystem().getConfiguration());
        }
        Object localeManager = getLocaleManagerForApplication(context);
        if (localeManager != null) {
            return LocaleListCompat.wrap(Api33Impl.localeManagerGetSystemLocales(localeManager));
        }
        return systemLocales;
    }

    public static LocaleListCompat getApplicationLocales(Context context) {
        if (Build.VERSION.SDK_INT < 33) {
            return LocaleListCompat.forLanguageTags(AppLocalesStorageHelper.readLocales(context));
        }
        Object localeManager = getLocaleManagerForApplication(context);
        if (localeManager != null) {
            return LocaleListCompat.wrap(Api33Impl.localeManagerGetApplicationLocales(localeManager));
        }
        return LocaleListCompat.getEmptyLocaleList();
    }

    private static Object getLocaleManagerForApplication(Context context) {
        return context.getSystemService("locale");
    }

    static LocaleListCompat getConfigurationLocales(Configuration conf) {
        return Api24Impl.getLocales(conf);
    }

    static class Api21Impl {
        private Api21Impl() {
        }

        static String toLanguageTag(Locale locale) {
            return locale.toLanguageTag();
        }
    }

    static class Api24Impl {
        private Api24Impl() {
        }

        static LocaleListCompat getLocales(Configuration configuration) {
            return LocaleListCompat.forLanguageTags(configuration.getLocales().toLanguageTags());
        }
    }

    static class Api33Impl {
        private Api33Impl() {
        }

        static LocaleList localeManagerGetSystemLocales(Object localeManager) {
            return ((LocaleManager) localeManager).getSystemLocales();
        }

        static LocaleList localeManagerGetApplicationLocales(Object localeManager) {
            return ((LocaleManager) localeManager).getApplicationLocales();
        }
    }
}
