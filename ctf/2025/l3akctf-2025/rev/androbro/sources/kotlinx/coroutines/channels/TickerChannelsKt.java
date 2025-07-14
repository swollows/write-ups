package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlinx.coroutines.Dispatchers;
import kotlinx.coroutines.GlobalScope;

@Metadata(d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a/\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a/\u0010\b\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H@ø\u0001\u0000¢\u0006\u0002\u0010\u0007\u001a4\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007\u0002\u0004\n\u0002\b\u0019¨\u0006\u000f"}, d2 = {"fixedDelayTicker", "", "delayMillis", "", "initialDelayMillis", "channel", "Lkotlinx/coroutines/channels/SendChannel;", "(JJLkotlinx/coroutines/channels/SendChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "fixedPeriodTicker", "ticker", "Lkotlinx/coroutines/channels/ReceiveChannel;", "context", "Lkotlin/coroutines/CoroutineContext;", "mode", "Lkotlinx/coroutines/channels/TickerMode;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* compiled from: TickerChannels.kt */
public final class TickerChannelsKt {
    public static /* synthetic */ ReceiveChannel ticker$default(long j, long j2, CoroutineContext coroutineContext, TickerMode tickerMode, int i, Object obj) {
        if ((i & 2) != 0) {
            j2 = j;
        }
        if ((i & 4) != 0) {
            coroutineContext = EmptyCoroutineContext.INSTANCE;
        }
        if ((i & 8) != 0) {
            tickerMode = TickerMode.FIXED_PERIOD;
        }
        return ticker(j, j2, coroutineContext, tickerMode);
    }

    public static final ReceiveChannel<Unit> ticker(long delayMillis, long initialDelayMillis, CoroutineContext context, TickerMode mode) {
        long j = delayMillis;
        long j2 = initialDelayMillis;
        boolean z = true;
        if (j >= 0) {
            if (j2 < 0) {
                z = false;
            }
            if (z) {
                return ProduceKt.produce(GlobalScope.INSTANCE, Dispatchers.getUnconfined().plus(context), 0, new TickerChannelsKt$ticker$3(mode, delayMillis, initialDelayMillis, (Continuation<? super TickerChannelsKt$ticker$3>) null));
            }
            CoroutineContext coroutineContext = context;
            throw new IllegalArgumentException(("Expected non-negative initial delay, but has " + j2 + " ms").toString());
        }
        CoroutineContext coroutineContext2 = context;
        throw new IllegalArgumentException(("Expected non-negative delay, but has " + j + " ms").toString());
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x008c, code lost:
        r2 = kotlinx.coroutines.EventLoop_commonKt.delayToNanos(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0090, code lost:
        r9 = r9 + r2;
        r11 = kotlin.Unit.INSTANCE;
        r14.L$0 = r13;
        r14.J$0 = r9;
        r14.J$1 = r2;
        r14.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00a1, code lost:
        if (r13.send(r11, r14) != r1) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00a3, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00a4, code lost:
        r11 = r9;
        r9 = r2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00a6, code lost:
        r2 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00aa, code lost:
        if (r2 == null) goto L_0x00b1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00ac, code lost:
        r2 = r2.nanoTime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00b1, code lost:
        r2 = java.lang.System.nanoTime();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00b5, code lost:
        r4 = kotlin.ranges.RangesKt.coerceAtLeast(r11 - r2, 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00bf, code lost:
        if (r4 != 0) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c3, code lost:
        if (r9 == 0) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00c5, code lost:
        r4 = r9 - ((r2 - r11) % r9);
        r11 = r2 + r4;
        r2 = kotlinx.coroutines.EventLoop_commonKt.delayNanosToMillis(r4);
        r14.L$0 = r13;
        r14.J$0 = r11;
        r14.J$1 = r9;
        r14.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00dd, code lost:
        if (kotlinx.coroutines.DelayKt.delay(r2, r14) != r1) goto L_0x00e0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00df, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00e0, code lost:
        r2 = r9;
        r9 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00e3, code lost:
        r2 = kotlinx.coroutines.EventLoop_commonKt.delayNanosToMillis(r4);
        r14.L$0 = r13;
        r14.J$0 = r11;
        r14.J$1 = r9;
        r14.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00f4, code lost:
        if (kotlinx.coroutines.DelayKt.delay(r2, r14) != r1) goto L_0x00f7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00f6, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00f7, code lost:
        r2 = r9;
        r9 = r11;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlinx.coroutines.channels.SendChannel<? super kotlin.Unit>, code=kotlinx.coroutines.channels.SendChannel, for r13v0, types: [kotlinx.coroutines.channels.SendChannel<? super kotlin.Unit>, java.lang.Object] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0063  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final java.lang.Object fixedPeriodTicker(long r9, long r11, kotlinx.coroutines.channels.SendChannel r13, kotlin.coroutines.Continuation<? super kotlin.Unit> r14) {
        /*
            boolean r0 = r14 instanceof kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1
            if (r0 == 0) goto L_0x0014
            r0 = r14
            kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1 r0 = (kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r14 = r0.label
            int r14 = r14 - r2
            r0.label = r14
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1 r0 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedPeriodTicker$1
            r0.<init>(r14)
        L_0x0019:
            r14 = r0
            java.lang.Object r0 = r14.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r14.label
            switch(r2) {
                case 0: goto L_0x0063;
                case 1: goto L_0x0057;
                case 2: goto L_0x004b;
                case 3: goto L_0x003c;
                case 4: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            r9.<init>(r10)
            throw r9
        L_0x002d:
            long r9 = r14.J$1
            long r11 = r14.J$0
            java.lang.Object r13 = r14.L$0
            kotlinx.coroutines.channels.SendChannel r13 = (kotlinx.coroutines.channels.SendChannel) r13
            kotlin.ResultKt.throwOnFailure(r0)
            r2 = r9
            r9 = r11
            goto L_0x00f9
        L_0x003c:
            long r9 = r14.J$1
            long r11 = r14.J$0
            java.lang.Object r13 = r14.L$0
            kotlinx.coroutines.channels.SendChannel r13 = (kotlinx.coroutines.channels.SendChannel) r13
            kotlin.ResultKt.throwOnFailure(r0)
            r2 = r9
            r9 = r11
            goto L_0x00e2
        L_0x004b:
            long r9 = r14.J$1
            long r11 = r14.J$0
            java.lang.Object r13 = r14.L$0
            kotlinx.coroutines.channels.SendChannel r13 = (kotlinx.coroutines.channels.SendChannel) r13
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x00a6
        L_0x0057:
            long r9 = r14.J$1
            long r11 = r14.J$0
            java.lang.Object r13 = r14.L$0
            kotlinx.coroutines.channels.SendChannel r13 = (kotlinx.coroutines.channels.SendChannel) r13
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x008c
        L_0x0063:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.AbstractTimeSource r2 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r2 == 0) goto L_0x0071
            long r2 = r2.nanoTime()
            goto L_0x0075
        L_0x0071:
            long r2 = java.lang.System.nanoTime()
        L_0x0075:
            long r4 = kotlinx.coroutines.EventLoop_commonKt.delayToNanos(r11)
            long r2 = r2 + r4
            r14.L$0 = r13
            r14.J$0 = r9
            r14.J$1 = r2
            r4 = 1
            r14.label = r4
            java.lang.Object r11 = kotlinx.coroutines.DelayKt.delay(r11, r14)
            if (r11 != r1) goto L_0x008a
            return r1
        L_0x008a:
            r11 = r9
            r9 = r2
        L_0x008c:
            long r2 = kotlinx.coroutines.EventLoop_commonKt.delayToNanos(r11)
        L_0x0090:
            long r9 = r9 + r2
            kotlin.Unit r11 = kotlin.Unit.INSTANCE
            r14.L$0 = r13
            r14.J$0 = r9
            r14.J$1 = r2
            r12 = 2
            r14.label = r12
            java.lang.Object r11 = r13.send(r11, r14)
            if (r11 != r1) goto L_0x00a4
            return r1
        L_0x00a4:
            r11 = r9
            r9 = r2
        L_0x00a6:
            kotlinx.coroutines.AbstractTimeSource r2 = kotlinx.coroutines.AbstractTimeSourceKt.getTimeSource()
            if (r2 == 0) goto L_0x00b1
            long r2 = r2.nanoTime()
            goto L_0x00b5
        L_0x00b1:
            long r2 = java.lang.System.nanoTime()
        L_0x00b5:
            long r4 = r11 - r2
            r6 = 0
            long r4 = kotlin.ranges.RangesKt.coerceAtLeast((long) r4, (long) r6)
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 != 0) goto L_0x00e3
            int r6 = (r9 > r6 ? 1 : (r9 == r6 ? 0 : -1))
            if (r6 == 0) goto L_0x00e3
            long r4 = r2 - r11
            long r4 = r4 % r9
            long r4 = r9 - r4
            long r11 = r2 + r4
            long r2 = kotlinx.coroutines.EventLoop_commonKt.delayNanosToMillis(r4)
            r14.L$0 = r13
            r14.J$0 = r11
            r14.J$1 = r9
            r6 = 3
            r14.label = r6
            java.lang.Object r2 = kotlinx.coroutines.DelayKt.delay(r2, r14)
            if (r2 != r1) goto L_0x00e0
            return r1
        L_0x00e0:
            r2 = r9
            r9 = r11
        L_0x00e2:
            goto L_0x0090
        L_0x00e3:
            long r2 = kotlinx.coroutines.EventLoop_commonKt.delayNanosToMillis(r4)
            r14.L$0 = r13
            r14.J$0 = r11
            r14.J$1 = r9
            r6 = 4
            r14.label = r6
            java.lang.Object r2 = kotlinx.coroutines.DelayKt.delay(r2, r14)
            if (r2 != r1) goto L_0x00f7
            return r1
        L_0x00f7:
            r2 = r9
            r9 = r11
        L_0x00f9:
            goto L_0x0090
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.TickerChannelsKt.fixedPeriodTicker(long, long, kotlinx.coroutines.channels.SendChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* access modifiers changed from: private */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:47)
        	at jadx.core.utils.ErrorsCounter.methodError(ErrorsCounter.java:81)
        */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x006d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x007b A[RETURN] */
    public static final java.lang.Object fixedDelayTicker(long r3, long r5, kotlinx.coroutines.channels.SendChannel<? super kotlin.Unit> r7, kotlin.coroutines.Continuation<? super kotlin.Unit> r8) {
        /*
            boolean r0 = r8 instanceof kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            if (r0 == 0) goto L_0x0014
            r0 = r8
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = (kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r8 = r0.label
            int r8 = r8 - r2
            r0.label = r8
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1 r0 = new kotlinx.coroutines.channels.TickerChannelsKt$fixedDelayTicker$1
            r0.<init>(r8)
        L_0x0019:
            r8 = r0
            java.lang.Object r0 = r8.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r8.label
            switch(r2) {
                case 0: goto L_0x004b;
                case 1: goto L_0x0041;
                case 2: goto L_0x0037;
                case 3: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r3 = new java.lang.IllegalStateException
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            r3.<init>(r4)
            throw r3
        L_0x002d:
            long r3 = r8.J$0
            java.lang.Object r5 = r8.L$0
            kotlinx.coroutines.channels.SendChannel r5 = (kotlinx.coroutines.channels.SendChannel) r5
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x007c
        L_0x0037:
            long r3 = r8.J$0
            java.lang.Object r5 = r8.L$0
            kotlinx.coroutines.channels.SendChannel r5 = (kotlinx.coroutines.channels.SendChannel) r5
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x006e
        L_0x0041:
            long r3 = r8.J$0
            java.lang.Object r5 = r8.L$0
            kotlinx.coroutines.channels.SendChannel r5 = (kotlinx.coroutines.channels.SendChannel) r5
            kotlin.ResultKt.throwOnFailure(r0)
            goto L_0x005d
        L_0x004b:
            kotlin.ResultKt.throwOnFailure(r0)
            r8.L$0 = r7
            r8.J$0 = r3
            r2 = 1
            r8.label = r2
            java.lang.Object r5 = kotlinx.coroutines.DelayKt.delay(r5, r8)
            if (r5 != r1) goto L_0x005c
            return r1
        L_0x005c:
            r5 = r7
        L_0x005d:
        L_0x005e:
            kotlin.Unit r6 = kotlin.Unit.INSTANCE
            r8.L$0 = r5
            r8.J$0 = r3
            r7 = 2
            r8.label = r7
            java.lang.Object r6 = r5.send(r6, r8)
            if (r6 != r1) goto L_0x006e
            return r1
        L_0x006e:
            r8.L$0 = r5
            r8.J$0 = r3
            r6 = 3
            r8.label = r6
            java.lang.Object r6 = kotlinx.coroutines.DelayKt.delay(r3, r8)
            if (r6 != r1) goto L_0x007c
            return r1
        L_0x007c:
            goto L_0x005e
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.TickerChannelsKt.fixedDelayTicker(long, long, kotlinx.coroutines.channels.SendChannel, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
