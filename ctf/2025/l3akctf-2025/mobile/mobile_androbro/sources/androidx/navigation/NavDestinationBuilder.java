package androidx.navigation;

import androidx.navigation.NavDestination;
import androidx.navigation.serialization.RouteSerializerKt;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializersKt;

@Metadata(d1 = {"\u0000\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0017\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003B!\b\u0017\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bB!\b\u0016\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bBB\b\u0016\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005\u0012\f\u0010\t\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f\u0012\u001b\u0010\r\u001a\u0017\u0012\u0004\u0012\u00020\u000f\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0010¢\u0006\u0002\b\u00110\u000e¢\u0006\u0002\u0010\u0012B+\b\u0000\u0012\u000e\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u0013J)\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020\u00072\u0017\u0010+\u001a\u0013\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020)0,¢\u0006\u0002\b.H\u0007J\u0016\u0010/\u001a\u00020)2\u0006\u00100\u001a\u00020\n2\u0006\u0010/\u001a\u00020\u0018J'\u0010/\u001a\u00020)2\u0006\u00100\u001a\u00020\n2\u0017\u00101\u001a\u0013\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020)0,¢\u0006\u0002\b.J\r\u00103\u001a\u00028\u0000H\u0016¢\u0006\u0002\u00104J\u000e\u00105\u001a\u00020)2\u0006\u00106\u001a\u00020\u001bJ\u001f\u00105\u001a\u00020)2\u0017\u00106\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020)0,¢\u0006\u0002\b.J\u000e\u00105\u001a\u00020)2\u0006\u00108\u001a\u00020\nJ\"\u00105\u001a\u00020)\"\n\b\u0001\u00109\u0018\u0001*\u00020\u00032\u0006\u0010:\u001a\u00020\nH\b¢\u0006\u0002\b;J;\u00105\u001a\u00020)\"\n\b\u0001\u00109\u0018\u0001*\u00020\u00032\u0006\u0010:\u001a\u00020\n2\u0019\b\b\u00106\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020)0,¢\u0006\u0002\b.H\bø\u0001\u0000JA\u00105\u001a\u00020)\"\b\b\u0001\u00109*\u00020\u00032\u0006\u0010:\u001a\u00020\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H90\f2\u0017\u00106\u001a\u0013\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020)0,¢\u0006\u0002\b.H\u0007J\r\u0010<\u001a\u00028\u0000H\u0014¢\u0006\u0002\u00104R\u001a\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00160\u0015X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00180\u0015X\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001aX\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\u001e\u001a\u0004\u0018\u00010\u001fX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010!\"\u0004\b\"\u0010#R\u001c\u0010\u0004\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0005X\u0004¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u001e\u0010\r\u001a\u0012\u0012\u0004\u0012\u00020\u000f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00100\u000eX.¢\u0006\u0002\n\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006="}, d2 = {"Landroidx/navigation/NavDestinationBuilder;", "D", "Landroidx/navigation/NavDestination;", "", "navigator", "Landroidx/navigation/Navigator;", "id", "", "(Landroidx/navigation/Navigator;I)V", "route", "", "(Landroidx/navigation/Navigator;Ljava/lang/String;)V", "Lkotlin/reflect/KClass;", "typeMap", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Landroidx/navigation/Navigator;Lkotlin/reflect/KClass;Ljava/util/Map;)V", "(Landroidx/navigation/Navigator;ILjava/lang/String;)V", "actions", "", "Landroidx/navigation/NavAction;", "arguments", "Landroidx/navigation/NavArgument;", "deepLinks", "", "Landroidx/navigation/NavDeepLink;", "getId", "()I", "label", "", "getLabel", "()Ljava/lang/CharSequence;", "setLabel", "(Ljava/lang/CharSequence;)V", "getNavigator", "()Landroidx/navigation/Navigator;", "getRoute", "()Ljava/lang/String;", "action", "", "actionId", "actionBuilder", "Lkotlin/Function1;", "Landroidx/navigation/NavActionBuilder;", "Lkotlin/ExtensionFunctionType;", "argument", "name", "argumentBuilder", "Landroidx/navigation/NavArgumentBuilder;", "build", "()Landroidx/navigation/NavDestination;", "deepLink", "navDeepLink", "Landroidx/navigation/NavDeepLinkDslBuilder;", "uriPattern", "T", "basePath", "deepLinkSafeArgs", "instantiateDestination", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@NavDestinationDsl
/* compiled from: NavDestinationBuilder.kt */
public class NavDestinationBuilder<D extends NavDestination> {
    private Map<Integer, NavAction> actions;
    private Map<String, NavArgument> arguments;
    private List<NavDeepLink> deepLinks;
    private final int id;
    private CharSequence label;
    private final Navigator<? extends D> navigator;
    private final String route;
    private Map<KType, ? extends NavType<?>> typeMap;

    public NavDestinationBuilder(Navigator<? extends D> navigator2, int id2, String route2) {
        Intrinsics.checkNotNullParameter(navigator2, "navigator");
        this.navigator = navigator2;
        this.id = id2;
        this.route = route2;
        this.arguments = new LinkedHashMap();
        this.deepLinks = new ArrayList();
        this.actions = new LinkedHashMap();
    }

    /* access modifiers changed from: protected */
    public final Navigator<? extends D> getNavigator() {
        return this.navigator;
    }

    public final int getId() {
        return this.id;
    }

    public final String getRoute() {
        return this.route;
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Use routes to build your NavDestination instead", replaceWith = @ReplaceWith(expression = "NavDestinationBuilder(navigator, route = id.toString())", imports = {}))
    public NavDestinationBuilder(Navigator<? extends D> navigator2, int id2) {
        this(navigator2, id2, (String) null);
        Intrinsics.checkNotNullParameter(navigator2, "navigator");
    }

    /* JADX INFO: this call moved to the top of the method (can break code semantics) */
    public NavDestinationBuilder(Navigator<? extends D> navigator2, String route2) {
        this(navigator2, -1, route2);
        Intrinsics.checkNotNullParameter(navigator2, "navigator");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x000f, code lost:
        r0 = kotlinx.serialization.SerializersKt.serializer(r13);
     */
    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public NavDestinationBuilder(androidx.navigation.Navigator<? extends D> r12, kotlin.reflect.KClass<?> r13, java.util.Map<kotlin.reflect.KType, androidx.navigation.NavType<?>> r14) {
        /*
            r11 = this;
            java.lang.String r0 = "navigator"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r12, r0)
            java.lang.String r0 = "typeMap"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r14, r0)
            if (r13 == 0) goto L_0x001a
            kotlinx.serialization.KSerializer r0 = kotlinx.serialization.SerializersKt.serializer(r13)
            if (r0 == 0) goto L_0x001a
            int r0 = androidx.navigation.serialization.RouteSerializerKt.generateHashCode(r0)
            goto L_0x001b
        L_0x001a:
            r0 = -1
        L_0x001b:
            r1 = 0
            if (r13 == 0) goto L_0x0029
            kotlinx.serialization.KSerializer r2 = kotlinx.serialization.SerializersKt.serializer(r13)
            if (r2 == 0) goto L_0x0029
            r3 = 2
            java.lang.String r1 = androidx.navigation.serialization.RouteSerializerKt.generateRoutePattern$default(r2, r14, r1, r3, r1)
        L_0x0029:
            r11.<init>(r12, (int) r0, (java.lang.String) r1)
            if (r13 == 0) goto L_0x005f
            r0 = r13
            r1 = 0
            kotlinx.serialization.KSerializer r2 = kotlinx.serialization.SerializersKt.serializer(r0)
            java.util.List r2 = androidx.navigation.serialization.RouteSerializerKt.generateNavArguments(r2, r14)
            java.lang.Iterable r2 = (java.lang.Iterable) r2
            r3 = 0
            java.util.Iterator r4 = r2.iterator()
        L_0x003f:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x005c
            java.lang.Object r5 = r4.next()
            r6 = r5
            androidx.navigation.NamedNavArgument r6 = (androidx.navigation.NamedNavArgument) r6
            r7 = 0
            java.util.Map<java.lang.String, androidx.navigation.NavArgument> r8 = r11.arguments
            java.lang.String r9 = r6.getName()
            androidx.navigation.NavArgument r10 = r6.getArgument()
            r8.put(r9, r10)
            goto L_0x003f
        L_0x005c:
        L_0x005f:
            r11.typeMap = r14
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.navigation.NavDestinationBuilder.<init>(androidx.navigation.Navigator, kotlin.reflect.KClass, java.util.Map):void");
    }

    public final CharSequence getLabel() {
        return this.label;
    }

    public final void setLabel(CharSequence charSequence) {
        this.label = charSequence;
    }

    public final void argument(String name, Function1<? super NavArgumentBuilder, Unit> argumentBuilder) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(argumentBuilder, "argumentBuilder");
        Map<String, NavArgument> map = this.arguments;
        NavArgumentBuilder navArgumentBuilder = new NavArgumentBuilder();
        argumentBuilder.invoke(navArgumentBuilder);
        map.put(name, navArgumentBuilder.build());
    }

    public final void argument(String name, NavArgument argument) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(argument, "argument");
        this.arguments.put(name, argument);
    }

    public final void deepLink(String uriPattern) {
        Intrinsics.checkNotNullParameter(uriPattern, "uriPattern");
        this.deepLinks.add(new NavDeepLink(uriPattern));
    }

    public final /* synthetic */ <T> void deepLinkSafeArgs(String basePath) {
        Intrinsics.checkNotNullParameter(basePath, "basePath");
        Intrinsics.reifiedOperationMarker(4, "T");
        deepLink(basePath, Reflection.getOrCreateKotlinClass(Object.class), NavDestinationBuilder$deepLink$1.INSTANCE);
    }

    public final void deepLink(Function1<? super NavDeepLinkDslBuilder, Unit> navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        List<NavDeepLink> list = this.deepLinks;
        NavDeepLinkDslBuilder navDeepLinkDslBuilder = new NavDeepLinkDslBuilder();
        navDeepLink.invoke(navDeepLinkDslBuilder);
        list.add(navDeepLinkDslBuilder.build$navigation_common_release());
    }

    public final /* synthetic */ <T> void deepLink(String basePath, Function1<? super NavDeepLinkDslBuilder, Unit> navDeepLink) {
        Intrinsics.checkNotNullParameter(basePath, "basePath");
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        Intrinsics.reifiedOperationMarker(4, "T");
        deepLink(basePath, Reflection.getOrCreateKotlinClass(Object.class), navDeepLink);
    }

    public final <T> void deepLink(String basePath, KClass<T> route2, Function1<? super NavDeepLinkDslBuilder, Unit> navDeepLink) {
        Map<KType, ? extends NavType<?>> map;
        boolean z;
        String str = basePath;
        KClass<T> kClass = route2;
        Function1<? super NavDeepLinkDslBuilder, Unit> function1 = navDeepLink;
        Intrinsics.checkNotNullParameter(str, "basePath");
        Intrinsics.checkNotNullParameter(kClass, "route");
        Intrinsics.checkNotNullParameter(function1, "navDeepLink");
        if (this.typeMap != null) {
            KSerializer<T> serializer = SerializersKt.serializer(route2);
            Map<KType, ? extends NavType<?>> map2 = this.typeMap;
            if (map2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("typeMap");
                map2 = null;
            }
            for (NamedNavArgument it : RouteSerializerKt.generateNavArguments(serializer, map2)) {
                NavArgument arg = this.arguments.get(it.getName());
                if (arg == null || !Intrinsics.areEqual((Object) arg.getType(), (Object) it.getArgument().getType())) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (!z) {
                    throw new IllegalArgumentException(("Cannot add deeplink from KClass [" + kClass + "]. DeepLink contains unknown argument [" + it.getName() + "]. Ensure deeplink arguments matches the destination's route from KClass").toString());
                }
            }
            Map<KType, ? extends NavType<?>> map3 = this.typeMap;
            if (map3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("typeMap");
                map = null;
            } else {
                map = map3;
            }
            deepLink(NavDeepLinkDslBuilderKt.navDeepLink(str, kClass, map, function1));
            return;
        }
        throw new IllegalStateException(("Cannot add deeplink from KClass [" + kClass + "]. Use the NavDestinationBuilder constructor that takes a KClass with the same arguments.").toString());
    }

    public final void deepLink(NavDeepLink navDeepLink) {
        Intrinsics.checkNotNullParameter(navDeepLink, "navDeepLink");
        this.deepLinks.add(navDeepLink);
    }

    @Deprecated(message = "Building NavDestinations using IDs with the Kotlin DSL has been deprecated in favor of using routes. When using routes there is no need for actions.")
    public final void action(int actionId, Function1<? super NavActionBuilder, Unit> actionBuilder) {
        Intrinsics.checkNotNullParameter(actionBuilder, "actionBuilder");
        Map<Integer, NavAction> map = this.actions;
        Integer valueOf = Integer.valueOf(actionId);
        NavActionBuilder navActionBuilder = new NavActionBuilder();
        actionBuilder.invoke(navActionBuilder);
        map.put(valueOf, navActionBuilder.build$navigation_common_release());
    }

    /* access modifiers changed from: protected */
    public D instantiateDestination() {
        return this.navigator.createDestination();
    }

    public D build() {
        NavDestination instantiateDestination = instantiateDestination();
        NavDestination destination = instantiateDestination;
        destination.setLabel(this.label);
        for (Map.Entry element$iv : this.arguments.entrySet()) {
            destination.addArgument((String) element$iv.getKey(), (NavArgument) element$iv.getValue());
        }
        for (NavDeepLink deepLink : this.deepLinks) {
            destination.addDeepLink(deepLink);
        }
        for (Map.Entry element$iv2 : this.actions.entrySet()) {
            destination.putAction(((Number) element$iv2.getKey()).intValue(), (NavAction) element$iv2.getValue());
        }
        if (this.route != null) {
            destination.setRoute(this.route);
        }
        if (this.id != -1) {
            destination.setId(this.id);
        }
        return instantiateDestination;
    }
}
