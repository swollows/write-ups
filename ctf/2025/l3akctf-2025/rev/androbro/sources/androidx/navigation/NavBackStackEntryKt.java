package androidx.navigation;

import android.os.Bundle;
import androidx.navigation.serialization.RouteDeserializerKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MagicApiIntrinsics;
import kotlin.reflect.KType;
import kotlinx.serialization.SerializersKt;

@Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001a\u0010\u0000\u001a\u0002H\u0001\"\u0006\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002H\b¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"toRoute", "T", "Landroidx/navigation/NavBackStackEntry;", "(Landroidx/navigation/NavBackStackEntry;)Ljava/lang/Object;", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavBackStackEntry.kt */
public final class NavBackStackEntryKt {
    public static final /* synthetic */ <T> T toRoute(NavBackStackEntry $this$toRoute) {
        Intrinsics.checkNotNullParameter($this$toRoute, "<this>");
        Bundle bundle = $this$toRoute.getArguments();
        if (bundle == null) {
            bundle = new Bundle();
        }
        Map $this$mapValuesTo$iv$iv = $this$toRoute.getDestination().getArguments();
        Map destination$iv$iv = new LinkedHashMap(MapsKt.mapCapacity($this$mapValuesTo$iv$iv.size()));
        for (Object element$iv$iv$iv : $this$mapValuesTo$iv$iv.entrySet()) {
            destination$iv$iv.put(((Map.Entry) element$iv$iv$iv).getKey(), ((NavArgument) ((Map.Entry) element$iv$iv$iv).getValue()).getType());
        }
        Intrinsics.reifiedOperationMarker(6, "T");
        MagicApiIntrinsics.voidMagicApiCall((Object) "kotlinx.serialization.serializer.simple");
        return RouteDeserializerKt.decodeArguments(SerializersKt.serializer((KType) null), bundle, (Map<String, ? extends NavType<?>>) destination$iv$iv);
    }
}
