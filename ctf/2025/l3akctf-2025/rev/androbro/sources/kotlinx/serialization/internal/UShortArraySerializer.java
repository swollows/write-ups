package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.ExperimentalSerializationApi;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\bÁ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u00012\u0014\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0006J\u0015\u0010\u0007\u001a\u00020\u0002H\u0014ø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\b\b\u0010\tJ(\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0014J*\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u000fH\u0014ø\u0001\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0016\u0010\u001a\u001a\u00020\u000f*\u00020\u0002H\u0014ø\u0001\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0016\u0010\u001d\u001a\u00020\u0005*\u00020\u0002H\u0014ø\u0001\u0001¢\u0006\u0004\b\u001e\u0010\u001f\u0002\u000b\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u0006 "}, d2 = {"Lkotlinx/serialization/internal/UShortArraySerializer;", "Lkotlinx/serialization/KSerializer;", "Lkotlin/UShortArray;", "Lkotlinx/serialization/internal/PrimitiveArraySerializer;", "Lkotlin/UShort;", "Lkotlinx/serialization/internal/UShortArrayBuilder;", "()V", "empty", "empty-amswpOA", "()[S", "readElement", "", "decoder", "Lkotlinx/serialization/encoding/CompositeDecoder;", "index", "", "builder", "checkIndex", "", "writeContent", "encoder", "Lkotlinx/serialization/encoding/CompositeEncoder;", "content", "size", "writeContent-eny0XGE", "(Lkotlinx/serialization/encoding/CompositeEncoder;[SI)V", "collectionSize", "collectionSize-rL5Bavg", "([S)I", "toBuilder", "toBuilder-rL5Bavg", "([S)Lkotlinx/serialization/internal/UShortArrayBuilder;", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalSerializationApi
/* compiled from: PrimitiveArraysSerializers.kt */
public final class UShortArraySerializer extends PrimitiveArraySerializer<UShort, UShortArray, UShortArrayBuilder> implements KSerializer<UShortArray> {
    public static final UShortArraySerializer INSTANCE = new UShortArraySerializer();

    public /* bridge */ /* synthetic */ int collectionSize(Object $this$collectionSize) {
        return m66collectionSizerL5Bavg(((UShortArray) $this$collectionSize).m629unboximpl());
    }

    public /* bridge */ /* synthetic */ Object empty() {
        return UShortArray.m613boximpl(m67emptyamswpOA());
    }

    public /* bridge */ /* synthetic */ Object toBuilder(Object $this$toBuilder) {
        return m68toBuilderrL5Bavg(((UShortArray) $this$toBuilder).m629unboximpl());
    }

    public /* bridge */ /* synthetic */ void writeContent(CompositeEncoder encoder, Object content, int size) {
        m69writeContenteny0XGE(encoder, ((UShortArray) content).m629unboximpl(), size);
    }

    private UShortArraySerializer() {
        super(BuiltinSerializersKt.serializer(UShort.Companion));
    }

    /* access modifiers changed from: protected */
    /* renamed from: collectionSize-rL5Bavg  reason: not valid java name */
    public int m66collectionSizerL5Bavg(short[] $this$collectionSize_u2drL5Bavg) {
        Intrinsics.checkNotNullParameter($this$collectionSize_u2drL5Bavg, "$this$collectionSize");
        return UShortArray.m621getSizeimpl($this$collectionSize_u2drL5Bavg);
    }

    /* access modifiers changed from: protected */
    /* renamed from: toBuilder-rL5Bavg  reason: not valid java name */
    public UShortArrayBuilder m68toBuilderrL5Bavg(short[] $this$toBuilder_u2drL5Bavg) {
        Intrinsics.checkNotNullParameter($this$toBuilder_u2drL5Bavg, "$this$toBuilder");
        return new UShortArrayBuilder($this$toBuilder_u2drL5Bavg, (DefaultConstructorMarker) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: empty-amswpOA  reason: not valid java name */
    public short[] m67emptyamswpOA() {
        return UShortArray.m614constructorimpl(0);
    }

    /* access modifiers changed from: protected */
    public void readElement(CompositeDecoder decoder, int index, UShortArrayBuilder builder, boolean checkIndex) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.m64appendxj2QHRw$kotlinx_serialization_core(UShort.m562constructorimpl(decoder.decodeInlineElement(getDescriptor(), index).decodeShort()));
    }

    /* access modifiers changed from: protected */
    /* renamed from: writeContent-eny0XGE  reason: not valid java name */
    public void m69writeContenteny0XGE(CompositeEncoder encoder, short[] content, int size) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i = 0; i < size; i++) {
            encoder.encodeInlineElement(getDescriptor(), i).encodeShort(UShortArray.m620getMh2AYeg(content, i));
        }
    }
}
