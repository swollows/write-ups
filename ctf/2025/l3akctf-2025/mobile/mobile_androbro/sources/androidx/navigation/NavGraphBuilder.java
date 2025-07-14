package androidx.navigation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.SerializersKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0006\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B#\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0006¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\u000bBF\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\u0010\u0007\u001a\u0006\u0012\u0002\b\u00030\f\u0012\f\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f\u0012\u001b\u0010\r\u001a\u0017\u0012\u0004\u0012\u00020\u000f\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0010¢\u0006\u0002\b\u00110\u000e¢\u0006\u0002\u0010\u0012BB\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0013\u0012\f\u0010\n\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f\u0012\u001b\u0010\r\u001a\u0017\u0012\u0004\u0012\u00020\u000f\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0010¢\u0006\u0002\b\u00110\u000e¢\u0006\u0002\u0010\u0014J\u000e\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u0017J\b\u0010!\u001a\u00020\u0002H\u0016J\u001e\u0010 \u001a\u00020\u001f\"\b\b\u0000\u0010\"*\u00020\u00172\f\u0010#\u001a\b\u0012\u0004\u0012\u0002H\"0\u0001J\r\u0010$\u001a\u00020\u001f*\u00020\u0017H\u0002R\u0014\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016X\u0004¢\u0006\u0002\n\u0000R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\b\u0012\u0002\b\u0003\u0018\u00010\fX\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u001b\u001a\u00020\u00068\u0002@\u0002X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u0013X\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u001d\u001a\u0004\u0018\u00010\tX\u000e¢\u0006\u0002\n\u0000¨\u0006%"}, d2 = {"Landroidx/navigation/NavGraphBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/NavGraph;", "provider", "Landroidx/navigation/NavigatorProvider;", "id", "", "startDestination", "(Landroidx/navigation/NavigatorProvider;II)V", "", "route", "(Landroidx/navigation/NavigatorProvider;Ljava/lang/String;Ljava/lang/String;)V", "Lkotlin/reflect/KClass;", "typeMap", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Landroidx/navigation/NavigatorProvider;Lkotlin/reflect/KClass;Lkotlin/reflect/KClass;Ljava/util/Map;)V", "", "(Landroidx/navigation/NavigatorProvider;Ljava/lang/Object;Lkotlin/reflect/KClass;Ljava/util/Map;)V", "destinations", "", "Landroidx/navigation/NavDestination;", "getProvider", "()Landroidx/navigation/NavigatorProvider;", "startDestinationClass", "startDestinationId", "startDestinationObject", "startDestinationRoute", "addDestination", "", "destination", "build", "D", "navDestination", "unaryPlus", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@NavDestinationDsl
/* compiled from: NavGraphBuilder.kt */
public class NavGraphBuilder extends NavDestinationBuilder<NavGraph> {
    private final List<NavDestination> destinations = new ArrayList();
    private final NavigatorProvider provider;
    private KClass<?> startDestinationClass;
    private int startDestinationId;
    private Object startDestinationObject;
    private String startDestinationRoute;

    public final NavigatorProvider getProvider() {
        return this.provider;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Use routes to build your NavGraph instead", replaceWith = @ReplaceWith(expression = "NavGraphBuilder(provider, startDestination = startDestination.toString(), route = id.toString())", imports = {}))
    public NavGraphBuilder(NavigatorProvider provider2, int id, int startDestination) {
        super(provider2.getNavigator(NavGraphNavigator.class), id);
        Intrinsics.checkNotNullParameter(provider2, "provider");
        this.provider = provider2;
        this.startDestinationId = startDestination;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider provider2, String startDestination, String route) {
        super(provider2.getNavigator(NavGraphNavigator.class), route);
        Intrinsics.checkNotNullParameter(provider2, "provider");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        this.provider = provider2;
        this.startDestinationRoute = startDestination;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider provider2, KClass<?> startDestination, KClass<?> route, Map<KType, NavType<?>> typeMap) {
        super(provider2.getNavigator(NavGraphNavigator.class), route, typeMap);
        Intrinsics.checkNotNullParameter(provider2, "provider");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        this.provider = provider2;
        this.startDestinationClass = startDestination;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public NavGraphBuilder(NavigatorProvider provider2, Object startDestination, KClass<?> route, Map<KType, NavType<?>> typeMap) {
        super(provider2.getNavigator(NavGraphNavigator.class), route, typeMap);
        Intrinsics.checkNotNullParameter(provider2, "provider");
        Intrinsics.checkNotNullParameter(startDestination, "startDestination");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        this.provider = provider2;
        this.startDestinationObject = startDestination;
    }

    public final <D extends NavDestination> void destination(NavDestinationBuilder<? extends D> navDestination) {
        Intrinsics.checkNotNullParameter(navDestination, "navDestination");
        this.destinations.add(navDestination.build());
    }

    public final void unaryPlus(NavDestination $this$unaryPlus) {
        Intrinsics.checkNotNullParameter($this$unaryPlus, "<this>");
        addDestination($this$unaryPlus);
    }

    public final void addDestination(NavDestination destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        this.destinations.add(destination);
    }

    public NavGraph build() {
        NavDestination build = super.build();
        NavGraph navGraph = (NavGraph) build;
        navGraph.addDestinations((Collection<? extends NavDestination>) this.destinations);
        if (this.startDestinationId != 0 || this.startDestinationRoute != null || this.startDestinationClass != null || this.startDestinationObject != null) {
            if (this.startDestinationRoute != null) {
                String str = this.startDestinationRoute;
                Intrinsics.checkNotNull(str);
                navGraph.setStartDestination(str);
            } else if (this.startDestinationClass != null) {
                KClass<?> kClass = this.startDestinationClass;
                Intrinsics.checkNotNull(kClass);
                navGraph.setStartDestination(SerializersKt.serializer(kClass), NavGraphBuilder$build$1$1.INSTANCE);
            } else if (this.startDestinationObject != null) {
                Object obj = this.startDestinationObject;
                Intrinsics.checkNotNull(obj);
                navGraph.setStartDestination(obj);
            } else {
                navGraph.setStartDestination(this.startDestinationId);
            }
            return (NavGraph) build;
        } else if (getRoute() != null) {
            throw new IllegalStateException("You must set a start destination route");
        } else {
            throw new IllegalStateException("You must set a start destination id");
        }
    }
}
