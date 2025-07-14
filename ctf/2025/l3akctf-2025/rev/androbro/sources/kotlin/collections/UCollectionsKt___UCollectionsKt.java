package kotlin.collections;

import java.util.Collection;
import kotlin.Metadata;
import kotlin.UByte;
import kotlin.UByteArray;
import kotlin.UInt;
import kotlin.UIntArray;
import kotlin.ULong;
import kotlin.ULongArray;
import kotlin.UShort;
import kotlin.UShortArray;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000F\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u0002H\u0007¢\u0006\u0004\b\u0006\u0010\u0005\u001a\u0019\u0010\u0000\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00070\u0002H\u0007¢\u0006\u0004\b\b\u0010\t\u001a\u0019\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\n0\u0002H\u0007¢\u0006\u0004\b\u000b\u0010\u0005\u001a\u0017\u0010\f\u001a\u00020\r*\b\u0012\u0004\u0012\u00020\u00030\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\u0017\u0010\u0010\u001a\u00020\u0011*\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0007¢\u0006\u0002\u0010\u0012\u001a\u0017\u0010\u0013\u001a\u00020\u0014*\b\u0012\u0004\u0012\u00020\u00070\u000eH\u0007¢\u0006\u0002\u0010\u0015\u001a\u0017\u0010\u0016\u001a\u00020\u0017*\b\u0012\u0004\u0012\u00020\n0\u000eH\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u0019"}, d2 = {"sum", "Lkotlin/UInt;", "", "Lkotlin/UByte;", "sumOfUByte", "(Ljava/lang/Iterable;)I", "sumOfUInt", "Lkotlin/ULong;", "sumOfULong", "(Ljava/lang/Iterable;)J", "Lkotlin/UShort;", "sumOfUShort", "toUByteArray", "Lkotlin/UByteArray;", "", "(Ljava/util/Collection;)[B", "toUIntArray", "Lkotlin/UIntArray;", "(Ljava/util/Collection;)[I", "toULongArray", "Lkotlin/ULongArray;", "(Ljava/util/Collection;)[J", "toUShortArray", "Lkotlin/UShortArray;", "(Ljava/util/Collection;)[S", "kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/collections/UCollectionsKt")
/* compiled from: _UCollections.kt */
class UCollectionsKt___UCollectionsKt {
    public static final byte[] toUByteArray(Collection<UByte> $this$toUByteArray) {
        Intrinsics.checkNotNullParameter($this$toUByteArray, "<this>");
        byte[] result = UByteArray.m351constructorimpl($this$toUByteArray.size());
        int index = 0;
        for (UByte r3 : $this$toUByteArray) {
            UByteArray.m362setVurrAj0(result, index, r3.m349unboximpl());
            index++;
        }
        return result;
    }

    public static final int[] toUIntArray(Collection<UInt> $this$toUIntArray) {
        Intrinsics.checkNotNullParameter($this$toUIntArray, "<this>");
        int[] result = UIntArray.m430constructorimpl($this$toUIntArray.size());
        int index = 0;
        for (UInt r3 : $this$toUIntArray) {
            UIntArray.m441setVXSXFK8(result, index, r3.m428unboximpl());
            index++;
        }
        return result;
    }

    public static final long[] toULongArray(Collection<ULong> $this$toULongArray) {
        Intrinsics.checkNotNullParameter($this$toULongArray, "<this>");
        long[] result = ULongArray.m509constructorimpl($this$toULongArray.size());
        int index = 0;
        for (ULong r3 : $this$toULongArray) {
            ULongArray.m520setk8EXiF4(result, index, r3.m507unboximpl());
            index++;
        }
        return result;
    }

    public static final short[] toUShortArray(Collection<UShort> $this$toUShortArray) {
        Intrinsics.checkNotNullParameter($this$toUShortArray, "<this>");
        short[] result = UShortArray.m614constructorimpl($this$toUShortArray.size());
        int index = 0;
        for (UShort r3 : $this$toUShortArray) {
            UShortArray.m625set01HTLdE(result, index, r3.m612unboximpl());
            index++;
        }
        return result;
    }

    public static final int sumOfUInt(Iterable<UInt> $this$sum) {
        Intrinsics.checkNotNullParameter($this$sum, "<this>");
        int sum = 0;
        for (UInt r2 : $this$sum) {
            sum = UInt.m376constructorimpl(sum + r2.m428unboximpl());
        }
        return sum;
    }

    public static final long sumOfULong(Iterable<ULong> $this$sum) {
        Intrinsics.checkNotNullParameter($this$sum, "<this>");
        long sum = 0;
        for (ULong r3 : $this$sum) {
            sum = ULong.m455constructorimpl(sum + r3.m507unboximpl());
        }
        return sum;
    }

    public static final int sumOfUByte(Iterable<UByte> $this$sum) {
        Intrinsics.checkNotNullParameter($this$sum, "<this>");
        int sum = 0;
        for (UByte r2 : $this$sum) {
            sum = UInt.m376constructorimpl(UInt.m376constructorimpl(r2.m349unboximpl() & UByte.MAX_VALUE) + sum);
        }
        return sum;
    }

    public static final int sumOfUShort(Iterable<UShort> $this$sum) {
        Intrinsics.checkNotNullParameter($this$sum, "<this>");
        int sum = 0;
        for (UShort r2 : $this$sum) {
            sum = UInt.m376constructorimpl(UInt.m376constructorimpl(65535 & r2.m612unboximpl()) + sum);
        }
        return sum;
    }
}
