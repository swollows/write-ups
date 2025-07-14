package kotlinx.serialization.modules;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0000\u0010\u0000\u001a\u0006\u0012\u0002\b\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\u0010\u0010\u0004\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00010\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lkotlinx/serialization/KSerializer;", "T", "", "it", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* compiled from: SerializersModuleCollector.kt */
final class SerializersModuleCollector$contextual$1 extends Lambda implements Function1<List<? extends KSerializer<?>>, KSerializer<?>> {
    final /* synthetic */ KSerializer<T> $serializer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SerializersModuleCollector$contextual$1(KSerializer<T> kSerializer) {
        super(1);
        this.$serializer = kSerializer;
    }

    public final KSerializer<?> invoke(List<? extends KSerializer<?>> it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return this.$serializer;
    }
}
