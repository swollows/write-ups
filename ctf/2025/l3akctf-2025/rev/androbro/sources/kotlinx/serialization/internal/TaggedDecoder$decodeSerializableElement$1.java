package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlinx.serialization.DeserializationStrategy;

@Metadata(d1 = {"\u0000\u0004\n\u0002\b\u0005\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001\"\u0004\b\u0001\u0010\u0002H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "T", "Tag", "invoke", "()Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* compiled from: Tagged.kt */
final class TaggedDecoder$decodeSerializableElement$1 extends Lambda implements Function0<T> {
    final /* synthetic */ DeserializationStrategy<T> $deserializer;
    final /* synthetic */ T $previousValue;
    final /* synthetic */ TaggedDecoder<Tag> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    TaggedDecoder$decodeSerializableElement$1(TaggedDecoder<Tag> taggedDecoder, DeserializationStrategy<? extends T> deserializationStrategy, T t) {
        super(0);
        this.this$0 = taggedDecoder;
        this.$deserializer = deserializationStrategy;
        this.$previousValue = t;
    }

    public final T invoke() {
        return this.this$0.decodeSerializableValue(this.$deserializer, this.$previousValue);
    }
}
