package kotlinx.coroutines.flow;

import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.internal.AbstractSharedFlow;
import kotlinx.coroutines.flow.internal.FusibleFlow;
import kotlinx.coroutines.flow.internal.NullSurrogateKt;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00020\u0010062\b\u0012\u0004\u0012\u00028\u0000072\b\u0012\u0004\u0012\u00028\u0000082\b\u0012\u0004\u0012\u00028\u000009B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J!\u0010\t\u001a\u00020\b2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006H@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00028\u00002\u0006\u0010\f\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00152\u0006\u0010\u0014\u001a\u00020\u0013H\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\u001b\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00028\u0000H@ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ-\u0010\"\u001a\b\u0012\u0004\u0012\u00028\u00000!2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00132\u0006\u0010 \u001a\u00020\u001fH\u0016¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\u0019H\u0016¢\u0006\u0004\b$\u0010%J\u0017\u0010&\u001a\u00020\r2\u0006\u0010\u0018\u001a\u00028\u0000H\u0016¢\u0006\u0004\b&\u0010'J!\u0010*\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u00022\u0006\u0010)\u001a\u00020\u0002H\u0002¢\u0006\u0004\b*\u0010\u000fR\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00028\u00000+8VX\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0016\u0010/\u001a\u00020\u00138\u0002@\u0002X\u000e¢\u0006\u0006\n\u0004\b/\u00100R*\u0010\u0018\u001a\u00028\u00002\u0006\u0010\u0018\u001a\u00028\u00008V@VX\u000e¢\u0006\u0012\u0012\u0004\b4\u0010%\u001a\u0004\b1\u00102\"\u0004\b3\u0010\u0005\u0002\u0004\n\u0002\b\u0019¨\u00065"}, d2 = {"Lkotlinx/coroutines/flow/StateFlowImpl;", "T", "", "initialState", "<init>", "(Ljava/lang/Object;)V", "Lkotlinx/coroutines/flow/FlowCollector;", "collector", "", "collect", "(Lkotlinx/coroutines/flow/FlowCollector;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "expect", "update", "", "compareAndSet", "(Ljava/lang/Object;Ljava/lang/Object;)Z", "Lkotlinx/coroutines/flow/StateFlowSlot;", "createSlot", "()Lkotlinx/coroutines/flow/StateFlowSlot;", "", "size", "", "createSlotArray", "(I)[Lkotlinx/coroutines/flow/StateFlowSlot;", "value", "", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlin/coroutines/CoroutineContext;", "context", "capacity", "Lkotlinx/coroutines/channels/BufferOverflow;", "onBufferOverflow", "Lkotlinx/coroutines/flow/Flow;", "fuse", "(Lkotlin/coroutines/CoroutineContext;ILkotlinx/coroutines/channels/BufferOverflow;)Lkotlinx/coroutines/flow/Flow;", "resetReplayCache", "()V", "tryEmit", "(Ljava/lang/Object;)Z", "expectedState", "newState", "updateState", "", "getReplayCache", "()Ljava/util/List;", "replayCache", "sequence", "I", "getValue", "()Ljava/lang/Object;", "setValue", "getValue$annotations", "kotlinx-coroutines-core", "Lkotlinx/coroutines/flow/internal/AbstractSharedFlow;", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lkotlinx/coroutines/flow/CancellableFlow;", "Lkotlinx/coroutines/flow/internal/FusibleFlow;"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* compiled from: StateFlow.kt */
final class StateFlowImpl<T> extends AbstractSharedFlow<StateFlowSlot> implements MutableStateFlow<T>, CancellableFlow<T>, FusibleFlow<T> {
    private volatile /* synthetic */ Object _state;
    private int sequence;

    public static /* synthetic */ void getValue$annotations() {
    }

    public StateFlowImpl(Object initialState) {
        this._state = initialState;
    }

    public T getValue() {
        Object this_$iv = NullSurrogateKt.NULL;
        Object value$iv = this._state;
        if (value$iv == this_$iv) {
            return null;
        }
        return value$iv;
    }

    public void setValue(T value) {
        updateState((Object) null, value == null ? NullSurrogateKt.NULL : value);
    }

    public boolean compareAndSet(T expect, T update) {
        return updateState(expect == null ? NullSurrogateKt.NULL : expect, update == null ? NullSurrogateKt.NULL : update);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0036, code lost:
        r2 = (kotlinx.coroutines.flow.StateFlowSlot[]) r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x003a, code lost:
        if (r2 == null) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:23:0x003c, code lost:
        r4 = r2.length;
        r6 = 0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x003f, code lost:
        if (r6 >= r4) goto L_0x004f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0041, code lost:
        r9 = r2[r6];
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0045, code lost:
        if (r9 == null) goto L_0x004a;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0047, code lost:
        r9.makePending();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x004a, code lost:
        r6 = r6 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0050, code lost:
        monitor-enter(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0054, code lost:
        if (r11.sequence != r0) goto L_0x005d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0056, code lost:
        r11.sequence = r0 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x005b, code lost:
        monitor-exit(r11);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x005c, code lost:
        return true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:?, code lost:
        r0 = r11.sequence;
        r1 = getSlots();
        r3 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x0068, code lost:
        monitor-exit(r11);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final boolean updateState(java.lang.Object r12, java.lang.Object r13) {
        /*
            r11 = this;
            r0 = 0
            r1 = 0
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r1 = r11.getSlots()
            r2 = 0
            monitor-enter(r11)
            r3 = 0
            java.lang.Object r4 = r11._state     // Catch:{ all -> 0x0075 }
            r5 = 0
            if (r12 == 0) goto L_0x0016
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r12)     // Catch:{ all -> 0x0075 }
            if (r6 != 0) goto L_0x0016
            monitor-exit(r11)
            return r5
        L_0x0016:
            boolean r6 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r13)     // Catch:{ all -> 0x0075 }
            r7 = 1
            if (r6 == 0) goto L_0x001f
            monitor-exit(r11)
            return r7
        L_0x001f:
            r11._state = r13     // Catch:{ all -> 0x0075 }
            int r6 = r11.sequence     // Catch:{ all -> 0x0075 }
            r0 = r6
            r6 = r0 & 1
            if (r6 != 0) goto L_0x006e
            int r0 = r0 + 1
            r11.sequence = r0     // Catch:{ all -> 0x0075 }
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r6 = r11.getSlots()     // Catch:{ all -> 0x0075 }
            r1 = r6
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x0075 }
            monitor-exit(r11)
        L_0x0036:
            r2 = r1
            kotlinx.coroutines.flow.StateFlowSlot[] r2 = (kotlinx.coroutines.flow.StateFlowSlot[]) r2
            if (r2 == 0) goto L_0x004f
            r3 = 0
            int r4 = r2.length
            r6 = r5
        L_0x003f:
            if (r6 >= r4) goto L_0x004e
            r8 = r2[r6]
            r9 = r8
            r10 = 0
            if (r9 == 0) goto L_0x004a
            r9.makePending()
        L_0x004a:
            int r6 = r6 + 1
            goto L_0x003f
        L_0x004e:
        L_0x004f:
            r2 = 0
            monitor-enter(r11)
            r3 = 0
            int r4 = r11.sequence     // Catch:{ all -> 0x006b }
            if (r4 != r0) goto L_0x005d
            int r4 = r0 + 1
            r11.sequence = r4     // Catch:{ all -> 0x006b }
            monitor-exit(r11)
            return r7
        L_0x005d:
            int r4 = r11.sequence     // Catch:{ all -> 0x006b }
            r0 = r4
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot[] r4 = r11.getSlots()     // Catch:{ all -> 0x006b }
            r1 = r4
            kotlin.Unit r3 = kotlin.Unit.INSTANCE     // Catch:{ all -> 0x006b }
            monitor-exit(r11)
            goto L_0x0036
        L_0x006b:
            r3 = move-exception
            monitor-exit(r11)
            throw r3
        L_0x006e:
            int r5 = r0 + 2
            r11.sequence = r5     // Catch:{ all -> 0x0075 }
            monitor-exit(r11)
            return r7
        L_0x0075:
            r3 = move-exception
            monitor-exit(r11)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.updateState(java.lang.Object, java.lang.Object):boolean");
    }

    public List<T> getReplayCache() {
        return CollectionsKt.listOf(getValue());
    }

    public boolean tryEmit(T value) {
        setValue(value);
        return true;
    }

    public Object emit(T value, Continuation<? super Unit> $completion) {
        setValue(value);
        return Unit.INSTANCE;
    }

    public void resetReplayCache() {
        throw new UnsupportedOperationException("MutableStateFlow.resetReplayCache is not supported");
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r11v9, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v7, resolved type: kotlinx.coroutines.flow.StateFlowSlot} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v14, resolved type: java.lang.Object} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r5v6, resolved type: kotlinx.coroutines.flow.StateFlowImpl} */
    /* JADX WARNING: type inference failed for: r2v9, types: [kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot] */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0094, code lost:
        r2 = (kotlinx.coroutines.Job) r12.getContext().get(kotlinx.coroutines.Job.Key);
        r4 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x00a4, code lost:
        r6 = r5._state;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x00a7, code lost:
        if (r2 == null) goto L_0x00ac;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:30:0x00a9, code lost:
        kotlinx.coroutines.JobKt.ensureActive(r2);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:31:0x00ac, code lost:
        if (r4 == null) goto L_0x00b4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x00b2, code lost:
        if (kotlin.jvm.internal.Intrinsics.areEqual(r4, r6) != false) goto L_0x00d7;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b7, code lost:
        if (r6 != kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL) goto L_0x00bb;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00b9, code lost:
        r8 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bb, code lost:
        r8 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bc, code lost:
        r12.L$0 = r5;
        r12.L$1 = r11;
        r12.L$2 = r3;
        r12.L$3 = r2;
        r12.L$4 = r6;
        r12.label = 2;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00cd, code lost:
        if (r11.emit(r8, r12) != r1) goto L_0x00d0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:40:0x00cf, code lost:
        return r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:41:0x00d0, code lost:
        r4 = r11;
        r11 = r6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:42:0x00d2, code lost:
        r9 = r4;
        r4 = r11;
        r11 = r9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:44:0x00db, code lost:
        if (r3.takePending() != false) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00dd, code lost:
        r12.L$0 = r5;
        r12.L$1 = r11;
        r12.L$2 = r3;
        r12.L$3 = r2;
        r12.L$4 = r4;
        r12.label = 3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00ee, code lost:
        if (r3.awaitPending(r12) != r1) goto L_0x00a4;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00f0, code lost:
        return r1;
     */
    /* JADX WARNING: Incorrect type for immutable var: ssa=kotlinx.coroutines.flow.FlowCollector<? super T>, code=kotlinx.coroutines.flow.FlowCollector, for r11v0, types: [java.lang.Object, kotlinx.coroutines.flow.FlowCollector<? super T>] */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:10:0x002d  */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0047  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005e  */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0025  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.Object collect(kotlinx.coroutines.flow.FlowCollector r11, kotlin.coroutines.Continuation<?> r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof kotlinx.coroutines.flow.StateFlowImpl$collect$1
            if (r0 == 0) goto L_0x0014
            r0 = r12
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r0 = (kotlinx.coroutines.flow.StateFlowImpl$collect$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L_0x0014
            int r12 = r0.label
            int r12 = r12 - r2
            r0.label = r12
            goto L_0x0019
        L_0x0014:
            kotlinx.coroutines.flow.StateFlowImpl$collect$1 r0 = new kotlinx.coroutines.flow.StateFlowImpl$collect$1
            r0.<init>(r10, r12)
        L_0x0019:
            r12 = r0
            java.lang.Object r0 = r12.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r12.label
            switch(r2) {
                case 0: goto L_0x0070;
                case 1: goto L_0x005e;
                case 2: goto L_0x0047;
                case 3: goto L_0x002d;
                default: goto L_0x0025;
            }
        L_0x0025:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L_0x002d:
            java.lang.Object r11 = r12.L$4
            java.lang.Object r2 = r12.L$3
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            java.lang.Object r3 = r12.L$2
            kotlinx.coroutines.flow.StateFlowSlot r3 = (kotlinx.coroutines.flow.StateFlowSlot) r3
            java.lang.Object r4 = r12.L$1
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            java.lang.Object r5 = r12.L$0
            kotlinx.coroutines.flow.StateFlowImpl r5 = (kotlinx.coroutines.flow.StateFlowImpl) r5
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ all -> 0x00f2 }
            r9 = r4
            r4 = r11
            r11 = r9
            goto L_0x00f1
        L_0x0047:
            java.lang.Object r11 = r12.L$4
            java.lang.Object r2 = r12.L$3
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2
            java.lang.Object r3 = r12.L$2
            kotlinx.coroutines.flow.StateFlowSlot r3 = (kotlinx.coroutines.flow.StateFlowSlot) r3
            java.lang.Object r4 = r12.L$1
            kotlinx.coroutines.flow.FlowCollector r4 = (kotlinx.coroutines.flow.FlowCollector) r4
            java.lang.Object r5 = r12.L$0
            kotlinx.coroutines.flow.StateFlowImpl r5 = (kotlinx.coroutines.flow.StateFlowImpl) r5
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ all -> 0x00f2 }
            goto L_0x00d2
        L_0x005e:
            java.lang.Object r11 = r12.L$2
            r3 = r11
            kotlinx.coroutines.flow.StateFlowSlot r3 = (kotlinx.coroutines.flow.StateFlowSlot) r3
            java.lang.Object r11 = r12.L$1
            kotlinx.coroutines.flow.FlowCollector r11 = (kotlinx.coroutines.flow.FlowCollector) r11
            java.lang.Object r2 = r12.L$0
            r5 = r2
            kotlinx.coroutines.flow.StateFlowImpl r5 = (kotlinx.coroutines.flow.StateFlowImpl) r5
            kotlin.ResultKt.throwOnFailure(r0)     // Catch:{ all -> 0x00f2 }
            goto L_0x0093
        L_0x0070:
            kotlin.ResultKt.throwOnFailure(r0)
            r5 = r10
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r2 = r5.allocateSlot()
            r3 = r2
            kotlinx.coroutines.flow.StateFlowSlot r3 = (kotlinx.coroutines.flow.StateFlowSlot) r3
            boolean r2 = r11 instanceof kotlinx.coroutines.flow.SubscribedFlowCollector     // Catch:{ all -> 0x00f2 }
            if (r2 == 0) goto L_0x0094
            r2 = r11
            kotlinx.coroutines.flow.SubscribedFlowCollector r2 = (kotlinx.coroutines.flow.SubscribedFlowCollector) r2     // Catch:{ all -> 0x00f2 }
            r12.L$0 = r5     // Catch:{ all -> 0x00f2 }
            r12.L$1 = r11     // Catch:{ all -> 0x00f2 }
            r12.L$2 = r3     // Catch:{ all -> 0x00f2 }
            r4 = 1
            r12.label = r4     // Catch:{ all -> 0x00f2 }
            java.lang.Object r2 = r2.onSubscription(r12)     // Catch:{ all -> 0x00f2 }
            if (r2 != r1) goto L_0x0093
            return r1
        L_0x0093:
        L_0x0094:
            r2 = 0
            kotlin.coroutines.CoroutineContext r4 = r12.getContext()     // Catch:{ all -> 0x00f2 }
            kotlinx.coroutines.Job$Key r2 = kotlinx.coroutines.Job.Key     // Catch:{ all -> 0x00f2 }
            kotlin.coroutines.CoroutineContext$Key r2 = (kotlin.coroutines.CoroutineContext.Key) r2     // Catch:{ all -> 0x00f2 }
            kotlin.coroutines.CoroutineContext$Element r2 = r4.get(r2)     // Catch:{ all -> 0x00f2 }
            kotlinx.coroutines.Job r2 = (kotlinx.coroutines.Job) r2     // Catch:{ all -> 0x00f2 }
            r4 = 0
        L_0x00a4:
            java.lang.Object r6 = r5._state     // Catch:{ all -> 0x00f2 }
            if (r2 == 0) goto L_0x00ac
            kotlinx.coroutines.JobKt.ensureActive((kotlinx.coroutines.Job) r2)     // Catch:{ all -> 0x00f2 }
        L_0x00ac:
            if (r4 == 0) goto L_0x00b4
            boolean r7 = kotlin.jvm.internal.Intrinsics.areEqual((java.lang.Object) r4, (java.lang.Object) r6)     // Catch:{ all -> 0x00f2 }
            if (r7 != 0) goto L_0x00d7
        L_0x00b4:
            kotlinx.coroutines.internal.Symbol r4 = kotlinx.coroutines.flow.internal.NullSurrogateKt.NULL     // Catch:{ all -> 0x00f2 }
            r7 = 0
            if (r6 != r4) goto L_0x00bb
            r8 = 0
            goto L_0x00bc
        L_0x00bb:
            r8 = r6
        L_0x00bc:
            r12.L$0 = r5     // Catch:{ all -> 0x00f2 }
            r12.L$1 = r11     // Catch:{ all -> 0x00f2 }
            r12.L$2 = r3     // Catch:{ all -> 0x00f2 }
            r12.L$3 = r2     // Catch:{ all -> 0x00f2 }
            r12.L$4 = r6     // Catch:{ all -> 0x00f2 }
            r4 = 2
            r12.label = r4     // Catch:{ all -> 0x00f2 }
            java.lang.Object r4 = r11.emit(r8, r12)     // Catch:{ all -> 0x00f2 }
            if (r4 != r1) goto L_0x00d0
            return r1
        L_0x00d0:
            r4 = r11
            r11 = r6
        L_0x00d2:
            r6 = r11
            r11 = r6
            r9 = r4
            r4 = r11
            r11 = r9
        L_0x00d7:
            boolean r6 = r3.takePending()     // Catch:{ all -> 0x00f2 }
            if (r6 != 0) goto L_0x00a4
            r12.L$0 = r5     // Catch:{ all -> 0x00f2 }
            r12.L$1 = r11     // Catch:{ all -> 0x00f2 }
            r12.L$2 = r3     // Catch:{ all -> 0x00f2 }
            r12.L$3 = r2     // Catch:{ all -> 0x00f2 }
            r12.L$4 = r4     // Catch:{ all -> 0x00f2 }
            r6 = 3
            r12.label = r6     // Catch:{ all -> 0x00f2 }
            java.lang.Object r6 = r3.awaitPending(r12)     // Catch:{ all -> 0x00f2 }
            if (r6 != r1) goto L_0x00f1
            return r1
        L_0x00f1:
            goto L_0x00a4
        L_0x00f2:
            r11 = move-exception
            r1 = r3
            kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot r1 = (kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot) r1
            r5.freeSlot(r1)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlinx.coroutines.flow.StateFlowImpl.collect(kotlinx.coroutines.flow.FlowCollector, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* access modifiers changed from: protected */
    public StateFlowSlot createSlot() {
        return new StateFlowSlot();
    }

    /* access modifiers changed from: protected */
    public StateFlowSlot[] createSlotArray(int size) {
        return new StateFlowSlot[size];
    }

    public Flow<T> fuse(CoroutineContext context, int capacity, BufferOverflow onBufferOverflow) {
        return StateFlowKt.fuseStateFlow(this, context, capacity, onBufferOverflow);
    }
}
