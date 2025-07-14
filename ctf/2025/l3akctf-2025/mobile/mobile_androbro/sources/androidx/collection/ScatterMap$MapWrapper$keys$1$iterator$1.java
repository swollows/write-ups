package androidx.collection;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.sequences.SequenceScope;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H@"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlin/sequences/SequenceScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "androidx.collection.ScatterMap$MapWrapper$keys$1$iterator$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0, 0}, l = {726}, m = "invokeSuspend", n = {"$this$iterator", "k$iv", "m$iv$iv", "lastIndex$iv$iv", "i$iv$iv", "slot$iv$iv", "bitCount$iv$iv", "j$iv$iv"}, s = {"L$0", "L$1", "L$2", "I$0", "I$1", "J$0", "I$2", "I$3"})
/* compiled from: ScatterMap.kt */
final class ScatterMap$MapWrapper$keys$1$iterator$1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super K>, Continuation<? super Unit>, Object> {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScatterMap<K, V> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ScatterMap$MapWrapper$keys$1$iterator$1(ScatterMap<K, V> scatterMap, Continuation<? super ScatterMap$MapWrapper$keys$1$iterator$1> continuation) {
        super(2, continuation);
        this.this$0 = scatterMap;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ScatterMap$MapWrapper$keys$1$iterator$1 scatterMap$MapWrapper$keys$1$iterator$1 = new ScatterMap$MapWrapper$keys$1$iterator$1(this.this$0, continuation);
        scatterMap$MapWrapper$keys$1$iterator$1.L$0 = obj;
        return scatterMap$MapWrapper$keys$1$iterator$1;
    }

    public final Object invoke(SequenceScope<? super K> sequenceScope, Continuation<? super Unit> continuation) {
        return ((ScatterMap$MapWrapper$keys$1$iterator$1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0082, code lost:
        if (r10 >= r11) goto L_0x00cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x008d, code lost:
        if ((255 & r12) >= 128) goto L_0x0091;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x008f, code lost:
        r8 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0091, code lost:
        r8 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0092, code lost:
        if (r8 == false) goto L_0x00c1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0094, code lost:
        r8 = r3[(r14 << 3) + r10];
        r2.L$0 = r0;
        r2.L$1 = r3;
        r2.L$2 = r4;
        r2.I$0 = r15;
        r2.I$1 = r14;
        r2.J$0 = r12;
        r2.I$2 = r11;
        r2.I$3 = r10;
        r21 = r3;
        r2.label = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x00b6, code lost:
        if (r0.yield(r8, r2) != r1) goto L_0x00b9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x00b8, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x00b9, code lost:
        r3 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x00c1, code lost:
        r21 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:21:0x00c3, code lost:
        r12 = r12 >> 8;
        r10 = r10 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00cc, code lost:
        r21 = r3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00d2, code lost:
        if (r11 != 8) goto L_0x00f8;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00d4, code lost:
        r3 = r0;
        r17 = r1;
        r9 = r14;
        r8 = r15;
        r1 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00dd, code lost:
        r1 = r6;
        r6 = r5;
        r5 = r2;
        r2 = r21;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x00e6, code lost:
        if (r9 == r8) goto L_0x00f2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x00e8, code lost:
        r9 = r9 + 1;
        r0 = r2;
        r2 = r5;
        r5 = r6;
        r6 = r1;
        r1 = r20;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00f2, code lost:
        r0 = r2;
        r2 = r5;
        r5 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00f5, code lost:
        r6 = r5;
        r5 = r2;
        r2 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00fb, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:6:0x0054, code lost:
        if (0 <= r8) goto L_0x0056;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:7:0x0056, code lost:
        r10 = r4[r9];
        r12 = r10;
        r21 = r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0069, code lost:
        if (((((~r12) << 7) & r12) & -9187201950435737472L) == -9187201950435737472L) goto L_0x00dd;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x006b, code lost:
        r15 = r8;
        r14 = r9;
        r12 = r10;
        r11 = 8 - ((~(r9 - r8)) >>> 31);
        r10 = 0;
        r0 = r3;
        r3 = r6;
        r1 = r17;
        r6 = r5;
        r5 = r2;
        r2 = r21;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r1 = r20
            int r2 = r1.label
            switch(r2) {
                case 0: goto L_0x003a;
                case 1: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L_0x0013:
            r2 = r20
            r5 = r21
            r6 = 0
            r7 = 0
            r8 = 0
            r9 = 0
            int r10 = r2.I$3
            int r11 = r2.I$2
            long r12 = r2.J$0
            int r14 = r2.I$1
            int r15 = r2.I$0
            java.lang.Object r4 = r2.L$2
            long[] r4 = (long[]) r4
            java.lang.Object r3 = r2.L$1
            java.lang.Object[] r3 = (java.lang.Object[]) r3
            r17 = r0
            java.lang.Object r0 = r2.L$0
            kotlin.sequences.SequenceScope r0 = (kotlin.sequences.SequenceScope) r0
            kotlin.ResultKt.throwOnFailure(r5)
            r1 = r17
            goto L_0x00be
        L_0x003a:
            r17 = r0
            kotlin.ResultKt.throwOnFailure(r21)
            r0 = r20
            r2 = r21
            java.lang.Object r3 = r0.L$0
            kotlin.sequences.SequenceScope r3 = (kotlin.sequences.SequenceScope) r3
            androidx.collection.ScatterMap<K, V> r4 = r0.this$0
            r5 = 0
            java.lang.Object[] r6 = r4.keys
            r7 = 0
            long[] r4 = r4.metadata
            int r8 = r4.length
            int r8 = r8 + -2
            r9 = 0
            if (r9 > r8) goto L_0x00f5
        L_0x0056:
            r10 = r4[r9]
            r12 = r10
            r14 = 0
            r21 = r0
            long r0 = ~r12
            r15 = 7
            long r0 = r0 << r15
            long r0 = r0 & r12
            r18 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r0 = r0 & r18
            int r0 = (r0 > r18 ? 1 : (r0 == r18 ? 0 : -1))
            if (r0 == 0) goto L_0x00dd
            int r0 = r9 - r8
            int r0 = ~r0
            int r0 = r0 >>> 31
            r1 = 8
            int r0 = 8 - r0
            r1 = 0
            r15 = r8
            r14 = r9
            r12 = r10
            r11 = r0
            r10 = r1
            r0 = r3
            r3 = r6
            r1 = r17
            r6 = r5
            r5 = r2
            r2 = r21
        L_0x0082:
            if (r10 >= r11) goto L_0x00cc
            r8 = 255(0xff, double:1.26E-321)
            long r8 = r8 & r12
            r17 = 0
            r18 = 128(0x80, double:6.32E-322)
            int r18 = (r8 > r18 ? 1 : (r8 == r18 ? 0 : -1))
            if (r18 >= 0) goto L_0x0091
            r8 = 1
            goto L_0x0092
        L_0x0091:
            r8 = 0
        L_0x0092:
            if (r8 == 0) goto L_0x00c1
            int r8 = r14 << 3
            int r8 = r8 + r10
            r9 = 0
            r8 = r3[r8]
            r17 = 0
            r2.L$0 = r0
            r2.L$1 = r3
            r2.L$2 = r4
            r2.I$0 = r15
            r2.I$1 = r14
            r2.J$0 = r12
            r2.I$2 = r11
            r2.I$3 = r10
            r21 = r3
            r3 = 1
            r2.label = r3
            java.lang.Object r3 = r0.yield(r8, r2)
            if (r3 != r1) goto L_0x00b9
            return r1
        L_0x00b9:
            r3 = r21
            r8 = r9
            r9 = r17
        L_0x00be:
            goto L_0x00c3
        L_0x00c1:
            r21 = r3
        L_0x00c3:
            r8 = 8
            long r12 = r12 >> r8
            r16 = 1
            int r10 = r10 + 1
            goto L_0x0082
        L_0x00cc:
            r21 = r3
            r8 = 8
            r16 = 1
            if (r11 != r8) goto L_0x00f8
            r3 = r0
            r17 = r1
            r0 = r8
            r9 = r14
            r8 = r15
            r1 = r21
            goto L_0x00e6
        L_0x00dd:
            r0 = 8
            r16 = 1
            r1 = r6
            r6 = r5
            r5 = r2
            r2 = r21
        L_0x00e6:
            if (r9 == r8) goto L_0x00f2
            int r9 = r9 + 1
            r0 = r2
            r2 = r5
            r5 = r6
            r6 = r1
            r1 = r20
            goto L_0x0056
        L_0x00f2:
            r0 = r2
            r2 = r5
            r5 = r6
        L_0x00f5:
            r6 = r5
            r5 = r2
            r2 = r0
        L_0x00f8:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap$MapWrapper$keys$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
