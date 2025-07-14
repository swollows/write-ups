package kotlinx.coroutines.flow.internal;

import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0003*\u00020\u0004H@"}, d2 = {"<anonymous>", "", "T", "R", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 6, 0}, xi = 48)
@DebugMetadata(c = "kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3", f = "Merge.kt", i = {}, l = {27}, m = "invokeSuspend", n = {}, s = {})
/* compiled from: Merge.kt */
final class ChannelFlowTransformLatest$flowCollect$3 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ FlowCollector<R> $collector;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ChannelFlowTransformLatest<T, R> this$0;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    ChannelFlowTransformLatest$flowCollect$3(ChannelFlowTransformLatest<T, R> channelFlowTransformLatest, FlowCollector<? super R> flowCollector, Continuation<? super ChannelFlowTransformLatest$flowCollect$3> continuation) {
        super(2, continuation);
        this.this$0 = channelFlowTransformLatest;
        this.$collector = flowCollector;
    }

    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        ChannelFlowTransformLatest$flowCollect$3 channelFlowTransformLatest$flowCollect$3 = new ChannelFlowTransformLatest$flowCollect$3(this.this$0, this.$collector, continuation);
        channelFlowTransformLatest$flowCollect$3.L$0 = obj;
        return channelFlowTransformLatest$flowCollect$3;
    }

    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ChannelFlowTransformLatest$flowCollect$3) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    public final Object invokeSuspend(Object $result) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure($result);
                final CoroutineScope $this$coroutineScope = (CoroutineScope) this.L$0;
                final Ref.ObjectRef previousFlow = new Ref.ObjectRef();
                Flow flow = this.this$0.flow;
                final ChannelFlowTransformLatest<T, R> channelFlowTransformLatest = this.this$0;
                final FlowCollector<R> flowCollector = this.$collector;
                this.label = 1;
                if (flow.collect(new FlowCollector() {
                    /* JADX WARNING: Can't fix incorrect switch cases order */
                    /* JADX WARNING: Incorrect type for immutable var: ssa=T, code=java.lang.Object, for r10v0, types: [T, java.lang.Object] */
                    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
                    /* JADX WARNING: Removed duplicated region for block: B:11:0x003c  */
                    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.lang.Object emit(final java.lang.Object r10, kotlin.coroutines.Continuation<? super kotlin.Unit> r11) {
                        /*
                            r9 = this;
                            boolean r0 = r11 instanceof kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
                            if (r0 == 0) goto L_0x0014
                            r0 = r11
                            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r1 = r1 & r2
                            if (r1 == 0) goto L_0x0014
                            int r11 = r0.label
                            int r11 = r11 - r2
                            r0.label = r11
                            goto L_0x0019
                        L_0x0014:
                            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1 r0 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$emit$1
                            r0.<init>(r9, r11)
                        L_0x0019:
                            r11 = r0
                            java.lang.Object r0 = r11.result
                            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                            int r2 = r11.label
                            switch(r2) {
                                case 0: goto L_0x003c;
                                case 1: goto L_0x002d;
                                default: goto L_0x0025;
                            }
                        L_0x0025:
                            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                            r10.<init>(r11)
                            throw r10
                        L_0x002d:
                            r10 = 0
                            java.lang.Object r1 = r11.L$2
                            kotlinx.coroutines.Job r1 = (kotlinx.coroutines.Job) r1
                            java.lang.Object r1 = r11.L$1
                            java.lang.Object r2 = r11.L$0
                            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1 r2 = (kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.AnonymousClass1) r2
                            kotlin.ResultKt.throwOnFailure(r0)
                            goto L_0x0066
                        L_0x003c:
                            kotlin.ResultKt.throwOnFailure(r0)
                            r2 = r9
                            kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.Job> r3 = r3
                            T r3 = r3.element
                            kotlinx.coroutines.Job r3 = (kotlinx.coroutines.Job) r3
                            if (r3 == 0) goto L_0x0068
                            r4 = r3
                            r5 = 0
                            kotlinx.coroutines.flow.internal.ChildCancelledException r6 = new kotlinx.coroutines.flow.internal.ChildCancelledException
                            r6.<init>()
                            java.util.concurrent.CancellationException r6 = (java.util.concurrent.CancellationException) r6
                            r4.cancel((java.util.concurrent.CancellationException) r6)
                            r11.L$0 = r2
                            r11.L$1 = r10
                            r11.L$2 = r3
                            r3 = 1
                            r11.label = r3
                            java.lang.Object r3 = r4.join(r11)
                            if (r3 != r1) goto L_0x0064
                            return r1
                        L_0x0064:
                            r1 = r10
                            r10 = r5
                        L_0x0066:
                            r10 = r1
                        L_0x0068:
                            kotlin.jvm.internal.Ref$ObjectRef<kotlinx.coroutines.Job> r1 = r3
                            kotlinx.coroutines.CoroutineScope r3 = r2
                            kotlinx.coroutines.CoroutineStart r5 = kotlinx.coroutines.CoroutineStart.UNDISPATCHED
                            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2 r4 = new kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3$1$2
                            kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest<T, R> r6 = r6
                            kotlinx.coroutines.flow.FlowCollector<R> r7 = r7
                            r8 = 0
                            r4.<init>(r6, r7, r10, r8)
                            r6 = r4
                            kotlin.jvm.functions.Function2 r6 = (kotlin.jvm.functions.Function2) r6
                            r7 = 1
                            r4 = 0
                            kotlinx.coroutines.Job r3 = kotlinx.coroutines.BuildersKt__Builders_commonKt.launch$default(r3, r4, r5, r6, r7, r8)
                            r1.element = r3
                            kotlin.Unit r1 = kotlin.Unit.INSTANCE
                            return r1
                        */
                        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest$flowCollect$3.AnonymousClass1.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                    }
                }, this) != coroutine_suspended) {
                    break;
                } else {
                    return coroutine_suspended;
                }
            case 1:
                ResultKt.throwOnFailure($result);
                break;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return Unit.INSTANCE;
    }
}
