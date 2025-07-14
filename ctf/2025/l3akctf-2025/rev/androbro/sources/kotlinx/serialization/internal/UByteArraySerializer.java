package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u0002H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J*\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000fH\u0014ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u000f*\u00020\u0002H\u0014ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u0005*\u00020\u0002H\u0014ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Lkotlinx/serialization/internal/UByteArraySerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/UByteArray;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Lkotlin/UByte;", "Lkotlinx/serialization/internal/UByteArrayBuilder;", "()V", "empty", "empty-TcUX1vc", "()[B", "readElement", "", "decoder", "Lkotlinx/serialization/encoding/CompositeDecoder;", "index", "", "builder", "checkIndex", "", "writeContent", "encoder", "Lkotlinx/serialization/encoding/CompositeEncoder;", "content", "size", "writeContent-Coi6ktg", "(Lkotlinx/serialization/encoding/CompositeEncoder;[BI)V", "collectionSize", "collectionSize-GBYM_sE", "([B)I", "toBuilder", "toBuilder-GBYM_sE", "([B)Lkotlinx/serialization/internal/UByteArrayBuilder;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalSerializationApi
/* compiled from: PrimitiveArraysSerializers.kt */
public final class UByteArraySerializer extends PrimitiveArraySerializer<UByte, UByteArray, UByteArrayBuilder> implements KSerializer<UByteArray> {
    public static final UByteArraySerializer INSTANCE = new UByteArraySerializer();

    public /* bridge */ /* synthetic */ int collectionSize(Object $this$collectionSize) {
        return m42collectionSizeGBYM_sE(((UByteArray) $this$collectionSize).m366unboximpl());
    }

    public /* bridge */ /* synthetic */ Object empty() {
        return UByteArray.m350boximpl(m43emptyTcUX1vc());
    }

    public /* bridge */ /* synthetic */ Object toBuilder(Object $this$toBuilder) {
        return m44toBuilderGBYM_sE(((UByteArray) $this$toBuilder).m366unboximpl());
    }

    public /* bridge */ /* synthetic */ void writeContent(CompositeEncoder encoder, Object content, int size) {
        m45writeContentCoi6ktg(encoder, ((UByteArray) content).m366unboximpl(), size);
    }

    private UByteArraySerializer() {
        super(BuiltinSerializersKt.serializer(UByte.Companion));
    }

    /* access modifiers changed from: protected */
    /* renamed from: collectionSize-GBYM_sE  reason: not valid java name */
    public int m42collectionSizeGBYM_sE(byte[] $this$collectionSize_u2dGBYM_sE) {
        Intrinsics.checkNotNullParameter($this$collectionSize_u2dGBYM_sE, "$this$collectionSize");
        return UByteArray.m358getSizeimpl($this$collectionSize_u2dGBYM_sE);
    }

    /* access modifiers changed from: protected */
    /* renamed from: toBuilder-GBYM_sE  reason: not valid java name */
    public UByteArrayBuilder m44toBuilderGBYM_sE(byte[] $this$toBuilder_u2dGBYM_sE) {
        Intrinsics.checkNotNullParameter($this$toBuilder_u2dGBYM_sE, "$this$toBuilder");
        return new UByteArrayBuilder($this$toBuilder_u2dGBYM_sE, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: empty-TcUX1vc  reason: not valid java name */
    public byte[] m43emptyTcUX1vc() {
        return UByteArray.m351constructorimpl(0);
    }

    /* access modifiers changed from: protected */
    public void readElement(CompositeDecoder decoder, int index, UByteArrayBuilder builder, boolean checkIndex) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.m40append7apg3OU$kotlinx_serialization_core(UByte.m299constructorimpl(decoder.decodeInlineElement(getDescriptor(), index).decodeByte()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: writeContent-Coi6ktg  reason: not valid java name */
    public void m45writeContentCoi6ktg(CompositeEncoder encoder, byte[] content, int size) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i = 0; i < size; i++) {
            encoder.encodeInlineElement(getDescriptor(), i).encodeByte(UByteArray.m357getw2LRezQ(content, i));
        }
    }
}
