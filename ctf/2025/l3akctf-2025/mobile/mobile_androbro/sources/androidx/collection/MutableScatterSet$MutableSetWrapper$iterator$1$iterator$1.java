package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H@"}, d2 = {"<anonymous>", "", "E", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1", f = "ScatterSet.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1060}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
/* compiled from: ScatterSet.kt */
final class MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super E>, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MutableScatterSet<E> this$0;
    final /* synthetic */ MutableScatterSet$MutableSetWrapper$iterator$1<E> this$1;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(MutableScatterSet<E> mutableScatterSet, MutableScatterSet$MutableSetWrapper$iterator$1<E> mutableScatterSet$MutableSetWrapper$iterator$1, Continuation<? super MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1> continuation) {
        super(2, continuation);
        this.this$0 = mutableScatterSet;
        this.this$1 = mutableScatterSet$MutableSetWrapper$iterator$1;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1 = new MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1(this.this$0, this.this$1, continuation);
        mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1.L$0 = obj;
        return mutableScatterSet$MutableSetWrapper$iterator$1$iterator$1;
    }

    public final Object invoke(SequenceScope<? super E> sequenceScope, Continuation<? super Unit> continuation) {
        return ((MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0086, code lost:
        if (r8 >= r9) goto L_0x00d2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0091, code lost:
        if ((r10 & 255) >= 128) goto L_0x0095;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0093, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0095, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0096, code lost:
        if (r7 == false) goto L_0x00c7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0098, code lost:
        r1 = (r12 << 3) + r8;
        r4.setCurrent(r1);
        r24 = r5;
        r5 = r15.elements[r1];
        r2.L$0 = r3;
        r2.L$1 = r4;
        r2.L$2 = r15;
        r2.L$3 = r14;
        r2.I$0 = r13;
        r2.I$1 = r12;
        r2.J$0 = r10;
        r2.I$2 = r9;
        r2.I$3 = r8;
        r17 = r1;
        r2.label = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00c1, code lost:
        if (r3.yield(r5, r2) != r0) goto L_0x00c4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00c3, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00c4, code lost:
        r5 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c7, code lost:
        r24 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c9, code lost:
        r10 = r10 >> 8;
        r8 = r8 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00d2, code lost:
        r24 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d8, code lost:
        if (r9 != 8) goto L_0x00e4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00da, code lost:
        r8 = r6;
        r10 = r12;
        r9 = r13;
        r5 = r14;
        r7 = r15;
        r6 = r4;
        r4 = r3;
        r3 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00e4, code lost:
        r5 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e7, code lost:
        r0 = r24;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00ed, code lost:
        if (r10 == r9) goto L_0x00f5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ef, code lost:
        r10 = r10 + 1;
        r1 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f5, code lost:
        r5 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00f8, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0053, code lost:
        if (0 <= r9) goto L_0x0055;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0055, code lost:
        r11 = r5[r10];
        r13 = r11;
        r24 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x006a, code lost:
        if (((((~r13) << 7) & r13) & -9187201950435737472L) == -9187201950435737472L) goto L_0x00e7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006c, code lost:
        r14 = r5;
        r15 = r7;
        r13 = r9;
        r9 = 8 - ((~(r10 - r9)) >>> 31);
        r5 = r3;
        r3 = r4;
        r4 = r6;
        r6 = r8;
        r0 = r24;
        r8 = 0;
        r12 = r10;
        r10 = r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r24) {
        /*
            r23 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r1 = r23
            int r2 = r1.label
            switch(r2) {
                case 0: goto L_0x0038;
                case 1: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0013:
            r2 = r23
            r5 = r24
            r6 = 0
            r7 = 0
            int r8 = r2.I$3
            int r9 = r2.I$2
            long r10 = r2.J$0
            int r12 = r2.I$1
            int r13 = r2.I$0
            java.lang.Object r14 = r2.L$3
            long[] r14 = (long[]) r14
            java.lang.Object r15 = r2.L$2
            androidx.collection.MutableScatterSet r15 = (androidx.collection.MutableScatterSet) r15
            java.lang.Object r4 = r2.L$1
            androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1 r4 = (androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1) r4
            java.lang.Object r3 = r2.L$0
            kotlin.sequences.SequenceScope r3 = (kotlin.sequences.SequenceScope) r3
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x00c6
        L_0x0038:
            kotlin.ResultKt.throwOnFailure(r24)
            r2 = r23
            r3 = r24
            java.lang.Object r4 = r2.L$0
            kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
            androidx.collection.MutableScatterSet<E> r5 = r2.this$0
            androidx.collection.ScatterSet r5 = (androidx.collection.ScatterSet) r5
            androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1<E> r6 = r2.this$1
            androidx.collection.MutableScatterSet<E> r7 = r2.this$0
            r8 = 0
            long[] r5 = r5.metadata
            int r9 = r5.length
            int r9 = r9 + -2
            r10 = 0
            if (r10 > r9) goto L_0x00f5
        L_0x0055:
            r11 = r5[r10]
            r13 = r11
            r15 = 0
            r24 = r0
            long r0 = ~r13
            r17 = 7
            long r0 = r0 << r17
            long r0 = r0 & r13
            r17 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r17
            int r0 = (r0 > r17 ? 1 : (r0 == r17 ? 0 : -1))
            if (r0 == 0) goto L_0x00e7
            int r0 = r10 - r9
            int r0 = ~r0
            int r0 = r0 >>> 31
            r1 = 8
            int r0 = 8 - r0
            r1 = 0
            r14 = r5
            r15 = r7
            r13 = r9
            r9 = r0
            r5 = r3
            r3 = r4
            r4 = r6
            r6 = r8
            r0 = r24
            r8 = r1
            r21 = r11
            r12 = r10
            r10 = r21
        L_0x0086:
            if (r8 >= r9) goto L_0x00d2
            r17 = 255(0xff, double:1.26E-321)
            long r17 = r10 & r17
            r1 = 0
            r19 = 128(0x80, double:6.32E-322)
            int r7 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
            if (r7 >= 0) goto L_0x0095
            r7 = 1
            goto L_0x0096
        L_0x0095:
            r7 = 0
        L_0x0096:
            if (r7 == 0) goto L_0x00c7
            int r1 = r12 << 3
            int r1 = r1 + r8
            r7 = 0
            r4.setCurrent(r1)
            r24 = r5
            java.lang.Object[] r5 = r15.elements
            r5 = r5[r1]
            r2.L$0 = r3
            r2.L$1 = r4
            r2.L$2 = r15
            r2.L$3 = r14
            r2.I$0 = r13
            r2.I$1 = r12
            r2.J$0 = r10
            r2.I$2 = r9
            r2.I$3 = r8
            r17 = r1
            r1 = 1
            r2.label = r1
            java.lang.Object r1 = r3.yield(r5, r2)
            if (r1 != r0) goto L_0x00c4
            return r0
        L_0x00c4:
            r5 = r24
        L_0x00c6:
            goto L_0x00c9
        L_0x00c7:
            r24 = r5
        L_0x00c9:
            r1 = 8
            long r10 = r10 >> r1
            r16 = 1
            int r8 = r8 + 1
            goto L_0x0086
        L_0x00d2:
            r24 = r5
            r1 = 8
            r16 = 1
            if (r9 != r1) goto L_0x00e4
            r8 = r6
            r10 = r12
            r9 = r13
            r5 = r14
            r7 = r15
            r6 = r4
            r4 = r3
            r3 = r24
            goto L_0x00ed
        L_0x00e4:
            r5 = r24
            goto L_0x00f6
        L_0x00e7:
            r1 = 8
            r16 = 1
            r0 = r24
        L_0x00ed:
            if (r10 == r9) goto L_0x00f5
            int r10 = r10 + 1
            r1 = r23
            goto L_0x0055
        L_0x00f5:
            r5 = r3
        L_0x00f6:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterSet$MutableSetWrapper$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
