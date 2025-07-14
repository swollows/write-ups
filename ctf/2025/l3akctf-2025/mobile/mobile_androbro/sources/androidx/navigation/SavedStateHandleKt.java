package androidx.navigation;

import androidx.lifecycle.SavedStateHandle;
import androidx.navigation.serialization.RouteDeserializerKt;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;

@Metadata(d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aA\u0010\u0000\u001a\u0002H\u0001\"\b\b\u0000\u0010\u0001*\u00020\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00010\u00052\u0016\u0010\u0006\u001a\u0012\u0012\u0004\u0012\u00020\b\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\u0007H\u0007¢\u0006\u0002\u0010\n\u001a=\u0010\u000b\u001a\u0002H\u0001\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0002*\u00020\u00032\u001d\b\u0002\u0010\u0006\u001a\u0017\u0012\u0004\u0012\u00020\b\u0012\r\u0012\u000b\u0012\u0002\b\u00030\t¢\u0006\u0002\b\f0\u0007H\b¢\u0006\u0002\u0010\r¨\u0006\u000e"}, d2 = {"internalToRoute", "T", "", "Landroidx/lifecycle/SavedStateHandle;", "route", "Lkotlin/reflect/KClass;", "typeMap", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "(Landroidx/lifecycle/SavedStateHandle;Lkotlin/reflect/KClass;Ljava/util/Map;)Ljava/lang/Object;", "toRoute", "Lkotlin/jvm/JvmSuppressWildcards;", "(Landroidx/lifecycle/SavedStateHandle;Ljava/util/Map;)Ljava/lang/Object;", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: SavedStateHandle.kt */
public final class SavedStateHandleKt {
    public static /* synthetic */ Object toRoute$default(SavedStateHandle $this$toRoute_u24default, Map typeMap, int i, Object obj) {
        if ((i & 1) != 0) {
            typeMap = MapsKt.emptyMap();
        }
        Intrinsics.checkNotNullParameter($this$toRoute_u24default, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.reifiedOperationMarker(4, "T");
        return internalToRoute($this$toRoute_u24default, Reflection.getOrCreateKotlinClass(Object.class), typeMap);
    }

    public static final /* synthetic */ <T> T toRoute(SavedStateHandle $this$toRoute, Map<KType, NavType<?>> typeMap) {
        Intrinsics.checkNotNullParameter($this$toRoute, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.reifiedOperationMarker(4, "T");
        return internalToRoute($this$toRoute, Reflection.getOrCreateKotlinClass(Object.class), typeMap);
    }

    public static final <T> T internalToRoute(SavedStateHandle $this$internalToRoute, KClass<T> route, Map<KType, ? extends NavType<?>> typeMap) {
        Intrinsics.checkNotNullParameter($this$internalToRoute, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Map map = new LinkedHashMap();
        KSerializer serializer = SerializersKt.serializer(route);
        for (NamedNavArgument it : RouteSerializerKt.generateNavArguments(serializer, typeMap)) {
            map.put(it.getName(), it.getArgument().getType());
        }
        return RouteDeserializerKt.decodeArguments(serializer, $this$internalToRoute, (Map<String, ? extends NavType<?>>) map);
    }
}
