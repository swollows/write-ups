package kotlinx.serialization.internal;

import java.util.Arrays;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorKt;
import kotlinx.serialization.descriptors.SerialKind;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\u001aN\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u0002H\u00022\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052!\u0010\u0006\u001a\u001d\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\b\u0012\b\b\t\u0012\u0004\b\b(\n\u0012\u0004\u0012\u00020\u00010\u0007H\bø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a\u001f\u0010\f\u001a\u00020\r*\u00020\u00032\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\u000fH\u0000¢\u0006\u0002\u0010\u0010\u0002\u0007\n\u0005\b20\u0001¨\u0006\u0011"}, d2 = {"equalsImpl", "", "SD", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "other", "", "typeParamsAreEqual", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "otherDescriptor", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Z", "hashCodeImpl", "", "typeParams", "", "(Lkotlinx/serialization/descriptors/SerialDescriptor;[Lkotlinx/serialization/descriptors/SerialDescriptor;)I", "kotlinx-serialization-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* compiled from: PluginGeneratedSerialDescriptor.kt */
public final class PluginGeneratedSerialDescriptorKt {
    public static final /* synthetic */ <SD extends SerialDescriptor> boolean equalsImpl(SD $this$equalsImpl, Object other, Function1<? super SD, Boolean> typeParamsAreEqual) {
        Intrinsics.checkNotNullParameter($this$equalsImpl, "<this>");
        Intrinsics.checkNotNullParameter(typeParamsAreEqual, "typeParamsAreEqual");
        if ($this$equalsImpl == other) {
            return true;
        }
        Intrinsics.reifiedOperationMarker(3, "SD");
        if (!(other instanceof SerialDescriptor) || !Intrinsics.areEqual((Object) $this$equalsImpl.getSerialName(), (Object) ((SerialDescriptor) other).getSerialName()) || !typeParamsAreEqual.invoke(other).booleanValue() || $this$equalsImpl.getElementsCount() != ((SerialDescriptor) other).getElementsCount()) {
            return false;
        }
        int elementsCount = $this$equalsImpl.getElementsCount();
        for (int index = 0; index < elementsCount; index++) {
            if (!Intrinsics.areEqual((Object) $this$equalsImpl.getElementDescriptor(index).getSerialName(), (Object) ((SerialDescriptor) other).getElementDescriptor(index).getSerialName()) || !Intrinsics.areEqual((Object) $this$equalsImpl.getElementDescriptor(index).getKind(), (Object) ((SerialDescriptor) other).getElementDescriptor(index).getKind())) {
                return false;
            }
        }
        return true;
    }

    public static final int hashCodeImpl(SerialDescriptor $this$hashCodeImpl, SerialDescriptor[] typeParams) {
        Intrinsics.checkNotNullParameter($this$hashCodeImpl, "<this>");
        Intrinsics.checkNotNullParameter(typeParams, "typeParams");
        int result = ($this$hashCodeImpl.getSerialName().hashCode() * 31) + Arrays.hashCode(typeParams);
        Iterable<SerialDescriptor> $this$elementsHashCodeBy$iv = SerialDescriptorKt.getElementDescriptors($this$hashCodeImpl);
        int accumulator$iv$iv = 1;
        Iterator<SerialDescriptor> it = $this$elementsHashCodeBy$iv.iterator();
        while (true) {
            int i = 0;
            if (!it.hasNext()) {
                break;
            }
            int i2 = accumulator$iv$iv * 31;
            String serialName = ((SerialDescriptor) it.next()).getSerialName();
            if (serialName != null) {
                i = serialName.hashCode();
            }
            accumulator$iv$iv = i2 + i;
        }
        int namesHash = accumulator$iv$iv;
        int accumulator$iv$iv2 = 1;
        for (SerialDescriptor it2 : $this$elementsHashCodeBy$iv) {
            int i3 = accumulator$iv$iv2 * 31;
            SerialKind kind = it2.getKind();
            accumulator$iv$iv2 = i3 + (kind != null ? kind.hashCode() : 0);
        }
        return (((result * 31) + namesHash) * 31) + accumulator$iv$iv2;
    }
}
