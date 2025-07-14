package androidx.navigation.fragment;

import androidx.fragment.app.DialogFragment;
import androidx.navigation.NavDestination;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import androidx.navigation.NavType;
import androidx.navigation.fragment.DialogFragmentNavigator;
import java.util.Map;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmClassMappingKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;
import kotlin.reflect.KType;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B)\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b¢\u0006\u0002\u0010\nB'\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b¢\u0006\u0002\u0010\rBL\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u000e\u0010\u000b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u000e0\b\u0012\u001b\u0010\u000f\u001a\u0017\u0012\u0004\u0012\u00020\u0011\u0012\r\u0012\u000b\u0012\u0002\b\u00030\u0012¢\u0006\u0002\b\u00130\u0010\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\bX\u000e¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Landroidx/navigation/fragment/DialogFragmentNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/fragment/DialogFragmentNavigator$Destination;", "navigator", "Landroidx/navigation/fragment/DialogFragmentNavigator;", "id", "", "fragmentClass", "Lkotlin/reflect/KClass;", "Landroidx/fragment/app/DialogFragment;", "(Landroidx/navigation/fragment/DialogFragmentNavigator;ILkotlin/reflect/KClass;)V", "route", "", "(Landroidx/navigation/fragment/DialogFragmentNavigator;Ljava/lang/String;Lkotlin/reflect/KClass;)V", "", "typeMap", "", "Lkotlin/reflect/KType;", "Landroidx/navigation/NavType;", "Lkotlin/jvm/JvmSuppressWildcards;", "(Landroidx/navigation/fragment/DialogFragmentNavigator;Lkotlin/reflect/KClass;Ljava/util/Map;Lkotlin/reflect/KClass;)V", "build", "navigation-fragment_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@NavDestinationDsl
/* compiled from: DialogFragmentNavigatorDestinationBuilder.kt */
public final class DialogFragmentNavigatorDestinationBuilder extends NavDestinationBuilder<DialogFragmentNavigator.Destination> {
    private KClass<? extends DialogFragment> fragmentClass;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    @Deprecated(message = "Use routes to build your DialogFragmentNavigatorDestination instead", replaceWith = @ReplaceWith(expression = "DialogFragmentNavigatorDestinationBuilder(navigator, route = id.toString(), fragmentClass) ", imports = {}))
    public DialogFragmentNavigatorDestinationBuilder(DialogFragmentNavigator navigator, int id, KClass<? extends DialogFragment> fragmentClass2) {
        super(navigator, id);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(fragmentClass2, "fragmentClass");
        this.fragmentClass = fragmentClass2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogFragmentNavigatorDestinationBuilder(DialogFragmentNavigator navigator, String route, KClass<? extends DialogFragment> fragmentClass2) {
        super(navigator, route);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(fragmentClass2, "fragmentClass");
        this.fragmentClass = fragmentClass2;
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public DialogFragmentNavigatorDestinationBuilder(DialogFragmentNavigator navigator, KClass<? extends Object> route, Map<KType, NavType<?>> typeMap, KClass<? extends DialogFragment> fragmentClass2) {
        super(navigator, (KClass<?>) route, typeMap);
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(typeMap, "typeMap");
        Intrinsics.checkNotNullParameter(fragmentClass2, "fragmentClass");
        this.fragmentClass = fragmentClass2;
    }

    public DialogFragmentNavigator.Destination build() {
        NavDestination build = super.build();
        String name = JvmClassMappingKt.getJavaClass(this.fragmentClass).getName();
        Intrinsics.checkNotNullExpressionValue(name, "fragmentClass.java.name");
        ((DialogFragmentNavigator.Destination) build).setClassName(name);
        return (DialogFragmentNavigator.Destination) build;
    }
}
