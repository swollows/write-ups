package androidx.navigation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

@Metadata(d1 = {"\u0000>\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006\u001aZ\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0007\u0018\u0001*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u001d\b\u0002\u0010\u000b\u001a\u0017\u0012\u0004\u0012\u00020\r\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u000e¢\u0006\u0002\b\u000f0\f2\u0019\b\n\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\bø\u0001\u0000\u001a^\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0007*\u00020\b2\u0006\u0010\t\u001a\u00020\n2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00070\u00112\u001b\u0010\u000b\u001a\u0017\u0012\u0004\u0012\u00020\r\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u000e¢\u0006\u0002\b\u000f0\f2\u0017\u0010\u0002\u001a\u0013\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0002\b\u0006H\u0007\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0012"}, d2 = {"navDeepLink", "Landroidx/navigation/NavDeepLink;", "deepLinkBuilder", "Lkotlin/Function1;", "Landroidx/navigation/NavDeepLinkDslBuilder;", "", "Lkotlin/ExtensionFunctionType;", "T", "", "basePath", "", "typeMap", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "route", "Lkotlin/reflect/KClass;", "navigation-common_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: NavDeepLinkDslBuilder.kt */
public final class NavDeepLinkDslBuilderKt {
    public static final NavDeepLink navDeepLink(Function1<? super NavDeepLinkDslBuilder, Unit> deepLinkBuilder) {
        Intrinsics.checkNotNullParameter(deepLinkBuilder, "deepLinkBuilder");
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder();
        deepLinkBuilder.invoke(navDeepLinkDslBuilder);
        return navDeepLinkDslBuilder.build$navigation_common_release();
    }

    public static /* synthetic */ NavDeepLink navDeepLink$default(String basePath, Map typeMap, Function1 deepLinkBuilder, int i, Object obj) {
        if ((i & 2) != 0) {
            typeMap = MapsKt.emptyMap();
        }
        if ((i & 4) != 0) {
            deepLinkBuilder = NavDeepLinkDslBuilderKt$navDeepLink$1.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(basePath, "basePath");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(deepLinkBuilder, "deepLinkBuilder");
        Intrinsics.reifiedOperationMarker(4, "T");
        return navDeepLink(basePath, Reflection.getOrCreateKotlinClass(Object.class), typeMap, deepLinkBuilder);
    }

    public static final /* synthetic */ <T> NavDeepLink navDeepLink(String basePath, Map<KType, NavType<?>> typeMap, Function1<? super NavDeepLinkDslBuilder, Unit> deepLinkBuilder) {
        Intrinsics.checkNotNullParameter(basePath, "basePath");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(deepLinkBuilder, "deepLinkBuilder");
        Intrinsics.reifiedOperationMarker(4, "T");
        return navDeepLink(basePath, Reflection.getOrCreateKotlinClass(Object.class), typeMap, deepLinkBuilder);
    }

    public static final <T> NavDeepLink navDeepLink(String basePath, KClass<T> route, Map<KType, NavType<?>> typeMap, Function1<? super NavDeepLinkDslBuilder, Unit> deepLinkBuilder) {
        Intrinsics.checkNotNullParameter(basePath, "basePath");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(deepLinkBuilder, "deepLinkBuilder");
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder(basePath, route, typeMap);
        deepLinkBuilder.invoke(navDeepLinkDslBuilder);
        return navDeepLinkDslBuilder.build$navigation_common_release();
    }
}
