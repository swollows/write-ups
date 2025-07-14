package kotlinx.serialization.internal;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntProgression;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.InternalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.PrimitiveKind;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0010&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u0000*\u0004\b\u0000\u0010\u0001*\u0004\b\u0001\u0010\u0002*\u0004\b\u0002\u0010\u0003*\u0014\b\u0003\u0010\u0004*\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u00052 \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0001\u0012\u0004\u0012\u0002H\u00020\u0007\u0012\u0004\u0012\u0002H\u0003\u0012\u0004\u0012\u0002H\u00040\u0006B#\b\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t¢\u0006\u0002\u0010\u000bJ-\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00028\u00032\u0006\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u0019H\u0004¢\u0006\u0002\u0010\u001bJ-\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010\u0017\u001a\u00028\u00032\u0006\u0010\u001e\u001a\u00020\u001fH\u0004¢\u0006\u0002\u0010 J\u001d\u0010!\u001a\u00020\u00142\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00028\u0002H\u0016¢\u0006\u0002\u0010%J)\u0010&\u001a\u00020\u0014*\u00028\u00032\u0006\u0010\u001d\u001a\u00020\u00192\u0006\u0010'\u001a\u00028\u00002\u0006\u0010$\u001a\u00028\u0001H$¢\u0006\u0002\u0010(R\u0012\u0010\f\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00028\u00000\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011\u0001\u0002)*¨\u0006+"}, d2 = {"Lkotlinx/serialization/internal/MapLikeSerializer;", "Key", "Value", "Collection", "Builder", "", "Lkotlinx/serialization/internal/AbstractCollectionSerializer;", "", "keySerializer", "Lkotlinx/serialization/KSerializer;", "valueSerializer", "(Lkotlinx/serialization/KSerializer;Lkotlinx/serialization/KSerializer;)V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "getKeySerializer", "()Lkotlinx/serialization/KSerializer;", "getValueSerializer", "readAll", "", "decoder", "Lkotlinx/serialization/encoding/CompositeDecoder;", "builder", "startIndex", "", "size", "(Lkotlinx/serialization/encoding/CompositeDecoder;Ljava/util/Map;II)V", "readElement", "index", "checkIndex", "", "(Lkotlinx/serialization/encoding/CompositeDecoder;ILjava/util/Map;Z)V", "serialize", "encoder", "Lkotlinx/serialization/encoding/Encoder;", "value", "(Lkotlinx/serialization/encoding/Encoder;Ljava/lang/Object;)V", "insertKeyValuePair", "key", "(Ljava/util/Map;ILjava/lang/Object;Ljava/lang/Object;)V", "Lkotlinx/serialization/internal/HashMapSerializer;", "Lkotlinx/serialization/internal/LinkedHashMapSerializer;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InternalSerializationApi
/* compiled from: CollectionSerializers.kt */
public abstract class MapLikeSerializer<Key, Value, Collection, Builder extends Map<Key, Value>> extends AbstractCollectionSerializer<Map.Entry<? extends Key, ? extends Value>, Collection, Builder> {
    private final KSerializer<Key> keySerializer;
    private final KSerializer<Value> valueSerializer;

    public /* synthetic */ MapLikeSerializer(KSerializer kSerializer, KSerializer kSerializer2, DefaultConstructorMarker defaultConstructorMarker) {
        this(kSerializer, kSerializer2);
    }

    public abstract SerialDescriptor getDescriptor();

    /* access modifiers changed from: protected */
    public abstract void insertKeyValuePair(Builder builder, int i, Key key, Value value);

    public final KSerializer<Key> getKeySerializer() {
        return this.keySerializer;
    }

    public final KSerializer<Value> getValueSerializer() {
        return this.valueSerializer;
    }

    private MapLikeSerializer(KSerializer<Key> keySerializer2, KSerializer<Value> valueSerializer2) {
        super((DefaultConstructorMarker) null);
        this.keySerializer = keySerializer2;
        this.valueSerializer = valueSerializer2;
    }

    /* access modifiers changed from: protected */
    public final void readAll(CompositeDecoder decoder, Builder builder, int startIndex, int size) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        if (size >= 0) {
            IntProgression step = RangesKt.step((IntProgression) RangesKt.until(0, size * 2), 2);
            int index = step.getFirst();
            int last = step.getLast();
            int step2 = step.getStep();
            if ((step2 > 0 && index <= last) || (step2 < 0 && last <= index)) {
                while (true) {
                    readElement(decoder, startIndex + index, builder, false);
                    if (index != last) {
                        index += step2;
                    } else {
                        return;
                    }
                }
            }
        } else {
            throw new IllegalArgumentException("Size must be known in advance when using READ_ALL".toString());
        }
    }

    /* access modifiers changed from: protected */
    public final void readElement(CompositeDecoder decoder, int index, Builder builder, boolean checkIndex) {
        int vIndex;
        Object value;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        Object key = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(decoder, getDescriptor(), index, this.keySerializer, (Object) null, 8, (Object) null);
        if (checkIndex) {
            vIndex = decoder.decodeElementIndex(getDescriptor());
            int it = vIndex;
            if (!(it == index + 1)) {
                throw new IllegalArgumentException(("Value must follow key in a map, index for key: " + index + ", returned index for value: " + it).toString());
            }
        } else {
            vIndex = index + 1;
        }
        if (!builder.containsKey(key) || (this.valueSerializer.getDescriptor().getKind() instanceof PrimitiveKind)) {
            value = CompositeDecoder.DefaultImpls.decodeSerializableElement$default(decoder, getDescriptor(), vIndex, this.valueSerializer, (Object) null, 8, (Object) null);
        } else {
            value = decoder.decodeSerializableElement(getDescriptor(), vIndex, this.valueSerializer, MapsKt.getValue(builder, key));
        }
        builder.put(key, value);
    }

    public void serialize(Encoder encoder, Collection value) {
        Collection collection = value;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        int size = collectionSize(collection);
        SerialDescriptor descriptor$iv = getDescriptor();
        CompositeEncoder composite$iv = encoder.beginCollection(descriptor$iv, size);
        CompositeEncoder $this$serialize_u24lambda_u244 = composite$iv;
        int index = 0;
        Iterator $this$forEach$iv = collectionIterator(collection);
        while ($this$forEach$iv.hasNext()) {
            Map.Entry entry = (Map.Entry) $this$forEach$iv.next();
            Object k = entry.getKey();
            Object v = entry.getValue();
            int size2 = size;
            int index2 = index + 1;
            $this$serialize_u24lambda_u244.encodeSerializableElement(getDescriptor(), index, getKeySerializer(), k);
            index = index2 + 1;
            $this$serialize_u24lambda_u244.encodeSerializableElement(getDescriptor(), index2, getValueSerializer(), v);
            Encoder encoder2 = encoder;
            Collection collection2 = value;
            size = size2;
        }
        composite$iv.endStructure(descriptor$iv);
    }
}
