package androidx.navigation;

import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

@Metadata(d1 = {"\u0000H\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\\\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00032\u001d\b\u0002\u0010\u0006\u001a\u0017\u0012\u0004\u0012\u00020\b\u0012\r\u0012\u000b\u0012\u0002\b\u00030\t¢\u0006\u0002\b\n0\u00072\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\rH\bø\u0001\u0000\u001a=\u0010\u0000\u001a\u00020\u0001*\u00020\u00042\b\b\u0001\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0005\u001a\u00020\u000f2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\rH\bø\u0001\u0000\u001a9\u0010\u0000\u001a\u00020\u0001*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\rH\bø\u0001\u0000\u001a`\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00122\u001d\b\u0002\u0010\u0006\u001a\u0017\u0012\u0004\u0012\u00020\b\u0012\r\u0012\u000b\u0012\u0002\b\u00030\t¢\u0006\u0002\b\n0\u00072\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\rH\bø\u0001\u0000\u001a`\u0010\u0000\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u001d\b\u0002\u0010\u0006\u001a\u0017\u0012\u0004\u0012\u00020\b\u0012\r\u0012\u000b\u0012\u0002\b\u00030\t¢\u0006\u0002\b\n0\u00072\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\rH\bø\u0001\u0000\u001a=\u0010\u0000\u001a\u00020\u0013*\u00020\u00142\b\b\u0003\u0010\u000e\u001a\u00020\u000f2\b\b\u0001\u0010\u0005\u001a\u00020\u000f2\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\rH\bø\u0001\u0000\u001a=\u0010\u0000\u001a\u00020\u0013*\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\rH\bø\u0001\u0000\u001ad\u0010\u0000\u001a\u00020\u0013*\u00020\u00142\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00122\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00122\u001d\b\u0002\u0010\u0006\u001a\u0017\u0012\u0004\u0012\u00020\b\u0012\r\u0012\u000b\u0012\u0002\b\u00030\t¢\u0006\u0002\b\n0\u00072\u0017\u0010\u000b\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\f¢\u0006\u0002\b\rH\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0015"}, d2 = {"navigation", "", "T", "", "Landroidx/navigation/NavGraphBuilder;", "startDestination", "typeMap", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "builder", "Lkotlin/Function1;", "Lkotlin/ExtensionFunctionType;", "id", "", "", "route", "Lkotlin/reflect/KClass;", "Landroidx/navigation/NavGraph;", "Landroidx/navigation/NavigatorProvider;", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavGraphBuilder.kt */
public final class NavGraphBuilderKt {
    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider $this$navigation_u24default, int id, int startDestination, Function1 builder, int i, Object obj) {
        if ((i & 1) != 0) {
            id = 0;
        }
        Intrinsics.checkNotNullParameter($this$navigation_u24default, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder($this$navigation_u24default, id, startDestination);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    @Deprecated(message = "Use routes to build your NavGraph instead", replaceWith = @ReplaceWith(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final NavGraph navigation(NavigatorProvider $this$navigation, int id, int startDestination, Function1<? super NavGraphBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter($this$navigation, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder($this$navigation, id, startDestination);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider $this$navigation_u24default, String startDestination, String route, Function1 builder, int i, Object obj) {
        if ((i & 2) != 0) {
            route = null;
        }
        Intrinsics.checkNotNullParameter($this$navigation_u24default, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder($this$navigation_u24default, startDestination, route);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final NavGraph navigation(NavigatorProvider $this$navigation, String startDestination, String route, Function1<? super NavGraphBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter($this$navigation, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder($this$navigation, startDestination, route);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider $this$navigation_u24default, KClass startDestination, KClass route, Map typeMap, Function1 builder, int i, Object obj) {
        if ((i & 2) != 0) {
            route = null;
        }
        if ((i & 4) != 0) {
            typeMap = MapsKt.emptyMap();
        }
        Intrinsics.checkNotNullParameter($this$navigation_u24default, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder($this$navigation_u24default, (KClass<?>) startDestination, (KClass<?>) route, (Map<KType, NavType<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final NavGraph navigation(NavigatorProvider $this$navigation, KClass<?> startDestination, KClass<?> route, Map<KType, NavType<?>> typeMap, Function1<? super NavGraphBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter($this$navigation, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder($this$navigation, startDestination, route, typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static /* synthetic */ NavGraph navigation$default(NavigatorProvider $this$navigation_u24default, Object startDestination, KClass route, Map typeMap, Function1 builder, int i, Object obj) {
        if ((i & 2) != 0) {
            route = null;
        }
        if ((i & 4) != 0) {
            typeMap = MapsKt.emptyMap();
        }
        Intrinsics.checkNotNullParameter($this$navigation_u24default, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder($this$navigation_u24default, startDestination, (KClass<?>) route, (Map<KType, NavType<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    public static final NavGraph navigation(NavigatorProvider $this$navigation, Object startDestination, KClass<?> route, Map<KType, NavType<?>> typeMap, Function1<? super NavGraphBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter($this$navigation, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder($this$navigation, startDestination, route, typeMap);
        builder.invoke(navGraphBuilder);
        return navGraphBuilder.build();
    }

    @Deprecated(message = "Use routes to build your nested NavGraph instead", replaceWith = @ReplaceWith(expression = "navigation(startDestination = startDestination.toString(), route = id.toString()) { builder.invoke() }", imports = {}))
    public static final void navigation(NavGraphBuilder $this$navigation, int id, int startDestination, Function1<? super NavGraphBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter($this$navigation, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder($this$navigation.getProvider(), id, startDestination);
        builder.invoke(navGraphBuilder);
        $this$navigation.destination(navGraphBuilder);
    }

    public static final void navigation(NavGraphBuilder $this$navigation, String startDestination, String route, Function1<? super NavGraphBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter($this$navigation, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(builder, "builder");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder($this$navigation.getProvider(), startDestination, route);
        builder.invoke(navGraphBuilder);
        $this$navigation.destination(navGraphBuilder);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder $this$navigation_u24default, KClass startDestination, Map typeMap, Function1 builder, int i, Object obj) {
        if ((i & 2) != 0) {
            typeMap = MapsKt.emptyMap();
        }
        Intrinsics.checkNotNullParameter($this$navigation_u24default, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        NavigatorProvider provider = $this$navigation_u24default.getProvider();
        Intrinsics.reifiedOperationMarker(4, "T");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(provider, (KClass<?>) startDestination, (KClass<?>) Reflection.getOrCreateKotlinClass(Object.class), (Map<KType, NavType<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        $this$navigation_u24default.destination(navGraphBuilder);
    }

    public static final /* synthetic */ <T> void navigation(NavGraphBuilder $this$navigation, KClass<?> startDestination, Map<KType, NavType<?>> typeMap, Function1<? super NavGraphBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter($this$navigation, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        NavigatorProvider provider = $this$navigation.getProvider();
        Intrinsics.reifiedOperationMarker(4, "T");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(provider, startDestination, (KClass<?>) Reflection.getOrCreateKotlinClass(Object.class), typeMap);
        builder.invoke(navGraphBuilder);
        $this$navigation.destination(navGraphBuilder);
    }

    public static /* synthetic */ void navigation$default(NavGraphBuilder $this$navigation_u24default, Object startDestination, Map typeMap, Function1 builder, int i, Object obj) {
        if ((i & 2) != 0) {
            typeMap = MapsKt.emptyMap();
        }
        Intrinsics.checkNotNullParameter($this$navigation_u24default, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        NavigatorProvider provider = $this$navigation_u24default.getProvider();
        Intrinsics.reifiedOperationMarker(4, "T");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(provider, startDestination, (KClass<?>) Reflection.getOrCreateKotlinClass(Object.class), (Map<KType, NavType<?>>) typeMap);
        builder.invoke(navGraphBuilder);
        $this$navigation_u24default.destination(navGraphBuilder);
    }

    public static final /* synthetic */ <T> void navigation(NavGraphBuilder $this$navigation, Object startDestination, Map<KType, NavType<?>> typeMap, Function1<? super NavGraphBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter($this$navigation, "<this>");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        NavigatorProvider provider = $this$navigation.getProvider();
        Intrinsics.reifiedOperationMarker(4, "T");
        NavGraphBuilder navGraphBuilder = new NavGraphBuilder(provider, startDestination, (KClass<?>) Reflection.getOrCreateKotlinClass(Object.class), typeMap);
        builder.invoke(navGraphBuilder);
        $this$navigation.destination(navGraphBuilder);
    }
}
