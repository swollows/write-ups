package kotlinx.coroutines.flow;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.BroadcastChannel;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.channels.ReceiveChannel;
import kotlinx.coroutines.flow.internal.ChannelFlowKt;

@Metadata(d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001e\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u0007\u001a\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u001a/\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H@ø\u0001\u0000¢\u0006\u0002\u0010\n\u001a9\u0010\u000b\u001a\u00020\u0007\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\u0006\u0010\f\u001a\u00020\rH@ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000f\u001a&\u0010\u0010\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0006\u0010\u0011\u001a\u00020\u0012H\u0007\u001a\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0005\u0002\u0004\n\u0002\b\u0019¨\u0006\u0014"}, d2 = {"asFlow", "Lkotlinx/coroutines/flow/Flow;", "T", "Lkotlinx/coroutines/channels/BroadcastChannel;", "consumeAsFlow", "Lkotlinx/coroutines/channels/ReceiveChannel;", "emitAll", "", "Lkotlinx/coroutines/flow/FlowCollector;", "channel", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitAllImpl", "consume", "", "emitAllImpl$FlowKt__ChannelsKt", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlinx/coroutines/channels/ReceiveChannel;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "produceIn", "scope", "Lkotlinx/coroutines/CoroutineScope;", "receiveAsFlow", "kotlinx-coroutines-core"}, k = 5, mv = {1, 6, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* compiled from: Channels.kt */
final /* synthetic */ class FlowKt__ChannelsKt {
    public static final <T> Object emitAll(FlowCollector<? super T> $this$emitAll, ReceiveChannel<? extends T> channel, Continuation<? super Unit> $completion) {
        Object emitAllImpl$FlowKt__ChannelsKt = emitAllImpl$FlowKt__ChannelsKt($this$emitAll, channel, true, $completion);
        return emitAllImpl$FlowKt__ChannelsKt == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? emitAllImpl$FlowKt__ChannelsKt : Unit.INSTANCE;
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlinx.coroutines.flow.FlowCollector<? super T>, code=kotlinx.coroutines.flow.FlowCollector, for r7v0, types: [kotlinx.coroutines.flow.FlowCollector, kotlinx.coroutines.flow.FlowCollector<? super T>] */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0065  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0084 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0085  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final <T> java.lang.Object emitAllImpl$FlowKt__ChannelsKt(kotlinx.coroutines.flow.FlowCollector r7, kotlinx.coroutines.channels.ReceiveChannel<? extends T> r8, boolean r9, kotlin.coroutines.Continuation<? super kotlin.Unit> r10) {
        /*
            boolean r0 = r10 instanceof kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            if (r0 == 0) goto L_0x0014
            r0 = r10
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = (kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r10 = r0.label
            int r10 = r10 - r2
            r0.label = r10
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1 r0 = new kotlinx.coroutines.flow.FlowKt__ChannelsKt$emitAllImpl$1
            r0.<init>(r10)
        L_0x0019:
            r10 = r0
            java.lang.Object r0 = r10.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r10.label
            switch(r2) {
                case 0: goto L_0x0065;
                case 1: goto L_0x0047;
                case 2: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L_0x002d:
            boolean r7 = r10.Z$0
            r8 = 0
            java.lang.Object r9 = r10.L$1
            kotlinx.coroutines.channels.ReceiveChannel r9 = (kotlinx.coroutines.channels.ReceiveChannel) r9
            java.lang.Object r2 = r10.L$0
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ all -> 0x0044 }
            r6 = r9
            r9 = r7
            r7 = r2
            r2 = r1
            r1 = r0
            r0 = r10
            r10 = r6
            goto L_0x00c6
        L_0x0044:
            r1 = move-exception
            goto L_0x00d3
        L_0x0047:
            r7 = 0
            boolean r8 = r10.Z$0
            java.lang.Object r9 = r10.L$1
            kotlinx.coroutines.channels.ReceiveChannel r9 = (kotlinx.coroutines.channels.ReceiveChannel) r9
            java.lang.Object r2 = r10.L$0
            kotlinx.coroutines.flow.FlowCollector r2 = (kotlinx.coroutines.flow.FlowCollector) r2
            r3 = 0
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ all -> 0x005e }
            r4 = r0
            kotlinx.coroutines.channels.ChannelResult r4 = (kotlinx.coroutines.channels.ChannelResult) r4     // Catch:{ all -> 0x005e }
            java.lang.Object r4 = r4.m1817unboximpl()     // Catch:{ all -> 0x005e }
            goto L_0x008e
        L_0x005e:
            r1 = move-exception
            r7 = r3
            r6 = r8
            r8 = r7
            r7 = r6
            goto L_0x00d3
        L_0x0065:
            kotlin.ResultKt.throwOnFailure(r0)
            kotlinx.coroutines.flow.FlowKt.ensureActive(r7)
            r2 = 0
            r6 = r10
            r10 = r8
            r8 = r2
            r2 = r1
            r1 = r0
            r0 = r6
        L_0x0072:
            r3 = 0
            r0.L$0 = r7     // Catch:{ all -> 0x00cc }
            r0.L$1 = r10     // Catch:{ all -> 0x00cc }
            r0.Z$0 = r9     // Catch:{ all -> 0x00cc }
            r4 = 1
            r0.label = r4     // Catch:{ all -> 0x00cc }
            java.lang.Object r4 = r10.m1824receiveCatchingJP2dKIU(r0)     // Catch:{ all -> 0x00cc }
            if (r4 != r2) goto L_0x0085
            return r2
        L_0x0085:
            r6 = r2
            r2 = r7
            r7 = r3
            r3 = r8
            r8 = r9
            r9 = r10
            r10 = r0
            r0 = r1
            r1 = r6
        L_0x008e:
            r7 = r3
            r3 = r4
            boolean r4 = kotlinx.coroutines.channels.ChannelResult.m1813isClosedimpl(r3)     // Catch:{ all -> 0x00c7 }
            if (r4 == 0) goto L_0x00aa
            java.lang.Throwable r1 = kotlinx.coroutines.channels.ChannelResult.m1809exceptionOrNullimpl(r3)     // Catch:{ all -> 0x00c7 }
            if (r1 != 0) goto L_0x00a7
            if (r8 == 0) goto L_0x00a3
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r7)
        L_0x00a3:
            kotlin.Unit r7 = kotlin.Unit.INSTANCE
            return r7
        L_0x00a7:
            r3 = 0
            throw r1     // Catch:{ all -> 0x00c7 }
        L_0x00aa:
            java.lang.Object r4 = kotlinx.coroutines.channels.ChannelResult.m1811getOrThrowimpl(r3)     // Catch:{ all -> 0x00c7 }
            r10.L$0 = r2     // Catch:{ all -> 0x00c7 }
            r10.L$1 = r9     // Catch:{ all -> 0x00c7 }
            r10.Z$0 = r8     // Catch:{ all -> 0x00c7 }
            r5 = 2
            r10.label = r5     // Catch:{ all -> 0x00c7 }
            java.lang.Object r4 = r2.emit(r4, r10)     // Catch:{ all -> 0x00c7 }
            if (r4 != r1) goto L_0x00be
            return r1
        L_0x00be:
            r6 = r8
            r8 = r7
            r7 = r2
            r2 = r1
            r1 = r0
            r0 = r10
            r10 = r9
            r9 = r6
        L_0x00c6:
            goto L_0x0072
        L_0x00c7:
            r1 = move-exception
            r6 = r8
            r8 = r7
            r7 = r6
            goto L_0x00d3
        L_0x00cc:
            r7 = move-exception
            r6 = r1
            r1 = r7
            r7 = r9
            r9 = r10
            r10 = r0
            r0 = r6
        L_0x00d3:
            r8 = r1
            throw r1     // Catch:{ all -> 0x00d6 }
        L_0x00d6:
            r1 = move-exception
            if (r7 == 0) goto L_0x00dc
            kotlinx.coroutines.channels.ChannelsKt.cancelConsumed(r9, r8)
        L_0x00dc:
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.FlowKt__ChannelsKt.emitAllImpl$FlowKt__ChannelsKt(kotlinx.coroutines.flow.FlowCollector, kotlinx.coroutines.channels.ReceiveChannel, boolean, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static final <T> Flow<T> receiveAsFlow(ReceiveChannel<? extends T> $this$receiveAsFlow) {
        return new ChannelAsFlow<>($this$receiveAsFlow, false, (CoroutineContext) null, 0, (BufferOverflow) null, 28, (DefaultConstructorMarker) null);
    }

    public static final <T> Flow<T> consumeAsFlow(ReceiveChannel<? extends T> $this$consumeAsFlow) {
        return new ChannelAsFlow<>($this$consumeAsFlow, true, (CoroutineContext) null, 0, (BufferOverflow) null, 28, (DefaultConstructorMarker) null);
    }

    @Deprecated(level = DeprecationLevel.WARNING, message = "'BroadcastChannel' is obsolete and all corresponding operators are deprecated in the favour of StateFlow and SharedFlow")
    public static final <T> Flow<T> asFlow(BroadcastChannel<T> $this$asFlow) {
        return new FlowKt__ChannelsKt$asFlow$$inlined$unsafeFlow$1($this$asFlow);
    }

    public static final <T> ReceiveChannel<T> produceIn(Flow<? extends T> $this$produceIn, CoroutineScope scope) {
        return ChannelFlowKt.asChannelFlow($this$produceIn).produceImpl(scope);
    }
}
