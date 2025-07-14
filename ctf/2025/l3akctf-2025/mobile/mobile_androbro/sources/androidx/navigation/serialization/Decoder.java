package androidx.navigation.serialization;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u000bJ\u0006\u0010\f\u001a\u00020\u0001J\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0005\u001a\u00020\u0006X\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Landroidx/navigation/serialization/Decoder;", "", "store", "Landroidx/navigation/serialization/ArgStore;", "(Landroidx/navigation/serialization/ArgStore;)V", "elementIndex", "", "elementName", "", "computeNextElementIndex", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "decodeValue", "isCurrentElementNull", "", "navigation-common_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: RouteDecoder.kt */
final class Decoder {
    private int elementIndex = -1;
    private String elementName = "";
    private final ArgStore store;

    public Decoder(ArgStore store2) {
        Intrinsics.checkNotNullParameter(store2, "store");
        this.store = store2;
    }

    public final int computeNextElementIndex(SerialDescriptor descriptor) {
        String currentName;
        Intrinsics.checkNotNullParameter(descriptor, "descriptor");
        int currentIndex = this.elementIndex;
        do {
            currentIndex++;
            if (currentIndex >= descriptor.getElementsCount()) {
                return -1;
            }
            currentName = descriptor.getElementName(currentIndex);
        } while (!this.store.contains(currentName));
        this.elementIndex = currentIndex;
        this.elementName = currentName;
        return this.elementIndex;
    }

    public final Object decodeValue() {
        Object arg = this.store.get(this.elementName);
        if (arg != null) {
            return arg;
        }
        throw new IllegalStateException(("Unexpected null value for non-nullable argument " + this.elementName).toString());
    }

    public final boolean isCurrentElementNull() {
        return this.store.get(this.elementName) == null;
    }
}
