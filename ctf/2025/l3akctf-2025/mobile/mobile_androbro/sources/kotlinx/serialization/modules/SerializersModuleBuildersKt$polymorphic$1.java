package kotlinx.serialization.modules;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "Base", "", "Lkotlinx/serialization/modules/PolymorphicModuleBuilder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 176)
/* compiled from: SerializersModuleBuilders.kt */
public final class SerializersModuleBuildersKt$polymorphic$1 extends Lambda implements Function1<PolymorphicModuleBuilder<? super Base>, Unit> {
    public static final SerializersModuleBuildersKt$polymorphic$1 INSTANCE = new SerializersModuleBuildersKt$polymorphic$1();

    public SerializersModuleBuildersKt$polymorphic$1() {
        super(1);
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        invoke((PolymorphicModuleBuilder) p1);
        return Unit.INSTANCE;
    }

    public final void invoke(PolymorphicModuleBuilder<? super Base> $this$null) {
        Intrinsics.checkNotNullParameter($this$null, "$this$null");
    }
}
