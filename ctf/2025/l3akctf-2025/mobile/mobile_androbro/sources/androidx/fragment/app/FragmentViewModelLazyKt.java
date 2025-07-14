package androidx.fragment.app;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.lifecycle.viewmodel.CreationExtras;
import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\bø\u0001\u0000\u001aF\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0010\b\n\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\bø\u0001\u0000\u001aJ\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007\u001aZ\u0010\n\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u00062\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007\u001aD\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u000e\b\n\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\bø\u0001\u0000\u001aV\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u000e\b\n\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00110\u00062\u0010\b\n\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00062\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0012²\u0006\u0016\u0010\u0013\u001a\u00020\u0011\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003X\u0002²\u0006\u0016\u0010\u0013\u001a\u00020\u0011\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003X\u0002"}, d2 = {"activityViewModels", "Lkotlin/Lazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "factoryProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "extrasProducer", "Landroidx/lifecycle/viewmodel/CreationExtras;", "createViewModelLazy", "viewModelClass", "Lkotlin/reflect/KClass;", "storeProducer", "Landroidx/lifecycle/ViewModelStore;", "viewModels", "ownerProducer", "Landroidx/lifecycle/ViewModelStoreOwner;", "fragment-ktx_release", "owner"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* compiled from: FragmentViewModelLazy.kt */
public final class FragmentViewModelLazyKt {
    public static /* synthetic */ Lazy viewModels$default(Fragment $this$viewModels_u24default, Function0 ownerProducer, Function0 factoryProducer, int i, Object obj) {
        Function0 function0;
        if ((i & 1) != 0) {
            ownerProducer = new FragmentViewModelLazyKt$viewModels$1($this$viewModels_u24default);
        }
        if ((i & 2) != 0) {
            factoryProducer = null;
        }
        Intrinsics.checkNotNullParameter($this$viewModels_u24default, "<this>");
        Intrinsics.checkNotNullParameter(ownerProducer, "ownerProducer");
        Lazy owner$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$2(ownerProducer));
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        Function0 fragmentViewModelLazyKt$viewModels$2 = new FragmentViewModelLazyKt$viewModels$2(owner$delegate);
        Function0 fragmentViewModelLazyKt$viewModels$3 = new FragmentViewModelLazyKt$viewModels$3(owner$delegate);
        if (factoryProducer == null) {
            function0 = new FragmentViewModelLazyKt$viewModels$4($this$viewModels_u24default, owner$delegate);
        } else {
            function0 = factoryProducer;
        }
        return createViewModelLazy($this$viewModels_u24default, orCreateKotlinClass, fragmentViewModelLazyKt$viewModels$2, fragmentViewModelLazyKt$viewModels$3, function0);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by viewModels that takes a CreationExtras producer")
    public static final /* synthetic */ <VM extends ViewModel> Lazy<VM> viewModels(Fragment $this$viewModels, Function0<? extends ViewModelStoreOwner> ownerProducer, Function0<? extends ViewModelProvider.Factory> factoryProducer) {
        Function0<? extends ViewModelProvider.Factory> function0;
        Intrinsics.checkNotNullParameter($this$viewModels, "<this>");
        Intrinsics.checkNotNullParameter(ownerProducer, "ownerProducer");
        Lazy owner$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$2(ownerProducer));
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        Function0 fragmentViewModelLazyKt$viewModels$2 = new FragmentViewModelLazyKt$viewModels$2(owner$delegate);
        Function0 fragmentViewModelLazyKt$viewModels$3 = new FragmentViewModelLazyKt$viewModels$3(owner$delegate);
        if (factoryProducer == null) {
            function0 = new FragmentViewModelLazyKt$viewModels$4($this$viewModels, owner$delegate);
        } else {
            function0 = factoryProducer;
        }
        return createViewModelLazy($this$viewModels, orCreateKotlinClass, fragmentViewModelLazyKt$viewModels$2, fragmentViewModelLazyKt$viewModels$3, function0);
    }

    /* access modifiers changed from: private */
    /* renamed from: viewModels$lambda-0  reason: not valid java name */
    public static final ViewModelStoreOwner m151viewModels$lambda0(Lazy<? extends ViewModelStoreOwner> $owner$delegate) {
        return (ViewModelStoreOwner) $owner$delegate.getValue();
    }

    public static /* synthetic */ Lazy viewModels$default(Fragment $this$viewModels_u24default, Function0 ownerProducer, Function0 extrasProducer, Function0 factoryProducer, int i, Object obj) {
        Function0 function0;
        if ((i & 1) != 0) {
            ownerProducer = new FragmentViewModelLazyKt$viewModels$5($this$viewModels_u24default);
        }
        if ((i & 2) != 0) {
            extrasProducer = null;
        }
        if ((i & 4) != 0) {
            factoryProducer = null;
        }
        Intrinsics.checkNotNullParameter($this$viewModels_u24default, "<this>");
        Intrinsics.checkNotNullParameter(ownerProducer, "ownerProducer");
        Lazy owner$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$4(ownerProducer));
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        Function0 fragmentViewModelLazyKt$viewModels$6 = new FragmentViewModelLazyKt$viewModels$6(owner$delegate);
        Function0 fragmentViewModelLazyKt$viewModels$7 = new FragmentViewModelLazyKt$viewModels$7(extrasProducer, owner$delegate);
        if (factoryProducer == null) {
            function0 = new FragmentViewModelLazyKt$viewModels$8($this$viewModels_u24default, owner$delegate);
        } else {
            function0 = factoryProducer;
        }
        return createViewModelLazy($this$viewModels_u24default, orCreateKotlinClass, fragmentViewModelLazyKt$viewModels$6, fragmentViewModelLazyKt$viewModels$7, function0);
    }

    public static final /* synthetic */ <VM extends ViewModel> Lazy<VM> viewModels(Fragment $this$viewModels, Function0<? extends ViewModelStoreOwner> ownerProducer, Function0<? extends CreationExtras> extrasProducer, Function0<? extends ViewModelProvider.Factory> factoryProducer) {
        Function0<? extends ViewModelProvider.Factory> function0;
        Intrinsics.checkNotNullParameter($this$viewModels, "<this>");
        Intrinsics.checkNotNullParameter(ownerProducer, "ownerProducer");
        Lazy owner$delegate = LazyKt.lazy(LazyThreadSafetyMode.NONE, new FragmentViewModelLazyKt$viewModels$owner$4(ownerProducer));
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        Function0 fragmentViewModelLazyKt$viewModels$6 = new FragmentViewModelLazyKt$viewModels$6(owner$delegate);
        Function0 fragmentViewModelLazyKt$viewModels$7 = new FragmentViewModelLazyKt$viewModels$7(extrasProducer, owner$delegate);
        if (factoryProducer == null) {
            function0 = new FragmentViewModelLazyKt$viewModels$8($this$viewModels, owner$delegate);
        } else {
            function0 = factoryProducer;
        }
        return createViewModelLazy($this$viewModels, orCreateKotlinClass, fragmentViewModelLazyKt$viewModels$6, fragmentViewModelLazyKt$viewModels$7, function0);
    }

    /* access modifiers changed from: private */
    /* renamed from: viewModels$lambda-1  reason: not valid java name */
    public static final ViewModelStoreOwner m152viewModels$lambda1(Lazy<? extends ViewModelStoreOwner> $owner$delegate) {
        return (ViewModelStoreOwner) $owner$delegate.getValue();
    }

    public static /* synthetic */ Lazy activityViewModels$default(Fragment $this$activityViewModels_u24default, Function0 factoryProducer, int i, Object obj) {
        Function0 function0;
        if ((i & 1) != 0) {
            factoryProducer = null;
        }
        Intrinsics.checkNotNullParameter($this$activityViewModels_u24default, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        Function0 fragmentViewModelLazyKt$activityViewModels$1 = new FragmentViewModelLazyKt$activityViewModels$1($this$activityViewModels_u24default);
        Function0 fragmentViewModelLazyKt$activityViewModels$2 = new FragmentViewModelLazyKt$activityViewModels$2($this$activityViewModels_u24default);
        if (factoryProducer == null) {
            function0 = new FragmentViewModelLazyKt$activityViewModels$3($this$activityViewModels_u24default);
        } else {
            function0 = factoryProducer;
        }
        return createViewModelLazy($this$activityViewModels_u24default, orCreateKotlinClass, fragmentViewModelLazyKt$activityViewModels$1, fragmentViewModelLazyKt$activityViewModels$2, function0);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by activityViewModels that takes a CreationExtras producer")
    public static final /* synthetic */ <VM extends ViewModel> Lazy<VM> activityViewModels(Fragment $this$activityViewModels, Function0<? extends ViewModelProvider.Factory> factoryProducer) {
        Function0<? extends ViewModelProvider.Factory> function0;
        Intrinsics.checkNotNullParameter($this$activityViewModels, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        Function0 fragmentViewModelLazyKt$activityViewModels$1 = new FragmentViewModelLazyKt$activityViewModels$1($this$activityViewModels);
        Function0 fragmentViewModelLazyKt$activityViewModels$2 = new FragmentViewModelLazyKt$activityViewModels$2($this$activityViewModels);
        if (factoryProducer == null) {
            function0 = new FragmentViewModelLazyKt$activityViewModels$3($this$activityViewModels);
        } else {
            function0 = factoryProducer;
        }
        return createViewModelLazy($this$activityViewModels, orCreateKotlinClass, fragmentViewModelLazyKt$activityViewModels$1, fragmentViewModelLazyKt$activityViewModels$2, function0);
    }

    public static /* synthetic */ Lazy activityViewModels$default(Fragment $this$activityViewModels_u24default, Function0 extrasProducer, Function0 factoryProducer, int i, Object obj) {
        Function0 function0;
        if ((i & 1) != 0) {
            extrasProducer = null;
        }
        if ((i & 2) != 0) {
            factoryProducer = null;
        }
        Intrinsics.checkNotNullParameter($this$activityViewModels_u24default, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        Function0 fragmentViewModelLazyKt$activityViewModels$4 = new FragmentViewModelLazyKt$activityViewModels$4($this$activityViewModels_u24default);
        Function0 fragmentViewModelLazyKt$activityViewModels$5 = new FragmentViewModelLazyKt$activityViewModels$5(extrasProducer, $this$activityViewModels_u24default);
        if (factoryProducer == null) {
            function0 = new FragmentViewModelLazyKt$activityViewModels$6($this$activityViewModels_u24default);
        } else {
            function0 = factoryProducer;
        }
        return createViewModelLazy($this$activityViewModels_u24default, orCreateKotlinClass, fragmentViewModelLazyKt$activityViewModels$4, fragmentViewModelLazyKt$activityViewModels$5, function0);
    }

    public static final /* synthetic */ <VM extends ViewModel> Lazy<VM> activityViewModels(Fragment $this$activityViewModels, Function0<? extends CreationExtras> extrasProducer, Function0<? extends ViewModelProvider.Factory> factoryProducer) {
        Function0<? extends ViewModelProvider.Factory> function0;
        Intrinsics.checkNotNullParameter($this$activityViewModels, "<this>");
        Intrinsics.reifiedOperationMarker(4, "VM");
        KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(ViewModel.class);
        Function0 fragmentViewModelLazyKt$activityViewModels$4 = new FragmentViewModelLazyKt$activityViewModels$4($this$activityViewModels);
        Function0 fragmentViewModelLazyKt$activityViewModels$5 = new FragmentViewModelLazyKt$activityViewModels$5(extrasProducer, $this$activityViewModels);
        if (factoryProducer == null) {
            function0 = new FragmentViewModelLazyKt$activityViewModels$6($this$activityViewModels);
        } else {
            function0 = factoryProducer;
        }
        return createViewModelLazy($this$activityViewModels, orCreateKotlinClass, fragmentViewModelLazyKt$activityViewModels$4, fragmentViewModelLazyKt$activityViewModels$5, function0);
    }

    public static /* synthetic */ Lazy createViewModelLazy$default(Fragment fragment, KClass kClass, Function0 function0, Function0 function02, int i, Object obj) {
        if ((i & 4) != 0) {
            function02 = null;
        }
        return createViewModelLazy(fragment, kClass, function0, function02);
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "Superseded by createViewModelLazy that takes a CreationExtras producer")
    public static final /* synthetic */ Lazy createViewModelLazy(Fragment $this$createViewModelLazy, KClass viewModelClass, Function0 storeProducer, Function0 factoryProducer) {
        Intrinsics.checkNotNullParameter($this$createViewModelLazy, "<this>");
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        return createViewModelLazy($this$createViewModelLazy, viewModelClass, storeProducer, new FragmentViewModelLazyKt$createViewModelLazy$1($this$createViewModelLazy), factoryProducer);
    }

    public static /* synthetic */ Lazy createViewModelLazy$default(Fragment fragment, KClass kClass, Function0 function0, Function0 function02, Function0 function03, int i, Object obj) {
        if ((i & 4) != 0) {
            function02 = new FragmentViewModelLazyKt$createViewModelLazy$2(fragment);
        }
        if ((i & 8) != 0) {
            function03 = null;
        }
        return createViewModelLazy(fragment, kClass, function0, function02, function03);
    }

    public static final <VM extends ViewModel> Lazy<VM> createViewModelLazy(Fragment $this$createViewModelLazy, KClass<VM> viewModelClass, Function0<? extends ViewModelStore> storeProducer, Function0<? extends CreationExtras> extrasProducer, Function0<? extends ViewModelProvider.Factory> factoryProducer) {
        Intrinsics.checkNotNullParameter($this$createViewModelLazy, "<this>");
        Intrinsics.checkNotNullParameter(viewModelClass, "viewModelClass");
        Intrinsics.checkNotNullParameter(storeProducer, "storeProducer");
        Intrinsics.checkNotNullParameter(extrasProducer, "extrasProducer");
        return new ViewModelLazy<>(viewModelClass, storeProducer, factoryProducer == null ? new FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1($this$createViewModelLazy) : factoryProducer, extrasProducer);
    }
}
