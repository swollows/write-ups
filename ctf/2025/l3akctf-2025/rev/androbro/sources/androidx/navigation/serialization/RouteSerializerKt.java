package androidx.navigation.serialization;

import androidx.navigation.NamedNavArgument;
import androidx.navigation.NamedNavArgumentKt;
import androidx.navigation.NavType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.PolymorphicSerializer;
import kotlinx.serialization.SerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000T\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0006\u0010\u0004\u001a\u0002H\u00022\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00070\u0006H\u0007¢\u0006\u0002\u0010\b\u001a(\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0001H\u0002\u001a&\u0010\r\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0011H\u0002\u001a.\u0010\u0012\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007*\u00020\u00132\u0016\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006H\u0002\u001a\u0001\u0010\u0015\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u001a\u0010\u0005\u001a\u0016\u0012\u0004\u0012\u00020\u0001\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00070\u00062S\u0010\u0016\u001aO\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001c\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u000e0\u0017H\u0003¢\u0006\u0002\b\u001e\u001a\u0001\u0010\u0015\u001a\u00020\u000e\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00062S\u0010\u0016\u001aO\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0013\u0012\u00110\u0001¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001c\u0012\u001b\u0012\u0019\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0007¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001d\u0012\u0004\u0012\u00020\u000e0\u0017H\u0003¢\u0006\u0002\b\u001f\u001a\u0018\u0010 \u001a\u00020\u0018\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000fH\u0007\u001a8\u0010!\u001a\b\u0012\u0004\u0012\u00020#0\"\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u0006H\u0007\u001a>\u0010$\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u000f2\u0018\b\u0002\u0010\u0005\u001a\u0012\u0012\u0004\u0012\u00020\u0014\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00070\u00062\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0001H\u0000¨\u0006&"}, d2 = {"generateRouteWithArgs", "", "T", "", "route", "typeMap", "", "Landroidx/navigation/NavType;", "(Ljava/lang/Object;Ljava/util/Map;)Ljava/lang/String;", "unknownNavTypeErrorMessage", "fieldName", "fieldType", "className", "assertNotAbstractClass", "", "Lkotlinx/serialization/KSerializer;", "handler", "Lkotlin/Function0;", "computeNavType", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "Lkotlin/reflect/KType;", "forEachIndexed", "operation", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "index", "argName", "navType", "forEachIndexedName", "forEachIndexedKType", "generateHashCode", "generateNavArguments", "", "Landroidx/navigation/NamedNavArgument;", "generateRoutePattern", "path", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: RouteSerializer.kt */
public final class RouteSerializerKt {
    public static /* synthetic */ String generateRoutePattern$default(KSerializer kSerializer, Map map, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            map = MapsKt.emptyMap();
        }
        if ((i & 2) != 0) {
            str = null;
        }
        return generateRoutePattern(kSerializer, map, str);
    }

    public static final <T> String generateRoutePattern(KSerializer<T> $this$generateRoutePattern, Map<KType, ? extends NavType<?>> typeMap, String path) {
        RouteBuilder builder;
        Intrinsics.checkNotNullParameter($this$generateRoutePattern, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        assertNotAbstractClass($this$generateRoutePattern, new RouteSerializerKt$generateRoutePattern$1($this$generateRoutePattern));
        if (path != null) {
            builder = new RouteBuilder(path, $this$generateRoutePattern);
        } else {
            builder = new RouteBuilder($this$generateRoutePattern);
        }
        forEachIndexedKType($this$generateRoutePattern, typeMap, new RouteSerializerKt$generateRoutePattern$2(builder));
        return builder.build();
    }

    public static /* synthetic */ List generateNavArguments$default(KSerializer kSerializer, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = MapsKt.emptyMap();
        }
        return generateNavArguments(kSerializer, map);
    }

    public static final <T> List<NamedNavArgument> generateNavArguments(KSerializer<T> $this$generateNavArguments, Map<KType, ? extends NavType<?>> typeMap) {
        Intrinsics.checkNotNullParameter($this$generateNavArguments, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        assertNotAbstractClass($this$generateNavArguments, new RouteSerializerKt$generateNavArguments$1($this$generateNavArguments));
        int elementsCount = $this$generateNavArguments.getDescriptor().getElementsCount();
        ArrayList arrayList = new ArrayList(elementsCount);
        for (int i = 0; i < elementsCount; i++) {
            int index = i;
            String name = $this$generateNavArguments.getDescriptor().getElementName(index);
            arrayList.add(NamedNavArgumentKt.navArgument(name, new RouteSerializerKt$generateNavArguments$2$1($this$generateNavArguments, index, typeMap, name)));
        }
        return arrayList;
    }

    public static final <T> String generateRouteWithArgs(T route, Map<String, ? extends NavType<Object>> typeMap) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        KSerializer serializer = SerializersKt.serializer(Reflection.getOrCreateKotlinClass(route.getClass()));
        Map argMap = new RouteEncoder(serializer, typeMap).encodeToArgMap(route);
        RouteBuilder builder = new RouteBuilder(serializer);
        forEachIndexedName(serializer, typeMap, new RouteSerializerKt$generateRouteWithArgs$1(argMap, builder));
        return builder.build();
    }

    private static final <T> void assertNotAbstractClass(KSerializer<T> $this$assertNotAbstractClass, Function0<Unit> handler) {
        if ($this$assertNotAbstractClass instanceof PolymorphicSerializer) {
            handler.invoke();
        }
    }

    /* access modifiers changed from: private */
    public static final NavType<Object> computeNavType(SerialDescriptor $this$computeNavType, Map<KType, ? extends NavType<?>> typeMap) {
        Object obj;
        Iterator it = typeMap.keySet().iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (NavTypeConverterKt.matchKType($this$computeNavType, (KType) obj)) {
                break;
            }
        }
        KType it2 = (KType) obj;
        NavType navType = it2 != null ? (NavType) typeMap.get(it2) : null;
        if (!(navType instanceof NavType)) {
            navType = null;
        }
        NavType customType = navType;
        NavType result = customType == null ? NavTypeConverterKt.getNavType($this$computeNavType) : customType;
        if (Intrinsics.areEqual((Object) result, (Object) UNKNOWN.INSTANCE)) {
            return null;
        }
        Intrinsics.checkNotNull(result, "null cannot be cast to non-null type androidx.navigation.NavType<kotlin.Any?>");
        return result;
    }

    public static final <T> int generateHashCode(KSerializer<T> $this$generateHashCode) {
        Intrinsics.checkNotNullParameter($this$generateHashCode, "<this>");
        int hash = $this$generateHashCode.getDescriptor().getSerialName().hashCode();
        int elementsCount = $this$generateHashCode.getDescriptor().getElementsCount();
        for (int i = 0; i < elementsCount; i++) {
            hash = (hash * 31) + $this$generateHashCode.getDescriptor().getElementName(i).hashCode();
        }
        return hash;
    }

    static /* synthetic */ void forEachIndexedKType$default(KSerializer kSerializer, Map map, Function3 function3, int i, Object obj) {
        if ((i & 1) != 0) {
            map = MapsKt.emptyMap();
        }
        forEachIndexedKType(kSerializer, map, function3);
    }

    private static final <T> void forEachIndexedKType(KSerializer<T> $this$forEachIndexed, Map<KType, ? extends NavType<?>> typeMap, Function3<? super Integer, ? super String, ? super NavType<Object>, Unit> operation) {
        int i = 0;
        int elementsCount = $this$forEachIndexed.getDescriptor().getElementsCount();
        while (i < elementsCount) {
            String argName = $this$forEachIndexed.getDescriptor().getElementName(i);
            NavType navType = computeNavType($this$forEachIndexed.getDescriptor().getElementDescriptor(i), typeMap);
            if (navType != null) {
                operation.invoke(Integer.valueOf(i), argName, navType);
                i++;
            } else {
                throw new IllegalArgumentException(unknownNavTypeErrorMessage(argName, $this$forEachIndexed.getDescriptor().getElementDescriptor(i).getSerialName(), $this$forEachIndexed.getDescriptor().getSerialName(), typeMap.toString()));
            }
        }
    }

    private static final <T> void forEachIndexedName(KSerializer<T> $this$forEachIndexed, Map<String, ? extends NavType<Object>> typeMap, Function3<? super Integer, ? super String, ? super NavType<Object>, Unit> operation) {
        int i = 0;
        int elementsCount = $this$forEachIndexed.getDescriptor().getElementsCount();
        while (i < elementsCount) {
            String argName = $this$forEachIndexed.getDescriptor().getElementName(i);
            NavType navType = (NavType) typeMap.get(argName);
            if (navType != null) {
                operation.invoke(Integer.valueOf(i), argName, navType);
                i++;
            } else {
                throw new IllegalStateException(("Cannot locate NavType for argument [" + argName + ']').toString());
            }
        }
    }

    /* access modifiers changed from: private */
    public static final String unknownNavTypeErrorMessage(String fieldName, String fieldType, String className, String typeMap) {
        return "Route " + className + " could not find any NavType for argument " + fieldName + " of type " + fieldType + " - typeMap received was " + typeMap;
    }
}
