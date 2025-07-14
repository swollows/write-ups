package androidx.navigation.fragment;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.NavType;
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

@Metadata(d1 = {"\u0000D\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\b\u001a?\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\nH\bø\u0001\u0000\u001a!\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\fH\b\u001a=\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\f2\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\nH\bø\u0001\u0000\u001aD\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003\"\n\b\u0001\u0010\r\u0018\u0001*\u00020\u000e*\u00020\u00042\u001d\b\u0002\u0010\u000f\u001a\u0017\u0012\u0004\u0012\u00020\u0011\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0012¢\u0006\u0002\b\u00130\u0010H\b\u001a`\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003\"\n\b\u0001\u0010\r\u0018\u0001*\u00020\u000e*\u00020\u00042\u001d\b\u0002\u0010\u000f\u001a\u0017\u0012\u0004\u0012\u00020\u0011\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0012¢\u0006\u0002\b\u00130\u00102\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\nH\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0014"}, d2 = {"fragment", "", "F", "Landroidx/fragment/app/Fragment;", "Landroidx/navigation/NavGraphBuilder;", "id", "", "builder", "Lkotlin/Function1;", "Landroidx/navigation/fragment/FragmentNavigatorDestinationBuilder;", "Lkotlin/ExtensionFunctionType;", "route", "", "T", "", "typeMap", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "navigation-fragment_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: FragmentNavigatorDestinationBuilder.kt */
public final class FragmentNavigatorDestinationBuilderKt {
    @Deprecated(message = "Use routes to create your FragmentDestination instead", replaceWith = @ReplaceWith(expression = "fragment<F>(route = id.toString())", imports = {}))
    public static final /* synthetic */ <F extends Fragment> void fragment(NavGraphBuilder $this$fragment, int id) {
        Intrinsics.checkNotNullParameter($this$fragment, "<this>");
        NavGraphBuilder $this$fragment$iv = $this$fragment;
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder = new FragmentNavigatorDestinationBuilder((FragmentNavigator) $this$fragment$iv.getProvider().getNavigator(FragmentNavigator.class), id, (KClass<? extends Fragment>) Reflection.getOrCreateKotlinClass(Fragment.class));
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder2 = fragmentNavigatorDestinationBuilder;
        $this$fragment$iv.destination(fragmentNavigatorDestinationBuilder);
    }

    @Deprecated(message = "Use routes to create your FragmentDestination instead", replaceWith = @ReplaceWith(expression = "fragment<F>(route = id.toString()) { builder.invoke() }", imports = {}))
    public static final /* synthetic */ <F extends Fragment> void fragment(NavGraphBuilder $this$fragment, int id, Function1<? super FragmentNavigatorDestinationBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter($this$fragment, "<this>");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder = new FragmentNavigatorDestinationBuilder((FragmentNavigator) $this$fragment.getProvider().getNavigator(FragmentNavigator.class), id, (KClass<? extends Fragment>) Reflection.getOrCreateKotlinClass(Fragment.class));
        builder.invoke(fragmentNavigatorDestinationBuilder);
        $this$fragment.destination(fragmentNavigatorDestinationBuilder);
    }

    public static final /* synthetic */ <F extends Fragment> void fragment(NavGraphBuilder $this$fragment, String route) {
        Intrinsics.checkNotNullParameter($this$fragment, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        NavGraphBuilder $this$fragment$iv = $this$fragment;
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder = new FragmentNavigatorDestinationBuilder((FragmentNavigator) $this$fragment$iv.getProvider().getNavigator(FragmentNavigator.class), route, (KClass<? extends Fragment>) Reflection.getOrCreateKotlinClass(Fragment.class));
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder2 = fragmentNavigatorDestinationBuilder;
        $this$fragment$iv.destination(fragmentNavigatorDestinationBuilder);
    }

    public static final /* synthetic */ <F extends Fragment> void fragment(NavGraphBuilder $this$fragment, String route, Function1<? super FragmentNavigatorDestinationBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter($this$fragment, "<this>");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder = new FragmentNavigatorDestinationBuilder((FragmentNavigator) $this$fragment.getProvider().getNavigator(FragmentNavigator.class), route, (KClass<? extends Fragment>) Reflection.getOrCreateKotlinClass(Fragment.class));
        builder.invoke(fragmentNavigatorDestinationBuilder);
        $this$fragment.destination(fragmentNavigatorDestinationBuilder);
    }

    public static /* synthetic */ void fragment$default(NavGraphBuilder $this$fragment_u24default, Map typeMap, int i, Object obj) {
        if ((i & 1) != 0) {
            typeMap = MapsKt.emptyMap();
        }
        Intrinsics.checkNotNullParameter($this$fragment_u24default, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        NavGraphBuilder $this$fragment$iv = $this$fragment_u24default;
        Intrinsics.reifiedOperationMarker(4, "T");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder = new FragmentNavigatorDestinationBuilder((FragmentNavigator) $this$fragment$iv.getProvider().getNavigator(FragmentNavigator.class), orCreateKotlinClass, typeMap, Reflection.getOrCreateKotlinClass(Fragment.class));
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder2 = fragmentNavigatorDestinationBuilder;
        $this$fragment$iv.destination(fragmentNavigatorDestinationBuilder);
    }

    public static final /* synthetic */ <F extends Fragment, T> void fragment(NavGraphBuilder $this$fragment, Map<KType, NavType<?>> typeMap) {
        Intrinsics.checkNotNullParameter($this$fragment, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        NavGraphBuilder $this$fragment$iv = $this$fragment;
        Intrinsics.reifiedOperationMarker(4, "T");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder = new FragmentNavigatorDestinationBuilder((FragmentNavigator) $this$fragment$iv.getProvider().getNavigator(FragmentNavigator.class), orCreateKotlinClass, typeMap, Reflection.getOrCreateKotlinClass(Fragment.class));
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder2 = fragmentNavigatorDestinationBuilder;
        $this$fragment$iv.destination(fragmentNavigatorDestinationBuilder);
    }

    public static /* synthetic */ void fragment$default(NavGraphBuilder $this$fragment_u24default, Map typeMap, Function1 builder, int i, Object obj) {
        if ((i & 1) != 0) {
            typeMap = MapsKt.emptyMap();
        }
        Intrinsics.checkNotNullParameter($this$fragment_u24default, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.reifiedOperationMarker(4, "T");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder = new FragmentNavigatorDestinationBuilder((FragmentNavigator) $this$fragment_u24default.getProvider().getNavigator(FragmentNavigator.class), orCreateKotlinClass, typeMap, Reflection.getOrCreateKotlinClass(Fragment.class));
        builder.invoke(fragmentNavigatorDestinationBuilder);
        $this$fragment_u24default.destination(fragmentNavigatorDestinationBuilder);
    }

    public static final /* synthetic */ <F extends Fragment, T> void fragment(NavGraphBuilder $this$fragment, Map<KType, NavType<?>> typeMap, Function1<? super FragmentNavigatorDestinationBuilder, Unit> builder) {
        Intrinsics.checkNotNullParameter($this$fragment, "<this>");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Intrinsics.reifiedOperationMarker(4, "T");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(Object.class);
        Intrinsics.reifiedOperationMarker(4, "F");
        FragmentNavigatorDestinationBuilder fragmentNavigatorDestinationBuilder = new FragmentNavigatorDestinationBuilder((FragmentNavigator) $this$fragment.getProvider().getNavigator(FragmentNavigator.class), orCreateKotlinClass, typeMap, Reflection.getOrCreateKotlinClass(Fragment.class));
        builder.invoke(fragmentNavigatorDestinationBuilder);
        $this$fragment.destination(fragmentNavigatorDestinationBuilder);
    }
}
