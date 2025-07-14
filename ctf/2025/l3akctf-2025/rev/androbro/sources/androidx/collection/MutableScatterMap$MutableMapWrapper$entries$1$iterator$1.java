package androidx.collection;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.markers.KMutableIterator;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

@Metadata(d1 = {"\u0000-\n\u0000\n\u0002\u0010)\n\u0002\u0010'\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010(\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\u0001J\t\u0010\u000f\u001a\u00020\u0010H\u0002J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0002H\u0002J\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u001a\u0010\u0003\u001a\u00020\u0004X\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR,\u0010\t\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00020\nX\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e¨\u0006\u0014"}, d2 = {"androidx/collection/MutableScatterMap$MutableMapWrapper$entries$1$iterator$1", "", "", "current", "", "getCurrent", "()I", "setCurrent", "(I)V", "iterator", "", "getIterator", "()Ljava/util/Iterator;", "setIterator", "(Ljava/util/Iterator;)V", "hasNext", "", "next", "remove", "", "collection"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* compiled from: ScatterMap.kt */
public final class MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 implements Iterator<Map.Entry<K, V>>, KMutableIterator {
    private int current = -1;
    private Iterator<? extends Map.Entry<K, V>> iterator;
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    MutableScatterMap$MutableMapWrapper$entries$1$iterator$1(final MutableScatterMap<K, V> $receiver) {
        this.this$0 = $receiver;
        this.iterator = SequencesKt.iterator(new AnonymousClass1((Continuation<? super AnonymousClass1>) null));
    }

    public final Iterator<Map.Entry<K, V>> getIterator() {
        return this.iterator;
    }

    public final void setIterator(Iterator<? extends Map.Entry<K, V>> it) {
        Intrinsics.checkNotNullParameter(it, "<set-?>");
        this.iterator = it;
    }

    public final int getCurrent() {
        return this.current;
    }

    public final void setCurrent(int i) {
        this.current = i;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010'\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u00050\u0004H@"}, d2 = {"<anonymous>", "", "K", "V", "Lkotlin/sequences/SequenceScope;", ""}, k = 3, mv = {1, 8, 0}, xi = 48)
    @DebugMetadata(c = "androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1", f = "ScatterMap.kt", i = {0, 0, 0, 0, 0, 0, 0}, l = {1328}, m = "invokeSuspend", n = {"$this$iterator", "m$iv", "lastIndex$iv", "i$iv", "slot$iv", "bitCount$iv", "j$iv"}, s = {"L$0", "L$3", "I$0", "I$1", "J$0", "I$2", "I$3"})
    /* renamed from: androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1$1  reason: invalid class name */
    /* compiled from: ScatterMap.kt */
    static final class AnonymousClass1 extends RestrictedSuspendLambda implements Function2<SequenceScope<? super Map.Entry<K, V>>, Continuation<? super Unit>, Object> {
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

        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            AnonymousClass1 r0 = new AnonymousClass1($receiver, this, continuation);
            r0.L$0 = obj;
            return r0;
        }

        public final Object invoke(SequenceScope<? super Map.Entry<K, V>> sequenceScope, Continuation<? super Unit> continuation) {
            return ((AnonymousClass1) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0085, code lost:
            if (r8 >= r9) goto L_0x00e3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:12:0x0090, code lost:
            if ((r10 & 255) >= 128) goto L_0x0094;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x0092, code lost:
            r7 = true;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0094, code lost:
            r7 = false;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:15:0x0095, code lost:
            if (r7 == false) goto L_0x00d6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x0097, code lost:
            r4.setCurrent((r12 << 3) + r8);
            r24 = r5;
            r17 = r6;
            r1 = new androidx.collection.MutableMapEntry(r15.keys, r15.values, r4.getCurrent());
            r2.L$0 = r3;
            r2.L$1 = r4;
            r2.L$2 = r15;
            r2.L$3 = r14;
            r2.I$0 = r13;
            r2.I$1 = r12;
            r2.J$0 = r10;
            r2.I$2 = r9;
            r2.I$3 = r8;
            r2.label = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:17:0x00cc, code lost:
            if (r3.yield(r1, r2) != r0) goto L_0x00cf;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:18:0x00ce, code lost:
            return r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:19:0x00cf, code lost:
            r5 = r24;
            r6 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:20:0x00d6, code lost:
            r24 = r5;
            r17 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:21:0x00da, code lost:
            r10 = r10 >> 8;
            r8 = r8 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:22:0x00e3, code lost:
            r24 = r5;
            r17 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:23:0x00eb, code lost:
            if (r9 != 8) goto L_0x00f8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ed, code lost:
            r6 = r4;
            r10 = r12;
            r9 = r13;
            r5 = r14;
            r7 = r15;
            r8 = r17;
            r4 = r3;
            r3 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:25:0x00f8, code lost:
            r5 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:26:0x00fb, code lost:
            r0 = r24;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:27:0x0101, code lost:
            if (r10 == r9) goto L_0x0109;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:28:0x0103, code lost:
            r10 = r10 + 1;
            r1 = r23;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:29:0x0109, code lost:
            r5 = r3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:31:0x010c, code lost:
            return kotlin.Unit.INSTANCE;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:6:0x0052, code lost:
            if (0 <= r9) goto L_0x0054;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:7:0x0054, code lost:
            r11 = r5[r10];
            r13 = r11;
            r24 = r0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:8:0x0069, code lost:
            if (((((~r13) << 7) & r13) & -9187201950435737472L) == -9187201950435737472L) goto L_0x00fb;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:9:0x006b, code lost:
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
                androidx.collection.MutableScatterMap r15 = (androidx.collection.MutableScatterMap) r15
                java.lang.Object r4 = r2.L$1
                androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1 r4 = (androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1) r4
                java.lang.Object r3 = r2.L$0
                kotlin.sequences.SequenceScope r3 = (kotlin.sequences.SequenceScope) r3
                kotlin.ResultKt.throwOnFailure(r5)
                goto L_0x00d5
            L_0x0038:
                kotlin.ResultKt.throwOnFailure(r24)
                r2 = r23
                r3 = r24
                java.lang.Object r4 = r2.L$0
                kotlin.sequences.SequenceScope r4 = (kotlin.sequences.SequenceScope) r4
                androidx.collection.MutableScatterMap<K, V> r5 = r3
                androidx.collection.ScatterMap r5 = (androidx.collection.ScatterMap) r5
                androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1<K, V> r6 = r2
                androidx.collection.MutableScatterMap<K, V> r7 = r3
                r8 = 0
                long[] r5 = r5.metadata
                int r9 = r5.length
                int r9 = r9 + -2
                r10 = 0
                if (r10 > r9) goto L_0x0109
            L_0x0054:
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
                if (r0 == 0) goto L_0x00fb
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
            L_0x0085:
                if (r8 >= r9) goto L_0x00e3
                r17 = 255(0xff, double:1.26E-321)
                long r17 = r10 & r17
                r1 = 0
                r19 = 128(0x80, double:6.32E-322)
                int r7 = (r17 > r19 ? 1 : (r17 == r19 ? 0 : -1))
                if (r7 >= 0) goto L_0x0094
                r7 = 1
                goto L_0x0095
            L_0x0094:
                r7 = 0
            L_0x0095:
                if (r7 == 0) goto L_0x00d6
                int r1 = r12 << 3
                int r1 = r1 + r8
                r7 = 0
                r4.setCurrent(r1)
                androidx.collection.MutableMapEntry r1 = new androidx.collection.MutableMapEntry
                r24 = r5
                java.lang.Object[] r5 = r15.keys
                r17 = r6
                java.lang.Object[] r6 = r15.values
                r18 = r7
                int r7 = r4.getCurrent()
                r1.<init>(r5, r6, r7)
                r2.L$0 = r3
                r2.L$1 = r4
                r2.L$2 = r15
                r2.L$3 = r14
                r2.I$0 = r13
                r2.I$1 = r12
                r2.J$0 = r10
                r2.I$2 = r9
                r2.I$3 = r8
                r5 = 1
                r2.label = r5
                java.lang.Object r1 = r3.yield(r1, r2)
                if (r1 != r0) goto L_0x00cf
                return r0
            L_0x00cf:
                r5 = r24
                r6 = r17
                r7 = r18
            L_0x00d5:
                goto L_0x00da
            L_0x00d6:
                r24 = r5
                r17 = r6
            L_0x00da:
                r1 = 8
                long r10 = r10 >> r1
                r16 = 1
                int r8 = r8 + 1
                goto L_0x0085
            L_0x00e3:
                r24 = r5
                r17 = r6
                r1 = 8
                r16 = 1
                if (r9 != r1) goto L_0x00f8
                r6 = r4
                r10 = r12
                r9 = r13
                r5 = r14
                r7 = r15
                r8 = r17
                r4 = r3
                r3 = r24
                goto L_0x0101
            L_0x00f8:
                r5 = r24
                goto L_0x010a
            L_0x00fb:
                r1 = 8
                r16 = 1
                r0 = r24
            L_0x0101:
                if (r10 == r9) goto L_0x0109
                int r10 = r10 + 1
                r1 = r23
                goto L_0x0054
            L_0x0109:
                r5 = r3
            L_0x010a:
                kotlin.Unit r0 = kotlin.Unit.INSTANCE
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.collection.MutableScatterMap$MutableMapWrapper$entries$1$iterator$1.AnonymousClass1.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public boolean hasNext() {
        return this.iterator.hasNext();
    }

    public Map.Entry<K, V> next() {
        return (Map.Entry) this.iterator.next();
    }

    public void remove() {
        if (this.current != -1) {
            this.this$0.removeValueAt(this.current);
            this.current = -1;
        }
    }
}
