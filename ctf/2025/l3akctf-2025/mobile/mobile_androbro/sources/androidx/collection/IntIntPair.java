package androidx.collection;

import kotlin.Metadata;
import kotlin.jvm.JvmInline;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b@\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006B\u0011\b\u0000\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\u0005\u0010\tJ\u0010\u0010\u000f\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0010\u0010\u000bJ\u0010\u0010\u0011\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0012\u0010\u000bJ\u001a\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000bJ\u000f\u0010\u001a\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0011\u0010\u0002\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\u0007\u001a\u00020\b8\u0000X\u0004¢\u0006\b\n\u0000\u0012\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000b\u0001\u0007\u0001\u00020\b¨\u0006\u001e"}, d2 = {"Landroidx/collection/IntIntPair;", "", "first", "", "second", "constructor-impl", "(II)J", "packedValue", "", "(J)J", "getFirst-impl", "(J)I", "getPackedValue$annotations", "()V", "getSecond-impl", "component1", "component1-impl", "component2", "component2-impl", "equals", "", "other", "equals-impl", "(JLjava/lang/Object;)Z", "hashCode", "hashCode-impl", "toString", "", "toString-impl", "(J)Ljava/lang/String;", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
@JvmInline
/* compiled from: IntIntPair.kt */
public final class IntIntPair {
    public final long packedValue;

    /* renamed from: box-impl  reason: not valid java name */
    public static final /* synthetic */ IntIntPair m92boximpl(long j) {
        return new IntIntPair(j);
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m96constructorimpl(long j) {
        return j;
    }

    /* renamed from: equals-impl  reason: not valid java name */
    public static boolean m97equalsimpl(long j, Object obj) {
        return (obj instanceof IntIntPair) && j == ((IntIntPair) obj).m103unboximpl();
    }

    /* renamed from: equals-impl0  reason: not valid java name */
    public static final boolean m98equalsimpl0(long j, long j2) {
        return j == j2;
    }

    public static /* synthetic */ void getPackedValue$annotations() {
    }

    /* renamed from: hashCode-impl  reason: not valid java name */
    public static int m101hashCodeimpl(long j) {
        return Long.hashCode(j);
    }

    public boolean equals(Object obj) {
        return m97equalsimpl(this.packedValue, obj);
    }

    public int hashCode() {
        return m101hashCodeimpl(this.packedValue);
    }

    /* renamed from: unbox-impl  reason: not valid java name */
    public final /* synthetic */ long m103unboximpl() {
        return this.packedValue;
    }

    private /* synthetic */ IntIntPair(long packedValue2) {
        this.packedValue = packedValue2;
    }

    /* renamed from: constructor-impl  reason: not valid java name */
    public static long m95constructorimpl(int first, int second) {
        return m96constructorimpl((((long) first) << 32) | (((long) second) & 4294967295L));
    }

    /* renamed from: getFirst-impl  reason: not valid java name */
    public static final int m99getFirstimpl(long arg0) {
        return (int) (arg0 >> 32);
    }

    /* renamed from: getSecond-impl  reason: not valid java name */
    public static final int m100getSecondimpl(long arg0) {
        return (int) (4294967295L & arg0);
    }

    /* renamed from: component1-impl  reason: not valid java name */
    public static final int m93component1impl(long arg0) {
        return (int) (arg0 >> 32);
    }

    /* renamed from: component2-impl  reason: not valid java name */
    public static final int m94component2impl(long arg0) {
        return (int) (4294967295L & arg0);
    }

    /* renamed from: toString-impl  reason: not valid java name */
    public static String m102toStringimpl(long arg0) {
        return '(' + m99getFirstimpl(arg0) + ", " + m100getSecondimpl(arg0) + ')';
    }

    public String toString() {
        return m102toStringimpl(this.packedValue);
    }
}
