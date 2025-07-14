package androidx.navigation;

import androidx.navigation.NavOptions;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;
import kotlin.text.StringsKt;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u001f\u0010-\u001a\u00020.2\u0017\u0010/\u001a\u0013\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020.00¢\u0006\u0002\b2J\r\u00103\u001a\u000204H\u0000¢\u0006\u0002\b5J8\u0010\u000e\u001a\u00020.\"\b\b\u0000\u00106*\u00020\u00012\u0006\u00107\u001a\u0002H62\u0019\b\u0002\u00108\u001a\u0013\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020.00¢\u0006\u0002\b2¢\u0006\u0002\u0010:J3\u0010\u000e\u001a\u00020.\"\n\b\u0000\u00106\u0018\u0001*\u00020\u00012\u0019\b\n\u00108\u001a\u0013\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020.00¢\u0006\u0002\b2H\bø\u0001\u0000J+\u0010\u000e\u001a\u00020.2\b\b\u0001\u0010;\u001a\u00020\r2\u0019\b\u0002\u00108\u001a\u0013\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020.00¢\u0006\u0002\b2J)\u0010\u000e\u001a\u00020.2\u0006\u00107\u001a\u00020\u00172\u0019\b\u0002\u00108\u001a\u0013\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020.00¢\u0006\u0002\b2J9\u0010\u000e\u001a\u00020.\"\b\b\u0000\u00106*\u00020\u00012\f\u0010<\u001a\b\u0012\u0004\u0012\u0002H60\u001d2\u0017\u00108\u001a\u0013\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020.00¢\u0006\u0002\b2H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\u0006X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR*\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8F@GX\u000e¢\u0006\u0012\u0012\u0004\b\u000f\u0010\u0002\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R&\u0010\u0014\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r8\u0006@@X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0011\"\u0004\b\u0016\u0010\u0013R(\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\f\u001a\u0004\u0018\u00010\u0017@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR2\u0010\u001e\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d2\f\u0010\f\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u001d8F@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R*\u0010#\u001a\u0004\u0018\u00010\u00012\b\u0010\f\u001a\u0004\u0018\u00010\u00018F@BX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R&\u0010)\u001a\u00020\u00062\u0006\u0010(\u001a\u00020\u00068F@FX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b*\u0010\t\"\u0004\b+\u0010\u000bR\u000e\u0010,\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006="}, d2 = {"Landroidx/navigation/NavOptionsBuilder;", "", "()V", "builder", "Landroidx/navigation/NavOptions$Builder;", "inclusive", "", "launchSingleTop", "getLaunchSingleTop", "()Z", "setLaunchSingleTop", "(Z)V", "value", "", "popUpTo", "getPopUpTo$annotations", "getPopUpTo", "()I", "setPopUpTo", "(I)V", "popUpToId", "getPopUpToId", "setPopUpToId$navigation_common_release", "", "popUpToRoute", "getPopUpToRoute", "()Ljava/lang/String;", "setPopUpToRoute", "(Ljava/lang/String;)V", "Lkotlin/reflect/KClass;", "popUpToRouteClass", "getPopUpToRouteClass", "()Lkotlin/reflect/KClass;", "setPopUpToRouteClass", "(Lkotlin/reflect/KClass;)V", "popUpToRouteObject", "getPopUpToRouteObject", "()Ljava/lang/Object;", "setPopUpToRouteObject", "(Ljava/lang/Object;)V", "<set-?>", "restoreState", "getRestoreState", "setRestoreState", "saveState", "anim", "", "animBuilder", "Lkotlin/Function1;", "Landroidx/navigation/AnimBuilder;", "Lkotlin/ExtensionFunctionType;", "build", "Landroidx/navigation/NavOptions;", "build$navigation_common_release", "T", "route", "popUpToBuilder", "Landroidx/navigation/PopUpToBuilder;", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "id", "klass", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@NavOptionsDsl
/* compiled from: NavOptionsBuilder.kt */
public final class NavOptionsBuilder {
    private final NavOptions.Builder builder = new NavOptions.Builder();
    private boolean inclusive;
    private boolean launchSingleTop;
    private int popUpToId = -1;
    private String popUpToRoute;
    private KClass<?> popUpToRouteClass;
    private Object popUpToRouteObject;
    private boolean restoreState;
    private boolean saveState;

    @Deprecated(message = "Use the popUpToId property.")
    public static /* synthetic */ void getPopUpTo$annotations() {
    }

    public final boolean getLaunchSingleTop() {
        return this.launchSingleTop;
    }

    public final void setLaunchSingleTop(boolean z) {
        this.launchSingleTop = z;
    }

    public final boolean getRestoreState() {
        return this.restoreState;
    }

    public final void setRestoreState(boolean z) {
        this.restoreState = z;
    }

    public final int getPopUpToId() {
        return this.popUpToId;
    }

    public final void setPopUpToId$navigation_common_release(int value) {
        this.popUpToId = value;
        this.inclusive = false;
    }

    public final int getPopUpTo() {
        return this.popUpToId;
    }

    @Deprecated(message = "Use the popUpTo function and passing in the id.")
    public final void setPopUpTo(int value) {
        popUpTo$default(this, value, (Function1) null, 2, (Object) null);
    }

    public final String getPopUpToRoute() {
        return this.popUpToRoute;
    }

    private final void setPopUpToRoute(String value) {
        if (value == null) {
            return;
        }
        if (!StringsKt.isBlank(value)) {
            this.popUpToRoute = value;
            this.inclusive = false;
            return;
        }
        throw new IllegalArgumentException("Cannot pop up to an empty route".toString());
    }

    public final KClass<?> getPopUpToRouteClass() {
        return this.popUpToRouteClass;
    }

    private final void setPopUpToRouteClass(KClass<?> value) {
        if (value != null) {
            this.popUpToRouteClass = value;
            this.inclusive = false;
        }
    }

    public final Object getPopUpToRouteObject() {
        return this.popUpToRouteObject;
    }

    private final void setPopUpToRouteObject(Object value) {
        if (value != null) {
            this.popUpToRouteObject = value;
            this.inclusive = false;
        }
    }

    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, int i, Function1 function1, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            function1 = NavOptionsBuilder$popUpTo$1.INSTANCE;
        }
        navOptionsBuilder.popUpTo(i, (Function1<? super PopUpToBuilder, Unit>) function1);
    }

    public final void popUpTo(int id, Function1<? super PopUpToBuilder, Unit> popUpToBuilder) {
        Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
        setPopUpToId$navigation_common_release(id);
        setPopUpToRoute((String) null);
        PopUpToBuilder builder2 = new PopUpToBuilder();
        popUpToBuilder.invoke(builder2);
        this.inclusive = builder2.getInclusive();
        this.saveState = builder2.getSaveState();
    }

    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, String str, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            function1 = NavOptionsBuilder$popUpTo$2.INSTANCE;
        }
        navOptionsBuilder.popUpTo(str, (Function1<? super PopUpToBuilder, Unit>) function1);
    }

    public final void popUpTo(String route, Function1<? super PopUpToBuilder, Unit> popUpToBuilder) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
        setPopUpToRoute(route);
        setPopUpToId$navigation_common_release(-1);
        PopUpToBuilder builder2 = new PopUpToBuilder();
        popUpToBuilder.invoke(builder2);
        this.inclusive = builder2.getInclusive();
        this.saveState = builder2.getSaveState();
    }

    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder $this, Function1 popUpToBuilder, int i, Object obj) {
        if ((i & 1) != 0) {
            popUpToBuilder = NavOptionsBuilder$popUpTo$3.INSTANCE;
        }
        Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
        Intrinsics.reifiedOperationMarker(4, "T");
        $this.popUpTo(Reflection.getOrCreateKotlinClass(Object.class), (Function1<? super PopUpToBuilder, Unit>) popUpToBuilder);
    }

    public final /* synthetic */ <T> void popUpTo(Function1<? super PopUpToBuilder, Unit> popUpToBuilder) {
        Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
        Intrinsics.reifiedOperationMarker(4, "T");
        popUpTo(Reflection.getOrCreateKotlinClass(Object.class), popUpToBuilder);
    }

    public final <T> void popUpTo(KClass<T> klass, Function1<? super PopUpToBuilder, Unit> popUpToBuilder) {
        Intrinsics.checkNotNullParameter(klass, "klass");
        Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
        setPopUpToRouteClass(klass);
        setPopUpToId$navigation_common_release(-1);
        setPopUpToRoute((String) null);
        PopUpToBuilder builder2 = new PopUpToBuilder();
        popUpToBuilder.invoke(builder2);
        this.inclusive = builder2.getInclusive();
        this.saveState = builder2.getSaveState();
    }

    public static /* synthetic */ void popUpTo$default(NavOptionsBuilder navOptionsBuilder, Object obj, Function1 function1, int i, Object obj2) {
        if ((i & 2) != 0) {
            function1 = NavOptionsBuilder$popUpTo$4.INSTANCE;
        }
        navOptionsBuilder.popUpTo(obj, (Function1<? super PopUpToBuilder, Unit>) function1);
    }

    public final <T> void popUpTo(T route, Function1<? super PopUpToBuilder, Unit> popUpToBuilder) {
        Intrinsics.checkNotNullParameter(route, "route");
        Intrinsics.checkNotNullParameter(popUpToBuilder, "popUpToBuilder");
        setPopUpToRouteObject(route);
        setPopUpToId$navigation_common_release(-1);
        setPopUpToRoute((String) null);
        PopUpToBuilder builder2 = new PopUpToBuilder();
        popUpToBuilder.invoke(builder2);
        this.inclusive = builder2.getInclusive();
        this.saveState = builder2.getSaveState();
    }

    public final void anim(Function1<? super AnimBuilder, Unit> animBuilder) {
        Intrinsics.checkNotNullParameter(animBuilder, "animBuilder");
        AnimBuilder $this$anim_u24lambda_u241 = new AnimBuilder();
        animBuilder.invoke($this$anim_u24lambda_u241);
        this.builder.setEnterAnim($this$anim_u24lambda_u241.getEnter()).setExitAnim($this$anim_u24lambda_u241.getExit()).setPopEnterAnim($this$anim_u24lambda_u241.getPopEnter()).setPopExitAnim($this$anim_u24lambda_u241.getPopExit());
    }

    public final NavOptions build$navigation_common_release() {
        NavOptions.Builder builder2 = this.builder;
        NavOptions.Builder $this$build_u24lambda_u242 = builder2;
        $this$build_u24lambda_u242.setLaunchSingleTop(this.launchSingleTop);
        $this$build_u24lambda_u242.setRestoreState(this.restoreState);
        if (this.popUpToRoute != null) {
            $this$build_u24lambda_u242.setPopUpTo(this.popUpToRoute, this.inclusive, this.saveState);
        } else if (this.popUpToRouteClass != null) {
            KClass<?> kClass = this.popUpToRouteClass;
            Intrinsics.checkNotNull(kClass);
            $this$build_u24lambda_u242.setPopUpTo(kClass, this.inclusive, this.saveState);
        } else if (this.popUpToRouteObject != null) {
            Object obj = this.popUpToRouteObject;
            Intrinsics.checkNotNull(obj);
            $this$build_u24lambda_u242.setPopUpTo(obj, this.inclusive, this.saveState);
        } else {
            $this$build_u24lambda_u242.setPopUpTo(this.popUpToId, this.inclusive, this.saveState);
        }
        return builder2.build();
    }
}
