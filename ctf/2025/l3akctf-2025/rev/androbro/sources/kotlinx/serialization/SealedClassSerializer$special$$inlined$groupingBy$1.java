package kotlinx.serialization;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.Grouping;
import kotlin.reflect.KClass;

@Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010(\n\u0000*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0015\u0010\u0002\u001a\u00028\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H\u0016¨\u0006\u0007¸\u0006\u0000"}, d2 = {"kotlin/collections/CollectionsKt___CollectionsKt$groupingBy$1", "Lkotlin/collections/Grouping;", "keyOf", "element", "(Ljava/lang/Object;)Ljava/lang/Object;", "sourceIterator", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: _Collections.kt */
public final class SealedClassSerializer$special$$inlined$groupingBy$1 implements Grouping<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>, String> {
    final /* synthetic */ Iterable $this_groupingBy;

    public SealedClassSerializer$special$$inlined$groupingBy$1(Iterable $receiver) {
        this.$this_groupingBy = $receiver;
    }

    public Iterator<Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>>> sourceIterator() {
        return this.$this_groupingBy.iterator();
    }

    public String keyOf(Map.Entry<? extends KClass<? extends T>, ? extends KSerializer<? extends T>> element) {
        return ((KSerializer) element.getValue()).getDescriptor().getSerialName();
    }
}
