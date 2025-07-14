package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.navigation.NavType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005¢\u0006\u0002\u0010\bJ\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000b\u001a\u00020\u0006H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u0004\u001a\u0012\u0012\u0004\u0012\u00020\u0006\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Landroidx/navigation/serialization/BundleArgStore;", "Landroidx/navigation/serialization/ArgStore;", "bundle", "Landroid/os/Bundle;", "typeMap", "", "", "Landroidx/navigation/NavType;", "(Landroid/os/Bundle;Ljava/util/Map;)V", "contains", "", "key", "get", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: RouteDecoder.kt */
final class BundleArgStore extends ArgStore {
    private final Bundle bundle;
    private final Map<String, NavType<?>> typeMap;

    public BundleArgStore(Bundle bundle2, Map<String, ? extends NavType<?>> typeMap2) {
        Intrinsics.checkNotNullParameter(bundle2, "bundle");
        Intrinsics.checkNotNullParameter(typeMap2, "typeMap");
        this.bundle = bundle2;
        this.typeMap = typeMap2;
    }

    public Object get(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        NavType navType = this.typeMap.get(key);
        if (navType != null) {
            return navType.get(this.bundle, key);
        }
        return null;
    }

    public boolean contains(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.bundle.containsKey(key);
    }
}
