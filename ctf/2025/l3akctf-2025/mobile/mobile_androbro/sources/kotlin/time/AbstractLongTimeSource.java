package kotlin.time;

import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.time.ComparableTimeMark;
import kotlin.time.TimeSource;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\u00020\u0001:\u0001\u0011B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\bH\u0002J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\b\u0010\u0010\u001a\u00020\bH$R\u0014\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001b\u0010\u0007\u001a\u00020\b8BX\u0002¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n¨\u0006\u0012"}, d2 = {"Lkotlin/time/AbstractLongTimeSource;", "Lkotlin/time/TimeSource$WithComparableMarks;", "unit", "Lkotlin/time/DurationUnit;", "(Lkotlin/time/DurationUnit;)V", "getUnit", "()Lkotlin/time/DurationUnit;", "zero", "", "getZero", "()J", "zero$delegate", "Lkotlin/Lazy;", "adjustedRead", "markNow", "Lkotlin/time/ComparableTimeMark;", "read", "LongTimeMark", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* compiled from: TimeSources.kt */
public abstract class AbstractLongTimeSource implements TimeSource.WithComparableMarks {
    private final DurationUnit unit;
    private final Lazy zero$delegate = LazyKt.lazy(new AbstractLongTimeSource$zero$2(this));

    /* access modifiers changed from: protected */
    public abstract long read();

    public AbstractLongTimeSource(DurationUnit unit2) {
        Intrinsics.checkNotNullParameter(unit2, "unit");
        this.unit = unit2;
    }

    /* access modifiers changed from: protected */
    public final DurationUnit getUnit() {
        return this.unit;
    }

    private final long getZero() {
        return ((Number) this.zero$delegate.getValue()).longValue();
    }

    /* access modifiers changed from: private */
    public final long adjustedRead() {
        return read() - getZero();
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\b\u0002\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0012\u0010\n\u001a\u00020\u0007H\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\fJ\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u001b\u0010\u0013\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0001H\u0002ø\u0001\u0000¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\b\u0010\u001a\u001a\u00020\u001bH\u0016R\u0013\u0010\u0006\u001a\u00020\u0007X\u0004ø\u0001\u0000¢\u0006\u0004\n\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0004¢\u0006\u0002\n\u0000\u0002\u0004\n\u0002\b!¨\u0006\u001c"}, d2 = {"Lkotlin/time/AbstractLongTimeSource$LongTimeMark;", "Lkotlin/time/ComparableTimeMark;", "startedAt", "", "timeSource", "Lkotlin/time/AbstractLongTimeSource;", "offset", "Lkotlin/time/Duration;", "(JLkotlin/time/AbstractLongTimeSource;JLkotlin/jvm/internal/DefaultConstructorMarker;)V", "J", "elapsedNow", "elapsedNow-UwyO8pc", "()J", "equals", "", "other", "", "hashCode", "", "minus", "minus-UwyO8pc", "(Lkotlin/time/ComparableTimeMark;)J", "plus", "duration", "plus-LRDsOJo", "(J)Lkotlin/time/ComparableTimeMark;", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* compiled from: TimeSources.kt */
    private static final class LongTimeMark implements ComparableTimeMark {
        private final long offset;
        private final long startedAt;
        private final AbstractLongTimeSource timeSource;

        public /* synthetic */ LongTimeMark(long j, AbstractLongTimeSource abstractLongTimeSource, long j2, DefaultConstructorMarker defaultConstructorMarker) {
            this(j, abstractLongTimeSource, j2);
        }

        private LongTimeMark(long startedAt2, AbstractLongTimeSource timeSource2, long offset2) {
            Intrinsics.checkNotNullParameter(timeSource2, "timeSource");
            this.startedAt = startedAt2;
            this.timeSource = timeSource2;
            this.offset = offset2;
        }

        public int compareTo(ComparableTimeMark other) {
            return ComparableTimeMark.DefaultImpls.compareTo(this, other);
        }

        public boolean hasNotPassedNow() {
            return ComparableTimeMark.DefaultImpls.hasNotPassedNow(this);
        }

        public boolean hasPassedNow() {
            return ComparableTimeMark.DefaultImpls.hasPassedNow(this);
        }

        /* renamed from: minus-LRDsOJo  reason: not valid java name */
        public ComparableTimeMark m1597minusLRDsOJo(long duration) {
            return ComparableTimeMark.DefaultImpls.m1608minusLRDsOJo(this, duration);
        }

        /* renamed from: elapsedNow-UwyO8pc  reason: not valid java name */
        public long m1595elapsedNowUwyO8pc() {
            return Duration.m1648minusLRDsOJo(LongSaturatedMathKt.saturatingOriginsDiff(this.timeSource.adjustedRead(), this.startedAt, this.timeSource.getUnit()), this.offset);
        }

        /* renamed from: plus-LRDsOJo  reason: not valid java name */
        public ComparableTimeMark m1600plusLRDsOJo(long duration) {
            long j = duration;
            DurationUnit unit = this.timeSource.getUnit();
            if (Duration.m1645isInfiniteimpl(duration)) {
                return new LongTimeMark(LongSaturatedMathKt.m1742saturatingAddNuflL3o(this.startedAt, unit, j), this.timeSource, Duration.Companion.m1716getZEROUwyO8pc(), (DefaultConstructorMarker) null);
            }
            long durationInUnit = Duration.m1665truncateToUwyO8pc$kotlin_stdlib(j, unit);
            long rest = Duration.m1649plusLRDsOJo(Duration.m1648minusLRDsOJo(j, durationInUnit), this.offset);
            long sum = LongSaturatedMathKt.m1742saturatingAddNuflL3o(this.startedAt, unit, durationInUnit);
            long restInUnit = Duration.m1665truncateToUwyO8pc$kotlin_stdlib(rest, unit);
            long sum2 = LongSaturatedMathKt.m1742saturatingAddNuflL3o(sum, unit, restInUnit);
            long restUnderUnit = Duration.m1648minusLRDsOJo(rest, restInUnit);
            long restUnderUnitNs = Duration.m1633getInWholeNanosecondsimpl(restUnderUnit);
            if (!(sum2 == 0 || restUnderUnitNs == 0 || (sum2 ^ restUnderUnitNs) >= 0)) {
                long correction = DurationKt.toDuration(MathKt.getSign(restUnderUnitNs), unit);
                sum2 = LongSaturatedMathKt.m1742saturatingAddNuflL3o(sum2, unit, correction);
                restUnderUnit = Duration.m1648minusLRDsOJo(restUnderUnit, correction);
            }
            long newValue = sum2;
            return new LongTimeMark(newValue, this.timeSource, (((newValue - 1) | 1) > Long.MAX_VALUE ? 1 : (((newValue - 1) | 1) == Long.MAX_VALUE ? 0 : -1)) == 0 ? Duration.Companion.m1716getZEROUwyO8pc() : restUnderUnit, (DefaultConstructorMarker) null);
        }

        /* renamed from: minus-UwyO8pc  reason: not valid java name */
        public long m1598minusUwyO8pc(ComparableTimeMark other) {
            Intrinsics.checkNotNullParameter(other, "other");
            if ((other instanceof LongTimeMark) && Intrinsics.areEqual((Object) this.timeSource, (Object) ((LongTimeMark) other).timeSource)) {
                return Duration.m1649plusLRDsOJo(LongSaturatedMathKt.saturatingOriginsDiff(this.startedAt, ((LongTimeMark) other).startedAt, this.timeSource.getUnit()), Duration.m1648minusLRDsOJo(this.offset, ((LongTimeMark) other).offset));
            }
            throw new IllegalArgumentException("Subtracting or comparing time marks from different time sources is not possible: " + this + " and " + other);
        }

        public boolean equals(Object other) {
            return (other instanceof LongTimeMark) && Intrinsics.areEqual((Object) this.timeSource, (Object) ((LongTimeMark) other).timeSource) && Duration.m1618equalsimpl0(m1598minusUwyO8pc((ComparableTimeMark) other), Duration.Companion.m1716getZEROUwyO8pc());
        }

        public int hashCode() {
            return (Duration.m1641hashCodeimpl(this.offset) * 37) + Long.hashCode(this.startedAt);
        }

        public String toString() {
            return "LongTimeMark(" + this.startedAt + DurationUnitKt.shortName(this.timeSource.getUnit()) + " + " + Duration.m1662toStringimpl(this.offset) + ", " + this.timeSource + ')';
        }
    }

    public ComparableTimeMark markNow() {
        return new LongTimeMark(adjustedRead(), this, Duration.Companion.m1716getZEROUwyO8pc(), (DefaultConstructorMarker) null);
    }
}
