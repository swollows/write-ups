package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u00020\u00050\u0004H@"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1431}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$1", "I$0", "I$1", "J$0", "I$2", "I$3"})
/* compiled from: ScatterMap.kt */
final class MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Integer>, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1(MutableScatterMap<K, V> mutableScatterMap, Continuation<? super MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1> continuation) {
        super(2, continuation);
        this.this$0 = mutableScatterMap;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1 = new MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1(this.this$0, continuation);
        mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1.L$0 = obj;
        return mutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1;
    }

    public final Object invoke(SequenceScope<? super Integer> sequenceScope, Continuation<? super Unit> continuation) {
        return ((MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0076, code lost:
        if (r8 >= r9) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0081, code lost:
        if ((r10 & 255) >= 128) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0083, code lost:
        r7 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0085, code lost:
        r7 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0086, code lost:
        if (r7 == false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0088, code lost:
        r3 = kotlin.coroutines.jvm.internal.Boxing.boxInt((r12 << 3) + r8);
        r2.L$0 = r15;
        r2.L$1 = r14;
        r2.I$0 = r13;
        r2.I$1 = r12;
        r2.J$0 = r10;
        r2.I$2 = r9;
        r2.I$3 = r8;
        r2.label = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00a6, code lost:
        if (r15.yield(r3, r2) != r0) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00a8, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00aa, code lost:
        r10 = r10 >> 8;
        r8 = r8 + 1;
        r3 = 8;
        r1 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00b4, code lost:
        r1 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00b6, code lost:
        if (r9 != r1) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00b8, code lost:
        r8 = r6;
        r10 = r12;
        r9 = r13;
        r7 = r14;
        r6 = r15;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00be, code lost:
        r1 = r3;
        r5 = r23;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00c2, code lost:
        if (r10 == r9) goto L_0x00cb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00c4, code lost:
        r10 = r10 + 1;
        r3 = r1;
        r1 = r22;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00cd, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0048, code lost:
        if (0 <= r9) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x004a, code lost:
        r11 = r7[r10];
        r13 = r11;
        r23 = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x005f, code lost:
        if (((((~r13) << 7) & r13) & -9187201950435737472L) == -9187201950435737472L) goto L_0x00be;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0061, code lost:
        r15 = r6;
        r14 = r7;
        r6 = r8;
        r13 = r9;
        r9 = 8 - ((~(r10 - r9)) >>> 31);
        r8 = 0;
        r5 = r23;
        r12 = r10;
        r10 = r11;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r23) {
        /*
            r22 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r1 = r22
            int r2 = r1.label
            r3 = 8
            switch(r2) {
                case 0: goto L_0x0032;
                case 1: goto L_0x0015;
                default: goto L_0x000d;
            }
        L_0x000d:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0015:
            r2 = r22
            r5 = r23
            r6 = 0
            r7 = 0
            int r8 = r2.I$3
            int r9 = r2.I$2
            long r10 = r2.J$0
            int r12 = r2.I$1
            int r13 = r2.I$0
            java.lang.Object r14 = r2.L$1
            long[] r14 = (long[]) r14
            java.lang.Object r15 = r2.L$0
            kotlin.sequences.SequenceScope r15 = (kotlin.sequences.SequenceScope) r15
            kotlin.ResultKt.throwOnFailure(r5)
            goto L_0x00a9
        L_0x0032:
            kotlin.ResultKt.throwOnFailure(r23)
            r2 = r22
            r5 = r23
            java.lang.Object r6 = r2.L$0
            kotlin.sequences.SequenceScope r6 = (kotlin.sequences.SequenceScope) r6
            androidx.collection.MutableScatterMap<K, V> r7 = r2.this$0
            androidx.collection.ScatterMap r7 = (androidx.collection.ScatterMap) r7
            r8 = 0
            long[] r7 = r7.metadata
            int r9 = r7.length
            int r9 = r9 + -2
            r10 = 0
            if (r10 > r9) goto L_0x00ca
        L_0x004a:
            r11 = r7[r10]
            r13 = r11
            r15 = 0
            r23 = r5
            long r4 = ~r13
            r16 = 7
            long r4 = r4 << r16
            long r4 = r4 & r13
            r16 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r4 = r4 & r16
            int r4 = (r4 > r16 ? 1 : (r4 == r16 ? 0 : -1))
            if (r4 == 0) goto L_0x00be
            int r4 = r10 - r9
            int r4 = ~r4
            int r4 = r4 >>> 31
            int r4 = 8 - r4
            r5 = 0
            r15 = r6
            r14 = r7
            r6 = r8
            r13 = r9
            r9 = r4
            r8 = r5
            r5 = r23
            r20 = r11
            r12 = r10
            r10 = r20
        L_0x0076:
            if (r8 >= r9) goto L_0x00b4
            r16 = 255(0xff, double:1.26E-321)
            long r16 = r10 & r16
            r4 = 0
            r18 = 128(0x80, double:6.32E-322)
            int r7 = (r16 > r18 ? 1 : (r16 == r18 ? 0 : -1))
            if (r7 >= 0) goto L_0x0085
            r7 = 1
            goto L_0x0086
        L_0x0085:
            r7 = 0
        L_0x0086:
            if (r7 == 0) goto L_0x00aa
            int r4 = r12 << 3
            int r4 = r4 + r8
            r7 = 0
            java.lang.Integer r3 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r4)
            r2.L$0 = r15
            r2.L$1 = r14
            r2.I$0 = r13
            r2.I$1 = r12
            r2.J$0 = r10
            r2.I$2 = r9
            r2.I$3 = r8
            r1 = 1
            r2.label = r1
            java.lang.Object r1 = r15.yield(r3, r2)
            if (r1 != r0) goto L_0x00a9
            return r0
        L_0x00a9:
        L_0x00aa:
            r1 = 8
            long r10 = r10 >> r1
            r3 = 1
            int r8 = r8 + r3
            r3 = r1
            r1 = r22
            goto L_0x0076
        L_0x00b4:
            r1 = r3
            r3 = 1
            if (r9 != r1) goto L_0x00cb
            r8 = r6
            r10 = r12
            r9 = r13
            r7 = r14
            r6 = r15
            goto L_0x00c2
        L_0x00be:
            r1 = r3
            r3 = 1
            r5 = r23
        L_0x00c2:
            if (r10 == r9) goto L_0x00ca
            int r10 = r10 + 1
            r3 = r1
            r1 = r22
            goto L_0x004a
        L_0x00ca:
        L_0x00cb:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap$MutableMapWrapper$keys$1$iterator$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
