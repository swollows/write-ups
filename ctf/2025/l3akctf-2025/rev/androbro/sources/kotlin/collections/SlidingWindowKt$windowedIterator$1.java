package kotlin.collections;

import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u00040\u0003H@"}, d2 = {"<anonymous>", "", "T", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "kotlin.collections.SlidingWindowKt$windowedIterator$1", f = "SlidingWindow.kt", i = {0, 0, 0, 2, 2, 3, 3}, l = {34, 40, 49, 55, 58}, m = "invokeSuspend", n = {"$this$iterator", "buffer", "gap", "$this$iterator", "buffer", "$this$iterator", "buffer"}, s = {"L$0", "L$1", "I$0", "L$0", "L$1", "L$0", "L$1"})
/* compiled from: SlidingWindow.kt */
final class SlidingWindowKt$windowedIterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super List<? extends T>>, Continuation<? super Unit>, Object> {
    final /* synthetic */ Iterator<T> $iterator;
    final /* synthetic */ boolean $partialWindows;
    final /* synthetic */ boolean $reuseBuffer;
    final /* synthetic */ int $size;
    final /* synthetic */ int $step;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    SlidingWindowKt$windowedIterator$1(int i, int i2, Iterator<? extends T> it, boolean z, boolean z2, Continuation<? super SlidingWindowKt$windowedIterator$1> continuation) {
        super(2, continuation);
        this.$size = i;
        this.$step = i2;
        this.$iterator = it;
        this.$reuseBuffer = z;
        this.$partialWindows = z2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        SlidingWindowKt$windowedIterator$1 slidingWindowKt$windowedIterator$1 = new SlidingWindowKt$windowedIterator$1(this.$size, this.$step, this.$iterator, this.$reuseBuffer, this.$partialWindows, continuation);
        slidingWindowKt$windowedIterator$1.L$0 = obj;
        return slidingWindowKt$windowedIterator$1;
    }

    public final Object invoke(SequenceScope<? super List<? extends T>> sequenceScope, Continuation<? super Unit> continuation) {
        return ((SlidingWindowKt$windowedIterator$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0084, code lost:
        if (r4.hasNext() == false) goto L_0x00c0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0086, code lost:
        r8 = r4.next();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x008a, code lost:
        if (r6 <= 0) goto L_0x008f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x008c, code lost:
        r6 = r6 - 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x008f, code lost:
        r5.add(r8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0098, code lost:
        if (r5.size() != r0.$size) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x009a, code lost:
        r0.L$0 = r7;
        r0.L$1 = r5;
        r0.L$2 = r4;
        r0.I$0 = r3;
        r0.label = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00ac, code lost:
        if (r7.yield(r5, r0) != r1) goto L_0x00af;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00ae, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b1, code lost:
        if (r0.$reuseBuffer == false) goto L_0x00b7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00b3, code lost:
        r5.clear();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00b7, code lost:
        r5 = new java.util.ArrayList(r0.$size);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00be, code lost:
        r6 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00c7, code lost:
        if (r5.isEmpty() != false) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00cb, code lost:
        if (r0.$partialWindows != false) goto L_0x00d5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00d3, code lost:
        if (r5.size() != r0.$size) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00d5, code lost:
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00e5, code lost:
        if (r7.yield(r5, r0) != r1) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00e7, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00f9, code lost:
        if (r3.hasNext() == false) goto L_0x0142;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00fb, code lost:
        r4.add(r3.next());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0106, code lost:
        if (r4.isFull() == false) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x010e, code lost:
        if (r4.size() >= r1.$size) goto L_0x0117;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:43:0x0110, code lost:
        r4 = r4.expanded(r1.$size);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0119, code lost:
        if (r1.$reuseBuffer == false) goto L_0x011f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x011b, code lost:
        r6 = r4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x011f, code lost:
        r6 = new java.util.ArrayList(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x0129, code lost:
        r1.L$0 = r5;
        r1.L$1 = r4;
        r1.L$2 = r3;
        r1.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x0139, code lost:
        if (r5.yield(r6, r1) != r0) goto L_0x013c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x013b, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x013c, code lost:
        r4.removeFirst(r1.$step);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x0144, code lost:
        if (r1.$partialWindows == false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0146, code lost:
        r3 = r4;
        r4 = r5;
        r10 = r1;
        r1 = r0;
        r0 = r10;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x0151, code lost:
        if (r3.size() <= r0.$step) goto L_0x017e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x0155, code lost:
        if (r0.$reuseBuffer == false) goto L_0x015b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x0157, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:60:0x015b, code lost:
        r5 = new java.util.ArrayList(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x0165, code lost:
        r0.L$0 = r4;
        r0.L$1 = r3;
        r0.L$2 = null;
        r0.label = 4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x0175, code lost:
        if (r4.yield(r5, r0) != r1) goto L_0x0178;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x0177, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x0178, code lost:
        r3.removeFirst(r0.$step);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x0185, code lost:
        if (r3.isEmpty() != false) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x0187, code lost:
        r0.L$0 = null;
        r0.L$1 = null;
        r0.L$2 = null;
        r0.label = 5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x0197, code lost:
        if (r4.yield(r3, r0) != r1) goto L_0x019c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0199, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x019b, code lost:
        r0 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x019e, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r1 = r12.label
            r2 = 0
            switch(r1) {
                case 0: goto L_0x0058;
                case 1: goto L_0x0041;
                case 2: goto L_0x003b;
                case 3: goto L_0x0029;
                case 4: goto L_0x0018;
                case 5: goto L_0x0012;
                default: goto L_0x000a;
            }
        L_0x000a:
            java.lang.IllegalStateException r13 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r13.<init>(r0)
            throw r13
        L_0x0012:
            r0 = r12
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x019a
        L_0x0018:
            r1 = r12
            java.lang.Object r3 = r1.L$1
            kotlin.collections.RingBuffer r3 = (kotlin.collections.RingBuffer) r3
            java.lang.Object r4 = r1.L$0
            kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
            kotlin.ResultKt.throwOnFailure(r13)
            r10 = r1
            r1 = r0
            r0 = r10
            goto L_0x0178
        L_0x0029:
            r1 = r12
            java.lang.Object r3 = r1.L$2
            java.util.Iterator r3 = (java.util.Iterator) r3
            java.lang.Object r4 = r1.L$1
            kotlin.collections.RingBuffer r4 = (kotlin.collections.RingBuffer) r4
            java.lang.Object r5 = r1.L$0
            kotlin.sequences.SequenceScope r5 = (kotlin.sequences.SequenceScope) r5
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x013c
        L_0x003b:
            r0 = r12
            kotlin.ResultKt.throwOnFailure(r13)
            goto L_0x00e8
        L_0x0041:
            r1 = r12
            int r3 = r1.I$0
            java.lang.Object r4 = r1.L$2
            java.util.Iterator r4 = (java.util.Iterator) r4
            java.lang.Object r5 = r1.L$1
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            java.lang.Object r6 = r1.L$0
            kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
            kotlin.ResultKt.throwOnFailure(r13)
            r7 = r6
            r10 = r1
            r1 = r0
            r0 = r10
            goto L_0x00af
        L_0x0058:
            kotlin.ResultKt.throwOnFailure(r13)
            r1 = r12
            java.lang.Object r3 = r1.L$0
            kotlin.sequences.SequenceScope r3 = (kotlin.sequences.SequenceScope) r3
            int r4 = r1.$size
            r5 = 1024(0x400, float:1.435E-42)
            int r4 = kotlin.ranges.RangesKt.coerceAtMost((int) r4, (int) r5)
            int r5 = r1.$step
            int r6 = r1.$size
            int r5 = r5 - r6
            if (r5 < 0) goto L_0x00ea
            java.util.ArrayList r6 = new java.util.ArrayList
            r6.<init>(r4)
            r4 = r6
            r6 = 0
            java.util.Iterator<T> r7 = r1.$iterator
            r10 = r1
            r1 = r0
            r0 = r10
            r11 = r7
            r7 = r3
            r3 = r5
            r5 = r4
            r4 = r11
        L_0x0080:
            boolean r8 = r4.hasNext()
            if (r8 == 0) goto L_0x00c0
            java.lang.Object r8 = r4.next()
            if (r6 <= 0) goto L_0x008f
            int r6 = r6 + -1
            goto L_0x0080
        L_0x008f:
            r5.add(r8)
            int r8 = r5.size()
            int r9 = r0.$size
            if (r8 != r9) goto L_0x0080
            r6 = r0
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r0.L$0 = r7
            r0.L$1 = r5
            r0.L$2 = r4
            r0.I$0 = r3
            r8 = 1
            r0.label = r8
            java.lang.Object r6 = r7.yield(r5, r6)
            if (r6 != r1) goto L_0x00af
            return r1
        L_0x00af:
            boolean r6 = r0.$reuseBuffer
            if (r6 == 0) goto L_0x00b7
            r5.clear()
            goto L_0x00be
        L_0x00b7:
            java.util.ArrayList r5 = new java.util.ArrayList
            int r6 = r0.$size
            r5.<init>(r6)
        L_0x00be:
            r6 = r3
            goto L_0x0080
        L_0x00c0:
            r3 = r5
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 != 0) goto L_0x019c
            boolean r3 = r0.$partialWindows
            if (r3 != 0) goto L_0x00d5
            int r3 = r5.size()
            int r4 = r0.$size
            if (r3 != r4) goto L_0x019c
        L_0x00d5:
            r3 = r0
            kotlin.coroutines.Continuation r3 = (kotlin.coroutines.Continuation) r3
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r2 = 2
            r0.label = r2
            java.lang.Object r2 = r7.yield(r5, r3)
            if (r2 != r1) goto L_0x00e8
            return r1
        L_0x00e8:
            goto L_0x019c
        L_0x00ea:
            kotlin.collections.RingBuffer r5 = new kotlin.collections.RingBuffer
            r5.<init>(r4)
            r4 = r5
            java.util.Iterator<T> r5 = r1.$iterator
            r10 = r5
            r5 = r3
            r3 = r10
        L_0x00f5:
            boolean r6 = r3.hasNext()
            if (r6 == 0) goto L_0x0142
            java.lang.Object r6 = r3.next()
            r4.add(r6)
            boolean r6 = r4.isFull()
            if (r6 == 0) goto L_0x00f5
            int r6 = r4.size()
            int r7 = r1.$size
            if (r6 >= r7) goto L_0x0117
            int r6 = r1.$size
            kotlin.collections.RingBuffer r4 = r4.expanded(r6)
            goto L_0x00f5
        L_0x0117:
            boolean r6 = r1.$reuseBuffer
            if (r6 == 0) goto L_0x011f
            r6 = r4
            java.util.List r6 = (java.util.List) r6
            goto L_0x0129
        L_0x011f:
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = r4
            java.util.Collection r7 = (java.util.Collection) r7
            r6.<init>(r7)
            java.util.List r6 = (java.util.List) r6
        L_0x0129:
            r7 = r1
            kotlin.coroutines.Continuation r7 = (kotlin.coroutines.Continuation) r7
            r1.L$0 = r5
            r1.L$1 = r4
            r1.L$2 = r3
            r8 = 3
            r1.label = r8
            java.lang.Object r6 = r5.yield(r6, r7)
            if (r6 != r0) goto L_0x013c
            return r0
        L_0x013c:
            int r6 = r1.$step
            r4.removeFirst(r6)
            goto L_0x00f5
        L_0x0142:
            boolean r3 = r1.$partialWindows
            if (r3 == 0) goto L_0x019b
            r3 = r4
            r4 = r5
            r10 = r1
            r1 = r0
            r0 = r10
        L_0x014b:
            int r5 = r3.size()
            int r6 = r0.$step
            if (r5 <= r6) goto L_0x017e
            boolean r5 = r0.$reuseBuffer
            if (r5 == 0) goto L_0x015b
            r5 = r3
            java.util.List r5 = (java.util.List) r5
            goto L_0x0165
        L_0x015b:
            java.util.ArrayList r5 = new java.util.ArrayList
            r6 = r3
            java.util.Collection r6 = (java.util.Collection) r6
            r5.<init>(r6)
            java.util.List r5 = (java.util.List) r5
        L_0x0165:
            r6 = r0
            kotlin.coroutines.Continuation r6 = (kotlin.coroutines.Continuation) r6
            r0.L$0 = r4
            r0.L$1 = r3
            r0.L$2 = r2
            r7 = 4
            r0.label = r7
            java.lang.Object r5 = r4.yield(r5, r6)
            if (r5 != r1) goto L_0x0178
            return r1
        L_0x0178:
            int r5 = r0.$step
            r3.removeFirst(r5)
            goto L_0x014b
        L_0x017e:
            r5 = r3
            java.util.Collection r5 = (java.util.Collection) r5
            boolean r5 = r5.isEmpty()
            if (r5 != 0) goto L_0x019c
            r5 = r0
            kotlin.coroutines.Continuation r5 = (kotlin.coroutines.Continuation) r5
            r0.L$0 = r2
            r0.L$1 = r2
            r0.L$2 = r2
            r2 = 5
            r0.label = r2
            java.lang.Object r2 = r4.yield(r3, r5)
            if (r2 != r1) goto L_0x019a
            return r1
        L_0x019a:
            goto L_0x019c
        L_0x019b:
            r0 = r1
        L_0x019c:
            kotlin.Unit r1 = kotlin.Unit.INSTANCE
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.collections.SlidingWindowKt$windowedIterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
