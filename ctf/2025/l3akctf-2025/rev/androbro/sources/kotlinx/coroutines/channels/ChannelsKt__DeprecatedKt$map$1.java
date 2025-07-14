package kotlinx.coroutines.channels;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\b\u0012\u0004\u0012\u0002H\u00030\u0004H@"}, d2 = {"<anonymous>", "", "E", "R", "Lkotlinx/coroutines/channels/ProducerScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1", f = "Deprecated.kt", i = {0, 0, 1, 1, 2, 2}, l = {487, 333, 333}, m = "invokeSuspend", n = {"$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv", "$this$produce", "$this$consume$iv$iv"}, s = {"L$0", "L$2", "L$0", "L$2", "L$0", "L$2"})
/* compiled from: Deprecated.kt */
final class ChannelsKt__DeprecatedKt$map$1 extends SuspendLambda implements Function2<ProducerScope<? super R>, Continuation<? super Unit>, Object> {
    final /* synthetic */ ReceiveChannel<E> $this_map;
    final /* synthetic */ Function2<E, Continuation<? super R>, Object> $transform;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChannelsKt__DeprecatedKt$map$1(ReceiveChannel<? extends E> receiveChannel, Function2<? super E, ? super Continuation<? super R>, ? extends Object> function2, Continuation<? super ChannelsKt__DeprecatedKt$map$1> continuation) {
        super(2, continuation);
        this.$this_map = receiveChannel;
        this.$transform = function2;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChannelsKt__DeprecatedKt$map$1 channelsKt__DeprecatedKt$map$1 = new ChannelsKt__DeprecatedKt$map$1(this.$this_map, this.$transform, continuation);
        channelsKt__DeprecatedKt$map$1.L$0 = obj;
        return channelsKt__DeprecatedKt$map$1;
    }

    public final Object invoke(ProducerScope<? super R> producerScope, Continuation<? super Unit> continuation) {
        return ((ChannelsKt__DeprecatedKt$map$1) create(producerScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r8v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r10v10, resolved type: kotlinx.coroutines.channels.ReceiveChannel<E>} */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x00a9, code lost:
        r2.L$0 = r4;
        r2.L$1 = r8;
        r2.L$2 = r10;
        r2.L$3 = r12;
        r2.label = 1;
        r11 = r12.hasNext(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x00b8, code lost:
        if (r11 != r0) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x00ba, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x00bb, code lost:
        r16 = r4;
        r4 = r3;
        r3 = r11;
        r11 = r10;
        r10 = r9;
        r9 = r8;
        r8 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00ca, code lost:
        if (((java.lang.Boolean) r3).booleanValue() == false) goto L_0x010f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00cc, code lost:
        r3 = r12.next();
        r13 = 0;
        r2.L$0 = r8;
        r2.L$1 = r9;
        r2.L$2 = r11;
        r2.L$3 = r12;
        r2.L$4 = r8;
        r2.label = 2;
        r14 = r9.invoke(r3, r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00e2, code lost:
        if (r14 != r0) goto L_0x00e5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00e4, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:0x00e5, code lost:
        r3 = r14;
        r14 = r8;
        r16 = r12;
        r12 = r9;
        r9 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00ec, code lost:
        r2.L$0 = r14;
        r2.L$1 = r12;
        r2.L$2 = r11;
        r2.L$3 = r9;
        r2.L$4 = null;
        r2.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fe, code lost:
        if (r8.send(r3, r2) != r0) goto L_0x0101;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0100, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x0101, code lost:
        r3 = r4;
        r8 = r7;
        r7 = r13;
        r4 = r14;
        r16 = r12;
        r12 = r9;
        r9 = r10;
        r10 = r11;
        r11 = r16;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x010c, code lost:
        r7 = r8;
        r8 = r11;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x010f, code lost:
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x0112, code lost:
        kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r11, r10);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0119, code lost:
        return kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x011a, code lost:
        r0 = th;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x011b, code lost:
        r3 = r4;
        r4 = r7;
        r9 = r10;
        r10 = r11;
     */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            r1 = r17
            int r2 = r1.label
            switch(r2) {
                case 0: goto L_0x008c;
                case 1: goto L_0x0062;
                case 2: goto L_0x0037;
                case 3: goto L_0x0013;
                default: goto L_0x000b;
            }
        L_0x000b:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r2)
            throw r0
        L_0x0013:
            r2 = r17
            r3 = r18
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.Object r8 = r2.L$3
            kotlinx.coroutines.channels.ChannelIterator r8 = (kotlinx.coroutines.channels.ChannelIterator) r8
            r9 = 0
            java.lang.Object r10 = r2.L$2
            kotlinx.coroutines.channels.ReceiveChannel r10 = (kotlinx.coroutines.channels.ReceiveChannel) r10
            java.lang.Object r11 = r2.L$1
            kotlin.jvm.functions.Function2 r11 = (kotlin.jvm.functions.Function2) r11
            java.lang.Object r12 = r2.L$0
            kotlinx.coroutines.channels.ProducerScope r12 = (kotlinx.coroutines.channels.ProducerScope) r12
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ all -> 0x0089 }
            r16 = r8
            r8 = r4
            r4 = r12
            r12 = r16
            goto L_0x010c
        L_0x0037:
            r2 = r17
            r3 = r18
            r4 = 0
            r5 = 0
            r6 = 0
            r7 = 0
            java.lang.Object r8 = r2.L$4
            kotlinx.coroutines.channels.ProducerScope r8 = (kotlinx.coroutines.channels.ProducerScope) r8
            java.lang.Object r9 = r2.L$3
            kotlinx.coroutines.channels.ChannelIterator r9 = (kotlinx.coroutines.channels.ChannelIterator) r9
            r10 = 0
            java.lang.Object r11 = r2.L$2
            kotlinx.coroutines.channels.ReceiveChannel r11 = (kotlinx.coroutines.channels.ReceiveChannel) r11
            java.lang.Object r12 = r2.L$1
            kotlin.jvm.functions.Function2 r12 = (kotlin.jvm.functions.Function2) r12
            java.lang.Object r13 = r2.L$0
            kotlinx.coroutines.channels.ProducerScope r13 = (kotlinx.coroutines.channels.ProducerScope) r13
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ all -> 0x005d }
            r14 = r13
            r13 = r7
            r7 = r4
            r4 = r3
            goto L_0x00ec
        L_0x005d:
            r0 = move-exception
            r9 = r10
            r10 = r11
            goto L_0x0122
        L_0x0062:
            r2 = r17
            r3 = r18
            r4 = 0
            r5 = 0
            r6 = 0
            java.lang.Object r7 = r2.L$3
            kotlinx.coroutines.channels.ChannelIterator r7 = (kotlinx.coroutines.channels.ChannelIterator) r7
            r9 = 0
            java.lang.Object r8 = r2.L$2
            r10 = r8
            kotlinx.coroutines.channels.ReceiveChannel r10 = (kotlinx.coroutines.channels.ReceiveChannel) r10
            java.lang.Object r8 = r2.L$1
            kotlin.jvm.functions.Function2 r8 = (kotlin.jvm.functions.Function2) r8
            java.lang.Object r11 = r2.L$0
            kotlinx.coroutines.channels.ProducerScope r11 = (kotlinx.coroutines.channels.ProducerScope) r11
            kotlin.ResultKt.throwOnFailure(r3)     // Catch:{ all -> 0x0089 }
            r12 = r7
            r7 = r4
            r4 = r3
            r16 = r9
            r9 = r8
            r8 = r11
            r11 = r10
            r10 = r16
            goto L_0x00c4
        L_0x0089:
            r0 = move-exception
            goto L_0x0122
        L_0x008c:
            kotlin.ResultKt.throwOnFailure(r18)
            r2 = r17
            r3 = r18
            java.lang.Object r4 = r2.L$0
            kotlinx.coroutines.channels.ProducerScope r4 = (kotlinx.coroutines.channels.ProducerScope) r4
            kotlinx.coroutines.channels.ReceiveChannel<E> r5 = r2.$this_map
            kotlin.jvm.functions.Function2<E, kotlin.coroutines.Continuation<? super R>, java.lang.Object> r6 = r2.$transform
            r7 = 0
            r10 = r5
            r5 = 0
            r9 = 0
            r8 = r10
            r11 = 0
            kotlinx.coroutines.channels.ChannelIterator r12 = r8.iterator()     // Catch:{ all -> 0x0120 }
            r8 = r6
            r6 = r11
        L_0x00a9:
            r2.L$0 = r4     // Catch:{ all -> 0x0120 }
            r2.L$1 = r8     // Catch:{ all -> 0x0120 }
            r2.L$2 = r10     // Catch:{ all -> 0x0120 }
            r2.L$3 = r12     // Catch:{ all -> 0x0120 }
            r11 = 1
            r2.label = r11     // Catch:{ all -> 0x0120 }
            java.lang.Object r11 = r12.hasNext(r2)     // Catch:{ all -> 0x0120 }
            if (r11 != r0) goto L_0x00bb
            return r0
        L_0x00bb:
            r16 = r4
            r4 = r3
            r3 = r11
            r11 = r10
            r10 = r9
            r9 = r8
            r8 = r16
        L_0x00c4:
            java.lang.Boolean r3 = (java.lang.Boolean) r3     // Catch:{ all -> 0x011a }
            boolean r3 = r3.booleanValue()     // Catch:{ all -> 0x011a }
            if (r3 == 0) goto L_0x010f
            java.lang.Object r3 = r12.next()     // Catch:{ all -> 0x011a }
            r13 = 0
            r2.L$0 = r8     // Catch:{ all -> 0x011a }
            r2.L$1 = r9     // Catch:{ all -> 0x011a }
            r2.L$2 = r11     // Catch:{ all -> 0x011a }
            r2.L$3 = r12     // Catch:{ all -> 0x011a }
            r2.L$4 = r8     // Catch:{ all -> 0x011a }
            r14 = 2
            r2.label = r14     // Catch:{ all -> 0x011a }
            java.lang.Object r14 = r9.invoke(r3, r2)     // Catch:{ all -> 0x011a }
            if (r14 != r0) goto L_0x00e5
            return r0
        L_0x00e5:
            r3 = r14
            r14 = r8
            r16 = r12
            r12 = r9
            r9 = r16
        L_0x00ec:
            r2.L$0 = r14     // Catch:{ all -> 0x011a }
            r2.L$1 = r12     // Catch:{ all -> 0x011a }
            r2.L$2 = r11     // Catch:{ all -> 0x011a }
            r2.L$3 = r9     // Catch:{ all -> 0x011a }
            r15 = 0
            r2.L$4 = r15     // Catch:{ all -> 0x011a }
            r15 = 3
            r2.label = r15     // Catch:{ all -> 0x011a }
            java.lang.Object r3 = r8.send(r3, r2)     // Catch:{ all -> 0x011a }
            if (r3 != r0) goto L_0x0101
            return r0
        L_0x0101:
            r3 = r4
            r8 = r7
            r7 = r13
            r4 = r14
            r16 = r12
            r12 = r9
            r9 = r10
            r10 = r11
            r11 = r16
        L_0x010c:
            r7 = r8
            r8 = r11
            goto L_0x00a9
        L_0x010f:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x011a }
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r11, r10)
            kotlin.Unit r0 = kotlin.Unit.INSTANCE
            return r0
        L_0x011a:
            r0 = move-exception
            r3 = r4
            r4 = r7
            r9 = r10
            r10 = r11
            goto L_0x0122
        L_0x0120:
            r0 = move-exception
            r4 = r7
        L_0x0122:
            r6 = r0
            throw r0     // Catch:{ all -> 0x0125 }
        L_0x0125:
            r0 = move-exception
            r7 = r0
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r10, r6)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.channels.ChannelsKt__DeprecatedKt$map$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
