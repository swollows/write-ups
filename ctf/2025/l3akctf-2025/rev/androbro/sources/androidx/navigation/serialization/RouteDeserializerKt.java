package androidx.navigation.serialization;

import android.os.Bundle;
import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.NavType;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000(\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a=\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0006H\u0007¢\u0006\u0002\u0010\t\u001a=\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\b\u0012\u0004\u0012\u0002H\u00010\u00022\u0006\u0010\n\u001a\u00020\u000b2\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0007\u0012\b\u0012\u0006\u0012\u0002\b\u00030\b0\u0006H\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, d2 = {"decodeArguments", "T", "Lkotlinx/serialization/KSerializer;", "bundle", "Landroid/os/Bundle;", "typeMap", "", "", "Landroidx/navigation/NavType;", "(Lkotlinx/serialization/KSerializer;Landroid/os/Bundle;Ljava/util/Map;)Ljava/lang/Object;", "handle", "Landroidx/lifecycle/SavedStateHandle;", "(Lkotlinx/serialization/KSerializer;Landroidx/lifecycle/SavedStateHandle;Ljava/util/Map;)Ljava/lang/Object;", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: RouteDeserializer.kt */
public final class RouteDeserializerKt {
    public static final <T> T decodeArguments(KSerializer<T> $this$decodeArguments, Bundle bundle, Map<String, ? extends NavType<?>> typeMap) {
        Intrinsics.checkNotNullParameter($this$decodeArguments, "<this>");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        return new RouteDecoder(bundle, typeMap).decodeRouteWithArgs$navigation_common_release($this$decodeArguments);
    }

    public static final <T> T decodeArguments(KSerializer<T> $this$decodeArguments, SavedStateHandle handle, Map<String, ? extends NavType<?>> typeMap) {
        Intrinsics.checkNotNullParameter($this$decodeArguments, "<this>");
        Intrinsics.checkNotNullParameter(handle, "handle");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        return new RouteDecoder(handle, typeMap).decodeRouteWithArgs$navigation_common_release($this$decodeArguments);
    }
}
