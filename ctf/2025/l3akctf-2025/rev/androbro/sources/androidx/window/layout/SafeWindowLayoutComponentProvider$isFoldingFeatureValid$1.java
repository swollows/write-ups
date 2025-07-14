package androidx.window.layout;

import android.graphics.Rect;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 6, 0}, xi = 48)
/* compiled from: SafeWindowLayoutComponentProvider.kt */
final class SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1 extends Lambda implements Function0<Boolean> {
    final /* synthetic */ ClassLoader $classLoader;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SafeWindowLayoutComponentProvider$isFoldingFeatureValid$1(ClassLoader classLoader) {
        super(0);
        this.$classLoader = classLoader;
    }

    public final Boolean invoke() {
        Class foldingFeatureClass = SafeWindowLayoutComponentProvider.INSTANCE.foldingFeatureClass(this.$classLoader);
        boolean z = false;
        Method getBoundsMethod = foldingFeatureClass.getMethod("getBounds", new Class[0]);
        Method getTypeMethod = foldingFeatureClass.getMethod("getType", new Class[0]);
        Method getStateMethod = foldingFeatureClass.getMethod("getState", new Class[0]);
        SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider = SafeWindowLayoutComponentProvider.INSTANCE;
        Intrinsics.checkNotNullExpressionValue(getBoundsMethod, "getBoundsMethod");
        if (safeWindowLayoutComponentProvider.doesReturn(getBoundsMethod, (KClass<?>) Reflection.getOrCreateKotlinClass(Rect.class)) && SafeWindowLayoutComponentProvider.INSTANCE.isPublic(getBoundsMethod)) {
            SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider2 = SafeWindowLayoutComponentProvider.INSTANCE;
            Intrinsics.checkNotNullExpressionValue(getTypeMethod, "getTypeMethod");
            if (safeWindowLayoutComponentProvider2.doesReturn(getTypeMethod, (KClass<?>) Reflection.getOrCreateKotlinClass(Integer.TYPE)) && SafeWindowLayoutComponentProvider.INSTANCE.isPublic(getTypeMethod)) {
                SafeWindowLayoutComponentProvider safeWindowLayoutComponentProvider3 = SafeWindowLayoutComponentProvider.INSTANCE;
                Intrinsics.checkNotNullExpressionValue(getStateMethod, "getStateMethod");
                if (safeWindowLayoutComponentProvider3.doesReturn(getStateMethod, (KClass<?>) Reflection.getOrCreateKotlinClass(Integer.TYPE)) && SafeWindowLayoutComponentProvider.INSTANCE.isPublic(getStateMethod)) {
                    z = true;
                }
            }
        }
        return Boolean.valueOf(z);
    }
}
