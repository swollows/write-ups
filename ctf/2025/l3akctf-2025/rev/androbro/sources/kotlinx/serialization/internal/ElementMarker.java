package kotlinx.serialization.internal;

import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0006H\u0002J\b\u0010\u0011\u001a\u00020\u0006H\u0002J\u0006\u0010\u0012\u001a\u00020\u0006J\u0010\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\u0006H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u000e¢\u0006\u0002\n\u0000R \u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lkotlinx/serialization/internal/ElementMarker;", "", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "readIfAbsent", "Lkotlin/Function2;", "", "", "(Lkotlinx/serialization/descriptors/SerialDescriptor;Lkotlin/jvm/functions/Function2;)V", "highMarksArray", "", "lowerMarks", "", "mark", "", "index", "markHigh", "nextUnmarkedHighIndex", "nextUnmarkedIndex", "prepareHighMarksArray", "elementsCount", "Companion", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
@CoreFriendModuleApi
/* compiled from: ElementMarker.kt */
public final class ElementMarker {
    private static final Companion Companion = new Companion((DefaultConstructorMarker) null);
    private static final long[] EMPTY_HIGH_MARKS = new long[0];
    private final SerialDescriptor descriptor;
    private final long[] highMarksArray;
    private long lowerMarks;
    private final Function2<SerialDescriptor, Integer, Boolean> readIfAbsent;

    public ElementMarker(SerialDescriptor descriptor2, Function2<? super SerialDescriptor, ? super Integer, Boolean> readIfAbsent2) {
        Intrinsics.checkNotNullParameter(descriptor2, "descriptor");
        Intrinsics.checkNotNullParameter(readIfAbsent2, "readIfAbsent");
        this.descriptor = descriptor2;
        this.readIfAbsent = readIfAbsent2;
        int elementsCount = this.descriptor.getElementsCount();
        long j = 0;
        if (elementsCount <= 64) {
            this.lowerMarks = elementsCount != 64 ? -1 << elementsCount : j;
            this.highMarksArray = EMPTY_HIGH_MARKS;
            return;
        }
        this.lowerMarks = 0;
        this.highMarksArray = prepareHighMarksArray(elementsCount);
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0016\n\u0000\b\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0004¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lkotlinx/serialization/internal/ElementMarker$Companion;", "", "()V", "EMPTY_HIGH_MARKS", "", "kotlinx-serialization-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* compiled from: ElementMarker.kt */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public final void mark(int index) {
        if (index < 64) {
            this.lowerMarks |= 1 << index;
        } else {
            markHigh(index);
        }
    }

    public final int nextUnmarkedIndex() {
        int elementsCount = this.descriptor.getElementsCount();
        while (this.lowerMarks != -1) {
            int index = Long.numberOfTrailingZeros(~this.lowerMarks);
            this.lowerMarks |= 1 << index;
            if (this.readIfAbsent.invoke(this.descriptor, Integer.valueOf(index)).booleanValue()) {
                return index;
            }
        }
        if (elementsCount > 64) {
            return nextUnmarkedHighIndex();
        }
        return -1;
    }

    private final long[] prepareHighMarksArray(int elementsCount) {
        long[] highMarks = new long[((elementsCount - 1) >>> 6)];
        if ((elementsCount & 63) != 0) {
            highMarks[ArraysKt.getLastIndex(highMarks)] = -1 << elementsCount;
        }
        return highMarks;
    }

    private final void markHigh(int index) {
        int slot = (index >>> 6) - 1;
        this.highMarksArray[slot] = this.highMarksArray[slot] | (1 << (index & 63));
    }

    private final int nextUnmarkedHighIndex() {
        int length = this.highMarksArray.length;
        for (int slot = 0; slot < length; slot++) {
            int slotOffset = (slot + 1) * 64;
            long slotMarks = this.highMarksArray[slot];
            while (slotMarks != -1) {
                int indexInSlot = Long.numberOfTrailingZeros(~slotMarks);
                slotMarks |= 1 << indexInSlot;
                int index = slotOffset + indexInSlot;
                if (this.readIfAbsent.invoke(this.descriptor, Integer.valueOf(index)).booleanValue()) {
                    this.highMarksArray[slot] = slotMarks;
                    return index;
                }
            }
            this.highMarksArray[slot] = slotMarks;
        }
        return -1;
    }
}
