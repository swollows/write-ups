package kotlinx.serialization.encoding;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a;\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\nH\bø\u0001\u0000\u001ab\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u000b*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000b0\r24\b\u0004\u0010\u0007\u001a.\u0012\u0004\u0012\u00020\t\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u000f\u0012\b\b\u0010\u0012\u0004\b\b(\u0011\u0012\u0004\u0012\u0002H\u000b\u0012\u0004\u0012\u00020\u00010\u000e¢\u0006\u0002\b\nH\bø\u0001\u0000\u001a3\u0010\u0012\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0019\b\u0004\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\nH\bø\u0001\u0000\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0013"}, d2 = {"encodeCollection", "", "Lkotlinx/serialization/encoding/Encoder;", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "collectionSize", "", "block", "Lkotlin/Function1;", "Lkotlinx/serialization/encoding/CompositeEncoder;", "Lkotlin/ExtensionFunctionType;", "E", "collection", "", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "index", "encodeStructure", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* compiled from: Encoding.kt */
public final class EncodingKt {
    public static final void encodeStructure(Encoder $this$encodeStructure, SerialDescriptor descriptor, Function1<? super CompositeEncoder, Unit> block) {
        Intrinsics.checkNotNullParameter($this$encodeStructure, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(block, "block");
        CompositeEncoder composite = $this$encodeStructure.beginStructure(descriptor);
        block.invoke(composite);
        composite.endStructure(descriptor);
    }

    public static final void encodeCollection(Encoder $this$encodeCollection, SerialDescriptor descriptor, int collectionSize, Function1<? super CompositeEncoder, Unit> block) {
        Intrinsics.checkNotNullParameter($this$encodeCollection, "<this>");
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        Intrinsics.checkNotNullParameter(block, "block");
        CompositeEncoder composite = $this$encodeCollection.beginCollection(descriptor, collectionSize);
        block.invoke(composite);
        composite.endStructure(descriptor);
    }

    public static final <E> void encodeCollection(Encoder $this$encodeCollection, SerialDescriptor descriptor, Collection<? extends E> collection, Function3<? super CompositeEncoder, ? super Integer, ? super E, Unit> block) {
        SerialDescriptor serialDescriptor = descriptor;
        Collection<? extends E> $this$forEachIndexed$iv = collection;
        Function3<? super CompositeEncoder, ? super Integer, ? super E, Unit> function3 = block;
        Intrinsics.checkNotNullParameter($this$encodeCollection, "<this>");
        Intrinsics.checkNotNullParameter(serialDescriptor, "descriptor");
        Intrinsics.checkNotNullParameter($this$forEachIndexed$iv, "collection");
        Intrinsics.checkNotNullParameter(function3, "block");
        int $i$f$encodeCollection = 0;
        CompositeEncoder composite$iv = $this$encodeCollection.beginCollection(serialDescriptor, collection.size());
        CompositeEncoder $this$encodeCollection_u24lambda_u241 = composite$iv;
        int index$iv = 0;
        for (Object item$iv : $this$forEachIndexed$iv) {
            int index$iv2 = index$iv + 1;
            if (index$iv < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            function3.invoke($this$encodeCollection_u24lambda_u241, Integer.valueOf(index$iv), item$iv);
            Collection<? extends E> collection2 = collection;
            index$iv = index$iv2;
            $i$f$encodeCollection = $i$f$encodeCollection;
        }
        composite$iv.endStructure(serialDescriptor);
    }
}
