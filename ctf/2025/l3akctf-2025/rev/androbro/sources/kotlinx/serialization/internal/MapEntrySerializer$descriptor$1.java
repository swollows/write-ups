package kotlinx.serialization.internal;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H\n¢\u0006\u0002\b\u0005"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlinx/serialization/descriptors/ClassSerialDescriptorBuilder;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* compiled from: Tuples.kt */
final class MapEntrySerializer$descriptor$1 extends Lambda implements Function1<ClassSerialDescriptorBuilder, Unit> {
    final /* synthetic */ KSerializer<K> $keySerializer;
    final /* synthetic */ KSerializer<V> $valueSerializer;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MapEntrySerializer$descriptor$1(KSerializer<K> kSerializer, KSerializer<V> kSerializer2) {
        super(1);
        this.$keySerializer = kSerializer;
        this.$valueSerializer = kSerializer2;
    }

    public /* bridge */ /* synthetic */ Object invoke(Object p1) {
        invoke((ClassSerialDescriptorBuilder) p1);
        return Unit.INSTANCE;
    }

    public final void invoke(ClassSerialDescriptorBuilder $this$buildSerialDescriptor) {
        Intrinsics.checkNotNullParameter($this$buildSerialDescriptor, "$this$buildSerialDescriptor");
        ClassSerialDescriptorBuilder classSerialDescriptorBuilder = $this$buildSerialDescriptor;
        ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "key", this.$keySerializer.getDescriptor(), (List) null, false, 12, (Object) null);
        ClassSerialDescriptorBuilder.element$default(classSerialDescriptorBuilder, "value", this.$valueSerializer.getDescriptor(), (List) null, false, 12, (Object) null);
    }
}
