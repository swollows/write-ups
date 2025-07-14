package kotlinx.serialization.internal;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0005¢\u0006\u0002\u0010\u0006J\u0013\u0010\n\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0002J\b\u0010\r\u001a\u00020\u000eH\u0016R\u0014\u0010\u0007\u001a\u00020\bXD¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\t¨\u0006\u000f"}, d2 = {"Lkotlinx/serialization/internal/InlineClassDescriptor;", "Lkotlinx/serialization/internal/PluginGeneratedSerialDescriptor;", "name", "", "generatedSerializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "(Ljava/lang/String;Lkotlinx/serialization/internal/GeneratedSerializer;)V", "isInline", "", "()Z", "equals", "other", "", "hashCode", "", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: InlineClassDescriptor.kt */
public final class InlineClassDescriptor extends PluginGeneratedSerialDescriptor {
    private final boolean isInline = true;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public InlineClassDescriptor(String name, GeneratedSerializer<?> generatedSerializer) {
        super(name, generatedSerializer, 1);
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(generatedSerializer, "generatedSerializer");
    }

    public boolean isInline() {
        return this.isInline;
    }

    public int hashCode() {
        return super.hashCode() * 31;
    }

    public boolean equals(Object other) {
        SerialDescriptor $this$equalsImpl$iv = this;
        if ($this$equalsImpl$iv == other) {
            return true;
        }
        if (!(other instanceof InlineClassDescriptor)) {
            return false;
        }
        if (!Intrinsics.areEqual((Object) $this$equalsImpl$iv.getSerialName(), (Object) ((SerialDescriptor) other).getSerialName())) {
            return false;
        }
        InlineClassDescriptor otherDescriptor = (InlineClassDescriptor) other;
        if (!(otherDescriptor.isInline() && Arrays.equals(getTypeParameterDescriptors$kotlinx_serialization_core(), otherDescriptor.getTypeParameterDescriptors$kotlinx_serialization_core()))) {
            return false;
        }
        if ($this$equalsImpl$iv.getElementsCount() != ((SerialDescriptor) other).getElementsCount()) {
            return false;
        }
        int elementsCount = $this$equalsImpl$iv.getElementsCount();
        for (int index$iv = 0; index$iv < elementsCount; index$iv++) {
            if (!Intrinsics.areEqual((Object) $this$equalsImpl$iv.getElementDescriptor(index$iv).getSerialName(), (Object) ((SerialDescriptor) other).getElementDescriptor(index$iv).getSerialName())) {
                return false;
            }
            if (!Intrinsics.areEqual((Object) $this$equalsImpl$iv.getElementDescriptor(index$iv).getKind(), (Object) ((SerialDescriptor) other).getElementDescriptor(index$iv).getKind())) {
                return false;
            }
        }
        return true;
    }
}
