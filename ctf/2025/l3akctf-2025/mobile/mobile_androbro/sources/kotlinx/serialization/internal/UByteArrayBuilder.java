package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.UByteArray;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlinx.serialization.ExperimentalSerializationApi;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0002\u0010\u0004J\u001a\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0000ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0012\u001a\u00020\u0002H\u0010ø\u0001\u0001ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J\u0015\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0016\u001a\u00020\bH\u0010¢\u0006\u0002\b\u0017R\u0016\u0010\u0005\u001a\u00020\u0002X\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0004\n\u0002\u0010\u0006R\u001e\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\b@RX\u000e¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0018"}, d2 = {"Lkotlinx/serialization/internal/UByteArrayBuilder;", "Lkotlinx/serialization/internal/PrimitiveArrayBuilder;", "Lkotlin/UByteArray;", "bufferWithData", "([BLkotlin/jvm/internal/DefaultConstructorMarker;)V", "buffer", "[B", "<set-?>", "", "position", "getPosition$kotlinx_serialization_core", "()I", "append", "", "c", "Lkotlin/UByte;", "append-7apg3OU$kotlinx_serialization_core", "(B)V", "build", "build-TcUX1vc$kotlinx_serialization_core", "()[B", "ensureCapacity", "requiredCapacity", "ensureCapacity$kotlinx_serialization_core", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@ExperimentalSerializationApi
/* compiled from: PrimitiveArraysSerializers.kt */
public final class UByteArrayBuilder extends PrimitiveArrayBuilder<UByteArray> {
    private byte[] buffer;
    private int position;

    public /* synthetic */ UByteArrayBuilder(byte[] bArr, DefaultConstructorMarker defaultConstructorMarker) {
        this(bArr);
    }

    public /* bridge */ /* synthetic */ Object build$kotlinx_serialization_core() {
        return UByteArray.m350boximpl(m41buildTcUX1vc$kotlinx_serialization_core());
    }

    private UByteArrayBuilder(byte[] bufferWithData) {
        Intrinsics.checkNotNullParameter(bufferWithData, "bufferWithData");
        this.buffer = bufferWithData;
        this.position = UByteArray.m358getSizeimpl(bufferWithData);
        ensureCapacity$kotlinx_serialization_core(10);
    }

    public int getPosition$kotlinx_serialization_core() {
        return this.position;
    }

    public void ensureCapacity$kotlinx_serialization_core(int requiredCapacity) {
        if (UByteArray.m358getSizeimpl(this.buffer) < requiredCapacity) {
            byte[] copyOf = Arrays.copyOf(this.buffer, RangesKt.coerceAtLeast(requiredCapacity, UByteArray.m358getSizeimpl(this.buffer) * 2));
            Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
            this.buffer = UByteArray.m352constructorimpl(copyOf);
        }
    }

    /* renamed from: append-7apg3OU$kotlinx_serialization_core  reason: not valid java name */
    public final void m40append7apg3OU$kotlinx_serialization_core(byte c) {
        PrimitiveArrayBuilder.ensureCapacity$kotlinx_serialization_core$default(this, 0, 1, (Object) null);
        byte[] bArr = this.buffer;
        int position$kotlinx_serialization_core = getPosition$kotlinx_serialization_core();
        this.position = position$kotlinx_serialization_core + 1;
        UByteArray.m362setVurrAj0(bArr, position$kotlinx_serialization_core, c);
    }

    /* renamed from: build-TcUX1vc$kotlinx_serialization_core  reason: not valid java name */
    public byte[] m41buildTcUX1vc$kotlinx_serialization_core() {
        byte[] copyOf = Arrays.copyOf(this.buffer, getPosition$kotlinx_serialization_core());
        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
        return UByteArray.m352constructorimpl(copyOf);
    }
}
